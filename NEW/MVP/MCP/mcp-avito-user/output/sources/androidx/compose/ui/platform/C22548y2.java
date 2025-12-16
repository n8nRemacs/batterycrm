package androidx.compose.ui.platform;

import android.annotation.SuppressLint;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Outline;
import android.graphics.Rect;
import android.os.Build;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.C22250e0;
import androidx.compose.ui.graphics.Path;
import androidx.compose.ui.graphics.layer.C22267c;
import androidx.compose.ui.layout.InterfaceC22385t;
import androidx.compose.ui.unit.q;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ViewLayer.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0002\u000b.R\u0017\u0010\t\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0006\u001a\u0004\b\u0007\u0010\bR\u0017\u0010\u000f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR*\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00108\u0006@BX\u0086\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u001a\u0010\u001d\u001a\u00020\u00188\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0019\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001a\u0010!\u001a\u00020\u001e8VX\u0096\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010#\u001a\u00020\u00188VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\"\u0010\u001cR$\u0010)\u001a\u00020$2\u0006\u0010\u0011\u001a\u00020$8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\b%\u0010&\"\u0004\b'\u0010(R\u0016\u0010-\u001a\u0004\u0018\u00010*8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b+\u0010,\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006/"}, d2 = {"Landroidx/compose/ui/platform/y2;", "Landroid/view/View;", "Landroidx/compose/ui/node/I0;", "Landroidx/compose/ui/layout/t;", "Landroidx/compose/ui/platform/AndroidComposeView;", "b", "Landroidx/compose/ui/platform/AndroidComposeView;", "getOwnerView", "()Landroidx/compose/ui/platform/AndroidComposeView;", "ownerView", "Landroidx/compose/ui/platform/d1;", "c", "Landroidx/compose/ui/platform/d1;", "getContainer", "()Landroidx/compose/ui/platform/d1;", "container", "", "value", "i", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "", "o", "J", "getLayerId", "()J", "layerId", "Landroidx/compose/ui/graphics/A0;", "getUnderlyingMatrix-sQKQjiQ", "()[F", "underlyingMatrix", "getOwnerViewId", "ownerViewId", "", "getCameraDistancePx", "()F", "setCameraDistancePx", "(F)V", "cameraDistancePx", "Landroidx/compose/ui/graphics/Path;", "getManualClipPath", "()Landroidx/compose/ui/graphics/Path;", "manualClipPath", "d", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.y2, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22548y2 extends View implements androidx.compose.ui.node.I0, InterfaceC22385t {

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public static final c f41643q = new c(null);

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public static final Y41.p<View, Matrix, kotlin.G0> f41644r = b.f41665l;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public static final a f41645s = new a();

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public static Method f41646t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public static Field f41647u;

    /* renamed from: v, reason: collision with root package name */
    public static boolean f41648v;

    /* renamed from: w, reason: collision with root package name */
    public static boolean f41649w;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final AndroidComposeView ownerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final C22464d1 container;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> f41652d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public Y41.a<kotlin.G0> f41653e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final L1 f41654f;

    /* renamed from: g, reason: collision with root package name */
    public boolean f41655g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public Rect f41656h;

    /* renamed from: i, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* renamed from: j, reason: collision with root package name */
    public boolean f41658j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.N f41659k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C1<View> f41660l;

    /* renamed from: m, reason: collision with root package name */
    public long f41661m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f41662n;

    /* renamed from: o, reason: collision with root package name and from kotlin metadata */
    public final long layerId;

    /* renamed from: p, reason: collision with root package name */
    public int f41664p;

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/platform/y2$a", "Landroid/view/ViewOutlineProvider;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.y2$a */
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            outline.set(((C22548y2) view).f41654f.b());
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0007\u001a\u00020\u00042\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\n¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Landroid/view/View;", "view", "Landroid/graphics/Matrix;", "matrix", "Lkotlin/G0;", "invoke", "(Landroid/view/View;Landroid/graphics/Matrix;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.y2$b */
    public static final class b extends kotlin.jvm.internal.N implements Y41.p<View, Matrix, kotlin.G0> {

        /* renamed from: l, reason: collision with root package name */
        public static final b f41665l = new b();

        public b() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(View view, Matrix matrix) {
            matrix.set(view.getMatrix());
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0018\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000b\u0010\fR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Landroidx/compose/ui/platform/y2$c;", "", "<init>", "()V", "Lkotlin/Function2;", "Landroid/view/View;", "Landroid/graphics/Matrix;", "Lkotlin/G0;", "getMatrix", "LY41/p;", "Ljava/lang/reflect/Field;", "recreateDisplayList", "Ljava/lang/reflect/Field;", "Ljava/lang/reflect/Method;", "updateDisplayListIfDirtyMethod", "Ljava/lang/reflect/Method;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.platform.y2$c */
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        @SuppressLint({"BanUncheckedReflection"})
        public static void a(@Y61.k View view) {
            try {
                if (!C22548y2.f41648v) {
                    C22548y2.f41648v = true;
                    if (Build.VERSION.SDK_INT < 28) {
                        C22548y2.f41646t = View.class.getDeclaredMethod("updateDisplayListIfDirty", new Class[0]);
                        C22548y2.f41647u = View.class.getDeclaredField("mRecreateDisplayList");
                    } else {
                        C22548y2.f41646t = (Method) Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass()).invoke(View.class, "updateDisplayListIfDirty", new Class[0]);
                        C22548y2.f41647u = (Field) Class.class.getDeclaredMethod("getDeclaredField", String.class).invoke(View.class, "mRecreateDisplayList");
                    }
                    Method method = C22548y2.f41646t;
                    if (method != null) {
                        method.setAccessible(true);
                    }
                    Field field = C22548y2.f41647u;
                    if (field != null) {
                        field.setAccessible(true);
                    }
                }
                Field field2 = C22548y2.f41647u;
                if (field2 != null) {
                    field2.setBoolean(view, true);
                }
                Method method2 = C22548y2.f41646t;
                if (method2 != null) {
                    method2.invoke(view, new Object[0]);
                }
            } catch (Throwable unused) {
                C22548y2.f41649w = true;
            }
        }

        public c() {
        }
    }

    /* compiled from: ViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÃ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/platform/y2$d;", "", "<init>", "()V", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @j.X
    /* renamed from: androidx.compose.ui.platform.y2$d */
    public static final class d {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int f41666a = 0;

        static {
            new d();
        }
    }

    public C22548y2(@Y61.k AndroidComposeView androidComposeView, @Y61.k C22464d1 c22464d1, @Y61.k Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> pVar, @Y61.k Y41.a<kotlin.G0> aVar) {
        super(androidComposeView.getContext());
        this.ownerView = androidComposeView;
        this.container = c22464d1;
        this.f41652d = pVar;
        this.f41653e = aVar;
        this.f41654f = new L1();
        this.f41659k = new androidx.compose.ui.graphics.N();
        this.f41660l = new C1<>(f41644r);
        androidx.compose.ui.graphics.r1.f39755b.getClass();
        this.f41661m = androidx.compose.ui.graphics.r1.f39756c;
        this.f41662n = true;
        setWillNotDraw(false);
        c22464d1.addView(this);
        this.layerId = View.generateViewId();
    }

    private final Path getManualClipPath() {
        if (getClipToOutline()) {
            L1 l12 = this.f41654f;
            if (l12.f41160g) {
                l12.e();
                return l12.f41158e;
            }
        }
        return null;
    }

    private final void setInvalidated(boolean z12) {
        if (z12 != this.isInvalidated) {
            this.isInvalidated = z12;
            this.ownerView.y(this, z12);
        }
    }

    @Override // androidx.compose.ui.node.I0
    public final void a(@Y61.k Y41.a aVar, @Y61.k Y41.p pVar) {
        this.container.addView(this);
        C1<View> c12 = this.f41660l;
        c12.f41088e = false;
        c12.f41089f = false;
        c12.f41091h = true;
        c12.f41090g = true;
        androidx.compose.ui.graphics.A0.e(c12.f41086c);
        androidx.compose.ui.graphics.A0.e(c12.f41087d);
        this.f41655g = false;
        this.f41658j = false;
        androidx.compose.ui.graphics.r1.f39755b.getClass();
        this.f41661m = androidx.compose.ui.graphics.r1.f39756c;
        this.f41652d = pVar;
        this.f41653e = aVar;
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.I0
    public final void b(@Y61.k float[] fArr) {
        androidx.compose.ui.graphics.A0.h(fArr, this.f41660l.b(this));
    }

    @Override // androidx.compose.ui.node.I0
    public final long c(long j12, boolean z12) {
        C1<View> c12 = this.f41660l;
        if (!z12) {
            return !c12.f41091h ? androidx.compose.ui.graphics.A0.c(j12, c12.b(this)) : j12;
        }
        float[] fArrA = c12.a(this);
        if (fArrA != null) {
            return !c12.f41091h ? androidx.compose.ui.graphics.A0.c(j12, fArrA) : j12;
        }
        l0.g.f413384b.getClass();
        return l0.g.f413385c;
    }

    @Override // androidx.compose.ui.node.I0
    public final boolean d(long j12) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (j12 >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (4294967295L & j12));
        if (this.f41655g) {
            return 0.0f <= fIntBitsToFloat && fIntBitsToFloat < ((float) getWidth()) && 0.0f <= fIntBitsToFloat2 && fIntBitsToFloat2 < ((float) getHeight());
        }
        if (getClipToOutline()) {
            return this.f41654f.c(j12);
        }
        return true;
    }

    @Override // androidx.compose.ui.node.I0
    public final void destroy() {
        setInvalidated(false);
        AndroidComposeView androidComposeView = this.ownerView;
        androidComposeView.f40978G = true;
        this.f41652d = null;
        this.f41653e = null;
        androidComposeView.H(this);
        this.container.removeViewInLayout(this);
    }

    @Override // android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        boolean z12;
        androidx.compose.ui.graphics.N n12 = this.f41659k;
        C22245c c22245c = n12.f39293a;
        Canvas canvas2 = c22245c.f39351a;
        c22245c.f39351a = canvas;
        if (getManualClipPath() == null && canvas.isHardwareAccelerated()) {
            z12 = false;
        } else {
            c22245c.k();
            this.f41654f.a(c22245c);
            z12 = true;
        }
        Y41.p<? super androidx.compose.ui.graphics.M, ? super C22267c, kotlin.G0> pVar = this.f41652d;
        if (pVar != null) {
            pVar.invoke(c22245c, null);
        }
        if (z12) {
            c22245c.i();
        }
        n12.f39293a.f39351a = canvas2;
        setInvalidated(false);
    }

    @Override // androidx.compose.ui.node.I0
    public final void e(@Y61.k float[] fArr) {
        float[] fArrA = this.f41660l.a(this);
        if (fArrA != null) {
            androidx.compose.ui.graphics.A0.h(fArr, fArrA);
        }
    }

    @Override // androidx.compose.ui.node.I0
    public final void f(long j12) {
        q.a aVar = androidx.compose.ui.unit.q.f42862b;
        int i12 = (int) (j12 >> 32);
        int left = getLeft();
        C1<View> c12 = this.f41660l;
        if (i12 != left) {
            offsetLeftAndRight(i12 - getLeft());
            c12.c();
        }
        int i13 = (int) (j12 & 4294967295L);
        if (i13 != getTop()) {
            offsetTopAndBottom(i13 - getTop());
            c12.c();
        }
    }

    @Override // androidx.compose.ui.node.I0
    public final void g() {
        if (!this.isInvalidated || f41649w) {
            return;
        }
        f41643q.getClass();
        c.a(this);
        setInvalidated(false);
    }

    public final float getCameraDistancePx() {
        return getCameraDistance() / getResources().getDisplayMetrics().densityDpi;
    }

    @Y61.k
    public final C22464d1 getContainer() {
        return this.container;
    }

    public long getLayerId() {
        return this.layerId;
    }

    @Y61.k
    public final AndroidComposeView getOwnerView() {
        return this.ownerView;
    }

    public long getOwnerViewId() {
        if (Build.VERSION.SDK_INT < 29) {
            return -1L;
        }
        int i12 = d.f41666a;
        return this.ownerView.getUniqueDrawingId();
    }

    @Override // androidx.compose.ui.node.I0
    @Y61.k
    /* renamed from: getUnderlyingMatrix-sQKQjiQ */
    public float[] mo3getUnderlyingMatrixsQKQjiQ() {
        return this.f41660l.b(this);
    }

    @Override // androidx.compose.ui.node.I0
    public final void h(@Y61.k androidx.compose.ui.graphics.M m12, @Y61.l C22267c c22267c) {
        boolean z12 = getElevation() > 0.0f;
        this.f41658j = z12;
        if (z12) {
            m12.s();
        }
        this.container.a(m12, this, getDrawingTime());
        if (this.f41658j) {
            m12.f();
        }
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.f41662n;
    }

    @Override // androidx.compose.ui.node.I0
    public final void i(@Y61.k l0.e eVar, boolean z12) {
        C1<View> c12 = this.f41660l;
        if (!z12) {
            float[] fArrB = c12.b(this);
            if (c12.f41091h) {
                return;
            }
            androidx.compose.ui.graphics.A0.d(fArrB, eVar);
            return;
        }
        float[] fArrA = c12.a(this);
        if (fArrA != null) {
            if (c12.f41091h) {
                return;
            }
            androidx.compose.ui.graphics.A0.d(fArrA, eVar);
        } else {
            eVar.f413380a = 0.0f;
            eVar.f413381b = 0.0f;
            eVar.f413382c = 0.0f;
            eVar.f413383d = 0.0f;
        }
    }

    @Override // android.view.View, androidx.compose.ui.node.I0
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        setInvalidated(true);
        super.invalidate();
        this.ownerView.invalidate();
    }

    @Override // androidx.compose.ui.node.I0
    public final void j(long j12) {
        int i12 = (int) (j12 >> 32);
        int i13 = (int) (j12 & 4294967295L);
        if (i12 == getWidth() && i13 == getHeight()) {
            return;
        }
        setPivotX(androidx.compose.ui.graphics.r1.c(this.f41661m) * i12);
        setPivotY(androidx.compose.ui.graphics.r1.d(this.f41661m) * i13);
        setOutlineProvider(this.f41654f.b() != null ? f41645s : null);
        layout(getLeft(), getTop(), getLeft() + i12, getTop() + i13);
        l();
        this.f41660l.c();
    }

    @Override // androidx.compose.ui.node.I0
    public final void k(@Y61.k androidx.compose.ui.graphics.c1 c1Var) {
        Y41.a<kotlin.G0> aVar;
        int i12 = c1Var.f39355b | this.f41664p;
        if ((i12 & 4096) != 0) {
            long j12 = c1Var.f39368o;
            this.f41661m = j12;
            setPivotX(androidx.compose.ui.graphics.r1.c(j12) * getWidth());
            setPivotY(androidx.compose.ui.graphics.r1.d(this.f41661m) * getHeight());
        }
        if ((i12 & 1) != 0) {
            setScaleX(c1Var.f39356c);
        }
        if ((i12 & 2) != 0) {
            setScaleY(c1Var.f39357d);
        }
        if ((i12 & 4) != 0) {
            setAlpha(c1Var.f39358e);
        }
        if ((i12 & 8) != 0) {
            setTranslationX(c1Var.f39359f);
        }
        if ((i12 & 16) != 0) {
            setTranslationY(c1Var.f39360g);
        }
        if ((i12 & 32) != 0) {
            setElevation(c1Var.f39361h);
        }
        if ((i12 & 1024) != 0) {
            setRotation(c1Var.f39366m);
        }
        if ((i12 & 256) != 0) {
            setRotationX(c1Var.f39364k);
        }
        if ((i12 & 512) != 0) {
            setRotationY(c1Var.f39365l);
        }
        if ((i12 & 2048) != 0) {
            setCameraDistancePx(c1Var.f39367n);
        }
        boolean z12 = true;
        boolean z13 = getManualClipPath() != null;
        boolean z14 = c1Var.f39370q;
        boolean z15 = z14 && c1Var.f39369p != androidx.compose.ui.graphics.Y0.f39346a;
        if ((i12 & 24576) != 0) {
            this.f41655g = z14 && c1Var.f39369p == androidx.compose.ui.graphics.Y0.f39346a;
            l();
            setClipToOutline(z15);
        }
        boolean zD2 = this.f41654f.d(c1Var.f39376w, c1Var.f39358e, z15, c1Var.f39361h, c1Var.f39372s);
        L1 l12 = this.f41654f;
        if (l12.f41159f) {
            setOutlineProvider(l12.b() != null ? f41645s : null);
        }
        boolean z16 = getManualClipPath() != null;
        if (z13 != z16 || (z16 && zD2)) {
            invalidate();
        }
        if (!this.f41658j && getElevation() > 0.0f && (aVar = this.f41653e) != null) {
            aVar.invoke();
        }
        if ((i12 & 7963) != 0) {
            this.f41660l.c();
        }
        int i13 = Build.VERSION.SDK_INT;
        if (i13 >= 28) {
            if ((i12 & 64) != 0) {
                A2 a22 = A2.f40962a;
                int iJ2 = androidx.compose.ui.graphics.V.j(c1Var.f39362i);
                a22.getClass();
                setOutlineAmbientShadowColor(iJ2);
            }
            if ((i12 & 128) != 0) {
                A2 a23 = A2.f40962a;
                int iJ3 = androidx.compose.ui.graphics.V.j(c1Var.f39363j);
                a23.getClass();
                setOutlineSpotShadowColor(iJ3);
            }
        }
        if (i13 >= 31 && (131072 & i12) != 0) {
            B2 b22 = B2.f41081a;
            androidx.compose.ui.graphics.Z0 z02 = c1Var.f39375v;
            b22.getClass();
            setRenderEffect(z02 != null ? z02.a() : null);
        }
        if ((i12 & 32768) != 0) {
            int i14 = c1Var.f39371r;
            C22250e0.f39504b.getClass();
            if (C22250e0.a(i14, C22250e0.f39505c)) {
                setLayerType(2, null);
            } else if (C22250e0.a(i14, C22250e0.f39506d)) {
                setLayerType(0, null);
                z12 = false;
            } else {
                setLayerType(0, null);
            }
            this.f41662n = z12;
        }
        this.f41664p = c1Var.f39355b;
    }

    public final void l() {
        Rect rect;
        if (this.f41655g) {
            Rect rect2 = this.f41656h;
            if (rect2 == null) {
                this.f41656h = new Rect(0, 0, getWidth(), getHeight());
            } else {
                rect2.set(0, 0, getWidth(), getHeight());
            }
            rect = this.f41656h;
        } else {
            rect = null;
        }
        setClipBounds(rect);
    }

    public final void setCameraDistancePx(float f12) {
        setCameraDistance(f12 * getResources().getDisplayMetrics().densityDpi);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
    }
}
