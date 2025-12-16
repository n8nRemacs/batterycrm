package com.avito.android.serp.adapter.closable;

import Y61.k;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: ClosedItemEventInteractor.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/closable/b;", "Lcom/avito/android/serp/adapter/closable/a;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.jakewharton.rxrelay3.c<String> f269417a = new com.jakewharton.rxrelay3.c<>();

    @Override // com.avito.android.advertising.kebab.m
    public final void a(@k String str) {
        this.f269417a.accept(str);
    }

    @Override // com.avito.android.serp.adapter.closable.a
    /* renamed from: b, reason: from getter */
    public final com.jakewharton.rxrelay3.c getF269417a() {
        return this.f269417a;
    }
}
