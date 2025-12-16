package com.avito.android.cross_category;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CrossCategoryWidget.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0007\u001a\u0004\b\b\u0010\tR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0007\u001a\u0004\b\n\u0010\t¨\u0006\u000b"}, d2 = {"Lcom/avito/android/cross_category/AnalyticParams;", "Landroid/os/Parcelable;", "", "cId", "crossCategoryId", "<init>", "(Ljava/lang/Integer;Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "c", "()Ljava/lang/Integer;", "d", "_avito_bx-content_widget_cross-category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AnalyticParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<AnalyticParams> CREATOR = new a();

    @com.google.gson.annotations.c("cid")
    @Y61.l
    private final Integer cId;

    @com.google.gson.annotations.c("crossCategoryId")
    @Y61.l
    private final Integer crossCategoryId;

    /* compiled from: CrossCategoryWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AnalyticParams> {
        @Override // android.os.Parcelable.Creator
        public final AnalyticParams createFromParcel(Parcel parcel) {
            return new AnalyticParams(parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0 ? Integer.valueOf(parcel.readInt()) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final AnalyticParams[] newArray(int i12) {
            return new AnalyticParams[i12];
        }
    }

    public AnalyticParams(@Y61.l Integer num, @Y61.l Integer num2) {
        this.cId = num;
        this.crossCategoryId = num2;
    }

    @Y61.l
    /* renamed from: c, reason: from getter */
    public final Integer getCId() {
        return this.cId;
    }

    @Y61.l
    /* renamed from: d, reason: from getter */
    public final Integer getCrossCategoryId() {
        return this.crossCategoryId;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AnalyticParams)) {
            return false;
        }
        AnalyticParams analyticParams = (AnalyticParams) obj;
        return L.f(this.cId, analyticParams.cId) && L.f(this.crossCategoryId, analyticParams.crossCategoryId);
    }

    public final int hashCode() {
        Integer num = this.cId;
        int iHashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.crossCategoryId;
        return iHashCode + (num2 != null ? num2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AnalyticParams(cId=");
        sb2.append(this.cId);
        sb2.append(", crossCategoryId=");
        return com.akita.compose.component.accordion.s.j(sb2, this.crossCategoryId, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Integer num = this.cId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.crossCategoryId;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
    }
}
