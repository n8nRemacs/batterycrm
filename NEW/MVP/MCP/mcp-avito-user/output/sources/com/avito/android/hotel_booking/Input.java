package com.avito.android.hotel_booking;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.printable_text.PrintableText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HotelBookingEnterDataDeeplink.kt */
@K51.d
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0013\u0010\u0011R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0016\u0010\n\u001a\u0004\u0018\u00010\t8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u0017¨\u0006\u0018"}, d2 = {"Lcom/avito/android/hotel_booking/Input;", "Landroid/os/Parcelable;", "", "id", "text", "hint", "", "Lcom/avito/android/hotel_booking/InputConstraint;", "constraints", "", "_isRequired", "Lcom/avito/android/printable_text/PrintableText;", "errorMessage", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/printable_text/PrintableText;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "getText", "d", "Ljava/util/List;", "c", "()Ljava/util/List;", "Ljava/lang/Boolean;", "_avito_hotel-booking_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class Input implements Parcelable {

    @k
    public static final Parcelable.Creator<Input> CREATOR = new a();

    @com.google.gson.annotations.c("isRequired")
    @l
    private final Boolean _isRequired;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final transient PrintableText f163267b;

    @com.google.gson.annotations.c("constraints")
    @l
    private final List<InputConstraint> constraints;

    @com.google.gson.annotations.c("hint")
    @l
    private final String hint;

    @com.google.gson.annotations.c("id")
    @l
    private final String id;

    @com.google.gson.annotations.c("text")
    @l
    private final String text;

    /* compiled from: HotelBookingEnterDataDeeplink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Input> {
        @Override // android.os.Parcelable.Creator
        public final Input createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Input.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new Input(string, string2, string3, arrayList, boolValueOf, (PrintableText) parcel.readParcelable(Input.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final Input[] newArray(int i12) {
            return new Input[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Input(@l String str, @l String str2, @l String str3, @l List<? extends InputConstraint> list, @l Boolean bool, @l PrintableText printableText) {
        this.id = str;
        this.text = str2;
        this.hint = str3;
        this.constraints = list;
        this._isRequired = bool;
        this.f163267b = printableText;
    }

    public static Input a(Input input, String str, PrintableText printableText, int i12) {
        String str2 = input.id;
        if ((i12 & 2) != 0) {
            str = input.text;
        }
        String str3 = input.hint;
        List<InputConstraint> list = input.constraints;
        Boolean bool = input._isRequired;
        input.getClass();
        return new Input(str2, str, str3, list, bool, printableText);
    }

    @l
    public final List<InputConstraint> c() {
        return this.constraints;
    }

    @l
    /* renamed from: d, reason: from getter */
    public final String getHint() {
        return this.hint;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean e() {
        Boolean bool = this._isRequired;
        if (bool != null) {
            return bool.booleanValue();
        }
        return false;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Input)) {
            return false;
        }
        Input input = (Input) obj;
        return L.f(this.id, input.id) && L.f(this.text, input.text) && L.f(this.hint, input.hint) && L.f(this.constraints, input.constraints) && L.f(this._isRequired, input._isRequired) && L.f(this.f163267b, input.f163267b);
    }

    @l
    public final String getId() {
        return this.id;
    }

    @l
    public final String getText() {
        return this.text;
    }

    public final int hashCode() {
        String str = this.id;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.text;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.hint;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<InputConstraint> list = this.constraints;
        int iHashCode4 = (iHashCode3 + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this._isRequired;
        int iHashCode5 = (iHashCode4 + (bool == null ? 0 : bool.hashCode())) * 31;
        PrintableText printableText = this.f163267b;
        return iHashCode5 + (printableText != null ? printableText.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Input(id=");
        sb2.append(this.id);
        sb2.append(", text=");
        sb2.append(this.text);
        sb2.append(", hint=");
        sb2.append(this.hint);
        sb2.append(", constraints=");
        sb2.append(this.constraints);
        sb2.append(", _isRequired=");
        sb2.append(this._isRequired);
        sb2.append(", errorMessage=");
        return AK.c.m(sb2, this.f163267b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.id);
        parcel.writeString(this.text);
        parcel.writeString(this.hint);
        List<InputConstraint> list = this.constraints;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        Boolean bool = this._isRequired;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeParcelable(this.f163267b, i12);
    }
}
