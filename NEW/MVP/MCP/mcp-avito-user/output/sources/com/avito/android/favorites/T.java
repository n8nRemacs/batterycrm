package com.avito.android.favorites;

import io.reactivex.rxjava3.internal.operators.observable.C41981q0;
import kotlin.Metadata;

/* compiled from: FavoriteAdvertsSyncEventInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/T;", "Lcom/avito/android/favorites/S;", "<init>", "()V", "_avito-discouraged_avito-libs_favorite-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class T implements S {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.subjects.b<Q> f156331a = io.reactivex.rxjava3.subjects.b.N0();

    @Override // com.avito.android.favorites.V
    @Y61.k
    public final C41981q0 a() {
        io.reactivex.rxjava3.subjects.b<Q> bVar = this.f156331a;
        bVar.getClass();
        return new C41981q0(bVar);
    }

    @Override // com.avito.android.favorites.S
    public final void b(@Y61.k Q q12) {
        this.f156331a.onNext(q12);
    }
}
