package com.avito.android.progress_info_toast_bar;

import Y61.k;
import android.content.Context;
import android.view.GestureDetector;
import android.view.MotionEvent;
import dd0.InterfaceC39708a;
import kotlin.Metadata;

/* compiled from: ProgressInfoToastBarTouchEventHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/e;", "", "a", "b", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final h f231503a;

    /* renamed from: b, reason: collision with root package name */
    public float f231504b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final GestureDetector f231505c;

    /* compiled from: ProgressInfoToastBarTouchEventHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/e$a;", "Landroid/view/GestureDetector$SimpleOnGestureListener;", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public final class a extends GestureDetector.SimpleOnGestureListener {
        public a() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnDoubleTapListener
        public final boolean onSingleTapConfirmed(@k MotionEvent motionEvent) {
            InterfaceC39708a analytics = e.this.f231503a.f231525b.getAnalytics();
            if (analytics == null) {
                return false;
            }
            analytics.c();
            return false;
        }
    }

    /* compiled from: ProgressInfoToastBarTouchEventHandler.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/progress_info_toast_bar/e$b;", "", "_avito_progress-info-toast-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: ProgressInfoToastBarTouchEventHandler.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a {
        }
    }

    public e(@k Context context, @k h hVar) {
        this.f231503a = hVar;
        this.f231505c = new GestureDetector(context, new a());
    }
}
