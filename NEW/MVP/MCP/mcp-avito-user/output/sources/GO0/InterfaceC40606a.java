package gO0;

import J81.f;
import J81.o;
import J81.s;
import Y61.k;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.GetInvitationApiV1Response;
import e30.InterfaceC39936a;
import e30.InterfaceC39938c;
import hO0.C40861a;
import jO0.C42291a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;

/* compiled from: VirtualDealRoomInviteApi.kt */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\t\u0010\u0007J \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u000b\u0010\u0007¨\u0006\f"}, d2 = {"LgO0/a;", "", "", "invitationId", "Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/virtual_deal_room_invite/generated/api/get_invitation_api_v_1/GetInvitationApiV1Response;", "b", "(Ljava/lang/String;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "LhO0/a;", "a", "LjO0/a;", "c", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC39936a
/* renamed from: gO0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public interface InterfaceC40606a {
    @o("1/vdr/invitation/{invitationId}/accept")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object a(@s("invitationId") @k String str, @k Continuation<? super TypedResult<C40861a>> continuation);

    @f("1/vdr/invitation/{invitationId}")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object b(@s("invitationId") @k String str, @k Continuation<? super TypedResult<GetInvitationApiV1Response>> continuation);

    @o("1/vdr/invitation/{invitationId}/reject")
    @com.avito.android.remote.parse.adapter.stream_gson.b
    @InterfaceC39938c
    @l
    Object c(@s("invitationId") @k String str, @k Continuation<? super TypedResult<C42291a>> continuation);
}
