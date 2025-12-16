package com.avito.android.publish.analytics;

import Cd0.C;
import Cd0.C13290x;
import Cd0.C13292z;
import Cd0.E;
import com.avito.android.analytics.events.j;
import com.avito.android.error_reporting.non_fatal.NonFatalErrorEvent;
import com.avito.android.publish.O0;
import com.avito.android.publish.analytics.events.AddressChoiceType;
import com.avito.android.publish.analytics.events.CommissionInfoSeenEvent;
import com.avito.android.remote.model.AdvertisementCategoryAlias;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.base.ParameterSlot;
import com.avito.android.remote.model.search.suggest.SuggestAnalyticsEvent;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: PublishEventTracker.kt */
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t¨\u0006\n"}, d2 = {"Lcom/avito/android/publish/analytics/v;", "Lcom/avito/android/publish/analytics/h;", "Lcom/avito/android/publish/analytics/s;", "Lcom/avito/android/publish/analytics/p;", "Lcom/avito/android/publish/analytics/Y;", "Lcom/avito/android/publish/analytics/b0;", "Lcom/avito/android/publish/analytics/e0;", "Lcom/avito/android/publish/analytics/y;", "Lcom/avito/android/publish/analytics/P;", "Lcom/avito/android/publish/analytics/B;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.publish.analytics.v, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
public interface InterfaceC33535v extends InterfaceC33522h, InterfaceC33532s, InterfaceC33530p, Y, b0, e0, InterfaceC33538y, P, B {

    /* compiled from: PublishEventTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.publish.analytics.v$a */
    public static final class a {
        public static /* synthetic */ void a(InterfaceC33535v interfaceC33535v, String str, String str2, int i12) {
            if ((i12 & 2) != 0) {
                str2 = null;
            }
            interfaceC33535v.o0(str, str2);
        }

        public static /* synthetic */ void b(InterfaceC33535v interfaceC33535v, String str, Throwable th2, int i12) {
            if ((i12 & 2) != 0) {
                th2 = null;
            }
            interfaceC33535v.r(str, th2, NonFatalErrorEvent.a.c.f147934a);
        }
    }

    void A0(@Y61.k C13290x.a aVar);

    void B0();

    void C(@Y61.l Integer num, @Y61.k O0 o02);

    void C0(@Y61.l Integer num);

    void D();

    void E();

    void E0();

    void F0(@Y61.l ArrayList arrayList, @Y61.k Navigation navigation2, @Y61.l String str);

    void G(float f12, @Y61.k CommissionInfoSeenEvent.Source source);

    void G0(boolean z12);

    void H(@Y61.k String str);

    void J();

    void K(@Y61.k Navigation navigation2);

    void L0(@Y61.k String str);

    void M();

    void N(@Y61.k E.a aVar);

    void O(@Y61.k Navigation navigation2, @Y61.k String str, @Y61.k String str2, @Y61.l String str3);

    void P(@Y61.k String str);

    void Q(@Y61.l Boolean bool);

    void R(@Y61.k Navigation navigation2, @Y61.k String str);

    void U();

    void c0(boolean z12);

    void d(@Y61.k String str);

    void d0();

    void e0(@Y61.l Integer num);

    void g(@Y61.k C.a aVar);

    void h0();

    void i(int i12, @Y61.k String str, @Y61.l String str2, @Y61.k String str3);

    void i0(@Y61.k AdvertisementCategoryAlias advertisementCategoryAlias);

    void j(@Y61.k String str);

    void j0();

    void k0(@Y61.k String str, @Y61.k ParameterSlot parameterSlot, @Y61.k Navigation navigation2, @Y61.l String str2, @Y61.l String str3);

    void l0();

    void m();

    void n0(@Y61.k AddressChoiceType addressChoiceType, @Y61.k AddressParameter.Value value);

    void o();

    void o0(@Y61.l String str, @Y61.l String str2);

    void p();

    void p0();

    void q();

    void r(@Y61.k String str, @Y61.l Throwable th2, @Y61.k NonFatalErrorEvent.a aVar);

    void r0();

    void u(@Y61.k C13292z.a aVar);

    void u0(boolean z12);

    void v0(@Y61.k AddressChoiceType addressChoiceType);

    void w(@Y61.l Integer num);

    void w0(@Y61.k SuggestAnalyticsEvent suggestAnalyticsEvent);

    void x(@Y61.k j.a aVar);

    void y(@Y61.k String str, @Y61.l String str2);

    void y0(@Y61.k Navigation navigation2);

    void z(@Y61.l Integer num);

    void z0(int i12);
}
