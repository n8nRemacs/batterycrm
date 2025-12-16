package defpackage;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.text.TextUtils;
import android.util.Property;
import android.view.MotionEvent;
import android.view.TouchDelegate;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.widget.LinearLayout;
import android.widget.PopupWindow;
import androidx.appcompat.widget.AppCompatTextView;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class bgb extends LinearLayout implements rce {
    public final AppCompatTextView a;
    public final OneMeButton b;
    public final ArrayList c;
    public AnimatorSet d;
    public int o;
    public final Object s0;
    public final Object t0;
    public final Object u0;

    public bgb(Context context) {
        super(context, null);
        AppCompatTextView appCompatTextView = new AppCompatTextView(context, null);
        appCompatTextView.setId(zud.S0);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setTextColor(a93.s0.y(appCompatTextView).getText().e);
        appCompatTextView.setTextAlignment(5);
        appCompatTextView.setSingleLine();
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setSingleLine();
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, -2);
        layoutParams.weight = 1.0f;
        layoutParams.gravity = 16;
        appCompatTextView.setLayoutParams(layoutParams);
        dpg.u.b(appCompatTextView, t75.b);
        this.a = appCompatTextView;
        OneMeButton oneMeButton = new OneMeButton(context, null);
        oneMeButton.setMode(iza.d);
        oneMeButton.setSize(jza.b);
        oneMeButton.setAppearance(gza.d);
        oneMeButton.setId(zud.F0);
        oneMeButton.d(Integer.valueOf(yud.s0));
        ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
        marginLayoutParams.setMarginEnd(kti.d(4 * vw4.d().getDisplayMetrics().density));
        oneMeButton.setLayoutParams(marginLayoutParams);
        this.b = oneMeButton;
        this.c = new ArrayList();
        this.o = 1;
        this.s0 = ipi.b(3, new zfb(0));
        this.t0 = ipi.b(3, new zfb(1));
        this.u0 = ipi.b(3, new p1b(context, 16));
        setElevation(vw4.d().getDisplayMetrics().density * 10.0f);
        setGravity(16);
        addView(oneMeButton);
        addView(appCompatTextView);
    }

    public static void d(bgb bgbVar, em6 em6Var, vfb vfbVar) {
        bgbVar.getPopupWindow().dismiss();
        em6Var.invoke(Integer.valueOf(vfbVar.a));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final LinearInterpolator getAppearInterpolator() {
        return (LinearInterpolator) this.s0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final LinearInterpolator getDisappearInterpolator() {
        return (LinearInterpolator) this.t0.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, k18] */
    private final PopupWindow getPopupWindow() {
        return (PopupWindow) this.u0.getValue();
    }

    @Override // defpackage.rce
    public final void a() {
        this.o = 1;
        e(false);
    }

    @Override // defpackage.rce
    public final boolean b() {
        return this.o == 2;
    }

    @Override // defpackage.rce
    public final void c(String str, List list, cm6 cm6Var, em6 em6Var) {
        PopupWindow popupWindow;
        OneMeButton oneMeButton;
        setSelectionTitle(str);
        ArrayList arrayList = this.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            removeView((View) it.next());
        }
        arrayList.clear();
        List listY = ue3.Y(list, 5);
        List<vfb> listB = ue3.B(5, list);
        int i = 0;
        if (listB.isEmpty()) {
            popupWindow = null;
        } else {
            q6c q6cVar = new q6c(getContext(), false);
            q6cVar.setId(zud.P0);
            for (vfb vfbVar : listB) {
                p6c p6cVar = new p6c(q6cVar.getContext(), false);
                p6cVar.c(p6cVar, new n5g(vfbVar.b), null, true, true);
                p6cVar.b(Integer.valueOf(vfbVar.c), Integer.valueOf(vuc.global_icon_primary));
                f8j.d(p6cVar, 300L, new w01(this, em6Var, vfbVar, 2));
                q6cVar.addView(p6cVar, -1, -2);
            }
            popupWindow = getPopupWindow();
            popupWindow.setContentView(q6cVar);
        }
        for (Object obj : listY) {
            int i2 = i + 1;
            if (i < 0) {
                ve3.p();
                throw null;
            }
            vfb vfbVar2 = (vfb) obj;
            gza gzaVar = gza.d;
            jza jzaVar = jza.b;
            iza izaVar = iza.d;
            if (i != 4 || listB.isEmpty()) {
                OneMeButton oneMeButton2 = new OneMeButton(getContext(), null);
                oneMeButton2.setMode(izaVar);
                oneMeButton2.setSize(jzaVar);
                oneMeButton2.setAppearance(gzaVar);
                oneMeButton2.setId(zud.G0);
                oneMeButton2.d(Integer.valueOf(vfbVar2.c));
                ViewGroup.MarginLayoutParams marginLayoutParams = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams.setMarginStart(kti.d(8 * vw4.d().getDisplayMetrics().density));
                oneMeButton2.setLayoutParams(marginLayoutParams);
                f8j.d(oneMeButton2, 300L, new kg6(em6Var, 23, vfbVar2));
                oneMeButton = oneMeButton2;
            } else {
                oneMeButton = new OneMeButton(getContext(), null);
                oneMeButton.setMode(izaVar);
                oneMeButton.setSize(jzaVar);
                oneMeButton.setAppearance(gzaVar);
                oneMeButton.setId(zud.O0);
                oneMeButton.d(Integer.valueOf(uwc.ic_more_vertical_filled_16));
                ViewGroup.MarginLayoutParams marginLayoutParams2 = new ViewGroup.MarginLayoutParams(-2, -2);
                marginLayoutParams2.setMarginStart(kti.d(8 * vw4.d().getDisplayMetrics().density));
                oneMeButton.setLayoutParams(marginLayoutParams2);
                f8j.d(oneMeButton, 300L, new ye6(25, popupWindow));
            }
            arrayList.add(oneMeButton);
            jfi.a(oneMeButton, kti.d(40 * vw4.d().getDisplayMetrics().density), kti.d(52 * vw4.d().getDisplayMetrics().density));
            addView(oneMeButton);
            i = i2;
        }
        if (this.o == 2) {
            return;
        }
        this.o = 2;
        setCloseListener(new l3b(this, 5, cm6Var));
        e(true);
    }

    public final void e(boolean z) {
        AnimatorSet animatorSet = this.d;
        if (animatorSet != null) {
            lqi.a(animatorSet);
        }
        AnimatorSet animatorSet2 = new AnimatorSet();
        float alpha = getAlpha();
        float f = z ? 1.0f : 0.0f;
        long jAbs = 200;
        if (alpha != 0.0f && alpha != 1.0f) {
            jAbs = (long) (Math.abs(alpha - f) * 200);
        }
        animatorSet2.setDuration(jAbs);
        ObjectAnimator objectAnimatorOfFloat = ObjectAnimator.ofFloat(this, (Property<bgb, Float>) View.ALPHA, alpha, f);
        objectAnimatorOfFloat.setInterpolator(z ? getAppearInterpolator() : getDisappearInterpolator());
        objectAnimatorOfFloat.addListener(new ap2(this, alpha, z));
        final float f2 = z ? 0.0f : 1.0f;
        final LinearInterpolator appearInterpolator = !z ? getAppearInterpolator() : getDisappearInterpolator();
        animatorSet2.playTogether(ue3.U(lee.o(new nhg(lee.g(new at(8, (ViewGroup) getParent()), new wu7(28, this)), new em6() { // from class: agb
            @Override // defpackage.em6
            public final Object invoke(Object obj) {
                View view = (View) obj;
                ObjectAnimator objectAnimatorOfFloat2 = ObjectAnimator.ofFloat(view, (Property<View, Float>) View.ALPHA, view.getAlpha(), f2);
                objectAnimatorOfFloat2.setInterpolator(appearInterpolator);
                return objectAnimatorOfFloat2;
            }
        })), objectAnimatorOfFloat));
        animatorSet2.start();
        this.d = animatorSet2;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent == null) {
            return super.onTouchEvent(motionEvent);
        }
        Iterator it = this.c.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            View view = (View) it.next();
            TouchDelegate touchDelegate = view.getTouchDelegate();
            if (touchDelegate != null && touchDelegate.onTouchEvent(motionEvent)) {
                if (motionEvent.getAction() == 1) {
                    view.performClick();
                }
            }
        }
        return true;
    }

    public final void setCloseListener(cm6 cm6Var) {
        f8j.d(this.b, 300L, new x6(11, cm6Var));
    }

    public final void setSelectionTitle(String str) {
        this.a.setText(str);
    }
}
