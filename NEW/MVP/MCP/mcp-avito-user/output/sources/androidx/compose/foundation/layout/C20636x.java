package androidx.compose.foundation.layout;

import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.layout.InterfaceC22363h0;
import androidx.compose.ui.layout.InterfaceC22365i0;
import androidx.compose.ui.layout.InterfaceC22367j0;
import androidx.compose.ui.layout.InterfaceC22369k0;
import androidx.compose.ui.layout.K0;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.l0;

/* compiled from: Box.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/layout/x;", "Landroidx/compose/ui/layout/i0;", "foundation-layout_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.layout.x, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final /* data */ class C20636x implements InterfaceC22365i0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22215f f28777a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f28778b;

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.x$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f28779l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(K0.a aVar) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Box.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.x$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0 f28780l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22363h0 f28781m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f28782n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f28783o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f28784p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C20636x f28785q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(androidx.compose.ui.layout.K0 k02, InterfaceC22363h0 interfaceC22363h0, InterfaceC22369k0 interfaceC22369k0, int i12, int i13, C20636x c20636x) {
            super(1);
            this.f28780l = k02;
            this.f28781m = interfaceC22363h0;
            this.f28782n = interfaceC22369k0;
            this.f28783o = i12;
            this.f28784p = i13;
            this.f28785q = c20636x;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            LayoutDirection f40449b = this.f28782n.getF40449b();
            InterfaceC22215f interfaceC22215f = this.f28785q.f28777a;
            C20632w.b(aVar, this.f28780l, this.f28781m, f40449b, this.f28783o, this.f28784p, interfaceC22215f);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: Box.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/layout/K0$a;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/layout/K0$a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.layout.x$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<K0.a, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.layout.K0[] f28786l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ List<InterfaceC22363h0> f28787m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22369k0 f28788n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ l0.f f28789o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ l0.f f28790p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ C20636x f28791q;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(androidx.compose.ui.layout.K0[] k0Arr, List<? extends InterfaceC22363h0> list, InterfaceC22369k0 interfaceC22369k0, l0.f fVar, l0.f fVar2, C20636x c20636x) {
            super(1);
            this.f28786l = k0Arr;
            this.f28787m = list;
            this.f28788n = interfaceC22369k0;
            this.f28789o = fVar;
            this.f28790p = fVar2;
            this.f28791q = c20636x;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(K0.a aVar) {
            K0.a aVar2 = aVar;
            androidx.compose.ui.layout.K0[] k0Arr = this.f28786l;
            int length = k0Arr.length;
            int i12 = 0;
            int i13 = 0;
            while (i13 < length) {
                C20632w.b(aVar2, k0Arr[i13], this.f28787m.get(i12), this.f28788n.getF40449b(), this.f28789o.f406840b, this.f28790p.f406840b, this.f28791q.f28777a);
                i13++;
                i12++;
            }
            return kotlin.G0.f406611a;
        }
    }

    public C20636x(@Y61.k InterfaceC22215f interfaceC22215f, boolean z12) {
        this.f28777a = interfaceC22215f;
        this.f28778b = z12;
    }

    @Override // androidx.compose.ui.layout.InterfaceC22365i0
    @Y61.k
    public final InterfaceC22367j0 b(@Y61.k InterfaceC22369k0 interfaceC22369k0, @Y61.k List<? extends InterfaceC22363h0> list, long j12) {
        long j13;
        int iL2;
        int iK2;
        androidx.compose.ui.layout.K0 k0I;
        if (list.isEmpty()) {
            return interfaceC22369k0.L0(C22712b.l(j12), C22712b.k(j12), kotlin.collections.P0.c(), a.f28779l);
        }
        if (this.f28778b) {
            j13 = j12;
        } else {
            j13 = j12 & (-8589934589L);
            C22712b.a aVar = C22712b.f42842b;
        }
        if (list.size() == 1) {
            InterfaceC22363h0 interfaceC22363h0 = list.get(0);
            androidx.collection.R0<InterfaceC22215f, InterfaceC22365i0> r02 = C20632w.f28763a;
            Object f40763y = interfaceC22363h0.getF40763y();
            C20628v c20628v = f40763y instanceof C20628v ? (C20628v) f40763y : null;
            if (c20628v != null ? c20628v.f28753q : false) {
                iL2 = C22712b.l(j12);
                iK2 = C22712b.k(j12);
                C22712b.a aVar2 = C22712b.f42842b;
                int iL3 = C22712b.l(j12);
                int iK3 = C22712b.k(j12);
                aVar2.getClass();
                k0I = interfaceC22363h0.I(C22712b.a.c(iL3, iK3));
            } else {
                k0I = interfaceC22363h0.I(j13);
                iL2 = Math.max(C22712b.l(j12), k0I.f40345b);
                iK2 = Math.max(C22712b.k(j12), k0I.f40346c);
            }
            int i12 = iL2;
            int i13 = iK2;
            return interfaceC22369k0.L0(i12, i13, kotlin.collections.P0.c(), new b(k0I, interfaceC22363h0, interfaceC22369k0, i12, i13, this));
        }
        androidx.compose.ui.layout.K0[] k0Arr = new androidx.compose.ui.layout.K0[list.size()];
        l0.f fVar = new l0.f();
        fVar.f406840b = C22712b.l(j12);
        l0.f fVar2 = new l0.f();
        fVar2.f406840b = C22712b.k(j12);
        List<? extends InterfaceC22363h0> list2 = list;
        int size = list2.size();
        boolean z12 = false;
        for (int i14 = 0; i14 < size; i14++) {
            InterfaceC22363h0 interfaceC22363h02 = list.get(i14);
            androidx.collection.R0<InterfaceC22215f, InterfaceC22365i0> r03 = C20632w.f28763a;
            Object f40763y2 = interfaceC22363h02.getF40763y();
            C20628v c20628v2 = f40763y2 instanceof C20628v ? (C20628v) f40763y2 : null;
            if (c20628v2 != null ? c20628v2.f28753q : false) {
                z12 = true;
            } else {
                androidx.compose.ui.layout.K0 k0I2 = interfaceC22363h02.I(j13);
                k0Arr[i14] = k0I2;
                fVar.f406840b = Math.max(fVar.f406840b, k0I2.f40345b);
                fVar2.f406840b = Math.max(fVar2.f406840b, k0I2.f40346c);
            }
        }
        if (z12) {
            int i15 = fVar.f406840b;
            int i16 = i15 != Integer.MAX_VALUE ? i15 : 0;
            int i17 = fVar2.f406840b;
            long jA2 = C22713c.a(i16, i15, i17 != Integer.MAX_VALUE ? i17 : 0, i17);
            int size2 = list2.size();
            for (int i18 = 0; i18 < size2; i18++) {
                InterfaceC22363h0 interfaceC22363h03 = list.get(i18);
                androidx.collection.R0<InterfaceC22215f, InterfaceC22365i0> r04 = C20632w.f28763a;
                Object f40763y3 = interfaceC22363h03.getF40763y();
                C20628v c20628v3 = f40763y3 instanceof C20628v ? (C20628v) f40763y3 : null;
                if (c20628v3 != null ? c20628v3.f28753q : false) {
                    k0Arr[i18] = interfaceC22363h03.I(jA2);
                }
            }
        }
        return interfaceC22369k0.L0(fVar.f406840b, fVar2.f406840b, kotlin.collections.P0.c(), new c(k0Arr, list, interfaceC22369k0, fVar, fVar2, this));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C20636x)) {
            return false;
        }
        C20636x c20636x = (C20636x) obj;
        return kotlin.jvm.internal.L.f(this.f28777a, c20636x.f28777a) && this.f28778b == c20636x.f28778b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f28778b) + (this.f28777a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BoxMeasurePolicy(alignment=");
        sb2.append(this.f28777a);
        sb2.append(", propagateMinConstraints=");
        return androidx.appcompat.app.r.x(sb2, this.f28778b, ')');
    }
}
