package com.avito.android.evidence_request.mvi.evidence_details;

import Cd.C13243a;
import Xz.C17068c;
import Xz.InterfaceC17066a;
import Xz.InterfaceC17067b;
import Y61.l;
import a90.ViewOnLayoutChangeListenerC19701a;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22977J;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.EvidenceDetailsScreen;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.android.deep_linking.links.w;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.evidence_request.details.RunnableC30375a;
import com.avito.android.evidence_request.mvi.domain.evidence_details.EvidenceDetailsContent;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofDetailsContent;
import com.avito.android.evidence_request.mvi.evidence_details.di.b;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.photo_list_view.G;
import com.avito.android.photo_list_view.s;
import com.avito.android.photo_list_view.x;
import com.avito.android.remote.model.category_parameters.PhotoParameter;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.remote.model.text.FontParameter;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.A1;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.K2;
import cv.InterfaceC39417a;
import java.util.Collections;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import ru.avito.component.toolbar.CollapsingTitleAppBarLayout;
import z1.AbstractC50339a;

/* compiled from: EvidenceDetailsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/EvidenceDetailsFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/photo_list_view/x;", "Lcom/avito/android/photo_list_view/s$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EvidenceDetailsFragment extends BaseFragment implements x, s.a, InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f148738w0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.evidence_request.mvi.evidence_details.j f148739n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f148740o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f148741p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f148742q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.android.recycler.data_aware.c f148743r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f148744s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f148745t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f148746u0;

    /* renamed from: v0, reason: collision with root package name */
    @l
    public com.avito.android.evidence_request.mvi.evidence_details.g f148747v0;

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/EvidenceDetailsFragment$a;", "", "<init>", "()V", "", "KEY_INITIAL_DATA", "Ljava/lang/String;", "KEY_SCREEN_ID", "", "REQ_FILE_PICKER", "I", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: EvidenceDetailsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.evidence_request.mvi.evidence_details.EvidenceDetailsFragment$a$a, reason: collision with other inner class name */
        public static final class C4359a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ String f148748l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ ProofDetailsContent f148749m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4359a(String str, ProofDetailsContent proofDetailsContent) {
                super(1);
                this.f148748l = str;
                this.f148749m = proofDetailsContent;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                Bundle bundle2 = bundle;
                bundle2.putString("key_id", this.f148748l);
                bundle2.putParcelable("initial_data", this.f148749m);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static EvidenceDetailsFragment a(@Y61.k String str, @Y61.k ProofDetailsContent proofDetailsContent) {
            EvidenceDetailsFragment evidenceDetailsFragment = new EvidenceDetailsFragment();
            C35966w1.a(evidenceDetailsFragment, -1, new C4359a(str, proofDetailsContent));
            return evidenceDetailsFragment;
        }

        public a() {
        }
    }

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC17067b, G0> {
        public final void f(@Y61.k InterfaceC17067b interfaceC17067b) {
            int i12;
            View viewZ;
            Intent intentS;
            Uri uri;
            EvidenceDetailsFragment evidenceDetailsFragment = (EvidenceDetailsFragment) this.receiver;
            a aVar = EvidenceDetailsFragment.f148738w0;
            evidenceDetailsFragment.getClass();
            if (L.f(interfaceC17067b, InterfaceC17067b.C1360b.f19189a)) {
                evidenceDetailsFragment.requireActivity().onBackPressed();
                return;
            }
            if (L.f(interfaceC17067b, InterfaceC17067b.d.f19192a)) {
                evidenceDetailsFragment.requireActivity().finish();
                return;
            }
            if (L.f(interfaceC17067b, InterfaceC17067b.e.f19193a)) {
                K2.e(evidenceDetailsFragment);
                return;
            }
            if (interfaceC17067b instanceof InterfaceC17067b.g) {
                l0.a aVar2 = new l0.a();
                boolean zF2 = L.f((String) evidenceDetailsFragment.f148746u0.getValue(), "archive_extract");
                G g12 = ((InterfaceC17067b.g) interfaceC17067b).f19195a;
                if (!zF2 || (uri = g12.f218069b) == null) {
                    return;
                }
                com.avito.android.component.toast.b.b(evidenceDetailsFragment.requireView(), evidenceDetailsFragment.getString(R.string.evidence_request_delete_egrn), 0, evidenceDetailsFragment.getString(R.string.evidence_request_rollback), 0, new com.avito.android.evidence_request.mvi.evidence_details.a(aVar2, evidenceDetailsFragment, uri), 0, null, null, null, 131050);
                return;
            }
            if (interfaceC17067b instanceof InterfaceC17067b.c) {
                InterfaceC17067b.c cVar = (InterfaceC17067b.c) interfaceC17067b;
                PhotoParameter photoParameter = cVar.f19191b;
                String[] strArr = cVar.f19190a;
                if (photoParameter == null || photoParameter.getMaxCount() <= 1) {
                    InterfaceC35845m2 interfaceC35845m2 = evidenceDetailsFragment.f148745t0;
                    intentS = (interfaceC35845m2 != null ? interfaceC35845m2 : null).s(strArr);
                } else {
                    InterfaceC35845m2 interfaceC35845m22 = evidenceDetailsFragment.f148745t0;
                    intentS = (interfaceC35845m22 != null ? interfaceC35845m22 : null).w(strArr);
                }
                evidenceDetailsFragment.startActivityForResult(intentS, 9);
                return;
            }
            if (interfaceC17067b instanceof InterfaceC17067b.i) {
                com.avito.android.evidence_request.mvi.evidence_details.g gVar = evidenceDetailsFragment.f148747v0;
                if (gVar != null) {
                    InterfaceC17067b.i iVar = (InterfaceC17067b.i) interfaceC17067b;
                    gVar.f148994e.setExpanded(false);
                    com.avito.android.component.snackbar.h.d(gVar.f148990a, iVar.f19199b ? R.string.evidence_request_validation_files_in_progress : R.string.evidence_request_validation_error, null, 254);
                    RecyclerView recyclerView = gVar.f148996g;
                    RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                    LinearLayoutManager linearLayoutManager = layoutManager instanceof LinearLayoutManager ? (LinearLayoutManager) layoutManager : null;
                    if (linearLayoutManager == null || (viewZ = linearLayoutManager.Z((i12 = iVar.f19198a))) == null) {
                        return;
                    }
                    int height = gVar.f148995f.getHeight();
                    recyclerView.post(new RunnableC30375a(linearLayoutManager, i12, viewZ.getHeight() > recyclerView.getHeight() - height ? (recyclerView.getHeight() - viewZ.getHeight()) - height : 0, 1));
                    return;
                }
                return;
            }
            if (interfaceC17067b instanceof InterfaceC17067b.h) {
                com.avito.android.evidence_request.mvi.evidence_details.g gVar2 = evidenceDetailsFragment.f148747v0;
                if (gVar2 != null) {
                    InterfaceC17067b.h hVar = (InterfaceC17067b.h) interfaceC17067b;
                    com.avito.android.component.toast.b.b(gVar2.f148999j, hVar.f19196a.k0(gVar2.f148990a.getContext()), 0, null, 0, null, 0, ToastBarPosition.f181046d, new f.c(hVar.f19197b), null, 130878);
                    return;
                }
                return;
            }
            if (interfaceC17067b instanceof InterfaceC17067b.f) {
                com.avito.android.deeplink_handler.handler.composite.a aVar3 = evidenceDetailsFragment.f148744s0;
                if (aVar3 == null) {
                    aVar3 = null;
                }
                b.a.a(aVar3, ((InterfaceC17067b.f) interfaceC17067b).f19194a, null, null, 6);
                return;
            }
            if (interfaceC17067b instanceof InterfaceC17067b.a) {
                String string = ((InterfaceC17067b.a) interfaceC17067b).f19188a;
                if (string == null) {
                    string = evidenceDetailsFragment.getString(R.string.evidence_request_success_message);
                }
                evidenceDetailsFragment.requireActivity().setResult(-1, new Intent().putExtra("status_message", string));
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC17067b interfaceC17067b) {
            f(interfaceC17067b);
            return G0.f406611a;
        }
    }

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<C17068c, G0> {
        @Override // Y41.l
        public final G0 invoke(C17068c c17068c) {
            C17068c c17068c2 = c17068c;
            final com.avito.android.evidence_request.mvi.evidence_details.g gVar = ((EvidenceDetailsFragment) this.receiver).f148747v0;
            if (gVar != null) {
                EvidenceDetailsContent evidenceDetailsContent = c17068c2.f19202b;
                if (evidenceDetailsContent != null && !evidenceDetailsContent.equals(null)) {
                    CollapsingTitleAppBarLayout collapsingTitleAppBarLayout = gVar.f148994e;
                    collapsingTitleAppBarLayout.setTitle(evidenceDetailsContent.f148659b);
                    AttributedText attributedText = evidenceDetailsContent.f148660c;
                    collapsingTitleAppBarLayout.setSubTitle(attributedText);
                    if (evidenceDetailsContent.f148661d) {
                        Context context = gVar.f148993d;
                        AttributedText attributedText2 = new AttributedText(context.getString(R.string.evidence_request_disclaimer, "agreement"), Collections.singletonList(new DeepLinkAttribute("agreement", context.getString(R.string.evidence_request_disclaimer_clickable_text), new WebViewLink.AnyDomain(Uri.parse(context.getString(R.string.evidence_request_disclaimer_link)), null, null, 6, null), null, null, Collections.singletonList(FontParameter.UnderlineParameter.INSTANCE), 24, null)), 1);
                        final int i12 = 1;
                        attributedText2.setOnDeepLinkClickListener(new w() { // from class: com.avito.android.evidence_request.mvi.evidence_details.d
                            @Override // com.avito.android.deep_linking.links.w
                            public final void i7(DeepLink deepLink) {
                                g gVar2 = gVar;
                                switch (i12) {
                                    case 0:
                                        int i13 = g.f148989n;
                                        gVar2.f148991b.accept(new InterfaceC17066a.d(deepLink));
                                        break;
                                    default:
                                        int i14 = g.f148989n;
                                        gVar2.f148991b.accept(new InterfaceC17066a.d(deepLink));
                                        break;
                                }
                            }
                        });
                        TextView textView = gVar.f148997h;
                        com.avito.android.util.text.j.a(textView, attributedText2, null);
                        textView.setMovementMethod(LinkMovementMethod.getInstance());
                        D6.H(textView);
                        gVar.f149000k = true;
                    }
                    final int i13 = 0;
                    attributedText.setOnDeepLinkClickListener(new w() { // from class: com.avito.android.evidence_request.mvi.evidence_details.d
                        @Override // com.avito.android.deep_linking.links.w
                        public final void i7(DeepLink deepLink) {
                            g gVar2 = gVar;
                            switch (i13) {
                                case 0:
                                    int i132 = g.f148989n;
                                    gVar2.f148991b.accept(new InterfaceC17066a.d(deepLink));
                                    break;
                                default:
                                    int i14 = g.f148989n;
                                    gVar2.f148991b.accept(new InterfaceC17066a.d(deepLink));
                                    break;
                            }
                        }
                    });
                }
                UV0.a<? extends com.avito.conveyor_item.a> aVar = c17068c2.f19205e;
                if (aVar != null) {
                    gVar.f148992c.c(aVar);
                }
                gVar.f148995f.setLoading(c17068c2.f19206f);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<String> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string = EvidenceDetailsFragment.this.requireArguments().getString("key_id");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LXz/a;", "it", "Lkotlin/G0;", "invoke", "(LXz/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<InterfaceC17066a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC17066a interfaceC17066a) {
            a aVar = EvidenceDetailsFragment.f148738w0;
            EvidenceDetailsFragment.this.q5().accept(interfaceC17066a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f148752l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f148752l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f148752l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return EvidenceDetailsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f148754l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f148754l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f148754l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f148755l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f148755l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f148755l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f148756l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f148756l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f148756l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EvidenceDetailsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/evidence_request/mvi/evidence_details/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.evidence_request.mvi.evidence_details.i> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.evidence_request.mvi.evidence_details.i invoke() {
            com.avito.android.evidence_request.mvi.evidence_details.j jVar = EvidenceDetailsFragment.this.f148739n0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.evidence_request.mvi.evidence_details.i) jVar.get();
        }
    }

    public EvidenceDetailsFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f148740o0 = new O0(m0.f406844a.b(com.avito.android.evidence_request.mvi.evidence_details.i.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f148746u0 = C42727D.c(new d());
    }

    @Override // com.avito.android.photo_list_view.x
    public final void A2(int i12, @l String str, @l String str2) {
        q5().accept(InterfaceC17066a.g.f19186a);
    }

    @Override // com.avito.android.photo_list_view.s.a
    public final void P3(@Y61.k G g12) {
        q5().accept(new InterfaceC17066a.h(g12));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @l Intent intent) {
        super.onActivityResult(i12, i13, intent);
        if (i13 == -1 && intent != null && i12 == 9) {
            A1.f318515a.getClass();
            q5().accept(new InterfaceC17066a.f(A1.a(intent)));
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f148741p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f148741p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new b(1, this, EvidenceDetailsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsOneTimeEvent;)V", 0), new c(1, this, EvidenceDetailsFragment.class, "render", "render(Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsState;)V", 0));
        return layoutInflater.inflate(R.layout.evidence_details_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        com.avito.android.evidence_request.mvi.evidence_details.g gVar = this.f148747v0;
        if (gVar != null) {
            gVar.f148994e.setClickListener(null);
            ViewOnLayoutChangeListenerC19701a viewOnLayoutChangeListenerC19701a = gVar.f149001l;
            if (viewOnLayoutChangeListenerC19701a == null) {
                viewOnLayoutChangeListenerC19701a = null;
            }
            gVar.f148998i.removeOnLayoutChangeListener(viewOnLayoutChangeListenerC19701a);
        }
        this.f148747v0 = null;
        com.avito.konveyor.adapter.j jVar = this.f148742q0;
        if (jVar == null) {
            jVar = null;
        }
        jVar.f338515e = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        Lifecycle lifecycle = getLifecycle();
        C22977J c22977jA = C22984Q.a(getViewLifecycleOwner());
        com.avito.android.evidence_request.mvi.evidence_details.i iVarQ5 = q5();
        com.avito.konveyor.adapter.j jVar = this.f148742q0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        com.avito.android.recycler.data_aware.c cVar = this.f148743r0;
        this.f148747v0 = new com.avito.android.evidence_request.mvi.evidence_details.g(view, lifecycle, c22977jA, iVarQ5, jVar2, cVar != null ? cVar : null);
        ScreenPerformanceTracker screenPerformanceTracker = this.f148741p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        ProofDetailsContent proofDetailsContent;
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(EvidenceDetailsScreen.f90349d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        b.a aVarA = com.avito.android.evidence_request.mvi.evidence_details.di.a.a();
        com.avito.android.evidence_request.mvi.evidence_details.di.c cVar = (com.avito.android.evidence_request.mvi.evidence_details.di.c) C29972i.a(C29972i.b(this), com.avito.android.evidence_request.mvi.evidence_details.di.c.class);
        InterfaceC30106l7 interfaceC30106l7 = (InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        String str = (String) this.f148746u0.getValue();
        Bundle arguments = getArguments();
        if (arguments != null) {
            proofDetailsContent = (ProofDetailsContent) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("initial_data", ProofDetailsContent.class) : arguments.getParcelable("initial_data"));
        } else {
            proofDetailsContent = null;
        }
        if (proofDetailsContent == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        aVarA.a(cVar, interfaceC30106l7, interfaceC39417aB, c28478k, this, str, proofDetailsContent, new e()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f148741p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final com.avito.android.evidence_request.mvi.evidence_details.i q5() {
        return (com.avito.android.evidence_request.mvi.evidence_details.i) this.f148740o0.getValue();
    }
}
