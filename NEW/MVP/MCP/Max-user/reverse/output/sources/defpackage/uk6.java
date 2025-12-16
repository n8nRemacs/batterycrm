package defpackage;

import android.database.sqlite.SQLiteProgram;

/* loaded from: classes.dex */
public class uk6 implements qrf {
    public final SQLiteProgram a;

    public uk6(SQLiteProgram sQLiteProgram) {
        this.a = sQLiteProgram;
    }

    @Override // defpackage.qrf
    public final void D(int i, byte[] bArr) {
        this.a.bindBlob(i, bArr);
    }

    @Override // defpackage.qrf
    public final void S(int i) {
        this.a.bindNull(i);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    @Override // defpackage.qrf
    public final void f(int i, String str) {
        this.a.bindString(i, str);
    }

    @Override // defpackage.qrf
    public final void g(int i, double d) {
        this.a.bindDouble(i, d);
    }

    @Override // defpackage.qrf
    public final void k(int i, long j) {
        this.a.bindLong(i, j);
    }
}
