package com.avito.android.beduin.ui.screen;

import Bi.C13150a;
import Bi.C13151b;
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
import com.avito.android.K;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.Z;
import com.avito.android.beduin.ui.screen.fragment.BeduinBaseScreenFragment;
import com.avito.android.di.InterfaceC29971h;
import com.avito.android.error.z;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.P2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47313c;
import qi.InterfaceC47401b;
import z1.AbstractC50339a;

/* compiled from: BeduinScreenRootFragment.kt */
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00030\u00022\u00020\u00042\u00020\u00052\u00020\u0006:\u0001\tB\u0007¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lcom/avito/android/beduin/ui/screen/BeduinScreenRootFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/K;", "Lcom/avito/android/beduin/di/screen/a;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/beduin/ui/screen/b;", "Lcom/avito/android/ui/fragments/c;", "<init>", "()V", "a", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinScreenRootFragment extends BaseFragment implements K<com.avito.android.beduin.di.screen.a>, InterfaceC28477j.b, com.avito.android.beduin.ui.screen.b, com.avito.android.ui.fragments.c {

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public static final a f104071v0;

    /* renamed from: w0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f104072w0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.ui.screen.fragment.f f104073n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public com.avito.android.beduin.ui.screen.g f104074o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public Z f104075p0;

    /* renamed from: q0, reason: collision with root package name */
    @Y61.k
    public final C47313c f104076q0;

    /* renamed from: r0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f104077r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.k
    public final O0 f104078s0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f104079t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final O0 f104080u0;

    /* compiled from: BeduinScreenRootFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/beduin/ui/screen/BeduinScreenRootFragment$a;", "", "<init>", "()V", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinScreenRootFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<P0.c> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13151b(new com.avito.android.beduin.ui.screen.c(BeduinScreenRootFragment.this));
        }
    }

    /* compiled from: BeduinScreenRootFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = BeduinScreenRootFragment.f104071v0;
            ((com.avito.android.beduin.ui.screen.e) BeduinScreenRootFragment.this.f104080u0.getValue()).ke();
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinScreenRootFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0010\u0006\u001a\u00020\u00012\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/util/P2;", "Lkotlin/G0;", "kotlin.jvm.PlatformType", VoiceInfo.STATE, "invoke", "(Lcom/avito/android/util/P2;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<P2<? super G0>, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(P2<? super G0> p22) {
            P2<? super G0> p23 = p22;
            boolean zF2 = L.f(p23, P2.c.f318721a);
            BeduinScreenRootFragment beduinScreenRootFragment = BeduinScreenRootFragment.this;
            if (zF2) {
                com.avito.android.progress_overlay.l lVar = beduinScreenRootFragment.f104077r0;
                if (lVar == null) {
                    lVar = null;
                }
                lVar.k(null);
            } else if (p23 instanceof P2.b) {
                Z z12 = beduinScreenRootFragment.f104075p0;
                if (z12 == null) {
                    z12 = null;
                }
                z12.f();
                com.avito.android.progress_overlay.l lVar2 = beduinScreenRootFragment.f104077r0;
                (lVar2 != null ? lVar2 : null).j();
            } else {
                if (!(p23 instanceof P2.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                Z z13 = beduinScreenRootFragment.f104075p0;
                if (z13 == null) {
                    z13 = null;
                }
                z13.f();
                ApiError apiError = ((P2.a) p23).f318719a;
                com.avito.android.progress_overlay.l lVar3 = beduinScreenRootFragment.f104077r0;
                (lVar3 != null ? lVar3 : null).a(z.k(apiError));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinScreenRootFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<InterfaceC47401b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC47401b interfaceC47401b) {
            InterfaceC47401b interfaceC47401b2 = interfaceC47401b;
            BeduinScreenRootFragment beduinScreenRootFragment = (BeduinScreenRootFragment) this.receiver;
            com.avito.android.beduin.ui.screen.fragment.f fVar = beduinScreenRootFragment.f104073n0;
            if (fVar == null) {
                fVar = null;
            }
            BeduinScreenRootOpenParams beduinScreenRootOpenParams = (BeduinScreenRootOpenParams) beduinScreenRootFragment.f104079t0.getValue(beduinScreenRootFragment, BeduinScreenRootFragment.f104072w0[1]);
            Z z12 = beduinScreenRootFragment.f104075p0;
            if (z12 == null) {
                z12 = null;
            }
            BeduinBaseScreenFragment beduinBaseScreenFragmentA = fVar.a(interfaceC47401b2, beduinScreenRootOpenParams.f104095c, z12.d());
            if (beduinBaseScreenFragmentA == null) {
                ApiError.IncorrectData incorrectDataB = com.avito.android.remote.error.j.b();
                com.avito.android.progress_overlay.l lVar = beduinScreenRootFragment.f104077r0;
                (lVar != null ? lVar : null).a(z.k(incorrectDataB));
            } else {
                androidx.fragment.app.H hE2 = beduinScreenRootFragment.getChildFragmentManager().e();
                hE2.n(R.id.fragment_container, beduinBaseScreenFragmentA, null);
                hE2.e();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: BeduinScreenRootFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class f implements InterfaceC23040h0, D {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ Object f104084b;

        public f(Y41.l lVar) {
            this.f104084b = lVar;
        }

        public final boolean equals(@Y61.l Object obj) {
            if ((obj instanceof InterfaceC23040h0) && (obj instanceof D)) {
                return ((InterfaceC43072x) this.f104084b).equals(((D) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.D
        @Y61.k
        public final InterfaceC43072x<?> getFunctionDelegate() {
            return (InterfaceC43072x) this.f104084b;
        }

        public final int hashCode() {
            return ((InterfaceC43072x) this.f104084b).hashCode();
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [Y41.l, java.lang.Object] */
        @Override // androidx.view.InterfaceC23040h0
        public final /* synthetic */ void onChanged(Object obj) {
            this.f104084b.invoke(obj);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/h0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {
        @Override // Y41.a
        public final P0.c invoke() {
            throw null;
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
            return BeduinScreenRootFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "androidx/fragment/app/j0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f104086l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f104086l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f104086l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/f0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104087l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104087l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f104087l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/g0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104088l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104088l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f104088l.getValue();
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

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "androidx/fragment/app/e0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<Fragment> {
        public m() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return BeduinScreenRootFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "androidx/fragment/app/j0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ m f104090l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(m mVar) {
            super(0);
            this.f104090l = mVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f104090l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/f0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104091l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104091l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f104091l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/g0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f104092l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f104092l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f104092l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: BeduinScreenRootFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<P0.c> {
        public q() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            BeduinScreenRootFragment beduinScreenRootFragment = BeduinScreenRootFragment.this;
            com.avito.android.beduin.ui.screen.g gVar = beduinScreenRootFragment.f104074o0;
            if (gVar == null) {
                gVar = null;
            }
            BeduinScreenRootOpenParams beduinScreenRootOpenParams = (BeduinScreenRootOpenParams) beduinScreenRootFragment.f104079t0.getValue(beduinScreenRootFragment, BeduinScreenRootFragment.f104072w0[1]);
            gVar.getClass();
            return new com.avito.android.beduin.ui.screen.f(gVar, beduinScreenRootOpenParams);
        }
    }

    static {
        Y y12 = new Y(BeduinScreenRootFragment.class, "executeRequestProgressView", "getExecuteRequestProgressView()Landroid/view/View;", 0);
        n0 n0Var = m0.f406844a;
        f104072w0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(BeduinScreenRootFragment.class, "openParams", "getOpenParams()Lcom/avito/android/beduin/ui/screen/BeduinScreenRootOpenParams;", 0, n0Var)};
        f104071v0 = new a(null);
    }

    public BeduinScreenRootFragment() {
        super(0, 1, null);
        this.f104076q0 = new C47313c(null, 1, null);
        b bVar = new b();
        h hVar = new h();
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        InterfaceC42726C interfaceC42726CB = C42727D.b(lazyThreadSafetyMode, new i(hVar));
        n0 n0Var = m0.f406844a;
        this.f104078s0 = new O0(n0Var.b(C13150a.class), new j(interfaceC42726CB), bVar, new k(interfaceC42726CB));
        this.f104079t0 = new C35968w3(this);
        q qVar = new q();
        InterfaceC42726C interfaceC42726CB2 = C42727D.b(lazyThreadSafetyMode, new n(new m()));
        this.f104080u0 = new O0(n0Var.b(com.avito.android.beduin.ui.screen.e.class), new o(interfaceC42726CB2), qVar, new p(interfaceC42726CB2));
    }

    @Override // com.avito.android.beduin.ui.screen.b
    public final void R(boolean z12) {
        C47313c c47313c = this.f104076q0;
        kotlin.reflect.n<Object> nVar = f104072w0[0];
        ((View) c47313c.a()).setVisibility(z12 ? 0 : 8);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // com.avito.android.ui.fragments.c
    public final boolean i0() {
        return com.avito.android.ui.fragments.e.a(this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        View viewInflate = layoutInflater.inflate(R.layout.beduin_screen_root_fragment, viewGroup, false);
        View viewFindViewById = viewInflate.findViewById(R.id.progress_layout);
        C47313c c47313c = this.f104076q0;
        kotlin.reflect.n<Object> nVar = f104072w0[0];
        c47313c.b(this, viewFindViewById);
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewInflate.findViewById(R.id.progress_overlay_container), R.id.fragment_container, null, 0, 0, 28, null);
        this.f104077r0 = lVar;
        lVar.f231600j = new c();
        Z z12 = this.f104075p0;
        if (z12 == null) {
            z12 = null;
        }
        z12.c();
        O0 o02 = this.f104080u0;
        ((com.avito.android.beduin.ui.screen.e) o02.getValue()).f104110K.observe(getViewLifecycleOwner(), new f(new d()));
        ((com.avito.android.beduin.ui.screen.e) o02.getValue()).f104111L.observe(getViewLifecycleOwner(), new f(new e(1, this, BeduinScreenRootFragment.class, "onScreen", "onScreen(Lcom/avito/android/beduin/network/model/screen/BeduinScreenModel;)V", 0)));
        Z z13 = this.f104075p0;
        (z13 != null ? z13 : null).b(fA2.b());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        ((com.avito.android.beduin.di.screen.a) ((C13150a) this.f104078s0.getValue()).f1629E).Bi(this);
        Z z12 = this.f104075p0;
        if (z12 == null) {
            z12 = null;
        }
        z12.a(fA2.b());
    }

    @Override // com.avito.android.K
    public final InterfaceC29971h r0() {
        return (com.avito.android.beduin.di.screen.a) ((C13150a) this.f104078s0.getValue()).f1629E;
    }
}
