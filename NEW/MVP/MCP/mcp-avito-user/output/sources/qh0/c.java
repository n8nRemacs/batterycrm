package qH0;

import Y61.k;
import Y61.l;
import com.avito.android.advert_core.analytics.flats_groups.FlatsButtonClickEvent;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertParameters;
import fH0.AbstractC40291a;
import fH0.InterfaceC40292b;
import javax.inject.Inject;
import kotlin.Metadata;
import qH0.InterfaceC47297b;

/* compiled from: MyAdvertParameterDelegate.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"LqH0/c;", "LfH0/a;", "LqH0/a;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class c extends AbstractC40291a implements InterfaceC47296a {

    /* renamed from: d, reason: collision with root package name */
    @k
    public final InterfaceC28373a f429151d;

    @Inject
    public c(@k InterfaceC28373a interfaceC28373a) {
        this.f429151d = interfaceC28373a;
    }

    @Override // qH0.InterfaceC47296a
    public final void S1(@k DeepLink deepLink) {
        this.f395801b.accept(new InterfaceC40292b.a(deepLink));
    }

    @Override // qH0.InterfaceC47296a
    public final void w(@k AdvertParameters.Button button, @k String str, @l String str2) {
        DeepLink deepLink = button.getDeepLink();
        AdvertParameters.Button.Description description = button.getDescription();
        this.f429151d.c(new FlatsButtonClickEvent(str, FlatsButtonClickEvent.FromPage.f82822d, str2));
        com.jakewharton.rxrelay3.c<InterfaceC40292b> cVar = this.f395801b;
        if (deepLink != null) {
            cVar.accept(new InterfaceC40292b.a(deepLink));
        } else if (description != null) {
            cVar.accept(new InterfaceC47297b.a(description));
        }
    }
}
