package com.avito.android.remote.analytics;

import com.avito.android.I1;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.remote.C34265g0;
import com.avito.android.remote.model.payment.status.PaymentStateKt;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42756l;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import lj0.InterfaceC43782b;

/* compiled from: NetworkErrorsReporter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/m;", "Lcom/avito/android/remote/analytics/j;", "a", "b", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class m implements j {

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public static final a f253182h = new a(null);

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C34265g0 f253183a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f253184b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final n f253185c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final I1 f253186d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final y f253187e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC43782b f253188f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final Set<String> f253189g = C42756l.l0(new String[]{PaymentStateKt.PAYMENT_STATE_CANCELED, "interrupted"});

    /* compiled from: NetworkErrorsReporter.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/remote/analytics/m$a;", "", "<init>", "()V", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static String a(Throwable th2) {
            return th2.getClass().getName() + ": " + th2.getMessage();
        }

        public a() {
        }
    }

    public m(@Y61.k C34265g0 c34265g0, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k n nVar, @Y61.k I1 i12, @Y61.k y yVar, @Y61.k InterfaceC43782b interfaceC43782b) {
        this.f253183a = c34265g0;
        this.f253184b = interfaceC28373a;
        this.f253185c = nVar;
        this.f253186d = i12;
        this.f253187e = yVar;
        this.f253188f = interfaceC43782b;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:100:0x01e9  */
    /* JADX WARN: Removed duplicated region for block: B:120:0x0225 A[Catch: Exception -> 0x01d9, IOException -> 0x01dc, TRY_LEAVE, TryCatch #8 {IOException -> 0x01dc, Exception -> 0x01d9, blocks: (B:90:0x01d4, B:97:0x01e2, B:102:0x01ee, B:118:0x0221, B:120:0x0225, B:88:0x01cc, B:84:0x01ba), top: B:175:0x01ba, inners: #4 }] */
    /* JADX WARN: Removed duplicated region for block: B:127:0x024e  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0271  */
    /* JADX WARN: Removed duplicated region for block: B:130:0x0274  */
    /* JADX WARN: Removed duplicated region for block: B:136:0x02ab  */
    /* JADX WARN: Removed duplicated region for block: B:145:0x02c8  */
    /* JADX WARN: Removed duplicated region for block: B:154:0x02eb  */
    /* JADX WARN: Removed duplicated region for block: B:155:0x02ed  */
    /* JADX WARN: Removed duplicated region for block: B:161:0x0339  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x034f  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0139 A[PHI: r18 r19
  0x0139: PHI (r18v5 java.lang.String) = (r18v1 java.lang.String), (r18v6 java.lang.String) binds: [B:126:0x024c, B:57:0x0135] A[DONT_GENERATE, DONT_INLINE]
  0x0139: PHI (r19v19 com.avito.android.analytics.a) = (r19v6 com.avito.android.analytics.a), (r19v20 com.avito.android.analytics.a) binds: [B:126:0x024c, B:57:0x0135] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r0v22, types: [java.lang.Object, kotlin.C] */
    /* JADX WARN: Type inference failed for: r0v47, types: [com.avito.android.remote.model.Error] */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.avito.android.remote.model.Error] */
    /* JADX WARN: Type inference failed for: r19v10 */
    /* JADX WARN: Type inference failed for: r19v11 */
    /* JADX WARN: Type inference failed for: r19v17, types: [boolean] */
    /* JADX WARN: Type inference failed for: r19v7 */
    /* JADX WARN: Type inference failed for: r19v8 */
    /* JADX WARN: Type inference failed for: r19v9 */
    @Override // com.avito.android.remote.analytics.j
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void a(@Y61.k java.lang.annotation.Annotation[] r30, @Y61.k java.lang.String r31, @Y61.k java.lang.String r32, @Y61.l java.lang.String r33, @Y61.k java.lang.Throwable r34) {
        /*
            Method dump skipped, instructions count: 886
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.remote.analytics.m.a(java.lang.annotation.Annotation[], java.lang.String, java.lang.String, java.lang.String, java.lang.Throwable):void");
    }

    /* compiled from: NetworkErrorsReporter.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/remote/analytics/m$b;", "", "_avito_performance_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final NetworkErrorType f253190a;

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f253191b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f253192c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final Boolean f253193d;

        public b(@Y61.k NetworkErrorType networkErrorType, @Y61.k String str, @Y61.l String str2, @Y61.l Boolean bool) {
            this.f253190a = networkErrorType;
            this.f253191b = str;
            this.f253192c = str2;
            this.f253193d = bool;
        }

        public /* synthetic */ b(NetworkErrorType networkErrorType, String str, String str2, Boolean bool, int i12, C42822w c42822w) {
            this(networkErrorType, str, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : bool);
        }
    }
}
