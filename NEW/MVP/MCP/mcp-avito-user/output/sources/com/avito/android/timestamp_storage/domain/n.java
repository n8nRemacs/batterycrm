package com.avito.android.timestamp_storage.domain;

import com.avito.android.account.E;
import javax.inject.Inject;
import kotlin.Metadata;
import vE0.AbstractC49202b;

/* compiled from: TimestampUserProvider.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/timestamp_storage/domain/n;", "Lcom/avito/android/timestamp_storage/domain/m;", "_avito_timestamp-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class n implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final E f301520a;

    @Inject
    public n(@Y61.k E e12) {
        this.f301520a = e12;
    }

    @Override // com.avito.android.timestamp_storage.domain.m
    @Y61.k
    public final String a(@Y61.k AbstractC49202b abstractC49202b) {
        String strA;
        return (!abstractC49202b.f440549d || (strA = this.f301520a.a()) == null) ? "" : strA;
    }
}
