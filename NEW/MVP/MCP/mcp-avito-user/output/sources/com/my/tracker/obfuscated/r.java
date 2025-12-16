package com.my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public class r {

    /* renamed from: a, reason: collision with root package name */
    final SparseArray<InterfaceC37841o> f365768a = new SparseArray<>(50);

    private InterfaceC37841o c(int i12) {
        C37843q c37843q = new C37843q(i12);
        this.f365768a.put(i12, c37843q);
        return c37843q;
    }

    public ArrayList<InterfaceC37842p> a() {
        e2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: start collecting count based TimeSpents");
        int size = this.f365768a.size();
        ArrayList<InterfaceC37842p> arrayList = new ArrayList<>(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(this.f365768a.valueAt(i12));
        }
        this.f365768a.clear();
        e2.a("TimeSpentCore: CountBasedTimeSpentsManager: onTick: collected " + arrayList.size() + " count based TimeSpents");
        return arrayList;
    }

    public void b(int i12) {
        InterfaceC37841o interfaceC37841oC = this.f365768a.get(i12);
        if (interfaceC37841oC != null) {
            e2.a("TimeSpentCore: CountBasedTimeSpentsManager: found existed count based record with id = " + i12);
        } else {
            e2.a("TimeSpentCore: CountBasedTimeSpentsManager: not found existed count based record with id = " + i12 + ", creating new");
            interfaceC37841oC = c(i12);
        }
        interfaceC37841oC.g();
        e2.c("TimeSpent: incremented count based TimeSpent, id = " + i12 + ", count = " + interfaceC37841oC.d());
    }

    public boolean a(int i12) {
        return this.f365768a.get(i12) != null;
    }
}
