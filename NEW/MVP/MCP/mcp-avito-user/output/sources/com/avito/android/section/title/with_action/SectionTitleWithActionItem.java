package com.avito.android.section.title.with_action;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Action;
import com.avito.android.section.action.SectionActionItem;
import com.avito.android.section.title.SectionTitleItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: SectionTitleWithActionItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/section/title/with_action/SectionTitleWithActionItem;", "Lcom/avito/android/section/title/SectionTitleItem;", "Lcom/avito/android/section/action/SectionActionItem;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionTitleWithActionItem implements SectionTitleItem, SectionActionItem {

    @k
    public static final Parcelable.Creator<SectionTitleWithActionItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f264879b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f264880c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final String f264881d;

    /* renamed from: e, reason: collision with root package name */
    public final int f264882e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Action f264883f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final SerpViewType f264884g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f264885h;

    /* compiled from: SectionTitleWithActionItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SectionTitleWithActionItem> {
        @Override // android.os.Parcelable.Creator
        public final SectionTitleWithActionItem createFromParcel(Parcel parcel) {
            return new SectionTitleWithActionItem(parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt(), (Action) parcel.readParcelable(SectionTitleWithActionItem.class.getClassLoader()), SerpViewType.valueOf(parcel.readString()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final SectionTitleWithActionItem[] newArray(int i12) {
            return new SectionTitleWithActionItem[i12];
        }
    }

    public SectionTitleWithActionItem(@k String str, @l String str2, @l String str3, int i12, @l Action action, @k SerpViewType serpViewType, boolean z12) {
        this.f264879b = str;
        this.f264880c = str2;
        this.f264881d = str3;
        this.f264882e = i12;
        this.f264883f = action;
        this.f264884g = serpViewType;
        this.f264885h = z12;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionTitleWithActionItem)) {
            return false;
        }
        SectionTitleWithActionItem sectionTitleWithActionItem = (SectionTitleWithActionItem) obj;
        return L.f(this.f264879b, sectionTitleWithActionItem.f264879b) && L.f(this.f264880c, sectionTitleWithActionItem.f264880c) && L.f(this.f264881d, sectionTitleWithActionItem.f264881d) && this.f264882e == sectionTitleWithActionItem.f264882e && L.f(this.f264883f, sectionTitleWithActionItem.f264883f) && this.f264884g == sectionTitleWithActionItem.f264884g && this.f264885h == sectionTitleWithActionItem.f264885h;
    }

    @Override // com.avito.android.section.action.SectionActionItem
    @l
    /* renamed from: getAction, reason: from getter */
    public final Action getF264883f() {
        return this.f264883f;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85138b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF85156t() {
        return this.f264882e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF85139c() {
        return this.f264879b;
    }

    @Override // com.avito.android.section.title.SectionTitleItem
    @l
    /* renamed from: getSubtitle, reason: from getter */
    public final String getF264881d() {
        return this.f264881d;
    }

    @Override // com.avito.android.section.title.SectionTitleItem
    @l
    /* renamed from: getTitle, reason: from getter */
    public final String getF264880c() {
        return this.f264880c;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85158v() {
        return this.f264884g;
    }

    public final int hashCode() {
        int iHashCode = this.f264879b.hashCode() * 31;
        String str = this.f264880c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f264881d;
        int iE2 = r.e(this.f264882e, (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31);
        Action action = this.f264883f;
        return Boolean.hashCode(this.f264885h) + com.avito.android.actions_sheet.a.j(this.f264884g, (iE2 + (action != null ? action.hashCode() : 0)) * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionTitleWithActionItem(stringId=");
        sb2.append(this.f264879b);
        sb2.append(", title=");
        sb2.append(this.f264880c);
        sb2.append(", subtitle=");
        sb2.append(this.f264881d);
        sb2.append(", spanCount=");
        sb2.append(this.f264882e);
        sb2.append(", action=");
        sb2.append(this.f264883f);
        sb2.append(", viewType=");
        sb2.append(this.f264884g);
        sb2.append(", isRestyle=");
        return r.x(sb2, this.f264885h, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f264879b);
        parcel.writeString(this.f264880c);
        parcel.writeString(this.f264881d);
        parcel.writeInt(this.f264882e);
        parcel.writeParcelable(this.f264883f, i12);
        parcel.writeString(this.f264884g.name());
        parcel.writeInt(this.f264885h ? 1 : 0);
    }

    public /* synthetic */ SectionTitleWithActionItem(String str, String str2, String str3, int i12, Action action, SerpViewType serpViewType, boolean z12, int i13, C42822w c42822w) {
        this(str, str2, str3, i12, action, (i13 & 32) != 0 ? SerpViewType.f268585e : serpViewType, (i13 & 64) != 0 ? false : z12);
    }
}
