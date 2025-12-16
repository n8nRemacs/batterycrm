package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculationSection.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\t\u001a\u0004\b\n\u0010\u000bR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\f\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/TermsContent;", "Landroid/os/Parcelable;", "", "header", "", "Lcom/avito/android/str_booking/network/models/sections/TermsItem;", "content", "<init>", "(Ljava/lang/String;Ljava/util/List;)V", "Ljava/lang/String;", "getHeader", "()Ljava/lang/String;", "Ljava/util/List;", "c", "()Ljava/util/List;", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TermsContent implements Parcelable {

    @k
    public static final Parcelable.Creator<TermsContent> CREATOR = new a();

    @c("data")
    @l
    private final List<TermsItem> content;

    @c("header")
    @l
    private final String header;

    /* compiled from: CalculationSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TermsContent> {
        @Override // android.os.Parcelable.Creator
        public final TermsContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = com.avito.android.actions_sheet.a.c(TermsItem.CREATOR, parcel, arrayList2, iC2, 1);
                }
                arrayList = arrayList2;
            }
            return new TermsContent(string, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TermsContent[] newArray(int i12) {
            return new TermsContent[i12];
        }
    }

    public TermsContent(@l String str, @l List<TermsItem> list) {
        this.header = str;
        this.content = list;
    }

    @l
    public final List<TermsItem> c() {
        return this.content;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof TermsContent)) {
            return false;
        }
        TermsContent termsContent = (TermsContent) obj;
        return L.f(this.header, termsContent.header) && L.f(this.content, termsContent.content);
    }

    public final int hashCode() {
        String str = this.header;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<TermsItem> list = this.content;
        return iHashCode + (list != null ? list.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TermsContent(header=");
        sb2.append(this.header);
        sb2.append(", content=");
        return H.p(sb2, this.content, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.header);
        List<TermsItem> list = this.content;
        if (list == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
        while (itA.hasNext()) {
            ((TermsItem) itA.next()).writeToParcel(parcel, i12);
        }
    }
}
