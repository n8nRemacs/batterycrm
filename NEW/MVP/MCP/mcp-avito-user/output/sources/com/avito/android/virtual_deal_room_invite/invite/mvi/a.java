package com.avito.android.virtual_deal_room_invite.invite.mvi;

import Y41.p;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.GetInvitationApiV1Response;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.a;
import com.avito.android.virtual_deal_room_invite.invite.mvi.entity.InviteInternalAction;
import iO0.C41326a;
import iO0.C41327b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nO0.C44303d;

/* compiled from: InviteActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.mvi.InviteActor$process$1", f = "InviteActor.kt", i = {}, l = {42}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super InviteInternalAction>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f327044q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f327045r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ C44303d f327046s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ b f327047t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C44303d c44303d, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f327046s = c44303d;
        this.f327047t = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        a aVar = new a(this.f327046s, this.f327047t, continuation);
        aVar.f327045r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super InviteInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        C41326a screenDefaultValues;
        C41327b rejectPopup;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f327044q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f327045r;
            GetInvitationApiV1Response getInvitationApiV1Response = this.f327046s.f415109b;
            com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.a details = getInvitationApiV1Response != null ? getInvitationApiV1Response.getDetails() : null;
            a.b bVar = details instanceof a.b ? (a.b) details : null;
            if (bVar == null || (screenDefaultValues = bVar.getScreenDefaultValues()) == null || (rejectPopup = screenDefaultValues.getRejectPopup()) == null) {
                return G0.f406611a;
            }
            this.f327047t.f327049b.b();
            InviteInternalAction.ShowDeclinePopup showDeclinePopup = new InviteInternalAction.ShowDeclinePopup(rejectPopup);
            this.f327044q = 1;
            if (interfaceC43172j.emit(showDeclinePopup, this) == coroutine_suspended) {
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
