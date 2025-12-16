package com.avito.android.virtual_deal_room_invite.invite.mvi.builder;

import Y61.k;
import com.avito.android.util.V2;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.GetInvitationApiV1Response;
import com.avito.android.virtual_deal_room_invite.generated.api.get_invitation_api_v_1.a;
import com.avito.android.virtual_deal_room_invite.invite.model.CounterColor;
import dO0.C39608a;
import iO0.g;
import javax.inject.Inject;
import kotlin.Metadata;
import nO0.C44303d;
import nO0.InterfaceC44304e;

/* compiled from: InviteViewStateBuilder.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/mvi/builder/b;", "Lcom/avito/android/virtual_deal_room_invite/invite/mvi/builder/a;", "<init>", "()V", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.virtual_deal_room_invite.invite.mvi.builder.a
    @k
    public final C44303d a(@k C44303d c44303d) {
        InterfaceC44304e interfaceC44304e;
        InterfaceC44304e bVar;
        InterfaceC44304e interfaceC44304e2;
        Integer num;
        if (c44303d.f415113f) {
            interfaceC44304e = InterfaceC44304e.C11859e.f415132a;
        } else if (c44303d.f415116i) {
            interfaceC44304e = InterfaceC44304e.d.f415131a;
        } else if (c44303d.f415114g) {
            interfaceC44304e = InterfaceC44304e.a.f415119a;
        } else {
            if (!c44303d.f415115h) {
                GetInvitationApiV1Response getInvitationApiV1Response = c44303d.f415109b;
                if ((getInvitationApiV1Response != null ? getInvitationApiV1Response.getStatus() : null) == GetInvitationApiV1Response.Status.Active && (num = c44303d.f415112e) != null && (getInvitationApiV1Response.getDetails() instanceof a.b)) {
                    a.b bVar2 = (a.b) getInvitationApiV1Response.getDetails();
                    double d12 = 60;
                    double dIntValue = (num.intValue() / d12) / d12;
                    String title = bVar2.getScreenDefaultValues().getTitle();
                    String description = bVar2.getScreenDefaultValues().getDescription();
                    g image = bVar2.getScreenDefaultValues().getImage();
                    bVar = new InterfaceC44304e.c(title, description, image != null ? new C39608a(image.getLightImage(), image.getDarkImage()) : null, dIntValue, dIntValue > 6.0d ? CounterColor.f327036c : dIntValue >= 1.0d ? CounterColor.f327037d : CounterColor.f327038e, c44303d.f415117j, c44303d.f415111d);
                } else {
                    GetInvitationApiV1Response.Status status = getInvitationApiV1Response != null ? getInvitationApiV1Response.getStatus() : null;
                    GetInvitationApiV1Response.Status status2 = GetInvitationApiV1Response.Status.Outdated;
                    boolean z12 = c44303d.f415111d;
                    if (status == status2 && (getInvitationApiV1Response.getDetails() instanceof a.c)) {
                        a.c cVar = (a.c) getInvitationApiV1Response.getDetails();
                        String title2 = cVar.getScreenDefaultValues().getTitle();
                        String description2 = cVar.getScreenDefaultValues().getDescription();
                        g image2 = cVar.getScreenDefaultValues().getImage();
                        bVar = new InterfaceC44304e.b(title2, description2, image2 != null ? new C39608a(image2.getLightImage(), image2.getDarkImage()) : null, z12);
                    } else {
                        if ((getInvitationApiV1Response != null ? getInvitationApiV1Response.getStatus() : null) == GetInvitationApiV1Response.Status.Rejected && (getInvitationApiV1Response.getDetails() instanceof a.d)) {
                            a.d dVar = (a.d) getInvitationApiV1Response.getDetails();
                            String title3 = dVar.getScreenDefaultValues().getTitle();
                            String description3 = dVar.getScreenDefaultValues().getDescription();
                            g image3 = dVar.getScreenDefaultValues().getImage();
                            bVar = new InterfaceC44304e.b(title3, description3, image3 != null ? new C39608a(image3.getLightImage(), image3.getDarkImage()) : null, z12);
                        } else {
                            if ((getInvitationApiV1Response != null ? getInvitationApiV1Response.getStatus() : null) == GetInvitationApiV1Response.Status.Withdrawn && (getInvitationApiV1Response.getDetails() instanceof a.e)) {
                                a.e eVar = (a.e) getInvitationApiV1Response.getDetails();
                                String title4 = eVar.getScreenDefaultValues().getTitle();
                                String description4 = eVar.getScreenDefaultValues().getDescription();
                                g image4 = eVar.getScreenDefaultValues().getImage();
                                bVar = new InterfaceC44304e.b(title4, description4, image4 != null ? new C39608a(image4.getLightImage(), image4.getDarkImage()) : null, z12);
                            } else {
                                V2.f318762a.d("InviteScreen", "unknown viewstate for " + c44303d);
                                interfaceC44304e = InterfaceC44304e.f.f415133a;
                            }
                        }
                    }
                }
                interfaceC44304e2 = bVar;
                return C44303d.a(c44303d, null, null, false, null, false, false, false, false, false, interfaceC44304e2, 511);
            }
            interfaceC44304e = InterfaceC44304e.f.f415133a;
        }
        interfaceC44304e2 = interfaceC44304e;
        return C44303d.a(c44303d, null, null, false, null, false, false, false, false, false, interfaceC44304e2, 511);
    }
}
