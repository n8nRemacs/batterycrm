package com.avito.android.passport.profile_add.merge.accounts_profile_error;

import Cd.C13243a;
import Y41.l;
import Y50.a;
import Y50.b;
import Y61.k;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.user_hat.items.C29574b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toggle.Checkmark;
import com.avito.android.passport.network.model.PassportListAvatar;
import com.avito.android.passport.network.model.PassportUserDialogWithProfile;
import com.avito.android.passport.profile_add.merge.accounts_profile_error.j;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageKt;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35949t5;
import com.avito.android.util.C35966w1;
import com.facebook.drawee.view.SimpleDraweeView;
import dagger.internal.u;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: AccountsProfileErrorFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/AccountsProfileErrorFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class AccountsProfileErrorFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @k
    public static final a f212383A0;

    /* renamed from: B0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f212384B0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public u f212385n0;

    /* renamed from: o0, reason: collision with root package name */
    @k
    public final O0 f212386o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f212387p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f212388q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f212389r0;

    /* renamed from: s0, reason: collision with root package name */
    @k
    public final C47313c f212390s0;

    /* renamed from: t0, reason: collision with root package name */
    @k
    public final C47313c f212391t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final C47313c f212392u0;

    /* renamed from: v0, reason: collision with root package name */
    @k
    public final C47313c f212393v0;

    /* renamed from: w0, reason: collision with root package name */
    @k
    public final C47313c f212394w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final C47313c f212395x0;

    /* renamed from: y0, reason: collision with root package name */
    @k
    public final C47313c f212396y0;

    /* renamed from: z0, reason: collision with root package name */
    @k
    public final C47313c f212397z0;

    /* compiled from: AccountsProfileErrorFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/AccountsProfileErrorFragment$a;", "", "<init>", "()V", "", "ARGS_PUDWP", "Ljava/lang/String;", "_avito_passport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: AccountsProfileErrorFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.passport.profile_add.merge.accounts_profile_error.AccountsProfileErrorFragment$a$a, reason: collision with other inner class name */
        public static final class C6345a extends N implements l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ PassportUserDialogWithProfile f212398l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6345a(PassportUserDialogWithProfile passportUserDialogWithProfile) {
                super(1);
                this.f212398l = passportUserDialogWithProfile;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("profile_add.merge.profile_error.pudwp", this.f212398l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @k
        public static AccountsProfileErrorFragment a(@k PassportUserDialogWithProfile passportUserDialogWithProfile) {
            AccountsProfileErrorFragment accountsProfileErrorFragment = new AccountsProfileErrorFragment();
            C35966w1.a(accountsProfileErrorFragment, -1, new C6345a(passportUserDialogWithProfile));
            return accountsProfileErrorFragment;
        }

        public a() {
        }
    }

    /* compiled from: AccountsProfileErrorFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements l<Y50.b, G0> {
        @Override // Y41.l
        public final G0 invoke(Y50.b bVar) {
            Y50.b bVar2 = bVar;
            AccountsProfileErrorFragment accountsProfileErrorFragment = (AccountsProfileErrorFragment) this.receiver;
            a aVar = AccountsProfileErrorFragment.f212383A0;
            accountsProfileErrorFragment.getClass();
            if (bVar2 instanceof b.a) {
                com.avito.android.passport.profile_add.merge.b.a(accountsProfileErrorFragment.requireActivity());
            } else if (bVar2 instanceof b.C1364b) {
                accountsProfileErrorFragment.requireActivity().finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AccountsProfileErrorFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LY50/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LY50/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements l<Y50.c, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Y50.c cVar) {
            Uri uri;
            Image singleImage;
            Y50.c cVar2 = cVar;
            AccountsProfileErrorFragment accountsProfileErrorFragment = AccountsProfileErrorFragment.this;
            C47313c c47313c = accountsProfileErrorFragment.f212391t0;
            n<Object>[] nVarArr = AccountsProfileErrorFragment.f212384B0;
            n<Object> nVar = nVarArr[1];
            com.avito.android.util.text.j.a((TextView) c47313c.a(), AttributedText.copy$default(cVar2.f19303e, null, null, 1, 3, null), null);
            C47313c c47313c2 = accountsProfileErrorFragment.f212392u0;
            n<Object> nVar2 = nVarArr[2];
            ((TextView) c47313c2.a()).setText(cVar2.f19300b);
            C47313c c47313c3 = accountsProfileErrorFragment.f212393v0;
            n<Object> nVar3 = nVarArr[3];
            ((TextView) c47313c3.a()).setText(cVar2.f19301c);
            C47313c c47313c4 = accountsProfileErrorFragment.f212394w0;
            n<Object> nVar4 = nVarArr[4];
            SimpleDraweeView simpleDraweeView = (SimpleDraweeView) c47313c4.a();
            PassportListAvatar passportListAvatar = cVar2.f19302d;
            C35949t5.c(simpleDraweeView, (passportListAvatar == null || (uri = passportListAvatar.getUri()) == null || (singleImage = ImageKt.toSingleImage(uri)) == null) ? null : com.avito.android.image_loader.b.b(singleImage), null, null, null, 14);
            n<Object> nVar5 = nVarArr[4];
            C29574b.a((SimpleDraweeView) c47313c4.a());
            com.avito.konveyor.adapter.a aVar = accountsProfileErrorFragment.f212389r0;
            if (aVar == null) {
                aVar = null;
            }
            aVar.c(new UV0.c(cVar2.f19304f));
            com.avito.konveyor.adapter.j jVar = accountsProfileErrorFragment.f212388q0;
            (jVar != null ? jVar : null).notifyDataSetChanged();
            return G0.f406611a;
        }
    }

    /* compiled from: AccountsProfileErrorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<G0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = AccountsProfileErrorFragment.f212383A0;
            ((com.avito.android.passport.profile_add.merge.accounts_profile_error.h) AccountsProfileErrorFragment.this.f212386o0.getValue()).accept(a.C1363a.f19294a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f212401l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(Y41.a aVar) {
            super(0);
            this.f212401l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f212401l);
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
            return AccountsProfileErrorFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ f f212403l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(f fVar) {
            super(0);
            this.f212403l = fVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f212403l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212404l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212404l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f212404l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f212405l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f212405l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f212405l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: AccountsProfileErrorFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<com.avito.android.passport.profile_add.merge.accounts_profile_error.h> {
        public j() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // Y41.a
        public final com.avito.android.passport.profile_add.merge.accounts_profile_error.h invoke() {
            u uVar = AccountsProfileErrorFragment.this.f212385n0;
            if (uVar == null) {
                uVar = null;
            }
            return (com.avito.android.passport.profile_add.merge.accounts_profile_error.h) uVar.get();
        }
    }

    static {
        Y y12 = new Y(AccountsProfileErrorFragment.class, "navBar", "getNavBar()Lcom/avito/android/lib/design/nav_bar/NavBar;", 0);
        n0 n0Var = m0.f406844a;
        f212384B0 = new n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(AccountsProfileErrorFragment.class, "title", "getTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(AccountsProfileErrorFragment.class, "profileTitle", "getProfileTitle()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(AccountsProfileErrorFragment.class, "profileName", "getProfileName()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(AccountsProfileErrorFragment.class, "profileAvatar", "getProfileAvatar()Lcom/facebook/drawee/view/SimpleDraweeView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(AccountsProfileErrorFragment.class, "profileCheckmark", "getProfileCheckmark()Lcom/avito/android/lib/design/toggle/Checkmark;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(AccountsProfileErrorFragment.class, "actionsList", "getActionsList()Landroidx/recyclerview/widget/RecyclerView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(AccountsProfileErrorFragment.class, "button", "getButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var)};
        f212383A0 = new a(null);
    }

    public AccountsProfileErrorFragment() {
        super(R.layout.passport_accounts_profile_error_fragment);
        e eVar = new e(new j());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new g(new f()));
        this.f212386o0 = new O0(m0.f406844a.b(com.avito.android.passport.profile_add.merge.accounts_profile_error.h.class), new h(interfaceC42726CB), eVar, new i(interfaceC42726CB));
        this.f212390s0 = new C47313c(null, 1, null);
        this.f212391t0 = new C47313c(null, 1, null);
        this.f212392u0 = new C47313c(null, 1, null);
        this.f212393v0 = new C47313c(null, 1, null);
        this.f212394w0 = new C47313c(null, 1, null);
        this.f212395x0 = new C47313c(null, 1, null);
        this.f212396y0 = new C47313c(null, 1, null);
        this.f212397z0 = new C47313c(null, 1, null);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f212387p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewOnCreateView = super.onCreateView(layoutInflater, viewGroup, bundle);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f212387p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.passport.profile_add.merge.accounts_profile_error.h) this.f212386o0.getValue(), new b(1, this, AccountsProfileErrorFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profile_add/merge/accounts_profile_error/mvi/entity/AccountsProfileErrorOneTimeEvent;)V", 0), new c());
        return viewOnCreateView;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        NavBar navBar = (NavBar) view.findViewById(R.id.passport_accounts_profile_error_nav_bar);
        C47313c c47313c = this.f212390s0;
        n<Object>[] nVarArr = f212384B0;
        n<Object> nVar = nVarArr[0];
        c47313c.b(this, navBar);
        n<Object> nVar2 = nVarArr[0];
        NavBar navBar2 = (NavBar) c47313c.a();
        d dVar = new d();
        int i12 = NavBar.f179818g;
        navBar2.c(R.attr.ic_arrowBack24, dVar);
        TextView textView = (TextView) view.findViewById(R.id.passport_accounts_profile_error_title);
        C47313c c47313c2 = this.f212391t0;
        n<Object> nVar3 = nVarArr[1];
        c47313c2.b(this, textView);
        View viewFindViewById = view.findViewById(R.id.passport_accounts_profile_error_profile);
        TextView textView2 = (TextView) viewFindViewById.findViewById(R.id.passport_profile_list_item_type);
        C47313c c47313c3 = this.f212392u0;
        n<Object> nVar4 = nVarArr[2];
        c47313c3.b(this, textView2);
        TextView textView3 = (TextView) viewFindViewById.findViewById(R.id.passport_profile_list_item_name);
        C47313c c47313c4 = this.f212393v0;
        n<Object> nVar5 = nVarArr[3];
        c47313c4.b(this, textView3);
        SimpleDraweeView simpleDraweeView = (SimpleDraweeView) viewFindViewById.findViewById(R.id.passport_profile_list_item_avatar);
        C47313c c47313c5 = this.f212394w0;
        n<Object> nVar6 = nVarArr[4];
        c47313c5.b(this, simpleDraweeView);
        Checkmark checkmark = (Checkmark) viewFindViewById.findViewById(R.id.passport_profile_list_item_current_check);
        C47313c c47313c6 = this.f212395x0;
        n<Object> nVar7 = nVarArr[5];
        c47313c6.b(this, checkmark);
        n<Object> nVar8 = nVarArr[5];
        ((Checkmark) c47313c6.a()).setChecked(true);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.passport_accounts_profile_error_actions);
        C47313c c47313c7 = this.f212396y0;
        n<Object> nVar9 = nVarArr[6];
        c47313c7.b(this, recyclerView);
        n<Object> nVar10 = nVarArr[6];
        RecyclerView recyclerView2 = (RecyclerView) c47313c7.a();
        com.avito.konveyor.adapter.j jVar = this.f212388q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerView2.setAdapter(jVar);
        Button button = (Button) view.findViewById(R.id.passport_accounts_profile_error_button);
        C47313c c47313c8 = this.f212397z0;
        n<Object> nVar11 = nVarArr[7];
        c47313c8.b(this, button);
        n<Object> nVar12 = nVarArr[7];
        ((Button) c47313c8.a()).setOnClickListener(new com.avito.android.order.feature.c(this, 8));
        ScreenPerformanceTracker screenPerformanceTracker = this.f212387p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        new j.c();
        Bundle bundleRequireArguments = requireArguments();
        j.b bVar = new j.b((com.avito.android.passport.profile_add.merge.accounts_profile_error.b) C29972i.a(C29972i.b(this), com.avito.android.passport.profile_add.merge.accounts_profile_error.b.class), cv.c.b(this), (PassportUserDialogWithProfile) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("profile_add.merge.profile_error.pudwp", PassportUserDialogWithProfile.class) : bundleRequireArguments.getParcelable("profile_add.merge.profile_error.pudwp")), s.c(this), null);
        this.f212385n0 = bVar.f212417e;
        this.f212387p0 = bVar.f212416d.get();
        this.f212388q0 = bVar.f212424l.get();
        this.f212389r0 = bVar.f212423k.get();
        ScreenPerformanceTracker screenPerformanceTracker = this.f212387p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
    }
}
