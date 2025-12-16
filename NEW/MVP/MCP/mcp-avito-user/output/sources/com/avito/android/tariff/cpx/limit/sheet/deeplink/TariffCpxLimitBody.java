package com.avito.android.tariff.cpx.limit.sheet.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.ButtonAction;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: TariffCpxLimitShowLink.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0007\u0018\u00002\u00020\u0001BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0016\u0010\u0015R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0017\u0010\u0012R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\n\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0018\u001a\u0004\b\u001b\u0010\u001aR\u001c\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u001c\u0010\r\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010\u001c\u001a\u0004\b\u001f\u0010\u001e¨\u0006 "}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/TariffCpxLimitBody;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "title", "Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/InputField;", "limit", "remains", "hint", "Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/Validator;", "minChangeValidation", "minLimitValidation", "Lcom/avito/android/remote/model/ButtonAction;", "primaryAction", "secondaryAction", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/InputField;Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/InputField;Lcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/Validator;Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/Validator;Lcom/avito/android/remote/model/ButtonAction;Lcom/avito/android/remote/model/ButtonAction;)V", "Lcom/avito/android/remote/model/text/AttributedText;", "j", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/InputField;", "d", "()Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/InputField;", "h", "c", "Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/Validator;", "e", "()Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/Validator;", "f", "Lcom/avito/android/remote/model/ButtonAction;", "g", "()Lcom/avito/android/remote/model/ButtonAction;", "i", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TariffCpxLimitBody implements Parcelable {

    @k
    public static final Parcelable.Creator<TariffCpxLimitBody> CREATOR = new a();

    @com.google.gson.annotations.c("hint")
    @l
    private final AttributedText hint;

    @com.google.gson.annotations.c("limit")
    @k
    private final InputField limit;

    @com.google.gson.annotations.c("minChangeValidation")
    @l
    private final Validator minChangeValidation;

    @com.google.gson.annotations.c("minLimitValidation")
    @l
    private final Validator minLimitValidation;

    @com.google.gson.annotations.c("primaryAction")
    @l
    private final ButtonAction primaryAction;

    @com.google.gson.annotations.c("remains")
    @l
    private final InputField remains;

    @com.google.gson.annotations.c("secondaryAction")
    @l
    private final ButtonAction secondaryAction;

    @com.google.gson.annotations.c("title")
    @k
    private final AttributedText title;

    /* compiled from: TariffCpxLimitShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCpxLimitBody> {
        @Override // android.os.Parcelable.Creator
        public final TariffCpxLimitBody createFromParcel(Parcel parcel) {
            AttributedText attributedText = (AttributedText) parcel.readParcelable(TariffCpxLimitBody.class.getClassLoader());
            Parcelable.Creator<InputField> creator = InputField.CREATOR;
            return new TariffCpxLimitBody(attributedText, creator.createFromParcel(parcel), parcel.readInt() == 0 ? null : creator.createFromParcel(parcel), (AttributedText) parcel.readParcelable(TariffCpxLimitBody.class.getClassLoader()), parcel.readInt() == 0 ? null : Validator.CREATOR.createFromParcel(parcel), parcel.readInt() != 0 ? Validator.CREATOR.createFromParcel(parcel) : null, (ButtonAction) parcel.readParcelable(TariffCpxLimitBody.class.getClassLoader()), (ButtonAction) parcel.readParcelable(TariffCpxLimitBody.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCpxLimitBody[] newArray(int i12) {
            return new TariffCpxLimitBody[i12];
        }
    }

    public TariffCpxLimitBody(@k AttributedText attributedText, @k InputField inputField, @l InputField inputField2, @l AttributedText attributedText2, @l Validator validator, @l Validator validator2, @l ButtonAction buttonAction, @l ButtonAction buttonAction2) {
        this.title = attributedText;
        this.limit = inputField;
        this.remains = inputField2;
        this.hint = attributedText2;
        this.minChangeValidation = validator;
        this.minLimitValidation = validator2;
        this.primaryAction = buttonAction;
        this.secondaryAction = buttonAction2;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final AttributedText getHint() {
        return this.hint;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final InputField getLimit() {
        return this.limit;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    /* renamed from: e, reason: from getter */
    public final Validator getMinChangeValidation() {
        return this.minChangeValidation;
    }

    @l
    /* renamed from: f, reason: from getter */
    public final Validator getMinLimitValidation() {
        return this.minLimitValidation;
    }

    @l
    /* renamed from: g, reason: from getter */
    public final ButtonAction getPrimaryAction() {
        return this.primaryAction;
    }

    @l
    /* renamed from: h, reason: from getter */
    public final InputField getRemains() {
        return this.remains;
    }

    @l
    /* renamed from: i, reason: from getter */
    public final ButtonAction getSecondaryAction() {
        return this.secondaryAction;
    }

    @k
    /* renamed from: j, reason: from getter */
    public final AttributedText getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeParcelable(this.title, i12);
        this.limit.writeToParcel(parcel, i12);
        InputField inputField = this.remains;
        if (inputField == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            inputField.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.hint, i12);
        Validator validator = this.minChangeValidation;
        if (validator == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            validator.writeToParcel(parcel, i12);
        }
        Validator validator2 = this.minLimitValidation;
        if (validator2 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            validator2.writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.primaryAction, i12);
        parcel.writeParcelable(this.secondaryAction, i12);
    }
}
