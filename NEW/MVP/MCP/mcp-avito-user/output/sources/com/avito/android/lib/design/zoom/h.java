package com.avito.android.lib.design.zoom;

import android.annotation.TargetApi;
import android.view.GestureDetector;
import android.view.MotionEvent;
import java.util.ArrayList;

/* compiled from: MultiGestureListener.java */
@TargetApi(23)
/* loaded from: classes14.dex */
public class h extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f181324b = new ArrayList();

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnContextClickListener
    public final synchronized boolean onContextClick(MotionEvent motionEvent) {
        int size = this.f181324b.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((GestureDetector.SimpleOnGestureListener) this.f181324b.get(i12)).onContextClick(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final synchronized boolean onDoubleTap(MotionEvent motionEvent) {
        int size = this.f181324b.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((GestureDetector.SimpleOnGestureListener) this.f181324b.get(i12)).onDoubleTap(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final synchronized boolean onDoubleTapEvent(MotionEvent motionEvent) {
        int size = this.f181324b.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((GestureDetector.SimpleOnGestureListener) this.f181324b.get(i12)).onDoubleTapEvent(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onDown(MotionEvent motionEvent) {
        int size = this.f181324b.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((GestureDetector.SimpleOnGestureListener) this.f181324b.get(i12)).onDown(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f12, float f13) {
        int size = this.f181324b.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((GestureDetector.SimpleOnGestureListener) this.f181324b.get(i12)).onFling(motionEvent, motionEvent2, f12, f13)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final synchronized void onLongPress(MotionEvent motionEvent) {
        int size = this.f181324b.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((GestureDetector.SimpleOnGestureListener) this.f181324b.get(i12)).onLongPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f12, float f13) {
        int size = this.f181324b.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((GestureDetector.SimpleOnGestureListener) this.f181324b.get(i12)).onScroll(motionEvent, motionEvent2, f12, f13)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final synchronized void onShowPress(MotionEvent motionEvent) {
        int size = this.f181324b.size();
        for (int i12 = 0; i12 < size; i12++) {
            ((GestureDetector.SimpleOnGestureListener) this.f181324b.get(i12)).onShowPress(motionEvent);
        }
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final synchronized boolean onSingleTapConfirmed(MotionEvent motionEvent) {
        int size = this.f181324b.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((GestureDetector.SimpleOnGestureListener) this.f181324b.get(i12)).onSingleTapConfirmed(motionEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final synchronized boolean onSingleTapUp(MotionEvent motionEvent) {
        int size = this.f181324b.size();
        for (int i12 = 0; i12 < size; i12++) {
            if (((GestureDetector.SimpleOnGestureListener) this.f181324b.get(i12)).onSingleTapUp(motionEvent)) {
                return true;
            }
        }
        return false;
    }
}
