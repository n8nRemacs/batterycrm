package com.avito.android.serp.adapter.developments_catalog.filters.tabs_with_image;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.remote.model.developments_catalog.serp.Tab;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: FiltersTabsItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003:\u0001\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/filters/tabs_with_image/FiltersTabsItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class FiltersTabsItem implements PersistableSerpItem, is0.h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<FiltersTabsItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    public final long f269870b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f269871c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<Tab> f269872d;

    /* renamed from: e, reason: collision with root package name */
    public final int f269873e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Analytics f269874f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Settings f269875g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final h.b f269876h;

    /* renamed from: i, reason: collision with root package name */
    public final long f269877i;

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f269878j = SerpViewType.f268585e;

    /* compiled from: FiltersTabsItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/developments_catalog/filters/tabs_with_image/FiltersTabsItem$a;", "", "<init>", "()V", "", "WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FiltersTabsItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<FiltersTabsItem> {
        @Override // android.os.Parcelable.Creator
        public final FiltersTabsItem createFromParcel(Parcel parcel) {
            long j12 = parcel.readLong();
            String string = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(FiltersTabsItem.class, parcel, arrayList, iL2, 1);
            }
            return new FiltersTabsItem(j12, string, arrayList, parcel.readInt(), (Analytics) parcel.readParcelable(FiltersTabsItem.class.getClassLoader()), (Settings) parcel.readParcelable(FiltersTabsItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final FiltersTabsItem[] newArray(int i12) {
            return new FiltersTabsItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public FiltersTabsItem(long j12, @k String str, @k List<Tab> list, int i12, @l Analytics analytics, @l Settings settings) {
        this.f269870b = j12;
        this.f269871c = str;
        this.f269872d = list;
        this.f269873e = i12;
        this.f269874f = analytics;
        this.f269875g = settings;
        this.f269876h = new h.b("filtersTabs", null, null, null, null, analytics, 30, null);
        this.f269877i = j12;
    }

    @Override // is0.h
    public final boolean L() {
        return false;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF252237h() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF83467b() {
        return this.f269870b;
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF252239j() {
        return this.f269875g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF83473h() {
        return this.f269873e;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF81752b() {
        return this.f269871c;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF74291l() {
        return this.f269877i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF83475j() {
        return this.f269878j;
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF252240k() {
        return this.f269876h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeLong(this.f269870b);
        parcel.writeString(this.f269871c);
        Iterator itJ = C0.j(this.f269872d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeInt(this.f269873e);
        parcel.writeParcelable(this.f269874f, i12);
        parcel.writeParcelable(this.f269875g, i12);
    }
}
