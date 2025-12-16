package tH0;

import Y61.k;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.external_apps.deep_linking.SendEmailLink;
import com.avito.android.user_advert.advert.InterfaceC35384d1;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: RejectReasonPresenterDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LtH0/b;", "LtH0/a;", "LfH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: tH0.b, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C48557b extends AbstractC40291a implements InterfaceC48556a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC35384d1 f439219d;

    @Inject
    public C48557b(@k InterfaceC35384d1 interfaceC35384d1) {
        this.f439219d = interfaceC35384d1;
    }

    @Override // tH0.InterfaceC48556a
    public final void N(@k DeepLink deepLink) {
        boolean z12 = deepLink instanceof SendEmailLink;
        com.jakewharton.rxrelay3.c<InterfaceC40292b> cVar = this.f395801b;
        if (!z12) {
            cVar.accept(new InterfaceC40292b.a(deepLink));
            return;
        }
        SendEmailLink sendEmailLink = (SendEmailLink) deepLink;
        String strI = this.f439219d.i();
        String str = sendEmailLink.f155028d;
        if (str == null) {
            str = "";
        }
        cVar.accept(new InterfaceC40292b.a(new SendEmailLink(sendEmailLink.f155026b, sendEmailLink.f155027c, strI.concat(str))));
    }
}
