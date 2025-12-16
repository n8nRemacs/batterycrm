package androidx.compose.foundation.gestures;

import androidx.compose.animation.core.C20318t;
import androidx.compose.foundation.gestures.C20456g1;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;

/* compiled from: MouseWheelScrollable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/compose/foundation/gestures/t1;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/foundation/gestures/t1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.gestures.MouseWheelScrollingLogic$dispatchMouseWheelScroll$3", f = "MouseWheelScrollable.kt", i = {0, 0, 1, 1, 1, 2, 2}, l = {253, 266, 283}, m = "invokeSuspend", n = {"$this$userScroll", "requiredAnimation", "$this$userScroll", "requiredAnimation", "durationMillis", "$this$userScroll", "requiredAnimation"}, s = {"L$0", "L$1", "L$0", "L$1", "I$0", "L$0", "L$1"})
/* renamed from: androidx.compose.foundation.gestures.k1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20472k1 extends SuspendLambda implements Y41.p<InterfaceC20506t1, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ float f27807A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ C20433a2 f27808B;

    /* renamed from: q, reason: collision with root package name */
    public l0.a f27809q;

    /* renamed from: r, reason: collision with root package name */
    public l0.a f27810r;

    /* renamed from: s, reason: collision with root package name */
    public int f27811s;

    /* renamed from: t, reason: collision with root package name */
    public int f27812t;

    /* renamed from: u, reason: collision with root package name */
    public /* synthetic */ Object f27813u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ l0.e f27814v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ l0.h<androidx.compose.animation.core.r<Float, C20318t>> f27815w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ l0.h<C20456g1.a> f27816x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ float f27817y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ C20456g1 f27818z;

    /* compiled from: MouseWheelScrollable.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "lastValue", "", "invoke", "(F)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.gestures.k1$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<Float, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ C20456g1 f27819l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ l0.h<C20456g1.a> f27820m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ l0.e f27821n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ C20433a2 f27822o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ l0.a f27823p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C20456g1 c20456g1, l0.h<C20456g1.a> hVar, l0.e eVar, C20433a2 c20433a2, l0.a aVar) {
            super(1);
            this.f27819l = c20456g1;
            this.f27820m = hVar;
            this.f27821n = eVar;
            this.f27822o = c20433a2;
            this.f27823p = aVar;
        }

        /* JADX WARN: Type inference failed for: r3v2, types: [T, androidx.compose.foundation.gestures.g1$a] */
        @Override // Y41.l
        public final Boolean invoke(Float f12) {
            float fFloatValue = f12.floatValue();
            C20456g1 c20456g1 = this.f27819l;
            C20456g1.a aVarD = C20456g1.d(c20456g1.f27717e);
            if (aVarD != null) {
                c20456g1.e(aVarD);
                l0.h<C20456g1.a> hVar = this.f27820m;
                ?? A12 = hVar.f406842b.a(aVarD);
                hVar.f406842b = A12;
                long j12 = A12.f27721a;
                C20433a2 c20433a2 = this.f27822o;
                this.f27821n.f406839b = c20433a2.g(c20433a2.e(j12));
                this.f27823p.f406838b = !C20452f1.a(r0 - fFloatValue);
            }
            return Boolean.valueOf(aVarD != null);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20472k1(l0.e eVar, l0.h<androidx.compose.animation.core.r<Float, C20318t>> hVar, l0.h<C20456g1.a> hVar2, float f12, C20456g1 c20456g1, float f13, C20433a2 c20433a2, Continuation<? super C20472k1> continuation) {
        super(2, continuation);
        this.f27814v = eVar;
        this.f27815w = hVar;
        this.f27816x = hVar2;
        this.f27817y = f12;
        this.f27818z = c20456g1;
        this.f27807A = f13;
        this.f27808B = c20433a2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C20472k1 c20472k1 = new C20472k1(this.f27814v, this.f27815w, this.f27816x, this.f27817y, this.f27818z, this.f27807A, this.f27808B, continuation);
        c20472k1.f27813u = obj;
        return c20472k1;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC20506t1 interfaceC20506t1, Continuation<? super kotlin.G0> continuation) {
        return ((C20472k1) create(interfaceC20506t1, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0163  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0199  */
    /* JADX WARN: Type inference failed for: r1v11, types: [T, androidx.compose.animation.core.r] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:36:0x0186 -> B:37:0x0188). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:39:0x0199 -> B:38:0x0196). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r20) {
        /*
            Method dump skipped, instructions count: 470
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.C20472k1.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
