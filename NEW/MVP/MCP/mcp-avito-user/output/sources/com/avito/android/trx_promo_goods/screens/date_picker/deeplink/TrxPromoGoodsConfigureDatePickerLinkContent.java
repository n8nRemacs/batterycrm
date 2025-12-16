package com.avito.android.trx_promo_goods.screens.date_picker.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: TrxPromoGoodsConfigureDatePickerLinkContent.kt */
@K51.d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u001bB7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\b\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\n0\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerLinkContent;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/ButtonAction;", "button", "Lcom/avito/android/remote/model/text/AttributedText;", "noteLabel", "", "screenTitle", "startDate", "", "Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerLinkContent$Validator;", "validators", "<init>", "(Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "Lcom/avito/android/remote/model/ButtonAction;", "c", "()Lcom/avito/android/remote/model/ButtonAction;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "Ljava/lang/String;", "e", "()Ljava/lang/String;", "f", "Ljava/util/List;", "g", "()Ljava/util/List;", "Validator", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TrxPromoGoodsConfigureDatePickerLinkContent implements Parcelable {

    @k
    public static final Parcelable.Creator<TrxPromoGoodsConfigureDatePickerLinkContent> CREATOR = new a();

    @com.google.gson.annotations.c("button")
    @k
    private final ButtonAction button;

    @com.google.gson.annotations.c("noteLabel")
    @l
    private final AttributedText noteLabel;

    @com.google.gson.annotations.c("screenTitle")
    @k
    private final String screenTitle;

    @com.google.gson.annotations.c("startDate")
    @k
    private final String startDate;

    @com.google.gson.annotations.c("validators")
    @k
    private final List<Validator> validators;

    /* compiled from: TrxPromoGoodsConfigureDatePickerLinkContent.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0010B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\u000f\u0010\u000e¨\u0006\u0011"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerLinkContent$Validator;", "Landroid/os/Parcelable;", "Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerLinkContent$Validator$Type;", "type", "", "value", "message", "<init>", "(Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerLinkContent$Validator$Type;Ljava/lang/String;Ljava/lang/String;)V", "Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerLinkContent$Validator$Type;", "c", "()Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerLinkContent$Validator$Type;", "Ljava/lang/String;", "getValue", "()Ljava/lang/String;", "getMessage", "Type", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class Validator implements Parcelable {

        @k
        public static final Parcelable.Creator<Validator> CREATOR = new a();

        @com.google.gson.annotations.c("message")
        @k
        private final String message;

        @com.google.gson.annotations.c("type")
        @k
        private final Type type;

        @com.google.gson.annotations.c("value")
        @k
        private final String value;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: TrxPromoGoodsConfigureDatePickerLinkContent.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\b¨\u0006\t"}, d2 = {"Lcom/avito/android/trx_promo_goods/screens/date_picker/deeplink/TrxPromoGoodsConfigureDatePickerLinkContent$Validator$Type;", "", "(Ljava/lang/String;I)V", "GREATER_THAN", "GREATER_THAN_OR_EQUAL", "LESS_THAN", "LESS_THAN_OR_EQUAL", "EQUAL", "NOT_EQUAL", "_avito_trx-promo-goods_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Type {

            @com.google.gson.annotations.c("equal")
            public static final Type EQUAL;

            @com.google.gson.annotations.c("greater_than")
            public static final Type GREATER_THAN;

            @com.google.gson.annotations.c("greater_than_or_equal")
            public static final Type GREATER_THAN_OR_EQUAL;

            @com.google.gson.annotations.c("less_than")
            public static final Type LESS_THAN;

            @com.google.gson.annotations.c("less_than_or_equal")
            public static final Type LESS_THAN_OR_EQUAL;

            @com.google.gson.annotations.c("not_equal")
            public static final Type NOT_EQUAL;

            /* renamed from: b, reason: collision with root package name */
            public static final /* synthetic */ Type[] f303671b;

            /* renamed from: c, reason: collision with root package name */
            public static final /* synthetic */ kotlin.enums.a f303672c;

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
                f303671b = typeArr;
                f303672c = kotlin.enums.c.a(typeArr);
            }

            private Type(String str, int i12) {
            }

            public static Type valueOf(String str) {
                return (Type) Enum.valueOf(Type.class, str);
            }

            public static Type[] values() {
                return (Type[]) f303671b.clone();
            }
        }

        /* compiled from: TrxPromoGoodsConfigureDatePickerLinkContent.kt */
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

    /* compiled from: TrxPromoGoodsConfigureDatePickerLinkContent.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TrxPromoGoodsConfigureDatePickerLinkContent> {
        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureDatePickerLinkContent createFromParcel(Parcel parcel) {
            ButtonAction buttonAction = (ButtonAction) parcel.readParcelable(TrxPromoGoodsConfigureDatePickerLinkContent.class.getClassLoader());
            AttributedText attributedText = (AttributedText) parcel.readParcelable(TrxPromoGoodsConfigureDatePickerLinkContent.class.getClassLoader());
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(Validator.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new TrxPromoGoodsConfigureDatePickerLinkContent(buttonAction, attributedText, string, string2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TrxPromoGoodsConfigureDatePickerLinkContent[] newArray(int i12) {
            return new TrxPromoGoodsConfigureDatePickerLinkContent[i12];
        }
    }

    public TrxPromoGoodsConfigureDatePickerLinkContent(@k ButtonAction buttonAction, @l AttributedText attributedText, @k String str, @k String str2, @k List<Validator> list) {
        this.button = buttonAction;
        this.noteLabel = attributedText;
        this.screenTitle = str;
        this.startDate = str2;
        this.validators = list;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final ButtonAction getButton() {
        return this.button;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final AttributedText getNoteLabel() {
        return this.noteLabel;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    /* renamed from: e, reason: from getter */
    public final String getScreenTitle() {
        return this.screenTitle;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TrxPromoGoodsConfigureDatePickerLinkContent)) {
            return false;
        }
        TrxPromoGoodsConfigureDatePickerLinkContent trxPromoGoodsConfigureDatePickerLinkContent = (TrxPromoGoodsConfigureDatePickerLinkContent) obj;
        return L.f(this.button, trxPromoGoodsConfigureDatePickerLinkContent.button) && L.f(this.noteLabel, trxPromoGoodsConfigureDatePickerLinkContent.noteLabel) && L.f(this.screenTitle, trxPromoGoodsConfigureDatePickerLinkContent.screenTitle) && L.f(this.startDate, trxPromoGoodsConfigureDatePickerLinkContent.startDate) && L.f(this.validators, trxPromoGoodsConfigureDatePickerLinkContent.validators);
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

    public final int hashCode() {
        int iHashCode = this.button.hashCode() * 31;
        AttributedText attributedText = this.noteLabel;
        return this.validators.hashCode() + H.d(H.d((iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.screenTitle), 31, this.startDate);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TrxPromoGoodsConfigureDatePickerLinkContent(button=");
        sb2.append(this.button);
        sb2.append(", noteLabel=");
        sb2.append(this.noteLabel);
        sb2.append(", screenTitle=");
        sb2.append(this.screenTitle);
        sb2.append(", startDate=");
        sb2.append(this.startDate);
        sb2.append(", validators=");
        return H.p(sb2, this.validators, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.button, i12);
        parcel.writeParcelable(this.noteLabel, i12);
        parcel.writeString(this.screenTitle);
        parcel.writeString(this.startDate);
        Iterator itJ = C0.j(this.validators, parcel);
        while (itJ.hasNext()) {
            ((Validator) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
