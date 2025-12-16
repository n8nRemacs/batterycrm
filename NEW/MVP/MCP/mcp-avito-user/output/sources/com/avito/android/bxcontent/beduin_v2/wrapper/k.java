package com.avito.android.bxcontent.beduin_v2.wrapper;

import com.avito.android.remote.model.SerpElement;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BxWrapperState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/beduin_v2/wrapper/k;", "", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f109611a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final SerpElement f109612b;

    public k(@Y61.k String str, @Y61.l SerpElement serpElement) {
        this.f109611a = str;
        this.f109612b = serpElement;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f109611a, kVar.f109611a) && L.f(this.f109612b, kVar.f109612b);
    }

    public final int hashCode() {
        int iHashCode = this.f109611a.hashCode() * 31;
        SerpElement serpElement = this.f109612b;
        return iHashCode + (serpElement == null ? 0 : serpElement.hashCode());
    }

    @Y61.k
    public final String toString() {
        return "BxWrapperState(id=" + this.f109611a + ", serpElement=" + this.f109612b + ')';
    }
}
