package com.vk.api.sdk.chain;

import android.os.SystemClock;
import androidx.appcompat.app.r;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.p;
import com.vk.api.sdk.utils.log.Logger;
import java.util.ArrayDeque;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TooManyRequestRetryChainCall.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/chain/k;", "T", "Lcom/vk/api/sdk/chain/j;", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class k<T> extends j<T> {

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final com.vk.api.sdk.utils.e f366568e;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final L11.b f366569c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final g f366570d;

    /* compiled from: TooManyRequestRetryChainCall.kt */
    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\f\u001a\u00020\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/vk/api/sdk/chain/k$a;", "", "<init>", "()V", "", "MAX_CALLS_PER_SECOND", "I", "", "MAX_LIMIT", "J", "TIMEOUT", "Lcom/vk/api/sdk/utils/e;", "errorBackoff", "Lcom/vk/api/sdk/utils/e;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
        f366568e = new com.vk.api.sdk.utils.e(1000L, 8000L, 1.2f, 0.0f, 0.0f, 24, null);
    }

    public k(@Y61.k p pVar, int i12, @Y61.k L11.b bVar, @Y61.k g gVar) {
        super(pVar, i12);
        this.f366569c = bVar;
        this.f366570d = gVar;
    }

    @Override // com.vk.api.sdk.chain.d
    @Y61.l
    public final T a(@Y61.k c cVar) throws InterruptedException, VKApiException {
        int i12 = this.f366567b;
        if (i12 >= 0) {
            int i13 = 0;
            while (true) {
                int i14 = i13 + 1;
                com.vk.api.sdk.utils.e eVar = f366568e;
                if (eVar.f366720g > 0) {
                    Thread.sleep(eVar.f366719f);
                }
                L11.b bVar = this.f366569c;
                synchronized (bVar) {
                    bVar.a();
                    long jElapsedRealtime = SystemClock.elapsedRealtime();
                    ArrayDeque<Long> arrayDeque = L11.b.f9752b;
                    arrayDeque.addLast(Long.valueOf(jElapsedRealtime));
                    long jLongValue = 1000 - (jElapsedRealtime - arrayDeque.removeFirst().longValue());
                    if (jLongValue > 0) {
                        Thread.sleep(jLongValue);
                    }
                }
                try {
                    T t12 = (T) this.f366570d.b(cVar, 0);
                    eVar.f366719f = eVar.f366714a;
                    eVar.f366720g = 0;
                    return t12;
                } catch (VKApiExecutionException e12) {
                    if (e12.f366584b != 6) {
                        throw e12;
                    }
                    this.f366553a.f366676a.f366598h.a(Logger.LogLevel.f366737c);
                    f366568e.a();
                    if (i13 == i12) {
                        break;
                    }
                    i13 = i14;
                }
            }
        }
        throw new VKApiException(r.t(new StringBuilder("Can't handle too many requests due to retry limit! (retryLimit="), this.f366567b, ')'));
    }
}
