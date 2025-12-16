package defpackage;

import android.content.Context;
import android.view.MotionEvent;
import android.widget.FrameLayout;

/* loaded from: classes2.dex */
public class bvf extends FrameLayout implements ivf {
    public final /* synthetic */ jvf a;

    public bvf(Context context) {
        super(context);
        this.a = new jvf();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final boolean dispatchTouchEvent(MotionEvent motionEvent) {
        super.dispatchTouchEvent(motionEvent);
        return true;
    }

    public cm6 getOnRequestInterceptTouchEvent() {
        return this.a.b;
    }

    public em6 getOnTouch() {
        return this.a.a;
    }

    @Override // android.view.ViewGroup
    public final boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        jvf jvfVar = this.a;
        jvfVar.getClass();
        em6 em6Var = jvfVar.a;
        return (em6Var != null ? ((Boolean) em6Var.invoke(motionEvent)).booleanValue() : false) || super.onInterceptTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        jvf jvfVar = this.a;
        jvfVar.getClass();
        em6 em6Var = jvfVar.a;
        return (em6Var != null ? ((Boolean) em6Var.invoke(motionEvent)).booleanValue() : false) || super.onTouchEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public final void requestDisallowInterceptTouchEvent(boolean z) {
        super.requestDisallowInterceptTouchEvent(z);
        jvf jvfVar = this.a;
        jvfVar.getClass();
        cm6 cm6Var = jvfVar.b;
        if (cm6Var != null) {
            cm6Var.invoke();
        }
    }

    @Override // defpackage.ivf
    public void setOnRequestInterceptTouchEvent(cm6 cm6Var) {
        this.a.b = cm6Var;
    }

    @Override // defpackage.ivf
    public void setOnTouch(em6 em6Var) {
        this.a.a = em6Var;
    }
}
