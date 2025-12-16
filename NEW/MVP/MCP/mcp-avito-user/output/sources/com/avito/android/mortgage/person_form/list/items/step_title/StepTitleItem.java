package com.avito.android.mortgage.person_form.list.items.step_title;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.person_form.list.items.PersonFormItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: StepTitleItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/mortgage/person_form/list/items/step_title/StepTitleItem;", "Lcom/avito/android/mortgage/person_form/list/items/PersonFormItem;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class StepTitleItem implements PersonFormItem {

    @k
    public static final Parcelable.Creator<StepTitleItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f200780b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f200781c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f200782d;

    /* compiled from: StepTitleItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<StepTitleItem> {
        @Override // android.os.Parcelable.Creator
        public final StepTitleItem createFromParcel(Parcel parcel) {
            return new StepTitleItem(parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final StepTitleItem[] newArray(int i12) {
            return new StepTitleItem[i12];
        }
    }

    public StepTitleItem(@k String str, @k String str2, boolean z12) {
        this.f200780b = str;
        this.f200781c = str2;
        this.f200782d = z12;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    @k
    public final PersonFormItem N() {
        return new StepTitleItem(this.f200780b, this.f200781c, false);
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof StepTitleItem)) {
            return false;
        }
        StepTitleItem stepTitleItem = (StepTitleItem) obj;
        return L.f(this.f200780b, stepTitleItem.f200780b) && L.f(this.f200781c, stepTitleItem.f200781c) && this.f200782d == stepTitleItem.f200782d;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    /* renamed from: getEnabled, reason: from getter */
    public final boolean getF200731e() {
        return this.f200782d;
    }

    @Override // com.avito.android.mortgage.person_form.list.items.PersonFormItem
    public final boolean getHasError() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85003b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF162964b() {
        return this.f200780b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f200782d) + H.d(this.f200780b.hashCode() * 31, 31, this.f200781c);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("StepTitleItem(stringId=");
        sb2.append(this.f200780b);
        sb2.append(", text=");
        sb2.append(this.f200781c);
        sb2.append(", enabled=");
        return r.x(sb2, this.f200782d, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f200780b);
        parcel.writeString(this.f200781c);
        parcel.writeInt(this.f200782d ? 1 : 0);
    }

    public /* synthetic */ StepTitleItem(String str, String str2, boolean z12, int i12, C42822w c42822w) {
        this(str, str2, (i12 & 4) != 0 ? true : z12);
    }
}
