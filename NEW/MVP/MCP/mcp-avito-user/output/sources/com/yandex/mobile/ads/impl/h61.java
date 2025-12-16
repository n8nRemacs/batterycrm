package com.yandex.mobile.ads.impl;

import android.util.SparseArray;

/* loaded from: classes8.dex */
final class h61<V> {

    /* renamed from: c, reason: collision with root package name */
    private final ol<V> f385921c;

    /* renamed from: b, reason: collision with root package name */
    private final SparseArray<V> f385920b = new SparseArray<>();

    /* renamed from: a, reason: collision with root package name */
    private int f385919a = -1;

    public h61(ol<V> olVar) {
        this.f385921c = olVar;
    }

    public final void a(int i12, V v12) {
        if (this.f385919a == -1) {
            db.b(this.f385920b.size() == 0);
            this.f385919a = 0;
        }
        if (this.f385920b.size() > 0) {
            SparseArray<V> sparseArray = this.f385920b;
            int iKeyAt = sparseArray.keyAt(sparseArray.size() - 1);
            db.a(i12 >= iKeyAt);
            if (iKeyAt == i12) {
                ol<V> olVar = this.f385921c;
                SparseArray<V> sparseArray2 = this.f385920b;
                olVar.accept(sparseArray2.valueAt(sparseArray2.size() - 1));
            }
        }
        this.f385920b.append(i12, v12);
    }

    public final V b(int i12) {
        if (this.f385919a == -1) {
            this.f385919a = 0;
        }
        while (true) {
            int i13 = this.f385919a;
            if (i13 <= 0 || i12 >= this.f385920b.keyAt(i13)) {
                break;
            }
            this.f385919a--;
        }
        while (this.f385919a < this.f385920b.size() - 1 && i12 >= this.f385920b.keyAt(this.f385919a + 1)) {
            this.f385919a++;
        }
        return this.f385920b.valueAt(this.f385919a);
    }

    public final boolean c() {
        return this.f385920b.size() == 0;
    }

    public final V b() {
        return this.f385920b.valueAt(r0.size() - 1);
    }

    public final void a(int i12) {
        int i13 = 0;
        while (i13 < this.f385920b.size() - 1) {
            int i14 = i13 + 1;
            if (i12 < this.f385920b.keyAt(i14)) {
                return;
            }
            this.f385921c.accept(this.f385920b.valueAt(i13));
            this.f385920b.removeAt(i13);
            int i15 = this.f385919a;
            if (i15 > 0) {
                this.f385919a = i15 - 1;
            }
            i13 = i14;
        }
    }

    public final void a() {
        for (int i12 = 0; i12 < this.f385920b.size(); i12++) {
            this.f385921c.accept(this.f385920b.valueAt(i12));
        }
        this.f385919a = -1;
        this.f385920b.clear();
    }
}
