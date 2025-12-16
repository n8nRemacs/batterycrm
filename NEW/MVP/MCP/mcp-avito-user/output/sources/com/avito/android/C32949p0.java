package com.avito.android;

import Cq0.C13343b;
import com.avito.android.util.Y5;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: FavoriteSellersCounterLoader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/p0;", "Lcom/avito/android/common/j;", "_avito-discouraged_avito-libs_favorite-sellers-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.p0, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C32949p0 implements com.avito.android.common.j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.remote.Q> f210564a;

    @Inject
    public C32949p0(@Y61.k h31.e<com.avito.android.remote.Q> eVar) {
        this.f210564a = eVar;
    }

    @Override // com.avito.android.common.j
    @Y61.k
    public final io.reactivex.rxjava3.internal.operators.observable.B0 load() {
        return Y5.a(new io.reactivex.rxjava3.internal.operators.observable.F(new C13343b(this, 1))).d0(C32901o0.f208204b);
    }
}
