package com.avito.android.serp.adapter.gig_promo_snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.internal.P;
import com.avito.android.promo_snippet.PromoSnippetListState;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_settings.Settings;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.conveyor_item.a;
import is0.h;
import kotlin.Metadata;
import qs0.InterfaceC47435a;

/* compiled from: GigPromoSnippetItem.kt */
@K51.d
@P
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/serp/adapter/gig_promo_snippet/GigPromoSnippetItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Landroid/os/Parcelable;", "Lis0/h;", "Lqs0/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class GigPromoSnippetItem implements PersistableSerpItem, Parcelable, h, InterfaceC47435a {

    @k
    public static final Parcelable.Creator<GigPromoSnippetItem> CREATOR = new a();

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f270078b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final PromoSnippetListState f270079c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public final Analytics f270080d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public final Settings f270081e;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final h.b f270084h;

    /* renamed from: f, reason: collision with root package name */
    @k
    public final SerpViewType f270082f = SerpViewType.f268585e;

    /* renamed from: g, reason: collision with root package name */
    public final int f270083g = 6;

    /* renamed from: i, reason: collision with root package name */
    public final long f270085i = a.C10492a.a(this);

    /* compiled from: GigPromoSnippetItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<GigPromoSnippetItem> {
        @Override // android.os.Parcelable.Creator
        public final GigPromoSnippetItem createFromParcel(Parcel parcel) {
            return new GigPromoSnippetItem(parcel.readString(), (PromoSnippetListState) parcel.readParcelable(GigPromoSnippetItem.class.getClassLoader()), (Analytics) parcel.readParcelable(GigPromoSnippetItem.class.getClassLoader()), (Settings) parcel.readParcelable(GigPromoSnippetItem.class.getClassLoader()));
        }

        @Override // android.os.Parcelable.Creator
        public final GigPromoSnippetItem[] newArray(int i12) {
            return new GigPromoSnippetItem[i12];
        }
    }

    public GigPromoSnippetItem(@k String str, @k PromoSnippetListState promoSnippetListState, @l Analytics analytics, @l Settings settings) {
        this.f270078b = str;
        this.f270079c = promoSnippetListState;
        this.f270080d = analytics;
        this.f270081e = settings;
        this.f270084h = new h.b("cvDisplayWidget", promoSnippetListState.f231715b, null, null, null, analytics, 28, null);
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
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF271695b() {
        return a.C10492a.a(this);
    }

    @Override // qs0.InterfaceC47435a
    @l
    /* renamed from: getSettings, reason: from getter */
    public final Settings getF272674h() {
        return this.f270081e;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF271702i() {
        return this.f270083g;
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF271696c() {
        return this.f270078b;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId, reason: from getter */
    public final long getF272676j() {
        return this.f270085i;
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF271703j() {
        return this.f270082f;
    }

    @Override // is0.h
    @k
    /* renamed from: q1, reason: from getter */
    public final h.b getF272675i() {
        return this.f270084h;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@k Parcel parcel, int i12) {
        parcel.writeString(this.f270078b);
        parcel.writeParcelable(this.f270079c, i12);
        parcel.writeParcelable(this.f270080d, i12);
        parcel.writeParcelable(this.f270081e, i12);
    }
}
