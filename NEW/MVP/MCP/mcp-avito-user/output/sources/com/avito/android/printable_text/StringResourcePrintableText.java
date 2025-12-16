package com.avito.android.printable_text;

import K51.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import j.e0;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: PrintableText.kt */
@d
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/printable_text/StringResourcePrintableText;", "Lcom/avito/android/printable_text/PrintableText;", "_common_printable-text_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class StringResourcePrintableText implements PrintableText {

    @k
    public static final Parcelable.Creator<StringResourcePrintableText> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f221874b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final List<Serializable> f221875c;

    /* compiled from: PrintableText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StringResourcePrintableText> {
        @Override // android.os.Parcelable.Creator
        public final StringResourcePrintableText createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                arrayList.add(parcel.readSerializable());
            }
            return new StringResourcePrintableText(i12, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final StringResourcePrintableText[] newArray(int i12) {
            return new StringResourcePrintableText[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public StringResourcePrintableText(@e0 int i12, @k List<? extends Serializable> list) {
        this.f221874b = i12;
        this.f221875c = list;
    }

    @Override // com.avito.android.printable_text.PrintableText
    @k
    public final CharSequence Y4(@k Context context) {
        return k0(context);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StringResourcePrintableText)) {
            return false;
        }
        StringResourcePrintableText stringResourcePrintableText = (StringResourcePrintableText) obj;
        return this.f221874b == stringResourcePrintableText.f221874b && L.f(this.f221875c, stringResourcePrintableText.f221875c);
    }

    public final int hashCode() {
        return this.f221875c.hashCode() + (Integer.hashCode(this.f221874b) * 31);
    }

    @Override // com.avito.android.printable_text.PrintableText
    @k
    public final String k0(@k Context context) {
        Serializable[] serializableArr = (Serializable[]) this.f221875c.toArray(new Serializable[0]);
        return context.getString(this.f221874b, Arrays.copyOf(serializableArr, serializableArr.length));
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StringResourcePrintableText(stringRes=");
        sb2.append(this.f221874b);
        sb2.append(", formatArgs=");
        return H.p(sb2, this.f221875c, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f221874b);
        Iterator itJ = C0.j(this.f221875c, parcel);
        while (itJ.hasNext()) {
            parcel.writeSerializable((Serializable) itJ.next());
        }
    }
}
