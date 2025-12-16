package com.avito.android.analytics.event;

import androidx.compose.runtime.C22026a;
import com.avito.android.analytics.provider.clickstream.ParametrizedClickStreamEvent;
import com.avito.android.util.C35755b0;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import shark.AndroidResourceIdNames;

/* compiled from: WantToBuyRequestSuccessEvent.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/analytics/event/h1;", "Lcom/avito/android/analytics/provider/clickstream/a;", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class h1 implements com.avito.android.analytics.provider.clickstream.a {

    /* renamed from: b, reason: collision with root package name */
    public final long f90049b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f90050c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f90051d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f90052e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f90053f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f90054g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f90055h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final String f90056i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f90057j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f90058k;

    /* renamed from: l, reason: collision with root package name */
    public final int f90059l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f90060m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Boolean f90061n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f90062o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f90063p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f90064q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final String f90065r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ ParametrizedClickStreamEvent f90066s;

    public h1(long j12, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, boolean z12, @Y61.l String str4, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.k String str8, int i12, @Y61.l String str9, @Y61.l Boolean bool, @Y61.l String str10, @Y61.l String str11, @Y61.l String str12, @Y61.l String str13) {
        this.f90049b = j12;
        this.f90050c = str;
        this.f90051d = str2;
        this.f90052e = str3;
        this.f90053f = z12;
        this.f90054g = str4;
        this.f90055h = str5;
        this.f90056i = str6;
        this.f90057j = str7;
        this.f90058k = str8;
        this.f90059l = i12;
        this.f90060m = str9;
        this.f90061n = bool;
        this.f90062o = str10;
        this.f90063p = str11;
        this.f90064q = str12;
        this.f90065r = str13;
        this.f90066s = new ParametrizedClickStreamEvent(13442, 0, C35755b0.c(kotlin.collections.P0.g(new kotlin.Q("cid", str2), new kotlin.Q("oid", str6), new kotlin.Q("mcid", str3), new kotlin.Q("iid", str), new kotlin.Q("x", C35800g5.b(new C35792f5(str9))), new kotlin.Q("from_page", str13), new kotlin.Q("from_space", str12), new kotlin.Q("lid", str5), new kotlin.Q("mid", str4), new kotlin.Q("sid", str7), new kotlin.Q("is_multiitems_variation", bool), new kotlin.Q("multiitem_source", str10), new kotlin.Q("multiitem_click_param_name", str11), new kotlin.Q("wsrc", str8))), null, 8, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h1)) {
            return false;
        }
        h1 h1Var = (h1) obj;
        return this.f90049b == h1Var.f90049b && kotlin.jvm.internal.L.f(this.f90050c, h1Var.f90050c) && kotlin.jvm.internal.L.f(this.f90051d, h1Var.f90051d) && kotlin.jvm.internal.L.f(this.f90052e, h1Var.f90052e) && this.f90053f == h1Var.f90053f && kotlin.jvm.internal.L.f(this.f90054g, h1Var.f90054g) && kotlin.jvm.internal.L.f(this.f90055h, h1Var.f90055h) && kotlin.jvm.internal.L.f(this.f90056i, h1Var.f90056i) && kotlin.jvm.internal.L.f(this.f90057j, h1Var.f90057j) && kotlin.jvm.internal.L.f(this.f90058k, h1Var.f90058k) && this.f90059l == h1Var.f90059l && kotlin.jvm.internal.L.f(this.f90060m, h1Var.f90060m) && kotlin.jvm.internal.L.f(this.f90061n, h1Var.f90061n) && kotlin.jvm.internal.L.f(this.f90062o, h1Var.f90062o) && kotlin.jvm.internal.L.f(this.f90063p, h1Var.f90063p) && kotlin.jvm.internal.L.f(this.f90064q, h1Var.f90064q) && kotlin.jvm.internal.L.f(this.f90065r, h1Var.f90065r);
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getEventId */
    public final int getF83080b() {
        return this.f90066s.f90247b;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    @Y61.k
    public final Map<String, Object> getParams() {
        return this.f90066s.f90249d;
    }

    @Override // com.avito.android.analytics.provider.clickstream.a
    /* renamed from: getVersion */
    public final int getF83081c() {
        return this.f90066s.f90248c;
    }

    public final int hashCode() {
        int iD2 = androidx.compose.foundation.H.d(Long.hashCode(this.f90049b) * 31, 31, this.f90050c);
        String str = this.f90051d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f90052e;
        int i12 = androidx.appcompat.app.r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f90053f);
        String str3 = this.f90054g;
        int iHashCode2 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f90055h;
        int iHashCode3 = (iHashCode2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f90056i;
        int iHashCode4 = (iHashCode3 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f90057j;
        int iE2 = androidx.appcompat.app.r.e(this.f90059l, androidx.compose.foundation.H.d((iHashCode4 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f90058k), 31);
        String str7 = this.f90060m;
        int iHashCode5 = (iE2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Boolean bool = this.f90061n;
        int iHashCode6 = (iHashCode5 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str8 = this.f90062o;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f90063p;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f90064q;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f90065r;
        return iHashCode9 + (str11 != null ? str11.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("WantToBuyRequestSuccessEvent(stateId=");
        sb2.append(this.f90049b);
        sb2.append(", advertId=");
        sb2.append(this.f90050c);
        sb2.append(", categoryId=");
        sb2.append(this.f90051d);
        sb2.append(", microCategoryId=");
        sb2.append(this.f90052e);
        sb2.append(", isFromCompany=");
        sb2.append(this.f90053f);
        sb2.append(", metroId=");
        sb2.append(this.f90054g);
        sb2.append(", locationId=");
        sb2.append(this.f90055h);
        sb2.append(", sellerId=");
        sb2.append(this.f90056i);
        sb2.append(", shopId=");
        sb2.append(this.f90057j);
        sb2.append(", source=");
        sb2.append(this.f90058k);
        sb2.append(", fromBlock=");
        sb2.append(this.f90059l);
        sb2.append(", context=");
        sb2.append(this.f90060m);
        sb2.append(", isMultiItemsVariation=");
        sb2.append(this.f90061n);
        sb2.append(", multiItemSource=");
        sb2.append(this.f90062o);
        sb2.append(", multiItemClickParamName=");
        sb2.append(this.f90063p);
        sb2.append(", fromSpace=");
        sb2.append(this.f90064q);
        sb2.append(", fromPage=");
        return C22026a.c(sb2, this.f90065r, ')');
    }

    public /* synthetic */ h1(long j12, String str, String str2, String str3, boolean z12, String str4, String str5, String str6, String str7, String str8, int i12, String str9, Boolean bool, String str10, String str11, String str12, String str13, int i13, C42822w c42822w) {
        this(j12, str, str2, str3, z12, str4, str5, str6, str7, str8, i12, str9, bool, str10, str11, str12, (i13 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : str13);
    }
}
