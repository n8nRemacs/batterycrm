package com.yandex.mobile.ads.impl;

import java.util.TreeSet;

/* loaded from: classes8.dex */
public final class c90 implements fh {

    /* renamed from: a, reason: collision with root package name */
    private final long f384206a;

    /* renamed from: b, reason: collision with root package name */
    private final TreeSet<lh> f384207b = new TreeSet<>(new A(10));

    /* renamed from: c, reason: collision with root package name */
    private long f384208c;

    public c90(long j12) {
        this.f384206a = j12;
    }

    @Override // com.yandex.mobile.ads.impl.yg.b
    public final void a(yg ygVar, lh lhVar) {
        this.f384207b.add(lhVar);
        this.f384208c += lhVar.f387480c;
        while (this.f384208c > this.f384206a && !this.f384207b.isEmpty()) {
            ygVar.a(this.f384207b.first());
        }
    }

    @Override // com.yandex.mobile.ads.impl.yg.b
    public final void a(lh lhVar) {
        this.f384207b.remove(lhVar);
        this.f384208c -= lhVar.f387480c;
    }

    @Override // com.yandex.mobile.ads.impl.yg.b
    public final void a(yg ygVar, lh lhVar, lh lhVar2) {
        a(lhVar);
        a(ygVar, lhVar2);
    }

    public final void a(yg ygVar, long j12) {
        if (j12 != -1) {
            while (this.f384208c + j12 > this.f384206a && !this.f384207b.isEmpty()) {
                ygVar.a(this.f384207b.first());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int a(lh lhVar, lh lhVar2) {
        long j12 = lhVar.f387483f;
        long j13 = lhVar2.f387483f;
        if (j12 - j13 != 0) {
            return j12 < j13 ? -1 : 1;
        }
        if (!lhVar.f387478a.equals(lhVar2.f387478a)) {
            return lhVar.f387478a.compareTo(lhVar2.f387478a);
        }
        long j14 = lhVar.f387479b - lhVar2.f387479b;
        if (j14 == 0) {
            return 0;
        }
        return j14 < 0 ? -1 : 1;
    }
}
