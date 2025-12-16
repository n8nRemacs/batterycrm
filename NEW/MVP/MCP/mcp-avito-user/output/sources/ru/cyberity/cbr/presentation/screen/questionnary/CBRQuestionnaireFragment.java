package ru.cyberity.cbr.presentation.screen.questionnary;

import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.Keep;
import androidx.camera.camera2.internal.G;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import e11.ViewOnClickListenerC39879j1;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.a0;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.source.applicant.remote.t;
import ru.cyberity.cbr.core.data.source.applicant.remote.v;
import ru.cyberity.cbr.core.presentation.BaseFragment;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.form.FormFragment;
import ru.cyberity.cbr.core.presentation.form.FormViewModelProvider;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.presentation.form.model.CountriesData;
import ru.cyberity.cbr.core.presentation.form.model.FormItem;
import ru.cyberity.cbr.presentation.screen.questionnary.model.a;
import ru.cyberity.internal.R;
import ru.cyberity.log.logger.Logger;

/* compiled from: CBRQuestionnaireFragment.kt */
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010$\n\u0002\u0010\u0000\n\u0002\b\u0006\u0018\u0000 F2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001GB\u0007¢\u0006\u0004\b\u0005\u0010\u0006J%\u0010\r\u001a\u00020\f2\u0006\u0010\b\u001a\u00020\u00072\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u000f\u0010\u0010J\u0019\u0010\u0013\u001a\u00020\f2\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\u0013\u0010\u0014J\u0017\u0010\u0017\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J!\u0010\r\u001a\u00020\f2\u0006\u0010\u0019\u001a\u00020\u00022\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011H\u0014¢\u0006\u0004\b\r\u0010\u001aJ\u0017\u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001c\u001a\u00020\u001bH\u0016¢\u0006\u0004\b\u001e\u0010\u001fR\u001b\u0010#\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b\r\u0010 \u001a\u0004\b!\u0010\"R\u001d\u0010)\u001a\u0004\u0018\u00010$8TX\u0094\u0084\u0002¢\u0006\f\n\u0004\b%\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b+\u0010&\u001a\u0004\b+\u0010,R\u001d\u0010/\u001a\u0004\u0018\u00010$8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b.\u0010&\u001a\u0004\b%\u0010(R\u0018\u00102\u001a\u0004\u0018\u0001008\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u00101R\u0016\u00105\u001a\u0004\u0018\u0001038BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b.\u00104R\u0014\u00106\u001a\u00020\u00078BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u0010R\u0014\u0010:\u001a\u0002078TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b8\u00109R\u0014\u0010>\u001a\u00020;8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010=R\u0014\u0010@\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b?\u00109R \u0010E\u001a\u000e\u0012\u0004\u0012\u000207\u0012\u0004\u0012\u00020B0A8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bC\u0010D¨\u0006H"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/CBRQuestionnaireFragment;", "Lru/cyberity/cbr/core/presentation/BaseFragment;", "Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;", "Lru/cyberity/cbr/presentation/screen/questionnary/model/a;", "Lru/cyberity/cbr/core/presentation/form/FormViewModelProvider;", "<init>", "()V", "", "currentPageNumber", "", "Lru/cyberity/cbr/core/presentation/form/HostViewModel$Page;", "pages", "Lkotlin/G0;", "a", "(ILjava/util/List;)V", "getLayoutId", "()I", "Landroid/os/Bundle;", "savedInstanceState", "onViewModelPrepared", "(Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", VoiceInfo.STATE, "(Lru/cyberity/cbr/presentation/screen/questionnary/model/a$d;Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/common/a0;", "finishReason", "", "onFinishCalled", "(Lru/cyberity/cbr/core/common/a0;)Z", "Lkotlin/C;", "e", "()Lru/cyberity/cbr/presentation/screen/questionnary/model/a;", "viewModel", "Landroid/widget/TextView;", "b", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "getPoweredByText", "()Landroid/widget/TextView;", "poweredByText", "Landroid/view/ViewGroup;", "c", "()Landroid/view/ViewGroup;", "content", "d", "btContinue", "Lru/cyberity/cbr/presentation/screen/questionnary/model/a$c;", "Lru/cyberity/cbr/presentation/screen/questionnary/model/a$c;", "page", "Lru/cyberity/cbr/core/presentation/form/FormFragment;", "()Lru/cyberity/cbr/core/presentation/form/FormFragment;", "formFragment", "analyticsPageIndex", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "getHostViewModel", "()Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "hostViewModel", "getLogTag", "logTag", "", "", "getOpenPayload", "()Ljava/util/Map;", "openPayload", "f", "Companion", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class CBRQuestionnaireFragment extends BaseFragment<a.d, ru.cyberity.cbr.presentation.screen.questionnary.model.a> implements FormViewModelProvider {

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: g, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f435386g;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.presentation.screen.questionnary.model.a.class), new b(new a(this)), new c());

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView poweredByText = i0.a(this, R.id.cbr_powered);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView content = i0.a(this, R.id.cbr_content);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btContinue = i0.a(this, R.id.cbr_continue);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @l
    private a.c page;

    /* compiled from: CBRQuestionnaireFragment.kt */
    @Keep
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0010\u0010\u0011J2\u0010\u000b\u001a\u00020\n2\u0006\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\bR\u0014\u0010\f\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0014\u0010\u000e\u001a\u00020\u00028\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000e\u0010\rR\u0014\u0010\u000f\u001a\u00020\u00028\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u000f\u0010\r¨\u0006\u0012"}, d2 = {"Lru/cyberity/cbr/presentation/screen/questionnary/CBRQuestionnaireFragment$Companion;", "", "", "idDocSetType", "Lru/cyberity/cbr/core/data/source/applicant/remote/t;", "questionnaire", "Lru/cyberity/cbr/core/data/source/applicant/remote/v;", "questionnaireSummary", "Lru/cyberity/cbr/core/presentation/form/model/CountriesData;", "countriesData", "Landroidx/fragment/app/Fragment;", "newInstance", "PAYLOAD_CURRENT_PAGE_INDEX", "Ljava/lang/String;", "PAYLOAD_IS_DATA_VALID", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        public static /* synthetic */ Fragment newInstance$default(Companion companion, String str, t tVar, v vVar, CountriesData countriesData, int i12, Object obj) {
            if ((i12 & 2) != 0) {
                tVar = null;
            }
            if ((i12 & 4) != 0) {
                vVar = null;
            }
            if ((i12 & 8) != 0) {
                countriesData = null;
            }
            return companion.newInstance(str, tVar, vVar, countriesData);
        }

        @k
        public final Fragment newInstance(@k String idDocSetType, @l t questionnaire, @l v questionnaireSummary, @l CountriesData countriesData) {
            CBRQuestionnaireFragment cBRQuestionnaireFragment = new CBRQuestionnaireFragment();
            Bundle bundle = new Bundle();
            bundle.putString("IDDOCSETTYPE", idDocSetType);
            bundle.putParcelable("QUESTIONNAIRE", questionnaire);
            bundle.putParcelable("QUESTIONNAIRE_SUMMARY", questionnaireSummary);
            bundle.putParcelable("COUNTRIES_DATA", countriesData);
            cBRQuestionnaireFragment.setArguments(bundle);
            return cBRQuestionnaireFragment;
        }

        private Companion() {
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    public static final class a extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f435392a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Fragment fragment) {
            super(0);
            this.f435392a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f435392a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class b extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f435393a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f435393a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f435393a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRQuestionnaireFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<P0.c> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            CBRQuestionnaireFragment cBRQuestionnaireFragment = CBRQuestionnaireFragment.this;
            return new ru.cyberity.cbr.presentation.screen.questionnary.model.b(cBRQuestionnaireFragment, cBRQuestionnaireFragment.getServiceLocator(), CBRQuestionnaireFragment.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(CBRQuestionnaireFragment.class, "poweredByText", "getPoweredByText()Landroid/widget/TextView;", 0);
        n0 n0Var = m0.f406844a;
        f435386g = new n[]{n0Var.i(h0Var), C0.k(CBRQuestionnaireFragment.class, "content", "getContent()Landroid/view/ViewGroup;", 0, n0Var), C0.k(CBRQuestionnaireFragment.class, "btContinue", "getBtContinue()Landroid/widget/TextView;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    private final TextView b() {
        return (TextView) this.btContinue.a(this, f435386g[2]);
    }

    private final ViewGroup c() {
        return (ViewGroup) this.content.a(this, f435386g[1]);
    }

    private final FormFragment d() {
        ViewGroup viewGroupC = c();
        if (viewGroupC != null) {
            Fragment fragmentG = getChildFragmentManager().G(viewGroupC.getId());
            if (fragmentG instanceof FormFragment) {
                return (FormFragment) fragmentG;
            }
        }
        return null;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: e, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.presentation.screen.questionnary.model.a getViewModel() {
        return (ru.cyberity.cbr.presentation.screen.questionnary.model.a) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.form.FormViewModelProvider
    @k
    public HostViewModel getHostViewModel() {
        return getViewModel();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        Bundle arguments = getArguments();
        String string = arguments != null ? arguments.getString("IDDOCSETTYPE") : null;
        return string == null ? "TYPE_UNKNOWN" : string;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_questionnarie;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getLogTag() {
        return "CBRQuestionnaireFragment";
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public Map<String, Object> getOpenPayload() {
        return Collections.singletonMap("pageIndex", Integer.valueOf(a()));
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @l
    public TextView getPoweredByText() {
        return (TextView) this.poweredByText.a(this, f435386g[0]);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        TextView textViewB;
        if ((event instanceof CBRViewModel.ErrorEvent) && (textViewB = b()) != null) {
            textViewB.setVisibility(0);
        }
        super.handleEvent(event);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public boolean onFinishCalled(@k a0 finishReason) {
        if (finishReason.equals(a0.c.f432638a) && getViewModel().i()) {
            return false;
        }
        return super.onFinishCalled(finishReason);
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public void onViewModelPrepared(@l Bundle savedInstanceState) {
        super.onViewModelPrepared(savedInstanceState);
        TextView textViewB = b();
        if (textViewB != null) {
            textViewB.setOnClickListener(new ViewOnClickListenerC39879j1(this, 29));
        }
    }

    private final int a() {
        int iE2;
        if (this.page == null || r0.getIndex() - 1 < 0) {
            return 0;
        }
        return iE2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(CBRQuestionnaireFragment cBRQuestionnaireFragment, View view) {
        FormFragment formFragmentD = cBRQuestionnaireFragment.d();
        boolean zValidateForm = formFragmentD != null ? formFragmentD.validateForm() : false;
        cBRQuestionnaireFragment.getAnalyticsDelegate().b(cBRQuestionnaireFragment.getScreen(), cBRQuestionnaireFragment.getIdDocSetType(), Control.ContinueButton, kotlin.collections.P0.g(new Q("pageIndex", Integer.valueOf(cBRQuestionnaireFragment.a())), new Q("isDataValid", String.valueOf(zValidateForm))));
        if (zValidateForm) {
            TextView textViewB = cBRQuestionnaireFragment.b();
            if (textViewB != null) {
                textViewB.setVisibility(4);
            }
            TextView textViewB2 = cBRQuestionnaireFragment.b();
            if (textViewB2 != null) {
                s.b(textViewB2);
            }
            cBRQuestionnaireFragment.getViewModel().l();
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k a.d state, @l Bundle savedInstanceState) {
        Logger.v$default(ru.cyberity.log.a.f436064a, "Questionnaire", "handleState: " + s.a(state), null, 4, null);
        a(state.getCurrentPageIndex(), state.h());
        TextView textViewB = b();
        if (textViewB != null) {
            a.d.C12537a c12537aE = state.getButtonContinue();
            s.a(textViewB, c12537aE != null ? c12537aE.getText() : null);
        }
        TextView textViewB2 = b();
        if (textViewB2 == null) {
            return;
        }
        a.d.C12537a c12537aE2 = state.getButtonContinue();
        textViewB2.setEnabled(c12537aE2 != null ? c12537aE2.getEnabled() : true);
    }

    private final void a(int currentPageNumber, List<HostViewModel.Page> pages) {
        ViewGroup viewGroupC;
        List<FormItem> items;
        HostViewModel.Page page = (HostViewModel.Page) C42745f0.K(currentPageNumber, pages);
        ru.cyberity.log.a aVar = ru.cyberity.log.a.f436064a;
        StringBuilder sbJ = G.j(currentPageNumber, "showPage: ", " has ");
        sbJ.append((page == null || (items = page.getItems()) == null) ? null : Integer.valueOf(items.size()));
        sbJ.append(" items");
        Logger.v$default(aVar, "Questionnaire", sbJ.toString(), null, 4, null);
        if (pages.isEmpty() || page == null || (viewGroupC = c()) == null || d() != null) {
            return;
        }
        H hE2 = getChildFragmentManager().e();
        hE2.n(viewGroupC.getId(), FormFragment.INSTANCE.newInstance("Questionnaire"), null);
        hE2.h();
    }
}
