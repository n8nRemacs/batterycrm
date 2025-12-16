package com.avito.android.analytics;

import android.content.res.Configuration;
import java.util.LinkedHashSet;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: OrientationTracker.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/analytics/Y;", "", "a", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class Y {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f89687a;

    /* renamed from: b, reason: collision with root package name */
    public int f89688b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LinkedHashSet<String> f89689c = new LinkedHashSet<>();

    /* renamed from: d, reason: collision with root package name */
    public boolean f89690d;

    /* compiled from: OrientationTracker.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/Y$a;", "", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface a {
        @Y61.l
        Y a();
    }

    public Y(@Y61.k InterfaceC28373a interfaceC28373a, @Y61.k Configuration configuration) {
        this.f89687a = interfaceC28373a;
        this.f89688b = configuration.orientation;
    }
}
