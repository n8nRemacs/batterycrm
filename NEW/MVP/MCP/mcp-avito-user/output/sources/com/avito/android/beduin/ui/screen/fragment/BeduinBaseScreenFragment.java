package com.avito.android.beduin.ui.screen.fragment;

import Bi.C13150a;
import Bi.C13151b;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC23040h0;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.beduin.ui.screen.fragment.i;
import com.avito.android.beduin.ui.screen.perf.BaseBeduinScreen;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.InterfaceC35845m2;
import gF.InterfaceC40577a;
import ij.C41414a;
import j.I;
import j.InterfaceC42153i;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import md.InterfaceC44055a;
import qi.InterfaceC47401b;
import z1.AbstractC50339a;
import zi.C50569a;

/* compiled from: BeduinBaseScreenFragment.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b&\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u00032\b\u0012\u0004\u0012\u00020\u00050\u00042\u00020\u00062\u00020\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/BeduinBaseScreenFragment;", "Lcom/avito/android/beduin/ui/screen/fragment/i;", "S", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lmd/a;", "Lcom/avito/android/beduin/di/screen/b;", "Lcom/avito/android/analytics/screens/j$b;", "Lgj/i;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class BeduinBaseScreenFragment<S extends com.avito.android.beduin.ui.screen.fragment.i> extends BaseFragment implements InterfaceC44055a<com.avito.android.beduin.di.screen.b>, InterfaceC28477j.b, gj.i {

    /* renamed from: z0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f104118z0 = {m0.f406844a.e(new Y(BeduinBaseScreenFragment.class, "openParams", "getOpenParams()Lcom/avito/android/beduin/ui/screen/fragment/BeduinScreenOpenParams;", 0))};

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public o f104119n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public InterfaceC40577a f104120o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public InterfaceC35845m2 f104121p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f104122q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public C50569a f104123r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public gj.n f104124s0;

    /* renamed from: t0, reason: collision with root package name */
    public gj.k f104125t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final F f104126u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final O0 f104127v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f104128w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final O0 f104129x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f104130y0;

    /* compiled from: BeduinBaseScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/i;", "S", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinBaseScreenFragment<S> f104131l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(BeduinBaseScreenFragment<S> beduinBaseScreenFragment) {
            super(0);
            this.f104131l = beduinBaseScreenFragment;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            BeduinBaseScreenFragment<S> beduinBaseScreenFragment = this.f104131l;
            o oVar = beduinBaseScreenFragment.f104119n0;
            if (oVar == null) {
                oVar = null;
            }
            return oVar.a(beduinBaseScreenFragment.r5(), beduinBaseScreenFragment.s5());
        }
    }

    /* compiled from: BeduinBaseScreenFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u0002\"\b\b\u0000\u0010\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/fragment/i;", "S", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ BeduinBaseScreenFragment<S> f104132l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(BeduinBaseScreenFragment<S> beduinBaseScreenFragment) {
            super(0);
            this.f104132l = beduinBaseScreenFragment;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13151b(new com.avito.android.beduin.ui.screen.fragment.a(this.f104132l));
        }
    }

    /* compiled from: BeduinBaseScreenFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ N f104133b;

        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l lVar) {
            this.f104133b = (N) lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return this.f104133b.equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return this.f104133b;
        }

        public final int hashCode() {
            return this.f104133b.hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f104133b.invoke(obj);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/h0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {
        @Override // Y41.a
        public final P0.c invoke() {
            throw null;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/e0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BeduinBaseScreenFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "androidx/fragment/app/j0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f104135l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f104135l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f104135l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/f0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104136l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104136l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f104136l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/g0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104137l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104137l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f104137l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/h0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {
        @Override // Y41.a
        public final P0.c invoke() {
            throw null;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/e0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BeduinBaseScreenFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "androidx/fragment/app/j0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f104139l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f104139l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f104139l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/f0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104140l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104140l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f104140l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/g0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104141l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104141l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f104141l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    public BeduinBaseScreenFragment() {
        this(0, 1, null);
    }

    @Override // gj.i
    @Y61.l
    public final View b3(@Y61.k String str) {
        return B0(str);
    }

    @Override // gj.i
    @Y61.l
    public gj.o c1() {
        return null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final a.InterfaceC4053a d5() {
        return new C41414a(this);
    }

    public void i2() {
        t0();
    }

    @Override // gj.i
    @Y61.k
    public String m0() {
        return "main";
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @InterfaceC42153i
    @Y61.k
    public Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_Avito_Beduin));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r0v10 */
    /* JADX WARN: Type inference failed for: r0v4, types: [com.avito.android.beduin.ui.screen.a] */
    /* JADX WARN: Type inference failed for: r0v6 */
    /* JADX WARN: Type inference failed for: r0v9 */
    public final void o8() {
        ?? parentFragment = getParentFragment();
        while (true) {
            if (parentFragment == 0) {
                androidx.core.content.j jVarL1 = l1();
                if (!(jVarL1 instanceof com.avito.android.beduin.ui.screen.a)) {
                    jVarL1 = null;
                }
                parentFragment = (com.avito.android.beduin.ui.screen.a) jVarL1;
            } else if (parentFragment instanceof com.avito.android.beduin.ui.screen.a) {
                break;
            } else {
                parentFragment = parentFragment.getParentFragment();
            }
        }
        ((com.avito.android.beduin.ui.screen.a) parentFragment).e4();
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(@Y61.k Context context) {
        super.onAttach(context);
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        t5((com.avito.android.beduin.di.screen.b) ((C13150a) this.f104127v0.getValue()).f1629E);
        C50569a c50569a = this.f104123r0;
        if (c50569a == null) {
            c50569a = null;
        }
        c50569a.a(fA2.b());
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        this.f104126u0.c();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroyView() {
        super.onDestroyView();
        this.f104128w0.e();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [androidx.fragment.app.Fragment] */
    /* JADX WARN: Type inference failed for: r1v14 */
    /* JADX WARN: Type inference failed for: r1v15 */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.avito.android.beduin.ui.screen.b] */
    /* JADX WARN: Type inference failed for: r1v6 */
    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        gj.n nVar = this.f104124s0;
        if (nVar == null) {
            nVar = null;
        }
        this.f104125t0 = gj.m.a(nVar, this);
        com.avito.android.beduin.ui.screen.fragment.k<InterfaceC47401b, S> kVarQ5 = q5();
        ?? parentFragment = getParentFragment();
        while (true) {
            if (parentFragment == 0) {
                androidx.core.content.j jVarL1 = l1();
                if (!(jVarL1 instanceof com.avito.android.beduin.ui.screen.b)) {
                    jVarL1 = null;
                }
                parentFragment = (com.avito.android.beduin.ui.screen.b) jVarL1;
            } else if (parentFragment instanceof com.avito.android.beduin.ui.screen.b) {
                break;
            } else {
                parentFragment = parentFragment.getParentFragment();
            }
        }
        kVarQ5.f104257O.observe(getViewLifecycleOwner(), new c(new com.avito.android.beduin.ui.screen.fragment.c((com.avito.android.beduin.ui.screen.b) parentFragment)));
        kVarQ5.f104255M.observe(getViewLifecycleOwner(), new c(new com.avito.android.beduin.ui.screen.fragment.d(this)));
        kVarQ5.f104253K.observe(getViewLifecycleOwner(), new com.avito.android.beduin.ui.screen.fragment.b(this));
        if (bundle == null) {
            C50569a c50569a = this.f104123r0;
            if (c50569a == null) {
                c50569a = null;
            }
            BeduinScreenOpenParams beduinScreenOpenParamsS5 = s5();
            BeduinScreenOpenParams beduinScreenOpenParamsS52 = s5();
            r rVarC = s.c(this);
            c50569a.getClass();
            c50569a.f444172a.b(beduinScreenOpenParamsS52.f104145e, new BaseBeduinScreen(beduinScreenOpenParamsS5.f104143c), rVarC);
        }
        C50569a c50569a2 = this.f104123r0;
        if (c50569a2 == null) {
            c50569a2 = null;
        }
        c50569a2.t(this.f104126u0.b());
        gj.k kVar = this.f104125t0;
        (kVar != null ? kVar : null).l(q5().f104251E.f104269d);
    }

    @Y61.k
    public com.avito.android.beduin.ui.screen.fragment.k<InterfaceC47401b, S> q5() {
        return (com.avito.android.beduin.ui.screen.fragment.k) this.f104129x0.getValue();
    }

    @Override // md.InterfaceC44055a
    public final com.avito.android.beduin.di.screen.b r0() {
        return (com.avito.android.beduin.di.screen.b) ((C13150a) this.f104127v0.getValue()).f1629E;
    }

    @Y61.k
    public abstract Class<? extends InterfaceC47401b> r5();

    @Y61.k
    public final BeduinScreenOpenParams s5() {
        return (BeduinScreenOpenParams) this.f104130y0.getValue(this, f104118z0[0]);
    }

    @Override // gj.i
    public void t0() {
        o8();
    }

    public void t5(@Y61.k com.avito.android.beduin.di.screen.b bVar) {
        bVar.c(this);
    }

    public abstract void u5(@Y61.l S s5, @Y61.k S s12);

    public /* synthetic */ BeduinBaseScreenFragment(int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? 0 : i12);
    }

    public BeduinBaseScreenFragment(@I int i12) {
        super(i12);
        new com.avito.android.analytics.screens.D();
        this.f104126u0 = new F();
        b bVar = new b(this);
        e eVar = new e();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new f(eVar));
        n0 n0Var = m0.f406844a;
        this.f104127v0 = new O0(n0Var.b(C13150a.class), new g(interfaceC42726CB), bVar, new h(interfaceC42726CB));
        this.f104128w0 = new io.reactivex.rxjava3.disposables.c();
        a aVar = new a(this);
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new k(new j()));
        this.f104129x0 = new O0(n0Var.b(com.avito.android.beduin.ui.screen.fragment.k.class), new l(interfaceC42726CB2), aVar, new m(interfaceC42726CB2));
        this.f104130y0 = new C35968w3(this);
    }
}
