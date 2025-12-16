package com.avito.android.analytics_adjust;

import com.adjust.sdk.AdjustEvent;
import com.avito.android.util.InterfaceC35881r2;
import io.reactivex.rxjava3.internal.operators.single.O;
import kotlin.Metadata;

/* compiled from: Adjust.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics_adjust/a;", "Lcom/avito/android/util/r2;", "_common_analytics-adjust_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.analytics_adjust.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public interface InterfaceC28533a extends InterfaceC35881r2 {

    /* compiled from: Adjust.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.analytics_adjust.a$a, reason: collision with other inner class name */
    public static final class C2687a {
    }

    void e(@Y61.k String str);

    @Y61.k
    O f();

    @Y61.k
    O getOaid();

    void k(@Y61.k String str);

    @Y61.k
    O l();

    @Y61.k
    AdjustEvent m(@Y61.k String str);

    void trackEvent(@Y61.k AdjustEvent adjustEvent);
}
