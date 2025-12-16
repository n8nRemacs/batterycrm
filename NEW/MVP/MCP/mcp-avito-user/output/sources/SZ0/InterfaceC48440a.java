package sz0;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerOrdersResponse.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lsz0/a;", "", "a", "b", "Lsz0/a$a;", "Lsz0/a$b;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: sz0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC48440a {

    /* compiled from: StrSellerOrdersResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/a$a;", "Lsz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz0.a$a, reason: collision with other inner class name */
    public static final /* data */ class C12654a implements InterfaceC48440a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final Image f438956a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final DeepLink f438957b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f438958c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AttributedText f438959d;

        /* renamed from: e, reason: collision with root package name */
        @l
        public final Boolean f438960e;

        /* renamed from: f, reason: collision with root package name */
        @k
        public final String f438961f;

        /* renamed from: g, reason: collision with root package name */
        @k
        public final Image f438962g;

        /* renamed from: h, reason: collision with root package name */
        @l
        public final AttributedText f438963h;

        /* renamed from: i, reason: collision with root package name */
        @k
        public final AttributedText f438964i;

        public C12654a(@l Image image, @l DeepLink deepLink, @l AttributedText attributedText, @l AttributedText attributedText2, @l Boolean bool, @k String str, @k Image image2, @l AttributedText attributedText3, @k AttributedText attributedText4) {
            this.f438956a = image;
            this.f438957b = deepLink;
            this.f438958c = attributedText;
            this.f438959d = attributedText2;
            this.f438960e = bool;
            this.f438961f = str;
            this.f438962g = image2;
            this.f438963h = attributedText3;
            this.f438964i = attributedText4;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C12654a)) {
                return false;
            }
            C12654a c12654a = (C12654a) obj;
            return L.f(this.f438956a, c12654a.f438956a) && L.f(this.f438957b, c12654a.f438957b) && L.f(this.f438958c, c12654a.f438958c) && L.f(this.f438959d, c12654a.f438959d) && L.f(this.f438960e, c12654a.f438960e) && L.f(this.f438961f, c12654a.f438961f) && L.f(this.f438962g, c12654a.f438962g) && L.f(this.f438963h, c12654a.f438963h) && L.f(this.f438964i, c12654a.f438964i);
        }

        public final int hashCode() {
            Image image = this.f438956a;
            int iHashCode = (image == null ? 0 : image.hashCode()) * 31;
            DeepLink deepLink = this.f438957b;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            AttributedText attributedText = this.f438958c;
            int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AttributedText attributedText2 = this.f438959d;
            int iHashCode4 = (iHashCode3 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
            Boolean bool = this.f438960e;
            int iG2 = com.avito.android.actions_sheet.a.g(this.f438962g, H.d((iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.f438961f), 31);
            AttributedText attributedText3 = this.f438963h;
            return this.f438964i.hashCode() + ((iG2 + (attributedText3 != null ? attributedText3.hashCode() : 0)) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("BookingInfo(circleImage=");
            sb2.append(this.f438956a);
            sb2.append(", deepLink=");
            sb2.append(this.f438957b);
            sb2.append(", description=");
            sb2.append(this.f438958c);
            sb2.append(", details=");
            sb2.append(this.f438959d);
            sb2.append(", hasAction=");
            sb2.append(this.f438960e);
            sb2.append(", id=");
            sb2.append(this.f438961f);
            sb2.append(", image=");
            sb2.append(this.f438962g);
            sb2.append(", subtitle=");
            sb2.append(this.f438963h);
            sb2.append(", title=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f438964i, ')');
        }
    }

    /* compiled from: StrSellerOrdersResponse.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lsz0/a$b;", "Lsz0/a;", "_avito_str-seller-orders_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: sz0.a$b */
    public static final /* data */ class b implements InterfaceC48440a {

        /* renamed from: a, reason: collision with root package name */
        @l
        public final DeepLink f438965a;

        /* renamed from: b, reason: collision with root package name */
        @l
        public final String f438966b;

        /* renamed from: c, reason: collision with root package name */
        @l
        public final AttributedText f438967c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final AttributedText f438968d;

        public b(@l DeepLink deepLink, @l String str, @l AttributedText attributedText, @l AttributedText attributedText2) {
            this.f438965a = deepLink;
            this.f438966b = str;
            this.f438967c = attributedText;
            this.f438968d = attributedText2;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return L.f(this.f438965a, bVar.f438965a) && L.f(this.f438966b, bVar.f438966b) && L.f(this.f438967c, bVar.f438967c) && L.f(this.f438968d, bVar.f438968d);
        }

        public final int hashCode() {
            DeepLink deepLink = this.f438965a;
            int iHashCode = (deepLink == null ? 0 : deepLink.hashCode()) * 31;
            String str = this.f438966b;
            int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
            AttributedText attributedText = this.f438967c;
            int iHashCode3 = (iHashCode2 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
            AttributedText attributedText2 = this.f438968d;
            return iHashCode3 + (attributedText2 != null ? attributedText2.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("InfoBlock(deepLink=");
            sb2.append(this.f438965a);
            sb2.append(", iconName=");
            sb2.append(this.f438966b);
            sb2.append(", subtitle=");
            sb2.append(this.f438967c);
            sb2.append(", title=");
            return com.avito.android.actions_sheet.a.w(sb2, this.f438968d, ')');
        }
    }
}
