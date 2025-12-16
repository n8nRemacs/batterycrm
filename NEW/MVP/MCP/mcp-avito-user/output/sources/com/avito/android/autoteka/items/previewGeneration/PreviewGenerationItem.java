package com.avito.android.autoteka.items.previewGeneration;

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

/* compiled from: PreviewGenerationItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/autoteka/items/previewGeneration/PreviewGenerationItem;", "Lcom/avito/android/autoteka/helpers/AutotekaItem;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class PreviewGenerationItem implements AutotekaItem {

    @k
    public static final Parcelable.Creator<PreviewGenerationItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f96915b;

    /* compiled from: PreviewGenerationItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PreviewGenerationItem> {
        @Override // android.os.Parcelable.Creator
        public final PreviewGenerationItem createFromParcel(Parcel parcel) {
            return new PreviewGenerationItem(parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final PreviewGenerationItem[] newArray(int i12) {
            return new PreviewGenerationItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PreviewGenerationItem() {
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
        return (obj instanceof PreviewGenerationItem) && L.f(this.f96915b, ((PreviewGenerationItem) obj).f96915b);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF96766b() {
        return this.f96915b;
    }

    public final int hashCode() {
        return this.f96915b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("PreviewGenerationItem(stringId="), this.f96915b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f96915b);
    }

    public PreviewGenerationItem(@k String str) {
        this.f96915b = str;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ PreviewGenerationItem(String str, int i12, C42822w c42822w) {
        if ((i12 & 1) != 0) {
            AutotekaItems[] autotekaItemsArr = AutotekaItems.f96627b;
            str = "ITEM_PREVIEW_GENERATION";
        }
        this(str);
    }
}
