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

/* compiled from: ConstructorAdvertNetworkModel.kt */
@d
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0007\u0018\u00002\u00020\u0001BC\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ \u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\u0011\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0019\u0010\u0017R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lcom/avito/android/remote/model/PriceNetworkModel;", "Landroid/os/Parcelable;", "", "current", "previous", "priceWithoutDiscount", "Lcom/avito/android/remote/model/UniversalColor;", "highlightColor", "", "hasDiscount", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalColor;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCurrent", "()Ljava/lang/String;", "getPrevious", "getPriceWithoutDiscount", "Lcom/avito/android/remote/model/UniversalColor;", "getHighlightColor", "()Lcom/avito/android/remote/model/UniversalColor;", "Ljava/lang/Boolean;", "getHasDiscount", "()Ljava/lang/Boolean;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class PriceNetworkModel implements Parcelable {

    @k
    public static final Parcelable.Creator<PriceNetworkModel> CREATOR = new Creator();

    @c("current")
    @l
    private final String current;

    @c("hasDiscount")
    @l
    private final Boolean hasDiscount;

    @c("highlightColor")
    @l
    private final UniversalColor highlightColor;

    @c("previous")
    @l
    private final String previous;

    @c("priceWithoutDiscount")
    @l
    private final String priceWithoutDiscount;

    /* compiled from: ConstructorAdvertNetworkModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<PriceNetworkModel> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceNetworkModel createFromParcel(@k Parcel parcel) {
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(PriceNetworkModel.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new PriceNetworkModel(string, string2, string3, universalColor, boolValueOf);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final PriceNetworkModel[] newArray(int i12) {
            return new PriceNetworkModel[i12];
        }
    }

    public PriceNetworkModel() {
        this(null, null, null, null, null, 31, null);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final String getCurrent() {
        return this.current;
    }

    @l
    public final Boolean getHasDiscount() {
        return this.hasDiscount;
    }

    @l
    public final UniversalColor getHighlightColor() {
        return this.highlightColor;
    }

    @l
    public final String getPrevious() {
        return this.previous;
    }

    @l
    public final String getPriceWithoutDiscount() {
        return this.priceWithoutDiscount;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.current);
        parcel.writeString(this.previous);
        parcel.writeString(this.priceWithoutDiscount);
        parcel.writeParcelable(this.highlightColor, flags);
        Boolean bool = this.hasDiscount;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
    }

    public PriceNetworkModel(@l String str, @l String str2, @l String str3, @l UniversalColor universalColor, @l Boolean bool) {
        this.current = str;
        this.previous = str2;
        this.priceWithoutDiscount = str3;
        this.highlightColor = universalColor;
        this.hasDiscount = bool;
    }

    public /* synthetic */ PriceNetworkModel(String str, String str2, String str3, UniversalColor universalColor, Boolean bool, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : str2, (i12 & 4) != 0 ? null : str3, (i12 & 8) == 0 ? universalColor : null, (i12 & 16) != 0 ? Boolean.FALSE : bool);
    }
}
