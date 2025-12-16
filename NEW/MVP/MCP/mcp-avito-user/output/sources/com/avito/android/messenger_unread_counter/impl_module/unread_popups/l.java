package com.avito.android.messenger_unread_counter.impl_module.unread_popups;

import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import sZ.AbstractC48135a;

/* compiled from: UnreadMessagesTooltipInteractorImpl.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "isFragmentForUnread", "Lkotlinx/coroutines/flow/i;", "LsZ/a;", "<anonymous>", "(Z)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger_unread_counter.impl_module.unread_popups.UnreadMessagesTooltipInteractorImpl$getUnreadMessagesTooltipAfterBackground$1", f = "UnreadMessagesTooltipInteractorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class l extends SuspendLambda implements Y41.p<Boolean, Continuation<? super InterfaceC43160i<? extends AbstractC48135a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ boolean f197787q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ h f197788r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public l(h hVar, Continuation<? super l> continuation) {
        super(2, continuation);
        this.f197788r = hVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        l lVar = new l(this.f197788r, continuation);
        lVar.f197787q = ((Boolean) obj).booleanValue();
        return lVar;
    }

    @Override // Y41.p
    public final Object invoke(Boolean bool, Continuation<? super InterfaceC43160i<? extends AbstractC48135a>> continuation) {
        Boolean bool2 = bool;
        bool2.booleanValue();
        return ((l) create(bool2, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (!this.f197787q) {
            return new C43210w(AbstractC48135a.C12619a.f437722a);
        }
        int i12 = h.f197752p;
        return this.f197788r.b();
    }
}
