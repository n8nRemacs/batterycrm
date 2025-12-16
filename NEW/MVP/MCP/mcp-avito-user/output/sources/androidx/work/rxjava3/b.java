package androidx.work.rxjava3;

import androidx.concurrent.futures.b;
import io.reactivex.rxjava3.core.H;
import io.reactivex.rxjava3.core.I;
import io.reactivex.rxjava3.internal.schedulers.d;
import java.util.concurrent.Executor;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes10.dex */
public final /* synthetic */ class b implements b.c {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ RxWorker f56207b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ I f56208c;

    public /* synthetic */ b(RxWorker rxWorker, I i12) {
        this.f56207b = rxWorker;
        this.f56208c = i12;
    }

    @Override // androidx.concurrent.futures.b.c
    public final Object d(b.a aVar) {
        androidx.work.impl.utils.I i12 = RxWorker.f56206a;
        RxWorker rxWorker = this.f56207b;
        Executor backgroundExecutor = rxWorker.getBackgroundExecutor();
        H h12 = io.reactivex.rxjava3.schedulers.b.f404941a;
        this.f56208c.z(new d(backgroundExecutor, true, true)).s(new d(rxWorker.getTaskExecutor().d(), true, true)).a(new c(aVar));
        return "converted single to future";
    }
}
