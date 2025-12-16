package curtains.internal;

import Y61.k;
import android.os.Handler;
import android.view.View;
import android.view.ViewTreeObserver;
import j.X;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: NextDrawListener.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcurtains/internal/d;", "Landroid/view/ViewTreeObserver$OnDrawListener;", "Landroid/view/View$OnAttachStateChangeListener;", "a", "curtains_release"}, k = 1, mv = {1, 4, 1})
@X
/* loaded from: classes8.dex */
public final class d implements ViewTreeObserver.OnDrawListener, View.OnAttachStateChangeListener {

    /* renamed from: d, reason: collision with root package name */
    @k
    public static final a f393004d = new a(null);

    /* renamed from: b, reason: collision with root package name */
    public boolean f393005b;

    /* renamed from: c, reason: collision with root package name */
    public final View f393006c;

    /* compiled from: NextDrawListener.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcurtains/internal/d$a;", "", "<init>", "()V", "curtains_release"}, k = 1, mv = {1, 4, 1})
    public static final class a {
        public a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    /* compiled from: NextDrawListener.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class b implements Runnable {
        public b() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            d dVar = d.this;
            ViewTreeObserver viewTreeObserver = dVar.f393006c.getViewTreeObserver();
            if (viewTreeObserver.isAlive()) {
                viewTreeObserver.removeOnDrawListener(dVar);
            }
        }
    }

    public d(@k View view) {
        this.f393006c = view;
    }

    @Override // android.view.ViewTreeObserver.OnDrawListener
    public final void onDraw() {
        if (this.f393005b) {
            return;
        }
        this.f393005b = true;
        this.f393006c.removeOnAttachStateChangeListener(this);
        ((Handler) c.f393000a.getValue()).post(new b());
        throw null;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@k View view) {
        view.getViewTreeObserver().addOnDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@k View view) {
        view.getViewTreeObserver().removeOnDrawListener(this);
        view.removeOnAttachStateChangeListener(this);
    }
}
