package uB0;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.deep_linking.links.DeepLink;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TariffCpxInfoCardContentTextItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LuB0/f;", "", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: uB0.f, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C48878f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f439851a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final AbstractC48879g f439852b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final C48880h f439853c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final wZ.k f439854d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final DeepLink f439855e;

    public C48878f(@k String str, @k AbstractC48879g abstractC48879g, @l C48880h c48880h, @l wZ.k kVar, @l DeepLink deepLink) {
        this.f439851a = str;
        this.f439852b = abstractC48879g;
        this.f439853c = c48880h;
        this.f439854d = kVar;
        this.f439855e = deepLink;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48878f)) {
            return false;
        }
        C48878f c48878f = (C48878f) obj;
        return L.f(this.f439851a, c48878f.f439851a) && L.f(this.f439852b, c48878f.f439852b) && L.f(this.f439853c, c48878f.f439853c) && L.f(this.f439854d, c48878f.f439854d) && L.f(this.f439855e, c48878f.f439855e);
    }

    public final int hashCode() {
        int iHashCode = (this.f439852b.hashCode() + (this.f439851a.hashCode() * 31)) * 31;
        C48880h c48880h = this.f439853c;
        int iHashCode2 = (iHashCode + (c48880h == null ? 0 : c48880h.hashCode())) * 31;
        wZ.k kVar = this.f439854d;
        int iHashCode3 = (iHashCode2 + (kVar == null ? 0 : kVar.hashCode())) * 31;
        DeepLink deepLink = this.f439855e;
        return iHashCode3 + (deepLink != null ? deepLink.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TariffCpxInfoItemIcon(iconName=");
        sb2.append(this.f439851a);
        sb2.append(", align=");
        sb2.append(this.f439852b);
        sb2.append(", padding=");
        sb2.append(this.f439853c);
        sb2.append(", color=");
        sb2.append(this.f439854d);
        sb2.append(", deepLink=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f439855e, ')');
    }
}
