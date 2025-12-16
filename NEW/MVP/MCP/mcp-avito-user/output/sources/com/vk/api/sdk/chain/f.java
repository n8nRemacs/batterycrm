package com.vk.api.sdk.chain;

import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.api.sdk.exceptions.VKApiIllegalResponseException;
import com.vk.api.sdk.exceptions.VKInternalServerErrorException;
import com.vk.api.sdk.p;
import com.vk.api.sdk.utils.log.Logger;
import kotlin.Metadata;

/* compiled from: InternalErrorRetryChainCall.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/chain/f;", "T", "Lcom/vk/api/sdk/chain/j;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f<T> extends j<T> {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final i f366554c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.vk.api.sdk.utils.e f366555d;

    public f(@Y61.k p pVar, int i12, @Y61.k i iVar) {
        super(pVar, i12);
        this.f366554c = iVar;
        this.f366555d = new com.vk.api.sdk.utils.e(1000L, 60000L, 1.5f, 0.0f, 0.0f, 24, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0 */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Throwable] */
    /* JADX WARN: Type inference failed for: r1v4, types: [com.vk.api.sdk.exceptions.VKInternalServerErrorException] */
    /* JADX WARN: Type inference failed for: r1v5, types: [com.vk.api.sdk.exceptions.VKApiIllegalResponseException] */
    /* JADX WARN: Type inference failed for: r1v6 */
    /* JADX WARN: Type inference failed for: r1v7, types: [com.vk.api.sdk.exceptions.VKApiExecutionException, java.lang.Throwable] */
    @Override // com.vk.api.sdk.chain.d
    @Y61.l
    public final T a(@Y61.k c cVar) throws InterruptedException, VKApiException {
        Logger.LogLevel logLevel = Logger.LogLevel.f366738d;
        ?? e12 = 0;
        while (true) {
            if (this.f366567b >= 0 && this.f366555d.f366720g > this.f366567b) {
                if (e12 == 0) {
                    throw new VKApiException("api-call failed due to retry limits, but no exception has tracked");
                }
                throw e12;
            }
            if (this.f366555d.f366720g > 0) {
                Thread.sleep(this.f366555d.f366719f);
            }
            try {
                return (T) this.f366554c.a(cVar);
            } catch (VKApiExecutionException e13) {
                e12 = e13;
                int i12 = e12.f366584b;
                if (i12 != 1 && i12 != 10 && i12 != 13) {
                    throw e12;
                }
                this.f366553a.f366676a.f366598h.a(logLevel);
                this.f366555d.a();
            } catch (VKApiIllegalResponseException e14) {
                e12 = e14;
                this.f366553a.f366676a.f366598h.a(logLevel);
                this.f366555d.a();
            } catch (VKInternalServerErrorException e15) {
                e12 = e15;
                this.f366553a.f366676a.f366598h.a(logLevel);
                this.f366555d.a();
            }
        }
    }
}
