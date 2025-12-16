package com.avito.android.verification.verification_confirm_requisites;

import Cd.C13243a;
import LM0.a;
import LM0.b;
import LM0.c;
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
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.nav_bar.NavBar;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.select.Arguments;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.D6;
import com.avito.android.verification.inn.a;
import com.avito.android.verification.inn.list.button.ButtonItem;
import com.avito.android.verification.inn.list.select.SelectItem;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import xM0.C49864d;
import z1.AbstractC50339a;

/* compiled from: VerificationConfirmRequisitesFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0006B\u0007¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0007"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/VerificationConfirmRequisitesFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/android/select/p;", "<init>", "()V", "a", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class VerificationConfirmRequisitesFragment extends BaseFragment implements InterfaceC28477j.b, com.avito.android.select.p {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f324891t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.verification.verification_confirm_requisites.k f324892n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f324893o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f324894p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.j f324895q0;

    /* renamed from: r0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.a f324896r0;

    /* renamed from: s0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.verification.verification_confirm_requisites.g f324897s0;

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/VerificationConfirmRequisitesFragment$a;", "", "<init>", "()V", "", "KEY_VERIFICATION_CONFIRM_REQUISITES_ARGS", "Ljava/lang/String;", "TAG_VERIFICATION_SELECT_FRAGMENT", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/verification/verification_confirm_requisites/VerificationConfirmRequisitesFragment$b", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_verification_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends com.avito.android.deeplink_handler.view.impl.k {
        public b(ActivityC22955m activityC22955m) {
            super(activityC22955m);
        }

        @Override // com.avito.android.deeplink_handler.view.impl.k
        @Y61.k
        public final ViewGroup a() {
            return (ViewGroup) VerificationConfirmRequisitesFragment.this.requireView().findViewById(R.id.appbar_container);
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLM0/b;", "event", "Lkotlin/G0;", "invoke", "(LLM0/b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.l<LM0.b, G0> {
        public c() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(LM0.b bVar) {
            LM0.b bVar2 = bVar;
            a aVar = VerificationConfirmRequisitesFragment.f324891t0;
            VerificationConfirmRequisitesFragment verificationConfirmRequisitesFragment = VerificationConfirmRequisitesFragment.this;
            if (bVar2 instanceof b.d) {
                com.avito.android.verification.verification_confirm_requisites.g gVar = verificationConfirmRequisitesFragment.f324897s0;
                if (gVar != null) {
                    com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                    PrintableText printableTextF = com.avito.android.printable_text.b.f(((b.d) bVar2).f9934a);
                    f.c.f125255c.getClass();
                    com.avito.android.component.toast.c.b(cVar, gVar.f324949f, printableTextF, null, null, null, f.c.a.b(), 0, ToastBarPosition.f181045c, null, false, false, null, null, 4014);
                }
            } else if (bVar2 instanceof b.c) {
                com.avito.android.select.bottom_sheet.c.a(verificationConfirmRequisitesFragment, ((b.c) bVar2).f9933a).show(verificationConfirmRequisitesFragment.getParentFragmentManager(), "tag.verification_select_fragment");
            } else if (L.f(bVar2, b.a.f9931a)) {
                verificationConfirmRequisitesFragment.requireActivity().finish();
            } else if (L.f(bVar2, b.C0612b.f9932a)) {
                verificationConfirmRequisitesFragment.requireActivity().onBackPressed();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LLM0/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LLM0/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<LM0.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(LM0.c cVar) {
            LM0.c cVar2 = cVar;
            com.avito.android.verification.verification_confirm_requisites.g gVar = VerificationConfirmRequisitesFragment.this.f324897s0;
            if (gVar != null) {
                boolean zEquals = cVar2.equals(c.C0613c.f9938b);
                C49864d c49864d = gVar.f324950g;
                if (zEquals) {
                    C49864d.d(c49864d);
                } else {
                    boolean z12 = cVar2 instanceof c.a;
                    NavBar navBar = gVar.f324949f;
                    if (z12) {
                        D6.H(navBar);
                        C49864d.c(c49864d, com.avito.android.verification.verification_confirm_requisites.i.f324954l);
                    } else if (cVar2 instanceof c.b) {
                        c.b bVar = (c.b) cVar2;
                        navBar.setState(new com.avito.android.lib.design.nav_bar.a(bVar.f9936b ? C35835l0.h(R.attr.ic_close24, gVar.f324944a.getContext()) : null, new com.avito.android.verification.verification_confirm_requisites.h(gVar), false, null, null, null, null, 124, null));
                        a.C10030a c10030a = bVar.f9937c;
                        com.avito.konveyor.util.a.a(gVar.f324946c, c10030a.f323873b);
                        gVar.f324945b.notifyDataSetChanged();
                        c49864d.b();
                        Integer num = c10030a.f323874c;
                        if (num != null) {
                            int iIntValue = num.intValue();
                            RecyclerView recyclerView = gVar.f324948e;
                            com.avito.android.verification.inn.l lVar = new com.avito.android.verification.inn.l(recyclerView.getContext());
                            lVar.f53878a = iIntValue;
                            RecyclerView.m layoutManager = recyclerView.getLayoutManager();
                            if (layoutManager != null) {
                                layoutManager.x1(lVar);
                            }
                        }
                    }
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<LM0.a, G0> {
        @Override // Y41.l
        public final G0 invoke(LM0.a aVar) {
            ((com.avito.android.verification.verification_confirm_requisites.j) this.receiver).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/deep_linking/links/DeepLink;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/deep_linking/links/DeepLink;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<DeepLink, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(DeepLink deepLink) {
            a aVar = VerificationConfirmRequisitesFragment.f324891t0;
            VerificationConfirmRequisitesFragment.this.q5().accept(new a.e(deepLink));
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/button/ButtonItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/verification/inn/list/button/ButtonItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.l<ButtonItem, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(ButtonItem buttonItem) {
            a aVar = VerificationConfirmRequisitesFragment.f324891t0;
            VerificationConfirmRequisitesFragment.this.q5().accept(new a.c(buttonItem));
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/verification/common/list/button_default/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/verification/common/list/button_default/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.l<com.avito.android.verification.common.list.button_default.a, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.verification.common.list.button_default.a aVar) {
            a aVar2 = VerificationConfirmRequisitesFragment.f324891t0;
            VerificationConfirmRequisitesFragment.this.q5().accept(new a.e(aVar.f323401d));
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/select/SelectItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/verification/inn/list/select/SelectItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<SelectItem, G0> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(SelectItem selectItem) {
            a aVar = VerificationConfirmRequisitesFragment.f324891t0;
            VerificationConfirmRequisitesFragment.this.q5().accept(new a.h(selectItem));
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/inn_info/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/verification/inn/list/inn_info/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.l<com.avito.android.verification.inn.list.inn_info.a, G0> {
        public j() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.verification.inn.list.inn_info.a aVar) {
            a aVar2 = VerificationConfirmRequisitesFragment.f324891t0;
            VerificationConfirmRequisitesFragment.this.q5().accept(a.C0611a.f9924a);
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/checkbox/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/verification/inn/list/checkbox/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.l<com.avito.android.verification.inn.list.checkbox.a, G0> {
        public k() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.verification.inn.list.checkbox.a aVar) {
            a aVar2 = VerificationConfirmRequisitesFragment.f324891t0;
            VerificationConfirmRequisitesFragment.this.q5().accept(new a.d());
            return G0.f406611a;
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/verification/inn/list/disclosure/a;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/verification/inn/list/disclosure/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.l<com.avito.android.verification.inn.list.disclosure.a, G0> {
        public l() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(com.avito.android.verification.inn.list.disclosure.a aVar) {
            a aVar2 = VerificationConfirmRequisitesFragment.f324891t0;
            VerificationConfirmRequisitesFragment.this.q5().accept(new a.f());
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f324908l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Y41.a aVar) {
            super(0);
            this.f324908l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f324908l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends N implements Y41.a<Fragment> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return VerificationConfirmRequisitesFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n f324910l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.f324910l = nVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f324910l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f324911l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f324911l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f324911l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f324912l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f324912l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f324912l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: VerificationConfirmRequisitesFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/verification/verification_confirm_requisites/j;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/verification/verification_confirm_requisites/j;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<com.avito.android.verification.verification_confirm_requisites.j> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.verification.verification_confirm_requisites.j invoke() {
            com.avito.android.verification.verification_confirm_requisites.k kVar = VerificationConfirmRequisitesFragment.this.f324892n0;
            if (kVar == null) {
                kVar = null;
            }
            return (com.avito.android.verification.verification_confirm_requisites.j) kVar.get();
        }
    }

    public VerificationConfirmRequisitesFragment() {
        super(0, 1, null);
        m mVar = new m(new r());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new o(new n()));
        this.f324893o0 = new O0(m0.f406844a.b(com.avito.android.verification.verification_confirm_requisites.j.class), new p(interfaceC42726CB), mVar, new q(interfaceC42726CB));
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
        return new b(activityC22955mRequireActivity);
    }

    @Override // com.avito.android.select.p
    public final void j(@Y61.k String str, @Y61.l String str2, @Y61.k List list) {
        q5().accept(new a.b(str, list));
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f324894p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f324894p0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null, q5(), new c(), new d());
        return layoutInflater.inflate(R.layout.fragment_verification_confirm_requisites, viewGroup, false);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        this.f324897s0 = null;
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        super.onViewCreated(view, bundle);
        com.avito.konveyor.adapter.j jVar = this.f324895q0;
        if (jVar == null) {
            jVar = null;
        }
        com.avito.konveyor.adapter.a aVar = this.f324896r0;
        if (aVar == null) {
            aVar = null;
        }
        this.f324897s0 = new com.avito.android.verification.verification_confirm_requisites.g(new e(1, q5(), com.avito.android.verification.verification_confirm_requisites.j.class, "accept", "accept(Ljava/lang/Object;)V", 0), view, aVar, jVar);
        ScreenPerformanceTracker screenPerformanceTracker = this.f324894p0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        Bundle bundleRequireArguments = requireArguments();
        com.avito.android.verification.di.confirm_requisites.a.a().a(s.c(this), getResources(), (VerificationConfirmRequisitesArgs) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("key.verification_confirm_requisites_args", VerificationConfirmRequisitesArgs.class) : bundleRequireArguments.getParcelable("key.verification_confirm_requisites_args")), getF42820b(), new com.avito.android.verification.inn.r(new f(), new g(), new h(), new i(), new j(), new k(), new l()), (com.avito.android.verification.di.confirm_requisites.c) C29972i.a(C29972i.b(this), com.avito.android.verification.di.confirm_requisites.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f324894p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.verification.verification_confirm_requisites.j q5() {
        return (com.avito.android.verification.verification_confirm_requisites.j) this.f324893o0.getValue();
    }

    @Override // com.avito.android.select.p
    public final void q(@Y61.k String str) {
    }

    @Override // com.avito.android.select.p
    public final void s3(@Y61.k String str) {
    }
}
