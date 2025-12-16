package com.avito.android.advert.advert_details_popup;

import Ca1.ViewOnClickListenerC13236c;
import Y61.k;
import Y61.l;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.active_orders_common.items.order.n;
import com.avito.android.advert.advert_details_popup.f;
import com.avito.android.lib.design.spinner.Spinner;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AdvertDetailsToolbarPopup.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/advert_details_popup/e;", "", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @l
    public PopupWindow f68619a;

    /* renamed from: b, reason: collision with root package name */
    public final List<String> f68620b = Collections.synchronizedList(new ArrayList());

    /* JADX WARN: Multi-variable type inference failed */
    public final void a(@k View view, @k ArrayList arrayList, @k Y41.l lVar, boolean z12) {
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(new androidx.appcompat.view.d(view.getContext(), R.style.Theme_DesignSystem_Re23));
        ViewGroup viewGroup = null;
        View viewInflate = layoutInflaterFrom.inflate(R.layout.advert_details_advert_toolbar_popup_layout, (ViewGroup) null);
        LinearLayout linearLayout = (LinearLayout) viewInflate.findViewById(R.id.popup_list_view);
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            g gVar = (g) it.next();
            d dVar = new d(lVar, gVar);
            View viewInflate2 = layoutInflaterFrom.inflate(R.layout.advert_details_advert_toolbar_popup_item_layout, viewGroup, false);
            TextView textView = (TextView) viewInflate2.findViewById(R.id.toolbar_popup_item_icon);
            TextView textView2 = (TextView) viewInflate2.findViewById(R.id.toolbar_popup_item_text);
            Spinner spinner = (Spinner) viewInflate2.findViewById(R.id.toolbar_popup_item_spinner);
            f fVar = gVar.f68628c;
            boolean z13 = fVar instanceof f.b;
            PrintableText printableText = gVar.f68627b;
            String str = gVar.f68626a;
            if (z13) {
                String str2 = ((f.b) fVar).f68622a;
                boolean zContains = this.f68620b.contains(str2);
                if (zContains) {
                    D6.w(textView);
                    D6.H(spinner);
                } else {
                    FV.a.a(FV.a.f4720a, textView, str != null ? com.avito.android.lib.util.f.m(str) : viewGroup);
                    D6.H(textView);
                    D6.w(spinner);
                }
                textView2.setText(printableText != null ? printableText.k0(viewInflate2.getContext()) : null);
                if (!zContains) {
                    viewInflate2.setOnClickListener(new ViewOnClickListenerC13236c(this, str2, dVar, 2));
                }
            } else {
                FV.a.a(FV.a.f4720a, textView, str != null ? com.avito.android.lib.util.f.m(str) : null);
                D6.H(textView);
                D6.w(spinner);
                textView2.setText(printableText != null ? printableText.k0(viewInflate2.getContext()) : null);
                viewInflate2.setOnClickListener(new n(2, dVar));
            }
            linearLayout.addView(viewInflate2);
            viewGroup = null;
        }
        PopupWindow popupWindow = new PopupWindow(viewInflate, -2, -2, true);
        this.f68619a = popupWindow;
        popupWindow.showAsDropDown(view, 0, y6.b(z12 ? 8 : 4));
    }
}
