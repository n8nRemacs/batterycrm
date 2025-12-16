package com.avito.android.category.element;

import android.os.Parcel;
import android.os.Parcelable;
import kotlin.Metadata;

/* compiled from: CategoryWidgetElement.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lcom/avito/android/category/element/ItemDisplayParams;", "Landroid/os/Parcelable;", "", "expandedButtonList", "<init>", "(Z)V", "Z", "c", "()Z", "_avito_bx-content_widget_category_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ItemDisplayParams implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<ItemDisplayParams> CREATOR = new a();

    @com.google.gson.annotations.c("expandedButtonList")
    private final boolean expandedButtonList;

    /* compiled from: CategoryWidgetElement.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ItemDisplayParams> {
        @Override // android.os.Parcelable.Creator
        public final ItemDisplayParams createFromParcel(Parcel parcel) {
            return new ItemDisplayParams(parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ItemDisplayParams[] newArray(int i12) {
            return new ItemDisplayParams[i12];
        }
    }

    public ItemDisplayParams(boolean z12) {
        this.expandedButtonList = z12;
    }

    /* renamed from: c, reason: from getter */
    public final boolean getExpandedButtonList() {
        return this.expandedButtonList;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeInt(this.expandedButtonList ? 1 : 0);
    }
}
