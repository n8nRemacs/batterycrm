package androidx.compose.material.internal;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.material.Z3;
import androidx.compose.runtime.A;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.AbstractC22450a;
import androidx.compose.ui.platform.C2;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.q;
import androidx.compose.ui.unit.v;
import androidx.view.C23489g;
import androidx.view.V0;
import androidx.view.X0;
import com.avito.android.R;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/internal/s;", "Landroidx/compose/ui/platform/a;", "Landroidx/compose/ui/platform/C2;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
final class s extends AbstractC22450a implements C2, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f33689j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final WindowManager f33690k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final WindowManager.LayoutParams f33691l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public Z3 f33692m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public LayoutDirection f33693n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f33694o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f33695p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final I3 f33696q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Rect f33697r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Rect f33698s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final Y41.p<l0.g, androidx.compose.ui.unit.s, Boolean> f33699t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f33700u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f33701v;

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
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

    public s(@Y61.k View view, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k Z3 z32, @Y61.k UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        this.f33689j = view;
        this.f33690k = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f33691l = layoutParams;
        this.f33692m = z32;
        this.f33693n = LayoutDirection.f42838b;
        this.f33694o = C22126m3.g(null);
        this.f33695p = C22126m3.g(null);
        this.f33696q = C22126m3.d(new t(this));
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        this.f33697r = new Rect();
        this.f33698s = new Rect();
        this.f33699t = u.f33703l;
        setId(android.R.id.content);
        V0.b(this, V0.a(view));
        X0.b(this, X0.a(view));
        C23489g.b(this, C23489g.a(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.M0((float) 8));
        setOutlineProvider(new r());
        androidx.compose.material.internal.a.f33659a.getClass();
        this.f33700u = C22126m3.g(androidx.compose.material.internal.a.f33660b);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    public final void a(@Y61.l A a12, int i12) {
        a12.C(-864350873);
        ((Y41.p) ((C22082i3) this.f33700u).getF42167b()).invoke(a12, 0);
        a12.h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@Y61.k KeyEvent keyEvent) {
        if (keyEvent.getKeyCode() == 4 || keyEvent.getKeyCode() == 111) {
            KeyEvent.DispatcherState keyDispatcherState = getKeyDispatcherState();
            if (keyDispatcherState == null) {
                return super.dispatchKeyEvent(keyEvent);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                keyDispatcherState.startTracking(keyEvent, this);
                return true;
            }
            if (keyEvent.getAction() == 1 && keyDispatcherState.isTracking(keyEvent) && !keyEvent.isCanceled()) {
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getF36601u() {
        return this.f33701v;
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

    public final void k() {
        androidx.compose.ui.unit.u uVar;
        androidx.compose.ui.unit.s sVar = (androidx.compose.ui.unit.s) ((C22082i3) this.f33694o).getF42167b();
        if (sVar == null || (uVar = (androidx.compose.ui.unit.u) ((C22082i3) this.f33695p).getF42167b()) == null) {
            return;
        }
        View view = this.f33689j;
        Rect rect = this.f33697r;
        view.getWindowVisibleDisplayFrame(rect);
        androidx.compose.ui.unit.s sVar2 = new androidx.compose.ui.unit.s(rect.left, rect.top, rect.right, rect.bottom);
        long jA2 = this.f33692m.a(sVar, v.a(sVar2.d(), sVar2.b()), this.f33693n, uVar.f42872a);
        WindowManager.LayoutParams layoutParams = this.f33691l;
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        layoutParams.x = (int) (jA2 >> 32);
        layoutParams.y = (int) (jA2 & 4294967295L);
        this.f33690k.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f33689j;
        Rect rect = this.f33698s;
        view.getWindowVisibleDisplayFrame(rect);
        if (L.f(rect, this.f33697r)) {
            return;
        }
        k();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@Y61.l MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if ((motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) || motionEvent.getAction() == 4) {
            androidx.compose.ui.unit.s sVar = (androidx.compose.ui.unit.s) ((C22082i3) this.f33694o).getF42167b();
            if (sVar == null) {
                return true;
            }
            if (((Boolean) ((u) this.f33699t).invoke((motionEvent.getRawX() == 0.0f || motionEvent.getRawY() == 0.0f) ? null : l0.g.a(l0.h.a(motionEvent.getRawX(), motionEvent.getRawY())), sVar)).booleanValue()) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i12) {
    }
}
