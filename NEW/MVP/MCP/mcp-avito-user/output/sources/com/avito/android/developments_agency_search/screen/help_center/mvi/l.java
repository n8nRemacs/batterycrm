package com.avito.android.developments_agency_search.screen.help_center.mvi;

import Gw.b;
import Gw.c;
import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.arch.mvi.t;
import com.avito.android.deep_linking.links.ChannelDetailsLink;
import com.avito.android.deep_linking.links.HelpCenterShowLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.external_apps.deep_linking.SendEmailLink;
import com.avito.android.realty_agency.beduin.TariffCardParentScreen;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: HelpCenterOneTimeEventProducer.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/help_center/mvi/l;", "Lcom/avito/android/arch/mvi/t;", "LGw/b;", "LGw/c;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class l implements t<Gw.b, Gw.c> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.realty_agency.beduin.a f138036b;

    @Inject
    public l(@Y61.k com.avito.android.realty_agency.beduin.a aVar) {
        this.f138036b = aVar;
    }

    @Override // com.avito.android.arch.mvi.t
    public final Gw.c b(Gw.b bVar) {
        Gw.b bVar2 = bVar;
        if (bVar2 instanceof b.i) {
            return new c.C0385c(((b.i) bVar2).f6792a);
        }
        if (bVar2 instanceof b.C0383b) {
            return c.a.f6794a;
        }
        if (bVar2 instanceof b.h) {
            return new c.b(this.f138036b.g(TariffCardParentScreen.f250867d, ((b.h) bVar2).f6791a));
        }
        if (bVar2 instanceof b.f) {
            return new c.b(new WebViewLink.OnlyAvitoDomain(Uri.parse("https://www.avito.ru/realestate/novostroyki/podbor_novostroek"), null, null, 6, null));
        }
        if (bVar2 instanceof b.a) {
            return new c.b(new PhoneLink.Call(((b.a) bVar2).f6784a, null, 2, null));
        }
        if (bVar2 instanceof b.e) {
            ((b.e) bVar2).getClass();
            return new c.b(new SendEmailLink("nd.support@avito.ru", null, null));
        }
        if (bVar2 instanceof b.g) {
            return new c.b(new HelpCenterShowLink());
        }
        if (bVar2 instanceof b.d) {
            return new c.b(new ChannelDetailsLink(((b.d) bVar2).f6788a, null, 2, null));
        }
        return null;
    }
}
