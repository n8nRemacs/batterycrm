package com.avito.android.settings.ui;

import Cd.C13243a;
import Nv0.InterfaceC14616a;
import Y61.k;
import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.InterfaceC27635a0;
import com.avito.android.R;
import com.avito.android.ab_groups.l;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.bottom_navigation.ui.fragment.factory.NavigationState;
import com.avito.android.deep_linking.x;
import com.avito.android.di.C29972i;
import com.avito.android.help_center.InterfaceC30751h;
import com.avito.android.remote.model.Location;
import com.avito.android.settings.i;
import com.avito.android.settings.j;
import com.avito.android.settings.q;
import com.avito.android.suggest_locations.InterfaceC35139d;
import com.avito.android.ui.fragments.TabBaseFragment;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import oW.InterfaceC44697a;
import wN.InterfaceC49541a;
import z1.AbstractC50339a;

/* compiled from: SettingsFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/settings/ui/SettingsFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/settings/q$a;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SettingsFragment extends TabBaseFragment implements q.a, InterfaceC28477j.b {

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.settings.b f280976A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public l f280977B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public InterfaceC35139d f280978C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public Y30.a f280979D0;

    /* renamed from: E0, reason: collision with root package name */
    @Inject
    public YQ.a f280980E0;

    /* renamed from: F0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f280981F0;

    /* renamed from: G0, reason: collision with root package name */
    @Inject
    public x f280982G0;

    /* renamed from: H0, reason: collision with root package name */
    @Inject
    public InterfaceC27635a0 f280983H0;

    /* renamed from: I0, reason: collision with root package name */
    @Inject
    public com.avito.android.replace_main.toast.b f280984I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public com.avito.android.settings.l f280985J0;

    /* renamed from: K0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f280986K0;

    /* renamed from: L0, reason: collision with root package name */
    @k
    public final NavigationState f280987L0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public j f280988t0;

    /* renamed from: u0, reason: collision with root package name */
    @k
    public final O0 f280989u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f280990v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.a f280991w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public InterfaceC30751h f280992x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.webview.l f280993y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public InterfaceC49541a f280994z0;

    /* compiled from: SettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LNv0/a;", "it", "Lkotlin/G0;", "invoke", "(LNv0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.l<InterfaceC14616a, G0> {
        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14616a interfaceC14616a) {
            ((i) SettingsFragment.this.f280989u0.getValue()).accept(interfaceC14616a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f280996l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f280996l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f280996l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Fragment> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SettingsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f280998l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f280998l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f280998l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f280999l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f280999l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f280999l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f281000l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f281000l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f281000l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SettingsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/settings/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/settings/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<i> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final i invoke() {
            j jVar = SettingsFragment.this.f280988t0;
            if (jVar == null) {
                jVar = null;
            }
            return (i) jVar.get();
        }
    }

    public SettingsFragment() {
        super(0, 1, null);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f280989u0 = new O0(m0.f406844a.b(i.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
        this.f280987L0 = new NavigationState(false, null, 2, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    @InterfaceC42830m
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        Location location;
        Bundle extras;
        super.onActivityResult(i12, i13, intent);
        if (i12 == 1 && i13 == -1) {
            if (intent == null || (extras = intent.getExtras()) == null) {
                location = null;
            } else {
                location = (Location) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("location", Location.class) : extras.getParcelable("location"));
            }
            ((i) this.f280989u0.getValue()).accept(new InterfaceC14616a.d(location));
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        return layoutInflater.inflate(R.layout.settings_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        i iVar = (i) this.f280989u0.getValue();
        com.avito.konveyor.adapter.a aVar = this.f280990v0;
        com.avito.konveyor.adapter.a aVar2 = aVar != null ? aVar : null;
        com.avito.konveyor.a aVar3 = this.f280991w0;
        com.avito.konveyor.a aVar4 = aVar3 != null ? aVar3 : null;
        com.avito.android.replace_main.toast.b bVar = this.f280984I0;
        new q(view, this, iVar, this, aVar2, bVar != null ? bVar : null, aVar4);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.settings.di.a.a().a((com.avito.android.settings.di.c) C29972i.a(C29972i.b(this), com.avito.android.settings.di.c.class), (InterfaceC44697a) C29972i.a(C29972i.b(this), InterfaceC44697a.class), cv.c.b(this), getResources(), new a()).a(this);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment
    @k
    /* renamed from: s5, reason: from getter */
    public final NavigationState getF188607M0() {
        return this.f280987L0;
    }
}
