package com.avito.android.services_transportation_widget.item;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.HeaderToolbarElement;
import com.avito.android.remote.model.service_transportation_widget.ServiceTransportationWidget;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import qs0.InterfaceC47435a;

/* compiled from: ServiceTransportationWidgetItem.kt */
@K51.d
@s0
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u0005:\u0001\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/ServiceTransportationWidgetItem;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/remote/model/HeaderToolbarElement;", "Lqs0/a;", "Landroid/os/Parcelable;", "Lis0/h;", "a", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ServiceTransportationWidgetItem implements l1, HeaderToolbarElement, InterfaceC47435a, Parcelable, is0.h {

    @Y61.k
    public static final Parcelable.Creator<ServiceTransportationWidgetItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f280528b;

    /* renamed from: c, reason: collision with root package name */
    public final int f280529c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final String f280530d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final AttributedText f280531e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final String f280532f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<ServicesTransportationWidgetBlueprintItem> f280533g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final ServiceTransportationWidget.Action f280534h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f280535i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final ServiceTransportationWidget.AnalyticParams f280536j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final ServiceTransportationWidget.SearchHeaderConfig f280537k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f280538l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f280539m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final Analytics f280540n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final Settings f280541o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final h.b f280542p;

    /* renamed from: q, reason: collision with root package name */
    public final long f280543q;

    /* compiled from: ServiceTransportationWidgetItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/services_transportation_widget/item/ServiceTransportationWidgetItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito_service-transportation-widget_public"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ServiceTransportationWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ServiceTransportationWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final ServiceTransportationWidgetItem createFromParcel(Parcel parcel) {
            LinkedHashMap linkedHashMap;
            String string = parcel.readString();
            int i12 = parcel.readInt();
            String string2 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(ServiceTransportationWidgetItem.class.getClassLoader());
            String string3 = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(ServiceTransportationWidgetItem.class, parcel, arrayList, iL2, 1);
            }
            ServiceTransportationWidget.Action action = (ServiceTransportationWidget.Action) parcel.readParcelable(ServiceTransportationWidgetItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                }
                linkedHashMap = linkedHashMap2;
            }
            return new ServiceTransportationWidgetItem(string, i12, string2, attributedText, string3, arrayList, action, linkedHashMap, (ServiceTransportationWidget.AnalyticParams) parcel.readParcelable(ServiceTransportationWidgetItem.class.getClassLoader()), (ServiceTransportationWidget.SearchHeaderConfig) parcel.readParcelable(ServiceTransportationWidgetItem.class.getClassLoader()), parcel.readInt() != 0, SerpViewType.valueOf(parcel.readString()), (Analytics) parcel.readParcelable(ServiceTransportationWidgetItem.class.getClassLoader()), (Settings) parcel.readParcelable(ServiceTransportationWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ServiceTransportationWidgetItem[] newArray(int i12) {
            return new ServiceTransportationWidgetItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ServiceTransportationWidgetItem(@Y61.k String str, int i12, @Y61.l String str2, @Y61.l AttributedText attributedText, @Y61.l String str3, @Y61.k List<? extends ServicesTransportationWidgetBlueprintItem> list, @Y61.l ServiceTransportationWidget.Action action, @Y61.l Map<String, String> map, @Y61.l ServiceTransportationWidget.AnalyticParams analyticParams, @Y61.l ServiceTransportationWidget.SearchHeaderConfig searchHeaderConfig, boolean z12, @Y61.k SerpViewType serpViewType, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f280528b = str;
        this.f280529c = i12;
        this.f280530d = str2;
        this.f280531e = attributedText;
        this.f280532f = str3;
        this.f280533g = list;
        this.f280534h = action;
        this.f280535i = map;
        this.f280536j = analyticParams;
        this.f280537k = searchHeaderConfig;
        this.f280538l = z12;
        this.f280539m = serpViewType;
        this.f280540n = analytics;
        this.f280541o = settings;
        this.f280542p = new h.b("transportationFormWidget", null, null, null, null, analytics, 30, null);
        this.f280543q = a.C10492a.a(this);
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
        if (!(obj instanceof ServiceTransportationWidgetItem)) {
            return false;
        }
        ServiceTransportationWidgetItem serviceTransportationWidgetItem = (ServiceTransportationWidgetItem) obj;
        return L.f(this.f280528b, serviceTransportationWidgetItem.f280528b) && this.f280529c == serviceTransportationWidgetItem.f280529c && L.f(this.f280530d, serviceTransportationWidgetItem.f280530d) && L.f(this.f280531e, serviceTransportationWidgetItem.f280531e) && L.f(this.f280532f, serviceTransportationWidgetItem.f280532f) && L.f(this.f280533g, serviceTransportationWidgetItem.f280533g) && L.f(this.f280534h, serviceTransportationWidgetItem.f280534h) && L.f(this.f280535i, serviceTransportationWidgetItem.f280535i) && L.f(this.f280536j, serviceTransportationWidgetItem.f280536j) && L.f(this.f280537k, serviceTransportationWidgetItem.f280537k) && this.f280538l == serviceTransportationWidgetItem.f280538l && this.f280539m == serviceTransportationWidgetItem.f280539m && L.f(this.f280540n, serviceTransportationWidgetItem.f280540n) && L.f(this.f280541o, serviceTransportationWidgetItem.f280541o);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF79005b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF278897l() {
        return this.f280541o;
    }

    @Override // com.avito.android.remote.model.HeaderToolbarElement
    public final boolean getShowInHeaderToolbar() {
        return this.f280537k != null && this.f280538l;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF268932j() {
        return this.f280529c;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF278887b() {
        return this.f280528b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF278899n() {
        return this.f280543q;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF278900o() {
        return this.f280539m;
    }

    public final int hashCode() {
        int iE2 = r.e(this.f280529c, this.f280528b.hashCode() * 31, 31);
        String str = this.f280530d;
        int iHashCode = (iE2 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.f280531e;
        int iHashCode2 = (iHashCode + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str2 = this.f280532f;
        int iE3 = H.e((iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f280533g);
        ServiceTransportationWidget.Action action = this.f280534h;
        int iHashCode3 = (iE3 + (action == null ? 0 : action.hashCode())) * 31;
        Map<String, String> map = this.f280535i;
        int iHashCode4 = (iHashCode3 + (map == null ? 0 : map.hashCode())) * 31;
        ServiceTransportationWidget.AnalyticParams analyticParams = this.f280536j;
        int iHashCode5 = (iHashCode4 + (analyticParams == null ? 0 : analyticParams.hashCode())) * 31;
        ServiceTransportationWidget.SearchHeaderConfig searchHeaderConfig = this.f280537k;
        int iJ2 = com.avito.android.actions_sheet.a.j(this.f280539m, r.i((iHashCode5 + (searchHeaderConfig == null ? 0 : searchHeaderConfig.hashCode())) * 31, 31, this.f280538l), 31);
        Analytics analytics = this.f280540n;
        int iHashCode6 = (iJ2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f280541o;
        return iHashCode6 + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF278898m() {
        return this.f280542p;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ServiceTransportationWidgetItem(stringId=");
        sb2.append(this.f280528b);
        sb2.append(", spanCount=");
        sb2.append(this.f280529c);
        sb2.append(", title=");
        sb2.append(this.f280530d);
        sb2.append(", description=");
        sb2.append(this.f280531e);
        sb2.append(", bannerStyle=");
        sb2.append(this.f280532f);
        sb2.append(", items=");
        sb2.append(this.f280533g);
        sb2.append(", action=");
        sb2.append(this.f280534h);
        sb2.append(", queryExtParams=");
        sb2.append(this.f280535i);
        sb2.append(", analyticParams=");
        sb2.append(this.f280536j);
        sb2.append(", searchHeaderConfig=");
        sb2.append(this.f280537k);
        sb2.append(", isVerticalMain=");
        sb2.append(this.f280538l);
        sb2.append(", viewType=");
        sb2.append(this.f280539m);
        sb2.append(", analytics=");
        sb2.append(this.f280540n);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f280541o, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f280528b);
        parcel.writeInt(this.f280529c);
        parcel.writeString(this.f280530d);
        parcel.writeParcelable(this.f280531e, i12);
        parcel.writeString(this.f280532f);
        Iterator itJ = C0.j(this.f280533g, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f280534h, i12);
        Map<String, String> map = this.f280535i;
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
        parcel.writeParcelable(this.f280536j, i12);
        parcel.writeParcelable(this.f280537k, i12);
        parcel.writeInt(this.f280538l ? 1 : 0);
        parcel.writeString(this.f280539m.name());
        parcel.writeParcelable(this.f280540n, i12);
        parcel.writeParcelable(this.f280541o, i12);
    }

    public /* synthetic */ ServiceTransportationWidgetItem(String str, int i12, String str2, AttributedText attributedText, String str3, List list, ServiceTransportationWidget.Action action, Map map, ServiceTransportationWidget.AnalyticParams analyticParams, ServiceTransportationWidget.SearchHeaderConfig searchHeaderConfig, boolean z12, SerpViewType serpViewType, Analytics analytics, Settings settings, int i13, C42822w c42822w) {
        this(str, i12, str2, attributedText, str3, list, action, map, analyticParams, searchHeaderConfig, z12, (i13 & 2048) != 0 ? SerpViewType.f268585e : serpViewType, analytics, settings);
    }
}
