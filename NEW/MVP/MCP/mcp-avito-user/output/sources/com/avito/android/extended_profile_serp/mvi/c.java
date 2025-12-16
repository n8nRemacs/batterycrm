package com.avito.android.extended_profile_serp.mvi;

import android.os.Bundle;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpInternalAction;
import com.avito.android.extended_profile_serp.mvi.entity.ExtendedProfileSerpState;
import com.avito.android.remote.model.ExtendedProfilePhone;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileSerpActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile_serp/mvi/entity/ExtendedProfileSerpInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.mvi.ExtendedProfileSerpActor$handleProfilePhoneRequestLink$1", f = "ExtendedProfileSerpActor.kt", i = {}, l = {430}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileSerpInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f152904q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f152905r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfileSerpState f152906s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n f152907t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfilePhoneRequestLink f152908u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(ExtendedProfileSerpState extendedProfileSerpState, n nVar, ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f152906s = extendedProfileSerpState;
        this.f152907t = nVar;
        this.f152908u = extendedProfilePhoneRequestLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        c cVar = new c(this.f152906s, this.f152907t, this.f152908u, continuation);
        cVar.f152905r = obj;
        return cVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileSerpInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<ExtendedProfilePhone> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f152904q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f152905r;
            ExtendedProfileSerpState extendedProfileSerpState = this.f152906s;
            com.avito.android.extended_profile_phone_dialog.f fVar = extendedProfileSerpState.f152969s;
            n nVar = this.f152907t;
            if (fVar == null || (list = fVar.f151599a) == null || list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("source_key", AuthSource.f92718o);
                nVar.f153026f.r6(bundle, this.f152908u, "req_key_extended_profile_serp");
            } else {
                ExtendedProfileSerpInternalAction.ShowPhoneDialog showPhoneDialog = new ExtendedProfileSerpInternalAction.ShowPhoneDialog(extendedProfileSerpState.f152969s, nVar.f153030j.a(), nVar.f153021a.f152442b);
                this.f152904q = 1;
                if (interfaceC43172j.emit(showPhoneDialog, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
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
