package navigation;

import Ju.InterfaceC14247a;
import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TravelGuestProfileLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lnavigation/TravelGuestProfileLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_travel-guest-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes8.dex */
public final /* data */ class TravelGuestProfileLink extends DeepLink {

    @k
    public static final Parcelable.Creator<TravelGuestProfileLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f415185b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f415186c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f415187d;

    /* compiled from: TravelGuestProfileLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TravelGuestProfileLink> {
        @Override // android.os.Parcelable.Creator
        public final TravelGuestProfileLink createFromParcel(Parcel parcel) {
            return new TravelGuestProfileLink(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TravelGuestProfileLink[] newArray(int i12) {
            return new TravelGuestProfileLink[i12];
        }
    }

    /* compiled from: TravelGuestProfileLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lnavigation/TravelGuestProfileLink$b;", "LJu/c$b;", "<init>", "()V", "a", "b", "Lnavigation/TravelGuestProfileLink$b$a;", "Lnavigation/TravelGuestProfileLink$b$b;", "_avito_travel-guest-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static abstract class b implements InterfaceC14249c.b {

        /* compiled from: TravelGuestProfileLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnavigation/TravelGuestProfileLink$b$a;", "LJu/a$a;", "Lnavigation/TravelGuestProfileLink$b;", "<init>", "()V", "_avito_travel-guest-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a extends b implements InterfaceC14247a.InterfaceC0545a {
            static {
                new a();
            }

            public a() {
                super(null);
            }
        }

        /* compiled from: TravelGuestProfileLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lnavigation/TravelGuestProfileLink$b$b;", "LJu/a$b;", "Lnavigation/TravelGuestProfileLink$b;", "<init>", "()V", "_avito_travel-guest-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: navigation.TravelGuestProfileLink$b$b, reason: collision with other inner class name */
        public static final class C11862b extends b implements InterfaceC14247a.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C11862b f415188b = new C11862b();

            public C11862b() {
                super(null);
            }
        }

        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    public TravelGuestProfileLink(@k String str, @l String str2, @l String str3) {
        this.f415185b = str;
        this.f415186c = str2;
        this.f415187d = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TravelGuestProfileLink)) {
            return false;
        }
        TravelGuestProfileLink travelGuestProfileLink = (TravelGuestProfileLink) obj;
        return L.f(this.f415185b, travelGuestProfileLink.f415185b) && L.f(this.f415186c, travelGuestProfileLink.f415186c) && L.f(this.f415187d, travelGuestProfileLink.f415187d);
    }

    public final int hashCode() {
        int iHashCode = this.f415185b.hashCode() * 31;
        String str = this.f415186c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f415187d;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TravelGuestProfileLink(userKey=");
        sb2.append(this.f415185b);
        sb2.append(", context=");
        sb2.append(this.f415186c);
        sb2.append(", bookingId=");
        return C22026a.c(sb2, this.f415187d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f415185b);
        parcel.writeString(this.f415186c);
        parcel.writeString(this.f415187d);
    }
}
