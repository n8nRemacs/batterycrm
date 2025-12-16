package com.avito.android.profile.user_profile.cards.service_booking;

import Ha0.InterfaceC13944g;
import Ua0.InterfaceC15503a;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.profile.horizontal_scroll_widget.HorizontalScrollView;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.remote.model.user_profile.items.ServiceBookingItem;
import com.avito.android.util.D6;
import com.avito.android.util.L3;
import com.avito.android.util.O2;
import com.avito.conveyor_item.ParcelableItem;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ServiceBookingCardPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/service_booking/k;", "Lcom/avito/android/profile/user_profile/cards/service_booking/h;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements h {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15503a, G0> f225481b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f225482c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public k(@Y61.k Y41.l<? super InterfaceC15503a, G0> lVar, @InterfaceC13944g @Y61.k com.avito.konveyor.adapter.d dVar) {
        this.f225481b = lVar;
        this.f225482c = dVar;
    }

    public static void O(Boolean bool, List list, m mVar) {
        if (L.f(bool, Boolean.TRUE)) {
            mVar.getWidget().setState(HorizontalScrollView.State.f222319e);
        } else if (O2.a(list)) {
            mVar.getWidget().setState(HorizontalScrollView.State.f222318d);
        } else {
            mVar.getWidget().setState(HorizontalScrollView.State.f222320f);
        }
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((m) eVar, (CardItem.ServiceBookingCardItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        String title;
        m mVar = (m) eVar;
        CardItem.ServiceBookingCardItem serviceBookingCardItem = (CardItem.ServiceBookingCardItem) aVar;
        String upperCase = null;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof o) {
                obj = obj2;
            }
        }
        if (!(obj instanceof o)) {
            obj = null;
        }
        o oVar = (o) obj;
        if (oVar == null) {
            k(mVar, serviceBookingCardItem);
            return;
        }
        HorizontalScrollView widget = mVar.getWidget();
        L3<String> l32 = oVar.f225486a;
        Badge badge = widget.f222311f;
        if (l32.f318649a) {
            String str = l32.f318650b;
            TextView textView = widget.f222310e;
            if (str == null || str.length() == 0) {
                D6.w(textView);
                D6.w(badge);
            } else {
                D6.H(textView);
                widget.setTitle(str);
            }
        }
        L3<String> l33 = oVar.f225487b;
        if (l33.f318649a) {
            mVar.getWidget().setTextStub(l33.f318650b);
        }
        L3<String> l34 = oVar.f225488c;
        if (l34.f318649a) {
            String str2 = l34.f318650b;
            if (str2 == null || str2.length() == 0) {
                D6.w(badge);
            } else {
                widget.g();
                widget.setBadgeText(str2);
            }
        }
        L3<List<ParcelableItem>> l35 = oVar.f225489d;
        if (l35.f318649a) {
            this.f225482c.l(l35.f318650b, null);
        }
        L3<ServiceBookingItem.Action> l36 = oVar.f225490e;
        if (l36.f318649a) {
            ServiceBookingItem.Action action = l36.f318650b;
            if (action != null && (title = action.getTitle()) != null) {
                upperCase = title.toUpperCase(Locale.ROOT);
            }
            com.avito.android.profile.horizontal_scroll_widget.b.a(widget, upperCase, new j(oVar, this));
        }
        L3<Boolean> l37 = oVar.f225491f;
        if (l37.f318649a) {
            O(l37.f318650b, serviceBookingCardItem.f224565i, mVar);
        }
    }

    public final void k(@Y61.k m mVar, @Y61.k CardItem.ServiceBookingCardItem serviceBookingCardItem) {
        HorizontalScrollView widget = mVar.getWidget();
        String str = serviceBookingCardItem.f224561e;
        Badge badge = widget.f222311f;
        TextView textView = widget.f222310e;
        if (str == null || str.length() == 0) {
            D6.w(textView);
            D6.w(badge);
        } else {
            D6.H(textView);
            widget.setTitle(str);
        }
        String str2 = serviceBookingCardItem.f224563g;
        if (str2 == null || str2.length() == 0) {
            D6.w(badge);
        } else {
            widget.g();
            widget.setBadgeText(str2);
        }
        com.avito.android.profile.horizontal_scroll_widget.b.a(widget, serviceBookingCardItem.f224564h.getTitle().toUpperCase(Locale.ROOT), new i(this, serviceBookingCardItem));
        mVar.getWidget().setTextStub(serviceBookingCardItem.f224562f);
        Boolean boolValueOf = Boolean.valueOf(serviceBookingCardItem.f224560d);
        List<ParcelableItem> list = serviceBookingCardItem.f224565i;
        O(boolValueOf, list, mVar);
        RecyclerView recyclerView = widget.f222312g;
        com.avito.konveyor.adapter.d dVar = this.f225482c;
        recyclerView.setAdapter(dVar);
        dVar.l(list, null);
    }
}
