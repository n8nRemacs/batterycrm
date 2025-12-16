package com.avito.android.advert.item.short_term_rent.payment_toggles.toggle;

import Au.C13079a;
import Nf.InterfaceC14568a;
import Y41.l;
import android.widget.CompoundButton;
import com.avito.android.autoteka.presentation.payment.AutotekaPaymentActivity;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.sbc.create.mvi.M0;
import com.avito.android.util.D6;
import com.google.android.material.chip.Chip;
import com.google.android.material.internal.InterfaceC37076q;
import kotlin.G0;
import kotlin.jvm.internal.N;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataMutilselectFieldView;
import ru.cyberity.cbr.core.widget.applicantData.CBRApplicantDataRadioGroupView;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class h implements CompoundButton.OnCheckedChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f80127b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f80128c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ h(l lVar) {
        this.f80127b = 3;
        this.f80128c = (N) lVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.widget.CompoundButton.OnCheckedChangeListener
    public final void onCheckedChanged(CompoundButton compoundButton, boolean z12) {
        Object obj = this.f80128c;
        switch (this.f80127b) {
            case 0:
                l<? super Boolean, G0> lVar = ((i) obj).f80136h;
                if (lVar != null) {
                    lVar.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            case 1:
                AutotekaPaymentActivity.a aVar = AutotekaPaymentActivity.f97386y;
                ((AutotekaPaymentActivity) obj).b2().accept(new InterfaceC14568a.C0753a(z12));
                break;
            case 2:
                ListItemRadio listItemRadio = (ListItemRadio) obj;
                C13079a c13079a = listItemRadio.f179559z;
                if (c13079a != null) {
                    c13079a.a(listItemRadio, z12);
                    break;
                }
                break;
            case 3:
                int i12 = com.avito.android.list.toggle.i.f181667e;
                ((N) obj).invoke(Boolean.valueOf(z12));
                break;
            case 4:
                l<? super Boolean, G0> lVar2 = ((com.avito.android.mortgage.landing.list.items.offers.offer.h) obj).f199866h;
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            case 5:
                Y41.a<G0> aVar2 = ((com.avito.android.mortgage.landing.list.items.programs.program.h) obj).f199950g;
                if (aVar2 != null) {
                    aVar2.invoke();
                }
                D6.G(compoundButton, z12);
                break;
            case 6:
                l<? super Boolean, G0> lVar3 = ((M0) obj).f259339D0;
                if (lVar3 != null) {
                    lVar3.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            case 7:
                l<? super Boolean, G0> lVar4 = ((com.avito.android.serp.adapter.vertical_main.vertical_filter.adapter.switcher.h) obj).f273526e;
                if (lVar4 != null) {
                    lVar4.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            case 8:
                Chip chip = (Chip) obj;
                InterfaceC37076q.a<Chip> aVar3 = chip.f356225k;
                if (aVar3 != null) {
                    aVar3.a(chip, z12);
                }
                CompoundButton.OnCheckedChangeListener onCheckedChangeListener = chip.f356224j;
                if (onCheckedChangeListener != null) {
                    onCheckedChangeListener.onCheckedChanged(compoundButton, z12);
                    break;
                }
                break;
            case 9:
                CBRApplicantDataMutilselectFieldView.m305_set_items_$lambda5$lambda4$lambda3((CBRApplicantDataMutilselectFieldView) obj, compoundButton, z12);
                break;
            default:
                CBRApplicantDataRadioGroupView.m306_set_items_$lambda4$lambda3$lambda2((CBRApplicantDataRadioGroupView) obj, compoundButton, z12);
                break;
        }
    }

    public /* synthetic */ h(Object obj, int i12) {
        this.f80127b = i12;
        this.f80128c = obj;
    }
}
