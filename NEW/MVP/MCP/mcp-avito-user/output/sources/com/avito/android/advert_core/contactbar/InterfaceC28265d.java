package com.avito.android.advert_core.contactbar;

import android.os.Bundle;
import android.os.Parcelable;
import com.avito.android.advert_core.sellerprofile.ShowSellersProfileSource;
import com.avito.android.component.advert_contact_bar.ContactBar;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PhoneLink;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertDetails;
import com.avito.android.remote.model.ContactsPosition;
import com.avito.android.remote.model.advert_details.ContactBarData;
import com.avito.android.remote.model.text.AttributedText;
import j.K;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: AdvertContactsPresenter.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/contactbar/d;", "LS9/a;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.advert_core.contactbar.d, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public interface InterfaceC28265d extends S9.a {

    /* compiled from: AdvertContactsPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert_core.contactbar.d$a */
    public static final class a {
        public static void a(InterfaceC28265d interfaceC28265d, w wVar, ContactBarData contactBarData, List list) {
            interfaceC28265d.vb(wVar, contactBarData, list, C42784z0.f406748b, null);
        }
    }

    @Y61.k
    Bundle H();

    @Y61.k
    /* renamed from: Ma */
    com.jakewharton.rxrelay3.c getF83200i0();

    void Na(@Y61.k ShowSellersProfileSource showSellersProfileSource);

    void Oa(@Y61.k List<? extends ContactBar.InfoStickyBlock> list, @Y61.k AdvertDetails advertDetails);

    boolean Pa();

    @Y61.k
    /* renamed from: Q1 */
    com.jakewharton.rxrelay3.c getF83206l0();

    void Qa(@Y61.k com.avito.android.advert_core.advert.b bVar);

    void R1(boolean z12);

    void Ra(@Y61.l String str);

    void Sa(@Y61.k String str);

    @Y61.k
    /* renamed from: Ta */
    com.jakewharton.rxrelay3.c getF83157A();

    @Y61.k
    List<ContactBar.Button> Ua();

    @Y61.k
    List<ContactBar.InfoStickyBlock> Va();

    void Wa();

    void Xa();

    /* renamed from: Ya */
    boolean getF83165I();

    void Za(@Y61.k w wVar);

    void ab(@Y61.k AdvertDetails advertDetails);

    void b(@Y61.l Bundle bundle);

    void bb(@Y61.l com.avito.android.advert_core.advert.c cVar);

    @Y61.k
    /* renamed from: cb */
    com.jakewharton.rxrelay3.c getF83159C();

    void db();

    void e0();

    void eb(@Y61.k AdvertDetails advertDetails);

    void fb(@Y61.l w wVar, @Y61.l ContactBarData contactBarData);

    void g0(@Y61.l String str);

    void gb(@Y61.k AdvertDetails advertDetails);

    @Y61.l
    /* renamed from: getPosition */
    ContactsPosition getF83162F();

    @Y61.l
    /* renamed from: getTitle */
    AttributedText getF83161E();

    @Y61.k
    /* renamed from: hb */
    com.jakewharton.rxrelay3.c getF83160D();

    void ib(@Y61.k Y41.a<G0> aVar);

    void jb(@Y61.k AdvertDetails advertDetails);

    void k0(@Y61.l Parcelable parcelable);

    void mb(@Y61.k DeepLink deepLink);

    void nb(@Y61.k String str);

    void ob(@Y61.k PhoneLink phoneLink);

    void onPause();

    void onResume();

    void onStop();

    void pb();

    void qb();

    void rb();

    @Y61.k
    /* renamed from: sb */
    com.jakewharton.rxrelay3.c getF83202j0();

    @Y61.k
    List<ContactBar.Button> tb();

    void ub(@Y61.l String str);

    @K
    void vb(@Y61.l w wVar, @Y61.l ContactBarData contactBarData, @Y61.k List<? extends ContactBar.Button> list, @Y61.k List<? extends ContactBar.InfoStickyBlock> list2, @Y61.l ContactBar.b bVar);

    void wb(@Y61.l AdvertActions advertActions);

    void xb(@Y61.k com.avito.android.credits.installments.a aVar, @Y61.k AdvertDetails advertDetails);

    void yb(@Y61.k AdvertDetails advertDetails);
}
