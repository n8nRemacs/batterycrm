package com.avito.android.timestamp_storage.domain;

import java.time.LocalDate;
import javax.inject.Inject;
import kotlin.Metadata;
import vE0.C49204d;
import yE0.C50105a;

/* compiled from: TimestampStateProvider.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/timestamp_storage/domain/b;", "Lcom/avito/android/timestamp_storage/domain/a;", "<init>", "()V", "_avito_timestamp-storage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class b implements a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.timestamp_storage.domain.a
    public final boolean a(@Y61.k C49204d c49204d, long j12, long j13) {
        LocalDate localDateOfEpochDay = LocalDate.ofEpochDay(j12);
        Long l12 = c49204d.f440552a;
        Long lValueOf = l12 != null ? Long.valueOf(localDateOfEpochDay.plusDays(l12.longValue()).toEpochDay()) : null;
        Long l13 = c49204d.f440553b;
        return C50105a.a(j13, lValueOf, l13 != null ? Long.valueOf(localDateOfEpochDay.plusDays(l13.longValue()).toEpochDay()) : null);
    }

    @Override // com.avito.android.timestamp_storage.domain.a
    public final long current() {
        return LocalDate.now().toEpochDay();
    }
}
