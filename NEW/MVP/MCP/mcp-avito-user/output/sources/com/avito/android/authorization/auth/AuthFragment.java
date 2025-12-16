package com.avito.android.authorization.auth;

import Ai.DialogInterfaceOnDismissListenerC13035a;
import Cd.C13243a;
import android.content.Intent;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.C22960s;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import be.C25637d;
import be.InterfaceC25634a;
import be.InterfaceC25636c;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.authorization.AuthScreenMode;
import com.avito.android.authorization.analytics.CodeConfirmationSource;
import com.avito.android.authorization.auth.InterfaceC28644x;
import com.avito.android.authorization.auth.di.b;
import com.avito.android.authorization.duplicate_pd.DuplicatePdArgs;
import com.avito.android.authorization.gorelkin.ParsingPermissionFormContent;
import com.avito.android.authorization.gorelkin.ParsingPermissionFragment;
import com.avito.android.authorization.gorelkin.PpFlow;
import com.avito.android.code_confirmation.phone_management.PhoneManagementIntentFactory;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.dialog.InterfaceC30274a;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.ui.status_bar.a;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.util.Kundle;
import he.C40918a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: AuthFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/authorization/auth/AuthFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/authorization/auth/x$b;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/ui/status_bar/a;", "<init>", "()V", "a", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AuthFragment extends TabBaseFragment implements InterfaceC28644x.b, InterfaceC28477j.b, com.avito.android.ui.status_bar.a {

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.social.M f92817A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public InterfaceC28641u f92818B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f92819C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f92820D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public InterfaceC30274a f92821E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.ui.status_bar.e f92822F0;

    /* renamed from: G0, reason: collision with root package name */
    @Y61.k
    public final C47313c f92823G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public com.avito.android.authorization.auth.auth_socials.w f92824H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final O0 f92825I0;

    /* renamed from: J0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<String> f92826J0;

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<G0> f92827K0;

    /* renamed from: L0, reason: collision with root package name */
    @Y61.k
    public final androidx.view.result.h<DuplicatePdArgs> f92828L0;

    /* renamed from: M0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f92829M0;

    /* renamed from: N0, reason: collision with root package name */
    public boolean f92830N0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public Zd.i f92831t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public FW.a f92832u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f92833v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public l90.o f92834w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public PhoneManagementIntentFactory f92835x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public InterfaceC28644x f92836y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f92837z0;

    /* renamed from: P0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f92816P0 = {m0.f406844a.e(new kotlin.jvm.internal.Y(AuthFragment.class, "authView", "getAuthView()Lcom/avito/android/authorization/auth/AuthView;", 0))};

    /* renamed from: O0, reason: collision with root package name */
    @Y61.k
    public static final a f92815O0 = new a(null);

    /* compiled from: AuthFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/authorization/auth/AuthFragment$a;", "", "<init>", "()V", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AuthFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/authorization/auth/AuthFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_authorization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            com.avito.android.lib.design.bottom_sheet.d dVar = AuthFragment.this.f92829M0;
            return (ViewGroup) (dVar != null ? dVar.u() : null);
        }
    }

    /* compiled from: AuthFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"", "requestKey", "Landroid/os/Bundle;", "bundle", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.p<String, Bundle, G0> {
        public c() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(String str, Bundle bundle) {
            Bundle bundle2 = bundle;
            if (str.equals("fragment_result_key")) {
                InterfaceC28644x interfaceC28644x = AuthFragment.this.f92836y0;
                if (interfaceC28644x == null) {
                    interfaceC28644x = null;
                }
                ParsingPermissionFragment.f93867D0.getClass();
                interfaceC28644x.b(ParsingPermissionFragment.a.a(bundle2), ParsingPermissionFragment.a.b(bundle2));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AuthFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends kotlin.jvm.internal.H implements Y41.l<InterfaceC25636c, G0> {
        public final void f(@Y61.k InterfaceC25636c interfaceC25636c) {
            AuthFragment authFragment = (AuthFragment) this.receiver;
            a aVar = AuthFragment.f92815O0;
            authFragment.getClass();
            if (interfaceC25636c instanceof InterfaceC25636c.a) {
                authFragment.f92826J0.b(((InterfaceC25636c.a) interfaceC25636c).f57307a);
            } else if (interfaceC25636c instanceof InterfaceC25636c.b) {
                C43259k.d(C22981N.a(authFragment.getLifecycle()), null, null, new C28628g(authFragment, ((InterfaceC25636c.b) interfaceC25636c).f57308a, null), 3);
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(InterfaceC25636c interfaceC25636c) {
            f(interfaceC25636c);
            return G0.f406611a;
        }
    }

    /* compiled from: AuthFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lbe/d;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(Lbe/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.l<C25637d, G0> {
        public e() {
            super(1);
        }

        /* JADX WARN: Type inference failed for: r11v8, types: [java.lang.Object, java.util.List] */
        @Override // Y41.l
        public final G0 invoke(C25637d c25637d) {
            a aVar = AuthFragment.f92815O0;
            AuthFragment authFragment = AuthFragment.this;
            C28625d c28625d = new C28625d(1, (com.avito.android.authorization.auth.auth_socials.v) authFragment.f92825I0.getValue(), com.avito.android.authorization.auth.auth_socials.v.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            authFragment.G5().b();
            C25637d.InterfaceC2008d interfaceC2008d = c25637d.f57311b;
            if (interfaceC2008d instanceof C25637d.c) {
                authFragment.G5().d(true);
                int size = ((C25637d.c) interfaceC2008d).f57313a.size();
                for (int i12 = 0; i12 < size; i12++) {
                    authFragment.G5().e();
                }
            } else if (interfaceC2008d instanceof C25637d.b) {
                authFragment.G5().d(false);
                for (InterfaceC25634a.InterfaceC2007a interfaceC2007a : ((C25637d.b) interfaceC2008d).f57312a) {
                    authFragment.G5().a(interfaceC2007a.getF57303a(), interfaceC2007a.getF57304b(), new C28626e(c28625d, interfaceC2007a));
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AuthFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/authorization/auth/auth_socials/v;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/authorization/auth/auth_socials/v;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.authorization.auth.auth_socials.v> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.authorization.auth.auth_socials.v invoke() {
            com.avito.android.authorization.auth.auth_socials.w wVar = AuthFragment.this.f92824H0;
            if (wVar == null) {
                wVar = null;
            }
            return (com.avito.android.authorization.auth.auth_socials.v) wVar.get();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f92842l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f92842l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f92842l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return AuthFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f92844l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f92844l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f92844l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f92845l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f92845l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f92845l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f92846l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f92846l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f92846l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public AuthFragment() {
        super(0, 1, null);
        this.f92823G0 = new C47313c(null, 1, null);
        g gVar = new g(new f());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f92825I0 = new O0(m0.f406844a.b(com.avito.android.authorization.auth.auth_socials.v.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f92826J0 = registerForActivityResult(new C28631j(this), new C28629h(0));
        this.f92827K0 = registerForActivityResult(new C28632k(this), new C28629h(0));
        this.f92828L0 = registerForActivityResult(new C28630i(this), new C28629h(0));
    }

    public final void D5() {
        AuthScreenMode authScreenMode;
        Bundle arguments = getArguments();
        AuthArguments authArguments = arguments != null ? (AuthArguments) arguments.getParcelable("key_arguments") : null;
        AuthArguments authArguments2 = authArguments != null ? authArguments : null;
        if (authArguments2 == null || (authScreenMode = authArguments2.f92814f) == null) {
            authScreenMode = AuthScreenMode.f92662b;
        }
        if (authScreenMode == AuthScreenMode.f92663c) {
            return;
        }
        requireActivity().finish();
        requireActivity().setResult(0);
    }

    public final void E5() {
        com.avito.android.lib.design.bottom_sheet.d dVar = this.f92829M0;
        if (dVar != null) {
            dVar.setOnDismissListener(null);
        }
        com.avito.android.lib.design.bottom_sheet.d dVar2 = this.f92829M0;
        if (dVar2 != null) {
            dVar2.r();
        }
    }

    public final void F5(@Y61.k DeepLink deepLink) {
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f92820D0;
        if (aVar == null) {
            aVar = null;
        }
        b.a.a(aVar, deepLink, null, null, 6);
    }

    public final g0 G5() {
        C47313c c47313c = this.f92823G0;
        kotlin.reflect.n<Object> nVar = f92816P0[0];
        return (g0) c47313c.a();
    }

    public final void H5(@Y61.k String str, @Y61.k String str2) {
        Zd.i iVar = this.f92831t0;
        if (iVar == null) {
            iVar = null;
        }
        Intent intentJ = iVar.j(requireActivity().getIntent(), (248 & 2) != 0 ? null : str, (248 & 4) != 0 ? null : str2, (248 & 8) == 0, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? false : false, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : null);
        intentJ.setFlags(603979776);
        startActivityForResult(intentJ, 1);
    }

    public final void I5(@Y61.l String str, boolean z12) {
        Zd.i iVar = this.f92831t0;
        if (iVar == null) {
            iVar = null;
        }
        startActivityForResult(iVar.j(requireActivity().getIntent(), (248 & 2) != 0 ? null : null, (248 & 4) != 0 ? null : null, (248 & 8) == 0, (248 & 16) != 0 ? null : null, (248 & 32) != 0 ? false : z12, (248 & 64) != 0 ? null : null, (248 & 128) != 0 ? null : str), 1);
    }

    public final void J5(@Y61.k ParsingPermissionFormContent parsingPermissionFormContent) {
        E5();
        androidx.fragment.app.H hE2 = getParentFragmentManager().e();
        ParsingPermissionFragment.a aVar = ParsingPermissionFragment.f93867D0;
        PpFlow ppFlow = PpFlow.f93887b;
        aVar.getClass();
        hE2.j(R.id.fragment_container, ParsingPermissionFragment.a.c(parsingPermissionFormContent, ppFlow), null, 1);
        hE2.e();
    }

    public final void K5() {
        if (C28634m.a(this).f92812d) {
            if (getLifecycle().getF46705d().compareTo(Lifecycle.State.f46682e) < 0) {
                this.f92830N0 = true;
                return;
            }
            InterfaceC28644x interfaceC28644x = this.f92836y0;
            if (interfaceC28644x == null) {
                interfaceC28644x = null;
            }
            interfaceC28644x.j();
        }
    }

    @Override // com.avito.android.ui.status_bar.a
    public final boolean S3() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        return new b(activityC22955mRequireActivity);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        C22960s.b(this, "fragment_result_key", new c());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f92819C0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.auth, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        InterfaceC28644x interfaceC28644x = this.f92836y0;
        if (interfaceC28644x == null) {
            interfaceC28644x = null;
        }
        interfaceC28644x.e0();
        super.onDestroy();
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(@Y61.k Bundle bundle) {
        super.onSaveInstanceState(bundle);
        InterfaceC28644x interfaceC28644x = this.f92836y0;
        if (interfaceC28644x == null) {
            interfaceC28644x = null;
        }
        com.avito.android.util.G.c(bundle, "presenterState", interfaceC28644x.d0());
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        InterfaceC28644x interfaceC28644x = this.f92836y0;
        if (interfaceC28644x == null) {
            interfaceC28644x = null;
        }
        interfaceC28644x.d(this);
        if (this.f92830N0) {
            InterfaceC28644x interfaceC28644x2 = this.f92836y0;
            (interfaceC28644x2 != null ? interfaceC28644x2 : null).j();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        InterfaceC28644x interfaceC28644x = this.f92836y0;
        if (interfaceC28644x == null) {
            interfaceC28644x = null;
        }
        interfaceC28644x.c0();
        super.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        AuthScreenMode authScreenMode;
        AuthScreenMode authScreenMode2;
        super.onViewCreated(view, bundle);
        a.b.c(this, true);
        com.avito.android.ui.status_bar.e eVar = this.f92822F0;
        if (eVar == null) {
            eVar = null;
        }
        eVar.a(this);
        K5();
        if (bundle == null) {
            Bundle arguments = getArguments();
            AuthArguments authArguments = arguments != null ? (AuthArguments) arguments.getParcelable("key_arguments") : null;
            if (authArguments == null) {
                authArguments = null;
            }
            String str = authArguments != null ? authArguments.f92810b : null;
            InterfaceC28373a interfaceC28373a = this.f92837z0;
            if (interfaceC28373a == null) {
                interfaceC28373a = null;
            }
            interfaceC28373a.c(new C40918a(str));
        }
        View viewFindViewById = view.findViewById(R.id.auth_frame_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        FrameLayout frameLayout = (FrameLayout) viewFindViewById;
        Bundle arguments2 = getArguments();
        AuthArguments authArguments2 = arguments2 != null ? (AuthArguments) arguments2.getParcelable("key_arguments") : null;
        if (authArguments2 == null) {
            authArguments2 = null;
        }
        if (authArguments2 == null || (authScreenMode = authArguments2.f92814f) == null) {
            authScreenMode = AuthScreenMode.f92662b;
        }
        AuthScreenMode authScreenMode3 = AuthScreenMode.f92663c;
        if (authScreenMode == authScreenMode3) {
            ActivityC22955m activityC22955mRequireActivity = requireActivity();
            com.avito.android.lib.util.i.f181373a.getClass();
            if (!com.avito.android.lib.util.i.f181377e) {
                int iD2 = C35835l0.d(R.attr.white, activityC22955mRequireActivity);
                activityC22955mRequireActivity.getWindow().setStatusBarColor(iD2);
                activityC22955mRequireActivity.getWindow().setNavigationBarColor(iD2);
            }
            View decorView = activityC22955mRequireActivity.getWindow().getDecorView();
            int systemUiVisibility = activityC22955mRequireActivity.getWindow().getDecorView().getSystemUiVisibility();
            boolean zA2 = true ^ com.avito.android.lib.util.darkTheme.c.a(activityC22955mRequireActivity);
            TypedArray typedArrayObtainStyledAttributes = activityC22955mRequireActivity.obtainStyledAttributes(new int[]{android.R.attr.windowLightStatusBar});
            boolean z12 = typedArrayObtainStyledAttributes.getBoolean(0, zA2);
            typedArrayObtainStyledAttributes.recycle();
            decorView.setSystemUiVisibility(z12 ? systemUiVisibility | 8192 : systemUiVisibility & (-8193));
            View viewFindViewById2 = view.findViewById(R.id.auth_fullscreen);
            if (viewFindViewById2 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            D6.H(viewFindViewById2);
            Bundle arguments3 = getArguments();
            AuthArguments authArguments3 = arguments3 != null ? (AuthArguments) arguments3.getParcelable("key_arguments") : null;
            if (authArguments3 == null) {
                authArguments3 = null;
            }
            if (authArguments3 == null || (authScreenMode2 = authArguments3.f92814f) == null) {
                authScreenMode2 = AuthScreenMode.f92662b;
            }
            if (authScreenMode2 == authScreenMode3) {
                View viewFindViewById3 = view.findViewById(R.id.auth_fullscreen_close);
                if (viewFindViewById3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                D6.H(viewFindViewById3);
                viewFindViewById3.setOnClickListener(new com.avito.android.advert.item.consultation.B(this, 20));
                View viewFindViewById4 = view.findViewById(R.id.auth_fullscreen_space);
                if (viewFindViewById4 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.View");
                }
                D6.w(viewFindViewById4);
            }
            View viewFindViewById5 = view.findViewById(R.id.auth_bottom_sheet);
            if (viewFindViewById5 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            View viewFindViewById6 = view.findViewById(R.id.auth_screen_progress);
            if (viewFindViewById6 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            h0 h0Var = new h0(viewFindViewById5, viewFindViewById6, null, frameLayout);
            C47313c c47313c = this.f92823G0;
            kotlin.reflect.n<Object> nVar = f92816P0[0];
            c47313c.b(this, h0Var);
            InterfaceC28644x interfaceC28644x = this.f92836y0;
            if (interfaceC28644x == null) {
                interfaceC28644x = null;
            }
            interfaceC28644x.e(h0Var);
        } else {
            View viewFindViewById7 = view.findViewById(R.id.auth_screen_progress);
            if (viewFindViewById7 == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.View");
            }
            com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
            com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
            dVar.E(R.layout.auth_bottom_sheet, true, new C28627f(viewFindViewById7, dVar, frameLayout, this));
            com.avito.android.lib.util.g.a(dVar);
            this.f92829M0 = dVar;
            dVar.setOnDismissListener(new DialogInterfaceOnDismissListenerC13035a(this, 10));
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f92819C0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker, (com.avito.android.authorization.auth.auth_socials.v) this.f92825I0.getValue(), new d(1, this, AuthFragment.class, "handleSocialsEvent", "handleSocialsEvent(Lcom/avito/android/authorization/auth/auth_socials/entity/AuthSocialsOneTimeEvent;)V", 0), new e());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f92819C0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        AuthArguments authArgumentsA = C28634m.a(this);
        b.a aVarA = com.avito.android.authorization.auth.di.l.a();
        com.avito.android.authorization.auth.di.c cVar = (com.avito.android.authorization.auth.di.c) C29972i.a(C29972i.b(this), com.avito.android.authorization.auth.di.c.class);
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
        Resources resources = getResources();
        Kundle kundleA = bundle != null ? com.avito.android.util.G.a(bundle, "presenterState") : null;
        Parcelable.Creator<CodeConfirmationSource> creator = CodeConfirmationSource.CREATOR;
        aVarA.a(cVar, activityC22955mRequireActivity, rVarC, resources, kundleA, authArgumentsA.f92810b, cv.c.b(this)).a(this);
        this.f92830N0 = bundle != null ? bundle.getBoolean("shouldFinish") : false;
        ScreenPerformanceTracker screenPerformanceTracker = this.f92819C0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f92819C0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, g5());
    }
}
