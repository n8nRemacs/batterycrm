package com.avito.android.remote.model.category_parameters.slot.delivery_summary;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DeliverySummarySlotConfig.kt */
@d
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0017\b\u0007\u0018\u00002\u00020\u0001BW\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010\n\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010#\u001a\u0004\b&\u0010%R\u001c\u0010\u000b\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010'\u001a\u0004\b(\u0010)R\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010'\u001a\u0004\b*\u0010)R\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010+\u001a\u0004\b,\u0010-¨\u0006."}, d2 = {"Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/IncludingFeeData;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/UniversalImage;", "image", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/BadgeData;", "badge", "Lcom/avito/android/remote/model/text/AttributedText;", "description", "", "itemPriceWithFee", "feeAfterIncluding", "dbsFeeAfterIncluding", "cncFeeAfterIncluding", "", "disableSubsidyIfFeeIsNotIncluded", "<init>", "(Lcom/avito/android/remote/model/UniversalImage;Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/BadgeData;Lcom/avito/android/remote/model/text/AttributedText;JJLjava/lang/Long;Ljava/lang/Long;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/UniversalImage;", "getImage", "()Lcom/avito/android/remote/model/UniversalImage;", "Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/BadgeData;", "getBadge", "()Lcom/avito/android/remote/model/category_parameters/slot/delivery_summary/BadgeData;", "Lcom/avito/android/remote/model/text/AttributedText;", "getDescription", "()Lcom/avito/android/remote/model/text/AttributedText;", "J", "getItemPriceWithFee", "()J", "getFeeAfterIncluding", "Ljava/lang/Long;", "getDbsFeeAfterIncluding", "()Ljava/lang/Long;", "getCncFeeAfterIncluding", "Ljava/lang/Boolean;", "getDisableSubsidyIfFeeIsNotIncluded", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_publish"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class IncludingFeeData implements Parcelable {

    @k
    public static final Parcelable.Creator<IncludingFeeData> CREATOR = new Creator();

    @c("badge")
    @l
    private final BadgeData badge;

    @c("cncFeeAfterIncluding")
    @l
    private final Long cncFeeAfterIncluding;

    @c("dbsFeeAfterIncluding")
    @l
    private final Long dbsFeeAfterIncluding;

    @c("description")
    @k
    private final AttributedText description;

    @c("disableSubsidyIfFeeIsNotIncluded")
    @l
    private final Boolean disableSubsidyIfFeeIsNotIncluded;

    @c("feeAfterIncluding")
    private final long feeAfterIncluding;

    @c("image")
    @l
    private final UniversalImage image;

    @c("itemPriceWithFee")
    private final long itemPriceWithFee;

    /* compiled from: DeliverySummarySlotConfig.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<IncludingFeeData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IncludingFeeData createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(IncludingFeeData.class.getClassLoader());
            BadgeData badgeDataCreateFromParcel = parcel.readInt() == 0 ? null : BadgeData.CREATOR.createFromParcel(parcel);
            AttributedText attributedText = (AttributedText) parcel.readParcelable(IncludingFeeData.class.getClassLoader());
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new IncludingFeeData(universalImage, badgeDataCreateFromParcel, attributedText, j12, j13, lValueOf, lValueOf2, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final IncludingFeeData[] newArray(int i12) {
            return new IncludingFeeData[i12];
        }
    }

    public IncludingFeeData(@l UniversalImage universalImage, @l BadgeData badgeData, @k AttributedText attributedText, long j12, long j13, @l Long l12, @l Long l13, @l Boolean bool) {
        this.image = universalImage;
        this.badge = badgeData;
        this.description = attributedText;
        this.itemPriceWithFee = j12;
        this.feeAfterIncluding = j13;
        this.dbsFeeAfterIncluding = l12;
        this.cncFeeAfterIncluding = l13;
        this.disableSubsidyIfFeeIsNotIncluded = bool;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final BadgeData getBadge() {
        return this.badge;
    }

    @l
    public final Long getCncFeeAfterIncluding() {
        return this.cncFeeAfterIncluding;
    }

    @l
    public final Long getDbsFeeAfterIncluding() {
        return this.dbsFeeAfterIncluding;
    }

    @k
    public final AttributedText getDescription() {
        return this.description;
    }

    @l
    public final Boolean getDisableSubsidyIfFeeIsNotIncluded() {
        return this.disableSubsidyIfFeeIsNotIncluded;
    }

    public final long getFeeAfterIncluding() {
        return this.feeAfterIncluding;
    }

    @l
    public final UniversalImage getImage() {
        return this.image;
    }

    public final long getItemPriceWithFee() {
        return this.itemPriceWithFee;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.image, flags);
        BadgeData badgeData = this.badge;
        if (badgeData == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badgeData.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.description, flags);
        parcel.writeLong(this.itemPriceWithFee);
        parcel.writeLong(this.feeAfterIncluding);
        Long l12 = this.dbsFeeAfterIncluding;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.cncFeeAfterIncluding;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        Boolean bool = this.disableSubsidyIfFeeIsNotIncluded;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public /* synthetic */ IncludingFeeData(UniversalImage universalImage, BadgeData badgeData, AttributedText attributedText, long j12, long j13, Long l12, Long l13, Boolean bool, int i12, C42822w c42822w) {
        this(universalImage, badgeData, attributedText, j12, j13, (i12 & 32) != 0 ? null : l12, (i12 & 64) != 0 ? null : l13, (i12 & 128) != 0 ? Boolean.FALSE : bool);
    }
}
