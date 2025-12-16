package androidx.compose.foundation;

import androidx.compose.foundation.interaction.o;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Clickable.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "androidx.compose.foundation.AbstractClickableNode$onFocusChange$1$1", f = "Clickable.kt", i = {}, l = {1119}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.foundation.f, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20424f extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f27134q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC20407a f27135r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ o.b f27136s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C20424f(AbstractC20407a abstractC20407a, o.b bVar, Continuation<? super C20424f> continuation) {
        super(2, continuation);
        this.f27135r = abstractC20407a;
        this.f27136s = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        return new C20424f(this.f27135r, this.f27136s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super kotlin.G0> continuation) {
        return ((C20424f) create(t12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f27134q;
        if (i12 == 0) {
            C42729a0.b(obj);
            androidx.compose.foundation.interaction.m mVar = this.f27135r.f26915r;
            if (mVar != null) {
                o.a aVar = new o.a(this.f27136s);
                this.f27134q = 1;
                if (mVar.b(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
