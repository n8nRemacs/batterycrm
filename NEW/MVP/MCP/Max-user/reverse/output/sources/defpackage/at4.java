package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import com.my.tracker.applifecycle.o.d;
import com.my.tracker.applifecycle.o.e;
import com.my.tracker.core.EngineCore;
import java.util.concurrent.Callable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* loaded from: classes.dex */
public final /* synthetic */ class at4 implements gt4, vvf, EngineCore.EventPacker {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ long c;
    public final /* synthetic */ Object d;
    public final /* synthetic */ Object o;

    public /* synthetic */ at4(ft4 ft4Var, Object obj, long j, TimeUnit timeUnit, int i) {
        this.a = i;
        this.b = ft4Var;
        this.o = obj;
        this.c = j;
        this.d = timeUnit;
    }

    @Override // defpackage.vvf
    public Object a() {
        awg awgVar = (awg) this.b;
        Iterable iterable = (Iterable) this.o;
        ac0 ac0Var = (ac0) this.d;
        gwd gwdVar = (gwd) awgVar.c;
        gwdVar.getClass();
        if (iterable.iterator().hasNext()) {
            String str = "UPDATE events SET num_attempts = num_attempts + 1 WHERE _id in " + gwd.h0(iterable);
            SQLiteDatabase sQLiteDatabaseL = gwdVar.l();
            sQLiteDatabaseL.beginTransaction();
            try {
                sQLiteDatabaseL.compileStatement(str).execute();
                Cursor cursorRawQuery = sQLiteDatabaseL.rawQuery("SELECT COUNT(*), transport_name FROM events WHERE num_attempts >= 16 GROUP BY transport_name", null);
                while (cursorRawQuery.moveToNext()) {
                    try {
                        gwdVar.Q(cursorRawQuery.getInt(0), jg8.MAX_RETRIES_REACHED, cursorRawQuery.getString(1));
                    } catch (Throwable th) {
                        cursorRawQuery.close();
                        throw th;
                    }
                }
                cursorRawQuery.close();
                sQLiteDatabaseL.compileStatement("DELETE FROM events WHERE num_attempts >= 16").execute();
                sQLiteDatabaseL.setTransactionSuccessful();
            } finally {
                sQLiteDatabaseL.endTransaction();
            }
        }
        gwdVar.y(new ny1(awgVar.g.getTime() + this.c, ac0Var, 11));
        return null;
    }

    @Override // defpackage.gt4
    public ScheduledFuture b(iv6 iv6Var) {
        switch (this.a) {
            case 0:
                ft4 ft4Var = (ft4) this.b;
                Runnable runnable = (Runnable) this.o;
                return ft4Var.b.schedule(new dt4(ft4Var, runnable, iv6Var, 1), this.c, (TimeUnit) this.d);
            default:
                ft4 ft4Var2 = (ft4) this.b;
                Callable callable = (Callable) this.o;
                return ft4Var2.b.schedule(new sv0(ft4Var2, callable, iv6Var, 1), this.c, (TimeUnit) this.d);
        }
    }

    @Override // com.my.tracker.core.EngineCore.EventPacker
    public byte[] invoke(EngineCore.InsertEventTools insertEventTools) {
        return ((d) this.b).a(this.c, (String) this.o, (e.a) this.d, insertEventTools);
    }

    public /* synthetic */ at4(awg awgVar, Iterable iterable, ac0 ac0Var, long j) {
        this.a = 2;
        this.b = awgVar;
        this.o = iterable;
        this.d = ac0Var;
        this.c = j;
    }

    public /* synthetic */ at4(d dVar, long j, String str, e.a aVar) {
        this.a = 3;
        this.b = dVar;
        this.c = j;
        this.o = str;
        this.d = aVar;
    }
}
