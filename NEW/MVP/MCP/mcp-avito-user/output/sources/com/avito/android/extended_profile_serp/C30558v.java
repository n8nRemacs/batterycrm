package com.avito.android.extended_profile_serp;

import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpPageParams.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/v;", "", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.extended_profile_serp.v, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public final /* data */ class C30558v {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f153110a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f153111b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f153112c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f153113d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f153114e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f153115f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final DeepLink f153116g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final String f153117h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Boolean f153118i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Integer f153119j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f153120k;

    public C30558v(@Y61.l String str, @Y61.l String str2, @Y61.l String str3, @Y61.l String str4, @Y61.l String str5, @Y61.l Integer num, @Y61.l DeepLink deepLink, @Y61.k String str6, @Y61.l Boolean bool, @Y61.l Integer num2, boolean z12) {
        this.f153110a = str;
        this.f153111b = str2;
        this.f153112c = str3;
        this.f153113d = str4;
        this.f153114e = str5;
        this.f153115f = num;
        this.f153116g = deepLink;
        this.f153117h = str6;
        this.f153118i = bool;
        this.f153119j = num2;
        this.f153120k = z12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C30558v)) {
            return false;
        }
        C30558v c30558v = (C30558v) obj;
        return kotlin.jvm.internal.L.f(this.f153110a, c30558v.f153110a) && kotlin.jvm.internal.L.f(this.f153111b, c30558v.f153111b) && kotlin.jvm.internal.L.f(this.f153112c, c30558v.f153112c) && kotlin.jvm.internal.L.f(this.f153113d, c30558v.f153113d) && kotlin.jvm.internal.L.f(this.f153114e, c30558v.f153114e) && kotlin.jvm.internal.L.f(this.f153115f, c30558v.f153115f) && kotlin.jvm.internal.L.f(this.f153116g, c30558v.f153116g) && kotlin.jvm.internal.L.f(this.f153117h, c30558v.f153117h) && kotlin.jvm.internal.L.f(this.f153118i, c30558v.f153118i) && kotlin.jvm.internal.L.f(this.f153119j, c30558v.f153119j) && this.f153120k == c30558v.f153120k;
    }

    public final int hashCode() {
        String str = this.f153110a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f153111b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f153112c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f153113d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f153114e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.f153115f;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        DeepLink deepLink = this.f153116g;
        int iD2 = androidx.compose.foundation.H.d((iHashCode6 + (deepLink == null ? 0 : deepLink.hashCode())) * 31, 31, this.f153117h);
        Boolean bool = this.f153118i;
        int iHashCode7 = (iD2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Integer num2 = this.f153119j;
        return Boolean.hashCode(this.f153120k) + ((iHashCode7 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExtendedProfileSerpPageParams(baseProfileUrl=");
        sb2.append(this.f153110a);
        sb2.append(", shareS=");
        sb2.append(this.f153111b);
        sb2.append(", form=");
        sb2.append(this.f153112c);
        sb2.append(", fromPage=");
        sb2.append(this.f153113d);
        sb2.append(", profileSession=");
        sb2.append(this.f153114e);
        sb2.append(", fromBlock=");
        sb2.append(this.f153115f);
        sb2.append(", backDeeplink=");
        sb2.append(this.f153116g);
        sb2.append(", title=");
        sb2.append(this.f153117h);
        sb2.append(", isNeedToHideItemImages=");
        sb2.append(this.f153118i);
        sb2.append(", pageSize=");
        sb2.append(this.f153119j);
        sb2.append(", isSearchSuggestsEnabled=");
        return androidx.appcompat.app.r.x(sb2, this.f153120k, ')');
    }
}
