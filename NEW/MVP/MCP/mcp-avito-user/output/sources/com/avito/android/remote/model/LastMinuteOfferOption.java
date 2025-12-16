package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: StrSellerCalendarLastMinuteOfferResponse.kt */
@d
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÆ\u0003¢\u0006\u0004\b\u000e\u0010\u000fJ.\u0010\u0010\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u0006HÆ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u0012\u0010\rJ\u0010\u0010\u0013\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0013\u0010\u000bJ\u001a\u0010\u0016\u001a\u00020\u00062\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u000bJ \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010\rR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010#\u001a\u0004\b\u0007\u0010\u000f¨\u0006$"}, d2 = {"Lcom/avito/android/remote/model/LastMinuteOfferOption;", "Landroid/os/Parcelable;", "", "value", "", "title", "", "isSelected", "<init>", "(ILjava/lang/String;Z)V", "component1", "()I", "component2", "()Ljava/lang/String;", "component3", "()Z", "copy", "(ILjava/lang/String;Z)Lcom/avito/android/remote/model/LastMinuteOfferOption;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "I", "getValue", "Ljava/lang/String;", "getTitle", "Z", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class LastMinuteOfferOption implements Parcelable {

    @k
    public static final Parcelable.Creator<LastMinuteOfferOption> CREATOR = new Creator();

    @c("isSelected")
    private final boolean isSelected;

    @c("title")
    @k
    private final String title;

    @c("value")
    private final int value;

    /* compiled from: StrSellerCalendarLastMinuteOfferResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<LastMinuteOfferOption> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LastMinuteOfferOption createFromParcel(@k Parcel parcel) {
            return new LastMinuteOfferOption(parcel.readInt(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final LastMinuteOfferOption[] newArray(int i12) {
            return new LastMinuteOfferOption[i12];
        }
    }

    public LastMinuteOfferOption(int i12, @k String str, boolean z12) {
        this.value = i12;
        this.title = str;
        this.isSelected = z12;
    }

    public static /* synthetic */ LastMinuteOfferOption copy$default(LastMinuteOfferOption lastMinuteOfferOption, int i12, String str, boolean z12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i12 = lastMinuteOfferOption.value;
        }
        if ((i13 & 2) != 0) {
            str = lastMinuteOfferOption.title;
        }
        if ((i13 & 4) != 0) {
            z12 = lastMinuteOfferOption.isSelected;
        }
        return lastMinuteOfferOption.copy(i12, str, z12);
    }

    /* renamed from: component1, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final boolean getIsSelected() {
        return this.isSelected;
    }

    @k
    public final LastMinuteOfferOption copy(int value, @k String title, boolean isSelected) {
        return new LastMinuteOfferOption(value, title, isSelected);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof LastMinuteOfferOption)) {
            return false;
        }
        LastMinuteOfferOption lastMinuteOfferOption = (LastMinuteOfferOption) other;
        return this.value == lastMinuteOfferOption.value && L.f(this.title, lastMinuteOfferOption.title) && this.isSelected == lastMinuteOfferOption.isSelected;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    public final int getValue() {
        return this.value;
    }

    public int hashCode() {
        return Boolean.hashCode(this.isSelected) + H.d(Integer.hashCode(this.value) * 31, 31, this.title);
    }

    public final boolean isSelected() {
        return this.isSelected;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("LastMinuteOfferOption(value=");
        sb2.append(this.value);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", isSelected=");
        return r.x(sb2, this.isSelected, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeInt(this.value);
        parcel.writeString(this.title);
        parcel.writeInt(this.isSelected ? 1 : 0);
    }
}
