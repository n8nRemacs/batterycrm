package com.avito.android.serp.adapter.alert_banner;

import android.text.method.LinkMovementMethod;
import android.view.View;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.lib.design.alert_banner.AlertBanner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.alert_banner.Action;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.seller_promotions.o;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.jakewharton.rxbinding4.view.C37722i;
import javax.inject.Inject;
import kotlin.Metadata;
import rn0.InterfaceC47690b;

/* compiled from: AlertBannerPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/alert_banner/j;", "Lcom/avito/android/serp/adapter/alert_banner/e;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class j implements e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Ax.e f268917b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC47690b> f268918c;

    @Inject
    public j(@Y61.k Ax.e eVar, @Y61.k h31.e<InterfaceC47690b> eVar2) {
        this.f268917b = eVar;
        this.f268918c = eVar2;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        TextView textView;
        TextView textView2;
        m mVar = (m) eVar;
        AlertBannerItem alertBannerItem = (AlertBannerItem) aVar;
        this.f268917b.g(mVar);
        f fVar = new f(this);
        g gVar = new g(this);
        Action action = alertBannerItem.f268901f;
        String title = action != null ? action.getTitle() : null;
        h hVar = new h(alertBannerItem, this);
        Action action2 = alertBannerItem.f268902g;
        String title2 = action2 != null ? action2.getTitle() : null;
        i iVar = new i(alertBannerItem, this);
        int i13 = alertBannerItem.f268900e;
        AlertBanner alertBanner = mVar.f268923b;
        AlertBanner.h(alertBanner, i13);
        AttributedText attributedText = alertBannerItem.f268898c;
        if (attributedText != null) {
            View contentView = alertBanner.getContentView();
            if (contentView != null) {
                View viewFindViewById = contentView.findViewById(R.id.title);
                if (viewFindViewById == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                textView2 = (TextView) viewFindViewById;
            } else {
                textView2 = null;
            }
            if (textView2 != null) {
                attributedText.setOnDeepLinkClickListener(new com.avito.android.advert.item.delivery_suggests.k(1, fVar));
                textView2.setMovementMethod(LinkMovementMethod.getInstance());
                com.avito.android.util.text.j.c(textView2, attributedText, null);
                D6.G(textView2, true);
            }
        }
        AttributedText attributedText2 = alertBannerItem.f268899d;
        if (attributedText2 != null) {
            View contentView2 = alertBanner.getContentView();
            if (contentView2 != null) {
                View viewFindViewById2 = contentView2.findViewById(R.id.body);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                }
                textView = (TextView) viewFindViewById2;
            } else {
                textView = null;
            }
            if (textView != null) {
                attributedText2.setOnDeepLinkClickListener(new com.avito.android.advert.item.delivery_suggests.k(1, gVar));
                textView.setMovementMethod(LinkMovementMethod.getInstance());
                com.avito.android.util.text.j.c(textView, attributedText2, null);
                D6.G(textView, true);
            }
        }
        Button buttonB80 = mVar.B80();
        if (buttonB80 != null) {
            com.avito.android.lib.design.button.b.a(buttonB80, title, false);
        }
        Button buttonB802 = mVar.B80();
        if (buttonB802 != null) {
            C37722i.a(buttonB802).t0(new l(hVar));
        }
        RU.a content = alertBanner.getContent();
        o oVar = new o(2, iVar);
        content.f14457e = title2;
        content.f14458f = oVar;
        TextView textView3 = content.f14465m;
        if (textView3 != null) {
            I5.a(textView3, title2, false);
        }
        TextView textView4 = content.f14465m;
        if (textView4 != null) {
            textView4.setOnClickListener(oVar);
        }
    }
}
