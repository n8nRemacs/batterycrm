package com.avito.android.passport.profile_add.create_flow.select_vertical;

import Cd.C13243a;
import U50.a;
import U50.b;
import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.r;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.deep_linking.links.DetailsSheetLink;
import com.avito.android.deep_linking.links.DetailsSheetLinkBody;
import com.avito.android.deep_linking.links.PassportAddProfileLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.extended_profile_ui_components.p;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.passport.profile_add.ProfileCreateExtendedFlow;
import com.avito.android.passport.profile_add.analytics.AnalyticScreen;
import com.avito.android.passport.profile_add.create_flow.ExtendedProfileCreationResult;
import com.avito.android.passport.profile_add.create_flow.host.Navigation;
import com.avito.android.passport.profile_add.create_flow.select_vertical.di.b;
import com.avito.android.passport.profile_add.create_flow.select_vertical.recycler.D;
import com.avito.android.passport.profile_add.perf_const.SelectVerticalScreen;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import cv.InterfaceC39417a;
import java.io.Serializable;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.Z1;
import qK0.C47313c;
import z1.AbstractC50339a;

/* compiled from: SelectVerticalFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/SelectVerticalFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class SelectVerticalFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public static final a f211812E0;

    /* renamed from: F0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f211813F0;

    /* renamed from: A0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211814A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211815B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211816C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211817D0;

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public o f211818n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f211819o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f211820p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f211821q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f211822r0;

    /* renamed from: s0, reason: collision with root package name */
    @Inject
    public D f211823s0;

    /* renamed from: t0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f211824t0;

    /* renamed from: u0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.architecture_components.D<Navigation> f211825u0;

    /* renamed from: v0, reason: collision with root package name */
    @Inject
    public com.avito.android.util.text.a f211826v0;

    /* renamed from: w0, reason: collision with root package name */
    @Inject
    public G50.a f211827w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final O0 f211828x0;

    /* renamed from: y0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f211829y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final C47313c f211830z0;

    /* compiled from: SelectVerticalFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/SelectVerticalFragment$a;", "", "<init>", "()V", "", "ARGS_SELECT_VERTICAL", "Ljava/lang/String;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SelectVerticalFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/passport/profile_add/create_flow/select_vertical/SelectVerticalArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<SelectVerticalArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final SelectVerticalArguments invoke() {
            Bundle bundleRequireArguments = SelectVerticalFragment.this.requireArguments();
            return (SelectVerticalArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("passport.add_profile.select_vertical.select_vertical_args", SelectVerticalArguments.class) : bundleRequireArguments.getParcelable("passport.add_profile.select_vertical.select_vertical_args"));
        }
    }

    /* compiled from: SelectVerticalFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<U50.b, G0> {
        @Override // Y41.l
        public final G0 invoke(U50.b bVar) {
            U50.b bVar2 = bVar;
            SelectVerticalFragment selectVerticalFragment = (SelectVerticalFragment) this.receiver;
            a aVar = SelectVerticalFragment.f211812E0;
            selectVerticalFragment.getClass();
            if (bVar2 instanceof b.d) {
                p pVar = p.f153373a;
                RecyclerView recyclerViewS5 = selectVerticalFragment.s5();
                b.d dVar = (b.d) bVar2;
                ScreenPerformanceTracker screenPerformanceTracker = selectVerticalFragment.f211820p0;
                if (screenPerformanceTracker == null) {
                    screenPerformanceTracker = null;
                }
                p.c(pVar, recyclerViewS5, dVar.f16190a, screenPerformanceTracker, null);
            } else if (bVar2 instanceof b.c) {
                com.avito.android.deeplink_handler.handler.composite.a aVar2 = selectVerticalFragment.f211824t0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                b.a.a(aVar2, new DetailsSheetLink(new DetailsSheetLinkBody(null, null, null, null, ((b.c) bVar2).f16189a, null, null, null, null, null, null, null, null, null, null, null, null, false, null, 524271, null), null, 2, null), null, null, 6);
            } else if (bVar2 instanceof b.a) {
                Navigation navigation2 = ((b.a) bVar2).f16187a;
                if (navigation2 instanceof Navigation.Close) {
                    ExtendedProfileCreationResult extendedProfileCreationResult = ((Navigation.Close) navigation2).f211368c;
                    if (extendedProfileCreationResult instanceof ExtendedProfileCreationResult.Success) {
                        G50.a aVar3 = selectVerticalFragment.f211827w0;
                        if (aVar3 == null) {
                            aVar3 = null;
                        }
                        PrintableText printableTextC = ((ExtendedProfileCreationResult.Success) extendedProfileCreationResult).f211336c;
                        if (printableTextC == null) {
                            printableTextC = com.avito.android.printable_text.b.c(R.string.passport_lib_public_profile_create_finish_success_toast, new Serializable[0]);
                        }
                        aVar3.a(printableTextC, m0.f406844a.b(PassportAddProfileLink.class));
                    }
                }
                com.avito.android.util.architecture_components.D<Navigation> d12 = selectVerticalFragment.f211825u0;
                (d12 != null ? d12 : null).setValue(navigation2);
            } else if (bVar2 instanceof b.C1101b) {
                com.avito.android.deeplink_handler.handler.composite.a aVar4 = selectVerticalFragment.f211824t0;
                if (aVar4 == null) {
                    aVar4 = null;
                }
                b.a.a(aVar4, ((b.C1101b) bVar2).f16188a, null, null, 6);
            } else if (bVar2 instanceof b.e) {
                com.avito.android.util.text.a aVar5 = selectVerticalFragment.f211826v0;
                if (aVar5 == null) {
                    aVar5 = null;
                }
                Context contextRequireContext = selectVerticalFragment.requireContext();
                ((b.e) bVar2).getClass();
                CharSequence charSequenceC = aVar5.c(contextRequireContext, null);
                if (charSequenceC != null && charSequenceC.length() != 0) {
                    com.avito.android.component.toast.c.c(com.avito.android.component.toast.c.f125244a, selectVerticalFragment, com.avito.android.printable_text.b.e(charSequenceC), null, null, null, 0, null, 1022);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectVerticalFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU50/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LU50/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<U50.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(U50.c cVar) {
            U50.c cVar2 = cVar;
            a aVar = SelectVerticalFragment.f211812E0;
            SelectVerticalFragment selectVerticalFragment = SelectVerticalFragment.this;
            com.avito.android.passport.profile_add.create_flow.select_vertical.d dVar = new com.avito.android.passport.profile_add.create_flow.select_vertical.d(1, selectVerticalFragment.t5(), com.avito.android.passport.profile_add.create_flow.select_vertical.n.class, "accept", "accept(Ljava/lang/Object;)V", 0);
            RecyclerView recyclerViewS5 = selectVerticalFragment.s5();
            List<com.avito.conveyor_item.a> list = cVar2.f16196e;
            boolean z12 = false;
            D6.G(recyclerViewS5, list != null);
            D6.G(selectVerticalFragment.r5(), list != null);
            C47313c c47313c = selectVerticalFragment.f211815B0;
            kotlin.reflect.n<Object>[] nVarArr = SelectVerticalFragment.f211813F0;
            kotlin.reflect.n<Object> nVar = nVarArr[2];
            TextView textView = (TextView) c47313c.a();
            Throwable th2 = cVar2.f16201j;
            if (th2 == null && (((SelectVerticalArguments) selectVerticalFragment.f211829y0.getValue()).f211807c instanceof ProfileCreateExtendedFlow.Passport.Create)) {
                z12 = true;
            }
            D6.G(textView, z12);
            if (list != null) {
                com.avito.konveyor.adapter.a aVar2 = selectVerticalFragment.f211822r0;
                if (aVar2 == null) {
                    aVar2 = null;
                }
                com.avito.android.authorization.auto_recovery.phone_confirm.b.p(aVar2, list);
                if (cVar2.f16199h) {
                    selectVerticalFragment.s5().F0(list.size() - 1);
                }
                dVar.invoke(a.e.f16184a);
            }
            if (selectVerticalFragment.r5().getVisibility() == 0) {
                Button buttonR5 = selectVerticalFragment.r5();
                boolean z13 = cVar2.f16202k;
                buttonR5.setLoading(z13);
                selectVerticalFragment.r5().setClickable(!z13);
            }
            boolean z14 = cVar2.f16200i;
            C47313c c47313c2 = selectVerticalFragment.f211817D0;
            if (z14) {
                kotlin.reflect.n<Object> nVar2 = nVarArr[4];
                ((com.avito.android.extended_profile_ui_components.l) c47313c2.a()).d();
            } else if (th2 != null) {
                kotlin.reflect.n<Object> nVar3 = nVarArr[4];
                com.avito.android.extended_profile_ui_components.l lVar = (com.avito.android.extended_profile_ui_components.l) c47313c2.a();
                ScreenPerformanceTracker screenPerformanceTracker = selectVerticalFragment.f211820p0;
                lVar.c(th2, screenPerformanceTracker != null ? screenPerformanceTracker : null);
            } else {
                kotlin.reflect.n<Object> nVar4 = nVarArr[4];
                ((com.avito.android.extended_profile_ui_components.l) c47313c2.a()).a();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: SelectVerticalFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU50/a;", "it", "Lkotlin/G0;", "invoke", "(LU50/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<U50.a, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(U50.a aVar) {
            a aVar2 = SelectVerticalFragment.f211812E0;
            SelectVerticalFragment.this.t5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "androidx/fragment/app/U", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<S0> {
        public f() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return SelectVerticalFragment.this.requireActivity().getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "androidx/fragment/app/V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<AbstractC50339a> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final AbstractC50339a invoke() {
            return SelectVerticalFragment.this.requireActivity().getDefaultViewModelCreationExtras();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "androidx/fragment/app/W", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<P0.c> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return SelectVerticalFragment.this.requireActivity().getDefaultViewModelProviderFactory();
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f211837l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f211837l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f211837l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return SelectVerticalFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f211839l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f211839l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f211839l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f211840l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f211840l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f211840l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f211841l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f211841l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f211841l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: SelectVerticalFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/n;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/passport/profile_add/create_flow/select_vertical/n;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<com.avito.android.passport.profile_add.create_flow.select_vertical.n> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.passport.profile_add.create_flow.select_vertical.n invoke() {
            o oVar = SelectVerticalFragment.this.f211818n0;
            if (oVar == null) {
                oVar = null;
            }
            return (com.avito.android.passport.profile_add.create_flow.select_vertical.n) oVar.get();
        }
    }

    static {
        Y y12 = new Y(SelectVerticalFragment.class, "recyclerView", "getRecyclerView()Landroidx/recyclerview/widget/RecyclerView;", 0);
        n0 n0Var = m0.f406844a;
        f211813F0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(SelectVerticalFragment.class, "continueButton", "getContinueButton()Lcom/avito/android/lib/design/button/Button;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SelectVerticalFragment.class, "legalsTextView", "getLegalsTextView()Landroid/widget/TextView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SelectVerticalFragment.class, "appBar", "getAppBar()Lru/avito/component/appbar/AppBar;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(SelectVerticalFragment.class, "errorAndProgressView", "getErrorAndProgressView()Lcom/avito/android/extended_profile_ui_components/ErrorAndProgressViewRedesign;", 0, n0Var)};
        f211812E0 = new a(null);
    }

    public SelectVerticalFragment() {
        super(R.layout.passport_create_profile_select_vertical_fragment);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        n0 n0Var = m0.f406844a;
        this.f211819o0 = new O0(n0Var.b(com.avito.android.passport.profile_add.create_flow.select_vertical.n.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f211828x0 = new O0(n0Var.b(com.avito.android.passport.profile_add.f.class), new f(), new h(), new g());
        this.f211829y0 = C42727D.c(new b());
        this.f211830z0 = new C47313c(null, 1, null);
        this.f211814A0 = new C47313c(null, 1, null);
        this.f211815B0 = new C47313c(null, 1, null);
        this.f211816C0 = new C47313c(null, 1, null);
        this.f211817D0 = new C47313c(null, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f211820p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f211820p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, t5(), new c(1, this, SelectVerticalFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/passport/profile_add/create_flow/select_vertical/mvi/entity/SelectVerticalOneTimeEvent;)V", 0), new d());
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        M81.c cVar = new M81.c(view, null, false, 4, null);
        C47313c c47313c = this.f211816C0;
        kotlin.reflect.n<Object>[] nVarArr = f211813F0;
        kotlin.reflect.n<Object> nVar = nVarArr[3];
        c47313c.b(this, cVar);
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.select_verticals_recycler);
        C47313c c47313c2 = this.f211830z0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[0];
        c47313c2.b(this, recyclerView);
        Button button = (Button) view.findViewById(R.id.select_verticals_continue_button);
        C47313c c47313c3 = this.f211814A0;
        kotlin.reflect.n<Object> nVar3 = nVarArr[1];
        c47313c3.b(this, button);
        TextView textView = (TextView) view.findViewById(R.id.legals_text_view);
        C47313c c47313c4 = this.f211815B0;
        kotlin.reflect.n<Object> nVar4 = nVarArr[2];
        c47313c4.b(this, textView);
        InterfaceC42726C interfaceC42726C = this.f211829y0;
        if (((SelectVerticalArguments) interfaceC42726C.getValue()).f211809e) {
            r5().setText(R.string.passport_add_profile_select_vertical_continue_only_select);
        } else {
            r5().setText(R.string.passport_add_profile_select_vertical_continue);
        }
        com.avito.android.extended_profile_ui_components.l lVar = new com.avito.android.extended_profile_ui_components.l(new com.avito.android.passport.profile_add.create_flow.select_vertical.g(this), view);
        C47313c c47313c5 = this.f211817D0;
        kotlin.reflect.n<Object> nVar5 = nVarArr[4];
        c47313c5.b(this, lVar);
        RecyclerView recyclerViewS5 = s5();
        com.avito.konveyor.adapter.j jVar = this.f211821q0;
        if (jVar == null) {
            jVar = null;
        }
        recyclerViewS5.setAdapter(jVar);
        RecyclerView recyclerViewS52 = s5();
        D d12 = this.f211823s0;
        if (d12 == null) {
            d12 = null;
        }
        recyclerViewS52.l(d12, -1);
        ProfileCreateExtendedFlow profileCreateExtendedFlow = ((SelectVerticalArguments) interfaceC42726C.getValue()).f211807c;
        if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Passport ? true : profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Profile) {
            q5().g5(R.drawable.ic_close_24_black, null);
            q5().f5(new com.avito.android.passport.profile_add.create_flow.select_vertical.e(this));
        } else if (profileCreateExtendedFlow instanceof ProfileCreateExtendedFlow.Verification) {
            q5().g5(R.drawable.ic_back_24_black, null);
            q5().f5(new com.avito.android.passport.profile_add.create_flow.select_vertical.f(this));
        }
        kotlin.reflect.n<Object> nVar6 = nVarArr[2];
        ((TextView) c47313c4.a()).setMovementMethod(LinkMovementMethod.getInstance());
        kotlin.reflect.n<Object> nVar7 = nVarArr[2];
        TextView textView2 = (TextView) c47313c4.a();
        X50.c cVar2 = X50.c.f18586a;
        Context contextRequireContext = requireContext();
        com.avito.android.deeplink_handler.handler.composite.a aVar = this.f211824t0;
        if (aVar == null) {
            aVar = null;
        }
        cVar2.getClass();
        com.avito.android.util.text.j.c(textView2, X50.c.a(contextRequireContext, aVar), null);
        r5().setOnClickListener(new com.avito.android.order.feature.c(this, 5));
        ScreenPerformanceTracker screenPerformanceTracker = this.f211820p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        b.a aVarA = com.avito.android.passport.profile_add.create_flow.select_vertical.di.a.a();
        com.avito.android.passport.profile_add.di.a aVar = (com.avito.android.passport.profile_add.di.a) C29972i.a(C29972i.b(this), com.avito.android.passport.profile_add.di.a.class);
        S0 f42820b = getF42820b();
        SelectVerticalArguments selectVerticalArguments = (SelectVerticalArguments) this.f211829y0.getValue();
        InterfaceC39417a interfaceC39417aB = cv.c.b(this);
        r rVarC = s.c(this);
        SelectVerticalScreen selectVerticalScreen = SelectVerticalScreen.f213623d;
        O0 o02 = this.f211828x0;
        Z1<Q<Integer, Integer>> z12 = ((com.avito.android.passport.profile_add.f) o02.getValue()).f212374J;
        Z1<String> z13 = ((com.avito.android.passport.profile_add.f) o02.getValue()).f212375K;
        Z1<AnalyticScreen> z14 = ((com.avito.android.passport.profile_add.f) o02.getValue()).f212376L;
        com.avito.android.passport.profile_add.f fVar = (com.avito.android.passport.profile_add.f) o02.getValue();
        aVarA.a(aVar, f42820b, selectVerticalArguments, rVarC, selectVerticalScreen, interfaceC39417aB, z12, z13, z14, fVar.f212373E, new e(), bundle != null).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f211820p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final M81.b q5() {
        C47313c c47313c = this.f211816C0;
        kotlin.reflect.n<Object> nVar = f211813F0[3];
        return (M81.b) c47313c.a();
    }

    public final Button r5() {
        C47313c c47313c = this.f211814A0;
        kotlin.reflect.n<Object> nVar = f211813F0[1];
        return (Button) c47313c.a();
    }

    public final RecyclerView s5() {
        C47313c c47313c = this.f211830z0;
        kotlin.reflect.n<Object> nVar = f211813F0[0];
        return (RecyclerView) c47313c.a();
    }

    public final com.avito.android.passport.profile_add.create_flow.select_vertical.n t5() {
        return (com.avito.android.passport.profile_add.create_flow.select_vertical.n) this.f211819o0.getValue();
    }
}
