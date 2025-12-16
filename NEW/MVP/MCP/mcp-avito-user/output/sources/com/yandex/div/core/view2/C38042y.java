package com.yandex.div.core.view2;

import android.view.GestureDetector;
import android.view.MotionEvent;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: DivGestureListener.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/core/view2/y;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "<init>", "()V", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.core.view2.y, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38042y extends GestureDetector.SimpleOnGestureListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public Y41.a<G0> f369222b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public kotlin.jvm.internal.N f369223c;

    /* JADX WARN: Type inference failed for: r1v1, types: [Y41.a, kotlin.jvm.internal.N] */
    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onDoubleTap(@Y61.k MotionEvent motionEvent) {
        ?? r12 = this.f369223c;
        if (r12 == 0) {
            return false;
        }
        r12.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onDown(@Y61.k MotionEvent motionEvent) {
        return false;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
    public final boolean onSingleTapConfirmed(@Y61.k MotionEvent motionEvent) {
        Y41.a<G0> aVar;
        if (this.f369223c == null || (aVar = this.f369222b) == null) {
            return false;
        }
        aVar.invoke();
        return true;
    }

    @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
    public final boolean onSingleTapUp(@Y61.k MotionEvent motionEvent) {
        Y41.a<G0> aVar;
        if (this.f369223c != null || (aVar = this.f369222b) == null) {
            return false;
        }
        aVar.invoke();
        return true;
    }
}
