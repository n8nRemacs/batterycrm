package com.avito.android.analytics.statsd;

import com.avito.android.analytics.InterfaceC28464o;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StatsdEvent.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0003\u0004\u0005\u0006\u0082\u0001\u0003\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/analytics/statsd/y;", "Lcom/avito/android/analytics/o;", "Lcom/avito/android/analytics/statsd/c;", "Ljava/io/Serializable;", "a", "b", "c", "Lcom/avito/android/analytics/statsd/y$a;", "Lcom/avito/android/analytics/statsd/y$b;", "Lcom/avito/android/analytics/statsd/y$c;", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class y implements InterfaceC28464o, InterfaceC28511c, Serializable {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f91091b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Number f91092c;

    /* compiled from: StatsdEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/statsd/y$a;", "Lcom/avito/android/analytics/statsd/y;", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a extends y {
        public /* synthetic */ a(String str, long j12, int i12, C42822w c42822w) {
            this(str, (i12 & 2) != 0 ? 1L : j12);
        }

        public a(@Y61.k String str, long j12) {
            super(str, Long.valueOf(j12), null);
        }
    }

    /* compiled from: StatsdEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/statsd/y$b;", "Lcom/avito/android/analytics/statsd/y;", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b extends y {
    }

    /* compiled from: StatsdEvent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/statsd/y$c;", "Lcom/avito/android/analytics/statsd/y;", "_common_analytics-statsd_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c extends y {
    }

    public y(String str, Number number, C42822w c42822w) {
        this.f91091b = str;
        this.f91092c = number;
    }
}
