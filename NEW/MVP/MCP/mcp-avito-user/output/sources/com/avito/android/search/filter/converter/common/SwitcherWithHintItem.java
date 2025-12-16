package com.avito.android.search.filter.converter.common;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.category_parameters.Badge;
import com.avito.android.remote.model.category_parameters.BooleanParameter;
import com.avito.android.search.filter.converter.ParameterElement;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SwitcherWithHintItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/search/filter/converter/common/SwitcherWithHintItem;", "Landroid/os/Parcelable;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/search/filter/converter/ParameterElement$m;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SwitcherWithHintItem implements Parcelable, com.avito.conveyor_item.a, ParameterElement.m {

    @k
    public static final Parcelable.Creator<SwitcherWithHintItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f262943b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f262944c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f262945d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f262946e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final String f262947f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Badge f262948g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final BooleanParameter.Hint f262949h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f262950i;

    /* compiled from: SwitcherWithHintItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SwitcherWithHintItem> {
        @Override // android.os.Parcelable.Creator
        public final SwitcherWithHintItem createFromParcel(Parcel parcel) {
            return new SwitcherWithHintItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (Badge) parcel.readParcelable(SwitcherWithHintItem.class.getClassLoader()), (BooleanParameter.Hint) parcel.readParcelable(SwitcherWithHintItem.class.getClassLoader()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SwitcherWithHintItem[] newArray(int i12) {
            return new SwitcherWithHintItem[i12];
        }
    }

    public SwitcherWithHintItem(@k String str, @k String str2, boolean z12, boolean z13, @l String str3, @l Badge badge, @l BooleanParameter.Hint hint, @l String str4) {
        this.f262943b = str;
        this.f262944c = str2;
        this.f262945d = z12;
        this.f262946e = z13;
        this.f262947f = str3;
        this.f262948g = badge;
        this.f262949h = hint;
        this.f262950i = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitcherWithHintItem)) {
            return false;
        }
        SwitcherWithHintItem switcherWithHintItem = (SwitcherWithHintItem) obj;
        return L.f(this.f262943b, switcherWithHintItem.f262943b) && L.f(this.f262944c, switcherWithHintItem.f262944c) && this.f262945d == switcherWithHintItem.f262945d && this.f262946e == switcherWithHintItem.f262946e && L.f(this.f262947f, switcherWithHintItem.f262947f) && L.f(this.f262948g, switcherWithHintItem.f262948g) && L.f(this.f262949h, switcherWithHintItem.f262949h) && L.f(this.f262950i, switcherWithHintItem.f262950i);
    }

    @Override // com.avito.android.search.filter.converter.ParameterElement.m
    @l
    /* renamed from: getGroupId, reason: from getter */
    public final String getF262950i() {
        return this.f262950i;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF395939g() {
        return getF262943b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF262943b() {
        return this.f262943b;
    }

    public final int hashCode() {
        int i12 = r.i(r.i(H.d(this.f262943b.hashCode() * 31, 31, this.f262944c), 31, this.f262945d), 31, this.f262946e);
        String str = this.f262947f;
        int iHashCode = (i12 + (str == null ? 0 : str.hashCode())) * 31;
        Badge badge = this.f262948g;
        int iHashCode2 = (iHashCode + (badge == null ? 0 : badge.hashCode())) * 31;
        BooleanParameter.Hint hint = this.f262949h;
        int iHashCode3 = (iHashCode2 + (hint == null ? 0 : hint.hashCode())) * 31;
        String str2 = this.f262950i;
        return iHashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SwitcherWithHintItem(stringId=");
        sb2.append(this.f262943b);
        sb2.append(", title=");
        sb2.append(this.f262944c);
        sb2.append(", isChecked=");
        sb2.append(this.f262945d);
        sb2.append(", isEnabled=");
        sb2.append(this.f262946e);
        sb2.append(", subtitle=");
        sb2.append(this.f262947f);
        sb2.append(", badge=");
        sb2.append(this.f262948g);
        sb2.append(", hint=");
        sb2.append(this.f262949h);
        sb2.append(", groupId=");
        return C22026a.c(sb2, this.f262950i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f262943b);
        parcel.writeString(this.f262944c);
        parcel.writeInt(this.f262945d ? 1 : 0);
        parcel.writeInt(this.f262946e ? 1 : 0);
        parcel.writeString(this.f262947f);
        parcel.writeParcelable(this.f262948g, i12);
        parcel.writeParcelable(this.f262949h, i12);
        parcel.writeString(this.f262950i);
    }

    public /* synthetic */ SwitcherWithHintItem(String str, String str2, boolean z12, boolean z13, String str3, Badge badge, BooleanParameter.Hint hint, String str4, int i12, C42822w c42822w) {
        this(str, str2, z12, z13, (i12 & 16) != 0 ? null : str3, (i12 & 32) != 0 ? null : badge, (i12 & 64) != 0 ? null : hint, (i12 & 128) != 0 ? null : str4);
    }
}
