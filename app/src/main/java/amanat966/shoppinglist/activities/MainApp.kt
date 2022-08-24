package amanat966.shoppinglist.activities

import amanat966.shoppinglist.db.MainDatabase
import android.app.Application

class MainApp : Application() {
    val database by lazy { MainDatabase.getDatabase(this) }
}