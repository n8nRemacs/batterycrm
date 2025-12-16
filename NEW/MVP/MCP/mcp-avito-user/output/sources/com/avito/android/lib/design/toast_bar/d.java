package com.avito.android.lib.design.toast_bar;

import Y61.l;
import android.view.MotionEvent;
import android.view.View;
import kotlin.Metadata;

/* compiled from: ToastBarSwipeListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/lib/design/toast_bar/d;", "Landroid/view/View$OnTouchListener;", "<init>", "()V", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public class d implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    public float f181067b;

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@l View view, @l MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action == 0) {
            motionEvent.getY();
            c();
        } else if (action == 1) {
            a();
        } else if (action == 2) {
            b(motionEvent.getY() - this.f181067b);
        }
        this.f181067b = motionEvent.getY();
        return true;
    }

    public void a() {
    }

    public void c() {
    }

    public void b(float f12) {
    }
}
