package defpackage;

import android.database.sqlite.SQLiteCursor;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteQuery;

/* loaded from: classes.dex */
public final class ok6 extends u08 implements wm6 {
    public final /* synthetic */ rrf a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ok6(rrf rrfVar) {
        super(4);
        this.a = rrfVar;
    }

    @Override // defpackage.wm6
    public final Object invoke(Object obj, Object obj2, Object obj3, Object obj4) {
        SQLiteQuery sQLiteQuery = (SQLiteQuery) obj4;
        this.a.w(new uk6(sQLiteQuery));
        return new SQLiteCursor((SQLiteCursorDriver) obj2, (String) obj3, sQLiteQuery);
    }
}
