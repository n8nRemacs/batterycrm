package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;

/* compiled from: BodyConditionBottomSheetLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\u0004\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0010\u0010\u000f¨\u0006\u0011"}, d2 = {"Lcom/avito/android/deep_linking/links/BodyConditionPoint;", "Lcom/avito/android/deep_linking/links/PointWithPosition;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/Position;", "position", "", "paramsTitle", "paramsValue", "<init>", "(Lcom/avito/android/deep_linking/links/Position;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/deep_linking/links/Position;", "getPosition", "()Lcom/avito/android/deep_linking/links/Position;", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "d", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class BodyConditionPoint implements PointWithPosition, Parcelable {

    @Y61.k
    public static final Parcelable.Creator<BodyConditionPoint> CREATOR = new a();

    @com.google.gson.annotations.c("paramsTitle")
    @Y61.k
    private final String paramsTitle;

    @com.google.gson.annotations.c("paramsValue")
    @Y61.k
    private final String paramsValue;

    @com.google.gson.annotations.c("position")
    @Y61.k
    private final Position position;

    /* compiled from: BodyConditionBottomSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BodyConditionPoint> {
        @Override // android.os.Parcelable.Creator
        public final BodyConditionPoint createFromParcel(Parcel parcel) {
            return new BodyConditionPoint(Position.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BodyConditionPoint[] newArray(int i12) {
            return new BodyConditionPoint[i12];
        }
    }

    public BodyConditionPoint(@Y61.k Position position, @Y61.k String str, @Y61.k String str2) {
        this.position = position;
        this.paramsTitle = str;
        this.paramsValue = str2;
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final String getParamsTitle() {
        return this.paramsTitle;
    }

    @Y61.k
    /* renamed from: d, reason: from getter */
    public final String getParamsValue() {
        return this.paramsValue;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BodyConditionPoint)) {
            return false;
        }
        BodyConditionPoint bodyConditionPoint = (BodyConditionPoint) obj;
        return kotlin.jvm.internal.L.f(this.position, bodyConditionPoint.position) && kotlin.jvm.internal.L.f(this.paramsTitle, bodyConditionPoint.paramsTitle) && kotlin.jvm.internal.L.f(this.paramsValue, bodyConditionPoint.paramsValue);
    }

    @Override // com.avito.android.deep_linking.links.PointWithPosition
    @Y61.k
    public final Position getPosition() {
        return this.position;
    }

    public final int hashCode() {
        return this.paramsValue.hashCode() + androidx.compose.foundation.H.d(this.position.hashCode() * 31, 31, this.paramsTitle);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BodyConditionPoint(position=");
        sb2.append(this.position);
        sb2.append(", paramsTitle=");
        sb2.append(this.paramsTitle);
        sb2.append(", paramsValue=");
        return C22026a.c(sb2, this.paramsValue, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        this.position.writeToParcel(parcel, i12);
        parcel.writeString(this.paramsTitle);
        parcel.writeString(this.paramsValue);
    }
}
