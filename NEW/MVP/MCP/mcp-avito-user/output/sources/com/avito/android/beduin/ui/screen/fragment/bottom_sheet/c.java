package com.avito.android.beduin.ui.screen.fragment.bottom_sheet;

import FC.a;
import Ps.InterfaceC14833a;
import Ts.InterfaceC15401a;
import U10.a;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.C22823h0;
import androidx.core.view.J0;
import androidx.core.view.M;
import androidx.core.widget.NestedScrollView;
import androidx.fragment.app.C;
import androidx.metrics.performance.f;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import b20.InterfaceC25394a;
import com.avito.android.R;
import com.avito.android.beduin.ui.screen.fragment.bottom_sheet.BottomSheetScreenFragment;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.bottom_navigation.RunnableC28882d;
import com.avito.android.brandspace.beduin_v2.BrandspaceBeduinV2Fragment;
import com.avito.android.brandspace.remote.model.Brandspace;
import com.avito.android.brandspace.remote.model.BrandspaceAdjustParameters;
import com.avito.android.checkout.CheckoutFragment;
import com.avito.android.code_check.code_confirm.CodeConfirmFragment;
import com.avito.android.code_check_public.screen.c;
import com.avito.android.code_confirmation.code_confirmation.h0;
import com.avito.android.code_confirmation.code_confirmation.j0;
import com.avito.android.comfortable_deal.clients.ClientsFragment;
import com.avito.android.crm_candidates.view.base.JobCrmCandidatesFragment;
import com.avito.android.deeplink_handler.handler.composite.d;
import com.avito.android.developments_agency_search.screen.big_filters.BigFiltersFragment;
import com.avito.android.developments_agency_search.screen.deal_cabinet.DealCabinetFragment;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.ReturnToWorkDialog;
import com.avito.android.developments_agency_search.screen.deal_cabinet.return_to_work.model.ReturnToWorkResult;
import com.avito.android.evidence_request.reasons.ProofTypesFragment;
import com.avito.android.extended_profile_map.w;
import com.avito.android.extended_profile_universal_widget_edit.edit.UniversalWidgetEditFragment;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockFragment;
import com.avito.android.extended_profile_universal_widget_edit.edit_block.UniversalWidgetEditBlockResult;
import com.avito.android.favorite_comparison.presentation.a;
import com.avito.android.favorite_sellers.H;
import com.avito.android.favorite_sellers.adapter.recommendation.B;
import com.avito.android.geo.GeoService;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.radio.RadioButton;
import com.avito.android.lib.design.radio.RadioGroup;
import com.avito.android.location_list.k0;
import com.avito.android.messenger.channels.mvi.view.ChannelsFragment;
import com.avito.android.mortgage_invite.client_form.ApplicationClientFormFragment;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchResult;
import com.avito.android.mortgage_invite.contact_info.ApplicationContactInfoFragment;
import com.avito.android.mortgage_invite.participant.ParticipantFragment;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.util.D6;
import com.avito.android.util.y6;
import com.google.crypto.tink.aead.internal.InsecureNonceXChaCha20;
import com.huawei.hms.adapter.internal.AvailableCode;
import gj.InterfaceC40691b;
import iF.InterfaceC41278b;
import ik.InterfaceC41416a;
import io.reactivex.rxjava3.core.B;
import io.reactivex.rxjava3.core.K;
import jB.InterfaceC42227a;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.List;
import kotlin.G0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;
import kotlin.ranges.s;
import kp.InterfaceC43475a;
import mn.InterfaceC44101a;
import p20.InterfaceC46876a;
import pH.i;
import pi.C47093d;
import rv.C47919b;
import ww.InterfaceC49690a;
import xo.InterfaceC49972a;
import zw.b;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes11.dex */
public final /* synthetic */ class c implements InterfaceC41278b, C, SwipeRefreshLayout.f, M, com.avito.android.code_check_public.c, io.reactivex.rxjava3.core.C, RadioGroup.d, f.b, io.reactivex.rxjava3.core.M, Toolbar.h, NestedScrollView.e {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f104180b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f104181c;

    public /* synthetic */ c(Parcelable parcelable) {
        this.f104180b = 5;
        this.f104181c = parcelable;
    }

    @Override // androidx.metrics.performance.f.b
    public void a(androidx.metrics.performance.c cVar) {
        com.avito.android.fps.e eVar = (com.avito.android.fps.e) this.f104181c;
        eVar.f158628d.post(new RunnableC28882d(8, eVar, cVar));
    }

    @Override // com.avito.android.lib.design.radio.RadioGroup.d
    public void b(RadioButton radioButton) {
        switch (this.f104180b) {
            case 14:
                Object tag = radioButton.getTag();
                String str = tag instanceof String ? (String) tag : null;
                if (str != null) {
                    com.avito.android.evidence_request.mvi.proof_types.c cVar = (com.avito.android.evidence_request.mvi.proof_types.c) this.f104181c;
                    Button button = cVar.f149174d;
                    button.setEnabled(true);
                    button.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(26, cVar, str));
                    break;
                }
                break;
            default:
                ProofTypesFragment proofTypesFragment = (ProofTypesFragment) this.f104181c;
                Button button2 = proofTypesFragment.f149193p0;
                if (button2 == null) {
                    button2 = null;
                }
                String str2 = (String) radioButton.getTag();
                button2.setEnabled(true);
                button2.setOnClickListener(new com.avito.android.crm_candidates.view.dialogs.f(27, proofTypesFragment, str2));
                break;
        }
    }

    @Override // iF.InterfaceC41278b
    public void c() {
        C47093d c47093d;
        List<BeduinAction> listC;
        BottomSheetScreenFragment.a aVar = BottomSheetScreenFragment.f104149R0;
        BottomSheetScreenFragment bottomSheetScreenFragment = (BottomSheetScreenFragment) this.f104181c;
        n nVar = (n) bottomSheetScreenFragment.q5().f104253K.getValue();
        if (nVar == null || (c47093d = nVar.f104196c) == null || (listC = c47093d.c()) == null) {
            return;
        }
        InterfaceC40691b interfaceC40691b = bottomSheetScreenFragment.q5().f104251E.f104269d;
        Iterator<T> it = listC.iterator();
        while (it.hasNext()) {
            interfaceC40691b.o((BeduinAction) it.next());
        }
    }

    @Override // io.reactivex.rxjava3.core.C
    public void f(B b12) {
        switch (this.f104180b) {
            case 6:
                j0 j0Var = (j0) this.f104181c;
                androidx.core.content.d.registerReceiver(j0Var.f119561b, j0Var, j0Var.f119562c, 2);
                b12.onNext(G0.f406611a);
                b12.f(new h0(j0Var, 0));
                break;
            case 10:
                com.avito.android.deeplink_handler.handler.composite.d dVar = (com.avito.android.deeplink_handler.handler.composite.d) this.f104181c;
                if (!dVar.f134529M) {
                    new com.avito.android.deeplink_handler.handler.lifecycle.b(dVar.le().b(), new d.f(b12));
                    break;
                } else {
                    b12.onNext(G0.f406611a);
                    break;
                }
            default:
                int i12 = com.avito.android.favorite_sellers.adapter.recommendation.B.f155582i;
                B.b bVar = new B.b(b12);
                com.avito.android.favorite_sellers.adapter.recommendation.B b13 = (com.avito.android.favorite_sellers.adapter.recommendation.B) this.f104181c;
                b13.f155584c.o(bVar);
                b12.f(new com.avito.android.app.work.a(1, b13, bVar));
                break;
        }
    }

    @Override // androidx.core.widget.NestedScrollView.e
    public void g(NestedScrollView nestedScrollView, int i12, int i13, int i14, int i15) {
        if (i13 == i15) {
            kotlin.reflect.n<Object>[] nVarArr = com.avito.android.messenger.map.d.f196447r;
            return;
        }
        com.avito.android.messenger.map.d dVar = (com.avito.android.messenger.map.d) this.f104181c;
        TextView textView = dVar.f196455i;
        if (textView.getHeight() > 0) {
            View view = dVar.f196456j;
            if (i13 > 0 && i15 <= 0) {
                D6.H(view);
            } else if (i13 <= 0 && i15 > 0) {
                D6.g(view);
            }
            int height = textView.getHeight() - dVar.f196457k.getHeight();
            if (height <= 0 || i13 <= 0) {
                textView.setAlpha(1.0f);
            } else {
                textView.setAlpha(s.a(1 - (i13 / height), 0.0f) / 2);
            }
        }
    }

    @Override // androidx.core.view.M
    public J0 h(View view, J0 j02) {
        Object obj = this.f104181c;
        switch (this.f104180b) {
            case 3:
                CheckoutFragment.a aVar = CheckoutFragment.f118107C0;
                if (j02.p(8)) {
                    ((CheckoutFragment) obj).q5().accept(InterfaceC49972a.d.f442626a);
                }
                return C22823h0.v(view, j02);
            default:
                w wVar = (w) obj;
                View view2 = wVar.f151334h;
                ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                marginLayoutParams.setMargins(marginLayoutParams.leftMargin, y6.b(24) + j02.e(1).f44776b, marginLayoutParams.rightMargin, marginLayoutParams.bottomMargin);
                view2.setLayoutParams(marginLayoutParams);
                View view3 = wVar.f151328b;
                ViewGroup.LayoutParams layoutParams2 = view3.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
                ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
                int i12 = j02.e(2).f44778d;
                marginLayoutParams2.setMargins(j02.e(2).f44775a, marginLayoutParams2.topMargin, j02.e(2).f44777c, i12);
                view3.setLayoutParams(marginLayoutParams2);
                return J0.f44939b;
        }
    }

    @Override // io.reactivex.rxjava3.core.M
    public void j(K k12) {
        Activity activity;
        com.avito.android.location.find.c cVar = (com.avito.android.location.find.c) this.f104181c;
        cVar.f181746b = k12;
        WeakReference<Activity> weakReference = cVar.f181747c;
        if (weakReference == null || (activity = weakReference.get()) == null) {
            return;
        }
        GeoService.f159279i.getClass();
        activity.startService(new Intent(activity, (Class<?>) GeoService.class).putExtra("accuracy", 1).putExtra("force_update", true).putExtra("timeout", 2000L));
    }

    @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.f
    public void j0() {
        Object obj = this.f104181c;
        switch (this.f104180b) {
            case 2:
                ((com.avito.android.cart_similar_items.l) obj).f115907a.invoke(InterfaceC44101a.h.f414684a);
                break;
            case 8:
                JobCrmCandidatesFragment.a aVar = JobCrmCandidatesFragment.f129791O0;
                JobCrmCandidatesFragment jobCrmCandidatesFragment = (JobCrmCandidatesFragment) obj;
                jobCrmCandidatesFragment.s5().accept(InterfaceC14833a.k.f13355a);
                com.avito.konveyor.adapter.d dVar = jobCrmCandidatesFragment.f129813u0;
                if ((dVar != null ? dVar : null).f338497e.getCount() == 0) {
                    jobCrmCandidatesFragment.r5().accept(InterfaceC15401a.d.f15958a);
                    break;
                }
                break;
            case 9:
                ((com.avito.android.crm_paid_cvs.render.a) obj).f130665k.invoke();
                break;
            case 18:
                ((com.avito.android.favorite_comparison.presentation.n) obj).f155346b.m1().onNext(a.C4551a.f155312a);
                break;
            case 19:
                H h12 = (H) obj;
                com.avito.android.lib.design.toast_bar.k kVar = h12.f155443q;
                if (kVar != null) {
                    kVar.f();
                }
                h12.f155443q = null;
                h12.f155430d.accept(new a.d(true));
                break;
            default:
                ((com.avito.android.gig_apply.ui.s) obj).f160047b.accept(i.k.f428362a);
                break;
        }
    }

    @Override // androidx.fragment.app.C
    public void k(Bundle bundle, String str) {
        MortgageClientSearchResult mortgageClientSearchResult;
        Object obj = this.f104181c;
        switch (this.f104180b) {
            case 1:
                if (str.hashCode() == 192272146 && str.equals("key_brandspace_beduin_v2_request")) {
                    BrandspaceAdjustParameters brandspaceAdjustParameters = (BrandspaceAdjustParameters) bundle.getParcelable("key_brandspace_beduin_v2_adjust_params");
                    Brandspace.BeduinV2 beduinV2 = (Brandspace.BeduinV2) bundle.getParcelable("key_brandspace_beduin_v2_data");
                    if (brandspaceAdjustParameters != null && beduinV2 != null) {
                        ((com.avito.android.brandspace.beduin_v2.b) ((BrandspaceBeduinV2Fragment) obj).f107506p0.getValue()).accept(new InterfaceC41416a.C11390a(brandspaceAdjustParameters, beduinV2));
                        break;
                    }
                }
                break;
            case 7:
                ClientsFragment.a aVar = ClientsFragment.f120092u0;
                ((ClientsFragment) obj).r5().accept(InterfaceC43475a.h.f413186a);
                break;
            case 11:
                ((com.avito.android.deeplink_handler.view.lifecycle.i) obj).f134660c.onNext(new C47919b(bundle, str));
                break;
            case 12:
                BigFiltersFragment.a aVar2 = BigFiltersFragment.f136550r0;
                if (str.hashCode() == 1326943398 && str.equals("location_group_screen_result_key")) {
                    SearchParams searchParams = (SearchParams) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("search_params_bundle_id", SearchParams.class) : bundle.getParcelable("search_params_bundle_id"));
                    if (searchParams != null) {
                        ((BigFiltersFragment) obj).g5().accept(new InterfaceC49690a.k(searchParams));
                        break;
                    }
                }
                break;
            case 13:
                DealCabinetFragment.a aVar3 = DealCabinetFragment.f136758y0;
                ReturnToWorkDialog.f137161l0.getClass();
                ReturnToWorkResult returnToWorkResult = (ReturnToWorkResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("result.key", ReturnToWorkResult.class) : bundle.getParcelable("result.key"));
                if (returnToWorkResult != null) {
                    ((DealCabinetFragment) obj).q5().accept(new b.u(returnToWorkResult));
                    break;
                }
                break;
            case 17:
                UniversalWidgetEditFragment.a aVar4 = UniversalWidgetEditFragment.f153776u0;
                UniversalWidgetEditBlockFragment.f153966s0.getClass();
                UniversalWidgetEditBlockResult universalWidgetEditBlockResult = (UniversalWidgetEditBlockResult) bundle.getParcelable("edit_universal_widget_block_result");
                if (universalWidgetEditBlockResult != null && (universalWidgetEditBlockResult instanceof UniversalWidgetEditBlockResult.Success)) {
                    UniversalWidgetEditBlockResult.Success success = (UniversalWidgetEditBlockResult.Success) universalWidgetEditBlockResult;
                    ((com.avito.android.extended_profile_universal_widget_edit.edit.l) ((UniversalWidgetEditFragment) obj).f153778o0.getValue()).accept(new InterfaceC42227a.e(success.f153995b, success.f153996c));
                    break;
                }
                break;
            case AvailableCode.USER_IGNORE_PREVIOUS_POPUP /* 27 */:
                ApplicationClientFormFragment.a aVar5 = ApplicationClientFormFragment.f205015t0;
                MortgageClientSearchResult mortgageClientSearchResult2 = (MortgageClientSearchResult) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("MORTGAGE_CLIENT_SEARCH_RESULT_KEY", MortgageClientSearchResult.class) : bundle.getParcelable("MORTGAGE_CLIENT_SEARCH_RESULT_KEY"));
                ApplicationClientFormFragment applicationClientFormFragment = (ApplicationClientFormFragment) obj;
                if (!(mortgageClientSearchResult2 instanceof MortgageClientSearchResult.ClientSelected)) {
                    if (L.f(mortgageClientSearchResult2, MortgageClientSearchResult.NewClientSelected.f205408b)) {
                        applicationClientFormFragment.q5().accept(a.g.f16096a);
                        break;
                    }
                } else {
                    applicationClientFormFragment.q5().accept(new a.f(((MortgageClientSearchResult.ClientSelected) mortgageClientSearchResult2).f205407b));
                    break;
                }
                break;
            case AvailableCode.APP_IS_BACKGROUND_OR_LOCKED /* 28 */:
                ApplicationContactInfoFragment.a aVar6 = ApplicationContactInfoFragment.f205577u0;
                Object parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("MORTGAGE_CLIENT_SEARCH_RESULT_KEY", MortgageClientSearchResult.class) : bundle.getParcelable("MORTGAGE_CLIENT_SEARCH_RESULT_KEY");
                mortgageClientSearchResult = parcelable instanceof MortgageClientSearchResult ? (MortgageClientSearchResult) parcelable : null;
                ApplicationContactInfoFragment applicationContactInfoFragment = (ApplicationContactInfoFragment) obj;
                if (!(mortgageClientSearchResult instanceof MortgageClientSearchResult.ClientSelected)) {
                    if (mortgageClientSearchResult instanceof MortgageClientSearchResult.NewClientSelected) {
                        applicationContactInfoFragment.q5().accept(InterfaceC25394a.h.f56834a);
                        break;
                    }
                } else {
                    applicationContactInfoFragment.q5().accept(new InterfaceC25394a.f(((MortgageClientSearchResult.ClientSelected) mortgageClientSearchResult).f205407b));
                    break;
                }
                break;
            default:
                ParticipantFragment.a aVar7 = ParticipantFragment.f206038v0;
                Object parcelable2 = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundle.getParcelable("MORTGAGE_CLIENT_SEARCH_RESULT_KEY", MortgageClientSearchResult.class) : bundle.getParcelable("MORTGAGE_CLIENT_SEARCH_RESULT_KEY");
                mortgageClientSearchResult = parcelable2 instanceof MortgageClientSearchResult ? (MortgageClientSearchResult) parcelable2 : null;
                ParticipantFragment participantFragment = (ParticipantFragment) obj;
                if (!(mortgageClientSearchResult instanceof MortgageClientSearchResult.ClientSelected)) {
                    if (mortgageClientSearchResult instanceof MortgageClientSearchResult.NewClientSelected) {
                        participantFragment.q5().accept(InterfaceC46876a.i.f428135a);
                        break;
                    }
                } else {
                    participantFragment.q5().accept(new InterfaceC46876a.f(((MortgageClientSearchResult.ClientSelected) mortgageClientSearchResult).f205407b));
                    break;
                }
                break;
        }
    }

    @Override // com.avito.android.code_check_public.c
    public Object k0(Context context) {
        Object obj = this.f104181c;
        switch (this.f104180b) {
            case 4:
                CodeConfirmFragment.a aVar = CodeConfirmFragment.f118629G0;
                return new AttributedText(((c.d.C3506c) ((c.d) obj)).f119358a.k0(context), C42784z0.f406748b, 0);
            default:
                return (Parcelable) obj;
        }
    }

    @Override // androidx.appcompat.widget.Toolbar.h
    public boolean onMenuItemClick(MenuItem menuItem) {
        switch (this.f104180b) {
            case InsecureNonceXChaCha20.NONCE_SIZE_IN_BYTES /* 24 */:
                if (menuItem.getItemId() != R.id.menu_find_location) {
                    return false;
                }
                ((k0) this.f104181c).f182067n.accept(G0.f406611a);
                return true;
            default:
                return ChannelsFragment.D5((ChannelsFragment) this.f104181c, menuItem);
        }
    }

    public /* synthetic */ c(Object obj, int i12) {
        this.f104180b = i12;
        this.f104181c = obj;
    }
}
