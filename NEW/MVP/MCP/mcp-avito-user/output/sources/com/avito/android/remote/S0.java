package com.avito.android.remote;

import kotlin.Metadata;

/* compiled from: RetrofitFactory.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/S0;", "Lcom/avito/android/remote/R0;", "_common_retrofit_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class S0 implements R0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final retrofit2.z f253050a;

    public S0(@Y61.k retrofit2.z zVar) {
        this.f253050a = zVar;
    }

    @Override // com.avito.android.remote.R0
    @Y61.k
    public final S0 a(@Y61.k Y41.l lVar) {
        return new S0((retrofit2.z) lVar.invoke(this.f253050a));
    }

    @Override // com.avito.android.remote.R0
    public final <T> T create(@Y61.k Class<T> cls) {
        return (T) this.f253050a.b(cls);
    }
}
