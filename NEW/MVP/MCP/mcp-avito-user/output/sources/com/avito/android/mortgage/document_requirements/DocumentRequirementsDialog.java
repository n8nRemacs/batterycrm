package com.avito.android.mortgage.document_requirements;

import Cd.C13243a;
import android.app.Dialog;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.MortgageDocumentRequirementsScreen;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.mortgage.document_requirements.di.b;
import com.avito.android.mortgage.document_requirements.model.Document;
import com.avito.android.mortgage.document_requirements.model.DocumentRequirementsArguments;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: DocumentRequirementsDialog.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/mortgage/document_requirements/DocumentRequirementsDialog;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lb00/b;", VoiceInfo.STATE, "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class DocumentRequirementsDialog extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: l0, reason: collision with root package name */
    @Y61.k
    public static final a f198920l0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public v f198921h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f198922i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f198923j0;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f198924k0;

    /* compiled from: DocumentRequirementsDialog.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/mortgage/document_requirements/DocumentRequirementsDialog$a;", "", "<init>", "()V", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: DocumentRequirementsDialog.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.mortgage.document_requirements.DocumentRequirementsDialog$a$a, reason: collision with other inner class name */
        public static final class C5866a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ DocumentRequirementsArguments f198925l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5866a(DocumentRequirementsArguments documentRequirementsArguments) {
                super(1);
                this.f198925l = documentRequirementsArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("documents_screen_data", this.f198925l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static DocumentRequirementsDialog a(@Y61.k DocumentRequirementsArguments documentRequirementsArguments) {
            DocumentRequirementsDialog documentRequirementsDialog = new DocumentRequirementsDialog();
            C35966w1.a(documentRequirementsDialog, -1, new C5866a(documentRequirementsArguments));
            return documentRequirementsDialog;
        }

        public a() {
        }
    }

    /* compiled from: DocumentRequirementsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = DocumentRequirementsDialog.this.f198923j0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: DocumentRequirementsDialog.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "view", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<View, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            ComposeView composeView = view2 instanceof ComposeView ? (ComposeView) view2 : null;
            if (composeView != null) {
                composeView.setContent(new C22096n(-1002708364, new com.avito.android.mortgage.document_requirements.e(DocumentRequirementsDialog.this), true));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: DocumentRequirementsDialog.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "it", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<View, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ TZ.b f198928l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(TZ.b bVar) {
            super(1);
            this.f198928l = bVar;
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View viewFindViewById = view.findViewById(R.id.footer_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type com.avito.android.lib.design.button.Button");
            }
            Button button = (Button) viewFindViewById;
            button.setText(R.string.button_understand);
            button.setOnClickListener(new TZ.a(this.f198928l, 2));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f198929l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f198929l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f198929l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<Fragment> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return DocumentRequirementsDialog.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f198931l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f198931l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f198931l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f198932l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f198932l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f198932l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f198933l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f198933l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f198933l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: DocumentRequirementsDialog.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/mortgage/document_requirements/u;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/mortgage/document_requirements/u;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<u> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final u invoke() {
            v vVar = DocumentRequirementsDialog.this.f198921h0;
            if (vVar == null) {
                vVar = null;
            }
            return (u) vVar.get();
        }
    }

    public DocumentRequirementsDialog() {
        super(0, 1, null);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f198922i0 = new O0(m0.f406844a.b(u.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f198924k0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(MortgageDocumentRequirementsScreen.f90421d, com.avito.android.analytics.screens.s.b(this), null, 4, null);
        b.a aVarA = com.avito.android.mortgage.document_requirements.di.a.a();
        com.avito.android.mortgage.di.o oVar = (com.avito.android.mortgage.di.o) C29972i.a(C29972i.b(this), com.avito.android.mortgage.di.o.class);
        DocumentRequirementsArguments documentRequirementsArgumentsF5 = f5();
        List<? extends Document> list = documentRequirementsArgumentsF5 != null ? documentRequirementsArgumentsF5.f198973c : null;
        if (list == null) {
            list = C42784z0.f406748b;
        }
        List<? extends Document> list2 = list;
        DocumentRequirementsArguments documentRequirementsArgumentsF52 = f5();
        Document document = documentRequirementsArgumentsF52 != null ? documentRequirementsArgumentsF52.f198972b : null;
        DocumentRequirementsArguments documentRequirementsArgumentsF53 = f5();
        aVarA.a(oVar, c28478k, list2, document, documentRequirementsArgumentsF53 != null ? documentRequirementsArgumentsF53.f198974d : null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f198923j0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final DocumentRequirementsArguments f5() {
        Bundle bundleRequireArguments = requireArguments();
        return (DocumentRequirementsArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("documents_screen_data", DocumentRequirementsArguments.class) : bundleRequireArguments.getParcelable("documents_screen_data"));
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f198923j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        TZ.b bVar = new TZ.b(requireContext(), null, 2, null);
        bVar.B(R.layout.compose_content_layout, R.layout.button_footer_layout, new c(), new d(bVar), false);
        bVar.setTitle(R.string.documents_requirements_title);
        bVar.setCancelable(true);
        bVar.setCanceledOnTouchOutside(true);
        bVar.S(C35835l0.g(bVar.getContext()).y);
        bVar.K(true);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f198923j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return bVar;
    }
}
