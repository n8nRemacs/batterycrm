package com.avito.android.advert.item.comfortable_deal;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Benefit;
import com.avito.android.remote.model.ExpertBlock;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExpertBlockBottomSheetOpenParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert/item/comfortable_deal/ExpertBlockBottomSheetOpenParams;", "Lcom/avito/android/util/OpenParams;", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ExpertBlockBottomSheetOpenParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<ExpertBlockBottomSheetOpenParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f74276b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<Benefit> f74277c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final ExpertBlock f74278d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f74279e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f74280f;

    /* compiled from: ExpertBlockBottomSheetOpenParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ExpertBlockBottomSheetOpenParams> {
        @Override // android.os.Parcelable.Creator
        public final ExpertBlockBottomSheetOpenParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ExpertBlockBottomSheetOpenParams.class, parcel, arrayList, iL2, 1);
            }
            return new ExpertBlockBottomSheetOpenParams((ExpertBlock) parcel.readParcelable(ExpertBlockBottomSheetOpenParams.class.getClassLoader()), string, parcel.readString(), parcel.readString(), arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ExpertBlockBottomSheetOpenParams[] newArray(int i12) {
            return new ExpertBlockBottomSheetOpenParams[i12];
        }
    }

    public ExpertBlockBottomSheetOpenParams(@Y61.k ExpertBlock expertBlock, @Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.k List list) {
        this.f74276b = str;
        this.f74277c = list;
        this.f74278d = expertBlock;
        this.f74279e = str2;
        this.f74280f = str3;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ExpertBlockBottomSheetOpenParams)) {
            return false;
        }
        ExpertBlockBottomSheetOpenParams expertBlockBottomSheetOpenParams = (ExpertBlockBottomSheetOpenParams) obj;
        return L.f(this.f74276b, expertBlockBottomSheetOpenParams.f74276b) && L.f(this.f74277c, expertBlockBottomSheetOpenParams.f74277c) && L.f(this.f74278d, expertBlockBottomSheetOpenParams.f74278d) && L.f(this.f74279e, expertBlockBottomSheetOpenParams.f74279e) && L.f(this.f74280f, expertBlockBottomSheetOpenParams.f74280f);
    }

    public final int hashCode() {
        int iHashCode = (this.f74278d.hashCode() + H.e(this.f74276b.hashCode() * 31, 31, this.f74277c)) * 31;
        String str = this.f74279e;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f74280f;
        return iHashCode2 + (str2 != null ? str2.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ExpertBlockBottomSheetOpenParams(title=");
        sb2.append(this.f74276b);
        sb2.append(", benefits=");
        sb2.append(this.f74277c);
        sb2.append(", expertBlock=");
        sb2.append(this.f74278d);
        sb2.append(", subtitle=");
        sb2.append(this.f74279e);
        sb2.append(", description=");
        return C22026a.c(sb2, this.f74280f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f74276b);
        Iterator itJ = C0.j(this.f74277c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f74278d, i12);
        parcel.writeString(this.f74279e);
        parcel.writeString(this.f74280f);
    }
}
