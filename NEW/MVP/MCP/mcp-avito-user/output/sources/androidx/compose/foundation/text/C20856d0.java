package androidx.compose.foundation.text;

import androidx.compose.foundation.gestures.C20445d2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.input.pointer.PointerInputEventHandler;
import androidx.compose.ui.text.C22602e;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;

/* compiled from: ClickableText.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"foundation_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.d0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20856d0 {

    /* compiled from: ClickableText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.d0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.o0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f30674l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ kotlin.G0 invoke(androidx.compose.ui.text.o0 o0Var) {
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/text/o0;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/text/o0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.d0$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.compose.ui.text.o0, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.text.o0> f30675l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<androidx.compose.ui.text.o0, kotlin.G0> f30676m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.l lVar, InterfaceC22204y1 interfaceC22204y1) {
            super(1);
            this.f30675l = interfaceC22204y1;
            this.f30676m = lVar;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(androidx.compose.ui.text.o0 o0Var) {
            androidx.compose.ui.text.o0 o0Var2 = o0Var;
            this.f30675l.setValue(o0Var2);
            this.f30676m.invoke(o0Var2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.text.d0$c */
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C22602e f30677l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.v f30678m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.text.x0 f30679n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ boolean f30680o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ int f30681p;

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ int f30682q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ Y41.l<androidx.compose.ui.text.o0, kotlin.G0> f30683r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, kotlin.G0> f30684s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ int f30685t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ int f30686u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(C22602e c22602e, androidx.compose.ui.v vVar, androidx.compose.ui.text.x0 x0Var, boolean z12, int i12, int i13, Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> lVar, Y41.l<? super Integer, kotlin.G0> lVar2, int i14, int i15) {
            super(2);
            this.f30677l = c22602e;
            this.f30678m = vVar;
            this.f30679n = x0Var;
            this.f30680o = z12;
            this.f30681p = i12;
            this.f30682q = i13;
            this.f30683r = lVar;
            this.f30684s = lVar2;
            this.f30685t = i14;
            this.f30686u = i15;
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f30685t | 1);
            Y41.l<androidx.compose.ui.text.o0, kotlin.G0> lVar = this.f30683r;
            C22602e c22602e = this.f30677l;
            int i12 = this.f30682q;
            C20856d0.a(c22602e, this.f30678m, this.f30679n, this.f30680o, this.f30681p, i12, lVar, this.f30684s, a12, iA2, this.f30686u);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ClickableText.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/ui/input/pointer/K;", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/input/pointer/K;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.d0$d */
    public static final class d implements PointerInputEventHandler {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.text.o0> f30687b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.l<Integer, kotlin.G0> f30688c;

        /* compiled from: ClickableText.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "pos", "Lkotlin/G0;", "invoke-k-4lQ0M", "(J)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: androidx.compose.foundation.text.d0$d$a */
        public static final class a extends kotlin.jvm.internal.N implements Y41.l<l0.g, kotlin.G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1<androidx.compose.ui.text.o0> f30689l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Y41.l<Integer, kotlin.G0> f30690m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(Y41.l lVar, InterfaceC22204y1 interfaceC22204y1) {
                super(1);
                this.f30689l = interfaceC22204y1;
                this.f30690m = lVar;
            }

            @Override // Y41.l
            public final kotlin.G0 invoke(l0.g gVar) {
                long j12 = gVar.f413387a;
                androidx.compose.ui.text.o0 f42167b = this.f30689l.getF42167b();
                if (f42167b != null) {
                    this.f30690m.invoke(Integer.valueOf(f42167b.f42527b.g(j12)));
                }
                return kotlin.G0.f406611a;
            }
        }

        public d(Y41.l lVar, InterfaceC22204y1 interfaceC22204y1) {
            this.f30687b = interfaceC22204y1;
            this.f30688c = lVar;
        }

        @Override // androidx.compose.ui.input.pointer.PointerInputEventHandler
        public final Object invoke(androidx.compose.ui.input.pointer.K k12, Continuation<? super kotlin.G0> continuation) {
            Object objG = C20445d2.g(k12, null, null, new a(this.f30688c, this.f30687b), continuation, 7);
            return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x006e  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x0079  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0117  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0129  */
    /* JADX WARN: Removed duplicated region for block: B:68:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.InterfaceC22132o
    @androidx.compose.runtime.InterfaceC22181t
    @kotlin.InterfaceC42830m
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void a(@Y61.k androidx.compose.ui.text.C22602e r25, @Y61.l androidx.compose.ui.v r26, @Y61.l androidx.compose.ui.text.x0 r27, boolean r28, int r29, int r30, @Y61.l Y41.l<? super androidx.compose.ui.text.o0, kotlin.G0> r31, @Y61.k Y41.l<? super java.lang.Integer, kotlin.G0> r32, @Y61.l androidx.compose.runtime.A r33, int r34, int r35) {
        /*
            Method dump skipped, instructions count: 316
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.text.C20856d0.a(androidx.compose.ui.text.e, androidx.compose.ui.v, androidx.compose.ui.text.x0, boolean, int, int, Y41.l, Y41.l, androidx.compose.runtime.A, int, int):void");
    }
}
