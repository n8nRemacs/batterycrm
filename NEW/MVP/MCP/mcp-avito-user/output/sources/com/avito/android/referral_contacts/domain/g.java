package com.avito.android.referral_contacts.domain;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.referral_contacts.models.ReferralContactsInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ReferralContactsInteractor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/referral_contacts/models/ReferralContactsInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.referral_contacts.domain.ReferralContactsInteractor$checkContacts$3", f = "ReferralContactsInteractor.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class g extends SuspendLambda implements q<InterfaceC43172j<? super ReferralContactsInternalAction>, Throwable, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252475q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f252476r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Throwable f252477s;

    public g() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super ReferralContactsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
        g gVar = new g(3, continuation);
        gVar.f252476r = interfaceC43172j;
        gVar.f252477s = th2;
        return gVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f252475q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = this.f252476r;
            ReferralContactsInternalAction.Error error = new ReferralContactsInternalAction.Error(this.f252477s, null, 2, null);
            this.f252476r = null;
            this.f252475q = 1;
            if (interfaceC43172j.emit(error, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return G0.f406611a;
    }
}
