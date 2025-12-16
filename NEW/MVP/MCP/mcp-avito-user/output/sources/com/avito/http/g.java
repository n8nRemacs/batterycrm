package com.avito.http;

import Y41.l;
import Y61.k;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import okhttp3.Request;

/* compiled from: RetryPolicy.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/http/g;", "", "okhttp"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class g {

    /* renamed from: a, reason: collision with root package name */
    public final int f338485a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final List<String> f338486b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Integer> f338487c;

    /* renamed from: d, reason: collision with root package name */
    public final long f338488d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f338489e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final l<Request, Request> f338490f;

    /* compiled from: RetryPolicy.kt */
    @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lokhttp3/Request;", "it", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements l<Request, Request> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f338491l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final Request invoke(Request request) {
            return request;
        }
    }

    public g() {
        this(0, null, null, 0L, false, null, 63, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof g)) {
            return false;
        }
        g gVar = (g) obj;
        return this.f338485a == gVar.f338485a && L.f(this.f338486b, gVar.f338486b) && L.f(this.f338487c, gVar.f338487c) && this.f338488d == gVar.f338488d && this.f338489e == gVar.f338489e && L.f(this.f338490f, gVar.f338490f);
    }

    public final int hashCode() {
        return this.f338490f.hashCode() + r.i(r.g(H.e(H.e(Integer.hashCode(this.f338485a) * 31, 31, this.f338486b), 31, this.f338487c), 31, this.f338488d), 31, this.f338489e);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RetryPolicy(tries=");
        sb2.append(this.f338485a);
        sb2.append(", allowedMethods=");
        sb2.append(this.f338486b);
        sb2.append(", allowedCodes=");
        sb2.append(this.f338487c);
        sb2.append(", delayBetweenTriesMs=");
        sb2.append(this.f338488d);
        sb2.append(", useIncreasingDelay=");
        sb2.append(this.f338489e);
        sb2.append(", modifyRetryRequest=");
        return H.l(sb2, this.f338490f, ')');
    }

    public g(int i12, List list, List list2, long j12, boolean z12, l lVar, int i13, C42822w c42822w) {
        i12 = (i13 & 1) != 0 ? 5 : i12;
        list = (i13 & 2) != 0 ? Collections.singletonList("GET") : list;
        list2 = (i13 & 4) != 0 ? C42745f0.U(408, 500, 502, 503, 504) : list2;
        j12 = (i13 & 8) != 0 ? 1000L : j12;
        z12 = (i13 & 16) != 0 ? true : z12;
        lVar = (i13 & 32) != 0 ? a.f338491l : lVar;
        this.f338485a = i12;
        this.f338486b = list;
        this.f338487c = list2;
        this.f338488d = j12;
        this.f338489e = z12;
        this.f338490f = lVar;
    }
}
