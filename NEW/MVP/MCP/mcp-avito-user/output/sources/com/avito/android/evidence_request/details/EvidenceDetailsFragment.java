package com.avito.android.evidence_request.details;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.adjust.sdk.Constants;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.evidence_request.details.EvidenceDetailsFragment;
import com.avito.android.evidence_request.details.di.C30376a;
import com.avito.android.evidence_request.details.di.InterfaceC30377b;
import com.avito.android.evidence_request.details.di.InterfaceC30378c;
import com.avito.android.evidence_request.details.e;
import com.avito.android.evidence_request.details.h;
import com.avito.android.evidence_request.repository.model.ProofDetailsContent;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.s;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.category_parameters.SimpleParametersTree;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.A1;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import com.avito.android.validation.InterfaceC36014j;
import com.avito.android.validation.InterfaceC36030r0;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.ArrayList;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.B0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.AppBarLayoutWithTextAction;

/* compiled from: EvidenceDetailsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/evidence_request/details/EvidenceDetailsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/photo_list_view/x;", "Lcom/avito/android/photo_list_view/s$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EvidenceDetailsFragment extends BaseFragment implements com.avito.android.photo_list_view.x, s.a, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public static final a f148226A0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public h f148227n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f148228o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f148229p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f148230q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f148231r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public InterfaceC36014j f148232s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f148233t0;

    /* renamed from: u0, reason: collision with root package name */
    public AppBarLayoutWithTextAction f148234u0;

    /* renamed from: v0, reason: collision with root package name */
    public Button f148235v0;

    /* renamed from: w0, reason: collision with root package name */
    public RecyclerView f148236w0;

    /* renamed from: x0, reason: collision with root package name */
    public LinearLayout f148237x0;

    /* renamed from: y0, reason: collision with root package name */
    public com.avito.android.evidence_request.details.d f148238y0;

    /* renamed from: z0, reason: collision with root package name */
    public boolean f148239z0;

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/details/EvidenceDetailsFragment$a;", "", "<init>", "()V", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: EvidenceDetailsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.evidence_request.details.EvidenceDetailsFragment$a$a, reason: collision with other inner class name */
        public static final class C4343a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f148240l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4343a(String str) {
                super(1);
                this.f148240l = str;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putString("key_id", this.f148240l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static EvidenceDetailsFragment a(@Y61.k String str) {
            EvidenceDetailsFragment evidenceDetailsFragment = new EvidenceDetailsFragment();
            C35966w1.a(evidenceDetailsFragment, -1, new C4343a(str));
            return evidenceDetailsFragment;
        }

        public a() {
        }
    }

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.a f148241l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ EvidenceDetailsFragment f148242m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ G f148243n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(l0.a aVar, EvidenceDetailsFragment evidenceDetailsFragment, G g12) {
            super(0);
            this.f148241l = aVar;
            this.f148242m = evidenceDetailsFragment;
            this.f148243n = g12;
        }

        @Override // Y41.a
        public final G0 invoke() {
            l0.a aVar = this.f148241l;
            if (!aVar.f406838b) {
                h hVar = this.f148242m.f148227n0;
                if (hVar == null) {
                    hVar = null;
                }
                hVar.f148498N.a(Collections.singletonList(this.f148243n.f218069b));
                aVar.f406838b = true;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/evidence_request/details/EvidenceDetailsFragment$c", "Lru/avito/component/toolbar/a;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements ru.avito.component.toolbar.a {
        public c() {
        }

        @Override // ru.avito.component.toolbar.a
        public final void R() {
            EvidenceDetailsFragment.this.requireActivity().onBackPressed();
        }

        @Override // ru.avito.component.toolbar.a
        public final void u() {
            EvidenceDetailsFragment.this.requireActivity().finish();
        }
    }

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/evidence_request/details/h$c;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/evidence_request/details/h$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<h.c, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ View f148246m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(View view) {
            super(1);
            this.f148246m = view;
        }

        @Override // Y41.l
        public final G0 invoke(h.c cVar) {
            int i12;
            View viewZ;
            int height;
            int i13 = 0;
            h.c cVar2 = cVar;
            boolean z12 = cVar2 instanceof h.c.d;
            EvidenceDetailsFragment evidenceDetailsFragment = EvidenceDetailsFragment.this;
            if (z12) {
                h.c.d dVar = (h.c.d) cVar2;
                AppBarLayoutWithTextAction appBarLayoutWithTextAction = evidenceDetailsFragment.f148234u0;
                if (appBarLayoutWithTextAction == null) {
                    appBarLayoutWithTextAction = null;
                }
                appBarLayoutWithTextAction.setTitle(dVar.f148516a);
                AppBarLayoutWithTextAction appBarLayoutWithTextAction2 = evidenceDetailsFragment.f148234u0;
                if (appBarLayoutWithTextAction2 == null) {
                    appBarLayoutWithTextAction2 = null;
                }
                appBarLayoutWithTextAction2.setSubTitle(dVar.f148517b);
                if (dVar.f148518c) {
                    AttributedText attributedText = new AttributedText(evidenceDetailsFragment.getString(R.string.evidence_request_disclaimer, "agreement"), Collections.singletonList(new DeepLinkAttribute("agreement", evidenceDetailsFragment.getString(R.string.evidence_request_disclaimer_clickable_text), new WebViewLink.AnyDomain(Uri.parse(evidenceDetailsFragment.getString(R.string.evidence_request_disclaimer_link)), null, null, 6, null), null, null, Collections.singletonList(FontParameter.UnderlineParameter.INSTANCE), 24, null)), 1);
                    attributedText.setOnDeepLinkClickListener(new com.avito.android.evidence_request.details.c(evidenceDetailsFragment, i13));
                    View viewFindViewById = evidenceDetailsFragment.requireView().findViewById(R.id.disclaimer_text);
                    if (viewFindViewById == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
                    }
                    TextView textView = (TextView) viewFindViewById;
                    com.avito.android.util.text.j.a(textView, attributedText, null);
                    textView.setMovementMethod(LinkMovementMethod.getInstance());
                    D6.H(textView);
                    evidenceDetailsFragment.f148239z0 = true;
                }
            } else if (cVar2 instanceof h.c.f) {
                h.c.f fVar = (h.c.f) cVar2;
                AppBarLayoutWithTextAction appBarLayoutWithTextAction3 = evidenceDetailsFragment.f148234u0;
                if (appBarLayoutWithTextAction3 == null) {
                    appBarLayoutWithTextAction3 = null;
                }
                appBarLayoutWithTextAction3.setExpanded(false);
                com.avito.android.component.snackbar.h.d(this.f148246m, fVar.f148521b ? R.string.evidence_request_validation_files_in_progress : R.string.evidence_request_validation_error, null, 254);
                RecyclerView recyclerView = evidenceDetailsFragment.f148236w0;
                if (recyclerView == null) {
                    recyclerView = null;
                }
                RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                if (linearLayoutManager != null && (viewZ = linearLayoutManager.Z((i12 = fVar.f148520a))) != null) {
                    Button button = evidenceDetailsFragment.f148235v0;
                    if (button == null) {
                        button = null;
                    }
                    int height2 = button.getHeight();
                    RecyclerView recyclerView2 = evidenceDetailsFragment.f148236w0;
                    if (recyclerView2 == null) {
                        recyclerView2 = null;
                    }
                    if (viewZ.getHeight() > recyclerView2.getHeight() - height2) {
                        RecyclerView recyclerView3 = evidenceDetailsFragment.f148236w0;
                        if (recyclerView3 == null) {
                            recyclerView3 = null;
                        }
                        height = (recyclerView3.getHeight() - viewZ.getHeight()) - height2;
                    } else {
                        height = 0;
                    }
                    RecyclerView recyclerView4 = evidenceDetailsFragment.f148236w0;
                    (recyclerView4 != null ? recyclerView4 : null).post(new RunnableC30375a(linearLayoutManager, i12, height, i13));
                }
            } else if (cVar2 instanceof h.c.a) {
                h.c.a aVar = (h.c.a) cVar2;
                Button button2 = evidenceDetailsFragment.f148235v0;
                (button2 != null ? button2 : null).setLoading(false);
                com.avito.android.component.toast.b.b(evidenceDetailsFragment.requireView().findViewById(R.id.content_holder), aVar.f148512a.k0(evidenceDetailsFragment.requireContext()), 0, null, 0, null, 0, ToastBarPosition.f181046d, new f.c(aVar.f148513b), null, 130878);
            } else if (cVar2 instanceof h.c.b) {
                a aVar2 = EvidenceDetailsFragment.f148226A0;
                K2.e(evidenceDetailsFragment);
                Button button3 = evidenceDetailsFragment.f148235v0;
                (button3 != null ? button3 : null).setLoading(true);
            } else if (cVar2 instanceof h.c.C4349c) {
                h.c.C4349c c4349c = (h.c.C4349c) cVar2;
                Button button4 = evidenceDetailsFragment.f148235v0;
                (button4 != null ? button4 : null).setLoading(false);
                String string = c4349c.f148515a;
                if (string == null) {
                    string = evidenceDetailsFragment.getString(R.string.evidence_request_success_message);
                }
                ActivityC22955m activityC22955mRequireActivity = evidenceDetailsFragment.requireActivity();
                activityC22955mRequireActivity.setResult(-1, new Intent().putExtra("status_message", string));
                activityC22955mRequireActivity.finish();
            } else if (cVar2 instanceof h.c.e) {
                com.avito.android.recycler.data_aware.c cVar3 = evidenceDetailsFragment.f148229p0;
                (cVar3 != null ? cVar3 : null).c(((h.c.e) cVar2).f148519a);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "kotlin.jvm.PlatformType", Constants.DEEPLINK, "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<DeepLink, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            DeepLink deepLink2 = deepLink;
            EvidenceDetailsFragment evidenceDetailsFragment = EvidenceDetailsFragment.this;
            K2.e(evidenceDetailsFragment);
            com.avito.android.deeplink_handler.handler.composite.a aVar = evidenceDetailsFragment.f148230q0;
            if (aVar == null) {
                aVar = null;
            }
            b.a.a(aVar, deepLink2, null, null, 6);
            return G0.f406611a;
        }
    }

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "keyboardShown", "Lkotlin/G0;", "invoke", "(Z)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<Boolean, G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ TextView f148249m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(TextView textView) {
            super(1);
            this.f148249m = textView;
        }

        @Override // Y41.l
        public final G0 invoke(Boolean bool) {
            boolean zBooleanValue = bool.booleanValue();
            EvidenceDetailsFragment evidenceDetailsFragment = EvidenceDetailsFragment.this;
            Button button = evidenceDetailsFragment.f148235v0;
            if (button == null) {
                button = null;
            }
            boolean z12 = !zBooleanValue;
            D6.G(button, z12);
            if (evidenceDetailsFragment.f148239z0) {
                D6.G(this.f148249m, z12);
            }
            return G0.f406611a;
        }
    }

    public EvidenceDetailsFragment() {
        super(0, 1, null);
        this.f148233t0 = new io.reactivex.rxjava3.disposables.c();
    }

    @Override // com.avito.android.photo_list_view.x
    public final void A2(int i12, @Y61.l String str, @Y61.l String str2) {
        Intent intentS;
        h hVar = this.f148227n0;
        String[] strArr = (hVar != null ? hVar : null).f148506V;
        if (hVar == null) {
            hVar = null;
        }
        PhotoParameter photoParameterKe = hVar.ke();
        if (photoParameterKe == null || photoParameterKe.getMaxCount() <= 1) {
            InterfaceC35845m2 interfaceC35845m2 = this.f148231r0;
            intentS = (interfaceC35845m2 != null ? interfaceC35845m2 : null).s(strArr);
        } else {
            InterfaceC35845m2 interfaceC35845m22 = this.f148231r0;
            intentS = (interfaceC35845m22 != null ? interfaceC35845m22 : null).w(strArr);
        }
        startActivityForResult(intentS, 9);
    }

    @Override // com.avito.android.photo_list_view.s.a
    public final void P3(@Y61.k G g12) {
        l0.a aVar = new l0.a();
        boolean zF2 = L.f(requireArguments().getString("key_id"), "archive_extract");
        boolean z12 = g12.f218069b != null;
        if (zF2 && z12) {
            com.avito.android.component.toast.b.b(requireView(), getString(R.string.evidence_request_delete_egrn), 0, getString(R.string.evidence_request_rollback), 0, new b(aVar, this, g12), 0, null, null, null, 131050);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i13 == -1 && intent != null && i12 == 9) {
            A1.f318515a.getClass();
            ArrayList arrayListA = A1.a(intent);
            h hVar = this.f148227n0;
            if (hVar == null) {
                hVar = null;
            }
            hVar.f148498N.a(arrayListA);
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        InterfaceC36014j interfaceC36014j = this.f148232s0;
        if (interfaceC36014j == null) {
            interfaceC36014j = null;
        }
        interfaceC36014j.e(requireContext());
        return layoutInflater.inflate(R.layout.evidence_details_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        LinearLayout linearLayout = this.f148237x0;
        if (linearLayout == null) {
            linearLayout = null;
        }
        com.avito.android.evidence_request.details.d dVar = this.f148238y0;
        if (dVar == null) {
            dVar = null;
        }
        linearLayout.removeOnLayoutChangeListener(dVar);
        InterfaceC36014j interfaceC36014j = this.f148232s0;
        (interfaceC36014j != null ? interfaceC36014j : null).d();
        super.onDestroyView();
        this.f148233t0.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v13, types: [android.view.View$OnLayoutChangeListener, com.avito.android.evidence_request.details.d] */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        AppBarLayoutWithTextAction appBarLayoutWithTextAction = (AppBarLayoutWithTextAction) view.findViewById(R.id.app_bar);
        this.f148234u0 = appBarLayoutWithTextAction;
        appBarLayoutWithTextAction.setClickListener(new c());
        View viewFindViewById = view.findViewById(R.id.disclaimer_text);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.TextView");
        }
        TextView textView = (TextView) viewFindViewById;
        Button button = (Button) view.findViewById(R.id.main_button);
        this.f148235v0 = button;
        button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.evidence_request.details.b
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                h hVar = this.f148254b.f148227n0;
                if (hVar == null) {
                    hVar = null;
                }
                hVar.getClass();
                SimpleParametersTree simpleParametersTree = new SimpleParametersTree(hVar.f148505U);
                InterfaceC36030r0 interfaceC36030r0 = hVar.f148494J;
                interfaceC36030r0.f(simpleParametersTree, null);
                io.reactivex.rxjava3.internal.observers.l lVar = hVar.f148502R;
                if (lVar != null) {
                    DisposableHelper.a(lVar);
                }
                io.reactivex.rxjava3.internal.observers.l lVarV = interfaceC36030r0.h(hVar.le(), B0.f406639b).o(new k(hVar)).v(new com.avito.android.advert_core.task.a(10), new l(hVar));
                hVar.f148501Q.b(lVarV);
                hVar.f148502R = lVarV;
            }
        });
        View viewFindViewById2 = view.findViewById(R.id.recycler_view);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.recyclerview.widget.RecyclerView");
        }
        RecyclerView recyclerView = (RecyclerView) viewFindViewById2;
        this.f148236w0 = recyclerView;
        com.avito.konveyor.adapter.j jVar = this.f148228o0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView.setAdapter(jVar);
        View viewFindViewById3 = requireView().findViewById(R.id.bottom_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout");
        }
        this.f148237x0 = (LinearLayout) viewFindViewById3;
        h hVar = this.f148227n0;
        if (hVar == null) {
            hVar = null;
        }
        hVar.f148509Y.observe(getViewLifecycleOwner(), new e.a(new d(view)));
        h hVar2 = this.f148227n0;
        if (hVar2 == null) {
            hVar2 = null;
        }
        hVar2.f148503S.observe(getViewLifecycleOwner(), new e.a(new e()));
        this.f148233t0.b(K2.a(requireActivity(), new f(textView)));
        h hVar3 = this.f148227n0;
        if (hVar3 == null) {
            hVar3 = null;
        }
        ProofDetailsContent proofDetailsContent = hVar3.f148508X;
        hVar3.f148509Y.setValue(new h.c.d(proofDetailsContent.f149202c, proofDetailsContent.f149201b, proofDetailsContent.f149203d));
        SimpleParametersTree simpleParametersTree = new SimpleParametersTree(hVar3.f148505U);
        InterfaceC36030r0 interfaceC36030r0 = hVar3.f148494J;
        interfaceC36030r0.f(simpleParametersTree, null);
        interfaceC36030r0.c().accept(hVar3.le());
        ?? r52 = new View.OnLayoutChangeListener() { // from class: com.avito.android.evidence_request.details.d
            @Override // android.view.View.OnLayoutChangeListener
            public final void onLayoutChange(View view2, int i12, int i13, int i14, int i15, int i16, int i17, int i18, int i19) {
                int i22 = i15 - i13;
                if (i19 - i17 == i22) {
                    EvidenceDetailsFragment.a aVar = EvidenceDetailsFragment.f148226A0;
                    return;
                }
                RecyclerView recyclerView2 = this.f148257b.f148236w0;
                if (recyclerView2 == null) {
                    recyclerView2 = null;
                }
                recyclerView2.setPadding(0, 0, 0, i22);
            }
        };
        LinearLayout linearLayout = this.f148237x0;
        (linearLayout != null ? linearLayout : 0).addOnLayoutChangeListener(r52);
        this.f148238y0 = r52;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        InterfaceC30377b.a aVarA = C30376a.a();
        String string = requireArguments().getString("key_id");
        if (string == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVarA.a(this, string, (InterfaceC30378c) C29972i.a(C29972i.b(this), InterfaceC30378c.class), cv.c.b(this)).a(this);
    }
}
