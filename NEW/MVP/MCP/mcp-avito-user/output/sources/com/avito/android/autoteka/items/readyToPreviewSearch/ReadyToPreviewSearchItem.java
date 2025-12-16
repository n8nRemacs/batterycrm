package com.avito.android.autoteka.items.readyToPreviewSearch;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.avito.android.autoteka.domain.AutotekaItems;
import com.avito.android.autoteka.helpers.AutotekaItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ReadyToPreviewSearchItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/readyToPreviewSearch/ReadyToPreviewSearchItem;", "Lcom/avito/android/autoteka/helpers/AutotekaItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ReadyToPreviewSearchItem implements AutotekaItem {

    @k
    public static final Parcelable.Creator<ReadyToPreviewSearchItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96952b;

    /* compiled from: ReadyToPreviewSearchItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ReadyToPreviewSearchItem> {
        @Override // android.os.Parcelable.Creator
        public final ReadyToPreviewSearchItem createFromParcel(Parcel parcel) {
            return new ReadyToPreviewSearchItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ReadyToPreviewSearchItem[] newArray(int i12) {
            return new ReadyToPreviewSearchItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ReadyToPreviewSearchItem() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof ReadyToPreviewSearchItem) && L.f(this.f96952b, ((ReadyToPreviewSearchItem) obj).f96952b);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96825b() {
        return this.f96952b;
    }

    public final int hashCode() {
        return this.f96952b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("ReadyToPreviewSearchItem(stringId="), this.f96952b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f96952b);
    }

    public ReadyToPreviewSearchItem(@k String str) {
        this.f96952b = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ ReadyToPreviewSearchItem(String str, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_READY_TO_PREVIEW_SEARCH";
        }
        this(str);
    }
}
