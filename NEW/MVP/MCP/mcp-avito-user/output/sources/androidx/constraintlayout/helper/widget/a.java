package androidx.constraintlayout.helper.widget;

import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.motion.widget.q;
import j.X;

/* compiled from: Carousel.java */
/* loaded from: classes.dex */
public class a extends q {

    /* renamed from: n, reason: collision with root package name */
    public b f43663n;

    /* renamed from: o, reason: collision with root package name */
    public int f43664o;

    /* renamed from: p, reason: collision with root package name */
    public int f43665p;

    /* renamed from: q, reason: collision with root package name */
    public MotionLayout f43666q;

    /* compiled from: Carousel.java */
    /* renamed from: androidx.constraintlayout.helper.widget.a$a, reason: collision with other inner class name */
    public class RunnableC1704a implements Runnable {

        /* compiled from: Carousel.java */
        /* renamed from: androidx.constraintlayout.helper.widget.a$a$a, reason: collision with other inner class name */
        public class RunnableC1705a implements Runnable {
            @Override // java.lang.Runnable
            public final void run() {
                throw null;
            }
        }

        @Override // java.lang.Runnable
        public final void run() {
            throw null;
        }
    }

    /* compiled from: Carousel.java */
    public interface b {
        int a();
    }

    @Override // androidx.constraintlayout.motion.widget.q, androidx.constraintlayout.motion.widget.MotionLayout.j
    public final void a(int i12) {
        int i13 = this.f43665p;
        this.f43664o = i13;
        if (i12 == 0) {
            this.f43665p = i13 + 1;
        } else if (i12 == 0) {
            this.f43665p = i13 - 1;
        }
        if (this.f43665p >= this.f43663n.a()) {
            this.f43665p = this.f43663n.a() - 1;
        }
        if (this.f43665p < 0) {
            this.f43665p = 0;
        }
        if (this.f43664o != this.f43665p) {
            this.f43666q.post(null);
        }
    }

    public int getCount() {
        b bVar = this.f43663n;
        if (bVar != null) {
            return bVar.a();
        }
        return 0;
    }

    public int getCurrentIndex() {
        return this.f43665p;
    }

    @Override // androidx.constraintlayout.widget.a, android.view.View
    @X
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (getParent() instanceof MotionLayout) {
            MotionLayout motionLayout = (MotionLayout) getParent();
            if (this.f44234c > 0) {
                motionLayout.getViewById(this.f44233b[0]);
                throw null;
            }
            this.f43666q = motionLayout;
            b bVar = this.f43663n;
            if (bVar != null && motionLayout != null && bVar.a() != 0) {
                throw null;
            }
        }
    }

    public void setAdapter(b bVar) {
        this.f43663n = bVar;
    }
}
