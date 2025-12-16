package com.avito.android.advert_core.advert;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.html_formatter.HtmlCharSequence;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AdvertDetailsMeta.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_core/advert/AdvertDetailsMeta;", "Landroid/os/Parcelable;", "_avito_advert-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class AdvertDetailsMeta implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AdvertDetailsMeta> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final HtmlCharSequence f82644b;

    /* compiled from: AdvertDetailsMeta.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdvertDetailsMeta> {
        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsMeta createFromParcel(Parcel parcel) {
            return new AdvertDetailsMeta((HtmlCharSequence) parcel.readParcelable(AdvertDetailsMeta.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertDetailsMeta[] newArray(int i12) {
            return new AdvertDetailsMeta[i12];
        }
    }

    public AdvertDetailsMeta(@Y61.l HtmlCharSequence htmlCharSequence) {
        this.f82644b = htmlCharSequence;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final HtmlCharSequence getF82644b() {
        return this.f82644b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof AdvertDetailsMeta) && L.f(this.f82644b, ((AdvertDetailsMeta) obj).f82644b);
    }

    public final int hashCode() {
        HtmlCharSequence htmlCharSequence = this.f82644b;
        if (htmlCharSequence == null) {
            return 0;
        }
        return htmlCharSequence.hashCode();
    }

    @Y61.k
    public final String toString() {
        return "AdvertDetailsMeta(formattedDescription=" + ((Object) this.f82644b) + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f82644b, i12);
    }
}
