package com.avito.android.items;

import JO.i;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.category_parameters.ParameterElement;
import com.avito.android.items.ItemWithState;
import com.avito.android.remote.model.text.AttributedText;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SwitcherItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/items/SwitcherItem;", "Landroid/os/Parcelable;", "Lcom/avito/conveyor_item/a;", "Lcom/avito/android/items/ItemWithState;", "LJO/i;", "Lcom/avito/android/category_parameters/ParameterElement$o;", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class SwitcherItem implements Parcelable, com.avito.conveyor_item.a, ItemWithState, i, ParameterElement.o {

    @k
    public static final Parcelable.Creator<SwitcherItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f173917b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f173918c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f173919d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final AttributedText f173920e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public ItemWithState.State f173921f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final AttributedText f173922g;

    /* renamed from: h, reason: collision with root package name */
    @l
    public final String f173923h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f173924i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final String f173925j;

    /* renamed from: k, reason: collision with root package name */
    @l
    public final String f173926k;

    /* compiled from: SwitcherItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SwitcherItem> {
        @Override // android.os.Parcelable.Creator
        public final SwitcherItem createFromParcel(Parcel parcel) {
            return new SwitcherItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0, (AttributedText) parcel.readParcelable(SwitcherItem.class.getClassLoader()), (ItemWithState.State) parcel.readParcelable(SwitcherItem.class.getClassLoader()), (AttributedText) parcel.readParcelable(SwitcherItem.class.getClassLoader()), parcel.readString(), parcel.readInt() != 0, parcel.readString(), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final SwitcherItem[] newArray(int i12) {
            return new SwitcherItem[i12];
        }
    }

    public SwitcherItem(@k String str, @k String str2, boolean z12, @l AttributedText attributedText, @k ItemWithState.State state, @l AttributedText attributedText2, @l String str3, boolean z13, @l String str4, @l String str5) {
        this.f173917b = str;
        this.f173918c = str2;
        this.f173919d = z12;
        this.f173920e = attributedText;
        this.f173921f = state;
        this.f173922g = attributedText2;
        this.f173923h = str3;
        this.f173924i = z13;
        this.f173925j = str4;
        this.f173926k = str5;
    }

    @Override // com.avito.android.items.ItemWithState
    public final void O0(@k ItemWithState.State state) {
        this.f173921f = state;
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
        return L.f(this.f173917b, switcherItem.f173917b) && L.f(this.f173918c, switcherItem.f173918c) && this.f173919d == switcherItem.f173919d && L.f(this.f173920e, switcherItem.f173920e) && L.f(this.f173921f, switcherItem.f173921f) && L.f(this.f173922g, switcherItem.f173922g) && L.f(this.f173923h, switcherItem.f173923h) && this.f173924i == switcherItem.f173924i && L.f(this.f173925j, switcherItem.f173925j) && L.f(this.f173926k, switcherItem.f173926k);
    }

    @Override // com.avito.android.category_parameters.ParameterElement.o
    @l
    /* renamed from: getGroupId, reason: from getter */
    public final String getF173935j() {
        return this.f173926k;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80368b() {
        return getF8949b().hashCode();
    }

    @Override // JO.i
    @l
    /* renamed from: getMotivation, reason: from getter */
    public final AttributedText getF173932g() {
        return this.f173922g;
    }

    @Override // com.avito.android.items.ItemWithState
    @k
    /* renamed from: getState, reason: from getter */
    public final ItemWithState.State getF173931f() {
        return this.f173921f;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF8949b() {
        return this.f173917b;
    }

    public final int hashCode() {
        int i12 = r.i(H.d(this.f173917b.hashCode() * 31, 31, this.f173918c), 31, this.f173919d);
        AttributedText attributedText = this.f173920e;
        int iHashCode = (this.f173921f.hashCode() + ((i12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31)) * 31;
        AttributedText attributedText2 = this.f173922g;
        int iHashCode2 = (iHashCode + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        String str = this.f173923h;
        int i13 = r.i((iHashCode2 + (str == null ? 0 : str.hashCode())) * 31, 31, this.f173924i);
        String str2 = this.f173925j;
        int iHashCode3 = (i13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.f173926k;
        return iHashCode3 + (str3 != null ? str3.hashCode() : 0);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SwitcherItem(stringId=");
        sb2.append(this.f173917b);
        sb2.append(", text=");
        sb2.append(this.f173918c);
        sb2.append(", isChecked=");
        sb2.append(this.f173919d);
        sb2.append(", subTitle=");
        sb2.append(this.f173920e);
        sb2.append(", state=");
        sb2.append(this.f173921f);
        sb2.append(", motivation=");
        sb2.append(this.f173922g);
        sb2.append(", header=");
        sb2.append(this.f173923h);
        sb2.append(", hideTitle=");
        sb2.append(this.f173924i);
        sb2.append(", titleStyle=");
        sb2.append(this.f173925j);
        sb2.append(", groupId=");
        return C22026a.c(sb2, this.f173926k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f173917b);
        parcel.writeString(this.f173918c);
        parcel.writeInt(this.f173919d ? 1 : 0);
        parcel.writeParcelable(this.f173920e, i12);
        parcel.writeParcelable(this.f173921f, i12);
        parcel.writeParcelable(this.f173922g, i12);
        parcel.writeString(this.f173923h);
        parcel.writeInt(this.f173924i ? 1 : 0);
        parcel.writeString(this.f173925j);
        parcel.writeString(this.f173926k);
    }

    public /* synthetic */ SwitcherItem(String str, String str2, boolean z12, AttributedText attributedText, ItemWithState.State state, AttributedText attributedText2, String str3, boolean z13, String str4, String str5, int i12, C42822w c42822w) {
        this(str, str2, z12, (i12 & 8) != 0 ? null : attributedText, (i12 & 16) != 0 ? new ItemWithState.State.Normal(null, 1, null) : state, (i12 & 32) != 0 ? null : attributedText2, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? false : z13, (i12 & 256) != 0 ? null : str4, (i12 & 512) != 0 ? null : str5);
    }
}
