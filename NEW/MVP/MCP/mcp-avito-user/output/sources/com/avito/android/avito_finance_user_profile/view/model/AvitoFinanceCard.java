package com.avito.android.avito_finance_user_profile.view.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.remote.model.UniversalImage;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoFinanceBlockData.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/avito_finance_user_profile/view/model/AvitoFinanceCard;", "Landroid/os/Parcelable;", "_avito_avito-finance-user-profile_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class AvitoFinanceCard implements Parcelable {

    @k
    public static final Parcelable.Creator<AvitoFinanceCard> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f98019b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f98020c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f98021d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final UniversalImage f98022e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f98023f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AvitoFinanceCardBackground f98024g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final AvitoFinanceCardButton f98025h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final Integer f98026i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final ArrayList f98027j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final ArrayList f98028k;

    /* compiled from: AvitoFinanceBlockData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<AvitoFinanceCard> {
        @Override // android.os.Parcelable.Creator
        public final AvitoFinanceCard createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(AvitoFinanceCard.class.getClassLoader());
            String string4 = parcel.readString();
            AvitoFinanceCardBackground avitoFinanceCardBackgroundCreateFromParcel = parcel.readInt() == 0 ? null : AvitoFinanceCardBackground.CREATOR.createFromParcel(parcel);
            AvitoFinanceCardButton avitoFinanceCardButtonCreateFromParcel = parcel.readInt() == 0 ? null : AvitoFinanceCardButton.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int iL2 = 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL3 = 0;
                while (iL3 != i12) {
                    iL3 = com.avito.android.actions_sheet.a.l(AvitoFinanceCard.class, parcel, arrayList, iL3, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(AvitoFinanceCard.class, parcel, arrayList2, iL2, 1);
                }
            }
            return new AvitoFinanceCard(string, string2, string3, universalImage, string4, avitoFinanceCardBackgroundCreateFromParcel, avitoFinanceCardButtonCreateFromParcel, numValueOf, arrayList, arrayList2);
        }

        @Override // android.os.Parcelable.Creator
        public final AvitoFinanceCard[] newArray(int i12) {
            return new AvitoFinanceCard[i12];
        }
    }

    public AvitoFinanceCard(@k String str, @l String str2, @l String str3, @l UniversalImage universalImage, @l String str4, @l AvitoFinanceCardBackground avitoFinanceCardBackground, @l AvitoFinanceCardButton avitoFinanceCardButton, @l Integer num, @l ArrayList arrayList, @l ArrayList arrayList2) {
        this.f98019b = str;
        this.f98020c = str2;
        this.f98021d = str3;
        this.f98022e = universalImage;
        this.f98023f = str4;
        this.f98024g = avitoFinanceCardBackground;
        this.f98025h = avitoFinanceCardButton;
        this.f98026i = num;
        this.f98027j = arrayList;
        this.f98028k = arrayList2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AvitoFinanceCard)) {
            return false;
        }
        AvitoFinanceCard avitoFinanceCard = (AvitoFinanceCard) obj;
        return L.f(this.f98019b, avitoFinanceCard.f98019b) && L.f(this.f98020c, avitoFinanceCard.f98020c) && L.f(this.f98021d, avitoFinanceCard.f98021d) && L.f(this.f98022e, avitoFinanceCard.f98022e) && L.f(this.f98023f, avitoFinanceCard.f98023f) && L.f(this.f98024g, avitoFinanceCard.f98024g) && L.f(this.f98025h, avitoFinanceCard.f98025h) && L.f(this.f98026i, avitoFinanceCard.f98026i) && L.f(this.f98027j, avitoFinanceCard.f98027j) && L.f(this.f98028k, avitoFinanceCard.f98028k);
    }

    public final int hashCode() {
        int iHashCode = this.f98019b.hashCode() * 31;
        String str = this.f98020c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f98021d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        UniversalImage universalImage = this.f98022e;
        int iHashCode4 = (iHashCode3 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str3 = this.f98023f;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AvitoFinanceCardBackground avitoFinanceCardBackground = this.f98024g;
        int iHashCode6 = (iHashCode5 + (avitoFinanceCardBackground == null ? 0 : avitoFinanceCardBackground.hashCode())) * 31;
        AvitoFinanceCardButton avitoFinanceCardButton = this.f98025h;
        int iHashCode7 = (iHashCode6 + (avitoFinanceCardButton == null ? 0 : avitoFinanceCardButton.hashCode())) * 31;
        Integer num = this.f98026i;
        int iHashCode8 = (iHashCode7 + (num == null ? 0 : num.hashCode())) * 31;
        ArrayList arrayList = this.f98027j;
        int iHashCode9 = (iHashCode8 + (arrayList == null ? 0 : arrayList.hashCode())) * 31;
        ArrayList arrayList2 = this.f98028k;
        return iHashCode9 + (arrayList2 != null ? arrayList2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoFinanceCard(id=");
        sb2.append(this.f98019b);
        sb2.append(", title=");
        sb2.append(this.f98020c);
        sb2.append(", subtitle=");
        sb2.append(this.f98021d);
        sb2.append(", image=");
        sb2.append(this.f98022e);
        sb2.append(", imagePosition=");
        sb2.append(this.f98023f);
        sb2.append(", background=");
        sb2.append(this.f98024g);
        sb2.append(", button=");
        sb2.append(this.f98025h);
        sb2.append(", weight=");
        sb2.append(this.f98026i);
        sb2.append(", onSelect=");
        sb2.append(this.f98027j);
        sb2.append(", onAppear=");
        return e.p(sb2, this.f98028k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f98019b);
        parcel.writeString(this.f98020c);
        parcel.writeString(this.f98021d);
        parcel.writeParcelable(this.f98022e, i12);
        parcel.writeString(this.f98023f);
        AvitoFinanceCardBackground avitoFinanceCardBackground = this.f98024g;
        if (avitoFinanceCardBackground == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avitoFinanceCardBackground.writeToParcel(parcel, i12);
        }
        AvitoFinanceCardButton avitoFinanceCardButton = this.f98025h;
        if (avitoFinanceCardButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            avitoFinanceCardButton.writeToParcel(parcel, i12);
        }
        Integer num = this.f98026i;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        ArrayList arrayList = this.f98027j;
        if (arrayList == null) {
            parcel.writeInt(0);
        } else {
            Iterator itY = com.avito.android.actions_sheet.a.y(parcel, 1, arrayList);
            while (itY.hasNext()) {
                parcel.writeParcelable((Parcelable) itY.next(), i12);
            }
        }
        ArrayList arrayList2 = this.f98028k;
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
