package com.avito.android.beduin.common.component.radio_group;

import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import com.avito.android.R;
import com.avito.android.beduin.common.component.radio_group.j;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.badge.Badge;
import com.avito.android.lib.design.badge.g;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.y6;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: BeduinRadioListComponent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/list_item/ListItemRadio;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/list_item/ListItemRadio;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class n extends N implements Y41.l<ListItemRadio, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ j f102228l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ Option f102229m;

    /* renamed from: n, reason: collision with root package name */
    public final /* synthetic */ LinearLayout f102230n;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public n(j jVar, Option option, LinearLayout linearLayout) {
        super(1);
        this.f102228l = jVar;
        this.f102229m = option;
        this.f102230n = linearLayout;
    }

    @Override // Y41.l
    public final G0 invoke(ListItemRadio listItemRadio) {
        boolean zBooleanValue;
        ListItemRadio listItemRadio2 = listItemRadio;
        Option option = this.f102229m;
        RadioButtonBadge titleBadge = option.getTitleBadge();
        int i12 = j.f102217n;
        j jVar = this.f102228l;
        AttributedText attributedText = null;
        if ((titleBadge != null ? titleBadge.getText() : null) != null) {
            g.a aVar = com.avito.android.lib.design.badge.g.f178395r;
            Context context = listItemRadio2.getContext();
            aVar.getClass();
            com.avito.android.lib.design.badge.g gVarB = g.a.b(R.style.Re23_Badge_TextRedS, context);
            Badge badge = new Badge(listItemRadio2.getContext(), null, 0, 0, 14, null);
            badge.setStyle(gVarB);
            badge.setState(new com.avito.android.lib.design.badge.f(titleBadge.getText(), null, false, 6, null));
            FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2, 16);
            layoutParams.leftMargin = y6.b(6);
            FrameLayout frameLayout = listItemRadio2.f179553t;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
            }
            if (frameLayout != null) {
                frameLayout.addView(badge, layoutParams);
            }
        }
        List<BeduinModel> content = option.getContent();
        if (content != null) {
            List<BeduinModel> list = content;
            ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
            Iterator<T> it = list.iterator();
            while (it.hasNext()) {
                AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112aU = jVar.u((BeduinModel) it.next());
                InterfaceC40116e interfaceC40116eI = abstractC40112aU.i(this.f102230n, new ViewGroup.MarginLayoutParams(-1, -2));
                if (interfaceC40116eI.getF101723b().getId() == -1) {
                    interfaceC40116eI.getF101723b().setId(View.generateViewId());
                }
                abstractC40112aU.m(interfaceC40116eI);
                arrayList.add(interfaceC40116eI.getF101723b());
            }
            listItemRadio2.setCustomContent(arrayList);
        } else {
            Context context2 = listItemRadio2.getContext();
            AttributedText attributedTitle = option.getAttributedTitle();
            com.avito.android.util.text.a aVar2 = jVar.f102222j;
            CharSequence charSequenceC = aVar2.c(context2, attributedTitle);
            if (charSequenceC == null) {
                charSequenceC = option.getTitle();
            }
            listItemRadio2.setTitle(charSequenceC);
            AttributedText attributedSubtitle = option.getAttributedSubtitle();
            if (attributedSubtitle != null) {
                attributedSubtitle.setOnDeepLinkClickListener(new j.b(new m(1, jVar.f102223k, com.avito.android.deeplink_handler.handler.composite.a.class, "handle", "handle(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V", 0)));
            } else {
                attributedSubtitle = null;
            }
            CharSequence charSequenceC2 = aVar2.c(listItemRadio2.getContext(), attributedSubtitle);
            if (charSequenceC2 == null) {
                charSequenceC2 = option.getSubtitle();
            }
            listItemRadio2.setSubtitle(charSequenceC2);
            Context context3 = listItemRadio2.getContext();
            AttributedText secondSubtitle = option.getSecondSubtitle();
            if (secondSubtitle != null) {
                secondSubtitle.setOnDeepLinkClickListener(new j.b(new l(1, jVar.f102223k, com.avito.android.deeplink_handler.handler.composite.a.class, "handle", "handle(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Landroid/os/Bundle;)V", 0)));
                G0 g02 = G0.f406611a;
                attributedText = secondSubtitle;
            }
            listItemRadio2.setSecondSubtitle(aVar2.c(context3, attributedText));
        }
        String id2 = option.getId();
        BeduinRadioGroupModel beduinRadioGroupModel = jVar.f102221i;
        listItemRadio2.setChecked(L.f(id2, beduinRadioGroupModel.getSelectedId()));
        Boolean boolIsEnabled = beduinRadioGroupModel.isEnabled();
        if (boolIsEnabled != null) {
            zBooleanValue = boolIsEnabled.booleanValue();
        } else {
            Boolean boolIsEnabled2 = option.isEnabled();
            zBooleanValue = boolIsEnabled2 != null ? boolIsEnabled2.booleanValue() : true;
        }
        listItemRadio2.setEnabled(zBooleanValue);
        listItemRadio2.setClickable(true);
        return G0.f406611a;
    }
}
