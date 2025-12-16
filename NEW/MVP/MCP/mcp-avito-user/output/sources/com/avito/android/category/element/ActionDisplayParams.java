package com.avito.android.category.element;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: CategoryWidgetElement.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/category/element/ActionDisplayParams;", "Landroid/os/Parcelable;", "", "showPoint", "<init>", "(Z)V", "Z", "c", "()Z", "_avito_bx-content_widget_category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionDisplayParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ActionDisplayParams> CREATOR = new a();

    @com.google.gson.annotations.c("showPoint")
    private final boolean showPoint;

    /* compiled from: CategoryWidgetElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ActionDisplayParams> {
        @Override // android.os.Parcelable.Creator
        public final ActionDisplayParams createFromParcel(Parcel parcel) {
            return new ActionDisplayParams(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ActionDisplayParams[] newArray(int i12) {
            return new ActionDisplayParams[i12];
        }
    }

    public ActionDisplayParams(boolean z12) {
        this.showPoint = z12;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getShowPoint() {
        return this.showPoint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.showPoint ? 1 : 0);
    }
}
