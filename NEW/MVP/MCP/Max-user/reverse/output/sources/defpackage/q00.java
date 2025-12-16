package defpackage;

import android.animation.ValueAnimator;
import android.graphics.Matrix;
import android.graphics.RectF;
import android.view.ViewGroup;
import android.widget.TextView;
import one.me.common.drawable.SavedMessagesIconDrawable;
import org.apache.http.util.LangUtils;
import ru.ok.messages.settings.view.BrightnessSeekBar;
import ru.ok.messages.views.widgets.SlideOutLayout;
import ru.ok.tamtam.nano.Protos;

/* loaded from: classes2.dex */
public final /* synthetic */ class q00 implements ValueAnimator.AnimatorUpdateListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ q00(int i, Object obj) {
        this.a = i;
        this.b = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
    public final void onAnimationUpdate(ValueAnimator valueAnimator) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                r00 r00Var = (r00) obj;
                r00Var.f = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                r00Var.invalidateSelf();
                return;
            case 1:
                c20 c20Var = (c20) obj;
                c20Var.getClass();
                c20Var.b = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                c20Var.invalidateSelf();
                return;
            case 2:
                m60 m60Var = (m60) obj;
                m60Var.u0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                m60Var.invalidateSelf();
                return;
            case 3:
                y60 y60Var = (y60) obj;
                y60Var.B0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                y60Var.postInvalidateOnAnimation();
                return;
            case 4:
                ((fba) obj).z0.setTranslationY(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case 5:
                BrightnessSeekBar brightnessSeekBar = (BrightnessSeekBar) obj;
                int i2 = BrightnessSeekBar.t0;
                brightnessSeekBar.getClass();
                float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                brightnessSeekBar.o = fFloatValue;
                if (fFloatValue < 0.0f) {
                    brightnessSeekBar.o = 0.0f;
                }
                brightnessSeekBar.invalidate();
                return;
            case 6:
                zb1 zb1Var = (zb1) obj;
                Object animatedValue = valueAnimator.getAnimatedValue();
                Float f = animatedValue instanceof Float ? (Float) animatedValue : null;
                float fFloatValue2 = f != null ? f.floatValue() : 1.0f;
                ec1 background = zb1Var.getBackground();
                if (background != null) {
                    background.setAlpha((int) (255 * fFloatValue2));
                }
                zb1Var.F0.setAlpha(fFloatValue2);
                zb1Var.G0.setAlpha(fFloatValue2);
                return;
            case 7:
                ((ec1) obj).invalidateSelf();
                return;
            case 8:
                x52 x52Var = (x52) obj;
                Float[] fArr = x52Var.o;
                if (fArr[1] != null) {
                    fArr[1] = valueAnimator.getAnimatedValue();
                    x52Var.a.invoke();
                    return;
                }
                return;
            case 9:
                t84 t84Var = (t84) obj;
                float fFloatValue3 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                x93 x93Var = t84Var.w0;
                x93Var.b = fFloatValue3;
                x93Var.invalidateSelf();
                t84Var.setText(String.valueOf((((int) ((t84Var.u0 * ((100 * fFloatValue3) / 360.0f)) / 100.0f)) / 1000) + 1));
                return;
            case 10:
                ea4 ea4Var = (ea4) obj;
                RectF rectF = ea4Var.g;
                Matrix matrix = ea4Var.k;
                float fFloatValue4 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                if (fFloatValue4 == 0.0f) {
                    return;
                }
                matrix.postScale(fFloatValue4 / mei.c(matrix, 0), 1.0f, rectF.centerX(), rectF.centerY());
                ea4Var.j.set(matrix);
                w7i w7iVar = ea4Var.b;
                if (w7iVar != null) {
                    w7iVar.a(matrix);
                    return;
                }
                return;
            case 11:
                d65 d65Var = (d65) obj;
                d65Var.getClass();
                d65Var.d.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                fn5 fn5Var = (fn5) obj;
                fn5Var.z0 = (Integer) valueAnimator.getAnimatedValue();
                ViewGroup.LayoutParams layoutParams = fn5Var.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.height = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                fn5Var.setLayoutParams(layoutParams);
                return;
            case 13:
                xu6 xu6Var = (xu6) obj;
                xu6Var.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                xu6Var.invalidate();
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                a38 a38Var = (a38) obj;
                float animatedFraction = valueAnimator.getAnimatedFraction();
                if (animatedFraction <= 0.1f && a38Var.a) {
                    a38Var.a = false;
                    a38Var.b.a();
                    return;
                } else {
                    if (animatedFraction > 0.1f) {
                        a38Var.a = true;
                        return;
                    }
                    return;
                }
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                ((mc8) obj).invalidateSelf();
                return;
            case 16:
                ((bi9) obj).I0.getForeground().setAlpha(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case LangUtils.HASH_SEED /* 17 */:
                efa efaVar = (efa) obj;
                efaVar.Y = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                efaVar.invalidateSelf();
                return;
            case 18:
                w2b w2bVar = (w2b) obj;
                w2bVar.o = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                w2bVar.invalidate();
                return;
            case 19:
                ((gdb) obj).setBackgroundColor(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 20:
                c9d c9dVar = (c9d) obj;
                c9dVar.d = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                c9dVar.invalidate();
                return;
            case 21:
                Integer num = (Integer) valueAnimator.getAnimatedValue();
                num.getClass();
                ((ead) obj).invoke(num);
                return;
            case 22:
                qqd qqdVar = (qqd) obj;
                float fFloatValue5 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                qqdVar.a = bui.b(vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 320.0f, fFloatValue5) / 2.0f;
                qqdVar.b = bui.b(vw4.d().getDisplayMetrics().density * 16.0f, vw4.d().getDisplayMetrics().density * 400.0f, fFloatValue5) / 2.0f;
                qqdVar.c = bui.b(0.7f, 0.0f, fFloatValue5);
                qqdVar.a();
                qqdVar.invalidateSelf();
                return;
            case 23:
                o1e o1eVar = (o1e) obj;
                o1eVar.getClass();
                gri.a("ScreenFlashView", "animateToFullOpacity: value = " + ((Float) valueAnimator.getAnimatedValue()).floatValue());
                o1eVar.setAlpha(((Float) valueAnimator.getAnimatedValue()).floatValue());
                return;
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                ((ewe) obj).invalidateSelf();
                return;
            case 25:
                int i3 = SlideOutLayout.B0;
                ((SlideOutLayout) obj).e();
                return;
            case 26:
                ((TextView) obj).setWidth(((Integer) valueAnimator.getAnimatedValue()).intValue());
                return;
            case 27:
                l5h l5hVar = (l5h) obj;
                int iIntValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
                ViewGroup.LayoutParams layoutParams2 = l5hVar.getLayoutParams();
                layoutParams2.width = iIntValue;
                layoutParams2.height = iIntValue;
                l5hVar.setLayoutParams(layoutParams2);
                return;
            case 28:
                q8h q8hVar = (q8h) obj;
                float fFloatValue6 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                q8hVar.F = fFloatValue6;
                n38 n38Var = q8hVar.p;
                xod xodVar = n38Var != null ? n38Var.c.A0 : null;
                if (xodVar != null) {
                    xodVar.d(fFloatValue6);
                    return;
                }
                return;
            default:
                g9h g9hVar = (g9h) obj;
                g9hVar.s0 = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                g9hVar.invalidateSelf();
                return;
        }
    }
}
