package com.avito.android.mortgage.landing.list.items.programs;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.landing.list.items.LandingItem;
import com.avito.android.mortgage.landing.list.items.ValueItem;
import com.avito.android.mortgage.landing.list.items.programs.program.ProgramItem;
import com.avito.conveyor_item.a;
import j.e0;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: ProgramsItem.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/landing/list/items/programs/ProgramsItem;", "Lcom/avito/android/mortgage/landing/list/items/LandingItem;", "Lcom/avito/android/mortgage/landing/list/items/ValueItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes15.dex */
public final /* data */ class ProgramsItem implements LandingItem, ValueItem {

    @Y61.k
    public static final Parcelable.Creator<ProgramsItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f199878b;

    /* renamed from: c, reason: collision with root package name */
    public final int f199879c;

    /* renamed from: d, reason: collision with root package name */
    public final int f199880d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final ArrayList f199881e;

    /* compiled from: ProgramsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProgramsItem> {
        @Override // android.os.Parcelable.Creator
        public final ProgramsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            int i14 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i14);
            int iC2 = 0;
            while (iC2 != i14) {
                iC2 = com.avito.android.actions_sheet.a.c(ProgramItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ProgramsItem(string, i12, i13, arrayList);
        }

        @Override // android.os.Parcelable.Creator
        public final ProgramsItem[] newArray(int i12) {
            return new ProgramsItem[i12];
        }
    }

    public ProgramsItem(@Y61.k String str, @e0 int i12, @e0 int i13, @Y61.k ArrayList arrayList) {
        this.f199878b = str;
        this.f199879c = i12;
        this.f199880d = i13;
        this.f199881e = arrayList;
    }

    public static ProgramsItem a(ProgramsItem programsItem, ArrayList arrayList) {
        String str = programsItem.f199878b;
        int i12 = programsItem.f199879c;
        int i13 = programsItem.f199880d;
        programsItem.getClass();
        return new ProgramsItem(str, i12, i13, arrayList);
    }

    @Override // com.avito.android.mortgage.landing.list.items.LandingItem
    @Y61.k
    public final LandingItem N() {
        ArrayList arrayList = this.f199881e;
        ArrayList arrayList2 = new ArrayList(C42745f0.q(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(ProgramItem.a((ProgramItem) it.next(), false, 4095));
        }
        return a(this, arrayList2);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ProgramsItem)) {
            return false;
        }
        ProgramsItem programsItem = (ProgramsItem) obj;
        return L.f(this.f199878b, programsItem.f199878b) && this.f199879c == programsItem.f199879c && this.f199880d == programsItem.f199880d && this.f199881e.equals(programsItem.f199881e);
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281447b() {
        return this.f199878b;
    }

    public final int hashCode() {
        return this.f199881e.hashCode() + r.e(this.f199880d, r.e(this.f199879c, this.f199878b.hashCode() * 31, 31), 31);
    }

    @Override // com.avito.android.mortgage.landing.list.items.ValueItem
    @Y61.l
    public final String s1() {
        Object next;
        String str;
        ArrayList arrayList = this.f199881e;
        Iterator it = arrayList.iterator();
        while (true) {
            if (!it.hasNext()) {
                next = null;
                break;
            }
            next = it.next();
            if (((ProgramItem) next).f199932m) {
                break;
            }
        }
        ProgramItem programItem = (ProgramItem) next;
        if (programItem != null && (str = programItem.f199921b) != null) {
            return str;
        }
        ProgramItem programItem2 = (ProgramItem) C42745f0.G(arrayList);
        if (programItem2 != null) {
            return programItem2.f199921b;
        }
        return null;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ProgramsItem(stringId=");
        sb2.append(this.f199878b);
        sb2.append(", title=");
        sb2.append(this.f199879c);
        sb2.append(", hint=");
        sb2.append(this.f199880d);
        sb2.append(", programs=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f199881e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f199878b);
        parcel.writeInt(this.f199879c);
        parcel.writeInt(this.f199880d);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f199881e, parcel);
        while (itZ.hasNext()) {
            ((ProgramItem) itZ.next()).writeToParcel(parcel, i12);
        }
    }
}
