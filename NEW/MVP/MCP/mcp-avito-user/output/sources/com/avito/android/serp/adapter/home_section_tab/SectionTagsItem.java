package com.avito.android.serp.adapter.home_section_tab;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.S2;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: SectionTagsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/home_section_tab/SectionTagsItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SectionTagsItem implements PersistableSerpItem, S2, h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<SectionTagsItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f270150b;

    /* renamed from: c, reason: collision with root package name */
    public final int f270151c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<SectionTag> f270152d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final List<String> f270153e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Analytics f270154f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Settings f270155g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final SerpViewType f270156h;

    /* renamed from: i, reason: collision with root package name */
    public final long f270157i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final h.b f270158j;

    /* compiled from: SectionTagsItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/home_section_tab/SectionTagsItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: SectionTagsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<SectionTagsItem> {
        @Override // android.os.Parcelable.Creator
        public final SectionTagsItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int i12 = parcel.readInt();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iC2 = 0;
            while (iC2 != i13) {
                iC2 = com.avito.android.actions_sheet.a.c(SectionTag.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SectionTagsItem(string, i12, arrayList, parcel.createStringArrayList(), (Analytics) parcel.readParcelable(SectionTagsItem.class.getClassLoader()), (Settings) parcel.readParcelable(SectionTagsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SectionTagsItem[] newArray(int i12) {
            return new SectionTagsItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public SectionTagsItem(@k String str, int i12, @k List<SectionTag> list, @k List<String> list2, @l Analytics analytics, @l Settings settings) {
        this.f270150b = str;
        this.f270151c = i12;
        this.f270152d = list;
        this.f270153e = list2;
        this.f270154f = analytics;
        this.f270155g = settings;
        this.f270156h = SerpViewType.f268585e;
        this.f270157i = a.C10492a.a(this);
        this.f270158j = new h.b("section_tags_widget", null, null, null, null, analytics, 30, null);
    }

    public static SectionTagsItem a(SectionTagsItem sectionTagsItem, ArrayList arrayList) {
        String str = sectionTagsItem.f270150b;
        int i12 = sectionTagsItem.f270151c;
        List<String> list = sectionTagsItem.f270153e;
        Analytics analytics = sectionTagsItem.f270154f;
        Settings settings = sectionTagsItem.f270155g;
        sectionTagsItem.getClass();
        return new SectionTagsItem(str, i12, arrayList, list, analytics, settings);
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SectionTagsItem)) {
            return false;
        }
        SectionTagsItem sectionTagsItem = (SectionTagsItem) obj;
        return L.f(this.f270150b, sectionTagsItem.f270150b) && this.f270151c == sectionTagsItem.f270151c && L.f(this.f270152d, sectionTagsItem.f270152d) && L.f(this.f270153e, sectionTagsItem.f270153e) && L.f(this.f270154f, sectionTagsItem.f270154f) && L.f(this.f270155g, sectionTagsItem.f270155g);
    }

    @k
    public final List<String> f() {
        return this.f270153e;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272527e() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF84801b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272558o() {
        return this.f270155g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84813n() {
        return this.f270151c;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF121306b() {
        return this.f270150b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272560q() {
        return this.f270157i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84814o() {
        return this.f270156h;
    }

    public final int hashCode() {
        int iE2 = H.e(H.e(r.e(this.f270151c, this.f270150b.hashCode() * 31, 31), 31, this.f270152d), 31, this.f270153e);
        Analytics analytics = this.f270154f;
        int iHashCode = (iE2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f270155g;
        return iHashCode + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF272559p() {
        return this.f270158j;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SectionTagsItem(stringId=");
        sb2.append(this.f270150b);
        sb2.append(", spanCount=");
        sb2.append(this.f270151c);
        sb2.append(", items=");
        sb2.append(this.f270152d);
        sb2.append(", originalIdsOrder=");
        sb2.append(this.f270153e);
        sb2.append(", analytics=");
        sb2.append(this.f270154f);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f270155g, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f270150b);
        parcel.writeInt(this.f270151c);
        Iterator itJ = C0.j(this.f270152d, parcel);
        while (itJ.hasNext()) {
            ((SectionTag) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeStringList(this.f270153e);
        parcel.writeParcelable(this.f270154f, i12);
        parcel.writeParcelable(this.f270155g, i12);
    }

    public /* synthetic */ SectionTagsItem(String str, int i12, List list, List list2, Analytics analytics, Settings settings, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? "tags_item_id" : str, (i13 & 2) != 0 ? 6 : i12, list, list2, analytics, settings);
    }
}
