package com.avito.android.installments_block.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: InstallmentsPriceInfo.kt */
@d
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsPriceInfo;", "Landroid/os/Parcelable;", "PriceBadge", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class InstallmentsPriceInfo implements Parcelable {

    @k
    public static final Parcelable.Creator<InstallmentsPriceInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f172867b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final AttributedText f172868c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final PriceBadge f172869d;

    /* compiled from: InstallmentsPriceInfo.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsPriceInfo$PriceBadge;", "Landroid/os/Parcelable;", "QuestionIcon", "RedBadge", "Lcom/avito/android/installments_block/entity/InstallmentsPriceInfo$PriceBadge$QuestionIcon;", "Lcom/avito/android/installments_block/entity/InstallmentsPriceInfo$PriceBadge$RedBadge;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface PriceBadge extends Parcelable {

        /* compiled from: InstallmentsPriceInfo.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsPriceInfo$PriceBadge$QuestionIcon;", "Lcom/avito/android/installments_block/entity/InstallmentsPriceInfo$PriceBadge;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class QuestionIcon implements PriceBadge {

            @k
            public static final Parcelable.Creator<QuestionIcon> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final DeepLink f172870b;

            /* compiled from: InstallmentsPriceInfo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<QuestionIcon> {
                @Override // android.os.Parcelable.Creator
                public final QuestionIcon createFromParcel(Parcel parcel) {
                    return new QuestionIcon((DeepLink) parcel.readParcelable(QuestionIcon.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final QuestionIcon[] newArray(int i12) {
                    return new QuestionIcon[i12];
                }
            }

            public QuestionIcon(@l DeepLink deepLink) {
                this.f172870b = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                return (obj instanceof QuestionIcon) && L.f(this.f172870b, ((QuestionIcon) obj).f172870b);
            }

            public final int hashCode() {
                DeepLink deepLink = this.f172870b;
                if (deepLink == null) {
                    return 0;
                }
                return deepLink.hashCode();
            }

            @k
            public final String toString() {
                return com.avito.android.actions_sheet.a.v(new StringBuilder("QuestionIcon(deeplink="), this.f172870b, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeParcelable(this.f172870b, i12);
            }
        }

        /* compiled from: InstallmentsPriceInfo.kt */
        @d
        @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments_block/entity/InstallmentsPriceInfo$PriceBadge$RedBadge;", "Lcom/avito/android/installments_block/entity/InstallmentsPriceInfo$PriceBadge;", "_avito_installments-block_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final /* data */ class RedBadge implements PriceBadge {

            @k
            public static final Parcelable.Creator<RedBadge> CREATOR = new a();

            /* renamed from: b, reason: collision with root package name */
            @l
            public final String f172871b;

            /* renamed from: c, reason: collision with root package name */
            @l
            public final DeepLink f172872c;

            /* compiled from: InstallmentsPriceInfo.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class a implements Parcelable.Creator<RedBadge> {
                @Override // android.os.Parcelable.Creator
                public final RedBadge createFromParcel(Parcel parcel) {
                    return new RedBadge(parcel.readString(), (DeepLink) parcel.readParcelable(RedBadge.class.getClassLoader()));
                }

                @Override // android.os.Parcelable.Creator
                public final RedBadge[] newArray(int i12) {
                    return new RedBadge[i12];
                }
            }

            public RedBadge(@l String str, @l DeepLink deepLink) {
                this.f172871b = str;
                this.f172872c = deepLink;
            }

            @Override // android.os.Parcelable
            public final int describeContents() {
                return 0;
            }

            public final boolean equals(@l Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof RedBadge)) {
                    return false;
                }
                RedBadge redBadge = (RedBadge) obj;
                return L.f(this.f172871b, redBadge.f172871b) && L.f(this.f172872c, redBadge.f172872c);
            }

            public final int hashCode() {
                String str = this.f172871b;
                int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
                DeepLink deepLink = this.f172872c;
                return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
            }

            @k
            public final String toString() {
                StringBuilder sb2 = new StringBuilder("RedBadge(text=");
                sb2.append(this.f172871b);
                sb2.append(", deeplink=");
                return com.avito.android.actions_sheet.a.v(sb2, this.f172872c, ')');
            }

            @Override // android.os.Parcelable
            public final void writeToParcel(@k Parcel parcel, int i12) {
                parcel.writeString(this.f172871b);
                parcel.writeParcelable(this.f172872c, i12);
            }
        }
    }

    /* compiled from: InstallmentsPriceInfo.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InstallmentsPriceInfo> {
        @Override // android.os.Parcelable.Creator
        public final InstallmentsPriceInfo createFromParcel(Parcel parcel) {
            return new InstallmentsPriceInfo(parcel.readString(), (AttributedText) parcel.readParcelable(InstallmentsPriceInfo.class.getClassLoader()), (PriceBadge) parcel.readParcelable(InstallmentsPriceInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final InstallmentsPriceInfo[] newArray(int i12) {
            return new InstallmentsPriceInfo[i12];
        }
    }

    public InstallmentsPriceInfo(@l String str, @l AttributedText attributedText, @l PriceBadge priceBadge) {
        this.f172867b = str;
        this.f172868c = attributedText;
        this.f172869d = priceBadge;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof InstallmentsPriceInfo)) {
            return false;
        }
        InstallmentsPriceInfo installmentsPriceInfo = (InstallmentsPriceInfo) obj;
        return L.f(this.f172867b, installmentsPriceInfo.f172867b) && L.f(this.f172868c, installmentsPriceInfo.f172868c) && L.f(this.f172869d, installmentsPriceInfo.f172869d);
    }

    public final int hashCode() {
        String str = this.f172867b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        AttributedText attributedText = this.f172868c;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        PriceBadge priceBadge = this.f172869d;
        return iHashCode2 + (priceBadge != null ? priceBadge.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "InstallmentsPriceInfo(price=" + this.f172867b + ", priceDescription=" + this.f172868c + ", badge=" + this.f172869d + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f172867b);
        parcel.writeParcelable(this.f172868c, i12);
        parcel.writeParcelable(this.f172869d, i12);
    }
}
