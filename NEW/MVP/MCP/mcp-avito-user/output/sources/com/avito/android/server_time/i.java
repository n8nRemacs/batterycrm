package com.avito.android.server_time;

import Y61.k;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

/* compiled from: TimeSources.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"_common_server-time_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class i {
    public static final long a(@k h hVar) {
        return TimeUnit.SECONDS.convert(hVar.now(), TimeUnit.MILLISECONDS);
    }
}
