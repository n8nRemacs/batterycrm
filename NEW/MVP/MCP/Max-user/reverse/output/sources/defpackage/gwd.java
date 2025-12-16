package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabaseLockedException;
import android.os.SystemClock;
import android.util.Base64;
import com.google.android.datatransport.runtime.synchronization.SynchronizationException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Objects;
import javax.inject.Provider;
import ru.ok.android.externcalls.sdk.api.ApiProtocol;

/* loaded from: classes.dex */
public final class gwd implements ri5, wvf, eb3 {
    public static final gf5 X = new gf5("proto");
    public final x0e a;
    public final hc3 b;
    public final hc3 c;
    public final ca0 d;
    public final Provider o;

    public gwd(hc3 hc3Var, hc3 hc3Var2, ca0 ca0Var, x0e x0eVar, Provider provider) {
        this.a = x0eVar;
        this.b = hc3Var;
        this.c = hc3Var2;
        this.d = ca0Var;
        this.o = provider;
    }

    public static String h0(Iterable iterable) {
        StringBuilder sb = new StringBuilder("(");
        Iterator it = iterable.iterator();
        while (it.hasNext()) {
            sb.append(((ya0) it.next()).a);
            if (it.hasNext()) {
                sb.append(',');
            }
        }
        sb.append(')');
        return sb.toString();
    }

    public static Object i0(Cursor cursor, ewd ewdVar) {
        try {
            return ewdVar.mo26apply(cursor);
        } finally {
            cursor.close();
        }
    }

    public static Long w(SQLiteDatabase sQLiteDatabase, ac0 ac0Var) {
        StringBuilder sb = new StringBuilder("backend_name = ? and priority = ?");
        ArrayList arrayList = new ArrayList(Arrays.asList(ac0Var.a, String.valueOf(o9c.a(ac0Var.c))));
        byte[] bArr = ac0Var.b;
        if (bArr != null) {
            sb.append(" and extras = ?");
            arrayList.add(Base64.encodeToString(bArr, 0));
        } else {
            sb.append(" and extras is null");
        }
        Cursor cursorQuery = sQLiteDatabase.query("transport_contexts", new String[]{"_id"}, sb.toString(), (String[]) arrayList.toArray(new String[0]), null, null, null);
        try {
            return !cursorQuery.moveToNext() ? null : Long.valueOf(cursorQuery.getLong(0));
        } finally {
            cursorQuery.close();
        }
    }

    public final ArrayList P(SQLiteDatabase sQLiteDatabase, ac0 ac0Var, int i) {
        ArrayList arrayList = new ArrayList();
        Long lW = w(sQLiteDatabase, ac0Var);
        if (lW == null) {
            return arrayList;
        }
        i0(sQLiteDatabase.query("events", new String[]{"_id", "transport_name", "timestamp_ms", "uptime_ms", "payload_encoding", ApiProtocol.PARAM_PAYLOAD, "code", "inline"}, "context_id = ?", new String[]{lW.toString()}, null, null, null, String.valueOf(i)), new nl(this, arrayList, ac0Var, 25));
        return arrayList;
    }

    public final void Q(long j, jg8 jg8Var, String str) {
        y(new pv3(str, jg8Var, j, 6));
    }

    public final Object Z(vvf vvfVar) {
        SQLiteDatabase sQLiteDatabaseL = l();
        hc3 hc3Var = this.c;
        long time = hc3Var.getTime();
        while (true) {
            try {
                sQLiteDatabaseL.beginTransaction();
                try {
                    Object objA = vvfVar.a();
                    sQLiteDatabaseL.setTransactionSuccessful();
                    return objA;
                } finally {
                    sQLiteDatabaseL.endTransaction();
                }
            } catch (SQLiteDatabaseLockedException e) {
                if (hc3Var.getTime() >= this.d.c + time) {
                    throw new SynchronizationException("Timed out while trying to acquire the lock.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a.close();
    }

    public final SQLiteDatabase l() {
        x0e x0eVar = this.a;
        Objects.requireNonNull(x0eVar);
        hc3 hc3Var = this.c;
        long time = hc3Var.getTime();
        while (true) {
            try {
                return x0eVar.getWritableDatabase();
            } catch (SQLiteDatabaseLockedException e) {
                if (hc3Var.getTime() >= this.d.c + time) {
                    throw new SynchronizationException("Timed out while trying to open db.", e);
                }
                SystemClock.sleep(50L);
            }
        }
    }

    public final Object y(ewd ewdVar) {
        SQLiteDatabase sQLiteDatabaseL = l();
        sQLiteDatabaseL.beginTransaction();
        try {
            Object objMo26apply = ewdVar.mo26apply(sQLiteDatabaseL);
            sQLiteDatabaseL.setTransactionSuccessful();
            return objMo26apply;
        } finally {
            sQLiteDatabaseL.endTransaction();
        }
    }
}
