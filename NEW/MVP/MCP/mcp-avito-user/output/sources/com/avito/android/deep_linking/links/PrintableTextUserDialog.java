package com.avito.android.deep_linking.links;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: PassportLinks.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/deep_linking/links/PrintableTextUserDialog;", "Landroid/os/Parcelable;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PrintableTextUserDialog implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<PrintableTextUserDialog> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final PrintableText f133590b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final PrintableText f133591c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<Action> f133592d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f133593e;

    /* compiled from: PassportLinks.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<PrintableTextUserDialog> {
        @Override // android.os.Parcelable.Creator
        public final PrintableTextUserDialog createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            PrintableText printableText = (PrintableText) parcel.readParcelable(PrintableTextUserDialog.class.getClassLoader());
            PrintableText printableText2 = (PrintableText) parcel.readParcelable(PrintableTextUserDialog.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(PrintableTextUserDialog.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new PrintableTextUserDialog(printableText, printableText2, arrayList, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final PrintableTextUserDialog[] newArray(int i12) {
            return new PrintableTextUserDialog[i12];
        }
    }

    public PrintableTextUserDialog(@Y61.k PrintableText printableText, @Y61.k PrintableText printableText2, @Y61.l List<Action> list, boolean z12) {
        this.f133590b = printableText;
        this.f133591c = printableText2;
        this.f133592d = list;
        this.f133593e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PrintableTextUserDialog)) {
            return false;
        }
        PrintableTextUserDialog printableTextUserDialog = (PrintableTextUserDialog) obj;
        return kotlin.jvm.internal.L.f(this.f133590b, printableTextUserDialog.f133590b) && kotlin.jvm.internal.L.f(this.f133591c, printableTextUserDialog.f133591c) && kotlin.jvm.internal.L.f(this.f133592d, printableTextUserDialog.f133592d) && this.f133593e == printableTextUserDialog.f133593e;
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f133591c, this.f133590b.hashCode() * 31, 31);
        List<Action> list = this.f133592d;
        return Boolean.hashCode(this.f133593e) + ((iF2 + (list == null ? 0 : list.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("PrintableTextUserDialog(title=");
        sb2.append(this.f133590b);
        sb2.append(", message=");
        sb2.append(this.f133591c);
        sb2.append(", actions=");
        sb2.append(this.f133592d);
        sb2.append(", cancelable=");
        return androidx.appcompat.app.r.x(sb2, this.f133593e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeParcelable(this.f133590b, i12);
        parcel.writeParcelable(this.f133591c, i12);
        List<Action> list = this.f133592d;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeInt(this.f133593e ? 1 : 0);
    }

    public /* synthetic */ PrintableTextUserDialog(PrintableText printableText, PrintableText printableText2, List list, boolean z12, int i12, C42822w c42822w) {
        this(printableText, printableText2, list, (i12 & 8) != 0 ? true : z12);
    }
}
