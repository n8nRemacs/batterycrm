package com.avito.android.printable_text;

import K51.d;
import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.SpannableStringBuilder;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PrintableText.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/printable_text/SpannableStringBuilderPrintableText;", "Lcom/avito/android/printable_text/PrintableText;", "_common_printable-text_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class SpannableStringBuilderPrintableText implements PrintableText {

    @k
    public static final Parcelable.Creator<SpannableStringBuilderPrintableText> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p<SpannableStringBuilder, Resources, CharSequence> f221873b;

    /* compiled from: PrintableText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SpannableStringBuilderPrintableText> {
        @Override // android.os.Parcelable.Creator
        public final SpannableStringBuilderPrintableText createFromParcel(Parcel parcel) {
            return new SpannableStringBuilderPrintableText((p) parcel.readSerializable());
        }

        @Override // android.os.Parcelable.Creator
        public final SpannableStringBuilderPrintableText[] newArray(int i12) {
            return new SpannableStringBuilderPrintableText[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SpannableStringBuilderPrintableText(@k p<? super SpannableStringBuilder, ? super Resources, ? extends CharSequence> pVar) {
        this.f221873b = pVar;
    }

    @Override // com.avito.android.printable_text.PrintableText
    @k
    public final CharSequence Y4(@k Context context) {
        return this.f221873b.invoke(new SpannableStringBuilder(), context.getResources());
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof SpannableStringBuilderPrintableText) && L.f(this.f221873b, ((SpannableStringBuilderPrintableText) obj).f221873b);
    }

    public final int hashCode() {
        return this.f221873b.hashCode();
    }

    @Override // com.avito.android.printable_text.PrintableText
    @k
    public final String k0(@k Context context) {
        return Y4(context).toString();
    }

    @k
    public final String toString() {
        return "SpannableStringBuilderPrintableText(spannableStringBuilderBlock=" + this.f221873b + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeSerializable((Serializable) this.f221873b);
    }
}
