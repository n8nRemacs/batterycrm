package org.koin.core.definition;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: Callbacks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lorg/koin/core/definition/c;", "T", "", "koin-core"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes7.dex */
public final /* data */ class c<T> {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final Y41.l<T, G0> f421454a;

    public c() {
        this(null, 1, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f421454a, ((c) obj).f421454a);
    }

    public final int hashCode() {
        Y41.l<T, G0> lVar = this.f421454a;
        if (lVar == null) {
            return 0;
        }
        return lVar.hashCode();
    }

    @k
    public final String toString() {
        return H.l(new StringBuilder("Callbacks(onClose="), this.f421454a, ')');
    }

    public c(Y41.l lVar, int i12, C42822w c42822w) {
        this.f421454a = (i12 & 1) != 0 ? null : lVar;
    }
}
