package com.avito.android.developments_agency_search.screen.deal_room_development.adapter.main_content;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.developments_agency_search.domain.Metro;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MainContentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room_development/adapter/main_content/c;", "Lcom/avito/conveyor_item/a;", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137879b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f137880c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f137881d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Metro f137882e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final String f137883f;

    public c(@k String str, @k String str2, @k String str3, @l Metro metro, @k String str4) {
        this.f137879b = str;
        this.f137880c = str2;
        this.f137881d = str3;
        this.f137882e = metro;
        this.f137883f = str4;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f137879b, cVar.f137879b) && L.f(this.f137880c, cVar.f137880c) && L.f(this.f137881d, cVar.f137881d) && L.f(this.f137882e, cVar.f137882e) && L.f(this.f137883f, cVar.f137883f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF189215e() {
        return getF314301b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF314301b() {
        return "main-content-item";
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f137879b.hashCode() * 31, 31, this.f137880c), 31, this.f137881d);
        Metro metro = this.f137882e;
        return this.f137883f.hashCode() + ((iD2 + (metro == null ? 0 : metro.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MainContentItem(title=");
        sb2.append(this.f137879b);
        sb2.append(", developer=");
        sb2.append(this.f137880c);
        sb2.append(", address=");
        sb2.append(this.f137881d);
        sb2.append(", metro=");
        sb2.append(this.f137882e);
        sb2.append(", fixationInfo=");
        return C22026a.c(sb2, this.f137883f, ')');
    }
}
