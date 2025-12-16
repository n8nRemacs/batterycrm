package com.avito.android.beduin.common.component.select_option.dialog;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.beduin.common.component.select_option.Option;
import com.avito.conveyor_item.ParcelableItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;

/* compiled from: OptionItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/component/select_option/dialog/OptionItem;", "Lcom/avito/conveyor_item/ParcelableItem;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class OptionItem implements ParcelableItem {

    @k
    public static final Parcelable.Creator<OptionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f102477b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f102478c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Option f102479d;

    /* compiled from: OptionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<OptionItem> {
        @Override // android.os.Parcelable.Creator
        public final OptionItem createFromParcel(Parcel parcel) {
            return new OptionItem(parcel.readString(), parcel.readString(), Option.CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final OptionItem[] newArray(int i12) {
            return new OptionItem[i12];
        }
    }

    public OptionItem(@k String str, @l String str2, @k Option option) {
        this.f102477b = str;
        this.f102478c = str2;
        this.f102479d = option;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF94264b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF102477b() {
        return this.f102477b;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f102477b);
        parcel.writeString(this.f102478c);
        this.f102479d.writeToParcel(parcel, i12);
    }
}
