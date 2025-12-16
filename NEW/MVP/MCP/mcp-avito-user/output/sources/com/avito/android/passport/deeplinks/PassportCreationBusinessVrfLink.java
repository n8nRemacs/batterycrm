package com.avito.android.passport.deeplinks;

import Ju.InterfaceC14249c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: PassportLinks.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/passport/deeplinks/PassportCreationBusinessVrfLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes15.dex */
public final class PassportCreationBusinessVrfLink extends DeepLink {

    @k
    public static final Parcelable.Creator<PassportCreationBusinessVrfLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f211119b;

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PassportCreationBusinessVrfLink> {
        @Override // android.os.Parcelable.Creator
        public final PassportCreationBusinessVrfLink createFromParcel(Parcel parcel) {
            return new PassportCreationBusinessVrfLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PassportCreationBusinessVrfLink[] newArray(int i12) {
            return new PassportCreationBusinessVrfLink[i12];
        }
    }

    /* compiled from: PassportLinks.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/passport/deeplinks/PassportCreationBusinessVrfLink$b;", "", "a", "b", "Lcom/avito/android/passport/deeplinks/PassportCreationBusinessVrfLink$b$a;", "Lcom/avito/android/passport/deeplinks/PassportCreationBusinessVrfLink$b$b;", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: PassportLinks.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/deeplinks/PassportCreationBusinessVrfLink$b$a;", "Lcom/avito/android/passport/deeplinks/PassportCreationBusinessVrfLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f211120b = new a();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof a);
            }

            public final int hashCode() {
                return 1557256197;
            }

            @k
            public final String toString() {
                return "Cancel";
            }
        }

        /* compiled from: PassportLinks.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\n\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/passport/deeplinks/PassportCreationBusinessVrfLink$b$b;", "Lcom/avito/android/passport/deeplinks/PassportCreationBusinessVrfLink$b;", "LJu/c$b;", "<init>", "()V", "_avito_passport-lib_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.passport.deeplinks.PassportCreationBusinessVrfLink$b$b, reason: collision with other inner class name */
        public static final /* data */ class C6309b implements b, InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C6309b f211121b = new C6309b();

            public final boolean equals(@l Object obj) {
                return this == obj || (obj instanceof C6309b);
            }

            public final int hashCode() {
                return 1398318084;
            }

            @k
            public final String toString() {
                return "Complete";
            }
        }
    }

    public PassportCreationBusinessVrfLink(@k String str) {
        this.f211119b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f211119b);
    }
}
