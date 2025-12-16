package com.avito.android.vas_planning_checkout.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.ui.graphics.colorspace.e;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.error.ApiError;
import com.avito.android.vas_planning.remote.model.Action;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: VasPlanCheckoutContent.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0004\u0002\u0003\u0004\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;", "", "Data", "a", "b", "c", "Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent$Data;", "Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent$a;", "Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent$b;", "Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent$c;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface VasPlanCheckoutContent {

    /* compiled from: VasPlanCheckoutContent.kt */
    @d
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent$Data;", "Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;", "Landroid/os/Parcelable;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Data implements VasPlanCheckoutContent, Parcelable {

        @k
        public static final Parcelable.Creator<Data> CREATOR = new a();

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f323008b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final String f323009c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final String f323010d;

        /* renamed from: e, reason: collision with root package name */
        @k
        public final ArrayList f323011e;

        /* renamed from: f, reason: collision with root package name */
        @l
        public final String f323012f;

        /* renamed from: g, reason: collision with root package name */
        @l
        public final DeepLink f323013g;

        /* compiled from: VasPlanCheckoutContent.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a implements Parcelable.Creator<Data> {
            @Override // android.os.Parcelable.Creator
            public final Data createFromParcel(Parcel parcel) {
                String string = parcel.readString();
                String string2 = parcel.readString();
                String string3 = parcel.readString();
                int i12 = parcel.readInt();
                ArrayList arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Data.class, parcel, arrayList, iL2, 1);
                }
                return new Data(string, string2, string3, arrayList, parcel.readString(), (DeepLink) parcel.readParcelable(Data.class.getClassLoader()));
            }

            @Override // android.os.Parcelable.Creator
            public final Data[] newArray(int i12) {
                return new Data[i12];
            }
        }

        public Data(@k String str, @k String str2, @l String str3, @k ArrayList arrayList, @l String str4, @l DeepLink deepLink) {
            this.f323008b = str;
            this.f323009c = str2;
            this.f323010d = str3;
            this.f323011e = arrayList;
            this.f323012f = str4;
            this.f323013g = deepLink;
        }

        @Override // android.os.Parcelable
        public final int describeContents() {
            return 0;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof Data)) {
                return false;
            }
            Data data = (Data) obj;
            return L.f(this.f323008b, data.f323008b) && L.f(this.f323009c, data.f323009c) && L.f(this.f323010d, data.f323010d) && this.f323011e.equals(data.f323011e) && L.f(this.f323012f, data.f323012f) && L.f(this.f323013g, data.f323013g);
        }

        public final int hashCode() {
            int iD2 = H.d(this.f323008b.hashCode() * 31, 31, this.f323009c);
            String str = this.f323010d;
            int iG2 = e.g(this.f323011e, (iD2 + (str == null ? 0 : str.hashCode())) * 31, 31);
            String str2 = this.f323012f;
            int iHashCode = (iG2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            DeepLink deepLink = this.f323013g;
            return iHashCode + (deepLink != null ? deepLink.hashCode() : 0);
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Data(actionTitle=");
            sb2.append(this.f323008b);
            sb2.append(", closeButtonTitle=");
            sb2.append(this.f323009c);
            sb2.append(", emptyActionTitle=");
            sb2.append(this.f323010d);
            sb2.append(", list=");
            sb2.append(this.f323011e);
            sb2.append(", priceTemplate=");
            sb2.append(this.f323012f);
            sb2.append(", delayedAction=");
            return com.avito.android.actions_sheet.a.v(sb2, this.f323013g, ')');
        }

        @Override // android.os.Parcelable
        public final void writeToParcel(@k Parcel parcel, int i12) {
            parcel.writeString(this.f323008b);
            parcel.writeString(this.f323009c);
            parcel.writeString(this.f323010d);
            ArrayList arrayList = this.f323011e;
            parcel.writeInt(arrayList.size());
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                parcel.writeParcelable((Parcelable) it.next(), i12);
            }
            parcel.writeString(this.f323012f);
            parcel.writeParcelable(this.f323013g, i12);
        }
    }

    /* compiled from: VasPlanCheckoutContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent$a;", "Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a implements VasPlanCheckoutContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ApiError f323014b;

        public a(@k ApiError apiError) {
            this.f323014b = apiError;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && L.f(this.f323014b, ((a) obj).f323014b);
        }

        public final int hashCode() {
            return this.f323014b.hashCode();
        }

        @k
        public final String toString() {
            return AK.c.n(new StringBuilder("Error(error="), this.f323014b, ')');
        }
    }

    /* compiled from: VasPlanCheckoutContent.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent$b;", "Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;", "<init>", "()V", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b implements VasPlanCheckoutContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public static final b f323015b = new b();
    }

    /* compiled from: VasPlanCheckoutContent.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent$c;", "Lcom/avito/android/vas_planning_checkout/model/VasPlanCheckoutContent;", "_avito_vas-planning_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class c implements VasPlanCheckoutContent {

        /* renamed from: b, reason: collision with root package name */
        @k
        public final ArrayList f323016b;

        /* renamed from: c, reason: collision with root package name */
        @k
        public final Action f323017c;

        /* renamed from: d, reason: collision with root package name */
        @l
        public final List<String> f323018d;

        public c(@k ArrayList arrayList, @k Action action, @l List list) {
            this.f323016b = arrayList;
            this.f323017c = action;
            this.f323018d = list;
        }

        public final boolean equals(@l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.f323016b.equals(cVar.f323016b) && L.f(this.f323017c, cVar.f323017c) && L.f(this.f323018d, cVar.f323018d);
        }

        public final int hashCode() {
            int iHashCode = (this.f323017c.hashCode() + (this.f323016b.hashCode() * 31)) * 31;
            List<String> list = this.f323018d;
            return iHashCode + (list == null ? 0 : list.hashCode());
        }

        @k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("Result(items=");
            sb2.append(this.f323016b);
            sb2.append(", action=");
            sb2.append(this.f323017c);
            sb2.append(", plannedVasIds=");
            return H.p(sb2, this.f323018d, ')');
        }
    }
}
