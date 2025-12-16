package com.avito.android.universal_transaction.transaction;

import CG0.a;
import CG0.b;
import CG0.c;
import Cd.C13243a;
import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import cU.s;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.beduin.v2.page.BaseBeduinHostFragment;
import com.avito.android.di.C29972i;
import com.avito.android.di.module.InterfaceC30106l7;
import com.avito.android.lib.beduin_v2.feature.di.C31138n0;
import com.avito.android.lib.beduin_v2.feature.di.H;
import com.avito.android.lib.beduin_v2.feature.di.K;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.util.inflater.AvitoLayoutInflater;
import com.avito.android.ownership.Owners;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.TabBaseFragment;
import com.avito.android.universal_transaction.di.b;
import com.avito.android.util.V2;
import com.avito.beduin.v2.avito.component.button.state.C36216a;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetContentPaddings;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetHeight;
import com.avito.beduin.v2.interaction.detached.flow.BottomSheetModalSize;
import com.avito.beduin.v2.interaction.detached.flow.modal.ModalButtonsOrientation;
import com.avito.beduin.v2.render.android_view.BeduinView;
import j.InterfaceC42156l;
import java.util.Collection;
import java.util.LinkedHashMap;
import java.util.Set;
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
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.n0;
import kotlin.jvm.internal.s0;
import qK0.C47313c;
import sK0.C48063a;
import yG0.C50113a;
import z1.AbstractC50339a;

/* compiled from: TransactionFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0007B\u0007¢\u0006\u0004\b\u0005\u0010\u0006¨\u0006\n²\u0006\f\u0010\t\u001a\u00020\b8\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/universal_transaction/transaction/TransactionFragment;", "Lcom/avito/android/ui/fragments/TabBaseFragment;", "LFV0/c;", "Lcom/avito/android/analytics/screens/j$b;", "Lcom/avito/beduin/v2/interaction/detached/flow/b;", "<init>", "()V", "a", "LCG0/c;", VoiceInfo.STATE, "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TransactionFragment extends TabBaseFragment implements FV0.c, InterfaceC28477j.b, com.avito.beduin.v2.interaction.detached.flow.b {

    /* renamed from: K0, reason: collision with root package name */
    @Y61.k
    public static final a f306549K0;

    /* renamed from: L0, reason: collision with root package name */
    public static final /* synthetic */ kotlin.reflect.n<Object>[] f306550L0;

    /* renamed from: A0, reason: collision with root package name */
    @InterfaceC42156l
    public int f306551A0;

    /* renamed from: B0, reason: collision with root package name */
    @Y61.l
    public UniversalColor f306552B0;

    /* renamed from: C0, reason: collision with root package name */
    @Y61.k
    public final C47313c f306553C0;

    /* renamed from: D0, reason: collision with root package name */
    @Y61.k
    public final C47313c f306554D0;

    /* renamed from: E0, reason: collision with root package name */
    @Y61.k
    public final C47313c f306555E0;

    /* renamed from: F0, reason: collision with root package name */
    public cU.s f306556F0;

    /* renamed from: G0, reason: collision with root package name */
    public ScreenPerformanceTracker f306557G0;

    /* renamed from: H0, reason: collision with root package name */
    public com.avito.android.progress_overlay.l f306558H0;

    /* renamed from: I0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f306559I0;

    /* renamed from: J0, reason: collision with root package name */
    @Inject
    public C50113a f306560J0;

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f306561t0;

    /* renamed from: u0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f306562u0;

    /* renamed from: v0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f306563v0;

    /* renamed from: w0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f306564w0;

    /* renamed from: x0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f306565x0;

    /* renamed from: y0, reason: collision with root package name */
    @Inject
    public B f306566y0;

    /* renamed from: z0, reason: collision with root package name */
    @Y61.k
    public final O0 f306567z0;

    /* compiled from: TransactionFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\u0006R\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\u0006¨\u0006\u000b"}, d2 = {"Lcom/avito/android/universal_transaction/transaction/TransactionFragment$a;", "", "<init>", "()V", "", "KEY_EVENT_PARAMS", "Ljava/lang/String;", "KEY_EXTRA", "KEY_NAMESPACE", "KEY_ORDER_ID", "KEY_SCENARIO", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: TransactionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<String> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return TransactionFragment.this.requireArguments().getString("key_event_params");
        }
    }

    /* compiled from: TransactionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class c extends N implements Y41.a<String> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            return TransactionFragment.this.requireArguments().getString("key_extra");
        }
    }

    /* compiled from: TransactionFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.a<String> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string = TransactionFragment.this.requireArguments().getString("key_namespace");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Transaction id required parameter");
        }
    }

    /* compiled from: TransactionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = TransactionFragment.f306549K0;
            TransactionFragment.this.E5().accept(a.d.f2058a);
            return G0.f406611a;
        }
    }

    /* compiled from: TransactionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public f() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(1659797993, new x(TransactionFragment.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TransactionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class g extends H implements Y41.l<b.d, G0> {
        @Override // Y41.l
        public final G0 invoke(b.d dVar) {
            b.d dVar2 = dVar;
            TransactionFragment transactionFragment = (TransactionFragment) this.receiver;
            a aVar = TransactionFragment.f306549K0;
            transactionFragment.getClass();
            if (dVar2 instanceof b.a) {
                BeduinOneTimeEvent beduinOneTimeEvent = ((b.a) dVar2).f2061a;
                boolean z12 = beduinOneTimeEvent instanceof BeduinOneTimeEvent.ShowToastBar;
                C47313c c47313c = transactionFragment.f306554D0;
                if (z12) {
                    com.avito.android.lib.beduin_v2.ui_messages.b bVar = com.avito.android.lib.beduin_v2.ui_messages.b.f177570a;
                    kotlin.reflect.n<Object> nVar = TransactionFragment.f306550L0[1];
                    bVar.getClass();
                    com.avito.android.lib.beduin_v2.ui_messages.b.a((BeduinView) c47313c.a(), (BeduinOneTimeEvent.ShowToastBar) beduinOneTimeEvent);
                } else if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.b) {
                    V2.f318762a.e("Unsupported event " + beduinOneTimeEvent, null);
                } else if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.a) {
                    kotlin.reflect.n<Object> nVar2 = TransactionFragment.f306550L0[1];
                    ((BeduinView) c47313c.a()).c(((BeduinOneTimeEvent.a) beduinOneTimeEvent).f176280a);
                } else if (!(beduinOneTimeEvent instanceof BeduinOneTimeEvent.d) && (beduinOneTimeEvent instanceof BeduinOneTimeEvent.c)) {
                    transactionFragment.E5().accept(a.d.f2058a);
                }
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TransactionFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class h extends H implements Y41.l<CG0.c, G0> {
        @Override // Y41.l
        public final G0 invoke(CG0.c cVar) {
            CG0.c cVar2 = cVar;
            TransactionFragment transactionFragment = (TransactionFragment) this.receiver;
            a aVar = TransactionFragment.f306549K0;
            transactionFragment.getClass();
            c.b bVar = cVar2.f2065b;
            if (bVar instanceof c.b.a) {
                com.avito.android.progress_overlay.l lVar = transactionFragment.f306558H0;
                (lVar != null ? lVar : null).j();
                C47313c c47313c = transactionFragment.f306554D0;
                kotlin.reflect.n<Object> nVar = TransactionFragment.f306550L0[1];
                ((BeduinView) c47313c.a()).b(((c.b.a) bVar).f2068a);
                UniversalColor universalColor = transactionFragment.f306552B0;
                UniversalColor universalColor2 = cVar2.f2066c;
                if (!L.f(universalColor, universalColor2)) {
                    transactionFragment.f306552B0 = universalColor2;
                    transactionFragment.D5();
                }
            } else if (bVar instanceof c.b.C0100b) {
                com.avito.android.progress_overlay.l lVar2 = transactionFragment.f306558H0;
                (lVar2 != null ? lVar2 : null).a(((c.b.C0100b) bVar).f2069a.getF244063c());
            } else if (L.f(bVar, c.b.C0101c.f2070a)) {
                com.avito.android.progress_overlay.l lVar3 = transactionFragment.f306558H0;
                if (lVar3 == null) {
                    lVar3 = null;
                }
                lVar3.k(null);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: TransactionFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class i extends N implements Y41.a<String> {
        public i() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string = TransactionFragment.this.requireArguments().getString("key_order_id");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Transaction id required parameter");
        }
    }

    /* compiled from: TransactionFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class j extends N implements Y41.a<String> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final String invoke() {
            String string = TransactionFragment.this.requireArguments().getString("key_scenario");
            if (string != null) {
                return string;
            }
            throw new IllegalArgumentException("Scenario required parameter");
        }
    }

    /* compiled from: TransactionFragment.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\r\u0012\t\u0012\u00070\u0001¢\u0006\u0002\b\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "LFV0/h;", "LX41/o;", "invoke", "()Ljava/util/Set;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<Set<FV0.h>> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final Set<FV0.h> invoke() {
            a aVar = TransactionFragment.f306549K0;
            return TransactionFragment.this.E5().f306494M;
        }
    }

    /* compiled from: TransactionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class l extends N implements Y41.a<String> {

        /* renamed from: l, reason: collision with root package name */
        public static final l f306576l = new l();

        public l() {
            super(0);
        }

        @Override // Y41.a
        public final /* bridge */ /* synthetic */ String invoke() {
            return "Failed to dismiss detached Modal";
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f306577l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(Y41.a aVar) {
            super(0);
            this.f306577l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f306577l);
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
            return TransactionFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class o extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ n f306579l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(n nVar) {
            super(0);
            this.f306579l = nVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f306579l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class p extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f306580l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f306580l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f306580l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class q extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f306581l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f306581l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f306581l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: TransactionFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/universal_transaction/transaction/A;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/universal_transaction/transaction/A;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class r extends N implements Y41.a<A> {
        public r() {
            super(0);
        }

        @Override // Y41.a
        public final A invoke() {
            B b12 = TransactionFragment.this.f306566y0;
            if (b12 == null) {
                b12 = null;
            }
            return (A) b12.get();
        }
    }

    static {
        Y y12 = new Y(TransactionFragment.class, "rootContainerView", "getRootContainerView()Landroid/view/ViewGroup;", 0);
        n0 n0Var = m0.f406844a;
        f306550L0 = new kotlin.reflect.n[]{n0Var.e(y12), androidx.compose.ui.graphics.colorspace.e.s(TransactionFragment.class, "beduinView", "getBeduinView()Lcom/avito/beduin/v2/render/android_view/BeduinView;", 0, n0Var), androidx.compose.ui.graphics.colorspace.e.s(TransactionFragment.class, "debugMenuContainer", "getDebugMenuContainer()Landroidx/compose/ui/platform/ComposeView;", 0, n0Var)};
        f306549K0 = new a(null);
    }

    public TransactionFragment() {
        super(R.layout.transaction_fragment);
        this.f306561t0 = C42727D.c(new i());
        this.f306562u0 = C42727D.c(new j());
        this.f306563v0 = C42727D.c(new d());
        this.f306564w0 = C42727D.c(new c());
        this.f306565x0 = C42727D.c(new b());
        m mVar = new m(new r());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new o(new n()));
        this.f306567z0 = new O0(m0.f406844a.b(A.class), new p(interfaceC42726CB), mVar, new q(interfaceC42726CB));
        this.f306553C0 = new C47313c(null, 1, null);
        this.f306554D0 = new C47313c(null, 1, null);
        this.f306555E0 = new C47313c(null, 1, null);
        this.f306559I0 = C42727D.c(new k());
    }

    @Override // FV0.a
    @Y61.k
    public final FV0.f A1() {
        return FV0.g.f4722a;
    }

    public final void D5() {
        UniversalColor universalColor;
        com.avito.android.lib.util.i.f181373a.getClass();
        if (com.avito.android.lib.util.i.f181377e || !isResumed() || (universalColor = this.f306552B0) == null) {
            return;
        }
        ActivityC22955m activityC22955mL1 = l1();
        Window window = activityC22955mL1 != null ? activityC22955mL1.getWindow() : null;
        if (window == null) {
            return;
        }
        window.setStatusBarColor(C48063a.f437606a.a(requireContext(), universalColor));
    }

    public final A E5() {
        return (A) this.f306567z0.getValue();
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b Y2(@Y61.l String str, @Y61.l String str2, @Y61.l C36216a[] c36216aArr, @Y61.l ModalButtonsOrientation modalButtonsOrientation, boolean z12, @Y61.l Y41.a<G0> aVar, @Y61.l com.avito.beduin.v2.interaction.detached.flow.modal.a aVar2, boolean z13, @Y61.k Y41.a<G0> aVar3) {
        cU.s sVar = this.f306556F0;
        if (sVar == null) {
            sVar = null;
        }
        com.avito.beduin.v2.theme.k kVarA = sVar.a();
        com.avito.android.beduin.v2.page.modal.a aVar4 = com.avito.android.beduin.v2.page.modal.a.f105171a;
        Context contextRequireContext = requireContext();
        aVar4.getClass();
        com.avito.android.lib.design.modal.a aVarA = com.avito.android.beduin.v2.page.modal.a.a(contextRequireContext, kVarA, str, str2, c36216aArr, modalButtonsOrientation, z12, aVar, aVar2, z13, aVar3);
        com.avito.android.lib.util.g.a(aVarA);
        return new v(aVarA, 0);
    }

    @Override // FV0.d
    public final void close() {
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 != null) {
            activityC22955mL1.onBackPressed();
        }
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    @Y61.k
    public final Context m5(@Y61.k Context context, @Y61.l Bundle bundle) {
        return AvitoLayoutInflater.b(AvitoLayoutInflater.f181382a, context, Integer.valueOf(R.style.Theme_DesignSystem_Re23));
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        FV0.i.a((Collection) this.f306559I0.getValue(), this);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.l
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f306557G0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        return super.onCreateView(layoutInflater, viewGroup, bundle);
    }

    @Override // com.avito.android.ui.fragments.TabBaseFragment, androidx.fragment.app.Fragment
    public final void onDestroy() {
        FV0.i.b((Collection) this.f306559I0.getValue());
        super.onDestroy();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        com.avito.android.lib.util.i.f181373a.getClass();
        if (com.avito.android.lib.util.i.f181377e) {
            return;
        }
        ActivityC22955m activityC22955mL1 = l1();
        Window window = activityC22955mL1 != null ? activityC22955mL1.getWindow() : null;
        if (window == null) {
            return;
        }
        window.setStatusBarColor(this.f306551A0);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        D5();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        Window window;
        super.onViewCreated(view, bundle);
        View viewFindViewById = view.findViewById(R.id.transaction_fragment_root);
        if (viewFindViewById == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        C47313c c47313c = this.f306553C0;
        kotlin.reflect.n<Object>[] nVarArr = f306550L0;
        kotlin.reflect.n<Object> nVar = nVarArr[0];
        c47313c.b(this, (ViewGroup) viewFindViewById);
        View viewFindViewById2 = view.findViewById(R.id.transaction_beduin);
        if (viewFindViewById2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type com.avito.beduin.v2.render.android_view.BeduinView");
        }
        BeduinView beduinView = (BeduinView) viewFindViewById2;
        cU.s sVar = this.f306556F0;
        if (sVar == null) {
            sVar = null;
        }
        com.avito.beduin.v2.render.android_view.A aB2 = sVar.b();
        cU.s sVar2 = this.f306556F0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        com.avito.beduin.v2.theme.k kVarA = sVar2.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        C47313c c47313c2 = this.f306554D0;
        kotlin.reflect.n<Object> nVar2 = nVarArr[1];
        c47313c2.b(this, beduinView);
        View viewFindViewById3 = view.findViewById(R.id.transaction_overlay_container);
        if (viewFindViewById3 == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup");
        }
        com.avito.android.progress_overlay.l lVar = new com.avito.android.progress_overlay.l((ViewGroup) viewFindViewById3, R.id.transaction_beduin, null, 0, 0, 28, null);
        this.f306558H0 = lVar;
        lVar.f231600j = new e();
        ActivityC22955m activityC22955mL1 = l1();
        this.f306551A0 = (activityC22955mL1 == null || (window = activityC22955mL1.getWindow()) == null) ? 0 : window.getStatusBarColor();
        C50113a c50113a = this.f306560J0;
        if (c50113a == null) {
            c50113a = null;
        }
        c50113a.getClass();
        kotlin.reflect.n<Object> nVar3 = C50113a.f443005d[1];
        if (((Boolean) c50113a.f443007c.a().getValue()).booleanValue()) {
            ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
            composeView.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
            composeView.setContent(new C22096n(968723556, new f(), true));
            C47313c c47313c3 = this.f306555E0;
            kotlin.reflect.n<Object> nVar4 = nVarArr[2];
            c47313c3.b(this, composeView);
            kotlin.reflect.n<Object> nVar5 = nVarArr[0];
            ViewGroup viewGroup = (ViewGroup) c47313c.a();
            kotlin.reflect.n<Object> nVar6 = nVarArr[2];
            viewGroup.addView((ComposeView) c47313c3.a());
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f306557G0;
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker == null ? null : screenPerformanceTracker, E5(), new g(1, this, TransactionFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/universal_transaction/mvi/entity/TransactionOneTimeEvent$Public;)V", 0), new h(1, this, TransactionFragment.class, "render", "render(Lcom/avito/android/universal_transaction/mvi/entity/TransactionState;)V", 0));
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f306557G0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        TransactionScreen transactionScreen = TransactionScreen.f306583d;
        C28478k c28478k = new C28478k(transactionScreen, com.avito.android.analytics.screens.s.c(this), null, 4, null);
        this.f306557G0 = ((InterfaceC30106l7) C29972i.a(C29972i.b(this), InterfaceC30106l7.class)).b().a(c28478k);
        ZS.b bVar = new ZS.b(transactionScreen, Owners.f210421K0, (String) null, 4, (C42822w) null);
        b.a aVarA = com.avito.android.universal_transaction.di.a.a();
        String str = (String) this.f306561t0.getValue();
        String str2 = (String) this.f306562u0.getValue();
        String str3 = (String) this.f306563v0.getValue();
        String str4 = (String) this.f306564w0.getValue();
        String str5 = (String) this.f306565x0.getValue();
        com.avito.android.universal_transaction.di.c cVar = (com.avito.android.universal_transaction.di.c) C29972i.a(C29972i.b(this), com.avito.android.universal_transaction.di.c.class);
        H.a aVarEd = ((H.b) C29972i.a(C29972i.b(this), H.b.class)).ed();
        ScreenPerformanceTracker screenPerformanceTracker = this.f306557G0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        aVarA.a(str, str3, str2, str4, str5, c28478k, cVar, new C31138n0(K.a(aVarEd, screenPerformanceTracker, bVar, cv.c.d(this), null, null, null, 56))).a(this);
        s.a aVarFd = ((s.b) C29972i.a(C29972i.b(this), s.b.class)).fd();
        Context contextRequireContext = requireContext();
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f306557G0;
        this.f306556F0 = aVarFd.a(contextRequireContext, screenPerformanceTracker2 == null ? null : screenPerformanceTracker2, E5().f306495N, cU.v.f57891a, E5().f306493L);
        ScreenPerformanceTracker screenPerformanceTracker3 = this.f306557G0;
        if (screenPerformanceTracker3 == null) {
            screenPerformanceTracker3 = null;
        }
        screenPerformanceTracker3.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker4 = this.f306557G0;
        if (screenPerformanceTracker4 == null) {
            screenPerformanceTracker4 = null;
        }
        screenPerformanceTracker4.c(this, g5());
    }

    @Override // com.avito.beduin.v2.interaction.detached.flow.b
    @Y61.k
    public final HV0.b y2(@Y61.k Y41.a aVar, @Y61.k com.avito.beduin.v2.engine.D d12, @Y61.k BottomSheetContentPaddings bottomSheetContentPaddings, @Y61.k BottomSheetHeight bottomSheetHeight, @Y61.k BottomSheetModalSize bottomSheetModalSize, @Y61.l LinkedHashMap linkedHashMap) {
        BaseBeduinHostFragment.DetachedBottomSheet.a aVar2 = BaseBeduinHostFragment.DetachedBottomSheet.f104752l0;
        cU.s sVar = this.f306556F0;
        if (sVar == null) {
            sVar = null;
        }
        aVar2.getClass();
        BaseBeduinHostFragment.DetachedBottomSheet detachedBottomSheetA = BaseBeduinHostFragment.DetachedBottomSheet.a.a(sVar, d12, bottomSheetHeight, bottomSheetContentPaddings, linkedHashMap, aVar);
        detachedBottomSheetA.show(getParentFragmentManager(), "bottom-sheet");
        return new v(detachedBottomSheetA, 1);
    }

    @Override // FV0.c
    @Y61.k
    public final Fragment j1() {
        return this;
    }
}
