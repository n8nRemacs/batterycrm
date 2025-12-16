package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.deep_linking.links.DeepLink;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;

/* compiled from: StrItemBookingSellerCalendarResponse.kt */
@d
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001:\u0003)*+Be\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u000e\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u0004\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J \u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\"\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b \u0010\u001fR\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b!\u0010\u001fR\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010$R\"\u0010\f\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b%\u0010\u001fR\u001c\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006,"}, d2 = {"Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse;", "Landroid/os/Parcelable;", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse$DateRange;", "bookedDateRanges", "pendingDateRanges", "unavailableDateRanges", "Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse$BaseParameters;", "baseParameters", "Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse$SellerCalendarItem;", "items", "", "buttonTitle", "<init>", "(Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse$BaseParameters;Ljava/util/List;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/util/List;", "getBookedDateRanges", "()Ljava/util/List;", "getPendingDateRanges", "getUnavailableDateRanges", "Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse$BaseParameters;", "getBaseParameters", "()Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse$BaseParameters;", "getItems", "Ljava/lang/String;", "getButtonTitle", "()Ljava/lang/String;", "BaseParameters", "DateRange", "SellerCalendarItem", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final class StrItemBookingSellerCalendarResponse implements Parcelable {

    @k
    public static final Parcelable.Creator<StrItemBookingSellerCalendarResponse> CREATOR = new Creator();

    @c("baseParameters")
    @l
    private final BaseParameters baseParameters;

    @c("bookedDateRanges")
    @l
    private final List<DateRange> bookedDateRanges;

    @c("buttonTitle")
    @l
    private final String buttonTitle;

    @c("onboardingDeeplink")
    @l
    private final DeepLink deeplink;

    @c("items")
    @l
    private final List<SellerCalendarItem> items;

    @c("pendingDateRanges")
    @l
    private final List<DateRange> pendingDateRanges;

    @c("unavailableDateRanges")
    @l
    private final List<DateRange> unavailableDateRanges;

    /* compiled from: StrItemBookingSellerCalendarResponse.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse$BaseParameters;", "Landroid/os/Parcelable;", "", "nightPrice", "<init>", "(Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getNightPrice", "()Ljava/lang/String;", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class BaseParameters implements Parcelable {

        @k
        public static final Parcelable.Creator<BaseParameters> CREATOR = new Creator();

        @c("nightPrice")
        @k
        private final String nightPrice;

        /* compiled from: StrItemBookingSellerCalendarResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<BaseParameters> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BaseParameters createFromParcel(@k Parcel parcel) {
                return new BaseParameters(parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final BaseParameters[] newArray(int i12) {
                return new BaseParameters[i12];
            }
        }

        public BaseParameters(@k String str) {
            this.nightPrice = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getNightPrice() {
            return this.nightPrice;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.nightPrice);
        }
    }

    /* compiled from: StrItemBookingSellerCalendarResponse.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<StrItemBookingSellerCalendarResponse> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrItemBookingSellerCalendarResponse createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            ArrayList arrayList4;
            DeepLink deepLink = (DeepLink) parcel.readParcelable(StrItemBookingSellerCalendarResponse.class.getClassLoader());
            int iC2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC3 = 0;
                while (iC3 != i12) {
                    iC3 = a.c(DateRange.CREATOR, parcel, arrayList, iC3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iC4 = 0;
                while (iC4 != i13) {
                    iC4 = a.c(DateRange.CREATOR, parcel, arrayList2, iC4, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList3 = new ArrayList(i14);
                int iC5 = 0;
                while (iC5 != i14) {
                    iC5 = a.c(DateRange.CREATOR, parcel, arrayList3, iC5, 1);
                }
            }
            BaseParameters baseParametersCreateFromParcel = parcel.readInt() == 0 ? null : BaseParameters.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                arrayList4 = null;
            } else {
                int i15 = parcel.readInt();
                arrayList4 = new ArrayList(i15);
                while (iC2 != i15) {
                    iC2 = a.c(SellerCalendarItem.CREATOR, parcel, arrayList4, iC2, 1);
                }
            }
            return new StrItemBookingSellerCalendarResponse(deepLink, arrayList, arrayList2, arrayList3, baseParametersCreateFromParcel, arrayList4, parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final StrItemBookingSellerCalendarResponse[] newArray(int i12) {
            return new StrItemBookingSellerCalendarResponse[i12];
        }
    }

    /* compiled from: StrItemBookingSellerCalendarResponse.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse$DateRange;", "Landroid/os/Parcelable;", "", "startDate", "endDate", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStartDate", "()Ljava/lang/String;", "getEndDate", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class DateRange implements Parcelable {

        @k
        public static final Parcelable.Creator<DateRange> CREATOR = new Creator();

        @c("endDate")
        @k
        private final String endDate;

        @c("startDate")
        @k
        private final String startDate;

        /* compiled from: StrItemBookingSellerCalendarResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<DateRange> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DateRange createFromParcel(@k Parcel parcel) {
                return new DateRange(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final DateRange[] newArray(int i12) {
                return new DateRange[i12];
            }
        }

        public DateRange(@k String str, @k String str2) {
            this.startDate = str;
            this.endDate = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getEndDate() {
            return this.endDate;
        }

        @k
        public final String getStartDate() {
            return this.startDate;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.startDate);
            parcel.writeString(this.endDate);
        }
    }

    /* compiled from: StrItemBookingSellerCalendarResponse.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0019\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/StrItemBookingSellerCalendarResponse$SellerCalendarItem;", "Landroid/os/Parcelable;", "", "date", "", "hasEditedParameters", "overridenNightPrice", "hasLastMinuteOffer", "<init>", "(Ljava/lang/String;ZLjava/lang/String;Ljava/lang/Boolean;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDate", "()Ljava/lang/String;", "Z", "getHasEditedParameters", "()Z", "getOverridenNightPrice", "Ljava/lang/Boolean;", "getHasLastMinuteOffer", "()Ljava/lang/Boolean;", "_avito-discouraged_avito-api_short-term-rent"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SellerCalendarItem implements Parcelable {

        @k
        public static final Parcelable.Creator<SellerCalendarItem> CREATOR = new Creator();

        @c("date")
        @k
        private final String date;

        @c("hasEditedParameters")
        private final boolean hasEditedParameters;

        @c("hasLastMinuteOffer")
        @l
        private final Boolean hasLastMinuteOffer;

        @c("overridenNightPrice")
        @l
        private final String overridenNightPrice;

        /* compiled from: StrItemBookingSellerCalendarResponse.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SellerCalendarItem> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SellerCalendarItem createFromParcel(@k Parcel parcel) {
                Boolean boolValueOf;
                String string = parcel.readString();
                boolean z12 = parcel.readInt() != 0;
                String string2 = parcel.readString();
                if (parcel.readInt() == 0) {
                    boolValueOf = null;
                } else {
                    boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
                }
                return new SellerCalendarItem(string, z12, string2, boolValueOf);
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SellerCalendarItem[] newArray(int i12) {
                return new SellerCalendarItem[i12];
            }
        }

        public SellerCalendarItem(@k String str, boolean z12, @l String str2, @l Boolean bool) {
            this.date = str;
            this.hasEditedParameters = z12;
            this.overridenNightPrice = str2;
            this.hasLastMinuteOffer = bool;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getDate() {
            return this.date;
        }

        public final boolean getHasEditedParameters() {
            return this.hasEditedParameters;
        }

        @l
        public final Boolean getHasLastMinuteOffer() {
            return this.hasLastMinuteOffer;
        }

        @l
        public final String getOverridenNightPrice() {
            return this.overridenNightPrice;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.date);
            parcel.writeInt(this.hasEditedParameters ? 1 : 0);
            parcel.writeString(this.overridenNightPrice);
            Boolean bool = this.hasLastMinuteOffer;
            if (bool == null) {
                parcel.writeInt(0);
            } else {
                C0.l(parcel, 1, bool);
            }
        }
    }

    public StrItemBookingSellerCalendarResponse(@l DeepLink deepLink, @l List<DateRange> list, @l List<DateRange> list2, @l List<DateRange> list3, @l BaseParameters baseParameters, @l List<SellerCalendarItem> list4, @l String str) {
        this.deeplink = deepLink;
        this.bookedDateRanges = list;
        this.pendingDateRanges = list2;
        this.unavailableDateRanges = list3;
        this.baseParameters = baseParameters;
        this.items = list4;
        this.buttonTitle = str;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @l
    public final BaseParameters getBaseParameters() {
        return this.baseParameters;
    }

    @l
    public final List<DateRange> getBookedDateRanges() {
        return this.bookedDateRanges;
    }

    @l
    public final String getButtonTitle() {
        return this.buttonTitle;
    }

    @l
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final List<SellerCalendarItem> getItems() {
        return this.items;
    }

    @l
    public final List<DateRange> getPendingDateRanges() {
        return this.pendingDateRanges;
    }

    @l
    public final List<DateRange> getUnavailableDateRanges() {
        return this.unavailableDateRanges;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeParcelable(this.deeplink, flags);
        List<DateRange> list = this.bookedDateRanges;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((DateRange) itA.next()).writeToParcel(parcel, flags);
            }
        }
        List<DateRange> list2 = this.pendingDateRanges;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((DateRange) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        List<DateRange> list3 = this.unavailableDateRanges;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                ((DateRange) itA3.next()).writeToParcel(parcel, flags);
            }
        }
        BaseParameters baseParameters = this.baseParameters;
        if (baseParameters == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            baseParameters.writeToParcel(parcel, flags);
        }
        List<SellerCalendarItem> list4 = this.items;
        if (list4 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA4 = a.A(list4, parcel, 1);
            while (itA4.hasNext()) {
                ((SellerCalendarItem) itA4.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.buttonTitle);
    }
}
