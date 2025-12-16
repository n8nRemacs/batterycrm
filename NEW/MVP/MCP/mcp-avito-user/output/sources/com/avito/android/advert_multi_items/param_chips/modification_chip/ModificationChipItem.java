package com.avito.android.advert_multi_items.param_chips.modification_chip;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.avito.android.advert_multi_items.model.ModificationItem;
import com.avito.android.advert_multi_items.model.ModificationViewState;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ModificationChipItem.kt */
@d
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advert_multi_items/param_chips/modification_chip/ModificationChipItem;", "Lcom/avito/android/advert_multi_items/model/ModificationItem;", "_avito_advert-multi-items_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ModificationChipItem implements ModificationItem {

    @k
    public static final Parcelable.Creator<ModificationChipItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f85922b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f85923c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ModificationViewState f85924d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final String f85925e;

    /* compiled from: ModificationChipItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ModificationChipItem> {
        @Override // android.os.Parcelable.Creator
        public final ModificationChipItem createFromParcel(Parcel parcel) {
            return new ModificationChipItem(parcel.readString(), parcel.readString(), ModificationViewState.valueOf(parcel.readString()), parcel.readString());
        }

        @Override // android.os.Parcelable.Creator
        public final ModificationChipItem[] newArray(int i12) {
            return new ModificationChipItem[i12];
        }
    }

    public ModificationChipItem(@k String str, @k String str2, @k ModificationViewState modificationViewState, @k String str3) {
        this.f85922b = str;
        this.f85923c = str2;
        this.f85924d = modificationViewState;
        this.f85925e = str3;
    }

    @Override // com.avito.android.advert_multi_items.model.ModificationItem
    @k
    /* renamed from: D4, reason: from getter */
    public final String getF85922b() {
        return this.f85922b;
    }

    @Override // Ra.InterfaceC15021a
    @k
    /* renamed from: W, reason: from getter */
    public final ModificationViewState getF85924d() {
        return this.f85924d;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ModificationChipItem)) {
            return false;
        }
        ModificationChipItem modificationChipItem = (ModificationChipItem) obj;
        return L.f(this.f85922b, modificationChipItem.f85922b) && L.f(this.f85923c, modificationChipItem.f85923c) && this.f85924d == modificationChipItem.f85924d && L.f(this.f85925e, modificationChipItem.f85925e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.advert_multi_items.model.ModificationItem
    @k
    /* renamed from: getModificationId, reason: from getter */
    public final String getF85923c() {
        return this.f85923c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public final String getF87412b() {
        return this.f85923c;
    }

    public final int hashCode() {
        return this.f85925e.hashCode() + ((this.f85924d.hashCode() + H.d(this.f85922b.hashCode() * 31, 31, this.f85923c)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ModificationChipItem(parentParamTitle=");
        sb2.append(this.f85922b);
        sb2.append(", modificationId=");
        sb2.append(this.f85923c);
        sb2.append(", viewState=");
        sb2.append(this.f85924d);
        sb2.append(", title=");
        return C22026a.c(sb2, this.f85925e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f85922b);
        parcel.writeString(this.f85923c);
        parcel.writeString(this.f85924d.name());
        parcel.writeString(this.f85925e);
    }
}
