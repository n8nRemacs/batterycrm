package androidx.compose.ui.platform;

import android.content.Context;
import android.os.IBinder;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.ui.platform.InterfaceC22532u2;
import java.lang.ref.WeakReference;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ComposeView.android.kt */
@androidx.compose.runtime.internal.P
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0011\b'\u0018\u00002\u00020\u0001J\u0017\u0010\u0005\u001a\u00020\u00042\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0015\u0010\t\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eR(\u0010\u0015\u001a\u0004\u0018\u00010\u000f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R(\u0010\u0019\u001a\u0004\u0018\u00010\u00022\b\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\u0016\u0010\u0017\"\u0004\b\u0018\u0010\u0006R$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u001a8\u0002@\u0002X\u0082\u000e¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u0012\u0004\b\u001d\u0010\u001eR0\u0010&\u001a\u00020\u000b2\u0006\u0010\u0010\u001a\u00020\u000b8F@FX\u0087\u000e¢\u0006\u0018\n\u0004\b \u0010!\u0012\u0004\b%\u0010\u001e\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010\u000eR\u0014\u0010(\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b'\u0010#R\u0011\u0010*\u001a\u00020\u000b8F¢\u0006\u0006\u001a\u0004\b)\u0010#¨\u0006+"}, d2 = {"Landroidx/compose/ui/platform/a;", "Landroid/view/ViewGroup;", "Landroidx/compose/runtime/I;", "parent", "Lkotlin/G0;", "setParentCompositionContext", "(Landroidx/compose/runtime/I;)V", "Landroidx/compose/ui/platform/u2;", "strategy", "setViewCompositionStrategy", "(Landroidx/compose/ui/platform/u2;)V", "", "isTransitionGroup", "setTransitionGroup", "(Z)V", "Landroid/os/IBinder;", "value", "c", "Landroid/os/IBinder;", "setPreviousAttachedWindowToken", "(Landroid/os/IBinder;)V", "previousAttachedWindowToken", "e", "Landroidx/compose/runtime/I;", "setParentContext", "parentContext", "Lkotlin/Function0;", "f", "LY41/a;", "getDisposeViewCompositionStrategy$annotations", "()V", "disposeViewCompositionStrategy", "g", "Z", "getShowLayoutBounds", "()Z", "setShowLayoutBounds", "getShowLayoutBounds$annotations", "showLayoutBounds", "getShouldCreateCompositionOnAttachedToWindow", "shouldCreateCompositionOnAttachedToWindow", "getHasComposition", "hasComposition", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.platform.a, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC22450a extends ViewGroup {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public WeakReference<androidx.compose.runtime.I> f41364b;

    /* renamed from: c, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public IBinder previousAttachedWindowToken;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public androidx.compose.runtime.H f41366d;

    /* renamed from: e, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public androidx.compose.runtime.I parentContext;

    /* renamed from: f, reason: collision with root package name and from kotlin metadata */
    @Y61.l
    public Y41.a<kotlin.G0> disposeViewCompositionStrategy;

    /* renamed from: g, reason: collision with root package name and from kotlin metadata */
    public boolean showLayoutBounds;

    /* renamed from: h, reason: collision with root package name */
    public boolean f41370h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f41371i;

    /* compiled from: ComposeView.android.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\u000b¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "(Landroidx/compose/runtime/A;I)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: androidx.compose.ui.platform.a$a, reason: collision with other inner class name */
    public static final class C1674a extends kotlin.jvm.internal.N implements Y41.p<androidx.compose.runtime.A, Integer, kotlin.G0> {
        public C1674a() {
            super(2);
        }

        @Override // Y41.p
        public final kotlin.G0 invoke(androidx.compose.runtime.A a12, Integer num) {
            androidx.compose.runtime.A a13 = a12;
            int iIntValue = num.intValue();
            if (a13.p(iIntValue & 1, (iIntValue & 3) != 2)) {
                AbstractC22450a.this.a(a13, 0);
            } else {
                a13.f();
            }
            return kotlin.G0.f406611a;
        }
    }

    @X41.j
    public AbstractC22450a(@Y61.k Context context, @Y61.l AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final void setParentContext(androidx.compose.runtime.I i12) {
        if (this.parentContext != i12) {
            this.parentContext = i12;
            if (i12 != null) {
                this.f41364b = null;
            }
            androidx.compose.runtime.H h12 = this.f41366d;
            if (h12 != null) {
                h12.dispose();
                this.f41366d = null;
                if (isAttachedToWindow()) {
                    e();
                }
            }
        }
    }

    private final void setPreviousAttachedWindowToken(IBinder iBinder) {
        if (this.previousAttachedWindowToken != iBinder) {
            this.previousAttachedWindowToken = iBinder;
            this.f41364b = null;
        }
    }

    @InterfaceC22132o
    @androidx.compose.ui.D
    public abstract void a(@Y61.l androidx.compose.runtime.A a12, int i12);

    @Override // android.view.ViewGroup
    public final void addView(@Y61.l View view) {
        b();
        super.addView(view);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(@Y61.l View view, int i12, @Y61.l ViewGroup.LayoutParams layoutParams) {
        b();
        return super.addViewInLayout(view, i12, layoutParams);
    }

    public final void b() {
        if (this.f41370h) {
            return;
        }
        throw new UnsupportedOperationException("Cannot add views to " + getClass().getSimpleName() + "; only Compose content is supported");
    }

    public final void c() {
        if (this.parentContext == null && !isAttachedToWindow()) {
            throw new IllegalStateException("createComposition requires either a parent reference or the View to be attachedto a window. Attach the View or call setParentCompositionReference.");
        }
        e();
    }

    public final void d() {
        androidx.compose.runtime.H h12 = this.f41366d;
        if (h12 != null) {
            h12.dispose();
        }
        this.f41366d = null;
        requestLayout();
    }

    public final void e() {
        if (this.f41366d == null) {
            try {
                this.f41370h = true;
                this.f41366d = a3.a(this, i(), new C22096n(-656146368, new C1674a(), true));
            } finally {
                this.f41370h = false;
            }
        }
    }

    public void f(int i12, int i13, int i14, int i15, boolean z12) {
        View childAt = getChildAt(0);
        if (childAt != null) {
            childAt.layout(getPaddingLeft(), getPaddingTop(), (i14 - i12) - getPaddingRight(), (i15 - i13) - getPaddingBottom());
        }
    }

    public void g(int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.onMeasure(i12, i13);
            return;
        }
        childAt.measure(View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i12) - getPaddingLeft()) - getPaddingRight()), View.MeasureSpec.getMode(i12)), View.MeasureSpec.makeMeasureSpec(Math.max(0, (View.MeasureSpec.getSize(i13) - getPaddingTop()) - getPaddingBottom()), View.MeasureSpec.getMode(i13)));
        setMeasuredDimension(getPaddingRight() + getPaddingLeft() + childAt.getMeasuredWidth(), getPaddingBottom() + getPaddingTop() + childAt.getMeasuredHeight());
    }

    public final boolean getHasComposition() {
        return this.f41366d != null;
    }

    /* renamed from: getShouldCreateCompositionOnAttachedToWindow */
    public boolean getF43021o() {
        return true;
    }

    public final boolean getShowLayoutBounds() {
        return this.showLayoutBounds;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0070  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0073  */
    /* JADX WARN: Type inference failed for: r0v0, types: [androidx.compose.runtime.I] */
    /* JADX WARN: Type inference failed for: r0v1, types: [androidx.compose.runtime.I] */
    /* JADX WARN: Type inference failed for: r0v15, types: [androidx.compose.runtime.Recomposer] */
    /* JADX WARN: Type inference failed for: r0v2, types: [androidx.compose.runtime.I] */
    /* JADX WARN: Type inference failed for: r0v27 */
    /* JADX WARN: Type inference failed for: r0v3 */
    /* JADX WARN: Type inference failed for: r0v31 */
    /* JADX WARN: Type inference failed for: r0v32 */
    /* JADX WARN: Type inference failed for: r0v33 */
    /* JADX WARN: Type inference failed for: r0v34 */
    /* JADX WARN: Type inference failed for: r0v35 */
    /* JADX WARN: Type inference failed for: r0v36 */
    /* JADX WARN: Type inference failed for: r0v4 */
    /* JADX WARN: Type inference failed for: r0v5 */
    /* JADX WARN: Type inference failed for: r0v7 */
    /* JADX WARN: Type inference failed for: r0v8 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final androidx.compose.runtime.I i() {
        /*
            Method dump skipped, instructions count: 280
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: androidx.compose.ui.platform.AbstractC22450a.i():androidx.compose.runtime.I");
    }

    @Override // android.view.ViewGroup
    public final boolean isTransitionGroup() {
        return !this.f41371i || super.isTransitionGroup();
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        setPreviousAttachedWindowToken(getWindowToken());
        if (getF43021o()) {
            e();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z12, int i12, int i13, int i14, int i15) {
        f(i12, i13, i14, i15, z12);
    }

    @Override // android.view.View
    public final void onMeasure(int i12, int i13) {
        e();
        g(i12, i13);
    }

    @Override // android.view.View
    public final void onRtlPropertiesChanged(int i12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        childAt.setLayoutDirection(i12);
    }

    public final void setParentCompositionContext(@Y61.l androidx.compose.runtime.I parent) {
        setParentContext(parent);
    }

    public final void setShowLayoutBounds(boolean z12) {
        this.showLayoutBounds = z12;
        KeyEvent.Callback childAt = getChildAt(0);
        if (childAt != null) {
            ((androidx.compose.ui.node.J0) childAt).setShowLayoutBounds(z12);
        }
    }

    @Override // android.view.ViewGroup
    public void setTransitionGroup(boolean isTransitionGroup) {
        super.setTransitionGroup(isTransitionGroup);
        this.f41371i = true;
    }

    public final void setViewCompositionStrategy(@Y61.k InterfaceC22532u2 strategy) {
        Y41.a<kotlin.G0> aVar = this.disposeViewCompositionStrategy;
        if (aVar != null) {
            aVar.invoke();
        }
        this.disposeViewCompositionStrategy = strategy.a(this);
    }

    @Override // android.view.ViewGroup
    public final boolean shouldDelayChildPressedState() {
        return false;
    }

    public /* synthetic */ AbstractC22450a(Context context, AttributeSet attributeSet, int i12, int i13, C42822w c42822w) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i12);
    }

    @X41.j
    public AbstractC22450a(@Y61.k Context context, @Y61.l AttributeSet attributeSet, int i12) {
        super(context, attributeSet, i12);
        setClipChildren(false);
        setClipToPadding(false);
        setImportantForAccessibility(1);
        InterfaceC22532u2.f41607a.getClass();
        this.disposeViewCompositionStrategy = InterfaceC22532u2.c.f41613b.a(this);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Y61.l View view, int i12) {
        b();
        super.addView(view, i12);
    }

    @Override // android.view.ViewGroup
    public final boolean addViewInLayout(@Y61.l View view, int i12, @Y61.l ViewGroup.LayoutParams layoutParams, boolean z12) {
        b();
        return super.addViewInLayout(view, i12, layoutParams, z12);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Y61.l View view, int i12, int i13) {
        b();
        super.addView(view, i12, i13);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public final void addView(@Y61.l View view, @Y61.l ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public final void addView(@Y61.l View view, int i12, @Y61.l ViewGroup.LayoutParams layoutParams) {
        b();
        super.addView(view, i12, layoutParams);
    }

    private static /* synthetic */ void getDisposeViewCompositionStrategy$annotations() {
    }

    @androidx.compose.ui.q
    public static /* synthetic */ void getShowLayoutBounds$annotations() {
    }
}
