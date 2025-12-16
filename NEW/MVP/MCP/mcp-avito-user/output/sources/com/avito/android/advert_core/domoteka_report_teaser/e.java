package com.avito.android.advert_core.domoteka_report_teaser;

import PK0.j;
import Y61.k;
import android.content.res.Resources;
import android.text.SpannableString;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.domoteka_report_teaser.Action;
import com.avito.android.remote.model.domoteka_report_teaser.Info;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import com.google.android.flexbox.FlexboxLayout;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: AdvertDetailsDomotekaReportTeaserPresenter.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert_core/domoteka_report_teaser/e;", "LTV0/d;", "Lcom/avito/android/advert_core/domoteka_report_teaser/g;", "Lcom/avito/android/advert_core/domoteka_report_teaser/AdvertDetailsDomotekaReportTeaserItem;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class e implements TV0.d<g, AdvertDetailsDomotekaReportTeaserItem> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.deeplink_handler.handler.composite.a f83456b;

    @Inject
    public e(@k com.avito.android.deeplink_handler.handler.composite.a aVar) {
        this.f83456b = aVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) throws Resources.NotFoundException {
        boolean z12;
        String strO;
        g gVar = (g) eVar;
        AdvertDetailsDomotekaReportTeaserItem advertDetailsDomotekaReportTeaserItem = (AdvertDetailsDomotekaReportTeaserItem) aVar;
        gVar.f83459b.setText(advertDetailsDomotekaReportTeaserItem.f83446g);
        int i13 = 0;
        I5.a(gVar.f83462e, advertDetailsDomotekaReportTeaserItem.f83450k, false);
        c cVar = new c(1, this.f83456b, com.avito.android.deeplink_handler.handler.composite.a.class, "handle", "handle(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V", 0);
        LinearLayout linearLayout = gVar.f83460c;
        linearLayout.removeAllViews();
        List<Info> list = advertDetailsDomotekaReportTeaserItem.f83448i;
        linearLayout.setVisibility(O2.a(list) ? 0 : 8);
        if (list != null) {
            for (Info info : list) {
                SpannableString spannableString = null;
                View viewInflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.advert_details_domoteka_insight, (ViewGroup) null);
                View viewFindViewById = viewInflate.findViewById(R.id.tv_icon);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView = (TextView) viewFindViewById;
                View viewFindViewById2 = viewInflate.findViewById(R.id.tv_insight);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                TextView textView2 = (TextView) viewFindViewById2;
                View viewFindViewById3 = viewInflate.findViewById(R.id.iv_help);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
                }
                ImageView imageView = (ImageView) viewFindViewById3;
                String icon = info.getIcon();
                if (icon == null || (strO = com.avito.android.lib.util.f.o(viewInflate.getContext(), icon)) == null) {
                    z12 = i13;
                } else {
                    SpannableString spannableString2 = new SpannableString(strO);
                    j jVar = new j(null, 1, null);
                    int length = strO.length();
                    z12 = 0;
                    spannableString2.setSpan(jVar, 0, length, 33);
                    spannableString = spannableString2;
                }
                I5.a(textView, spannableString, z12);
                textView2.setText(info.getText());
                imageView.setVisibility(info.getDeeplink() != null ? z12 : 8);
                DeepLink deeplink = info.getDeeplink();
                if (deeplink != null) {
                    imageView.setOnClickListener(new XA0.c(cVar, deeplink, 2));
                }
                linearLayout.addView(viewInflate);
                i13 = z12;
            }
        }
        int i14 = i13;
        d dVar = new d(1, this.f83456b, com.avito.android.deeplink_handler.handler.composite.a.class, "handle", "handle(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V", 0);
        FlexboxLayout flexboxLayout = gVar.f83461d;
        flexboxLayout.removeAllViews();
        List<Action> list2 = advertDetailsDomotekaReportTeaserItem.f83449j;
        flexboxLayout.setVisibility(O2.a(list2) ? i14 : 8);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(flexboxLayout.getContext(), com.avito.android.lib.deprecated_design.f.b(R.style.Theme_DesignSystem_Legacy, advertDetailsDomotekaReportTeaserItem.f83447h.getResName()));
        if (list2 != null) {
            for (Action action : list2) {
                Button button = new Button(contextThemeWrapper, null, 0, 0, 14, null);
                button.setAppearance(C35835l0.j(com.avito.android.lib.util.f.d(action.getStyle()), contextThemeWrapper));
                button.setText(action.getName());
                button.setOnClickListener(new com.avito.android.advert.item.ownership_cost.dialogs.region_select.item.g(13, dVar, action));
                flexboxLayout.addView(button);
            }
        }
    }
}
