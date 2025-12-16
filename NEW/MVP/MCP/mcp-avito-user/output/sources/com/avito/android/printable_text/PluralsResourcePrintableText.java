package com.avito.android.printable_text;

import K51.d;
import Y61.k;
import Y61.l;
import android.content.Context;
import android.content.res.Resources;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import j.T;
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
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0083\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/printable_text/PluralsResourcePrintableText;", "Lcom/avito/android/printable_text/PrintableText;", "_common_printable-text_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
final /* data */ class PluralsResourcePrintableText implements PrintableText {

    @k
    public static final Parcelable.Creator<PluralsResourcePrintableText> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f221869b;

    /* renamed from: c, reason: collision with root package name */
    public final int f221870c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Serializable> f221871d;

    /* compiled from: PrintableText.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PluralsResourcePrintableText> {
        @Override // android.os.Parcelable.Creator
        public final PluralsResourcePrintableText createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            for (int i15 = 0; i15 != i14; i15++) {
                arrayList.add(parcel.readSerializable());
            }
            return new PluralsResourcePrintableText(i12, i13, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final PluralsResourcePrintableText[] newArray(int i12) {
            return new PluralsResourcePrintableText[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public PluralsResourcePrintableText(@T int i12, int i13, @k List<? extends Serializable> list) {
        this.f221869b = i12;
        this.f221870c = i13;
        this.f221871d = list;
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
        if (!(obj instanceof PluralsResourcePrintableText)) {
            return false;
        }
        PluralsResourcePrintableText pluralsResourcePrintableText = (PluralsResourcePrintableText) obj;
        return this.f221869b == pluralsResourcePrintableText.f221869b && this.f221870c == pluralsResourcePrintableText.f221870c && L.f(this.f221871d, pluralsResourcePrintableText.f221871d);
    }

    public final int hashCode() {
        return this.f221871d.hashCode() + r.e(this.f221870c, Integer.hashCode(this.f221869b) * 31, 31);
    }

    @Override // com.avito.android.printable_text.PrintableText
    @k
    public final String k0(@k Context context) {
        Resources resources = context.getResources();
        Serializable[] serializableArr = (Serializable[]) this.f221871d.toArray(new Serializable[0]);
        return resources.getQuantityString(this.f221869b, this.f221870c, Arrays.copyOf(serializableArr, serializableArr.length));
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PluralsResourcePrintableText(pluralsRes=");
        sb2.append(this.f221869b);
        sb2.append(", quantity=");
        sb2.append(this.f221870c);
        sb2.append(", formatArgs=");
        return H.p(sb2, this.f221871d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f221869b);
        parcel.writeInt(this.f221870c);
        Iterator itJ = C0.j(this.f221871d, parcel);
        while (itJ.hasNext()) {
            parcel.writeSerializable((Serializable) itJ.next());
        }
    }
}
