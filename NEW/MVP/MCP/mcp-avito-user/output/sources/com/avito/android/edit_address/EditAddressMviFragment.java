package com.avito.android.edit_address;

import Cd.C13243a;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
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
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.di.InterfaceC29970g;
import com.avito.android.edit_address.di.b;
import com.avito.android.edit_address.entity.ExtendedProfilesSettingsAddress;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.K2;
import com.google.common.collect.H1;
import javax.inject.Inject;
import jy.InterfaceC42443a;
import jy.InterfaceC42448f;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: EditAddressMviFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u0006\u0007B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"Lcom/avito/android/edit_address/EditAddressMviFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/ui/fragments/c;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "Args", "a", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EditAddressMviFragment extends BaseFragment implements com.avito.android.ui.fragments.c, InterfaceC28477j.b {

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public static final a f145750u0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public t f145751n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f145752o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public H1 f145753p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f145754q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f145755r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public o f145756s0;

    /* renamed from: t0, reason: collision with root package name */
    public u f145757t0;

    /* compiled from: EditAddressMviFragment.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_address/EditAddressMviFragment$Args;", "Landroid/os/Parcelable;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final class Args implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Args> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f145758b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final ExtendedProfilesSettingsAddress f145759c;

        /* compiled from: EditAddressMviFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Args> {
            @Override // android.os.Parcelable.Creator
            public final Args createFromParcel(Parcel parcel) {
                return new Args(parcel.readString(), parcel.readInt() == 0 ? null : ExtendedProfilesSettingsAddress.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final Args[] newArray(int i12) {
                return new Args[i12];
            }
        }

        public Args(@Y61.k String str, @Y61.l ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress) {
            this.f145758b = str;
            this.f145759c = extendedProfilesSettingsAddress;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f145758b);
            ExtendedProfilesSettingsAddress extendedProfilesSettingsAddress = this.f145759c;
            if (extendedProfilesSettingsAddress == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                extendedProfilesSettingsAddress.writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: EditAddressMviFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/edit_address/EditAddressMviFragment$a;", "", "<init>", "()V", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EditAddressMviFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.l<InterfaceC42443a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC42443a interfaceC42443a) {
            ((s) this.receiver).accept(interfaceC42443a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f145760l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(Y41.a aVar) {
            super(0);
            this.f145760l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f145760l);
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
            return EditAddressMviFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ d f145762l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(d dVar) {
            super(0);
            this.f145762l = dVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f145762l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f145763l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f145763l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f145763l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f145764l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f145764l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f145764l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EditAddressMviFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/edit_address/s;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/edit_address/s;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<s> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final s invoke() {
            t tVar = EditAddressMviFragment.this.f145751n0;
            if (tVar == null) {
                tVar = null;
            }
            return (s) tVar.get();
        }
    }

    public EditAddressMviFragment() {
        super(0, 1, null);
        c cVar = new c(new h());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new e(new d()));
        this.f145752o0 = new O0(m0.f406844a.b(s.class), new f(interfaceC42726CB), cVar, new g(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        u uVar = this.f145757t0;
        if (uVar == null) {
            uVar = null;
        }
        return uVar.c();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onActivityResult(int i12, int i13, @Y61.l Intent intent) {
        Bundle extras;
        if (i13 == -1) {
            if (i12 != 801) {
                super.onActivityResult(i12, i13, intent);
                return;
            }
            if (intent == null || (extras = intent.getExtras()) == null) {
                return;
            }
            AddressParameter.Value value = (AddressParameter.Value) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) extras.getParcelable("EXTRA_ADDRESS_RESULT", AddressParameter.Value.class) : extras.getParcelable("EXTRA_ADDRESS_RESULT"));
            if (value != null) {
                ((s) this.f145752o0.getValue()).accept(new InterfaceC42448f.b(value));
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f145755r0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.ext_profile_address_edit_fragment, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        o oVar = this.f145756s0;
        if (oVar != null) {
            oVar.f145984j.dispose();
            K2.d(oVar.f145975a, true);
        }
        this.f145756s0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        u uVarC4;
        super.onViewCreated(view, bundle);
        InterfaceC23487e parentFragment = getParentFragment();
        y yVar = parentFragment instanceof y ? (y) parentFragment : null;
        if (yVar == null || (uVarC4 = yVar.C4()) == null) {
            throw new IllegalStateException("Parent fragment must implement EditAddressRouterOwner!");
        }
        this.f145757t0 = uVarC4;
        O0 o02 = this.f145752o0;
        s sVar = (s) o02.getValue();
        u uVar = this.f145757t0;
        u uVar2 = uVar == null ? null : uVar;
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        com.avito.konveyor.adapter.d dVar = this.f145754q0;
        com.avito.konveyor.adapter.d dVar2 = dVar != null ? dVar : null;
        b bVar = new b(1, (s) o02.getValue(), s.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        ScreenPerformanceTracker screenPerformanceTracker = this.f145755r0;
        ScreenPerformanceTracker screenPerformanceTracker2 = screenPerformanceTracker != null ? screenPerformanceTracker : null;
        H1 h12 = this.f145753p0;
        this.f145756s0 = new o(view, this, sVar, uVar2, viewLifecycleOwner, dVar2, bVar, screenPerformanceTracker2, h12 != null ? h12 : null);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f145755r0;
        (screenPerformanceTracker3 != null ? screenPerformanceTracker3 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle arguments = getArguments();
        if (arguments != null) {
            Args args = (Args) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("key_arguments", Args.class) : arguments.getParcelable("key_arguments"));
            if (args != null) {
                b.a aVarA = com.avito.android.edit_address.di.a.a();
                Resources resources = getResources();
                C28478k c28478k = new C28478k(ProfileManagementEditAddressScreen.f145766d, com.avito.android.analytics.screens.s.c(this), null, 4, null);
                aVarA.a(this, args.f145758b, args.f145759c, resources, bundle != null, c28478k, (InterfaceC29970g) C29972i.a(C29972i.b(this), InterfaceC29970g.class)).a(this);
                ScreenPerformanceTracker screenPerformanceTracker = this.f145755r0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                screenPerformanceTracker.a(fA2.b());
                return;
            }
        }
        throw new IllegalArgumentException("Arguments must be specified");
    }
}
