package J60;

import Y61.k;
import androidx.view.InterfaceC22979L;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.analytics.screens.image.h;
import com.avito.android.performance.PerformanceImageTracker;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PerformanceImageTracker.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LJ60/a;", "Landroidx/lifecycle/L;", "_common_image-loader_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class a implements InterfaceC22979L {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ h.a f8784b;

    /* compiled from: PerformanceImageTracker.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: J60.a$a, reason: collision with other inner class name */
    public /* synthetic */ class C0505a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f8785a;

        static {
            int[] iArr = new int[Lifecycle.Event.values().length];
            try {
                iArr[Lifecycle.Event.ON_RESUME.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Lifecycle.Event.ON_PAUSE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f8785a = iArr;
        }
    }

    public a(h.a aVar) {
        this.f8784b = aVar;
    }

    @Override // androidx.view.InterfaceC22979L
    public final void HH(@k InterfaceC22983P interfaceC22983P, @k Lifecycle.Event event) {
        int i12 = C0505a.f8785a[event.ordinal()];
        h.a aVar = this.f8784b;
        if (i12 == 1) {
            PerformanceImageTracker.f215083a.getClass();
            PerformanceImageTracker.f215084b.add(aVar);
        } else {
            if (i12 != 2) {
                return;
            }
            PerformanceImageTracker.f215083a.getClass();
            Iterator it = PerformanceImageTracker.f215084b.iterator();
            while (it.hasNext()) {
                if (L.f((com.avito.android.performance.a) it.next(), aVar)) {
                    it.remove();
                }
            }
        }
    }
}
