package com.avito.android.deep_linking;

import Hu.InterfaceC14033a;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import kotlin.Metadata;
import q50.InterfaceC47204b;

/* compiled from: RemoveActionDeeplink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/RemoveActionDeeplink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_avito-api_profile"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC14033a
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final /* data */ class RemoveActionDeeplink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<RemoveActionDeeplink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final boolean f132865b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f132866c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final RemovalOnboardingBottomSheetData f132867d;

    /* compiled from: RemoveActionDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RemoveActionDeeplink> {
        @Override // android.os.Parcelable.Creator
        public final RemoveActionDeeplink createFromParcel(Parcel parcel) {
            return new RemoveActionDeeplink(parcel.readInt() != 0, (DeepLink) parcel.readParcelable(RemoveActionDeeplink.class.getClassLoader()), parcel.readInt() == 0 ? null : RemovalOnboardingBottomSheetData.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RemoveActionDeeplink[] newArray(int i12) {
            return new RemoveActionDeeplink[i12];
        }
    }

    public RemoveActionDeeplink(boolean z12, @Y61.l DeepLink deepLink, @Y61.l RemovalOnboardingBottomSheetData removalOnboardingBottomSheetData) {
        this.f132865b = z12;
        this.f132866c = deepLink;
        this.f132867d = removalOnboardingBottomSheetData;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof RemoveActionDeeplink)) {
            return false;
        }
        RemoveActionDeeplink removeActionDeeplink = (RemoveActionDeeplink) obj;
        return this.f132865b == removeActionDeeplink.f132865b && kotlin.jvm.internal.L.f(this.f132866c, removeActionDeeplink.f132866c) && kotlin.jvm.internal.L.f(this.f132867d, removeActionDeeplink.f132867d);
    }

    public final int hashCode() {
        int iHashCode = Boolean.hashCode(this.f132865b) * 31;
        DeepLink deepLink = this.f132866c;
        int iHashCode2 = (iHashCode + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        RemovalOnboardingBottomSheetData removalOnboardingBottomSheetData = this.f132867d;
        return iHashCode2 + (removalOnboardingBottomSheetData != null ? removalOnboardingBottomSheetData.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "RemoveActionDeeplink(hasPassword=" + this.f132865b + ", restoreDeeplink=" + this.f132866c + ", removeOnboardingBottomSheetData=" + this.f132867d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.f132865b ? 1 : 0);
        parcel.writeParcelable(this.f132866c, i12);
        RemovalOnboardingBottomSheetData removalOnboardingBottomSheetData = this.f132867d;
        if (removalOnboardingBottomSheetData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            removalOnboardingBottomSheetData.writeToParcel(parcel, i12);
        }
    }
}
