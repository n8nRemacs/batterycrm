package com.avito.android.mortgage.person_form.list.items.nav_button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.conveyor_item.a;
import j.e0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: NavButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/nav_button/NavButtonItem;", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class NavButtonItem implements PersonFormItem {

    @k
    public static final Parcelable.Creator<NavButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200728b;

    /* renamed from: c, reason: collision with root package name */
    public final int f200729c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f200730d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f200731e;

    /* compiled from: NavButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<NavButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final NavButtonItem createFromParcel(Parcel parcel) {
            return new NavButtonItem(parcel.readString(), parcel.readInt(), parcel.readInt() != 0, parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final NavButtonItem[] newArray(int i12) {
            return new NavButtonItem[i12];
        }
    }

    public NavButtonItem(@k String str, @e0 int i12, boolean z12, boolean z13) {
        this.f200728b = str;
        this.f200729c = i12;
        this.f200730d = z12;
        this.f200731e = z13;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    @k
    public final PersonFormItem N() {
        return new NavButtonItem(this.f200728b, this.f200729c, this.f200730d, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof NavButtonItem)) {
            return false;
        }
        NavButtonItem navButtonItem = (NavButtonItem) obj;
        return L.f(this.f200728b, navButtonItem.f200728b) && this.f200729c == navButtonItem.f200729c && this.f200730d == navButtonItem.f200730d && this.f200731e == navButtonItem.f200731e;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF200663k() {
        return this.f200731e;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    public final boolean getHasError() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF78384b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF78385c() {
        return this.f200728b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200731e) + r.i(r.e(this.f200729c, this.f200728b.hashCode() * 31, 31), 31, this.f200730d);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("NavButtonItem(stringId=");
        sb2.append(this.f200728b);
        sb2.append(", titleRes=");
        sb2.append(this.f200729c);
        sb2.append(", isLoading=");
        sb2.append(this.f200730d);
        sb2.append(", enabled=");
        return r.x(sb2, this.f200731e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200728b);
        parcel.writeInt(this.f200729c);
        parcel.writeInt(this.f200730d ? 1 : 0);
        parcel.writeInt(this.f200731e ? 1 : 0);
    }

    public /* synthetic */ NavButtonItem(String str, int i12, boolean z12, boolean z13, int i13, C42822w c42822w) {
        this(str, i12, (i13 & 4) != 0 ? false : z12, (i13 & 8) != 0 ? true : z13);
    }
}
