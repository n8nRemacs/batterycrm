package defpackage;

import android.content.Context;
import android.database.DatabaseErrorHandler;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteException;
import android.database.sqlite.SQLiteOpenHelper;
import android.util.Log;
import android.util.Pair;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;

/* loaded from: classes.dex */
public final class sk6 extends SQLiteOpenHelper {
    public static final /* synthetic */ int Z = 0;
    public final cac X;
    public boolean Y;
    public final Context a;
    public final ao6 b;
    public final ggg c;
    public final boolean d;
    public boolean o;

    public sk6(Context context, String str, final ao6 ao6Var, final ggg gggVar, boolean z) {
        super(context, str, null, gggVar.b, new DatabaseErrorHandler(gggVar, ao6Var) { // from class: qk6
            public final /* synthetic */ ao6 a;

            {
                this.a = ao6Var;
            }

            @Override // android.database.DatabaseErrorHandler
            public final void onCorruption(SQLiteDatabase sQLiteDatabase) {
                int i = sk6.Z;
                ao6 ao6Var2 = this.a;
                pk6 pk6Var = (pk6) ao6Var2.b;
                if (pk6Var == null || !fni.a((SQLiteDatabase) pk6Var.b, sQLiteDatabase)) {
                    pk6Var = new pk6(0, sQLiteDatabase);
                    ao6Var2.b = pk6Var;
                }
                SQLiteDatabase sQLiteDatabase2 = (SQLiteDatabase) pk6Var.b;
                Log.e("SupportSQLite", "Corruption reported by sqlite on database: " + pk6Var + ".path");
                if (!sQLiteDatabase2.isOpen()) {
                    String path = sQLiteDatabase2.getPath();
                    if (path != null) {
                        ggg.D(path);
                        return;
                    }
                    return;
                }
                List<Pair<String, String>> attachedDbs = null;
                try {
                    try {
                        attachedDbs = sQLiteDatabase2.getAttachedDbs();
                    } catch (SQLiteException unused) {
                    }
                    try {
                        pk6Var.close();
                    } catch (IOException unused2) {
                    }
                    if (attachedDbs != null) {
                        return;
                    }
                } finally {
                    if (attachedDbs != null) {
                        Iterator<T> it = attachedDbs.iterator();
                        while (it.hasNext()) {
                            ggg.D((String) ((Pair) it.next()).second);
                        }
                    } else {
                        String path2 = sQLiteDatabase2.getPath();
                        if (path2 != null) {
                            ggg.D(path2);
                        }
                    }
                }
            }
        });
        this.a = context;
        this.b = ao6Var;
        this.c = gggVar;
        this.d = z;
        this.X = new cac(str == null ? UUID.randomUUID().toString() : str, context.getCacheDir(), false);
    }

    public final pk6 c(boolean z) throws IOException {
        cac cacVar = this.X;
        try {
            cacVar.a((this.Y || getDatabaseName() == null) ? false : true);
            this.o = false;
            SQLiteDatabase sQLiteDatabaseI = i(z);
            if (!this.o) {
                pk6 pk6VarD = d(sQLiteDatabaseI);
                cacVar.b();
                return pk6VarD;
            }
            close();
            pk6 pk6VarC = c(z);
            cacVar.b();
            return pk6VarC;
        } catch (Throwable th) {
            cacVar.b();
            throw th;
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper, java.lang.AutoCloseable
    public final void close() {
        cac cacVar = this.X;
        try {
            cacVar.a(cacVar.a);
            super.close();
            this.b.b = null;
            this.Y = false;
        } finally {
            cacVar.b();
        }
    }

    public final pk6 d(SQLiteDatabase sQLiteDatabase) {
        ao6 ao6Var = this.b;
        pk6 pk6Var = (pk6) ao6Var.b;
        if (pk6Var != null && fni.a((SQLiteDatabase) pk6Var.b, sQLiteDatabase)) {
            return pk6Var;
        }
        pk6 pk6Var2 = new pk6(0, sQLiteDatabase);
        ao6Var.b = pk6Var2;
        return pk6Var2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v0, types: [boolean] */
    /* JADX WARN: Type inference failed for: r6v1 */
    /* JADX WARN: Type inference failed for: r6v12, types: [android.database.sqlite.SQLiteDatabase] */
    /* JADX WARN: Type inference failed for: r6v14 */
    /* JADX WARN: Type inference failed for: r6v15 */
    /* JADX WARN: Type inference failed for: r6v16 */
    /* JADX WARN: Type inference failed for: r6v17 */
    /* JADX WARN: Type inference failed for: r6v2 */
    /* JADX WARN: Type inference failed for: r6v9, types: [android.database.sqlite.SQLiteDatabase] */
    public final SQLiteDatabase i(boolean z) throws Throwable {
        File parentFile;
        String databaseName = getDatabaseName();
        boolean z2 = this.Y;
        Context context = this.a;
        if (databaseName != null && !z2 && (parentFile = context.getDatabasePath(databaseName).getParentFile()) != null) {
            parentFile.mkdirs();
            if (!parentFile.isDirectory()) {
                Log.w("SupportSQLite", "Invalid database parent file, not a directory: " + parentFile);
            }
        }
        try {
            z = z != 0 ? getWritableDatabase() : getReadableDatabase();
            return z;
        } catch (Throwable unused) {
            super.close();
            try {
                Thread.sleep(500L);
            } catch (InterruptedException unused2) {
            }
            try {
                z = z != 0 ? getWritableDatabase() : getReadableDatabase();
                return z;
            } catch (Throwable th) {
                super.close();
                if (th instanceof rk6) {
                    rk6 rk6Var = th;
                    int iV = az1.v(rk6Var.a);
                    Throwable th2 = rk6Var.b;
                    if (iV == 0 || iV == 1 || iV == 2 || iV == 3 || !(th2 instanceof SQLiteException)) {
                        throw th2;
                    }
                } else if (!(th instanceof SQLiteException) || databaseName == null || !this.d) {
                    throw th;
                }
                context.deleteDatabase(databaseName);
                try {
                    return z != 0 ? getWritableDatabase() : getReadableDatabase();
                } catch (rk6 e) {
                    throw e.b;
                }
            }
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onConfigure(SQLiteDatabase sQLiteDatabase) {
        boolean z = this.o;
        ggg gggVar = this.c;
        if (!z && gggVar.b != sQLiteDatabase.getVersion()) {
            sQLiteDatabase.setMaxSqlCacheSize(1);
        }
        try {
            d(sQLiteDatabase);
            gggVar.getClass();
        } catch (Throwable th) {
            throw new rk6(1, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onCreate(SQLiteDatabase sQLiteDatabase) {
        try {
            this.c.T(d(sQLiteDatabase));
        } catch (Throwable th) {
            throw new rk6(2, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onDowngrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.o = true;
        try {
            this.c.V(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new rk6(4, th);
        }
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onOpen(SQLiteDatabase sQLiteDatabase) {
        if (!this.o) {
            try {
                this.c.U(d(sQLiteDatabase));
            } catch (Throwable th) {
                throw new rk6(5, th);
            }
        }
        this.Y = true;
    }

    @Override // android.database.sqlite.SQLiteOpenHelper
    public final void onUpgrade(SQLiteDatabase sQLiteDatabase, int i, int i2) {
        this.o = true;
        try {
            this.c.V(d(sQLiteDatabase), i, i2);
        } catch (Throwable th) {
            throw new rk6(3, th);
        }
    }
}
