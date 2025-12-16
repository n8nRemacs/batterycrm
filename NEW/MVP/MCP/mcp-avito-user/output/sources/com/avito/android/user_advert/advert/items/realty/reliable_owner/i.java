package com.avito.android.user_advert.advert.items.realty.reliable_owner;

import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.ColorStateList;
import android.net.Uri;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.lib.design.banner.Banner;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.progress_bar.ProgressBar;
import com.avito.android.lib.util.s;
import com.avito.android.remote.model.SimpleAction;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.PromoStyle;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import j.InterfaceC42156l;
import java.util.List;
import java.util.Locale;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import sK0.C48063a;

/* compiled from: ReliableOwnerItemView.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_advert/advert/items/realty/reliable_owner/i;", "Lcom/avito/konveyor/adapter/b;", "Lcom/avito/android/user_advert/advert/items/realty/reliable_owner/h;", "_avito_user-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class i extends com.avito.konveyor.adapter.b implements h {

    /* renamed from: g, reason: collision with root package name */
    public static final /* synthetic */ int f309943g = 0;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final com.avito.android.util.text.a f309944b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final com.avito.android.serp.adapter.vertical_main.c f309945c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Banner f309946d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Context f309947e;

    /* renamed from: f, reason: collision with root package name */
    @l
    @InterfaceC42156l
    public Integer f309948f;

    public i(@k View view, @k com.avito.android.util.text.a aVar, @k com.avito.android.serp.adapter.vertical_main.c cVar) {
        super(view);
        this.f309944b = aVar;
        this.f309945c = cVar;
        Banner banner = (Banner) view;
        this.f309946d = banner;
        this.f309947e = banner.getThemedContext();
    }

    public final void B80(TextView textView, AttributedText attributedText) {
        Integer num = this.f309948f;
        if (num != null) {
            int iIntValue = num.intValue();
            if (textView != null) {
                j.d(textView, iIntValue);
            }
        }
        if (textView != null) {
            textView.setMovementMethod(LinkMovementMethod.getInstance());
        }
        if (textView != null) {
            j.a(textView, attributedText, this.f309944b);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.realty.reliable_owner.h
    public final void Kc(@l PromoStyle promoStyle) {
        if (promoStyle == null) {
            return;
        }
        int iA2 = this.f309945c.a(promoStyle);
        Banner banner = this.f309946d;
        banner.i(R.layout.reliable_owner_content, iA2);
        String strName = promoStyle.name();
        Locale locale = Locale.ROOT;
        this.f309948f = Integer.valueOf(C35835l0.d(s.a(strName.toLowerCase(locale)), this.f309947e));
        TextView textView = (TextView) banner.findViewById(R.id.reliable_owner_progress_title);
        textView.setTextColor(C35835l0.d(s.a(promoStyle.name().toLowerCase(locale)), textView.getContext()));
        ProgressBar progressBar = (ProgressBar) banner.findViewById(R.id.reliable_owner_progress_bar);
        progressBar.setEmptyColor(C35835l0.d(s.b(promoStyle.name().toLowerCase(locale), null), progressBar.getContext()));
        progressBar.setFillColor(C35835l0.d(s.c(promoStyle.name().toLowerCase(locale), null), progressBar.getContext()));
        progressBar.setSeparatorColor(C35835l0.d(s.d(promoStyle.name().toLowerCase(locale)), progressBar.getContext()));
    }

    @Override // com.avito.android.user_advert.advert.items.realty.reliable_owner.h
    public final void Oh(@l MyAdvertDetails.ReliableOwner.ProgressBar progressBar) {
        if (progressBar == null) {
            return;
        }
        Banner banner = this.f309946d;
        B80((TextView) banner.findViewById(R.id.reliable_owner_progress_title), progressBar.getTitle());
        ProgressBar progressBar2 = (ProgressBar) banner.findViewById(R.id.reliable_owner_progress_bar);
        progressBar2.setProgress(progressBar.getValue());
        D6.H(progressBar2);
    }

    @Override // com.avito.android.user_advert.advert.items.realty.reliable_owner.h
    public final void Uc(@l AttributedText attributedText) {
        B80((TextView) this.f309946d.findViewById(R.id.reliable_owner_footer), attributedText);
    }

    @Override // com.avito.android.user_advert.advert.items.realty.reliable_owner.h
    public final void Xc(@l List<MyAdvertDetails.ReliableOwner.Insight> list) {
        LinearLayout linearLayout = (LinearLayout) this.f309946d.findViewById(R.id.reliable_owner_insights_container);
        linearLayout.removeAllViews();
        LayoutInflater layoutInflaterFrom = LayoutInflater.from(this.f309947e);
        if (list != null) {
            for (MyAdvertDetails.ReliableOwner.Insight insight : list) {
                View viewInflate = layoutInflaterFrom.inflate(R.layout.reliable_owner_insight, (ViewGroup) linearLayout, false);
                ImageView imageView = (ImageView) viewInflate.findViewById(R.id.reliable_owner_insight_icon);
                TextView textView = (TextView) viewInflate.findViewById(R.id.reliable_owner_insight_text);
                MyAdvertDetails.ReliableOwner.Insight.Icon icon = insight.getIcon();
                if (icon != null) {
                    imageView.setImageDrawable(C35835l0.h(icon.getType() == MyAdvertDetails.ReliableOwner.Insight.Icon.Type.CLOSE ? R.attr.ic_close20 : R.attr.ic_checkThin20, imageView.getContext()));
                    UniversalColor color = icon.getColor();
                    if (color != null) {
                        imageView.setImageTintList(ColorStateList.valueOf(C48063a.f437606a.a(imageView.getContext(), color)));
                    }
                    D6.H(imageView);
                }
                B80(textView, insight.getText());
                linearLayout.addView(viewInflate);
            }
        }
        if (list != null) {
            D6.H(linearLayout);
        }
    }

    @Override // com.avito.android.user_advert.advert.items.realty.reliable_owner.h
    public final void setTitle(@k String str) {
        this.f309946d.setTitle(str);
    }

    @Override // com.avito.android.user_advert.advert.items.realty.reliable_owner.h
    public final void uf(@l SimpleAction simpleAction, @l SimpleAction simpleAction2, @k Y41.l<? super Uri, G0> lVar) {
        Integer numValueOf = null;
        Banner banner = this.f309946d;
        if (simpleAction != null) {
            Button button = (Button) banner.findViewById(R.id.reliable_owner_action);
            com.avito.android.lib.design.button.b.a(button, simpleAction.getTitle(), false);
            String style = simpleAction.getStyle();
            Integer numValueOf2 = (style == null || style.length() <= 0) ? null : Integer.valueOf(com.avito.android.lib.util.f.d(style));
            if (numValueOf2 != null) {
                button.setAppearanceFromAttr(numValueOf2.intValue());
            }
            button.setOnClickListener(new com.avito.android.user_advert.advert.items.promo_block_feed.j(lVar, simpleAction, 1));
        }
        if (simpleAction2 != null) {
            Button button2 = (Button) banner.findViewById(R.id.reliable_owner_secondary_action);
            com.avito.android.lib.design.button.b.a(button2, simpleAction2.getTitle(), false);
            String style2 = simpleAction2.getStyle();
            if (style2 != null && style2.length() > 0) {
                numValueOf = Integer.valueOf(com.avito.android.lib.util.f.d(style2));
            }
            if (numValueOf != null) {
                button2.setAppearanceFromAttr(numValueOf.intValue());
            }
            button2.setOnClickListener(new com.avito.android.user_advert.advert.items.promo_block_feed.j(lVar, simpleAction2, 2));
        }
    }
}
