package androidx.core.view;

import android.content.Context;
import android.os.Handler;
import android.view.GestureDetector;
import android.view.MotionEvent;

/* compiled from: GestureDetectorCompat.java */
@Deprecated
/* renamed from: androidx.core.view.m, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22832m {

    /* renamed from: a, reason: collision with root package name */
    public final GestureDetector f45080a;

    public C22832m(@j.N Context context, @j.N GestureDetector.OnGestureListener onGestureListener, @j.P Handler handler) {
        this.f45080a = new GestureDetector(context, onGestureListener, handler);
    }

    public final void a(@j.N MotionEvent motionEvent) {
        this.f45080a.onTouchEvent(motionEvent);
    }
}
