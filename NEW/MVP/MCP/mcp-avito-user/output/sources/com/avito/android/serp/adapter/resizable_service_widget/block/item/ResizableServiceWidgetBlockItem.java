package com.avito.android.serp.adapter.resizable_service_widget.block.item;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.resizable_service_widget.row.item.ResizableServiceWidgetRowItem;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import qs0.InterfaceC47435a;

/* compiled from: ResizableServiceWidgetBlockItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/resizable_service_widget/block/item/ResizableServiceWidgetBlockItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ResizableServiceWidgetBlockItem implements PersistableSerpItem, h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<ResizableServiceWidgetBlockItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f270696b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f270697c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<ResizableServiceWidgetRowItem> f270698d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Analytics f270699e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Settings f270700f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final h.b f270701g;

    /* renamed from: h, reason: collision with root package name */
    public final long f270702h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final SerpViewType f270703i;

    /* renamed from: j, reason: collision with root package name */
    public final int f270704j;

    /* compiled from: ResizableServiceWidgetBlockItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/adapter/resizable_service_widget/block/item/ResizableServiceWidgetBlockItem$a;", "", "<init>", "()V", "", "RESIZABLE_SERVICE_WIDGET_BLOCK_ITEM_ID", "Ljava/lang/String;", "RESIZABLE_SERVICE_WIDGET_NAME", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ResizableServiceWidgetBlockItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<ResizableServiceWidgetBlockItem> {
        @Override // android.os.Parcelable.Creator
        public final ResizableServiceWidgetBlockItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(ResizableServiceWidgetRowItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new ResizableServiceWidgetBlockItem(string, z12, arrayList, (Analytics) parcel.readParcelable(ResizableServiceWidgetBlockItem.class.getClassLoader()), (Settings) parcel.readParcelable(ResizableServiceWidgetBlockItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final ResizableServiceWidgetBlockItem[] newArray(int i12) {
            return new ResizableServiceWidgetBlockItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public ResizableServiceWidgetBlockItem(@k String str, boolean z12, @k List<ResizableServiceWidgetRowItem> list, @l Analytics analytics, @l Settings settings) {
        this.f270696b = str;
        this.f270697c = z12;
        this.f270698d = list;
        this.f270699e = analytics;
        this.f270700f = settings;
        this.f270701g = new h.b("services_widget", null, null, null, null, analytics, 30, null);
        this.f270702h = a.C10492a.a(this);
        this.f270703i = SerpViewType.f268585e;
        this.f270704j = 6;
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
        if (!(obj instanceof ResizableServiceWidgetBlockItem)) {
            return false;
        }
        ResizableServiceWidgetBlockItem resizableServiceWidgetBlockItem = (ResizableServiceWidgetBlockItem) obj;
        return L.f(this.f270696b, resizableServiceWidgetBlockItem.f270696b) && this.f270697c == resizableServiceWidgetBlockItem.f270697c && L.f(this.f270698d, resizableServiceWidgetBlockItem.f270698d) && L.f(this.f270699e, resizableServiceWidgetBlockItem.f270699e) && L.f(this.f270700f, resizableServiceWidgetBlockItem.f270700f);
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272457h() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF269849b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF269854g() {
        return this.f270700f;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF269852e() {
        return this.f270704j;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF269850c() {
        return this.f270696b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF269856i() {
        return this.f270702h;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF269857j() {
        return this.f270703i;
    }

    public final int hashCode() {
        int iE2 = H.e(r.i(this.f270696b.hashCode() * 31, 31, this.f270697c), 31, this.f270698d);
        Analytics analytics = this.f270699e;
        int iHashCode = (iE2 + (analytics == null ? 0 : analytics.hashCode())) * 31;
        Settings settings = this.f270700f;
        return iHashCode + (settings != null ? settings.hashCode() : 0);
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF269855h() {
        return this.f270701g;
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ResizableServiceWidgetBlockItem(stringId=");
        sb2.append(this.f270696b);
        sb2.append(", isExternalAd=");
        sb2.append(this.f270697c);
        sb2.append(", items=");
        sb2.append(this.f270698d);
        sb2.append(", analytics=");
        sb2.append(this.f270699e);
        sb2.append(", settings=");
        return com.avito.android.authorization.auto_recovery.phone_confirm.b.f(sb2, this.f270700f, ')');
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f270696b);
        parcel.writeInt(this.f270697c ? 1 : 0);
        Iterator itJ = C0.j(this.f270698d, parcel);
        while (itJ.hasNext()) {
            ((ResizableServiceWidgetRowItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f270699e, i12);
        parcel.writeParcelable(this.f270700f, i12);
    }

    public /* synthetic */ ResizableServiceWidgetBlockItem(String str, boolean z12, List list, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "resizable_service_widget_block_item_id" : str, (i12 & 2) != 0 ? false : z12, list, analytics, settings);
    }
}
