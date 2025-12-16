package lw;

import Y61.k;
import Y61.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.deep_linking.links.ConsultationStartLink;
import com.avito.android.remote.model.AnalyticsData;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ConsultationAnalyticsInteractorImpl.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Llw/b;", "Llw/a;", "_avito_developments-advice_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: lw.b, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C43837b implements InterfaceC43836a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final InterfaceC28373a f414242a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f414243b;

    @Inject
    public C43837b(@k InterfaceC28373a interfaceC28373a, @k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f414242a = interfaceC28373a;
        this.f414243b = aVar;
    }

    @Override // lw.InterfaceC43836a
    public final void a(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9, @l String str10, @l String str11, @l String str12) {
        this.f414242a.c(new C43840e(str, str2, str3, str4, str5, str6, str7, str8, str9, str10, str11, str12));
    }

    @Override // lw.InterfaceC43836a
    public final void b(@k ConsultationStartLink consultationStartLink) {
        AnalyticsData analyticsData = consultationStartLink.f133120g;
        c(consultationStartLink.f133115b, consultationStartLink.f133116c, consultationStartLink.f133117d, analyticsData != null ? analyticsData.getLocationId() : null, analyticsData != null ? analyticsData.getFromPage() : null, analyticsData != null ? analyticsData.getNodeType() : null, consultationStartLink.f133119f, analyticsData != null ? analyticsData.getMarketingParams() : null, consultationStartLink.f133127n);
    }

    @Override // lw.InterfaceC43836a
    public final void c(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9) {
        this.f414242a.c(new C43839d(str, str2, str3, str4, str5, str6, str7, str8, str9));
    }
}
