package com.avito.android.photo_gallery.nav_bar;

import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.advert_core.analytics.sharing.a;
import com.avito.android.analytics.provider.clickstream.ScreenIdField;
import com.avito.android.analytics.provider.clickstream.TreeClickStreamParent;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.AdvertSharing;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import i9.o;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.C43259k;

/* compiled from: PhotoGalleryNavBarDelegate.kt */
@Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
final /* synthetic */ class d extends H implements Y41.l<Integer, G0> {
    /* JADX WARN: Type inference failed for: r3v15, types: [T, android.widget.PopupWindow] */
    public final void f(int i12) {
        PhotoGalleryNavBarFeatures photoGalleryNavBarFeatures;
        PhotoGalleryNavBarShareFeature photoGalleryNavBarShareFeature;
        AdvertSharing advertSharing;
        DeepLink deepLink;
        a aVar = (a) this.receiver;
        k kVar = (k) C42745f0.K(i12, aVar.f217543v);
        if (kVar == null) {
            return;
        }
        int iOrdinal = kVar.f217565b.ordinal();
        ViewGroup viewGroup = null;
        if (iOrdinal == 0) {
            String str = aVar.f217539r.f217512b;
            if (str == null) {
                return;
            }
            C43259k.d(aVar.f217534m, aVar.f217529h.b(), null, new h(aVar, str, null), 2);
            return;
        }
        if (iOrdinal == 1) {
            PhotoGalleryNavBar photoGalleryNavBar = aVar.f217539r.f217516f;
            if (photoGalleryNavBar == null || (photoGalleryNavBarFeatures = photoGalleryNavBar.f217474d) == null || (photoGalleryNavBarShareFeature = photoGalleryNavBarFeatures.f217497c) == null || (advertSharing = photoGalleryNavBarShareFeature.f217506b) == null) {
                return;
            }
            String strB = C35800g5.b((C35792f5) aVar.f217542u.getValue());
            PhotoGalleryNavBarState photoGalleryNavBarState = aVar.f217539r;
            if (photoGalleryNavBarState.f217518h == 0) {
                aVar.f217539r = PhotoGalleryNavBarState.a(photoGalleryNavBarState, null, null, false, false, null, null, aVar.f217536o.a(), 63);
            }
            long j12 = aVar.f217539r.f217518h;
            ScreenIdField screenIdField = ScreenIdField.f90251c;
            TreeClickStreamParent treeClickStreamParent = new TreeClickStreamParent(j12, "item_gallery", null, null);
            if (aVar.f217531j.v().invoke().booleanValue()) {
                aVar.f217535n.a(photoGalleryNavBarShareFeature.f217507c, photoGalleryNavBarShareFeature.f217508d, photoGalleryNavBarShareFeature.f217509e, photoGalleryNavBarShareFeature.f217510f, strB, treeClickStreamParent);
            } else {
                a.C2455a.a(aVar.f217535n, photoGalleryNavBarShareFeature.f217507c, photoGalleryNavBarShareFeature.f217508d, photoGalleryNavBarShareFeature.f217510f, photoGalleryNavBarShareFeature.f217509e, strB, 32);
            }
            String url = advertSharing.getNative();
            if (url == null) {
                url = advertSharing.getUrl();
            }
            aVar.f217522a.startActivityForResult(Intent.createChooser(aVar.f217532k.d(url, photoGalleryNavBarShareFeature.f217511g), aVar.f217533l.getString(R.string.photo_gallery_share)), 10);
            return;
        }
        if (iOrdinal == 2) {
            aVar.e();
            return;
        }
        if (iOrdinal != 3) {
            if (iOrdinal == 4 && (deepLink = kVar.f217569f) != null) {
                b.a.a(aVar.f217528g, deepLink, null, null, 6);
                return;
            }
            return;
        }
        NavBar navBar = aVar.f217537p;
        if (navBar != null) {
            new n();
            List<PhotoGalleryNavBarDropdownMenuItem> list = aVar.f217539r.f217513c;
            g gVar = new g(aVar);
            l0.h hVar = new l0.h();
            LayoutInflater layoutInflaterFrom = LayoutInflater.from(navBar.getContext());
            View viewInflate = layoutInflaterFrom.inflate(R.layout.photo_gallery_navbar_popup, (ViewGroup) null);
            LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.popup_list_view);
            for (PhotoGalleryNavBarDropdownMenuItem photoGalleryNavBarDropdownMenuItem : list) {
                m mVar = new m(hVar, gVar, photoGalleryNavBarDropdownMenuItem);
                View viewInflate2 = layoutInflaterFrom.inflate(R.layout.photo_gallery_navbar_popup_item, viewGroup, false);
                TextView textView = (TextView) viewInflate2.findViewById(R.id.toolbar_popup_item_icon);
                TextView textView2 = (TextView) viewInflate2.findViewById(R.id.toolbar_popup_item_text);
                viewInflate2.setOnClickListener(new com.avito.android.mortgage.root.list.items.legacy_status.i(23, mVar));
                Integer num = photoGalleryNavBarDropdownMenuItem.f217490c;
                if (num != null) {
                    FV.a.a(FV.a.f4720a, textView, Integer.valueOf(num.intValue()));
                }
                PrintableText printableText = photoGalleryNavBarDropdownMenuItem.f217491d;
                textView2.setText(printableText != null ? printableText.k0(viewInflate2.getContext()) : null);
                linearLayout.addView(viewInflate2);
                viewGroup = null;
            }
            ?? popupWindow = new PopupWindow(viewInflate, -2, -2, true);
            hVar.f406842b = popupWindow;
            popupWindow.showAsDropDown(navBar, 0, 0, 8388613);
            String str2 = aVar.f217539r.f217512b;
            if (str2 == null) {
                str2 = "";
            }
            ScreenIdField screenIdField2 = ScreenIdField.f90251c;
            aVar.f217525d.c(new o(str2, "item_gallery"));
        }
    }

    @Override // Y41.l
    public final /* bridge */ /* synthetic */ G0 invoke(Integer num) {
        f(num.intValue());
        return G0.f406611a;
    }
}
