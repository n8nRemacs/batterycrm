package ru.rustore.sdk.reactive.subject;

import java.util.Iterator;
import kotlin.G0;
import kotlin.Metadata;
import ru.rustore.sdk.reactive.observable.K;
import tb1.C48644a;
import tb1.b;

/* compiled from: MutableSubject.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lru/rustore/sdk/reactive/subject/c;", "Lru/rustore/sdk/reactive/observable/K;", "sdk-public-reactive_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class c implements K<Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ b<Object> f437008a;

    public c(b<Object> bVar) {
        this.f437008a = bVar;
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onNext(Object obj) {
        int i12;
        Iterator<T> it = this.f437008a.f437005b.iterator();
        while (it.hasNext()) {
            ru.rustore.sdk.reactive.backpressure.processor.c cVar = (ru.rustore.sdk.reactive.backpressure.processor.c) it.next();
            synchronized (cVar.f436859d) {
                try {
                    if (!cVar.f436861f) {
                        C48644a<T> c48644a = cVar.f436860e;
                        synchronized (c48644a.f439328a) {
                            i12 = c48644a.f439329b.f406741d;
                        }
                        if (i12 >= cVar.f436857b) {
                            cVar.e(cVar.f436860e, new b.c(obj));
                        } else {
                            cVar.f436860e.a(new b.c(obj));
                        }
                        G0 g02 = G0.f406611a;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            cVar.b();
        }
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onComplete() {
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void a(ru.rustore.sdk.reactive.core.g gVar) {
    }

    @Override // ru.rustore.sdk.reactive.observable.K
    public final void onError(Throwable th2) {
    }
}
