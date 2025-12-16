package com.avito.android.preloading.coroutines;

import com.avito.android.analytics.statsd.y;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: StatsDEvents.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "screenName", "Lcom/avito/android/analytics/statsd/y$a;", "invoke", "(Ljava/lang/String;)Lcom/avito/android/analytics/statsd/y$a;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes15.dex */
final class y extends N implements Y41.l<String, y.a> {

    /* renamed from: l, reason: collision with root package name */
    public static final y f221849l = new y();

    public y() {
        super(1);
    }

    @Override // Y41.l
    public final y.a invoke(String str) {
        return new y.a("preloading_promise.duplicate_wait.".concat(str), 0L, 2, null);
    }
}
