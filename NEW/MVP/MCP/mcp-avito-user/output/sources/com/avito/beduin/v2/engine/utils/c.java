package com.avito.beduin.v2.engine.utils;

import Y61.k;
import Y61.l;
import java.util.Arrays;
import kotlin.Metadata;

/* compiled from: DataArray.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/engine/utils/c;", "T", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class c<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final T[] f336915a;

    public c(@k T[] tArr) {
        this.f336915a = tArr;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || c.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.f336915a, ((c) obj).f336915a);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f336915a);
    }

    @k
    public final String toString() {
        return "DataArray(value=" + Arrays.toString(this.f336915a) + ')';
    }
}
