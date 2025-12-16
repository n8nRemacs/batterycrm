package com.avito.android.profile_settings;

import Eb0.C13470a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_address.y;
import com.avito.android.edit_text_field.v;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.profile_settings.l;
import com.avito.android.profile_settings.q;
import com.avito.android.ui.fragments.TabBaseFragment;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: ProfileSettingsMviFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u00072\u00020\b2\u00020\t:\u0002\f\rB\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\u000e"}, d2 = {"Lcom/avito/android/profile_settings/ProfileSettingsMviFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/profile_settings/l$a;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/edit_text_field/v;", "Lcom/avito/android/edit_address/y;", "Lcom/avito/android/select_field/i;", "Lcom/avito/android/edit_count_field/h;", "Lcom/avito/android/edit_basic_info/l;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "Args", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class ProfileSettingsMviFragment extends TabBaseFragment implements l.a, com.avito.android.ui.fragments.c, v, y, com.avito.android.select_field.i, com.avito.android.edit_count_field.h, com.avito.android.edit_basic_info.l, InterfaceC28477j.b {

    /* renamed from: F0, reason: collision with root package name */
    @Y61.k
    public static final a f228358F0 = new a(null);

    /* renamed from: A0, reason: collision with root package name */
    @Inject
    public com.avito.android.select_field.e f228359A0;

    /* renamed from: B0, reason: collision with root package name */
    @Inject
    public com.avito.android.edit_count_field.d f228360B0;

    /* renamed from: C0, reason: collision with root package name */
    @Inject
    public com.avito.android.edit_basic_info.h f228361C0;

    /* renamed from: D0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f228362D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.l
    public p f228363E0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public q.a f228364t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f228365u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.tab.adapter.c<TabItem> f228366v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public C13470a f228367w0;

    /* renamed from: x0, reason: collision with root package name */
    @Inject
    public com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> f228368x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public com.avito.android.edit_text_field.p f228369y0;

    /* renamed from: z0, reason: collision with root package name */
    @Inject
    public com.avito.android.edit_address.u f228370z0;

    /* compiled from: ProfileSettingsMviFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings/ProfileSettingsMviFragment$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f228376m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.l lVar) {
            super(0);
            this.f228376m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(ProfileSettingsMviFragment.this, this.f228376m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<Fragment> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ProfileSettingsMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f228378l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f228378l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f228378l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f228379l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f228379l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f228379l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f228380l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f228380l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f228380l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ProfileSettingsMviFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/profile_settings/q;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/profile_settings/q;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<C23060r0, q> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final q invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            q.a aVar = ProfileSettingsMviFragment.this.f228364t0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public ProfileSettingsMviFragment() {
        super(0, 1, null);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f228365u0 = new O0(m0.f406844a.b(q.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
    }

    @Override // com.avito.android.edit_address.y
    @Y61.k
    public final com.avito.android.edit_address.u C4() {
        com.avito.android.edit_address.u uVar = this.f228370z0;
        if (uVar != null) {
            return uVar;
        }
        return null;
    }

    @Override // com.avito.android.select_field.i
    @Y61.k
    public final com.avito.android.select_field.e G0() {
        com.avito.android.select_field.e eVar = this.f228359A0;
        if (eVar != null) {
            return eVar;
        }
        return null;
    }

    @Override // com.avito.android.edit_text_field.v
    @Y61.k
    public final com.avito.android.edit_text_field.p S0() {
        com.avito.android.edit_text_field.p pVar = this.f228369y0;
        if (pVar != null) {
            return pVar;
        }
        return null;
    }

    @Override // com.avito.android.edit_count_field.h
    @Y61.k
    public final com.avito.android.edit_count_field.d c4() {
        com.avito.android.edit_count_field.d dVar = this.f228360B0;
        if (dVar != null) {
            return dVar;
        }
        return null;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        List<Fragment> listP = getChildFragmentManager().P();
        ArrayList arrayList = new ArrayList();
        for (Object obj : listP) {
            if (obj instanceof com.avito.android.ui.fragments.c) {
                arrayList.add(obj);
            }
        }
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            if (((com.avito.android.ui.fragments.c) it.next()).i0()) {
                return true;
            }
        }
        return false;
    }

    @Override // com.avito.android.edit_basic_info.l
    @Y61.k
    public final com.avito.android.edit_basic_info.h i4() {
        com.avito.android.edit_basic_info.h hVar = this.f228361C0;
        if (hVar != null) {
            return hVar;
        }
        return null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            Args args = (Args) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key_arguments", Args.class) : arguments.getParcelable("key_arguments"));
            if (args != null) {
                com.avito.android.profile_settings.di.a.a().a(this, getResources(), com.avito.android.analytics.screens.s.c(this), ProfileSettingsScreen.f228382d, args, (InterfaceC29970g) C29972i.a(C29972i.b(this), InterfaceC29970g.class), cv.c.b(this)).a(this);
                if (L.f(args.f228373d, "edit_seller_type_fragment_tag")) {
                    com.avito.android.edit_text_field.p pVar = this.f228369y0;
                    if (pVar == null) {
                        pVar = null;
                    }
                    pVar.b();
                }
                ScreenPerformanceTracker screenPerformanceTracker = this.f228362D0;
                (screenPerformanceTracker != null ? screenPerformanceTracker : null).a(fA2.b());
                return;
            }
        }
        throw new IllegalArgumentException("Arguments must be specified");
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f228362D0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.profile_settings_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f228363E0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        q qVar = (q) this.f228365u0.getValue();
        com.avito.android.lib.deprecated_design.tab.adapter.c<TabItem> cVar = this.f228366v0;
        com.avito.android.lib.deprecated_design.tab.adapter.c<TabItem> cVar2 = cVar != null ? cVar : null;
        C13470a c13470a = this.f228367w0;
        C13470a c13470a2 = c13470a != null ? c13470a : null;
        com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> jVar = this.f228368x0;
        com.avito.android.lib.deprecated_design.tab.adapter.j<TabItem> jVar2 = jVar != null ? jVar : null;
        ScreenPerformanceTracker screenPerformanceTracker = this.f228362D0;
        this.f228363E0 = new p(view, viewLifecycleOwner, qVar, this, cVar2, c13470a2, jVar2, screenPerformanceTracker != null ? screenPerformanceTracker : null);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f228362D0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    /* compiled from: ProfileSettingsMviFragment.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings/ProfileSettingsMviFragment$Args;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Args implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Args> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f228371b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f228372c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f228373d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f228374e;

        /* compiled from: ProfileSettingsMviFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                return new Args(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i12) {
                return new Args[i12];
            }
        }

        public Args(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4) {
            this.f228371b = str;
            this.f228372c = str2;
            this.f228373d = str3;
            this.f228374e = str4;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f228371b);
            parcel.writeString(this.f228372c);
            parcel.writeString(this.f228373d);
            parcel.writeString(this.f228374e);
        }

        public /* synthetic */ Args(String str, String str2, String str3, String str4, int i12, C42822w c42822w) {
            this(str, str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4);
        }
    }
}
