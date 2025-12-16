package com.avito.android.server_time;

import Y61.k;
import Y61.l;
import java.util.TimeZone;
import kotlin.Metadata;

/* compiled from: LocalTimeSource.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/server_time/a;", "Lcom/avito/android/server_time/h;", "<init>", "()V", "_common_server-time_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements h {
    @Override // com.avito.android.server_time.h
    @k
    public final TimeZone a() {
        return TimeZone.getDefault();
    }

    public final boolean equals(@l Object obj) {
        return obj instanceof a;
    }

    public final int hashCode() {
        return 966394611;
    }

    @Override // com.avito.android.server_time.h
    public final long now() {
        return System.currentTimeMillis();
    }

    @k
    public final String toString() {
        return "LocalTimeSource(now=" + System.currentTimeMillis() + ')';
    }
}
