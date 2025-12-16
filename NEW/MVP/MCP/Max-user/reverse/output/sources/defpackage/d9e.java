package defpackage;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.shapes.RoundRectShape;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.NoWhenBranchMatchedException;

/* loaded from: classes2.dex */
public final class d9e extends vhd implements u6g {
    public final Paint X;
    public final RectF Y;
    public final Rect Z;
    public final b9e a;
    public final int b;
    public final em6 c;
    public final em6 d;
    public final Paint o;
    public final i8a s0;
    public final i8a t0;
    public final i8a u0;
    public final float[] v0;
    public final Path w0;
    public final mc5 x0;

    public d9e(yeb yebVar, b9e b9eVar, em6 em6Var, a7c a7cVar, int i) {
        int i2 = (i & 4) != 0 ? 4 : 0;
        em6Var = (i & 8) != 0 ? new llc(11) : em6Var;
        em6 llcVar = (i & 16) != 0 ? new llc(12) : a7cVar;
        this.a = b9eVar;
        this.b = i2;
        this.c = em6Var;
        this.d = llcVar;
        Paint paint = new Paint();
        paint.setAntiAlias(true);
        paint.setStyle(Paint.Style.FILL);
        this.o = paint;
        Paint paint2 = new Paint();
        paint2.setAntiAlias(true);
        paint2.setStyle(Paint.Style.STROKE);
        paint2.setStrokeWidth(vw4.d().getDisplayMetrics().density * 2.0f);
        this.X = paint2;
        this.Y = new RectF();
        this.Z = new Rect();
        i8a i8aVar = vo7.a;
        this.s0 = new i8a();
        this.t0 = new i8a();
        this.u0 = new i8a();
        this.v0 = new float[8];
        this.w0 = new Path();
        this.x0 = new mc5(18);
        onThemeChanged(yebVar);
    }

    public static final void i(d9e d9eVar, Canvas canvas, sid sidVar) {
        Path path = d9eVar.w0;
        Paint paint = d9eVar.X;
        RectF rectF = d9eVar.Y;
        float[] fArr = d9eVar.v0;
        path.addRoundRect(rectF, fArr, Path.Direction.CCW);
        canvas.drawPath(path, d9eVar.o);
        int i = sidVar.a;
        if (i != Integer.MIN_VALUE) {
            paint.setColor(i);
            canvas.drawPath(path, paint);
        }
        path.reset();
        rectF.set(Float.MAX_VALUE, Float.MAX_VALUE, Float.MIN_VALUE, Float.MIN_VALUE);
        ys.q(fArr, 0.0f);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.vhd
    public final void f(Rect rect, View view, RecyclerView recyclerView, iid iidVar) {
        int iR = RecyclerView.R(view);
        if (iR == -1) {
            return;
        }
        int iG = this.a.g(iR);
        i8a i8aVar = this.s0;
        i8aVar.i(iR);
        i8a i8aVar2 = this.t0;
        i8aVar2.i(iR);
        i8a i8aVar3 = this.u0;
        i8aVar3.i(iR);
        int i = iG == 0 ? -1 : c9e.$EnumSwitchMapping$0[az1.v(iG)];
        if (i != -1) {
            int i2 = this.b;
            if (i == 1) {
                rect.top = u45.c(i2, vw4.d().getDisplayMetrics().density, rect.top);
                i8aVar.a(iR);
                rqd rqdVar = view instanceof rqd ? (rqd) view : null;
                if (rqdVar != null) {
                    rqdVar.setRippleMask(new RoundRectShape(new float[]{vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f, 0.0f, 0.0f, 0.0f, 0.0f}, null, null));
                }
            } else if (i == 2) {
                rect.bottom = u45.c(i2, vw4.d().getDisplayMetrics().density, rect.bottom);
                i8aVar3.a(iR);
                rqd rqdVar2 = view instanceof rqd ? (rqd) view : null;
                if (rqdVar2 != null) {
                    rqdVar2.setRippleMask(new RoundRectShape(new float[]{0.0f, 0.0f, 0.0f, 0.0f, vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f}, null, null));
                }
            } else if (i == 3) {
                float f = i2;
                rect.top = u45.c(f, vw4.d().getDisplayMetrics().density, rect.top);
                rect.bottom = u45.c(f, vw4.d().getDisplayMetrics().density, rect.bottom);
                i8aVar.a(iR);
                i8aVar3.a(iR);
                rqd rqdVar3 = view instanceof rqd ? (rqd) view : null;
                if (rqdVar3 != null) {
                    rqdVar3.setRippleMask(new RoundRectShape(new float[]{vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 16.0f}, null, null));
                }
            } else {
                if (i != 4) {
                    throw new NoWhenBranchMatchedException();
                }
                i8aVar2.a(iR);
                rqd rqdVar4 = view instanceof rqd ? (rqd) view : null;
                if (rqdVar4 != null) {
                    rqdVar4.setRippleMask(null);
                }
            }
        }
        this.x0.w(rect, view, recyclerView);
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x00b0  */
    @Override // defpackage.vhd
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void g(android.graphics.Canvas r22, androidx.recyclerview.widget.RecyclerView r23, defpackage.iid r24) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.d9e.g(android.graphics.Canvas, androidx.recyclerview.widget.RecyclerView, iid):void");
    }

    @Override // defpackage.u6g
    public final void onThemeChanged(yeb yebVar) {
        this.o.setColor(((Number) this.c.invoke(yebVar)).intValue());
        this.X.setColor(yebVar.b().a.f);
    }
}
