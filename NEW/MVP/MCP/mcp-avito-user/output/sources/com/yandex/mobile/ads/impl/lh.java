package com.yandex.mobile.ads.impl;

import java.io.File;

/* loaded from: classes8.dex */
public class lh implements Comparable<lh> {

    /* renamed from: a, reason: collision with root package name */
    public final String f387478a;

    /* renamed from: b, reason: collision with root package name */
    public final long f387479b;

    /* renamed from: c, reason: collision with root package name */
    public final long f387480c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f387481d;

    /* renamed from: e, reason: collision with root package name */
    @j.P
    public final File f387482e;

    /* renamed from: f, reason: collision with root package name */
    public final long f387483f;

    public lh(String str, long j12, long j13, long j14, @j.P File file) {
        this.f387478a = str;
        this.f387479b = j12;
        this.f387480c = j13;
        this.f387481d = file != null;
        this.f387482e = file;
        this.f387483f = j14;
    }

    @Override // java.lang.Comparable
    public final int compareTo(lh lhVar) {
        lh lhVar2 = lhVar;
        if (!this.f387478a.equals(lhVar2.f387478a)) {
            return this.f387478a.compareTo(lhVar2.f387478a);
        }
        long j12 = this.f387479b - lhVar2.f387479b;
        if (j12 == 0) {
            return 0;
        }
        return j12 < 0 ? -1 : 1;
    }

    public final String toString() {
        StringBuilder sbA = Cif.a("[");
        sbA.append(this.f387479b);
        sbA.append(", ");
        return AK.c.j(this.f387480c, "]", sbA);
    }
}
