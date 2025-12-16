package com.avito.android.serp.analytics.widgets_tracker;

import Y61.k;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlinx.coroutines.channels.BufferOverflow;

/* compiled from: DefaultTrackerConfig.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/analytics/widgets_tracker/b;", "Lcom/avito/android/serp/analytics/widgets_tracker/d;", "<init>", "()V", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class b implements d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final BufferOverflow f273940a = BufferOverflow.f410778c;

    @Inject
    public b() {
    }

    @Override // com.avito.android.serp.analytics.widgets_tracker.d
    public final int a() {
        return 1;
    }

    @Override // com.avito.android.serp.analytics.widgets_tracker.d
    @k
    /* renamed from: b, reason: from getter */
    public final BufferOverflow getF273940a() {
        return this.f273940a;
    }
}
