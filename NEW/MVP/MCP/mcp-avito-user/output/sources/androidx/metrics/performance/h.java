package androidx.metrics.performance;

import android.os.Handler;
import android.os.HandlerThread;
import android.view.Window;
import androidx.metrics.performance.a;
import com.avito.android.R;
import kotlin.collections.C42745f0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Runnable {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ boolean f52714b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ j f52715c;

    public /* synthetic */ h(boolean z12, j jVar) {
        this.f52714b = z12;
        this.f52715c = jVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z12 = this.f52714b;
        j jVar = this.f52715c;
        if (!z12) {
            int i12 = j.f52718n;
            a.C1866a c1866a = a.f52690b;
            Window window = jVar.f52719h;
            i iVar = jVar.f52724m;
            c1866a.getClass();
            a aVar = (a) window.getDecorView().getTag(R.id.metricsDelegator);
            if (aVar != null) {
                synchronized (aVar) {
                    aVar.f52692a.remove(iVar);
                }
                if (aVar.f52692a.isEmpty()) {
                    window.removeOnFrameMetricsAvailableListener(aVar);
                    window.getDecorView().setTag(R.id.metricsDelegator, null);
                }
            }
            jVar.f52721j = 0L;
            return;
        }
        if (jVar.f52721j == 0) {
            a.C1866a c1866a2 = a.f52690b;
            Window window2 = jVar.f52719h;
            i iVar2 = jVar.f52724m;
            c1866a2.getClass();
            a aVar2 = (a) window2.getDecorView().getTag(R.id.metricsDelegator);
            if (aVar2 == null) {
                a aVar3 = new a(C42745f0.e0(iVar2));
                if (a.f52691c == null) {
                    HandlerThread handlerThread = new HandlerThread("FrameMetricsAggregator");
                    handlerThread.start();
                    a.f52691c = new Handler(handlerThread.getLooper());
                }
                window2.getDecorView().setTag(R.id.metricsDelegator, aVar3);
                window2.addOnFrameMetricsAvailableListener(aVar3, a.f52691c);
            } else {
                synchronized (aVar2) {
                    aVar2.f52692a.add(iVar2);
                }
            }
            jVar.f52721j = System.nanoTime();
        }
    }
}
