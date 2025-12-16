package com.google.android.exoplayer2.upstream;

import com.google.android.exoplayer2.upstream.InterfaceC36572b;
import com.google.android.exoplayer2.util.U;
import j.P;
import java.util.Arrays;
import shark.AndroidResourceIdNames;

/* compiled from: DefaultAllocator.java */
/* loaded from: classes6.dex */
public final class q implements InterfaceC36572b {

    /* renamed from: d, reason: collision with root package name */
    public int f347952d;

    /* renamed from: e, reason: collision with root package name */
    public int f347953e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f347949a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f347950b = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;

    /* renamed from: f, reason: collision with root package name */
    public int f347954f = 0;

    /* renamed from: g, reason: collision with root package name */
    public C36571a[] f347955g = new C36571a[100];

    /* renamed from: c, reason: collision with root package name */
    @P
    public final byte[] f347951c = null;

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36572b
    public final synchronized void a() {
        try {
            int i12 = 0;
            int iMax = Math.max(0, U.g(this.f347952d, this.f347950b) - this.f347953e);
            int i13 = this.f347954f;
            if (iMax >= i13) {
                return;
            }
            if (this.f347951c != null) {
                int i14 = i13 - 1;
                while (i12 <= i14) {
                    C36571a c36571a = this.f347955g[i12];
                    c36571a.getClass();
                    if (c36571a.f347794a == this.f347951c) {
                        i12++;
                    } else {
                        C36571a c36571a2 = this.f347955g[i14];
                        c36571a2.getClass();
                        if (c36571a2.f347794a != this.f347951c) {
                            i14--;
                        } else {
                            C36571a[] c36571aArr = this.f347955g;
                            c36571aArr[i12] = c36571a2;
                            c36571aArr[i14] = c36571a;
                            i14--;
                            i12++;
                        }
                    }
                }
                iMax = Math.max(iMax, i12);
                if (iMax >= this.f347954f) {
                    return;
                }
            }
            Arrays.fill(this.f347955g, iMax, this.f347954f, (Object) null);
            this.f347954f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36572b
    public final int b() {
        return this.f347950b;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36572b
    public final synchronized C36571a c() {
        C36571a c36571a;
        try {
            int i12 = this.f347953e + 1;
            this.f347953e = i12;
            int i13 = this.f347954f;
            if (i13 > 0) {
                C36571a[] c36571aArr = this.f347955g;
                int i14 = i13 - 1;
                this.f347954f = i14;
                c36571a = c36571aArr[i14];
                c36571a.getClass();
                this.f347955g[this.f347954f] = null;
            } else {
                C36571a c36571a2 = new C36571a(new byte[this.f347950b], 0);
                C36571a[] c36571aArr2 = this.f347955g;
                if (i12 > c36571aArr2.length) {
                    this.f347955g = (C36571a[]) Arrays.copyOf(c36571aArr2, c36571aArr2.length * 2);
                }
                c36571a = c36571a2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return c36571a;
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36572b
    public final synchronized void d(C36571a c36571a) {
        C36571a[] c36571aArr = this.f347955g;
        int i12 = this.f347954f;
        this.f347954f = i12 + 1;
        c36571aArr[i12] = c36571a;
        this.f347953e--;
        notifyAll();
    }

    @Override // com.google.android.exoplayer2.upstream.InterfaceC36572b
    public final synchronized void e(@P InterfaceC36572b.a aVar) {
        while (aVar != null) {
            try {
                C36571a[] c36571aArr = this.f347955g;
                int i12 = this.f347954f;
                this.f347954f = i12 + 1;
                c36571aArr[i12] = aVar.a();
                this.f347953e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    public final synchronized void f(int i12) {
        boolean z12 = i12 < this.f347952d;
        this.f347952d = i12;
        if (z12) {
            a();
        }
    }
}
