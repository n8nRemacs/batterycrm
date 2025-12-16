package com.avito.android.passport.profile_add.merge.profile_to_convert;

import Cd.C13243a;
import android.os.Bundle;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.PassportMergeAccountsProfilesListOnboardingLink;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.passport.network.model.MergeAccountsProfile;
import com.avito.android.passport.profile_add.merge.profile_to_convert.a;
import com.avito.android.remote.model.messenger.context_actions.PlatformActions;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.DeepLinkAttribute;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.G;
import cv.InterfaceC39417a;
import d60.InterfaceC39512a;
import dagger.internal.u;
import e60.InterfaceC39956a;
import java.util.Collections;
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
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: ProfileToConvertFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/ProfileToConvertFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class ProfileToConvertFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public static final a f213078w0;

    /* renamed from: x0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f213079x0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f213080n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f213081o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.passport.profile_list_item.n f213082p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f213083q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public u f213084r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f213085s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213086t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213087u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final C47313c f213088v0;

    /* compiled from: ProfileToConvertFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/ProfileToConvertFragment$a;", "", "<init>", "()V", "", "ARGS_ITEMS", "Ljava/lang/String;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ProfileToConvertFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.passport.profile_add.merge.profile_to_convert.ProfileToConvertFragment$a$a, reason: collision with other inner class name */
        public static final class C6378a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ List<MergeAccountsProfile> f213089l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6378a(List<MergeAccountsProfile> list) {
                super(1);
                this.f213089l = list;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                G.e("profile_add.merge.profile_to_convert.items", bundle, this.f213089l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ProfileToConvertFragment a(@Y61.k List list) {
            ProfileToConvertFragment profileToConvertFragment = new ProfileToConvertFragment();
            C35966w1.a(profileToConvertFragment, -1, new C6378a(list));
            return profileToConvertFragment;
        }

        public a() {
        }
    }

    /* compiled from: ProfileToConvertFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "profileId", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            a aVar = ProfileToConvertFragment.f213078w0;
            ProfileToConvertFragment.this.q5().accept(new InterfaceC39956a.c(str));
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f213091l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f213091l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f213091l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<Fragment> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ProfileToConvertFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f213093l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f213093l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f213093l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f213094l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f213094l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f213094l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f213095l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f213095l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f213095l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ProfileToConvertFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/profile_to_convert/l;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/merge/profile_to_convert/l;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<l> {
        public h() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final l invoke() {
            u uVar = ProfileToConvertFragment.this.f213084r0;
            if (uVar == null) {
                uVar = null;
            }
            return (l) uVar.get();
        }
    }

    static {
        Y y12 = new Y(ProfileToConvertFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f213079x0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(ProfileToConvertFragment.class, PlatformActions.ItemsList.TYPE, "getItemsList()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(ProfileToConvertFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f213078w0 = new a(null);
    }

    public ProfileToConvertFragment() {
        super(R.layout.passport_merge_accounts_profile_to_convert_fragment);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f213085s0 = new O0(m0.f406844a.b(l.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f213086t0 = new C47313c(null, 1, null);
        this.f213087u0 = new C47313c(null, 1, null);
        this.f213088v0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f213083q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        NavBar navBar = (NavBar) view.findViewById(R.id.nav_bar);
        navBar.c(R.attr.ic_arrowBack24, new com.avito.android.passport.profile_add.merge.profile_to_convert.f(this));
        C47313c c47313c = this.f213086t0;
        n<Object>[] nVarArr = f213079x0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, navBar);
        Button button = (Button) view.findViewById(R.id.passport_merge_accounts_profile_to_convert_button);
        C47313c c47313c2 = this.f213088v0;
        n<Object> nVar2 = nVarArr[2];
        c47313c2.b(this, button);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.passport_merge_accounts_profile_to_convert_content);
        C47313c c47313c3 = this.f213087u0;
        n<Object> nVar3 = nVarArr[1];
        c47313c3.b(this, recyclerView);
        n<Object> nVar4 = nVarArr[1];
        RecyclerView recyclerView2 = (RecyclerView) c47313c3.a();
        com.avito.konveyor.adapter.j jVar = this.f213080n0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.passport_merge_accounts_profile_to_convert_promoblock);
        TextView textView = (TextView) linearLayout.findViewById(R.id.passport_merge_accounts_profile_to_convert_promoblock_subtitle);
        linearLayout.setVisibility(0);
        textView.setMovementMethod(LinkMovementMethod.getInstance());
        AttributedText attributedText = new AttributedText(getString(R.string.passport_accounts_merge_profile_to_convert_promoblock_subtitle), Collections.singletonList(new DeepLinkAttribute("link_text", getString(R.string.passport_accounts_merge_profile_to_convert_promoblock_link), new PassportMergeAccountsProfilesListOnboardingLink(), null, null, null, 56, null)), 1);
        attributedText.setOnDeepLinkClickListener(new com.avito.android.cpt.pre_activation.ui.c(this, 28));
        com.avito.android.util.text.j.c(textView, attributedText, null);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.passport.profile_add.merge.profile_to_convert.c(this, null), 3);
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new com.avito.android.passport.profile_add.merge.profile_to_convert.d(this, null), 3);
        n<Object> nVar5 = nVarArr[2];
        ((Button) c47313c2.a()).setOnClickListener(new com.avito.android.order.feature.c(this, 12));
        com.avito.android.passport.profile_list_item.n nVar6 = this.f213082p0;
        if (nVar6 == null) {
            nVar6 = null;
        }
        nVar6.H3(new com.avito.android.passport.profile_add.merge.profile_to_convert.e(this));
        ScreenPerformanceTracker screenPerformanceTracker = this.f213083q0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new a.b();
        List parcelableArrayList = requireArguments().getParcelableArrayList("profile_add.merge.profile_to_convert.items");
        if (parcelableArrayList == null) {
            parcelableArrayList = C42784z0.f406748b;
        }
        List list = parcelableArrayList;
        r rVarC = s.c(this);
        InterfaceC39512a interfaceC39512a = (InterfaceC39512a) C29972i.a(C29972i.b(this), InterfaceC39512a.class);
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        b bVar = new b();
        list.getClass();
        a.c cVar = new a.c(new com.avito.android.passport.profile_add.merge.profile_to_convert.h(), new com.avito.android.passport.profile_add.merge.profile_to_convert.recycler.c(), interfaceC39512a, interfaceC39417aB, list, rVarC, bVar, null);
        this.f213080n0 = cVar.f213107k.get();
        this.f213081o0 = cVar.f213106j.get();
        this.f213082p0 = cVar.f213102f.get();
        ScreenPerformanceTracker screenPerformanceTracker = cVar.f213110n.get();
        this.f213083q0 = screenPerformanceTracker;
        this.f213084r0 = cVar.f213115s;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }

    public final l q5() {
        return (l) this.f213085s0.getValue();
    }
}
