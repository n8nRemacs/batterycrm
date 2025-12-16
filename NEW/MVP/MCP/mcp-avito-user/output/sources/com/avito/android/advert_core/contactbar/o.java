package com.avito.android.advert_core.contactbar;

import Hd.AbstractC13978b;
import Ju.InterfaceC14249c;
import com.avito.android.authorization.AuthSource;
import com.avito.android.contact_access.links.ContactsPackagesApplyLink;
import com.avito.android.cv_validation_bottom_sheet.deeplink.CvValidationLink;
import com.avito.android.deep_linking.links.CreateChannelLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.auth.AuthenticateLink;
import com.avito.android.deeplink.JobApplyCreateLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.iac_outgoing_call_ability.public_module.deep_link.launch_dialer.IacStartNewCallLink;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kv.C43501a;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: AdvertContactsPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "resultEvent", "Lkotlin/G0;", "invoke", "(Lkv/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes10.dex */
final class o extends N implements Y41.l<C43501a, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C28266e f83240l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public o(C28266e c28266e) {
        super(1);
        this.f83240l = c28266e;
    }

    /* JADX WARN: Type inference failed for: r13v11, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // Y41.l
    public final G0 invoke(C43501a c43501a) {
        InterfaceC14249c interfaceC14249c = c43501a.f413261b;
        boolean z12 = interfaceC14249c instanceof IacStartNewCallLink.b.C4990b;
        C28266e c28266e = this.f83240l;
        if (z12) {
            c28266e.f83184a0 = true;
            c28266e.f83186b0 = System.currentTimeMillis();
        } else if (interfaceC14249c instanceof AbstractC13978b.C0428b) {
            DeepLink deepLinkG = ((AbstractC13978b.C0428b) interfaceC14249c).f7561b;
            if (deepLinkG instanceof AuthenticateLink) {
                AuthenticateLink authenticateLink = (AuthenticateLink) deepLinkG;
                if (authenticateLink.f133883b == null) {
                    AuthSource authSource = AuthSource.f92694c;
                    deepLinkG = AuthenticateLink.g(authenticateLink);
                }
            }
            c28266e.a(deepLinkG);
        } else if (interfaceC14249c instanceof ContactsPackagesApplyLink.b.c) {
            c28266e.f83196g0.invoke();
        } else if (interfaceC14249c instanceof ContactsPackagesApplyLink.b.C3746b) {
            b.a.a(c28266e.f83208n, ((ContactsPackagesApplyLink.b.C3746b) interfaceC14249c).f126156b, null, null, 6);
        } else if (interfaceC14249c instanceof JobApplyCreateLink.b.a) {
            c28266e.mb(((JobApplyCreateLink.b.a) interfaceC14249c).f134084b);
        } else if (interfaceC14249c instanceof JobApplyCreateLink.b.C4032b) {
            b.a.a(c28266e.f83208n, ((JobApplyCreateLink.b.C4032b) interfaceC14249c).f134085b, null, null, 6);
        } else if (interfaceC14249c instanceof CvValidationLink.b.C3943b) {
            c28266e.mb(new CreateChannelLink(((CvValidationLink.b.C3943b) interfaceC14249c).f131799b, null, null, null, false, false, null, WebSocketProtocol.PAYLOAD_SHORT, null));
        } else if (!(interfaceC14249c instanceof InterfaceC14249c.a)) {
            boolean z13 = interfaceC14249c instanceof InterfaceC14249c.b;
        }
        return G0.f406611a;
    }
}
