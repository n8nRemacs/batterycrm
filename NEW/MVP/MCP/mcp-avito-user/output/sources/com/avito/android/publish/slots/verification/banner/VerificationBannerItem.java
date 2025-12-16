package com.avito.android.publish.slots.verification.banner;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.UniversalImage;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationBannerItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/verification/banner/VerificationBannerItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VerificationBannerItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<VerificationBannerItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245148b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UniversalImage f245149c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f245150d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f245151e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f245152f;

    /* compiled from: VerificationBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final VerificationBannerItem createFromParcel(Parcel parcel) {
            return new VerificationBannerItem((UniversalImage) parcel.readParcelable(VerificationBannerItem.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationBannerItem[] newArray(int i12) {
            return new VerificationBannerItem[i12];
        }
    }

    public VerificationBannerItem(@k UniversalImage universalImage, @k String str, @k String str2, @k String str3, @l String str4) {
        this.f245148b = str;
        this.f245149c = universalImage;
        this.f245150d = str2;
        this.f245151e = str3;
        this.f245152f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationBannerItem)) {
            return false;
        }
        VerificationBannerItem verificationBannerItem = (VerificationBannerItem) obj;
        return L.f(this.f245148b, verificationBannerItem.f245148b) && L.f(this.f245149c, verificationBannerItem.f245149c) && L.f(this.f245150d, verificationBannerItem.f245150d) && L.f(this.f245151e, verificationBannerItem.f245151e) && L.f(this.f245152f, verificationBannerItem.f245152f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF76078b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF183828b() {
        return this.f245148b;
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(com.avito.android.actions_sheet.a.a(this.f245148b.hashCode() * 31, 31, this.f245149c), 31, this.f245150d), 31, this.f245151e);
        String str = this.f245152f;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationBannerItem(stringId=");
        sb2.append(this.f245148b);
        sb2.append(", image=");
        sb2.append(this.f245149c);
        sb2.append(", status=");
        sb2.append(this.f245150d);
        sb2.append(", title=");
        sb2.append(this.f245151e);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f245152f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f245148b);
        parcel.writeParcelable(this.f245149c, i12);
        parcel.writeString(this.f245150d);
        parcel.writeString(this.f245151e);
        parcel.writeString(this.f245152f);
    }
}
