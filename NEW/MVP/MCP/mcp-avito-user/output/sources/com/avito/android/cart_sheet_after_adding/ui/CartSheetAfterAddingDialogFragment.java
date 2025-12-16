package com.avito.android.cart_sheet_after_adding.ui;

import Cd.C13243a;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewStub;
import android.widget.FrameLayout;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.ComposeView;
import androidx.compose.ui.platform.InterfaceC22532u2;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.Fragment;
import androidx.view.InterfaceC22969B;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.compose.a;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.cart_recommendations.model.FromPage;
import com.avito.android.cart_recommendations.model.Srcp;
import com.avito.android.component.toast.c;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.lib.design.toast_bar.i;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import dn.InterfaceC39759b;
import gn.InterfaceC40710b;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import okhttp3.internal.ws.WebSocketProtocol;
import rn.InterfaceC47682a;
import rn.InterfaceC47683b;
import tn.InterfaceC48692a;
import z1.AbstractC50339a;

/* compiled from: CartSheetAfterAddingDialogFragment.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/ui/CartSheetAfterAddingDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lgn/e;", VoiceInfo.STATE, "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CartSheetAfterAddingDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final a f115461o0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.cart_sheet_after_adding.mvi.r f115462h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f115463i0;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f115464j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f115465k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f115466l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f115467m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public View f115468n0;

    /* compiled from: CartSheetAfterAddingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0000X\u0080T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/ui/CartSheetAfterAddingDialogFragment$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CartSheetAfterAddingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u0012\u0012\b\u0012\u00060\u0001j\u0002`\u0002\u0012\u0004\u0012\u00020\u00030\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/reflect/KFunction1;", "", "Lcom/avito/android/cart_sheet_after_adding/mvi/Action;", "Lkotlin/G0;", "invoke", "()Lkotlin/reflect/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.a<kotlin.reflect.i<? extends G0>> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final kotlin.reflect.i<? extends G0> invoke() {
            return new C29334c(1, (com.avito.android.cart_sheet_after_adding.mvi.p) CartSheetAfterAddingDialogFragment.this.f115463i0.getValue(), com.avito.android.cart_sheet_after_adding.mvi.p.class, "accept", "accept(Ljava/lang/Object;)V", 0);
        }
    }

    /* compiled from: CartSheetAfterAddingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/analytics/screens/compose/a;", "invoke", "()Lcom/avito/android/analytics/screens/compose/a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.analytics.screens.compose.a> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.analytics.screens.compose.a invoke() {
            a.C2677a c2677a = com.avito.android.analytics.screens.compose.a.f90568a;
            ScreenPerformanceTracker screenPerformanceTracker = CartSheetAfterAddingDialogFragment.this.f115466l0;
            if (screenPerformanceTracker == null) {
                screenPerformanceTracker = null;
            }
            c2677a.getClass();
            return a.C2677a.a(screenPerformanceTracker);
        }
    }

    /* compiled from: CartSheetAfterAddingDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/android/cart_sheet_after_adding/ui/CartSheetAfterAddingDialogFragment$d", "Lcom/avito/android/deeplink_handler/view/impl/k;", "_avito_cart-sheet-after-adding_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class d extends com.avito.android.deeplink_handler.view.impl.k {
        /* JADX WARN: Multi-variable type inference failed */
        public d(ActivityC22955m activityC22955m) {
            super(activityC22955m, null, 2, 0 == true ? 1 : 0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // com.avito.android.deeplink_handler.view.impl.k, com.avito.android.deeplink_handler.view.a.i
        public final void V0(@Y61.k PrintableText printableText, @Y61.l List<? extends c.a> list, @Y61.l List<? extends c.a> list2, @Y61.l FrameLayout frameLayout, @Y61.k com.avito.android.component.toast.f fVar, int i12, @Y61.k ToastBarPosition toastBarPosition, boolean z12, boolean z13, @Y61.l i.b bVar, @Y61.l String str) {
            kotlin.Q q12;
            boolean zEquals = fVar.equals(f.a.f125253a) ? true : fVar.equals(f.b.f125254a);
            CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment = CartSheetAfterAddingDialogFragment.this;
            if (zEquals) {
                q12 = new kotlin.Q(cartSheetAfterAddingDialogFragment.f115468n0, ToastBarPosition.f181044b);
            } else {
                if (!(fVar instanceof f.c)) {
                    throw new NoWhenBranchMatchedException();
                }
                Dialog dialog = cartSheetAfterAddingDialogFragment.getDialog();
                View viewV = null;
                if (dialog != null) {
                    if (!(dialog instanceof com.avito.android.lib.design.bottom_sheet.d)) {
                        dialog = null;
                    }
                    com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) dialog;
                    if (dVar != null) {
                        viewV = dVar.v();
                    }
                }
                q12 = new kotlin.Q(viewV, ToastBarPosition.f181046d);
            }
            View view = (View) q12.f406619b;
            ToastBarPosition toastBarPosition2 = (ToastBarPosition) q12.f406620c;
            if (view != null) {
                com.avito.android.component.toast.c.b(com.avito.android.component.toast.c.f125244a, view, printableText, list, list2, frameLayout, fVar, i12, toastBarPosition2, null, z12, z13, bVar, cartSheetAfterAddingDialogFragment.getContext(), 128);
            }
        }
    }

    /* compiled from: CartSheetAfterAddingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends kotlin.jvm.internal.N implements Y41.a<G0> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = CartSheetAfterAddingDialogFragment.f115461o0;
            CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment = CartSheetAfterAddingDialogFragment.this;
            cartSheetAfterAddingDialogFragment.f5().invoke(InterfaceC48692a.d.f439419a);
            cartSheetAfterAddingDialogFragment.f5().invoke(InterfaceC40710b.C11227b.f396793a);
            return G0.f406611a;
        }
    }

    /* compiled from: CartSheetAfterAddingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, G0> {
        public f() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                com.akita.compose.theme.re23.c.a(false, androidx.compose.runtime.internal.r.c(-212271790, new C29343i(CartSheetAfterAddingDialogFragment.this), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CartSheetAfterAddingDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/view/View;", "footerView", "Lkotlin/G0;", "invoke", "(Landroid/view/View;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends kotlin.jvm.internal.N implements Y41.l<View, G0> {
        public g() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(View view) {
            View view2 = view;
            CartSheetAfterAddingDialogFragment cartSheetAfterAddingDialogFragment = CartSheetAfterAddingDialogFragment.this;
            cartSheetAfterAddingDialogFragment.f115468n0 = view2;
            ViewParent parent = view2.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                viewGroup.setClipChildren(false);
            }
            View viewFindViewById = view2.findViewById(R.id.footer_content_stub);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.view.ViewStub");
            }
            ViewStub viewStub = (ViewStub) viewFindViewById;
            if (!viewStub.isAttachedToWindow()) {
                viewStub.addOnAttachStateChangeListener(new ViewOnAttachStateChangeListenerC29346l(viewStub, viewStub, view2, cartSheetAfterAddingDialogFragment));
            } else if (viewStub.getParent() != null) {
                viewStub.inflate();
                View viewFindViewById2 = view2.findViewById(R.id.footer_compose_content);
                if (viewFindViewById2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type androidx.compose.ui.platform.ComposeView");
                }
                ComposeView composeView = (ComposeView) viewFindViewById2;
                composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
                composeView.post(new RunnableC29345k(composeView, cartSheetAfterAddingDialogFragment));
            }
            return G0.f406611a;
        }
    }

    /* compiled from: CartSheetAfterAddingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\n\u0010\u0002\u001a\u00060\u0000j\u0002`\u0001H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "Lcom/avito/android/cart_sheet_after_adding/mvi/Action;", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Object;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends kotlin.jvm.internal.N implements Y41.l<Object, G0> {
        public h() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(Object obj) {
            a aVar = CartSheetAfterAddingDialogFragment.f115461o0;
            CartSheetAfterAddingDialogFragment.this.f5().invoke(obj);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends kotlin.jvm.internal.N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f115476l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(Y41.a aVar) {
            super(0);
            this.f115476l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f115476l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends kotlin.jvm.internal.N implements Y41.a<Fragment> {
        public j() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return CartSheetAfterAddingDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends kotlin.jvm.internal.N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ j f115478l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(j jVar) {
            super(0);
            this.f115478l = jVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f115478l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends kotlin.jvm.internal.N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f115479l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public l(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f115479l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f115479l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class m extends kotlin.jvm.internal.N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f115480l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f115480l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f115480l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: CartSheetAfterAddingDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/cart_sheet_after_adding/mvi/p;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/cart_sheet_after_adding/mvi/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class n extends kotlin.jvm.internal.N implements Y41.a<com.avito.android.cart_sheet_after_adding.mvi.p> {
        public n() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.cart_sheet_after_adding.mvi.p invoke() {
            com.avito.android.cart_sheet_after_adding.mvi.r rVar = CartSheetAfterAddingDialogFragment.this.f115462h0;
            if (rVar == null) {
                rVar = null;
            }
            return (com.avito.android.cart_sheet_after_adding.mvi.p) rVar.get();
        }
    }

    public CartSheetAfterAddingDialogFragment() {
        super(0, 1, null);
        i iVar = new i(new n());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new k(new j()));
        this.f115463i0 = new O0(m0.f406844a.b(com.avito.android.cart_sheet_after_adding.mvi.p.class), new l(interfaceC42726CB), iVar, new m(interfaceC42726CB));
        this.f115464j0 = C42727D.c(new b());
        this.f115467m0 = C42727D.c(new c());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    @Y61.k
    public final a.i c5() {
        return new d(requireActivity());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        com.avito.android.analytics.screens.F fA2 = D.a.a();
        InterfaceC47683b.a aVarR9 = ((InterfaceC47682a.b) C29972i.a(C29972i.b(this), InterfaceC47682a.b.class)).R9();
        FromPage fromPage = FromPage.f115328c;
        Srcp srcp = Srcp.f115335c;
        InterfaceC47683b interfaceC47683bA = aVarR9.f430167a.a(new com.avito.android.cart_snippet_actions.feature.y());
        InterfaceC39759b.a aVarQk = ((InterfaceC39759b.InterfaceC11034b) C29972i.a(C29972i.b(this), InterfaceC39759b.InterfaceC11034b.class)).qk();
        Bundle bundleRequireArguments = requireArguments();
        aVarQk.a((CartSheetAfterAddingArguments) (Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("cartSheetAfterAddingArguments", CartSheetAfterAddingArguments.class) : bundleRequireArguments.getParcelable("cartSheetAfterAddingArguments")), new C28478k(CartSheetAfterAddingScreen.f115482d, com.avito.android.analytics.screens.s.b(this), null, 4, null), new h(), interfaceC47683bA, cv.c.d(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f115466l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final Y41.l<Object, G0> f5() {
        return (Y41.l) this.f115464j0.getValue();
    }

    public final void g5(PrintableText printableText, Throwable th2, boolean z12) {
        View viewV;
        ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
        com.avito.android.lib.design.bottom_sheet.d dVar = (com.avito.android.lib.design.bottom_sheet.d) requireDialog();
        com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, dVar, printableText, null, new f.c(th2), 0, toastBarPosition, 938);
        if (!z12 || (viewV = dVar.v()) == null) {
            return;
        }
        com.avito.android.cart_snippet_actions.utils.j.a(viewV);
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f115466l0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        getLifecycle().a(new com.avito.android.lib.beduin_v2.repository.domain.cart_items.r(new e()));
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), R.style.CartSheetAfterAddingBottomSheet);
        com.avito.android.lib.design.bottom_sheet.j.c(dVar, "", false, 0, 0, 0, WebSocketProtocol.PAYLOAD_SHORT);
        com.avito.android.lib.design.bottom_sheet.d.I(dVar, true);
        dVar.setCanceledOnTouchOutside(true);
        ComposeView composeView = new ComposeView(requireContext(), null, 0, 6, null);
        composeView.setViewCompositionStrategy(InterfaceC22532u2.e.f41618b);
        composeView.setContent(new C22096n(1404894285, new f(), true));
        dVar.F(composeView, Integer.valueOf(R.layout.cart_sheet_after_adding_footer), new g());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f115466l0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        this.f115468n0 = null;
        super.onDismiss(dialogInterface);
        ActivityC22955m activityC22955mL1 = l1();
        if (activityC22955mL1 == null || activityC22955mL1.isFinishing() || activityC22955mL1.isChangingConfigurations()) {
            return;
        }
        activityC22955mL1.finish();
    }
}
