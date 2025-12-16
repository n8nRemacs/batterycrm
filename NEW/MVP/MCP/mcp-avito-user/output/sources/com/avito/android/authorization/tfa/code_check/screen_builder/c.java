package com.avito.android.authorization.tfa.code_check.screen_builder;

import Ju.InterfaceC14249c;
import To.InterfaceC15383a;
import com.avito.android.code_check_public.a;
import com.avito.android.deep_linking.links.auth.AutoRecoveryLink;
import com.avito.android.deep_linking.links.auth.PhoneUnavailableReasonLink;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kv.C43501a;

/* compiled from: TfaCodeCheckScreenBuilder.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "LTo/a;", "<anonymous>", "(Lkv/a;)LTo/a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.tfa.code_check.screen_builder.TfaCodeCheckScreenBuilder$createSmsScreen$screen$4", f = "TfaCodeCheckScreenBuilder.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class c extends SuspendLambda implements Y41.p<C43501a, Continuation<? super InterfaceC15383a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f94716q;

    public c() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(2, continuation);
        cVar.f94716q = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(C43501a c43501a, Continuation<? super InterfaceC15383a> continuation) {
        return ((c) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14249c interfaceC14249c = ((C43501a) this.f94716q).f413261b;
        if (interfaceC14249c instanceof PhoneUnavailableReasonLink.b.C4028b) {
            return new InterfaceC15383a.e(new a.b.C3496a(null, 1, null));
        }
        if (interfaceC14249c instanceof AutoRecoveryLink.Result.a) {
            return new InterfaceC15383a.f(com.avito.android.printable_text.b.f(((AutoRecoveryLink.Result.a) interfaceC14249c).f133898b));
        }
        return null;
    }
}
