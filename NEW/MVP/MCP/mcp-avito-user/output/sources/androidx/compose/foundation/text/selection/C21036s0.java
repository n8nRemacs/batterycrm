package androidx.compose.foundation.text.selection;

import androidx.compose.animation.core.C20268c;
import androidx.compose.animation.core.C20321u;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: SelectionMagnifier.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.text.selection.SelectionMagnifierKt$rememberAnimatedMagnifierPosition$1$1", f = "SelectionMagnifier.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.text.selection.s0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C21036s0 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f32130q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f32131r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ I3<l0.g> f32132s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C20268c<l0.g, C20321u> f32133t;

    /* compiled from: SelectionMagnifier.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Ll0/g;", "invoke-F1C5BW0", "()J", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.selection.s0$a */
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<l0.g> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ I3<l0.g> f32134l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(I3<l0.g> i32) {
            super(0);
            this.f32134l = i32;
        }

        @Override // Y41.a
        public final l0.g invoke() {
            C20321u c20321u = C21031p0.f32100a;
            return l0.g.a(this.f32134l.getF42167b().f413387a);
        }
    }

    /* compiled from: SelectionMagnifier.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Ll0/g;", "targetValue", "Lkotlin/G0;", "emit-3MmeM6k", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.foundation.text.selection.s0$b */
    public static final class b<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ C20268c<l0.g, C20321u> f32135b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f32136c;

        public b(C20268c<l0.g, C20321u> c20268c, kotlinx.coroutines.T t12) {
            this.f32135b = c20268c;
            this.f32136c = t12;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            long j12 = ((l0.g) obj).f413387a;
            C20268c<l0.g, C20321u> c20268c = this.f32135b;
            if ((c20268c.f().f413387a & 9223372034707292159L) == 9205357640488583168L || (j12 & 9223372034707292159L) == 9205357640488583168L || Float.intBitsToFloat((int) (c20268c.f().f413387a & 4294967295L)) == Float.intBitsToFloat((int) (j12 & 4294967295L))) {
                Object objH = c20268c.h(l0.g.a(j12), continuation);
                return objH == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objH : kotlin.G0.f406611a;
            }
            C43259k.d(this.f32136c, null, null, new C21038t0(c20268c, j12, null), 3);
            return kotlin.G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C21036s0(I3<l0.g> i32, C20268c<l0.g, C20321u> c20268c, Continuation<? super C21036s0> continuation) {
        super(2, continuation);
        this.f32132s = i32;
        this.f32133t = c20268c;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C21036s0 c21036s0 = new C21036s0(this.f32132s, this.f32133t, continuation);
        c21036s0.f32131r = obj;
        return c21036s0;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C21036s0) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f32130q;
        if (i12 == 0) {
            C42729a0.b(obj);
            kotlinx.coroutines.T t12 = (kotlinx.coroutines.T) this.f32131r;
            InterfaceC43160i interfaceC43160iN = C22126m3.n(new a(this.f32132s));
            b bVar = new b(this.f32133t, t12);
            this.f32130q = 1;
            if (interfaceC43160iN.collect(bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return kotlin.G0.f406611a;
    }
}
