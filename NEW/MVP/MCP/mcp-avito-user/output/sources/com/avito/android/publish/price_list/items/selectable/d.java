package com.avito.android.publish.price_list.items.selectable;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SelectablePriceListItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/price_list/items/selectable/d;", "Lcom/avito/android/items/e;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class d implements com.avito.android.items.e {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f238671b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public String f238672c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f238673d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f238674e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f238675f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final t f238676g;

    public d(@Y61.k String str, @Y61.l String str2, @Y61.k String str3, @Y61.l String str4, @Y61.l String str5, @Y61.k t tVar) {
        this.f238671b = str;
        this.f238672c = str2;
        this.f238673d = str3;
        this.f238674e = str4;
        this.f238675f = str5;
        this.f238676g = tVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f238671b, dVar.f238671b) && L.f(this.f238672c, dVar.f238672c) && L.f(this.f238673d, dVar.f238673d) && L.f(this.f238674e, dVar.f238674e) && L.f(this.f238675f, dVar.f238675f) && L.f(this.f238676g, dVar.f238676g);
    }

    @Override // com.avito.android.items.e
    @Y61.l
    /* renamed from: getError, reason: from getter */
    public final String getF238672c() {
        return this.f238672c;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF189214d() {
        return this.f238671b;
    }

    public final int hashCode() {
        int iHashCode = this.f238671b.hashCode() * 31;
        String str = this.f238672c;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f238673d);
        String str2 = this.f238674e;
        int iHashCode2 = (iD2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f238675f;
        return this.f238676g.hashCode() + ((iHashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31);
    }

    @Override // com.avito.android.items.e
    public final void o() {
        this.f238672c = null;
    }

    @Y61.k
    public final String toString() {
        return "SelectablePriceListItem(stringId=" + this.f238671b + ", error=" + this.f238672c + ", paramId=" + this.f238673d + ", title=" + this.f238674e + ", subtitle=" + this.f238675f + ", state=" + this.f238676g + ')';
    }

    public /* synthetic */ d(String str, String str2, String str3, String str4, String str5, t tVar, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? null : str2, str3, str4, (i12 & 16) != 0 ? null : str5, tVar);
    }
}
