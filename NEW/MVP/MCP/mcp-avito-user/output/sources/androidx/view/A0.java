package androidx.view;

import Y61.k;
import Y61.l;
import android.os.Handler;
import androidx.view.Lifecycle;
import kotlin.Metadata;

/* compiled from: ServiceLifecycleDispatcher.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0016\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/lifecycle/A0;", "", "a", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes.dex */
public class A0 {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final C22985S f46647a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Handler f46648b = new Handler();

    /* renamed from: c, reason: collision with root package name */
    @l
    public a f46649c;

    /* compiled from: ServiceLifecycleDispatcher.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/lifecycle/A0$a;", "Ljava/lang/Runnable;", "lifecycle-service_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a implements Runnable {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final C22985S f46650b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Lifecycle.Event f46651c;

        /* renamed from: d, reason: collision with root package name */
        public boolean f46652d;

        public a(@k C22985S c22985s, @k Lifecycle.Event event) {
            this.f46650b = c22985s;
            this.f46651c = event;
        }

        @Override // java.lang.Runnable
        public final void run() {
            if (this.f46652d) {
                return;
            }
            this.f46650b.f(this.f46651c);
            this.f46652d = true;
        }
    }

    public A0(@k ServiceC22988V serviceC22988V) {
        this.f46647a = new C22985S(serviceC22988V, true);
    }

    public final void a(Lifecycle.Event event) {
        a aVar = this.f46649c;
        if (aVar != null) {
            aVar.run();
        }
        a aVar2 = new a(this.f46647a, event);
        this.f46649c = aVar2;
        this.f46648b.postAtFrontOfQueue(aVar2);
    }
}
