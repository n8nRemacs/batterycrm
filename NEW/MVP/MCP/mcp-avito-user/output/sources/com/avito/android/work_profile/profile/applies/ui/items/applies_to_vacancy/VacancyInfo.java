package com.avito.android.work_profile.profile.applies.ui.items.applies_to_vacancy;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ApplyToVacancyItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/work_profile/profile/applies/ui/items/applies_to_vacancy/VacancyInfo;", "Landroid/os/Parcelable;", "_avito_job_work-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VacancyInfo implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<VacancyInfo> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f330959b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final AttributedText f330960c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f330961d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f330962e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final List<GeoReference> f330963f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final DeepLink f330964g;

    /* compiled from: ApplyToVacancyItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VacancyInfo> {
        @Override // android.os.Parcelable.Creator
        public final VacancyInfo createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(VacancyInfo.class.getClassLoader());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(VacancyInfo.class, parcel, arrayList2, iL2, 1);
                }
                arrayList = arrayList2;
            }
            return new VacancyInfo(string, attributedText, string2, string3, arrayList, (DeepLink) parcel.readParcelable(VacancyInfo.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final VacancyInfo[] newArray(int i12) {
            return new VacancyInfo[i12];
        }
    }

    public VacancyInfo(@Y61.k String str, @Y61.k AttributedText attributedText, @Y61.k String str2, @Y61.k String str3, @Y61.l List<GeoReference> list, @Y61.k DeepLink deepLink) {
        this.f330959b = str;
        this.f330960c = attributedText;
        this.f330961d = str2;
        this.f330962e = str3;
        this.f330963f = list;
        this.f330964g = deepLink;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VacancyInfo)) {
            return false;
        }
        VacancyInfo vacancyInfo = (VacancyInfo) obj;
        return L.f(this.f330959b, vacancyInfo.f330959b) && L.f(this.f330960c, vacancyInfo.f330960c) && L.f(this.f330961d, vacancyInfo.f330961d) && L.f(this.f330962e, vacancyInfo.f330962e) && L.f(this.f330963f, vacancyInfo.f330963f) && L.f(this.f330964g, vacancyInfo.f330964g);
    }

    public final int hashCode() {
        int iD2 = H.d(H.d(com.avito.android.actions_sheet.a.b(this.f330959b.hashCode() * 31, 31, this.f330960c), 31, this.f330961d), 31, this.f330962e);
        List<GeoReference> list = this.f330963f;
        return this.f330964g.hashCode() + ((iD2 + (list == null ? 0 : list.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VacancyInfo(vacancyId=");
        sb2.append(this.f330959b);
        sb2.append(", status=");
        sb2.append(this.f330960c);
        sb2.append(", vacancyTitle=");
        sb2.append(this.f330961d);
        sb2.append(", salary=");
        sb2.append(this.f330962e);
        sb2.append(", geoReferences=");
        sb2.append(this.f330963f);
        sb2.append(", uri=");
        return com.avito.android.actions_sheet.a.v(sb2, this.f330964g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f330959b);
        parcel.writeParcelable(this.f330960c, i12);
        parcel.writeString(this.f330961d);
        parcel.writeString(this.f330962e);
        List<GeoReference> list = this.f330963f;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        parcel.writeParcelable(this.f330964g, i12);
    }
}
