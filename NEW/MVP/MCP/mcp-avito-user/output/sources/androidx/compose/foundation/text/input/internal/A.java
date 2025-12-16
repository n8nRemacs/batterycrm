package androidx.compose.foundation.text.input.internal;

import androidx.compose.foundation.text.C20862e2;
import androidx.compose.foundation.text.C20985q1;
import androidx.compose.foundation.text.HandleState;
import androidx.compose.foundation.text.selection.C21011f1;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.autofill.t;
import androidx.compose.ui.node.AbstractC22425n;
import androidx.compose.ui.platform.InterfaceC22489j2;
import androidx.compose.ui.semantics.C22553a;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.text.input.C22636b;
import androidx.compose.ui.text.input.C22642h;
import androidx.compose.ui.text.input.C22648n;
import androidx.compose.ui.text.input.C22651q;
import androidx.compose.ui.text.input.C22654u;
import androidx.compose.ui.text.input.C22655v;
import androidx.compose.ui.text.v0;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43066x;

/* compiled from: CoreTextFieldSemanticsModifier.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/foundation/text/input/internal/A;", "Landroidx/compose/ui/node/n;", "Landroidx/compose/ui/node/T0;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class A extends AbstractC22425n implements androidx.compose.ui.node.T0 {

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.focus.S f30763A;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.text.input.j0 f30764r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.text.input.W f30765s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public C20985q1 f30766t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f30767u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f30768v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f30769w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.text.input.L f30770x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public C21011f1 f30771y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public C22655v f30772z;

    /* compiled from: CoreTextFieldSemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            A.this.f30771y.f();
            return Boolean.TRUE;
        }
    }

    /* compiled from: CoreTextFieldSemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            A.this.f30771y.o();
            return Boolean.TRUE;
        }
    }

    /* compiled from: CoreTextFieldSemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "text", "", "invoke", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<C22602e, Boolean> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(C22602e c22602e) {
            A a12 = A.this;
            InterfaceC22204y1 interfaceC22204y1 = a12.f30766t.f31797t;
            Boolean bool = Boolean.TRUE;
            ((C22082i3) interfaceC22204y1).setValue(bool);
            ((C22082i3) a12.f30766t.f31796s).setValue(bool);
            A.n2(a12, a12.f30766t, c22602e.f42127c, a12.f30767u, a12.f30768v);
            return bool;
        }
    }

    /* compiled from: CoreTextFieldSemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Landroidx/compose/ui/text/o0;", "it", "", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<List<androidx.compose.ui.text.o0>, Boolean> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(List<androidx.compose.ui.text.o0> list) {
            boolean z12;
            List<androidx.compose.ui.text.o0> list2 = list;
            A a12 = A.this;
            if (a12.f30766t.d() != null) {
                list2.add(a12.f30766t.d().f30513a);
                z12 = true;
            } else {
                z12 = false;
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: CoreTextFieldSemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "text", "", "invoke", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<C22602e, Boolean> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final Boolean invoke(C22602e c22602e) {
            A a12 = A.this;
            A.n2(a12, a12.f30766t, c22602e.f42127c, a12.f30767u, a12.f30768v);
            return Boolean.TRUE;
        }
    }

    /* compiled from: CoreTextFieldSemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/e;", "text", "", "invoke", "(Landroidx/compose/ui/text/e;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<C22602e, Boolean> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.semantics.F f30779m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(androidx.compose.ui.semantics.F f12) {
            super(1);
            this.f30779m = f12;
        }

        @Override // Y41.l
        public final Boolean invoke(C22602e c22602e) {
            kotlin.G0 g02;
            C22602e c22602e2 = c22602e;
            A a12 = A.this;
            if (a12.f30767u || !a12.f30768v) {
                return Boolean.FALSE;
            }
            androidx.compose.ui.text.input.i0 i0Var = a12.f30766t.f31782e;
            if (i0Var != null) {
                C20862e2.a aVar = C20862e2.f30700a;
                List listU = C42745f0.U(new C22651q(), new C22636b(c22602e2, 1));
                C20985q1 c20985q1 = a12.f30766t;
                C22648n c22648n = c20985q1.f31781d;
                Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> lVar = c20985q1.f31799v;
                aVar.getClass();
                C20862e2.a.c(listU, c22648n, lVar, i0Var);
                g02 = kotlin.G0.f406611a;
            } else {
                g02 = null;
            }
            if (g02 == null) {
                androidx.compose.ui.text.input.W w12 = a12.f30765s;
                String str = w12.f42383a.f42127c;
                v0.a aVar2 = androidx.compose.ui.text.v0.f42734b;
                long j12 = w12.f42384b;
                String string = C43066x.d0(str, (int) (j12 >> 32), (int) (j12 & 4294967295L), c22602e2).toString();
                int length = c22602e2.f42127c.length() + ((int) (a12.f30765s.f42384b >> 32));
                a12.f30766t.f31799v.invoke(new androidx.compose.ui.text.input.W(string, androidx.compose.ui.text.w0.a(length, length), (androidx.compose.ui.text.v0) null, 4, (C42822w) null));
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: CoreTextFieldSemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"<anonymous>", "", "selectionStart", "", "selectionEnd", "relativeToOriginalText", "invoke", "(IIZ)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g extends kotlin.jvm.internal.N implements Y41.q<Integer, Integer, Boolean, Boolean> {
        public g() {
            super(3);
        }

        @Override // Y41.q
        public final Boolean invoke(Integer num, Integer num2, Boolean bool) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            boolean zBooleanValue = bool.booleanValue();
            A a12 = A.this;
            if (!zBooleanValue) {
                iIntValue = a12.f30770x.a(iIntValue);
            }
            if (!zBooleanValue) {
                iIntValue2 = a12.f30770x.a(iIntValue2);
            }
            boolean z12 = false;
            if (a12.f30768v) {
                long j12 = a12.f30765s.f42384b;
                v0.a aVar = androidx.compose.ui.text.v0.f42734b;
                if (iIntValue != ((int) (j12 >> 32)) || iIntValue2 != ((int) (j12 & 4294967295L))) {
                    if (Math.min(iIntValue, iIntValue2) < 0 || Math.max(iIntValue, iIntValue2) > a12.f30765s.f42383a.f42127c.length()) {
                        C21011f1 c21011f1 = a12.f30771y;
                        c21011f1.u(false);
                        c21011f1.r(HandleState.f30333b);
                    } else {
                        if (zBooleanValue || iIntValue == iIntValue2) {
                            C21011f1 c21011f12 = a12.f30771y;
                            c21011f12.u(false);
                            c21011f12.r(HandleState.f30333b);
                        } else {
                            a12.f30771y.h(true);
                        }
                        a12.f30766t.f31799v.invoke(new androidx.compose.ui.text.input.W(a12.f30765s.f42383a, androidx.compose.ui.text.w0.a(iIntValue, iIntValue2), (androidx.compose.ui.text.v0) null, 4, (C42822w) null));
                        z12 = true;
                    }
                }
            }
            return Boolean.valueOf(z12);
        }
    }

    /* compiled from: CoreTextFieldSemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            A a12 = A.this;
            a12.f30766t.f31800w.invoke(C22654u.a(a12.f30772z.f42483e));
            return Boolean.TRUE;
        }
    }

    /* compiled from: CoreTextFieldSemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            InterfaceC22489j2 interfaceC22489j2;
            A a12 = A.this;
            C20985q1 c20985q1 = a12.f30766t;
            androidx.compose.ui.focus.S s5 = a12.f30763A;
            boolean z12 = a12.f30767u;
            if (!c20985q1.b()) {
                androidx.compose.ui.focus.S.c(s5);
            } else if (!z12 && (interfaceC22489j2 = c20985q1.f31780c) != null) {
                interfaceC22489j2.show();
            }
            return Boolean.TRUE;
        }
    }

    /* compiled from: CoreTextFieldSemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            A.this.f30771y.h(true);
            return Boolean.TRUE;
        }
    }

    /* compiled from: CoreTextFieldSemanticsModifier.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<Boolean> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Boolean invoke() {
            A.this.f30771y.d(true);
            return Boolean.TRUE;
        }
    }

    public static final void n2(A a12, C20985q1 c20985q1, String str, boolean z12, boolean z13) {
        kotlin.G0 g02;
        a12.getClass();
        if (z12 || !z13) {
            return;
        }
        androidx.compose.ui.text.input.i0 i0Var = c20985q1.f31782e;
        Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> lVar = c20985q1.f31799v;
        if (i0Var != null) {
            C20862e2.a aVar = C20862e2.f30700a;
            List listU = C42745f0.U(new C22642h(), new C22636b(str, 1));
            aVar.getClass();
            C20862e2.a.c(listU, c20985q1.f31781d, lVar, i0Var);
            g02 = kotlin.G0.f406611a;
        } else {
            g02 = null;
        }
        if (g02 == null) {
            int length = str.length();
            lVar.invoke(new androidx.compose.ui.text.input.W(str, androidx.compose.ui.text.w0.a(length, length), (androidx.compose.ui.text.v0) null, 4, (C42822w) null));
        }
    }

    @Override // androidx.compose.ui.node.T0
    public final void O(@Y61.k androidx.compose.ui.semantics.F f12) {
        C22602e c22602e = this.f30765s.f42383a;
        kotlin.reflect.n<Object>[] nVarArr = androidx.compose.ui.semantics.C.f41719a;
        androidx.compose.ui.semantics.y yVar = androidx.compose.ui.semantics.y.f41820a;
        yVar.getClass();
        androidx.compose.ui.semantics.E<C22602e> e12 = androidx.compose.ui.semantics.y.f41809D;
        kotlin.reflect.n<Object>[] nVarArr2 = androidx.compose.ui.semantics.C.f41719a;
        kotlin.reflect.n<Object> nVar = nVarArr2[16];
        e12.getClass();
        f12.a(e12, c22602e);
        C22602e c22602e2 = this.f30764r.f42449a;
        yVar.getClass();
        androidx.compose.ui.semantics.E<C22602e> e13 = androidx.compose.ui.semantics.y.f41810E;
        kotlin.reflect.n<Object> nVar2 = nVarArr2[17];
        e13.getClass();
        f12.a(e13, c22602e2);
        long j12 = this.f30765s.f42384b;
        yVar.getClass();
        androidx.compose.ui.semantics.E<androidx.compose.ui.text.v0> e14 = androidx.compose.ui.semantics.y.f41811F;
        kotlin.reflect.n<Object> nVar3 = nVarArr2[18];
        androidx.compose.ui.text.v0 v0VarA = androidx.compose.ui.text.v0.a(j12);
        e14.getClass();
        f12.a(e14, v0VarA);
        androidx.compose.ui.autofill.t.f38898a.getClass();
        androidx.compose.ui.autofill.t tVar = t.a.f38900b;
        yVar.getClass();
        androidx.compose.ui.semantics.E<androidx.compose.ui.autofill.t> e15 = androidx.compose.ui.semantics.y.f41837r;
        kotlin.reflect.n<Object> nVar4 = nVarArr2[8];
        e15.getClass();
        f12.a(e15, tVar);
        c cVar = new c();
        androidx.compose.ui.semantics.k kVar = androidx.compose.ui.semantics.k.f41760a;
        kVar.getClass();
        f12.a(androidx.compose.ui.semantics.k.f41767h, new C22553a(null, cVar));
        if (!this.f30768v) {
            androidx.compose.ui.semantics.C.c(f12);
        }
        boolean z12 = this.f30769w;
        if (z12) {
            yVar.getClass();
            f12.a(androidx.compose.ui.semantics.y.f41815J, kotlin.G0.f406611a);
        }
        boolean z13 = this.f30768v && !this.f30767u;
        yVar.getClass();
        androidx.compose.ui.semantics.E<Boolean> e16 = androidx.compose.ui.semantics.y.f41818M;
        kotlin.reflect.n<Object> nVar5 = nVarArr2[24];
        Boolean boolValueOf = Boolean.valueOf(z13);
        e16.getClass();
        f12.a(e16, boolValueOf);
        androidx.compose.ui.semantics.C.f(f12, new d());
        if (z13) {
            e eVar = new e();
            kVar.getClass();
            f12.a(androidx.compose.ui.semantics.k.f41770k, new C22553a(null, eVar));
            f fVar = new f(f12);
            kVar.getClass();
            f12.a(androidx.compose.ui.semantics.k.f41774o, new C22553a(null, fVar));
        }
        g gVar = new g();
        kVar.getClass();
        f12.a(androidx.compose.ui.semantics.k.f41769j, new C22553a(null, gVar));
        androidx.compose.ui.semantics.C.h(f12, this.f30772z.f42483e, new h());
        androidx.compose.ui.semantics.C.g(f12, new i());
        androidx.compose.ui.semantics.C.i(f12, null, new j());
        if (!androidx.compose.ui.text.v0.d(this.f30765s.f42384b) && !z12) {
            k kVar2 = new k();
            kVar.getClass();
            f12.a(androidx.compose.ui.semantics.k.f41776q, new C22553a(null, kVar2));
            if (this.f30768v && !this.f30767u) {
                a aVar = new a();
                kVar.getClass();
                f12.a(androidx.compose.ui.semantics.k.f41777r, new C22553a(null, aVar));
            }
        }
        if (!this.f30768v || this.f30767u) {
            return;
        }
        b bVar = new b();
        kVar.getClass();
        f12.a(androidx.compose.ui.semantics.k.f41778s, new C22553a(null, bVar));
    }

    @Override // androidx.compose.ui.node.T0
    /* renamed from: x1 */
    public final boolean getF41731p() {
        return true;
    }
}
