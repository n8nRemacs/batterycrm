package BG0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TransactionParams.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LBG0/a;", "", "_avito_universal-transaction_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f1267a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f1268b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f1269c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f1270d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f1271e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f1272f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final String f1273g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f1274h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f1275i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f1276j;

    public a() {
        this(null, null, null, null, null, null, null, null, null, null, 1023, null);
    }

    public static a a(a aVar, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, int i12) {
        String str9 = (i12 & 1) != 0 ? aVar.f1267a : str;
        String str10 = (i12 & 2) != 0 ? aVar.f1268b : str2;
        String str11 = (i12 & 4) != 0 ? aVar.f1269c : str3;
        String str12 = aVar.f1270d;
        String str13 = aVar.f1271e;
        String str14 = (i12 & 32) != 0 ? aVar.f1272f : str4;
        String str15 = (i12 & 64) != 0 ? aVar.f1273g : str5;
        String str16 = (i12 & 128) != 0 ? aVar.f1274h : str6;
        String str17 = (i12 & 256) != 0 ? aVar.f1275i : str7;
        String str18 = (i12 & 512) != 0 ? aVar.f1276j : str8;
        aVar.getClass();
        return new a(str9, str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f1267a, aVar.f1267a) && L.f(this.f1268b, aVar.f1268b) && L.f(this.f1269c, aVar.f1269c) && L.f(this.f1270d, aVar.f1270d) && L.f(this.f1271e, aVar.f1271e) && L.f(this.f1272f, aVar.f1272f) && L.f(this.f1273g, aVar.f1273g) && L.f(this.f1274h, aVar.f1274h) && L.f(this.f1275i, aVar.f1275i) && L.f(this.f1276j, aVar.f1276j);
    }

    public final int hashCode() {
        String str = this.f1267a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f1268b;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f1269c;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f1270d;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f1271e;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f1272f;
        int iHashCode6 = (iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.f1273g;
        int iHashCode7 = (iHashCode6 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f1274h;
        int iHashCode8 = (iHashCode7 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f1275i;
        int iHashCode9 = (iHashCode8 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f1276j;
        return iHashCode9 + (str10 != null ? str10.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TransactionParams(transactionId=");
        sb2.append(this.f1267a);
        sb2.append(", scenario=");
        sb2.append(this.f1268b);
        sb2.append(", namespace=");
        sb2.append(this.f1269c);
        sb2.append(", extra=");
        sb2.append(this.f1270d);
        sb2.append(", eventParams=");
        sb2.append(this.f1271e);
        sb2.append(", templateSlug=");
        sb2.append(this.f1272f);
        sb2.append(", templateVersion=");
        sb2.append(this.f1273g);
        sb2.append(", status=");
        sb2.append(this.f1274h);
        sb2.append(", tagsGroups=");
        sb2.append(this.f1275i);
        sb2.append(", bricksEnv=");
        return C22026a.c(sb2, this.f1276j, ')');
    }

    public a(@l String str, @l String str2, @l String str3, @l String str4, @l String str5, @l String str6, @l String str7, @l String str8, @l String str9, @l String str10) {
        this.f1267a = str;
        this.f1268b = str2;
        this.f1269c = str3;
        this.f1270d = str4;
        this.f1271e = str5;
        this.f1272f = str6;
        this.f1273g = str7;
        this.f1274h = str8;
        this.f1275i = str9;
        this.f1276j = str10;
    }

    public /* synthetic */ a(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, String str10, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : str7, (i12 & 128) != 0 ? null : str8, (i12 & 256) != 0 ? null : str9, (i12 & 512) == 0 ? str10 : null);
    }
}
