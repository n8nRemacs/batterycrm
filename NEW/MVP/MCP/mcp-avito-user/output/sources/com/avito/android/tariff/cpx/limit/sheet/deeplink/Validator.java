package com.avito.android.tariff.cpx.limit.sheet.deeplink;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;

/* compiled from: TariffCpxLimitShowLink.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/Validator;", "Landroid/os/Parcelable;", "", "value", "Lcom/avito/android/remote/model/text/AttributedText;", "hint", "<init>", "(ILcom/avito/android/remote/model/text/AttributedText;)V", "I", "d", "()I", "Lcom/avito/android/remote/model/text/AttributedText;", "c", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class Validator implements Parcelable {

    @k
    public static final Parcelable.Creator<Validator> CREATOR = new a();

    @com.google.gson.annotations.c("hint")
    @k
    private final AttributedText hint;

    @com.google.gson.annotations.c("value")
    private final int value;

    /* compiled from: TariffCpxLimitShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Validator> {
        @Override // android.os.Parcelable.Creator
        public final Validator createFromParcel(Parcel parcel) {
            return new Validator(parcel.readInt(), (AttributedText) parcel.readParcelable(Validator.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Validator[] newArray(int i12) {
            return new Validator[i12];
        }
    }

    public Validator(int i12, @k AttributedText attributedText) {
        this.value = i12;
        this.hint = attributedText;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getHint() {
        return this.hint;
    }

    /* renamed from: d, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.value);
        parcel.writeParcelable(this.hint, i12);
    }
}
