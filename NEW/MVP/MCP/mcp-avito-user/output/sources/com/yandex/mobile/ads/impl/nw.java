package com.yandex.mobile.ads.impl;

import android.util.SparseBooleanArray;

/* loaded from: classes8.dex */
public final class nw {

    /* renamed from: a, reason: collision with root package name */
    private final SparseBooleanArray f388396a;

    public /* synthetic */ nw(SparseBooleanArray sparseBooleanArray, int i12) {
        this(sparseBooleanArray);
    }

    public final boolean a(int i12) {
        return this.f388396a.get(i12);
    }

    public final int b(int i12) {
        db.a(i12, this.f388396a.size());
        return this.f388396a.keyAt(i12);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof nw)) {
            return false;
        }
        nw nwVar = (nw) obj;
        if (pc1.f388768a >= 24) {
            return this.f388396a.equals(nwVar.f388396a);
        }
        if (this.f388396a.size() != nwVar.f388396a.size()) {
            return false;
        }
        for (int i12 = 0; i12 < this.f388396a.size(); i12++) {
            if (b(i12) != nwVar.b(i12)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        if (pc1.f388768a >= 24) {
            return this.f388396a.hashCode();
        }
        int size = this.f388396a.size();
        for (int i12 = 0; i12 < this.f388396a.size(); i12++) {
            size = (size * 31) + b(i12);
        }
        return size;
    }

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        private final SparseBooleanArray f388397a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        private boolean f388398b;

        public final a a(int i12) {
            db.b(!this.f388398b);
            this.f388397a.append(i12, true);
            return this;
        }

        public final nw a() {
            db.b(!this.f388398b);
            this.f388398b = true;
            return new nw(this.f388397a, 0);
        }
    }

    private nw(SparseBooleanArray sparseBooleanArray) {
        this.f388396a = sparseBooleanArray;
    }

    public final int a() {
        return this.f388396a.size();
    }
}
