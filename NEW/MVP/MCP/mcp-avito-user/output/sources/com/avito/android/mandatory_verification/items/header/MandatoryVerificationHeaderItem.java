package com.avito.android.mandatory_verification.items.header;

import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: MandatoryVerificationHeaderItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mandatory_verification/items/header/MandatoryVerificationHeaderItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_mandatory-verification-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class MandatoryVerificationHeaderItem implements ParcelableItem {

    @Y61.k
    public static final Parcelable.Creator<MandatoryVerificationHeaderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f184648b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f184649c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final AttributedText f184650d;

    /* compiled from: MandatoryVerificationHeaderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<MandatoryVerificationHeaderItem> {
        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationHeaderItem createFromParcel(Parcel parcel) {
            return new MandatoryVerificationHeaderItem(parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(MandatoryVerificationHeaderItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final MandatoryVerificationHeaderItem[] newArray(int i12) {
            return new MandatoryVerificationHeaderItem[i12];
        }
    }

    public MandatoryVerificationHeaderItem(@Y61.k String str, @Y61.k String str2, @Y61.k AttributedText attributedText) {
        this.f184648b = str;
        this.f184649c = str2;
        this.f184650d = attributedText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof MandatoryVerificationHeaderItem)) {
            return false;
        }
        MandatoryVerificationHeaderItem mandatoryVerificationHeaderItem = (MandatoryVerificationHeaderItem) obj;
        return L.f(this.f184648b, mandatoryVerificationHeaderItem.f184648b) && L.f(this.f184649c, mandatoryVerificationHeaderItem.f184649c) && L.f(this.f184650d, mandatoryVerificationHeaderItem.f184650d);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF113526b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF174278d() {
        return this.f184648b;
    }

    public final int hashCode() {
        return this.f184650d.hashCode() + H.d(this.f184648b.hashCode() * 31, 31, this.f184649c);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("MandatoryVerificationHeaderItem(stringId=");
        sb2.append(this.f184648b);
        sb2.append(", title=");
        sb2.append(this.f184649c);
        sb2.append(", description=");
        return com.avito.android.actions_sheet.a.w(sb2, this.f184650d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f184648b);
        parcel.writeString(this.f184649c);
        parcel.writeParcelable(this.f184650d, i12);
    }

    public /* synthetic */ MandatoryVerificationHeaderItem(String str, String str2, AttributedText attributedText, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? MandatoryVerificationHeaderItem.class.getName() : str, str2, attributedText);
    }
}
