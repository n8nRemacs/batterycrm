package com.avito.android.analytics.clickstream;

import java.util.List;
import kotlin.Metadata;

/* compiled from: ClickStreamSenderImpl.kt */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00050\u00042\u001a\u0010\u0003\u001a\u0016\u0012\u0004\u0012\u00020\u0001 \u0002*\n\u0012\u0004\u0012\u00020\u0001\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"", "Lproto/events/apps/EventOuterClass$Event;", "kotlin.jvm.PlatformType", "events", "Lio/reactivex/rxjava3/core/O;", "Lcom/avito/android/analytics/clickstream/H$c;", "apply", "(Ljava/util/List;)Lio/reactivex/rxjava3/core/O;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class K<T, R> implements l41.o {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f89752b;

    public K(Q q12) {
        this.f89752b = q12;
    }

    @Override // l41.o
    public final Object apply(Object obj) {
        List list = (List) obj;
        Q q12 = this.f89752b;
        return Q.b(q12, list).k(new J(q12, list));
    }
}
