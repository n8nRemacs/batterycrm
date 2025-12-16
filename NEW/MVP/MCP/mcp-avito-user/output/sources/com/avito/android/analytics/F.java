package com.avito.android.analytics;

import android.content.Context;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;

/* compiled from: MobileNetworkSignalStrengthProvider.kt */
@Singleton
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/F;", "Lcom/avito/android/analytics/C;", "_avito_analytics_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class F implements C {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f89648a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.util.C f89649b;

    @Inject
    public F(@Y61.k Context context, @Y61.k com.avito.android.util.C c12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f89648a = context;
        this.f89649b = c12;
        interfaceC35745a5.a().d(new J11.c(25, this, interfaceC35745a5));
    }
}
