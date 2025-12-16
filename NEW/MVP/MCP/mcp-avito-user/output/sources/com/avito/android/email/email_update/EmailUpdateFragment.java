package com.avito.android.email.email_update;

import Cd.C13243a;
import Fy.C13855c;
import Fy.InterfaceC13853a;
import Fy.InterfaceC13854b;
import Y61.l;
import android.annotation.SuppressLint;
import android.os.Bundle;
import android.text.Editable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.email.analytics.EmailUpdateScreen;
import com.avito.android.error.z;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.component_container.ComponentContainer;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.D6;
import javax.inject.Inject;
import kd0.C42670a;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import z1.AbstractC50339a;

/* compiled from: EmailUpdateFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/email/email_update/EmailUpdateFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "_avito_email_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"NonComposeScreen"})
/* loaded from: classes13.dex */
public final class EmailUpdateFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.email.email_update.i f147154n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f147155o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f147156p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public com.avito.android.email.email_update.f f147157q0;

    /* compiled from: EmailUpdateFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.a<G0> {
        public a() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            EmailUpdateFragment.this.requireActivity().finish();
            return G0.f406611a;
        }
    }

    /* compiled from: EmailUpdateFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.l<String, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(String str) {
            ((com.avito.android.email.email_update.h) EmailUpdateFragment.this.f147155o0.getValue()).accept(new InterfaceC13853a.C0314a(str));
            return G0.f406611a;
        }
    }

    /* compiled from: EmailUpdateFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            EmailUpdateFragment.this.requireActivity().finish();
            return G0.f406611a;
        }
    }

    /* compiled from: EmailUpdateFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC13854b, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC13854b interfaceC13854b) {
            InterfaceC13854b interfaceC13854b2 = interfaceC13854b;
            EmailUpdateFragment emailUpdateFragment = (EmailUpdateFragment) this.receiver;
            emailUpdateFragment.getClass();
            if (interfaceC13854b2 instanceof InterfaceC13854b.a) {
                com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                Throwable th2 = ((InterfaceC13854b.a) interfaceC13854b2).f6094a;
                com.avito.android.component.toast.c.c(cVar, emailUpdateFragment, com.avito.android.printable_text.b.f(z.l(th2)), null, null, new f.c(th2), 0, ToastBarPosition.f181046d, 942);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EmailUpdateFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LFy/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LFy/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.l<C13855c, G0> {
        public e() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(C13855c c13855c) {
            C13855c c13855c2 = c13855c;
            final com.avito.android.email.email_update.f fVar = EmailUpdateFragment.this.f147157q0;
            if (fVar != null) {
                C13855c.b bVar = c13855c2.f6097b;
                boolean z12 = bVar instanceof C13855c.b.C0316c;
                C42670a c42670a = fVar.f147200j;
                ViewGroup viewGroup = fVar.f147198h;
                ComponentContainer componentContainer = fVar.f147195e;
                Button button = fVar.f147197g;
                if (z12) {
                    C42670a.d(c42670a);
                    D6.w(button);
                    D6.w(componentContainer);
                    D6.w(viewGroup);
                } else if (bVar instanceof C13855c.b.a) {
                    c42670a.b();
                    D6.G(button, true);
                    D6.G(componentContainer, true);
                    D6.w(viewGroup);
                    C13855c.b.a aVar = (C13855c.b.a) bVar;
                    componentContainer.setTitle(aVar.f6099b);
                    button.setText(aVar.f6100c);
                    button.setLoading(aVar.f6101d);
                    final int i12 = 0;
                    button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.email.email_update.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String string;
                            switch (i12) {
                                case 0:
                                    f fVar2 = fVar;
                                    Editable editableM53getText = fVar2.f147196f.m53getText();
                                    if (editableM53getText == null || (string = editableM53getText.toString()) == null) {
                                        string = "";
                                    }
                                    fVar2.f147193c.invoke(string);
                                    break;
                                default:
                                    fVar.f147194d.invoke();
                                    break;
                            }
                        }
                    });
                } else if (bVar instanceof C13855c.b.C0315b) {
                    c42670a.c(Integer.valueOf(R.style.Theme_DesignSystem_Re23), com.avito.android.email.email_update.g.f147202l);
                } else if (bVar instanceof C13855c.b.d) {
                    c42670a.b();
                    D6.G(button, true);
                    D6.w(componentContainer);
                    D6.G(viewGroup, true);
                    C13855c.b.d dVar = (C13855c.b.d) bVar;
                    fVar.f147199i.setText(dVar.f6104a);
                    button.setLoading(false);
                    button.setText(dVar.f6105b);
                    final int i13 = 1;
                    button.setOnClickListener(new View.OnClickListener() { // from class: com.avito.android.email.email_update.e
                        @Override // android.view.View.OnClickListener
                        public final void onClick(View view) {
                            String string;
                            switch (i13) {
                                case 0:
                                    f fVar2 = fVar;
                                    Editable editableM53getText = fVar2.f147196f.m53getText();
                                    if (editableM53getText == null || (string = editableM53getText.toString()) == null) {
                                        string = "";
                                    }
                                    fVar2.f147193c.invoke(string);
                                    break;
                                default:
                                    fVar.f147194d.invoke();
                                    break;
                            }
                        }
                    });
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f147162l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f147162l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f147162l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return EmailUpdateFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f147164l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f147164l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f147164l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f147165l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f147165l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f147165l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f147166l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f147166l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f147166l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EmailUpdateFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/email/email_update/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/email/email_update/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.email.email_update.h> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.email.email_update.h invoke() {
            com.avito.android.email.email_update.i iVar = EmailUpdateFragment.this.f147154n0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.email.email_update.h) iVar.get();
        }
    }

    public EmailUpdateFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f147155o0 = new O0(m0.f406844a.b(com.avito.android.email.email_update.h.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f147156p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.email_update_fragment_layout, viewGroup, false);
        this.f147157q0 = new com.avito.android.email.email_update.f(viewInflate, getResources(), new a(), new b(), new c());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f147156p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, (com.avito.android.email.email_update.h) this.f147155o0.getValue(), new d(1, this, EmailUpdateFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/email/email_update/mvi/entity/EmailUpdateOneTimeEvent;)V", 0), new e());
        return viewInflate;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f147156p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.email.email_update.di.a.a().a((com.avito.android.email.email_update.di.c) C29972i.a(C29972i.b(this), com.avito.android.email.email_update.di.c.class), new C28478k(EmailUpdateScreen.f147076d, s.c(this), null, 4, null), getResources()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f147156p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
