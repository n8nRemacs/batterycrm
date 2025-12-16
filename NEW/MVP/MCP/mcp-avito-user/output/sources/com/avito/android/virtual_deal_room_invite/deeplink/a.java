package com.avito.android.virtual_deal_room_invite.deeplink;

import com.avito.android.virtual_deal_room_invite.invite.model.InvitationArguments;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: InviteDeeplinkHandler.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes5.dex */
final class a extends N implements Y41.a<G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f326914l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ InviteDeeplink f326915m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InviteDeeplink inviteDeeplink) {
        super(0);
        this.f326914l = bVar;
        this.f326915m = inviteDeeplink;
    }

    @Override // Y41.a
    public final G0 invoke() {
        b bVar = this.f326914l;
        InviteDeeplink inviteDeeplink = this.f326915m;
        String str = inviteDeeplink.f326912b;
        String str2 = inviteDeeplink.f326913c;
        if (str2 == null) {
            str2 = "direct";
        }
        bVar.f326916f.R(bVar.f326917g.a(new InvitationArguments(str, str2)), com.avito.android.deeplink_handler.view.b.f134588l);
        return G0.f406611a;
    }
}
