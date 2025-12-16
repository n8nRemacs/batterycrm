package androidx.compose.ui.platform;

import androidx.compose.runtime.C22126m3;
import kotlin.C42729a0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PlatformTextInputModifierNode.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlin/G0;", "it", "", "<anonymous>", "(V)Ljava/lang/Void;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3", f = "PlatformTextInputModifierNode.kt", i = {}, l = {237}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class H0 extends SuspendLambda implements Y41.p<kotlin.G0, Continuation<?>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f41123q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ J0 f41124r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ O1 f41125s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ V1 f41126t;

    /* compiled from: PlatformTextInputModifierNode.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/compose/ui/platform/N1;", "invoke", "()Landroidx/compose/ui/platform/N1;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.a<N1> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ J0 f41127l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(J0 j02) {
            super(0);
            this.f41127l = j02;
        }

        @Override // Y41.a
        public final N1 invoke() {
            this.f41127l.getClass();
            throw null;
        }
    }

    /* compiled from: PlatformTextInputModifierNode.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/N1;", "interceptor", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/ui/platform/N1;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "androidx.compose.ui.platform.ChainedPlatformTextInputInterceptor$textInputSession$2$scope$1$startInputMethod$3$2", f = "PlatformTextInputModifierNode.kt", i = {}, l = {238}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<N1, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f41128q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f41129r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ O1 f41130s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ V1 f41131t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(O1 o12, V1 v12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f41130s = o12;
            this.f41131t = v12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
            b bVar = new b(this.f41130s, this.f41131t, continuation);
            bVar.f41129r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(N1 n12, Continuation<? super kotlin.G0> continuation) {
            return ((b) create(n12, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f41128q;
            if (i12 == 0) {
                C42729a0.b(obj);
                N1 n12 = (N1) this.f41129r;
                this.f41128q = 1;
                if (n12.a() == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public H0(J0 j02, O1 o12, V1 v12, Continuation<? super H0> continuation) {
        super(2, continuation);
        this.f41124r = j02;
        this.f41125s = o12;
        this.f41126t = v12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new H0(this.f41124r, this.f41125s, this.f41126t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlin.G0 g02, Continuation<?> continuation) {
        return ((H0) create(g02, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f41123q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43160i interfaceC43160iN = C22126m3.n(new a(this.f41124r));
            b bVar = new b(this.f41125s, this.f41126t, null);
            this.f41123q = 1;
            if (C43175k.j(interfaceC43160iN, bVar, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        throw new IllegalStateException("Interceptors flow should never terminate.");
    }
}
