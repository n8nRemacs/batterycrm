package com.yandex.metrica.impl.ob;

import com.yandex.metrica.networktasks.api.ExponentialBackoffDataHolder;
import com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy;
import com.yandex.metrica.networktasks.api.RetryPolicyConfig;

/* renamed from: com.yandex.metrica.impl.ob.ld, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38952ld implements ExponentialBackoffPolicy {

    /* renamed from: a, reason: collision with root package name */
    private final ExponentialBackoffDataHolder f380976a;

    public C38952ld(@Y61.k ExponentialBackoffDataHolder exponentialBackoffDataHolder) {
        this.f380976a = exponentialBackoffDataHolder;
    }

    @Override // com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy
    public boolean canBeExecuted(@Y61.l RetryPolicyConfig retryPolicyConfig) {
        ExponentialBackoffDataHolder exponentialBackoffDataHolder = this.f380976a;
        if (retryPolicyConfig == null) {
            exponentialBackoffDataHolder.getClass();
            return true;
        }
        long j12 = exponentialBackoffDataHolder.f382403d;
        if (j12 == 0) {
            return true;
        }
        int i12 = ((1 << (exponentialBackoffDataHolder.f382404e - 1)) - 1) * retryPolicyConfig.f382440b;
        int i13 = retryPolicyConfig.f382439a;
        if (i12 > i13) {
            i12 = i13;
        }
        long j13 = i12;
        exponentialBackoffDataHolder.f382400a.f382463a.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        return jCurrentTimeMillis < j12 || jCurrentTimeMillis - j12 >= j13;
    }

    @Override // com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy
    public void onAllHostsAttemptsFinished(boolean z12) {
        if (z12) {
            ExponentialBackoffDataHolder exponentialBackoffDataHolder = this.f380976a;
            exponentialBackoffDataHolder.f382404e = 1;
            exponentialBackoffDataHolder.f382403d = 0L;
            C39052pd c39052pd = exponentialBackoffDataHolder.f382402c;
            c39052pd.saveNextSendAttemptNumber(1);
            c39052pd.saveLastAttemptTimeSeconds(exponentialBackoffDataHolder.f382403d);
            return;
        }
        ExponentialBackoffDataHolder exponentialBackoffDataHolder2 = this.f380976a;
        exponentialBackoffDataHolder2.f382401b.getClass();
        long jCurrentTimeMillis = System.currentTimeMillis() / 1000;
        exponentialBackoffDataHolder2.f382403d = jCurrentTimeMillis;
        exponentialBackoffDataHolder2.f382404e++;
        C39052pd c39052pd2 = exponentialBackoffDataHolder2.f382402c;
        c39052pd2.saveLastAttemptTimeSeconds(jCurrentTimeMillis);
        c39052pd2.saveNextSendAttemptNumber(exponentialBackoffDataHolder2.f382404e);
    }

    @Override // com.yandex.metrica.networktasks.api.ExponentialBackoffPolicy
    public void onHostAttemptFinished(boolean z12) {
    }
}
