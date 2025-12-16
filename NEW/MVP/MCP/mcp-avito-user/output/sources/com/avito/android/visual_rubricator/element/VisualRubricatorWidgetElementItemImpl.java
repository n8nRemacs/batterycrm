package com.avito.android.visual_rubricator.element;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.visual_rubricator.Space;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: VisualRubricatorWidgetElementItemImpl.kt */
@K51.d
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/visual_rubricator/element/VisualRubricatorWidgetElementItemImpl;", "Lcom/avito/android/visual_rubricator/element/VisualRubricatorWidgetElementItem;", "Lis0/h;", "_avito_bx-content_widget_visual-rubricator_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class VisualRubricatorWidgetElementItemImpl implements VisualRubricatorWidgetElementItem, is0.h {

    @Y61.k
    public static final Parcelable.Creator<VisualRubricatorWidgetElementItemImpl> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f327359b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f327360c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f327361d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final DeepLink f327362e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Integer f327363f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Integer f327364g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final UniversalImage f327365h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final VisualRubricatorWidgetElementLayout f327366i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Integer f327367j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Integer f327368k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f327369l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final CategoryBadge f327370m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f327371n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f327372o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final Space f327373p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final Space f327374q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final Integer f327375r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final Analytics f327376s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f327377t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final h.b f327378u;

    /* renamed from: v, reason: collision with root package name */
    public final long f327379v;

    /* renamed from: w, reason: collision with root package name */
    public final int f327380w;

    /* compiled from: VisualRubricatorWidgetElementItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<VisualRubricatorWidgetElementItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final VisualRubricatorWidgetElementItemImpl createFromParcel(Parcel parcel) {
            CategoryBadge categoryBadge;
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(VisualRubricatorWidgetElementItemImpl.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf2 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            UniversalImage universalImage = (UniversalImage) parcel.readParcelable(VisualRubricatorWidgetElementItemImpl.class.getClassLoader());
            VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout = (VisualRubricatorWidgetElementLayout) parcel.readParcelable(VisualRubricatorWidgetElementItemImpl.class.getClassLoader());
            Integer numValueOf3 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Integer numValueOf4 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int iA2 = 0;
            boolean z12 = parcel.readInt() != 0;
            CategoryBadge categoryBadge2 = (CategoryBadge) parcel.readParcelable(VisualRubricatorWidgetElementItemImpl.class.getClassLoader());
            UniversalColor universalColor = (UniversalColor) parcel.readParcelable(VisualRubricatorWidgetElementItemImpl.class.getClassLoader());
            UniversalColor universalColor2 = (UniversalColor) parcel.readParcelable(VisualRubricatorWidgetElementItemImpl.class.getClassLoader());
            Space spaceValueOf = Space.valueOf(parcel.readString());
            Space spaceValueOf2 = Space.valueOf(parcel.readString());
            Integer numValueOf5 = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            Analytics analytics = (Analytics) parcel.readParcelable(VisualRubricatorWidgetElementItemImpl.class.getClassLoader());
            if (parcel.readInt() == 0) {
                categoryBadge = categoryBadge2;
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    i12 = i12;
                    categoryBadge2 = categoryBadge2;
                }
                categoryBadge = categoryBadge2;
                linkedHashMap = linkedHashMap2;
            }
            return new VisualRubricatorWidgetElementItemImpl(string, string2, string3, deepLink, numValueOf, numValueOf2, universalImage, visualRubricatorWidgetElementLayout, numValueOf3, numValueOf4, z12, categoryBadge, universalColor, universalColor2, spaceValueOf, spaceValueOf2, numValueOf5, analytics, linkedHashMap);
        }

        @Override // android.os.Parcelable.Creator
        public final VisualRubricatorWidgetElementItemImpl[] newArray(int i12) {
            return new VisualRubricatorWidgetElementItemImpl[i12];
        }
    }

    public VisualRubricatorWidgetElementItemImpl(@Y61.k String str, @Y61.k String str2, @Y61.l String str3, @Y61.k DeepLink deepLink, @Y61.l Integer num, @Y61.l Integer num2, @Y61.l UniversalImage universalImage, @Y61.k VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout, @Y61.l Integer num3, @Y61.l Integer num4, boolean z12, @Y61.l CategoryBadge categoryBadge, @Y61.l UniversalColor universalColor, @Y61.l UniversalColor universalColor2, @Y61.k Space space, @Y61.k Space space2, @Y61.l Integer num5, @Y61.l Analytics analytics, @Y61.l Map<String, String> map) {
        this.f327359b = str;
        this.f327360c = str2;
        this.f327361d = str3;
        this.f327362e = deepLink;
        this.f327363f = num;
        this.f327364g = num2;
        this.f327365h = universalImage;
        this.f327366i = visualRubricatorWidgetElementLayout;
        this.f327367j = num3;
        this.f327368k = num4;
        this.f327369l = z12;
        this.f327370m = categoryBadge;
        this.f327371n = universalColor;
        this.f327372o = universalColor2;
        this.f327373p = space;
        this.f327374q = space2;
        this.f327375r = num5;
        this.f327376s = analytics;
        this.f327377t = map;
        this.f327378u = new h.b(space2.b() ? "shortcuts_widget" : space2.a() ? "salesHeader_widget" : "", str2, null, null, map, analytics, 12, null);
        this.f327379v = a.C10492a.a(this);
        this.f327380w = 1;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    /* renamed from: A0, reason: from getter */
    public final Integer getF327364g() {
        return this.f327364g;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    /* renamed from: B5, reason: from getter */
    public final boolean getF327369l() {
        return this.f327369l;
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    public final boolean N5() {
        return L.f(getF77924b(), "remote_item_all_categories");
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    /* renamed from: R1, reason: from getter */
    public final Integer getF327367j() {
        return this.f327367j;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.k
    /* renamed from: a0, reason: from getter */
    public final Space getF327374q() {
        return this.f327374q;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    public final Map<String, String> b0() {
        return this.f327377t;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof VisualRubricatorWidgetElementItemImpl)) {
            return false;
        }
        VisualRubricatorWidgetElementItemImpl visualRubricatorWidgetElementItemImpl = (VisualRubricatorWidgetElementItemImpl) obj;
        return L.f(this.f327359b, visualRubricatorWidgetElementItemImpl.f327359b) && L.f(this.f327360c, visualRubricatorWidgetElementItemImpl.f327360c) && L.f(this.f327361d, visualRubricatorWidgetElementItemImpl.f327361d) && L.f(this.f327362e, visualRubricatorWidgetElementItemImpl.f327362e) && L.f(this.f327363f, visualRubricatorWidgetElementItemImpl.f327363f) && L.f(this.f327364g, visualRubricatorWidgetElementItemImpl.f327364g) && L.f(this.f327365h, visualRubricatorWidgetElementItemImpl.f327365h) && this.f327366i == visualRubricatorWidgetElementItemImpl.f327366i && L.f(this.f327367j, visualRubricatorWidgetElementItemImpl.f327367j) && L.f(this.f327368k, visualRubricatorWidgetElementItemImpl.f327368k) && this.f327369l == visualRubricatorWidgetElementItemImpl.f327369l && L.f(this.f327370m, visualRubricatorWidgetElementItemImpl.f327370m) && L.f(this.f327371n, visualRubricatorWidgetElementItemImpl.f327371n) && L.f(this.f327372o, visualRubricatorWidgetElementItemImpl.f327372o) && this.f327373p == visualRubricatorWidgetElementItemImpl.f327373p && this.f327374q == visualRubricatorWidgetElementItemImpl.f327374q && L.f(this.f327375r, visualRubricatorWidgetElementItemImpl.f327375r) && L.f(this.f327376s, visualRubricatorWidgetElementItemImpl.f327376s) && L.f(this.f327377t, visualRubricatorWidgetElementItemImpl.f327377t);
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    /* renamed from: getAnalytics, reason: from getter */
    public final Analytics getF327376s() {
        return this.f327376s;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    /* renamed from: getBackgroundColor, reason: from getter */
    public final Integer getF327363f() {
        return this.f327363f;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    /* renamed from: getBackgroundUniversalColor, reason: from getter */
    public final UniversalColor getF327371n() {
        return this.f327371n;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85764e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    /* renamed from: getImage, reason: from getter */
    public final UniversalImage getF327365h() {
        return this.f327365h;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.k
    /* renamed from: getLayout, reason: from getter */
    public final VisualRubricatorWidgetElementLayout getF327366i() {
        return this.f327366i;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    /* renamed from: getRowLine, reason: from getter */
    public final Integer getF327368k() {
        return this.f327368k;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF116738n() {
        return this.f327380w;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF77924b() {
        return this.f327359b;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.k
    /* renamed from: getTitle, reason: from getter */
    public final String getF327360c() {
        return this.f327360c;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    /* renamed from: getTitleColor, reason: from getter */
    public final UniversalColor getF327372o() {
        return this.f327372o;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    /* renamed from: getTitleWithTransfer, reason: from getter */
    public final String getF327361d() {
        return this.f327361d;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF116736l() {
        return this.f327379v;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.k
    /* renamed from: getUri, reason: from getter */
    public final DeepLink getF327362e() {
        return this.f327362e;
    }

    public final int hashCode() {
        int iD2 = H.d(this.f327359b.hashCode() * 31, 31, this.f327360c);
        String str = this.f327361d;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f327362e, (iD2 + (str == null ? 0 : str.hashCode())) * 31, 31);
        Integer num = this.f327363f;
        int iHashCode = (iE2 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.f327364g;
        int iHashCode2 = (iHashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        UniversalImage universalImage = this.f327365h;
        int iHashCode3 = (this.f327366i.hashCode() + ((iHashCode2 + (universalImage == null ? 0 : universalImage.hashCode())) * 31)) * 31;
        Integer num3 = this.f327367j;
        int iHashCode4 = (iHashCode3 + (num3 == null ? 0 : num3.hashCode())) * 31;
        Integer num4 = this.f327368k;
        int i12 = r.i((iHashCode4 + (num4 == null ? 0 : num4.hashCode())) * 31, 31, this.f327369l);
        CategoryBadge categoryBadge = this.f327370m;
        int iHashCode5 = (i12 + (categoryBadge == null ? 0 : categoryBadge.hashCode())) * 31;
        UniversalColor universalColor = this.f327371n;
        int iHashCode6 = (iHashCode5 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        UniversalColor universalColor2 = this.f327372o;
        int iHashCode7 = (this.f327374q.hashCode() + ((this.f327373p.hashCode() + ((iHashCode6 + (universalColor2 == null ? 0 : universalColor2.hashCode())) * 31)) * 31)) * 31;
        Integer num5 = this.f327375r;
        int iHashCode8 = (iHashCode7 + (num5 == null ? 0 : num5.hashCode())) * 31;
        Analytics analytics = this.f327376s;
        int iHashCode9 = (iHashCode8 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Map<String, String> map = this.f327377t;
        return iHashCode9 + (map != null ? map.hashCode() : 0);
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    public final boolean m0() {
        return L.f(getF77924b(), "item_all_categories");
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF116735k() {
        return this.f327378u;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    /* renamed from: t0, reason: from getter */
    public final CategoryBadge getF327370m() {
        return this.f327370m;
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.k
    /* renamed from: t5, reason: from getter */
    public final Space getF327373p() {
        return this.f327373p;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VisualRubricatorWidgetElementItemImpl(stringId=");
        sb2.append(this.f327359b);
        sb2.append(", title=");
        sb2.append(this.f327360c);
        sb2.append(", titleWithTransfer=");
        sb2.append(this.f327361d);
        sb2.append(", uri=");
        sb2.append(this.f327362e);
        sb2.append(", backgroundColor=");
        sb2.append(this.f327363f);
        sb2.append(", textColor=");
        sb2.append(this.f327364g);
        sb2.append(", image=");
        sb2.append(this.f327365h);
        sb2.append(", layout=");
        sb2.append(this.f327366i);
        sb2.append(", textIcon=");
        sb2.append(this.f327367j);
        sb2.append(", rowLine=");
        sb2.append(this.f327368k);
        sb2.append(", showAsSkeleton=");
        sb2.append(this.f327369l);
        sb2.append(", categoryBadge=");
        sb2.append(this.f327370m);
        sb2.append(", backgroundUniversalColor=");
        sb2.append(this.f327371n);
        sb2.append(", titleColor=");
        sb2.append(this.f327372o);
        sb2.append(", presentationSpace=");
        sb2.append(this.f327373p);
        sb2.append(", analyticsSpace=");
        sb2.append(this.f327374q);
        sb2.append(", tileHeightDp=");
        sb2.append(this.f327375r);
        sb2.append(", analytics=");
        sb2.append(this.f327376s);
        sb2.append(", additionalParams=");
        return r.w(sb2, this.f327377t, ')');
    }

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    public final boolean u1() {
        return (getF327374q().b() || getF327374q().a()) ? false : true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f327359b);
        parcel.writeString(this.f327360c);
        parcel.writeString(this.f327361d);
        parcel.writeParcelable(this.f327362e, i12);
        Integer num = this.f327363f;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        Integer num2 = this.f327364g;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        parcel.writeParcelable(this.f327365h, i12);
        parcel.writeParcelable(this.f327366i, i12);
        Integer num3 = this.f327367j;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
        Integer num4 = this.f327368k;
        if (num4 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num4);
        }
        parcel.writeInt(this.f327369l ? 1 : 0);
        parcel.writeParcelable(this.f327370m, i12);
        parcel.writeParcelable(this.f327371n, i12);
        parcel.writeParcelable(this.f327372o, i12);
        parcel.writeString(this.f327373p.name());
        parcel.writeString(this.f327374q.name());
        Integer num5 = this.f327375r;
        if (num5 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num5);
        }
        parcel.writeParcelable(this.f327376s, i12);
        Map<String, String> map = this.f327377t;
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

    @Override // com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem
    @Y61.l
    /* renamed from: y4, reason: from getter */
    public final Integer getF327375r() {
        return this.f327375r;
    }

    public /* synthetic */ VisualRubricatorWidgetElementItemImpl(String str, String str2, String str3, DeepLink deepLink, Integer num, Integer num2, UniversalImage universalImage, VisualRubricatorWidgetElementLayout visualRubricatorWidgetElementLayout, Integer num3, Integer num4, boolean z12, CategoryBadge categoryBadge, UniversalColor universalColor, UniversalColor universalColor2, Space space, Space space2, Integer num5, Analytics analytics, Map map, int i12, C42822w c42822w) {
        this(str, str2, str3, deepLink, num, (i12 & 32) != 0 ? null : num2, universalImage, visualRubricatorWidgetElementLayout, (i12 & 256) != 0 ? null : num3, (i12 & 512) != 0 ? null : num4, (i12 & 1024) != 0 ? false : z12, (i12 & 2048) != 0 ? null : categoryBadge, (i12 & 4096) != 0 ? null : universalColor, (i12 & 8192) != 0 ? null : universalColor2, space, space2, (65536 & i12) != 0 ? null : num5, (131072 & i12) != 0 ? null : analytics, (i12 & 262144) != 0 ? null : map);
    }
}
