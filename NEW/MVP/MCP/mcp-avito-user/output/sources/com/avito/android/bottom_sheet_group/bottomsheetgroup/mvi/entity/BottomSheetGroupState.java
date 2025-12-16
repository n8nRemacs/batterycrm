package com.avito.android.bottom_sheet_group.bottomsheetgroup.mvi.entity;

import AK.c;
import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.analytics.screens.mvi.q;
import com.avito.android.bottom_sheet_group.items.multiselect_item.BottomSheetMultiselectItem;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: BottomSheetGroupState.kt */
@d
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupState;", "Landroid/os/Parcelable;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BottomSheetGroupState extends q implements Parcelable {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f107259b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f107260c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f107261d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f107262e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final List<BottomSheetMultiselectItem> f107263f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Map<String, Set<String>> f107264g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f107265h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public static final a f107257i = new a(null);

    @k
    public static final Parcelable.Creator<BottomSheetGroupState> CREATOR = new b();

    /* renamed from: j, reason: collision with root package name */
    @k
    public static final BottomSheetGroupState f107258j = new BottomSheetGroupState("", false, "", false, new ArrayList(), P0.c(), "");

    /* compiled from: BottomSheetGroupState.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bottom_sheet_group/bottomsheetgroup/mvi/entity/BottomSheetGroupState$a;", "", "<init>", "()V", "_avito_bottom-sheet-group_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BottomSheetGroupState.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<BottomSheetGroupState> {
        @Override // android.os.Parcelable.Creator
        public final BottomSheetGroupState createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            boolean z12 = parcel.readInt() != 0;
            String string2 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(BottomSheetMultiselectItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            int i13 = parcel.readInt();
            LinkedHashMap linkedHashMap = new LinkedHashMap(i13);
            for (int i14 = 0; i14 != i13; i14++) {
                String string3 = parcel.readString();
                int i15 = parcel.readInt();
                LinkedHashSet linkedHashSet = new LinkedHashSet(i15);
                for (int i16 = 0; i16 != i15; i16++) {
                    linkedHashSet.add(parcel.readString());
                }
                linkedHashMap.put(string3, linkedHashSet);
            }
            return new BottomSheetGroupState(string, z12, string2, z13, arrayList, linkedHashMap, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final BottomSheetGroupState[] newArray(int i12) {
            return new BottomSheetGroupState[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BottomSheetGroupState(@k String str, boolean z12, @k String str2, boolean z13, @k List<BottomSheetMultiselectItem> list, @k Map<String, ? extends Set<String>> map, @k String str3) {
        this.f107259b = str;
        this.f107260c = z12;
        this.f107261d = str2;
        this.f107262e = z13;
        this.f107263f = list;
        this.f107264g = map;
        this.f107265h = str3;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static BottomSheetGroupState a(BottomSheetGroupState bottomSheetGroupState, boolean z12, boolean z13, ArrayList arrayList, LinkedHashMap linkedHashMap, int i12) {
        String str = bottomSheetGroupState.f107259b;
        if ((i12 & 2) != 0) {
            z12 = bottomSheetGroupState.f107260c;
        }
        boolean z14 = z12;
        String str2 = bottomSheetGroupState.f107261d;
        if ((i12 & 8) != 0) {
            z13 = bottomSheetGroupState.f107262e;
        }
        boolean z15 = z13;
        List list = arrayList;
        if ((i12 & 16) != 0) {
            list = bottomSheetGroupState.f107263f;
        }
        List list2 = list;
        Map map = linkedHashMap;
        if ((i12 & 32) != 0) {
            map = bottomSheetGroupState.f107264g;
        }
        String str3 = bottomSheetGroupState.f107265h;
        bottomSheetGroupState.getClass();
        return new BottomSheetGroupState(str, z14, str2, z15, list2, map, str3);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof BottomSheetGroupState)) {
            return false;
        }
        BottomSheetGroupState bottomSheetGroupState = (BottomSheetGroupState) obj;
        return L.f(this.f107259b, bottomSheetGroupState.f107259b) && this.f107260c == bottomSheetGroupState.f107260c && L.f(this.f107261d, bottomSheetGroupState.f107261d) && this.f107262e == bottomSheetGroupState.f107262e && L.f(this.f107263f, bottomSheetGroupState.f107263f) && L.f(this.f107264g, bottomSheetGroupState.f107264g) && L.f(this.f107265h, bottomSheetGroupState.f107265h);
    }

    public final int hashCode() {
        return this.f107265h.hashCode() + c.c(H.e(r.i(H.d(r.i(this.f107259b.hashCode() * 31, 31, this.f107260c), 31, this.f107261d), 31, this.f107262e), 31, this.f107263f), 31, this.f107264g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BottomSheetGroupState(submitButtonText=");
        sb2.append(this.f107259b);
        sb2.append(", submitButtonIsEnabled=");
        sb2.append(this.f107260c);
        sb2.append(", clearButtonText=");
        sb2.append(this.f107261d);
        sb2.append(", clearButtonIsEnabled=");
        sb2.append(this.f107262e);
        sb2.append(", items=");
        sb2.append(this.f107263f);
        sb2.append(", selectedGroupMap=");
        sb2.append(this.f107264g);
        sb2.append(", parameterId=");
        return C22026a.c(sb2, this.f107265h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f107259b);
        parcel.writeInt(this.f107260c ? 1 : 0);
        parcel.writeString(this.f107261d);
        parcel.writeInt(this.f107262e ? 1 : 0);
        Iterator itJ = C0.j(this.f107263f, parcel);
        while (itJ.hasNext()) {
            ((BottomSheetMultiselectItem) itJ.next()).writeToParcel(parcel, i12);
        }
        Iterator itI = C0.i(parcel, this.f107264g);
        while (itI.hasNext()) {
            Map.Entry entry = (Map.Entry) itI.next();
            parcel.writeString((String) entry.getKey());
            Set set = (Set) entry.getValue();
            parcel.writeInt(set.size());
            Iterator it = set.iterator();
            while (it.hasNext()) {
                parcel.writeString((String) it.next());
            }
        }
        parcel.writeString(this.f107265h);
    }
}
