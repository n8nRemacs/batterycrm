package com.google.android.exoplayer2.util;

import android.util.SparseBooleanArray;

/* compiled from: FlagSet.java */
/* renamed from: com.google.android.exoplayer2.util.o, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public final class C36599o {

    /* renamed from: a, reason: collision with root package name */
    public final SparseBooleanArray f348141a;

    /* compiled from: FlagSet.java */
    /* renamed from: com.google.android.exoplayer2.util.o$b */
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        public final SparseBooleanArray f348142a = new SparseBooleanArray();

        /* renamed from: b, reason: collision with root package name */
        public boolean f348143b;

        public final void a(int i12) {
            C36585a.d(!this.f348143b);
            this.f348142a.append(i12, true);
        }

        public final C36599o b() {
            C36585a.d(!this.f348143b);
            this.f348143b = true;
            return new C36599o(this.f348142a, null);
        }
    }

    public C36599o(SparseBooleanArray sparseBooleanArray, a aVar) {
        this.f348141a = sparseBooleanArray;
    }

    public final int a(int i12) {
        SparseBooleanArray sparseBooleanArray = this.f348141a;
        C36585a.c(i12, sparseBooleanArray.size());
        return sparseBooleanArray.keyAt(i12);
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C36599o)) {
            return false;
        }
        C36599o c36599o = (C36599o) obj;
        int i12 = U.f348106a;
        SparseBooleanArray sparseBooleanArray = this.f348141a;
        if (i12 >= 24) {
            return sparseBooleanArray.equals(c36599o.f348141a);
        }
        if (sparseBooleanArray.size() != c36599o.f348141a.size()) {
            return false;
        }
        for (int i13 = 0; i13 < sparseBooleanArray.size(); i13++) {
            if (a(i13) != c36599o.a(i13)) {
                return false;
            }
        }
        return true;
    }

    public final int hashCode() {
        int i12 = U.f348106a;
        SparseBooleanArray sparseBooleanArray = this.f348141a;
        if (i12 >= 24) {
            return sparseBooleanArray.hashCode();
        }
        int size = sparseBooleanArray.size();
        for (int i13 = 0; i13 < sparseBooleanArray.size(); i13++) {
            size = (size * 31) + a(i13);
        }
        return size;
    }
}
