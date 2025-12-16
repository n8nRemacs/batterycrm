package defpackage;

import android.animation.ValueAnimator;
import android.content.Context;
import android.widget.FrameLayout;
import java.util.ArrayList;
import one.me.sdk.uikit.common.button.OneMeButton;

/* loaded from: classes2.dex */
public final class qf extends FrameLayout {
    public OneMeButton a;
    public OneMeButton b;
    public boolean c;
    public ValueAnimator d;
    public m8f o;

    public qf(Context context) {
        super(context);
        setClipToOutline(true);
    }

    public static final void a(qf qfVar, OneMeButton oneMeButton) {
        m8f m8fVar = new m8f(oneMeButton.findViewById(zud.k), (yr0) m8f.q, 0.0f);
        n8f n8fVar = new n8f(0.0f);
        n8fVar.b(200.0f);
        n8fVar.a(0.5f);
        m8fVar.m = n8fVar;
        m8fVar.a = 500.0f;
        of ofVar = new of(qfVar, oneMeButton);
        ArrayList arrayList = m8fVar.k;
        if (!arrayList.contains(ofVar)) {
            arrayList.add(ofVar);
        }
        m8fVar.g();
        qfVar.o = m8fVar;
    }

    private final void setupViewsPosition(boolean z) {
        if (z) {
            OneMeButton oneMeButton = this.a;
            if (oneMeButton != null) {
                oneMeButton.setTranslationY(0.0f);
            }
            OneMeButton oneMeButton2 = this.b;
            if (oneMeButton2 != null) {
                oneMeButton2.setTranslationY(getMeasuredHeight());
                return;
            }
            return;
        }
        OneMeButton oneMeButton3 = this.a;
        if (oneMeButton3 != null) {
            oneMeButton3.setTranslationY(-getMeasuredHeight());
        }
        OneMeButton oneMeButton4 = this.b;
        if (oneMeButton4 != null) {
            oneMeButton4.setTranslationY(0.0f);
        }
    }

    public final void b() {
        ValueAnimator valueAnimator = this.d;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        this.d = null;
        m8f m8fVar = this.o;
        if (m8fVar != null) {
            m8fVar.b();
        }
        this.o = null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        b();
    }

    @Override // android.widget.FrameLayout, android.view.View
    public final void onMeasure(int i, int i2) {
        measureChildren(i, i2);
        OneMeButton oneMeButton = this.b;
        int measuredHeight = oneMeButton != null ? oneMeButton.getMeasuredHeight() : 0;
        OneMeButton oneMeButton2 = this.a;
        super.onMeasure(i, Math.max(measuredHeight, oneMeButton2 != null ? oneMeButton2.getMeasuredHeight() : 0));
        OneMeButton oneMeButton3 = this.a;
        if (oneMeButton3 != null) {
            oneMeButton3.setVisibility(0);
        }
        OneMeButton oneMeButton4 = this.b;
        if (oneMeButton4 != null) {
            oneMeButton4.setVisibility(0);
        }
        setupViewsPosition(isEnabled());
    }

    public final void setActiveButtonClickListener(cm6 cm6Var) {
        OneMeButton oneMeButton = this.a;
        if (oneMeButton != null) {
            f8j.d(oneMeButton, 300L, new x6(1, cm6Var));
        }
    }

    public final void setActiveButtonLoaderState(boolean z) {
        OneMeButton oneMeButton = this.a;
        if (oneMeButton != null) {
            oneMeButton.setProgressEnabled(z);
            oneMeButton.setClickable(!z);
        }
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        OneMeButton oneMeButton;
        m8f m8fVar;
        if (isEnabled() == z) {
            return;
        }
        if (z && this.c) {
            OneMeButton oneMeButton2 = this.a;
            if (oneMeButton2 != null && (oneMeButton = this.b) != null) {
                ValueAnimator valueAnimator = this.d;
                if ((valueAnimator != null && valueAnimator.isRunning()) || ((m8fVar = this.o) != null && m8fVar.f)) {
                    b();
                }
                float height = getHeight();
                int i = 0;
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, height);
                valueAnimatorOfFloat.setDuration(200L);
                valueAnimatorOfFloat.addUpdateListener(new nf(oneMeButton, oneMeButton2, height, i));
                valueAnimatorOfFloat.addListener(new qe(2, oneMeButton2));
                valueAnimatorOfFloat.addListener(new pf(this, i, oneMeButton2));
                valueAnimatorOfFloat.start();
                this.d = valueAnimatorOfFloat;
            }
        } else {
            b();
            setupViewsPosition(z);
        }
        super.setEnabled(z);
    }

    public final void setupActiveButton(em6 em6Var) {
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        em6Var.invoke(oneMeButton);
        oneMeButton.setOutlineProvider(null);
        oneMeButton.setVisibility(oneMeButton.isEnabled() ? 0 : 8);
        this.a = oneMeButton;
        addView(oneMeButton);
    }

    public final void setupDisabledButton(em6 em6Var) {
        OneMeButton oneMeButton = new OneMeButton(getContext(), null);
        em6Var.invoke(oneMeButton);
        setOutlineProvider(oneMeButton.getOutlineProvider());
        oneMeButton.setOutlineProvider(null);
        oneMeButton.setVisibility(!oneMeButton.isEnabled() ? 0 : 8);
        this.b = oneMeButton;
        addView(oneMeButton);
    }
}
