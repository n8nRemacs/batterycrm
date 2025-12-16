package eJ0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsListRequest.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LeJ0/a;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: eJ0.a, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final /* data */ class C40014a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f395093a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f395094b;

    /* renamed from: c, reason: collision with root package name */
    public final int f395095c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Boolean f395096d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f395097e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f395098f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Map<String, Object> f395099g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f395100h;

    /* renamed from: i, reason: collision with root package name */
    public final int f395101i;

    public C40014a(@k String str, @l String str2, int i12, @l Boolean bool, @l String str3, @l String str4, @l Map<String, ? extends Object> map, boolean z12, int i13) {
        this.f395093a = str;
        this.f395094b = str2;
        this.f395095c = i12;
        this.f395096d = bool;
        this.f395097e = str3;
        this.f395098f = str4;
        this.f395099g = map;
        this.f395100h = z12;
        this.f395101i = i13;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C40014a)) {
            return false;
        }
        C40014a c40014a = (C40014a) obj;
        return L.f(this.f395093a, c40014a.f395093a) && L.f(this.f395094b, c40014a.f395094b) && this.f395095c == c40014a.f395095c && L.f(this.f395096d, c40014a.f395096d) && L.f(this.f395097e, c40014a.f395097e) && L.f(this.f395098f, c40014a.f395098f) && L.f(this.f395099g, c40014a.f395099g) && this.f395100h == c40014a.f395100h && this.f395101i == c40014a.f395101i;
    }

    public final int hashCode() {
        int iHashCode = this.f395093a.hashCode() * 31;
        String str = this.f395094b;
        int iE2 = r.e(this.f395095c, (iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31);
        Boolean bool = this.f395096d;
        int iHashCode2 = (iE2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.f395097e;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f395098f;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, Object> map = this.f395099g;
        return Integer.hashCode(this.f395101i) + r.i((iHashCode4 + (map != null ? map.hashCode() : 0)) * 31, 31, this.f395100h);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsListRequest(shortcut=");
        sb2.append(this.f395093a);
        sb2.append(", query=");
        sb2.append(this.f395094b);
        sb2.append(", shortcutIndex=");
        sb2.append(this.f395095c);
        sb2.append(", queryByTitle=");
        sb2.append(this.f395096d);
        sb2.append(", segment=");
        sb2.append(this.f395097e);
        sb2.append(", offset=");
        sb2.append(this.f395098f);
        sb2.append(", filterParams=");
        sb2.append(this.f395099g);
        sb2.append(", isPro=");
        sb2.append(this.f395100h);
        sb2.append(", pageIndex=");
        return r.t(sb2, this.f395101i, ')');
    }
}
