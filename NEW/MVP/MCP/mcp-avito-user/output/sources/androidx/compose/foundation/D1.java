package androidx.compose.foundation;

import androidx.compose.animation.core.InterfaceC20307p;
import androidx.compose.runtime.C22061e3;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: BasicMarquee.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2", f = "BasicMarquee.kt", i = {}, l = {402}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class D1 extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f26691q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ B1 f26692r;

    /* compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Float;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<Float> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ B1 f26693l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(B1 b12) {
            super(0);
            this.f26693l = b12;
        }

        @Override // Y41.a
        public final Float invoke() {
            B1 b12 = this.f26693l;
            if (((C22061e3) b12.f26641t).e() <= ((C22061e3) b12.f26642u).e()) {
                return null;
            }
            int i12 = ((C21096z1) ((C22082i3) b12.f26647z).getF42167b()).f32328a;
            C21096z1.f32326b.getClass();
            if (i12 != C21096z1.f32327c || ((Boolean) ((C22082i3) b12.f26643v).getF42167b()).booleanValue()) {
                return Float.valueOf(((C22061e3) b12.f26641t).e() + b12.l2());
            }
            return null;
        }
    }

    /* compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "contentWithSpacingWidth", "Lkotlin/G0;", "<anonymous>", "(F)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.foundation.MarqueeModifierNode$runAnimation$2$2", f = "BasicMarquee.kt", i = {0, 0}, l = {416, 418, 422, 422}, m = "invokeSuspend", n = {"contentWithSpacingWidth", "spec"}, s = {"L$0", "L$1"})
    public static final class b extends SuspendLambda implements Y41.p<Float, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public InterfaceC20307p f26694q;

        /* renamed from: r, reason: collision with root package name */
        public int f26695r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f26696s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ B1 f26697t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(B1 b12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f26697t = b12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f26697t, continuation);
            bVar.f26696s = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(Float f12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(f12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x00d5 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r23) throws java.lang.Throwable {
            /*
                Method dump skipped, instructions count: 238
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.D1.b.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D1(B1 b12, Continuation<? super D1> continuation) {
        super(2, continuation);
        this.f26692r = b12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new D1(this.f26692r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((D1) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f26691q;
        if (i12 == 0) {
            C42729a0.b(obj);
            B1 b12 = this.f26692r;
            InterfaceC43160i interfaceC43160iN = C22126m3.n(new a(b12));
            b bVar = new b(b12, null);
            this.f26691q = 1;
            if (C43175k.j(interfaceC43160iN, bVar, this) == coroutine_suspended) {
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
