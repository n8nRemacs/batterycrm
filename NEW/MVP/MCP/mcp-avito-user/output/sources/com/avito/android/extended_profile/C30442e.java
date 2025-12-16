package com.avito.android.extended_profile;

import android.os.Bundle;
import com.avito.android.authorization.AuthSource;
import com.avito.android.deep_linking.links.ExtendedProfilePhoneRequestLink;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
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

/* compiled from: ExtendedProfileDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction$ShowPhoneDialog;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.ExtendedProfileDeeplinkHandlerImpl$handleProfilePhoneRequestLink$1", f = "ExtendedProfileDeeplinkHandler.kt", i = {}, l = {167}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile.e, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30442e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ExtendedProfileInternalAction.ShowPhoneDialog>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f149956q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f149957r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.extended_profile.mvi.entity.a f149958s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C30395d f149959t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ ExtendedProfilePhoneRequestLink f149960u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30442e(com.avito.android.extended_profile.mvi.entity.a aVar, C30395d c30395d, ExtendedProfilePhoneRequestLink extendedProfilePhoneRequestLink, Continuation<? super C30442e> continuation) {
        super(2, continuation);
        this.f149958s = aVar;
        this.f149959t = c30395d;
        this.f149960u = extendedProfilePhoneRequestLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30442e c30442e = new C30442e(this.f149958s, this.f149959t, this.f149960u, continuation);
        c30442e.f149957r = obj;
        return c30442e;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction.ShowPhoneDialog> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((C30442e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        List<ExtendedProfilePhone> list;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f149956q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f149957r;
            com.avito.android.extended_profile.mvi.entity.a aVar = this.f149958s;
            com.avito.android.extended_profile_phone_dialog.f fVar = aVar.f150245g;
            C30395d c30395d = this.f149959t;
            if (fVar == null || (list = fVar.f151599a) == null || list.isEmpty()) {
                Bundle bundle = new Bundle();
                bundle.putSerializable("source_key", AuthSource.f92718o);
                bundle.putString("fromSpace", c30395d.f149444j);
                c30395d.d(this.f149960u, bundle);
            } else {
                ExtendedProfileInternalAction.ShowPhoneDialog showPhoneDialog = new ExtendedProfileInternalAction.ShowPhoneDialog(aVar.f150245g, c30395d.f149441g.a());
                this.f149956q = 1;
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
