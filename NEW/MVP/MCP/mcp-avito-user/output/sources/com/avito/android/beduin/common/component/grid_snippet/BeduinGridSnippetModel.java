package com.avito.android.beduin.common.component.grid_snippet;

import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import cj.InterfaceC27203a;
import com.avito.android.beduin.common.component.LeafBeduinModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.beduin.common.form.transforms.DisplayPredicateTransform;
import com.avito.android.beduin.common.form.transforms.IsFavoriteTransform;
import com.avito.android.beduin.common.form.transforms.IsViewedTransform;
import com.avito.android.beduin_models.BeduinAction;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.beduin_models.BeduinModelTransform;
import com.avito.android.beduin_models.DisplayingPredicate;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.ConstructorAdvertNetworkModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.PriceNetworkModel;
import com.avito.android.remote.model.badge_bar.SerpBadge;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.L;

/* compiled from: BeduinGridSnippetModel.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002BI\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\u000e\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0012\u001a\u00020\u0011H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0018\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0018\u0010\u001a\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\rHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J^\u0010!\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0003HÖ\u0001¢\u0006\u0004\b#\u0010\u0017J\u0010\u0010%\u001a\u00020$HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\r2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020$HÖ\u0001¢\u0006\u0004\b+\u0010&J \u00100\u001a\u00020/2\u0006\u0010-\u001a\u00020,2\u0006\u0010.\u001a\u00020$HÖ\u0001¢\u0006\u0004\b0\u00101R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b3\u0010\u0017R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u0019R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\b\u00104\u001a\u0004\b6\u0010\u0019R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u00107\u001a\u0004\b8\u0010\u001cR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00109\u001a\u0004\b:\u0010\u001eR\u001a\u0010\u000e\u001a\u00020\r8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000e\u0010;\u001a\u0004\b\u000e\u0010 R\u0016\u0010=\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b<\u0010\u0017R\u0014\u0010>\u001a\u00020\r8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b>\u0010 ¨\u0006?"}, d2 = {"Lcom/avito/android/beduin/common/component/grid_snippet/BeduinGridSnippetModel;", "Lcom/avito/android/beduin/common/component/LeafBeduinModel;", "Lcj/a;", "", "id", "", "Lcom/avito/android/beduin_models/BeduinAction;", "onTapActions", "onFavoriteTapActions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", BeduinPromoBlockModel.SERIALIZED_NAME_DISPLAYING_PREDICATE, "Lcom/avito/android/remote/model/ConstructorAdvertNetworkModel;", "snippet", "", "isViewed", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/remote/model/ConstructorAdvertNetworkModel;Z)V", "Lcom/avito/android/beduin_models/BeduinModelTransform;", "transform", "Lcom/avito/android/beduin_models/BeduinModel;", "apply", "(Lcom/avito/android/beduin_models/BeduinModelTransform;)Lcom/avito/android/beduin_models/BeduinModel;", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lcom/avito/android/beduin_models/DisplayingPredicate;", "component5", "()Lcom/avito/android/remote/model/ConstructorAdvertNetworkModel;", "component6", "()Z", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/util/List;Lcom/avito/android/beduin_models/DisplayingPredicate;Lcom/avito/android/remote/model/ConstructorAdvertNetworkModel;Z)Lcom/avito/android/beduin/common/component/grid_snippet/BeduinGridSnippetModel;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "Ljava/util/List;", "getOnTapActions", "getOnFavoriteTapActions", "Lcom/avito/android/beduin_models/DisplayingPredicate;", "getDisplayingPredicate", "Lcom/avito/android/remote/model/ConstructorAdvertNetworkModel;", "getSnippet", "Z", "getAdvertId", "advertId", "isFavorite", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class BeduinGridSnippetModel extends LeafBeduinModel implements InterfaceC27203a {

    @k
    public static final Parcelable.Creator<BeduinGridSnippetModel> CREATOR = new a();

    @l
    private final DisplayingPredicate displayingPredicate;

    @k
    private final String id;
    private final boolean isViewed;

    @l
    private final List<BeduinAction> onFavoriteTapActions;

    @l
    private final List<BeduinAction> onTapActions;

    @k
    private final ConstructorAdvertNetworkModel snippet;

    /* compiled from: BeduinGridSnippetModel.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<BeduinGridSnippetModel> {
        @Override // android.os.Parcelable.Creator
        public final BeduinGridSnippetModel createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            String string = parcel.readString();
            ArrayList arrayList2 = null;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(BeduinGridSnippetModel.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() != 0) {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(BeduinGridSnippetModel.class, parcel, arrayList2, iL3, 1);
                }
            }
            return new BeduinGridSnippetModel(string, arrayList, arrayList2, (DisplayingPredicate) parcel.readParcelable(BeduinGridSnippetModel.class.getClassLoader()), (ConstructorAdvertNetworkModel) parcel.readParcelable(BeduinGridSnippetModel.class.getClassLoader()), parcel.readInt() != 0);
        }

        @Override // android.os.Parcelable.Creator
        public final BeduinGridSnippetModel[] newArray(int i12) {
            return new BeduinGridSnippetModel[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BeduinGridSnippetModel(@k String str, @l List<? extends BeduinAction> list, @l List<? extends BeduinAction> list2, @l DisplayingPredicate displayingPredicate, @k ConstructorAdvertNetworkModel constructorAdvertNetworkModel, boolean z12) {
        this.id = str;
        this.onTapActions = list;
        this.onFavoriteTapActions = list2;
        this.displayingPredicate = displayingPredicate;
        this.snippet = constructorAdvertNetworkModel;
        this.isViewed = z12;
    }

    public static /* synthetic */ BeduinGridSnippetModel copy$default(BeduinGridSnippetModel beduinGridSnippetModel, String str, List list, List list2, DisplayingPredicate displayingPredicate, ConstructorAdvertNetworkModel constructorAdvertNetworkModel, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            str = beduinGridSnippetModel.id;
        }
        if ((i12 & 2) != 0) {
            list = beduinGridSnippetModel.onTapActions;
        }
        List list3 = list;
        if ((i12 & 4) != 0) {
            list2 = beduinGridSnippetModel.onFavoriteTapActions;
        }
        List list4 = list2;
        if ((i12 & 8) != 0) {
            displayingPredicate = beduinGridSnippetModel.displayingPredicate;
        }
        DisplayingPredicate displayingPredicate2 = displayingPredicate;
        if ((i12 & 16) != 0) {
            constructorAdvertNetworkModel = beduinGridSnippetModel.snippet;
        }
        ConstructorAdvertNetworkModel constructorAdvertNetworkModel2 = constructorAdvertNetworkModel;
        if ((i12 & 32) != 0) {
            z12 = beduinGridSnippetModel.isViewed;
        }
        return beduinGridSnippetModel.copy(str, list3, list4, displayingPredicate2, constructorAdvertNetworkModel2, z12);
    }

    @Override // com.avito.android.beduin.common.component.LeafBeduinModel, com.avito.android.beduin_models.BeduinModel
    @k
    public BeduinModel apply(@k BeduinModelTransform transform) {
        SerpBadgeBar serpBadgeBar;
        if (transform instanceof IsFavoriteTransform) {
            IsFavoriteTransform isFavoriteTransform = (IsFavoriteTransform) transform;
            if (this.snippet.getIsFavorite() != isFavoriteTransform.isFavorite()) {
                ConstructorAdvertNetworkModel constructorAdvertNetworkModel = this.snippet;
                boolean zIsFavorite = isFavoriteTransform.isFavorite();
                String id2 = constructorAdvertNetworkModel.getId();
                String title = constructorAdvertNetworkModel.getTitle();
                PriceNetworkModel price = constructorAdvertNetworkModel.getPrice();
                DeepLink deepLink = constructorAdvertNetworkModel.getDeepLink();
                List<DimmedImage> imageList = constructorAdvertNetworkModel.getImageList();
                List listM0 = imageList != null ? C42745f0.M0(imageList) : null;
                List<ConstructorAdvertGalleryItemModel> galleryItems = constructorAdvertNetworkModel.getGalleryItems();
                List listM02 = galleryItems != null ? C42745f0.M0(galleryItems) : null;
                boolean isDelivery = constructorAdvertNetworkModel.getIsDelivery();
                Boolean reserved = constructorAdvertNetworkModel.getReserved();
                SerpBadgeBar badgeBar = constructorAdvertNetworkModel.getBadgeBar();
                if (badgeBar != null) {
                    List<SerpBadge> badges = badgeBar.getBadges();
                    if (badges == null) {
                        badges = C42784z0.f406748b;
                    }
                    serpBadgeBar = new SerpBadgeBar(C42745f0.M0(badges));
                } else {
                    serpBadgeBar = null;
                }
                BadgeSticker badgeSticker = constructorAdvertNetworkModel.getBadgeSticker();
                List<BeduinModel> freeForm = constructorAdvertNetworkModel.getFreeForm();
                return copy$default(this, null, null, null, null, new ConstructorAdvertNetworkModel(id2, title, price, zIsFavorite, deepLink, listM0, null, listM02, isDelivery, reserved, null, null, serpBadgeBar, badgeSticker, freeForm != null ? C42745f0.M0(freeForm) : null, constructorAdvertNetworkModel.getSize(), null, constructorAdvertNetworkModel.getHasVideo(), constructorAdvertNetworkModel.getHasRealtyLayout(), constructorAdvertNetworkModel.getIsRedesign(), constructorAdvertNetworkModel.getIsStrRedesign(), null, null, null, constructorAdvertNetworkModel.getSellerInfo(), null, constructorAdvertNetworkModel.getCvViewed(), constructorAdvertNetworkModel.getIsCvHidden(), null, null, null, null, -220132288, null), false, 47, null);
            }
        }
        if (transform instanceof IsViewedTransform) {
            IsViewedTransform isViewedTransform = (IsViewedTransform) transform;
            if (isViewed() != isViewedTransform.isViewed()) {
                return copy$default(this, null, null, null, null, null, isViewedTransform.isViewed(), 31, null);
            }
        }
        return transform instanceof DisplayPredicateTransform ? copy$default(this, null, null, null, ((DisplayPredicateTransform) transform).getDisplayingPredicate(), null, false, 55, null) : super.apply(transform);
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    public final List<BeduinAction> component2() {
        return this.onTapActions;
    }

    @l
    public final List<BeduinAction> component3() {
        return this.onFavoriteTapActions;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final DisplayingPredicate getDisplayingPredicate() {
        return this.displayingPredicate;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final ConstructorAdvertNetworkModel getSnippet() {
        return this.snippet;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsViewed() {
        return this.isViewed;
    }

    @k
    public final BeduinGridSnippetModel copy(@k String id2, @l List<? extends BeduinAction> onTapActions, @l List<? extends BeduinAction> onFavoriteTapActions, @l DisplayingPredicate displayingPredicate, @k ConstructorAdvertNetworkModel snippet, boolean isViewed) {
        return new BeduinGridSnippetModel(id2, onTapActions, onFavoriteTapActions, displayingPredicate, snippet, isViewed);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BeduinGridSnippetModel)) {
            return false;
        }
        BeduinGridSnippetModel beduinGridSnippetModel = (BeduinGridSnippetModel) other;
        return L.f(this.id, beduinGridSnippetModel.id) && L.f(this.onTapActions, beduinGridSnippetModel.onTapActions) && L.f(this.onFavoriteTapActions, beduinGridSnippetModel.onFavoriteTapActions) && L.f(this.displayingPredicate, beduinGridSnippetModel.displayingPredicate) && L.f(this.snippet, beduinGridSnippetModel.snippet) && this.isViewed == beduinGridSnippetModel.isViewed;
    }

    @Override // cj.InterfaceC27206d
    @l
    public String getAdvertId() {
        return this.snippet.getId();
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @l
    /* renamed from: getDisplayingPredicate */
    public DisplayingPredicate getF100854c() {
        return this.displayingPredicate;
    }

    @Override // com.avito.android.beduin_models.BeduinModel
    @k
    /* renamed from: getId */
    public String getF100853b() {
        return this.id;
    }

    @l
    public final List<BeduinAction> getOnFavoriteTapActions() {
        return this.onFavoriteTapActions;
    }

    @l
    public final List<BeduinAction> getOnTapActions() {
        return this.onTapActions;
    }

    @k
    public final ConstructorAdvertNetworkModel getSnippet() {
        return this.snippet;
    }

    public int hashCode() {
        int iHashCode = this.id.hashCode() * 31;
        List<BeduinAction> list = this.onTapActions;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        List<BeduinAction> list2 = this.onFavoriteTapActions;
        int iHashCode3 = (iHashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
        DisplayingPredicate displayingPredicate = this.displayingPredicate;
        return Boolean.hashCode(this.isViewed) + ((this.snippet.hashCode() + ((iHashCode3 + (displayingPredicate != null ? displayingPredicate.hashCode() : 0)) * 31)) * 31);
    }

    @Override // cj.InterfaceC27206d
    /* renamed from: isFavorite */
    public boolean getIsFavorite() {
        return this.snippet.getIsFavorite();
    }

    @Override // cj.InterfaceC27203a
    public boolean isViewed() {
        return this.isViewed;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("BeduinGridSnippetModel(id=");
        sb2.append(this.id);
        sb2.append(", onTapActions=");
        sb2.append(this.onTapActions);
        sb2.append(", onFavoriteTapActions=");
        sb2.append(this.onFavoriteTapActions);
        sb2.append(", displayingPredicate=");
        sb2.append(this.displayingPredicate);
        sb2.append(", snippet=");
        sb2.append(this.snippet);
        sb2.append(", isViewed=");
        return r.x(sb2, this.isViewed, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        List<BeduinAction> list = this.onTapActions;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<BeduinAction> list2 = this.onFavoriteTapActions;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeParcelable(this.displayingPredicate, flags);
        parcel.writeParcelable(this.snippet, flags);
        parcel.writeInt(this.isViewed ? 1 : 0);
    }
}
