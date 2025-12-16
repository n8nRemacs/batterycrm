package com.avito.android.advert.viewed;

import Y61.k;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: ViewedAdvertsEventInteractor.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/advert/viewed/b;", "Lcom/avito/android/advert/viewed/a;", "<init>", "()V", "_avito_viewed-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f81002a = new com.jakewharton.rxrelay3.c<>();

    @Inject
    public b() {
    }

    @Override // com.avito.android.advert.viewed.a
    /* renamed from: a, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF81002a() {
        return this.f81002a;
    }

    @Override // com.avito.android.advert.viewed.a
    public final void b(@k String str) {
        this.f81002a.accept(str);
    }
}
