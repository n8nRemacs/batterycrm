package com.vk.push.core.backoff;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ExponentialBackOff.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/push/core/backoff/b;", "Lcom/vk/push/core/backoff/a;", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class b implements com.vk.push.core.backoff.a {

    /* renamed from: a, reason: collision with root package name */
    public final long f367006a;

    /* renamed from: b, reason: collision with root package name */
    public final long f367007b;

    /* renamed from: c, reason: collision with root package name */
    public final long f367008c;

    /* renamed from: d, reason: collision with root package name */
    public final long f367009d;

    /* renamed from: e, reason: collision with root package name */
    public final double f367010e;

    /* renamed from: f, reason: collision with root package name */
    public long f367011f;

    /* compiled from: ExponentialBackOff.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/vk/push/core/backoff/b$a;", "", "<init>", "()V", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    public static final class a {

        /* compiled from: ExponentialBackOff.kt */
        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0006\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Lcom/vk/push/core/backoff/b$a$a;", "", "<init>", "()V", "", "EXPONENTIAL_FACTOR", "D", "", "ONE_HUNDRED_MILLISECONDS", "J", "ONE_SECOND", "TEN_MINUTES", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
        /* renamed from: com.vk.push.core.backoff.b$a$a, reason: collision with other inner class name */
        public static final class C10834a {
            public /* synthetic */ C10834a(C42822w c42822w) {
                this();
            }

            public C10834a() {
            }
        }

        static {
            new C10834a(null);
        }
    }

    public b(long j12, long j13, long j14, long j15, double d12, C42822w c42822w) {
        this.f367006a = j12;
        this.f367007b = j13;
        this.f367008c = j14;
        this.f367009d = j15;
        this.f367010e = d12;
        this.f367011f = j12;
    }
}
