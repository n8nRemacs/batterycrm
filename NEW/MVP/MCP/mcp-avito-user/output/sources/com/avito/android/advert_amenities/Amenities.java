package com.avito.android.advert_amenities;

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

/* compiled from: Amenities.kt */
@d
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u0007¢\u0006\u0004\b\n\u0010\u000bR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\f\u001a\u0004\b\r\u0010\u000eR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u000f\u001a\u0004\b\u0012\u0010\u0011R \u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0017"}, d2 = {"Lcom/avito/android/advert_amenities/Amenities;", "Landroid/os/Parcelable;", "", "shownItemsCount", "Lcom/avito/android/remote/model/text/AttributedText;", "showAllValuesButtonText", "closeAllValuesButtonText", "", "Lcom/avito/android/advert_amenities/Amenities$Amenity;", "values", "<init>", "(ILcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/remote/model/text/AttributedText;Ljava/util/List;)V", "I", "e", "()I", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "c", "Ljava/util/List;", "f", "()Ljava/util/List;", "Amenity", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class Amenities implements Parcelable {

    @k
    public static final Parcelable.Creator<Amenities> CREATOR = new a();

    @c("closeAllValuesButtonText")
    @k
    private final AttributedText closeAllValuesButtonText;

    @c("showAllValuesButtonText")
    @k
    private final AttributedText showAllValuesButtonText;

    @c("shownItemsCount")
    private final int shownItemsCount;

    @c("values")
    @k
    private final List<Amenity> values;

    /* compiled from: Amenities.kt */
    @d
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lcom/avito/android/advert_amenities/Amenities$Amenity;", "Landroid/os/Parcelable;", "", "iconAlias", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;)V", "Ljava/lang/String;", "c", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/text/AttributedText;", "d", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito_advert-amenities_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Amenity implements Parcelable {

        @k
        public static final Parcelable.Creator<Amenity> CREATOR = new a();

        @c("iconAlias")
        @l
        private final String iconAlias;

        @c("text")
        @k
        private final AttributedText text;

        /* compiled from: Amenities.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Amenity> {
            @Override // android.os.Parcelable.Creator
            public final Amenity createFromParcel(Parcel parcel) {
                return new Amenity(parcel.readString(), (AttributedText) parcel.readParcelable(Amenity.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Amenity[] newArray(int i12) {
                return new Amenity[i12];
            }
        }

        public Amenity(@l String str, @k AttributedText attributedText) {
            this.iconAlias = str;
            this.text = attributedText;
        }

        @l
        /* renamed from: c, reason: from getter */
        public final String getIconAlias() {
            return this.iconAlias;
        }

        @k
        /* renamed from: d, reason: from getter */
        public final AttributedText getText() {
            return this.text;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Amenity)) {
                return false;
            }
            Amenity amenity = (Amenity) obj;
            return L.f(this.iconAlias, amenity.iconAlias) && L.f(this.text, amenity.text);
        }

        public final int hashCode() {
            String str = this.iconAlias;
            return this.text.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Amenity(iconAlias=");
            sb2.append(this.iconAlias);
            sb2.append(", text=");
            return com.avito.android.actions_sheet.a.w(sb2, this.text, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.iconAlias);
            parcel.writeParcelable(this.text, i12);
        }
    }

    /* compiled from: Amenities.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Amenities> {
        @Override // android.os.Parcelable.Creator
        public final Amenities createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(Amenities.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(Amenities.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(Amenity.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new Amenities(i12, attributedText, attributedText2, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final Amenities[] newArray(int i12) {
            return new Amenities[i12];
        }
    }

    public Amenities(int i12, @k AttributedText attributedText, @k AttributedText attributedText2, @k List<Amenity> list) {
        this.shownItemsCount = i12;
        this.showAllValuesButtonText = attributedText;
        this.closeAllValuesButtonText = attributedText2;
        this.values = list;
    }

    @k
    /* renamed from: c, reason: from getter */
    public final AttributedText getCloseAllValuesButtonText() {
        return this.closeAllValuesButtonText;
    }

    @k
    /* renamed from: d, reason: from getter */
    public final AttributedText getShowAllValuesButtonText() {
        return this.showAllValuesButtonText;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    /* renamed from: e, reason: from getter */
    public final int getShownItemsCount() {
        return this.shownItemsCount;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Amenities)) {
            return false;
        }
        Amenities amenities = (Amenities) obj;
        return this.shownItemsCount == amenities.shownItemsCount && L.f(this.showAllValuesButtonText, amenities.showAllValuesButtonText) && L.f(this.closeAllValuesButtonText, amenities.closeAllValuesButtonText) && L.f(this.values, amenities.values);
    }

    @k
    public final List<Amenity> f() {
        return this.values;
    }

    public final int hashCode() {
        return this.values.hashCode() + com.avito.android.actions_sheet.a.b(com.avito.android.actions_sheet.a.b(Integer.hashCode(this.shownItemsCount) * 31, 31, this.showAllValuesButtonText), 31, this.closeAllValuesButtonText);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Amenities(shownItemsCount=");
        sb2.append(this.shownItemsCount);
        sb2.append(", showAllValuesButtonText=");
        sb2.append(this.showAllValuesButtonText);
        sb2.append(", closeAllValuesButtonText=");
        sb2.append(this.closeAllValuesButtonText);
        sb2.append(", values=");
        return H.p(sb2, this.values, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.shownItemsCount);
        parcel.writeParcelable(this.showAllValuesButtonText, i12);
        parcel.writeParcelable(this.closeAllValuesButtonText, i12);
        Iterator itJ = C0.j(this.values, parcel);
        while (itJ.hasNext()) {
            ((Amenity) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
