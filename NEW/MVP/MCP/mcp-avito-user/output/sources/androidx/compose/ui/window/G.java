package androidx.compose.ui.window;

import android.content.Context;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.C22082i3;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.platform.AbstractC22450a;
import androidx.core.graphics.C22771k;
import androidx.core.view.C22823h0;
import androidx.core.view.G0;
import androidx.core.view.J0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: AndroidDialog.android.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/ui/window/G;", "Landroidx/compose/ui/platform/a;", "Landroidx/compose/ui/window/I;", "Landroidx/core/view/M;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class G extends AbstractC22450a implements I, androidx.core.view.M {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Window f43016j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final InterfaceC22204y1 f43017k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f43018l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f43019m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f43020n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f43021o;

    /* compiled from: AndroidDialog.android.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"androidx/compose/ui/window/G$a", "Landroidx/core/view/G0$b;", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends G0.b {
        public a() {
            super(1);
        }

        @Override // androidx.core.view.G0.b
        public final J0 d(J0 j02, List<G0> list) {
            G g12 = G.this;
            if (g12.f43019m) {
                return j02;
            }
            View childAt = g12.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, g12.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, g12.getHeight() - childAt.getBottom());
            return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? j02 : j02.m(iMax, iMax2, iMax3, iMax4);
        }

        @Override // androidx.core.view.G0.b
        public final G0.a e(G0 g02, G0.a aVar) {
            G g12 = G.this;
            if (g12.f43019m) {
                return aVar;
            }
            View childAt = g12.getChildAt(0);
            int iMax = Math.max(0, childAt.getLeft());
            int iMax2 = Math.max(0, childAt.getTop());
            int iMax3 = Math.max(0, g12.getWidth() - childAt.getRight());
            int iMax4 = Math.max(0, g12.getHeight() - childAt.getBottom());
            if (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) {
                return aVar;
            }
            C22771k c22771kB = C22771k.b(iMax, iMax2, iMax3, iMax4);
            C22771k c22771k = aVar.f44905a;
            int i12 = c22771kB.f44775a;
            int i13 = c22771kB.f44776b;
            int i14 = c22771kB.f44777c;
            int i15 = c22771kB.f44778d;
            return new G0.a(J0.n(c22771k, i12, i13, i14, i15), J0.n(aVar.f44906b, i12, i13, i14, i15));
        }
    }

    public G(@Y61.k Context context, @Y61.k Window window) {
        super(context, null, 0, 6, null);
        this.f43016j = window;
        E.f43010a.getClass();
        this.f43017k = C22126m3.g(E.f43011b);
        C22823h0.K(this, this);
        C22823h0.R(this, new a());
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    @InterfaceC22132o
    public final void a(@Y61.l androidx.compose.runtime.A a12, int i12) {
        a12.C(1735448596);
        ((Y41.p) ((C22082i3) this.f43017k).getF42167b()).invoke(a12, 0);
        a12.h();
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    public final void f(int i12, int i13, int i14, int i15, boolean z12) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            return;
        }
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i16 = i14 - i12;
        int i17 = i15 - i13;
        int measuredWidth = childAt.getMeasuredWidth();
        int measuredHeight = childAt.getMeasuredHeight();
        int paddingLeft = (((i16 - measuredWidth) - paddingRight) / 2) + getPaddingLeft();
        int paddingTop = (((i17 - measuredHeight) - paddingBottom) / 2) + getPaddingTop();
        childAt.layout(paddingLeft, paddingTop, measuredWidth + paddingLeft, measuredHeight + paddingTop);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    public final void g(int i12, int i13) {
        View childAt = getChildAt(0);
        if (childAt == null) {
            super.g(i12, i13);
            return;
        }
        int size = View.MeasureSpec.getSize(i12);
        int size2 = View.MeasureSpec.getSize(i13);
        int mode = View.MeasureSpec.getMode(i13);
        Window window = this.f43016j;
        int i14 = (mode != Integer.MIN_VALUE || this.f43018l || this.f43019m || window.getAttributes().height != -2) ? size2 : size2 + 1;
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int i15 = size - paddingRight;
        if (i15 < 0) {
            i15 = 0;
        }
        int i16 = i14 - paddingBottom;
        int i17 = i16 >= 0 ? i16 : 0;
        int mode2 = View.MeasureSpec.getMode(i12);
        if (mode2 != 0) {
            i12 = View.MeasureSpec.makeMeasureSpec(i15, BeduinInputModel.MIN_TEXT_VERSION);
        }
        if (mode != 0) {
            i13 = View.MeasureSpec.makeMeasureSpec(i17, BeduinInputModel.MIN_TEXT_VERSION);
        }
        childAt.measure(i12, i13);
        if (mode2 == Integer.MIN_VALUE) {
            size = Math.min(size, childAt.getMeasuredWidth() + paddingRight);
        } else if (mode2 != 1073741824) {
            size = childAt.getMeasuredWidth() + paddingRight;
        }
        setMeasuredDimension(size, mode != Integer.MIN_VALUE ? mode != 1073741824 ? childAt.getMeasuredHeight() + paddingBottom : size2 : Math.min(size2, childAt.getMeasuredHeight() + paddingBottom));
        if (this.f43018l || this.f43019m || childAt.getMeasuredHeight() + paddingBottom <= size2 || window.getAttributes().height != -2) {
            return;
        }
        window.setLayout(-1, -1);
    }

    @Override // androidx.compose.ui.platform.AbstractC22450a
    /* renamed from: getShouldCreateCompositionOnAttachedToWindow, reason: from getter */
    public final boolean getF35296q() {
        return this.f43021o;
    }

    @Override // androidx.compose.ui.window.I
    @Y61.k
    /* renamed from: getWindow, reason: from getter */
    public final Window getF43016j() {
        return this.f43016j;
    }

    @Override // androidx.core.view.M
    @Y61.k
    public final J0 h(@Y61.k View view, @Y61.k J0 j02) {
        if (this.f43019m) {
            return j02;
        }
        View childAt = getChildAt(0);
        int iMax = Math.max(0, childAt.getLeft());
        int iMax2 = Math.max(0, childAt.getTop());
        int iMax3 = Math.max(0, getWidth() - childAt.getRight());
        int iMax4 = Math.max(0, getHeight() - childAt.getBottom());
        return (iMax == 0 && iMax2 == 0 && iMax3 == 0 && iMax4 == 0) ? j02 : j02.m(iMax, iMax2, iMax3, iMax4);
    }
}
