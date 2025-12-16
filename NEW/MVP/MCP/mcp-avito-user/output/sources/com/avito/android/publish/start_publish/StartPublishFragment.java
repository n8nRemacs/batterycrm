package com.avito.android.publish.start_publish;

import Cd0.r;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.AbstractC22991Y;
import androidx.view.R0;
import com.avito.android.Q1;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.deep_linking.links.AdvertPublicationLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.PassportProfilesListLink;
import com.avito.android.di.C29972i;
import com.avito.android.publish.analytics.C33536w;
import com.avito.android.publish.start_publish.StartPublishSheet;
import com.avito.android.publish.start_publish.StartPublishViewModel;
import com.avito.android.publish.start_publish.di.f;
import com.avito.android.publish.start_publish.r;
import com.avito.android.remote.model.Navigation;
import com.avito.android.remote.model.publish.PublishInitialToast;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.ui.status_bar.a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: StartPublishFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/publish/start_publish/StartPublishSheet$b;", "Lcom/avito/android/publish/start_publish/j;", "Lcom/avito/android/publish/drafts/r;", "Lcom/avito/android/dialog/A;", "Lcom/avito/android/ui/status_bar/a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class StartPublishFragment extends TabBaseFragment implements StartPublishSheet.b, InterfaceC34135j, com.avito.android.publish.drafts.r, com.avito.android.dialog.A, com.avito.android.ui.status_bar.a, InterfaceC28477j.b {

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public static final a f245287D0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Y61.l
    public DialogC34133h f245288A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public DialogC34131f f245289B0;

    /* renamed from: C0, reason: collision with root package name */
    public StartPublishViewModel f245290C0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public L f245291t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f245292u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public Q1 f245293v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f245294w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public C33536w f245295x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f245296y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.l
    public StartPublishSheet f245297z0;

    /* compiled from: StartPublishFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/publish/start_publish/StartPublishFragment$a;", "", "<init>", "()V", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public StartPublishFragment() {
        super(0, 1, null);
    }

    public final void D5() {
        Q1 q12 = this.f245293v0;
        if (q12 == null) {
            q12 = null;
        }
        q12.getClass();
        kotlin.reflect.n<Object> nVar = Q1.f67448x0[89];
        if (((Boolean) q12.f67519w0.a().invoke()).booleanValue()) {
            DialogC34133h dialogC34133h = this.f245288A0;
            if (dialogC34133h != null) {
                dialogC34133h.f245415E = null;
            }
            if (dialogC34133h != null) {
                dialogC34133h.dismiss();
            }
            this.f245288A0 = null;
            return;
        }
        DialogC34131f dialogC34131f = this.f245289B0;
        if (dialogC34131f != null) {
            dialogC34131f.f245404E = null;
        }
        if (dialogC34131f != null) {
            dialogC34131f.dismiss();
        }
        this.f245289B0 = null;
    }

    public final void E5() {
        StartPublishSheet startPublishSheet = this.f245297z0;
        if (startPublishSheet != null) {
            startPublishSheet.f245301G = null;
        }
        if (startPublishSheet != null) {
            startPublishSheet.dismiss();
        }
        this.f245297z0 = null;
    }

    @Override // com.avito.android.publish.start_publish.InterfaceC34135j
    public final void H3(@Y61.k AdvertPublicationLink.Public r82) {
        StartPublishViewModel startPublishViewModel = this.f245290C0;
        if (startPublishViewModel == null) {
            startPublishViewModel = null;
        }
        startPublishViewModel.getClass();
        String str = r82.f133005h;
        if (startPublishViewModel.ke(r82.f132999b, r82.f133002e, r82.f133004g, str, r82.f133006i)) {
            return;
        }
        startPublishViewModel.f245326S.b(startPublishViewModel.f245316E.b().x(new J(startPublishViewModel, r82.f133002e), K.f245268b));
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // com.avito.android.publish.start_publish.StartPublishSheet.b, com.avito.android.publish.start_publish.InterfaceC34135j, com.avito.android.dialog.A
    public final void a(@Y61.k DeepLink deepLink) {
        StartPublishViewModel startPublishViewModel = this.f245290C0;
        if (startPublishViewModel == null) {
            startPublishViewModel = null;
        }
        startPublishViewModel.getClass();
        startPublishViewModel.f245320M.e(deepLink instanceof PassportProfilesListLink ? StartPublishViewModel.ResumeStrategy.f245327b : StartPublishViewModel.ResumeStrategy.f245328c, "key.finish_on_resume");
        String str = startPublishViewModel.f245323P;
        if (str != null && (deepLink instanceof AdvertPublicationLink.Local)) {
            deepLink = AdvertPublicationLink.Local.a((AdvertPublicationLink.Local) deepLink, null, str, 63);
        }
        startPublishViewModel.f245325R.setValue(new StartPublishViewModel.a.c(deepLink));
    }

    @Override // com.avito.android.publish.drafts.r
    public final void b1() {
        i0();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    public final void i0() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }

    @Override // com.avito.android.publish.drafts.r
    public final void o1() {
        StartPublishViewModel startPublishViewModel = this.f245290C0;
        if (startPublishViewModel == null) {
            startPublishViewModel = null;
        }
        startPublishViewModel.f245326S.b(startPublishViewModel.f245316E.b().x(new J(startPublishViewModel, null), K.f245268b));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        requireActivity();
        L l12 = this.f245291t0;
        if (l12 == null) {
            l12 = null;
        }
        this.f245290C0 = (StartPublishViewModel) R0.a(this, l12).a(StartPublishViewModel.class);
        if (bundle == null) {
            InterfaceC28373a interfaceC28373a = this.f245294w0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new r.c());
            Bundle arguments = getArguments();
            StartPublishBundle startPublishBundle = arguments != null ? (StartPublishBundle) arguments.getParcelable("called_params") : null;
            StartPublishViewModel startPublishViewModel = this.f245290C0;
            if (startPublishViewModel == null) {
                startPublishViewModel = null;
            }
            Navigation navigation2 = startPublishBundle != null ? startPublishBundle.f245279b : null;
            PublishInitialToast publishInitialToast = startPublishBundle != null ? startPublishBundle.f245281d : null;
            boolean z12 = startPublishBundle != null ? startPublishBundle.f245282e : false;
            if (startPublishViewModel.ke(navigation2, publishInitialToast, startPublishBundle != null ? startPublishBundle.f245283f : null, startPublishBundle != null ? startPublishBundle.f245284g : null, startPublishBundle != null ? startPublishBundle.f245285h : null)) {
                return;
            }
            startPublishViewModel.me(publishInitialToast, z12);
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.start_publish_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        E5();
        D5();
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        StartPublishViewModel startPublishViewModel = this.f245290C0;
        if (startPublishViewModel == null) {
            startPublishViewModel = null;
        }
        StartPublishViewModel.ResumeStrategy resumeStrategy = (StartPublishViewModel.ResumeStrategy) startPublishViewModel.f245320M.b("key.finish_on_resume");
        if (resumeStrategy == null) {
            resumeStrategy = StartPublishViewModel.ResumeStrategy.f245327b;
        }
        int iOrdinal = resumeStrategy.ordinal();
        if (iOrdinal == 0) {
            Q1 q12 = startPublishViewModel.f245322O;
            q12.getClass();
            kotlin.reflect.n<Object> nVar = Q1.f67448x0[30];
            boolean zBooleanValue = ((Boolean) q12.f67453E.a().invoke()).booleanValue();
            AbstractC22991Y abstractC22991Y = startPublishViewModel.f245324Q;
            if (zBooleanValue) {
                abstractC22991Y.setValue(startPublishViewModel.f245320M.b("key.state"));
            } else {
                abstractC22991Y.setValue(abstractC22991Y.getValue());
            }
        } else if (iOrdinal == 1 || iOrdinal == 2) {
            startPublishViewModel.f245325R.setValue(StartPublishViewModel.a.C7351a.f245340a);
        }
        com.avito.android.ui.status_bar.e eVar = this.f245296y0;
        (eVar != null ? eVar : null).a(this);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        a.b.c(this, true);
        StartPublishViewModel startPublishViewModel = this.f245290C0;
        if (startPublishViewModel == null) {
            startPublishViewModel = null;
        }
        startPublishViewModel.f245325R.observe(getViewLifecycleOwner(), new r.a(new C34138m(this)));
        startPublishViewModel.f245324Q.observe(getViewLifecycleOwner(), new r.a(new C34139n(this)));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        f.a aVarA = com.avito.android.publish.start_publish.di.c.a();
        aVarA.d((com.avito.android.publish.start_publish.di.g) C29972i.a(C29972i.b(this), com.avito.android.publish.start_publish.di.g.class));
        aVarA.a(cv.c.b(this));
        aVarA.b(getResources());
        aVarA.e(this);
        Bundle arguments = getArguments();
        StartPublishBundle startPublishBundle = arguments != null ? (StartPublishBundle) arguments.getParcelable("called_params") : null;
        aVarA.c(startPublishBundle != null ? startPublishBundle.f245286i : null);
        aVarA.build().a(this);
    }
}
