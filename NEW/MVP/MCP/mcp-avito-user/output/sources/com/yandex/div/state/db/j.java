package com.yandex.div.state.db;

import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;
import kotlin.Metadata;

/* compiled from: DivStateDbOpenHelper.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/state/db/j;", "Landroid/database/sqlite/SQLiteOpenHelper;", "div-states_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j extends SQLiteOpenHelper {
    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(@Y61.k SQLiteDatabase sQLiteDatabase) throws SQLException {
        sQLiteDatabase.execSQL("CREATE TABLE IF NOT EXISTS `div_card_states` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `card_id` TEXT NOT NULL, `path` TEXT NOT NULL, `state_id` TEXT NOT NULL, `modification_time` INTEGER NOT NULL)");
        sQLiteDatabase.execSQL("CREATE UNIQUE INDEX IF NOT EXISTS `index_div_card_states_card_id_path` ON `div_card_states` (`card_id`, `path`)");
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(@Y61.l SQLiteDatabase sQLiteDatabase, int i12, int i13) {
    }
}
