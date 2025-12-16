package com.avito.android.cross_category;

import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: CrossCategoryWidgetItemImpl.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/cross_category/CrossCategoryWidgetItemImpl;", "Lcom/avito/android/cross_category/CrossCategoryWidgetItem;", "Lis0/h;", "Lqs0/a;", "a", "_avito_bx-content_widget_cross-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class CrossCategoryWidgetItemImpl implements CrossCategoryWidgetItem, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<CrossCategoryWidgetItemImpl> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f131043b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final String f131044c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f131045d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Action f131046e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Image f131047f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final AnalyticParams f131048g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Analytics f131049h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Settings f131050i;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final h.b f131053l;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f131051j = SerpViewType.f268585e;

    /* renamed from: k, reason: collision with root package name */
    public final int f131052k = 6;

    /* renamed from: m, reason: collision with root package name */
    public final long f131054m = a.C10492a.a(this);

    /* compiled from: CrossCategoryWidgetItemImpl.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/cross_category/CrossCategoryWidgetItemImpl$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito_bx-content_widget_cross-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: CrossCategoryWidgetItemImpl.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<CrossCategoryWidgetItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final CrossCategoryWidgetItemImpl createFromParcel(Parcel parcel) {
            return new CrossCategoryWidgetItemImpl(parcel.readString(), parcel.readString(), parcel.readString(), (Action) parcel.readParcelable(CrossCategoryWidgetItemImpl.class.getClassLoader()), (Image) parcel.readParcelable(CrossCategoryWidgetItemImpl.class.getClassLoader()), (AnalyticParams) parcel.readParcelable(CrossCategoryWidgetItemImpl.class.getClassLoader()), (Analytics) parcel.readParcelable(CrossCategoryWidgetItemImpl.class.getClassLoader()), (Settings) parcel.readParcelable(CrossCategoryWidgetItemImpl.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final CrossCategoryWidgetItemImpl[] newArray(int i12) {
            return new CrossCategoryWidgetItemImpl[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public CrossCategoryWidgetItemImpl(@Y61.k String str, @Y61.l String str2, @Y61.l String str3, @Y61.l Action action, @Y61.l Image image, @Y61.l AnalyticParams analyticParams, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f131043b = str;
        this.f131044c = str2;
        this.f131045d = str3;
        this.f131046e = action;
        this.f131047f = image;
        this.f131048g = analyticParams;
        this.f131049h = analytics;
        this.f131050i = settings;
        this.f131053l = new h.b("CrossCategoryWidget", str2, null, null, null, analytics, 28, null);
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CrossCategoryWidgetItemImpl)) {
            return false;
        }
        CrossCategoryWidgetItemImpl crossCategoryWidgetItemImpl = (CrossCategoryWidgetItemImpl) obj;
        return L.f(this.f131043b, crossCategoryWidgetItemImpl.f131043b) && L.f(this.f131044c, crossCategoryWidgetItemImpl.f131044c) && L.f(this.f131045d, crossCategoryWidgetItemImpl.f131045d) && L.f(this.f131046e, crossCategoryWidgetItemImpl.f131046e) && L.f(this.f131047f, crossCategoryWidgetItemImpl.f131047f) && L.f(this.f131048g, crossCategoryWidgetItemImpl.f131048g) && L.f(this.f131049h, crossCategoryWidgetItemImpl.f131049h) && L.f(this.f131050i, crossCategoryWidgetItemImpl.f131050i);
    }

    @Override // com.avito.android.cross_category.CrossCategoryWidgetItem
    @Y61.l
    /* renamed from: getAction, reason: from getter */
    public final Action getF131046e() {
        return this.f131046e;
    }

    @Override // com.avito.android.cross_category.CrossCategoryWidgetItem
    @Y61.l
    /* renamed from: getAnalyticParams, reason: from getter */
    public final AnalyticParams getF131048g() {
        return this.f131048g;
    }

    @Override // com.avito.android.cross_category.CrossCategoryWidgetItem
    @Y61.l
    /* renamed from: getAnalytics, reason: from getter */
    public final Analytics getF131049h() {
        return this.f131049h;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF231631p() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF282036b() {
        return a.C10492a.a(this);
    }

    @Override // com.avito.android.cross_category.CrossCategoryWidgetItem
    @Y61.l
    /* renamed from: getImage, reason: from getter */
    public final Image getF131047f() {
        return this.f131047f;
    }

    @Override // com.avito.android.cross_category.CrossCategoryWidgetItem
    @Y61.l
    /* renamed from: getQuery, reason: from getter */
    public final String getF131045d() {
        return this.f131045d;
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF231632q() {
        return this.f131050i;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF84111f() {
        return this.f131052k;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF281526b() {
        return this.f131043b;
    }

    @Override // com.avito.android.cross_category.CrossCategoryWidgetItem
    @Y61.l
    /* renamed from: getTitle, reason: from getter */
    public final String getF131044c() {
        return this.f131044c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF231637v() {
        return this.f131054m;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF84110e() {
        return this.f131051j;
    }

    public final int hashCode() {
        int iHashCode = this.f131043b.hashCode() * 31;
        String str = this.f131044c;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f131045d;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Action action = this.f131046e;
        int iHashCode4 = (iHashCode3 + (action == null ? 0 : action.hashCode())) * 31;
        Image image = this.f131047f;
        int iHashCode5 = (iHashCode4 + (image == null ? 0 : image.hashCode())) * 31;
        AnalyticParams analyticParams = this.f131048g;
        int iHashCode6 = (iHashCode5 + (analyticParams == null ? 0 : analyticParams.hashCode())) * 31;
        Analytics analytics = this.f131049h;
        int iHashCode7 = (iHashCode6 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f131050i;
        return iHashCode7 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF231636u() {
        return this.f131053l;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CrossCategoryWidgetItemImpl(stringId=");
        sb2.append(this.f131043b);
        sb2.append(", title=");
        sb2.append(this.f131044c);
        sb2.append(", query=");
        sb2.append(this.f131045d);
        sb2.append(", action=");
        sb2.append(this.f131046e);
        sb2.append(", image=");
        sb2.append(this.f131047f);
        sb2.append(", analyticParams=");
        sb2.append(this.f131048g);
        sb2.append(", analytics=");
        sb2.append(this.f131049h);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f131050i, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f131043b);
        parcel.writeString(this.f131044c);
        parcel.writeString(this.f131045d);
        parcel.writeParcelable(this.f131046e, i12);
        parcel.writeParcelable(this.f131047f, i12);
        parcel.writeParcelable(this.f131048g, i12);
        parcel.writeParcelable(this.f131049h, i12);
        parcel.writeParcelable(this.f131050i, i12);
    }
}
