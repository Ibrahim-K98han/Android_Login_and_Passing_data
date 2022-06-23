package com.ibrahim.navigationcomponent2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView

class HomeFragment : Fragment() {

    private lateinit var nameTV:TextView
    private lateinit var phoneTV:TextView
    private lateinit var fNameTV:TextView
    private lateinit var mNameTV:TextView
    private lateinit var bloodTV:TextView
    private lateinit var addressTV:TextView
    private lateinit var emailTV:TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_home, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nameTV = view.findViewById(R.id.nameTV)
        phoneTV = view.findViewById(R.id.phoneTV)
        bloodTV = view.findViewById(R.id.bloodTV)
        addressTV = view.findViewById(R.id.addressTV)

        val name = arguments?.getString("name")
        val phone = arguments?.getString("phone")
        val blood = arguments?.getString("blood")
        val address = arguments?.getString("address")

        nameTV.text = name
        phoneTV.text = phone
        bloodTV.text = blood
        addressTV.text = address

    }

}