package androidx.compose.ui.spatial;

import androidx.collection.A0;
import androidx.collection.K;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.C22421l;
import androidx.compose.ui.node.C22437t0;
import androidx.compose.ui.node.InterfaceC22419k;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.r;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import l0.g;

/* compiled from: ThrottledCallbacks.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/spatial/l;", "", "<init>", "()V", "a", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class l {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public a f41882b;

    /* renamed from: d, reason: collision with root package name */
    public long f41884d;

    /* renamed from: e, reason: collision with root package name */
    public long f41885e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public float[] f41886f;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final A0<a> f41881a = K.a();

    /* renamed from: c, reason: collision with root package name */
    public long f41883c = -1;

    /* compiled from: ThrottledCallbacks.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/spatial/l$a;", "Landroidx/compose/ui/node/k$a;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a implements InterfaceC22419k.a {

        /* renamed from: a, reason: collision with root package name */
        public final int f41887a;

        /* renamed from: b, reason: collision with root package name */
        public final long f41888b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final InterfaceC22419k f41889c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public a f41890d;

        /* renamed from: e, reason: collision with root package name */
        public long f41891e;

        /* renamed from: f, reason: collision with root package name */
        public long f41892f;

        /* renamed from: g, reason: collision with root package name */
        public long f41893g = 0;

        /* renamed from: h, reason: collision with root package name */
        public long f41894h = -1;

        public a(int i12, long j12, @Y61.k InterfaceC22419k interfaceC22419k) {
            this.f41887a = i12;
            this.f41888b = j12;
            this.f41889c = interfaceC22419k;
        }

        public final void a() {
            l lVar = l.this;
            A0<a> a02 = lVar.f41881a;
            int i12 = this.f41887a;
            a aVarG = a02.g(i12);
            if (aVarG != null) {
                if (aVarG.equals(this)) {
                    a aVar = this.f41890d;
                    this.f41890d = null;
                    if (aVar != null) {
                        int iD2 = a02.d(i12);
                        Object[] objArr = a02.f25555c;
                        Object obj = objArr[iD2];
                        a02.f25554b[iD2] = i12;
                        objArr[iD2] = aVar;
                        return;
                    }
                    return;
                }
                int iD3 = a02.d(i12);
                Object[] objArr2 = a02.f25555c;
                Object obj2 = objArr2[iD3];
                a02.f25554b[iD3] = i12;
                objArr2[iD3] = aVarG;
                while (true) {
                    a aVar2 = aVarG.f41890d;
                    if (aVar2 == null) {
                        break;
                    }
                    if (aVar2 == this) {
                        aVarG.f41890d = this.f41890d;
                        this.f41890d = null;
                        return;
                    }
                    aVarG = aVar2;
                }
            }
            a aVar3 = lVar.f41882b;
            if (aVar3 == this) {
                lVar.f41882b = aVar3.f41890d;
                this.f41890d = null;
                return;
            }
            a aVar4 = aVar3 != null ? aVar3.f41890d : null;
            while (true) {
                a aVar5 = aVar3;
                aVar3 = aVar4;
                if (aVar3 == null) {
                    return;
                }
                if (aVar3 == this) {
                    if (aVar5 != null) {
                        aVar5.f41890d = aVar3.f41890d;
                    }
                    this.f41890d = null;
                    return;
                }
                aVar4 = aVar3.f41890d;
            }
        }
    }

    public l() {
        q.a aVar = q.f42862b;
        aVar.getClass();
        this.f41884d = 0L;
        aVar.getClass();
        this.f41885e = 0L;
    }

    public static long a(a aVar, long j12, long j13, float[] fArr, long j14, long j15) {
        k kVar;
        long j16 = aVar.f41888b;
        if (j16 > 0) {
            long j17 = aVar.f41894h;
            if (j17 > 0) {
                if (j14 - j17 <= j16) {
                    return Math.min(j15, j17 + j16);
                }
                aVar.f41893g = j14;
                aVar.f41894h = -1L;
                long j18 = aVar.f41891e;
                long j19 = aVar.f41892f;
                InterfaceC22419k interfaceC22419k = aVar.f41889c;
                AbstractC22443w0 abstractC22443w0E = C22421l.e(interfaceC22419k, 2);
                LayoutNode layoutNodeG = C22421l.g(interfaceC22419k);
                if (layoutNodeG.r()) {
                    C22437t0 c22437t0 = layoutNodeG.f40615I;
                    if (c22437t0.f40876c != abstractC22443w0E) {
                        q.a aVar2 = q.f42862b;
                        g.a aVar3 = l0.g.f413384b;
                        long j22 = abstractC22443w0E.f40347d;
                        AbstractC22443w0 abstractC22443w0 = c22437t0.f40876c;
                        abstractC22443w0.getClass();
                        kVar = new k(r.c(abstractC22443w0.G1(abstractC22443w0E, (Float.floatToRawIntBits((int) (j18 >> 32)) << 32) | (Float.floatToRawIntBits((int) (j18 & 4294967295L)) & 4294967295L), true)), ((((int) (r1 >> 32)) + ((int) (j22 >> 32))) << 32) | ((((int) (r1 & 4294967295L)) + ((int) (j22 & 4294967295L))) & 4294967295L), j12, j13, fArr, interfaceC22419k, null);
                    } else {
                        kVar = new k(j18, j19, j12, j13, fArr, interfaceC22419k, null);
                    }
                } else {
                    kVar = null;
                }
                if (kVar != null) {
                    throw null;
                }
            }
        }
        return j15;
    }

    public final void b(a aVar, long j12, long j13, float[] fArr, long j14) {
        k kVar;
        boolean z12 = j14 - aVar.f41893g > 0;
        long j15 = aVar.f41888b;
        boolean z13 = j15 == 0;
        aVar.f41894h = j14;
        if (z12 && z13) {
            aVar.f41893g = j14;
            long j16 = aVar.f41891e;
            long j17 = aVar.f41892f;
            InterfaceC22419k interfaceC22419k = aVar.f41889c;
            AbstractC22443w0 abstractC22443w0E = C22421l.e(interfaceC22419k, 2);
            LayoutNode layoutNodeG = C22421l.g(interfaceC22419k);
            if (layoutNodeG.r()) {
                C22437t0 c22437t0 = layoutNodeG.f40615I;
                if (c22437t0.f40876c != abstractC22443w0E) {
                    q.a aVar2 = q.f42862b;
                    g.a aVar3 = l0.g.f413384b;
                    long j18 = abstractC22443w0E.f40347d;
                    AbstractC22443w0 abstractC22443w0 = c22437t0.f40876c;
                    abstractC22443w0.getClass();
                    kVar = new k(r.c(abstractC22443w0.G1(abstractC22443w0E, (Float.floatToRawIntBits((int) (j16 & 4294967295L)) & 4294967295L) | (Float.floatToRawIntBits((int) (j16 >> 32)) << 32), true)), ((((int) (r4 >> 32)) + ((int) (j18 >> 32))) << 32) | ((((int) (r4 & 4294967295L)) + ((int) (j18 & 4294967295L))) & 4294967295L), j12, j13, fArr, interfaceC22419k, null);
                } else {
                    kVar = new k(j16, j17, j12, j13, fArr, interfaceC22419k, null);
                }
            } else {
                kVar = null;
            }
            if (kVar != null) {
                throw null;
            }
        }
        if (z13) {
            return;
        }
        long j19 = this.f41883c;
        long j22 = j14 + j15;
        if (j19 <= 0 || j22 >= j19) {
            return;
        }
        this.f41883c = j19;
    }
}
