package com.avito.android.util.rx3;

import kotlin.Metadata;

/* compiled from: ObservableSources.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/util/rx3/E;", "Lio/reactivex/rxjava3/core/G;", "_common_rx_util"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class E implements io.reactivex.rxjava3.core.G<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Y41.l<io.reactivex.rxjava3.disposables.d, kotlin.G0> f318994b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Object, kotlin.G0> f318995c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Y41.l<Throwable, kotlin.G0> f318996d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Y41.a<kotlin.G0> f318997e;

    /* JADX WARN: Multi-variable type inference failed */
    public E(Y41.l<? super io.reactivex.rxjava3.disposables.d, kotlin.G0> lVar, Y41.l<Object, kotlin.G0> lVar2, Y41.l<? super Throwable, kotlin.G0> lVar3, Y41.a<kotlin.G0> aVar) {
        this.f318994b = lVar;
        this.f318995c = lVar2;
        this.f318996d = lVar3;
        this.f318997e = aVar;
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void b(@Y61.k io.reactivex.rxjava3.disposables.d dVar) {
        this.f318994b.invoke(dVar);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void e() {
        this.f318997e.invoke();
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onError(@Y61.k Throwable th2) {
        this.f318996d.invoke(th2);
    }

    @Override // io.reactivex.rxjava3.core.G
    public final void onNext(@Y61.k Object obj) {
        this.f318995c.invoke(obj);
    }
}
