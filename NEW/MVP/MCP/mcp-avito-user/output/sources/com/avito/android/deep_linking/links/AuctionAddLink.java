package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: AuctionAddLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionAddLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "<init>", "()V", "Arguments", "a", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class AuctionAddLink extends DeepLink {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f133013b = new a(null);

    @Y61.k
    public static final Parcelable.Creator<AuctionAddLink> CREATOR = new b();

    /* compiled from: AuctionAddLink.kt */
    @K51.d
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionAddLink$Arguments;", "Landroid/os/Parcelable;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Arguments implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<Arguments> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @Y61.k
        public final String f133014b;

        /* renamed from: c, reason: collision with root package name */
        @Y61.k
        public final String f133015c;

        /* renamed from: d, reason: collision with root package name */
        @Y61.k
        public final String f133016d;

        /* compiled from: AuctionAddLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Arguments> {
            @Override // android.os.Parcelable.Creator
            public final Arguments createFromParcel(Parcel parcel) {
                return new Arguments(parcel.readString(), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Arguments[] newArray(int i12) {
                return new Arguments[i12];
            }
        }

        public Arguments(@Y61.k String str, @Y61.k String str2, @Y61.k String str3) {
            this.f133014b = str;
            this.f133015c = str2;
            this.f133016d = str3;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Arguments)) {
                return false;
            }
            Arguments arguments = (Arguments) obj;
            return kotlin.jvm.internal.L.f(this.f133014b, arguments.f133014b) && kotlin.jvm.internal.L.f(this.f133015c, arguments.f133015c) && kotlin.jvm.internal.L.f(this.f133016d, arguments.f133016d);
        }

        public final int hashCode() {
            return this.f133016d.hashCode() + androidx.compose.foundation.H.d(this.f133014b.hashCode() * 31, 31, this.f133015c);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Arguments(draftId=");
            sb2.append(this.f133014b);
            sb2.append(", serializedAttributes=");
            sb2.append(this.f133015c);
            sb2.append(", serializedSlots=");
            return C22026a.c(sb2, this.f133016d, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.f133014b);
            parcel.writeString(this.f133015c);
            parcel.writeString(this.f133016d);
        }
    }

    /* compiled from: AuctionAddLink.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/deep_linking/links/AuctionAddLink$a;", "", "<init>", "()V", "", "PUBLISH_DRAFT_ARGUMENTS_KEY", "Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: AuctionAddLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<AuctionAddLink> {
        @Override // android.os.Parcelable.Creator
        public final AuctionAddLink createFromParcel(Parcel parcel) {
            parcel.readInt();
            return new AuctionAddLink();
        }

        @Override // android.os.Parcelable.Creator
        public final AuctionAddLink[] newArray(int i12) {
            return new AuctionAddLink[i12];
        }
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(1);
    }
}
