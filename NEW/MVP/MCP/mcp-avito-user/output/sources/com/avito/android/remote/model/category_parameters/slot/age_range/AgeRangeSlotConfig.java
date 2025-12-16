package com.avito.android.remote.model.category_parameters.slot.age_range;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.slot.SlotConfig;
import com.google.gson.annotations.c;
import kotlin.Metadata;

/* compiled from: AgeRangeSlotConfig.kt */
@d
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BM\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0019\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001d\u0010\u001cR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001e\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001f\u0010\u001cR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u001a\u001a\u0004\b \u0010\u001c¨\u0006!"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/age_range/AgeRangeSlotConfig;", "Lcom/avito/android/remote/model/category_parameters/slot/SlotConfig;", "", "valueTo", "valueFrom", "", "prefixTo", "prefixFrom", "hintTo", "hintFrom", "ageRangeId", "<init>", "(Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Long;", "getValueTo", "()Ljava/lang/Long;", "getValueFrom", "Ljava/lang/String;", "getPrefixTo", "()Ljava/lang/String;", "getPrefixFrom", "getHintTo", "getHintFrom", "getAgeRangeId", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AgeRangeSlotConfig implements SlotConfig {

    @k
    public static final Parcelable.Creator<AgeRangeSlotConfig> CREATOR = new Creator();

    @c("age_range_id")
    @l
    private final String ageRangeId;

    @c("hint_from")
    @l
    private final String hintFrom;

    @c("hint_to")
    @l
    private final String hintTo;

    @c("prefix_from")
    @l
    private final String prefixFrom;

    @c("prefix_to")
    @l
    private final String prefixTo;

    @c("value_from")
    @l
    private final Long valueFrom;

    @c("value_to")
    @l
    private final Long valueTo;

    /* compiled from: AgeRangeSlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AgeRangeSlotConfig> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AgeRangeSlotConfig createFromParcel(@k Parcel parcel) {
            return new AgeRangeSlotConfig(parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AgeRangeSlotConfig[] newArray(int i12) {
            return new AgeRangeSlotConfig[i12];
        }
    }

    public AgeRangeSlotConfig(@l Long l12, @l Long l13, @l String str, @l String str2, @l String str3, @l String str4, @l String str5) {
        this.valueTo = l12;
        this.valueFrom = l13;
        this.prefixTo = str;
        this.prefixFrom = str2;
        this.hintTo = str3;
        this.hintFrom = str4;
        this.ageRangeId = str5;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getAgeRangeId() {
        return this.ageRangeId;
    }

    @l
    public final String getHintFrom() {
        return this.hintFrom;
    }

    @l
    public final String getHintTo() {
        return this.hintTo;
    }

    @l
    public final String getPrefixFrom() {
        return this.prefixFrom;
    }

    @l
    public final String getPrefixTo() {
        return this.prefixTo;
    }

    @l
    public final Long getValueFrom() {
        return this.valueFrom;
    }

    @l
    public final Long getValueTo() {
        return this.valueTo;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Long l12 = this.valueTo;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.valueFrom;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        parcel.writeString(this.prefixTo);
        parcel.writeString(this.prefixFrom);
        parcel.writeString(this.hintTo);
        parcel.writeString(this.hintFrom);
        parcel.writeString(this.ageRangeId);
    }
}
