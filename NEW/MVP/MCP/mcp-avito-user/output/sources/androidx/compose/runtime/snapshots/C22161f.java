package androidx.compose.runtime.snapshots;

import androidx.collection.S0;
import androidx.compose.runtime.snapshots.AbstractC22168m;
import java.util.Arrays;
import java.util.HashMap;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: Snapshot.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/runtime/snapshots/f;", "Landroidx/compose/runtime/snapshots/e;", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22161f extends C22160e {

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final C22160e f38711p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f38712q;

    public C22161f(long j12, @Y61.k C22174t c22174t, @Y61.l Y41.l<Object, G0> lVar, @Y61.l Y41.l<Object, G0> lVar2, @Y61.k C22160e c22160e) {
        super(j12, c22174t, lVar, lVar2);
        this.f38711p = c22160e;
        c22160e.k();
    }

    @Override // androidx.compose.runtime.snapshots.C22160e, androidx.compose.runtime.snapshots.AbstractC22167l
    public final void c() {
        if (this.f38723c) {
            return;
        }
        super.c();
        if (this.f38712q) {
            return;
        }
        this.f38712q = true;
        this.f38711p.l();
    }

    @Override // androidx.compose.runtime.snapshots.C22160e
    @Y61.k
    public final AbstractC22168m w() {
        C22160e c22160e = this.f38711p;
        if (c22160e.f38710n || c22160e.f38723c) {
            return new AbstractC22168m.a(null);
        }
        S0<V> s02 = this.f38705i;
        long j12 = this.f38722b;
        HashMap mapB = s02 != null ? C22176v.b(c22160e.getF38722b(), this, this.f38711p.getF38721a()) : null;
        Object obj = C22176v.f38750c;
        synchronized (obj) {
            try {
                C22176v.c(this);
                if (s02 == null || s02.f25732d == 0) {
                    a();
                } else {
                    AbstractC22168m abstractC22168mZ = z(this.f38711p.getF38722b(), s02, mapB, this.f38711p.getF38721a());
                    if (!kotlin.jvm.internal.L.f(abstractC22168mZ, AbstractC22168m.b.f38725a)) {
                        return abstractC22168mZ;
                    }
                    S0<V> s0X = this.f38711p.x();
                    if (s0X != null) {
                        s0X.l(s02);
                    } else {
                        this.f38711p.B(s02);
                        this.f38705i = null;
                    }
                }
                if (this.f38711p.getF38722b() < j12) {
                    this.f38711p.v();
                }
                C22160e c22160e2 = this.f38711p;
                c22160e2.r(c22160e2.getF38721a().b(j12).a(this.f38707k));
                this.f38711p.A(j12);
                C22160e c22160e3 = this.f38711p;
                int i12 = this.f38724d;
                this.f38724d = -1;
                if (i12 >= 0) {
                    int[] iArr = c22160e3.f38708l;
                    int length = iArr.length;
                    int[] iArrCopyOf = Arrays.copyOf(iArr, length + 1);
                    iArrCopyOf[length] = i12;
                    c22160e3.f38708l = iArrCopyOf;
                } else {
                    c22160e3.getClass();
                }
                C22160e c22160e4 = this.f38711p;
                C22174t c22174t = this.f38707k;
                c22160e4.getClass();
                synchronized (obj) {
                    c22160e4.f38707k = c22160e4.f38707k.e(c22174t);
                    G0 g02 = G0.f406611a;
                    C22160e c22160e5 = this.f38711p;
                    int[] iArr2 = this.f38708l;
                    c22160e5.getClass();
                    if (iArr2.length != 0) {
                        int[] iArr3 = c22160e5.f38708l;
                        if (iArr3.length != 0) {
                            int length2 = iArr3.length;
                            int length3 = iArr2.length;
                            int[] iArrCopyOf2 = Arrays.copyOf(iArr3, length2 + length3);
                            System.arraycopy(iArr2, 0, iArrCopyOf2, length2, length3);
                            iArr2 = iArrCopyOf2;
                        }
                        c22160e5.f38708l = iArr2;
                    }
                }
                this.f38710n = true;
                if (!this.f38712q) {
                    this.f38712q = true;
                    this.f38711p.l();
                }
                return AbstractC22168m.b.f38725a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}
