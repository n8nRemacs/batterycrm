package com.avito.android.profile_settings_basic;

import Cd.C13243a;
import Qb0.InterfaceC14878a;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23487e;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_text_field.EditTextFieldFragment;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.profile_settings_basic.BasicProfileSettingsFragment;
import com.avito.android.profile_settings_basic.di.a;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.util.C35966w1;
import cv.InterfaceC39417a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: BasicProfileSettingsFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0005\u0006B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_settings_basic/BasicProfileSettingsFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "BasicProfileSettingsArgs", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class BasicProfileSettingsFragment extends TabBaseFragment implements InterfaceC28477j.b {

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public static final a f228515y0 = new a(null);

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public z f228516t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f228517u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public A f228518v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f228519w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final O0 f228520x0;

    /* compiled from: BasicProfileSettingsFragment.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/profile_settings_basic/BasicProfileSettingsFragment$BasicProfileSettingsArgs;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class BasicProfileSettingsArgs implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<BasicProfileSettingsArgs> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        public final boolean f228521b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f228522c;

        /* compiled from: BasicProfileSettingsFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<BasicProfileSettingsArgs> {
            @Override // android.os.Parcelable.Creator
            public final BasicProfileSettingsArgs createFromParcel(Parcel parcel) {
                return new BasicProfileSettingsArgs(parcel.readInt() != 0, parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final BasicProfileSettingsArgs[] newArray(int i12) {
                return new BasicProfileSettingsArgs[i12];
            }
        }

        public BasicProfileSettingsArgs(boolean z12, @Y61.l String str) {
            this.f228521b = z12;
            this.f228522c = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof BasicProfileSettingsArgs)) {
                return false;
            }
            BasicProfileSettingsArgs basicProfileSettingsArgs = (BasicProfileSettingsArgs) obj;
            return this.f228521b == basicProfileSettingsArgs.f228521b && L.f(this.f228522c, basicProfileSettingsArgs.f228522c);
        }

        public final int hashCode() {
            int iHashCode = Boolean.hashCode(this.f228521b) * 31;
            String str = this.f228522c;
            return iHashCode + (str == null ? 0 : str.hashCode());
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BasicProfileSettingsArgs(withExtraTopPadding=");
            sb2.append(this.f228521b);
            sb2.append(", source=");
            return C22026a.c(sb2, this.f228522c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(this.f228521b ? 1 : 0);
            parcel.writeString(this.f228522c);
        }
    }

    /* compiled from: BasicProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/profile_settings_basic/BasicProfileSettingsFragment$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: BasicProfileSettingsFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile_settings_basic.BasicProfileSettingsFragment$a$a, reason: collision with other inner class name */
        public static final class C6949a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ BasicProfileSettingsArgs f228523l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6949a(BasicProfileSettingsArgs basicProfileSettingsArgs) {
                super(1);
                this.f228523l = basicProfileSettingsArgs;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("arguments", this.f228523l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static BasicProfileSettingsFragment a(@Y61.k BasicProfileSettingsArgs basicProfileSettingsArgs) {
            BasicProfileSettingsFragment basicProfileSettingsFragment = new BasicProfileSettingsFragment();
            C35966w1.a(basicProfileSettingsFragment, -1, new C6949a(basicProfileSettingsArgs));
            return basicProfileSettingsFragment;
        }

        public a() {
        }
    }

    /* compiled from: BasicProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQb0/a;", "it", "Lkotlin/G0;", "invoke", "(LQb0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<InterfaceC14878a, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14878a interfaceC14878a) {
            a aVar = BasicProfileSettingsFragment.f228515y0;
            BasicProfileSettingsFragment.this.D5().accept(interfaceC14878a);
            return G0.f406611a;
        }
    }

    /* compiled from: BasicProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQb0/a;", "it", "Lkotlin/G0;", "invoke", "(LQb0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<InterfaceC14878a, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC14878a interfaceC14878a) {
            a aVar = BasicProfileSettingsFragment.f228515y0;
            BasicProfileSettingsFragment.this.D5().accept(interfaceC14878a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f228526l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.a aVar) {
            super(0);
            this.f228526l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f228526l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BasicProfileSettingsFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f228528l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f228528l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f228528l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f228529l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f228529l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f228529l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f228530l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f228530l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f228530l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BasicProfileSettingsFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/profile_settings_basic/w;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/profile_settings_basic/w;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<w> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final w invoke() {
            z zVar = BasicProfileSettingsFragment.this.f228516t0;
            if (zVar == null) {
                zVar = null;
            }
            return (w) zVar.get();
        }
    }

    public BasicProfileSettingsFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f228520x0 = new O0(m0.f406844a.b(w.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
    }

    public final w D5() {
        return (w) this.f228520x0.getValue();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            BasicProfileSettingsArgs basicProfileSettingsArgs = (BasicProfileSettingsArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("arguments", BasicProfileSettingsArgs.class) : arguments.getParcelable("arguments"));
            if (basicProfileSettingsArgs != null) {
                a.InterfaceC6961a interfaceC6961aA = com.avito.android.profile_settings_basic.di.f.a();
                InterfaceC29970g interfaceC29970g = (InterfaceC29970g) C29972i.a(C29972i.b(this), InterfaceC29970g.class);
                InterfaceC39417a interfaceC39417aB = cv.c.b(this);
                interfaceC6961aA.a(this, getResources(), new b(), com.avito.android.analytics.screens.s.c(this), BasicProfileSettingsScreen.f228532d, basicProfileSettingsArgs.f228522c, getChildFragmentManager(), interfaceC29970g, interfaceC39417aB).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f228519w0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                screenPerformanceTracker.a(fA2.b());
                final int i12 = 0;
                getParentFragmentManager().p0("basic_edit_text_field_result_key", this, new androidx.fragment.app.C(this) { // from class: com.avito.android.profile_settings_basic.p

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ BasicProfileSettingsFragment f228918c;

                    {
                        this.f228918c = this;
                    }

                    @Override // androidx.fragment.app.C
                    public final void k(Bundle bundle2, String str) {
                        BasicProfileSettingsFragment basicProfileSettingsFragment = this.f228918c;
                        switch (i12) {
                            case 0:
                                BasicProfileSettingsFragment.a aVar = BasicProfileSettingsFragment.f228515y0;
                                EditTextFieldFragment.f146886n0.getClass();
                                if (bundle2.getBoolean("edit_text_field_result_has_changed")) {
                                    basicProfileSettingsFragment.D5().accept(InterfaceC14878a.d.f13866b);
                                    break;
                                }
                                break;
                            default:
                                BasicProfileSettingsFragment.a aVar2 = BasicProfileSettingsFragment.f228515y0;
                                String string = bundle2.getString("edit_seller_type_message");
                                basicProfileSettingsFragment.D5().accept(InterfaceC14878a.d.f13866b);
                                basicProfileSettingsFragment.D5().accept(new InterfaceC14878a.c(string));
                                break;
                        }
                    }
                });
                final int i13 = 1;
                getParentFragmentManager().p0("seller_type_changed", this, new androidx.fragment.app.C(this) { // from class: com.avito.android.profile_settings_basic.p

                    /* renamed from: c, reason: collision with root package name */
                    public final /* synthetic */ BasicProfileSettingsFragment f228918c;

                    {
                        this.f228918c = this;
                    }

                    @Override // androidx.fragment.app.C
                    public final void k(Bundle bundle2, String str) {
                        BasicProfileSettingsFragment basicProfileSettingsFragment = this.f228918c;
                        switch (i13) {
                            case 0:
                                BasicProfileSettingsFragment.a aVar = BasicProfileSettingsFragment.f228515y0;
                                EditTextFieldFragment.f146886n0.getClass();
                                if (bundle2.getBoolean("edit_text_field_result_has_changed")) {
                                    basicProfileSettingsFragment.D5().accept(InterfaceC14878a.d.f13866b);
                                    break;
                                }
                                break;
                            default:
                                BasicProfileSettingsFragment.a aVar2 = BasicProfileSettingsFragment.f228515y0;
                                String string = bundle2.getString("edit_seller_type_message");
                                basicProfileSettingsFragment.D5().accept(InterfaceC14878a.d.f13866b);
                                basicProfileSettingsFragment.D5().accept(new InterfaceC14878a.c(string));
                                break;
                        }
                    }
                });
                return;
            }
        }
        throw new IllegalArgumentException("Arguments must be specified");
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f228519w0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.basic_profile_settings_fragment, viewGroup, false);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        com.avito.android.edit_text_field.p pVarS0;
        super.onViewCreated(view, bundle);
        InterfaceC23487e parentFragment = getParentFragment();
        com.avito.android.edit_text_field.v vVar = parentFragment instanceof com.avito.android.edit_text_field.v ? (com.avito.android.edit_text_field.v) parentFragment : null;
        if (vVar == null || (pVarS0 = vVar.S0()) == null) {
            throw new IllegalStateException("Parent fragment does non implement EditTextFieldRouterOwner");
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            BasicProfileSettingsArgs basicProfileSettingsArgs = (BasicProfileSettingsArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("arguments", BasicProfileSettingsArgs.class) : arguments.getParcelable("arguments"));
            if (basicProfileSettingsArgs != null) {
                w wVarD5 = D5();
                InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
                com.avito.konveyor.adapter.d dVar = this.f228517u0;
                com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
                A a12 = this.f228518v0;
                A a13 = a12 != null ? a12 : null;
                c cVar = new c();
                ScreenPerformanceTracker screenPerformanceTracker = this.f228519w0;
                new F(view, wVarD5, viewLifecycleOwner, dVar2, a13, pVarS0, basicProfileSettingsArgs.f228521b, cVar, screenPerformanceTracker != null ? screenPerformanceTracker : null);
                ScreenPerformanceTracker screenPerformanceTracker2 = this.f228519w0;
                (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
                return;
            }
        }
        throw new IllegalArgumentException("Arguments must be specified");
    }
}
