package com.avito.android.serp.adapter.vertical_main.sellers_carousel;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.S2;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.SellersCarouselWidget;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.SellerItem;
import com.avito.conveyor_item.a;
import is0.h;
import java.util.ArrayList;
import java.util.Iterator;
import kotlin.Metadata;
import qs0.InterfaceC47435a;

/* compiled from: SellersCarouselWidgetItem.kt */
@d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/vertical_main/sellers_carousel/SellersCarouselWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lis0/h;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class SellersCarouselWidgetItem implements PersistableSerpItem, S2, h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<SellersCarouselWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f273150b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final AttributedText f273151c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final ArrayList f273152d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Analytics f273153e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SellersCarouselWidget.Template f273154f;

    /* renamed from: g, reason: collision with root package name */
    @l
    public final Settings f273155g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final h.b f273156h;

    /* renamed from: i, reason: collision with root package name */
    public final long f273157i = getF317289b().hashCode();

    /* renamed from: j, reason: collision with root package name */
    @k
    public final SerpViewType f273158j = SerpViewType.f268585e;

    /* renamed from: k, reason: collision with root package name */
    public final int f273159k = 6;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f273160l = true;

    /* compiled from: SellersCarouselWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SellersCarouselWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final SellersCarouselWidgetItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(SellersCarouselWidgetItem.class.getClassLoader());
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iC2 = 0;
            while (iC2 != i12) {
                iC2 = com.avito.android.actions_sheet.a.c(SellerItem.CREATOR, parcel, arrayList, iC2, 1);
            }
            return new SellersCarouselWidgetItem(string, attributedText, arrayList, (Analytics) parcel.readParcelable(SellersCarouselWidgetItem.class.getClassLoader()), SellersCarouselWidget.Template.valueOf(parcel.readString()), (Settings) parcel.readParcelable(SellersCarouselWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final SellersCarouselWidgetItem[] newArray(int i12) {
            return new SellersCarouselWidgetItem[i12];
        }
    }

    public SellersCarouselWidgetItem(@k String str, @k AttributedText attributedText, @k ArrayList arrayList, @l Analytics analytics, @k SellersCarouselWidget.Template template, @l Settings settings) {
        this.f273150b = str;
        this.f273151c = attributedText;
        this.f273152d = arrayList;
        this.f273153e = analytics;
        this.f273154f = template;
        this.f273155g = settings;
        this.f273156h = new h.b(null, null, null, null, null, analytics, 31, null);
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
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF231631p() {
        return this.f273160l;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85764e() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF231632q() {
        return this.f273155g;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF75763b() {
        return this.f273159k;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF317289b() {
        return this.f273150b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF231637v() {
        return this.f273157i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF85768i() {
        return this.f273158j;
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF231636u() {
        return this.f273156h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f273150b);
        parcel.writeParcelable(this.f273151c, i12);
        Iterator itZ = com.avito.android.actions_sheet.a.z(this.f273152d, parcel);
        while (itZ.hasNext()) {
            ((SellerItem) itZ.next()).writeToParcel(parcel, i12);
        }
        parcel.writeParcelable(this.f273153e, i12);
        parcel.writeString(this.f273154f.name());
        parcel.writeParcelable(this.f273155g, i12);
    }
}
