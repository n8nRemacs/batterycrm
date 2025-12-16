package com.avito.android.section.horizontal.adapter;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.section.SectionDisplaying;
import com.avito.android.section.SectionItem;
import com.avito.android.serp.adapter.PersistableSpannedItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: HorizontalSectionAdapterItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/section/horizontal/adapter/HorizontalSectionAdapterItem;", "Lcom/avito/android/section/SectionItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class HorizontalSectionAdapterItem implements SectionItem {

    @k
    public static final Parcelable.Creator<HorizontalSectionAdapterItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f264678b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f264679c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f264680d;

    /* renamed from: e, reason: collision with root package name */
    public final int f264681e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f264682f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Action f264683g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final List<PersistableSpannedItem> f264684h;

    /* renamed from: i, reason: collision with root package name */
    @l
    public final String f264685i;

    /* renamed from: j, reason: collision with root package name */
    @l
    public final SectionDisplaying f264686j;

    /* renamed from: k, reason: collision with root package name */
    public final boolean f264687k;

    /* compiled from: HorizontalSectionAdapterItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HorizontalSectionAdapterItem> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalSectionAdapterItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            int i12 = parcel.readInt();
            SerpViewType serpViewTypeValueOf = SerpViewType.valueOf(parcel.readString());
            Action action = (Action) parcel.readParcelable(HorizontalSectionAdapterItem.class.getClassLoader());
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(HorizontalSectionAdapterItem.class, parcel, arrayList, iL2, 1);
            }
            return new HorizontalSectionAdapterItem(string, string2, string3, i12, serpViewTypeValueOf, action, arrayList, parcel.readString(), (SectionDisplaying) parcel.readParcelable(HorizontalSectionAdapterItem.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalSectionAdapterItem[] newArray(int i12) {
            return new HorizontalSectionAdapterItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HorizontalSectionAdapterItem(@k String str, @l String str2, @l String str3, int i12, @k SerpViewType serpViewType, @l Action action, @k List<? extends PersistableSpannedItem> list, @l String str4, @l SectionDisplaying sectionDisplaying, boolean z12) {
        this.f264678b = str;
        this.f264679c = str2;
        this.f264680d = str3;
        this.f264681e = i12;
        this.f264682f = serpViewType;
        this.f264683g = action;
        this.f264684h = list;
        this.f264685i = str4;
        this.f264686j = sectionDisplaying;
        this.f264687k = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof HorizontalSectionAdapterItem)) {
            return false;
        }
        HorizontalSectionAdapterItem horizontalSectionAdapterItem = (HorizontalSectionAdapterItem) obj;
        return L.f(this.f264678b, horizontalSectionAdapterItem.f264678b) && L.f(this.f264679c, horizontalSectionAdapterItem.f264679c) && L.f(this.f264680d, horizontalSectionAdapterItem.f264680d) && this.f264681e == horizontalSectionAdapterItem.f264681e && this.f264682f == horizontalSectionAdapterItem.f264682f && L.f(this.f264683g, horizontalSectionAdapterItem.f264683g) && L.f(this.f264684h, horizontalSectionAdapterItem.f264684h) && L.f(this.f264685i, horizontalSectionAdapterItem.f264685i) && L.f(this.f264686j, horizontalSectionAdapterItem.f264686j) && this.f264687k == horizontalSectionAdapterItem.f264687k;
    }

    @Override // com.avito.android.section.action.SectionActionItem
    @l
    /* renamed from: getAction, reason: from getter */
    public final Action getF264883f() {
        return this.f264683g;
    }

    @Override // com.avito.android.section.SectionItem
    @l
    /* renamed from: getContext, reason: from getter */
    public final String getF264685i() {
        return this.f264685i;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF231631p() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF75315b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.section.SectionItem
    @k
    public final List<PersistableSpannedItem> getItems() {
        return this.f264684h;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF231634s() {
        return this.f264681e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF231617b() {
        return this.f264678b;
    }

    @Override // com.avito.android.section.title.SectionTitleItem
    @l
    /* renamed from: getSubtitle, reason: from getter */
    public final String getF264881d() {
        return this.f264680d;
    }

    @Override // com.avito.android.section.title.SectionTitleItem
    @l
    /* renamed from: getTitle, reason: from getter */
    public final String getF264880c() {
        return this.f264679c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF231633r() {
        return this.f264682f;
    }

    public final int hashCode() {
        int iHashCode = this.f264678b.hashCode() * 31;
        String str = this.f264679c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f264680d;
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f264682f, r.e(this.f264681e, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31), 31);
        Action action = this.f264683g;
        int iE2 = H.e((iJ2 + (action == null ? 0 : action.hashCode())) * 31, 31, this.f264684h);
        String str3 = this.f264685i;
        int iHashCode3 = (iE2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        SectionDisplaying sectionDisplaying = this.f264686j;
        return Boolean.hashCode(this.f264687k) + ((iHashCode3 + (sectionDisplaying != null ? sectionDisplaying.hashCode() : 0)) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HorizontalSectionAdapterItem(stringId=");
        sb2.append(this.f264678b);
        sb2.append(", title=");
        sb2.append(this.f264679c);
        sb2.append(", subtitle=");
        sb2.append(this.f264680d);
        sb2.append(", spanCount=");
        sb2.append(this.f264681e);
        sb2.append(", viewType=");
        sb2.append(this.f264682f);
        sb2.append(", action=");
        sb2.append(this.f264683g);
        sb2.append(", items=");
        sb2.append(this.f264684h);
        sb2.append(", context=");
        sb2.append(this.f264685i);
        sb2.append(", displaying=");
        sb2.append(this.f264686j);
        sb2.append(", isRedesign=");
        return r.x(sb2, this.f264687k, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f264678b);
        parcel.writeString(this.f264679c);
        parcel.writeString(this.f264680d);
        parcel.writeInt(this.f264681e);
        parcel.writeString(this.f264682f.name());
        parcel.writeParcelable(this.f264683g, i12);
        Iterator itJ = C0.j(this.f264684h, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f264685i);
        parcel.writeParcelable(this.f264686j, i12);
        parcel.writeInt(this.f264687k ? 1 : 0);
    }

    public /* synthetic */ HorizontalSectionAdapterItem(String str, String str2, String str3, int i12, SerpViewType serpViewType, Action action, List list, String str4, SectionDisplaying sectionDisplaying, boolean z12, int i13, C42822w c42822w) {
        this(str, str2, str3, i12, (i13 & 16) != 0 ? SerpViewType.f268585e : serpViewType, action, list, str4, sectionDisplaying, (i13 & 512) != 0 ? false : z12);
    }
}
