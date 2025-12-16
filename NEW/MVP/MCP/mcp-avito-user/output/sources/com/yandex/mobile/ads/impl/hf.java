package com.yandex.mobile.ads.impl;

import java.util.Arrays;

/* loaded from: classes8.dex */
public abstract class hf implements cu {

    /* renamed from: a, reason: collision with root package name */
    protected final v91 f386121a;

    /* renamed from: b, reason: collision with root package name */
    protected final int f386122b;

    /* renamed from: c, reason: collision with root package name */
    protected final int[] f386123c;

    /* renamed from: d, reason: collision with root package name */
    private final vw[] f386124d;

    /* renamed from: e, reason: collision with root package name */
    private int f386125e;

    public hf(v91 v91Var, int[] iArr) {
        int i12 = 0;
        db.b(iArr.length > 0);
        this.f386121a = (v91) db.a(v91Var);
        int length = iArr.length;
        this.f386122b = length;
        this.f386124d = new vw[length];
        for (int i13 = 0; i13 < iArr.length; i13++) {
            this.f386124d[i13] = v91Var.a(iArr[i13]);
        }
        Arrays.sort(this.f386124d, new A(11));
        this.f386123c = new int[this.f386122b];
        while (true) {
            int i14 = this.f386122b;
            if (i12 >= i14) {
                long[] jArr = new long[i14];
                return;
            } else {
                this.f386123c[i12] = v91Var.a(this.f386124d[i12]);
                i12++;
            }
        }
    }

    @Override // com.yandex.mobile.ads.impl.cu
    public void a(float f12) {
    }

    @Override // com.yandex.mobile.ads.impl.cu
    public void c() {
    }

    @Override // com.yandex.mobile.ads.impl.cu
    public final vw d() {
        vw[] vwVarArr = this.f386124d;
        e();
        return vwVarArr[0];
    }

    public final boolean equals(@j.P Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        hf hfVar = (hf) obj;
        return this.f386121a == hfVar.f386121a && Arrays.equals(this.f386123c, hfVar.f386123c);
    }

    public final int hashCode() {
        if (this.f386125e == 0) {
            this.f386125e = Arrays.hashCode(this.f386123c) + (System.identityHashCode(this.f386121a) * 31);
        }
        return this.f386125e;
    }

    @Override // com.yandex.mobile.ads.impl.z91
    public final int length() {
        return this.f386123c.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ int a(vw vwVar, vw vwVar2) {
        return vwVar2.f391177h - vwVar.f391177h;
    }

    @Override // com.yandex.mobile.ads.impl.cu
    public void b() {
    }

    @Override // com.yandex.mobile.ads.impl.z91
    public final int c(int i12) {
        for (int i13 = 0; i13 < this.f386122b; i13++) {
            if (this.f386123c[i13] == i12) {
                return i13;
            }
        }
        return -1;
    }

    @Override // com.yandex.mobile.ads.impl.z91
    public final v91 a() {
        return this.f386121a;
    }

    @Override // com.yandex.mobile.ads.impl.z91
    public final int b(int i12) {
        return this.f386123c[i12];
    }

    @Override // com.yandex.mobile.ads.impl.z91
    public final vw a(int i12) {
        return this.f386124d[i12];
    }
}
