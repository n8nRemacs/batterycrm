package defpackage;

import android.database.sqlite.SQLiteStatement;

/* loaded from: classes.dex */
public final class vk6 extends uk6 implements qrf {
    public final SQLiteStatement b;

    public vk6(SQLiteStatement sQLiteStatement) {
        super(sQLiteStatement);
        this.b = sQLiteStatement;
    }

    public final long l() {
        return this.b.executeInsert();
    }

    public final int w() {
        return this.b.executeUpdateDelete();
    }
}
