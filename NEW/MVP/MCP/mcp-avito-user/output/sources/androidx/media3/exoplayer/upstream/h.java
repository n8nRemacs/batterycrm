package androidx.media3.exoplayer.upstream;

import androidx.media3.common.util.J;
import androidx.media3.common.util.M;
import androidx.media3.exoplayer.upstream.b;
import j.P;
import java.util.Arrays;
import shark.AndroidResourceIdNames;

/* compiled from: DefaultAllocator.java */
@J
/* loaded from: classes.dex */
public final class h implements b {

    /* renamed from: d, reason: collision with root package name */
    public int f50122d;

    /* renamed from: e, reason: collision with root package name */
    public int f50123e;

    /* renamed from: a, reason: collision with root package name */
    public final boolean f50119a = true;

    /* renamed from: b, reason: collision with root package name */
    public final int f50120b = AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR;

    /* renamed from: f, reason: collision with root package name */
    public int f50124f = 0;

    /* renamed from: g, reason: collision with root package name */
    public a[] f50125g = new a[100];

    /* renamed from: c, reason: collision with root package name */
    @P
    public final byte[] f50121c = null;

    @Override // androidx.media3.exoplayer.upstream.b
    public final synchronized void a() {
        try {
            int i12 = 0;
            int iMax = Math.max(0, M.g(this.f50122d, this.f50120b) - this.f50123e);
            int i13 = this.f50124f;
            if (iMax >= i13) {
                return;
            }
            if (this.f50121c != null) {
                int i14 = i13 - 1;
                while (i12 <= i14) {
                    a aVar = this.f50125g[i12];
                    aVar.getClass();
                    if (aVar.f50063a == this.f50121c) {
                        i12++;
                    } else {
                        a aVar2 = this.f50125g[i14];
                        aVar2.getClass();
                        if (aVar2.f50063a != this.f50121c) {
                            i14--;
                        } else {
                            a[] aVarArr = this.f50125g;
                            aVarArr[i12] = aVar2;
                            aVarArr[i14] = aVar;
                            i14--;
                            i12++;
                        }
                    }
                }
                iMax = Math.max(iMax, i12);
                if (iMax >= this.f50124f) {
                    return;
                }
            }
            Arrays.fill(this.f50125g, iMax, this.f50124f, (Object) null);
            this.f50124f = iMax;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final int b() {
        return this.f50120b;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final synchronized a c() {
        a aVar;
        try {
            int i12 = this.f50123e + 1;
            this.f50123e = i12;
            int i13 = this.f50124f;
            if (i13 > 0) {
                a[] aVarArr = this.f50125g;
                int i14 = i13 - 1;
                this.f50124f = i14;
                aVar = aVarArr[i14];
                aVar.getClass();
                this.f50125g[this.f50124f] = null;
            } else {
                a aVar2 = new a(new byte[this.f50120b], 0);
                a[] aVarArr2 = this.f50125g;
                if (i12 > aVarArr2.length) {
                    this.f50125g = (a[]) Arrays.copyOf(aVarArr2, aVarArr2.length * 2);
                }
                aVar = aVar2;
            }
        } catch (Throwable th2) {
            throw th2;
        }
        return aVar;
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final synchronized void d(@P b.a aVar) {
        while (aVar != null) {
            try {
                a[] aVarArr = this.f50125g;
                int i12 = this.f50124f;
                this.f50124f = i12 + 1;
                aVarArr[i12] = aVar.a();
                this.f50123e--;
                aVar = aVar.next();
            } catch (Throwable th2) {
                throw th2;
            }
        }
        notifyAll();
    }

    @Override // androidx.media3.exoplayer.upstream.b
    public final synchronized void e(a aVar) {
        a[] aVarArr = this.f50125g;
        int i12 = this.f50124f;
        this.f50124f = i12 + 1;
        aVarArr[i12] = aVar;
        this.f50123e--;
        notifyAll();
    }

    public final synchronized void f(int i12) {
        boolean z12 = i12 < this.f50122d;
        this.f50122d = i12;
        if (z12) {
            a();
        }
    }
}
