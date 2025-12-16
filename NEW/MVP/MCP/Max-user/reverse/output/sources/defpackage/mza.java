package defpackage;

import android.R;
import android.content.Context;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.Shader;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.TextView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class mza extends FrameLayout implements u6g {
    public static final /* synthetic */ yy7[] u0;
    public static final float[] v0;
    public final nk a;
    public final ShapeDrawable b;
    public final ShapeDrawable c;
    public final ShapeDrawable d;
    public final Matrix o;
    public final Object s0;
    public final Object t0;

    static {
        z8a z8aVar = new z8a(mza.class, "state", "getState()Lone/me/sdk/uikit/common/button/OneMeButtonTextPromo$State;");
        vid.a.getClass();
        u0 = new yy7[]{z8aVar};
        v0 = new float[]{0.0f, 0.41f, 1.0f};
    }

    public mza(Context context) {
        super(context, null);
        this.a = new nk(this);
        ShapeDrawable shapeDrawable = new ShapeDrawable();
        this.b = shapeDrawable;
        ShapeDrawable shapeDrawable2 = new ShapeDrawable();
        this.c = shapeDrawable2;
        ShapeDrawable shapeDrawable3 = new ShapeDrawable();
        this.d = shapeDrawable3;
        this.o = new Matrix();
        this.s0 = ipi.b(3, new ns2(context, 23));
        this.t0 = ipi.b(3, new es9(context, 27, this));
        setClipToOutline(true);
        setOutlineProvider(new u74(vw4.d().getDisplayMetrics().density * 16.0f));
        float f = 52;
        setMinimumWidth(kti.d(vw4.d().getDisplayMetrics().density * f));
        setMinimumHeight(kti.d(f * vw4.d().getDisplayMetrics().density));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{R.attr.state_pressed}, shapeDrawable2);
        stateListDrawable.addState(new int[]{R.attr.state_enabled}, shapeDrawable);
        stateListDrawable.addState(new int[]{-16842910}, shapeDrawable3);
        setBackground(stateListDrawable);
        float f2 = 20;
        setPadding(kti.d(vw4.d().getDisplayMetrics().density * f2), 0, kti.d(f2 * vw4.d().getDisplayMetrics().density), 0);
        a(getState());
        onThemeChanged(a93.s0.y(this));
    }

    /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, k18] */
    /* JADX WARN: Type inference failed for: r3v0, types: [java.lang.Object, k18] */
    public final void a(lza lzaVar) {
        int iOrdinal = lzaVar.ordinal();
        ?? r1 = this.t0;
        ?? r3 = this.s0;
        if (iOrdinal != 0) {
            if (iOrdinal != 1) {
                throw new NoWhenBranchMatchedException();
            }
            ((View) r3.getValue()).setVisibility(8);
            ((View) r1.getValue()).setVisibility(0);
            return;
        }
        ((View) r3.getValue()).setVisibility(0);
        if (r1.e()) {
            ((m9b) r1.getValue()).setVisibility(8);
        }
    }

    public final lza getState() {
        yy7 yy7Var = u0[0];
        return (lza) this.a.b;
    }

    @Override // android.view.View
    public final void onSizeChanged(int i, int i2, int i3, int i4) {
        Matrix matrix = this.o;
        matrix.reset();
        matrix.setScale(i, i2);
        matrix.postTranslate(0.0f, 0.0f);
        ((LinearGradient) this.b.getPaint().getShader()).setLocalMatrix(matrix);
        ((LinearGradient) this.c.getPaint().getShader()).setLocalMatrix(matrix);
        ((LinearGradient) this.d.getPaint().getShader()).setLocalMatrix(matrix);
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, k18] */
    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        Paint paint = this.b.getPaint();
        int[] iArr = yebVar.d().b.a;
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        float[] fArr = v0;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.3f, 1.0f, 0.7f, iArr, fArr, tileMode);
        Matrix matrix = this.o;
        linearGradient.setLocalMatrix(matrix);
        paint.setShader(linearGradient);
        Paint paint2 = this.c.getPaint();
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.3f, 1.0f, 0.7f, yebVar.d().b.c, fArr, tileMode);
        linearGradient2.setLocalMatrix(matrix);
        paint2.setShader(linearGradient2);
        Paint paint3 = this.d.getPaint();
        LinearGradient linearGradient3 = new LinearGradient(0.0f, 0.3f, 1.0f, 0.7f, yebVar.d().b.b, fArr, tileMode);
        linearGradient3.setLocalMatrix(matrix);
        paint3.setShader(linearGradient3);
        ?? r1 = this.s0;
        if (r1.e()) {
            ((TextView) r1.getValue()).setTextColor(-1);
        }
    }

    public final void setState(lza lzaVar) {
        this.a.O(this, u0[0], lzaVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setText(CharSequence charSequence) {
        TextView textView = (TextView) this.s0.getValue();
        textView.setId(zud.j);
        textView.setText(charSequence);
        dqi.a(this, textView, -1);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    public final void setText(int i) {
        TextView textView = (TextView) this.s0.getValue();
        textView.setText(i);
        dqi.a(this, textView, -1);
    }
}
