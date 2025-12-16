package com.avito.android.mortgage.landing.list.items.steps;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StepsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/steps/StepsItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class StepsItem implements LandingItem {

    @k
    public static final Parcelable.Creator<StepsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f199973b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f199974c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final UniversalImage f199975d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f199976e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final UniversalImage f199977f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f199978g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f199979h;

    /* compiled from: StepsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StepsItem> {
        @Override // android.os.Parcelable.Creator
        public final StepsItem createFromParcel(Parcel parcel) {
            return new StepsItem(parcel.readString(), (AttributedText) parcel.readParcelable(StepsItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(StepsItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(StepsItem.class.getClassLoader()), (UniversalImage) parcel.readParcelable(StepsItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StepsItem[] newArray(int i12) {
            return new StepsItem[i12];
        }
    }

    public StepsItem(@k String str, @k AttributedText attributedText, @l UniversalImage universalImage, @l UniversalImage universalImage2, @l UniversalImage universalImage3, boolean z12, boolean z13) {
        this.f199973b = str;
        this.f199974c = attributedText;
        this.f199975d = universalImage;
        this.f199976e = universalImage2;
        this.f199977f = universalImage3;
        this.f199978g = z12;
        this.f199979h = z13;
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    public final LandingItem N() {
        return new StepsItem(this.f199973b, this.f199974c, this.f199975d, this.f199976e, this.f199977f, this.f199978g, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepsItem)) {
            return false;
        }
        StepsItem stepsItem = (StepsItem) obj;
        return L.f(this.f199973b, stepsItem.f199973b) && L.f(this.f199974c, stepsItem.f199974c) && L.f(this.f199975d, stepsItem.f199975d) && L.f(this.f199976e, stepsItem.f199976e) && L.f(this.f199977f, stepsItem.f199977f) && this.f199978g == stepsItem.f199978g && this.f199979h == stepsItem.f199979h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80368b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF173917b() {
        return this.f199973b;
    }

    public final int hashCode() {
        int iB2 = com.avito.android.actions_sheet.a.b(this.f199973b.hashCode() * 31, 31, this.f199974c);
        UniversalImage universalImage = this.f199975d;
        int iHashCode = (iB2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        UniversalImage universalImage2 = this.f199976e;
        int iHashCode2 = (iHashCode + (universalImage2 == null ? 0 : universalImage2.hashCode())) * 31;
        UniversalImage universalImage3 = this.f199977f;
        return Boolean.hashCode(this.f199979h) + r.i((iHashCode2 + (universalImage3 != null ? universalImage3.hashCode() : 0)) * 31, 31, this.f199978g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepsItem(stringId=");
        sb2.append(this.f199973b);
        sb2.append(", text=");
        sb2.append(this.f199974c);
        sb2.append(", topImage=");
        sb2.append(this.f199975d);
        sb2.append(", smallBottomImage=");
        sb2.append(this.f199976e);
        sb2.append(", bigBottomImage=");
        sb2.append(this.f199977f);
        sb2.append(", showBackground=");
        sb2.append(this.f199978g);
        sb2.append(", isEnabled=");
        return r.x(sb2, this.f199979h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f199973b);
        parcel.writeParcelable(this.f199974c, i12);
        parcel.writeParcelable(this.f199975d, i12);
        parcel.writeParcelable(this.f199976e, i12);
        parcel.writeParcelable(this.f199977f, i12);
        parcel.writeInt(this.f199978g ? 1 : 0);
        parcel.writeInt(this.f199979h ? 1 : 0);
    }

    public /* synthetic */ StepsItem(String str, AttributedText attributedText, UniversalImage universalImage, UniversalImage universalImage2, UniversalImage universalImage3, boolean z12, boolean z13, int i12, C42822w c42822w) {
        this(str, attributedText, universalImage, universalImage2, universalImage3, z12, (i12 & 64) != 0 ? true : z13);
    }
}
