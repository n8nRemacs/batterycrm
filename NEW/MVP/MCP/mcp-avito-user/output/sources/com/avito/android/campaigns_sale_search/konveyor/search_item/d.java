package com.avito.android.campaigns_sale_search.konveyor.search_item;

import Ba.ViewOnClickListenerC13121a;
import Y41.l;
import Y61.k;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.calltracking.item.m;
import com.avito.android.campaigns_sale.network.remote.model.SearchBonusInfo;
import com.avito.android.campaigns_sale.network.remote.model.SearchBonusInfoCard;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35949t5;
import com.avito.android.util.D6;
import com.avito.android.util.text.j;
import com.facebook.drawee.view.SimpleDraweeView;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: SearchItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale_search/konveyor/search_item/d;", "LTV0/d;", "Lcom/avito/android/campaigns_sale_search/konveyor/search_item/i;", "Lcom/avito/android/campaigns_sale_search/konveyor/search_item/a;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements TV0.d<i, com.avito.android.campaigns_sale_search.konveyor.search_item.a> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Resources f114610b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final l<um.b, G0> f114611c;

    /* compiled from: SearchItemPresenter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f114612a;

        static {
            int[] iArr = new int[SearchItemButton.values().length];
            try {
                SearchItemButton searchItemButton = SearchItemButton.f114594b;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                SearchItemButton searchItemButton2 = SearchItemButton.f114594b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f114612a = iArr;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public d(@k Resources resources, @k l<? super um.b, G0> lVar) {
        this.f114610b = resources;
        this.f114611c = lVar;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        SearchBonusInfoCard card;
        SearchBonusInfoCard card2;
        i iVar = (i) eVar;
        com.avito.android.campaigns_sale_search.konveyor.search_item.a aVar2 = (com.avito.android.campaigns_sale_search.konveyor.search_item.a) aVar;
        SearchBonusInfo searchBonusInfo = aVar2.f114605i;
        AttributedText text = (searchBonusInfo == null || (card2 = searchBonusInfo.getCard()) == null) ? null : card2.getText();
        Integer numValueOf = Integer.valueOf(R.attr.ic_buyerBonuses16);
        if (searchBonusInfo == null || (card = searchBonusInfo.getCard()) == null || !card.getHasIcon()) {
            numValueOf = null;
        }
        e eVar2 = new e(aVar2, this);
        TextView textView = iVar.f114626f;
        j.a(textView, text, null);
        View view = iVar.f114622b;
        textView.setCompoundDrawablesWithIntrinsicBounds(numValueOf != null ? C35835l0.h(numValueOf.intValue(), view.getContext()) : null, (Drawable) null, (Drawable) null, (Drawable) null);
        textView.setOnClickListener(new m(6, eVar2));
        C35949t5.c(iVar.f114623c, com.avito.android.image_loader.b.b(aVar2.f114601e), null, null, null, 14);
        TextView textView2 = iVar.f114624d;
        j.a(textView2, aVar2.f114599c, null);
        TextView textView3 = iVar.f114625e;
        j.a(textView3, aVar2.f114600d, null);
        SearchItemButton searchItemButton = aVar2.f114602f;
        int i13 = searchItemButton == null ? -1 : a.f114612a[searchItemButton.ordinal()];
        Button button = iVar.f114628h;
        Resources resources = this.f114610b;
        if (i13 == 1) {
            button.setText(resources.getString(R.string.campaigns_sale_search_button_in_sale_text));
            button.setAppearanceFromAttr(R.attr.buttonSecondarySmallRound);
            button.setOnClickListener(new ViewOnClickListenerC13121a(24, new f(aVar2, this)));
        } else if (i13 == 2) {
            button.setText(resources.getString(R.string.campaigns_sale_search_button_no_sale_text));
            button.setAppearanceFromAttr(R.attr.buttonPrimarySmallRound);
            button.setOnClickListener(new ViewOnClickListenerC13121a(24, new g(aVar2, this)));
        }
        boolean z12 = aVar2.f114604h;
        D6.G(button, !z12);
        D6.G(iVar.f114627g, z12);
        SimpleDraweeView simpleDraweeView = iVar.f114623c;
        if (z12) {
            simpleDraweeView.getOverlay().add(com.avito.android.campaigns_sale.view.images_row.b.a(new Size(simpleDraweeView.getWidth(), simpleDraweeView.getHeight()), C35835l0.d(R.attr.white, view.getContext()), 0.36f));
            textView2.setAlpha(0.36f);
            textView3.setAlpha(0.36f);
        } else {
            simpleDraweeView.getOverlay().clear();
            textView2.setAlpha(1.0f);
            textView3.setAlpha(1.0f);
        }
    }
}
