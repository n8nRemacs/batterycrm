package com.avito.android.campaigns_sale.konveyor.editBlock;

import Ca1.ViewOnClickListenerC13236c;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.campaigns_sale.network.remote.model.BonusInfo;
import com.avito.android.campaigns_sale.network.remote.model.BonusText;
import com.avito.android.campaigns_sale.view.images_row.ImagesRowView;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.chips.Chips;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.I5;
import com.avito.android.util.O2;
import fm.InterfaceC40441a;
import gm.C40704a;
import gm.C40705b;
import im.InterfaceC41424a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;
import sK0.C48065c;
import vm.InterfaceC49348c;

/* compiled from: SaleEditBlockItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/campaigns_sale/konveyor/editBlock/k;", "LTV0/d;", "Lcom/avito/android/campaigns_sale/konveyor/editBlock/p;", "Lgm/b;", "_avito_campaigns-sale_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class k implements TV0.d<p, C40705b> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Y41.l<InterfaceC41424a, G0> f113989b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40441a f113990c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49348c f113991d;

    /* JADX WARN: Multi-variable type inference failed */
    @Inject
    public k(@Y61.k Y41.l<? super InterfaceC41424a, G0> lVar, @Y61.k InterfaceC40441a interfaceC40441a, @Y61.k InterfaceC49348c interfaceC49348c) {
        this.f113989b = lVar;
        this.f113990c = interfaceC40441a;
        this.f113991d = interfaceC49348c;
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        String text;
        final p pVar = (p) eVar;
        C40705b c40705b = (C40705b) aVar;
        List<Long> list = c40705b.f396777f;
        boolean zA2 = O2.a(list);
        List<Long> list2 = c40705b.f396780i;
        boolean zA3 = O2.a(list2);
        C40704a c40704a = c40705b.f396781j;
        BonusInfo bonusInfo = c40704a.f396772e;
        Integer numValueOf = bonusInfo != null ? Integer.valueOf(bonusInfo.getDeltaForLeftThreshold() + c40705b.f396775d.f396785a) : null;
        List<Long> list3 = list;
        Integer num = c40705b.f396779h;
        BonusText withBonusesText = (list3 == null || list3.isEmpty() || numValueOf == null) ? null : (num != null ? num.intValue() : 0) >= numValueOf.intValue() ? bonusInfo.getWithBonusesText() : bonusInfo.getWithoutBonusesText();
        String strA0 = (withBonusesText == null || (text = withBonusesText.getText()) == null) ? null : C43066x.a0(text, "{{discount}}", String.valueOf(numValueOf), false);
        UniversalColor color = withBonusesText != null ? withBonusesText.getColor() : null;
        Context context = pVar.f114017r;
        Drawable drawableH = C35835l0.h(R.attr.ic_buyerBonuses16, context);
        if (withBonusesText == null || !withBonusesText.getHasIcon()) {
            drawableH = null;
        }
        TextView textView = pVar.f114011l;
        I5.a(textView, strA0, false);
        textView.setTextColor(C48065c.b(textView.getContext(), color, R.color.common_black));
        textView.setCompoundDrawablesWithIntrinsicBounds(drawableH, (Drawable) null, (Drawable) null, (Drawable) null);
        boolean zF2 = this.f113991d.f();
        Integer num2 = numValueOf;
        com.avito.android.advert_core.advert.f fVar = new com.avito.android.advert_core.advert.f(pVar, c40704a.f396768a, new e(this, c40705b), new f(this), 4);
        ImageButton imageButton = pVar.f114003d;
        imageButton.setOnClickListener(fVar);
        if (zF2) {
            if (!imageButton.isLaidOut() || imageButton.isLayoutRequested()) {
                imageButton.addOnLayoutChangeListener(new q(pVar));
            } else {
                imageButton.postDelayed(pVar.f114019t, 1000L);
            }
        }
        pVar.f114004e.setOnClickListener(new ViewOnClickListenerC13236c(pVar, c40704a.f396769b, new g(this, c40705b), 23));
        ImageButton imageButton2 = pVar.f114005f;
        D6.G(imageButton2, c40705b.f396784m);
        imageButton2.setOnClickListener(new com.avito.android.body_condition.h(6, this, c40705b));
        pVar.C80(num);
        pVar.f114018s = new h(pVar, c40705b, this);
        boolean z12 = c40705b.f396783l;
        pVar.B80((z12 && num == null) ? context.getString(R.string.campaigns_sale_choose_discount) : null);
        Integer num3 = O2.a(list) ? num2 : null;
        List<Integer> list4 = c40705b.f396774c;
        ArrayList arrayList = new ArrayList(C42745f0.q(list4, 10));
        Iterator<T> it = list4.iterator();
        while (it.hasNext()) {
            int iIntValue = ((Number) it.next()).intValue();
            arrayList.add(new a(iIntValue, num3 != null && iIntValue >= num3.intValue()));
        }
        Chips chips = pVar.f114012m;
        chips.setData(arrayList);
        chips.j();
        int i13 = 0;
        for (Object obj : list4) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            int iIntValue2 = ((Number) obj).intValue();
            if (num != null && iIntValue2 == num.intValue()) {
                chips.p(i13, false);
            }
            i13 = i14;
        }
        String string = (list == null || list.isEmpty()) ? (list2 == null || list2.isEmpty()) ? (list2 == null && list == null) ? null : context.getResources().getString(R.string.campaigns_sale_no_available_items) : context.getResources().getQuantityString(R.plurals.available_items, list2.size(), Integer.valueOf(list2.size())) : context.getResources().getQuantityString(R.plurals.added_items, list.size(), Integer.valueOf(list.size()));
        D6.G(pVar.f114007h, string == null);
        I5.a(pVar.f114008i, string, false);
        I5.a(pVar.f114009j, c40705b.f396776e, false);
        I5.a(pVar.f114010k, (z12 && (list3 == null || list3.isEmpty())) ? context.getResources().getString(R.string.campaigns_sale_choose_items_error) : null, false);
        boolean z13 = !zA2;
        boolean z14 = zA2 || zA3;
        Button button = pVar.f114016q;
        D6.G(button, zA2);
        Button button2 = pVar.f114014o;
        D6.G(button2, z13);
        Button button3 = pVar.f114015p;
        D6.G(button3, z13);
        button.setEnabled(z14);
        button2.setEnabled(z14);
        button3.setEnabled(z14);
        final i iVar = new i(this, c40705b);
        final int i15 = 2;
        button2.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.campaigns_sale.konveyor.editBlock.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i15) {
                    case 0:
                        iVar.invoke(C43066x.y0(pVar.f114002c.getDeformattedText()));
                        break;
                    case 1:
                        iVar.invoke(C43066x.y0(pVar.f114002c.getDeformattedText()));
                        break;
                    default:
                        iVar.invoke(C43066x.y0(pVar.f114002c.getDeformattedText()));
                        break;
                }
            }
        });
        final j jVar = new j(this, c40705b);
        final int i16 = 0;
        button3.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.campaigns_sale.konveyor.editBlock.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i16) {
                    case 0:
                        jVar.invoke(C43066x.y0(pVar.f114002c.getDeformattedText()));
                        break;
                    case 1:
                        jVar.invoke(C43066x.y0(pVar.f114002c.getDeformattedText()));
                        break;
                    default:
                        jVar.invoke(C43066x.y0(pVar.f114002c.getDeformattedText()));
                        break;
                }
            }
        });
        final d dVar = new d(this, c40705b);
        final int i17 = 1;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.campaigns_sale.konveyor.editBlock.n
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                switch (i17) {
                    case 0:
                        dVar.invoke(C43066x.y0(pVar.f114002c.getDeformattedText()));
                        break;
                    case 1:
                        dVar.invoke(C43066x.y0(pVar.f114002c.getDeformattedText()));
                        break;
                    default:
                        dVar.invoke(C43066x.y0(pVar.f114002c.getDeformattedText()));
                        break;
                }
            }
        });
        List list5 = c40705b.f396778g;
        if (list5 == null) {
            list5 = C42784z0.f406748b;
        }
        int size = list != null ? list.size() : 0;
        boolean zIsEmpty = list5.isEmpty();
        ImagesRowView imagesRowView = pVar.f114013n;
        if (zIsEmpty) {
            D6.w(imagesRowView);
        } else {
            D6.H(imagesRowView);
            imagesRowView.L0(size, list5, false);
        }
    }
}
