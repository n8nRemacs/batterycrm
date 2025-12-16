package com.avito.android.str_booking.network.models.sections;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CalculationSection.kt */
@d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001BG\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\u0014\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u0004\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000b\u001a\u0004\b\f\u0010\rR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000e\u001a\u0004\b\u000f\u0010\u0010R(\u0010\u0007\u001a\u0010\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000e\u001a\u0004\b\u0011\u0010\u0010R\"\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u000e\u001a\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lcom/avito/android/str_booking/network/models/sections/AdditionalInfoContent;", "Landroid/os/Parcelable;", "", "title", "", "Lcom/avito/android/remote/model/text/AttributedText;", "header", "content", "footer", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Ljava/util/List;", "e", "()Ljava/util/List;", "c", "d", "_avito-discouraged_avito-network_str-booking"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AdditionalInfoContent implements Parcelable {

    @k
    public static final Parcelable.Creator<AdditionalInfoContent> CREATOR = new a();

    @c("content")
    @l
    private final List<List<AttributedText>> content;

    @c("footer")
    @l
    private final List<AttributedText> footer;

    @c("header")
    @l
    private final List<AttributedText> header;

    @c("title")
    @l
    private final String title;

    /* compiled from: CalculationSection.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AdditionalInfoContent> {
        @Override // android.os.Parcelable.Creator
        public final AdditionalInfoContent createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            ArrayList arrayList3 = null;
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(AdditionalInfoContent.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                for (int i14 = 0; i14 != i13; i14++) {
                    int i15 = parcel.readInt();
                    ArrayList arrayList4 = new ArrayList(i15);
                    int iL4 = 0;
                    while (iL4 != i15) {
                        iL4 = com.avito.android.actions_sheet.a.l(AdditionalInfoContent.class, parcel, arrayList4, iL4, 1);
                    }
                    arrayList2.add(arrayList4);
                }
            }
            if (parcel.readInt() != 0) {
                int i16 = parcel.readInt();
                arrayList3 = new ArrayList(i16);
                while (iL2 != i16) {
                    iL2 = com.avito.android.actions_sheet.a.l(AdditionalInfoContent.class, parcel, arrayList3, iL2, 1);
                }
            }
            return new AdditionalInfoContent(string, arrayList, arrayList2, arrayList3);
        }

        @Override // android.os.Parcelable.Creator
        public final AdditionalInfoContent[] newArray(int i12) {
            return new AdditionalInfoContent[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdditionalInfoContent(@l String str, @l List<AttributedText> list, @l List<? extends List<AttributedText>> list2, @l List<AttributedText> list3) {
        this.title = str;
        this.header = list;
        this.content = list2;
        this.footer = list3;
    }

    @l
    public final List<List<AttributedText>> c() {
        return this.content;
    }

    @l
    public final List<AttributedText> d() {
        return this.footer;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @l
    public final List<AttributedText> e() {
        return this.header;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdditionalInfoContent)) {
            return false;
        }
        AdditionalInfoContent additionalInfoContent = (AdditionalInfoContent) obj;
        return L.f(this.title, additionalInfoContent.title) && L.f(this.header, additionalInfoContent.header) && L.f(this.content, additionalInfoContent.content) && L.f(this.footer, additionalInfoContent.footer);
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<AttributedText> list = this.header;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<List<AttributedText>> list2 = this.content;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<AttributedText> list3 = this.footer;
        return iHashCode3 + (list3 != null ? list3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AdditionalInfoContent(title=");
        sb2.append(this.title);
        sb2.append(", header=");
        sb2.append(this.header);
        sb2.append(", content=");
        sb2.append(this.content);
        sb2.append(", footer=");
        return H.p(sb2, this.footer, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.title);
        List<AttributedText> list = this.header;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        List<List<AttributedText>> list2 = this.content;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                Iterator itJ = C0.j((List) itA2.next(), parcel);
                while (itJ.hasNext()) {
                    parcel.writeParcelable((Parcelable) itJ.next(), i12);
                }
            }
        }
        List<AttributedText> list3 = this.footer;
        if (list3 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
        while (itA3.hasNext()) {
            parcel.writeParcelable((Parcelable) itA3.next(), i12);
        }
    }
}
