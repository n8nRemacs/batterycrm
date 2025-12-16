package com.avito.android.mortgage.person_form.list.items.child;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.android.mortgage.person_form.list.items.checkbox.CheckboxItem;
import com.avito.android.mortgage.person_form.list.items.input.InputItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ChildItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/child/ChildItem;", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class ChildItem implements PersonFormItem {

    @k
    public static final Parcelable.Creator<ChildItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200606b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f200607c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final String f200608d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final InputItem f200609e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final CheckboxItem f200610f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f200611g;

    /* compiled from: ChildItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ChildItem> {
        @Override // android.os.Parcelable.Creator
        public final ChildItem createFromParcel(Parcel parcel) {
            return new ChildItem(parcel.readString(), parcel.readString(), parcel.readString(), InputItem.CREATOR.createFromParcel(parcel), CheckboxItem.CREATOR.createFromParcel(parcel), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final ChildItem[] newArray(int i12) {
            return new ChildItem[i12];
        }
    }

    public ChildItem(@k String str, @k String str2, @k String str3, @k InputItem inputItem, @k CheckboxItem checkboxItem, boolean z12) {
        this.f200606b = str;
        this.f200607c = str2;
        this.f200608d = str3;
        this.f200609e = inputItem;
        this.f200610f = checkboxItem;
        this.f200611g = z12;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    @k
    public final PersonFormItem N() {
        InputItem inputItem = this.f200609e;
        inputItem.getClass();
        InputItem inputItemA = InputItem.a(inputItem, 4095);
        CheckboxItem checkboxItem = (CheckboxItem) this.f200610f.N();
        return new ChildItem(this.f200606b, this.f200607c, this.f200608d, inputItemA, checkboxItem, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ChildItem)) {
            return false;
        }
        ChildItem childItem = (ChildItem) obj;
        return L.f(this.f200606b, childItem.f200606b) && L.f(this.f200607c, childItem.f200607c) && L.f(this.f200608d, childItem.f200608d) && L.f(this.f200609e, childItem.f200609e) && L.f(this.f200610f, childItem.f200610f) && this.f200611g == childItem.f200611g;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF200568g() {
        return this.f200611g;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    public final boolean getHasError() {
        return this.f200609e.getHasError();
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF74796b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF74797c() {
        return this.f200606b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200611g) + ((this.f200610f.hashCode() + ((this.f200609e.hashCode() + H.d(H.d(this.f200606b.hashCode() * 31, 31, this.f200607c), 31, this.f200608d)) * 31)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ChildItem(stringId=");
        sb2.append(this.f200606b);
        sb2.append(", parentId=");
        sb2.append(this.f200607c);
        sb2.append(", title=");
        sb2.append(this.f200608d);
        sb2.append(", input=");
        sb2.append(this.f200609e);
        sb2.append(", checkbox=");
        sb2.append(this.f200610f);
        sb2.append(", enabled=");
        return r.x(sb2, this.f200611g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200606b);
        parcel.writeString(this.f200607c);
        parcel.writeString(this.f200608d);
        this.f200609e.writeToParcel(parcel, i12);
        this.f200610f.writeToParcel(parcel, i12);
        parcel.writeInt(this.f200611g ? 1 : 0);
    }

    public /* synthetic */ ChildItem(String str, String str2, String str3, InputItem inputItem, CheckboxItem checkboxItem, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, str3, inputItem, checkboxItem, (i12 & 32) != 0 ? true : z12);
    }
}
