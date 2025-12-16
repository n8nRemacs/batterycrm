package com.avito.android.printable_text;

import K51.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PrintableText.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/printable_text/RawPrintableText;", "Lcom/avito/android/printable_text/PrintableText;", "_common_printable-text_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class RawPrintableText implements PrintableText {

    @k
    public static final Parcelable.Creator<RawPrintableText> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final CharSequence f221872b;

    /* compiled from: PrintableText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<RawPrintableText> {
        @Override // android.os.Parcelable.Creator
        public final RawPrintableText createFromParcel(Parcel parcel) {
            return new RawPrintableText((CharSequence) TextUtils.CHAR_SEQUENCE_CREATOR.createFromParcel(parcel));
        }

        @Override // android.os.Parcelable.Creator
        public final RawPrintableText[] newArray(int i12) {
            return new RawPrintableText[i12];
        }
    }

    public RawPrintableText(@k CharSequence charSequence) {
        this.f221872b = charSequence;
    }

    @Override // com.avito.android.printable_text.PrintableText
    @k
    public final CharSequence Y4(@k Context context) {
        return this.f221872b;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof RawPrintableText) && L.f(this.f221872b, ((RawPrintableText) obj).f221872b);
    }

    public final int hashCode() {
        return this.f221872b.hashCode();
    }

    @Override // com.avito.android.printable_text.PrintableText
    @k
    public final String k0(@k Context context) {
        return this.f221872b.toString();
    }

    @k
    public final String toString() {
        return AK.c.r(new StringBuilder("RawPrintableText(s="), this.f221872b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        TextUtils.writeToParcel(this.f221872b, parcel, i12);
    }
}
