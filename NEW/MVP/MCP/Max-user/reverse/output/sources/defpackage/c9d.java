package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.PathInterpolator;
import android.widget.TextView;

/* loaded from: classes2.dex */
public final class c9d extends ViewGroup implements u6g {
    public boolean a;
    public ValueAnimator b;
    public final Paint c;
    public float d;
    public int o;
    public int s0;
    public int t0;
    public int u0;
    public final TextView v0;
    public final w2b w0;
    public final b9d x0;
    public final b9d y0;
    public final b9d z0;
    public static final /* synthetic */ yy7[] B0 = {new z8a(c9d.class, "isOwn", "isOwn()Z"), u45.h(vid.a, c9d.class, "reaction", "getReaction()Lru/ok/tamtam/models/message/reactions/Reaction;"), new z8a(c9d.class, "count", "getCount()I")};
    public static final mni A0 = new mni();
    public static final bwf C0 = new bwf(new hdc(22));

    public c9d(Context context) {
        super(context);
        this.c = new Paint(1);
        this.d = -1.0f;
        TextView textView = new TextView(context);
        t5g t5gVar = dpg.a;
        vz2.a.b(textView, t75.b);
        textView.setIncludeFontPadding(false);
        textView.setGravity(17);
        textView.setTextColor(-1);
        this.v0 = textView;
        w2b w2bVar = new w2b(context);
        w2bVar.setHasBackground(false);
        A0.getClass();
        w2bVar.setReplaceInterpolator((PathInterpolator) C0.getValue());
        w2bVar.setTypography(vz2.i);
        this.w0 = w2bVar;
        this.x0 = new b9d(this, 0);
        this.y0 = new b9d(new x8d(""), this);
        this.z0 = new b9d(this, 2);
        setOutlineProvider(new z8d());
        addView(textView);
        addView(w2bVar);
    }

    private final float getEmojiCenterX() {
        TextView textView = this.v0;
        return (textView.getWidth() / 2.0f) + textView.getLeft();
    }

    public final void a(boolean z) {
        float f;
        long j;
        ValueAnimator valueAnimator = this.b;
        if (valueAnimator != null) {
            lqi.a(valueAnimator);
        }
        float measuredWidth = getMeasuredWidth() - getEmojiCenterX();
        if (this.d == -1.0f) {
            this.d = z ? measuredWidth : 0.0f;
        }
        float f2 = this.d;
        Float fValueOf = Float.valueOf(f2);
        if (f2 == 0.0f) {
            fValueOf = null;
        }
        float fFloatValue = fValueOf != null ? fValueOf.floatValue() : measuredWidth;
        if (!z) {
            fFloatValue = this.d;
        }
        float f3 = z ? 0.0f : measuredWidth;
        Float fValueOf2 = Float.valueOf(fFloatValue);
        Float fValueOf3 = Float.valueOf(f3);
        float fFloatValue2 = fValueOf2.floatValue();
        float fFloatValue3 = fValueOf3.floatValue();
        if (z) {
            f = this.d / measuredWidth;
            j = 350;
        } else {
            f = 1 - (this.d / measuredWidth);
            j = 500;
        }
        long j2 = (long) (f * j);
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(fFloatValue2, fFloatValue3);
        valueAnimatorOfFloat.setDuration(j2);
        this.w0.setReplaceDuration(j2);
        A0.getClass();
        valueAnimatorOfFloat.setInterpolator((PathInterpolator) C0.getValue());
        valueAnimatorOfFloat.addUpdateListener(new q00(20, this));
        valueAnimatorOfFloat.addListener(new a9d(this, fFloatValue2, 0));
        valueAnimatorOfFloat.addListener(new qe(9, this));
        valueAnimatorOfFloat.start();
        this.b = valueAnimatorOfFloat;
    }

    public final boolean b() {
        yy7 yy7Var = B0[0];
        return ((Boolean) this.x0.b).booleanValue();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void dispatchDraw(Canvas canvas) {
        Canvas canvas2;
        boolean z = this.a;
        Paint paint = this.c;
        w2b w2bVar = this.w0;
        if (z) {
            paint.setColor(this.s0);
            canvas2 = canvas;
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            float emojiCenterX = getEmojiCenterX();
            if (((int) this.d) + emojiCenterX > w2bVar.getRight()) {
                w2bVar.setTextColor(this.t0);
            } else {
                w2bVar.setTextColor(this.u0);
            }
            paint.setColor(this.o);
            TextView textView = this.v0;
            canvas2.drawCircle(emojiCenterX, (textView.getHeight() / 2.0f) + textView.getTop(), this.d, paint);
        } else {
            canvas2 = canvas;
            paint.setColor(b() ? this.o : this.s0);
            canvas2.drawRect(0.0f, 0.0f, getMeasuredWidth(), getMeasuredHeight(), paint);
            w2bVar.setTextColor(b() ? this.t0 : this.u0);
        }
        super.dispatchDraw(canvas2);
    }

    public final int getCount() {
        yy7 yy7Var = B0[2];
        return ((Number) this.z0.b).intValue();
    }

    public final x8d getReaction() {
        yy7 yy7Var = B0[1];
        return (x8d) this.y0.b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int iD = kti.d(10 * vw4.d().getDisplayMetrics().density);
        int measuredHeight = getMeasuredHeight() / 2;
        TextView textView = this.v0;
        cri.c(textView, iD, measuredHeight - (textView.getMeasuredHeight() / 2), 0, 12);
        int iJ = utb.j(4, vw4.d().getDisplayMetrics().density, textView.getMeasuredWidth(), iD);
        int measuredHeight2 = getMeasuredHeight() / 2;
        w2b w2bVar = this.w0;
        cri.c(w2bVar, iJ, measuredHeight2 - (w2bVar.getMeasuredHeight() / 2), 0, 12);
    }

    @Override // android.view.View
    public final void onMeasure(int i, int i2) {
        int iD = kti.d(10 * vw4.d().getDisplayMetrics().density) * 2;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(kti.d(20 * vw4.d().getDisplayMetrics().density), 1073741824);
        TextView textView = this.v0;
        textView.measure(iMakeMeasureSpec, iMakeMeasureSpec);
        int iJ = utb.j(4, vw4.d().getDisplayMetrics().density, textView.getMeasuredWidth(), iD);
        w2b w2bVar = this.w0;
        w2bVar.measure(0, 0);
        setMeasuredDimension(w2bVar.getMeasuredWidth() + iJ, Math.max(kti.d(28 * vw4.d().getDisplayMetrics().density), w2bVar.getMeasuredHeight()));
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
    }

    public final void setCount(int i) {
        this.z0.O(this, B0[2], Integer.valueOf(i));
    }

    public final void setOnChipClickListener(em6 em6Var) {
        f8j.d(this, 300L, new kg6(this, 26, em6Var));
    }

    public final void setOwn(boolean z) {
        this.x0.O(this, B0[0], Boolean.valueOf(z));
    }

    public final void setReaction(x8d x8dVar) {
        this.y0.O(this, B0[1], x8dVar);
    }
}
