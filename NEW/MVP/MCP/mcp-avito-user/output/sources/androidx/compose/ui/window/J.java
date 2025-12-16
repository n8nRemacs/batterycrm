package androidx.compose.ui.window;

import android.graphics.Outline;
import android.os.Build;
import android.view.ContextThemeWrapper;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewOutlineProvider;
import android.view.Window;
import android.view.WindowManager;
import androidx.compose.ui.platform.C2;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import androidx.core.view.F0;
import androidx.view.C19918B;
import androidx.view.C23489g;
import androidx.view.V0;
import androidx.view.X0;
import com.avito.android.R;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidDialog.android.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Landroidx/compose/ui/window/J;", "Landroidx/activity/r;", "Landroidx/compose/ui/platform/C2;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class J extends androidx.view.r implements C2 {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public Y41.a<G0> f43028e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public H f43029f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final View f43030g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final G f43031h;

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/window/J$a", "Landroid/view/ViewOutlineProvider;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.setRect(0, 0, view.getWidth(), view.getHeight());
            outline.setAlpha(0.0f);
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroidx/activity/x;", "Lkotlin/G0;", "invoke", "(Landroidx/activity/x;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<androidx.view.x, G0> {
        public b() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(androidx.view.x xVar) {
            J j12 = J.this;
            if (j12.f43029f.f43023a) {
                j12.f43028e.invoke();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidDialog.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
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

    /* JADX WARN: Multi-variable type inference failed */
    public J(@Y61.k Y41.a<G0> aVar, @Y61.k H h12, @Y61.k View view, @Y61.k LayoutDirection layoutDirection, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k UUID uuid) {
        super(new ContextThemeWrapper(view.getContext(), h12.f43027e ? R.style.DialogWindowTheme : R.style.FloatingDialogWindowTheme), 0, 2, 0 == true ? 1 : 0);
        this.f43028e = aVar;
        this.f43029f = h12;
        this.f43030g = view;
        float f12 = 8;
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        Window window = getWindow();
        if (window == null) {
            throw new IllegalStateException("Dialog has no window");
        }
        window.requestFeature(1);
        window.setBackgroundDrawableResource(android.R.color.transparent);
        F0.a(window, this.f43029f.f43027e);
        window.setGravity(17);
        G g12 = new G(getContext(), window);
        g12.setTag(R.id.compose_view_saveable_id_tag, "Dialog:" + uuid);
        g12.setClipChildren(false);
        g12.setElevation(dVar.M0(f12));
        g12.setOutlineProvider(new a());
        this.f43031h = g12;
        View decorView = window.getDecorView();
        ViewGroup viewGroup = decorView instanceof ViewGroup ? (ViewGroup) decorView : null;
        if (viewGroup != null) {
            n(viewGroup);
        }
        setContentView(g12);
        V0.b(g12, V0.a(view));
        X0.b(g12, X0.a(view));
        C23489g.b(g12, C23489g.a(view));
        o(this.f43028e, this.f43029f, layoutDirection);
        C19918B.a(this.f21241d, this, new b(), 2);
    }

    public static final void n(ViewGroup viewGroup) {
        viewGroup.setClipChildren(false);
        if (viewGroup instanceof G) {
            return;
        }
        int childCount = viewGroup.getChildCount();
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = viewGroup.getChildAt(i12);
            ViewGroup viewGroup2 = childAt instanceof ViewGroup ? (ViewGroup) childAt : null;
            if (viewGroup2 != null) {
                n(viewGroup2);
            }
        }
    }

    public final void o(@Y61.k Y41.a<G0> aVar, @Y61.k H h12, @Y61.k LayoutDirection layoutDirection) {
        int i12;
        this.f43028e = aVar;
        this.f43029f = h12;
        SecureFlagPolicy secureFlagPolicy = h12.f43025c;
        boolean zC2 = C22725l.c(this.f43030g);
        int iOrdinal = secureFlagPolicy.ordinal();
        if (iOrdinal != 0) {
            if (iOrdinal == 1) {
                zC2 = true;
            } else {
                if (iOrdinal != 2) {
                    throw new NoWhenBranchMatchedException();
                }
                zC2 = false;
            }
        }
        getWindow().setFlags(zC2 ? 8192 : -8193, 8192);
        int iOrdinal2 = layoutDirection.ordinal();
        if (iOrdinal2 == 0) {
            i12 = 0;
        } else {
            if (iOrdinal2 != 1) {
                throw new NoWhenBranchMatchedException();
            }
            i12 = 1;
        }
        G g12 = this.f43031h;
        g12.setLayoutDirection(i12);
        boolean z12 = g12.f43020n;
        boolean z13 = h12.f43027e;
        boolean z14 = h12.f43026d;
        boolean z15 = (z12 && z14 == g12.f43018l && z13 == g12.f43019m) ? false : true;
        g12.f43018l = z14;
        g12.f43019m = z13;
        if (z15) {
            Window window = g12.f43016j;
            WindowManager.LayoutParams attributes = window.getAttributes();
            int i13 = z14 ? -2 : -1;
            if (i13 != attributes.width || !g12.f43020n) {
                window.setLayout(i13, -2);
                g12.f43020n = true;
            }
        }
        setCanceledOnTouchOutside(h12.f43024b);
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setSoftInputMode(z13 ? 0 : Build.VERSION.SDK_INT < 31 ? 16 : 48);
        }
    }

    @Override // android.app.Dialog, android.view.KeyEvent.Callback
    public final boolean onKeyUp(int i12, @Y61.k KeyEvent keyEvent) {
        if (!this.f43029f.f43023a || !keyEvent.isTracking() || keyEvent.isCanceled() || i12 != 111) {
            return super.onKeyUp(i12, keyEvent);
        }
        this.f43028e.invoke();
        return true;
    }

    @Override // android.app.Dialog
    public final boolean onTouchEvent(@Y61.k MotionEvent motionEvent) {
        View childAt;
        int iB2;
        boolean zOnTouchEvent = super.onTouchEvent(motionEvent);
        if (!this.f43029f.f43024b) {
            return zOnTouchEvent;
        }
        G g12 = this.f43031h;
        g12.getClass();
        float x12 = motionEvent.getX();
        if (!Float.isInfinite(x12) && !Float.isNaN(x12)) {
            float y12 = motionEvent.getY();
            if (!Float.isInfinite(y12) && !Float.isNaN(y12) && (childAt = g12.getChildAt(0)) != null) {
                int left = childAt.getLeft() + g12.getLeft();
                int width = childAt.getWidth() + left;
                int top = childAt.getTop() + g12.getTop();
                int height = childAt.getHeight() + top;
                int iB3 = kotlin.math.b.b(motionEvent.getX());
                if (left <= iB3 && iB3 <= width && top <= (iB2 = kotlin.math.b.b(motionEvent.getY())) && iB2 <= height) {
                    return zOnTouchEvent;
                }
            }
        }
        this.f43028e.invoke();
        return true;
    }

    @Override // android.app.Dialog, android.content.DialogInterface
    public final void cancel() {
    }
}
