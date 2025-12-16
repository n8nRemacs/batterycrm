package com.avito.android.tariff_cpt.info.deeplink;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.InterfaceC29686l;
import com.avito.android.remote.model.text.TooltipAttribute;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import q50.InterfaceC47204b;

/* compiled from: TariffCptInfoMonthsLink.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoMonthsLink;", "Lcom/avito/android/deep_linking/links/DeepLink;", "MonthData", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
@InterfaceC29686l
@InterfaceC47204b
/* loaded from: classes4.dex */
public final /* data */ class TariffCptInfoMonthsLink extends DeepLink {

    @Y61.k
    public static final Parcelable.Creator<TariffCptInfoMonthsLink> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final List<MonthData> f298143b;

    /* compiled from: TariffCptInfoMonthsLink.kt */
    @P
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\n\u001a\u0004\b\u000b\u0010\fR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\r\u001a\u0004\b\u0005\u0010\u000eR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/tariff_cpt/info/deeplink/TariffCptInfoMonthsLink$MonthData;", "Landroid/os/Parcelable;", "", "title", "", "isSelected", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;ZLcom/avito/android/deep_linking/links/DeepLink;)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Z", "()Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito_tariff-cpt_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    @K51.d
    public static final /* data */ class MonthData implements Parcelable {

        @Y61.k
        public static final Parcelable.Creator<MonthData> CREATOR = new a();

        @com.google.gson.annotations.c(TooltipAttribute.PARAM_DEEP_LINK)
        @Y61.l
        private final DeepLink deeplink;

        @com.google.gson.annotations.c("isSelected")
        private final boolean isSelected;

        @com.google.gson.annotations.c("title")
        @Y61.k
        private final String title;

        /* compiled from: TariffCptInfoMonthsLink.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<MonthData> {
            @Override // android.os.Parcelable.Creator
            public final MonthData createFromParcel(Parcel parcel) {
                return new MonthData(parcel.readString(), parcel.readInt() != 0, (DeepLink) parcel.readParcelable(MonthData.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final MonthData[] newArray(int i12) {
                return new MonthData[i12];
            }
        }

        public MonthData(@Y61.k String str, boolean z12, @Y61.l DeepLink deepLink) {
            this.title = str;
            this.isSelected = z12;
            this.deeplink = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof MonthData)) {
                return false;
            }
            MonthData monthData = (MonthData) obj;
            return L.f(this.title, monthData.title) && this.isSelected == monthData.isSelected && L.f(this.deeplink, monthData.deeplink);
        }

        @Y61.l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @Y61.k
        public final String getTitle() {
            return this.title;
        }

        public final int hashCode() {
            int i12 = r.i(this.title.hashCode() * 31, 31, this.isSelected);
            DeepLink deepLink = this.deeplink;
            return i12 + (deepLink == null ? 0 : deepLink.hashCode());
        }

        /* renamed from: isSelected, reason: from getter */
        public final boolean getIsSelected() {
            return this.isSelected;
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("MonthData(title=");
            sb2.append(this.title);
            sb2.append(", isSelected=");
            sb2.append(this.isSelected);
            sb2.append(", deeplink=");
            return com.avito.android.actions_sheet.a.v(sb2, this.deeplink, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
            parcel.writeString(this.title);
            parcel.writeInt(this.isSelected ? 1 : 0);
            parcel.writeParcelable(this.deeplink, i12);
        }
    }

    /* compiled from: TariffCptInfoMonthsLink.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TariffCptInfoMonthsLink> {
        @Override // android.os.Parcelable.Creator
        public final TariffCptInfoMonthsLink createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(MonthData.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new TariffCptInfoMonthsLink(arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final TariffCptInfoMonthsLink[] newArray(int i12) {
            return new TariffCptInfoMonthsLink[i12];
        }
    }

    public TariffCptInfoMonthsLink(@Y61.k List<MonthData> list) {
        this.f298143b = list;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof TariffCptInfoMonthsLink) && L.f(this.f298143b, ((TariffCptInfoMonthsLink) obj).f298143b);
    }

    public final int hashCode() {
        return this.f298143b.hashCode();
    }

    @Y61.k
    public final String toString() {
        return H.p(new StringBuilder("TariffCptInfoMonthsLink(body="), this.f298143b, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        Iterator itJ = C0.j(this.f298143b, parcel);
        while (itJ.hasNext()) {
            ((MonthData) itJ.next()).writeToParcel(parcel, i12);
        }
    }
}
