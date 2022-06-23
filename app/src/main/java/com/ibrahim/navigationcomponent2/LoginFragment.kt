package com.ibrahim.navigationcomponent2

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.navigation.fragment.findNavController


class LoginFragment : Fragment() {
    private lateinit var nameInputET:EditText
    private lateinit var phoneInputET:EditText
    private lateinit var fNameInputET:EditText
    private lateinit var mNameInputET:EditText
    private lateinit var bloodGroupInputET:EditText
    private lateinit var addressInputET:EditText
    private lateinit var emailInputET:EditText
    private lateinit var passwordInputET:EditText
    private lateinit var loginBtn:Button
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        nameInputET = view.findViewById(R.id.nameInputET)
        phoneInputET = view.findViewById(R.id.phoneInputET)
        fNameInputET = view.findViewById(R.id.fNameInputET)
        mNameInputET = view.findViewById(R.id.mNameInputET)
        bloodGroupInputET = view.findViewById(R.id.bloodGroupInputET)
        addressInputET = view.findViewById(R.id.addressInputET)
        emailInputET = view.findViewById(R.id.emailInputET)
        passwordInputET = view.findViewById(R.id.passwordInputET)
        loginBtn = view.findViewById(R.id.loginBtn)
        loginBtn.setOnClickListener {
            val name = nameInputET.text.toString()
            val phone = phoneInputET.text.toString()
            val fName = fNameInputET.text.toString()
            val mName = mNameInputET.text.toString()
            val blood = bloodGroupInputET.text.toString()
            val address = addressInputET.text.toString()
            val email = emailInputET.text.toString()
            val password = passwordInputET.text.toString()
            if(name.isEmpty()){
                nameInputET.error = "Name is empty"
                return@setOnClickListener
            }
            if(phone.isEmpty()){
                phoneInputET.error = "Phone is empty"
                return@setOnClickListener
            }
            if(fName.isEmpty()){
                fNameInputET.error = "Father Name is empty"
                return@setOnClickListener
            }
            if(mName.isEmpty()){
                mNameInputET.error = "Mother Name is empty"
                return@setOnClickListener
            }
            if(blood.isEmpty()){
                bloodGroupInputET.error = "Blood Group is empty"
                return@setOnClickListener
            }
            if(address.isEmpty()){
                addressInputET.error = "Address is empty"
                return@setOnClickListener
            }
            if(email.isEmpty()){
                emailInputET.error = "Email is empty"
                return@setOnClickListener
            }
            if(password.isEmpty()){
                passwordInputET.error = "Password is empty"
                return@setOnClickListener
            }
            val bundle = Bundle().apply {
                putString("name",name)
                putString("phone",phone)
                putString("fName",fName)
                putString("mName",mName)
                putString("blood",blood)
                putString("address",address)
                putString("email",email)
            }
            findNavController().navigate(R.id.action_loginFragment_to_homeFragment, bundle)
        }
    }

}