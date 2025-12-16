package com.avito.android.offlinization.ui;

import Y41.p;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;

/* compiled from: OfflinizationLifecycleCallbacks.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "enabled", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.offlinization.ui.OfflinizationLifecycleCallbacksImpl$subscribeOfflineMode$1", f = "OfflinizationLifecycleCallbacks.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class e extends SuspendLambda implements p<Boolean, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f208632q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f208633r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, Continuation<? super e> continuation) {
        super(2, continuation);
        this.f208633r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        e eVar = new e(this.f208633r, continuation);
        eVar.f208632q = ((Boolean) obj).booleanValue();
        return eVar;
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((e) create(bool2, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f208633r.setVisibility(this.f208632q ? 0 : 8);
        return G0.f406611a;
    }
}
