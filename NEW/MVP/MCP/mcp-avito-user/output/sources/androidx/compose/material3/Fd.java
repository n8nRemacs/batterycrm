package androidx.compose.material3;

import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43131e0;

/* compiled from: SearchBar.android.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.compose.material3.SearchBar_androidKt$DockedSearchBar$3$1", f = "SearchBar.android.kt", i = {}, l = {420}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes.dex */
final class Fd extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f34732q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ boolean f34733r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.focus.r f34734s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Fd(boolean z12, androidx.compose.ui.focus.r rVar, Continuation<? super Fd> continuation) {
        super(2, continuation);
        this.f34733r = z12;
        this.f34734s = rVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new Fd(this.f34733r, this.f34734s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((Fd) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f34732q;
        if (i12 == 0) {
            C42729a0.b(obj);
            if (this.f34733r) {
                this.f34732q = 1;
                if (C43131e0.b(100L, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.G0.f406611a;
        }
        if (i12 != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        C42729a0.b(obj);
        this.f34734s.u(false);
        return kotlin.G0.f406611a;
    }
}
