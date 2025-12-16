package com.avito.android.lib.design.docking_badge;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import bV.C25568a;
import com.avito.android.lib.design.docking_badge.DockingBadgeType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DockinBadgeItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/docking_badge/DockingBadgeItem;", "Landroid/os/Parcelable;", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class DockingBadgeItem implements Parcelable {

    @k
    public static final Parcelable.Creator<DockingBadgeItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f179127b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final DockingBadgeType f179128c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final DockingBadgeEdgeType f179129d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final DockingBadgeEdgeType f179130e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final C25568a f179131f;

    /* compiled from: DockinBadgeItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<DockingBadgeItem> {
        @Override // android.os.Parcelable.Creator
        public final DockingBadgeItem createFromParcel(Parcel parcel) {
            return new DockingBadgeItem(parcel.readString(), (DockingBadgeType) parcel.readParcelable(DockingBadgeItem.class.getClassLoader()), parcel.readInt() == 0 ? null : DockingBadgeEdgeType.valueOf(parcel.readString()), DockingBadgeEdgeType.valueOf(parcel.readString()), (C25568a) parcel.readValue(DockingBadgeItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final DockingBadgeItem[] newArray(int i12) {
            return new DockingBadgeItem[i12];
        }
    }

    public DockingBadgeItem(@k String str, @k DockingBadgeType dockingBadgeType, @l DockingBadgeEdgeType dockingBadgeEdgeType, @k DockingBadgeEdgeType dockingBadgeEdgeType2, @l C25568a c25568a) {
        this.f179127b = str;
        this.f179128c = dockingBadgeType;
        this.f179129d = dockingBadgeEdgeType;
        this.f179130e = dockingBadgeEdgeType2;
        this.f179131f = c25568a;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DockingBadgeItem)) {
            return false;
        }
        DockingBadgeItem dockingBadgeItem = (DockingBadgeItem) obj;
        return L.f(this.f179127b, dockingBadgeItem.f179127b) && L.f(this.f179128c, dockingBadgeItem.f179128c) && this.f179129d == dockingBadgeItem.f179129d && this.f179130e == dockingBadgeItem.f179130e && L.f(this.f179131f, dockingBadgeItem.f179131f);
    }

    public final int hashCode() {
        int iHashCode = (this.f179128c.hashCode() + (this.f179127b.hashCode() * 31)) * 31;
        DockingBadgeEdgeType dockingBadgeEdgeType = this.f179129d;
        int iHashCode2 = (this.f179130e.hashCode() + ((iHashCode + (dockingBadgeEdgeType == null ? 0 : dockingBadgeEdgeType.hashCode())) * 31)) * 31;
        C25568a c25568a = this.f179131f;
        return iHashCode2 + (c25568a != null ? c25568a.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DockingBadgeItem(title=" + this.f179127b + ", type=" + this.f179128c + ", startEdge=" + this.f179129d + ", endEdge=" + this.f179130e + ", style=" + this.f179131f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f179127b);
        parcel.writeParcelable(this.f179128c, i12);
        DockingBadgeEdgeType dockingBadgeEdgeType = this.f179129d;
        if (dockingBadgeEdgeType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(dockingBadgeEdgeType.name());
        }
        parcel.writeString(this.f179130e.name());
        parcel.writeValue(this.f179131f);
    }

    public /* synthetic */ DockingBadgeItem(String str, DockingBadgeType dockingBadgeType, DockingBadgeEdgeType dockingBadgeEdgeType, DockingBadgeEdgeType dockingBadgeEdgeType2, C25568a c25568a, int i12, C42822w c42822w) {
        this(str, (i12 & 2) != 0 ? DockingBadgeType.Predefined.Gray : dockingBadgeType, (i12 & 4) != 0 ? null : dockingBadgeEdgeType, dockingBadgeEdgeType2, (i12 & 16) != 0 ? null : c25568a);
    }
}
