package com.avito.android.str_cancellation_settings.models.items;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.H0;
import com.avito.android.printable_text.PrintableText;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CancellationDiscountInputItem.kt */
@d
@H0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/str_cancellation_settings/models/items/CancellationDiscountInputItem;", "Lcom/avito/conveyor_item/a;", "Landroid/os/Parcelable;", "_avito_str-cancellation-settings_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class CancellationDiscountInputItem implements com.avito.conveyor_item.a, Parcelable {

    @k
    public static final Parcelable.Creator<CancellationDiscountInputItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f288394b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f288395c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f288396d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final PrintableText f288397e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f288398f;

    /* compiled from: CancellationDiscountInputItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CancellationDiscountInputItem> {
        @Override // android.os.Parcelable.Creator
        public final CancellationDiscountInputItem createFromParcel(Parcel parcel) {
            return new CancellationDiscountInputItem(parcel.readString(), parcel.readString(), parcel.readString(), (PrintableText) parcel.readParcelable(CancellationDiscountInputItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final CancellationDiscountInputItem[] newArray(int i12) {
            return new CancellationDiscountInputItem[i12];
        }
    }

    public CancellationDiscountInputItem(@k String str, @l String str2, @k String str3, @l PrintableText printableText, @l String str4) {
        this.f288394b = str;
        this.f288395c = str2;
        this.f288396d = str3;
        this.f288397e = printableText;
        this.f288398f = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CancellationDiscountInputItem)) {
            return false;
        }
        CancellationDiscountInputItem cancellationDiscountInputItem = (CancellationDiscountInputItem) obj;
        return L.f(this.f288394b, cancellationDiscountInputItem.f288394b) && L.f(this.f288395c, cancellationDiscountInputItem.f288395c) && L.f(this.f288396d, cancellationDiscountInputItem.f288396d) && L.f(this.f288397e, cancellationDiscountInputItem.f288397e) && L.f(this.f288398f, cancellationDiscountInputItem.f288398f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF83558b() {
        return getF288394b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF288394b() {
        return this.f288394b;
    }

    public final int hashCode() {
        int iHashCode = this.f288394b.hashCode() * 31;
        String str = this.f288395c;
        int iD2 = H.d((iHashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.f288396d);
        PrintableText printableText = this.f288397e;
        int iHashCode2 = (iD2 + (printableText == null ? 0 : printableText.hashCode())) * 31;
        String str2 = this.f288398f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CancellationDiscountInputItem(stringId=");
        sb2.append(this.f288394b);
        sb2.append(", value=");
        sb2.append(this.f288395c);
        sb2.append(", hint=");
        sb2.append(this.f288396d);
        sb2.append(", subtitle=");
        sb2.append(this.f288397e);
        sb2.append(", errorText=");
        return C22026a.c(sb2, this.f288398f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f288394b);
        parcel.writeString(this.f288395c);
        parcel.writeString(this.f288396d);
        parcel.writeParcelable(this.f288397e, i12);
        parcel.writeString(this.f288398f);
    }
}
