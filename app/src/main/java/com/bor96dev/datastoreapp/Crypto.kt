package com.bor96dev.datastoreapp

import android.security.keystore.KeyProperties

object Crypto {
    private const val KEY_ALIAS = "secret"
    private const val ALGORITHM = KeyProperties.KEY_ALGORITHM_AES
}