package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertPrice.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0019\b\u0007\u0018\u00002\u00020\u0001B«\u0001\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J \u0010\u001d\u001a\u00020\u001c2\u0006\u0010\u001a\u001a\u00020\u00192\u0006\u0010\u001b\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001f\u001a\u0004\b\"\u0010!R\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001f\u001a\u0004\b#\u0010!R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001f\u001a\u0004\b$\u0010!R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001f\u001a\u0004\b%\u0010!R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b&\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b(\u0010)R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001f\u001a\u0004\b*\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010\u001f\u001a\u0004\b+\u0010!R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010\u001f\u001a\u0004\b,\u0010!R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010-\u001a\u0004\b.\u0010/R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010\u001f\u001a\u0004\b0\u0010!R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010\u001f\u001a\u0004\b1\u0010!R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00102\u001a\u0004\b3\u00104¨\u00065"}, d2 = {"Lcom/avito/android/remote/model/AdvertPrice;", "Landroid/os/Parcelable;", "", "title", "fullTitle", "value", "normalizedValue", "oldValue", "oldValueHint", "Lcom/avito/android/remote/model/AdvertOldPriceHintSheet;", "oldValueHintSheet", "metric", "valueSigned", "valueSignedWithoutDiscount", "Lcom/avito/android/remote/model/AdvertPriceHint;", "hint", "discountPercent", "presentationStyle", "Lcom/avito/android/remote/model/text/AttributedText;", "current", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertOldPriceHintSheet;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertPriceHint;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getFullTitle", "getValue", "getNormalizedValue", "getOldValue", "getOldValueHint", "Lcom/avito/android/remote/model/AdvertOldPriceHintSheet;", "getOldValueHintSheet", "()Lcom/avito/android/remote/model/AdvertOldPriceHintSheet;", "getMetric", "getValueSigned", "getValueSignedWithoutDiscount", "Lcom/avito/android/remote/model/AdvertPriceHint;", "getHint", "()Lcom/avito/android/remote/model/AdvertPriceHint;", "getDiscountPercent", "getPresentationStyle", "Lcom/avito/android/remote/model/text/AttributedText;", "getCurrent", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class AdvertPrice implements Parcelable {

    @k
    public static final Parcelable.Creator<AdvertPrice> CREATOR = new Creator();

    @l
    private final AttributedText current;

    @l
    private final String discountPercent;

    @l
    private final String fullTitle;

    @l
    private final AdvertPriceHint hint;

    @l
    private final String metric;

    @l
    private final String normalizedValue;

    @l
    private final String oldValue;

    @l
    private final String oldValueHint;

    @l
    private final AdvertOldPriceHintSheet oldValueHintSheet;

    @l
    private final String presentationStyle;

    @l
    private final String title;

    @k
    private final String value;

    @l
    private final String valueSigned;

    @l
    private final String valueSignedWithoutDiscount;

    /* compiled from: AdvertPrice.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<AdvertPrice> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertPrice createFromParcel(@k Parcel parcel) {
            return new AdvertPrice(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AdvertOldPriceHintSheet.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() != 0 ? AdvertPriceHint.CREATOR.createFromParcel(parcel) : null, parcel.readString(), parcel.readString(), (AttributedText) parcel.readParcelable(AdvertPrice.class.getClassLoader()));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final AdvertPrice[] newArray(int i12) {
            return new AdvertPrice[i12];
        }
    }

    public AdvertPrice(@l String str, @l String str2, @k String str3, @l String str4, @l String str5, @l String str6, @l AdvertOldPriceHintSheet advertOldPriceHintSheet, @l String str7, @l String str8, @l String str9, @l AdvertPriceHint advertPriceHint, @l String str10, @l String str11, @l AttributedText attributedText) {
        this.title = str;
        this.fullTitle = str2;
        this.value = str3;
        this.normalizedValue = str4;
        this.oldValue = str5;
        this.oldValueHint = str6;
        this.oldValueHintSheet = advertOldPriceHintSheet;
        this.metric = str7;
        this.valueSigned = str8;
        this.valueSignedWithoutDiscount = str9;
        this.hint = advertPriceHint;
        this.discountPercent = str10;
        this.presentationStyle = str11;
        this.current = attributedText;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final AttributedText getCurrent() {
        return this.current;
    }

    @l
    public final String getDiscountPercent() {
        return this.discountPercent;
    }

    @l
    public final String getFullTitle() {
        return this.fullTitle;
    }

    @l
    public final AdvertPriceHint getHint() {
        return this.hint;
    }

    @l
    public final String getMetric() {
        return this.metric;
    }

    @l
    public final String getNormalizedValue() {
        return this.normalizedValue;
    }

    @l
    public final String getOldValue() {
        return this.oldValue;
    }

    @l
    public final String getOldValueHint() {
        return this.oldValueHint;
    }

    @l
    public final AdvertOldPriceHintSheet getOldValueHintSheet() {
        return this.oldValueHintSheet;
    }

    @l
    public final String getPresentationStyle() {
        return this.presentationStyle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    @l
    public final String getValueSigned() {
        return this.valueSigned;
    }

    @l
    public final String getValueSignedWithoutDiscount() {
        return this.valueSignedWithoutDiscount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.fullTitle);
        parcel.writeString(this.value);
        parcel.writeString(this.normalizedValue);
        parcel.writeString(this.oldValue);
        parcel.writeString(this.oldValueHint);
        AdvertOldPriceHintSheet advertOldPriceHintSheet = this.oldValueHintSheet;
        if (advertOldPriceHintSheet == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertOldPriceHintSheet.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.metric);
        parcel.writeString(this.valueSigned);
        parcel.writeString(this.valueSignedWithoutDiscount);
        AdvertPriceHint advertPriceHint = this.hint;
        if (advertPriceHint == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertPriceHint.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.discountPercent);
        parcel.writeString(this.presentationStyle);
        parcel.writeParcelable(this.current, flags);
    }

    public /* synthetic */ AdvertPrice(String str, String str2, String str3, String str4, String str5, String str6, AdvertOldPriceHintSheet advertOldPriceHintSheet, String str7, String str8, String str9, AdvertPriceHint advertPriceHint, String str10, String str11, AttributedText attributedText, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, str3, (i12 & 8) != 0 ? null : str4, (i12 & 16) != 0 ? null : str5, (i12 & 32) != 0 ? null : str6, (i12 & 64) != 0 ? null : advertOldPriceHintSheet, (i12 & 128) != 0 ? null : str7, (i12 & 256) != 0 ? null : str8, (i12 & 512) != 0 ? null : str9, (i12 & 1024) != 0 ? null : advertPriceHint, (i12 & 2048) != 0 ? null : str10, (i12 & 4096) != 0 ? null : str11, (i12 & 8192) != 0 ? null : attributedText);
    }
}
