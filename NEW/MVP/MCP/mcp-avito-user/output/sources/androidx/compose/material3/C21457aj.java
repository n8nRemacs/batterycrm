package androidx.compose.material3;

import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.layout.InterfaceC22391w;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;

/* compiled from: TextFieldImpl.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"material3_release"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.compose.material3.aj, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21457aj {

    /* renamed from: a, reason: collision with root package name */
    public static final long f36049a = C22713c.a(0, 0, 0, 0);

    /* renamed from: b, reason: collision with root package name */
    public static final float f36050b;

    /* renamed from: c, reason: collision with root package name */
    public static final float f36051c;

    /* renamed from: d, reason: collision with root package name */
    public static final float f36052d;

    /* renamed from: e, reason: collision with root package name */
    public static final float f36053e;

    /* renamed from: f, reason: collision with root package name */
    public static final float f36054f;

    /* renamed from: g, reason: collision with root package name */
    public static final float f36055g;

    /* renamed from: h, reason: collision with root package name */
    public static final float f36056h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.ui.v f36057i;

    /* compiled from: TextFieldImpl.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.compose.material3.aj$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f36058l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.x0 f36059m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36060n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ int f36061o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(long j12, androidx.compose.ui.text.x0 x0Var, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, int i12, int i13) {
            super(2);
            this.f36058l = j12;
            this.f36059m = x0Var;
            this.f36060n = pVar;
            this.f36061o = i13;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            long j12 = this.f36058l;
            int i12 = this.f36061o;
            C21457aj.b(j12, this.f36059m, this.f36060n, a12, iA2, i12);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.aj$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ long f36062l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> f36063m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(long j12, Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar) {
            super(2);
            this.f36062l = j12;
            this.f36063m = pVar;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 3) == 2 && a13.c()) {
                a13.f();
            } else {
                androidx.compose.runtime.S.a(L3.f35042a.b(androidx.compose.ui.graphics.T.a(this.f36062l)), this.f36063m, a13, 8);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: TextFieldImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/semantics/F;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/semantics/F;)V", "<anonymous>"}, k = 3, mv = {1, 8, 0})
    /* renamed from: androidx.compose.material3.aj$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.semantics.F, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f36064l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(String str) {
            super(1);
            this.f36064l = str;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.semantics.F f12) {
            kotlin.reflect.n<Object>[] nVarArr = androidx.compose.ui.semantics.C.f41719a;
            androidx.compose.ui.semantics.y.f41820a.getClass();
            f12.a(androidx.compose.ui.semantics.y.f41816K, this.f36064l);
            return kotlin.G0.f406611a;
        }
    }

    static {
        float f12 = 16;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f36050b = f12;
        f36051c = 12;
        f36052d = 4;
        f36053e = 2;
        f36054f = 24;
        f36055g = f12;
        f36056h = f12;
        float f13 = 48;
        f36057i = C20588k2.a(androidx.compose.ui.v.f42878y1, f13, f13);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:147:0x01ca  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.material3.TextFieldType r37, @Y61.k java.lang.String r38, @Y61.k Y41.p r39, @Y61.k androidx.compose.ui.text.input.k0 r40, @Y61.l Y41.p r41, @Y61.l Y41.p r42, @Y61.l Y41.p r43, @Y61.l Y41.p r44, @Y61.l Y41.p r45, @Y61.l Y41.p r46, @Y61.l Y41.p r47, boolean r48, boolean r49, boolean r50, @Y61.k androidx.compose.foundation.interaction.k r51, @Y61.k androidx.compose.foundation.layout.T1 r52, @Y61.k androidx.compose.material3.C21935vi r53, @Y61.k Y41.p r54, @Y61.l androidx.compose.runtime.A r55, int r56, int r57) {
        /*
            Method dump skipped, instructions count: 849
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.C21457aj.a(androidx.compose.material3.TextFieldType, java.lang.String, Y41.p, androidx.compose.ui.text.input.k0, Y41.p, Y41.p, Y41.p, Y41.p, Y41.p, Y41.p, Y41.p, boolean, boolean, boolean, androidx.compose.foundation.interaction.k, androidx.compose.foundation.layout.T1, androidx.compose.material3.vi, Y41.p, androidx.compose.runtime.A, int, int):void");
    }

    @InterfaceC22132o
    @InterfaceC22137p
    public static final void b(long j12, @Y61.l androidx.compose.ui.text.x0 x0Var, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar, @Y61.l androidx.compose.runtime.A a12, int i12, int i13) {
        androidx.compose.ui.text.x0 x0Var2;
        int i14;
        androidx.compose.ui.text.x0 x0Var3;
        androidx.compose.runtime.B bE2 = a12.E(-1520066345);
        int i15 = i12 | (bE2.n(j12) ? 4 : 2);
        int i16 = i13 & 2;
        if (i16 != 0) {
            i14 = i15 | 48;
            x0Var2 = x0Var;
        } else {
            x0Var2 = x0Var;
            i14 = i15 | (bE2.B(x0Var) ? 32 : 16);
        }
        int i17 = i14 | (bE2.u(pVar) ? 256 : 128);
        if ((i17 & 147) == 146 && bE2.c()) {
            bE2.f();
            x0Var3 = x0Var2;
        } else {
            androidx.compose.ui.text.x0 x0Var4 = i16 != 0 ? null : x0Var2;
            C22096n c22096nB = androidx.compose.runtime.internal.r.b(bE2, 1449369305, new b(j12, pVar));
            if (x0Var4 != null) {
                bE2.I(1830467586);
                Vc.a(j12, x0Var4, pVar, bE2, i17 & 1022);
                bE2.X(false);
            } else {
                bE2.I(1830467667);
                c22096nB.invoke(bE2, 6);
                bE2.X(false);
            }
            x0Var3 = x0Var4;
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(j12, x0Var3, pVar, i12, i13);
        }
    }

    @Y61.k
    public static final androidx.compose.ui.v c(@Y61.k androidx.compose.ui.v vVar, boolean z12, @Y61.k String str) {
        return z12 ? androidx.compose.ui.semantics.r.b(vVar, false, new c(str)) : vVar;
    }

    @Y61.l
    public static final Object d(@Y61.k InterfaceC22391w interfaceC22391w) {
        Object f40847t = interfaceC22391w.getF40763y();
        androidx.compose.ui.layout.E e12 = f40847t instanceof androidx.compose.ui.layout.E ? (androidx.compose.ui.layout.E) f40847t : null;
        if (e12 != null) {
            return e12.getF40328p();
        }
        return null;
    }

    public static final int e(@Y61.l androidx.compose.ui.layout.K0 k02) {
        if (k02 != null) {
            return k02.f40346c;
        }
        return 0;
    }

    public static final int f(@Y61.l androidx.compose.ui.layout.K0 k02) {
        if (k02 != null) {
            return k02.f40345b;
        }
        return 0;
    }
}
