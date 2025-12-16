package com.avito.android.remote.autoteka.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.google.gson.annotations.c;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: TotalWidget.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0006\u0010\u0007R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\b\u001a\u0004\b\u000b\u0010\nR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\b\u001a\u0004\b\f\u0010\n¨\u0006\r"}, d2 = {"Lcom/avito/android/remote/autoteka/model/TotalWidget;", "Landroid/os/Parcelable;", "", "label", "value", "strikeThrough", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "Ljava/lang/String;", "getLabel", "()Ljava/lang/String;", "getValue", "c", "_avito-discouraged_avito-api_autoteka"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class TotalWidget implements Parcelable {

    @k
    public static final Parcelable.Creator<TotalWidget> CREATOR = new a();

    @c("label")
    @k
    private final String label;

    @c("strikeThrough")
    @l
    private final String strikeThrough;

    @c("value")
    @k
    private final String value;

    /* compiled from: TotalWidget.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TotalWidget> {
        @Override // android.os.Parcelable.Creator
        public final TotalWidget createFromParcel(Parcel parcel) {
            return new TotalWidget(parcel.readString(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final TotalWidget[] newArray(int i12) {
            return new TotalWidget[i12];
        }
    }

    public TotalWidget(@k String str, @k String str2, @l String str3) {
        this.label = str;
        this.value = str2;
        this.strikeThrough = str3;
    }

    @l
    /* renamed from: c, reason: from getter */
    public final String getStrikeThrough() {
        return this.strikeThrough;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TotalWidget)) {
            return false;
        }
        TotalWidget totalWidget = (TotalWidget) obj;
        return L.f(this.label, totalWidget.label) && L.f(this.value, totalWidget.value) && L.f(this.strikeThrough, totalWidget.strikeThrough);
    }

    @k
    public final String getLabel() {
        return this.label;
    }

    @k
    public final String getValue() {
        return this.value;
    }

    public final int hashCode() {
        int iD2 = H.d(this.label.hashCode() * 31, 31, this.value);
        String str = this.strikeThrough;
        return iD2 + (str == null ? 0 : str.hashCode());
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TotalWidget(label=");
        sb2.append(this.label);
        sb2.append(", value=");
        sb2.append(this.value);
        sb2.append(", strikeThrough=");
        return C22026a.c(sb2, this.strikeThrough, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.label);
        parcel.writeString(this.value);
        parcel.writeString(this.strikeThrough);
    }

    public /* synthetic */ TotalWidget(String str, String str2, String str3, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? null : str3);
    }
}
