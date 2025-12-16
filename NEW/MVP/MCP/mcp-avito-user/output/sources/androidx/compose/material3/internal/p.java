package androidx.compose.material3.internal;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewTreeObserver;
import android.view.WindowManager;
import androidx.compose.material3.U6;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
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
import androidx.compose.ui.unit.s;
import androidx.compose.ui.unit.u;
import androidx.view.C23489g;
import androidx.view.V0;
import androidx.view.X0;
import com.avito.android.R;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;

/* compiled from: ExposedDropdownMenuPopup.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0003\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/internal/p;", "Landroidx/compose/ui/platform/a;", "Landroidx/compose/ui/platform/C2;", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
final class p extends AbstractC22450a implements C2, ViewTreeObserver.OnGlobalLayoutListener {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final View f36590j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final U6 f36591k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final WindowManager f36592l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final WindowManager.LayoutParams f36593m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public LayoutDirection f36594n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f36595o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f36596p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final I3 f36597q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final Rect f36598r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final Rect f36599s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f36600t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f36601u;

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public static final class a extends N implements Y41.p<A, Integer, G0> {
        public a(int i12) {
            super(2);
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(1);
            p.this.a(a12, iA2);
            return G0.f406611a;
        }
    }

    /* compiled from: ExposedDropdownMenuPopup.android.kt */
    @Metadata(k = 3, mv = {1, 8, 0}, xi = 48)
    public /* synthetic */ class b {
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

    public p(@Y61.k View view, @Y61.k U6 u62, boolean z12, @Y61.k androidx.compose.ui.unit.d dVar, @Y61.k UUID uuid) {
        super(view.getContext(), null, 0, 6, null);
        this.f36590j = view;
        this.f36591k = u62;
        this.f36592l = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        layoutParams.flags = 393248;
        layoutParams.flags = z12 ? 393216 : 393248;
        layoutParams.softInputMode = 1;
        layoutParams.type = 1000;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.f36593m = layoutParams;
        this.f36594n = LayoutDirection.f42838b;
        this.f36595o = C22126m3.g(null);
        this.f36596p = C22126m3.g(null);
        this.f36597q = C22126m3.d(new q(this));
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        this.f36598r = new Rect();
        this.f36599s = new Rect();
        setId(android.R.id.content);
        V0.b(this, V0.a(view));
        X0.b(this, X0.a(view));
        C23489g.b(this, C23489g.a(view));
        view.getViewTreeObserver().addOnGlobalLayoutListener(this);
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.M0((float) 8));
        setOutlineProvider(new o());
        androidx.compose.material3.internal.a.f36565a.getClass();
        this.f36600t = C22126m3.g(androidx.compose.material3.internal.a.f36566b);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    public final void a(@Y61.l A a12, int i12) {
        B bE2 = a12.E(-1284481754);
        if ((((bE2.u(this) ? 4 : 2) | i12) & 3) == 2 && bE2.c()) {
            bE2.f();
        } else {
            ((Y41.p) ((C22082i3) this.f36600t).getF42167b()).invoke(bE2, 0);
        }
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new a(i12);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@Y61.k KeyEvent keyEvent) {
        KeyEvent.DispatcherState keyDispatcherState;
        if (keyEvent.getKeyCode() == 4) {
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
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getF36601u() {
        return this.f36601u;
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
        u uVar;
        s sVar = (s) ((C22082i3) this.f36595o).getF42167b();
        if (sVar == null || (uVar = (u) ((C22082i3) this.f36596p).getF42167b()) == null) {
            return;
        }
        View view = this.f36590j;
        Rect rect = this.f36598r;
        view.getWindowVisibleDisplayFrame(rect);
        s sVar2 = new s(rect.left, rect.top, rect.right, rect.bottom);
        long jD2 = (sVar2.d() << 32) | (sVar2.b() & 4294967295L);
        u.a aVar = u.f42871b;
        long jA2 = this.f36591k.a(sVar, jD2, this.f36594n, uVar.f42872a);
        WindowManager.LayoutParams layoutParams = this.f36593m;
        q.a aVar2 = androidx.compose.ui.unit.q.f42862b;
        layoutParams.x = (int) (jA2 >> 32);
        layoutParams.y = (int) (jA2 & 4294967295L);
        this.f36592l.updateViewLayout(this, layoutParams);
    }

    @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
    public final void onGlobalLayout() {
        View view = this.f36590j;
        Rect rect = this.f36599s;
        view.getWindowVisibleDisplayFrame(rect);
        if (L.f(rect, this.f36598r)) {
            return;
        }
        k();
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@Y61.l MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent.getAction() == 4 || (motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight()))) {
            boolean z12 = motionEvent.getRawX() == 0.0f && motionEvent.getRawY() == 0.0f;
            if (((s) ((C22082i3) this.f36595o).getF42167b()) == null || !z12) {
                return true;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final void setLayoutDirection(int i12) {
    }
}
