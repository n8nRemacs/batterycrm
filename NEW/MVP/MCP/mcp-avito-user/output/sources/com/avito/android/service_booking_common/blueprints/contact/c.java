package com.avito.android.service_booking_common.blueprints.contact;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.service_booking.SbContactBlock;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SbContactItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/contact/c;", "Lcom/avito/conveyor_item/a;", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f276287b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f276288c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final SbContactBlock.Icon f276289d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f276290e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f276291f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f276292g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f276293h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f276294i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f276295j;

    public c(@k String str, @k String str2, @l SbContactBlock.Icon icon, @l DeepLink deepLink, @l String str3, @l String str4, @l String str5, boolean z12, @l String str6) {
        this.f276287b = str;
        this.f276288c = str2;
        this.f276289d = icon;
        this.f276290e = deepLink;
        this.f276291f = str3;
        this.f276292g = str4;
        this.f276293h = str5;
        this.f276294i = z12;
        this.f276295j = str6;
    }

    public static c a(c cVar, boolean z12, String str, int i12) {
        String str2 = cVar.f276287b;
        String str3 = cVar.f276288c;
        SbContactBlock.Icon icon = cVar.f276289d;
        DeepLink deepLink = cVar.f276290e;
        String str4 = cVar.f276291f;
        String str5 = cVar.f276292g;
        String str6 = (i12 & 64) != 0 ? cVar.f276293h : null;
        if ((i12 & 256) != 0) {
            str = cVar.f276295j;
        }
        cVar.getClass();
        return new c(str2, str3, icon, deepLink, str4, str5, str6, z12, str);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return L.f(this.f276287b, cVar.f276287b) && L.f(this.f276288c, cVar.f276288c) && this.f276289d == cVar.f276289d && L.f(this.f276290e, cVar.f276290e) && L.f(this.f276291f, cVar.f276291f) && L.f(this.f276292g, cVar.f276292g) && L.f(this.f276293h, cVar.f276293h) && this.f276294i == cVar.f276294i && L.f(this.f276295j, cVar.f276295j);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80342e() {
        return getF224291b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF224291b() {
        return this.f276287b;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f276287b.hashCode() * 31, 31, this.f276288c);
        SbContactBlock.Icon icon = this.f276289d;
        int iHashCode = (iD2 + (icon == null ? 0 : icon.hashCode())) * 31;
        DeepLink deepLink = this.f276290e;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        String str = this.f276291f;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f276292g;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f276293h;
        int i12 = r.i((iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f276294i);
        String str4 = this.f276295j;
        return i12 + (str4 != null ? str4.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SbContactItem(stringId=");
        sb2.append(this.f276287b);
        sb2.append(", text=");
        sb2.append(this.f276288c);
        sb2.append(", icon=");
        sb2.append(this.f276289d);
        sb2.append(", uri=");
        sb2.append(this.f276290e);
        sb2.append(", header=");
        sb2.append(this.f276291f);
        sb2.append(", toastMessage=");
        sb2.append(this.f276292g);
        sb2.append(", showPhoneText=");
        sb2.append(this.f276293h);
        sb2.append(", blockClickable=");
        sb2.append(this.f276294i);
        sb2.append(", phone=");
        return C22026a.c(sb2, this.f276295j, ')');
    }
}
