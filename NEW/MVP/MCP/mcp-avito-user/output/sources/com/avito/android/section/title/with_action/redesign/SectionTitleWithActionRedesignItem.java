package com.avito.android.section.title.with_action.redesign;

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

/* compiled from: SectionTitleWithActionRedesignItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/title/with_action/redesign/SectionTitleWithActionRedesignItem;", "Lcom/avito/android/serp/adapter/PersistableSpannedItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionTitleWithActionRedesignItem implements PersistableSpannedItem {

    @k
    public static final Parcelable.Creator<SectionTitleWithActionRedesignItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f264886b;

    /* renamed from: c, reason: collision with root package name */
    public final int f264887c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final PrintableText f264888d;

    /* renamed from: e, reason: collision with root package name */
    public final boolean f264889e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Action f264890f;

    /* compiled from: SectionTitleWithActionRedesignItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionTitleWithActionRedesignItem> {
        @Override // android.os.Parcelable.Creator
        public final SectionTitleWithActionRedesignItem createFromParcel(Parcel parcel) {
            return new SectionTitleWithActionRedesignItem(parcel.readString(), parcel.readInt(), (PrintableText) parcel.readParcelable(SectionTitleWithActionRedesignItem.class.getClassLoader()), parcel.readInt() != 0, (Action) parcel.readParcelable(SectionTitleWithActionRedesignItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SectionTitleWithActionRedesignItem[] newArray(int i12) {
            return new SectionTitleWithActionRedesignItem[i12];
        }
    }

    public SectionTitleWithActionRedesignItem(@k String str, int i12, @k PrintableText printableText, boolean z12, @l Action action) {
        this.f264886b = str;
        this.f264887c = i12;
        this.f264888d = printableText;
        this.f264889e = z12;
        this.f264890f = action;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionTitleWithActionRedesignItem)) {
            return false;
        }
        SectionTitleWithActionRedesignItem sectionTitleWithActionRedesignItem = (SectionTitleWithActionRedesignItem) obj;
        return L.f(this.f264886b, sectionTitleWithActionRedesignItem.f264886b) && this.f264887c == sectionTitleWithActionRedesignItem.f264887c && L.f(this.f264888d, sectionTitleWithActionRedesignItem.f264888d) && this.f264889e == sectionTitleWithActionRedesignItem.f264889e && L.f(this.f264890f, sectionTitleWithActionRedesignItem.f264890f);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF117182c() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78565d() {
        return this.f264887c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF217937b() {
        return this.f264886b;
    }

    public final int hashCode() {
        int i12 = r.i(com.avito.android.actions_sheet.a.f(this.f264888d, r.e(this.f264887c, this.f264886b.hashCode() * 31, 31), 31), 31, this.f264889e);
        Action action = this.f264890f;
        return i12 + (action == null ? 0 : action.hashCode());
    }

    @k
    public final String toString() {
        return "SectionTitleWithActionRedesignItem(stringId=" + this.f264886b + ", spanCount=" + this.f264887c + ", title=" + this.f264888d + ", showAction=" + this.f264889e + ", action=" + this.f264890f + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f264886b);
        parcel.writeInt(this.f264887c);
        parcel.writeParcelable(this.f264888d, i12);
        parcel.writeInt(this.f264889e ? 1 : 0);
        parcel.writeParcelable(this.f264890f, i12);
    }
}
