package com.avito.android.analytics.statsd;

import kotlin.Metadata;

/* compiled from: StatsdSenderImpl.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", "event", "Lcom/avito/android/analytics/statsd/StatsdRecord;", "invoke", "(Lcom/avito/android/analytics/statsd/StatsdRecord;)Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
final class M extends kotlin.jvm.internal.N implements Y41.l<StatsdRecord, Boolean> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ long f91043l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(long j12) {
        super(1);
        this.f91043l = j12;
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0018  */
    @Override // Y41.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Boolean invoke(com.avito.android.analytics.statsd.StatsdRecord r5) {
        /*
            r4 = this;
            com.avito.android.analytics.statsd.StatsdRecord r5 = (com.avito.android.analytics.statsd.StatsdRecord) r5
            java.lang.Long r0 = r5.getGenerationTime()
            if (r0 == 0) goto L18
            java.lang.Long r5 = r5.getGenerationTime()
            long r0 = r5.longValue()
            long r2 = r4.f91043l
            int r5 = (r2 > r0 ? 1 : (r2 == r0 ? 0 : -1))
            if (r5 > 0) goto L18
            r5 = 1
            goto L19
        L18:
            r5 = 0
        L19:
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.analytics.statsd.M.invoke(java.lang.Object):java.lang.Object");
    }
}
