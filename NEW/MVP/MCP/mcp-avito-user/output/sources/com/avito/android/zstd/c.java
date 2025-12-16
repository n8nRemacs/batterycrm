package com.avito.android.zstd;

import Y41.p;
import java.io.IOException;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okio.C44802l;
import okio.e0;
import okio.i0;

/* compiled from: TrackingSource.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/zstd/c;", "Lokio/e0;", "_common_zstd_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements e0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f331356b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.time.c f331357c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final N f331358d;

    /* renamed from: e, reason: collision with root package name */
    public long f331359e;

    /* renamed from: f, reason: collision with root package name */
    public long f331360f;

    /* compiled from: TrackingSource.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Long;"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.a<Long> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ C44802l f331362m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ long f331363n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(C44802l c44802l, long j12) {
            super(0);
            this.f331362m = c44802l;
            this.f331363n = j12;
        }

        @Override // Y41.a
        public final Long invoke() {
            c cVar = c.this;
            long j12 = cVar.f331356b.read(this.f331362m, this.f331363n);
            Long lValueOf = Long.valueOf(j12);
            cVar.f331360f += j12;
            return lValueOf;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public c(@Y61.k e0 e0Var, @Y61.k com.avito.android.time.c cVar, @Y61.k p<? super Long, ? super Long, G0> pVar) {
        this.f331356b = e0Var;
        this.f331357c = cVar;
        this.f331358d = (N) pVar;
    }

    /* JADX WARN: Type inference failed for: r2v0, types: [Y41.p, kotlin.jvm.internal.N] */
    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.f331356b.close();
        this.f331358d.invoke(Long.valueOf(this.f331359e), Long.valueOf(this.f331360f));
    }

    @Override // okio.e0
    public final long read(@Y61.k C44802l c44802l, long j12) {
        a aVar = new a(c44802l, j12);
        this.f331357c.getClass();
        long jA2 = com.avito.android.time.c.f301453b.a();
        Object objInvoke = aVar.invoke();
        this.f331359e = (com.avito.android.time.c.f301453b.a() - jA2) + this.f331359e;
        return ((Number) objInvoke).longValue();
    }

    @Override // okio.e0
    @Y61.k
    /* renamed from: timeout */
    public final i0 getF420025c() {
        return this.f331356b.getF420025c();
    }
}
