package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Picture;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import java.util.LinkedHashSet;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.internal.ContextScope;
import kotlinx.coroutines.internal.MainDispatcherLoader;
import one.me.rlottie.ImageReceiver;
import one.me.rlottie.RLottieDrawable;

/* loaded from: classes2.dex */
public final class ok extends Drawable implements Animatable, hgh {
    public static final b6a B0;
    public static final /* synthetic */ yy7[] C0;
    public static final ThreadLocal D0;
    public static final Object E0;
    public ContextScope A0;
    public final wl8 X;
    public boolean Y;
    public final nk Z;
    public final int a;
    public final x26 b;
    public final yi c;
    public final pi d;
    public final boolean o;
    public final String s0;
    public final sf t0;
    public final Object u0;
    public final Drawable v0;
    public final bwf w0;
    public RLottieDrawable x0;
    public lk y0;
    public final LinkedHashSet z0;

    static {
        z8a z8aVar = new z8a(ok.class, "state", "getState()Lone/me/sdk/animoji/AnimojiStateDrawable$State;");
        vid.a.getClass();
        C0 = new yy7[]{z8aVar};
        B0 = new b6a(13);
        D0 = ThreadLocal.withInitial(new ik(0));
        E0 = ipi.b(3, new l(6));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ok(Context context, int i, tcf tcfVar, yi yiVar, pi piVar) {
        this(context, i, tcfVar, yiVar, piVar, true, MainDispatcherLoader.dispatcher);
        ep4 ep4Var = gy4.a;
    }

    @Override // defpackage.hgh
    public final void a() {
        this.Y = false;
        bwf bwfVar = this.w0;
        if (bwfVar.e()) {
            ((nwg) bwfVar.getValue()).a();
        }
    }

    @Override // defpackage.hgh
    public final void b() {
        bwf bwfVar = this.w0;
        ho7.q("onAttach: ", this.s0, bwfVar.e());
        this.Y = true;
        if (bwfVar.e()) {
            nwg nwgVar = (nwg) bwfVar.getValue();
            nwgVar.setBounds(getBounds());
            nwgVar.b();
        }
    }

    public final void c(ImageReceiver imageReceiver) {
        Drawable drawableE = e();
        RLottieDrawable rLottieDrawable = this.x0;
        if (drawableE != rLottieDrawable) {
            this.z0.add(imageReceiver);
        } else if (rLottieDrawable != null) {
            rLottieDrawable.addParentView(imageReceiver);
        }
    }

    public final void d(Canvas canvas, float f, Paint paint) {
        Canvas canvasBeginRecording;
        Drawable drawableE = e();
        int iSave = canvas.save();
        float f2 = f - 0.0f;
        canvas.translate(0.0f, f2 > ((float) drawableE.getBounds().height()) ? (f2 / 2) - (drawableE.getBounds().height() / 2) : f - drawableE.getBounds().height());
        if (this.o && paint.getAlpha() != 255) {
            paint.setAlpha(255);
        }
        RLottieDrawable rLottieDrawable = this.x0;
        if (drawableE == rLottieDrawable) {
            Picture picture = (Picture) D0.get();
            if (picture != null) {
                try {
                    canvasBeginRecording = picture.beginRecording(((RLottieDrawable) drawableE).getBounds().width(), ((RLottieDrawable) drawableE).getBounds().height());
                } catch (IllegalStateException unused) {
                    picture.endRecording();
                    RLottieDrawable rLottieDrawable2 = (RLottieDrawable) drawableE;
                    canvasBeginRecording = picture.beginRecording(rLottieDrawable2.getBounds().width(), rLottieDrawable2.getBounds().height());
                }
            } else {
                canvasBeginRecording = null;
            }
            try {
                ((RLottieDrawable) drawableE).draw(canvasBeginRecording, paint);
            } catch (IllegalStateException e) {
                wqi.e(ok.class.getName(), "fail to draw drawable", e);
                if (vmf.s(e.toString(), "Underflow in restore", false) && isRunning()) {
                    h();
                }
            }
            if (picture != null) {
                picture.endRecording();
            }
        } else {
            drawableE.setAlpha(paint.getAlpha());
            drawableE.draw(canvas);
        }
        canvas.restoreToCount(iSave);
        if (rLottieDrawable == null || drawableE != rLottieDrawable) {
            return;
        }
        Bitmap renderingBitmap = rLottieDrawable.getRenderingBitmap();
        if (renderingBitmap != null) {
            canvas.save();
            canvas.translate(0.0f, f - rLottieDrawable.getBounds().height());
            canvas.scale(rLottieDrawable.getBounds().width() / rLottieDrawable.getIntrinsicWidth(), rLottieDrawable.getBounds().height() / rLottieDrawable.getIntrinsicHeight());
            canvas.drawBitmap(renderingBitmap, 0.0f, 0.0f, paint);
            canvas.restore();
            return;
        }
        String name = ok.class.getName();
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.X;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, name, wy1.h("Can't draw lottie because bitmap is null. Draw static, url:", rLottieDrawable.getCurrentUrl()), null);
            }
        }
        bwf bwfVar = this.w0;
        (bwfVar.e() ? (Drawable) bwfVar.getValue() : this.v0).draw(canvas);
        h();
    }

    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object, k18] */
    @Override // android.graphics.drawable.Drawable
    public final void draw(Canvas canvas) {
        float fHeight = e().getBounds().height();
        B0.getClass();
        d(canvas, fHeight, (Paint) E0.getValue());
    }

    public final Drawable e() {
        yy7 yy7Var = C0[0];
        int iOrdinal = ((jk) this.Z.b).ordinal();
        Drawable drawable = this.v0;
        if (iOrdinal == 0) {
            return drawable;
        }
        bwf bwfVar = this.w0;
        if (iOrdinal == 1) {
            return (Drawable) bwfVar.getValue();
        }
        if (iOrdinal != 2) {
            throw new NoWhenBranchMatchedException();
        }
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            if (rLottieDrawable.isLoadingFailed()) {
                rLottieDrawable = null;
            }
            if (rLottieDrawable != null) {
                return rLottieDrawable;
            }
        }
        if (!(this.c instanceof wi)) {
            drawable = null;
        }
        return drawable == null ? (Drawable) bwfVar.getValue() : drawable;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ok) {
            return fni.a(this.b, ((ok) obj).b);
        }
        return false;
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, k18] */
    public final Drawable f() {
        yi yiVar = this.c;
        if (yiVar instanceof wi) {
            return ((wi) yiVar).a;
        }
        bwf bwfVar = this.w0;
        return bwfVar.e() ? (Drawable) bwfVar.getValue() : (dd5) this.u0.getValue();
    }

    public final void g(String str) {
        nwg nwgVar = (nwg) this.w0.getValue();
        nwgVar.e(null, str);
        Drawable drawable = this.v0;
        l45 l45Var = nwgVar.a.d;
        l45Var.getClass();
        ((gr6) l45Var).i(drawable, 1);
        nwgVar.invalidateSelf();
        nwgVar.c = new ia(this, 1, nwgVar);
        String str2 = this.s0;
        l6b l6bVar = wqi.a;
        if (l6bVar != null) {
            lg8 lg8Var = lg8.d;
            if (l6bVar.b(lg8Var)) {
                l6bVar.c(lg8Var, str2, "before onAttach " + str + " " + e().getBounds(), null);
            }
        }
        nwgVar.b();
        i(jk.b);
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicHeight() {
        return e().getIntrinsicHeight();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getIntrinsicWidth() {
        return e().getIntrinsicWidth();
    }

    @Override // android.graphics.drawable.Drawable
    public final int getOpacity() {
        return e().getOpacity();
    }

    public final void h() {
        Drawable drawableE = e();
        RLottieDrawable rLottieDrawable = this.x0;
        if (drawableE != rLottieDrawable) {
            e().invalidateSelf();
        } else if (rLottieDrawable != null) {
            rLottieDrawable.invalidateInternal();
        }
    }

    public final int hashCode() {
        return (this.b.hashCode() * 31) + ok.class.hashCode();
    }

    public final void i(jk jkVar) {
        this.Z.O(this, C0[0], jkVar);
    }

    @Override // android.graphics.drawable.Drawable
    public final void invalidateSelf() {
        h();
    }

    @Override // android.graphics.drawable.Animatable
    public final boolean isRunning() {
        Drawable drawableE = e();
        RLottieDrawable rLottieDrawable = this.x0;
        return drawableE == rLottieDrawable && rLottieDrawable != null && rLottieDrawable.isRunning();
    }

    @Override // android.graphics.drawable.Drawable
    public final void onBoundsChange(Rect rect) {
        bwf bwfVar = this.w0;
        if (bwfVar.e()) {
            nwg nwgVar = (nwg) bwfVar.getValue();
            nwgVar.setBounds(rect);
            if (this.Y) {
                nwgVar.b();
            }
        }
        this.v0.setBounds(rect);
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setBounds(rect);
        }
    }

    @Override // android.graphics.drawable.Drawable
    public final void setAlpha(int i) {
        e().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public final void setColorFilter(ColorFilter colorFilter) {
        e().setColorFilter(colorFilter);
    }

    @Override // android.graphics.drawable.Animatable
    public final void start() {
        if (!d7j.f(this.A0)) {
            this.A0 = d7j.a(zk6.a().plus(this.X));
            gw0.w(new g56(new d53(this.b, 12), new mk(this, null), 1), this.A0);
        }
        Drawable drawable = this.v0;
        sf sfVar = this.t0;
        drawable.setCallback(sfVar);
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(sfVar);
        }
        bwf bwfVar = this.w0;
        if (bwfVar.e()) {
            ((nwg) bwfVar.getValue()).setCallback(sfVar);
        }
        RLottieDrawable rLottieDrawable2 = this.x0;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.invalidateInternal();
        }
        Drawable drawableE = e();
        RLottieDrawable rLottieDrawable3 = this.x0;
        if (drawableE != rLottieDrawable3 || rLottieDrawable3 == null) {
            return;
        }
        rLottieDrawable3.start();
    }

    @Override // android.graphics.drawable.Animatable
    public final void stop() {
        d7j.c(this.A0, null);
        this.v0.setCallback(null);
        RLottieDrawable rLottieDrawable = this.x0;
        if (rLottieDrawable != null) {
            rLottieDrawable.setCallback(null);
        }
        bwf bwfVar = this.w0;
        if (bwfVar.e()) {
            ((nwg) bwfVar.getValue()).setCallback(null);
        }
        RLottieDrawable rLottieDrawable2 = this.x0;
        if (rLottieDrawable2 != null) {
            rLottieDrawable2.stop();
        }
    }

    public ok(Context context, int i, x26 x26Var, yi yiVar, pi piVar, boolean z, wl8 wl8Var) {
        Drawable drawable;
        this.a = i;
        this.b = x26Var;
        this.c = yiVar;
        this.d = piVar;
        this.o = z;
        this.X = wl8Var;
        this.Z = new nk(this);
        this.s0 = ok.class.getName();
        this.t0 = new sf(1, this);
        k18 k18VarB = ipi.b(3, new i6(8, this));
        this.u0 = k18VarB;
        if (yiVar instanceof wi) {
            drawable = ((wi) yiVar).a;
        } else if (yiVar instanceof xi) {
            drawable = (dd5) k18VarB.getValue();
        } else {
            throw new NoWhenBranchMatchedException();
        }
        this.v0 = drawable;
        this.w0 = new bwf(new m3(context, 2, this));
        this.z0 = new LinkedHashSet();
        this.A0 = d7j.a(zk6.a().plus(wl8Var));
        gw0.w(new g56(new d53(x26Var, 12), new mk(this, null), 1), this.A0);
    }
}
