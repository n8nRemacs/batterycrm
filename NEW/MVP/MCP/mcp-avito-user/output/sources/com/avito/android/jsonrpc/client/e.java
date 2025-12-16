package com.avito.android.jsonrpc.client;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: RpcRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/jsonrpc/client/e;", "", "_common_jsonrpc_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    public final long f174730a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f174731b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f174732c;

    public e(long j12, @k String str, @k Object obj) {
        this.f174730a = j12;
        this.f174731b = str;
        this.f174732c = obj;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return this.f174730a == eVar.f174730a && L.f(this.f174731b, eVar.f174731b) && L.f(this.f174732c, eVar.f174732c);
    }

    public final int hashCode() {
        return this.f174732c.hashCode() + H.d(Long.hashCode(this.f174730a) * 31, 31, this.f174731b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("RpcRequest(id=");
        sb2.append(this.f174730a);
        sb2.append(", method=");
        sb2.append(this.f174731b);
        sb2.append(", params=");
        return H.n(sb2, this.f174732c, ')');
    }

    public /* synthetic */ e(long j12, String str, Object obj, int i12, C42822w c42822w) {
        this(j12, str, (i12 & 4) != 0 ? P0.c() : obj);
    }
}
