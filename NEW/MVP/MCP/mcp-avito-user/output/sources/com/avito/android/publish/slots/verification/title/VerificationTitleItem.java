package com.avito.android.publish.slots.verification.title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VerificationTitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/slots/verification/title/VerificationTitleItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class VerificationTitleItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<VerificationTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f245163b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f245164c;

    /* compiled from: VerificationTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VerificationTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final VerificationTitleItem createFromParcel(Parcel parcel) {
            return new VerificationTitleItem(parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final VerificationTitleItem[] newArray(int i12) {
            return new VerificationTitleItem[i12];
        }
    }

    public VerificationTitleItem(@k String str, @k String str2) {
        this.f245163b = str;
        this.f245164c = str2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VerificationTitleItem)) {
            return false;
        }
        VerificationTitleItem verificationTitleItem = (VerificationTitleItem) obj;
        return L.f(this.f245163b, verificationTitleItem.f245163b) && L.f(this.f245164c, verificationTitleItem.f245164c);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF207369c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF245139b() {
        return this.f245163b;
    }

    public final int hashCode() {
        return this.f245164c.hashCode() + (this.f245163b.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerificationTitleItem(stringId=");
        sb2.append(this.f245163b);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f245164c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f245163b);
        parcel.writeString(this.f245164c);
    }
}
