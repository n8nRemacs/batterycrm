package aw0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BookingFormData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Law0/b;", "", "_avito_short-term-rent_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: aw0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C24186b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f56777a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final C24187c f56778b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C24188d f56779c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Map<String, e> f56780d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f56781e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C24185a f56782f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f56783g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f56784h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Boolean f56785i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f56786j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f56787k;

    public C24186b(@k String str, @l C24187c c24187c, @l C24188d c24188d, @k Map<String, e> map, @l String str2, @l C24185a c24185a, @l String str3, @l String str4, @l Boolean bool, @l String str5, @l String str6) {
        this.f56777a = str;
        this.f56778b = c24187c;
        this.f56779c = c24188d;
        this.f56780d = map;
        this.f56781e = str2;
        this.f56782f = c24185a;
        this.f56783g = str3;
        this.f56784h = str4;
        this.f56785i = bool;
        this.f56786j = str5;
        this.f56787k = str6;
    }

    public static C24186b a(C24186b c24186b, C24187c c24187c, C24188d c24188d, LinkedHashMap linkedHashMap, String str, C24185a c24185a, Boolean bool, String str2, String str3, int i12) {
        String str4 = c24186b.f56777a;
        C24187c c24187c2 = (i12 & 2) != 0 ? c24186b.f56778b : c24187c;
        C24188d c24188d2 = (i12 & 4) != 0 ? c24186b.f56779c : c24188d;
        Map<String, e> map = (i12 & 8) != 0 ? c24186b.f56780d : linkedHashMap;
        String str5 = (i12 & 16) != 0 ? c24186b.f56781e : str;
        C24185a c24185a2 = (i12 & 32) != 0 ? c24186b.f56782f : c24185a;
        String str6 = c24186b.f56783g;
        String str7 = c24186b.f56784h;
        Boolean bool2 = (i12 & 256) != 0 ? c24186b.f56785i : bool;
        String str8 = (i12 & 512) != 0 ? c24186b.f56786j : str2;
        String str9 = (i12 & 1024) != 0 ? c24186b.f56787k : str3;
        c24186b.getClass();
        return new C24186b(str4, c24187c2, c24188d2, map, str5, c24185a2, str6, str7, bool2, str8, str9);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C24186b)) {
            return false;
        }
        C24186b c24186b = (C24186b) obj;
        return L.f(this.f56777a, c24186b.f56777a) && L.f(this.f56778b, c24186b.f56778b) && L.f(this.f56779c, c24186b.f56779c) && L.f(this.f56780d, c24186b.f56780d) && L.f(this.f56781e, c24186b.f56781e) && L.f(this.f56782f, c24186b.f56782f) && L.f(this.f56783g, c24186b.f56783g) && L.f(this.f56784h, c24186b.f56784h) && L.f(this.f56785i, c24186b.f56785i) && L.f(this.f56786j, c24186b.f56786j) && L.f(this.f56787k, c24186b.f56787k);
    }

    public final int hashCode() {
        int iHashCode = this.f56777a.hashCode() * 31;
        C24187c c24187c = this.f56778b;
        int iHashCode2 = (iHashCode + (c24187c == null ? 0 : c24187c.hashCode())) * 31;
        C24188d c24188d = this.f56779c;
        int iC2 = AK.c.c((iHashCode2 + (c24188d == null ? 0 : c24188d.hashCode())) * 31, 31, this.f56780d);
        String str = this.f56781e;
        int iHashCode3 = (iC2 + (str == null ? 0 : str.hashCode())) * 31;
        C24185a c24185a = this.f56782f;
        int iHashCode4 = (iHashCode3 + (c24185a == null ? 0 : c24185a.hashCode())) * 31;
        String str2 = this.f56783g;
        int iHashCode5 = (iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f56784h;
        int iHashCode6 = (iHashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Boolean bool = this.f56785i;
        int iHashCode7 = (iHashCode6 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str4 = this.f56786j;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f56787k;
        return iHashCode8 + (str5 != null ? str5.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BookingFormData(itemId=");
        sb2.append(this.f56777a);
        sb2.append(", dateRange=");
        sb2.append(this.f56778b);
        sb2.append(", guests=");
        sb2.append(this.f56779c);
        sb2.append(", inputs=");
        sb2.append(this.f56780d);
        sb2.append(", promoCode=");
        sb2.append(this.f56781e);
        sb2.append(", bonuses=");
        sb2.append(this.f56782f);
        sb2.append(", xHash=");
        sb2.append(this.f56783g);
        sb2.append(", idempotencyKey=");
        sb2.append(this.f56784h);
        sb2.append(", nonRefundableDiscountEnable=");
        sb2.append(this.f56785i);
        sb2.append(", paymentType=");
        sb2.append(this.f56786j);
        sb2.append(", paymentPlan=");
        return C22026a.c(sb2, this.f56787k, ')');
    }
}
