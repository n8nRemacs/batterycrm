package com.avito.android.extended_profile_serp.deep_linking;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: ExtendedProfileSerpLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/deep_linking/ExtendedProfileSerpLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_extended-profile-serp_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
@d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileSerpLink extends DeepLink {

    @k
    public static final Parcelable.Creator<ExtendedProfileSerpLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f152651b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f152652c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final SearchParams f152653d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f152654e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ExtendedProfileSerpStartMode f152655f;

    /* compiled from: ExtendedProfileSerpLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileSerpLink> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSerpLink createFromParcel(Parcel parcel) {
            return new ExtendedProfileSerpLink(parcel.readString(), parcel.readString(), (SearchParams) parcel.readParcelable(ExtendedProfileSerpLink.class.getClassLoader()), parcel.readString(), ExtendedProfileSerpStartMode.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSerpLink[] newArray(int i12) {
            return new ExtendedProfileSerpLink[i12];
        }
    }

    public /* synthetic */ ExtendedProfileSerpLink(String str, String str2, SearchParams searchParams, String str3, ExtendedProfileSerpStartMode extendedProfileSerpStartMode, int i12, C42822w c42822w) {
        this(str, str2, searchParams, str3, (i12 & 16) != 0 ? ExtendedProfileSerpStartMode.f152656b : extendedProfileSerpStartMode);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileSerpLink)) {
            return false;
        }
        ExtendedProfileSerpLink extendedProfileSerpLink = (ExtendedProfileSerpLink) obj;
        return L.f(this.f152651b, extendedProfileSerpLink.f152651b) && L.f(this.f152652c, extendedProfileSerpLink.f152652c) && L.f(this.f152653d, extendedProfileSerpLink.f152653d) && L.f(this.f152654e, extendedProfileSerpLink.f152654e) && this.f152655f == extendedProfileSerpLink.f152655f;
    }

    public final int hashCode() {
        int iHashCode = this.f152651b.hashCode() * 31;
        String str = this.f152652c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        SearchParams searchParams = this.f152653d;
        int iHashCode3 = (iHashCode2 + (searchParams == null ? 0 : searchParams.hashCode())) * 31;
        String str2 = this.f152654e;
        return this.f152655f.hashCode() + ((iHashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        return "ExtendedProfileSerpLink(userKey=" + this.f152651b + ", context=" + this.f152652c + ", searchParams=" + this.f152653d + ", source=" + this.f152654e + ", startMode=" + this.f152655f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f152651b);
        parcel.writeString(this.f152652c);
        parcel.writeParcelable(this.f152653d, i12);
        parcel.writeString(this.f152654e);
        parcel.writeString(this.f152655f.name());
    }

    public ExtendedProfileSerpLink(@k String str, @l String str2, @l SearchParams searchParams, @l String str3, @k ExtendedProfileSerpStartMode extendedProfileSerpStartMode) {
        this.f152651b = str;
        this.f152652c = str2;
        this.f152653d = searchParams;
        this.f152654e = str3;
        this.f152655f = extendedProfileSerpStartMode;
    }
}
