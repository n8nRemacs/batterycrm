package com.avito.android.comparison;

import android.view.GestureDetector;
import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: GestureDetectorListener.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comparison/o;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_comparison_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class o extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final GestureProxyView f124183b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final RecyclerView f124184c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final q f124185d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public Direction f124186e = Direction.f123808d;

    public o(@Y61.k GestureProxyView gestureProxyView, @Y61.k RecyclerView recyclerView, @Y61.k q qVar) {
        this.f124183b = gestureProxyView;
        this.f124184c = recyclerView;
        this.f124185d = qVar;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(@Y61.k MotionEvent motionEvent) {
        RecyclerView recyclerView = this.f124184c;
        int scrollState = recyclerView.getScrollState();
        q qVar = this.f124185d;
        if (scrollState != 0 && qVar.f124188a != 0) {
            this.f124186e = Direction.f123808d;
            recyclerView.J0();
            qVar.f124191d.onNext(G0.f406611a);
            return false;
        }
        if (recyclerView.getScrollState() == 0 && qVar.f124188a == 0) {
            this.f124186e = Direction.f123808d;
        } else if (recyclerView.getScrollState() == 1) {
            this.f124186e = Direction.f123807c;
            recyclerView.onTouchEvent(motionEvent);
        } else if (qVar.f124188a == 1) {
            this.f124186e = Direction.f123806b;
            qVar.a(motionEvent);
        } else if (recyclerView.getScrollState() == 2) {
            this.f124186e = Direction.f123807c;
            recyclerView.onTouchEvent(motionEvent);
            recyclerView.J0();
        } else if (qVar.f124188a == 2) {
            this.f124186e = Direction.f123806b;
            qVar.a(motionEvent);
            qVar.f124191d.onNext(G0.f406611a);
        }
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onScroll(@Y61.l MotionEvent motionEvent, @Y61.k MotionEvent motionEvent2, float f12, float f13) {
        if (motionEvent == null) {
            return false;
        }
        Direction direction = this.f124186e;
        Direction direction2 = Direction.f123808d;
        RecyclerView recyclerView = this.f124184c;
        q qVar = this.f124185d;
        if (direction == direction2) {
            Direction direction3 = Math.abs(motionEvent.getX() - motionEvent2.getX()) > Math.abs(motionEvent.getY() - motionEvent2.getY()) ? Direction.f123806b : Direction.f123807c;
            this.f124186e = direction3;
            if (direction3 == Direction.f123806b) {
                qVar.a(motionEvent);
                qVar.a(motionEvent2);
                return true;
            }
            if (direction3 == Direction.f123807c) {
                recyclerView.onTouchEvent(motionEvent);
                recyclerView.onTouchEvent(motionEvent2);
                return true;
            }
        }
        Direction direction4 = this.f124186e;
        if (direction4 == Direction.f123806b) {
            qVar.a(motionEvent2);
            return true;
        }
        if (direction4 != Direction.f123807c) {
            return false;
        }
        recyclerView.onTouchEvent(motionEvent2);
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@Y61.k MotionEvent motionEvent) {
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.setAction(0);
        GestureProxyView gestureProxyView = this.f124183b;
        gestureProxyView.setNeedResolveMotionEvent(false);
        gestureProxyView.dispatchTouchEvent(motionEventObtain);
        gestureProxyView.dispatchTouchEvent(motionEvent);
        gestureProxyView.setNeedResolveMotionEvent(true);
        motionEventObtain.recycle();
        return true;
    }
}
