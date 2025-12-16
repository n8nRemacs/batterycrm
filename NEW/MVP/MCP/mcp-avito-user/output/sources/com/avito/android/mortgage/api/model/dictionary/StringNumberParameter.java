package com.avito.android.mortgage.api.model.dictionary;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ProgramParameter.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/mortgage/api/model/dictionary/StringNumberParameter;", "Landroid/os/Parcelable;", "", "value", "", "stringValue", "<init>", "(FLjava/lang/String;)V", "F", "c", "()F", "Ljava/lang/String;", "getStringValue", "()Ljava/lang/String;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class StringNumberParameter implements Parcelable {

    @k
    public static final Parcelable.Creator<StringNumberParameter> CREATOR = new a();

    @c("stringValue")
    @k
    private final String stringValue;

    @c("value")
    private final float value;

    /* compiled from: ProgramParameter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StringNumberParameter> {
        @Override // android.os.Parcelable.Creator
        public final StringNumberParameter createFromParcel(Parcel parcel) {
            return new StringNumberParameter(parcel.readFloat(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final StringNumberParameter[] newArray(int i12) {
            return new StringNumberParameter[i12];
        }
    }

    public StringNumberParameter(float f12, @k String str) {
        this.value = f12;
        this.stringValue = str;
    }

    /* renamed from: c, reason: from getter */
    public final float getValue() {
        return this.value;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringNumberParameter)) {
            return false;
        }
        StringNumberParameter stringNumberParameter = (StringNumberParameter) obj;
        return Float.compare(this.value, stringNumberParameter.value) == 0 && L.f(this.stringValue, stringNumberParameter.stringValue);
    }

    public final int hashCode() {
        return this.stringValue.hashCode() + (Float.hashCode(this.value) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StringNumberParameter(value=");
        sb2.append(this.value);
        sb2.append(", stringValue=");
        return C22026a.c(sb2, this.stringValue, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeFloat(this.value);
        parcel.writeString(this.stringValue);
    }
}
