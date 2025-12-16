package com.avito.android.deep_linking;

import Ju.InterfaceC14249c;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: RevertRatingsDeletionLink.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/RevertRatingsDeletionLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "b", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class RevertRatingsDeletionLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<RevertRatingsDeletionLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f132872b;

    /* compiled from: RevertRatingsDeletionLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RevertRatingsDeletionLink> {
        @Override // android.os.Parcelable.Creator
        public final RevertRatingsDeletionLink createFromParcel(Parcel parcel) {
            return new RevertRatingsDeletionLink(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final RevertRatingsDeletionLink[] newArray(int i12) {
            return new RevertRatingsDeletionLink[i12];
        }
    }

    /* compiled from: RevertRatingsDeletionLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/deep_linking/RevertRatingsDeletionLink$b;", "", "a", "b", "Lcom/avito/android/deep_linking/RevertRatingsDeletionLink$b$a;", "Lcom/avito/android/deep_linking/RevertRatingsDeletionLink$b$b;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: RevertRatingsDeletionLink.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/deep_linking/RevertRatingsDeletionLink$b$a;", "LJu/c$b;", "Lcom/avito/android/deep_linking/RevertRatingsDeletionLink$b;", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class a implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public final Throwable f132873b;

            public a(@Y61.k Throwable th2) {
                this.f132873b = th2;
            }

            public final boolean equals(@Y61.l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof a) && kotlin.jvm.internal.L.f(this.f132873b, ((a) obj).f132873b);
            }

            public final int hashCode() {
                return this.f132873b.hashCode();
            }

            @Y61.k
            public final String toString() {
                return com.avito.android.advert.item.delivery_suggests.l.t(new StringBuilder("Failure(error="), this.f132873b, ')');
            }
        }

        /* compiled from: RevertRatingsDeletionLink.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/deep_linking/RevertRatingsDeletionLink$b$b;", "LJu/c$b;", "Lcom/avito/android/deep_linking/RevertRatingsDeletionLink$b;", "<init>", "()V", "_avito_rating_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.deep_linking.RevertRatingsDeletionLink$b$b, reason: collision with other inner class name */
        public static final class C3982b implements InterfaceC14249c.b, b {

            /* renamed from: b, reason: collision with root package name */
            @Y61.k
            public static final C3982b f132874b = new C3982b();
        }
    }

    public RevertRatingsDeletionLink(@Y61.k String str) {
        this.f132872b = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RevertRatingsDeletionLink) && kotlin.jvm.internal.L.f(this.f132872b, ((RevertRatingsDeletionLink) obj).f132872b);
    }

    public final int hashCode() {
        return this.f132872b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return C22026a.c(new StringBuilder("RevertRatingsDeletionLink(token="), this.f132872b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f132872b);
    }
}
