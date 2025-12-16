package com.avito.android.early_access.adapter.description;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.text.C22602e;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: EarlyAccessDescriptionItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/early_access/adapter/description/EarlyAccessDescriptionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_early-access_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EarlyAccessDescriptionItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<EarlyAccessDescriptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f145126b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final C22602e f145127c;

    /* compiled from: EarlyAccessDescriptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<EarlyAccessDescriptionItem> {
        @Override // android.os.Parcelable.Creator
        public final EarlyAccessDescriptionItem createFromParcel(Parcel parcel) {
            return new EarlyAccessDescriptionItem(parcel.readString(), (C22602e) parcel.readValue(EarlyAccessDescriptionItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final EarlyAccessDescriptionItem[] newArray(int i12) {
            return new EarlyAccessDescriptionItem[i12];
        }
    }

    public EarlyAccessDescriptionItem(@k String str, @k C22602e c22602e) {
        this.f145126b = str;
        this.f145127c = c22602e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79541k() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145126b() {
        return this.f145126b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f145126b);
        parcel.writeValue(this.f145127c);
    }

    public /* synthetic */ EarlyAccessDescriptionItem(String str, C22602e c22602e, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? EarlyAccessDescriptionItem.class.getName() : str, c22602e);
    }
}
