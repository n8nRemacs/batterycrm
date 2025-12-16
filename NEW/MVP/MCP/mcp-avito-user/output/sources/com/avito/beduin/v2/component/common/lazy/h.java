package com.avito.beduin.v2.component.common.lazy;

import Y61.k;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;
import androidx.core.view.C22832m;
import kotlin.Metadata;

/* compiled from: TranslateClicksToParentOnTouchListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/common/lazy/h;", "Landroid/view/View$OnTouchListener;", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class h implements View.OnTouchListener {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C22832m f335702b;

    /* compiled from: TranslateClicksToParentOnTouchListener.kt */
    @Metadata(d1 = {"\u0000\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"com/avito/beduin/v2/component/common/lazy/h$a", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "lazy-container_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends GestureDetector.SimpleOnGestureListener {
        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(@k MotionEvent motionEvent) {
            return true;
        }
    }

    public h(@k Context context) {
        this.f335702b = new C22832m(context, new a(), null);
    }

    public static void a(View view) {
        if (view.isClickable() && view.hasOnClickListeners()) {
            view.performClick();
            return;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 != null) {
            a(view2);
        }
    }

    @Override // android.view.View.OnTouchListener
    public final boolean onTouch(@k View view, @k MotionEvent motionEvent) {
        if (!this.f335702b.f45080a.onTouchEvent(motionEvent)) {
            return false;
        }
        Object parent = view.getParent();
        View view2 = parent instanceof View ? (View) parent : null;
        if (view2 == null) {
            return false;
        }
        a(view2);
        return false;
    }
}
