package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import q50.InterfaceC47204b;

/* compiled from: BodyConditionBottomSheetLink.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/BodyConditionBottomSheetLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes12.dex */
public final class BodyConditionBottomSheetLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<BodyConditionBottomSheetLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final BodyCondition f133054b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f133055c;

    /* compiled from: BodyConditionBottomSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BodyConditionBottomSheetLink> {
        @Override // android.os.Parcelable.Creator
        public final BodyConditionBottomSheetLink createFromParcel(Parcel parcel) {
            return new BodyConditionBottomSheetLink(BodyCondition.CREATOR.createFromParcel(parcel), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BodyConditionBottomSheetLink[] newArray(int i12) {
            return new BodyConditionBottomSheetLink[i12];
        }
    }

    public BodyConditionBottomSheetLink(@Y61.k BodyCondition bodyCondition, @Y61.l String str) {
        this.f133054b = bodyCondition;
        this.f133055c = str;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.f133054b.writeToParcel(parcel, i12);
        parcel.writeString(this.f133055c);
    }

    public /* synthetic */ BodyConditionBottomSheetLink(BodyCondition bodyCondition, String str, int i12, C42822w c42822w) {
        this(bodyCondition, (i12 & 2) != 0 ? null : str);
    }
}
