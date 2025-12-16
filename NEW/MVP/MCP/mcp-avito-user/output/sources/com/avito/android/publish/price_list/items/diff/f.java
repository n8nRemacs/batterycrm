package com.avito.android.publish.price_list.items.diff;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.publish.price_list.items.selectable.t;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SelectPriceListItemPayloadCreator.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/items/diff/f;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final t f238626a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f238627b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f238628c;

    public f(@k t tVar, @l String str, @l String str2) {
        this.f238626a = tVar;
        this.f238627b = str;
        this.f238628c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f238626a, fVar.f238626a) && L.f(this.f238627b, fVar.f238627b) && L.f(this.f238628c, fVar.f238628c);
    }

    public final int hashCode() {
        int iHashCode = this.f238626a.hashCode() * 31;
        String str = this.f238627b;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f238628c;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectablePriceListPayload(state=");
        sb2.append(this.f238626a);
        sb2.append(", subtitle=");
        sb2.append(this.f238627b);
        sb2.append(", error=");
        return C22026a.c(sb2, this.f238628c, ')');
    }
}
