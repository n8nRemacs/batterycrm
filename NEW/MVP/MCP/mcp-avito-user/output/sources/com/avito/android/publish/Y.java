package com.avito.android.publish;

import android.os.Bundle;
import android.view.View;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.analytics.screens.tracker.ScreenTransfer;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.publish.Q0;
import com.avito.android.publish.W0;
import com.avito.android.publish.analytics.C33536w;
import com.avito.android.publish.analytics.InterfaceC33535v;
import com.avito.android.publish.details.PublishDetailsFragment;
import com.avito.android.publish.edit_advert_request.EditAdvertRequestFragment;
import com.avito.android.publish.edit_advert_request_mvi.EditRequestFragment;
import com.avito.android.publish.free_delivery.FreeDeliveryFragment;
import com.avito.android.publish.input_imei.InputImeiFragment;
import com.avito.android.publish.input_vin.mvi.InputVinMviFragment;
import com.avito.android.publish.merge_pretend_premoderation.MergePretendPremoderationFragment;
import com.avito.android.publish.params_suggest.ParamsSuggestionsFragment;
import com.avito.android.publish.pretend.PretendFragment;
import com.avito.android.publish.price_list.SelectPriceListFragment;
import com.avito.android.publish.publish_advert_request.PublishAdvertRequestFragment;
import com.avito.android.publish.screen.step.params.PublishDetailsFragment;
import com.avito.android.publish.screen.step.request.mergedpretendpremoderation.MergedPretendPremoderationFragment;
import com.avito.android.publish.screen.step.request.publish.PublishRequestFragment;
import com.avito.android.publish.screen.step.request.steps.StepsRequestFragment;
import com.avito.android.publish.screen.step.select.SelectFragment;
import com.avito.android.publish.screen.step.suggest.category.SuggestCategoryFragment;
import com.avito.android.publish.screen.step.wizard.WizardFragment;
import com.avito.android.publish.step.request.suggest.SuggestRequestFragment;
import com.avito.android.remote.model.ItemBrief;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.category_parameters.CategoryPublishStep;
import com.avito.android.remote.model.category_parameters.RestrictionConfig;
import com.avito.android.util.K2;
import io.reactivex.rxjava3.internal.operators.single.C42017o;
import io.reactivex.rxjava3.kotlin.A1;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlinx.coroutines.C43259k;

/* compiled from: PublishActivity.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/publish/Q0;", "kotlin.jvm.PlatformType", "routingAction", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/publish/Q0;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes16.dex */
final class Y extends kotlin.jvm.internal.N implements Y41.l<Q0, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ PublishActivity f232105l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ C0 f232106m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public Y(PublishActivity publishActivity, C0 c02) {
        super(1);
        this.f232105l = publishActivity;
        this.f232106m = c02;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(Q0 q02) {
        Fragment paramsSuggestionsFragment;
        Fragment publishAdvertRequestFragment;
        Fragment mergePretendPremoderationFragment;
        Fragment fragmentA;
        Fragment pretendFragment;
        Fragment selectFragment;
        Fragment fragmentA2;
        String strNe;
        Q0 q03 = q02;
        PublishActivity publishActivity = this.f232105l;
        K2.c(publishActivity);
        boolean z12 = q03.f232038a;
        C0 c02 = this.f232106m;
        if (z12) {
            if (q03 instanceof Q0.b) {
                CategoryPublishStep categoryPublishStepRe = c02.re(Integer.valueOf(((Q0.b) q03).f232041c));
                strNe = categoryPublishStepRe != null ? categoryPublishStepRe.toString() : null;
            } else {
                strNe = c02.ne();
            }
            C33536w c33536w = publishActivity.f231981r;
            if (c33536w == null) {
                c33536w = null;
            }
            T0 t02 = publishActivity.f231989z;
            if (t02 == null) {
                t02 = null;
            }
            InterfaceC33535v.a.a(c33536w, strNe, t02.i(), 4);
        }
        if (q03 instanceof Q0.s) {
            Q0.s sVar = (Q0.s) q03;
            Q1 q12 = publishActivity.f231983t;
            if (q12 == null) {
                q12 = null;
            }
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[72];
            boolean zBooleanValue = ((Boolean) q12.f67489h0.a().invoke()).booleanValue();
            ScreenTransfer screenTransfer = q03.f232039b;
            if (zBooleanValue) {
                PublishDetailsFragment.a aVar = PublishDetailsFragment.f240417j1;
                C0 c03 = publishActivity.f231984u;
                String str = (c03 != null ? c03 : null).f231866d0;
                if (str == null) {
                    str = null;
                }
                if (c03 == null) {
                    c03 = null;
                }
                boolean zBe = c03.Be();
                aVar.getClass();
                fragmentA2 = PublishDetailsFragment.a.a(str, zBe, screenTransfer, null);
            } else {
                PublishDetailsFragment.a aVar2 = com.avito.android.publish.details.PublishDetailsFragment.f233085Y2;
                C0 c04 = publishActivity.f231984u;
                String str2 = (c04 != null ? c04 : null).f231866d0;
                if (str2 == null) {
                    str2 = null;
                }
                if (c04 == null) {
                    c04 = null;
                }
                boolean zBe2 = c04.Be();
                aVar2.getClass();
                fragmentA2 = PublishDetailsFragment.a.a(str2, zBe2, screenTransfer, null);
            }
            publishActivity.g2(fragmentA2, sVar.f232059c);
            kotlin.G0 g02 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.v) {
            int i12 = PublishActivity.f231968H;
            publishActivity.g2(new InputVinMviFragment(), ((Q0.v) q03).f232062c);
            kotlin.G0 g03 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.u) {
            int i13 = PublishActivity.f231968H;
            publishActivity.g2(new InputImeiFragment(), ((Q0.u) q03).f232061c);
            kotlin.G0 g04 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.t) {
            int i14 = PublishActivity.f231968H;
            publishActivity.g2(new FreeDeliveryFragment(), ((Q0.t) q03).f232060c);
            kotlin.G0 g05 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.w) {
            Q0.w wVar = (Q0.w) q03;
            int i15 = PublishActivity.f231968H;
            SelectPriceListFragment.f238386A0.getClass();
            SelectPriceListFragment selectPriceListFragment = new SelectPriceListFragment();
            selectPriceListFragment.setArguments(C22777e.b(new kotlin.Q("select_price_list_param_key", wVar.f232064d)));
            publishActivity.g2(selectPriceListFragment, wVar.f232063c);
            kotlin.G0 g06 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.x) {
            Q0.x xVar = (Q0.x) q03;
            Q1 q13 = publishActivity.f231983t;
            Q1 q14 = q13 != null ? q13 : null;
            q14.getClass();
            kotlin.reflect.n<Object> nVar2 = Q1.f67448x0[25];
            if (((Boolean) q14.f67449A.a().invoke()).booleanValue()) {
                SelectFragment.f242071A0.getClass();
                selectFragment = new SelectFragment();
            } else {
                selectFragment = new com.avito.android.publish.select.SelectFragment();
            }
            publishActivity.g2(selectFragment, xVar.f232065c);
            kotlin.G0 g07 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.y) {
            Q0.y yVar = (Q0.y) q03;
            WizardFragment.b bVar = WizardFragment.f242389y0;
            List<Navigation> list = publishActivity.getIntent().getBooleanExtra("key_start_from_subcategory", false) ? null : yVar.f232068e;
            bVar.getClass();
            publishActivity.g2(WizardFragment.b.a(yVar.f232067d, list), yVar.f232066c);
            kotlin.G0 g08 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.r) {
            SuggestCategoryFragment.f242221A0.getClass();
            SuggestCategoryFragment suggestCategoryFragment = new SuggestCategoryFragment();
            int i16 = PublishActivity.f231968H;
            publishActivity.g2(suggestCategoryFragment, ((Q0.r) q03).f232058c);
            kotlin.G0 g09 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.l) {
            Q0.l lVar = (Q0.l) q03;
            Q1 q15 = publishActivity.f231983t;
            Q1 q16 = q15 != null ? q15 : null;
            q16.getClass();
            kotlin.reflect.n<Object> nVar3 = Q1.f67448x0[42];
            if (((Boolean) q16.f67464P.a().invoke()).booleanValue()) {
                MergedPretendPremoderationFragment.Companion companion = MergedPretendPremoderationFragment.f241715s0;
                MergedPretendPremoderationFragment.Companion.Strategy strategy = MergedPretendPremoderationFragment.Companion.Strategy.f241721b;
                companion.getClass();
                pretendFragment = MergedPretendPremoderationFragment.Companion.a(strategy);
            } else {
                pretendFragment = new PretendFragment();
            }
            publishActivity.g2(pretendFragment, lVar.f232052c);
            kotlin.G0 g010 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.g) {
            Q0.g gVar = (Q0.g) q03;
            boolean z13 = gVar.f232047d;
            if (z13) {
                int i17 = PublishActivity.f231968H;
                publishActivity.c2();
            }
            Q1 q17 = publishActivity.f231983t;
            if (q17 == null) {
                q17 = null;
            }
            q17.getClass();
            kotlin.reflect.n<Object> nVar4 = Q1.f67448x0[33];
            if (((Boolean) q17.f67456H.a().invoke()).booleanValue()) {
                StepsRequestFragment.b bVar2 = StepsRequestFragment.f241945s0;
                String str3 = c02.f231866d0;
                String str4 = str3 != null ? str3 : null;
                boolean booleanExtra = publishActivity.getIntent().getBooleanExtra("should_track_draft_resume", false);
                bVar2.getClass();
                fragmentA = StepsRequestFragment.b.a(str4, z13, booleanExtra);
            } else {
                boolean booleanExtra2 = publishActivity.getIntent().getBooleanExtra("should_track_draft_resume", false);
                String str5 = c02.f231866d0;
                fragmentA = com.avito.android.publish.infomodel_request.d.a(str5 != null ? str5 : null, z13, booleanExtra2);
            }
            publishActivity.g2(fragmentA, gVar.f232046c);
            kotlin.G0 g011 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.k) {
            int i18 = PublishActivity.f231968H;
            MergedPretendPremoderationFragment.Companion companion2 = MergedPretendPremoderationFragment.f241715s0;
            MergedPretendPremoderationFragment.Companion.Strategy strategy2 = MergedPretendPremoderationFragment.Companion.Strategy.f241722c;
            companion2.getClass();
            publishActivity.g2(MergedPretendPremoderationFragment.Companion.a(strategy2), ((Q0.k) q03).f232051c);
            kotlin.G0 g012 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.i) {
            Q0.i iVar = (Q0.i) q03;
            Q1 q18 = publishActivity.f231983t;
            Q1 q19 = q18 != null ? q18 : null;
            q19.getClass();
            kotlin.reflect.n<Object> nVar5 = Q1.f67448x0[34];
            if (((Boolean) q19.f67457I.a().invoke()).booleanValue()) {
                MergedPretendPremoderationFragment.Companion companion3 = MergedPretendPremoderationFragment.f241715s0;
                MergedPretendPremoderationFragment.Companion.Strategy strategy3 = MergedPretendPremoderationFragment.Companion.Strategy.f241723d;
                companion3.getClass();
                mergePretendPremoderationFragment = MergedPretendPremoderationFragment.Companion.a(strategy3);
            } else {
                MergePretendPremoderationFragment.f237393t0.getClass();
                mergePretendPremoderationFragment = new MergePretendPremoderationFragment();
            }
            publishActivity.g2(mergePretendPremoderationFragment, iVar.f232049c);
            kotlin.G0 g013 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.a) {
            c02.xe(null);
            kotlin.G0 g014 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.m) {
            Q0.m mVar = (Q0.m) q03;
            Q1 q110 = publishActivity.f231983t;
            if (q110 == null) {
                q110 = null;
            }
            q110.getClass();
            kotlin.reflect.n<Object> nVar6 = Q1.f67448x0[45];
            if (((Boolean) q110.f67467S.a().invoke()).booleanValue()) {
                PublishRequestFragment.b bVar3 = PublishRequestFragment.f241833r0;
                C0 c05 = publishActivity.f231984u;
                if (c05 == null) {
                    c05 = null;
                }
                String str6 = c05.f231866d0;
                String str7 = str6 != null ? str6 : null;
                bVar3.getClass();
                publishAdvertRequestFragment = PublishRequestFragment.b.a(str7);
            } else {
                C0 c06 = publishActivity.f231984u;
                if (c06 == null) {
                    c06 = null;
                }
                String str8 = c06.f231866d0;
                String str9 = str8 != null ? str8 : null;
                publishAdvertRequestFragment = new PublishAdvertRequestFragment();
                Bundle bundle = new Bundle(1);
                bundle.putString("draft_id", str9);
                publishAdvertRequestFragment.setArguments(bundle);
            }
            publishActivity.g2(publishAdvertRequestFragment, mVar.f232053c);
            kotlin.G0 g015 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.e) {
            Q0.e eVar = (Q0.e) q03;
            Q1 q111 = publishActivity.f231983t;
            Q1 q112 = q111 != null ? q111 : null;
            q112.getClass();
            kotlin.reflect.n<Object> nVar7 = Q1.f67448x0[26];
            publishActivity.g2(((Boolean) q112.f67450B.a().invoke()).booleanValue() ? new EditRequestFragment() : new EditAdvertRequestFragment(), eVar.f232044c);
            kotlin.G0 g016 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.b) {
            int i19 = PublishActivity.f231968H;
            String strH2 = PublishActivity.h2(((Q0.b) q03).f232041c);
            if (publishActivity.getSupportFragmentManager().H(strH2) != null) {
                publishActivity.getSupportFragmentManager().b0(-1, 0, strH2);
            } else {
                c02.ye();
                kotlin.G0 g017 = kotlin.G0.f406611a;
            }
        } else if (q03.equals(Q0.h.f232048c)) {
            publishActivity.d2(null);
            kotlin.G0 g018 = kotlin.G0.f406611a;
        } else if (q03.equals(Q0.c.f232042c)) {
            int i22 = PublishActivity.f231968H;
            publishActivity.setResult(0);
            publishActivity.e2();
            C0 c07 = publishActivity.f231984u;
            if ((c07 != null ? c07 : null).Be() || publishActivity.getIntent().hasExtra("should_draft_id")) {
                publishActivity.overridePendingTransition(0, R.anim.avito_screen_slide_out);
            } else {
                publishActivity.overridePendingTransition(0, R.anim.slide_out_publish);
            }
            kotlin.G0 g019 = kotlin.G0.f406611a;
        } else if (q03.equals(Q0.z.f232069c)) {
            W0 w02 = publishActivity.f231980q;
            if (w02 == null) {
                w02 = null;
            }
            boolean zA2 = W0.a.a(w02, false, 3);
            com.avito.android.lib.deprecated_design.dialog.a aVar3 = publishActivity.f231985v;
            (aVar3 != null ? aVar3 : null).c(publishActivity.getString(R.string.unexpected_error_title), publishActivity.getString(zA2 ? R.string.unexpected_error_message_when_draft_saved : R.string.unexpected_error_message), publishActivity.getString(R.string.close), new T(publishActivity));
            kotlin.G0 g020 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.q) {
            Q0.q qVar = (Q0.q) q03;
            Q1 q113 = publishActivity.f231983t;
            Q1 q114 = q113 != null ? q113 : null;
            q114.getClass();
            kotlin.reflect.n<Object> nVar8 = Q1.f67448x0[27];
            if (((Boolean) q114.f67451C.a().invoke()).booleanValue()) {
                SuggestRequestFragment.f245452q0.getClass();
                paramsSuggestionsFragment = new SuggestRequestFragment();
            } else {
                paramsSuggestionsFragment = new ParamsSuggestionsFragment();
            }
            publishActivity.g2(paramsSuggestionsFragment, qVar.f232057c);
            kotlin.G0 g021 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.j) {
            publishActivity.a(((Q0.j) q03).f232050c);
            kotlin.G0 g022 = kotlin.G0.f406611a;
        } else if (q03 instanceof Q0.p) {
            Q0.p pVar = (Q0.p) q03;
            View view = publishActivity.f231975G;
            if (view != null) {
                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, view, com.avito.android.printable_text.b.f(pVar.f232056c), null, null, null, f.a.f125253a, 0, ToastBarPosition.f181045c, null, false, false, null, null, 4014);
            }
            kotlin.G0 g023 = kotlin.G0.f406611a;
        } else if (q03.equals(Q0.d.f232043c)) {
            C43259k.d(C22981N.a(publishActivity.getLifecycle()), null, null, new X(publishActivity, null), 3);
        } else if (q03 instanceof Q0.o) {
            com.avito.android.progress_overlay.l lVar2 = publishActivity.f231974F;
            if (lVar2 != null) {
                lVar2.k(null);
                kotlin.G0 g024 = kotlin.G0.f406611a;
            }
        } else if (q03 instanceof Q0.f) {
            com.avito.android.progress_overlay.l lVar3 = publishActivity.f231974F;
            if (lVar3 != null) {
                lVar3.j();
                kotlin.G0 g025 = kotlin.G0.f406611a;
            }
        } else {
            if (!(q03 instanceof Q0.n)) {
                throw new NoWhenBranchMatchedException();
            }
            Q0.n nVar9 = (Q0.n) q03;
            List<CategoryPublishStep> listUe = c02.ue();
            CategoryPublishStep categoryPublishStep = listUe != null ? (CategoryPublishStep) C42745f0.K(nVar9.f232054c, listUe) : null;
            CategoryPublishStep.Restriction restriction = categoryPublishStep instanceof CategoryPublishStep.Restriction ? (CategoryPublishStep.Restriction) categoryPublishStep : null;
            if (restriction != null) {
                RestrictionConfig.Request request = restriction.getConfig().getRequest();
                ItemBrief itemBrief = c02.f231867e0;
                c02.f231853Q.b(A1.e(new C42017o(c02.f231851O.a(request, itemBrief != null ? itemBrief.getId() : null).s(c02.f231852P.e()).j(new D0(c02)), new B0(c02, 0)), new E0(c02, restriction), new F0(c02, restriction)));
            }
            kotlin.G0 g026 = kotlin.G0.f406611a;
        }
        return kotlin.G0.f406611a;
    }
}
