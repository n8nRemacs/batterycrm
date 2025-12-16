package com.yandex.mobile.ads.impl;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/* loaded from: classes8.dex */
final class vl1 implements t71 {

    /* renamed from: a, reason: collision with root package name */
    private final List<rl1> f390907a;

    /* renamed from: b, reason: collision with root package name */
    private final long[] f390908b;

    /* renamed from: c, reason: collision with root package name */
    private final long[] f390909c;

    public vl1(ArrayList arrayList) {
        this.f390907a = Collections.unmodifiableList(new ArrayList(arrayList));
        this.f390908b = new long[arrayList.size() * 2];
        for (int i12 = 0; i12 < arrayList.size(); i12++) {
            rl1 rl1Var = (rl1) arrayList.get(i12);
            int i13 = i12 * 2;
            long[] jArr = this.f390908b;
            jArr[i13] = rl1Var.f389568b;
            jArr[i13 + 1] = rl1Var.f389569c;
        }
        long[] jArr2 = this.f390908b;
        long[] jArrCopyOf = Arrays.copyOf(jArr2, jArr2.length);
        this.f390909c = jArrCopyOf;
        Arrays.sort(jArrCopyOf);
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a(long j12) {
        int iA2 = pc1.a(this.f390909c, j12, false);
        if (iA2 < this.f390909c.length) {
            return iA2;
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final List<vm> b(long j12) {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        for (int i12 = 0; i12 < this.f390907a.size(); i12++) {
            long[] jArr = this.f390908b;
            int i13 = i12 * 2;
            if (jArr[i13] <= j12 && j12 < jArr[i13 + 1]) {
                rl1 rl1Var = this.f390907a.get(i12);
                vm vmVar = rl1Var.f389567a;
                if (vmVar.f390916e == -3.4028235E38f) {
                    arrayList2.add(rl1Var);
                } else {
                    arrayList.add(vmVar);
                }
            }
        }
        Collections.sort(arrayList2, new A(9));
        for (int i14 = 0; i14 < arrayList2.size(); i14++) {
            arrayList.add(((rl1) arrayList2.get(i14)).f389567a.a().a(1, (-1) - i14).a());
        }
        return arrayList;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final int a() {
        return this.f390909c.length;
    }

    @Override // com.yandex.mobile.ads.impl.t71
    public final long a(int i12) {
        db.a(i12 >= 0);
        db.a(i12 < this.f390909c.length);
        return this.f390909c[i12];
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(rl1 rl1Var, rl1 rl1Var2) {
        return Long.compare(rl1Var.f389568b, rl1Var2.f389568b);
    }
}
