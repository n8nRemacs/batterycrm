package com.google.maps.android.clustering.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.annotation.SuppressLint;
import android.annotation.TargetApi;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.MessageQueue;
import android.os.RemoteException;
import android.view.animation.DecelerateInterpolator;
import com.google.android.gms.maps.model.C36824h;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;
import com.google.maps.android.clustering.b;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Set;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;

/* compiled from: DefaultClusterRenderer.java */
/* loaded from: classes6.dex */
public class f<T extends com.google.maps.android.clustering.b> implements com.google.maps.android.clustering.view.a<T> {

    /* renamed from: a, reason: collision with root package name */
    public static final DecelerateInterpolator f362239a = new DecelerateInterpolator();

    /* compiled from: DefaultClusterRenderer.java */
    @TargetApi(12)
    public class a extends AnimatorListenerAdapter implements ValueAnimator.AnimatorUpdateListener {

        /* renamed from: a, reason: collision with root package name */
        public final e f362240a;

        /* renamed from: b, reason: collision with root package name */
        public final C36824h f362241b;

        /* renamed from: c, reason: collision with root package name */
        public final LatLng f362242c;

        /* renamed from: d, reason: collision with root package name */
        public final LatLng f362243d;

        public a(f fVar, e eVar, LatLng latLng, LatLng latLng2, com.google.maps.android.clustering.view.b bVar) {
            this.f362240a = eVar;
            this.f362241b = eVar.f362253a;
            this.f362242c = latLng;
            this.f362243d = latLng2;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            this.f362240a.getClass();
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            float animatedFraction = valueAnimator.getAnimatedFraction();
            LatLng latLng = this.f362243d;
            double d12 = latLng.f354407b;
            LatLng latLng2 = this.f362242c;
            double d13 = latLng2.f354407b;
            double d14 = animatedFraction;
            double d15 = ((d12 - d13) * d14) + d13;
            double d16 = latLng.f354408c;
            double d17 = latLng2.f354408c;
            double dSignum = d16 - d17;
            if (Math.abs(dSignum) > 180.0d) {
                dSignum -= Math.signum(dSignum) * 360.0d;
            }
            LatLng latLng3 = new LatLng(d15, (dSignum * d14) + d17);
            C36824h c36824h = this.f362241b;
            c36824h.getClass();
            try {
                c36824h.f354490a.setPosition(latLng3);
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public class b {
        public static void a(b bVar) {
            bVar.getClass();
            throw null;
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    @SuppressLint({"HandlerLeak"})
    public class d extends Handler implements MessageQueue.IdleHandler {

        /* renamed from: b, reason: collision with root package name */
        public final ReentrantLock f362244b;

        /* renamed from: c, reason: collision with root package name */
        public final Condition f362245c;

        /* renamed from: d, reason: collision with root package name */
        public final LinkedList f362246d;

        /* renamed from: e, reason: collision with root package name */
        public final LinkedList f362247e;

        /* renamed from: f, reason: collision with root package name */
        public final LinkedList f362248f;

        /* renamed from: g, reason: collision with root package name */
        public final LinkedList f362249g;

        /* renamed from: h, reason: collision with root package name */
        public final LinkedList f362250h;

        /* renamed from: i, reason: collision with root package name */
        public boolean f362251i;

        public d(com.google.maps.android.clustering.view.b bVar) {
            super(Looper.getMainLooper());
            ReentrantLock reentrantLock = new ReentrantLock();
            this.f362244b = reentrantLock;
            this.f362245c = reentrantLock.newCondition();
            this.f362246d = new LinkedList();
            this.f362247e = new LinkedList();
            this.f362248f = new LinkedList();
            this.f362249g = new LinkedList();
            this.f362250h = new LinkedList();
        }

        /* JADX WARN: Removed duplicated region for block: B:17:0x0032  */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final boolean a() {
            /*
                r2 = this;
                java.util.concurrent.locks.ReentrantLock r0 = r2.f362244b
                r0.lock()     // Catch: java.lang.Throwable -> L30
                java.util.LinkedList r1 = r2.f362246d     // Catch: java.lang.Throwable -> L30
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r1 == 0) goto L32
                java.util.LinkedList r1 = r2.f362247e     // Catch: java.lang.Throwable -> L30
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r1 == 0) goto L32
                java.util.LinkedList r1 = r2.f362249g     // Catch: java.lang.Throwable -> L30
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r1 == 0) goto L32
                java.util.LinkedList r1 = r2.f362248f     // Catch: java.lang.Throwable -> L30
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r1 == 0) goto L32
                java.util.LinkedList r1 = r2.f362250h     // Catch: java.lang.Throwable -> L30
                boolean r1 = r1.isEmpty()     // Catch: java.lang.Throwable -> L30
                if (r1 != 0) goto L2e
                goto L32
            L2e:
                r1 = 0
                goto L33
            L30:
                r1 = move-exception
                goto L37
            L32:
                r1 = 1
            L33:
                r0.unlock()
                return r1
            L37:
                r0.unlock()
                throw r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.maps.android.clustering.view.f.d.a():boolean");
        }

        @TargetApi(11)
        public final void b() {
            LinkedList linkedList = this.f362249g;
            boolean zIsEmpty = linkedList.isEmpty();
            f fVar = f.this;
            if (!zIsEmpty) {
                DecelerateInterpolator decelerateInterpolator = f.f362239a;
                fVar.getClass();
                throw null;
            }
            LinkedList linkedList2 = this.f362250h;
            if (!linkedList2.isEmpty()) {
                a aVar = (a) linkedList2.poll();
                aVar.getClass();
                ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
                valueAnimatorOfFloat.setInterpolator(f.f362239a);
                valueAnimatorOfFloat.addUpdateListener(aVar);
                valueAnimatorOfFloat.addListener(aVar);
                valueAnimatorOfFloat.start();
                return;
            }
            LinkedList linkedList3 = this.f362247e;
            if (!linkedList3.isEmpty()) {
                b.a((b) linkedList3.poll());
                return;
            }
            LinkedList linkedList4 = this.f362246d;
            if (!linkedList4.isEmpty()) {
                b.a((b) linkedList4.poll());
                return;
            }
            LinkedList linkedList5 = this.f362248f;
            if (linkedList5.isEmpty()) {
                return;
            }
            DecelerateInterpolator decelerateInterpolator2 = f.f362239a;
            fVar.getClass();
            throw null;
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            if (!this.f362251i) {
                Looper.myQueue().addIdleHandler(this);
                this.f362251i = true;
            }
            removeMessages(0);
            ReentrantLock reentrantLock = this.f362244b;
            reentrantLock.lock();
            for (int i12 = 0; i12 < 10; i12++) {
                try {
                    b();
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            }
            if (a()) {
                sendEmptyMessageDelayed(0, 10L);
            } else {
                this.f362251i = false;
                Looper.myQueue().removeIdleHandler(this);
                this.f362245c.signalAll();
            }
            reentrantLock.unlock();
        }

        @Override // android.os.MessageQueue.IdleHandler
        public final boolean queueIdle() {
            sendEmptyMessage(0);
            return true;
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public static class e {

        /* renamed from: a, reason: collision with root package name */
        public final C36824h f362253a;

        public e(C36824h c36824h, com.google.maps.android.clustering.view.b bVar) {
            this.f362253a = c36824h;
            c36824h.getClass();
            try {
                c36824h.f354490a.getPosition();
            } catch (RemoteException e12) {
                throw new RuntimeRemoteException(e12);
            }
        }

        public final boolean equals(Object obj) {
            if (!(obj instanceof e)) {
                return false;
            }
            return this.f362253a.equals(((e) obj).f362253a);
        }

        public final int hashCode() {
            return this.f362253a.hashCode();
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    /* renamed from: com.google.maps.android.clustering.view.f$f, reason: collision with other inner class name */
    public class RunnableC10737f implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        public final Set<? extends com.google.maps.android.clustering.a<T>> f362254b;

        public RunnableC10737f() {
            throw null;
        }

        public RunnableC10737f(Set set, com.google.maps.android.clustering.view.b bVar) {
            this.f362254b = set;
        }

        @Override // java.lang.Runnable
        @SuppressLint({"NewApi"})
        public final void run() {
            f fVar = f.this;
            fVar.getClass();
            if (this.f362254b.equals(null)) {
                throw null;
            }
            new d(null);
            throw null;
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    @SuppressLint({"HandlerLeak"})
    public class g extends Handler {

        /* renamed from: a, reason: collision with root package name */
        public final f<T>.RunnableC10737f f362256a = null;

        /* compiled from: DefaultClusterRenderer.java */
        public class a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        public g(com.google.maps.android.clustering.view.b bVar) {
        }

        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            f<T>.RunnableC10737f runnableC10737f = this.f362256a;
            if (message.what == 1) {
                if (runnableC10737f != null) {
                    sendEmptyMessage(0);
                }
            } else {
                removeMessages(0);
                if (runnableC10737f == null) {
                    return;
                }
                DecelerateInterpolator decelerateInterpolator = f.f362239a;
                f.this.getClass();
                throw null;
            }
        }
    }

    /* compiled from: DefaultClusterRenderer.java */
    public static class c<T> {
        public c() {
            new HashMap();
            new HashMap();
        }

        public /* synthetic */ c(com.google.maps.android.clustering.view.b bVar) {
            this();
        }
    }
}
