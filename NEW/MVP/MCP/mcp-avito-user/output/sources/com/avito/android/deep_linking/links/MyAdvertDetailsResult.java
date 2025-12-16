package com.avito.android.deep_linking.links;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: MyAdvertDetailsLink.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult;", "Landroid/os/Parcelable;", "Activated", "Default", "StatusChanged", "Stopped", "Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult$Activated;", "Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult$Default;", "Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult$StatusChanged;", "Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult$Stopped;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface MyAdvertDetailsResult extends Parcelable {

    /* compiled from: MyAdvertDetailsLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult$Activated;", "Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Activated implements MyAdvertDetailsResult, InterfaceC14249c.b {

        @Y61.k
        public static final Parcelable.Creator<Activated> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f133453b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f133454c;

        /* compiled from: MyAdvertDetailsLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Activated> {
            @Override // android.os.Parcelable.Creator
            public final Activated createFromParcel(Parcel parcel) {
                return new Activated(parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Activated[] newArray(int i12) {
                return new Activated[i12];
            }
        }

        public Activated(@Y61.l String str, @Y61.l String str2) {
            this.f133453b = str;
            this.f133454c = str2;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Activated)) {
                return false;
            }
            Activated activated = (Activated) obj;
            return kotlin.jvm.internal.L.f(this.f133453b, activated.f133453b) && kotlin.jvm.internal.L.f(this.f133454c, activated.f133454c);
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertDetailsResult
        @Y61.l
        /* renamed from: getStatusMessage, reason: from getter */
        public final String getF133457b() {
            return this.f133453b;
        }

        public final int hashCode() {
            String str = this.f133453b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f133454c;
            return iHashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Activated(statusMessage=");
            sb2.append(this.f133453b);
            sb2.append(", categoryId=");
            return C22026a.c(sb2, this.f133454c, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133453b);
            parcel.writeString(this.f133454c);
        }
    }

    /* compiled from: MyAdvertDetailsLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult$Default;", "Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult;", "LJu/c$b;", "<init>", "()V", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Default implements MyAdvertDetailsResult, InterfaceC14249c.b {

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public static final Default f133455b = new Default();

        @Y61.k
        public static final Parcelable.Creator<Default> CREATOR = new a();

        /* compiled from: MyAdvertDetailsLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Default> {
            @Override // android.os.Parcelable.Creator
            public final Default createFromParcel(Parcel parcel) {
                parcel.readInt();
                return Default.f133455b;
            }

            @Override // android.os.Parcelable.Creator
            public final Default[] newArray(int i12) {
                return new Default[i12];
            }
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertDetailsResult
        @Y61.l
        /* renamed from: getStatusMessage */
        public final String getF133457b() {
            return null;
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeInt(1);
        }
    }

    /* compiled from: MyAdvertDetailsLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult$StatusChanged;", "Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class StatusChanged implements MyAdvertDetailsResult, InterfaceC14249c.b {

        @Y61.k
        public static final Parcelable.Creator<StatusChanged> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f133456b;

        /* compiled from: MyAdvertDetailsLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<StatusChanged> {
            @Override // android.os.Parcelable.Creator
            public final StatusChanged createFromParcel(Parcel parcel) {
                return new StatusChanged(parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final StatusChanged[] newArray(int i12) {
                return new StatusChanged[i12];
            }
        }

        public StatusChanged(@Y61.l String str) {
            this.f133456b = str;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof StatusChanged) && kotlin.jvm.internal.L.f(this.f133456b, ((StatusChanged) obj).f133456b);
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertDetailsResult
        @Y61.l
        /* renamed from: getStatusMessage, reason: from getter */
        public final String getF133457b() {
            return this.f133456b;
        }

        public final int hashCode() {
            String str = this.f133456b;
            if (str == null) {
                return 0;
            }
            return str.hashCode();
        }

        @Y61.k
        public final String toString() {
            return C22026a.c(new StringBuilder("StatusChanged(statusMessage="), this.f133456b, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133456b);
        }
    }

    /* compiled from: MyAdvertDetailsLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult$Stopped;", "Lcom/avito/android/deep_linking/links/MyAdvertDetailsResult;", "LJu/c$b;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Stopped implements MyAdvertDetailsResult, InterfaceC14249c.b {

        @Y61.k
        public static final Parcelable.Creator<Stopped> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.l
        public final String f133457b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.l
        public final String f133458c;

        /* renamed from: d, reason: collision with root package name */
        public final boolean f133459d;

        /* renamed from: e, reason: collision with root package name */
        @Y61.l
        public final String f133460e;

        /* renamed from: f, reason: collision with root package name */
        @Y61.l
        public final DeepLink f133461f;

        /* compiled from: MyAdvertDetailsLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Stopped> {
            @Override // android.os.Parcelable.Creator
            public final Stopped createFromParcel(Parcel parcel) {
                return new Stopped((DeepLink) parcel.readParcelable(Stopped.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0);
            }

            @Override // android.os.Parcelable.Creator
            public final Stopped[] newArray(int i12) {
                return new Stopped[i12];
            }
        }

        public Stopped(@Y61.l DeepLink deepLink, @Y61.l String str, @Y61.l String str2, @Y61.l String str3, boolean z12) {
            this.f133457b = str;
            this.f133458c = str2;
            this.f133459d = z12;
            this.f133460e = str3;
            this.f133461f = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Stopped)) {
                return false;
            }
            Stopped stopped = (Stopped) obj;
            return kotlin.jvm.internal.L.f(this.f133457b, stopped.f133457b) && kotlin.jvm.internal.L.f(this.f133458c, stopped.f133458c) && this.f133459d == stopped.f133459d && kotlin.jvm.internal.L.f(this.f133460e, stopped.f133460e) && kotlin.jvm.internal.L.f(this.f133461f, stopped.f133461f);
        }

        @Override // com.avito.android.deep_linking.links.MyAdvertDetailsResult
        @Y61.l
        /* renamed from: getStatusMessage, reason: from getter */
        public final String getF133457b() {
            return this.f133457b;
        }

        public final int hashCode() {
            String str = this.f133457b;
            int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.f133458c;
            int i12 = androidx.appcompat.app.r.i((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f133459d);
            String str3 = this.f133460e;
            int iHashCode2 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
            DeepLink deepLink = this.f133461f;
            return iHashCode2 + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Stopped(statusMessage=");
            sb2.append(this.f133457b);
            sb2.append(", soaAdvertId=");
            sb2.append(this.f133458c);
            sb2.append(", shouldShowAppRater=");
            sb2.append(this.f133459d);
            sb2.append(", soaUpdateText=");
            sb2.append(this.f133460e);
            sb2.append(", deliveryRestriction=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f133461f, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133457b);
            parcel.writeString(this.f133458c);
            parcel.writeInt(this.f133459d ? 1 : 0);
            parcel.writeString(this.f133460e);
            parcel.writeParcelable(this.f133461f, i12);
        }
    }

    @Y61.l
    /* renamed from: getStatusMessage */
    String getF133457b();
}
