package com.avito.android.installmentsblock;

import Cd.C13243a;
import Y61.k;
import Y61.l;
import aO.InterfaceC19796b;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.runtime.internal.r;
import androidx.compose.ui.platform.ComposeView;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.di.C29972i;
import com.avito.android.installments_block.entity.InstallmentsBlock;
import com.avito.android.installmentsblock.di.b;
import com.avito.android.installmentsblock.mvi.o;
import com.avito.android.installmentsblock.mvi.p;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import cv.InterfaceC39417a;
import dO.InterfaceC39605a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import vN0.C49240a;

/* compiled from: InstallmentsBlockViewImpl.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0004²\u0006\f\u0010\u0003\u001a\u00020\u00028\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/installmentsblock/e;", "LaO/d;", "LdO/d;", VoiceInfo.STATE, "_avito_installments-block_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements aO.d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final ViewGroup f172966a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public p f172967b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final InterfaceC42726C f172968c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final O0 f172969d;

    /* compiled from: InstallmentsBlockViewImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends N implements Y41.p<A, Integer, G0> {
        public a() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                e eVar = e.this;
                com.akita.compose.theme.re23.c.a(false, r.c(321714839, new com.avito.android.installmentsblock.d(eVar, C22126m3.b(e.b(eVar).getState(), a13)), a13), a13, 48, 1);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: InstallmentsBlockViewImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b extends H implements Y41.a<T0> {
        @Override // Y41.a
        public final T0 invoke() {
            return C49240a.a((View) this.receiver);
        }
    }

    /* compiled from: InstallmentsBlockViewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<S0> {
        public d() {
            super(0);
        }

        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) e.this.f172968c.getValue()).getF42820b();
        }
    }

    /* compiled from: InstallmentsBlockViewImpl.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.android.installmentsblock.e$e, reason: collision with other inner class name */
    public static final class C5098e extends N implements Y41.a<P0.c> {
        public C5098e() {
            super(0);
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(new f(e.this));
        }
    }

    public e(@k ViewGroup viewGroup, @l InstallmentsBlock installmentsBlock, @l InterfaceC19796b interfaceC19796b) {
        this.f172966a = viewGroup;
        this.f172968c = C42727D.c(new b(0, viewGroup, C49240a.class, "findClosestViewModelStoreOwner", "findClosestViewModelStoreOwner(Landroid/view/View;)Landroidx/lifecycle/ViewModelStoreOwner;", 1));
        this.f172969d = new O0(m0.f406844a.b(o.class), new d(), new C5098e(), null, 8, null);
        b.a aVarA = com.avito.android.installmentsblock.di.a.a();
        InterfaceC39417a.b bVar = (InterfaceC39417a.b) C29972i.a(C29972i.b(viewGroup), InterfaceC39417a.b.class);
        aVarA.a(installmentsBlock, interfaceC19796b, bVar.ol().a(new gv.e(viewGroup))).a(this);
        ComposeView composeView = new ComposeView(viewGroup.getContext(), null, 0, 6, null);
        viewGroup.addView(composeView, new FrameLayout.LayoutParams(-1, -2));
        composeView.setContent(new C22096n(-757156590, new a(), true));
    }

    public static final o b(e eVar) {
        return (o) eVar.f172969d.getValue();
    }

    @Override // aO.d
    public final void a(@k InstallmentsBlock installmentsBlock) {
        ViewGroup viewGroup = this.f172966a;
        if (viewGroup.isAttachedToWindow()) {
            ((o) this.f172969d.getValue()).accept(new InterfaceC39605a.b(installmentsBlock));
        } else {
            viewGroup.addOnAttachStateChangeListener(new c(viewGroup, this, installmentsBlock));
        }
    }

    public /* synthetic */ e(ViewGroup viewGroup, InstallmentsBlock installmentsBlock, InterfaceC19796b interfaceC19796b, int i12, C42822w c42822w) {
        this(viewGroup, installmentsBlock, (i12 & 4) != 0 ? null : interfaceC19796b);
    }

    /* compiled from: View.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002¸\u0006\u0000"}, d2 = {"androidx/core/view/r0", "Landroid/view/View$OnAttachStateChangeListener;", "core-ktx_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c implements View.OnAttachStateChangeListener {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ View f172971b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ e f172972c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ InstallmentsBlock f172973d;

        public c(View view, e eVar, InstallmentsBlock installmentsBlock) {
            this.f172971b = view;
            this.f172972c = eVar;
            this.f172973d = installmentsBlock;
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewAttachedToWindow(View view) {
            this.f172971b.removeOnAttachStateChangeListener(this);
            e.b(this.f172972c).accept(new InterfaceC39605a.b(this.f172973d));
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public final void onViewDetachedFromWindow(View view) {
        }
    }
}
