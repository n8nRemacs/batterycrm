package com.avito.android.extended_profile;

import Cd.C13243a;
import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import ak.C19902a;
import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU0.C27106d;
import com.avito.android.R;
import com.avito.android.advert.item.C28156p;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.ExtendedProfileScreen;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.InterfaceC28481c;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.deeplink_handler.view.impl.b;
import com.avito.android.deeplink_handler.view.impl.d;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.extended_profile.ExtendedProfileFragment;
import com.avito.android.extended_profile.di.C30397b;
import com.avito.android.extended_profile.di.InterfaceC30436p;
import com.avito.android.extended_profile.di.InterfaceC30437q;
import com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c;
import com.avito.android.inline_filters.InlineFiltersSource;
import com.avito.android.inline_filters.InterfaceC31062w;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.D0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.deprecated_design.tab.TabPagerAdapter;
import com.avito.android.lib.deprecated_design.tab.adapter.BaseTabItem;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.memory.consumption.f;
import com.avito.android.ownership.Owners;
import com.avito.android.search.filter.InterfaceC34598u;
import com.avito.android.select.Arguments;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.H2;
import com.avito.android.util.InterfaceC35845m2;
import com.avito.android.util.Kundle;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetModalSize;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import com.avito.beduin.v2.render.android_view.BeduinView;
import dA.C39547a;
import fA.InterfaceC40265a;
import gF.InterfaceC40577a;
import iT.C41343c;
import iT.InterfaceC41341a;
import iT.InterfaceC41342b;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import java.util.LinkedHashMap;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import oW.InterfaceC44697a;
import ob.C44742f;
import ob.InterfaceC44739c;
import z1.AbstractC50339a;

/* compiled from: ExtendedProfileFragment.kt */
@s0
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\nB\u0007¢\u0006\u0004\b\b\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/extended_profile/ExtendedProfileFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/dialog/A;", "Lcom/avito/android/select/p;", "LFV0/c;", "Lcom/avito/beduin/v2/interaction/detached/flow/b;", "Lcom/avito/android/analytics/screens/j$b;", "Lob/c;", "<init>", "()V", "a", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ExtendedProfileFragment extends TabBaseFragment implements com.avito.android.dialog.A, com.avito.android.select.p, FV0.c, com.avito.beduin.v2.interaction.detached.flow.b, InterfaceC28477j.b, InterfaceC44739c {

    /* renamed from: Y0, reason: collision with root package name */
    @Y61.k
    public static final a f149283Y0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.extended_profile_widgets.adapter.premium_banner.d f149284A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public gD.f f149285B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f149286C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f149287D0;

    /* renamed from: E0, reason: collision with root package name */
    @X41.f
    @Inject
    public int f149288E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public QH.b f149289F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public h31.e<com.avito.android.lib.deprecated_design.tab.adapter.c<BaseTabItem>> f149290G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public h31.e<TabPagerAdapter> f149291H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public h31.e<com.avito.android.lib.deprecated_design.tab.adapter.j<BaseTabItem>> f149292I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public com.avito.android.extended_profile_phone_dialog.d f149293J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public com.avito.android.advert_collection_toast.a f149294K0;

    /* renamed from: L0, reason: collision with root package name */
    @Inject
    public InterfaceC31062w f149295L0;

    /* renamed from: M0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f149296M0;

    /* renamed from: N0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.item_visibility_tracker.b f149297N0;

    /* renamed from: O0, reason: collision with root package name */
    @Inject
    public com.avito.android.advertising.adapter.items.buzzoola.premium.r f149298O0;

    /* renamed from: P0, reason: collision with root package name */
    @Y61.l
    public d0 f149299P0;

    /* renamed from: Q0, reason: collision with root package name */
    public ScreenPerformanceTracker f149300Q0;

    /* renamed from: R0, reason: collision with root package name */
    @Inject
    public com.avito.android.extended_profile_widgets.adapter.map.c f149301R0;

    /* renamed from: S0, reason: collision with root package name */
    @Y61.k
    public final NavigationState f149302S0;

    /* renamed from: T0, reason: collision with root package name */
    @Y61.l
    public A f149303T0;

    /* renamed from: U0, reason: collision with root package name */
    @Y61.l
    public Parcelable f149304U0;

    /* renamed from: V0, reason: collision with root package name */
    @Y61.l
    public Integer f149305V0;

    /* renamed from: W0, reason: collision with root package name */
    @Y61.k
    public final b f149306W0;

    /* renamed from: X0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f149307X0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public InterfaceC40577a f149308t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public InterfaceC34598u f149309u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f149310v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.android.component.toast.util.c f149311w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public c0 f149312x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final O0 f149313y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public Zp0.d f149314z0;

    /* compiled from: ExtendedProfileFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile/ExtendedProfileFragment$a;", "", "<init>", "()V", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ExtendedProfileFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.extended_profile.ExtendedProfileFragment$a$a, reason: collision with other inner class name */
        public static final class C4380a extends kotlin.jvm.internal.N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ExtendedProfileArguments f149315l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4380a(ExtendedProfileArguments extendedProfileArguments) {
                super(1);
                this.f149315l = extendedProfileArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("arguments", this.f149315l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ExtendedProfileFragment a(@Y61.k ExtendedProfileArguments extendedProfileArguments) {
            ExtendedProfileFragment extendedProfileFragment = new ExtendedProfileFragment();
            C35966w1.a(extendedProfileFragment, -1, new C4380a(extendedProfileArguments));
            return extendedProfileFragment;
        }

        public a() {
        }
    }

    /* compiled from: ExtendedProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile/ExtendedProfileFragment$b", "Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/lazycolumn/f;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.f {
        public b() {
        }

        @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.f
        public final void a() {
            a aVar = ExtendedProfileFragment.f149283Y0;
            ExtendedProfileFragment.this.D5().accept(InterfaceC40265a.C40266b.f395715a);
        }

        @Override // com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.f
        public final void b() {
            a aVar = ExtendedProfileFragment.f149283Y0;
            ExtendedProfileFragment.this.D5().accept(InterfaceC40265a.C11131a.f395714a);
        }
    }

    /* compiled from: ExtendedProfileFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Landroid/content/Intent;", "intent", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<Intent, Intent> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final Intent invoke(Intent intent) {
            Intent intent2 = intent;
            C19902a.b(intent2, ExtendedProfileFragment.this.q5());
            return intent2;
        }
    }

    /* compiled from: ExtendedProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/extended_profile/ExtendedProfileFragment$d", "Lcom/avito/android/deeplink_handler/view/impl/b$a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d implements b.a {
        public d() {
        }
    }

    /* compiled from: ExtendedProfileFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/di/c;", "invoke", "()Lcom/avito/android/extended_profile_native_widgets_beduin_v2_wrapper/di/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c invoke() {
            ExtendedProfileFragment extendedProfileFragment = ExtendedProfileFragment.this;
            c.a aVarJf = ((c.b) C29972i.a(C29972i.b(extendedProfileFragment), c.b.class)).Jf();
            C30447j c30447j = new C30447j(extendedProfileFragment);
            C39547a c39547a = new C39547a();
            C30448k c30448k = new C30448k(extendedProfileFragment);
            ScreenPerformanceTracker screenPerformanceTracker = extendedProfileFragment.f149300Q0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            return aVarJf.a(c30447j, extendedProfileFragment.f149306W0, c39547a, c30448k, screenPerformanceTracker);
        }
    }

    /* compiled from: ExtendedProfileFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/lib/beduin_v2/feature/di/H;", "invoke", "()Lcom/avito/android/lib/beduin_v2/feature/di/H;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.lib.beduin_v2.feature.di.H> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ cv.d f149321m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ C27106d f149322n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ com.avito.beduin.v2.engine.component.x f149323o;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(cv.d dVar, C27106d c27106d, com.avito.beduin.v2.engine.component.x xVar) {
            super(0);
            this.f149321m = dVar;
            this.f149322n = c27106d;
            this.f149323o = xVar;
        }

        @Override // Y41.a
        public final com.avito.android.lib.beduin_v2.feature.di.H invoke() {
            ExtendedProfileFragment extendedProfileFragment = ExtendedProfileFragment.this;
            H.a aVarEd = ((H.b) C29972i.a(C29972i.b(extendedProfileFragment), H.b.class)).ed();
            ScreenPerformanceTracker screenPerformanceTracker = extendedProfileFragment.f149300Q0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            return com.avito.android.lib.beduin_v2.feature.di.K.a(aVarEd, screenPerformanceTracker, new ZS.b(ExtendedProfileScreen.f90351d, Owners.f210488g, (String) null, 4, (C42822w) null), new cv.d(this.f149321m), this.f149322n, this.f149323o, null, 32);
        }
    }

    /* compiled from: ExtendedProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LfA/a;", "it", "Lkotlin/G0;", "invoke", "(LfA/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<InterfaceC40265a, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC40265a interfaceC40265a) {
            a aVar = ExtendedProfileFragment.f149283Y0;
            ExtendedProfileFragment.this.D5().accept(interfaceC40265a);
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LoB/k;", "it", "Lkotlin/G0;", "invoke", "(LoB/k;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<oB.k, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(oB.k kVar) {
            a aVar = ExtendedProfileFragment.f149283Y0;
            ExtendedProfileFragment.this.D5().accept(new InterfaceC40265a.D(kVar));
            return G0.f406611a;
        }
    }

    /* compiled from: ExtendedProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final i f149326l = new i();

        public i() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Failed to dismiss detached Modal";
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f149327l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(Y41.a aVar) {
            super(0);
            this.f149327l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f149327l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ExtendedProfileFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ k f149329l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(k kVar) {
            super(0);
            this.f149329l = kVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f149329l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f149330l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f149330l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f149330l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f149331l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f149331l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f149331l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ExtendedProfileFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile/X;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/extended_profile/X;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends kotlin.jvm.internal.N implements Y41.a<X> {
        public o() {
            super(0);
        }

        @Override // Y41.a
        public final X invoke() {
            c0 c0Var = ExtendedProfileFragment.this.f149312x0;
            if (c0Var == null) {
                c0Var = null;
            }
            return (X) c0Var.get();
        }
    }

    public ExtendedProfileFragment() {
        super(0, 1, null);
        j jVar = new j(new o());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new l(new k()));
        this.f149313y0 = new O0(kotlin.jvm.internal.m0.f406844a.b(X.class), new m(interfaceC42726CB), jVar, new n(interfaceC42726CB));
        this.f149302S0 = new NavigationState(false, new NavigationState.NavbarBusiness360.Show(false, false, 3, null));
        this.f149306W0 = new b();
        this.f149307X0 = C42727D.c(new e());
    }

    @Override // FV0.a
    @Y61.k
    public final FV0.f A1() {
        return FV0.g.f4722a;
    }

    @Override // ob.InterfaceC44739c
    public final void C1(@Y61.k BannerInfo bannerInfo, int i12) {
        D5().accept(new InterfaceC40265a.v(bannerInfo, i12));
    }

    public final X D5() {
        return (X) this.f149313y0.getValue();
    }

    @Override // com.avito.android.select.p
    @Y61.k
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        Zp0.d dVar = this.f149314z0;
        if (dVar == null) {
            dVar = null;
        }
        return dVar.a(arguments);
    }

    @Override // ob.InterfaceC44739c
    public final void J4(@Y61.k BannerInfo bannerInfo, int i12) {
        D5().accept(new InterfaceC40265a.e(bannerInfo, i12));
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b Y2(@Y61.l String str, @Y61.l String str2, @Y61.l C36216a[] c36216aArr, @Y61.l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @Y61.k Y41.a<G0> aVar3) {
        cU.s sVar;
        com.avito.beduin.v2.theme.k kVarA;
        A a12 = this.f149303T0;
        if (a12 == null || (sVar = a12.f149240Y) == null || (kVarA = sVar.a()) == null) {
            return new C28156p(2);
        }
        com.avito.android.beduin.v2.page.modal.a aVar4 = com.avito.android.beduin.v2.page.modal.a.f105171a;
        Context contextRequireContext = requireContext();
        aVar4.getClass();
        com.avito.android.lib.design.modal.a aVarA = com.avito.android.beduin.v2.page.modal.a.a(contextRequireContext, kVarA, str, str2, c36216aArr, modalButtonsOrientation, z12, aVar, aVar2, z13, aVar3);
        com.avito.android.lib.util.g.a(aVarA);
        return new C30445h(aVarA, 0);
    }

    @Override // com.avito.android.dialog.A
    public final void a(@Y61.k DeepLink deepLink) {
        D5().accept(new InterfaceC40265a.C40267c(deepLink));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.InterfaceC4053a d5() {
        return new com.avito.android.ui.c(new d.a(this), new c());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.g e5() {
        return new com.avito.android.deeplink_handler.view.impl.b(requireActivity(), new d());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ScreenPerformanceTracker screenPerformanceTracker = this.f149300Q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        return new com.avito.android.extended_profile_ui_components.s(activityC22955mRequireActivity, null, screenPerformanceTracker);
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        InterfaceC31062w interfaceC31062w = this.f149295L0;
        if (interfaceC31062w == null) {
            interfaceC31062w = null;
        }
        interfaceC31062w.q(list);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        boolean z12 = i13 == -1;
        if (i12 != 101) {
            super.onActivityResult(i12, i13, intent);
        } else {
            if (!z12 || intent == null) {
                return;
            }
            new IE.a();
            D5().accept(new InterfaceC40265a.q(IE.a.a(intent)));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f149300Q0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.extended_profile_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        BeduinView beduinView;
        RecyclerView recyclerViewA;
        RecyclerView.m layoutManager;
        A a12 = this.f149303T0;
        this.f149304U0 = (a12 == null || (beduinView = a12.f149216A) == null || (recyclerViewA = CA.b.a(beduinView)) == null || (layoutManager = recyclerViewA.getLayoutManager()) == null) ? null : layoutManager.Y0();
        A a13 = this.f149303T0;
        this.f149305V0 = a13 != null ? a13.f149237V : null;
        com.avito.android.component.toast.util.c cVar = this.f149311w0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.clear();
        A a14 = this.f149303T0;
        if (a14 != null) {
            H2 h22 = a14.f149230O;
            if (h22 != null) {
                h22.dispose();
            }
            com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.lazycolumn.i iVar = a14.f149235T;
            if (iVar != null) {
                iVar.f151395h = null;
            }
            io.reactivex.rxjava3.internal.observers.y yVar = a14.f149241Z;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
        }
        this.f149303T0 = null;
        com.avito.android.advert_collection_toast.a aVar = this.f149294K0;
        if (aVar == null) {
            aVar = null;
        }
        aVar.a();
        com.avito.android.extended_profile_widgets.adapter.map.c cVar2 = this.f149301R0;
        (cVar2 != null ? cVar2 : null).onDestroyView();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onLowMemory() {
        super.onLowMemory();
        com.avito.android.extended_profile_widgets.adapter.map.c cVar = this.f149301R0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.onLowMemory();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        D5().accept(InterfaceC40265a.m.f395727a);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0047  */
    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void onSaveInstanceState(@Y61.k android.os.Bundle r6) {
        /*
            r5 = this;
            super.onSaveInstanceState(r6)
            com.avito.android.extended_profile.d0 r0 = r5.f149299P0
            if (r0 != 0) goto L14
            androidx.lifecycle.P0 r0 = new androidx.lifecycle.P0
            r0.<init>(r5)
            java.lang.Class<com.avito.android.extended_profile.d0> r1 = com.avito.android.extended_profile.d0.class
            androidx.lifecycle.M0 r0 = r0.a(r1)
            com.avito.android.extended_profile.d0 r0 = (com.avito.android.extended_profile.d0) r0
        L14:
            r5.f149299P0 = r0
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            com.avito.android.inline_filters.w r2 = r5.f149295L0
            r3 = 0
            if (r2 == 0) goto L21
            goto L22
        L21:
            r2 = r3
        L22:
            com.avito.android.util.Kundle r2 = r2.d0()
            java.lang.String r4 = "inline_filters_state"
            com.avito.android.util.G.c(r1, r4, r2)
            com.avito.android.extended_profile.A r2 = r5.f149303T0
            if (r2 == 0) goto L47
            com.avito.beduin.v2.render.android_view.BeduinView r2 = r2.f149216A
            if (r2 == 0) goto L44
            androidx.recyclerview.widget.RecyclerView r2 = CA.b.a(r2)
            if (r2 == 0) goto L44
            androidx.recyclerview.widget.RecyclerView$m r2 = r2.getLayoutManager()
            if (r2 == 0) goto L44
            android.os.Parcelable r2 = r2.Y0()
            goto L45
        L44:
            r2 = r3
        L45:
            if (r2 != 0) goto L49
        L47:
            android.os.Parcelable r2 = r5.f149304U0
        L49:
            java.lang.String r4 = "extended_profile_beduin_v2_column_state"
            r1.putParcelable(r4, r2)
            com.avito.android.extended_profile.A r2 = r5.f149303T0
            if (r2 == 0) goto L56
            java.lang.Integer r2 = r2.f149237V
            if (r2 != 0) goto L58
        L56:
            java.lang.Integer r2 = r5.f149305V0
        L58:
            if (r2 == 0) goto L63
            int r2 = r2.intValue()
            java.lang.String r4 = "sticky_item_position"
            r6.putInt(r4, r2)
        L63:
            r0.f149459E = r1
            com.avito.konveyor.item_visibility_tracker.b r0 = r5.f149297N0
            if (r0 == 0) goto L6a
            goto L6b
        L6a:
            r0 = r3
        L6b:
            android.os.Bundle r0 = r0.d0()
            java.lang.String r1 = "item_visibility_tracker_state"
            r6.putBundle(r1, r0)
            com.avito.android.advertising.adapter.items.buzzoola.premium.r r0 = r5.f149298O0
            if (r0 == 0) goto L79
            r3 = r0
        L79:
            com.avito.android.util.Kundle r0 = r3.d0()
            java.lang.String r1 = "commercial_state"
            r6.putParcelable(r1, r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.ExtendedProfileFragment.onSaveInstanceState(android.os.Bundle):void");
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        com.avito.android.extended_profile_widgets.adapter.map.c cVar = this.f149301R0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.onStart();
        D5().accept(InterfaceC40265a.n.f395728a);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        super.onStop();
        com.avito.android.extended_profile_widgets.adapter.map.c cVar = this.f149301R0;
        if (cVar == null) {
            cVar = null;
        }
        cVar.onStop();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        X xD5 = D5();
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        com.avito.android.component.toast.util.c cVar = this.f149311w0;
        com.avito.android.component.toast.util.c cVar2 = cVar != null ? cVar : null;
        gD.f fVar = this.f149285B0;
        gD.f fVar2 = fVar != null ? fVar : null;
        int i12 = this.f149288E0;
        QH.b bVar = this.f149289F0;
        QH.b bVar2 = bVar != null ? bVar : null;
        h31.e<com.avito.android.lib.deprecated_design.tab.adapter.c<BaseTabItem>> eVar = this.f149290G0;
        h31.e<com.avito.android.lib.deprecated_design.tab.adapter.c<BaseTabItem>> eVar2 = eVar != null ? eVar : null;
        h31.e<TabPagerAdapter> eVar3 = this.f149291H0;
        h31.e<TabPagerAdapter> eVar4 = eVar3 != null ? eVar3 : null;
        com.avito.konveyor.adapter.a aVar = this.f149286C0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.adapter.j jVar = this.f149287D0;
        com.avito.konveyor.adapter.j jVar2 = jVar != null ? jVar : null;
        h31.e<com.avito.android.lib.deprecated_design.tab.adapter.j<BaseTabItem>> eVar5 = this.f149292I0;
        h31.e<com.avito.android.lib.deprecated_design.tab.adapter.j<BaseTabItem>> eVar6 = eVar5 != null ? eVar5 : null;
        com.avito.android.extended_profile_phone_dialog.d dVar = this.f149293J0;
        com.avito.android.extended_profile_phone_dialog.d dVar2 = dVar != null ? dVar : null;
        InterfaceC31062w interfaceC31062w = this.f149295L0;
        InterfaceC31062w interfaceC31062w2 = interfaceC31062w != null ? interfaceC31062w : null;
        InterfaceC40577a interfaceC40577a = this.f149308t0;
        InterfaceC40577a interfaceC40577a2 = interfaceC40577a != null ? interfaceC40577a : null;
        InterfaceC34598u interfaceC34598u = this.f149309u0;
        InterfaceC34598u interfaceC34598u2 = interfaceC34598u != null ? interfaceC34598u : null;
        InterfaceC35845m2 interfaceC35845m2 = this.f149310v0;
        InterfaceC35845m2 interfaceC35845m22 = interfaceC35845m2 != null ? interfaceC35845m2 : null;
        ScreenPerformanceTracker screenPerformanceTracker = this.f149300Q0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker == null ? null : screenPerformanceTracker;
        com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c cVar3 = (com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c) this.f149307X0.getValue();
        com.avito.konveyor.a aVar3 = this.f149296M0;
        com.avito.konveyor.a aVar4 = aVar3 != null ? aVar3 : null;
        com.avito.konveyor.item_visibility_tracker.b bVar3 = this.f149297N0;
        A a12 = new A(this, view, xD5, viewLifecycleOwner, cVar2, fVar2, i12, bVar2, eVar2, eVar4, aVar2, jVar2, eVar6, dVar2, interfaceC31062w2, interfaceC40577a2, interfaceC34598u2, interfaceC35845m22, screenPerformanceTracker2, cVar3, aVar4, bVar3 != null ? bVar3 : null, new ZS.b(ExtendedProfileScreen.f90351d, Owners.f210540t, (String) null, 4, (C42822w) null), D5().f149374M.f398526b.a());
        a12.f149236U = this.f149304U0;
        a12.f149237V = this.f149305V0;
        this.f149303T0 = a12;
        com.avito.android.component.toast.util.c cVar4 = this.f149311w0;
        if (cVar4 == null) {
            cVar4 = null;
        }
        cVar4.b(a12);
        com.avito.android.advert_collection_toast.a aVar5 = this.f149294K0;
        if (aVar5 == null) {
            aVar5 = null;
        }
        aVar5.d(view, this);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f149300Q0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
        D5().accept(InterfaceC40265a.B.f395711a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v15, types: [com.avito.android.extended_profile.i] */
    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        Kundle kundle;
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            int i12 = Build.VERSION.SDK_INT;
            ExtendedProfileArguments extendedProfileArguments = (ExtendedProfileArguments) (i12 >= 34 ? (Parcelable) arguments.getParcelable("arguments", ExtendedProfileArguments.class) : arguments.getParcelable("arguments"));
            if (extendedProfileArguments != null) {
                d0 d0Var = this.f149299P0;
                if (d0Var == null) {
                    d0Var = (d0) new P0(this).a(d0.class);
                }
                this.f149299P0 = d0Var;
                if (bundle == null) {
                    d0Var.f149459E = null;
                }
                Bundle bundle2 = d0Var.f149459E;
                Kundle kundleA = bundle2 != null ? com.avito.android.util.G.a(bundle2, "inline_filters_state") : null;
                Bundle bundle3 = d0Var.f149459E;
                if (bundle3 != null && this.f149304U0 == null) {
                    this.f149304U0 = bundle3.getParcelable("extended_profile_beduin_v2_column_state");
                }
                if (bundle3 != null && this.f149305V0 == null) {
                    this.f149305V0 = Integer.valueOf(bundle3.getInt("sticky_item_position"));
                }
                InterfaceC28481c interfaceC28481cB = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b();
                ExtendedProfileScreen extendedProfileScreen = ExtendedProfileScreen.f90351d;
                this.f149300Q0 = interfaceC28481cB.a(new C28478k(extendedProfileScreen, com.avito.android.analytics.screens.s.c(this), null, 4, null));
                cv.d dVarD = cv.c.d(this);
                com.avito.beduin.v2.engine.component.x xVar = new com.avito.beduin.v2.engine.component.x();
                C27106d c27106d = new C27106d();
                InterfaceC30436p.a aVarA = C30397b.a();
                String str = extendedProfileArguments.f149279c;
                if (str == null) {
                    str = "";
                }
                String str2 = str;
                ActivityC22955m activityC22955mL1 = l1();
                Resources resources = getResources();
                FragmentManager childFragmentManager = getChildFragmentManager();
                FragmentManager parentFragmentManager = getParentFragmentManager();
                S0 f42820b = getF42820b();
                InlineFiltersSource inlineFiltersSource = InlineFiltersSource.f170993b;
                Bundle bundle4 = bundle != null ? bundle.getBundle("item_visibility_tracker_state") : null;
                if (bundle != null) {
                    kundle = (Kundle) (i12 >= 34 ? (Parcelable) bundle.getParcelable("commercial_state", Kundle.class) : bundle.getParcelable("commercial_state"));
                } else {
                    kundle = null;
                }
                C44742f c44742f = new C44742f(true, null, new f(dVarD, c27106d, xVar), 2, null);
                com.avito.android.analytics.screens.r rVarC = com.avito.android.analytics.screens.s.c(this);
                f.a aVarG5 = g5();
                H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
                ScreenPerformanceTracker screenPerformanceTracker = this.f149300Q0;
                C31138n0 c31138n0 = new C31138n0(aVarEd.a(screenPerformanceTracker == null ? null : screenPerformanceTracker, new ZS.b(extendedProfileScreen, Owners.f210540t, (String) null, 4, (C42822w) null), dVarD, new D0((com.avito.android.extended_profile_native_widgets_beduin_v2_wrapper.di.c) this.f149307X0.getValue()), com.avito.android.lib.beduin_v2.feature.di.K.f176031b, (144 & 32) != 0 ? new C27106d() : c27106d, (144 & 64) != 0 ? new com.avito.beduin.v2.engine.component.x() : xVar, new ZS.c(false)));
                InterfaceC30437q interfaceC30437q = (InterfaceC30437q) C29972i.a(C29972i.b(this), InterfaceC30437q.class);
                InterfaceC44697a interfaceC44697a = (InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class);
                aVarA.a(extendedProfileArguments.f149278b, str2, extendedProfileArguments.f149281e, extendedProfileArguments.f149280d, extendedProfileArguments.f149282f, activityC22955mL1, this, resources, childFragmentManager, parentFragmentManager, this, f42820b, this, kundleA, new g(), new h(), bundle4, kundle, c44742f, this, extendedProfileScreen, rVarC, aVarG5, new C41343c(xVar, c27106d), new InterfaceC41342b() { // from class: com.avito.android.extended_profile.i
                    @Override // iT.InterfaceC41342b
                    public final InterfaceC41341a invoke() {
                        ExtendedProfileFragment.a aVar = ExtendedProfileFragment.f149283Y0;
                        return this.f150008a.D5();
                    }
                }, c31138n0, interfaceC30437q, interfaceC44697a, dVarD).a(this);
                ScreenPerformanceTracker screenPerformanceTracker2 = this.f149300Q0;
                if (screenPerformanceTracker2 == null) {
                    screenPerformanceTracker2 = null;
                }
                screenPerformanceTracker2.a(fA2.b());
                ScreenPerformanceTracker screenPerformanceTracker3 = this.f149300Q0;
                if (screenPerformanceTracker3 == null) {
                    screenPerformanceTracker3 = null;
                }
                screenPerformanceTracker3.c(this, g5());
                return;
            }
        }
        throw new IllegalArgumentException("Arguments must be specified");
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @Y61.k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF317018D0() {
        return this.f149302S0;
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b y2(@Y61.k Y41.a aVar, @Y61.k com.avito.beduin.v2.engine.D d12, @Y61.k BottomSheetContentPaddings bottomSheetContentPaddings, @Y61.k BottomSheetHeight bottomSheetHeight, @Y61.k BottomSheetModalSize bottomSheetModalSize, @Y61.l LinkedHashMap linkedHashMap) {
        cU.s sVar;
        A a12 = this.f149303T0;
        if (a12 == null || (sVar = a12.f149240Y) == null) {
            return new C28156p(2);
        }
        BaseBeduinHostFragment.DetachedBottomSheet.f104752l0.getClass();
        BaseBeduinHostFragment.DetachedBottomSheet detachedBottomSheetA = BaseBeduinHostFragment.DetachedBottomSheet.a.a(sVar, d12, bottomSheetHeight, bottomSheetContentPaddings, linkedHashMap, aVar);
        detachedBottomSheetA.show(getParentFragmentManager(), "bottom-sheet");
        return new C30445h(detachedBottomSheetA, 1);
    }

    @Override // FV0.d
    public final void close() {
    }

    @Override // FV0.c
    public final Fragment j1() {
        return this;
    }

    @Override // ob.InterfaceC44746j
    public final void A(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
