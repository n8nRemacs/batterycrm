package com.avito.android.advertising.adapter.items.buzzoola.profile_promo;

import K51.d;
import Y61.k;
import android.os.Parcel;
import android.os.Parcelable;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.advertising.CommercialItem;
import com.avito.android.advertising.adapter.items.AdViewType;
import com.avito.android.advertising.loaders.BannerInfo;
import com.avito.android.advertising.loaders.InterfaceC28345a;
import com.avito.android.grid.GridElementType;
import com.avito.android.remote.model.SerpDisplayType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import pb.InterfaceC47047c;
import pb.e;

/* compiled from: ProfilePromoGalleryBannerItem.kt */
@d
@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0017\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u0004BM\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0005\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J \u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0019\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001a\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b#\u0010\u001fR\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010'\u001a\u0004\b(\u0010\u0016R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010)\u001a\u0004\b*\u0010+R\"\u0010\u0012\u001a\u00020\u00118\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0012\u0010,\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00104\u001a\u0002018VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b2\u00103¨\u00065"}, d2 = {"Lcom/avito/android/advertising/adapter/items/buzzoola/profile_promo/ProfilePromoGalleryBannerItem;", "Lcom/avito/android/advertising/CommercialItem;", "Lpb/e;", "Lpb/c;", "Lcom/avito/android/advertising/loaders/a;", "", "stringId", "", "id", "title", "", "Lcom/avito/android/advertising/adapter/items/buzzoola/profile_promo/ProfilePromoBannerItem;", "profilePromoItems", "", "spanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "adViewType", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "<init>", "(Ljava/lang/String;JLjava/lang/String;Ljava/util/List;ILcom/avito/android/advertising/adapter/items/AdViewType;Lcom/avito/android/remote/model/SerpDisplayType;)V", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStringId", "()Ljava/lang/String;", "J", "getId", "()J", "getTitle", "Ljava/util/List;", "getProfilePromoItems", "()Ljava/util/List;", "I", "getSpanCount", "Lcom/avito/android/advertising/adapter/items/AdViewType;", "getAdViewType", "()Lcom/avito/android/advertising/adapter/items/AdViewType;", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "()Lcom/avito/android/remote/model/SerpDisplayType;", "setDisplayType", "(Lcom/avito/android/remote/model/SerpDisplayType;)V", "Lcom/avito/android/advertising/loaders/BannerInfo;", "getBannerInfo", "()Lcom/avito/android/advertising/loaders/BannerInfo;", "bannerInfo", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public class ProfilePromoGalleryBannerItem implements CommercialItem, e, InterfaceC47047c, InterfaceC28345a {

    @k
    public static final Parcelable.Creator<ProfilePromoGalleryBannerItem> CREATOR = new a();

    @k
    private final AdViewType adViewType;

    @k
    private SerpDisplayType displayType;
    private final long id;

    @k
    private final List<ProfilePromoBannerItem> profilePromoItems;
    private final int spanCount;

    @k
    private final String stringId;

    @k
    private final String title;

    /* compiled from: ProfilePromoGalleryBannerItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ProfilePromoGalleryBannerItem> {
        @Override // android.os.Parcelable.Creator
        public final ProfilePromoGalleryBannerItem createFromParcel(Parcel parcel) {
            String string = parcel.readString();
            long j12 = parcel.readLong();
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            ArrayList arrayList = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = com.avito.android.actions_sheet.a.l(ProfilePromoGalleryBannerItem.class, parcel, arrayList, iL2, 1);
            }
            return new ProfilePromoGalleryBannerItem(string, j12, string2, arrayList, parcel.readInt(), AdViewType.valueOf(parcel.readString()), SerpDisplayType.valueOf(parcel.readString()));
        }

        @Override // android.os.Parcelable.Creator
        public final ProfilePromoGalleryBannerItem[] newArray(int i12) {
            return new ProfilePromoGalleryBannerItem[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ProfilePromoGalleryBannerItem(@k String str, long j12, @k String str2, @k List<? extends ProfilePromoBannerItem> list, int i12, @k AdViewType adViewType, @k SerpDisplayType serpDisplayType) {
        this.stringId = str;
        this.id = j12;
        this.title = str2;
        this.profilePromoItems = list;
        this.spanCount = i12;
        this.adViewType = adViewType;
        this.displayType = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    @Override // pb.e
    @k
    public AdViewType getAdViewType() {
        return this.adViewType;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public int getArea() {
        return getBannerInfo().f87891v;
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    @k
    public BannerInfo getBannerInfo() {
        BannerInfo bannerInfo;
        ProfilePromoBannerItem profilePromoBannerItem = (ProfilePromoBannerItem) C42745f0.G(this.profilePromoItems);
        if (profilePromoBannerItem != null && (bannerInfo = profilePromoBannerItem.getBannerInfo()) != null) {
            return bannerInfo;
        }
        BannerInfo.f87863F.getClass();
        return BannerInfo.f87865H;
    }

    @k
    public SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @Override // QH.a
    @k
    /* renamed from: getGridType */
    public GridElementType getF154543c() {
        return GridElementType.FullWidth.f161209b;
    }

    @Override // TV0.a
    public long getId() {
        return this.id;
    }

    @k
    public final List<ProfilePromoBannerItem> getProfilePromoItems() {
        return this.profilePromoItems;
    }

    public int getSpanCount() {
        return this.spanCount;
    }

    @Override // com.avito.conveyor_item.a
    @k
    public String getStringId() {
        return this.stringId;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @Override // com.avito.konveyor.item_visibility_tracker.b.InterfaceC10495b
    /* renamed from: getTrackId */
    public long getF269956h() {
        return getBannerInfo().getF269956h();
    }

    @Override // com.avito.android.advertising.CommercialItem
    public boolean isContentEqualWith(@k Object obj) {
        return CommercialItem.a.a(this, obj);
    }

    @Override // com.avito.android.advertising.loaders.InterfaceC28345a
    public void setArea(int i12) {
        getBannerInfo().f87891v = i12;
    }

    public void setDisplayType(@k SerpDisplayType serpDisplayType) {
        this.displayType = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.stringId);
        parcel.writeLong(this.id);
        parcel.writeString(this.title);
        Iterator itJ = C0.j(this.profilePromoItems, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        parcel.writeInt(this.spanCount);
        parcel.writeString(this.adViewType.name());
        parcel.writeString(this.displayType.name());
    }

    public /* synthetic */ ProfilePromoGalleryBannerItem(String str, long j12, String str2, List list, int i12, AdViewType adViewType, SerpDisplayType serpDisplayType, int i13, C42822w c42822w) {
        this(str, (i13 & 2) != 0 ? str.hashCode() : j12, str2, list, (i13 & 16) != 0 ? 6 : i12, (i13 & 32) != 0 ? AdViewType.f86909c : adViewType, (i13 & 64) != 0 ? SerpDisplayType.Grid : serpDisplayType);
    }
}
