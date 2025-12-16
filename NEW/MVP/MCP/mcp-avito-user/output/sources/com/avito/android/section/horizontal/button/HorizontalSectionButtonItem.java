package com.avito.android.section.horizontal.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Action;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: HorizontalSectionButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/horizontal/button/HorizontalSectionButtonItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HorizontalSectionButtonItem implements PersistableSerpItem {

    @k
    public static final Parcelable.Creator<HorizontalSectionButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f264688b;

    /* renamed from: c, reason: collision with root package name */
    public final int f264689c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f264690d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Action f264691e;

    /* compiled from: HorizontalSectionButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HorizontalSectionButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalSectionButtonItem createFromParcel(Parcel parcel) {
            return new HorizontalSectionButtonItem(parcel.readString(), parcel.readInt(), (PrintableText) parcel.readParcelable(HorizontalSectionButtonItem.class.getClassLoader()), (Action) parcel.readParcelable(HorizontalSectionButtonItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalSectionButtonItem[] newArray(int i12) {
            return new HorizontalSectionButtonItem[i12];
        }
    }

    public HorizontalSectionButtonItem(@k String str, int i12, @k PrintableText printableText, @l Action action) {
        this.f264688b = str;
        this.f264689c = i12;
        this.f264690d = printableText;
        this.f264691e = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalSectionButtonItem)) {
            return false;
        }
        HorizontalSectionButtonItem horizontalSectionButtonItem = (HorizontalSectionButtonItem) obj;
        return L.f(this.f264688b, horizontalSectionButtonItem.f264688b) && this.f264689c == horizontalSectionButtonItem.f264689c && L.f(this.f264690d, horizontalSectionButtonItem.f264690d) && L.f(this.f264691e, horizontalSectionButtonItem.f264691e);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272697l() {
        return false;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF270169c() {
        return this.f264689c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF270170d() {
        return this.f264688b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public final SerpViewType getF270174h() {
        return SerpViewType.f268583c;
    }

    public final int hashCode() {
        int iF2 = com.avito.android.actions_sheet.a.f(this.f264690d, r.e(this.f264689c, this.f264688b.hashCode() * 31, 31), 31);
        Action action = this.f264691e;
        return iF2 + (action == null ? 0 : action.hashCode());
    }

    @k
    public final String toString() {
        return "HorizontalSectionButtonItem(stringId=" + this.f264688b + ", spanCount=" + this.f264689c + ", text=" + this.f264690d + ", action=" + this.f264691e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f264688b);
        parcel.writeInt(this.f264689c);
        parcel.writeParcelable(this.f264690d, i12);
        parcel.writeParcelable(this.f264691e, i12);
    }
}
