package com.avito.android.analytics.clickstream;

import com.avito.android.analytics.clickstream.H;
import java.util.List;
import kotlin.Metadata;
import proto.events.apps.EventOuterClass;

/* compiled from: ClickStreamSenderImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/analytics/clickstream/H$c;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/analytics/clickstream/H$c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes11.dex */
final class M<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Q f89754b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ List<EventOuterClass.Event> f89755c;

    public M(Q q12, List<EventOuterClass.Event> list) {
        this.f89754b = q12;
        this.f89755c = list;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        Q q12 = this.f89754b;
        q12.getClass();
        if (((H.c) obj) instanceof H.c.a) {
            q12.f89760b.b(this.f89755c);
        }
    }
}
