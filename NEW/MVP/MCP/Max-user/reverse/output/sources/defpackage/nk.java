package defpackage;

import android.animation.FloatEvaluator;
import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Paint;
import android.view.GestureDetector;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import one.me.chatmedia.viewer.ChatMediaViewerScreen;
import one.me.common.drawable.SavedMessagesIconDrawable;
import one.me.sdk.uikit.common.button.OneMeTitleSubtitleButton;
import org.apache.http.util.LangUtils;
import ru.ok.tamtam.nano.Protos;
import ru.ok.utils.widgets.BadgeCountView;

/* loaded from: classes2.dex */
public final class nk extends i3 {
    public final /* synthetic */ int c;
    public final /* synthetic */ Object d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk(int i, Object obj) {
        super(12, (Object) null);
        this.c = i;
        this.d = obj;
    }

    /* JADX WARN: Type inference failed for: r2v85, types: [java.lang.Object, k18] */
    @Override // defpackage.i3
    public final void a0(Object obj, Object obj2) {
        ec1 background;
        kwe kweVar;
        int i;
        float f;
        float f2;
        pd7 pd7Var;
        int i2;
        int i3;
        int iD;
        switch (this.c) {
            case 0:
                if (fni.a(obj, obj2)) {
                    return;
                }
                jk jkVar = (jk) obj2;
                String str = ((ok) this.d).s0;
                l6b l6bVar = wqi.a;
                if (l6bVar != null) {
                    lg8 lg8Var = lg8.d;
                    if (l6bVar.b(lg8Var)) {
                        l6bVar.c(lg8Var, str, "state = " + jkVar, null);
                    }
                }
                ok okVar = (ok) this.d;
                if (okVar.Y && jkVar == jk.b) {
                    okVar.b();
                }
                ((ok) this.d).h();
                ((ok) this.d).h();
                ok okVar2 = (ok) this.d;
                okVar2.t0.invalidateDrawable(okVar2);
                return;
            case 1:
                BadgeCountView badgeCountView = (BadgeCountView) this.d;
                vg0 vg0Var = (vg0) obj2;
                if (fni.a((vg0) obj, vg0Var)) {
                    return;
                }
                if (vg0Var == null) {
                    badgeCountView.setVisibility(8);
                    return;
                }
                int i4 = vg0Var.b;
                yy7[] yy7VarArr = BadgeCountView.z0;
                ViewGroup.LayoutParams layoutParams = badgeCountView.getLayoutParams();
                if (layoutParams == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                layoutParams.width = !badgeCountView.needPlusIndicator ? kti.d(i4 * badgeCountView.getContext().getResources().getDisplayMetrics().density) : kti.d(u45.c(2, vw4.d().getDisplayMetrics().density, i4) * badgeCountView.getContext().getResources().getDisplayMetrics().density);
                layoutParams.height = kti.d(20 * badgeCountView.getContext().getResources().getDisplayMetrics().density);
                badgeCountView.setLayoutParams(layoutParams);
                badgeCountView.setBackground(vg0Var.a);
                badgeCountView.setTextSize(vg0Var.c);
                return;
            case 2:
                yb1 yb1Var = (yb1) obj2;
                if (((yb1) obj) == yb1Var || (background = ((zb1) this.d).getBackground()) == null) {
                    return;
                }
                int iOrdinal = yb1Var.ordinal();
                if (iOrdinal == 0) {
                    kweVar = kwe.b;
                } else if (iOrdinal == 1) {
                    kweVar = kwe.c;
                } else {
                    if (iOrdinal != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    kweVar = kwe.d;
                }
                background.X.c(kweVar);
                return;
            case 3:
                if (fni.a(obj, obj2)) {
                    return;
                }
                ((ec1) this.d).invalidateSelf();
                return;
            case 4:
                if (fni.a(obj, obj2)) {
                    return;
                }
                final g12 g12Var = (g12) this.d;
                v1a v1aVar = a93.s0;
                ValueAnimator valueAnimator = g12Var.d;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                final int color = g12Var.s0.getColor();
                int iOrdinal2 = g12Var.getType().ordinal();
                if (iOrdinal2 == 0) {
                    v1aVar.y(g12Var).i();
                    i = 1308622847;
                } else if (iOrdinal2 == 1) {
                    i = v1aVar.y(g12Var).i().c;
                } else {
                    if (iOrdinal2 != 2 && iOrdinal2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i = v1aVar.y(g12Var).e().a;
                }
                final int i5 = i;
                final float f3 = g12Var.t0;
                int iOrdinal3 = g12Var.getType().ordinal();
                if (iOrdinal3 == 0) {
                    f = g12.y0;
                } else if (iOrdinal3 == 1) {
                    f = g12.z0;
                } else if (iOrdinal3 == 2) {
                    f = g12.A0;
                } else {
                    if (iOrdinal3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f = g12.B0;
                }
                final float f4 = f;
                final float f5 = g12Var.u0;
                int iOrdinal4 = g12Var.getType().ordinal();
                if (iOrdinal4 == 0 || iOrdinal4 == 1 || iOrdinal4 == 2) {
                    f2 = 0.0f;
                } else {
                    if (iOrdinal4 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    f2 = 1.0f;
                }
                final float f6 = f2;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: e12
                    @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                    public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                        float animatedFraction = valueAnimator2.getAnimatedFraction();
                        g12 g12Var2 = g12Var;
                        g12Var2.s0.setColor(((Integer) g12Var2.b.evaluate(animatedFraction, Integer.valueOf(color), Integer.valueOf(i5))).intValue());
                        FloatEvaluator floatEvaluator = g12Var2.c;
                        g12Var2.t0 = floatEvaluator.evaluate(animatedFraction, (Number) Float.valueOf(f3), (Number) Float.valueOf(f4)).floatValue();
                        g12Var2.u0 = floatEvaluator.evaluate(animatedFraction, (Number) Float.valueOf(f5), (Number) Float.valueOf(f6)).floatValue();
                        g12Var2.invalidate();
                    }
                });
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.start();
                g12Var.d = valueAnimatorOfFloat;
                return;
            case 5:
                d52 d52Var = (d52) this.d;
                if (fni.a(obj, obj2)) {
                    return;
                }
                b52 b52Var = (b52) obj2;
                d52Var.h(b52Var);
                ChatMediaViewerScreen chatMediaViewerScreen = d52Var.a;
                chatMediaViewerScreen.getClass();
                int iOrdinal5 = b52Var.ordinal();
                if (iOrdinal5 == 0) {
                    za0 za0Var = chatMediaViewerScreen.C0;
                    if (za0Var != null) {
                        za0Var.e(true);
                    }
                } else if (iOrdinal5 == 1) {
                    za0 za0Var2 = chatMediaViewerScreen.C0;
                    if (za0Var2 != null) {
                        za0Var2.e(false);
                    }
                } else {
                    if (iOrdinal5 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    za0 za0Var3 = chatMediaViewerScreen.C0;
                    if (za0Var3 != null) {
                        za0Var3.e(false);
                    }
                }
                d52Var.i();
                return;
            case 6:
                zd3 zd3Var = (zd3) this.d;
                if (fni.a(obj, obj2)) {
                    return;
                }
                int i6 = 0;
                for (Object obj3 : (List) obj2) {
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        ve3.p();
                        throw null;
                    }
                    jd3 jd3Var = (jd3) obj3;
                    os0 os0Var = zd3Var.f;
                    if (((ArrayList) os0Var.b).size() > i6) {
                        pd7Var = (pd7) os0Var.c(i6);
                    } else {
                        hr6 hr6Var = new hr6(zd3Var.a.getResources());
                        hr6Var.b = 0;
                        pd7Var = new pd7(hr6Var.a());
                        qsd qsdVarD = pd7Var.d();
                        if (qsdVarD != null) {
                            qsdVarD.setCallback(zd3Var.b);
                        }
                        ArrayList arrayList = (ArrayList) os0Var.b;
                        int size = arrayList.size();
                        l5j.d(size, arrayList.size() + 1);
                        arrayList.add(size, pd7Var);
                        if (os0Var.a) {
                            pd7Var.f();
                        }
                    }
                    zd3Var.h(pd7Var, jd3Var, false);
                    i6 = i7;
                }
                return;
            case 7:
                q1g q1gVarD = (q1g) obj2;
                if (fni.a((q1g) obj, q1gVarD)) {
                    return;
                }
                i44 i44Var = (i44) this.d;
                if (q1gVarD == null) {
                    if (i44Var.isInEditMode()) {
                        q1gVarD = bq4.e0;
                    } else {
                        Context context = i44Var.getContext();
                        bwf bwfVar = q1g.a0;
                        q1gVarD = nca.d(context);
                    }
                }
                i44Var.k(q1gVarD);
                return;
            case 8:
                fn5 fn5Var = (fn5) this.d;
                if (fni.a(obj, obj2)) {
                    return;
                }
                wsf.j(fn5Var, fn5Var.d, (t5g) obj2);
                fn5Var.invalidate();
                fn5Var.requestLayout();
                return;
            case 9:
                if (fni.a(obj, obj2)) {
                    return;
                }
                hv5 hv5Var = (hv5) obj2;
                hv5 hv5Var2 = (hv5) obj;
                ww5 ww5Var = (ww5) this.d;
                ww5Var.E0 = (hv5Var == null || (hv5Var.j == null && hv5Var.k == null) || hv5Var.l) ? false : true;
                ww5.B(ww5Var, hv5Var2 == null);
                return;
            case 10:
                if (fni.a(obj, obj2)) {
                    return;
                }
                ((ww6) this.d).invalidateSelf();
                return;
            case 11:
                if (fni.a((aya) obj, (aya) obj2)) {
                    return;
                }
                f08.a((f08) this.d);
                return;
            case Protos.Attaches.Attach.PRESENT /* 12 */:
                s19 s19Var = (s19) this.d;
                if (fni.a(obj, obj2)) {
                    return;
                }
                ws8 ws8Var = (ws8) obj2;
                if (ws8Var != null) {
                    s19Var.t0.m(null, ws8Var);
                    s19Var.x(ws8Var);
                    s19Var.requestLayout();
                    s19Var.invalidate();
                    return;
                }
                return;
            case 13:
                ea9 ea9Var = (ea9) this.d;
                if (fni.a(obj, obj2)) {
                    return;
                }
                ws8 ws8Var2 = (ws8) obj2;
                if (ws8Var2 != null) {
                    ea9Var.getDate$message_list_release().setBackgroundEnabled$message_list_release(!ws8Var2.d());
                    ea9Var.x(ws8Var2);
                    ea9Var.requestLayout();
                    ea9Var.invalidate();
                    return;
                }
                return;
            case Protos.Attaches.Attach.LOCATION /* 14 */:
                if (fni.a(obj, obj2)) {
                    return;
                }
                boolean zBooleanValue = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                ((ik9) this.d).setVideoMsgButtonVisible(zBooleanValue);
                return;
            case Protos.Attaches.Attach.DAILY_MEDIA /* 15 */:
                em6 em6Var = (em6) obj2;
                bb3 defaultMovementMethod = ((rm9) this.d).getDefaultMovementMethod();
                boolean z = em6Var != null;
                GestureDetector gestureDetector = defaultMovementMethod.l;
                if (z) {
                    gestureDetector.setOnDoubleTapListener(defaultMovementMethod.k);
                } else {
                    gestureDetector.setOnDoubleTapListener(null);
                }
                defaultMovementMethod.i = z;
                return;
            case 16:
                if (((y5a) obj) != ((y5a) obj2)) {
                    z5a z5aVar = (z5a) this.d;
                    v1a v1aVar2 = a93.s0;
                    int iOrdinal6 = z5aVar.getMessageTextColor().ordinal();
                    if (iOrdinal6 == 0) {
                        i2 = v1aVar2.B(z5aVar).c.getText().e;
                    } else {
                        if (iOrdinal6 != 1) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i2 = v1aVar2.B(z5aVar).c.getText().g;
                    }
                    z5aVar.H0.setTextColor(i2);
                    return;
                }
                return;
            case LangUtils.HASH_SEED /* 17 */:
                if (fni.a(obj, obj2)) {
                    return;
                }
                ((Number) obj2).floatValue();
                ((Number) obj).floatValue();
                ((wea) this.d).invalidateSelf();
                return;
            case 18:
                if (fni.a(obj, obj2)) {
                    return;
                }
                fwa fwaVar = (fwa) this.d;
                fwaVar.onThemeChanged(a93.s0.y(fwaVar));
                return;
            case 19:
                Boolean bool = (Boolean) obj2;
                if (fni.a((Boolean) obj, bool)) {
                    return;
                }
                aza azaVar = (aza) this.d;
                azaVar.a(a93.s0.y(azaVar), bool);
                return;
            case 20:
                if (fni.a(obj, obj2)) {
                    return;
                }
                ((mza) this.d).a((lza) obj2);
                return;
            case 21:
                j3b j3bVar = (j3b) obj2;
                if (((j3b) obj) != j3bVar) {
                    k3b k3bVar = (k3b) this.d;
                    Paint paint = k3bVar.c;
                    yeb yebVarY = a93.s0.y(k3bVar);
                    int iOrdinal7 = j3bVar.ordinal();
                    if (iOrdinal7 == 0) {
                        i3 = yebVarY.b().a.n;
                    } else if (iOrdinal7 == 1) {
                        i3 = yebVarY.b().a.c;
                    } else if (iOrdinal7 == 2) {
                        i3 = yebVarY.b().a.h;
                    } else {
                        if (iOrdinal7 != 3) {
                            throw new NoWhenBranchMatchedException();
                        }
                        i3 = yebVarY.b().a.f;
                    }
                    paint.setColor(i3);
                    return;
                }
                return;
            case 22:
                yeb yebVarY2 = (yeb) obj2;
                if (fni.a((yeb) obj, yebVarY2)) {
                    return;
                }
                x3b x3bVar = (x3b) this.d;
                if (yebVarY2 == null) {
                    yebVarY2 = a93.s0.y(x3bVar);
                }
                x3bVar.onThemeChanged(yebVarY2);
                return;
            case 23:
                OneMeTitleSubtitleButton oneMeTitleSubtitleButton = (OneMeTitleSubtitleButton) this.d;
                ?? r2 = oneMeTitleSubtitleButton.w0;
                if (fni.a(obj, obj2)) {
                    return;
                }
                boolean zBooleanValue2 = ((Boolean) obj2).booleanValue();
                ((Boolean) obj).getClass();
                if (zBooleanValue2) {
                    ((View) r2.getValue()).setVisibility(0);
                    int i8 = zud.a;
                    OneMeTitleSubtitleButton.a(oneMeTitleSubtitleButton, false);
                    return;
                } else {
                    if (r2.e()) {
                        ((m9b) r2.getValue()).setVisibility(8);
                        int i9 = zud.a;
                        OneMeTitleSubtitleButton.a(oneMeTitleSubtitleButton, true);
                        return;
                    }
                    return;
                }
            case SavedMessagesIconDrawable.NORMAL_ICON_SIZE /* 24 */:
                RecyclerView recyclerView = (RecyclerView) obj2;
                RecyclerView recyclerView2 = (RecyclerView) obj;
                if (recyclerView2 == null || recyclerView2 != recyclerView) {
                    u7c u7cVar = (u7c) this.d;
                    if (u7cVar.f) {
                        nk nkVar = u7cVar.k;
                        yy7 yy7Var = u7c.l[0];
                        RecyclerView recyclerView3 = (RecyclerView) nkVar.b;
                        if (recyclerView3 == null) {
                            return;
                        }
                        recyclerView3.post(new k79(u7cVar, 29, recyclerView3));
                        return;
                    }
                    return;
                }
                return;
            case 25:
                t7d t7dVar = (t7d) this.d;
                if (fni.a(obj, obj2)) {
                    return;
                }
                s7d s7dVar = (s7d) obj2;
                ViewGroup.LayoutParams layoutParams2 = t7dVar.getLayoutParams();
                if (layoutParams2 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                }
                int iOrdinal8 = s7dVar.ordinal();
                if (iOrdinal8 == 0) {
                    iD = kti.d(64 * vw4.d().getDisplayMetrics().density);
                } else {
                    if (iOrdinal8 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    iD = kti.d(80 * vw4.d().getDisplayMetrics().density);
                }
                layoutParams2.height = iD;
                layoutParams2.width = iD;
                t7dVar.c.a = iD / 2.0f;
                t7dVar.setLayoutParams(layoutParams2);
                t7dVar.a();
                return;
            case 26:
                e9d e9dVar = (e9d) this.d;
                if (fni.a(obj, obj2)) {
                    return;
                }
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                e9dVar.requestLayout();
                e9dVar.invalidate();
                return;
            case 27:
                if (fni.a(obj, obj2)) {
                    return;
                }
                dwe dweVar = (dwe) this.d;
                dweVar.a(a93.s0.y(dweVar));
                return;
            case 28:
                if (fni.a(obj, obj2)) {
                    return;
                }
                ((Boolean) obj2).getClass();
                ((Boolean) obj).getClass();
                ((k5f) this.d).m();
                return;
            default:
                wbf wbfVar = (wbf) this.d;
                if (fni.a(obj, obj2)) {
                    return;
                }
                int iOrdinal9 = ((ubf) obj2).ordinal();
                if (iOrdinal9 != 0) {
                    if (iOrdinal9 != 1) {
                        throw new NoWhenBranchMatchedException();
                    }
                    wbf.a(wbfVar);
                    return;
                }
                bwf bwfVar2 = wbfVar.c;
                if (bwfVar2.e()) {
                    TextView textView = (TextView) bwfVar2.getValue();
                    ValueAnimator valueAnimator2 = wbfVar.o;
                    if (valueAnimator2 != null) {
                        valueAnimator2.cancel();
                    }
                    ValueAnimator valueAnimatorB = wbf.b(wbfVar, textView, false);
                    wbfVar.o = valueAnimatorB;
                    valueAnimatorB.start();
                    return;
                }
                return;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ nk(Object obj, int i, Object obj2) {
        super(12, obj);
        this.c = i;
        this.d = obj2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(ok okVar) {
        super(12, jk.a);
        this.c = 0;
        this.d = okVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(zb1 zb1Var) {
        super(12, yb1.a);
        this.c = 2;
        this.d = zb1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(ec1 ec1Var) {
        super(12, dc1.b);
        this.c = 3;
        this.d = ec1Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(g12 g12Var) {
        super(12, f12.a);
        this.c = 4;
        this.d = g12Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(d52 d52Var) {
        super(12, b52.a);
        this.c = 5;
        this.d = d52Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(zd3 zd3Var) {
        super(12, hd5.a);
        this.c = 6;
        this.d = zd3Var;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nk(ik9 ik9Var) {
        this.c = 14;
        Boolean bool = Boolean.FALSE;
        this.d = ik9Var;
        super(12, bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(z5a z5aVar) {
        super(12, y5a.b);
        this.c = 16;
        this.d = z5aVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nk(wea weaVar) {
        this.c = 17;
        Float fValueOf = Float.valueOf(0.0f);
        this.d = weaVar;
        super(12, fValueOf);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(fwa fwaVar) {
        super(12, ewa.a);
        this.c = 18;
        this.d = fwaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(mza mzaVar) {
        super(12, lza.a);
        this.c = 20;
        this.d = mzaVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(k3b k3bVar) {
        super(12, j3b.a);
        this.c = 21;
        this.d = k3bVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(t7d t7dVar) {
        super(12, s7d.a);
        this.c = 25;
        this.d = t7dVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nk(e9d e9dVar) {
        this.c = 26;
        Boolean bool = Boolean.FALSE;
        this.d = e9dVar;
        super(12, bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(dwe dweVar) {
        super(12, cwe.b);
        this.c = 27;
        this.d = dweVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nk(k5f k5fVar) {
        this.c = 28;
        Boolean bool = Boolean.FALSE;
        this.d = k5fVar;
        super(12, bool);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public nk(wbf wbfVar) {
        super(12, ubf.a);
        this.c = 29;
        this.d = wbfVar;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public nk(OneMeTitleSubtitleButton oneMeTitleSubtitleButton) {
        this.c = 23;
        Boolean bool = Boolean.FALSE;
        this.d = oneMeTitleSubtitleButton;
        super(12, bool);
    }
}
