package androidx.work.impl.model;

import android.database.Cursor;
import androidx.room.F0;
import androidx.work.C23542f;
import androidx.work.C23544h;
import androidx.work.WorkInfo;
import androidx.work.impl.WorkDatabase_Impl;
import androidx.work.impl.model.H;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.concurrent.Callable;

/* compiled from: WorkSpecDao_Impl.java */
/* loaded from: classes10.dex */
class b0 implements Callable<List<H.c>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ F0 f55848b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ e0 f55849c;

    public b0(e0 e0Var, F0 f02) {
        this.f55849c = e0Var;
        this.f55848b = f02;
    }

    @Override // java.util.concurrent.Callable
    @j.P
    public final List<H.c> call() {
        e0 e0Var = this.f55849c;
        WorkDatabase_Impl workDatabase_Impl = e0Var.f55854a;
        workDatabase_Impl.c();
        try {
            Cursor cursorB = V1.c.b(workDatabase_Impl, this.f55848b, true);
            try {
                HashMap<String, ArrayList<String>> map = new HashMap<>();
                HashMap<String, ArrayList<C23544h>> map2 = new HashMap<>();
                while (cursorB.moveToNext()) {
                    String string = cursorB.getString(0);
                    if (!map.containsKey(string)) {
                        map.put(string, new ArrayList<>());
                    }
                    String string2 = cursorB.getString(0);
                    if (!map2.containsKey(string2)) {
                        map2.put(string2, new ArrayList<>());
                    }
                }
                cursorB.moveToPosition(-1);
                e0Var.I(map);
                e0Var.H(map2);
                ArrayList arrayList = new ArrayList(cursorB.getCount());
                while (cursorB.moveToNext()) {
                    String string3 = cursorB.getString(0);
                    WorkInfo.State stateG = u0.g(cursorB.getInt(1));
                    byte[] blob = cursorB.getBlob(2);
                    C23544h.f55508b.getClass();
                    C23544h c23544hA = C23544h.b.a(blob);
                    int i12 = cursorB.getInt(3);
                    int i13 = cursorB.getInt(4);
                    arrayList.add(new H.c(string3, stateG, c23544hA, cursorB.getLong(14), cursorB.getLong(15), cursorB.getLong(16), new C23542f(u0.l(cursorB.getBlob(6)), u0.e(cursorB.getInt(5)), cursorB.getInt(7) != 0, cursorB.getInt(8) != 0, cursorB.getInt(9) != 0, cursorB.getInt(10) != 0, cursorB.getLong(11), cursorB.getLong(12), u0.b(cursorB.getBlob(13))), i12, u0.d(cursorB.getInt(17)), cursorB.getLong(18), cursorB.getLong(19), cursorB.getInt(20), i13, cursorB.getLong(21), cursorB.getInt(22), map.get(cursorB.getString(0)), map2.get(cursorB.getString(0))));
                }
                workDatabase_Impl.s();
                cursorB.close();
                return arrayList;
            } catch (Throwable th2) {
                cursorB.close();
                throw th2;
            }
        } finally {
            workDatabase_Impl.l();
        }
    }

    public final void finalize() {
        this.f55848b.d();
    }
}
