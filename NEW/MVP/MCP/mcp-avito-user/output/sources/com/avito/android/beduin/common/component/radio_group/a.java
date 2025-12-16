package com.avito.android.beduin.common.component.radio_group;

import Rh.C15041a;
import android.content.Context;
import android.view.View;
import android.view.ViewGroup;
import com.avito.android.R;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.lib.design.radio.RadioButton;
import com.avito.android.lib.design.radio.RadioGroup;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.C35835l0;
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

/* compiled from: BeduinRadioGroupComponent.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/lib/design/radio/RadioGroup;", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/lib/design/radio/RadioGroup;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class a extends N implements Y41.l<RadioGroup, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ e f102193l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ RadioGroup f102194m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(e eVar, RadioGroup radioGroup) {
        super(1);
        this.f102193l = eVar;
        this.f102194m = radioGroup;
    }

    @Override // Y41.l
    public final G0 invoke(RadioGroup radioGroup) {
        RadioGroup radioGroup2 = radioGroup;
        e eVar = this.f102193l;
        BeduinRadioGroupModel beduinRadioGroupModel = eVar.f102204i;
        radioGroup2.setTag(beduinRadioGroupModel.getId());
        radioGroup2.b();
        Iterator<T> it = beduinRadioGroupModel.getOptions().iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            Option option = (Option) it.next();
            List<BeduinModel> content = option.getContent();
            RadioButton radioButton = new RadioButton(radioGroup2.getContext());
            radioButton.setTag(option.getId());
            radioButton.setId(View.generateViewId());
            RadioGroup radioGroup3 = this.f102194m;
            if (content != null) {
                List<BeduinModel> list = content;
                ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
                Iterator<T> it2 = list.iterator();
                while (it2.hasNext()) {
                    AbstractC40112a<BeduinModel, InterfaceC40116e> abstractC40112aU = eVar.u((BeduinModel) it2.next());
                    InterfaceC40116e interfaceC40116eI = abstractC40112aU.i(radioGroup3, new ViewGroup.MarginLayoutParams(-1, -2));
                    if (interfaceC40116eI.getF101723b().getId() == -1) {
                        interfaceC40116eI.getF101723b().setId(View.generateViewId());
                    }
                    abstractC40112aU.m(interfaceC40116eI);
                    arrayList.add(interfaceC40116eI.getF101723b());
                }
                radioButton.setCustomContent(arrayList);
            } else {
                Context context = radioButton.getContext();
                AttributedText attributedTitle = option.getAttributedTitle();
                com.avito.android.util.text.a aVar = eVar.f102205j;
                CharSequence charSequenceC = aVar.c(context, attributedTitle);
                if (charSequenceC == null) {
                    charSequenceC = option.getTitle();
                }
                radioButton.setTitle(charSequenceC);
                AttributedText attributedSubtitle = option.getAttributedSubtitle();
                if (attributedSubtitle != null) {
                    attributedSubtitle.setOnDeepLinkClickListener(new C15041a(eVar, 17));
                } else {
                    attributedSubtitle = null;
                }
                CharSequence charSequenceC2 = aVar.c(radioButton.getContext(), attributedSubtitle);
                if (charSequenceC2 == null) {
                    charSequenceC2 = option.getSubtitle();
                }
                radioButton.setSubtitle(charSequenceC2);
                radioButton.setSecondSubtitle(aVar.c(radioButton.getContext(), option.getSecondSubtitle()));
            }
            Boolean boolIsEnabled = beduinRadioGroupModel.isEnabled();
            radioButton.setEnabled((boolIsEnabled == null && (boolIsEnabled = option.isEnabled()) == null) ? true : boolIsEnabled.booleanValue());
            radioGroup3.addView(radioButton);
            if (L.f(option.getId(), beduinRadioGroupModel.getSelectedId())) {
                radioGroup3.a(radioButton.getId());
            }
        }
        Boolean boolIsEnabled2 = beduinRadioGroupModel.isEnabled();
        radioGroup2.setEnabled(boolIsEnabled2 != null ? boolIsEnabled2.booleanValue() : true);
        radioGroup2.setHintColor(C35835l0.d(R.attr.red600, radioGroup2.getContext()));
        radioGroup2.setHint(beduinRadioGroupModel.getErrorMessageToDisplay());
        return G0.f406611a;
    }
}
