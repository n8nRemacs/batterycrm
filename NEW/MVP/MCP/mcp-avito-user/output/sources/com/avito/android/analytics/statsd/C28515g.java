package com.avito.android.analytics.statsd;

import com.avito.android.analytics.inhouse_transport.A;
import com.avito.android.util.V2;
import kotlin.Metadata;

/* compiled from: SendStatsdEventsTaskDelegateImpl.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/analytics/inhouse_transport/A;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/analytics/inhouse_transport/A;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.analytics.statsd.g, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
final class C28515g<T> implements l41.g {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C28517i f91053b;

    public C28515g(C28517i c28517i) {
        this.f91053b = c28517i;
    }

    @Override // l41.g
    public final void accept(Object obj) {
        com.avito.android.analytics.inhouse_transport.A a12 = (com.avito.android.analytics.inhouse_transport.A) obj;
        this.f91053b.getClass();
        if (a12 instanceof A.c) {
            V2.f318762a.e("Statsd", ((A.c) a12).f90179a);
        }
    }
}
