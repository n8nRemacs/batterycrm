package com.avito.android.section.placeholder;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.section.SectionElement;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: SectionPlaceholderItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/placeholder/SectionPlaceholderItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "Lcom/avito/android/remote/model/section/SectionElement;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionPlaceholderItem implements PersistableSpannedItem, SectionElement {

    @k
    public static final Parcelable.Creator<SectionPlaceholderItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f264852b;

    /* renamed from: c, reason: collision with root package name */
    public final int f264853c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f264854d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f264855e;

    /* compiled from: SectionPlaceholderItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionPlaceholderItem> {
        @Override // android.os.Parcelable.Creator
        public final SectionPlaceholderItem createFromParcel(Parcel parcel) {
            return new SectionPlaceholderItem(parcel.readString(), parcel.readInt(), (PrintableText) parcel.readParcelable(SectionPlaceholderItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SectionPlaceholderItem[] newArray(int i12) {
            return new SectionPlaceholderItem[i12];
        }
    }

    public SectionPlaceholderItem(@k String str, int i12, @k PrintableText printableText, boolean z12) {
        this.f264852b = str;
        this.f264853c = i12;
        this.f264854d = printableText;
        this.f264855e = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionPlaceholderItem)) {
            return false;
        }
        SectionPlaceholderItem sectionPlaceholderItem = (SectionPlaceholderItem) obj;
        return L.f(this.f264852b, sectionPlaceholderItem.f264852b) && this.f264853c == sectionPlaceholderItem.f264853c && L.f(this.f264854d, sectionPlaceholderItem.f264854d) && this.f264855e == sectionPlaceholderItem.f264855e;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF80598d() {
        return this.f264853c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF255560i() {
        return this.f264852b;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f264855e) + com.avito.android.actions_sheet.a.f(this.f264854d, r.e(this.f264853c, this.f264852b.hashCode() * 31, 31), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionPlaceholderItem(stringId=");
        sb2.append(this.f264852b);
        sb2.append(", spanCount=");
        sb2.append(this.f264853c);
        sb2.append(", text=");
        sb2.append(this.f264854d);
        sb2.append(", reloadable=");
        return r.x(sb2, this.f264855e, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f264852b);
        parcel.writeInt(this.f264853c);
        parcel.writeParcelable(this.f264854d, i12);
        parcel.writeInt(this.f264855e ? 1 : 0);
    }
}
