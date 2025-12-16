package androidx.compose.ui.window;

import android.annotation.SuppressLint;
import android.graphics.Rect;
import android.os.Build;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.WindowManager;
import android.window.OnBackInvokedCallback;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.C22143q0;
import androidx.compose.runtime.I3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.snapshots.AbstractC22167l;
import androidx.compose.runtime.snapshots.C22166k;
import androidx.compose.ui.platform.AbstractC22450a;
import androidx.compose.ui.platform.C2;
import androidx.compose.ui.unit.LayoutDirection;
import androidx.compose.ui.unit.h;
import androidx.compose.ui.unit.q;
import androidx.view.C23489g;
import androidx.view.V0;
import androidx.view.X0;
import com.avito.android.R;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import j.k0;
import java.util.Set;
import java.util.UUID;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidPopup.android.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001PJ\u0017\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0003H\u0016¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0002¢\u0006\u0004\b\t\u0010\nR\"\u0010\u0012\u001a\u00020\u000b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\f\u0010\r\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R \u0010\u001a\u001a\u00020\u00138\u0000X\u0081\u0004¢\u0006\u0012\n\u0004\b\u0014\u0010\u0015\u0012\u0004\b\u0018\u0010\u0019\u001a\u0004\b\u0016\u0010\u0017R\"\u0010\"\u001a\u00020\u001b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u001c\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f\"\u0004\b \u0010!R\"\u0010*\u001a\u00020#8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b$\u0010%\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R5\u00103\u001a\u0004\u0018\u00010+2\b\u0010,\u001a\u0004\u0018\u00010+8F@FX\u0086\u008e\u0002ø\u0001\u0000ø\u0001\u0001¢\u0006\u0012\n\u0004\b-\u0010.\u001a\u0004\b/\u00100\"\u0004\b1\u00102R/\u0010:\u001a\u0004\u0018\u0001042\b\u0010,\u001a\u0004\u0018\u0001048B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\b5\u0010.\u001a\u0004\b6\u00107\"\u0004\b8\u00109R\u001b\u0010@\u001a\u00020;8FX\u0086\u0084\u0002¢\u0006\f\n\u0004\b<\u0010=\u001a\u0004\b>\u0010?RA\u0010H\u001a\r\u0012\u0004\u0012\u00020\u00050A¢\u0006\u0002\bB2\u0011\u0010,\u001a\r\u0012\u0004\u0012\u00020\u00050A¢\u0006\u0002\bB8B@BX\u0082\u008e\u0002¢\u0006\u0012\n\u0004\bC\u0010.\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR$\u0010L\u001a\u00020;2\u0006\u0010,\u001a\u00020;8\u0014@RX\u0094\u000e¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010?R\u0014\u0010O\u001a\u00020\u00018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bM\u0010N\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006Q"}, d2 = {"Landroidx/compose/ui/window/L;", "Landroidx/compose/ui/platform/a;", "Landroidx/compose/ui/platform/C2;", "", "layoutDirection", "Lkotlin/G0;", "setLayoutDirection", "(I)V", "Landroidx/compose/ui/unit/s;", "getVisibleDisplayBounds", "()Landroidx/compose/ui/unit/s;", "", "l", "Ljava/lang/String;", "getTestTag", "()Ljava/lang/String;", "setTestTag", "(Ljava/lang/String;)V", "testTag", "Landroid/view/WindowManager$LayoutParams;", "p", "Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release", "()Landroid/view/WindowManager$LayoutParams;", "getParams$ui_release$annotations", "()V", "params", "Landroidx/compose/ui/window/T;", "q", "Landroidx/compose/ui/window/T;", "getPositionProvider", "()Landroidx/compose/ui/window/T;", "setPositionProvider", "(Landroidx/compose/ui/window/T;)V", "positionProvider", "Landroidx/compose/ui/unit/LayoutDirection;", "r", "Landroidx/compose/ui/unit/LayoutDirection;", "getParentLayoutDirection", "()Landroidx/compose/ui/unit/LayoutDirection;", "setParentLayoutDirection", "(Landroidx/compose/ui/unit/LayoutDirection;)V", "parentLayoutDirection", "Landroidx/compose/ui/unit/u;", "<set-?>", "s", "Landroidx/compose/runtime/y1;", "getPopupContentSize-bOM6tXw", "()Landroidx/compose/ui/unit/u;", "setPopupContentSize-fhxjrPA", "(Landroidx/compose/ui/unit/u;)V", "popupContentSize", "Landroidx/compose/ui/layout/A;", "t", "getParentLayoutCoordinates", "()Landroidx/compose/ui/layout/A;", "setParentLayoutCoordinates", "(Landroidx/compose/ui/layout/A;)V", "parentLayoutCoordinates", "", "v", "Landroidx/compose/runtime/I3;", "getCanCalculatePosition", "()Z", "canCalculatePosition", "Lkotlin/Function0;", "Landroidx/compose/runtime/o;", "z", "getContent", "()LY41/p;", "setContent", "(LY41/p;)V", "content", "A", "Z", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getSubCompositionView", "()Landroidx/compose/ui/platform/a;", "subCompositionView", "b", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes.dex */
public final class L extends AbstractC22450a implements C2 {

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public static final Y41.l<L, G0> f43033C;

    /* renamed from: A, reason: collision with root package name and from kotlin metadata */
    public boolean shouldCreateCompositionOnAttachedToWindow;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final int[] f43035B;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f43036j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public U f43037k;

    /* renamed from: l, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public String testTag;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final View f43039m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final P f43040n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final WindowManager f43041o;

    /* renamed from: p, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final WindowManager.LayoutParams params;

    /* renamed from: q, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public T positionProvider;

    /* renamed from: r, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public LayoutDirection parentLayoutDirection;

    /* renamed from: s, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 popupContentSize;

    /* renamed from: t, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 parentLayoutCoordinates;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public androidx.compose.ui.unit.s f43047u;

    /* renamed from: v, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final I3 canCalculatePosition;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final Rect f43049w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.runtime.snapshots.H f43050x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public C f43051y;

    /* renamed from: z, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final InterfaceC22204y1 content;

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/ui/window/L;", "popupLayout", "Lkotlin/G0;", "invoke", "(Landroidx/compose/ui/window/L;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a extends kotlin.jvm.internal.N implements Y41.l<L, G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f43053l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(L l12) {
            L l13 = l12;
            if (l13.isAttachedToWindow()) {
                l13.o();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Landroidx/compose/ui/window/L$b;", "", "<init>", "()V", "Lkotlin/Function1;", "Landroidx/compose/ui/window/L;", "Lkotlin/G0;", "onCommitAffectingPopupPosition", "LY41/l;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: AndroidPopup.android.kt */
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

    /* compiled from: AndroidPopup.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends kotlin.jvm.internal.N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ l0.g f43054l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ L f43055m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.unit.s f43056n;

        /* renamed from: o, reason: collision with root package name */
        public final /* synthetic */ long f43057o;

        /* renamed from: p, reason: collision with root package name */
        public final /* synthetic */ long f43058p;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(l0.g gVar, L l12, androidx.compose.ui.unit.s sVar, long j12, long j13) {
            super(0);
            this.f43054l = gVar;
            this.f43055m = l12;
            this.f43056n = sVar;
            this.f43057o = j12;
            this.f43058p = j13;
        }

        @Override // Y41.a
        public final G0 invoke() {
            L l12 = this.f43055m;
            T positionProvider = l12.getPositionProvider();
            LayoutDirection parentLayoutDirection = l12.getParentLayoutDirection();
            this.f43054l.f406841b = positionProvider.a(this.f43056n, this.f43057o, parentLayoutDirection, this.f43058p);
            return G0.f406611a;
        }
    }

    static {
        new b(null);
        f43033C = a.f43053l;
    }

    public L() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public L(Y41.a aVar, U u12, String str, View view, androidx.compose.ui.unit.d dVar, T t12, UUID uuid, P p12, int i12, C42822w c42822w) {
        P q12;
        super(view.getContext(), null, 0, 6, null);
        if ((i12 & 128) != 0) {
            q12 = Build.VERSION.SDK_INT >= 29 ? new Q() : new S();
        } else {
            q12 = p12;
        }
        this.f43036j = aVar;
        this.f43037k = u12;
        this.testTag = str;
        this.f43039m = view;
        this.f43040n = q12;
        this.f43041o = (WindowManager) view.getContext().getSystemService("window");
        WindowManager.LayoutParams layoutParams = new WindowManager.LayoutParams();
        layoutParams.gravity = 8388659;
        U u13 = this.f43037k;
        boolean zC2 = C22725l.c(view);
        boolean z12 = u13.f43067b;
        int i13 = u13.f43066a;
        if (z12 && zC2) {
            i13 |= 8192;
        } else if (z12 && !zC2) {
            i13 &= -8193;
        }
        layoutParams.flags = i13;
        layoutParams.type = 1002;
        layoutParams.token = view.getApplicationWindowToken();
        layoutParams.width = -2;
        layoutParams.height = -2;
        layoutParams.format = -3;
        layoutParams.setTitle(view.getContext().getResources().getString(R.string.default_popup_window_title));
        this.params = layoutParams;
        this.positionProvider = t12;
        this.parentLayoutDirection = LayoutDirection.f42838b;
        this.popupContentSize = C22126m3.g(null);
        this.parentLayoutCoordinates = C22126m3.g(null);
        this.canCalculatePosition = C22126m3.d(new M(this));
        h.a aVar2 = androidx.compose.ui.unit.h.f42849c;
        this.f43049w = new Rect();
        this.f43050x = new androidx.compose.runtime.snapshots.H(new O(this));
        setId(android.R.id.content);
        V0.b(this, V0.a(view));
        X0.b(this, X0.a(view));
        C23489g.b(this, C23489g.a(view));
        setTag(R.id.compose_view_saveable_id_tag, "Popup:" + uuid);
        setClipChildren(false);
        setElevation(dVar.M0((float) 8));
        setOutlineProvider(new K());
        F.f43013a.getClass();
        this.content = C22126m3.g(F.f43014b);
        this.f43035B = new int[2];
    }

    private final Y41.p<androidx.compose.runtime.A, Integer, G0> getContent() {
        return (Y41.p) ((C22082i3) this.content).getF42167b();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final androidx.compose.ui.layout.A getParentLayoutCoordinates() {
        return (androidx.compose.ui.layout.A) ((C22082i3) this.parentLayoutCoordinates).getF42167b();
    }

    private final androidx.compose.ui.unit.s getVisibleDisplayBounds() {
        P p12 = this.f43040n;
        View view = this.f43039m;
        Rect rect = this.f43049w;
        p12.c(view, rect);
        C22143q0 c22143q0 = C22725l.f43092a;
        return new androidx.compose.ui.unit.s(rect.left, rect.top, rect.right, rect.bottom);
    }

    private final void setContent(Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar) {
        ((C22082i3) this.content).setValue(pVar);
    }

    private final void setParentLayoutCoordinates(androidx.compose.ui.layout.A a12) {
        ((C22082i3) this.parentLayoutCoordinates).setValue(a12);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    @androidx.compose.ui.D
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        a12.C(-857613600);
        getContent().invoke(a12, 0);
        a12.h();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchKeyEvent(@Y61.k KeyEvent keyEvent) {
        if (!this.f43037k.f43068c) {
            return super.dispatchKeyEvent(keyEvent);
        }
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
                Y41.a<G0> aVar = this.f43036j;
                if (aVar != null) {
                    aVar.invoke();
                }
                return true;
            }
        }
        return super.dispatchKeyEvent(keyEvent);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    public final void f(int i12, int i13, int i14, int i15, boolean z12) {
        View childAt;
        super.f(i12, i13, i14, i15, z12);
        if (this.f43037k.f43071f || (childAt = getChildAt(0)) == null) {
            return;
        }
        WindowManager.LayoutParams layoutParams = this.params;
        layoutParams.width = childAt.getMeasuredWidth();
        layoutParams.height = childAt.getMeasuredHeight();
        this.f43040n.b(this.f43041o, this, layoutParams);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    public final void g(int i12, int i13) {
        if (this.f43037k.f43071f) {
            super.g(i12, i13);
        } else {
            androidx.compose.ui.unit.s visibleDisplayBounds = getVisibleDisplayBounds();
            super.g(View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.d(), BeduinInputModel.MIN_TEXT_VERSION), View.MeasureSpec.makeMeasureSpec(visibleDisplayBounds.b(), BeduinInputModel.MIN_TEXT_VERSION));
        }
    }

    public final boolean getCanCalculatePosition() {
        return ((Boolean) this.canCalculatePosition.getF42167b()).booleanValue();
    }

    @Y61.k
    /* renamed from: getParams$ui_release, reason: from getter */
    public final WindowManager.LayoutParams getParams() {
        return this.params;
    }

    @Y61.k
    public final LayoutDirection getParentLayoutDirection() {
        return this.parentLayoutDirection;
    }

    @Y61.l
    /* renamed from: getPopupContentSize-bOM6tXw, reason: not valid java name */
    public final androidx.compose.ui.unit.u m5getPopupContentSizebOM6tXw() {
        return (androidx.compose.ui.unit.u) ((C22082i3) this.popupContentSize).getF42167b();
    }

    @Y61.k
    public final T getPositionProvider() {
        return this.positionProvider;
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public boolean getF36601u() {
        return this.shouldCreateCompositionOnAttachedToWindow;
    }

    @Y61.k
    public final String getTestTag() {
        return this.testTag;
    }

    @Y61.l
    public /* bridge */ /* synthetic */ View getViewRoot() {
        return null;
    }

    public final void k(@Y61.k androidx.compose.runtime.I i12, @Y61.k Y41.p<? super androidx.compose.runtime.A, ? super Integer, G0> pVar) {
        setParentCompositionContext(i12);
        setContent(pVar);
        this.shouldCreateCompositionOnAttachedToWindow = true;
    }

    public final void l(@Y61.l Y41.a<G0> aVar, @Y61.k U u12, @Y61.k String str, @Y61.k LayoutDirection layoutDirection) {
        int i12;
        this.f43036j = aVar;
        this.testTag = str;
        if (!kotlin.jvm.internal.L.f(this.f43037k, u12)) {
            boolean z12 = u12.f43071f;
            WindowManager.LayoutParams layoutParams = this.params;
            if (z12 && !this.f43037k.f43071f) {
                layoutParams.width = -2;
                layoutParams.height = -2;
            }
            this.f43037k = u12;
            boolean zC2 = C22725l.c(this.f43039m);
            boolean z13 = u12.f43067b;
            int i13 = u12.f43066a;
            if (z13 && zC2) {
                i13 |= 8192;
            } else if (z13 && !zC2) {
                i13 &= -8193;
            }
            layoutParams.flags = i13;
            this.f43040n.b(this.f43041o, this, layoutParams);
        }
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

    @k0
    public final void m() {
        androidx.compose.ui.layout.A parentLayoutCoordinates = getParentLayoutCoordinates();
        if (parentLayoutCoordinates != null) {
            if (!parentLayoutCoordinates.m()) {
                parentLayoutCoordinates = null;
            }
            if (parentLayoutCoordinates == null) {
                return;
            }
            long jA2 = parentLayoutCoordinates.a();
            long jF2 = androidx.compose.ui.layout.B.f(parentLayoutCoordinates);
            q.a aVar = androidx.compose.ui.unit.q.f42862b;
            androidx.compose.ui.unit.s sVarA = androidx.compose.ui.unit.t.a((Math.round(Float.intBitsToFloat((int) (jF2 >> 32))) << 32) | (4294967295L & Math.round(Float.intBitsToFloat((int) (jF2 & 4294967295L)))), jA2);
            if (sVarA.equals(this.f43047u)) {
                return;
            }
            this.f43047u = sVarA;
            o();
        }
    }

    public final void n(@Y61.k androidx.compose.ui.layout.A a12) {
        setParentLayoutCoordinates(a12);
        m();
    }

    public final void o() {
        androidx.compose.ui.unit.u uVarM5getPopupContentSizebOM6tXw;
        androidx.compose.ui.unit.s sVar = this.f43047u;
        if (sVar == null || (uVarM5getPopupContentSizebOM6tXw = m5getPopupContentSizebOM6tXw()) == null) {
            return;
        }
        androidx.compose.ui.unit.s visibleDisplayBounds = getVisibleDisplayBounds();
        long jD2 = (visibleDisplayBounds.d() << 32) | (visibleDisplayBounds.b() & 4294967295L);
        l0.g gVar = new l0.g();
        androidx.compose.ui.unit.q.f42862b.getClass();
        gVar.f406841b = 0L;
        this.f43050x.e(this, f43033C, new d(gVar, this, sVar, jD2, uVarM5getPopupContentSizebOM6tXw.f42872a));
        WindowManager.LayoutParams layoutParams = this.params;
        long j12 = gVar.f406841b;
        layoutParams.x = (int) (j12 >> 32);
        layoutParams.y = (int) (j12 & 4294967295L);
        boolean z12 = this.f43037k.f43070e;
        P p12 = this.f43040n;
        if (z12) {
            p12.a(this, (int) (jD2 >> 32), (int) (4294967295L & jD2));
        }
        p12.b(this.f43041o, this, layoutParams);
    }

    /* JADX WARN: Type inference failed for: r1v4, types: [androidx.compose.ui.window.C] */
    @Override // androidx.compose.ui.platform.AbstractC22450a, android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        androidx.compose.runtime.snapshots.H h12 = this.f43050x;
        h12.getClass();
        AbstractC22167l.a aVar = AbstractC22167l.f38720e;
        Y41.p<Set<? extends Object>, AbstractC22167l, G0> pVar = h12.f38630d;
        aVar.getClass();
        h12.f38634h = AbstractC22167l.a.d(pVar);
        if (!this.f43037k.f43068c || Build.VERSION.SDK_INT < 33) {
            return;
        }
        if (this.f43051y == null) {
            final Y41.a<G0> aVar2 = this.f43036j;
            int i12 = D.f43009a;
            this.f43051y = new OnBackInvokedCallback() { // from class: androidx.compose.ui.window.C
                @Override // android.window.OnBackInvokedCallback
                public final void onBackInvoked() {
                    Y41.a aVar3 = aVar2;
                    int i13 = D.f43009a;
                    if (aVar3 != null) {
                        aVar3.invoke();
                    }
                }
            };
        }
        D.a(this, this.f43051y);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        androidx.compose.runtime.snapshots.H h12 = this.f43050x;
        C22166k c22166k = h12.f38634h;
        if (c22166k != null) {
            c22166k.dispose();
        }
        h12.b();
        if (Build.VERSION.SDK_INT >= 33) {
            D.b(this, this.f43051y);
        }
        this.f43051y = null;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(@Y61.l MotionEvent motionEvent) {
        if (!this.f43037k.f43069d) {
            return super.onTouchEvent(motionEvent);
        }
        if (motionEvent != null && motionEvent.getAction() == 0 && (motionEvent.getX() < 0.0f || motionEvent.getX() >= getWidth() || motionEvent.getY() < 0.0f || motionEvent.getY() >= getHeight())) {
            Y41.a<G0> aVar = this.f43036j;
            if (aVar != null) {
                aVar.invoke();
            }
            return true;
        }
        if (motionEvent == null || motionEvent.getAction() != 4) {
            return super.onTouchEvent(motionEvent);
        }
        Y41.a<G0> aVar2 = this.f43036j;
        if (aVar2 != null) {
            aVar2.invoke();
        }
        return true;
    }

    public final void setParentLayoutDirection(@Y61.k LayoutDirection layoutDirection) {
        this.parentLayoutDirection = layoutDirection;
    }

    /* renamed from: setPopupContentSize-fhxjrPA, reason: not valid java name */
    public final void m6setPopupContentSizefhxjrPA(@Y61.l androidx.compose.ui.unit.u uVar) {
        ((C22082i3) this.popupContentSize).setValue(uVar);
    }

    public final void setPositionProvider(@Y61.k T t12) {
        this.positionProvider = t12;
    }

    public final void setTestTag(@Y61.k String str) {
        this.testTag = str;
    }

    @k0
    public static /* synthetic */ void getParams$ui_release$annotations() {
    }

    @Y61.k
    public AbstractC22450a getSubCompositionView() {
        return this;
    }

    @Override // android.view.View
    public void setLayoutDirection(int layoutDirection) {
    }
}
