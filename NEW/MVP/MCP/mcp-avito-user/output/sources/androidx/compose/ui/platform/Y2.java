package androidx.compose.ui.platform;

import androidx.compose.runtime.InterfaceC22137p;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.AndroidComposeView;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.R;
import kotlin.Metadata;

/* compiled from: Wrapper.android.kt */
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/Y2;", "Landroidx/compose/runtime/H;", "Landroidx/lifecycle/L;", "Landroidx/compose/runtime/Z;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class Y2 implements androidx.compose.runtime.H, InterfaceC22979L, androidx.compose.runtime.Z {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final AndroidComposeView f41337b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.M f41338c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f41339d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Lifecycle f41340e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public C22096n f41341f;

    /* compiled from: Wrapper.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/platform/AndroidComposeView$b;", "it", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/platform/AndroidComposeView$b;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<AndroidComposeView.b, kotlin.G0> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C22096n f41343m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C22096n c22096n) {
            super(1);
            this.f41343m = c22096n;
        }

        @Override // Y41.l
        public final kotlin.G0 invoke(AndroidComposeView.b bVar) {
            AndroidComposeView.b bVar2 = bVar;
            Y2 y22 = Y2.this;
            if (!y22.f41339d) {
                Lifecycle lifecycle = bVar2.f41047a.getLifecycle();
                C22096n c22096n = this.f41343m;
                y22.f41341f = c22096n;
                if (y22.f41340e == null) {
                    y22.f41340e = lifecycle;
                    lifecycle.a(y22);
                } else if (lifecycle.getF46705d().a(Lifecycle.State.f46681d)) {
                    y22.f41338c.z7(new C22096n(-2000640158, new X2(y22, c22096n), true));
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    public Y2(@Y61.k AndroidComposeView androidComposeView, @Y61.k androidx.compose.runtime.M m12) {
        this.f41337b = androidComposeView;
        this.f41338c = m12;
        P0.f41185a.getClass();
        this.f41341f = P0.f41186b;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@Y61.k InterfaceC22983P interfaceC22983P, @Y61.k Lifecycle.Event event) {
        if (event == Lifecycle.Event.ON_DESTROY) {
            dispose();
        } else {
            if (event != Lifecycle.Event.ON_CREATE || this.f41339d) {
                return;
            }
            z7(this.f41341f);
        }
    }

    @Override // androidx.compose.runtime.H
    public final void dispose() {
        if (!this.f41339d) {
            this.f41339d = true;
            this.f41337b.getView().setTag(R.id.wrapped_composition_tag, null);
            Lifecycle lifecycle = this.f41340e;
            if (lifecycle != null) {
                lifecycle.c(this);
            }
        }
        this.f41338c.dispose();
    }

    @Override // androidx.compose.runtime.H
    @InterfaceC22137p
    public final void z7(@Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, kotlin.G0> pVar) {
        this.f41337b.setOnViewTreeOwnersAvailable(new a((C22096n) pVar));
    }
}
