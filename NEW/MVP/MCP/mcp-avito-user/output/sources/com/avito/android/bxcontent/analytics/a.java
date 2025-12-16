package com.avito.android.bxcontent.analytics;

import Nr0.InterfaceC14605a;
import com.avito.android.AnalyticParams;
import com.avito.android.analytics.event.ContactSource;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.RenderMetadata;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.l1;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;

/* compiled from: BxContentAnalyticsInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/analytics/a;", "LNr0/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a extends InterfaceC14605a {

    /* compiled from: BxContentAnalyticsInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.analytics.a$a, reason: collision with other inner class name */
    public static final class C3266a {
    }

    void A(@Y61.k List<? extends l1> list, @Y61.k String str, boolean z12, @Y61.l String str2, @Y61.k PresentationType presentationType, @Y61.l AnalyticParams analyticParams);

    void B(@Y61.k String str, @Y61.l String str2, @Y61.k ContactSource contactSource);

    void C(int i12, @Y61.k String str);

    void D();

    void E(@Y61.k PresentationType presentationType, @Y61.k String str);

    void F(@Y61.k String str, @Y61.k String str2);

    void G(@Y61.k String str, @Y61.l String str2, @Y61.l LatLngBounds latLngBounds, @Y61.l Integer num, @Y61.l Integer num2, @Y61.k PresentationType presentationType);

    void H(@Y61.k String str, int i12, @Y61.k PresentationType presentationType);

    void I(@Y61.k ArrayList arrayList);

    void K(@Y61.l String str);

    void L(int i12, @Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5);

    void M(int i12);

    void N(@Y61.l String str, @Y61.l String str2, @Y61.l ArrayList arrayList);

    void O(@Y61.k ParametrizedEvent parametrizedEvent);

    void P(@Y61.l String str, @Y61.l String str2, @Y61.k StoriesFromPage storiesFromPage);

    void Q(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l String str, @Y61.l String str2);

    void R();

    void T(@Y61.k PresentationType presentationType, @Y61.k String str);

    void U(@Y61.k String str);

    void W(@Y61.l String str);

    @Y61.k
    TreeClickStreamParent X(@Y61.k PresentationType presentationType);

    void Y(@Y61.k String str, boolean z12, @Y61.k PresentationType presentationType);

    void Z(@Y61.l String str);

    void a(@Y61.k String str, @Y61.k SearchParams searchParams, @Y61.l String str2, @Y61.l Integer num);

    void a0(@Y61.k String str, @Y61.k String str2);

    void b(@Y61.l String str, @Y61.l String str2);

    void b0(@Y61.k String str);

    void c(@Y61.k String str, @Y61.k String str2);

    void c0(@Y61.l Integer num, @Y61.k String str);

    void d(@Y61.k String str, @Y61.l String str2);

    void d0(@Y61.k String str);

    void e(@Y61.k PresentationType presentationType);

    void e0(@Y61.l RenderMetadata renderMetadata);

    void f(@Y61.k String str, @Y61.k String str2);

    void f0(@Y61.l String str, @Y61.l String str2, @Y61.k StoriesFromPage storiesFromPage);

    void g(@Y61.k String str);

    void g0(@Y61.l String str, @Y61.k String str2);

    void h();

    void h0(@Y61.k String str, @Y61.k ContactSource contactSource, @Y61.l String str2, @Y61.k PresentationType presentationType, @Y61.l ScreenIdField screenIdField, @Y61.l String str3);

    void i(@Y61.k String str);

    void i0(@Y61.l Map<String, String> map, @Y61.k SearchParams searchParams, long j12, @Y61.l SerpDisplayType serpDisplayType, @Y61.l String str, @Y61.k PresentationType presentationType, @Y61.l String str2, int i12);

    void j(@Y61.k String str);

    void j0(@Y61.l String str, @Y61.l String str2);

    void k(@Y61.k String str);

    void k0(@Y61.k String str);

    void l(@Y61.k String str);

    void m(@Y61.l Integer num, @Y61.l Integer num2, @Y61.l Integer num3, @Y61.l String str, @Y61.l String str2);

    void n(@Y61.l Integer num, @Y61.k String str, @Y61.l String str2);

    void o(@Y61.k String str);

    void p(@Y61.l String str);

    void q();

    void r();

    void s();

    void t(@Y61.k String str);

    void v(@Y61.k String str);

    void x();

    void y(@Y61.k SearchParams searchParams, @Y61.l ArrayList arrayList, boolean z12);

    void z(@Y61.k String str, @Y61.k String str2, @Y61.l RenderMetadata renderMetadata);
}
