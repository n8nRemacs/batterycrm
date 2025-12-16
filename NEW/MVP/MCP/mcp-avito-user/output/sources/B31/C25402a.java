package b31;

import Y61.k;
import android.os.Looper;
import com.yatatsu.powerwebview.PowerWebView;
import com.yatatsu.powerwebview.rx.PowerWebViewStateChangeEvent;
import io.reactivex.rxjava3.core.G;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.disposables.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PowerWebViewStateChangeEventObservable.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lb31/a;", "Lio/reactivex/rxjava3/core/z;", "Lcom/yatatsu/powerwebview/rx/PowerWebViewStateChangeEvent;", "_common_powerwebview_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: b31.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C25402a extends z<PowerWebViewStateChangeEvent> {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final PowerWebView f56856b;

    public C25402a(@k PowerWebView powerWebView) {
        this.f56856b = powerWebView;
    }

    @Override // io.reactivex.rxjava3.core.z
    public final void w0(@k G<? super PowerWebViewStateChangeEvent> g12) {
        if (L.f(Looper.myLooper(), Looper.getMainLooper())) {
            com.yatatsu.powerwebview.rx.a aVar = new com.yatatsu.powerwebview.rx.a(g12, this);
            g12.b(aVar);
            this.f56856b.f392925c.add(aVar);
        } else {
            String str = "Expected to be called on the main thread but was " + Thread.currentThread().getName();
            g12.b(d.E(io.reactivex.rxjava3.internal.functions.a.f401992b));
            g12.onError(new IllegalStateException(str));
        }
    }
}
