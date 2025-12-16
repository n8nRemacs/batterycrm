package com.avito.android.iac_dialer.impl_module.overlay.widjet.ui;

import Y41.p;
import Y61.k;
import android.graphics.Point;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowManager;
import androidx.appcompat.app.m;
import androidx.compose.runtime.A;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.view.C23489g;
import androidx.view.V0;
import com.avito.android.R;
import com.avito.android.iac_dialer.impl_module.overlay.lazy_sate_provider.dialer_mediator.IacOverlayState;
import com.avito.android.iac_dialer_ui.pub.overlay_widget.IacUIOverlayWidgetState;
import com.avito.android.iac_dialer_ui.pub.overlay_widget.h;
import com.avito.android.util.L0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import lL.InterfaceC43652a;
import pK.InterfaceC46970a;

/* compiled from: IacDialerOverlayViewDelegate.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/widjet/ui/a;", "", "c", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class a {

    /* renamed from: j, reason: collision with root package name */
    public static final /* synthetic */ int f166164j = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final L0 f166165a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final m f166166b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f166167c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final f f166168d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InterfaceC46970a f166169e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final InterfaceC43652a f166170f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final View f166171g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final WindowManager.LayoutParams f166172h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final ComposeView f166173i;

    /* compiled from: IacDialerOverlayViewDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Landroid/graphics/Point;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.a$a, reason: collision with other inner class name */
    public static final class C4926a extends N implements Y41.a<Point> {
        public C4926a() {
            super(0);
        }

        @Override // Y41.a
        public final Point invoke() {
            WindowManager.LayoutParams layoutParams = a.this.f166172h;
            return new Point(layoutParams.x, layoutParams.y);
        }
    }

    /* compiled from: IacDialerOverlayViewDelegate.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0002\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"", "x", "y", "Lkotlin/G0;", "invoke", "(II)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements p<Integer, Integer, G0> {
        public b() {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(Integer num, Integer num2) {
            int iIntValue = num.intValue();
            int iIntValue2 = num2.intValue();
            a aVar = a.this;
            f fVar = aVar.f166168d;
            fVar.f166188a = iIntValue;
            fVar.f166189b = iIntValue2;
            WindowManager.LayoutParams layoutParams = aVar.f166172h;
            layoutParams.x = iIntValue;
            layoutParams.y = iIntValue2;
            aVar.f166166b.getWindowManager().updateViewLayout(aVar.f166171g, layoutParams);
            return G0.f406611a;
        }
    }

    /* compiled from: IacDialerOverlayViewDelegate.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/iac_dialer/impl_module/overlay/widjet/ui/a$c;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_iac-dialer_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: IacDialerOverlayViewDelegate.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ IacOverlayState f166176l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ a f166177m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(IacOverlayState iacOverlayState, a aVar) {
            super(2);
            this.f166176l = iacOverlayState;
            this.f166177m = aVar;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            A a13 = a12;
            if ((num.intValue() & 11) == 2 && a13.c()) {
                a13.f();
            } else {
                IacOverlayState.Hidden hidden = IacOverlayState.Hidden.INSTANCE;
                IacOverlayState iacOverlayState = this.f166176l;
                if (!L.f(iacOverlayState, hidden) && (iacOverlayState instanceof IacOverlayState.Visible)) {
                    IacUIOverlayWidgetState uiState = ((IacOverlayState.Visible) iacOverlayState).getUiState();
                    a aVar = this.f166177m;
                    h.a(uiState, new com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.b(0, aVar.f166169e, InterfaceC46970a.class, "get", "get()J", 0), new com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.c(0, aVar, a.class, "audioDeviceClickListener", "audioDeviceClickListener()V", 0), new com.avito.android.iac_dialer.impl_module.overlay.widjet.ui.d(0, aVar, a.class, "expandCallClickListener", "expandCallClickListener()V", 0), null, a13, 0);
                }
            }
            return G0.f406611a;
        }
    }

    static {
        new c(null);
    }

    public a(@k L0 l02, @k m mVar, @k String str, @k f fVar, @k InterfaceC46970a interfaceC46970a, @k InterfaceC43652a interfaceC43652a) {
        this.f166165a = l02;
        this.f166166b = mVar;
        this.f166167c = str;
        this.f166168d = fVar;
        this.f166169e = interfaceC46970a;
        this.f166170f = interfaceC43652a;
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacDialerOverlayViewDelegate", str + ": overlay view created", null);
        View viewInflate = mVar.getLayoutInflater().inflate(R.layout.iac_dialer_impl_layout_overlay, (ViewGroup) mVar.getWindow().getDecorView(), false);
        this.f166171g = viewInflate;
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams(l02.c(), -2, 2, -2147483608, -3);
        this.f166172h = layoutParams;
        layoutParams.x = fVar.f166188a;
        layoutParams.y = fVar.f166189b;
        viewInflate.setLayoutParams(layoutParams);
        V0.b(viewInflate, mVar);
        C23489g.b(viewInflate, mVar);
        this.f166173i = (ComposeView) viewInflate.findViewById(R.id.iac_overlay_compose_view);
        viewInflate.setOnTouchListener(new e(mVar, new C4926a(), new b(), l02.c(), l02.c()));
    }

    public final void a(@k IacOverlayState iacOverlayState) {
        com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a("IacDialerOverlayViewDelegate", this.f166167c + ": overlay view render state: " + iacOverlayState, null);
        this.f166173i.setContent(new C22096n(-1770923048, new d(iacOverlayState, this), true));
    }
}
