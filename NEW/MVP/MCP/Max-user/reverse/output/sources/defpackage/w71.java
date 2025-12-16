package defpackage;

import android.content.Context;
import android.graphics.Color;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.shapes.RoundRectShape;
import android.widget.FrameLayout;
import android.widget.TextView;

/* loaded from: classes.dex */
public final class w71 extends FrameLayout {
    public final TextView a;
    public final Object b;

    public w71(Context context) {
        super(context, null);
        this.b = ipi.b(3, new g31(7));
        setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
        TextView textView = new TextView(context);
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, kti.d(28 * vw4.d().getDisplayMetrics().density));
        layoutParams.gravity = 17;
        textView.setLayoutParams(layoutParams);
        textView.setId(eyc.call_event_icon);
        textView.setBackground(getBackgroundView());
        textView.setMaxLines(1);
        dpg.l.b(textView, t75.b);
        textView.setTextColor(a93.s0.B(textView).c.getText().e);
        textView.setGravity(17);
        float f = 8;
        textView.setPadding(kti.d(vw4.d().getDisplayMetrics().density * f), textView.getPaddingTop(), kti.d(f * vw4.d().getDisplayMetrics().density), textView.getPaddingBottom());
        jgh.a(textView);
        this.a = textView;
        addView(textView);
    }

    private final Drawable getBackgroundView() {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new RoundRectShape(getBgRadius(), null, null));
        shapeDrawable.getPaint().setColor(Color.parseColor("#CC393A40"));
        return shapeDrawable;
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final float[] getBgRadius() {
        return (float[]) this.b.getValue();
    }

    public final void setLabel(CharSequence charSequence) {
        this.a.setText(charSequence);
    }
}
