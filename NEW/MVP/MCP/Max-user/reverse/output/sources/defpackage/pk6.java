package defpackage;

import android.database.Cursor;
import android.database.SQLException;
import android.database.sqlite.SQLiteCursorDriver;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteQuery;
import java.io.Closeable;
import java.net.HttpURLConnection;

/* loaded from: classes.dex */
public final class pk6 implements Closeable {
    public static final String[] c = {"", " OR ROLLBACK ", " OR ABORT ", " OR FAIL ", " OR IGNORE ", " OR REPLACE "};
    public static final String[] d = new String[0];
    public final /* synthetic */ int a;
    public final Object b;

    public /* synthetic */ pk6(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    public void P() {
        ((SQLiteDatabase) this.b).endTransaction();
    }

    public void Q(String str) throws SQLException {
        ((SQLiteDatabase) this.b).execSQL(str);
    }

    public void Z(String str, Object[] objArr) throws SQLException {
        ((SQLiteDatabase) this.b).execSQL(str, objArr);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        switch (this.a) {
            case 0:
                ((SQLiteDatabase) this.b).close();
                break;
            case 1:
                ((Cursor) this.b).close();
                break;
            default:
                ((HttpURLConnection) this.b).disconnect();
                break;
        }
    }

    public boolean h0() {
        return ((SQLiteDatabase) this.b).inTransaction();
    }

    public boolean i0() {
        return ((SQLiteDatabase) this.b).isWriteAheadLoggingEnabled();
    }

    public Cursor j0(rrf rrfVar) {
        final ok6 ok6Var = new ok6(rrfVar);
        return ((SQLiteDatabase) this.b).rawQueryWithFactory(new SQLiteDatabase.CursorFactory() { // from class: nk6
            @Override // android.database.sqlite.SQLiteDatabase.CursorFactory
            public final Cursor newCursor(SQLiteDatabase sQLiteDatabase, SQLiteCursorDriver sQLiteCursorDriver, String str, SQLiteQuery sQLiteQuery) {
                return (Cursor) ok6Var.invoke(sQLiteDatabase, sQLiteCursorDriver, str, sQLiteQuery);
            }
        }, rrfVar.l(), d, null);
    }

    public Cursor k0(String str) {
        return j0(new aqc(str, null, false, 5));
    }

    public void l() {
        ((SQLiteDatabase) this.b).beginTransaction();
    }

    public void l0() {
        ((SQLiteDatabase) this.b).setTransactionSuccessful();
    }

    public void w() {
        ((SQLiteDatabase) this.b).beginTransactionNonExclusive();
    }

    public vk6 y(String str) {
        return new vk6(((SQLiteDatabase) this.b).compileStatement(str));
    }
}
