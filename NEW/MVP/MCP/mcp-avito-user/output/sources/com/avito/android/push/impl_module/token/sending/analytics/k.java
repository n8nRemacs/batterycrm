package com.avito.android.push.impl_module.token.sending.analytics;

import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: SendPushTokenAnalyticsStorage.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/analytics/k;", "Lcom/avito/android/push/impl_module/token/sending/analytics/j;", "a", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class k implements j {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final String f246019b;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AK0.l f246020a;

    /* compiled from: SendPushTokenAnalyticsStorage.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/push/impl_module/token/sending/analytics/k$a;", "", "<init>", "()V", "", "FCM_ON_NEW_TOKEN_TIMESTAMP", "Ljava/lang/String;", "HMS_ON_NEW_TOKEN_TIMESTAMP", "RUSTORE_ON_NEW_TOKEN_TIMESTAMP", "_avito_push_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f246019b = "push_provider_device_type_sent";
    }

    @Inject
    public k(@Y61.k AK0.l lVar) {
        this.f246020a = lVar;
    }

    @Override // com.avito.android.push.impl_module.token.sending.analytics.j
    public final long a() {
        return this.f246020a.getLong("FCM_ON_NEW_TOKEN_TIMESTAMP", 0L);
    }

    @Override // com.avito.android.push.impl_module.token.sending.analytics.j
    public final long b() {
        return this.f246020a.getLong("HMS_ON_NEW_TOKEN_TIMESTAMP", 0L);
    }

    @Override // com.avito.android.push.impl_module.token.sending.analytics.j
    public final void c(long j12) {
        this.f246020a.putLong("HMS_ON_NEW_TOKEN_TIMESTAMP", j12);
    }

    @Override // com.avito.android.push.impl_module.token.sending.analytics.j
    public final void d(long j12) {
        this.f246020a.putLong("RUSTORE_ON_NEW_TOKEN_TIMESTAMP", j12);
    }

    @Override // com.avito.android.push.impl_module.token.sending.analytics.j
    public final boolean e() {
        return this.f246020a.getBoolean(f246019b, false);
    }

    @Override // com.avito.android.push.impl_module.token.sending.analytics.j
    public final void f(long j12) {
        this.f246020a.putLong("FCM_ON_NEW_TOKEN_TIMESTAMP", j12);
    }

    @Override // com.avito.android.push.impl_module.token.sending.analytics.j
    public final void g() {
        this.f246020a.putBoolean(f246019b, true);
    }

    @Override // com.avito.android.push.impl_module.token.sending.analytics.j
    public final long h() {
        return this.f246020a.getLong("RUSTORE_ON_NEW_TOKEN_TIMESTAMP", 0L);
    }
}
