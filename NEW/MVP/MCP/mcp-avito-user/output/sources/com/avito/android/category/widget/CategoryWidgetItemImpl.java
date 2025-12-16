package com.avito.android.category.widget;

import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.S2;
import com.avito.android.category.element.CategoryWidgetElementItem;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: CategoryWidgetItemImpl.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/category/widget/CategoryWidgetItemImpl;", "Lcom/avito/android/category/widget/CategoryWidgetItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "a", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CategoryWidgetItemImpl implements CategoryWidgetItem, S2, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<CategoryWidgetItemImpl> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f116726b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final DeepLink f116727c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final String f116728d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final List<CategoryWidgetElementItem> f116729e;

    /* renamed from: f, reason: collision with root package name */
    public final boolean f116730f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f116731g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Analytics f116732h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f116733i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Settings f116734j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final h.b f116735k;

    /* renamed from: l, reason: collision with root package name */
    public final long f116736l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f116737m;

    /* renamed from: n, reason: collision with root package name */
    public final int f116738n;

    /* compiled from: CategoryWidgetItemImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/category/widget/CategoryWidgetItemImpl$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito_bx-content_widget_category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CategoryWidgetItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CategoryWidgetItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final CategoryWidgetItemImpl createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(CategoryWidgetItemImpl.class.getClassLoader());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iA2 = 0;
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(CategoryWidgetItemImpl.class, parcel, arrayList, iL2, 1);
            }
            boolean z12 = parcel.readInt() != 0;
            boolean z13 = parcel.readInt() != 0;
            Analytics analytics = (Analytics) parcel.readParcelable(CategoryWidgetItemImpl.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i13 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i13);
                while (iA2 != i13) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            return new CategoryWidgetItemImpl(string, deepLink, string2, arrayList, z12, z13, analytics, linkedHashMap, (Settings) parcel.readParcelable(CategoryWidgetItemImpl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CategoryWidgetItemImpl[] newArray(int i12) {
            return new CategoryWidgetItemImpl[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public CategoryWidgetItemImpl(@Y61.l String str, @Y61.l DeepLink deepLink, @Y61.k String str2, @Y61.k List<CategoryWidgetElementItem> list, boolean z12, boolean z13, @Y61.l Analytics analytics, @Y61.l Map<String, String> map, @Y61.l Settings settings) {
        this.f116726b = str;
        this.f116727c = deepLink;
        this.f116728d = str2;
        this.f116729e = list;
        this.f116730f = z12;
        this.f116731g = z13;
        this.f116732h = analytics;
        this.f116733i = map;
        this.f116734j = settings;
        CategoryWidgetElementItem categoryWidgetElementItem = (CategoryWidgetElementItem) C42745f0.G(list);
        this.f116735k = new h.b("vertical_category", categoryWidgetElementItem != null ? categoryWidgetElementItem.f116596c : null, null, null, map, analytics, 12, null);
        this.f116736l = a.C10492a.a(this);
        this.f116737m = SerpViewType.f268585e;
        this.f116738n = 6;
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // com.avito.android.category.widget.CategoryWidgetItem
    @Y61.l
    /* renamed from: M5, reason: from getter */
    public final DeepLink getF116727c() {
        return this.f116727c;
    }

    @Override // com.avito.android.category.widget.CategoryWidgetItem
    @Y61.l
    public final Map<String, String> b0() {
        return this.f116733i;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.category.widget.CategoryWidgetItem
    @Y61.l
    /* renamed from: getAnalytics, reason: from getter */
    public final Analytics getF116732h() {
        return this.f116732h;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF116731g() {
        return this.f116731g;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85764e() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.category.widget.CategoryWidgetItem
    @Y61.k
    public final List<CategoryWidgetElementItem> getItems() {
        return this.f116729e;
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF116734j() {
        return this.f116734j;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF116738n() {
        return this.f116738n;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF116728d() {
        return this.f116728d;
    }

    @Override // com.avito.android.category.widget.CategoryWidgetItem
    @Y61.l
    /* renamed from: getTitle, reason: from getter */
    public final String getF116726b() {
        return this.f116726b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF116736l() {
        return this.f116736l;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF116737m() {
        return this.f116737m;
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF116735k() {
        return this.f116735k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f116726b);
        parcel.writeParcelable(this.f116727c, i12);
        parcel.writeString(this.f116728d);
        Iterator itJ = C0.j(this.f116729e, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f116730f ? 1 : 0);
        parcel.writeInt(this.f116731g ? 1 : 0);
        parcel.writeParcelable(this.f116732h, i12);
        Map<String, String> map = this.f116733i;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        parcel.writeParcelable(this.f116734j, i12);
    }

    public /* synthetic */ CategoryWidgetItemImpl(String str, DeepLink deepLink, String str2, List list, boolean z12, boolean z13, Analytics analytics, Map map, Settings settings, int i12, C42822w c42822w) {
        this(str, deepLink, str2, list, (i12 & 16) != 0 ? false : z12, (i12 & 32) != 0 ? true : z13, (i12 & 64) != 0 ? null : analytics, (i12 & 128) != 0 ? null : map, (i12 & 256) != 0 ? null : settings);
    }
}
