package androidx.compose.ui.spatial;

import android.os.Handler;
import androidx.collection.J;
import androidx.collection.K;
import androidx.collection.N0;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.C22212c;
import androidx.compose.ui.RunnableC22211b;
import androidx.compose.ui.graphics.A0;
import androidx.compose.ui.node.AbstractC22443w0;
import androidx.compose.ui.node.I0;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.r;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: RectManager.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/spatial/i;", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final b f41870a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final l f41871b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final N0<Y41.a<G0>> f41872c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41873d;

    /* renamed from: e, reason: collision with root package name */
    public boolean f41874e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f41875f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public RunnableC22211b f41876g;

    /* renamed from: h, reason: collision with root package name */
    public long f41877h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final Y41.a<G0> f41878i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final l0.e f41879j;

    public i() {
        this(null, 1, null);
    }

    public static long g(LayoutNode layoutNode) {
        float[] fArrMo3getUnderlyingMatrixsQKQjiQ;
        int iA2;
        AbstractC22443w0 abstractC22443w0 = layoutNode.f40615I.f40876c;
        l0.g.f413384b.getClass();
        AbstractC22443w0 abstractC22443w02 = layoutNode.f40615I.f40875b;
        long jB2 = 0;
        while (abstractC22443w02 != null && abstractC22443w02 != abstractC22443w0) {
            I0 i02 = abstractC22443w02.f40907J;
            jB2 = r.b(jB2, abstractC22443w02.f40898A);
            abstractC22443w02 = abstractC22443w02.f40913r;
            if (i02 != null && (iA2 = j.a((fArrMo3getUnderlyingMatrixsQKQjiQ = i02.mo3getUnderlyingMatrixsQKQjiQ()))) != 3) {
                if ((iA2 & 2) == 0) {
                    q.f42862b.getClass();
                    return q.f42863c;
                }
                jB2 = A0.c(jB2, fArrMo3getUnderlyingMatrixsQKQjiQ);
            }
        }
        return r.c(jB2);
    }

    /* JADX WARN: Removed duplicated region for block: B:80:0x02ad  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a() {
        /*
            Method dump skipped, instructions count: 1153
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.i.a():void");
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00e6  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void b(androidx.compose.ui.node.LayoutNode r19, long r20, boolean r22) {
        /*
            Method dump skipped, instructions count: 241
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.i.b(androidx.compose.ui.node.LayoutNode, long, boolean):void");
    }

    public final void c(LayoutNode layoutNode) {
        androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
        LayoutNode[] layoutNodeArr = eVarO.f38260b;
        int i12 = eVarO.f38262d;
        for (int i13 = 0; i13 < i12; i13++) {
            LayoutNode layoutNode2 = layoutNodeArr[i13];
            b(layoutNode2, layoutNode2.f40615I.f40876c.f40898A, false);
            c(layoutNode2);
        }
    }

    public final void d(@Y61.k LayoutNode layoutNode) {
        this.f41873d = true;
        int i12 = layoutNode.f40627c & 67108863;
        b bVar = this.f41870a;
        long[] jArr = bVar.f41863a;
        int i13 = bVar.f41865c;
        int i14 = 0;
        while (true) {
            if (i14 >= jArr.length - 2 || i14 >= i13) {
                break;
            }
            int i15 = i14 + 2;
            long j12 = jArr[i15];
            if ((((int) j12) & 67108863) == i12) {
                jArr[i15] = 2305843009213693952L | j12;
                break;
            }
            i14 += 3;
        }
        RunnableC22211b runnableC22211b = this.f41876g;
        boolean z12 = runnableC22211b != null;
        long j13 = this.f41871b.f41883c;
        if (j13 >= 0 || !z12) {
            if (this.f41877h == j13 && z12) {
                return;
            }
            if (runnableC22211b != null) {
                Handler handler = C22212c.f38944a;
                C22212c.f38944a.removeCallbacks(runnableC22211b);
            }
            Handler handler2 = C22212c.f38944a;
            long jCurrentTimeMillis = System.currentTimeMillis();
            long jMax = Math.max(j13, 16 + jCurrentTimeMillis);
            this.f41877h = jMax;
            RunnableC22211b runnableC22211b2 = new RunnableC22211b(0, this.f41878i);
            C22212c.f38944a.postDelayed(runnableC22211b2, jMax - jCurrentTimeMillis);
            this.f41876g = runnableC22211b2;
        }
    }

    public final void e(@Y61.k LayoutNode layoutNode) {
        if (androidx.compose.ui.l.f40320a) {
            long jG2 = g(layoutNode);
            if (!j.b(jG2)) {
                c(layoutNode);
                return;
            }
            layoutNode.f40630f = jG2;
            layoutNode.f40631g = false;
            androidx.compose.runtime.collection.e<LayoutNode> eVarO = layoutNode.O();
            LayoutNode[] layoutNodeArr = eVarO.f38260b;
            int i12 = eVarO.f38262d;
            for (int i13 = 0; i13 < i12; i13++) {
                LayoutNode layoutNode2 = layoutNodeArr[i13];
                f(layoutNode2, layoutNode2.f40615I.f40876c.f40898A, false);
            }
            d(layoutNode);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:81:0x023a  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0241  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void f(@Y61.k androidx.compose.ui.node.LayoutNode r30, long r31, boolean r33) {
        /*
            Method dump skipped, instructions count: 606
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.spatial.i.f(androidx.compose.ui.node.LayoutNode, long, boolean):void");
    }

    public final void h(@Y61.k LayoutNode layoutNode) {
        int i12 = layoutNode.f40627c & 67108863;
        b bVar = this.f41870a;
        long[] jArr = bVar.f41863a;
        int i13 = bVar.f41865c;
        int i14 = 0;
        while (true) {
            if (i14 >= jArr.length - 2 || i14 >= i13) {
                break;
            }
            int i15 = i14 + 2;
            if ((((int) jArr[i15]) & 67108863) == i12) {
                jArr[i14] = -1;
                jArr[i14 + 1] = -1;
                jArr[i15] = 2305843009213693951L;
                break;
            }
            i14 += 3;
        }
        this.f41873d = true;
        this.f41875f = true;
    }

    public i(int i12) {
        this.f41870a = new b();
        this.f41871b = new l();
        this.f41872c = new N0<>(0, 1, null);
        this.f41877h = -1L;
        this.f41878i = new h(this);
        this.f41879j = new l0.e();
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(J j12, int i12, C42822w c42822w) {
        this(0);
        if ((i12 & 1) != 0) {
            androidx.collection.A0 a02 = K.f25558a;
        }
    }
}
