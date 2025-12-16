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

/* compiled from: StrBookingPromoCodeInfo.kt */
@d
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B%\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\nJ\u0012\u0010\f\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\f\u0010\rJ4\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0010\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0010\u0010\nJ\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0019\u0010\u0013J \u0010\u001e\u001a\u00020\u001d2\u0006\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u001c\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010 \u001a\u0004\b!\u0010\nR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010 \u001a\u0004\b\"\u0010\nR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b$\u0010\r¨\u0006%"}, d2 = {"Lcom/avito/android/remote/model/StrBookingPromoCodeInfo;", "Landroid/os/Parcelable;", "", "title", "subtitle", "Lcom/avito/android/remote/model/PromoCodesDialog;", "promoCodesDialog", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/PromoCodesDialog;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/PromoCodesDialog;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/PromoCodesDialog;)Lcom/avito/android/remote/model/StrBookingPromoCodeInfo;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "getSubtitle", "Lcom/avito/android/remote/model/PromoCodesDialog;", "getPromoCodesDialog", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class StrBookingPromoCodeInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<StrBookingPromoCodeInfo> CREATOR = new Creator();

    @c("promoCodesDialog")
    @l
    private final PromoCodesDialog promoCodesDialog;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("title")
    @l
    private final String title;

    /* compiled from: StrBookingPromoCodeInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrBookingPromoCodeInfo> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingPromoCodeInfo createFromParcel(@k Parcel parcel) {
            return new StrBookingPromoCodeInfo(parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : PromoCodesDialog.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrBookingPromoCodeInfo[] newArray(int i12) {
            return new StrBookingPromoCodeInfo[i12];
        }
    }

    public StrBookingPromoCodeInfo(@l String str, @l String str2, @l PromoCodesDialog promoCodesDialog) {
        this.title = str;
        this.subtitle = str2;
        this.promoCodesDialog = promoCodesDialog;
    }

    public static /* synthetic */ StrBookingPromoCodeInfo copy$default(StrBookingPromoCodeInfo strBookingPromoCodeInfo, String str, String str2, PromoCodesDialog promoCodesDialog, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = strBookingPromoCodeInfo.title;
        }
        if ((i12 & 2) != 0) {
            str2 = strBookingPromoCodeInfo.subtitle;
        }
        if ((i12 & 4) != 0) {
            promoCodesDialog = strBookingPromoCodeInfo.promoCodesDialog;
        }
        return strBookingPromoCodeInfo.copy(str, str2, promoCodesDialog);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final PromoCodesDialog getPromoCodesDialog() {
        return this.promoCodesDialog;
    }

    @k
    public final StrBookingPromoCodeInfo copy(@l String title, @l String subtitle, @l PromoCodesDialog promoCodesDialog) {
        return new StrBookingPromoCodeInfo(title, subtitle, promoCodesDialog);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof StrBookingPromoCodeInfo)) {
            return false;
        }
        StrBookingPromoCodeInfo strBookingPromoCodeInfo = (StrBookingPromoCodeInfo) other;
        return L.f(this.title, strBookingPromoCodeInfo.title) && L.f(this.subtitle, strBookingPromoCodeInfo.subtitle) && L.f(this.promoCodesDialog, strBookingPromoCodeInfo.promoCodesDialog);
    }

    @l
    public final PromoCodesDialog getPromoCodesDialog() {
        return this.promoCodesDialog;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.subtitle;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        PromoCodesDialog promoCodesDialog = this.promoCodesDialog;
        return iHashCode2 + (promoCodesDialog != null ? promoCodesDialog.hashCode() : 0);
    }

    @k
    public String toString() {
        return "StrBookingPromoCodeInfo(title=" + this.title + ", subtitle=" + this.subtitle + ", promoCodesDialog=" + this.promoCodesDialog + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.title);
        parcel.writeString(this.subtitle);
        PromoCodesDialog promoCodesDialog = this.promoCodesDialog;
        if (promoCodesDialog == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            promoCodesDialog.writeToParcel(parcel, flags);
        }
    }
}
