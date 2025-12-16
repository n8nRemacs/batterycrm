package com.avito.android.publish.slots.contact_method.item;

import Y61.l;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ContactMethodItemPayload.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/contact_method/item/c;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class c {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f243296a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Boolean f243297b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f243298c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f243299d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Boolean f243300e;

    public c(@l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l String str, @l String str2) {
        this.f243296a = str;
        this.f243297b = bool;
        this.f243298c = str2;
        this.f243299d = bool2;
        this.f243300e = bool3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f243296a, cVar.f243296a) && L.f(this.f243297b, cVar.f243297b) && L.f(this.f243298c, cVar.f243298c) && L.f(this.f243299d, cVar.f243299d) && L.f(this.f243300e, cVar.f243300e);
    }

    public final int hashCode() {
        String str = this.f243296a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Boolean bool = this.f243297b;
        int iHashCode2 = (iHashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f243298c;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Boolean bool2 = this.f243299d;
        int iHashCode4 = (iHashCode3 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.f243300e;
        return iHashCode4 + (bool3 != null ? bool3.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ContactMethodItemPayload(messengerText=");
        sb2.append(this.f243296a);
        sb2.append(", isMessengerChecked=");
        sb2.append(this.f243297b);
        sb2.append(", phoneText=");
        sb2.append(this.f243298c);
        sb2.append(", isPhoneChecked=");
        sb2.append(this.f243299d);
        sb2.append(", hasError=");
        return C0.g(sb2, this.f243300e, ')');
    }
}
