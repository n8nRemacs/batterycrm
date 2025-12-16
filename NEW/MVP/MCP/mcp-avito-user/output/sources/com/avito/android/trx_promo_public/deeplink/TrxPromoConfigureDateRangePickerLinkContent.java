package com.avito.android.trx_promo_public.deeplink;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ButtonAction;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
@d
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u0017\u0018B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\f\u001a\u0004\b\u0013\u0010\u000eR\u001a\u0010\t\u001a\u00020\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0019"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent;", "Landroid/os/Parcelable;", "", "screenTitle", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$DateInfo;", "startDateInfo", "endDateInfo", "errorMessage", "Lcom/avito/android/remote/model/ButtonAction;", "button", "<init>", "(Ljava/lang/String;Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$DateInfo;Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$DateInfo;Ljava/lang/String;Lcom/avito/android/remote/model/ButtonAction;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$DateInfo;", "g", "()Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$DateInfo;", "d", "e", "Lcom/avito/android/remote/model/ButtonAction;", "c", "()Lcom/avito/android/remote/model/ButtonAction;", "DateInfo", "Validator", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TrxPromoConfigureDateRangePickerLinkContent implements Parcelable {

    @k
    public static final Parcelable.Creator<TrxPromoConfigureDateRangePickerLinkContent> CREATOR = new a();

    @c("button")
    @k
    private final ButtonAction button;

    @c("endDateInfo")
    @k
    private final DateInfo endDateInfo;

    @c("errorMessage")
    @k
    private final String errorMessage;

    @c("screenTitle")
    @k
    private final String screenTitle;

    @c("startDateInfo")
    @k
    private final DateInfo startDateInfo;

    /* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
    @d
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\u000b\u0010\fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\r\u001a\u0004\b\u0010\u0010\u000fR\u001a\u0010\u0005\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0011\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\r\u001a\u0004\b\u0012\u0010\u000fR\u001a\u0010\u0007\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\r\u001a\u0004\b\u0013\u0010\u000fR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$DateInfo;", "Landroid/os/Parcelable;", "", "startDate", "selectedDate", "title", "errorTitle", "dateFormat", "", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$Validator;", "validators", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "f", "()Ljava/lang/String;", "e", "getTitle", "d", "c", "Ljava/util/List;", "g", "()Ljava/util/List;", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class DateInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<DateInfo> CREATOR = new a();

        @c("dateFormat")
        @k
        private final String dateFormat;

        @c("errorTitle")
        @k
        private final String errorTitle;

        @c("selectedDate")
        @k
        private final String selectedDate;

        @c("startDate")
        @k
        private final String startDate;

        @c("title")
        @k
        private final String title;

        @c("validators")
        @k
        private final List<Validator> validators;

        /* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<DateInfo> {
            @Override // android.os.Parcelable.Creator
            public final DateInfo createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                String string4 = parcel.readString();
                String string5 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(Validator.CREATOR, parcel, arrayList, iC2, 1);
                }
                return new DateInfo(string, string2, string3, string4, string5, arrayList);
            }

            @Override // android.os.Parcelable.Creator
            public final DateInfo[] newArray(int i12) {
                return new DateInfo[i12];
            }
        }

        public DateInfo(@k String str, @k String str2, @k String str3, @k String str4, @k String str5, @k List<Validator> list) {
            this.startDate = str;
            this.selectedDate = str2;
            this.title = str3;
            this.errorTitle = str4;
            this.dateFormat = str5;
            this.validators = list;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final String getDateFormat() {
            return this.dateFormat;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final String getErrorTitle() {
            return this.errorTitle;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        @k
        /* renamed from: e, reason: from getter */
        public final String getSelectedDate() {
            return this.selectedDate;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof DateInfo)) {
                return false;
            }
            DateInfo dateInfo = (DateInfo) obj;
            return L.f(this.startDate, dateInfo.startDate) && L.f(this.selectedDate, dateInfo.selectedDate) && L.f(this.title, dateInfo.title) && L.f(this.errorTitle, dateInfo.errorTitle) && L.f(this.dateFormat, dateInfo.dateFormat) && L.f(this.validators, dateInfo.validators);
        }

        @k
        /* renamed from: f, reason: from getter */
        public final String getStartDate() {
            return this.startDate;
        }

        @k
        public final List<Validator> g() {
            return this.validators;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            return this.validators.hashCode() + H.d(H.d(H.d(H.d(this.startDate.hashCode() * 31, 31, this.selectedDate), 31, this.title), 31, this.errorTitle), 31, this.dateFormat);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("DateInfo(startDate=");
            sb2.append(this.startDate);
            sb2.append(", selectedDate=");
            sb2.append(this.selectedDate);
            sb2.append(", title=");
            sb2.append(this.title);
            sb2.append(", errorTitle=");
            sb2.append(this.errorTitle);
            sb2.append(", dateFormat=");
            sb2.append(this.dateFormat);
            sb2.append(", validators=");
            return H.p(sb2, this.validators, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.startDate);
            parcel.writeString(this.selectedDate);
            parcel.writeString(this.title);
            parcel.writeString(this.errorTitle);
            parcel.writeString(this.dateFormat);
            Iterator itJ = C0.j(this.validators, parcel);
            while (itJ.hasNext()) {
                ((Validator) itJ.next()).writeToParcel(parcel, i12);
            }
        }
    }

    /* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$Validator;", "Landroid/os/Parcelable;", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$Validator$Type;", "type", "", "value", "message", "<init>", "(Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$Validator$Type;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$Validator$Type;", "c", "()Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$Validator$Type;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getMessage", "Type", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @d
    public static final /* data */ class Validator implements Parcelable {

        @k
        public static final Parcelable.Creator<Validator> CREATOR = new a();

        @c("message")
        @k
        private final String message;

        @c("type")
        @k
        private final Type type;

        @c("value")
        @k
        private final String value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/trx_promo_public/deeplink/TrxPromoConfigureDateRangePickerLinkContent$Validator$Type;", "", "(Ljava/lang/String;I)V", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN", "LESS_THAN_OR_EQUAL", "EQUAL", "NOT_EQUAL", "_avito_trx-promo_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @c("equal")
            public static final Type EQUAL;

            @c("greater_than")
            public static final Type GREATER_THAN;

            @c("greater_than_or_equal")
            public static final Type GREATER_THAN_OR_EQUAL;

            @c("less_than")
            public static final Type LESS_THAN;

            @c("less_than_or_equal")
            public static final Type LESS_THAN_OR_EQUAL;

            @c("not_equal")
            public static final Type NOT_EQUAL;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f304501b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f304502c;

            static {
                Type type = new Type("GREATER_THAN", 0);
                GREATER_THAN = type;
                Type type2 = new Type("GREATER_THAN_OR_EQUAL", 1);
                GREATER_THAN_OR_EQUAL = type2;
                Type type3 = new Type("LESS_THAN", 2);
                LESS_THAN = type3;
                Type type4 = new Type("LESS_THAN_OR_EQUAL", 3);
                LESS_THAN_OR_EQUAL = type4;
                Type type5 = new Type("EQUAL", 4);
                EQUAL = type5;
                Type type6 = new Type("NOT_EQUAL", 5);
                NOT_EQUAL = type6;
                Type[] typeArr = {type, type2, type3, type4, type5, type6};
                f304501b = typeArr;
                f304502c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f304501b.clone();
            }
        }

        /* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Validator> {
            @Override // android.os.Parcelable.Creator
            public final Validator createFromParcel(Parcel parcel) {
                return new Validator(Type.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
            }

            @Override // android.os.Parcelable.Creator
            public final Validator[] newArray(int i12) {
                return new Validator[i12];
            }
        }

        public Validator(@k Type type, @k String str, @k String str2) {
            this.type = type;
            this.value = str;
            this.message = str2;
        }

        @k
        /* renamed from: c, reason: from getter */
        public final Type getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Validator)) {
                return false;
            }
            Validator validator = (Validator) obj;
            return this.type == validator.type && L.f(this.value, validator.value) && L.f(this.message, validator.message);
        }

        @k
        public final String getMessage() {
            return this.message;
        }

        @k
        public final String getValue() {
            return this.value;
        }

        public final int hashCode() {
            return this.message.hashCode() + H.d(this.type.hashCode() * 31, 31, this.value);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Validator(type=");
            sb2.append(this.type);
            sb2.append(", value=");
            sb2.append(this.value);
            sb2.append(", message=");
            return C22026a.c(sb2, this.message, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.type.name());
            parcel.writeString(this.value);
            parcel.writeString(this.message);
        }
    }

    /* compiled from: TrxPromoConfigureDateRangePickerLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoConfigureDateRangePickerLinkContent> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoConfigureDateRangePickerLinkContent createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            Parcelable.Creator<DateInfo> creator = DateInfo.CREATOR;
            return new TrxPromoConfigureDateRangePickerLinkContent(string, creator.createFromParcel(parcel), creator.createFromParcel(parcel), parcel.readString(), (ButtonAction) parcel.readParcelable(TrxPromoConfigureDateRangePickerLinkContent.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoConfigureDateRangePickerLinkContent[] newArray(int i12) {
            return new TrxPromoConfigureDateRangePickerLinkContent[i12];
        }
    }

    public TrxPromoConfigureDateRangePickerLinkContent(@k String str, @k DateInfo dateInfo, @k DateInfo dateInfo2, @k String str2, @k ButtonAction buttonAction) {
        this.screenTitle = str;
        this.startDateInfo = dateInfo;
        this.endDateInfo = dateInfo2;
        this.errorMessage = str2;
        this.button = buttonAction;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final DateInfo getEndDateInfo() {
        return this.endDateInfo;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getErrorMessage() {
        return this.errorMessage;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrxPromoConfigureDateRangePickerLinkContent)) {
            return false;
        }
        TrxPromoConfigureDateRangePickerLinkContent trxPromoConfigureDateRangePickerLinkContent = (TrxPromoConfigureDateRangePickerLinkContent) obj;
        return L.f(this.screenTitle, trxPromoConfigureDateRangePickerLinkContent.screenTitle) && L.f(this.startDateInfo, trxPromoConfigureDateRangePickerLinkContent.startDateInfo) && L.f(this.endDateInfo, trxPromoConfigureDateRangePickerLinkContent.endDateInfo) && L.f(this.errorMessage, trxPromoConfigureDateRangePickerLinkContent.errorMessage) && L.f(this.button, trxPromoConfigureDateRangePickerLinkContent.button);
    }

    @k
    /* renamed from: f, reason: from getter */
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    @k
    /* renamed from: g, reason: from getter */
    public final DateInfo getStartDateInfo() {
        return this.startDateInfo;
    }

    public final int hashCode() {
        return this.button.hashCode() + H.d((this.endDateInfo.hashCode() + ((this.startDateInfo.hashCode() + (this.screenTitle.hashCode() * 31)) * 31)) * 31, 31, this.errorMessage);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoConfigureDateRangePickerLinkContent(screenTitle=");
        sb2.append(this.screenTitle);
        sb2.append(", startDateInfo=");
        sb2.append(this.startDateInfo);
        sb2.append(", endDateInfo=");
        sb2.append(this.endDateInfo);
        sb2.append(", errorMessage=");
        sb2.append(this.errorMessage);
        sb2.append(", button=");
        return com.avito.android.advert.item.delivery_suggests.l.p(sb2, this.button, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.screenTitle);
        this.startDateInfo.writeToParcel(parcel, i12);
        this.endDateInfo.writeToParcel(parcel, i12);
        parcel.writeString(this.errorMessage);
        parcel.writeParcelable(this.button, i12);
    }
}
