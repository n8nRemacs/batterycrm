package com.yandex.div.state.db;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;

/* compiled from: DivStateDaoImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/yandex/div/state/db/f;", "Lcom/yandex/div/state/db/a;", "div-states_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f implements com.yandex.div.state.db.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final SQLiteDatabase f370583a;

    /* compiled from: DivStateDaoImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 5, 1})
    public static final class a extends N implements Y41.a<G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ long f370585m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(long j12) {
            super(0);
            this.f370585m = j12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            Cursor cursorRawQuery = f.this.f370583a.rawQuery("DELETE FROM div_card_states WHERE modification_time < ?", new String[]{String.valueOf(this.f370585m)});
            cursorRawQuery.moveToLast();
            cursorRawQuery.close();
            return G0.f406611a;
        }
    }

    public f(@Y61.k SQLiteDatabase sQLiteDatabase) throws SQLException {
        this.f370583a = sQLiteDatabase;
        if (sQLiteDatabase.isReadOnly()) {
            L.j(" require writable database!", f.class.getName());
        }
        sQLiteDatabase.compileStatement("INSERT OR REPLACE INTO `div_card_states` (`card_id`,`path`,`state_id`,`modification_time`) VALUES (?,?,?,?)");
    }

    public final void a(long j12) {
        a aVar = new a(j12);
        SQLiteDatabase sQLiteDatabase = this.f370583a;
        sQLiteDatabase.beginTransaction();
        try {
            aVar.invoke();
            sQLiteDatabase.setTransactionSuccessful();
        } finally {
            sQLiteDatabase.endTransaction();
        }
    }
}
