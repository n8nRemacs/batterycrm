package androidx.compose.foundation.text;

import androidx.compose.foundation.text.input.internal.selection.C20922g;
import androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState;
import androidx.compose.foundation.text.selection.InterfaceC21039u;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.C22602e;
import androidx.compose.ui.unit.h;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: BasicTextField.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002¨\u0006\b²\u0006\f\u0010\u0001\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0002\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\f\u0010\u0003\u001a\u00020\u00008\nX\u008a\u0084\u0002²\u0006\u000e\u0010\u0005\u001a\u00020\u00048\n@\nX\u008a\u008e\u0002²\u0006\u000e\u0010\u0007\u001a\u00020\u00068\n@\nX\u008a\u008e\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/g;", "cursorHandleState", "startHandleState", "endHandleState", "Landroidx/compose/ui/text/input/W;", "textFieldValueState", "", "lastTextValue", "foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.u, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21055u {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final androidx.compose.foundation.text.input.n f32180a = h.f32229a;

    /* renamed from: b, reason: collision with root package name */
    public static final long f32181b;

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.u$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.o0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f32182l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(androidx.compose.ui.text.o0 o0Var) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/W;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/input/W;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.input.W f32183l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> f32184m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(androidx.compose.ui.text.input.W w12, Y41.l<? super androidx.compose.ui.text.input.W, kotlin.G0> lVar) {
            super(1);
            this.f32183l = w12;
            this.f32184m = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.text.input.W w12) {
            androidx.compose.ui.text.input.W w13 = w12;
            if (!kotlin.jvm.internal.L.f(this.f32183l, w13)) {
                this.f32184m.invoke(w13);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.u$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Y41.q<Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0>, androidx.compose.runtime.A, Integer, kotlin.G0> f32185A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ int f32186B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ int f32187C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ int f32188D;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.input.W f32189l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> f32190m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f32191n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f32192o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f32193p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.x0 f32194q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20981p1 f32195r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C20973n1 f32196s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f32197t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f32198u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f32199v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.input.k0 f32200w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Y41.l<androidx.compose.ui.text.o0, kotlin.G0> f32201x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.interaction.m f32202y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.J f32203z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(androidx.compose.ui.text.input.W w12, Y41.l<? super androidx.compose.ui.text.input.W, kotlin.G0> lVar, androidx.compose.ui.v vVar, boolean z12, boolean z13, androidx.compose.ui.text.x0 x0Var, C20981p1 c20981p1, C20973n1 c20973n1, boolean z14, int i12, int i13, androidx.compose.ui.text.input.k0 k0Var, Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> lVar2, androidx.compose.foundation.interaction.m mVar, androidx.compose.ui.graphics.J j12, Y41.q<? super Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0>, ? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> qVar, int i14, int i15, int i16) {
            super(2);
            this.f32189l = w12;
            this.f32190m = lVar;
            this.f32191n = vVar;
            this.f32192o = z12;
            this.f32193p = z13;
            this.f32194q = x0Var;
            this.f32195r = c20981p1;
            this.f32196s = c20973n1;
            this.f32197t = z14;
            this.f32198u = i12;
            this.f32199v = i13;
            this.f32200w = k0Var;
            this.f32201x = lVar2;
            this.f32202y = mVar;
            this.f32203z = j12;
            this.f32185A = qVar;
            this.f32186B = i14;
            this.f32187C = i15;
            this.f32188D = i16;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f32186B | 1);
            int iA3 = C22066f2.a(this.f32187C);
            androidx.compose.foundation.interaction.m mVar = this.f32202y;
            int i12 = this.f32188D;
            C21055u.a(this.f32189l, this.f32190m, this.f32191n, this.f32192o, this.f32193p, this.f32194q, this.f32195r, this.f32196s, this.f32197t, this.f32198u, this.f32199v, this.f32200w, this.f32201x, mVar, this.f32203z, this.f32185A, a12, iA2, iA3, i12);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.u$d */
    public static final class d extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.o0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final d f32204l = new d();

        public d() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(androidx.compose.ui.text.o0 o0Var) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$e */
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.input.W f32205l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.text.input.W> f32206m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(androidx.compose.ui.text.input.W w12, InterfaceC22204y1<androidx.compose.ui.text.input.W> interfaceC22204y1) {
            super(0);
            this.f32205l = w12;
            this.f32206m = interfaceC22204y1;
        }

        /* JADX WARN: Removed duplicated region for block: B:6:0x0026  */
        @Override // Y41.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final kotlin.G0 invoke() {
            /*
                r6 = this;
                androidx.compose.ui.text.input.W r0 = r6.f32205l
                androidx.compose.foundation.text.input.n r1 = androidx.compose.foundation.text.C21055u.f32180a
                androidx.compose.runtime.y1<androidx.compose.ui.text.input.W> r1 = r6.f32206m
                java.lang.Object r2 = r1.getF42167b()
                androidx.compose.ui.text.input.W r2 = (androidx.compose.ui.text.input.W) r2
                long r2 = r2.f42384b
                long r4 = r0.f42384b
                boolean r2 = androidx.compose.ui.text.v0.c(r4, r2)
                if (r2 == 0) goto L26
                java.lang.Object r2 = r1.getF42167b()
                androidx.compose.ui.text.input.W r2 = (androidx.compose.ui.text.input.W) r2
                androidx.compose.ui.text.v0 r2 = r2.f42385c
                androidx.compose.ui.text.v0 r3 = r0.f42385c
                boolean r2 = kotlin.jvm.internal.L.f(r3, r2)
                if (r2 != 0) goto L29
            L26:
                r1.setValue(r0)
            L29:
                kotlin.G0 r0 = kotlin.G0.f406611a
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C21055u.e.invoke():java.lang.Object");
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/input/W;", "newTextFieldValueState", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/input/W;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$f */
    public static final class f extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.input.W, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, kotlin.G0> f32207l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.text.input.W> f32208m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<String> f32209n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public f(Y41.l<? super String, kotlin.G0> lVar, InterfaceC22204y1<androidx.compose.ui.text.input.W> interfaceC22204y1, InterfaceC22204y1<String> interfaceC22204y12) {
            super(1);
            this.f32207l = lVar;
            this.f32208m = interfaceC22204y1;
            this.f32209n = interfaceC22204y12;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.text.input.W w12) {
            androidx.compose.ui.text.input.W w13 = w12;
            androidx.compose.foundation.text.input.n nVar = C21055u.f32180a;
            this.f32208m.setValue(w13);
            InterfaceC22204y1<String> interfaceC22204y1 = this.f32209n;
            boolean zF2 = kotlin.jvm.internal.L.f(interfaceC22204y1.getF42167b(), w13.f42383a.f42127c);
            C22602e c22602e = w13.f42383a;
            interfaceC22204y1.setValue(c22602e.f42127c);
            if (!zF2) {
                this.f32207l.invoke(c22602e.f42127c);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.u$g */
    public static final class g extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ Y41.q<Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0>, androidx.compose.runtime.A, Integer, kotlin.G0> f32210A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ int f32211B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ int f32212C;

        /* renamed from: D, reason: collision with root package name */
        public final /* synthetic */ int f32213D;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ String f32214l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, kotlin.G0> f32215m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f32216n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f32217o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ boolean f32218p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.x0 f32219q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C20981p1 f32220r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C20973n1 f32221s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ boolean f32222t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f32223u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ int f32224v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.input.k0 f32225w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Y41.l<androidx.compose.ui.text.o0, kotlin.G0> f32226x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.foundation.interaction.m f32227y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.graphics.J f32228z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public g(String str, Y41.l<? super String, kotlin.G0> lVar, androidx.compose.ui.v vVar, boolean z12, boolean z13, androidx.compose.ui.text.x0 x0Var, C20981p1 c20981p1, C20973n1 c20973n1, boolean z14, int i12, int i13, androidx.compose.ui.text.input.k0 k0Var, Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> lVar2, androidx.compose.foundation.interaction.m mVar, androidx.compose.ui.graphics.J j12, Y41.q<? super Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0>, ? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> qVar, int i14, int i15, int i16) {
            super(2);
            this.f32214l = str;
            this.f32215m = lVar;
            this.f32216n = vVar;
            this.f32217o = z12;
            this.f32218p = z13;
            this.f32219q = x0Var;
            this.f32220r = c20981p1;
            this.f32221s = c20973n1;
            this.f32222t = z14;
            this.f32223u = i12;
            this.f32224v = i13;
            this.f32225w = k0Var;
            this.f32226x = lVar2;
            this.f32227y = mVar;
            this.f32228z = j12;
            this.f32210A = qVar;
            this.f32211B = i14;
            this.f32212C = i15;
            this.f32213D = i16;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f32211B | 1);
            int iA3 = C22066f2.a(this.f32212C);
            androidx.compose.foundation.interaction.m mVar = this.f32227y;
            int i12 = this.f32213D;
            C21055u.b(this.f32214l, this.f32215m, this.f32216n, this.f32217o, this.f32218p, this.f32219q, this.f32220r, this.f32221s, this.f32222t, this.f32223u, this.f32224v, this.f32225w, this.f32226x, mVar, this.f32228z, this.f32210A, a12, iA2, iA3, i12);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00010\u0000¢\u0006\u0002\b\u0002H\u000b¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Function0;", "Lkotlin/G0;", "Landroidx/compose/runtime/o;", "it", "<anonymous>", "(LY41/a;)V"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$h */
    public static final class h implements androidx.compose.foundation.text.input.n {

        /* renamed from: a, reason: collision with root package name */
        public static final h f32229a = new h();

        @Override // androidx.compose.foundation.text.input.n
        @InterfaceC22132o
        @InterfaceC22137p
        public final void a(C22096n c22096n, androidx.compose.runtime.A a12) {
            a12.C(-1669748801);
            c22096n.invoke(a12, 6);
            a12.h();
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/g;", "provide-F1C5BW0", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$i */
    public static final class i implements InterfaceC21039u {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f32230b;

        public i(TextFieldSelectionState textFieldSelectionState) {
            this.f32230b = textFieldSelectionState;
        }

        @Override // androidx.compose.foundation.text.selection.InterfaceC21039u
        public final long a() {
            return this.f32230b.k(true).f31369b;
        }
    }

    /* compiled from: BasicTextField.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$j */
    public static final class j implements PointerInputEventHandler {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f32231b;

        public j(TextFieldSelectionState textFieldSelectionState) {
            this.f32231b = textFieldSelectionState;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
            Object objE = this.f32231b.e(k12, continuation);
            return objE == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objE : kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.u$k */
    public static final class k extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f32232l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(TextFieldSelectionState textFieldSelectionState, int i12) {
            super(2);
            this.f32232l = textFieldSelectionState;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) throws Throwable {
            num.intValue();
            int iA2 = C22066f2.a(1);
            C21055u.c(this.f32232l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/g;", "invoke", "()Landroidx/compose/foundation/text/input/internal/selection/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$l */
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<C20922g> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f32233l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(TextFieldSelectionState textFieldSelectionState) {
            super(0);
            this.f32233l = textFieldSelectionState;
        }

        @Override // Y41.a
        public final C20922g invoke() {
            return this.f32233l.k(false);
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/g;", "provide-F1C5BW0", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$m */
    public static final class m implements InterfaceC21039u {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f32234b;

        public m(TextFieldSelectionState textFieldSelectionState) {
            this.f32234b = textFieldSelectionState;
        }

        @Override // androidx.compose.foundation.text.selection.InterfaceC21039u
        public final long a() {
            return this.f32234b.o(true, true).f31369b;
        }
    }

    /* compiled from: BasicTextField.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$n */
    public static final class n implements PointerInputEventHandler {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f32235b;

        public n(TextFieldSelectionState textFieldSelectionState) {
            this.f32235b = textFieldSelectionState;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
            Object objT = this.f32235b.t(k12, true, continuation);
            return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/g;", "provide-F1C5BW0", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$o */
    public static final class o implements InterfaceC21039u {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f32236b;

        public o(TextFieldSelectionState textFieldSelectionState) {
            this.f32236b = textFieldSelectionState;
        }

        @Override // androidx.compose.foundation.text.selection.InterfaceC21039u
        public final long a() {
            return this.f32236b.o(false, true).f31369b;
        }
    }

    /* compiled from: BasicTextField.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$p */
    public static final class p implements PointerInputEventHandler {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f32237b;

        public p(TextFieldSelectionState textFieldSelectionState) {
            this.f32237b = textFieldSelectionState;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
            Object objT = this.f32237b.t(k12, false, continuation);
            return objT == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objT : kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.u$q */
    public static final class q extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f32238l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(TextFieldSelectionState textFieldSelectionState, int i12) {
            super(2);
            this.f32238l = textFieldSelectionState;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            C21055u.d(this.f32238l, a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/g;", "invoke", "()Landroidx/compose/foundation/text/input/internal/selection/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$r */
    public static final class r extends kotlin.jvm.internal.N implements Y41.a<C20922g> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f32239l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(TextFieldSelectionState textFieldSelectionState) {
            super(0);
            this.f32239l = textFieldSelectionState;
        }

        @Override // Y41.a
        public final C20922g invoke() {
            return this.f32239l.o(false, false);
        }
    }

    /* compiled from: BasicTextField.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/foundation/text/input/internal/selection/g;", "invoke", "()Landroidx/compose/foundation/text/input/internal/selection/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.u$s */
    public static final class s extends kotlin.jvm.internal.N implements Y41.a<C20922g> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TextFieldSelectionState f32240l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(TextFieldSelectionState textFieldSelectionState) {
            super(0);
            this.f32240l = textFieldSelectionState;
        }

        @Override // Y41.a
        public final C20922g invoke() {
            return this.f32240l.o(true, false);
        }
    }

    static {
        float f12 = 40;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        f32181b = androidx.compose.ui.unit.i.a(f12, f12);
    }

    /* JADX WARN: Removed duplicated region for block: B:107:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:123:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0176  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x017e  */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0196  */
    /* JADX WARN: Removed duplicated region for block: B:143:0x01a3  */
    /* JADX WARN: Removed duplicated region for block: B:146:0x01ad  */
    /* JADX WARN: Removed duplicated region for block: B:195:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02ae  */
    /* JADX WARN: Removed duplicated region for block: B:200:0x02c2  */
    /* JADX WARN: Removed duplicated region for block: B:202:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0093  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00a6  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00bb  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00ce  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00f7  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x011c  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0121  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.ui.text.input.W r33, @Y61.k Y41.l<? super androidx.compose.ui.text.input.W, kotlin.G0> r34, @Y61.l androidx.compose.ui.v r35, boolean r36, boolean r37, @Y61.l androidx.compose.ui.text.x0 r38, @Y61.l androidx.compose.foundation.text.C20981p1 r39, @Y61.l androidx.compose.foundation.text.C20973n1 r40, boolean r41, int r42, int r43, @Y61.l androidx.compose.ui.text.input.k0 r44, @Y61.l Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> r45, @Y61.l androidx.compose.foundation.interaction.m r46, @Y61.l androidx.compose.ui.graphics.J r47, @Y61.l Y41.q<? super Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0>, ? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r48, @Y61.l androidx.compose.runtime.A r49, int r50, int r51, int r52) {
        /*
            Method dump skipped, instructions count: 751
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C21055u.a(androidx.compose.ui.text.input.W, Y41.l, androidx.compose.ui.v, boolean, boolean, androidx.compose.ui.text.x0, androidx.compose.foundation.text.p1, androidx.compose.foundation.text.n1, boolean, int, int, androidx.compose.ui.text.input.k0, Y41.l, androidx.compose.foundation.interaction.m, androidx.compose.ui.graphics.J, Y41.q, androidx.compose.runtime.A, int, int, int):void");
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x013e  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:118:0x015b  */
    /* JADX WARN: Removed duplicated region for block: B:119:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:134:0x0186  */
    /* JADX WARN: Removed duplicated region for block: B:137:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:151:0x01be  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:197:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:201:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:204:0x02bd  */
    /* JADX WARN: Removed duplicated region for block: B:205:0x02c0  */
    /* JADX WARN: Removed duplicated region for block: B:207:0x02c4  */
    /* JADX WARN: Removed duplicated region for block: B:208:0x02c7  */
    /* JADX WARN: Removed duplicated region for block: B:211:0x02d3  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x02df  */
    /* JADX WARN: Removed duplicated region for block: B:217:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:220:0x034e  */
    /* JADX WARN: Removed duplicated region for block: B:222:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x00ab  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x00c0  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x00d3  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x00e6  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x00fc  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x0107  */
    /* JADX WARN: Removed duplicated region for block: B:96:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0126  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22137p
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k java.lang.String r43, @Y61.k Y41.l<? super java.lang.String, kotlin.G0> r44, @Y61.l androidx.compose.ui.v r45, boolean r46, boolean r47, @Y61.l androidx.compose.ui.text.x0 r48, @Y61.l androidx.compose.foundation.text.C20981p1 r49, @Y61.l androidx.compose.foundation.text.C20973n1 r50, boolean r51, int r52, int r53, @Y61.l androidx.compose.ui.text.input.k0 r54, @Y61.l Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> r55, @Y61.l androidx.compose.foundation.interaction.m r56, @Y61.l androidx.compose.ui.graphics.J r57, @Y61.l Y41.q<? super Y41.p<? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0>, ? super androidx.compose.runtime.A, ? super java.lang.Integer, kotlin.G0> r58, @Y61.l androidx.compose.runtime.A r59, int r60, int r61, int r62) {
        /*
            Method dump skipped, instructions count: 895
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C21055u.b(java.lang.String, Y41.l, androidx.compose.ui.v, boolean, boolean, androidx.compose.ui.text.x0, androidx.compose.foundation.text.p1, androidx.compose.foundation.text.n1, boolean, int, int, androidx.compose.ui.text.input.k0, Y41.l, androidx.compose.foundation.interaction.m, androidx.compose.ui.graphics.J, Y41.q, androidx.compose.runtime.A, int, int, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0064  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0081  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void c(@Y61.k androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r9, @Y61.l androidx.compose.runtime.A r10, int r11) throws java.lang.Throwable {
        /*
            r0 = 1991581797(0x76b52065, float:1.8368413E33)
            androidx.compose.runtime.B r10 = r10.E(r0)
            boolean r0 = r10.u(r9)
            r1 = 2
            if (r0 == 0) goto L10
            r0 = 4
            goto L11
        L10:
            r0 = r1
        L11:
            r0 = r0 | r11
            r2 = r0 & 3
            r8 = 0
            r3 = 1
            if (r2 == r1) goto L1a
            r1 = r3
            goto L1b
        L1a:
            r1 = r8
        L1b:
            r0 = r0 & r3
            boolean r0 = r10.p(r0, r1)
            if (r0 == 0) goto La6
            boolean r0 = r10.B(r9)
            java.lang.Object r1 = r10.t()
            androidx.compose.runtime.A$a r2 = androidx.compose.runtime.A.f37866a
            if (r0 != 0) goto L35
            r2.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto L41
        L35:
            androidx.compose.foundation.text.u$l r0 = new androidx.compose.foundation.text.u$l
            r0.<init>(r9)
            androidx.compose.runtime.I3 r1 = androidx.compose.runtime.C22126m3.d(r0)
            r10.H(r1)
        L41:
            androidx.compose.runtime.I3 r1 = (androidx.compose.runtime.I3) r1
            java.lang.Object r0 = r1.getF42167b()
            androidx.compose.foundation.text.input.internal.selection.g r0 = (androidx.compose.foundation.text.input.internal.selection.C20922g) r0
            boolean r0 = r0.f31368a
            if (r0 == 0) goto L9c
            r0 = -311835217(0xffffffffed69c5af, float:-4.521812E27)
            r10.C(r0)
            boolean r0 = r10.u(r9)
            java.lang.Object r1 = r10.t()
            if (r0 != 0) goto L64
            r2.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto L6c
        L64:
            androidx.compose.foundation.text.u$i r1 = new androidx.compose.foundation.text.u$i
            r1.<init>(r9)
            r10.H(r1)
        L6c:
            androidx.compose.foundation.text.selection.u r1 = (androidx.compose.foundation.text.selection.InterfaceC21039u) r1
            androidx.compose.ui.v$a r0 = androidx.compose.ui.v.f42878y1
            boolean r3 = r10.u(r9)
            java.lang.Object r4 = r10.t()
            if (r3 != 0) goto L81
            r2.getClass()
            androidx.compose.runtime.A$a$a r2 = androidx.compose.runtime.A.a.f37868b
            if (r4 != r2) goto L89
        L81:
            androidx.compose.foundation.text.u$j r4 = new androidx.compose.foundation.text.u$j
            r4.<init>(r9)
            r10.H(r4)
        L89:
            androidx.compose.ui.input.pointer.PointerInputEventHandler r4 = (androidx.compose.ui.input.pointer.PointerInputEventHandler) r4
            androidx.compose.ui.v r2 = androidx.compose.ui.input.pointer.Z.e(r0, r9, r4)
            r7 = 0
            long r3 = androidx.compose.foundation.text.C21055u.f32181b
            r6 = 384(0x180, float:5.38E-43)
            r5 = r10
            androidx.compose.foundation.text.C20843a.a(r1, r2, r3, r5, r6, r7)
            r10.X(r8)
            goto La9
        L9c:
            r0 = -311451778(0xffffffffed6f9f7e, float:-4.6349832E27)
            r10.C(r0)
            r10.X(r8)
            goto La9
        La6:
            r10.f()
        La9:
            androidx.compose.runtime.c2 r10 = r10.Z()
            if (r10 == 0) goto Lb6
            androidx.compose.foundation.text.u$k r0 = new androidx.compose.foundation.text.u$k
            r0.<init>(r9, r11)
            r10.f38184d = r0
        Lb6:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C21055u.c(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.runtime.A, int):void");
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x006a  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x00d6  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0105  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0133  */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void d(@Y61.k androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState r16, @Y61.l androidx.compose.runtime.A r17, int r18) {
        /*
            Method dump skipped, instructions count: 370
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C21055u.d(androidx.compose.foundation.text.input.internal.selection.TextFieldSelectionState, androidx.compose.runtime.A, int):void");
    }
}
