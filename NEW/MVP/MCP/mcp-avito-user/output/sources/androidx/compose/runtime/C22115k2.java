package androidx.compose.runtime;

import androidx.compose.runtime.Recomposer;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: Recomposer.kt */
@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\u008a@"}, d2 = {"<anonymous>", "", "it", "Landroidx/compose/runtime/Recomposer$State;"}, k = 3, mv = {1, 9, 0}, xi = 48)
@DebugMetadata(c = "androidx.compose.runtime.Recomposer$join$2", f = "Recomposer.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: androidx.compose.runtime.k2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C22115k2 extends SuspendLambda implements Y41.p<Recomposer.State, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f38484q;

    public C22115k2() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<kotlin.G0> create(Object obj, Continuation<?> continuation) {
        C22115k2 c22115k2 = new C22115k2(2, continuation);
        c22115k2.f38484q = obj;
        return c22115k2;
    }

    @Override // Y41.p
    public final Object invoke(Recomposer.State state, Continuation<? super Boolean> continuation) {
        return ((C22115k2) create(state, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return Boxing.boxBoolean(((Recomposer.State) this.f38484q) == Recomposer.State.f38132b);
    }
}
