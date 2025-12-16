package defpackage;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.FrameLayout;

/* loaded from: classes.dex */
public final class k41 extends FrameLayout {
    public final /* synthetic */ int a;
    public Object b;
    public Object c;
    public Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public k41(Context context, int i) {
        super(context, null);
        this.a = i;
        switch (i) {
            case 1:
                super(context);
                break;
            default:
                k18 k18VarB = ipi.b(3, new g31(1));
                this.b = k18VarB;
                Drawable drawableB = r34.b(context, kwc.ic_call_speaker_24);
                v1a v1aVar = a93.s0;
                yeb yebVar = v1aVar.B(this).c;
                PorterDuff.Mode mode = PorterDuff.Mode.SRC_IN;
                drawableB.setColorFilter(new PorterDuffColorFilter(-1, mode));
                this.c = drawableB;
                Drawable drawableB2 = r34.b(context, yud.c0);
                yeb yebVar2 = v1aVar.B(this).c;
                drawableB2.setColorFilter(new PorterDuffColorFilter(-1, mode));
                this.d = drawableB2;
                ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape((float[]) k18VarB.getValue(), null, null));
                shapeDrawable.getPaint().setColor(v1aVar.B(this).c.b().l);
                setBackground(shapeDrawable);
                break;
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        switch (this.a) {
            case 0:
                super.onDraw(canvas);
                int paddingTop = getPaddingTop();
                int height = ((getHeight() - getPaddingTop()) - paddingTop) / 2;
                Drawable drawable = (Drawable) this.c;
                drawable.setBounds(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), (getHeight() - paddingTop) - height);
                drawable.draw(canvas);
                Drawable drawable2 = (Drawable) this.d;
                drawable2.setBounds(getPaddingLeft(), getPaddingTop() + height + paddingTop, getWidth() - getPaddingRight(), getHeight() - getPaddingBottom());
                drawable2.draw(canvas);
                break;
            default:
                super.onDraw(canvas);
                break;
        }
    }
}
