package com.avito.android.crm_paid_cvs.features.cv_list.entity;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.crm_paid_cvs.dto.CvItem;
import com.avito.android.crm_paid_cvs.dto.CvStatus;
import com.avito.android.crm_paid_cvs.dto.FilterItem;
import com.avito.android.crm_paid_cvs.dto.SearchItem;
import com.avito.android.remote.model.ProfileTab;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.enums.c;
import kotlin.jvm.internal.L;

/* compiled from: CvListState.kt */
@d
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0002\u0003\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "ListState", "Tab", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CvListState extends q implements Parcelable {

    @k
    public static final Parcelable.Creator<CvListState> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final Tab f130494b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final ListState f130495c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<CvItem> f130496d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<SearchItem> f130497e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<FilterItem> f130498f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final List<FilterItem> f130499g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final Long f130500h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f130501i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final CvStatus f130502j;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CvListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListState$ListState;", "", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ListState {

        /* renamed from: b, reason: collision with root package name */
        public static final ListState f130503b;

        /* renamed from: c, reason: collision with root package name */
        public static final ListState f130504c;

        /* renamed from: d, reason: collision with root package name */
        public static final ListState f130505d;

        /* renamed from: e, reason: collision with root package name */
        public static final ListState f130506e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ ListState[] f130507f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f130508g;

        static {
            ListState listState = new ListState("SHOWN", 0);
            f130503b = listState;
            ListState listState2 = new ListState("RELOAD", 1);
            f130504c = listState2;
            ListState listState3 = new ListState("REFRESH", 2);
            f130505d = listState3;
            ListState listState4 = new ListState("ERROR", 3);
            f130506e = listState4;
            ListState[] listStateArr = {listState, listState2, listState3, listState4};
            f130507f = listStateArr;
            f130508g = c.a(listStateArr);
        }

        public ListState() {
            throw null;
        }

        public static ListState valueOf(String str) {
            return (ListState) Enum.valueOf(ListState.class, str);
        }

        public static ListState[] values() {
            return (ListState[]) f130507f.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CvListState.kt */
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListState$Tab;", "", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Tab {

        /* renamed from: c, reason: collision with root package name */
        public static final Tab f130509c;

        /* renamed from: d, reason: collision with root package name */
        public static final Tab f130510d;

        /* renamed from: e, reason: collision with root package name */
        public static final Tab f130511e;

        /* renamed from: f, reason: collision with root package name */
        public static final /* synthetic */ Tab[] f130512f;

        /* renamed from: g, reason: collision with root package name */
        public static final /* synthetic */ kotlin.enums.a f130513g;

        /* renamed from: b, reason: collision with root package name */
        @k
        public final String f130514b;

        static {
            Tab tab = new Tab("CVS", 0, ProfileTab.ALL);
            f130509c = tab;
            Tab tab2 = new Tab("FAVORITES", 1, "favorites");
            f130510d = tab2;
            Tab tab3 = new Tab("SEARCHES", 2, "searches");
            f130511e = tab3;
            Tab[] tabArr = {tab, tab2, tab3};
            f130512f = tabArr;
            f130513g = c.a(tabArr);
        }

        public Tab(String str, int i12, String str2) {
            this.f130514b = str2;
        }

        public static Tab valueOf(String str) {
            return (Tab) Enum.valueOf(Tab.class, str);
        }

        public static Tab[] values() {
            return (Tab[]) f130512f.clone();
        }
    }

    /* compiled from: CvListState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<CvListState> {
        @Override // android.os.Parcelable.Creator
        public final CvListState createFromParcel(Parcel parcel) {
            Tab tabValueOf = Tab.valueOf(parcel.readString());
            ListState listStateValueOf = ListState.valueOf(parcel.readString());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            int iC3 = 0;
            while (iC3 != i12) {
                iC3 = com.avito.android.actions_sheet.a.c(CvItem.CREATOR, parcel, arrayList, iC3, 1);
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iC4 = 0;
            while (iC4 != i13) {
                iC4 = com.avito.android.actions_sheet.a.c(SearchItem.CREATOR, parcel, arrayList2, iC4, 1);
            }
            int i14 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i14);
            int iC5 = 0;
            while (iC5 != i14) {
                iC5 = com.avito.android.actions_sheet.a.c(FilterItem.CREATOR, parcel, arrayList3, iC5, 1);
            }
            int i15 = parcel.readInt();
            ArrayList arrayList4 = new ArrayList(i15);
            while (iC2 != i15) {
                iC2 = com.avito.android.actions_sheet.a.c(FilterItem.CREATOR, parcel, arrayList4, iC2, 1);
            }
            return new CvListState(tabValueOf, listStateValueOf, arrayList, arrayList2, arrayList3, arrayList4, parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()), parcel.readString(), parcel.readInt() != 0 ? CvStatus.CREATOR.createFromParcel(parcel) : null);
        }

        @Override // android.os.Parcelable.Creator
        public final CvListState[] newArray(int i12) {
            return new CvListState[i12];
        }
    }

    public CvListState(@k Tab tab, @k ListState listState, @k List<CvItem> list, @k List<SearchItem> list2, @k List<FilterItem> list3, @k List<FilterItem> list4, @l Long l12, @l String str, @l CvStatus cvStatus) {
        this.f130494b = tab;
        this.f130495c = listState;
        this.f130496d = list;
        this.f130497e = list2;
        this.f130498f = list3;
        this.f130499g = list4;
        this.f130500h = l12;
        this.f130501i = str;
        this.f130502j = cvStatus;
    }

    public static CvListState a(CvListState cvListState, Tab tab, ListState listState, List list, List list2, List list3, List list4, Long l12, String str, CvStatus cvStatus, int i12) {
        Tab tab2 = (i12 & 1) != 0 ? cvListState.f130494b : tab;
        ListState listState2 = (i12 & 2) != 0 ? cvListState.f130495c : listState;
        List list5 = (i12 & 4) != 0 ? cvListState.f130496d : list;
        List list6 = (i12 & 8) != 0 ? cvListState.f130497e : list2;
        List list7 = (i12 & 16) != 0 ? cvListState.f130498f : list3;
        List list8 = (i12 & 32) != 0 ? cvListState.f130499g : list4;
        Long l13 = (i12 & 64) != 0 ? cvListState.f130500h : l12;
        String str2 = (i12 & 128) != 0 ? cvListState.f130501i : str;
        CvStatus cvStatus2 = (i12 & 256) != 0 ? cvListState.f130502j : cvStatus;
        cvListState.getClass();
        return new CvListState(tab2, listState2, list5, list6, list7, list8, l13, str2, cvStatus2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CvListState)) {
            return false;
        }
        CvListState cvListState = (CvListState) obj;
        return this.f130494b == cvListState.f130494b && this.f130495c == cvListState.f130495c && L.f(this.f130496d, cvListState.f130496d) && L.f(this.f130497e, cvListState.f130497e) && L.f(this.f130498f, cvListState.f130498f) && L.f(this.f130499g, cvListState.f130499g) && L.f(this.f130500h, cvListState.f130500h) && L.f(this.f130501i, cvListState.f130501i) && L.f(this.f130502j, cvListState.f130502j);
    }

    public final int hashCode() {
        int iE2 = H.e(H.e(H.e(H.e((this.f130495c.hashCode() + (this.f130494b.hashCode() * 31)) * 31, 31, this.f130496d), 31, this.f130497e), 31, this.f130498f), 31, this.f130499g);
        Long l12 = this.f130500h;
        int iHashCode = (iE2 + (l12 == null ? 0 : l12.hashCode())) * 31;
        String str = this.f130501i;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        CvStatus cvStatus = this.f130502j;
        return iHashCode2 + (cvStatus != null ? cvStatus.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "CvListState(tab=" + this.f130494b + ", state=" + this.f130495c + ", cvs=" + this.f130496d + ", searches=" + this.f130497e + ", cvsFilters=" + this.f130498f + ", favoritesFilters=" + this.f130499g + ", cursor=" + this.f130500h + ", noteText=" + this.f130501i + ", status=" + this.f130502j + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f130494b.name());
        parcel.writeString(this.f130495c.name());
        Iterator itJ = C0.j(this.f130496d, parcel);
        while (itJ.hasNext()) {
            ((CvItem) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ2 = C0.j(this.f130497e, parcel);
        while (itJ2.hasNext()) {
            ((SearchItem) itJ2.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ3 = C0.j(this.f130498f, parcel);
        while (itJ3.hasNext()) {
            ((FilterItem) itJ3.next()).writeToParcel(parcel, i12);
        }
        Iterator itJ4 = C0.j(this.f130499g, parcel);
        while (itJ4.hasNext()) {
            ((FilterItem) itJ4.next()).writeToParcel(parcel, i12);
        }
        Long l12 = this.f130500h;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        parcel.writeString(this.f130501i);
        CvStatus cvStatus = this.f130502j;
        if (cvStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            cvStatus.writeToParcel(parcel, i12);
        }
    }
}
