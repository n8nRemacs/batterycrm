package defpackage;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.graphics.drawable.Drawable;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import com.google.android.material.textfield.TextInputLayout;
import java.util.WeakHashMap;
import ru.ok.android.onelog.impl.BuildConfig;

/* loaded from: classes.dex */
public final class d65 extends mf5 {
    public final int e;
    public final int f;
    public final TimeInterpolator g;
    public AutoCompleteTextView h;
    public final j6 i;
    public final wa3 j;
    public final wo4 k;
    public boolean l;
    public boolean m;
    public boolean n;
    public long o;
    public AccessibilityManager p;
    public ValueAnimator q;
    public ValueAnimator r;

    public d65(lf5 lf5Var) {
        super(lf5Var);
        this.i = new j6(24, this);
        this.j = new wa3(1, this);
        this.k = new wo4(6, this);
        this.o = BuildConfig.MAX_TIME_TO_UPLOAD;
        this.f = exi.c(dvc.motionDurationShort3, 67, lf5Var.getContext());
        this.e = exi.c(dvc.motionDurationShort3, 50, lf5Var.getContext());
        this.g = exi.d(lf5Var.getContext(), dvc.motionEasingLinearInterpolator, rg.a);
    }

    @Override // defpackage.mf5
    public final void a() {
        if (this.p.isTouchExplorationEnabled() && baj.b(this.h) && !this.d.hasFocus()) {
            this.h.dismissDropDown();
        }
        this.h.post(new qj4(12, this));
    }

    @Override // defpackage.mf5
    public final int c() {
        return s2d.exposed_dropdown_menu_content_description;
    }

    @Override // defpackage.mf5
    public final int d() {
        return lxc.mtrl_dropdown_arrow;
    }

    @Override // defpackage.mf5
    public final View.OnFocusChangeListener e() {
        return this.j;
    }

    @Override // defpackage.mf5
    public final View.OnClickListener f() {
        return this.i;
    }

    @Override // defpackage.mf5
    public final wo4 h() {
        return this.k;
    }

    @Override // defpackage.mf5
    public final boolean i(int i) {
        return i != 0;
    }

    @Override // defpackage.mf5
    public final boolean j() {
        return this.l;
    }

    @Override // defpackage.mf5
    public final boolean l() {
        return this.n;
    }

    @Override // defpackage.mf5
    public final void m(EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new ml1(2, this));
        this.h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: c65
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                d65 d65Var = this.a;
                d65Var.m = true;
                d65Var.o = System.currentTimeMillis();
                d65Var.t(false);
            }
        });
        this.h.setThreshold(0);
        TextInputLayout textInputLayout = this.a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!baj.b(editText) && this.p.isTouchExplorationEnabled()) {
            WeakHashMap weakHashMap = hfh.a;
            this.d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // defpackage.mf5
    public final void n(m5 m5Var) {
        AccessibilityNodeInfo accessibilityNodeInfo = m5Var.a;
        if (!baj.b(this.h)) {
            m5Var.h(Spinner.class.getName());
        }
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // defpackage.mf5
    public final void o(AccessibilityEvent accessibilityEvent) {
        if (!this.p.isEnabled() || baj.b(this.h)) {
            return;
        }
        boolean z = (accessibilityEvent.getEventType() == 32768 || accessibilityEvent.getEventType() == 8) && this.n && !this.h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z) {
            u();
            this.m = true;
            this.o = System.currentTimeMillis();
        }
    }

    @Override // defpackage.mf5
    public final void r() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f);
        int i = 11;
        valueAnimatorOfFloat.addUpdateListener(new q00(i, this));
        this.r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.e);
        valueAnimatorOfFloat2.addUpdateListener(new q00(i, this));
        this.q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new s6(4, this));
        this.p = (AccessibilityManager) this.c.getSystemService("accessibility");
    }

    @Override // defpackage.mf5
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z) {
        if (this.n != z) {
            this.n = z;
            this.r.cancel();
            this.q.start();
        }
    }

    public final void u() {
        if (this.h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.m = false;
        }
        if (this.m) {
            this.m = false;
            return;
        }
        t(!this.n);
        if (!this.n) {
            this.h.dismissDropDown();
        } else {
            this.h.requestFocus();
            this.h.showDropDown();
        }
    }
}
