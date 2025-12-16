package com.vk.api.sdk.chain;

import com.vk.api.sdk.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: RateLimitReachedChainCall.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/chain/i;", "T", "Lcom/vk/api/sdk/chain/d;", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class i<T> extends d<T> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f366564b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.vk.api.sdk.utils.f f366565c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final k f366566d;

    /* compiled from: RateLimitReachedChainCall.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/api/sdk/chain/i$a;", "", "<init>", "()V", "", "DETAIL_MESSAGE", "Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public i(@Y61.k p pVar, @Y61.k String str, @Y61.k com.vk.api.sdk.utils.f fVar, @Y61.k k kVar) {
        super(pVar);
        this.f366564b = str;
        this.f366565c = fVar;
        this.f366566d = kVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:4:0x0010  */
    @Override // com.vk.api.sdk.chain.d
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final T a(@Y61.k com.vk.api.sdk.chain.c r15) throws com.vk.api.sdk.exceptions.VKApiExecutionException {
        /*
            r14 = this;
            com.vk.api.sdk.utils.f r0 = r14.f366565c
            com.vk.api.sdk.utils.f$d r1 = r0.f366721a
            java.lang.String r2 = r14.f366564b
            boolean r3 = r1.d(r2)
            Y41.a<java.lang.Long> r4 = r0.f366725e
            r5 = 0
            if (r3 != 0) goto L12
        L10:
            r7 = r5
            goto L4f
        L12:
            kotlin.Q r1 = r1.b(r2)
            A r3 = r1.f406619b
            java.lang.Number r3 = (java.lang.Number) r3
            long r7 = r3.longValue()
            B r1 = r1.f406620c
            java.lang.Number r1 = (java.lang.Number) r1
            int r1 = r1.intValue()
            java.lang.Object r3 = r4.invoke()
            java.lang.Number r3 = (java.lang.Number) r3
            long r9 = r3.longValue()
            long r9 = r9 - r7
            r3 = 0
            long r7 = r0.f366722b
        L34:
            if (r3 >= r1) goto L3e
            float r7 = (float) r7
            float r8 = r0.f366724d
            float r7 = r7 * r8
            long r7 = (long) r7
            int r3 = r3 + 1
            goto L34
        L3e:
            long r11 = r0.f366723c
            long r7 = java.lang.Math.min(r7, r11)
            int r1 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r1 >= 0) goto L49
            goto L10
        L49:
            int r1 = (r9 > r7 ? 1 : (r9 == r7 ? 0 : -1))
            if (r1 < 0) goto L4e
            goto L10
        L4e:
            long r7 = r7 - r9
        L4f:
            int r1 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r1 > 0) goto L86
            com.vk.api.sdk.utils.f$d r0 = r0.f366721a
            boolean r1 = r0.d(r2)
            if (r1 != 0) goto L5c
            goto L5f
        L5c:
            r0.a(r2)
        L5f:
            com.vk.api.sdk.chain.k r1 = r14.f366566d     // Catch: com.vk.api.sdk.exceptions.VKApiExecutionException -> L66
            java.lang.Object r15 = r1.a(r15)     // Catch: com.vk.api.sdk.exceptions.VKApiExecutionException -> L66
            return r15
        L66:
            r15 = move-exception
            int r1 = r15.f366584b
            r3 = 29
            if (r1 != r3) goto L85
            java.lang.Object r1 = r4.invoke()
            java.lang.Number r1 = (java.lang.Number) r1
            long r3 = r1.longValue()
            r0.c(r3, r2)
            com.vk.api.sdk.p r0 = r14.f366553a
            com.vk.api.sdk.g r0 = r0.f366676a
            com.vk.api.sdk.utils.log.Logger$LogLevel r1 = com.vk.api.sdk.utils.log.Logger.LogLevel.f366737c
            com.vk.api.sdk.utils.log.Logger r0 = r0.f366598h
            r0.a(r1)
        L85:
            throw r15
        L86:
            com.vk.api.sdk.exceptions.RateLimitReachedException r15 = new com.vk.api.sdk.exceptions.RateLimitReachedException
            r12 = 496(0x1f0, float:6.95E-43)
            r13 = 0
            r3 = 29
            java.lang.String r4 = r14.f366564b
            r5 = 0
            java.lang.String r6 = "Rate limit reached."
            r7 = 0
            r8 = 0
            r9 = 0
            r10 = 0
            r11 = 0
            r2 = r15
            r2.<init>(r3, r4, r5, r6, r7, r8, r9, r10, r11, r12, r13)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: com.vk.api.sdk.chain.i.a(com.vk.api.sdk.chain.c):java.lang.Object");
    }
}
