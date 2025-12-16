package com.avito.android.serp.adapter.vertical_main.usp_banner_widget;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.S2;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.vertical_main.usp_banner_widget.banner.UspBannerItem;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import qs0.InterfaceC47435a;

/* compiled from: UspBannersWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/UspBannersWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class UspBannersWidgetItem implements PersistableSerpItem, S2, is0.h, InterfaceC47435a {

    @Y61.k
    public static final Parcelable.Creator<UspBannersWidgetItem> CREATOR;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f273281b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f273282c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final List<UspBannerItem> f273283d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final String f273284e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final Analytics f273285f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final Settings f273286g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final h.b f273287h;

    /* renamed from: i, reason: collision with root package name */
    public final long f273288i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f273289j;

    /* renamed from: k, reason: collision with root package name */
    public final int f273290k;

    /* compiled from: UspBannersWidgetItem.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/usp_banner_widget/UspBannersWidgetItem$a;", "", "<init>", "()V", "", "USP_BANNER_WIDGET_NAME", "Ljava/lang/String;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: UspBannersWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b implements Parcelable.Creator<UspBannersWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final UspBannersWidgetItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            int iC2 = 0;
            boolean z12 = parcel.readInt() != 0;
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(UspBannerItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new UspBannersWidgetItem(string, z12, arrayList, parcel.readString(), (Analytics) parcel.readParcelable(UspBannersWidgetItem.class.getClassLoader()), (Settings) parcel.readParcelable(UspBannersWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final UspBannersWidgetItem[] newArray(int i12) {
            return new UspBannersWidgetItem[i12];
        }
    }

    static {
        new a(null);
        CREATOR = new b();
    }

    public UspBannersWidgetItem(@Y61.k String str, boolean z12, @Y61.k List<UspBannerItem> list, @Y61.l String str2, @Y61.l Analytics analytics, @Y61.l Settings settings) {
        this.f273281b = str;
        this.f273282c = z12;
        this.f273283d = list;
        this.f273284e = str2;
        this.f273285f = analytics;
        this.f273286g = settings;
        this.f273287h = new h.b(str2 == null ? "usp_banner_widget" : str2, null, null, null, null, analytics, 30, null);
        this.f273288i = a.C10492a.a(this);
        this.f273289j = SerpViewType.f268585e;
        this.f273290k = 6;
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
    public final boolean getF272848j() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF186822h() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @Y61.l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272854p() {
        return this.f273286g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF272845g() {
        return this.f273290k;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF272840b() {
        return this.f273281b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272855q() {
        return this.f273288i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF272844f() {
        return this.f273289j;
    }

    @Override // is0.h
    @Y61.k
    /* renamed from: q1, reason: from getter */
    public final h.b getF272856r() {
        return this.f273287h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeString(this.f273281b);
        parcel.writeInt(this.f273282c ? 1 : 0);
        Iterator itJ = C0.j(this.f273283d, parcel);
        while (itJ.hasNext()) {
            ((UspBannerItem) itJ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeString(this.f273284e);
        parcel.writeParcelable(this.f273285f, i12);
        parcel.writeParcelable(this.f273286g, i12);
    }

    public /* synthetic */ UspBannersWidgetItem(String str, boolean z12, List list, String str2, Analytics analytics, Settings settings, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "usp_banner_widget" : str, (i12 & 2) != 0 ? false : z12, list, str2, analytics, settings);
    }
}
