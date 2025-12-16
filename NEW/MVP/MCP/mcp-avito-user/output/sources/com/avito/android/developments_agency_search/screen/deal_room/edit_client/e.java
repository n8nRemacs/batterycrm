package com.avito.android.developments_agency_search.screen.deal_room.edit_client;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: EditClientInfoForm.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/developments_agency_search/screen/deal_room/edit_client/e;", "", "_avito_developments-agency-search_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f137553a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f137554b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f137555c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f137556d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f137557e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f137558f;

    public e(@k String str, @k String str2, @k String str3, @l String str4, @l String str5, @l String str6) {
        this.f137553a = str;
        this.f137554b = str2;
        this.f137555c = str3;
        this.f137556d = str4;
        this.f137557e = str5;
        this.f137558f = str6;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f137553a, eVar.f137553a) && L.f(this.f137554b, eVar.f137554b) && L.f(this.f137555c, eVar.f137555c) && L.f(this.f137556d, eVar.f137556d) && L.f(this.f137557e, eVar.f137557e) && L.f(this.f137558f, eVar.f137558f);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(this.f137553a.hashCode() * 31, 31, this.f137554b), 31, this.f137555c);
        String str = this.f137556d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f137557e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f137558f;
        return iHashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("EditClientInfoForm(id=");
        sb2.append(this.f137553a);
        sb2.append(", firstName=");
        sb2.append(this.f137554b);
        sb2.append(", lastName=");
        sb2.append(this.f137555c);
        sb2.append(", middleName=");
        sb2.append(this.f137556d);
        sb2.append(", phone=");
        sb2.append(this.f137557e);
        sb2.append(", email=");
        return C22026a.c(sb2, this.f137558f, ')');
    }
}
