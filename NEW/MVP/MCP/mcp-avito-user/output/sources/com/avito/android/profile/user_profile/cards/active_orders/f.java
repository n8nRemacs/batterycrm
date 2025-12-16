package com.avito.android.profile.user_profile.cards.active_orders;

import Ua0.InterfaceC15503a;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.profile.horizontal_scroll_widget.HorizontalScrollView;
import com.avito.android.profile.user_profile.cards.CardItem;
import com.avito.android.util.D6;
import com.avito.android.util.L3;
import com.avito.conveyor_item.ParcelableItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;

/* compiled from: ActiveOrdersCardPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile/user_profile/cards/active_orders/f;", "Lcom/avito/android/profile/user_profile/cards/active_orders/d;", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class f implements d {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC15503a, G0> f224655b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.konveyor.adapter.d f224656c;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public f(@Y61.k Y41.l<? super InterfaceC15503a, G0> lVar, @K3.a @Y61.k com.avito.konveyor.adapter.d dVar) {
        this.f224655b = lVar;
        this.f224656c = dVar;
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((h) eVar, (CardItem.ActiveOrdersWidgetCardItem) aVar);
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        DeepLink deepLink;
        h hVar = (h) eVar;
        CardItem.ActiveOrdersWidgetCardItem activeOrdersWidgetCardItem = (CardItem.ActiveOrdersWidgetCardItem) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof c) {
                obj = obj2;
            }
        }
        if (!(obj instanceof c)) {
            obj = null;
        }
        c cVar = (c) obj;
        if (cVar == null) {
            k(hVar, activeOrdersWidgetCardItem);
            return;
        }
        L3<String> l32 = cVar.f224647a;
        if (l32.f318649a) {
            String str = l32.f318650b;
            HorizontalScrollView widget = hVar.getWidget();
            TextView textView = widget.f222310e;
            if (str == null || str.length() == 0) {
                D6.w(textView);
                D6.w(widget.f222311f);
            } else {
                D6.H(textView);
                widget.setTitle(str);
            }
        }
        L3<String> l33 = cVar.f224648b;
        if (l33.f318649a) {
            String str2 = l33.f318650b;
            HorizontalScrollView widget2 = hVar.getWidget();
            if (str2 == null || str2.length() == 0) {
                D6.w(widget2.f222311f);
            } else {
                widget2.g();
                widget2.setBadgeText(str2);
            }
        }
        L3<List<ParcelableItem>> l34 = cVar.f224649c;
        if (l34.f318649a) {
            List<ParcelableItem> list2 = l34.f318650b;
            if (list2 == null) {
                list2 = C42784z0.f406748b;
            }
            this.f224656c.l(list2, null);
        }
        L3<DeepLink> l35 = cVar.f224650d;
        if (l35.f318649a) {
            DeepLink deepLink2 = l35.f318650b;
            String str3 = cVar.f224652f.f318650b;
            HorizontalScrollView widget3 = hVar.getWidget();
            LinearLayout linearLayout = widget3.f222313h;
            if (deepLink2 == null) {
                D6.w(linearLayout);
            } else {
                D6.H(linearLayout);
                widget3.setActionButtonText(str3);
                widget3.setOnActionButtonClickListener(new e(this, deepLink2));
            }
        }
        L3<DeepLink> l36 = cVar.f224651e;
        if (!l36.f318649a || (deepLink = l36.f318650b) == null || (deepLink instanceof NoMatchLink)) {
            return;
        }
        this.f224655b.invoke(new InterfaceC15503a.C1130a(deepLink, false));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3, types: [java.lang.Object, java.util.List] */
    public final void k(@Y61.k h hVar, @Y61.k CardItem.ActiveOrdersWidgetCardItem activeOrdersWidgetCardItem) {
        HorizontalScrollView widget = hVar.getWidget();
        DeepLink deepLink = activeOrdersWidgetCardItem.f224298g;
        if (deepLink != null && !(deepLink instanceof NoMatchLink)) {
            this.f224655b.invoke(new InterfaceC15503a.C1130a(deepLink, false));
        }
        Badge badge = widget.f222311f;
        TextView textView = widget.f222310e;
        String str = activeOrdersWidgetCardItem.f224295d;
        if (str == null || str.length() == 0) {
            D6.w(textView);
            D6.w(badge);
        } else {
            D6.H(textView);
            widget.setTitle(str);
        }
        String str2 = activeOrdersWidgetCardItem.f224296e;
        if (str2 == null || str2.length() == 0) {
            D6.w(badge);
        } else {
            widget.g();
            widget.setBadgeText(str2);
        }
        LinearLayout linearLayout = widget.f222313h;
        DeepLink deepLink2 = activeOrdersWidgetCardItem.f224297f;
        if (deepLink2 == null) {
            D6.w(linearLayout);
        } else {
            D6.H(linearLayout);
            widget.setActionButtonText(activeOrdersWidgetCardItem.f224300i);
            widget.setOnActionButtonClickListener(new e(this, deepLink2));
        }
        RecyclerView recyclerView = widget.f222312g;
        com.avito.konveyor.adapter.d dVar = this.f224656c;
        recyclerView.setAdapter(dVar);
        dVar.l(activeOrdersWidgetCardItem.f224299h, null);
    }
}
