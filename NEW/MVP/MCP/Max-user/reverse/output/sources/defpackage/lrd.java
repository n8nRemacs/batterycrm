package defpackage;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Looper;
import android.util.Log;
import java.util.Collections;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantReadWriteLock;

/* loaded from: classes.dex */
public abstract class lrd {
    public volatile pk6 a;
    public Executor b;
    public uee c;
    public prf d;
    public boolean f;
    public List g;
    public final oq7 e = e();
    public final LinkedHashMap h = new LinkedHashMap();
    public final ReentrantReadWriteLock i = new ReentrantReadWriteLock();
    public final ThreadLocal j = new ThreadLocal();
    public final Map k = Collections.synchronizedMap(new LinkedHashMap());
    public final LinkedHashMap l = new LinkedHashMap();

    public static Object r(Class cls, prf prfVar) {
        if (cls.isInstance(prfVar)) {
            return prfVar;
        }
        if (prfVar instanceof zs4) {
            return r(cls, ((zs4) prfVar).getDelegate());
        }
        return null;
    }

    public void a() {
        if (!this.f && Looper.getMainLooper().getThread() == Thread.currentThread()) {
            throw new IllegalStateException("Cannot access database on the main thread since it may potentially lock the UI for a long period of time.");
        }
    }

    public final void b() {
        if (!j() && this.j.get() != null) {
            throw new IllegalStateException("Cannot access database on a different coroutine context inherited from a suspending transaction.");
        }
    }

    public final void c() {
        a();
        a();
        prf prfVar = this.d;
        if (prfVar == null) {
            prfVar = null;
        }
        pk6 writableDatabase = prfVar.getWritableDatabase();
        this.e.f(writableDatabase);
        if (writableDatabase.i0()) {
            writableDatabase.w();
        } else {
            writableDatabase.l();
        }
    }

    public final vk6 d(String str) {
        a();
        b();
        prf prfVar = this.d;
        if (prfVar == null) {
            prfVar = null;
        }
        return prfVar.getWritableDatabase().y(str);
    }

    public abstract oq7 e();

    public abstract prf f(cf4 cf4Var);

    public List g() {
        return hd5.a;
    }

    public Set h() {
        return rd5.a;
    }

    public Map i() {
        return id5.a;
    }

    public final boolean j() {
        prf prfVar = this.d;
        if (prfVar == null) {
            prfVar = null;
        }
        return prfVar.getWritableDatabase().h0();
    }

    public final void k() {
        prf prfVar = this.d;
        if (prfVar == null) {
            prfVar = null;
        }
        prfVar.getWritableDatabase().P();
        if (j()) {
            return;
        }
        oq7 oq7Var = this.e;
        if (oq7Var.f.compareAndSet(false, true)) {
            Executor executor = oq7Var.a.b;
            (executor != null ? executor : null).execute(oq7Var.n);
        }
    }

    public final void l(pk6 pk6Var) {
        oq7 oq7Var = this.e;
        synchronized (oq7Var.m) {
            if (oq7Var.g) {
                Log.e("ROOM", "Invalidation tracker is initialized twice :/.");
                return;
            }
            pk6Var.Q("PRAGMA temp_store = MEMORY;");
            pk6Var.Q("PRAGMA recursive_triggers='ON';");
            pk6Var.Q("CREATE TEMP TABLE room_table_modification_log (table_id INTEGER PRIMARY KEY, invalidated INTEGER NOT NULL DEFAULT 0)");
            oq7Var.f(pk6Var);
            oq7Var.h = pk6Var.y("UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1");
            oq7Var.g = true;
        }
    }

    public final boolean m() {
        pk6 pk6Var = this.a;
        return pk6Var != null && ((SQLiteDatabase) pk6Var.b).isOpen();
    }

    public final Cursor n(rrf rrfVar) {
        a();
        b();
        prf prfVar = this.d;
        if (prfVar == null) {
            prfVar = null;
        }
        return prfVar.getWritableDatabase().j0(rrfVar);
    }

    public final Object o(Callable callable) {
        c();
        try {
            Object objCall = callable.call();
            q();
            return objCall;
        } finally {
            k();
        }
    }

    public final void p(Runnable runnable) {
        c();
        try {
            runnable.run();
            q();
        } finally {
            k();
        }
    }

    public final void q() {
        prf prfVar = this.d;
        if (prfVar == null) {
            prfVar = null;
        }
        prfVar.getWritableDatabase().l0();
    }
}
