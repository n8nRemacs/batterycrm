package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: ItemCardRedesign.kt */
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001B\u0093\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0015\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b\"\u0010#R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b$\u0010\u001fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\b\u0010\u001fR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b)\u0010\u001fR\u001c\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001d\u001a\u0004\b*\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010\u001d\u001a\u0004\b\u000e\u0010\u001fR\u001c\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010\u001d\u001a\u0004\b+\u0010\u001fR\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0011\u0010,\u001a\u0004\b-\u0010.¨\u0006/"}, d2 = {"Lcom/avito/android/remote/model/ItemCardRedesign;", "Landroid/os/Parcelable;", "", "redesign", "restyle", "Lcom/avito/android/remote/model/JobRedesignType;", "jobRedesignType", "gigRedesign", "isPriceListOnTopPosition", "carouselGallery", "Lcom/avito/android/remote/model/CarouselGalleryGroup;", "carouselGalleryGroup", "goodsPriceRedesign", "mortgageEntryPointRedesign", "isBusinessServicesRedesignEnabled", "businessServicesLocationRemote", "Lcom/avito/android/remote/model/BusinessServicesRedesignType;", "businessServicesRedesignType", "<init>", "(Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/JobRedesignType;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/CarouselGalleryGroup;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/remote/model/BusinessServicesRedesignType;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/Boolean;", "getRedesign", "()Ljava/lang/Boolean;", "getRestyle", "Lcom/avito/android/remote/model/JobRedesignType;", "getJobRedesignType", "()Lcom/avito/android/remote/model/JobRedesignType;", "getGigRedesign", "getCarouselGallery", "Lcom/avito/android/remote/model/CarouselGalleryGroup;", "getCarouselGalleryGroup", "()Lcom/avito/android/remote/model/CarouselGalleryGroup;", "getGoodsPriceRedesign", "getMortgageEntryPointRedesign", "getBusinessServicesLocationRemote", "Lcom/avito/android/remote/model/BusinessServicesRedesignType;", "getBusinessServicesRedesignType", "()Lcom/avito/android/remote/model/BusinessServicesRedesignType;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class ItemCardRedesign implements Parcelable {

    @k
    public static final Parcelable.Creator<ItemCardRedesign> CREATOR = new Creator();

    @c("businessServicesLocationRemote")
    @l
    private final Boolean businessServicesLocationRemote;

    @c("businessServicesRedesignType")
    @l
    private final BusinessServicesRedesignType businessServicesRedesignType;

    @c("carouselGallery")
    @l
    private final Boolean carouselGallery;

    @c("carouselGalleryGroup")
    @l
    private final CarouselGalleryGroup carouselGalleryGroup;

    @c("gigRedesign")
    @l
    private final Boolean gigRedesign;

    @c("priceRedesign")
    @l
    private final Boolean goodsPriceRedesign;

    @c("isBusinessServicesRedesignEnabled")
    @l
    private final Boolean isBusinessServicesRedesignEnabled;

    @c("isPriceListOnTopPosition")
    @l
    private final Boolean isPriceListOnTopPosition;

    @c("jobRedesignType")
    @l
    private final JobRedesignType jobRedesignType;

    @c("mortgageEntryPointRedesign")
    @l
    private final Boolean mortgageEntryPointRedesign;

    @c("redesign")
    @l
    private final Boolean redesign;

    @c("restyle")
    @l
    private final Boolean restyle;

    /* compiled from: ItemCardRedesign.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ItemCardRedesign> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemCardRedesign createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            Boolean boolValueOf9;
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            JobRedesignType jobRedesignTypeValueOf = parcel.readInt() == 0 ? null : JobRedesignType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            CarouselGalleryGroup carouselGalleryGroupValueOf = parcel.readInt() == 0 ? null : CarouselGalleryGroup.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf9 = null;
            } else {
                boolValueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new ItemCardRedesign(boolValueOf, boolValueOf2, jobRedesignTypeValueOf, boolValueOf3, boolValueOf4, boolValueOf5, carouselGalleryGroupValueOf, boolValueOf6, boolValueOf7, boolValueOf8, boolValueOf9, parcel.readInt() == 0 ? null : BusinessServicesRedesignType.valueOf(parcel.readString()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ItemCardRedesign[] newArray(int i12) {
            return new ItemCardRedesign[i12];
        }
    }

    public ItemCardRedesign(@l Boolean bool, @l Boolean bool2, @l JobRedesignType jobRedesignType, @l Boolean bool3, @l Boolean bool4, @l Boolean bool5, @l CarouselGalleryGroup carouselGalleryGroup, @l Boolean bool6, @l Boolean bool7, @l Boolean bool8, @l Boolean bool9, @l BusinessServicesRedesignType businessServicesRedesignType) {
        this.redesign = bool;
        this.restyle = bool2;
        this.jobRedesignType = jobRedesignType;
        this.gigRedesign = bool3;
        this.isPriceListOnTopPosition = bool4;
        this.carouselGallery = bool5;
        this.carouselGalleryGroup = carouselGalleryGroup;
        this.goodsPriceRedesign = bool6;
        this.mortgageEntryPointRedesign = bool7;
        this.isBusinessServicesRedesignEnabled = bool8;
        this.businessServicesLocationRemote = bool9;
        this.businessServicesRedesignType = businessServicesRedesignType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final Boolean getBusinessServicesLocationRemote() {
        return this.businessServicesLocationRemote;
    }

    @l
    public final BusinessServicesRedesignType getBusinessServicesRedesignType() {
        return this.businessServicesRedesignType;
    }

    @l
    public final Boolean getCarouselGallery() {
        return this.carouselGallery;
    }

    @l
    public final CarouselGalleryGroup getCarouselGalleryGroup() {
        return this.carouselGalleryGroup;
    }

    @l
    public final Boolean getGigRedesign() {
        return this.gigRedesign;
    }

    @l
    public final Boolean getGoodsPriceRedesign() {
        return this.goodsPriceRedesign;
    }

    @l
    public final JobRedesignType getJobRedesignType() {
        return this.jobRedesignType;
    }

    @l
    public final Boolean getMortgageEntryPointRedesign() {
        return this.mortgageEntryPointRedesign;
    }

    @l
    public final Boolean getRedesign() {
        return this.redesign;
    }

    @l
    public final Boolean getRestyle() {
        return this.restyle;
    }

    @l
    /* renamed from: isBusinessServicesRedesignEnabled, reason: from getter */
    public final Boolean getIsBusinessServicesRedesignEnabled() {
        return this.isBusinessServicesRedesignEnabled;
    }

    @l
    /* renamed from: isPriceListOnTopPosition, reason: from getter */
    public final Boolean getIsPriceListOnTopPosition() {
        return this.isPriceListOnTopPosition;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Boolean bool = this.redesign;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.restyle;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        JobRedesignType jobRedesignType = this.jobRedesignType;
        if (jobRedesignType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(jobRedesignType.name());
        }
        Boolean bool3 = this.gigRedesign;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Boolean bool4 = this.isPriceListOnTopPosition;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        Boolean bool5 = this.carouselGallery;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool5);
        }
        CarouselGalleryGroup carouselGalleryGroup = this.carouselGalleryGroup;
        if (carouselGalleryGroup == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(carouselGalleryGroup.name());
        }
        Boolean bool6 = this.goodsPriceRedesign;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool6);
        }
        Boolean bool7 = this.mortgageEntryPointRedesign;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool7);
        }
        Boolean bool8 = this.isBusinessServicesRedesignEnabled;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool8);
        }
        Boolean bool9 = this.businessServicesLocationRemote;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool9);
        }
        BusinessServicesRedesignType businessServicesRedesignType = this.businessServicesRedesignType;
        if (businessServicesRedesignType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(businessServicesRedesignType.name());
        }
    }

    public /* synthetic */ ItemCardRedesign(Boolean bool, Boolean bool2, JobRedesignType jobRedesignType, Boolean bool3, Boolean bool4, Boolean bool5, CarouselGalleryGroup carouselGalleryGroup, Boolean bool6, Boolean bool7, Boolean bool8, Boolean bool9, BusinessServicesRedesignType businessServicesRedesignType, int i12, C42822w c42822w) {
        this(bool, bool2, (i12 & 4) != 0 ? null : jobRedesignType, (i12 & 8) != 0 ? null : bool3, (i12 & 16) != 0 ? Boolean.FALSE : bool4, (i12 & 32) != 0 ? Boolean.FALSE : bool5, (i12 & 64) != 0 ? null : carouselGalleryGroup, (i12 & 128) != 0 ? null : bool6, (i12 & 256) != 0 ? null : bool7, (i12 & 512) != 0 ? null : bool8, (i12 & 1024) != 0 ? null : bool9, (i12 & 2048) != 0 ? null : businessServicesRedesignType);
    }
}
