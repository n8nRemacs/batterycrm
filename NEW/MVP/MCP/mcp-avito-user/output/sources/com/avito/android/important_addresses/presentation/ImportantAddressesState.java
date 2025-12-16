package com.avito.android.important_addresses.presentation;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ImportantAddressesState.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0004\u0004\u0005\u0006\u0007B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0004\b\t\n\u000b¨\u0006\f"}, d2 = {"Lcom/avito/android/important_addresses/presentation/ImportantAddressesState;", "Landroid/os/Parcelable;", "<init>", "()V", "ContentWithAddresses", "ContentWithoutAddresses", "Error", "Initial", "Lcom/avito/android/important_addresses/presentation/ImportantAddressesState$ContentWithAddresses;", "Lcom/avito/android/important_addresses/presentation/ImportantAddressesState$ContentWithoutAddresses;", "Lcom/avito/android/important_addresses/presentation/ImportantAddressesState$Error;", "Lcom/avito/android/important_addresses/presentation/ImportantAddressesState$Initial;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public abstract class ImportantAddressesState implements Parcelable {

    /* compiled from: ImportantAddressesState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/presentation/ImportantAddressesState$ContentWithAddresses;", "Lcom/avito/android/important_addresses/presentation/ImportantAddressesState;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentWithAddresses extends ImportantAddressesState {

        @Y61.k
        public static final Parcelable.Creator<ContentWithAddresses> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f169595b;

        /* renamed from: c, reason: collision with root package name */
        public final long f169596c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f169597d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final DeepLink f169598e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.k
        public final List<DestinationInfo> f169599f;

        /* renamed from: g, reason: collision with root package name */
        @Y61.k
        public final Button f169600g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f169601h;

        /* compiled from: ImportantAddressesState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ContentWithAddresses> {
            @Override // android.os.Parcelable.Creator
            public final ContentWithAddresses createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                long j12 = parcel.readLong();
                String string2 = parcel.readString();
                DeepLink deepLink = (DeepLink) parcel.readParcelable(ContentWithAddresses.class.getClassLoader());
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(DestinationInfo.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new ContentWithAddresses(string, j12, string2, deepLink, arrayList, Button.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final ContentWithAddresses[] newArray(int i12) {
                return new ContentWithAddresses[i12];
            }
        }

        public ContentWithAddresses(@Y61.k String str, long j12, @Y61.l String str2, @Y61.l DeepLink deepLink, @Y61.k List<DestinationInfo> list, @Y61.k Button button, boolean z12) {
            super(null);
            this.f169595b = str;
            this.f169596c = j12;
            this.f169597d = str2;
            this.f169598e = deepLink;
            this.f169599f = list;
            this.f169600g = button;
            this.f169601h = z12;
        }

        @Override // com.avito.android.important_addresses.presentation.ImportantAddressesState
        /* renamed from: c, reason: from getter */
        public final long getF169613c() {
            return this.f169596c;
        }

        @Override // com.avito.android.important_addresses.presentation.ImportantAddressesState
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF169612b() {
            return this.f169595b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentWithAddresses)) {
                return false;
            }
            ContentWithAddresses contentWithAddresses = (ContentWithAddresses) obj;
            return L.f(this.f169595b, contentWithAddresses.f169595b) && this.f169596c == contentWithAddresses.f169596c && L.f(this.f169597d, contentWithAddresses.f169597d) && L.f(this.f169598e, contentWithAddresses.f169598e) && L.f(this.f169599f, contentWithAddresses.f169599f) && L.f(this.f169600g, contentWithAddresses.f169600g) && this.f169601h == contentWithAddresses.f169601h;
        }

        public final int hashCode() {
            int iG2 = androidx.appcompat.app.r.g(this.f169595b.hashCode() * 31, 31, this.f169596c);
            String str = this.f169597d;
            int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.f169598e;
            return Boolean.hashCode(this.f169601h) + ((this.f169600g.hashCode() + H.e((iHashCode + (deepLink != null ? deepLink.hashCode() : 0)) * 31, 31, this.f169599f)) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("ContentWithAddresses(xGeoSession=");
            sb2.append(this.f169595b);
            sb2.append(", departureTime=");
            sb2.append(this.f169596c);
            sb2.append(", title=");
            sb2.append(this.f169597d);
            sb2.append(", hintDeepLink=");
            sb2.append(this.f169598e);
            sb2.append(", destinationsInfo=");
            sb2.append(this.f169599f);
            sb2.append(", button=");
            sb2.append(this.f169600g);
            sb2.append(", showTravelTimeSkeletons=");
            return androidx.appcompat.app.r.x(sb2, this.f169601h, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f169595b);
            parcel.writeLong(this.f169596c);
            parcel.writeString(this.f169597d);
            parcel.writeParcelable(this.f169598e, i12);
            Iterator itJ = C0.j(this.f169599f, parcel);
            while (itJ.hasNext()) {
                ((DestinationInfo) itJ.next()).writeToParcel(parcel, i12);
            }
            this.f169600g.writeToParcel(parcel, i12);
            parcel.writeInt(this.f169601h ? 1 : 0);
        }
    }

    /* compiled from: ImportantAddressesState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/presentation/ImportantAddressesState$ContentWithoutAddresses;", "Lcom/avito/android/important_addresses/presentation/ImportantAddressesState;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class ContentWithoutAddresses extends ImportantAddressesState {

        @Y61.k
        public static final Parcelable.Creator<ContentWithoutAddresses> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f169602b;

        /* renamed from: c, reason: collision with root package name */
        public final long f169603c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.l
        public final String f169604d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final DeepLink f169605e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final AttributedText f169606f;

        /* renamed from: g, reason: collision with root package name */
        public final boolean f169607g;

        /* renamed from: h, reason: collision with root package name */
        @Y61.k
        public final Button f169608h;

        /* compiled from: ImportantAddressesState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<ContentWithoutAddresses> {
            @Override // android.os.Parcelable.Creator
            public final ContentWithoutAddresses createFromParcel(Parcel parcel) {
                return new ContentWithoutAddresses(parcel.readString(), parcel.readLong(), parcel.readString(), (DeepLink) parcel.readParcelable(ContentWithoutAddresses.class.getClassLoader()), (AttributedText) parcel.readParcelable(ContentWithoutAddresses.class.getClassLoader()), parcel.readInt() != 0, Button.CREATOR.createFromParcel(parcel));
            }

            @Override // android.os.Parcelable.Creator
            public final ContentWithoutAddresses[] newArray(int i12) {
                return new ContentWithoutAddresses[i12];
            }
        }

        public ContentWithoutAddresses(@Y61.k String str, long j12, @Y61.l String str2, @Y61.l DeepLink deepLink, @Y61.l AttributedText attributedText, boolean z12, @Y61.k Button button) {
            super(null);
            this.f169602b = str;
            this.f169603c = j12;
            this.f169604d = str2;
            this.f169605e = deepLink;
            this.f169606f = attributedText;
            this.f169607g = z12;
            this.f169608h = button;
        }

        @Override // com.avito.android.important_addresses.presentation.ImportantAddressesState
        /* renamed from: c, reason: from getter */
        public final long getF169613c() {
            return this.f169603c;
        }

        @Override // com.avito.android.important_addresses.presentation.ImportantAddressesState
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF169612b() {
            return this.f169602b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof ContentWithoutAddresses)) {
                return false;
            }
            ContentWithoutAddresses contentWithoutAddresses = (ContentWithoutAddresses) obj;
            return L.f(this.f169602b, contentWithoutAddresses.f169602b) && this.f169603c == contentWithoutAddresses.f169603c && L.f(this.f169604d, contentWithoutAddresses.f169604d) && L.f(this.f169605e, contentWithoutAddresses.f169605e) && L.f(this.f169606f, contentWithoutAddresses.f169606f) && this.f169607g == contentWithoutAddresses.f169607g && L.f(this.f169608h, contentWithoutAddresses.f169608h);
        }

        public final int hashCode() {
            int iG2 = androidx.appcompat.app.r.g(this.f169602b.hashCode() * 31, 31, this.f169603c);
            String str = this.f169604d;
            int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
            DeepLink deepLink = this.f169605e;
            int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
            AttributedText attributedText = this.f169606f;
            return this.f169608h.hashCode() + androidx.appcompat.app.r.i((iHashCode2 + (attributedText != null ? attributedText.hashCode() : 0)) * 31, 31, this.f169607g);
        }

        @Y61.k
        public final String toString() {
            return "ContentWithoutAddresses(xGeoSession=" + this.f169602b + ", departureTime=" + this.f169603c + ", title=" + this.f169604d + ", hintDeepLink=" + this.f169605e + ", placeholder=" + this.f169606f + ", showBadge=" + this.f169607g + ", button=" + this.f169608h + ')';
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f169602b);
            parcel.writeLong(this.f169603c);
            parcel.writeString(this.f169604d);
            parcel.writeParcelable(this.f169605e, i12);
            parcel.writeParcelable(this.f169606f, i12);
            parcel.writeInt(this.f169607g ? 1 : 0);
            this.f169608h.writeToParcel(parcel, i12);
        }
    }

    /* compiled from: ImportantAddressesState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/presentation/ImportantAddressesState$Error;", "Lcom/avito/android/important_addresses/presentation/ImportantAddressesState;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Error extends ImportantAddressesState {

        @Y61.k
        public static final Parcelable.Creator<Error> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f169609b;

        /* renamed from: c, reason: collision with root package name */
        public final long f169610c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f169611d;

        /* compiled from: ImportantAddressesState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Error> {
            @Override // android.os.Parcelable.Creator
            public final Error createFromParcel(Parcel parcel) {
                return new Error(parcel.readString(), parcel.readLong(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Error[] newArray(int i12) {
                return new Error[i12];
            }
        }

        public Error(@Y61.k String str, long j12, @Y61.k String str2) {
            super(null);
            this.f169609b = str;
            this.f169610c = j12;
            this.f169611d = str2;
        }

        @Override // com.avito.android.important_addresses.presentation.ImportantAddressesState
        /* renamed from: c, reason: from getter */
        public final long getF169613c() {
            return this.f169610c;
        }

        @Override // com.avito.android.important_addresses.presentation.ImportantAddressesState
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF169612b() {
            return this.f169609b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Error)) {
                return false;
            }
            Error error = (Error) obj;
            return L.f(this.f169609b, error.f169609b) && this.f169610c == error.f169610c && L.f(this.f169611d, error.f169611d);
        }

        public final int hashCode() {
            return this.f169611d.hashCode() + androidx.appcompat.app.r.g(this.f169609b.hashCode() * 31, 31, this.f169610c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Error(xGeoSession=");
            sb2.append(this.f169609b);
            sb2.append(", departureTime=");
            sb2.append(this.f169610c);
            sb2.append(", message=");
            return C22026a.c(sb2, this.f169611d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f169609b);
            parcel.writeLong(this.f169610c);
            parcel.writeString(this.f169611d);
        }
    }

    public /* synthetic */ ImportantAddressesState(C42822w c42822w) {
        this();
    }

    /* renamed from: c */
    public abstract long getF169613c();

    @Y61.k
    /* renamed from: d */
    public abstract String getF169612b();

    /* compiled from: ImportantAddressesState.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/important_addresses/presentation/ImportantAddressesState$Initial;", "Lcom/avito/android/important_addresses/presentation/ImportantAddressesState;", "_avito_important-addresses_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Initial extends ImportantAddressesState {

        @Y61.k
        public static final Parcelable.Creator<Initial> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f169612b;

        /* renamed from: c, reason: collision with root package name */
        public final long f169613c;

        /* renamed from: d, reason: collision with root package name */
        public final int f169614d;

        /* compiled from: ImportantAddressesState.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Initial> {
            @Override // android.os.Parcelable.Creator
            public final Initial createFromParcel(Parcel parcel) {
                return new Initial(parcel.readString(), parcel.readLong(), parcel.readInt());
            }

            @Override // android.os.Parcelable.Creator
            public final Initial[] newArray(int i12) {
                return new Initial[i12];
            }
        }

        public /* synthetic */ Initial(String str, long j12, int i12, int i13, C42822w c42822w) {
            this((i13 & 1) != 0 ? UUID.randomUUID().toString() : str, (i13 & 2) != 0 ? -1L : j12, i12);
        }

        @Override // com.avito.android.important_addresses.presentation.ImportantAddressesState
        /* renamed from: c, reason: from getter */
        public final long getF169613c() {
            return this.f169613c;
        }

        @Override // com.avito.android.important_addresses.presentation.ImportantAddressesState
        @Y61.k
        /* renamed from: d, reason: from getter */
        public final String getF169612b() {
            return this.f169612b;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Initial)) {
                return false;
            }
            Initial initial = (Initial) obj;
            return L.f(this.f169612b, initial.f169612b) && this.f169613c == initial.f169613c && this.f169614d == initial.f169614d;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f169614d) + androidx.appcompat.app.r.g(this.f169612b.hashCode() * 31, 31, this.f169613c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Initial(xGeoSession=");
            sb2.append(this.f169612b);
            sb2.append(", departureTime=");
            sb2.append(this.f169613c);
            sb2.append(", addressesCount=");
            return androidx.appcompat.app.r.t(sb2, this.f169614d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f169612b);
            parcel.writeLong(this.f169613c);
            parcel.writeInt(this.f169614d);
        }

        public Initial(@Y61.k String str, long j12, int i12) {
            super(null);
            this.f169612b = str;
            this.f169613c = j12;
            this.f169614d = i12;
        }
    }

    public ImportantAddressesState() {
    }
}
