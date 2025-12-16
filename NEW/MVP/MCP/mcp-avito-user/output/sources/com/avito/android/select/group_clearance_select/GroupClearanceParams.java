package com.avito.android.select.group_clearance_select;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.category_parameters.ClearanceValue;
import com.avito.android.util.OpenParams;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: GroupClearanceParams.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/select/group_clearance_select/GroupClearanceParams;", "Lcom/avito/android/util/OpenParams;", "_avito_select_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class GroupClearanceParams implements OpenParams {

    @Y61.k
    public static final Parcelable.Creator<GroupClearanceParams> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f265443b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f265444c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<ClearanceValue> f265445d;

    /* renamed from: e, reason: collision with root package name */
    public final int f265446e;

    /* renamed from: f, reason: collision with root package name */
    public final int f265447f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f265448g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final String f265449h;

    /* compiled from: GroupClearanceParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GroupClearanceParams> {
        @Override // android.os.Parcelable.Creator
        public final GroupClearanceParams createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(GroupClearanceParams.class, parcel, arrayList, iL2, 1);
            }
            return new GroupClearanceParams(string, string2, arrayList, parcel.readInt(), parcel.readInt(), parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final GroupClearanceParams[] newArray(int i12) {
            return new GroupClearanceParams[i12];
        }
    }

    public GroupClearanceParams(@Y61.l String str, @Y61.l String str2, @Y61.k List<ClearanceValue> list, int i12, int i13, @Y61.l String str3, @Y61.l String str4) {
        this.f265443b = str;
        this.f265444c = str2;
        this.f265445d = list;
        this.f265446e = i12;
        this.f265447f = i13;
        this.f265448g = str3;
        this.f265449h = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GroupClearanceParams)) {
            return false;
        }
        GroupClearanceParams groupClearanceParams = (GroupClearanceParams) obj;
        return L.f(this.f265443b, groupClearanceParams.f265443b) && L.f(this.f265444c, groupClearanceParams.f265444c) && L.f(this.f265445d, groupClearanceParams.f265445d) && this.f265446e == groupClearanceParams.f265446e && this.f265447f == groupClearanceParams.f265447f && L.f(this.f265448g, groupClearanceParams.f265448g) && L.f(this.f265449h, groupClearanceParams.f265449h);
    }

    public final int hashCode() {
        String str = this.f265443b;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.f265444c;
        int iE2 = r.e(this.f265447f, r.e(this.f265446e, H.e((iHashCode + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f265445d), 31), 31);
        String str3 = this.f265448g;
        int iHashCode2 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f265449h;
        return iHashCode2 + (str4 != null ? str4.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("GroupClearanceParams(requestId=");
        sb2.append(this.f265443b);
        sb2.append(", title=");
        sb2.append(this.f265444c);
        sb2.append(", clearanceValues=");
        sb2.append(this.f265445d);
        sb2.append(", valueFrom=");
        sb2.append(this.f265446e);
        sb2.append(", valueTo=");
        sb2.append(this.f265447f);
        sb2.append(", fromParameterId=");
        sb2.append(this.f265448g);
        sb2.append(", toParameterId=");
        return C22026a.c(sb2, this.f265449h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f265443b);
        parcel.writeString(this.f265444c);
        Iterator itJ = C0.j(this.f265445d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f265446e);
        parcel.writeInt(this.f265447f);
        parcel.writeString(this.f265448g);
        parcel.writeString(this.f265449h);
    }

    public /* synthetic */ GroupClearanceParams(String str, String str2, List list, int i12, int i13, String str3, String str4, int i14, C42822w c42822w) {
        this(str, str2, list, i12, i13, (i14 & 32) != 0 ? null : str3, (i14 & 64) != 0 ? null : str4);
    }
}
