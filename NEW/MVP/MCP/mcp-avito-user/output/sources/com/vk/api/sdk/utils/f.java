package com.vk.api.sdk.utils;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.SystemClock;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.N;

/* compiled from: RateLimitTokenBackoff.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/vk/api/sdk/utils/f;", "", "b", "c", "d", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final d f366721a;

    /* renamed from: b, reason: collision with root package name */
    public final long f366722b;

    /* renamed from: c, reason: collision with root package name */
    public final long f366723c;

    /* renamed from: d, reason: collision with root package name */
    public final float f366724d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Long> f366725e;

    /* compiled from: RateLimitTokenBackoff.kt */
    @Metadata(d1 = {"\u0000\u0006\n\u0000\n\u0002\u0010\t\u0010\u0000\u001a\u00020\u0001H\n"}, d2 = {"<anonymous>", ""}, k = 3, mv = {1, 5, 1}, xi = 48)
    public static final class a extends N implements Y41.a<Long> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f366726l = new a();

        public a() {
            super(0);
        }

        @Override // Y41.a
        public final Long invoke() {
            return Long.valueOf(SystemClock.elapsedRealtime());
        }
    }

    /* compiled from: RateLimitTokenBackoff.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/vk/api/sdk/utils/f$b;", "Lcom/vk/api/sdk/utils/f$d;", "<init>", "()V", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class b implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final ConcurrentHashMap<String, Q<Long, Integer>> f366727a = new ConcurrentHashMap<>();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final Object f366728b = new Object();

        @Override // com.vk.api.sdk.utils.f.d
        public final void a(@Y61.k String str) {
            synchronized (this.f366728b) {
                this.f366727a.remove(str);
            }
        }

        @Override // com.vk.api.sdk.utils.f.d
        @Y61.k
        public final Q b(@Y61.k String str) {
            Q<Long, Integer> q12 = this.f366727a.get(str);
            return q12 == null ? new Q(Long.MAX_VALUE, 0) : q12;
        }

        @Override // com.vk.api.sdk.utils.f.d
        public final void c(long j12, @Y61.k String str) {
            Integer num;
            synchronized (this.f366728b) {
                Q<Long, Integer> q12 = this.f366727a.get(str);
                int iIntValue = 0;
                if (q12 != null && (num = q12.f406620c) != null) {
                    iIntValue = num.intValue() + 1;
                }
                this.f366727a.put(str, new Q<>(Long.valueOf(j12), Integer.valueOf(iIntValue)));
                G0 g02 = G0.f406611a;
            }
        }

        @Override // com.vk.api.sdk.utils.f.d
        public final boolean d(@Y61.k String str) {
            return this.f366727a.containsKey(str);
        }
    }

    /* compiled from: RateLimitTokenBackoff.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/vk/api/sdk/utils/f$c;", "Lcom/vk/api/sdk/utils/f$d;", "a", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public static final class c implements d {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final InterfaceC42726C f366729a;

        /* compiled from: RateLimitTokenBackoff.kt */
        @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/vk/api/sdk/utils/f$c$a;", "", "<init>", "()V", "", "PREF_NAME", "Ljava/lang/String;", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
        public static final class a {
            public /* synthetic */ a(C42822w c42822w) {
                this();
            }

            public a() {
            }
        }

        /* compiled from: RateLimitTokenBackoff.kt */
        @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u0001H\n"}, d2 = {"<anonymous>", "Landroid/content/SharedPreferences;", "kotlin.jvm.PlatformType"}, k = 3, mv = {1, 5, 1}, xi = 48)
        public static final class b extends N implements Y41.a<SharedPreferences> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ Context f366730l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(Context context) {
                super(0);
                this.f366730l = context;
            }

            @Override // Y41.a
            public final SharedPreferences invoke() {
                return this.f366730l.getSharedPreferences("rate_limit_backoff_storage", 0);
            }
        }

        static {
            new a(null);
        }

        public c(@Y61.k Context context) {
            this.f366729a = C42727D.c(new b(context));
        }

        @Override // com.vk.api.sdk.utils.f.d
        public final void a(@Y61.k String str) {
            ((SharedPreferences) this.f366729a.getValue()).edit().remove(str).apply();
        }

        @Override // com.vk.api.sdk.utils.f.d
        @Y61.k
        public final Q b(@Y61.k String str) {
            return new Q(Long.valueOf(((SharedPreferences) this.f366729a.getValue()).getLong(str, Long.MAX_VALUE)), 0);
        }

        @Override // com.vk.api.sdk.utils.f.d
        public final void c(long j12, @Y61.k String str) {
            ((SharedPreferences) this.f366729a.getValue()).edit().putLong(str, j12).apply();
        }

        @Override // com.vk.api.sdk.utils.f.d
        public final boolean d(@Y61.k String str) {
            return ((SharedPreferences) this.f366729a.getValue()).contains(str);
        }
    }

    /* compiled from: RateLimitTokenBackoff.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bf\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/vk/api/sdk/utils/f$d;", "", "core_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    public interface d {
        void a(@Y61.k String str);

        @Y61.k
        Q b(@Y61.k String str);

        void c(long j12, @Y61.k String str);

        boolean d(@Y61.k String str);
    }

    public f() {
        throw null;
    }

    public f(d dVar, long j12, long j13, float f12, Y41.a aVar, int i12, C42822w c42822w) {
        j13 = (i12 & 4) != 0 ? j12 : j13;
        f12 = (i12 & 8) != 0 ? 1.5f : f12;
        aVar = (i12 & 16) != 0 ? a.f366726l : aVar;
        this.f366721a = dVar;
        this.f366722b = j12;
        this.f366723c = j13;
        this.f366724d = f12;
        this.f366725e = aVar;
    }
}
