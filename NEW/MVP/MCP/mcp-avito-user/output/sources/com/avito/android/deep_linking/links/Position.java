package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: BodyConditionBottomSheetLink.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/deep_linking/links/Position;", "Landroid/os/Parcelable;", "", "x", "y", "<init>", "(FF)V", "F", "c", "()F", "d", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class Position implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Position> CREATOR = new a();

    @com.google.gson.annotations.c("x")
    private final float x;

    @com.google.gson.annotations.c("y")
    private final float y;

    /* compiled from: BodyConditionBottomSheetLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Position> {
        @Override // android.os.Parcelable.Creator
        public final Position createFromParcel(Parcel parcel) {
            return new Position(parcel.readFloat(), parcel.readFloat());
        }

        @Override // android.os.Parcelable.Creator
        public final Position[] newArray(int i12) {
            return new Position[i12];
        }
    }

    public Position(float f12, float f13) {
        this.x = f12;
        this.y = f13;
    }

    /* renamed from: c, reason: from getter */
    public final float getX() {
        return this.x;
    }

    /* renamed from: d, reason: from getter */
    public final float getY() {
        return this.y;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Position)) {
            return false;
        }
        Position position = (Position) obj;
        return Float.compare(this.x, position.x) == 0 && Float.compare(this.y, position.y) == 0;
    }

    public final int hashCode() {
        return Float.hashCode(this.y) + (Float.hashCode(this.x) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Position(x=");
        sb2.append(this.x);
        sb2.append(", y=");
        return androidx.appcompat.app.r.k(')', this.y, sb2);
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeFloat(this.x);
        parcel.writeFloat(this.y);
    }
}
