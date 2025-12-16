package com.avito.android.advert.item.fmp.calculator;

import BI0.a;
import Ui.InterfaceC15523b;
import Y41.p;
import android.text.Editable;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import androidx.camera.video.internal.audio.q;
import com.avito.android.beduin.common.component.input.multi_line.MultiLineInputModel;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.blueprint.input.v;
import com.avito.android.blueprints.input.B;
import com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment;
import com.avito.android.credits.calculator.C29615b;
import com.avito.android.credits.calculator.C29621h;
import com.avito.android.extended_profile_ui_components.InputWithCounter;
import com.avito.android.extended_profile_ui_components.search_input.ProfileSearchInputView;
import com.avito.android.lib.deprecated_design.input.TextInputView;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.input.Input;
import com.avito.android.remote.model.adverts.MyAdvertDetails;
import com.avito.android.search_view.Toolbar23SearchView;
import com.avito.android.user_advert.soa_with_price.C35552f;
import com.avito.android.user_adverts.root_screen.adverts_host.C35565c;
import com.avito.android.util.K2;
import com.google.android.material.internal.O;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.Q;
import kotlin.text.C43066x;
import ru.cyberity.cbr.core.widget.CBRDateInputLayout;
import ru.cyberity.cbr.core.widget.CBRDateTimeInputLayout;
import um.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class l implements View.OnFocusChangeListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f75502b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f75503c;

    public /* synthetic */ l(Object obj, int i12) {
        this.f75502b = i12;
        this.f75503c = obj;
    }

    /* JADX WARN: Type inference failed for: r8v3, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r8v31, types: [Y41.l, kotlin.jvm.internal.N] */
    /* JADX WARN: Type inference failed for: r8v5, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View.OnFocusChangeListener
    public final void onFocusChange(View view, boolean z12) {
        Y41.l<? super String, G0> lVar;
        int i12 = 1;
        Object obj = this.f75503c;
        switch (this.f75502b) {
            case 0:
                m mVar = (m) obj;
                p<? super Boolean, ? super String, G0> pVar = mVar.f75515l;
                if (pVar != null) {
                    pVar.invoke(Boolean.valueOf(z12), mVar.f75507d.getDeformattedText());
                }
                mVar.f75519p = z12;
                break;
            case 1:
                com.avito.android.beduin.common.component.input.multi_line.g gVar = (com.avito.android.beduin.common.component.input.multi_line.g) obj;
                InterfaceC15523b<BeduinAction> interfaceC15523b = gVar.f101571f;
                MultiLineInputModel multiLineInputModel = gVar.f101572g;
                if (z12) {
                    List<BeduinAction> onFocusedActions = multiLineInputModel.getOnFocusedActions();
                    if (onFocusedActions != null) {
                        Iterator<T> it = onFocusedActions.iterator();
                        while (it.hasNext()) {
                            interfaceC15523b.o((BeduinAction) it.next());
                        }
                        break;
                    }
                } else {
                    List<BeduinAction> onEndEditingActions = multiLineInputModel.getOnEndEditingActions();
                    if (onEndEditingActions != null) {
                        Iterator<T> it2 = onEndEditingActions.iterator();
                        while (it2.hasNext()) {
                            interfaceC15523b.o((BeduinAction) it2.next());
                        }
                        break;
                    }
                }
                break;
            case 2:
                v vVar = (v) obj;
                ?? r82 = vVar.f105571t;
                if (r82 != 0) {
                    r82.invoke(Boolean.valueOf(z12));
                }
                if (z12) {
                    vVar.f105564m.postDelayed(new q(i12, 3, vVar), 300L);
                    break;
                }
                break;
            case 3:
                B b12 = (B) obj;
                ?? r83 = b12.f105919k;
                if (r83 != 0) {
                    r83.invoke(Boolean.valueOf(z12));
                }
                if (z12) {
                    b12.f105912d.postDelayed(new q(i12, 4, b12), 300L);
                    break;
                }
                break;
            case 4:
                CampaignsSaleSearchFragment.a aVar = CampaignsSaleSearchFragment.f114473A0;
                if (z12) {
                    CampaignsSaleSearchFragment campaignsSaleSearchFragment = (CampaignsSaleSearchFragment) obj;
                    campaignsSaleSearchFragment.v5().accept(b.f.f440237a);
                    Editable editableM53getText = campaignsSaleSearchFragment.u5().m53getText();
                    if (editableM53getText == null || editableM53getText.length() == 0) {
                        campaignsSaleSearchFragment.v5().accept(b.m.f440244a);
                        break;
                    }
                }
                break;
            case 5:
                int i13 = C29615b.f128664x;
                C29615b c29615b = (C29615b) obj;
                if (!z12) {
                    com.avito.android.credits.p pVar2 = c29615b.f128709k;
                    Input input = c29615b.f128668t;
                    if (pVar2 != null) {
                        Integer numY0 = C43066x.y0(input.getDeformattedText());
                        pVar2.K7(numY0 != null ? numY0.intValue() : 0);
                    }
                    if (!input.hasFocus()) {
                        K2.d(input, false);
                    }
                }
                com.avito.android.credits.p pVar3 = c29615b.f128709k;
                if (pVar3 != null) {
                    pVar3.yd(z12);
                    break;
                }
                break;
            case 6:
                int i14 = C29621h.f128676w;
                C29621h c29621h = (C29621h) obj;
                if (!z12) {
                    com.avito.android.credits.p pVar4 = c29621h.f128709k;
                    Input input2 = c29621h.f128680t;
                    if (pVar4 != null) {
                        Integer numY02 = C43066x.y0(input2.getDeformattedText());
                        pVar4.K7(numY02 != null ? numY02.intValue() : 0);
                    }
                    if (!input2.hasFocus()) {
                        K2.d(input2, false);
                    }
                }
                com.avito.android.credits.p pVar5 = c29621h.f128709k;
                if (pVar5 != null) {
                    pVar5.yd(z12);
                    break;
                }
                break;
            case 7:
                int i15 = InputWithCounter.f153302e;
                ((InputWithCounter) obj).c(z12);
                break;
            case 8:
                int i16 = ProfileSearchInputView.f153380D;
                if (z12) {
                    ((ProfileSearchInputView) obj).c();
                    break;
                }
                break;
            case 9:
                Y41.l<? super Boolean, G0> lVar2 = ((com.avito.android.hotel_booking.enter_data.konveyor.input.l) obj).f163529e;
                if (lVar2 != null) {
                    lVar2.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            case 10:
                Y41.l<? super Boolean, G0> lVar3 = ((com.avito.android.hotel_booking.konveyor.input.l) obj).f163694e;
                if (lVar3 != null) {
                    lVar3.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            case 11:
                kotlin.reflect.n<Object>[] nVarArr = TextInputView.f178012o;
                TextInputView textInputView = (TextInputView) obj;
                Y41.l<Boolean, G0> focusChangeListener = textInputView.getFocusChangeListener();
                if (focusChangeListener != null) {
                    focusChangeListener.invoke(Boolean.valueOf(z12));
                }
                boolean zIsEmpty = TextUtils.isEmpty(((EditText) view).getText());
                com.avito.android.lib.deprecated_design.input.j jVar = textInputView.f178014c;
                jVar.f178038b.setValue(jVar, com.avito.android.lib.deprecated_design.input.j.f178036u[0], Boolean.valueOf(z12));
                if (!zIsEmpty || z12) {
                    textInputView.b(0.0f);
                    break;
                } else {
                    textInputView.b(1.0f);
                    break;
                }
            case 12:
                com.avito.android.mortgage.person_form.list.items.input.h hVar = (com.avito.android.mortgage.person_form.list.items.input.h) obj;
                if (z12 && hVar.f200718e) {
                    Input.t(hVar.f200716c, null, false, 6);
                } else if (!z12 && hVar.f200718e) {
                    Input.t(hVar.f200716c, hVar.f200717d, false, 6);
                }
                ?? r84 = hVar.f200721h;
                if (r84 != 0) {
                    r84.invoke(Boolean.valueOf(z12));
                    break;
                }
                break;
            case 13:
                Toolbar23SearchView.B((Toolbar23SearchView) obj, z12);
                break;
            case 14:
                int i17 = com.avito.android.service_booking_common.blueprints.input.j.f276448e;
                if (z12) {
                    ((Y41.a) obj).invoke();
                    break;
                }
                break;
            case 15:
                if (z12) {
                    com.avito.android.user_advert.advert.items.realty.verification.l lVar4 = (com.avito.android.user_advert.advert.items.realty.verification.l) obj;
                    ComponentContainer componentContainer = lVar4.f309976f;
                    if (componentContainer != null) {
                        MyAdvertDetails.CadastralField cadastralField = lVar4.f309977g;
                        componentContainer.q(cadastralField != null ? cadastralField.getDetails() : null);
                        break;
                    }
                } else {
                    int i18 = com.avito.android.user_advert.advert.items.realty.verification.l.f309971h;
                    break;
                }
                break;
            case 16:
                C35552f c35552f = (C35552f) obj;
                c35552f.f311910e.accept(new Q<>(Boolean.valueOf(z12), c35552f.f311907b.getDeformattedText()));
                break;
            case 17:
                com.avito.android.user_advert.soa_with_price.g gVar2 = (com.avito.android.user_advert.soa_with_price.g) obj;
                gVar2.f311921e.accept(new Q<>(Boolean.valueOf(z12), gVar2.f311918b.getDeformattedText()));
                break;
            case 18:
                if (z12) {
                    C35565c c35565c = ((com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h) obj).f312822o;
                    if (c35565c != null) {
                        c35565c.a(a.d.f1292a);
                        break;
                    }
                } else {
                    int i19 = com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h.f312807p;
                    break;
                }
                break;
            case 19:
                com.avito.android.widget_filters.ui.items.location.k kVar = (com.avito.android.widget_filters.ui.items.location.k) obj;
                Y41.l<? super Boolean, G0> lVar5 = kVar.f330529t;
                if (lVar5 != null) {
                    lVar5.invoke(Boolean.valueOf(z12));
                }
                if (z12 && (lVar = kVar.f330528s) != null) {
                    lVar.invoke(kVar.f330522m.getDeformattedText());
                    break;
                }
                break;
            case 20:
                for (EditText editText : (EditText[]) obj) {
                    if (editText.hasFocus()) {
                        break;
                    }
                }
                O.e(view);
                break;
            case 21:
                CBRDateInputLayout.m284addView$lambda0((CBRDateInputLayout) obj, view, z12);
                break;
            default:
                CBRDateTimeInputLayout.m287addView$lambda0((CBRDateTimeInputLayout) obj, view, z12);
                break;
        }
    }
}
