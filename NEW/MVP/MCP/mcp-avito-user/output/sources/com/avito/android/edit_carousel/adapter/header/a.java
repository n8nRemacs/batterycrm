package com.avito.android.edit_carousel.adapter.header;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import ly.InterfaceC43848a;

/* compiled from: HeaderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/edit_carousel/adapter/header/a;", "Lly/a;", "_avito_profile-management_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class a implements InterfaceC43848a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f146289b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f146290c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f146291d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f146292e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f146293f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f146294g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f146295h;

    public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, int i12, C42822w c42822w) {
        this.f146289b = (i12 & 1) != 0 ? "header_item" : str;
        this.f146290c = str2;
        this.f146291d = str3;
        this.f146292e = str4;
        this.f146293f = str5;
        this.f146294g = str6;
        this.f146295h = str7;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f146289b, aVar.f146289b) && L.f(this.f146290c, aVar.f146290c) && L.f(this.f146291d, aVar.f146291d) && L.f(this.f146292e, aVar.f146292e) && L.f(this.f146293f, aVar.f146293f) && L.f(this.f146294g, aVar.f146294g) && L.f(this.f146295h, aVar.f146295h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF123929b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF146289b() {
        return this.f146289b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(H.d(H.d(H.d(this.f146289b.hashCode() * 31, 31, this.f146290c), 31, this.f146291d), 31, this.f146292e), 31, this.f146293f), 31, this.f146294g);
        String str = this.f146295h;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HeaderItem(stringId=");
        sb2.append(this.f146289b);
        sb2.append(", title=");
        sb2.append(this.f146290c);
        sb2.append(", nameTitle=");
        sb2.append(this.f146291d);
        sb2.append(", nameSubtitle=");
        sb2.append(this.f146292e);
        sb2.append(", advertsTitle=");
        sb2.append(this.f146293f);
        sb2.append(", advertsSubtitle=");
        sb2.append(this.f146294g);
        sb2.append(", selectedName=");
        return C22026a.c(sb2, this.f146295h, ')');
    }
}
