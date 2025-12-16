package com.avito.android.favorites.link;

import Ju.InterfaceC14249c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: GetSimilarPushLink.kt */
@P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/link/GetSimilarPushLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "Landroid/os/Parcelable;", "b", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class GetSimilarPushLink extends DeepLink implements Parcelable {

    @k
    public static final Parcelable.Creator<GetSimilarPushLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f157384b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final Long f157385c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Long f157386d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f157387e;

    /* compiled from: GetSimilarPushLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GetSimilarPushLink> {
        @Override // android.os.Parcelable.Creator
        public final GetSimilarPushLink createFromParcel(Parcel parcel) {
            return new GetSimilarPushLink(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? Long.valueOf(parcel.readLong()) : null, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GetSimilarPushLink[] newArray(int i12) {
            return new GetSimilarPushLink[i12];
        }
    }

    /* compiled from: GetSimilarPushLink.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/link/GetSimilarPushLink$b;", "", "a", "b", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface b {

        /* compiled from: GetSimilarPushLink.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/link/GetSimilarPushLink$b$a;", "LJu/c$b;", "<init>", "()V", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class a implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final a f157388b = new a();
        }

        /* compiled from: GetSimilarPushLink.kt */
        @P
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/favorites/link/GetSimilarPushLink$b$b;", "LJu/c$b;", "<init>", "()V", "_avito_favorites_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.favorites.link.GetSimilarPushLink$b$b, reason: collision with other inner class name */
        public static final class C4603b implements InterfaceC14249c.b {

            /* renamed from: b, reason: collision with root package name */
            @k
            public static final C4603b f157389b = new C4603b();
        }
    }

    public GetSimilarPushLink(@l Long l12, @k String str, @l Long l13, @l String str2) {
        this.f157384b = str;
        this.f157385c = l12;
        this.f157386d = l13;
        this.f157387e = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetSimilarPushLink)) {
            return false;
        }
        GetSimilarPushLink getSimilarPushLink = (GetSimilarPushLink) obj;
        return L.f(this.f157384b, getSimilarPushLink.f157384b) && L.f(this.f157385c, getSimilarPushLink.f157385c) && L.f(this.f157386d, getSimilarPushLink.f157386d) && L.f(this.f157387e, getSimilarPushLink.f157387e);
    }

    public final int hashCode() {
        int iHashCode = this.f157384b.hashCode() * 31;
        Long l12 = this.f157385c;
        int iHashCode2 = (iHashCode + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.f157386d;
        int iHashCode3 = (iHashCode2 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str = this.f157387e;
        return iHashCode3 + (str != null ? str.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GetSimilarPushLink(itemId=");
        sb2.append(this.f157384b);
        sb2.append(", categoryId=");
        sb2.append(this.f157385c);
        sb2.append(", microCategoryId=");
        sb2.append(this.f157386d);
        sb2.append(", src=");
        return C22026a.c(sb2, this.f157387e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f157384b);
        Long l12 = this.f157385c;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.f157386d;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        parcel.writeString(this.f157387e);
    }
}
