package og;

import Y61.k;
import Y61.l;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceBlockData.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Log/a;", "", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: og.a, reason: case insensitive filesystem */
/* loaded from: classes11.dex */
public final /* data */ class C44772a {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f419987a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final ArrayList f419988b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final ArrayList f419989c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f419990d;

    public C44772a(@l String str, @l ArrayList arrayList, @l ArrayList arrayList2, @l ArrayList arrayList3) {
        this.f419987a = str;
        this.f419988b = arrayList;
        this.f419989c = arrayList2;
        this.f419990d = arrayList3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C44772a)) {
            return false;
        }
        C44772a c44772a = (C44772a) obj;
        return L.f(this.f419987a, c44772a.f419987a) && this.f419988b.equals(c44772a.f419988b) && L.f(this.f419989c, c44772a.f419989c) && L.f(this.f419990d, c44772a.f419990d);
    }

    public final int hashCode() {
        String str = this.f419987a;
        int iG2 = e.g(this.f419988b, (str == null ? 0 : str.hashCode()) * 31, 31);
        ArrayList arrayList = this.f419989c;
        int iHashCode = (iG2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f419990d;
        return iHashCode + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoFinanceBlockData(title=");
        sb2.append(this.f419987a);
        sb2.append(", features=");
        sb2.append(this.f419988b);
        sb2.append(", onSelect=");
        sb2.append(this.f419989c);
        sb2.append(", onAppear=");
        return e.p(sb2, this.f419990d, ')');
    }
}
