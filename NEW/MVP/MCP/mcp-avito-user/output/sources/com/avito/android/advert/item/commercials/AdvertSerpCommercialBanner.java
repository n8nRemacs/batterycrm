package com.avito.android.advert.item.commercials;

import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.runtime.internal.P;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.remote.model.AdSize;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.ad.SerpCommercialBannerItem;
import com.avito.android.serp.adapter.l1;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AdvertCommercials.kt */
@P
@Keep
@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u0000 &2\u00020\u00012\u00020\u0002:\u0001'B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005B\u0011\b\u0016\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0004\u0010\bJ\u001f\u0010\r\u001a\u00020\f2\u0006\u0010\t\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0015\u001a\u00020\u00148\u0016X\u0096D¢\u0006\f\n\u0004\b\u0015\u0010\u0016\u001a\u0004\b\u0015\u0010\u0017R\u0014\u0010\u001b\u001a\u00020\u00188VX\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001aR\u0014\u0010\u001d\u001a\u00020\n8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001c\u0010\u0010R\u0014\u0010!\u001a\u00020\u001e8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u0014\u0010%\u001a\u00020\"8\u0016X\u0096\u0005¢\u0006\u0006\u001a\u0004\b#\u0010$¨\u0006("}, d2 = {"Lcom/avito/android/advert/item/commercials/AdvertSerpCommercialBanner;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/serp/adapter/l1;", "commercialSerpItem", "<init>", "(Lcom/avito/android/serp/adapter/l1;)V", "Landroid/os/Parcel;", "parcel", "(Landroid/os/Parcel;)V", "dest", "", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "describeContents", "()I", "Lcom/avito/android/serp/adapter/l1;", "getCommercialSerpItem", "()Lcom/avito/android/serp/adapter/l1;", "", "isExternalAd", "Z", "()Z", "", "getId", "()J", "id", "getSpanCount", "spanCount", "", "getStringId", "()Ljava/lang/String;", "stringId", "Lcom/avito/android/serp/adapter/SerpViewType;", "getViewType", "()Lcom/avito/android/serp/adapter/SerpViewType;", "viewType", "CREATOR", "a", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdvertSerpCommercialBanner implements PersistableSerpItem, l1 {

    @k
    private final l1 commercialSerpItem;
    private final boolean isExternalAd;

    /* renamed from: CREATOR, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    /* compiled from: AdvertCommercials.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/avito/android/advert/item/commercials/AdvertSerpCommercialBanner$a;", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/advert/item/commercials/AdvertSerpCommercialBanner;", "<init>", "()V", "_avito_advert-details_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.advert.item.commercials.AdvertSerpCommercialBanner$a, reason: from kotlin metadata */
    public static final class Companion implements Parcelable.Creator<AdvertSerpCommercialBanner> {
        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertSerpCommercialBanner createFromParcel(Parcel parcel) {
            return new AdvertSerpCommercialBanner(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final AdvertSerpCommercialBanner[] newArray(int i12) {
            return new AdvertSerpCommercialBanner[i12];
        }

        public Companion() {
        }
    }

    public AdvertSerpCommercialBanner(@k l1 l1Var) {
        this.commercialSerpItem = l1Var;
        this.isExternalAd = true;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @k
    public final l1 getCommercialSerpItem() {
        return this.commercialSerpItem;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public long getF74796b() {
        return this.commercialSerpItem.getF74796b();
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount */
    public int getF74798d() {
        return this.commercialSerpItem.getF74798d();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId */
    public String getF200606b() {
        return this.commercialSerpItem.getF200606b();
    }

    @Override // com.avito.android.serp.adapter.l1
    @k
    /* renamed from: getViewType */
    public SerpViewType getF78594d() {
        return this.commercialSerpItem.getF78594d();
    }

    /* renamed from: isExternalAd, reason: from getter */
    public boolean getIsExternalAd() {
        return this.isExternalAd;
    }

    public AdvertSerpCommercialBanner(@k Parcel parcel) {
        this(new SerpCommercialBannerItem(0L, "", AdViewType.f86910d, SerpDisplayType.Grid, 2, AdSize.BIG, null, null, 128, null));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel dest, int flags) {
    }
}
