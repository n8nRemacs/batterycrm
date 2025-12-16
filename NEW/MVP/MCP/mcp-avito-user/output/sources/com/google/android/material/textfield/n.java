package com.google.android.material.textfield;

import android.animation.TimeInterpolator;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.graphics.drawable.Drawable;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.AutoCompleteTextView;
import android.widget.EditText;
import android.widget.Spinner;
import androidx.core.view.A0;
import androidx.core.view.C22823h0;
import androidx.core.view.accessibility.c;
import com.google.android.material.R;
import j.N;
import j.P;
import java.util.WeakHashMap;
import lY0.C43707b;
import wY0.C49576a;

/* compiled from: DropdownMenuEndIconDelegate.java */
/* loaded from: classes6.dex */
class n extends q {

    /* renamed from: e, reason: collision with root package name */
    public final int f357469e;

    /* renamed from: f, reason: collision with root package name */
    public final int f357470f;

    /* renamed from: g, reason: collision with root package name */
    @N
    public final TimeInterpolator f357471g;

    /* renamed from: h, reason: collision with root package name */
    @P
    public AutoCompleteTextView f357472h;

    /* renamed from: i, reason: collision with root package name */
    public final a f357473i;

    /* renamed from: j, reason: collision with root package name */
    public final b f357474j;

    /* renamed from: k, reason: collision with root package name */
    public final l f357475k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f357476l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f357477m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f357478n;

    /* renamed from: o, reason: collision with root package name */
    public long f357479o;

    /* renamed from: p, reason: collision with root package name */
    @P
    public AccessibilityManager f357480p;

    /* renamed from: q, reason: collision with root package name */
    public ValueAnimator f357481q;

    /* renamed from: r, reason: collision with root package name */
    public ValueAnimator f357482r;

    /* JADX WARN: Type inference failed for: r0v2, types: [com.google.android.material.textfield.l] */
    public n(@N p pVar) {
        super(pVar);
        int i12 = 1;
        this.f357473i = new a(this, i12);
        this.f357474j = new b(this, i12);
        this.f357475k = new c.e() { // from class: com.google.android.material.textfield.l
            @Override // androidx.core.view.accessibility.c.e
            public final void onTouchExplorationStateChanged(boolean z12) {
                n nVar = this.f357467a;
                AutoCompleteTextView autoCompleteTextView = nVar.f357472h;
                if (autoCompleteTextView == null || o.a(autoCompleteTextView)) {
                    return;
                }
                int i13 = z12 ? 2 : 1;
                WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
                nVar.f357517d.setImportantForAccessibility(i13);
            }
        };
        this.f357479o = Long.MAX_VALUE;
        this.f357470f = C49576a.c(pVar.getContext(), R.attr.motionDurationShort3, 67);
        this.f357469e = C49576a.c(pVar.getContext(), R.attr.motionDurationShort3, 50);
        this.f357471g = C49576a.d(pVar.getContext(), R.attr.motionEasingLinearInterpolator, C43707b.f413879a);
    }

    @Override // com.google.android.material.textfield.q
    public final void a() {
        if (this.f357480p.isTouchExplorationEnabled() && o.a(this.f357472h) && !this.f357517d.hasFocus()) {
            this.f357472h.dismissDropDown();
        }
        this.f357472h.post(new d(this, 1));
    }

    @Override // com.google.android.material.textfield.q
    public final int c() {
        return R.string.exposed_dropdown_menu_content_description;
    }

    @Override // com.google.android.material.textfield.q
    public final int d() {
        return R.drawable.mtrl_dropdown_arrow;
    }

    @Override // com.google.android.material.textfield.q
    public final View.OnFocusChangeListener e() {
        return this.f357474j;
    }

    @Override // com.google.android.material.textfield.q
    public final View.OnClickListener f() {
        return this.f357473i;
    }

    @Override // com.google.android.material.textfield.q
    public final c.e h() {
        return this.f357475k;
    }

    @Override // com.google.android.material.textfield.q
    public final boolean i(int i12) {
        return i12 != 0;
    }

    @Override // com.google.android.material.textfield.q
    public final boolean j() {
        return this.f357476l;
    }

    @Override // com.google.android.material.textfield.q
    public final boolean l() {
        return this.f357478n;
    }

    @Override // com.google.android.material.textfield.q
    public final void m(@P EditText editText) {
        if (!(editText instanceof AutoCompleteTextView)) {
            throw new RuntimeException("EditText needs to be an AutoCompleteTextView if an Exposed Dropdown Menu is being used.");
        }
        AutoCompleteTextView autoCompleteTextView = (AutoCompleteTextView) editText;
        this.f357472h = autoCompleteTextView;
        autoCompleteTextView.setOnTouchListener(new View.OnTouchListener() { // from class: com.google.android.material.textfield.j
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view, MotionEvent motionEvent) {
                n nVar = this.f357465b;
                nVar.getClass();
                if (motionEvent.getAction() == 1) {
                    long jCurrentTimeMillis = System.currentTimeMillis() - nVar.f357479o;
                    if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
                        nVar.f357477m = false;
                    }
                    nVar.u();
                    nVar.f357477m = true;
                    nVar.f357479o = System.currentTimeMillis();
                }
                return false;
            }
        });
        this.f357472h.setOnDismissListener(new AutoCompleteTextView.OnDismissListener() { // from class: com.google.android.material.textfield.k
            @Override // android.widget.AutoCompleteTextView.OnDismissListener
            public final void onDismiss() {
                n nVar = this.f357466a;
                nVar.f357477m = true;
                nVar.f357479o = System.currentTimeMillis();
                nVar.t(false);
            }
        });
        this.f357472h.setThreshold(0);
        TextInputLayout textInputLayout = this.f357514a;
        textInputLayout.setErrorIconDrawable((Drawable) null);
        if (!o.a(editText) && this.f357480p.isTouchExplorationEnabled()) {
            WeakHashMap<View, A0> weakHashMap = C22823h0.f45055a;
            this.f357517d.setImportantForAccessibility(2);
        }
        textInputLayout.setEndIconVisible(true);
    }

    @Override // com.google.android.material.textfield.q
    public final void n(@N androidx.core.view.accessibility.f fVar) {
        if (!o.a(this.f357472h)) {
            fVar.k(Spinner.class.getName());
        }
        AccessibilityNodeInfo accessibilityNodeInfo = fVar.f44999a;
        if (accessibilityNodeInfo.isShowingHintText()) {
            accessibilityNodeInfo.setHintText(null);
        }
    }

    @Override // com.google.android.material.textfield.q
    @SuppressLint({"WrongConstant"})
    public final void o(@N AccessibilityEvent accessibilityEvent) {
        if (!this.f357480p.isEnabled() || o.a(this.f357472h)) {
            return;
        }
        boolean z12 = accessibilityEvent.getEventType() == 32768 && this.f357478n && !this.f357472h.isPopupShowing();
        if (accessibilityEvent.getEventType() == 1 || z12) {
            u();
            this.f357477m = true;
            this.f357479o = System.currentTimeMillis();
        }
    }

    @Override // com.google.android.material.textfield.q
    public final void r() {
        int i12 = 2;
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        TimeInterpolator timeInterpolator = this.f357471g;
        valueAnimatorOfFloat.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat.setDuration(this.f357470f);
        valueAnimatorOfFloat.addUpdateListener(new c(this, i12));
        this.f357482r = valueAnimatorOfFloat;
        ValueAnimator valueAnimatorOfFloat2 = ValueAnimator.ofFloat(1.0f, 0.0f);
        valueAnimatorOfFloat2.setInterpolator(timeInterpolator);
        valueAnimatorOfFloat2.setDuration(this.f357469e);
        valueAnimatorOfFloat2.addUpdateListener(new c(this, i12));
        this.f357481q = valueAnimatorOfFloat2;
        valueAnimatorOfFloat2.addListener(new m(this));
        this.f357480p = (AccessibilityManager) this.f357516c.getSystemService("accessibility");
    }

    @Override // com.google.android.material.textfield.q
    @SuppressLint({"ClickableViewAccessibility"})
    public final void s() {
        AutoCompleteTextView autoCompleteTextView = this.f357472h;
        if (autoCompleteTextView != null) {
            autoCompleteTextView.setOnTouchListener(null);
            this.f357472h.setOnDismissListener(null);
        }
    }

    public final void t(boolean z12) {
        if (this.f357478n != z12) {
            this.f357478n = z12;
            this.f357482r.cancel();
            this.f357481q.start();
        }
    }

    public final void u() {
        if (this.f357472h == null) {
            return;
        }
        long jCurrentTimeMillis = System.currentTimeMillis() - this.f357479o;
        if (jCurrentTimeMillis < 0 || jCurrentTimeMillis > 300) {
            this.f357477m = false;
        }
        if (this.f357477m) {
            this.f357477m = false;
            return;
        }
        t(!this.f357478n);
        if (!this.f357478n) {
            this.f357472h.dismissDropDown();
        } else {
            this.f357472h.requestFocus();
            this.f357472h.showDropDown();
        }
    }
}
