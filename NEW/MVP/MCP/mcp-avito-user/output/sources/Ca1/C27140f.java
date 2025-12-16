package ca1;

import Ay.InterfaceC13103a;
import BI0.a;
import Q50.a;
import V50.a;
import android.view.KeyEvent;
import android.widget.TextView;
import androidx.view.N0;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.campaigns_sale_search.CampaignsSaleSearchFragment;
import com.avito.android.edit_text_field.y;
import com.avito.android.extended_profile_selection_create.name.ExtendedProfileSetSelectionNameFragment;
import com.avito.android.lib.deprecated_design.edit_text.z;
import com.avito.android.lib.deprecated_design.input.TextInputView;
import com.avito.android.passport.profile_add.create_flow.re_agent_set_profile_name.ReAgentSetProfileNameFragment;
import com.avito.android.passport.profile_add.create_flow.set_profile_name.SetProfileNameFragment;
import com.avito.android.suggest_addresses.presentation.SuggestAddressesToolbarImpl;
import com.avito.android.suggest_locations.SuggestLocationsToolbarImpl;
import com.avito.android.suggest_locations.SuggestLocationsToolbarRedesign;
import com.avito.android.user_adverts.root_screen.adverts_host.C35565c;
import com.avito.android.util.K2;
import iR.C41336a;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import ru.cyberity.cbr.core.widget.CBRApplicantDataFieldView;
import um.b;

/* compiled from: R8$$SyntheticClass */
/* renamed from: ca1.f, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* synthetic */ class C27140f implements TextView.OnEditorActionListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f57941b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f57942c;

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C27140f(Y41.a aVar) {
        this.f57941b = 8;
        this.f57942c = (N) aVar;
    }

    /* JADX WARN: Type inference failed for: r5v9, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.widget.TextView.OnEditorActionListener
    public final boolean onEditorAction(TextView textView, int i12, KeyEvent keyEvent) {
        C35565c c35565c;
        G0 g02 = null;
        Object obj = this.f57942c;
        switch (this.f57941b) {
            case 0:
                if (i12 != 3) {
                    int i13 = ru.mts.biometry.sdk.feature.passport.ui.address.f.f436482i0;
                    return false;
                }
                ru.mts.biometry.sdk.feature.passport.ui.address.f fVar = (ru.mts.biometry.sdk.feature.passport.ui.address.f) obj;
                C27154t c27154t = fVar.f436483f0;
                if (c27154t == null) {
                    c27154t = null;
                }
                String text = fVar.b5().f1149c.getText();
                c27154t.getClass();
                C43259k.d(N0.a(c27154t), null, null, new C27153s(c27154t, text, null), 3);
                return true;
            case 1:
                if (i12 == 6) {
                    ((com.avito.android.advert.item.fmp.calculator.m) obj).f75507d.clearFocus();
                    return true;
                }
                int i14 = com.avito.android.advert.item.fmp.calculator.m.f75504s;
                return false;
            case 2:
                if (i12 == 3 || i12 == 6) {
                    com.avito.android.beduin.common.component.input.single_line.h hVar = (com.avito.android.beduin.common.component.input.single_line.h) obj;
                    List<BeduinAction> onEditorActions = hVar.f101593g.getOnEditorActions();
                    if (onEditorActions != null) {
                        Iterator<T> it = onEditorActions.iterator();
                        while (it.hasNext()) {
                            hVar.f101592f.o((BeduinAction) it.next());
                        }
                    }
                }
                return false;
            case 3:
                CampaignsSaleSearchFragment.a aVar = CampaignsSaleSearchFragment.f114473A0;
                if (i12 != 3) {
                    return false;
                }
                CampaignsSaleSearchFragment campaignsSaleSearchFragment = (CampaignsSaleSearchFragment) obj;
                campaignsSaleSearchFragment.v5().accept(new b.q(campaignsSaleSearchFragment.u5().getDeformattedText()));
                return true;
            case 4:
                if (i12 != 6) {
                    return false;
                }
                y yVar = (y) obj;
                if (!yVar.f147056v.b()) {
                    return false;
                }
                yVar.f147038d.accept(new InterfaceC13103a.g(String.valueOf(yVar.f147044j.m53getText())));
                return true;
            case 5:
                ExtendedProfileSetSelectionNameFragment.a aVar2 = ExtendedProfileSetSelectionNameFragment.f151810A0;
                if (i12 != 6) {
                    return false;
                }
                K2.e((ExtendedProfileSetSelectionNameFragment) obj);
                return true;
            case 6:
                if (i12 != 6 && (keyEvent == null || keyEvent.getAction() != 0 || keyEvent.getKeyCode() != 66)) {
                    return false;
                }
                Y41.a<G0> aVar3 = ((z) obj).f178000d;
                if (aVar3 != null) {
                    aVar3.invoke();
                }
                return true;
            case 7:
                kotlin.reflect.n<Object>[] nVarArr = TextInputView.f178012o;
                Y41.l<Integer, G0> actionListener = ((TextInputView) obj).getActionListener();
                if (actionListener != null) {
                    actionListener.invoke(Integer.valueOf(i12));
                    g02 = G0.f406611a;
                }
                return g02 != null;
            case 8:
                if (i12 == 6) {
                    ((N) obj).invoke();
                }
                return true;
            case 9:
                ReAgentSetProfileNameFragment.a aVar4 = ReAgentSetProfileNameFragment.f211382C0;
                if (i12 != 6) {
                    return false;
                }
                ReAgentSetProfileNameFragment reAgentSetProfileNameFragment = (ReAgentSetProfileNameFragment) obj;
                reAgentSetProfileNameFragment.t5().accept(a.b.f13468a);
                K2.e(reAgentSetProfileNameFragment);
                return true;
            case 10:
                SetProfileNameFragment.a aVar5 = SetProfileNameFragment.f212039E0;
                if (i12 != 6) {
                    return false;
                }
                SetProfileNameFragment setProfileNameFragment = (SetProfileNameFragment) obj;
                setProfileNameFragment.v5().accept(a.c.f16912a);
                K2.e(setProfileNameFragment);
                return true;
            case 11:
                if (i12 != 6) {
                    int i15 = SuggestAddressesToolbarImpl.f291961f;
                    return false;
                }
                SuggestAddressesToolbarImpl suggestAddressesToolbarImpl = (SuggestAddressesToolbarImpl) obj;
                String strValueOf = String.valueOf(suggestAddressesToolbarImpl.f291962b.m53getText());
                Y41.l<? super String, G0> lVar = suggestAddressesToolbarImpl.f291965e;
                if (lVar != null) {
                    lVar.invoke(strValueOf);
                }
                return true;
            case 12:
                if (i12 != 6) {
                    int i16 = SuggestLocationsToolbarImpl.f292156h;
                    return false;
                }
                SuggestLocationsToolbarImpl suggestLocationsToolbarImpl = (SuggestLocationsToolbarImpl) obj;
                suggestLocationsToolbarImpl.f292162g.accept(String.valueOf(suggestLocationsToolbarImpl.f292157b.getText()));
                return true;
            case 13:
                if (i12 != 6) {
                    int i17 = SuggestLocationsToolbarRedesign.f292163f;
                    return false;
                }
                SuggestLocationsToolbarRedesign suggestLocationsToolbarRedesign = (SuggestLocationsToolbarRedesign) obj;
                suggestLocationsToolbarRedesign.f292167e.accept(String.valueOf(suggestLocationsToolbarRedesign.f292164b.m53getText()));
                return true;
            case 14:
                int i18 = com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h.f312807p;
                C41336a.C11375a.a();
                boolean z12 = i12 == 3;
                if (z12 && (c35565c = ((com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.h) obj).f312822o) != null) {
                    c35565c.a(a.e.f1293a);
                }
                return z12;
            default:
                return CBRApplicantDataFieldView.m283lambda3$lambda2((CBRApplicantDataFieldView) obj, textView, i12, keyEvent);
        }
    }

    public /* synthetic */ C27140f(Object obj, int i12) {
        this.f57941b = i12;
        this.f57942c = obj;
    }
}
