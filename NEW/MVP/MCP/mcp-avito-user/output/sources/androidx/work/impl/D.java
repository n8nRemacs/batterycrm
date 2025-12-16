package androidx.work.impl;

import android.content.Context;
import androidx.work.impl.background.systemalarm.RescheduleReceiver;
import androidx.work.impl.utils.C23609t;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: UnfinishedWorkListener.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "hasUnfinishedWork", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 8, 0})
@DebugMetadata(c = "androidx.work.impl.UnfinishedWorkListenerKt$maybeLaunchUnfinishedWorkListener$2", f = "UnfinishedWorkListener.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes10.dex */
final class D extends SuspendLambda implements Y41.p<Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f55519q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Context f55520r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public D(Context context, Continuation<? super D> continuation) {
        super(2, continuation);
        this.f55520r = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Continuation<G0> create(Object obj, Continuation<?> continuation) {
        D d12 = new D(this.f55520r, continuation);
        d12.f55519q = ((Boolean) obj).booleanValue();
        return d12;
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((D) create(bool2, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    public final Object invokeSuspend(Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C23609t.a(this.f55520r, RescheduleReceiver.class, this.f55519q);
        return G0.f406611a;
    }
}
