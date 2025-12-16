package bz0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.str_booking.network.models.common.Button;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: OrderItem.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lbz0/a;", "Lcom/avito/conveyor_item/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: bz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* data */ class C25738a implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f57579b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f57580c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f57581d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f57582e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f57583f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f57584g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f57585h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f57586i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final DeepLink f57587j;

    /* renamed from: k, reason: collision with root package name */
    @k
    public final List<Button> f57588k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final String f57589l;

    public C25738a(@k String str, @k String str2, @l String str3, @l String str4, @l String str5, @l AttributedText attributedText, @l String str6, @l String str7, @l DeepLink deepLink, @k List<Button> list) {
        this.f57579b = str;
        this.f57580c = str2;
        this.f57581d = str3;
        this.f57582e = str4;
        this.f57583f = str5;
        this.f57584g = attributedText;
        this.f57585h = str6;
        this.f57586i = str7;
        this.f57587j = deepLink;
        this.f57588k = list;
        this.f57589l = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C25738a)) {
            return false;
        }
        C25738a c25738a = (C25738a) obj;
        return L.f(this.f57579b, c25738a.f57579b) && L.f(this.f57580c, c25738a.f57580c) && L.f(this.f57581d, c25738a.f57581d) && L.f(this.f57582e, c25738a.f57582e) && L.f(this.f57583f, c25738a.f57583f) && L.f(this.f57584g, c25738a.f57584g) && L.f(this.f57585h, c25738a.f57585h) && L.f(this.f57586i, c25738a.f57586i) && L.f(this.f57587j, c25738a.f57587j) && L.f(this.f57588k, c25738a.f57588k);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF272342b() {
        return getF244841b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF244841b() {
        return this.f57589l;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f57579b.hashCode() * 31, 31, this.f57580c);
        String str = this.f57581d;
        int iHashCode = (iD2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f57582e;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f57583f;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AttributedText attributedText = this.f57584g;
        int iHashCode4 = (iHashCode3 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str4 = this.f57585h;
        int iHashCode5 = (iHashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f57586i;
        int iHashCode6 = (iHashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        DeepLink deepLink = this.f57587j;
        return this.f57588k.hashCode() + ((iHashCode6 + (deepLink != null ? deepLink.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OrderItem(bookingId=");
        sb2.append(this.f57579b);
        sb2.append(", orderTitle=");
        sb2.append(this.f57580c);
        sb2.append(", orderSubtitle=");
        sb2.append(this.f57581d);
        sb2.append(", estateInfo=");
        sb2.append(this.f57582e);
        sb2.append(", address=");
        sb2.append(this.f57583f);
        sb2.append(", description=");
        sb2.append(this.f57584g);
        sb2.append(", estatePicUrl=");
        sb2.append(this.f57585h);
        sb2.append(", buyerPicUrl=");
        sb2.append(this.f57586i);
        sb2.append(", deeplink=");
        sb2.append(this.f57587j);
        sb2.append(", buttons=");
        return H.p(sb2, this.f57588k, ')');
    }
}
