package com.avito.android.extended_profile_serp;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.extended_profile_serp.deep_linking.ExtendedProfileSerpStartMode;
import com.avito.android.remote.model.SearchParams;
import kotlin.Metadata;

/* compiled from: ExtendedProfileSerpConfig.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/extended_profile_serp/ExtendedProfileSerpConfig;", "Landroid/os/Parcelable;", "_avito_extended-profile-serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class ExtendedProfileSerpConfig implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ExtendedProfileSerpConfig> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f152442b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f152443c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final SearchParams f152444d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f152445e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f152446f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final ExtendedProfileSerpStartMode f152447g;

    /* compiled from: ExtendedProfileSerpConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExtendedProfileSerpConfig> {
        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSerpConfig createFromParcel(Parcel parcel) {
            return new ExtendedProfileSerpConfig(parcel.readString(), parcel.readString(), (SearchParams) parcel.readParcelable(ExtendedProfileSerpConfig.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, ExtendedProfileSerpStartMode.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ExtendedProfileSerpConfig[] newArray(int i12) {
            return new ExtendedProfileSerpConfig[i12];
        }
    }

    public ExtendedProfileSerpConfig(@Y61.k String str, @Y61.l String str2, @Y61.k SearchParams searchParams, @Y61.l String str3, boolean z12, @Y61.k ExtendedProfileSerpStartMode extendedProfileSerpStartMode) {
        this.f152442b = str;
        this.f152443c = str2;
        this.f152444d = searchParams;
        this.f152445e = str3;
        this.f152446f = z12;
        this.f152447g = extendedProfileSerpStartMode;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExtendedProfileSerpConfig)) {
            return false;
        }
        ExtendedProfileSerpConfig extendedProfileSerpConfig = (ExtendedProfileSerpConfig) obj;
        return kotlin.jvm.internal.L.f(this.f152442b, extendedProfileSerpConfig.f152442b) && kotlin.jvm.internal.L.f(this.f152443c, extendedProfileSerpConfig.f152443c) && kotlin.jvm.internal.L.f(this.f152444d, extendedProfileSerpConfig.f152444d) && kotlin.jvm.internal.L.f(this.f152445e, extendedProfileSerpConfig.f152445e) && this.f152446f == extendedProfileSerpConfig.f152446f && this.f152447g == extendedProfileSerpConfig.f152447g;
    }

    public final int hashCode() {
        int iHashCode = this.f152442b.hashCode() * 31;
        String str = this.f152443c;
        int iHashCode2 = (this.f152444d.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
        String str2 = this.f152445e;
        return this.f152447g.hashCode() + androidx.appcompat.app.r.i((iHashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.f152446f);
    }

    @Y61.k
    public final String toString() {
        return "ExtendedProfileSerpConfig(userKey=" + this.f152442b + ", context=" + this.f152443c + ", searchParams=" + this.f152444d + ", source=" + this.f152445e + ", skipBackToProfile=" + this.f152446f + ", startMode=" + this.f152447g + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f152442b);
        parcel.writeString(this.f152443c);
        parcel.writeParcelable(this.f152444d, i12);
        parcel.writeString(this.f152445e);
        parcel.writeInt(this.f152446f ? 1 : 0);
        parcel.writeString(this.f152447g.name());
    }
}
