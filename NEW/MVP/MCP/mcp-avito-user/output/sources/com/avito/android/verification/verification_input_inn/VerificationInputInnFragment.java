package com.avito.android.verification.verification_input_inn;

import Zp0.InterfaceC19587b;
import Zp0.InterfaceC19588c;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.select.Arguments;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.verification.inn.list.select.SelectItem;
import com.avito.android.verification.verification_input_inn.l;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import yM0.C50132a;
import yM0.C50133b;
import z1.AbstractC50339a;

/* compiled from: VerificationInputInnFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_input_inn/VerificationInputInnFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationInputInnFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.select.p {

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public static final a f325594s0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public v f325595n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f325596o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public com.avito.android.verification.inn.d f325597p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final O0 f325598q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final c f325599r0;

    /* compiled from: VerificationInputInnFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_input_inn/VerificationInputInnFragment$a;", "", "<init>", "()V", "", "KEY_VERIFICATION_INPUT_INN_ARGS", "Ljava/lang/String;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationInputInnFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            VerificationInputInnFragment verificationInputInnFragment = VerificationInputInnFragment.this;
            Bundle bundleRequireArguments = verificationInputInnFragment.requireArguments();
            return new C50133b(new com.avito.android.verification.verification_input_inn.c(verificationInputInnFragment, (VerificationInputInnArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key.verification_input_inn_args", VerificationInputInnArgs.class) : bundleRequireArguments.getParcelable("key.verification_input_inn_args"))));
        }
    }

    /* compiled from: VerificationInputInnFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/verification/verification_input_inn/VerificationInputInnFragment$d", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends com.avito.android.deeplink_handler.view.impl.k {
        public d(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            return (ViewGroup) VerificationInputInnFragment.this.requireView().findViewById(R.id.appbar_container);
        }
    }

    /* compiled from: VerificationInputInnFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            VerificationInputInnFragment verificationInputInnFragment = VerificationInputInnFragment.this;
            v vVar = verificationInputInnFragment.f325595n0;
            if (vVar == null) {
                vVar = null;
            }
            com.avito.android.verification.verification_input_inn.l value = vVar.o0().getValue();
            l.b bVar = value instanceof l.b ? (l.b) value : null;
            com.avito.android.verification.verification_input_inn.k kVar = bVar != null ? bVar.f325628a : null;
            if (kVar == null || !kVar.f325626c) {
                verificationInputInnFragment.requireActivity().onBackPressed();
            } else {
                verificationInputInnFragment.requireActivity().finish();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationInputInnFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000e\u0010\u0002\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/verification/verification_input_inn/l;", "kotlin.jvm.PlatformType", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/verification/verification_input_inn/l;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<com.avito.android.verification.verification_input_inn.l, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.verification.verification_input_inn.l lVar) {
            com.avito.android.verification.verification_input_inn.l lVar2 = lVar;
            VerificationInputInnFragment.this.f325599r0.d((lVar2 instanceof l.b) && ((l.b) lVar2).f325628a.f325626c);
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationInputInnFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class g implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Y41.l f325604b;

        public g(Y41.l lVar) {
            this.f325604b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return L.f(this.f325604b, ((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f325604b;
        }

        public final int hashCode() {
            return this.f325604b.hashCode();
        }

        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f325604b.invoke(obj);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/e0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VerificationInputInnFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "androidx/fragment/app/j0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f325606l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f325606l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f325606l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/f0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325607l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325607l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f325607l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/g0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f325608l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f325608l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f325608l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/h0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<P0.c> {
        @Override // Y41.a
        public final P0.c invoke() {
            throw null;
        }
    }

    public VerificationInputInnFragment() {
        super(0, 1, null);
        b bVar = new b();
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f325598q0 = new O0(m0.f406844a.b(C50132a.class), new j(interfaceC42726CB), bVar, new k(interfaceC42726CB));
        this.f325599r0 = new c();
    }

    @Override // com.avito.android.select.p
    @Y61.l
    public final InterfaceC19588c<? super InterfaceC19587b> E4(@Y61.k Arguments arguments) {
        return null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.i f5() {
        ActivityC22955m activityC22955mRequireActivity = requireActivity();
        ToastBarPosition toastBarPosition = ToastBarPosition.f181044b;
        return new d(activityC22955mRequireActivity);
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        com.avito.android.verification.inn.d dVar = this.f325597p0;
        if (dVar == null) {
            dVar = null;
        }
        com.avito.android.verification.inn.b bVar = dVar.f323884b;
        Iterable<com.avito.conveyor_item.a> iterable = (Iterable) bVar.f323880g;
        ArrayList arrayList = new ArrayList(C42745f0.q(iterable, 10));
        for (com.avito.conveyor_item.a aVarL : iterable) {
            if (L.f(aVarL.getF294787b(), str) && (aVarL instanceof SelectItem)) {
                aVarL = SelectItem.L((SelectItem) aVarL, null, null, (ParcelableEntity) C42745f0.E(list), 32503);
            }
            arrayList.add(aVarL);
        }
        bVar.f(null, arrayList);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f325596o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return layoutInflater.inflate(R.layout.fragment_verification_input_inn, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        requireActivity().getF21241d().a(getViewLifecycleOwner(), this.f325599r0);
        v vVar = this.f325595n0;
        v vVar2 = vVar != null ? vVar : null;
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        com.avito.android.verification.inn.d dVar = this.f325597p0;
        if (dVar == null) {
            dVar = null;
        }
        p pVar = new p(view, dVar.f323883a, vVar2, new e(), viewLifecycleOwner);
        com.avito.android.verification.inn.d dVar2 = this.f325597p0;
        if (dVar2 == null) {
            dVar2 = null;
        }
        dVar2.a(this, pVar.f325637c);
        v vVar3 = this.f325595n0;
        if (vVar3 == null) {
            vVar3 = null;
        }
        vVar3.o0().observe(getViewLifecycleOwner(), new g(new f()));
        ScreenPerformanceTracker screenPerformanceTracker = this.f325596o0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        ((com.avito.android.verification.di.input_inn.b) ((C50132a) this.f325598q0.getValue()).f443048E).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f325596o0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    /* compiled from: VerificationInputInnFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/verification/verification_input_inn/VerificationInputInnFragment$c", "Landroidx/activity/x;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends androidx.view.x {
        public c() {
            super(false);
        }

        @Override // androidx.view.x
        public final void c() {
        }
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
