package com.avito.android.advert.item.beduin.v2.favorite;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.LinearLayout;
import androidx.appcompat.view.menu.n;
import androidx.appcompat.widget.C19960l0;
import com.avito.android.R;
import com.avito.android.SxAddressDeleteLink;
import com.avito.android.SxAddressEditLink;
import com.avito.android.SxAddressVideoVerificationLink;
import com.avito.android.advert_core.analytics.address.GeoFromBlock;
import com.avito.android.advert_details_items.address.f;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.a0;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.DetailsSheetButton;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.details_sheet.DetailsSheetActivity;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemCheckmark;
import com.avito.android.lib.design.picker.Picker;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.Coordinates;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.RouteButtons;
import com.avito.android.sx_address.list.domain.AddressItem;
import com.avito.android.util.p6;
import com.avito.android.widget_filters.ui.items.guests.i;
import com.avito.android.widget_filters.ui.items.guests.m;
import com.google.android.material.internal.CheckableImageButton;
import com.yandex.div.core.InterfaceC37915j;
import com.yandex.div.core.view2.C38029k;
import com.yandex.div.core.view2.divs.C37955g;
import com.yandex.div.internal.widget.menu.c;
import com.yandex.div2.DivAction;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import n11.RunnableC44167a;
import ry.DialogC47939a;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f73311b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f73312c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f73313d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f73314e;

    /* renamed from: f, reason: collision with root package name */
    public final /* synthetic */ Object f73315f;

    /* renamed from: g, reason: collision with root package name */
    public final /* synthetic */ Object f73316g;

    public /* synthetic */ a(f.b bVar, String str, Coordinates coordinates, String str2, RouteButtons routeButtons) {
        this.f73311b = 1;
        this.f73313d = bVar;
        this.f73312c = str;
        this.f73314e = coordinates;
        this.f73315f = str2;
        this.f73316g = routeButtons;
    }

    /* JADX WARN: Type inference failed for: r6v11, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r7v0, types: [java.lang.Object, java.util.List] */
    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Bundle bundle;
        Object obj = this.f73313d;
        Object obj2 = this.f73315f;
        final ?? r72 = this.f73316g;
        Object obj3 = this.f73314e;
        Object obj4 = this.f73312c;
        switch (this.f73311b) {
            case 0:
                CheckableImageButton checkableImageButton = (CheckableImageButton) obj;
                checkableImageButton.setChecked(!checkableImageButton.f356716b);
                ((d) obj3).f73322m.Ld(new c((String) obj4, (AdvertisementVerticalAlias) obj2, (j) r72, checkableImageButton), null);
                return;
            case 1:
                int i12 = com.avito.android.advert_details_items.address.g.f84444g;
                GeoFromBlock geoFromBlock = GeoFromBlock.f82789c;
                ((f.b) obj).j0((String) obj4, (Coordinates) obj3, (String) obj2, (RouteButtons) r72);
                return;
            case 2:
                int i13 = DetailsSheetActivity.f135920s;
                DetailsSheetButton detailsSheetButton = (DetailsSheetButton) obj;
                ParametrizedEvent clickEvent = detailsSheetButton.getClickEvent();
                ParametrizedClickStreamEvent parametrizedClickStreamEventA = clickEvent != null ? a0.a(clickEvent) : (ParametrizedClickStreamEvent) obj3;
                DetailsSheetActivity detailsSheetActivity = (DetailsSheetActivity) obj2;
                if (parametrizedClickStreamEventA != null) {
                    InterfaceC28373a interfaceC28373a = detailsSheetActivity.f135924p;
                    (interfaceC28373a != null ? interfaceC28373a : null).c(parametrizedClickStreamEventA);
                }
                if (detailsSheetButton.getDeeplink() != null) {
                    detailsSheetActivity.setResult(1, ((Intent) obj4).putExtra("extra_details_sheet_deeplink", detailsSheetButton.getDeeplink()));
                }
                ((com.avito.android.lib.design.bottom_sheet.d) r72).r();
                return;
            case 3:
                AddressItem.AddressListItemBottomSheetButtonsItem addressListItemBottomSheetButtonsItem = (AddressItem.AddressListItemBottomSheetButtonsItem) obj;
                DeepLink deepLink = addressListItemBottomSheetButtonsItem.f293134d;
                com.avito.android.sx_address.list.view.g gVar = (com.avito.android.sx_address.list.view.g) obj3;
                if (deepLink != null) {
                    boolean z12 = deepLink instanceof SxAddressDeleteLink;
                    com.avito.android.sx_address.list.analytics.i iVar = gVar.f293444m;
                    if (z12) {
                        iVar.d();
                    } else if (deepLink instanceof SxAddressEditLink) {
                        iVar.g();
                    }
                }
                com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) obj4;
                if (L.f(addressListItemBottomSheetButtonsItem.f293135e, Boolean.TRUE)) {
                    if (deepLink != null) {
                        gVar.f293425E.K5(deepLink);
                    }
                    dVar.r();
                    return;
                }
                gVar.f293424D.K5(G0.f406611a);
                dVar.r();
                if (deepLink != null) {
                    if ((deepLink instanceof SxAddressVideoVerificationLink ? (Button) obj2 : null) != null) {
                        SxAddressVideoVerificationLink.a aVar = SxAddressVideoVerificationLink.f67564c;
                        AddressItem.LocalizedStatus localizedStatus = ((AddressItem) r72).f293126g;
                        String strName = localizedStatus.f293136b.name();
                        aVar.getClass();
                        bundle = new Bundle();
                        bundle.putParcelable("sx_address_video_verification_arguments_key", new SxAddressVideoVerificationLink.Arguments(strName, localizedStatus.f293138d));
                    } else {
                        bundle = null;
                    }
                    b.a.a(gVar.f293439h, deepLink, null, bundle, 2);
                    return;
                }
                return;
            case 4:
                m mVar = (m) obj;
                com.avito.android.widget_filters.ui.items.guests.d dVar2 = mVar.f330459r;
                if (dVar2 != null) {
                    dVar2.dismiss();
                }
                final Y41.l<? super NP0.a, G0> lVar = mVar.f330462u;
                Context context = mVar.f330443b;
                final com.avito.android.widget_filters.ui.items.guests.d dVar3 = new com.avito.android.widget_filters.ui.items.guests.d(context, 0, 2, null);
                dVar3.setContentView(R.layout.widget_filters_guests_widget_children_picker_dialog_layout);
                com.avito.android.lib.design.bottom_sheet.d.I(dVar3, true);
                com.avito.android.lib.design.bottom_sheet.d.M(dVar3, ((PrintableText) obj3).k0(context), true, false, 10);
                dVar3.y(R.drawable.ic_back_24);
                final Picker picker = (Picker) dVar3.findViewById(R.id.guests_widget_children_picker);
                Button button = (Button) dVar3.findViewById(R.id.guests_widget_children_select_button);
                Iterable iterable = (Iterable) r72;
                ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
                int i14 = 0;
                for (Object obj5 : iterable) {
                    int i15 = i14 + 1;
                    if (i14 < 0) {
                        C42745f0.H0();
                        throw null;
                    }
                    arrayList.add(new com.avito.android.lib.design.picker.k(Integer.valueOf(i14), ((NP0.a) obj5).f11419b.k0(context)));
                    i14 = i15;
                }
                Iterator it = r72.iterator();
                int i16 = 0;
                while (true) {
                    if (!it.hasNext()) {
                        i16 = -1;
                    } else if (!L.f(((NP0.a) it.next()).f11418a, (String) obj4)) {
                        i16++;
                    }
                }
                if (picker != null) {
                    Picker.d(picker, arrayList, new com.avito.android.lib.design.picker.m(null, false, -1, 1, null), 12);
                    if (i16 >= 0) {
                        picker.setFirstWheelValue((com.avito.android.lib.design.picker.k) arrayList.get(i16));
                    }
                }
                if (button != null) {
                    button.setText(((PrintableText) obj2).k0(context));
                    button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.widget_filters.ui.items.guests.c
                        /* JADX WARN: Multi-variable type inference failed */
                        /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, java.util.List] */
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view2) {
                            com.avito.android.lib.design.picker.k<?> firstWheelValue;
                            int i17 = d.f330409E;
                            Picker picker2 = picker;
                            Integer num = (picker2 == null || (firstWheelValue = picker2.getFirstWheelValue()) == null) ? null : firstWheelValue.f180046a;
                            Integer num2 = num instanceof Integer ? num : null;
                            if (num2 != null) {
                                int iIntValue = num2.intValue();
                                Y41.l lVar2 = lVar;
                                if (lVar2 != null) {
                                    ((i.c) lVar2).invoke(r72.get(iIntValue));
                                }
                            }
                            dVar3.dismiss();
                        }
                    });
                }
                mVar.f330459r = dVar3;
                com.avito.android.lib.util.g.a(dVar3);
                return;
            case 5:
                C37955g c37955g = (C37955g) obj;
                c37955g.f368382b.getClass();
                InterfaceC37915j interfaceC37915j = InterfaceC37915j.f367563a;
                c37955g.f368383c.a((DivAction) obj2, ((C38029k) obj3).getExpressionResolver());
                View view2 = (View) obj4;
                C19960l0 c19960l0 = new C19960l0(view2.getContext(), view2);
                c.a aVar2 = ((com.yandex.div.internal.widget.menu.c) r72).f370322b;
                if (aVar2 != null) {
                    aVar2.a(c19960l0);
                }
                n nVar = c19960l0.f22566c;
                if (nVar.b()) {
                    return;
                }
                if (nVar.f21903e == null) {
                    throw new IllegalStateException("MenuPopupHelper cannot be used without an anchor");
                }
                nVar.e(0, 0, false, false);
                return;
            default:
                int i17 = DialogC47939a.f437267E;
                LinearLayout linearLayout = (LinearLayout) obj4;
                p6 p6Var = new p6(linearLayout);
                while (p6Var.hasNext()) {
                    View view3 = (View) p6Var.next();
                    if ((view3 instanceof ListItemCheckmark) && !view3.equals((ListItemCheckmark) obj3)) {
                        ((ListItemCheckmark) view3).setChecked(false);
                    }
                }
                ((N) obj2).invoke(Integer.valueOf(((DialogC47939a.C12603a) r72).f437269b));
                linearLayout.postDelayed(new RunnableC44167a((DialogC47939a) obj, 9), 300L);
                return;
        }
    }

    public /* synthetic */ a(m mVar, PrintableText printableText, PrintableText printableText2, List list, String str) {
        this.f73311b = 4;
        this.f73313d = mVar;
        this.f73314e = printableText;
        this.f73315f = printableText2;
        this.f73316g = list;
        this.f73312c = str;
    }

    public /* synthetic */ a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, int i12) {
        this.f73311b = i12;
        this.f73313d = obj;
        this.f73314e = obj2;
        this.f73312c = obj3;
        this.f73315f = obj4;
        this.f73316g = obj5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ a(DialogC47939a dialogC47939a, ListItemCheckmark listItemCheckmark, LinearLayout linearLayout, Y41.l lVar, DialogC47939a.C12603a c12603a) {
        this.f73311b = 6;
        this.f73313d = dialogC47939a;
        this.f73314e = listItemCheckmark;
        this.f73312c = linearLayout;
        this.f73315f = (N) lVar;
        this.f73316g = c12603a;
    }
}
