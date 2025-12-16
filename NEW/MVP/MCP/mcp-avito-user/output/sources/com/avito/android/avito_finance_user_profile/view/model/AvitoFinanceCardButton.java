package com.avito.android.avito_finance_user_profile.view.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceBlockData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/model/AvitoFinanceCardButton;", "Landroid/os/Parcelable;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvitoFinanceCardButton implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoFinanceCardButton> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @l
    public final String f98031b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f98032c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final ArrayList f98033d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final ArrayList f98034e;

    /* compiled from: AvitoFinanceBlockData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvitoFinanceCardButton> {
        @Override // android.os.Parcelable.Creator
        public final AvitoFinanceCardButton createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            String string2 = parcel.readString();
            int iL2 = 0;
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(AvitoFinanceCardButton.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(AvitoFinanceCardButton.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new AvitoFinanceCardButton(string, string2, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AvitoFinanceCardButton[] newArray(int i12) {
            return new AvitoFinanceCardButton[i12];
        }
    }

    public AvitoFinanceCardButton(@l String str, @l String str2, @l ArrayList arrayList, @l ArrayList arrayList2) {
        this.f98031b = str;
        this.f98032c = str2;
        this.f98033d = arrayList;
        this.f98034e = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvitoFinanceCardButton)) {
            return false;
        }
        AvitoFinanceCardButton avitoFinanceCardButton = (AvitoFinanceCardButton) obj;
        return L.f(this.f98031b, avitoFinanceCardButton.f98031b) && L.f(this.f98032c, avitoFinanceCardButton.f98032c) && L.f(this.f98033d, avitoFinanceCardButton.f98033d) && L.f(this.f98034e, avitoFinanceCardButton.f98034e);
    }

    public final int hashCode() {
        String str = this.f98031b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f98032c;
        int iHashCode2 = (iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        ArrayList arrayList = this.f98033d;
        int iHashCode3 = (iHashCode2 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f98034e;
        return iHashCode3 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoFinanceCardButton(title=");
        sb2.append(this.f98031b);
        sb2.append(", style=");
        sb2.append(this.f98032c);
        sb2.append(", onSelect=");
        sb2.append(this.f98033d);
        sb2.append(", onAppear=");
        return e.p(sb2, this.f98034e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f98031b);
        parcel.writeString(this.f98032c);
        ArrayList arrayList = this.f98033d;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeParcelable((Parcelable) itY.next(), i12);
            }
        }
        ArrayList arrayList2 = this.f98034e;
        if (arrayList2 == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itY2 = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList2);
        while (itY2.hasNext()) {
            parcel.writeParcelable((Parcelable) itY2.next(), i12);
        }
    }
}
