package com.vk.push.core.retry;

import T11.f;
import Y61.k;
import androidx.compose.ui.graphics.colorspace.e;
import com.vk.push.core.backoff.b;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RequestRetryComponent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b&\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/push/core/retry/a;", "", "a", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
/* loaded from: classes7.dex */
public abstract class a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public static final C10844a f367143b = new C10844a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f367144c;

    /* renamed from: d, reason: collision with root package name */
    public static final long f367145d;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.vk.push.core.backoff.b f367146a;

    /* compiled from: RequestRetryComponent.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0006R\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/vk/push/core/retry/a$a;", "", "<init>", "()V", "", "INITIAL_BACKOFF_IN_MILLISECONDS", "J", "", "MAX_ATTEMPTS", "I", "MAX_BACKOFF_IN_MILLISECONDS", "", "SCALE_FACTOR", "D", "sdk-public-push-core_release"}, k = 1, mv = {1, 7, 0}, xi = 48)
    /* renamed from: com.vk.push.core.retry.a$a, reason: collision with other inner class name */
    public static final class C10844a {
        public /* synthetic */ C10844a(C42822w c42822w) {
            this();
        }

        @k
        public static com.vk.push.core.backoff.b a() {
            new b.a();
            long j12 = a.f367144c;
            if (j12 <= 0) {
                throw new IllegalStateException(e.i(j12, "initial back off should be positive: ", " < 0").toString());
            }
            long j13 = a.f367145d;
            if (j13 > 0) {
                return new com.vk.push.core.backoff.b(j12, j13, 100L, 1000L, 2.0d, null);
            }
            throw new IllegalStateException(e.i(j13, "max back off should be positive: ", " < 0").toString());
        }

        public C10844a() {
        }
    }

    static {
        TimeUnit timeUnit = TimeUnit.SECONDS;
        f367144c = timeUnit.toMillis(1L);
        f367145d = timeUnit.toMillis(32L);
    }

    public a(@k com.vk.push.core.backoff.b bVar) {
        this.f367146a = bVar;
    }

    @k
    public abstract f a();

    /* JADX WARN: Removed duplicated region for block: B:21:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00a0  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0143  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0017  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:40:0x013a -> B:41:0x013e). Please report as a decompilation issue!!! */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object b(@Y61.k Y41.l r18, @Y61.k kotlin.coroutines.jvm.internal.ContinuationImpl r19) {
        /*
            Method dump skipped, instructions count: 342
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.push.core.retry.a.b(Y41.l, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    public abstract boolean c(@k Throwable th2);
}
