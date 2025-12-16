package Av0;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.UniversalImage;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ServiceTransportationCardSelectItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LAv0/d;", "", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: Av0.d, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* data */ class C13088d {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f679a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f680b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f681c;

    /* renamed from: d, reason: collision with root package name */
    public final long f682d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f683e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Long f684f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f685g;

    public C13088d(@l String str, @l String str2, @k String str3, long j12, @l UniversalImage universalImage, @l Long l12, boolean z12) {
        this.f679a = str;
        this.f680b = str2;
        this.f681c = str3;
        this.f682d = j12;
        this.f683e = universalImage;
        this.f684f = l12;
        this.f685g = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13088d)) {
            return false;
        }
        C13088d c13088d = (C13088d) obj;
        return L.f(this.f679a, c13088d.f679a) && L.f(this.f680b, c13088d.f680b) && L.f(this.f681c, c13088d.f681c) && this.f682d == c13088d.f682d && L.f(this.f683e, c13088d.f683e) && L.f(this.f684f, c13088d.f684f) && this.f685g == c13088d.f685g;
    }

    public final int hashCode() {
        String str = this.f679a;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f680b;
        int iG2 = r.g(H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f681c), 31, this.f682d);
        UniversalImage universalImage = this.f683e;
        int iHashCode2 = (iG2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        Long l12 = this.f684f;
        return Boolean.hashCode(this.f685g) + ((iHashCode2 + (l12 != null ? l12.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceTransportationCardSelectItem(title=");
        sb2.append(this.f679a);
        sb2.append(", description=");
        sb2.append(this.f680b);
        sb2.append(", label=");
        sb2.append(this.f681c);
        sb2.append(", valueId=");
        sb2.append(this.f682d);
        sb2.append(", image=");
        sb2.append(this.f683e);
        sb2.append(", imageMaxHeight=");
        sb2.append(this.f684f);
        sb2.append(", isSelected=");
        return r.x(sb2, this.f685g, ')');
    }
}
