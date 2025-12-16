package ru.cyberity.cbr.presentation.screen.preview.applicantdata;

import Y61.k;
import Y61.l;
import android.content.DialogInterface;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.os.C22776d;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.H;
import androidx.fragment.app.k0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.favorites.i1;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import e11.ViewOnClickListenerC39879j1;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.h0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.reflect.n;
import pY0.C47034b;
import ru.cyberity.cbr.core.analytics.Control;
import ru.cyberity.cbr.core.common.LifecycleAwareFindView;
import ru.cyberity.cbr.core.common.i0;
import ru.cyberity.cbr.core.common.s;
import ru.cyberity.cbr.core.data.model.Document;
import ru.cyberity.cbr.core.data.model.DocumentType;
import ru.cyberity.cbr.core.presentation.base.CBRViewModel;
import ru.cyberity.cbr.core.presentation.form.FormFragment;
import ru.cyberity.cbr.core.presentation.form.FormViewModelProvider;
import ru.cyberity.cbr.core.presentation.form.HostViewModel;
import ru.cyberity.cbr.core.presentation.helper.ThemeHelper;
import ru.cyberity.cbr.core.theme.CBRMetricElement;
import ru.cyberity.cbr.presentation.screen.preview.applicantdata.c;
import ru.cyberity.internal.R;

/* compiled from: CBRApplicantDataDocumentFragment.kt */
@Metadata(d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 ;2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u0004:\u0001\u0017B\u0007¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\b\u0010\u0006J\u000f\u0010\n\u001a\u00020\tH\u0014¢\u0006\u0004\b\n\u0010\u000bJ!\u0010\u0010\u001a\u00020\u00072\u0006\u0010\r\u001a\u00020\f2\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0012H\u0014¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0017\u001a\u00020\u00072\u0006\u0010\u0016\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0014¢\u0006\u0004\b\u0017\u0010\u0018R!\u0010\u001d\u001a\u00020\u00038TX\u0094\u0084\u0002¢\u0006\u0012\n\u0004\b\u0017\u0010\u0019\u0012\u0004\b\u001c\u0010\u0006\u001a\u0004\b\u001a\u0010\u001bR\u001d\u0010\"\u001a\u0004\u0018\u00010\u001e8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001f\u0010 \u001a\u0004\b\u0017\u0010!R\u001d\u0010'\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b$\u0010 \u001a\u0004\b%\u0010&R\u001d\u0010(\u001a\u0004\u0018\u00010#8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b%\u0010 \u001a\u0004\b$\u0010&R\u001d\u0010,\u001a\u0004\u0018\u00010)8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b*\u0010 \u001a\u0004\b*\u0010+R\u0018\u0010/\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010.R\u0016\u00102\u001a\u0004\u0018\u0001008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u00101R\u0014\u00106\u001a\u0002038TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b4\u00105R\u0014\u0010:\u001a\u0002078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b8\u00109¨\u0006<"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/b;", "Lru/cyberity/cbr/presentation/screen/preview/a;", "Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;", "Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c;", "Lru/cyberity/cbr/core/presentation/form/FormViewModelProvider;", "<init>", "()V", "Lkotlin/G0;", "h", "", "getLayoutId", "()I", "Landroid/view/View;", "view", "Landroid/os/Bundle;", "savedInstanceState", "onViewCreated", "(Landroid/view/View;Landroid/os/Bundle;)V", "Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;", "event", "handleEvent", "(Lru/cyberity/cbr/core/presentation/base/CBRViewModel$CBRViewModelEvent;)V", VoiceInfo.STATE, "a", "(Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c$d;Landroid/os/Bundle;)V", "Lkotlin/C;", "f", "()Lru/cyberity/cbr/presentation/screen/preview/applicantdata/c;", "getViewModel$annotations", "viewModel", "Landroid/widget/Button;", "b", "Lru/cyberity/cbr/core/common/LifecycleAwareFindView;", "()Landroid/widget/Button;", "btnContinue", "Landroid/widget/TextView;", "c", "d", "()Landroid/widget/TextView;", "tvTitle", "tvSubtitle", "Landroid/view/ViewGroup;", "e", "()Landroid/view/ViewGroup;", "vgContent", "Lru/cyberity/cbr/domain/c;", "Lru/cyberity/cbr/domain/c;", "resources", "Lru/cyberity/cbr/core/presentation/form/FormFragment;", "()Lru/cyberity/cbr/core/presentation/form/FormFragment;", "formFragment", "", "getIdDocSetType", "()Ljava/lang/String;", "idDocSetType", "Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "getHostViewModel", "()Lru/cyberity/cbr/core/presentation/form/HostViewModel;", "hostViewModel", "g", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
/* loaded from: classes9.dex */
public final class b extends ru.cyberity.cbr.presentation.screen.preview.a<c.d, ru.cyberity.cbr.presentation.screen.preview.applicantdata.c> implements FormViewModelProvider {

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    @k
    public static final Companion INSTANCE;

    /* renamed from: h, reason: collision with root package name */
    static final /* synthetic */ n<Object>[] f434731h;

    /* renamed from: a, reason: collision with root package name and from kotlin metadata */
    @k
    private final InterfaceC42726C viewModel = k0.a(this, m0.f406844a.b(ru.cyberity.cbr.presentation.screen.preview.applicantdata.c.class), new c(new C12516b(this)), new d());

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView btnContinue = i0.a(this, R.id.cbr_primary_button);

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvTitle = i0.a(this, R.id.cbr_title);

    /* renamed from: d, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView tvSubtitle = i0.a(this, R.id.cbr_subtitle);

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @k
    private final LifecycleAwareFindView vgContent = i0.a(this, R.id.cbr_content);

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @l
    private ru.cyberity.cbr.domain.c resources;

    /* compiled from: CBRApplicantDataDocumentFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000e\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0003\u001a\u00020\u0002R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u00068\u0006X\u0086T¢\u0006\u0006\n\u0004\b\t\u0010\b¨\u0006\f"}, d2 = {"Lru/cyberity/cbr/presentation/screen/preview/applicantdata/b$a;", "", "Lru/cyberity/cbr/core/data/model/Document;", "document", "Landroidx/fragment/app/Fragment;", "a", "", "ARGS_DOCUMENT", "Ljava/lang/String;", "TAG", "<init>", "()V", "cyberity-mobile-sdk-internal_release"}, k = 1, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.preview.applicantdata.b$a, reason: from kotlin metadata */
    public static final class Companion {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final Fragment a(@k Document document) {
            b bVar = new b();
            Bundle bundle = new Bundle();
            bundle.putParcelable("ARGS_DOCUMENT", document);
            bVar.setArguments(bundle);
            return bVar;
        }

        private Companion() {
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "a", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/a0"}, k = 3, mv = {1, 7, 1})
    /* renamed from: ru.cyberity.cbr.presentation.screen.preview.applicantdata.b$b, reason: collision with other inner class name */
    public static final class C12516b extends N implements Y41.a<Fragment> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Fragment f434738a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C12516b(Fragment fragment) {
            super(0);
            this.f434738a = fragment;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final Fragment invoke() {
            return this.f434738a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "a", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/b0"}, k = 3, mv = {1, 7, 1})
    public static final class c extends N implements Y41.a<S0> {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ Y41.a f434739a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f434739a = aVar;
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final S0 invoke() {
            return ((T0) this.f434739a.invoke()).getF42820b();
        }
    }

    /* compiled from: CBRApplicantDataDocumentFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "a", "()Landroidx/lifecycle/P0$c;"}, k = 3, mv = {1, 7, 1})
    public static final class d extends N implements Y41.a<P0.c> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        @k
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final P0.c invoke() {
            Bundle arguments = b.this.getArguments();
            Document document = arguments != null ? (Document) arguments.getParcelable("ARGS_DOCUMENT") : null;
            b bVar = b.this;
            return new ru.cyberity.cbr.presentation.screen.preview.applicantdata.d(document, bVar, bVar.getServiceLocator(), b.this.getArguments());
        }
    }

    static {
        h0 h0Var = new h0(b.class, "btnContinue", "getBtnContinue()Landroid/widget/Button;", 0);
        n0 n0Var = m0.f406844a;
        f434731h = new n[]{n0Var.i(h0Var), C0.k(b.class, "tvTitle", "getTvTitle()Landroid/widget/TextView;", 0, n0Var), C0.k(b.class, "tvSubtitle", "getTvSubtitle()Landroid/widget/TextView;", 0, n0Var), C0.k(b.class, "vgContent", "getVgContent()Landroid/view/ViewGroup;", 0, n0Var)};
        INSTANCE = new Companion(null);
    }

    private final FormFragment b() {
        ViewGroup viewGroupE = e();
        if (viewGroupE != null) {
            Fragment fragmentG = getChildFragmentManager().G(viewGroupE.getId());
            if (fragmentG instanceof FormFragment) {
                return (FormFragment) fragmentG;
            }
        }
        return null;
    }

    private final TextView c() {
        return (TextView) this.tvSubtitle.a(this, f434731h[2]);
    }

    private final TextView d() {
        return (TextView) this.tvTitle.a(this, f434731h[1]);
    }

    private final ViewGroup e() {
        return (ViewGroup) this.vgContent.a(this, f434731h[3]);
    }

    private final void h() {
        ViewGroup viewGroupE = e();
        if (viewGroupE != null && b() == null) {
            H hE2 = getChildFragmentManager().e();
            hE2.n(viewGroupE.getId(), FormFragment.INSTANCE.newInstance("AppData"), null);
            hE2.h();
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public ru.cyberity.cbr.presentation.screen.preview.applicantdata.c getViewModel() {
        return (ru.cyberity.cbr.presentation.screen.preview.applicantdata.c) this.viewModel.getValue();
    }

    @Override // ru.cyberity.cbr.core.presentation.form.FormViewModelProvider
    @k
    public HostViewModel getHostViewModel() {
        return getViewModel();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    @k
    public String getIdDocSetType() {
        Document document;
        DocumentType type;
        String strC;
        Bundle arguments = getArguments();
        return (arguments == null || (document = (Document) C22776d.a(arguments, "ARGS_DOCUMENT", Document.class)) == null || (type = document.getType()) == null || (strC = type.getValue()) == null) ? "TYPE_UNKNOWN" : strC;
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    public int getLayoutId() {
        return R.layout.cbr_fragment_applicant_data_document;
    }

    @Override // ru.cyberity.cbr.presentation.screen.preview.a, ru.cyberity.cbr.core.presentation.BaseFragment
    public void handleEvent(@k CBRViewModel.CBRViewModelEvent event) {
        super.handleEvent(event);
        if (event instanceof c.b) {
            c.b bVar = (c.b) event;
            new C47034b(requireContext()).setMessage(bVar.getMessage()).setPositiveButton(bVar.getPositiveButton(), (DialogInterface.OnClickListener) new i1(4)).create().show();
        }
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@k View view, @l Bundle savedInstanceState) {
        Float metricDimension;
        super.onViewCreated(view, savedInstanceState);
        Button buttonA = a();
        if (buttonA != null) {
            buttonA.setOnClickListener(new ViewOnClickListenerC39879j1(this, 28));
        }
        ThemeHelper themeHelper = ThemeHelper.INSTANCE;
        ru.cyberity.cbr.core.theme.d customTheme = themeHelper.getCustomTheme();
        if (customTheme == null || (metricDimension = themeHelper.getMetricDimension(customTheme, CBRMetricElement.SCREEN_HORIZONTAL_MARGIN)) == null) {
            return;
        }
        int iFloatValue = (int) metricDimension.floatValue();
        s.a(Integer.valueOf(iFloatValue), Integer.valueOf(iFloatValue), null, null, a(), d(), c());
    }

    private final Button a() {
        return (Button) this.btnContinue.a(this, f434731h[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(b bVar, View view) {
        ru.cyberity.cbr.core.analytics.c.b(bVar.getAnalyticsDelegate(), bVar.getScreen(), bVar.getIdDocSetType(), Control.ContinueButton, null, 8, null);
        s.b(view);
        bVar.getViewModel().n();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(DialogInterface dialogInterface, int i12) {
        dialogInterface.dismiss();
    }

    @Override // ru.cyberity.cbr.core.presentation.BaseFragment
    /* renamed from: a, reason: merged with bridge method [inline-methods] */
    public void handleState(@k c.d state, @l Bundle savedInstanceState) {
        this.resources = state.getResources();
        h();
        TextView textViewD = d();
        if (textViewD != null) {
            s.a(textViewD, state.getTitle());
        }
        TextView textViewC = c();
        if (textViewC != null) {
            s.a(textViewC, state.getSubtitle());
        }
        Button buttonA = a();
        if (buttonA != null) {
            s.a(buttonA, state.getButtonContinue());
        }
        ViewGroup viewGroupE = e();
        if (viewGroupE == null) {
            return;
        }
        viewGroupE.setVisibility(!state.getShowContent() ? 4 : 0);
    }
}
