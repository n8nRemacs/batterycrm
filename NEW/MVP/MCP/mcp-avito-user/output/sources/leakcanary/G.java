package leakcanary;

import android.view.View;
import kotlin.Metadata;
import leakcanary.H;

/* compiled from: RootViewWatcher.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lleakcanary/G;", "Landroid/view/View$OnAttachStateChangeListener;", "leakcanary-object-watcher-android-core_release"}, k = 1, mv = {1, 4, 1})
/* loaded from: classes8.dex */
public final class G implements View.OnAttachStateChangeListener {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Runnable f413990b = new a();

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ H.a f413991c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ View f413992d;

    /* compiled from: RootViewWatcher.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "run", "()V", "<anonymous>"}, k = 3, mv = {1, 4, 1})
    public static final class a implements Runnable {
        public a() {
        }

        @Override // java.lang.Runnable
        public final void run() {
            G g12 = G.this;
            E e12 = H.this.f413995b;
            View view = g12.f413992d;
            e12.a(view, view.getClass().getName().concat(" received View#onDetachedFromWindow() callback"));
        }
    }

    public G(H.a aVar, View view) {
        this.f413991c = aVar;
        this.f413992d = view;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewAttachedToWindow(@Y61.k View view) {
        leakcanary.internal.d.b().removeCallbacks(this.f413990b);
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public final void onViewDetachedFromWindow(@Y61.k View view) {
        leakcanary.internal.d.b().post(this.f413990b);
    }
}
