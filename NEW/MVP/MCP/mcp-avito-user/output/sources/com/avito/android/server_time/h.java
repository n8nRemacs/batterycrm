package com.avito.android.server_time;

import Y61.k;
import java.util.TimeZone;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;

/* compiled from: TimeSource.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001\u0082\u0001\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/server_time/h;", "", "Lcom/avito/android/server_time/a;", "Lcom/avito/android/server_time/f;", "Lcom/avito/android/server_time/j;", "_common_server-time_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes3.dex */
public interface h {

    /* compiled from: TimeSource.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @k
    TimeZone a();

    long now();
}
