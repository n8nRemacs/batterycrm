package androidx.compose.material3;

import android.R;
import android.os.Build;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.compose.material3.P9;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.AbstractC22450a;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.window.SecureFlagPolicy;
import androidx.view.C23489g;
import j.InterfaceC42164u;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;

/* compiled from: ModalBottomSheet.android.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/P9;", "Landroidx/compose/ui/platform/a;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "Landroidx/compose/ui/platform/C2;", "a", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
final class P9 extends AbstractC22450a implements ViewTreeObserver.OnGlobalLayoutListener, androidx.compose.ui.platform.C2 {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final N9 f35289j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Y41.a<kotlin.G0> f35290k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final View f35291l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public Object f35292m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final WindowManager f35293n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final WindowManager.LayoutParams f35294o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f35295p;

    /* renamed from: q, reason: collision with root package name */
    public boolean f35296q;

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\b\u001a\u00020\u00072\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0007¢\u0006\u0004\b\b\u0010\tJ!\u0010\r\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u000f\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0001H\u0007¢\u0006\u0004\b\u000f\u0010\u000e¨\u0006\u0010"}, d2 = {"Landroidx/compose/material3/P9$a;", "", "<init>", "()V", "Lkotlin/Function0;", "Lkotlin/G0;", "onDismissRequest", "Landroid/window/OnBackInvokedCallback;", "a", "(LY41/a;)Landroid/window/OnBackInvokedCallback;", "Landroid/view/View;", "view", "backCallback", "b", "(Landroid/view/View;Ljava/lang/Object;)V", "c", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    @j.X
    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f35297a = 0;

        static {
            new a();
        }

        @X41.n
        @InterfaceC42164u
        @Y61.k
        public static final OnBackInvokedCallback a(@Y61.k final Y41.a<kotlin.G0> onDismissRequest) {
            return new OnBackInvokedCallback() { // from class: androidx.compose.material3.O9
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    Y41.a aVar = onDismissRequest;
                    int i12 = P9.a.f35297a;
                    aVar.invoke();
                }
            };
        }

        @X41.n
        @InterfaceC42164u
        public static final void b(@Y61.k View view, @Y61.l Object backCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) backCallback);
        }

        @X41.n
        @InterfaceC42164u
        public static final void c(@Y61.k View view, @Y61.l Object backCallback) {
            OnBackInvokedDispatcher onBackInvokedDispatcherFindOnBackInvokedDispatcher;
            if (!(backCallback instanceof OnBackInvokedCallback) || (onBackInvokedDispatcherFindOnBackInvokedDispatcher = view.findOnBackInvokedDispatcher()) == null) {
                return;
            }
            onBackInvokedDispatcherFindOnBackInvokedDispatcher.unregisterOnBackInvokedCallback((OnBackInvokedCallback) backCallback);
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public b(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            P9.this.a(a12, iA2);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ModalBottomSheet.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class c {
        static {
            int[] iArr = new int[LayoutDirection.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                LayoutDirection layoutDirection = LayoutDirection.f42838b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
        }
    }

    public P9(@Y61.k N9 n92, @Y61.k Y41.a<kotlin.G0> aVar, @Y61.k View view, @Y61.k UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        this.f35289j = n92;
        this.f35290k = aVar;
        this.f35291l = view;
        setId(R.id.content);
        androidx.view.V0.b(this, androidx.view.V0.a(view));
        androidx.view.X0.b(this, androidx.view.X0.a(view));
        C23489g.b(this, C23489g.a(view));
        setTag(com.avito.android.R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        boolean z12 = false;
        setClipChildren(false);
        this.f35293n = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388691;
        layoutParams.type = 1000;
        layoutParams.width = getContext().getResources().getDisplayMetrics().widthPixels;
        layoutParams.height = -1;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(com.avito.android.R.string.default_popup_window_title));
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.flags = (layoutParams.flags & (-163841)) | 512;
        SecureFlagPolicy secureFlagPolicy = n92.f35178a;
        ViewGroup.LayoutParams layoutParams2 = view.getRootView().getLayoutParams();
        WindowManager.LayoutParams layoutParams3 = layoutParams2 instanceof WindowManager.LayoutParams ? (WindowManager.LayoutParams) layoutParams2 : null;
        boolean z13 = (layoutParams3 == null || (layoutParams3.flags & 8192) == 0) ? false : true;
        int iOrdinal = secureFlagPolicy.ordinal();
        if (iOrdinal == 0) {
            z12 = z13;
        } else if (iOrdinal == 1) {
            z12 = true;
        } else if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        if (z12) {
            layoutParams.flags |= 8192;
        } else {
            layoutParams.flags &= -8193;
        }
        layoutParams.flags &= -9;
        this.f35294o = layoutParams;
        D3.f34610a.getClass();
        this.f35295p = C22126m3.g(D3.f34611b);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        androidx.compose.runtime.B bE2 = a12.E(-463309699);
        if ((((bE2.u(this) ? 4 : 2) | i12) & 3) == 2 && bE2.c()) {
            bE2.f();
        } else {
            ((Y41.p) ((C22082i3) this.f35295p).getF42167b()).invoke(bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new b(i12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@Y61.k KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4) {
            this.f35289j.getClass();
            if (getKeyDispatcherState() == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                KeyEvent.DispatcherState keyDispatcherState2 = getKeyDispatcherState();
                if (keyDispatcherState2 != null) {
                    keyDispatcherState2.startTracking(keyEvent, this);
                }
                return true;
            }
            if (keyEvent.getAction() == 1 && (keyDispatcherState = getKeyDispatcherState()) != null && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                this.f35290k.invoke();
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getF35296q() {
        return this.f35296q;
    }

    public final void j(@Y61.k LayoutDirection layoutDirection) {
        int i12;
        int iOrdinal = layoutDirection.ordinal();
        if (iOrdinal != 0) {
            i12 = 1;
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
        } else {
            i12 = 0;
        }
        super.setLayoutDirection(i12);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f35289j.getClass();
        if (Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f35292m == null) {
            this.f35292m = a.a(this.f35290k);
        }
        a.b(this, this.f35292m);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        if (Build.VERSION.SDK_INT >= 33) {
            a.c(this, this.f35292m);
        }
        this.f35292m = null;
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i12) {
    }
}
