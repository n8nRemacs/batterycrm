package lO0;

import Y61.k;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.virtual_deal_room_invite.invite.model.InvitationArguments;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;

/* compiled from: InviteAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LlO0/b;", "LlO0/a;", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lO0.b, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C43665b implements InterfaceC43664a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f413732a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InvitationArguments f413733b;

    @Inject
    public C43665b(@k InterfaceC28373a interfaceC28373a, @k InvitationArguments invitationArguments) {
        this.f413732a = interfaceC28373a;
        this.f413733b = invitationArguments;
    }

    @Override // lO0.InterfaceC43664a
    public final void a(@k String str) {
        this.f413732a.c(new ParametrizedClickStreamEvent(16023, 0, P0.g(new Q("rre_trx_vdr_invitation_active_state", str), new Q("from_page", this.f413733b.f327043c)), null, 8, null));
    }

    @Override // lO0.InterfaceC43664a
    public final void b() {
        this.f413732a.c(new com.avito.android.analytics.provider.clickstream.b(16022, 0));
    }

    @Override // lO0.InterfaceC43664a
    public final void c() {
        this.f413732a.c(new com.avito.android.analytics.provider.clickstream.b(16021, 0));
    }

    @Override // lO0.InterfaceC43664a
    public final void d() {
        this.f413732a.c(new com.avito.android.analytics.provider.clickstream.b(16020, 0));
    }
}
