package androidx.compose.foundation.text.input.internal;

import android.icu.text.DecimalFormatSymbols;
import android.os.Build;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22116k3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.C22176v;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.E;
import androidx.compose.ui.unit.C22712b;
import androidx.compose.ui.unit.C22713c;
import androidx.compose.ui.unit.LayoutDirection;
import java.util.List;
import java.util.Locale;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: TextFieldLayoutStateCache.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0000\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u0003:\u0003\u0006\u0007\bB\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\t"}, d2 = {"Landroidx/compose/foundation/text/input/internal/k1;", "Landroidx/compose/runtime/I3;", "Landroidx/compose/ui/text/o0;", "Landroidx/compose/runtime/snapshots/V;", "<init>", "()V", "a", "b", "c", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class k1 implements I3<androidx.compose.ui.text.o0>, androidx.compose.runtime.snapshots.V {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31133b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f31134c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.text.q0 f31135d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public a f31136e;

    /* compiled from: TextFieldLayoutStateCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0002\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/k1$a;", "Landroidx/compose/runtime/snapshots/X;", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends androidx.compose.runtime.snapshots.X {

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public androidx.compose.foundation.text.input.l f31137c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public List<C22602e.C1684e<C22602e.a>> f31138d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public androidx.compose.ui.text.v0 f31139e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public androidx.compose.ui.text.x0 f31140f;

        /* renamed from: g, reason: collision with root package name */
        public boolean f31141g;

        /* renamed from: h, reason: collision with root package name */
        public boolean f31142h;

        /* renamed from: k, reason: collision with root package name */
        @Y61.l
        public LayoutDirection f31145k;

        /* renamed from: l, reason: collision with root package name */
        @Y61.l
        public E.b f31146l;

        /* renamed from: n, reason: collision with root package name */
        @Y61.l
        public androidx.compose.ui.text.o0 f31148n;

        /* renamed from: i, reason: collision with root package name */
        public float f31143i = Float.NaN;

        /* renamed from: j, reason: collision with root package name */
        public float f31144j = Float.NaN;

        /* renamed from: m, reason: collision with root package name */
        public long f31147m = C22713c.b(0, 0, 15);

        @Override // androidx.compose.runtime.snapshots.X
        public final void a(@Y61.k androidx.compose.runtime.snapshots.X x12) {
            a aVar = (a) x12;
            this.f31137c = aVar.f31137c;
            this.f31138d = aVar.f31138d;
            this.f31139e = aVar.f31139e;
            this.f31140f = aVar.f31140f;
            this.f31141g = aVar.f31141g;
            this.f31142h = aVar.f31142h;
            this.f31143i = aVar.f31143i;
            this.f31144j = aVar.f31144j;
            this.f31145k = aVar.f31145k;
            this.f31146l = aVar.f31146l;
            this.f31147m = aVar.f31147m;
            this.f31148n = aVar.f31148n;
        }

        @Override // androidx.compose.runtime.snapshots.X
        @Y61.k
        public final androidx.compose.runtime.snapshots.X b() {
            return new a();
        }

        @Y61.k
        public final String toString() {
            return "CacheRecord(visualText=" + ((Object) this.f31137c) + ", composingAnnotations=" + this.f31138d + ", composition=" + this.f31139e + ", textStyle=" + this.f31140f + ", singleLine=" + this.f31141g + ", softWrap=" + this.f31142h + ", densityValue=" + this.f31143i + ", fontScale=" + this.f31144j + ", layoutDirection=" + this.f31145k + ", fontFamilyResolver=" + this.f31146l + ", constraints=" + ((Object) C22712b.n(this.f31147m)) + ", layoutResult=" + this.f31148n + ')';
        }
    }

    /* compiled from: TextFieldLayoutStateCache.kt */
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0002\u0018\u00002\u00020\u0001:\u0001\fB'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Landroidx/compose/foundation/text/input/internal/k1$b;", "", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/unit/LayoutDirection;", "layoutDirection", "Landroidx/compose/ui/text/font/E$b;", "fontFamilyResolver", "Landroidx/compose/ui/unit/b;", "constraints", "<init>", "(Landroidx/compose/ui/unit/d;Landroidx/compose/ui/unit/LayoutDirection;Landroidx/compose/ui/text/font/E$b;JLkotlin/jvm/internal/w;)V", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final C1618b f31149g = new C1618b(null);

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public static final a f31150h = new a();

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final androidx.compose.ui.unit.d f31151a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final LayoutDirection f31152b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final E.b f31153c;

        /* renamed from: d, reason: collision with root package name */
        public final long f31154d;

        /* renamed from: e, reason: collision with root package name */
        public final float f31155e;

        /* renamed from: f, reason: collision with root package name */
        public final float f31156f;

        /* compiled from: TextFieldLayoutStateCache.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/foundation/text/input/internal/k1$b$a", "Landroidx/compose/runtime/k3;", "Landroidx/compose/foundation/text/input/internal/k1$b;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC22116k3<b> {
            @Override // androidx.compose.runtime.InterfaceC22116k3
            public final boolean a(b bVar, b bVar2) {
                b bVar3 = bVar;
                b bVar4 = bVar2;
                if (bVar3 == null || bVar4 == null) {
                    if ((bVar3 == null) ^ (bVar4 == null)) {
                        return false;
                    }
                } else if (bVar3.f31155e != bVar4.f31155e || bVar3.f31156f != bVar4.f31156f || bVar3.f31152b != bVar4.f31152b || !kotlin.jvm.internal.L.f(bVar3.f31153c, bVar4.f31153c) || !C22712b.d(bVar3.f31154d, bVar4.f31154d)) {
                    return false;
                }
                return true;
            }
        }

        /* compiled from: TextFieldLayoutStateCache.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/k1$b$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: androidx.compose.foundation.text.input.internal.k1$b$b, reason: collision with other inner class name */
        public static final class C1618b {
            public /* synthetic */ C1618b(C42822w c42822w) {
                this();
            }

            public C1618b() {
            }
        }

        public b(androidx.compose.ui.unit.d dVar, LayoutDirection layoutDirection, E.b bVar, long j12, C42822w c42822w) {
            this.f31151a = dVar;
            this.f31152b = layoutDirection;
            this.f31153c = bVar;
            this.f31154d = j12;
            this.f31155e = dVar.getF40389c();
            this.f31156f = dVar.getF40390d();
        }

        @Y61.k
        public final String toString() {
            return "MeasureInputs(density=" + this.f31151a + ", densityValue=" + this.f31155e + ", fontScale=" + this.f31156f + ", layoutDirection=" + this.f31152b + ", fontFamilyResolver=" + this.f31153c + ", constraints=" + ((Object) C22712b.n(this.f31154d)) + ')';
        }
    }

    /* compiled from: TextFieldLayoutStateCache.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/k1$c;", "", "b", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public static final b f31157f = new b(null);

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public static final a f31158g = new a();

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final t1 f31159a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final androidx.compose.ui.text.x0 f31160b;

        /* renamed from: c, reason: collision with root package name */
        public final boolean f31161c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f31162d;

        /* renamed from: e, reason: collision with root package name */
        public final boolean f31163e;

        /* compiled from: TextFieldLayoutStateCache.kt */
        @Metadata(d1 = {"\u0000\u000f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0001¨\u0006\u0003"}, d2 = {"androidx/compose/foundation/text/input/internal/k1$c$a", "Landroidx/compose/runtime/k3;", "Landroidx/compose/foundation/text/input/internal/k1$c;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC22116k3<c> {
            @Override // androidx.compose.runtime.InterfaceC22116k3
            public final boolean a(c cVar, c cVar2) {
                c cVar3 = cVar;
                c cVar4 = cVar2;
                if (cVar3 == null || cVar4 == null) {
                    if ((cVar3 == null) ^ (cVar4 == null)) {
                        return false;
                    }
                } else if (cVar3.f31159a != cVar4.f31159a || !kotlin.jvm.internal.L.f(cVar3.f31160b, cVar4.f31160b) || cVar3.f31161c != cVar4.f31161c || cVar3.f31162d != cVar4.f31162d || cVar3.f31163e != cVar4.f31163e) {
                    return false;
                }
                return true;
            }
        }

        /* compiled from: TextFieldLayoutStateCache.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/text/input/internal/k1$c$b;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class b {
            public /* synthetic */ b(C42822w c42822w) {
                this();
            }

            public b() {
            }
        }

        public c(@Y61.k t1 t1Var, @Y61.k androidx.compose.ui.text.x0 x0Var, boolean z12, boolean z13, boolean z14) {
            this.f31159a = t1Var;
            this.f31160b = x0Var;
            this.f31161c = z12;
            this.f31162d = z13;
            this.f31163e = z14;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("NonMeasureInputs(textFieldState=");
            sb2.append(this.f31159a);
            sb2.append(", textStyle=");
            sb2.append(this.f31160b);
            sb2.append(", singleLine=");
            sb2.append(this.f31161c);
            sb2.append(", softWrap=");
            sb2.append(this.f31162d);
            sb2.append(", isKeyboardTypePhone=");
            return androidx.appcompat.app.r.x(sb2, this.f31163e, ')');
        }
    }

    public k1() {
        c.f31157f.getClass();
        this.f31133b = C22126m3.f(null, c.f31158g);
        b.f31149g.getClass();
        this.f31134c = C22126m3.f(null, b.f31150h);
        this.f31136e = new a();
    }

    @Override // androidx.compose.runtime.snapshots.V
    @Y61.k
    public final androidx.compose.runtime.snapshots.X d() {
        return this.f31136e;
    }

    @Override // androidx.compose.runtime.I3
    /* renamed from: getValue */
    public final androidx.compose.ui.text.o0 getF42167b() {
        b bVar;
        c cVar = (c) ((C22082i3) this.f31133b).getF42167b();
        if (cVar == null || (bVar = (b) ((C22082i3) this.f31134c).getF42167b()) == null) {
            return null;
        }
        return p(cVar, bVar);
    }

    @Override // androidx.compose.runtime.snapshots.V
    public final void j(@Y61.k androidx.compose.runtime.snapshots.X x12) {
        this.f31136e = (a) x12;
    }

    public final androidx.compose.ui.text.o0 p(c cVar, b bVar) {
        androidx.compose.ui.text.x0 x0VarG;
        z0.e eVar;
        byte directionality;
        int i12;
        androidx.compose.foundation.text.input.l lVar;
        androidx.compose.foundation.text.input.l lVarD = cVar.f31159a.d();
        a aVar = (a) C22176v.h(this.f31136e);
        androidx.compose.ui.text.o0 o0Var = aVar.f31148n;
        if (o0Var != null && (lVar = aVar.f31137c) != null && C43066x.t(lVar, lVarD) && kotlin.jvm.internal.L.f(aVar.f31138d, lVarD.f31510b) && kotlin.jvm.internal.L.f(aVar.f31139e, lVarD.f31513e) && aVar.f31141g == cVar.f31161c && aVar.f31142h == cVar.f31162d && aVar.f31145k == bVar.f31152b && aVar.f31143i == bVar.f31151a.getF40389c() && aVar.f31144j == bVar.f31151a.getF40390d() && C22712b.d(aVar.f31147m, bVar.f31154d) && kotlin.jvm.internal.L.f(aVar.f31146l, bVar.f31153c) && !o0Var.f42527b.f41916a.b()) {
            androidx.compose.ui.text.x0 x0Var = aVar.f31140f;
            boolean zF2 = x0Var != null ? x0Var.f(cVar.f31160b) : false;
            androidx.compose.ui.text.x0 x0Var2 = aVar.f31140f;
            boolean zE2 = x0Var2 != null ? x0Var2.e(cVar.f31160b) : false;
            if (zF2 && zE2) {
                return o0Var;
            }
            if (zF2) {
                androidx.compose.ui.text.n0 n0Var = o0Var.f42526a;
                return new androidx.compose.ui.text.o0(new androidx.compose.ui.text.n0(n0Var.f42506a, cVar.f31160b, n0Var.f42508c, n0Var.f42509d, n0Var.f42510e, n0Var.f42511f, n0Var.f42512g, n0Var.f42513h, n0Var.f42514i, n0Var.f42515j, (C42822w) null), o0Var.f42527b, o0Var.f42528c, null);
            }
        }
        androidx.compose.ui.text.q0 q0Var = this.f31135d;
        if (q0Var == null) {
            q0Var = new androidx.compose.ui.text.q0(bVar.f31153c, bVar.f31151a, bVar.f31152b, 1);
            this.f31135d = q0Var;
        }
        androidx.compose.ui.text.q0 q0Var2 = q0Var;
        boolean z12 = cVar.f31163e;
        androidx.compose.ui.text.x0 x0Var3 = cVar.f31160b;
        if (z12) {
            z0.f fVar = x0Var3.f42739a.localeList;
            if (fVar == null || (eVar = fVar.f443678b.get(0)) == null) {
                z0.e.f443674b.getClass();
                eVar = z0.h.f443680a.a().f443678b.get(0);
            }
            Locale locale = eVar.f443675a;
            if (Build.VERSION.SDK_INT >= 28) {
                M.f30858a.getClass();
                directionality = Character.getDirectionality(Character.codePointAt(DecimalFormatSymbols.getInstance(locale).getDigitStrings()[0], 0));
            } else {
                L.f30853a.getClass();
                directionality = Character.getDirectionality(DecimalFormatSymbols.getInstance(locale).getZeroDigit());
            }
            if (directionality == 1 || directionality == 2) {
                androidx.compose.ui.text.style.k.f42689b.getClass();
                i12 = androidx.compose.ui.text.style.k.f42691d;
            } else {
                androidx.compose.ui.text.style.k.f42689b.getClass();
                i12 = androidx.compose.ui.text.style.k.f42690c;
            }
            x0VarG = x0Var3.g(new androidx.compose.ui.text.x0(0L, 0L, (androidx.compose.ui.text.font.e0) null, (androidx.compose.ui.text.font.Z) null, (C22605a0) null, (androidx.compose.ui.text.font.E) null, (String) null, 0L, (androidx.compose.ui.text.style.a) null, (androidx.compose.ui.text.style.n) null, (z0.f) null, 0L, (androidx.compose.ui.text.style.j) null, (androidx.compose.ui.graphics.f1) null, (androidx.compose.ui.graphics.drawscope.j) null, 0, i12, 0L, (androidx.compose.ui.text.style.p) null, (androidx.compose.ui.text.Z) null, (androidx.compose.ui.text.style.h) null, 0, 0, (androidx.compose.ui.text.style.r) null, 16711679, (C42822w) null));
        } else {
            x0VarG = x0Var3;
        }
        String string = lVarD.f31511c.toString();
        List list = lVarD.f31510b;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        androidx.compose.ui.text.o0 o0VarB = androidx.compose.ui.text.q0.b(q0Var2, new C22602e(string, (List<? extends C22602e.C1684e<? extends C22602e.a>>) list), x0VarG, 0, cVar.f31162d, cVar.f31161c ? 1 : Integer.MAX_VALUE, bVar.f31154d, bVar.f31152b, bVar.f31151a, bVar.f31153c, 1060);
        if (!o0VarB.equals(o0Var)) {
            AbstractC22167l.f38720e.getClass();
            AbstractC22167l abstractC22167lJ = C22176v.j();
            if (!abstractC22167lJ.f()) {
                a aVar2 = this.f31136e;
                synchronized (C22176v.f38750c) {
                    a aVar3 = (a) C22176v.v(aVar2, this, abstractC22167lJ);
                    aVar3.f31137c = lVarD;
                    aVar3.f31138d = lVarD.f31510b;
                    aVar3.f31139e = lVarD.f31513e;
                    aVar3.f31141g = cVar.f31161c;
                    aVar3.f31142h = cVar.f31162d;
                    aVar3.f31140f = cVar.f31160b;
                    aVar3.f31145k = bVar.f31152b;
                    aVar3.f31143i = bVar.f31155e;
                    aVar3.f31144j = bVar.f31156f;
                    aVar3.f31147m = bVar.f31154d;
                    aVar3.f31146l = bVar.f31153c;
                    aVar3.f31148n = o0VarB;
                    kotlin.G0 g02 = kotlin.G0.f406611a;
                }
                C22176v.m(abstractC22167lJ, this);
            }
        }
        return o0VarB;
    }

    @Override // androidx.compose.runtime.snapshots.V
    @Y61.k
    public final androidx.compose.runtime.snapshots.X a(@Y61.k androidx.compose.runtime.snapshots.X x12, @Y61.k androidx.compose.runtime.snapshots.X x13, @Y61.k androidx.compose.runtime.snapshots.X x14) {
        return x14;
    }
}
