package androidx.dynamicanimation.animation;

import android.os.SystemClock;
import android.view.Choreographer;
import androidx.collection.o1;
import j.X;
import java.util.ArrayList;

/* compiled from: AnimationHandler.java */
/* loaded from: classes.dex */
class a {

    /* renamed from: f, reason: collision with root package name */
    public static final ThreadLocal<a> f46013f = new ThreadLocal<>();

    /* renamed from: d, reason: collision with root package name */
    public e f46017d;

    /* renamed from: a, reason: collision with root package name */
    public final o1<b, Long> f46014a = new o1<>();

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList<b> f46015b = new ArrayList<>();

    /* renamed from: c, reason: collision with root package name */
    public final C1781a f46016c = new C1781a();

    /* renamed from: e, reason: collision with root package name */
    public boolean f46018e = false;

    /* compiled from: AnimationHandler.java */
    /* renamed from: androidx.dynamicanimation.animation.a$a, reason: collision with other inner class name */
    public class C1781a {
        public C1781a() {
        }
    }

    /* compiled from: AnimationHandler.java */
    public interface b {
        boolean a(long j12);
    }

    /* compiled from: AnimationHandler.java */
    public static abstract class c {

        /* renamed from: a, reason: collision with root package name */
        public final C1781a f46020a;

        public c(C1781a c1781a) {
            this.f46020a = c1781a;
        }
    }

    /* compiled from: AnimationHandler.java */
    public static class d extends c {
    }

    /* compiled from: AnimationHandler.java */
    @X
    public static class e extends c {

        /* renamed from: b, reason: collision with root package name */
        public final Choreographer f46021b;

        /* renamed from: c, reason: collision with root package name */
        public final Choreographer.FrameCallback f46022c;

        /* compiled from: AnimationHandler.java */
        /* renamed from: androidx.dynamicanimation.animation.a$e$a, reason: collision with other inner class name */
        public class ChoreographerFrameCallbackC1782a implements Choreographer.FrameCallback {
            public ChoreographerFrameCallbackC1782a() {
            }

            @Override // android.view.Choreographer.FrameCallback
            public final void doFrame(long j12) {
                ArrayList<b> arrayList;
                C1781a c1781a = e.this.f46020a;
                c1781a.getClass();
                long jUptimeMillis = SystemClock.uptimeMillis();
                a aVar = a.this;
                long jUptimeMillis2 = SystemClock.uptimeMillis();
                int i12 = 0;
                while (true) {
                    arrayList = aVar.f46015b;
                    if (i12 >= arrayList.size()) {
                        break;
                    }
                    b bVar = arrayList.get(i12);
                    if (bVar != null) {
                        o1<b, Long> o1Var = aVar.f46014a;
                        Long l12 = o1Var.get(bVar);
                        if (l12 == null) {
                            bVar.a(jUptimeMillis);
                        } else if (l12.longValue() < jUptimeMillis2) {
                            o1Var.remove(bVar);
                            bVar.a(jUptimeMillis);
                        }
                    }
                    i12++;
                }
                if (aVar.f46018e) {
                    for (int size = arrayList.size() - 1; size >= 0; size--) {
                        if (arrayList.get(size) == null) {
                            arrayList.remove(size);
                        }
                    }
                    aVar.f46018e = false;
                }
                if (arrayList.size() > 0) {
                    if (aVar.f46017d == null) {
                        aVar.f46017d = new e(aVar.f46016c);
                    }
                    aVar.f46017d.a();
                }
            }
        }

        public e(C1781a c1781a) {
            super(c1781a);
            this.f46021b = Choreographer.getInstance();
            this.f46022c = new ChoreographerFrameCallbackC1782a();
        }

        public final void a() {
            this.f46021b.postFrameCallback(this.f46022c);
        }
    }
}
