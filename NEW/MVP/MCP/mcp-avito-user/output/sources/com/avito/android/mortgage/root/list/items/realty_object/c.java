package com.avito.android.mortgage.root.list.items.realty_object;

import Y61.k;
import Y61.l;
import a10.InterfaceC19665b;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.WebViewLink;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: RealtyObjectItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/root/list/items/realty_object/c;", "La10/b;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class c implements InterfaceC19665b {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f202741b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f202742c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f202743d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f202744e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final WebViewLink.OnlyAvitoDomain f202745f;

    public c(@k String str, @k String str2, @k String str3, @l String str4, @l WebViewLink.OnlyAvitoDomain onlyAvitoDomain) {
        this.f202741b = str;
        this.f202742c = str2;
        this.f202743d = str3;
        this.f202744e = str4;
        this.f202745f = onlyAvitoDomain;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f202741b, cVar.f202741b) && L.f(this.f202742c, cVar.f202742c) && L.f(this.f202743d, cVar.f202743d) && L.f(this.f202744e, cVar.f202744e) && L.f(this.f202745f, cVar.f202745f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80342e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF199693b() {
        return this.f202741b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f202741b.hashCode() * 31, 31, this.f202742c), 31, this.f202743d);
        String str = this.f202744e;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        WebViewLink.OnlyAvitoDomain onlyAvitoDomain = this.f202745f;
        return iHashCode + (onlyAvitoDomain != null ? onlyAvitoDomain.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "RealtyObjectItem(stringId=" + this.f202741b + ", title=" + this.f202742c + ", cost=" + this.f202743d + ", address=" + this.f202744e + ", link=" + this.f202745f + ')';
    }
}
