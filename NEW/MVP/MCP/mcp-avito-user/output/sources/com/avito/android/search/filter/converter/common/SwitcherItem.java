package com.avito.android.search.filter.converter.common;

import Cp0.InterfaceC13339c;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.search.filter.converter.ParameterElement;
import com.avito.android.search.filter.converter.common.ItemWithState;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SwitcherItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/search/filter/converter/common/SwitcherItem;", "Landroid/os/Parcelable;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/search/filter/converter/common/ItemWithState;", "LCp0/c;", "Lcom/avito/android/search/filter/converter/ParameterElement$m;", "_avito_search_filter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SwitcherItem implements Parcelable, com.avito.conveyor_item.a, ItemWithState, InterfaceC13339c, ParameterElement.m {

    @k
    public static final Parcelable.Creator<SwitcherItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f262934b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f262935c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f262936d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f262937e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final ItemWithState.State f262938f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f262939g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f262940h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f262941i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f262942j;

    /* compiled from: SwitcherItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SwitcherItem> {
        @Override // android.os.Parcelable.Creator
        public final SwitcherItem createFromParcel(Parcel parcel) {
            return new SwitcherItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0, (AttributedText) parcel.readParcelable(SwitcherItem.class.getClassLoader()), (ItemWithState.State) parcel.readParcelable(SwitcherItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(SwitcherItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SwitcherItem[] newArray(int i12) {
            return new SwitcherItem[i12];
        }
    }

    public SwitcherItem(@k String str, @k String str2, boolean z12, @l AttributedText attributedText, @k ItemWithState.State state, @l AttributedText attributedText2, @l String str3, boolean z13, @l String str4) {
        this.f262934b = str;
        this.f262935c = str2;
        this.f262936d = z12;
        this.f262937e = attributedText;
        this.f262938f = state;
        this.f262939g = attributedText2;
        this.f262940h = str3;
        this.f262941i = z13;
        this.f262942j = str4;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SwitcherItem)) {
            return false;
        }
        SwitcherItem switcherItem = (SwitcherItem) obj;
        return L.f(this.f262934b, switcherItem.f262934b) && L.f(this.f262935c, switcherItem.f262935c) && this.f262936d == switcherItem.f262936d && L.f(this.f262937e, switcherItem.f262937e) && L.f(this.f262938f, switcherItem.f262938f) && L.f(this.f262939g, switcherItem.f262939g) && L.f(this.f262940h, switcherItem.f262940h) && this.f262941i == switcherItem.f262941i && L.f(this.f262942j, switcherItem.f262942j);
    }

    @Override // com.avito.android.search.filter.converter.ParameterElement.m
    @l
    /* renamed from: getGroupId, reason: from getter */
    public final String getF262972n() {
        return this.f262942j;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF124032b() {
        return getF258540b().hashCode();
    }

    @Override // Cp0.InterfaceC13339c
    @l
    /* renamed from: getMotivation */
    public final AttributedText getF262796o() {
        throw null;
    }

    @Override // com.avito.android.search.filter.converter.common.ItemWithState
    @k
    /* renamed from: getState */
    public final ItemWithState.State getF262797p() {
        throw null;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF258540b() {
        return this.f262934b;
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.f262934b.hashCode() * 31, 31, this.f262935c), 31, this.f262936d);
        AttributedText attributedText = this.f262937e;
        int iHashCode = (this.f262938f.hashCode() + ((i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        AttributedText attributedText2 = this.f262939g;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.f262940h;
        int i13 = r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f262941i);
        String str2 = this.f262942j;
        return i13 + (str2 != null ? str2.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SwitcherItem(stringId=");
        sb2.append(this.f262934b);
        sb2.append(", text=");
        sb2.append(this.f262935c);
        sb2.append(", isChecked=");
        sb2.append(this.f262936d);
        sb2.append(", subTitle=");
        sb2.append(this.f262937e);
        sb2.append(", state=");
        sb2.append(this.f262938f);
        sb2.append(", motivation=");
        sb2.append(this.f262939g);
        sb2.append(", header=");
        sb2.append(this.f262940h);
        sb2.append(", hideTitle=");
        sb2.append(this.f262941i);
        sb2.append(", groupId=");
        return C22026a.c(sb2, this.f262942j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f262934b);
        parcel.writeString(this.f262935c);
        parcel.writeInt(this.f262936d ? 1 : 0);
        parcel.writeParcelable(this.f262937e, i12);
        parcel.writeParcelable(this.f262938f, i12);
        parcel.writeParcelable(this.f262939g, i12);
        parcel.writeString(this.f262940h);
        parcel.writeInt(this.f262941i ? 1 : 0);
        parcel.writeString(this.f262942j);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ SwitcherItem(String str, String str2, boolean z12, AttributedText attributedText, ItemWithState.State state, AttributedText attributedText2, String str3, boolean z13, String str4, int i12, C42822w c42822w) {
        ItemWithState.State normal;
        CharSequence charSequence = null;
        Object[] objArr = 0;
        AttributedText attributedText3 = (i12 & 8) != 0 ? null : attributedText;
        if ((i12 & 16) != 0) {
            normal = new ItemWithState.State.Normal(charSequence, 1, objArr == true ? 1 : 0);
        } else {
            normal = state;
        }
        this(str, str2, z12, attributedText3, normal, (i12 & 32) != 0 ? null : attributedText2, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? false : z13, (i12 & 256) != 0 ? null : str4);
    }
}
