package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.MutatePriority;
import androidx.compose.foundation.gestures.Orientation;
import androidx.compose.foundation.gestures.U1;
import androidx.compose.foundation.gestures.W1;
import androidx.compose.foundation.lazy.layout.C20712c0;
import androidx.compose.foundation.lazy.layout.C20713d;
import androidx.compose.foundation.lazy.layout.C20714d0;
import androidx.compose.foundation.lazy.layout.C20718f0;
import androidx.compose.foundation.lazy.layout.C20725j;
import androidx.compose.foundation.lazy.layout.LazyLayoutItemAnimator;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.F3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.node.LayoutNode;
import androidx.compose.ui.unit.C22712b;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: LazyStaggeredGridState.kt */
@F3
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/y0;", "Landroidx/compose/foundation/gestures/U1;", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class y0 implements U1 {

    /* renamed from: w, reason: collision with root package name */
    public static final /* synthetic */ int f29679w = 0;

    /* renamed from: a, reason: collision with root package name */
    public boolean f29680a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public C20770i0 f29681b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final p0 f29682c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<C20770i0> f29683d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y f29684e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29685f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f29686g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public LayoutNode f29687h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final C20713d f29688i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final C20725j f29689j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f29690k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C20714d0 f29691l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final U1 f29692m;

    /* renamed from: n, reason: collision with root package name */
    public float f29693n;

    /* renamed from: o, reason: collision with root package name */
    public int f29694o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final LinkedHashMap f29695p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.interaction.m f29696q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final C20712c0 f29697r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final LazyLayoutItemAnimator<l0> f29698s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<kotlin.G0> f29699t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1<kotlin.G0> f29700u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final C20718f0 f29701v;

    /* compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0010\u0015\n\u0002\b\u0003\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003*\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroidx/compose/runtime/saveable/x;", "Landroidx/compose/foundation/lazy/staggeredgrid/y0;", VoiceInfo.STATE, "", "", "invoke", "(Landroidx/compose/runtime/saveable/x;Landroidx/compose/foundation/lazy/staggeredgrid/y0;)Ljava/util/List;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.saveable.x, y0, List<? extends int[]>> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f29702l = new a();

        public a() {
            super(2);
        }

        @Override // Y41.p
        public final List<? extends int[]> invoke(androidx.compose.runtime.saveable.x xVar, y0 y0Var) {
            p0 p0Var = y0Var.f29682c;
            return C42745f0.U(p0Var.f29666b, p0Var.f29668d);
        }
    }

    /* compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010 \n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0004\u0018\u00010\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "", "it", "Landroidx/compose/foundation/lazy/staggeredgrid/y0;", "invoke", "(Ljava/util/List;)Landroidx/compose/foundation/lazy/staggeredgrid/y0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<List<? extends int[]>, y0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f29703l = new b();

        public b() {
            super(1);
        }

        @Override // Y41.l
        public final y0 invoke(List<? extends int[]> list) {
            List<? extends int[]> list2 = list;
            return new y0(list2.get(0), list2.get(1));
        }
    }

    /* compiled from: LazyStaggeredGridState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/staggeredgrid/y0$c;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: LazyStaggeredGridState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "androidx.compose.foundation.lazy.staggeredgrid.LazyStaggeredGridState", f = "LazyStaggeredGridState.kt", i = {0, 0, 0}, l = {251, 252}, m = "scroll", n = {"this", "scrollPriority", "block"}, s = {"L$0", "L$1", "L$2"})
    public static final class d extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public y0 f29704q;

        /* renamed from: r, reason: collision with root package name */
        public MutatePriority f29705r;

        /* renamed from: s, reason: collision with root package name */
        public Y41.p f29706s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ Object f29707t;

        /* renamed from: v, reason: collision with root package name */
        public int f29709v;

        public d(Continuation<? super d> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            this.f29707t = obj;
            this.f29709v |= BeduinInputModel.MIN_TEXT_VERSION;
            return y0.this.e(null, null, this);
        }
    }

    static {
        new c(null);
        androidx.compose.runtime.saveable.b.a(b.f29703l, a.f29702l);
    }

    public y0(@Y61.k int[] iArr, @Y61.k int[] iArr2) {
        this.f29682c = new p0(iArr, iArr2, new C0(2, this, y0.class, "fillNearestIndices", "fillNearestIndices(II)[I", 0));
        this.f29683d = C22126m3.f(C20772j0.f29642a, C22126m3.h());
        this.f29684e = new Y();
        Boolean bool = Boolean.FALSE;
        this.f29685f = C22126m3.g(bool);
        this.f29686g = C22126m3.g(bool);
        new A0(this);
        this.f29688i = new C20713d();
        this.f29689j = new C20725j();
        this.f29690k = true;
        this.f29691l = new C20714d0(null, null, 2, null);
        this.f29692m = W1.a(new E0(this));
        this.f29694o = -1;
        this.f29695p = new LinkedHashMap();
        this.f29696q = androidx.compose.foundation.interaction.l.a();
        this.f29697r = new C20712c0();
        this.f29698s = new LazyLayoutItemAnimator<>();
        this.f29699t = androidx.compose.foundation.lazy.layout.F0.a();
        this.f29700u = androidx.compose.foundation.lazy.layout.F0.a();
        this.f29701v = new C20718f0();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean a() {
        return this.f29692m.a();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean b() {
        return ((Boolean) ((C22082i3) this.f29685f).getF42167b()).booleanValue();
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final float c(float f12) {
        return this.f29692m.c(f12);
    }

    @Override // androidx.compose.foundation.gestures.U1
    public final boolean d() {
        return ((Boolean) ((C22082i3) this.f29686g).getF42167b()).booleanValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    @Override // androidx.compose.foundation.gestures.U1
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object e(@Y61.k androidx.compose.foundation.MutatePriority r6, @Y61.k Y41.p<? super androidx.compose.foundation.gestures.G1, ? super kotlin.coroutines.Continuation<? super kotlin.G0>, ? extends java.lang.Object> r7, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r8) {
        /*
            r5 = this;
            boolean r0 = r8 instanceof androidx.compose.foundation.lazy.staggeredgrid.y0.d
            if (r0 == 0) goto L13
            r0 = r8
            androidx.compose.foundation.lazy.staggeredgrid.y0$d r0 = (androidx.compose.foundation.lazy.staggeredgrid.y0.d) r0
            int r1 = r0.f29709v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f29709v = r1
            goto L18
        L13:
            androidx.compose.foundation.lazy.staggeredgrid.y0$d r0 = new androidx.compose.foundation.lazy.staggeredgrid.y0$d
            r0.<init>(r8)
        L18:
            java.lang.Object r8 = r0.f29707t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f29709v
            r3 = 2
            r4 = 1
            if (r2 == 0) goto L41
            if (r2 == r4) goto L34
            if (r2 != r3) goto L2c
            kotlin.C42729a0.b(r8)
            goto L68
        L2c:
            java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
            java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
            r6.<init>(r7)
            throw r6
        L34:
            Y41.p r6 = r0.f29706s
            r7 = r6
            Y41.p r7 = (Y41.p) r7
            androidx.compose.foundation.MutatePriority r6 = r0.f29705r
            androidx.compose.foundation.lazy.staggeredgrid.y0 r2 = r0.f29704q
            kotlin.C42729a0.b(r8)
            goto L56
        L41:
            kotlin.C42729a0.b(r8)
            r0.f29704q = r5
            r0.f29705r = r6
            r0.f29706s = r7
            r0.f29709v = r4
            androidx.compose.foundation.lazy.layout.d r8 = r5.f29688i
            java.lang.Object r8 = r8.a(r0)
            if (r8 != r1) goto L55
            return r1
        L55:
            r2 = r5
        L56:
            androidx.compose.foundation.gestures.U1 r8 = r2.f29692m
            r2 = 0
            r0.f29704q = r2
            r0.f29705r = r2
            r0.f29706s = r2
            r0.f29709v = r3
            java.lang.Object r6 = r8.e(r6, r7, r0)
            if (r6 != r1) goto L68
            return r1
        L68:
            kotlin.G0 r6 = kotlin.G0.f406611a
            return r6
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.lazy.staggeredgrid.y0.e(androidx.compose.foundation.MutatePriority, Y41.p, kotlin.coroutines.Continuation):java.lang.Object");
    }

    @Y61.k
    public final InterfaceC20754a0 f() {
        return (InterfaceC20754a0) ((C22082i3) this.f29683d).getF42167b();
    }

    public final void g(float f12, C20770i0 c20770i0) {
        LinkedHashMap linkedHashMap;
        long jD2;
        if (!this.f29690k || c20770i0.f29633m.isEmpty()) {
            return;
        }
        int i12 = 0;
        boolean z12 = f12 < 0.0f;
        List<l0> list = c20770i0.f29633m;
        int iD2 = z12 ? ((l0) C42745f0.Q(list)).f29645a : ((l0) C42745f0.E(list)).f29645a;
        if (iD2 == this.f29694o) {
            return;
        }
        this.f29694o = iD2;
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        w0 w0Var = c20770i0.f29629i;
        int length = w0Var.f29677b.length;
        while (true) {
            linkedHashMap = this.f29695p;
            if (i12 >= length) {
                break;
            }
            Y y12 = this.f29684e;
            if (z12) {
                iD2++;
                int length2 = y12.f29582a + y12.f29583b.length;
                while (true) {
                    if (iD2 >= length2) {
                        iD2 = y12.f29582a + y12.f29583b.length;
                        break;
                    } else if (y12.a(iD2, i12)) {
                        break;
                    } else {
                        iD2++;
                    }
                }
            } else {
                iD2 = y12.d(iD2, i12);
            }
            if (iD2 < 0 || iD2 >= c20770i0.f29632l || linkedHashSet.contains(Integer.valueOf(iD2))) {
                break;
            }
            linkedHashSet.add(Integer.valueOf(iD2));
            if (!linkedHashMap.containsKey(Integer.valueOf(iD2))) {
                c20770i0.f29630j.a(iD2);
                int i13 = w0Var.f29677b[i12];
                if (c20770i0.f29641u == Orientation.f27425b) {
                    C22712b.f42842b.getClass();
                    jD2 = C22712b.a.e(i13);
                } else {
                    C22712b.f42842b.getClass();
                    jD2 = C22712b.a.d(i13);
                }
                linkedHashMap.put(Integer.valueOf(iD2), this.f29691l.a(iD2, jD2));
            }
            i12++;
        }
        Iterator it = linkedHashMap.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry entry = (Map.Entry) it.next();
            if (!linkedHashSet.contains(entry.getKey())) {
                ((C20714d0.b) entry.getValue()).cancel();
                it.remove();
            }
        }
    }

    public /* synthetic */ y0(int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 1) != 0 ? 0 : i12, (i14 & 2) != 0 ? 0 : i13);
    }

    public y0(int i12, int i13) {
        this(new int[]{i12}, new int[]{i13});
    }
}
