package com.avito.android.app.coldstart;

import Y61.k;
import android.os.Handler;
import android.os.Looper;
import android.view.View;
import android.view.ViewTreeObserver;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ActivityFirstDrawListening.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/app/coldstart/h;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "a", "_avito_analytics-coldstart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class h implements ViewTreeObserver.OnDrawListener {

    /* renamed from: f, reason: collision with root package name */
    @k
    public static final a f91364f = new a(null);

    /* renamed from: b, reason: collision with root package name */
    @k
    public final View f91365b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Y41.a<G0> f91366c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Handler f91367d = new Handler(Looper.getMainLooper());

    /* renamed from: e, reason: collision with root package name */
    public boolean f91368e;

    /* compiled from: ActivityFirstDrawListening.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/app/coldstart/h$a;", "", "<init>", "()V", "_avito_analytics-coldstart_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public h(@k Y41.a aVar, @k View view) {
        this.f91365b = view;
        this.f91366c = aVar;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f91368e) {
            return;
        }
        this.f91368e = true;
        ((com.avito.android.app.coldstart.a) this.f91366c).invoke();
        this.f91367d.post(new d(this, 1));
    }
}
