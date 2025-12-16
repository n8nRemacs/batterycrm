package com.avito.android.autoteka.helpers;

import androidx.appcompat.app.r;
import com.avito.android.remote.model.TypedResult;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DelayPolling.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/autoteka/helpers/i;", "T", "", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class i<T> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final TypedResult<T> f96663a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f96664b;

    /* renamed from: c, reason: collision with root package name */
    public final long f96665c;

    public i(@Y61.k TypedResult<T> typedResult, boolean z12, long j12) {
        this.f96663a = typedResult;
        this.f96664b = z12;
        this.f96665c = j12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f96663a, iVar.f96663a) && this.f96664b == iVar.f96664b && this.f96665c == iVar.f96665c;
    }

    public final int hashCode() {
        return Long.hashCode(this.f96665c) + r.i(this.f96663a.hashCode() * 31, 31, this.f96664b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DelayPollingResult(response=");
        sb2.append(this.f96663a);
        sb2.append(", isStop=");
        sb2.append(this.f96664b);
        sb2.append(", delay=");
        return r.u(sb2, this.f96665c, ')');
    }

    public /* synthetic */ i(TypedResult typedResult, boolean z12, long j12, int i12, C42822w c42822w) {
        this(typedResult, z12, (i12 & 4) != 0 ? 0L : j12);
    }
}
