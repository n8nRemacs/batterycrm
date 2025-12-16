package com.avito.android.tariff.cpx.limit.sheet.deeplink;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import kotlin.Metadata;

/* compiled from: TariffCpxLimitShowLink.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/avito/android/tariff/cpx/limit/sheet/deeplink/InputField;", "Landroid/os/Parcelable;", "", "title", "", "value", "", "valuePenny", "<init>", "(Ljava/lang/String;ILjava/lang/Long;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "I", "c", "()I", "Ljava/lang/Long;", "d", "()Ljava/lang/Long;", "_avito_tariff_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class InputField implements Parcelable {

    @k
    public static final Parcelable.Creator<InputField> CREATOR = new a();

    @com.google.gson.annotations.c("title")
    @k
    private final String title;

    @com.google.gson.annotations.c("value")
    private final int value;

    @com.google.gson.annotations.c("valuePenny")
    @l
    private final Long valuePenny;

    /* compiled from: TariffCpxLimitShowLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<InputField> {
        @Override // android.os.Parcelable.Creator
        public final InputField createFromParcel(Parcel parcel) {
            return new InputField(parcel.readString(), parcel.readInt(), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final InputField[] newArray(int i12) {
            return new InputField[i12];
        }
    }

    public InputField(@k String str, int i12, @l Long l12) {
        this.title = str;
        this.value = i12;
        this.valuePenny = l12;
    }

    /* renamed from: c, reason: from getter */
    public final int getValue() {
        return this.value;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final Long getValuePenny() {
        return this.valuePenny;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        parcel.writeInt(this.value);
        Long l12 = this.valuePenny;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }
}
