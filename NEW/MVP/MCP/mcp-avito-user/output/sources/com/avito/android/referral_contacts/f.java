package com.avito.android.referral_contacts;

import Y41.q;
import Y61.k;
import Y61.l;
import com.avito.android.iac_util_deeplinks.public_module.ChainEventLink;
import com.avito.android.referral_contacts.c;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;

/* compiled from: ReferralContactsPermissionRequester.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/iac_util_deeplinks/public_module/ChainEventLink;", "Lkv/a;", "it", "", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lkv/a;)Z"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.referral_contacts.ReferralContactsPermissionRequester$observe$2", f = "ReferralContactsPermissionRequester.kt", i = {0}, l = {31}, m = "invokeSuspend", n = {"it"}, s = {"L$0"})
/* loaded from: classes16.dex */
final class f extends SuspendLambda implements q<InterfaceC43172j<? super ChainEventLink>, C43501a, Continuation<? super Boolean>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f252495q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f252496r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ C43501a f252497s;

    public f() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super ChainEventLink> interfaceC43172j, C43501a c43501a, Continuation<? super Boolean> continuation) {
        f fVar = new f(3, continuation);
        fVar.f252496r = interfaceC43172j;
        fVar.f252497s = c43501a;
        return fVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        C43501a c43501a;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f252495q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f252496r;
            C43501a c43501a2 = this.f252497s;
            ChainEventLink chainEventLink = (ChainEventLink) c43501a2.f413260a.f134520a;
            this.f252496r = c43501a2;
            this.f252495q = 1;
            if (interfaceC43172j.emit(chainEventLink, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            c43501a = c43501a2;
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            c43501a = (C43501a) this.f252496r;
            C42729a0.b(obj);
        }
        c.a.C7572a.f252378a.getClass();
        return Boxing.boxBoolean(!C42745f0.r((List) c.a.C7572a.f252387j.getValue(), c43501a.f413260a.f134520a));
    }
}
