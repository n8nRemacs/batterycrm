package com.avito.android.serp.adapter.top_sellers_serp;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.S2;
import com.avito.android.remote.model.swipe_sellers.TopSellerSerp;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import qs0.InterfaceC47435a;

/* compiled from: TopSellersSerpWidgetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/serp/adapter/top_sellers_serp/TopSellersSerpWidgetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/S2;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class TopSellersSerpWidgetItem implements PersistableSerpItem, S2, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<TopSellersSerpWidgetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f272451b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f272452c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final List<TopSellerSerp> f272453d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Settings f272454e;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f272455f = SerpViewType.f268585e;

    /* renamed from: g, reason: collision with root package name */
    public final int f272456g = 6;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f272457h = true;

    /* compiled from: TopSellersSerpWidgetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<TopSellersSerpWidgetItem> {
        @Override // android.os.Parcelable.Creator
        public final TopSellersSerpWidgetItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(TopSellersSerpWidgetItem.class, parcel, arrayList, iL2, 1);
            }
            return new TopSellersSerpWidgetItem(string, string2, arrayList, (Settings) parcel.readParcelable(TopSellersSerpWidgetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final TopSellersSerpWidgetItem[] newArray(int i12) {
            return new TopSellersSerpWidgetItem[i12];
        }
    }

    public TopSellersSerpWidgetItem(@k String str, @k String str2, @k List<TopSellerSerp> list, @l Settings settings) {
        this.f272451b = str;
        this.f272452c = str2;
        this.f272453d = list;
        this.f272454e = settings;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition, reason: from getter */
    public final boolean getF272887i() {
        return this.f272457h;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF73058b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF270101e() {
        return this.f272454e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF78716h() {
        return this.f272456g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF174298h() {
        return this.f272451b;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78717i() {
        return this.f272455f;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f272451b);
        parcel.writeString(this.f272452c);
        Iterator itJ = C0.j(this.f272453d, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), i12);
        }
        parcel.writeParcelable(this.f272454e, i12);
    }
}
