package com.avito.android.user_adverts_filters.main.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinModel;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvertsFiltersBeduinModel.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts_filters/main/model/UserAdvertsFiltersBeduinModel;", "Landroid/os/Parcelable;", "_avito_user-adverts-filters_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class UserAdvertsFiltersBeduinModel implements Parcelable {

    @k
    public static final Parcelable.Creator<UserAdvertsFiltersBeduinModel> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final UserAdvertsFiltersBeduinNavBar f316054b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final UserAdvertsFiltersBeduinScreen f316055c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f316056d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final String f316057e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f316058f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final String f316059g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f316060h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final String f316061i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final List<BeduinModel> f316062j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final List<BeduinModel> f316063k;

    /* renamed from: l, reason: collision with root package name */
    @k
    public final List<BeduinModel> f316064l;

    /* renamed from: m, reason: collision with root package name */
    @l
    public final List<BeduinModel> f316065m;

    /* renamed from: n, reason: collision with root package name */
    @k
    public final List<BeduinModel> f316066n;

    /* compiled from: UserAdvertsFiltersBeduinModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<UserAdvertsFiltersBeduinModel> {
        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFiltersBeduinModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            ArrayList arrayList3;
            UserAdvertsFiltersBeduinNavBar userAdvertsFiltersBeduinNavBarCreateFromParcel = UserAdvertsFiltersBeduinNavBar.CREATOR.createFromParcel(parcel);
            UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreenCreateFromParcel = UserAdvertsFiltersBeduinScreen.CREATOR.createFromParcel(parcel);
            int i12 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(UserAdvertsFiltersBeduinScreen.CREATOR, parcel, arrayList4, iC2, 1);
            }
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = com.avito.android.actions_sheet.a.l(UserAdvertsFiltersBeduinModel.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i14 = parcel.readInt();
                arrayList2 = new ArrayList(i14);
                int iL3 = 0;
                while (iL3 != i14) {
                    iL3 = com.avito.android.actions_sheet.a.l(UserAdvertsFiltersBeduinModel.class, parcel, arrayList2, iL3, 1);
                }
            }
            int i15 = parcel.readInt();
            ArrayList arrayList5 = new ArrayList(i15);
            int iL4 = 0;
            while (iL4 != i15) {
                iL4 = com.avito.android.actions_sheet.a.l(UserAdvertsFiltersBeduinModel.class, parcel, arrayList5, iL4, 1);
            }
            if (parcel.readInt() == 0) {
                arrayList3 = null;
            } else {
                int i16 = parcel.readInt();
                ArrayList arrayList6 = new ArrayList(i16);
                int iL5 = 0;
                while (iL5 != i16) {
                    iL5 = com.avito.android.actions_sheet.a.l(UserAdvertsFiltersBeduinModel.class, parcel, arrayList6, iL5, 1);
                    i16 = i16;
                }
                arrayList3 = arrayList6;
            }
            int i17 = parcel.readInt();
            ArrayList arrayList7 = new ArrayList(i17);
            int iL6 = 0;
            while (iL6 != i17) {
                iL6 = com.avito.android.actions_sheet.a.l(UserAdvertsFiltersBeduinModel.class, parcel, arrayList7, iL6, 1);
                i17 = i17;
            }
            return new UserAdvertsFiltersBeduinModel(userAdvertsFiltersBeduinNavBarCreateFromParcel, userAdvertsFiltersBeduinScreenCreateFromParcel, arrayList4, string, string2, string3, string4, string5, arrayList, arrayList2, arrayList5, arrayList3, arrayList7);
        }

        @Override // android.os.Parcelable.Creator
        public final UserAdvertsFiltersBeduinModel[] newArray(int i12) {
            return new UserAdvertsFiltersBeduinModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public UserAdvertsFiltersBeduinModel(@k UserAdvertsFiltersBeduinNavBar userAdvertsFiltersBeduinNavBar, @k UserAdvertsFiltersBeduinScreen userAdvertsFiltersBeduinScreen, @k List<UserAdvertsFiltersBeduinScreen> list, @l String str, @l String str2, @k String str3, @l String str4, @k String str5, @l List<? extends BeduinModel> list2, @l List<? extends BeduinModel> list3, @k List<? extends BeduinModel> list4, @l List<? extends BeduinModel> list5, @k List<? extends BeduinModel> list6) {
        this.f316054b = userAdvertsFiltersBeduinNavBar;
        this.f316055c = userAdvertsFiltersBeduinScreen;
        this.f316056d = list;
        this.f316057e = str;
        this.f316058f = str2;
        this.f316059g = str3;
        this.f316060h = str4;
        this.f316061i = str5;
        this.f316062j = list2;
        this.f316063k = list3;
        this.f316064l = list4;
        this.f316065m = list5;
        this.f316066n = list6;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UserAdvertsFiltersBeduinModel)) {
            return false;
        }
        UserAdvertsFiltersBeduinModel userAdvertsFiltersBeduinModel = (UserAdvertsFiltersBeduinModel) obj;
        return L.f(this.f316054b, userAdvertsFiltersBeduinModel.f316054b) && L.f(this.f316055c, userAdvertsFiltersBeduinModel.f316055c) && L.f(this.f316056d, userAdvertsFiltersBeduinModel.f316056d) && L.f(this.f316057e, userAdvertsFiltersBeduinModel.f316057e) && L.f(this.f316058f, userAdvertsFiltersBeduinModel.f316058f) && L.f(this.f316059g, userAdvertsFiltersBeduinModel.f316059g) && L.f(this.f316060h, userAdvertsFiltersBeduinModel.f316060h) && L.f(this.f316061i, userAdvertsFiltersBeduinModel.f316061i) && L.f(this.f316062j, userAdvertsFiltersBeduinModel.f316062j) && L.f(this.f316063k, userAdvertsFiltersBeduinModel.f316063k) && L.f(this.f316064l, userAdvertsFiltersBeduinModel.f316064l) && L.f(this.f316065m, userAdvertsFiltersBeduinModel.f316065m) && L.f(this.f316066n, userAdvertsFiltersBeduinModel.f316066n);
    }

    public final int hashCode() {
        int iA2 = C23088b.a(H.d(this.f316054b.hashCode() * 31, 31, this.f316055c.f316078b), 31, this.f316056d);
        String str = this.f316057e;
        int iHashCode = (iA2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f316058f;
        int iD2 = H.d((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f316059g);
        String str3 = this.f316060h;
        int iD3 = H.d((iD2 + (str3 == null ? 0 : str3.hashCode())) * 31, 31, this.f316061i);
        List<BeduinModel> list = this.f316062j;
        int iHashCode2 = (iD3 + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinModel> list2 = this.f316063k;
        int iE2 = H.e((iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f316064l);
        List<BeduinModel> list3 = this.f316065m;
        return this.f316066n.hashCode() + ((iE2 + (list3 != null ? list3.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("UserAdvertsFiltersBeduinModel(navigationBar=");
        sb2.append(this.f316054b);
        sb2.append(", screenName=");
        sb2.append(this.f316055c);
        sb2.append(", innerScreenNames=");
        sb2.append(this.f316056d);
        sb2.append(", topFormId=");
        sb2.append(this.f316057e);
        sb2.append(", defaultTopFormId=");
        sb2.append(this.f316058f);
        sb2.append(", mainFormId=");
        sb2.append(this.f316059g);
        sb2.append(", defaultMainFormId=");
        sb2.append(this.f316060h);
        sb2.append(", bottomFormId=");
        sb2.append(this.f316061i);
        sb2.append(", topComponents=");
        sb2.append(this.f316062j);
        sb2.append(", defaultTopComponents=");
        sb2.append(this.f316063k);
        sb2.append(", mainComponents=");
        sb2.append(this.f316064l);
        sb2.append(", defaultMainComponents=");
        sb2.append(this.f316065m);
        sb2.append(", bottomComponents=");
        return H.p(sb2, this.f316066n, ')');
    }

    /* JADX WARN: Type inference failed for: r0v2, types: [java.lang.Object, java.util.List] */
    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        this.f316054b.writeToParcel(parcel, i12);
        this.f316055c.writeToParcel(parcel, i12);
        ?? r02 = this.f316056d;
        parcel.writeInt(r02.size());
        Iterator it = r02.iterator();
        while (it.hasNext()) {
            ((UserAdvertsFiltersBeduinScreen) it.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f316057e);
        parcel.writeString(this.f316058f);
        parcel.writeString(this.f316059g);
        parcel.writeString(this.f316060h);
        parcel.writeString(this.f316061i);
        List<BeduinModel> list = this.f316062j;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), i12);
            }
        }
        List<BeduinModel> list2 = this.f316063k;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), i12);
            }
        }
        Iterator itJ = C0.j(this.f316064l, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        List<BeduinModel> list3 = this.f316065m;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), i12);
            }
        }
        Iterator itJ2 = C0.j(this.f316066n, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), i12);
        }
    }
}
