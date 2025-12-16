package com.avito.android.analytics.inhouse_transport;

import java.util.List;
import kotlin.Metadata;

/* compiled from: InHouseEventStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\bf\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/u;", "", "T", "_common_analytics-transport_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public interface u<T> {

    /* compiled from: InHouseEventStorage.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    int a();

    void add(@Y61.k T t12);

    void b(@Y61.k List<? extends T> list);

    void c();

    @Y61.k
    List<T> d();

    @Y61.k
    List<T> e(int i12);

    boolean isEmpty();
}
