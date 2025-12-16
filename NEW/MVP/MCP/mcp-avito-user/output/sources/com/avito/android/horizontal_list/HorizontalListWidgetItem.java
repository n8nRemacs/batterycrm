package com.avito.android.horizontal_list;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import com.avito.android.horizontal_list.widget.HorizontalWidgetType;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.UUID;
import kotlin.Metadata;
import qs0.InterfaceC47435a;

/* compiled from: HorizontalListWidgetItem.kt */
@K51.d
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/horizontal_list/HorizontalListWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lis0/h;", "Lqs0/a;", "_avito_bx-content_widget_horizontal-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class HorizontalListWidgetItem implements PersistableSerpItem, is0.h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<HorizontalListWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    public final int f162538b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final String f162539c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f162540d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final HorizontalWidgetType f162541e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final Analytics f162542f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Settings f162543g;

    /* renamed from: i, reason: collision with root package name */
    @k
    public final h.b f162545i;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f162544h = UUID.randomUUID().toString();

    /* renamed from: j, reason: collision with root package name */
    public final long f162546j = getF131998b().hashCode();

    /* renamed from: k, reason: collision with root package name */
    @k
    public final SerpViewType f162547k = SerpViewType.f268584d;

    /* compiled from: HorizontalListWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<HorizontalListWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final HorizontalListWidgetItem createFromParcel(Parcel parcel) {
            int i12 = parcel.readInt();
            String string = parcel.readString();
            int i13 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i13);
            int iL2 = 0;
            while (iL2 != i13) {
                iL2 = com.avito.android.actions_sheet.a.l(HorizontalListWidgetItem.class, parcel, arrayList, iL2, 1);
            }
            return new HorizontalListWidgetItem(i12, string, arrayList, HorizontalWidgetType.CREATOR.createFromParcel(parcel), (Analytics) parcel.readParcelable(HorizontalListWidgetItem.class.getClassLoader()), (Settings) parcel.readParcelable(HorizontalListWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final HorizontalListWidgetItem[] newArray(int i12) {
            return new HorizontalListWidgetItem[i12];
        }
    }

    public HorizontalListWidgetItem(int i12, @l String str, @k ArrayList arrayList, @k HorizontalWidgetType horizontalWidgetType, @l Analytics analytics, @l Settings settings) {
        this.f162538b = i12;
        this.f162539c = str;
        this.f162540d = arrayList;
        this.f162541e = horizontalWidgetType;
        this.f162542f = analytics;
        this.f162543g = settings;
        this.f162545i = new h.b(horizontalWidgetType.f162607b, null, null, null, null, analytics, 30, null);
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
    public final boolean getF272775j() {
        return false;
    }

    @Override // TV0.a
    public final long getId() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF271479m() {
        return this.f162543g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF271481o() {
        return this.f162538b;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF131998b() {
        return this.f162544h;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272777l() {
        return this.f162546j;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF271480n() {
        return this.f162547k;
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF272776k() {
        return this.f162545i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeInt(this.f162538b);
        parcel.writeString(this.f162539c);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f162540d, parcel);
        while (itZ.hasNext()) {
            parcel.writeParcelable((Parcelable) itZ.next(), i12);
        }
        this.f162541e.writeToParcel(parcel, i12);
        parcel.writeParcelable(this.f162542f, i12);
        parcel.writeParcelable(this.f162543g, i12);
    }
}
