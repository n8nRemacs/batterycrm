package com.avito.android.visual_rubricator;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: VisualRubricatorWidgetItemImpl.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/visual_rubricator/VisualRubricatorWidgetItemImpl;", "Lcom/avito/android/visual_rubricator/VisualRubricatorWidgetItem;", "Lis0/h;", "Lqs0/a;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VisualRubricatorWidgetItemImpl implements VisualRubricatorWidgetItem, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<VisualRubricatorWidgetItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f327321b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<VisualRubricatorWidgetElementItem> f327322c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Space f327323d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Space f327324e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f327325f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f327326g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Analytics f327327h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Settings f327328i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f327329j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final h.b f327330k;

    /* renamed from: l, reason: collision with root package name */
    public final long f327331l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f327332m;

    /* renamed from: n, reason: collision with root package name */
    public final int f327333n;

    /* compiled from: VisualRubricatorWidgetItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VisualRubricatorWidgetItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final VisualRubricatorWidgetItemImpl createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iA2 = 0;
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(VisualRubricatorWidgetItemImpl.class, parcel, arrayList, iL2, 1);
            }
            Space spaceValueOf = Space.valueOf(parcel.readString());
            Space spaceValueOf2 = Space.valueOf(parcel.readString());
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            Analytics analytics = (Analytics) parcel.readParcelable(VisualRubricatorWidgetItemImpl.class.getClassLoader());
            Settings settings = (Settings) parcel.readParcelable(VisualRubricatorWidgetItemImpl.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new VisualRubricatorWidgetItemImpl(string, arrayList, spaceValueOf, spaceValueOf2, z12, z13, analytics, settings, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VisualRubricatorWidgetItemImpl[] newArray(int i12) {
            return new VisualRubricatorWidgetItemImpl[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VisualRubricatorWidgetItemImpl(@Y61.k String str, @Y61.k List<? extends VisualRubricatorWidgetElementItem> list, @Y61.k Space space, @Y61.k Space space2, boolean z12, boolean z13, @Y61.l Analytics analytics, @Y61.l Settings settings, @Y61.l Map<String, String> map) {
        this.f327321b = str;
        this.f327322c = list;
        this.f327323d = space;
        this.f327324e = space2;
        this.f327325f = z12;
        this.f327326g = z13;
        this.f327327h = analytics;
        this.f327328i = settings;
        this.f327329j = map;
        this.f327330k = new h.b("shortcuts_widget", null, null, null, map, analytics, 14, null);
        this.f327331l = a.C10492a.a(this);
        this.f327332m = SerpViewType.f268585e;
        this.f327333n = 6;
    }

    @Override // is0.h
    public final boolean L() {
        return !this.f327324e.b();
    }

    @Override // com.avito.android.visual_rubricator.VisualRubricatorWidgetItem
    @Y61.k
    /* renamed from: U, reason: from getter */
    public final Space getF327323d() {
        return this.f327323d;
    }

    @Override // com.avito.android.visual_rubricator.VisualRubricatorWidgetItem
    @Y61.k
    /* renamed from: a0, reason: from getter */
    public final Space getF327324e() {
        return this.f327324e;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualRubricatorWidgetItemImpl)) {
            return false;
        }
        VisualRubricatorWidgetItemImpl visualRubricatorWidgetItemImpl = (VisualRubricatorWidgetItemImpl) obj;
        return kotlin.jvm.internal.L.f(this.f327321b, visualRubricatorWidgetItemImpl.f327321b) && kotlin.jvm.internal.L.f(this.f327322c, visualRubricatorWidgetItemImpl.f327322c) && this.f327323d == visualRubricatorWidgetItemImpl.f327323d && this.f327324e == visualRubricatorWidgetItemImpl.f327324e && this.f327325f == visualRubricatorWidgetItemImpl.f327325f && this.f327326g == visualRubricatorWidgetItemImpl.f327326g && kotlin.jvm.internal.L.f(this.f327327h, visualRubricatorWidgetItemImpl.f327327h) && kotlin.jvm.internal.L.f(this.f327328i, visualRubricatorWidgetItemImpl.f327328i) && kotlin.jvm.internal.L.f(this.f327329j, visualRubricatorWidgetItemImpl.f327329j);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF231631p() {
        return this.f327326g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF282036b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF231632q() {
        return this.f327328i;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84111f() {
        return this.f327333n;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF145224b() {
        return this.f327321b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF231637v() {
        return this.f327331l;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84110e() {
        return this.f327332m;
    }

    @Override // com.avito.android.visual_rubricator.VisualRubricatorWidgetItem
    @Y61.k
    public final List<VisualRubricatorWidgetElementItem> h6() {
        return this.f327322c;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f327324e.hashCode() + ((this.f327323d.hashCode() + androidx.compose.foundation.H.e(this.f327321b.hashCode() * 31, 31, this.f327322c)) * 31)) * 31, 31, this.f327325f), 31, this.f327326g);
        Analytics analytics = this.f327327h;
        int iHashCode = (i12 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f327328i;
        int iHashCode2 = (iHashCode + (settings == null ? 0 : settings.hashCode())) * 31;
        Map<String, String> map = this.f327329j;
        return iHashCode2 + (map != null ? map.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF231636u() {
        return this.f327330k;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VisualRubricatorWidgetItemImpl(stringId=");
        sb2.append(this.f327321b);
        sb2.append(", rubricatorList=");
        sb2.append(this.f327322c);
        sb2.append(", space=");
        sb2.append(this.f327323d);
        sb2.append(", analyticsSpace=");
        sb2.append(this.f327324e);
        sb2.append(", isExternalAd=");
        sb2.append(this.f327325f);
        sb2.append(", hasStablePosition=");
        sb2.append(this.f327326g);
        sb2.append(", analytics=");
        sb2.append(this.f327327h);
        sb2.append(", settings=");
        sb2.append(this.f327328i);
        sb2.append(", additionalParams=");
        return androidx.appcompat.app.r.w(sb2, this.f327329j, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f327321b);
        Iterator itJ = C0.j(this.f327322c, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeString(this.f327323d.name());
        parcel.writeString(this.f327324e.name());
        parcel.writeInt(this.f327325f ? 1 : 0);
        parcel.writeInt(this.f327326g ? 1 : 0);
        parcel.writeParcelable(this.f327327h, i12);
        parcel.writeParcelable(this.f327328i, i12);
        Map<String, String> map = this.f327329j;
        if (map == null) {
            parcel.writeInt(0);
            return;
        }
        Iterator itH = C0.h(parcel, 1, map);
        while (itH.hasNext()) {
            Map.Entry entry = (Map.Entry) itH.next();
            parcel.writeString((String) entry.getKey());
            parcel.writeString((String) entry.getValue());
        }
    }

    public /* synthetic */ VisualRubricatorWidgetItemImpl(String str, List list, Space space, Space space2, boolean z12, boolean z13, Analytics analytics, Settings settings, Map map, int i12, C42822w c42822w) {
        this(str, list, (i12 & 4) != 0 ? Space.f327296b : space, (i12 & 8) != 0 ? Space.f327296b : space2, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? true : z13, (i12 & 64) != 0 ? null : analytics, (i12 & 128) != 0 ? null : settings, (i12 & 256) != 0 ? null : map);
    }
}
