package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class k3b extends View {
    public static final /* synthetic */ yy7[] d;
    public final int a;
    public final nk b;
    public final Paint c;

    static {
        z8a z8aVar = new z8a(k3b.class, "appearance", "getAppearance()Lone/me/common/dot/OneMeDot$Appearance;");
        vid.a.getClass();
        d = new yy7[]{z8aVar};
    }

    public k3b(Context context) {
        int i;
        super(context, null);
        this.a = kti.d(6 * vw4.d().getDisplayMetrics().density);
        this.b = new nk(this);
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        j3b appearance = getAppearance();
        yeb yebVarY = a93.s0.y(this);
        int iOrdinal = appearance.ordinal();
        if (iOrdinal == 0) {
            i = yebVarY.b().a.n;
        } else if (iOrdinal == 1) {
            i = yebVarY.b().a.c;
        } else if (iOrdinal == 2) {
            i = yebVarY.b().a.h;
        } else {
            if (iOrdinal != 3) {
                throw new NoWhenBranchMatchedException();
            }
            i = yebVarY.b().a.f;
        }
        paint.setColor(i);
        this.c = paint;
    }

    public final j3b getAppearance() {
        yy7 yy7Var = d[0];
        return (j3b) this.b.b;
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        float measuredWidth = getMeasuredWidth();
        float measuredHeight = getMeasuredHeight();
        int i = this.a;
        canvas.drawRoundRect(0.0f, 0.0f, measuredWidth, measuredHeight, i / 2.0f, i / 2.0f, this.c);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int i3 = this.a;
        setMeasuredDimension(View.MeasureSpec.makeMeasureSpec(i3, 1073741824), View.MeasureSpec.makeMeasureSpec(i3, 1073741824));
    }

    public final void setAppearance(j3b j3bVar) {
        this.b.O(this, d[0], j3bVar);
    }
}
