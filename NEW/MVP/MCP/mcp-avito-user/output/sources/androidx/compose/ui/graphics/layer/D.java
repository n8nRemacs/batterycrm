package androidx.compose.ui.graphics.layer;

import android.graphics.Canvas;
import android.graphics.Outline;
import android.view.View;
import android.view.ViewOutlineProvider;
import androidx.compose.ui.graphics.C22245c;
import androidx.compose.ui.graphics.M;
import androidx.compose.ui.graphics.N;
import androidx.compose.ui.graphics.drawscope.a;
import androidx.compose.ui.graphics.layer.g;
import androidx.compose.ui.unit.LayoutDirection;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import l0.n;

/* compiled from: GraphicsViewLayer.android.kt */
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\f\b\u0000\u0018\u00002\u00020\u0001:\u0001\u0002R\u0017\u0010\u0006\u001a\u00020\u00018\u0006¢\u0006\f\n\u0004\b\u0002\u0010\u0003\u001a\u0004\b\u0004\u0010\u0005R\u0017\u0010\f\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0010\u001a\u00020\r8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000e\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011\"\u0004\b\u0012\u0010\u0013R*\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\r8\u0000@@X\u0080\u000e¢\u0006\u0012\n\u0004\b\u0015\u0010\u000f\u001a\u0004\b\u0016\u0010\u0011\"\u0004\b\u0017\u0010\u0013¨\u0006\u0019"}, d2 = {"Landroidx/compose/ui/graphics/layer/D;", "Landroid/view/View;", "b", "Landroid/view/View;", "getOwnerView", "()Landroid/view/View;", "ownerView", "Landroidx/compose/ui/graphics/N;", "c", "Landroidx/compose/ui/graphics/N;", "getCanvasHolder", "()Landroidx/compose/ui/graphics/N;", "canvasHolder", "", "e", "Z", "isInvalidated", "()Z", "setInvalidated", "(Z)V", "value", "g", "getCanUseCompositingLayer$ui_graphics_release", "setCanUseCompositingLayer$ui_graphics_release", "canUseCompositingLayer", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class D extends View {

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public static final a f39553l;

    /* renamed from: b, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final View ownerView;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.k
    public final N canvasHolder;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.graphics.drawscope.a f39556d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    public boolean isInvalidated;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public Outline f39558f;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean canUseCompositingLayer;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public androidx.compose.ui.unit.d f39560h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public LayoutDirection f39561i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public kotlin.jvm.internal.N f39562j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public C22267c f39563k;

    /* compiled from: GraphicsViewLayer.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/graphics/layer/D$a", "Landroid/view/ViewOutlineProvider;", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends ViewOutlineProvider {
        @Override // android.view.ViewOutlineProvider
        public final void getOutline(View view, Outline outline) {
            Outline outline2;
            if (!(view instanceof D) || (outline2 = ((D) view).f39558f) == null) {
                return;
            }
            outline.set(outline2);
        }
    }

    /* compiled from: GraphicsViewLayer.android.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/graphics/layer/D$b;", "", "<init>", "()V", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    static {
        new b(null);
        f39553l = new a();
    }

    public /* synthetic */ D(View view, N n12, androidx.compose.ui.graphics.drawscope.a aVar, int i12, C42822w c42822w) {
        this(view, (i12 & 2) != 0 ? new N() : n12, (i12 & 4) != 0 ? new androidx.compose.ui.graphics.drawscope.a() : aVar);
    }

    /* JADX WARN: Type inference failed for: r9v0, types: [Y41.l, kotlin.jvm.internal.N] */
    @Override // android.view.View
    public final void dispatchDraw(@Y61.k Canvas canvas) {
        N n12 = this.canvasHolder;
        C22245c c22245c = n12.f39293a;
        Canvas canvas2 = c22245c.f39351a;
        c22245c.f39351a = canvas;
        androidx.compose.ui.unit.d dVar = this.f39560h;
        LayoutDirection layoutDirection = this.f39561i;
        float width = getWidth();
        float height = getHeight();
        long jFloatToRawIntBits = (Float.floatToRawIntBits(height) & 4294967295L) | (Float.floatToRawIntBits(width) << 32);
        n.a aVar = l0.n.f413402b;
        C22267c c22267c = this.f39563k;
        ?? r92 = this.f39562j;
        androidx.compose.ui.graphics.drawscope.a aVar2 = this.f39556d;
        androidx.compose.ui.unit.d dVarB = aVar2.f39478c.b();
        a.b bVar = aVar2.f39478c;
        LayoutDirection layoutDirectionD = bVar.d();
        M mA2 = bVar.a();
        long jE2 = bVar.e();
        C22267c c22267c2 = bVar.f39486b;
        bVar.g(dVar);
        bVar.i(layoutDirection);
        bVar.f(c22245c);
        bVar.j(jFloatToRawIntBits);
        bVar.f39486b = c22267c;
        c22245c.k();
        try {
            r92.invoke(aVar2);
            c22245c.i();
            bVar.g(dVarB);
            bVar.i(layoutDirectionD);
            bVar.f(mA2);
            bVar.j(jE2);
            bVar.f39486b = c22267c2;
            n12.f39293a.f39351a = canvas2;
            this.isInvalidated = false;
        } catch (Throwable th2) {
            c22245c.i();
            bVar.g(dVarB);
            bVar.i(layoutDirectionD);
            bVar.f(mA2);
            bVar.j(jE2);
            bVar.f39486b = c22267c2;
            throw th2;
        }
    }

    /* renamed from: getCanUseCompositingLayer$ui_graphics_release, reason: from getter */
    public final boolean getCanUseCompositingLayer() {
        return this.canUseCompositingLayer;
    }

    @Y61.k
    public final N getCanvasHolder() {
        return this.canvasHolder;
    }

    @Y61.k
    public final View getOwnerView() {
        return this.ownerView;
    }

    @Override // android.view.View
    public final boolean hasOverlappingRendering() {
        return this.canUseCompositingLayer;
    }

    @Override // android.view.View
    public final void invalidate() {
        if (this.isInvalidated) {
            return;
        }
        this.isInvalidated = true;
        super.invalidate();
    }

    public final void setCanUseCompositingLayer$ui_graphics_release(boolean z12) {
        if (this.canUseCompositingLayer != z12) {
            this.canUseCompositingLayer = z12;
            invalidate();
        }
    }

    public final void setInvalidated(boolean z12) {
        this.isInvalidated = z12;
    }

    public D(@Y61.k View view, @Y61.k N n12, @Y61.k androidx.compose.ui.graphics.drawscope.a aVar) {
        super(view.getContext());
        this.ownerView = view;
        this.canvasHolder = n12;
        this.f39556d = aVar;
        setOutlineProvider(f39553l);
        this.canUseCompositingLayer = true;
        this.f39560h = androidx.compose.ui.graphics.drawscope.f.f39489a;
        this.f39561i = LayoutDirection.f42838b;
        g.f39604a.getClass();
        this.f39562j = (kotlin.jvm.internal.N) g.a.f39606b;
        setWillNotDraw(false);
        setClipBounds(null);
    }

    @Override // android.view.View
    public final void forceLayout() {
    }

    @Override // android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
    }
}
