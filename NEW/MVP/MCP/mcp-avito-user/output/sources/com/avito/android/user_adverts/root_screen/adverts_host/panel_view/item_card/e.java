package com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.widget.TextView;
import androidx.cardview.widget.CardView;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.tooltip.p;
import com.avito.android.lib.design.tooltip.q;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.PanelCardItem;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_view.item_card.a;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;

/* compiled from: PanelCardItemPresenter.kt */
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/e;", "LTV0/d;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/g;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_view/item_card/PanelCardItem;", "<init>", "()V", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements TV0.d<g, PanelCardItem> {
    /* JADX WARN: Type inference failed for: r14v12, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r14v27, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r14v30, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r14v33, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r1v5, types: [java.lang.Object, kotlin.C] */
    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        int i13;
        Drawable drawable;
        com.avito.android.lib.design.tooltip.k kVar;
        g gVar = (g) eVar;
        PanelCardItem panelCardItem = (PanelCardItem) aVar;
        PrintableText title = panelCardItem.getF9896b();
        Context context = gVar.f313709c;
        String strK0 = title.k0(context);
        TextView textView = gVar.f313711e;
        textView.setText(strK0);
        int iA1 = panelCardItem.getF313311k();
        if (textView.getMaxLines() != iA1) {
            textView.setMaxLines(iA1);
        }
        String strK02 = panelCardItem.getF9897c().k0(context);
        TextView textView2 = gVar.f313712f;
        textView2.setText(strK02);
        int iOrdinal = panelCardItem.getF313310j().ordinal();
        if (iOrdinal == 0) {
            i13 = 0;
        } else {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i13 = 1;
        }
        if (textView2.getHyphenationFrequency() != i13) {
            textView2.setHyphenationFrequency(i13);
        }
        int iOrdinal2 = panelCardItem.getF313307g().ordinal();
        if (iOrdinal2 == 0) {
            drawable = (Drawable) gVar.f313715i.getValue();
        } else if (iOrdinal2 == 1) {
            drawable = (Drawable) gVar.f313716j.getValue();
        } else if (iOrdinal2 == 2) {
            drawable = (Drawable) gVar.f313717k.getValue();
        } else {
            if (iOrdinal2 != 3) {
                throw new NoWhenBranchMatchedException();
            }
            drawable = (Drawable) gVar.f313718l.getValue();
        }
        CardView cardView = gVar.f313710d;
        cardView.setBackground(drawable);
        a aVarL1 = panelCardItem.getF313312l();
        if (aVarL1 instanceof a.C9655a) {
            gVar.f313713g.setImageResource(((a.C9655a) aVarL1).f313701a);
        } else if (aVarL1 instanceof a.b) {
            C35949t5.c(gVar.f313713g, com.avito.android.image_loader.b.b(((a.b) aVarL1).f313702a), null, null, null, 14);
        }
        String strX0 = panelCardItem.getF313309i();
        boolean z12 = strX0 != null;
        Badge badge = gVar.f313714h;
        D6.G(badge, z12);
        if (strX0 != null) {
            badge.setState(new com.avito.android.lib.design.badge.f(strX0, Boolean.FALSE, false));
        }
        PanelCardItem.b bVarP1 = panelCardItem.getF9899e();
        PanelCardItem panelCardItem2 = gVar.f313719m;
        if (!L.f(bVarP1, panelCardItem2 != null ? panelCardItem2.getF9899e() : null) || (kVar = gVar.f313720n) == null || !kVar.isShowing()) {
            gVar.C80();
            PanelCardItem.b bVarP12 = panelCardItem.getF9899e();
            if (bVarP12 != null) {
                com.avito.android.lib.design.tooltip.k kVar2 = new com.avito.android.lib.design.tooltip.k(gVar.f313709c, 0, 0, 6, null);
                kVar2.setTouchable(true);
                kVar2.setOutsideTouchable(true);
                kVar2.f181224j = (q) gVar.f313721o.getValue();
                int i14 = kVar2.f181229o;
                kVar2.f181228n = -1;
                kVar2.f181229o = i14;
                p.a(kVar2, new h(bVarP12, gVar));
                kVar2.d(new com.avito.android.job.cv_info_actualization.ui.items.radio.g(gVar, panelCardItem, bVarP12, 19));
                kVar2.f(cardView);
                kVar2.setOnDismissListener(new com.avito.android.advert.item.safedeal.trust_factors.j(kVar2, gVar, panelCardItem, bVarP12, 1));
                gVar.f313720n = kVar2;
            }
        }
        gVar.f313719m = panelCardItem;
    }
}
