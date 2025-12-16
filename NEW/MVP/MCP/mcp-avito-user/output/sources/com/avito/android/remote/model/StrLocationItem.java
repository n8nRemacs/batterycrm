package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrUxFeedbackInfoResponse.kt */
@d
@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0012\u0010\n\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ(\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000bJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/StrLocationItem;", "Landroid/os/Parcelable;", "", "id", "", "cityName", "<init>", "(Ljava/lang/Long;Ljava/lang/String;)V", "component1", "()Ljava/lang/Long;", "component2", "()Ljava/lang/String;", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/avito/android/remote/model/StrLocationItem;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getId", "Ljava/lang/String;", "getCityName", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrLocationItem implements Parcelable {

    @k
    public static final Parcelable.Creator<StrLocationItem> CREATOR = new Creator();

    @c("name")
    @l
    private final String cityName;

    @c("id")
    @l
    private final Long id;

    /* compiled from: StrUxFeedbackInfoResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrLocationItem> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrLocationItem createFromParcel(@k Parcel parcel) {
            return new StrLocationItem(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrLocationItem[] newArray(int i12) {
            return new StrLocationItem[i12];
        }
    }

    public StrLocationItem(@l Long l12, @l String str) {
        this.id = l12;
        this.cityName = str;
    }

    public static /* synthetic */ StrLocationItem copy$default(StrLocationItem strLocationItem, Long l12, String str, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            l12 = strLocationItem.id;
        }
        if ((i12 & 2) != 0) {
            str = strLocationItem.cityName;
        }
        return strLocationItem.copy(l12, str);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final Long getId() {
        return this.id;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getCityName() {
        return this.cityName;
    }

    @k
    public final StrLocationItem copy(@l Long id2, @l String cityName) {
        return new StrLocationItem(id2, cityName);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrLocationItem)) {
            return false;
        }
        StrLocationItem strLocationItem = (StrLocationItem) other;
        return L.f(this.id, strLocationItem.id) && L.f(this.cityName, strLocationItem.cityName);
    }

    @l
    public final String getCityName() {
        return this.cityName;
    }

    @l
    public final Long getId() {
        return this.id;
    }

    public int hashCode() {
        Long l12 = this.id;
        int iHashCode = (l12 == null ? 0 : l12.hashCode()) * 31;
        String str = this.cityName;
        return iHashCode + (str != null ? str.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("StrLocationItem(id=");
        sb2.append(this.id);
        sb2.append(", cityName=");
        return C22026a.c(sb2, this.cityName, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Long l12 = this.id;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.cityName);
    }
}
