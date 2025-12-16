package com.my.tracker.obfuscated;

import android.util.SparseArray;
import java.util.ArrayList;

/* loaded from: classes7.dex */
public abstract class l1 {

    /* renamed from: a, reason: collision with root package name */
    final SparseArray<e1> f365693a = new SparseArray<>(20);

    /* renamed from: b, reason: collision with root package name */
    final SparseArray<i1> f365694b = new SparseArray<>(20);

    public final i1 a(int i12) {
        i1 i1Var = this.f365694b.get(i12);
        if (i1Var != null) {
            return i1Var;
        }
        k1 k1Var = new k1(i12);
        this.f365694b.put(i12, k1Var);
        return k1Var;
    }

    public final int b() {
        return this.f365693a.size();
    }

    public final String a(boolean z12) {
        return z12 ? "[FOREGROUND] " : "[BACKGROUND] ";
    }

    public final boolean b(int i12) {
        return this.f365693a.get(i12) != null;
    }

    public final ArrayList<j1> a() {
        int size = this.f365694b.size();
        ArrayList<j1> arrayList = new ArrayList<>(size);
        for (int i12 = 0; i12 < size; i12++) {
            arrayList.add(this.f365694b.valueAt(i12));
        }
        return arrayList;
    }

    public final void a(long j12) {
        for (int i12 = 0; i12 < this.f365693a.size(); i12++) {
            this.f365693a.valueAt(i12).b(j12);
        }
    }
}
