package h41;

import android.os.Looper;
import com.avito.android.user_adverts.root_screen.adverts_host.header.search_view.f;
import io.reactivex.rxjava3.disposables.d;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: MainThreadDisposable.java */
/* renamed from: h41.a, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public abstract class AbstractC40770a implements d {

    /* renamed from: b, reason: collision with root package name */
    public final AtomicBoolean f396996b = new AtomicBoolean();

    @Override // io.reactivex.rxjava3.disposables.d
    public final void dispose() {
        if (this.f396996b.compareAndSet(false, true)) {
            if (Looper.myLooper() == Looper.getMainLooper()) {
                n();
            } else {
                io.reactivex.rxjava3.android.schedulers.b.b().d(new f(this, 27));
            }
        }
    }

    @Override // io.reactivex.rxjava3.disposables.d
    /* renamed from: i */
    public final boolean getF318621e() {
        return this.f396996b.get();
    }

    public abstract void n();
}
