package com.avito.android.profile.host;

import Cd.C13243a;
import Y61.k;
import android.os.Bundle;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.NavigationTab;
import com.avito.android.bottom_navigation.NavigationTabSetItem;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.bottom_navigation.ui.fragment.l;
import com.avito.android.di.C29972i;
import com.avito.android.profile.user_profile.CardToOpenFromProfile;
import com.avito.android.ui.fragments.TabBaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import q90.d;
import z1.AbstractC50339a;

/* compiled from: UserProfileHostFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/profile/host/UserProfileHostFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/bottom_navigation/ui/fragment/l;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "_avito_profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class UserProfileHostFragment extends TabBaseFragment implements l, InterfaceC28477j.a {

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.profile.host.h f222328t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final O0 f222329u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public s90.d f222330v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.progress_overlay.l f222331w0;

    /* renamed from: x0, reason: collision with root package name */
    @k
    public final NavigationState f222332x0;

    /* compiled from: UserProfileHostFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[CardToOpenFromProfile.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                CardToOpenFromProfile cardToOpenFromProfile = CardToOpenFromProfile.f224194b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    /* compiled from: UserProfileHostFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<q90.d, G0> {
        public final void f(@k q90.d dVar) {
            UserProfileHostFragment userProfileHostFragment = (UserProfileHostFragment) this.receiver;
            userProfileHostFragment.getClass();
            if (dVar.f429065a) {
                com.avito.android.progress_overlay.l lVar = userProfileHostFragment.f222331w0;
                if (lVar != null) {
                    lVar.k(null);
                    return;
                }
                return;
            }
            com.avito.android.progress_overlay.l lVar2 = userProfileHostFragment.f222331w0;
            if (lVar2 != null) {
                lVar2.j();
            }
            d.b bVar = dVar.f429066b;
            if (bVar instanceof d.b.C12310b) {
                userProfileHostFragment.E5("profile-old", new com.avito.android.profile.host.b(userProfileHostFragment), com.avito.android.profile.host.a.f222339l);
            } else if (bVar instanceof d.b.a) {
                d.b.a aVar = (d.b.a) bVar;
                userProfileHostFragment.E5("profile-pro", new com.avito.android.profile.host.c(userProfileHostFragment, aVar), new com.avito.android.profile.host.d(userProfileHostFragment, aVar));
            }
        }

        @Override // Y41.l
        public final /* bridge */ /* synthetic */ G0 invoke(q90.d dVar) {
            f(dVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f222333l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f222333l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f222333l);
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
            return UserProfileHostFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f222335l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f222335l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f222335l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f222336l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f222336l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f222336l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f222337l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f222337l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f222337l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: UserProfileHostFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/profile/host/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/profile/host/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<com.avito.android.profile.host.g> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.profile.host.g invoke() {
            com.avito.android.profile.host.h hVar = UserProfileHostFragment.this.f222328t0;
            if (hVar == null) {
                hVar = null;
            }
            return (com.avito.android.profile.host.g) hVar.get();
        }
    }

    public UserProfileHostFragment() {
        super(R.layout.fragment_profile_host);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f222329u0 = new O0(m0.f406844a.b(com.avito.android.profile.host.g.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
        this.f222332x0 = new NavigationState(false, new NavigationState.NavbarBusiness360.Show(false, false, 3, null), 1, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final com.avito.android.profile.pro.ProfileProArguments D5(com.avito.android.profile.host.UserProfileHostFragment r3, q90.d.b.a r4) {
        /*
            android.os.Bundle r3 = r3.getArguments()
            r0 = 1
            if (r3 == 0) goto L1e
            int r1 = android.os.Build.VERSION.SDK_INT
            r2 = 34
            if (r1 < r2) goto L14
            java.lang.Object r3 = com.avito.android.passport.profile_add.merge.profiles_list.c.x(r3)
            android.os.Parcelable r3 = (android.os.Parcelable) r3
            goto L1a
        L14:
            java.lang.String r1 = "key_arguments"
            android.os.Parcelable r3 = r3.getParcelable(r1)
        L1a:
            com.avito.android.profile.user_profile.UserProfileArguments r3 = (com.avito.android.profile.user_profile.UserProfileArguments) r3
            if (r3 != 0) goto L24
        L1e:
            com.avito.android.profile.user_profile.UserProfileArguments r3 = new com.avito.android.profile.user_profile.UserProfileArguments
            r1 = 0
            r3.<init>(r1, r0, r1)
        L24:
            com.avito.android.profile.pro.ProfileProArguments r1 = new com.avito.android.profile.pro.ProfileProArguments
            com.avito.android.profile.user_profile.CardToOpenFromProfile r3 = r3.f224213b
            int r3 = r3.ordinal()
            if (r3 == 0) goto L39
            if (r3 != r0) goto L33
            com.avito.android.profile.pro.ProfileProArguments$StartScreen r3 = com.avito.android.profile.pro.ProfileProArguments.StartScreen.f222426c
            goto L3b
        L33:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        L39:
            com.avito.android.profile.pro.ProfileProArguments$StartScreen r3 = com.avito.android.profile.pro.ProfileProArguments.StartScreen.f222425b
        L3b:
            q90.d$b$a$a r0 = q90.d.b.a.C12308a.f429068a
            boolean r0 = kotlin.jvm.internal.L.f(r4, r0)
            if (r0 == 0) goto L46
            com.avito.android.profile.pro.ProfileProArguments$UserType r4 = com.avito.android.profile.pro.ProfileProArguments.UserType.f222429b
            goto L50
        L46:
            q90.d$b$a$b r0 = q90.d.b.a.C12309b.f429069a
            boolean r4 = kotlin.jvm.internal.L.f(r4, r0)
            if (r4 == 0) goto L54
            com.avito.android.profile.pro.ProfileProArguments$UserType r4 = com.avito.android.profile.pro.ProfileProArguments.UserType.f222430c
        L50:
            r1.<init>(r3, r4)
            return r1
        L54:
            kotlin.NoWhenBranchMatchedException r3 = new kotlin.NoWhenBranchMatchedException
            r3.<init>()
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.profile.host.UserProfileHostFragment.D5(com.avito.android.profile.host.UserProfileHostFragment, q90.d$b$a):com.avito.android.profile.pro.ProfileProArguments");
    }

    public final void E5(String str, Y41.a<? extends Fragment> aVar, Y41.a<G0> aVar2) {
        if (getChildFragmentManager().H(str) != null) {
            aVar2.invoke();
            return;
        }
        androidx.fragment.app.H hE2 = getChildFragmentManager().e();
        hE2.n(R.id.fragment_container, aVar.invoke(), str);
        hE2.h();
    }

    @Override // com.avito.android.bottom_navigation.ui.fragment.l
    public final boolean b0(@k NavigationTabSetItem navigationTabSetItem) {
        return navigationTabSetItem == NavigationTab.f106974j;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f222331w0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f222331w0 = new com.avito.android.progress_overlay.l((ViewGroup) view.findViewById(R.id.root), R.id.fragment_container, null, R.layout.part_network_problem, 0, 20, null);
        com.avito.android.arch.mvi.android.f.c(this, (com.avito.android.profile.host.g) this.f222329u0.getValue(), new b(1, this, UserProfileHostFragment.class, "render", "render(Lcom/avito/android/profile/host/mvi/entity/UserProfileHostState;)V", 0));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.profile.host.di.a.a().a((com.avito.android.profile.host.di.c) C29972i.a(C29972i.b(this), com.avito.android.profile.host.di.c.class)).a(this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF222332x0() {
        return this.f222332x0;
    }
}
