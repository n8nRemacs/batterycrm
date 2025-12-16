package com.avito.android.section.vertical.button;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Action;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionVerticalButtonItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/vertical/button/SectionVerticalButtonItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionVerticalButtonItem implements PersistableSpannedItem {

    @k
    public static final Parcelable.Creator<SectionVerticalButtonItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f264947b;

    /* renamed from: c, reason: collision with root package name */
    public final int f264948c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f264949d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final Action f264950e;

    /* compiled from: SectionVerticalButtonItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionVerticalButtonItem> {
        @Override // android.os.Parcelable.Creator
        public final SectionVerticalButtonItem createFromParcel(Parcel parcel) {
            return new SectionVerticalButtonItem(parcel.readString(), parcel.readInt(), (PrintableText) parcel.readParcelable(SectionVerticalButtonItem.class.getClassLoader()), (Action) parcel.readParcelable(SectionVerticalButtonItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SectionVerticalButtonItem[] newArray(int i12) {
            return new SectionVerticalButtonItem[i12];
        }
    }

    public SectionVerticalButtonItem(@k String str, int i12, @k PrintableText printableText, @k Action action) {
        this.f264947b = str;
        this.f264948c = i12;
        this.f264949d = printableText;
        this.f264950e = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionVerticalButtonItem)) {
            return false;
        }
        SectionVerticalButtonItem sectionVerticalButtonItem = (SectionVerticalButtonItem) obj;
        return L.f(this.f264947b, sectionVerticalButtonItem.f264947b) && this.f264948c == sectionVerticalButtonItem.f264948c && L.f(this.f264949d, sectionVerticalButtonItem.f264949d) && L.f(this.f264950e, sectionVerticalButtonItem.f264950e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF117182c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78565d() {
        return this.f264948c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217937b() {
        return this.f264947b;
    }

    public final int hashCode() {
        return this.f264950e.hashCode() + com.avito.android.actions_sheet.a.f(this.f264949d, r.e(this.f264948c, this.f264947b.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        return "SectionVerticalButtonItem(stringId=" + this.f264947b + ", spanCount=" + this.f264948c + ", text=" + this.f264949d + ", action=" + this.f264950e + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f264947b);
        parcel.writeInt(this.f264948c);
        parcel.writeParcelable(this.f264949d, i12);
        parcel.writeParcelable(this.f264950e, i12);
    }
}
