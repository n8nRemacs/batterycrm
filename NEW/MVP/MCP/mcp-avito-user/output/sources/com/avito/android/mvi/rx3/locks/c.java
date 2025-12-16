package com.avito.android.mvi.rx3.locks;

import androidx.compose.foundation.H;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Operation.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mvi/rx3/locks/c;", "", "KeyT", "_common_mvi_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c<KeyT> {

    /* renamed from: a, reason: collision with root package name */
    @X41.f
    public final long f207039a;

    /* renamed from: b, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final String f207040b;

    /* renamed from: c, reason: collision with root package name */
    @X41.f
    @Y61.k
    public final Set<KeyT> f207041c;

    /* JADX WARN: Multi-variable type inference failed */
    public c(long j12, @Y61.k String str, @Y61.k Set<? extends KeyT> set) {
        this.f207039a = j12;
        this.f207040b = str;
        this.f207041c = set;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f207039a == cVar.f207039a && L.f(this.f207040b, cVar.f207040b) && L.f(this.f207041c, cVar.f207041c);
    }

    public final int hashCode() {
        return this.f207041c.hashCode() + H.d(Long.hashCode(this.f207039a) * 31, 31, this.f207040b);
    }

    @Y61.k
    public final String toString() {
        return "<" + this.f207041c + '>' + this.f207040b + '-' + this.f207039a;
    }
}
