package androidx.compose.ui.text.font;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: FontListFontFamilyTypefaceAdapter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "", "<anonymous>", "(Lkotlinx/coroutines/T;)Ljava/lang/Object;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.ui.text.font.AsyncFontListLoader$loadWithTimeoutOrNull$2", f = "FontListFontFamilyTypefaceAdapter.kt", i = {}, l = {315}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class r extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super Object>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f42293q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C22624s f42294r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ D f42295s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(C22624s c22624s, D d12, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f42294r = c22624s;
        this.f42295s = d12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        return new r(this.f42294r, this.f42295s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super Object> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f42293q;
        if (i12 == 0) {
            C42729a0.b(obj);
            m0 m0Var = this.f42294r.f42300f;
            this.f42293q = 1;
            obj = m0Var.a(this.f42295s, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
