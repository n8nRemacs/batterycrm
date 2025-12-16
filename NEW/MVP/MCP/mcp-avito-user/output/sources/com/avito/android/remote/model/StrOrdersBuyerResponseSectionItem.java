package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrOrdersBuyerResponse.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItem;", "Landroid/os/Parcelable;", "", "id", "Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValue;", "value", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValue;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValue;", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValue;)Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Lcom/avito/android/remote/model/StrOrdersBuyerResponseSectionItemValue;", "getValue", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrOrdersBuyerResponseSectionItem implements Parcelable {

    @k
    public static final Parcelable.Creator<StrOrdersBuyerResponseSectionItem> CREATOR = new Creator();

    @c("id")
    @l
    private final String id;

    @c("value")
    @l
    private final StrOrdersBuyerResponseSectionItemValue value;

    /* compiled from: StrOrdersBuyerResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrOrdersBuyerResponseSectionItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersBuyerResponseSectionItem createFromParcel(@k Parcel parcel) {
            return new StrOrdersBuyerResponseSectionItem(parcel.readString(), parcel.readInt() == 0 ? null : StrOrdersBuyerResponseSectionItemValue.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrOrdersBuyerResponseSectionItem[] newArray(int i12) {
            return new StrOrdersBuyerResponseSectionItem[i12];
        }
    }

    public StrOrdersBuyerResponseSectionItem(@l String str, @l StrOrdersBuyerResponseSectionItemValue strOrdersBuyerResponseSectionItemValue) {
        this.id = str;
        this.value = strOrdersBuyerResponseSectionItemValue;
    }

    public static /* synthetic */ StrOrdersBuyerResponseSectionItem copy$default(StrOrdersBuyerResponseSectionItem strOrdersBuyerResponseSectionItem, String str, StrOrdersBuyerResponseSectionItemValue strOrdersBuyerResponseSectionItemValue, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strOrdersBuyerResponseSectionItem.id;
        }
        if ((i12 & 2) != 0) {
            strOrdersBuyerResponseSectionItemValue = strOrdersBuyerResponseSectionItem.value;
        }
        return strOrdersBuyerResponseSectionItem.copy(str, strOrdersBuyerResponseSectionItemValue);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final StrOrdersBuyerResponseSectionItemValue getValue() {
        return this.value;
    }

    @k
    public final StrOrdersBuyerResponseSectionItem copy(@l String id2, @l StrOrdersBuyerResponseSectionItemValue value) {
        return new StrOrdersBuyerResponseSectionItem(id2, value);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrOrdersBuyerResponseSectionItem)) {
            return false;
        }
        StrOrdersBuyerResponseSectionItem strOrdersBuyerResponseSectionItem = (StrOrdersBuyerResponseSectionItem) other;
        return L.f(this.id, strOrdersBuyerResponseSectionItem.id) && L.f(this.value, strOrdersBuyerResponseSectionItem.value);
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final StrOrdersBuyerResponseSectionItemValue getValue() {
        return this.value;
    }

    public int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        StrOrdersBuyerResponseSectionItemValue strOrdersBuyerResponseSectionItemValue = this.value;
        return iHashCode + (strOrdersBuyerResponseSectionItemValue != null ? strOrdersBuyerResponseSectionItemValue.hashCode() : 0);
    }

    @k
    public String toString() {
        return "StrOrdersBuyerResponseSectionItem(id=" + this.id + ", value=" + this.value + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        StrOrdersBuyerResponseSectionItemValue strOrdersBuyerResponseSectionItemValue = this.value;
        if (strOrdersBuyerResponseSectionItemValue == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            strOrdersBuyerResponseSectionItemValue.writeToParcel(parcel, flags);
        }
    }
}
