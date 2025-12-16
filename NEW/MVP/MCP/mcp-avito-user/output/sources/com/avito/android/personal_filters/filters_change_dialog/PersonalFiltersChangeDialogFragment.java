package com.avito.android.personal_filters.filters_change_dialog;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.modal.a;
import com.avito.android.personal_filters.filters_change_dialog.ui.PersonalFiltersChangeDialogOpenParams;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import z1.AbstractC50339a;

/* compiled from: PersonalFiltersChangeDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/personal_filters/filters_change_dialog/PersonalFiltersChangeDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class PersonalFiltersChangeDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: h0, reason: collision with root package name */
    @k
    public final C35968w3 f215704h0;

    /* renamed from: i0, reason: collision with root package name */
    @Inject
    public Provider<com.avito.android.personal_filters.filters_change_dialog.g> f215705i0;

    /* renamed from: j0, reason: collision with root package name */
    @k
    public final O0 f215706j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f215707k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f215708l0;

    /* renamed from: m0, reason: collision with root package name */
    @l
    public Button f215709m0;

    /* renamed from: n0, reason: collision with root package name */
    @l
    public com.avito.android.lib.design.modal.a f215710n0;

    /* renamed from: p0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f215703p0 = {m0.f406844a.e(new Y(PersonalFiltersChangeDialogFragment.class, "openParams", "getOpenParams()Lcom/avito/android/personal_filters/filters_change_dialog/ui/PersonalFiltersChangeDialogOpenParams;", 0))};

    /* renamed from: o0, reason: collision with root package name */
    @k
    public static final a f215702o0 = new a(null);

    /* compiled from: PersonalFiltersChangeDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/personal_filters/filters_change_dialog/PersonalFiltersChangeDialogFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_personal-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f215711l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar) {
            super(0);
            this.f215711l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f215711l);
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
            return PersonalFiltersChangeDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ c f215713l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(c cVar) {
            super(0);
            this.f215713l = cVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f215713l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f215714l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f215714l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f215714l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f215715l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f215715l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f215715l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: PersonalFiltersChangeDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/personal_filters/filters_change_dialog/g;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/personal_filters/filters_change_dialog/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<com.avito.android.personal_filters.filters_change_dialog.g> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.personal_filters.filters_change_dialog.g invoke() {
            Provider<com.avito.android.personal_filters.filters_change_dialog.g> provider = PersonalFiltersChangeDialogFragment.this.f215705i0;
            if (provider == null) {
                provider = null;
            }
            return provider.get();
        }
    }

    public PersonalFiltersChangeDialogFragment() {
        super(0, 1, null);
        this.f215704h0 = new C35968w3(this);
        b bVar = new b(new g());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new d(new c()));
        this.f215706j0 = new O0(m0.f406844a.b(com.avito.android.personal_filters.filters_change_dialog.g.class), new e(interfaceC42726CB), bVar, new f(interfaceC42726CB));
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@l Bundle bundle) {
        com.avito.android.personal_filters.filters_change_dialog.di.a.a().a((com.avito.android.personal_filters.filters_change_dialog.di.c) C29972i.a(C29972i.b(this), com.avito.android.personal_filters.filters_change_dialog.di.c.class), cv.c.b(this)).a(this);
    }

    @Override // androidx.fragment.app.DialogFragment
    public final Dialog onCreateDialog(Bundle bundle) {
        PersonalFiltersChangeDialogOpenParams personalFiltersChangeDialogOpenParams = (PersonalFiltersChangeDialogOpenParams) this.f215704h0.getValue(this, f215703p0[0]);
        ContextThemeWrapper contextThemeWrapper = new ContextThemeWrapper(getContext(), R.style.Theme_DesignSystem_Re23);
        a.C5284a c5284a = com.avito.android.lib.design.modal.a.f179704d;
        com.avito.android.personal_filters.filters_change_dialog.c cVar = new com.avito.android.personal_filters.filters_change_dialog.c(personalFiltersChangeDialogOpenParams.f215770b, this, contextThemeWrapper);
        c5284a.getClass();
        com.avito.android.lib.design.modal.a aVarA = a.C5284a.a(contextThemeWrapper, 0, R.style.Re23_Modal_Default, cVar);
        setCancelable(false);
        aVarA.setCanceledOnTouchOutside(false);
        com.avito.android.arch.mvi.android.f.a((com.avito.android.personal_filters.filters_change_dialog.g) this.f215706j0.getValue(), this, Lifecycle.State.f46682e, new com.avito.android.personal_filters.filters_change_dialog.a(1, this, PersonalFiltersChangeDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/personal_filters/filters_change_dialog/mvi/entity/PersonalFiltersChangeDialogOneTimeEvent;)V", 0), new com.avito.android.personal_filters.filters_change_dialog.b(1, this, PersonalFiltersChangeDialogFragment.class, "render", "render(Lcom/avito/android/personal_filters/filters_change_dialog/mvi/entity/PersonalFiltersChangeDialogState;)V", 0));
        this.f215710n0 = aVarA;
        return aVarA;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.lib.design.modal.a aVar = this.f215710n0;
        if (aVar != null) {
            aVar.dismiss();
        }
        this.f215710n0 = null;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDetach() {
        this.f215709m0 = null;
        super.onDetach();
    }
}
