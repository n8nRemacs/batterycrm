package com.avito.android.serp.adapter.advert_xl;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.collection.C20199a;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.avito.android.async_phone.AsyncPhoneItem;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.Action;
import com.avito.android.remote.model.AdvertAction;
import com.avito.android.remote.model.AdvertActions;
import com.avito.android.remote.model.AdvertComparison;
import com.avito.android.remote.model.AdvertSellerInfo;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.DiscountIcon;
import com.avito.android.remote.model.FavoritesToast;
import com.avito.android.remote.model.GeoDistance;
import com.avito.android.remote.model.GeoReference;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.KeyAttributes;
import com.avito.android.remote.model.QuorumFilterInfo;
import com.avito.android.remote.model.RadiusInfo;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.UniversalColor;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.buyer_bonuses.BuyerBonuses;
import com.avito.android.remote.model.price_list.PriceList;
import com.avito.android.remote.model.realtor_bonus.RealtorBonus;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.remote.model.serp.SerpAdvertSpecification;
import com.avito.android.remote.model.snippet_type.SnippetType;
import com.avito.android.serp.adapter.C34734g0;
import com.avito.android.serp.adapter.InAppCallsAwareItem;
import com.avito.android.serp.adapter.M;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.Q;
import com.avito.android.serp.adapter.S;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.badge.PriceTypeBadge;
import com.avito.android.serp.adapter.m1;
import com.avito.android.util.H3;
import com.avito.android.util.I3;
import com.avito.android.util.J3;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import ru.avito.component.serp.DeliveryTerms;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: AdvertXlItem.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u00062\u00020\u0007:\u0001\b¨\u0006\t"}, d2 = {"Lcom/avito/android/serp/adapter/advert_xl/AdvertXlItem;", "Lcom/avito/android/async_phone/AsyncPhoneItem;", "Lcom/avito/android/serp/adapter/S;", "Lcom/avito/android/serp/adapter/M;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "Lcom/avito/android/serp/adapter/m1;", "Lcom/avito/android/serp/adapter/Q;", "Lcom/avito/android/serp/adapter/InAppCallsAwareItem;", "b", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@InterfaceC42830m
/* loaded from: classes3.dex */
public final /* data */ class AdvertXlItem implements AsyncPhoneItem, S, M, PersistableSerpItem, m1, Q, InAppCallsAwareItem {

    @X41.f
    @Y61.k
    public static final Parcelable.Creator<AdvertXlItem> CREATOR;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final DeepLink f268748A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.l
    public final Map<String, String> f268749B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.l
    public final Action f268750C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final Action f268751D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final AdvertActions f268752E;

    /* renamed from: F, reason: collision with root package name */
    public final boolean f268753F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final UniversalColor f268754G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final String f268755H;

    /* renamed from: I, reason: collision with root package name */
    public final boolean f268756I;

    /* renamed from: J, reason: collision with root package name */
    public final boolean f268757J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.l
    public final String f268758K;

    /* renamed from: L, reason: collision with root package name */
    @Y61.l
    public final Action f268759L;

    /* renamed from: M, reason: collision with root package name */
    public boolean f268760M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final PriceTypeBadge f268761N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public final SerpBadgeBar f268762O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public final RadiusInfo f268763P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public final AdvertSellerInfo f268764Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public final List<GeoReference> f268765R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public final QuorumFilterInfo f268766S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public final String f268767T;

    /* renamed from: U, reason: collision with root package name */
    public final boolean f268768U;

    /* renamed from: V, reason: collision with root package name */
    public final boolean f268769V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public final String f268770W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public final List<String> f268771X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public final AdvertisementVerticalAlias f268772Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.l
    public final FavoritesToast f268773Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.l
    public final String f268774a0;

    /* renamed from: b, reason: collision with root package name */
    public final long f268775b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.l
    public final String f268776b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final String f268777c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.l
    public final Image f268778c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final List<DimmedImage> f268779d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.l
    public final SerpAdvertSpecification f268780d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final List<ConstructorAdvertGalleryItemModel> f268781e;

    /* renamed from: e0, reason: collision with root package name */
    public final boolean f268782e0;

    /* renamed from: f, reason: collision with root package name */
    public boolean f268783f;

    /* renamed from: f0, reason: collision with root package name */
    public final boolean f268784f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final String f268785g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.l
    public final RealtorBonus f268786g0;

    /* renamed from: h, reason: collision with root package name */
    public final int f268787h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.l
    public final BadgeSticker f268788h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public SerpDisplayType f268789i;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.l
    public final SnippetType f268790i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final AdvertComparison f268791j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.l
    public final KeyAttributes f268792j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final String f268793k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.l
    public final BuyerBonuses f268794k0;

    /* renamed from: l, reason: collision with root package name */
    @Y61.l
    public final String f268795l;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public final String f268796l0;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f268797m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public final GeoDistance f268798m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final DeliveryTerms f268799n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final SerpViewType f268800n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public final String f268801o;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public PhoneLoadingState f268802o0;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final String f268803p;

    /* renamed from: p0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f268804p0;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final String f268805q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final String f268806r;

    /* renamed from: s, reason: collision with root package name */
    public final long f268807s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final String f268808t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final String f268809u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final String f268810v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final String f268811w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.l
    public final String f268812x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.l
    public final DiscountIcon f268813y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.l
    public final PriceList f268814z;

    /* compiled from: AdvertXlItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "Lcom/avito/android/serp/adapter/advert_xl/AdvertXlItem;", "Landroid/os/Parcel;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a extends N implements Y41.l<Parcel, AdvertXlItem> {

        /* renamed from: l, reason: collision with root package name */
        public static final a f268815l = new a();

        public a() {
            super(1);
        }

        @Override // Y41.l
        public final AdvertXlItem invoke(Parcel parcel) {
            String str;
            String str2;
            boolean z12;
            C20199a c20199a;
            Parcel parcel2 = parcel;
            long j12 = parcel2.readLong();
            String string = parcel2.readString();
            List listA = J3.a(parcel2, DimmedImage.class.getClassLoader());
            List listA2 = J3.a(parcel2, ConstructorAdvertGalleryItemModel.class.getClassLoader());
            boolean zC2 = J3.c(parcel2);
            String string2 = parcel2.readString();
            int i12 = parcel2.readInt();
            SerpDisplayType serpDisplayType = SerpDisplayType.values()[parcel2.readInt()];
            Object value = parcel2.readValue(AdvertComparison.class.getClassLoader());
            if (!(value instanceof AdvertComparison)) {
                value = null;
            }
            AdvertComparison advertComparison = (AdvertComparison) value;
            String string3 = parcel2.readString();
            String string4 = parcel2.readString();
            boolean zC3 = J3.c(parcel2);
            DeliveryTerms deliveryTerms = (DeliveryTerms) parcel2.readParcelable(DeliveryTerms.class.getClassLoader());
            String string5 = parcel2.readString();
            String string6 = parcel2.readString();
            String string7 = parcel2.readString();
            String string8 = parcel2.readString();
            long j13 = parcel2.readLong();
            String string9 = parcel2.readString();
            String string10 = parcel2.readString();
            String string11 = parcel2.readString();
            String string12 = parcel2.readString();
            String string13 = parcel2.readString();
            DiscountIcon discountIcon = (DiscountIcon) parcel2.readParcelable(DiscountIcon.class.getClassLoader());
            PriceList priceList = (PriceList) parcel2.readParcelable(PriceList.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel2.readParcelable(DeepLink.class.getClassLoader());
            int i13 = parcel2.readInt();
            if (i13 < 0) {
                str = string3;
                str2 = string4;
                z12 = zC3;
                c20199a = null;
            } else {
                C20199a c20199a2 = new C20199a(i13);
                while (i13 > 0) {
                    boolean z13 = zC3;
                    Object value2 = parcel2.readValue(String.class.getClassLoader());
                    String str3 = string4;
                    if (value2 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    String str4 = (String) value2;
                    String str5 = string3;
                    Object value3 = parcel2.readValue(String.class.getClassLoader());
                    if (value3 == null) {
                        throw new NullPointerException("null cannot be cast to non-null type kotlin.String");
                    }
                    c20199a2.put(str4, (String) value3);
                    i13--;
                    zC3 = z13;
                    string4 = str3;
                    string3 = str5;
                }
                str = string3;
                str2 = string4;
                z12 = zC3;
                c20199a = c20199a2;
            }
            Object value4 = parcel2.readValue(Action.class.getClassLoader());
            if (!(value4 instanceof Action)) {
                value4 = null;
            }
            Action action = (Action) value4;
            Object value5 = parcel2.readValue(Action.class.getClassLoader());
            if (!(value5 instanceof Action)) {
                value5 = null;
            }
            Action action2 = (Action) value5;
            Object value6 = parcel2.readValue(AdvertActions.class.getClassLoader());
            if (!(value6 instanceof AdvertActions)) {
                value6 = null;
            }
            AdvertActions advertActions = (AdvertActions) value6;
            boolean zC4 = J3.c(parcel2);
            String string14 = parcel2.readString();
            UniversalColor universalColor = (UniversalColor) parcel2.readParcelable(UniversalColor.class.getClassLoader());
            boolean zC5 = J3.c(parcel2);
            boolean zC6 = J3.c(parcel2);
            String string15 = parcel2.readString();
            Object value7 = parcel2.readValue(Action.class.getClassLoader());
            if (!(value7 instanceof Action)) {
                value7 = null;
            }
            Action action3 = (Action) value7;
            boolean zC7 = J3.c(parcel2);
            PriceTypeBadge priceTypeBadge = (PriceTypeBadge) parcel2.readParcelable(PriceTypeBadge.class.getClassLoader());
            SerpBadgeBar serpBadgeBar = (SerpBadgeBar) parcel2.readParcelable(SerpBadgeBar.class.getClassLoader());
            RadiusInfo radiusInfo = (RadiusInfo) parcel2.readParcelable(RadiusInfo.class.getClassLoader());
            AdvertSellerInfo advertSellerInfo = (AdvertSellerInfo) parcel2.readParcelable(AdvertSellerInfo.class.getClassLoader());
            List listA3 = J3.a(parcel2, GeoReference.class.getClassLoader());
            QuorumFilterInfo quorumFilterInfo = (QuorumFilterInfo) parcel2.readParcelable(QuorumFilterInfo.class.getClassLoader());
            String string16 = parcel2.readString();
            boolean zC8 = J3.c(parcel2);
            boolean zC9 = J3.c(parcel2);
            String string17 = parcel2.readString();
            AdvertisementVerticalAlias[] advertisementVerticalAliasArrValues = AdvertisementVerticalAlias.values();
            int i14 = parcel2.readInt();
            AdvertisementVerticalAlias advertisementVerticalAlias = i14 == -1 ? null : advertisementVerticalAliasArrValues[i14];
            AdvertXlItem advertXlItem = new AdvertXlItem(j12, string, listA, listA2, zC2, string2, i12, serpDisplayType, advertComparison, str, str2, z12, deliveryTerms, string5, string6, string7, string8, j13, string9, string10, string11, string12, string13, discountIcon, priceList, deepLink, c20199a, action, action2, advertActions, zC4, universalColor, string14, zC5, zC6, string15, action3, zC7, priceTypeBadge, serpBadgeBar, radiusInfo, advertSellerInfo, listA3, quorumFilterInfo, string16, zC8, zC9, string17, null, advertisementVerticalAlias, null, null, parcel2.readString(), (Image) parcel2.readParcelable(Image.class.getClassLoader()), (SerpAdvertSpecification) parcel2.readParcelable(SerpAdvertSpecification.class.getClassLoader()), J3.c(parcel2), J3.c(parcel2), (RealtorBonus) parcel2.readParcelable(RealtorBonus.class.getClassLoader()), (BadgeSticker) parcel2.readParcelable(BadgeSticker.class.getClassLoader()), (SnippetType) parcel2.readParcelable(SnippetType.class.getClassLoader()), (KeyAttributes) parcel2.readParcelable(KeyAttributes.class.getClassLoader()), (BuyerBonuses) parcel2.readParcelable(BuyerBonuses.class.getClassLoader()), parcel2.readString(), (GeoDistance) parcel2.readParcelable(GeoDistance.class.getClassLoader()), 0, 851968, null);
            advertXlItem.f268802o0 = PhoneLoadingState.values()[parcel2.readInt()];
            return advertXlItem;
        }
    }

    /* compiled from: AdvertXlItem.kt */
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lcom/avito/android/serp/adapter/advert_xl/AdvertXlItem$b;", "", "<init>", "()V", "Landroid/os/Parcelable$Creator;", "Lcom/avito/android/serp/adapter/advert_xl/AdvertXlItem;", "CREATOR", "Landroid/os/Parcelable$Creator;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {
        public /* synthetic */ b(C42822w c42822w) {
            this();
        }

        public b() {
        }
    }

    /* compiled from: AdvertXlItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/g0;", "invoke", "()Lcom/avito/android/serp/adapter/g0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<C34734g0> {
        public c() {
            super(0);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Type inference failed for: r3v5 */
        /* JADX WARN: Type inference failed for: r3v6 */
        /* JADX WARN: Type inference failed for: r3v7, types: [java.lang.Object] */
        @Override // Y41.a
        public final C34734g0 invoke() {
            List<AdvertAction> actions;
            ?? next;
            DimmedImage dimmedImage;
            AdvertXlItem advertXlItem = AdvertXlItem.this;
            AdvertSellerInfo advertSellerInfo = advertXlItem.f268764Q;
            String userKey = advertSellerInfo != null ? advertSellerInfo.getUserKey() : null;
            AdvertSellerInfo advertSellerInfo2 = advertXlItem.f268764Q;
            String name = advertSellerInfo2 != null ? advertSellerInfo2.getName() : null;
            if (name == null) {
                name = "";
            }
            String str = name;
            Image image = advertSellerInfo2 != null ? advertSellerInfo2.getImage() : null;
            List<DimmedImage> list = advertXlItem.f268779d;
            Image image2 = (list == null || (dimmedImage = (DimmedImage) C42745f0.G(list)) == null) ? null : dimmedImage.getImage();
            AdvertActions advertActions = advertXlItem.f268752E;
            if (advertActions != null && (actions = advertActions.getActions()) != null) {
                Iterator it = actions.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = 0;
                        break;
                    }
                    next = it.next();
                    if (next != 0 ? next instanceof AdvertAction.Messenger : true) {
                        break;
                    }
                }
                messenger = next instanceof AdvertAction.Messenger ? next : null;
            }
            return new C34734g0(userKey, str, image, advertXlItem.f268777c, advertXlItem.f268776b0, advertXlItem.f268793k, advertXlItem.f268808t, image2, messenger);
        }
    }

    static {
        new b(null);
        a aVar = a.f268815l;
        int i12 = I3.f318630a;
        CREATOR = new H3(aVar);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public AdvertXlItem(long j12, @Y61.k String str, @Y61.l List<DimmedImage> list, @Y61.l List<? extends ConstructorAdvertGalleryItemModel> list2, boolean z12, @Y61.l String str2, int i12, @Y61.k SerpDisplayType serpDisplayType, @Y61.l AdvertComparison advertComparison, @Y61.k String str3, @Y61.l String str4, boolean z13, @Y61.l DeliveryTerms deliveryTerms, @Y61.l String str5, @Y61.l String str6, @Y61.l String str7, @Y61.l String str8, long j13, @Y61.l String str9, @Y61.l String str10, @Y61.l String str11, @Y61.l String str12, @Y61.l String str13, @Y61.l DiscountIcon discountIcon, @Y61.l PriceList priceList, @Y61.k DeepLink deepLink, @Y61.l Map<String, String> map, @Y61.l Action action, @Y61.l Action action2, @Y61.l AdvertActions advertActions, boolean z14, @Y61.l UniversalColor universalColor, @Y61.l String str14, boolean z15, boolean z16, @Y61.l String str15, @Y61.l Action action3, boolean z17, @Y61.l PriceTypeBadge priceTypeBadge, @Y61.l SerpBadgeBar serpBadgeBar, @Y61.l RadiusInfo radiusInfo, @Y61.l AdvertSellerInfo advertSellerInfo, @Y61.l List<GeoReference> list3, @Y61.l QuorumFilterInfo quorumFilterInfo, @Y61.l String str16, boolean z18, boolean z19, @Y61.l String str17, @Y61.l List<String> list4, @Y61.l AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l FavoritesToast favoritesToast, @Y61.l String str18, @Y61.l String str19, @Y61.l Image image, @Y61.l SerpAdvertSpecification serpAdvertSpecification, boolean z22, boolean z23, @Y61.l RealtorBonus realtorBonus, @Y61.l BadgeSticker badgeSticker, @Y61.l SnippetType snippetType, @Y61.l KeyAttributes keyAttributes, @Y61.l BuyerBonuses buyerBonuses, @Y61.l String str20, @Y61.l GeoDistance geoDistance) {
        this.f268775b = j12;
        this.f268777c = str;
        this.f268779d = list;
        this.f268781e = list2;
        this.f268783f = z12;
        this.f268785g = str2;
        this.f268787h = i12;
        this.f268789i = serpDisplayType;
        this.f268791j = advertComparison;
        this.f268793k = str3;
        this.f268795l = str4;
        this.f268797m = z13;
        this.f268799n = deliveryTerms;
        this.f268801o = str5;
        this.f268803p = str6;
        this.f268805q = str7;
        this.f268806r = str8;
        this.f268807s = j13;
        this.f268808t = str9;
        this.f268809u = str10;
        this.f268810v = str11;
        this.f268811w = str12;
        this.f268812x = str13;
        this.f268813y = discountIcon;
        this.f268814z = priceList;
        this.f268748A = deepLink;
        this.f268749B = map;
        this.f268750C = action;
        this.f268751D = action2;
        this.f268752E = advertActions;
        this.f268753F = z14;
        this.f268754G = universalColor;
        this.f268755H = str14;
        this.f268756I = z15;
        this.f268757J = z16;
        this.f268758K = str15;
        this.f268759L = action3;
        this.f268760M = z17;
        this.f268761N = priceTypeBadge;
        this.f268762O = serpBadgeBar;
        this.f268763P = radiusInfo;
        this.f268764Q = advertSellerInfo;
        this.f268765R = list3;
        this.f268766S = quorumFilterInfo;
        this.f268767T = str16;
        this.f268768U = z18;
        this.f268769V = z19;
        this.f268770W = str17;
        this.f268771X = list4;
        this.f268772Y = advertisementVerticalAlias;
        this.f268773Z = favoritesToast;
        this.f268774a0 = str18;
        this.f268776b0 = str19;
        this.f268778c0 = image;
        this.f268780d0 = serpAdvertSpecification;
        this.f268782e0 = z22;
        this.f268784f0 = z23;
        this.f268786g0 = realtorBonus;
        this.f268788h0 = badgeSticker;
        this.f268790i0 = snippetType;
        this.f268792j0 = keyAttributes;
        this.f268794k0 = buyerBonuses;
        this.f268796l0 = str20;
        this.f268798m0 = geoDistance;
        this.f268800n0 = SerpViewType.f268584d;
        this.f268802o0 = PhoneLoadingState.f430441b;
        this.f268804p0 = C42727D.c(new c());
    }

    public static AdvertXlItem b(AdvertXlItem advertXlItem, int i12) {
        return new AdvertXlItem(advertXlItem.f268775b, advertXlItem.f268777c, advertXlItem.f268779d, advertXlItem.f268781e, advertXlItem.f268783f, advertXlItem.f268785g, advertXlItem.f268787h, advertXlItem.f268789i, advertXlItem.f268791j, advertXlItem.f268793k, advertXlItem.f268795l, advertXlItem.f268797m, advertXlItem.f268799n, advertXlItem.f268801o, advertXlItem.f268803p, advertXlItem.f268805q, advertXlItem.f268806r, advertXlItem.f268807s, advertXlItem.f268808t, advertXlItem.f268809u, advertXlItem.f268810v, advertXlItem.f268811w, advertXlItem.f268812x, advertXlItem.f268813y, advertXlItem.f268814z, advertXlItem.f268748A, advertXlItem.f268749B, advertXlItem.f268750C, advertXlItem.f268751D, advertXlItem.f268752E, advertXlItem.f268753F, advertXlItem.f268754G, advertXlItem.f268755H, advertXlItem.f268756I, advertXlItem.f268757J, advertXlItem.f268758K, advertXlItem.f268759L, (i12 & 32) != 0 ? advertXlItem.f268760M : true, advertXlItem.f268761N, advertXlItem.f268762O, advertXlItem.f268763P, advertXlItem.f268764Q, advertXlItem.f268765R, advertXlItem.f268766S, advertXlItem.f268767T, advertXlItem.f268768U, advertXlItem.f268769V, advertXlItem.f268770W, advertXlItem.f268771X, advertXlItem.f268772Y, advertXlItem.f268773Z, advertXlItem.f268774a0, advertXlItem.f268776b0, advertXlItem.f268778c0, advertXlItem.f268780d0, advertXlItem.f268782e0, advertXlItem.f268784f0, advertXlItem.f268786g0, advertXlItem.f268788h0, advertXlItem.f268790i0, advertXlItem.f268792j0, advertXlItem.f268794k0, advertXlItem.f268796l0, advertXlItem.f268798m0);
    }

    @Override // com.avito.android.serp.adapter.Q
    public final void a(@Y61.k SerpDisplayType serpDisplayType) {
        this.f268789i = serpDisplayType;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof AdvertXlItem)) {
            return false;
        }
        AdvertXlItem advertXlItem = (AdvertXlItem) obj;
        return this.f268775b == advertXlItem.f268775b && L.f(this.f268777c, advertXlItem.f268777c) && L.f(this.f268779d, advertXlItem.f268779d) && L.f(this.f268781e, advertXlItem.f268781e) && this.f268783f == advertXlItem.f268783f && L.f(this.f268785g, advertXlItem.f268785g) && this.f268787h == advertXlItem.f268787h && this.f268789i == advertXlItem.f268789i && L.f(this.f268791j, advertXlItem.f268791j) && L.f(this.f268793k, advertXlItem.f268793k) && L.f(this.f268795l, advertXlItem.f268795l) && this.f268797m == advertXlItem.f268797m && L.f(this.f268799n, advertXlItem.f268799n) && L.f(this.f268801o, advertXlItem.f268801o) && L.f(this.f268803p, advertXlItem.f268803p) && L.f(this.f268805q, advertXlItem.f268805q) && L.f(this.f268806r, advertXlItem.f268806r) && this.f268807s == advertXlItem.f268807s && L.f(this.f268808t, advertXlItem.f268808t) && L.f(this.f268809u, advertXlItem.f268809u) && L.f(this.f268810v, advertXlItem.f268810v) && L.f(this.f268811w, advertXlItem.f268811w) && L.f(this.f268812x, advertXlItem.f268812x) && L.f(this.f268813y, advertXlItem.f268813y) && L.f(this.f268814z, advertXlItem.f268814z) && L.f(this.f268748A, advertXlItem.f268748A) && L.f(this.f268749B, advertXlItem.f268749B) && L.f(this.f268750C, advertXlItem.f268750C) && L.f(this.f268751D, advertXlItem.f268751D) && L.f(this.f268752E, advertXlItem.f268752E) && this.f268753F == advertXlItem.f268753F && L.f(this.f268754G, advertXlItem.f268754G) && L.f(this.f268755H, advertXlItem.f268755H) && this.f268756I == advertXlItem.f268756I && this.f268757J == advertXlItem.f268757J && L.f(this.f268758K, advertXlItem.f268758K) && L.f(this.f268759L, advertXlItem.f268759L) && this.f268760M == advertXlItem.f268760M && L.f(this.f268761N, advertXlItem.f268761N) && L.f(this.f268762O, advertXlItem.f268762O) && L.f(this.f268763P, advertXlItem.f268763P) && L.f(this.f268764Q, advertXlItem.f268764Q) && L.f(this.f268765R, advertXlItem.f268765R) && L.f(this.f268766S, advertXlItem.f268766S) && L.f(this.f268767T, advertXlItem.f268767T) && this.f268768U == advertXlItem.f268768U && this.f268769V == advertXlItem.f268769V && L.f(this.f268770W, advertXlItem.f268770W) && L.f(this.f268771X, advertXlItem.f268771X) && this.f268772Y == advertXlItem.f268772Y && L.f(this.f268773Z, advertXlItem.f268773Z) && L.f(this.f268774a0, advertXlItem.f268774a0) && L.f(this.f268776b0, advertXlItem.f268776b0) && L.f(this.f268778c0, advertXlItem.f268778c0) && L.f(this.f268780d0, advertXlItem.f268780d0) && this.f268782e0 == advertXlItem.f268782e0 && this.f268784f0 == advertXlItem.f268784f0 && L.f(this.f268786g0, advertXlItem.f268786g0) && L.f(this.f268788h0, advertXlItem.f268788h0) && this.f268790i0 == advertXlItem.f268790i0 && L.f(this.f268792j0, advertXlItem.f268792j0) && L.f(this.f268794k0, advertXlItem.f268794k0) && L.f(this.f268796l0, advertXlItem.f268796l0) && L.f(this.f268798m0, advertXlItem.f268798m0);
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getAnalyticsContext, reason: from getter */
    public final String getF109521b() {
        return this.f268785g;
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getFavoritesToast, reason: from getter */
    public final FavoritesToast getF107480p() {
        return this.f268773Z;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public final boolean getF272887i() {
        return false;
    }

    @Override // TV0.a
    /* renamed from: getId, reason: from getter */
    public final long getF74796b() {
        return this.f268775b;
    }

    @Override // com.avito.android.serp.adapter.InAppCallsAwareItem
    @Y61.k
    public final C34734g0 getInAppCallsAwareItemData() {
        return (C34734g0) this.f268804p0.getValue();
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    @Y61.k
    /* renamed from: getPhoneLoadingState, reason: from getter */
    public final PhoneLoadingState getF255559h() {
        return this.f268802o0;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount, reason: from getter */
    public final int getF74798d() {
        return this.f268787h;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF265059b() {
        return this.f268777c;
    }

    @Override // com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getVerticalAlias, reason: from getter */
    public final AdvertisementVerticalAlias getF109522c() {
        return this.f268772Y;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public final SerpViewType getF78594d() {
        return this.f268800n0;
    }

    public final int hashCode() {
        int iD2 = H.d(Long.hashCode(this.f268775b) * 31, 31, this.f268777c);
        List<DimmedImage> list = this.f268779d;
        int iHashCode = (iD2 + (list == null ? 0 : list.hashCode())) * 31;
        List<ConstructorAdvertGalleryItemModel> list2 = this.f268781e;
        int i12 = androidx.appcompat.app.r.i((iHashCode + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.f268783f);
        String str = this.f268785g;
        int iH2 = com.avito.android.actions_sheet.a.h(this.f268789i, androidx.appcompat.app.r.e(this.f268787h, (i12 + (str == null ? 0 : str.hashCode())) * 31, 31), 31);
        AdvertComparison advertComparison = this.f268791j;
        int iD3 = H.d((iH2 + (advertComparison == null ? 0 : advertComparison.hashCode())) * 31, 31, this.f268793k);
        String str2 = this.f268795l;
        int i13 = androidx.appcompat.app.r.i((iD3 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f268797m);
        DeliveryTerms deliveryTerms = this.f268799n;
        int iHashCode2 = (i13 + (deliveryTerms == null ? 0 : deliveryTerms.hashCode())) * 31;
        String str3 = this.f268801o;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.f268803p;
        int iHashCode4 = (iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f268805q;
        int iHashCode5 = (iHashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.f268806r;
        int iG2 = androidx.appcompat.app.r.g((iHashCode5 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.f268807s);
        String str7 = this.f268808t;
        int iHashCode6 = (iG2 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f268809u;
        int iHashCode7 = (iHashCode6 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.f268810v;
        int iHashCode8 = (iHashCode7 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.f268811w;
        int iHashCode9 = (iHashCode8 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.f268812x;
        int iHashCode10 = (iHashCode9 + (str11 == null ? 0 : str11.hashCode())) * 31;
        DiscountIcon discountIcon = this.f268813y;
        int iHashCode11 = (iHashCode10 + (discountIcon == null ? 0 : discountIcon.hashCode())) * 31;
        PriceList priceList = this.f268814z;
        int iE2 = com.avito.android.actions_sheet.a.e(this.f268748A, (iHashCode11 + (priceList == null ? 0 : priceList.hashCode())) * 31, 31);
        Map<String, String> map = this.f268749B;
        int iHashCode12 = (iE2 + (map == null ? 0 : map.hashCode())) * 31;
        Action action = this.f268750C;
        int iHashCode13 = (iHashCode12 + (action == null ? 0 : action.hashCode())) * 31;
        Action action2 = this.f268751D;
        int iHashCode14 = (iHashCode13 + (action2 == null ? 0 : action2.hashCode())) * 31;
        AdvertActions advertActions = this.f268752E;
        int i14 = androidx.appcompat.app.r.i((iHashCode14 + (advertActions == null ? 0 : advertActions.hashCode())) * 31, 31, this.f268753F);
        UniversalColor universalColor = this.f268754G;
        int iHashCode15 = (i14 + (universalColor == null ? 0 : universalColor.hashCode())) * 31;
        String str12 = this.f268755H;
        int i15 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode15 + (str12 == null ? 0 : str12.hashCode())) * 31, 31, this.f268756I), 31, this.f268757J);
        String str13 = this.f268758K;
        int iHashCode16 = (i15 + (str13 == null ? 0 : str13.hashCode())) * 31;
        Action action3 = this.f268759L;
        int i16 = androidx.appcompat.app.r.i((iHashCode16 + (action3 == null ? 0 : action3.hashCode())) * 31, 31, this.f268760M);
        PriceTypeBadge priceTypeBadge = this.f268761N;
        int iHashCode17 = (i16 + (priceTypeBadge == null ? 0 : priceTypeBadge.hashCode())) * 31;
        SerpBadgeBar serpBadgeBar = this.f268762O;
        int iHashCode18 = (iHashCode17 + (serpBadgeBar == null ? 0 : serpBadgeBar.hashCode())) * 31;
        RadiusInfo radiusInfo = this.f268763P;
        int iHashCode19 = (iHashCode18 + (radiusInfo == null ? 0 : radiusInfo.hashCode())) * 31;
        AdvertSellerInfo advertSellerInfo = this.f268764Q;
        int iHashCode20 = (iHashCode19 + (advertSellerInfo == null ? 0 : advertSellerInfo.hashCode())) * 31;
        List<GeoReference> list3 = this.f268765R;
        int iHashCode21 = (iHashCode20 + (list3 == null ? 0 : list3.hashCode())) * 31;
        QuorumFilterInfo quorumFilterInfo = this.f268766S;
        int iHashCode22 = (iHashCode21 + (quorumFilterInfo == null ? 0 : quorumFilterInfo.hashCode())) * 31;
        String str14 = this.f268767T;
        int i17 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode22 + (str14 == null ? 0 : str14.hashCode())) * 31, 31, this.f268768U), 31, this.f268769V);
        String str15 = this.f268770W;
        int iHashCode23 = (i17 + (str15 == null ? 0 : str15.hashCode())) * 31;
        List<String> list4 = this.f268771X;
        int iHashCode24 = (iHashCode23 + (list4 == null ? 0 : list4.hashCode())) * 31;
        AdvertisementVerticalAlias advertisementVerticalAlias = this.f268772Y;
        int iHashCode25 = (iHashCode24 + (advertisementVerticalAlias == null ? 0 : advertisementVerticalAlias.hashCode())) * 31;
        FavoritesToast favoritesToast = this.f268773Z;
        int iHashCode26 = (iHashCode25 + (favoritesToast == null ? 0 : favoritesToast.hashCode())) * 31;
        String str16 = this.f268774a0;
        int iHashCode27 = (iHashCode26 + (str16 == null ? 0 : str16.hashCode())) * 31;
        String str17 = this.f268776b0;
        int iHashCode28 = (iHashCode27 + (str17 == null ? 0 : str17.hashCode())) * 31;
        Image image = this.f268778c0;
        int iHashCode29 = (iHashCode28 + (image == null ? 0 : image.hashCode())) * 31;
        SerpAdvertSpecification serpAdvertSpecification = this.f268780d0;
        int i18 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode29 + (serpAdvertSpecification == null ? 0 : serpAdvertSpecification.hashCode())) * 31, 31, this.f268782e0), 31, this.f268784f0);
        RealtorBonus realtorBonus = this.f268786g0;
        int iHashCode30 = (i18 + (realtorBonus == null ? 0 : realtorBonus.hashCode())) * 31;
        BadgeSticker badgeSticker = this.f268788h0;
        int iHashCode31 = (iHashCode30 + (badgeSticker == null ? 0 : badgeSticker.hashCode())) * 31;
        SnippetType snippetType = this.f268790i0;
        int iHashCode32 = (iHashCode31 + (snippetType == null ? 0 : snippetType.hashCode())) * 31;
        KeyAttributes keyAttributes = this.f268792j0;
        int iHashCode33 = (iHashCode32 + (keyAttributes == null ? 0 : keyAttributes.hashCode())) * 31;
        BuyerBonuses buyerBonuses = this.f268794k0;
        int iHashCode34 = (iHashCode33 + (buyerBonuses == null ? 0 : buyerBonuses.hashCode())) * 31;
        String str18 = this.f268796l0;
        int iHashCode35 = (iHashCode34 + (str18 == null ? 0 : str18.hashCode())) * 31;
        GeoDistance geoDistance = this.f268798m0;
        return iHashCode35 + (geoDistance != null ? geoDistance.hashCode() : 0);
    }

    @Override // com.avito.android.serp.adapter.S
    /* renamed from: isFavorite, reason: from getter */
    public final boolean getF107475k() {
        return this.f268783f;
    }

    @Override // com.avito.android.serp.adapter.m1
    /* renamed from: isViewed, reason: from getter */
    public final boolean getF107481q() {
        return this.f268760M;
    }

    @Override // com.avito.android.serp.adapter.S
    public final void setFavorite(boolean z12) {
        this.f268783f = z12;
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    public final void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.f268802o0 = phoneLoadingState;
    }

    @Override // com.avito.android.serp.adapter.m1
    public final void setViewed(boolean z12) {
        this.f268760M = z12;
    }

    @Y61.k
    public final String toString() {
        return "AdvertXlItem(id=" + this.f268775b + ", stringId=" + this.f268777c + ", imageList=" + this.f268779d + ", galleryItems=" + this.f268781e + ", isFavorite=" + this.f268783f + ", analyticsContext=" + this.f268785g + ", spanCount=" + this.f268787h + ", displayType=" + this.f268789i + ", comparison=" + this.f268791j + ", title=" + this.f268793k + ", description=" + this.f268795l + ", hasDelivery=" + this.f268797m + ", deliveryTerms=" + this.f268799n + ", shopName=" + this.f268801o + ", verification=" + this.f268803p + ", location=" + this.f268805q + ", address=" + this.f268806r + ", time=" + this.f268807s + ", price=" + this.f268808t + ", normalizedPrice=" + this.f268809u + ", priceWithoutDiscount=" + this.f268810v + ", previousPrice=" + this.f268811w + ", previousPriceHint=" + this.f268812x + ", discountIcon=" + this.f268813y + ", priceList=" + this.f268814z + ", deepLink=" + this.f268748A + ", analyticParams=" + this.f268749B + ", callAction=" + this.f268750C + ", bookingAction=" + this.f268751D + ", contacts=" + this.f268752E + ", isHighlighted=" + this.f268753F + ", highlightColor=" + this.f268754G + ", schedule=" + this.f268755H + ", isActive=" + this.f268756I + ", isVerifiedSeller=" + this.f268757J + ", additionalName=" + this.f268758K + ", additionalAction=" + this.f268759L + ", isViewed=" + this.f268760M + ", badge=" + this.f268761N + ", badgeBar=" + this.f268762O + ", radiusInfo=" + this.f268763P + ", sellerInfo=" + this.f268764Q + ", geoReferences=" + this.f268765R + ", quorumFilterInfo=" + this.f268766S + ", distance=" + this.f268767T + ", hasRealtyLayout=" + this.f268768U + ", hasVideo=" + this.f268769V + ", nativeVideoABCategory=" + this.f268770W + ", exposureParams=" + this.f268771X + ", verticalAlias=" + this.f268772Y + ", favoritesToast=" + this.f268773Z + ", xHash=" + this.f268774a0 + ", categoryId=" + this.f268776b0 + ", image=" + this.f268778c0 + ", specification=" + this.f268780d0 + ", trackVacanciesSurvey=" + this.f268782e0 + ", hasDiscount=" + this.f268784f0 + ", realtorBonus=" + this.f268786g0 + ", badgeSticker=" + this.f268788h0 + ", snippetType=" + this.f268790i0 + ", keyAttributes=" + this.f268792j0 + ", buyerBonuses=" + this.f268794k0 + ", dateRange=" + this.f268796l0 + ", geoDistance=" + this.f268798m0 + ')';
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(@Y61.k Parcel parcel, int i12) {
        parcel.writeLong(this.f268775b);
        parcel.writeString(this.f268777c);
        J3.e(this.f268779d, parcel, 0);
        J3.e(this.f268781e, parcel, 0);
        parcel.writeInt(this.f268783f ? 1 : 0);
        parcel.writeString(this.f268785g);
        parcel.writeInt(this.f268787h);
        J3.d(parcel, this.f268789i);
        parcel.writeValue(this.f268791j);
        parcel.writeString(this.f268793k);
        parcel.writeString(this.f268795l);
        parcel.writeInt(this.f268797m ? 1 : 0);
        parcel.writeParcelable(this.f268799n, i12);
        parcel.writeString(this.f268801o);
        parcel.writeString(this.f268803p);
        parcel.writeString(this.f268805q);
        parcel.writeString(this.f268806r);
        parcel.writeLong(this.f268807s);
        parcel.writeString(this.f268808t);
        parcel.writeString(this.f268809u);
        parcel.writeString(this.f268810v);
        parcel.writeString(this.f268811w);
        parcel.writeString(this.f268812x);
        parcel.writeParcelable(this.f268813y, i12);
        parcel.writeParcelable(this.f268814z, i12);
        parcel.writeParcelable(this.f268748A, i12);
        J3.f(parcel, this.f268749B);
        parcel.writeValue(this.f268750C);
        parcel.writeValue(this.f268751D);
        parcel.writeValue(this.f268752E);
        parcel.writeInt(this.f268753F ? 1 : 0);
        parcel.writeParcelable(this.f268754G, i12);
        parcel.writeString(this.f268755H);
        parcel.writeInt(this.f268756I ? 1 : 0);
        parcel.writeInt(this.f268757J ? 1 : 0);
        parcel.writeString(this.f268758K);
        parcel.writeValue(this.f268759L);
        parcel.writeInt(this.f268760M ? 1 : 0);
        parcel.writeParcelable(this.f268761N, i12);
        parcel.writeParcelable(this.f268762O, i12);
        parcel.writeParcelable(this.f268763P, i12);
        parcel.writeParcelable(this.f268764Q, i12);
        J3.e(this.f268765R, parcel, i12);
        parcel.writeParcelable(this.f268766S, i12);
        parcel.writeString(this.f268767T);
        parcel.writeInt(this.f268768U ? 1 : 0);
        parcel.writeInt(this.f268769V ? 1 : 0);
        parcel.writeString(this.f268770W);
        AdvertisementVerticalAlias advertisementVerticalAlias = this.f268772Y;
        if (advertisementVerticalAlias == null) {
            parcel.writeInt(-1);
        } else {
            parcel.writeInt(advertisementVerticalAlias.ordinal());
        }
        parcel.writeString(this.f268776b0);
        parcel.writeParcelable(this.f268778c0, i12);
        parcel.writeParcelable(this.f268780d0, i12);
        parcel.writeParcelable(this.f268786g0, i12);
        parcel.writeParcelable(this.f268788h0, i12);
        parcel.writeInt(this.f268782e0 ? 1 : 0);
        parcel.writeInt(this.f268784f0 ? 1 : 0);
        parcel.writeParcelable(this.f268790i0, i12);
        parcel.writeParcelable(this.f268792j0, i12);
        parcel.writeParcelable(this.f268794k0, i12);
        parcel.writeString(this.f268796l0);
        parcel.writeParcelable(this.f268798m0, i12);
        J3.d(parcel, this.f268802o0);
    }

    public /* synthetic */ AdvertXlItem(long j12, String str, List list, List list2, boolean z12, String str2, int i12, SerpDisplayType serpDisplayType, AdvertComparison advertComparison, String str3, String str4, boolean z13, DeliveryTerms deliveryTerms, String str5, String str6, String str7, String str8, long j13, String str9, String str10, String str11, String str12, String str13, DiscountIcon discountIcon, PriceList priceList, DeepLink deepLink, Map map, Action action, Action action2, AdvertActions advertActions, boolean z14, UniversalColor universalColor, String str14, boolean z15, boolean z16, String str15, Action action3, boolean z17, PriceTypeBadge priceTypeBadge, SerpBadgeBar serpBadgeBar, RadiusInfo radiusInfo, AdvertSellerInfo advertSellerInfo, List list3, QuorumFilterInfo quorumFilterInfo, String str16, boolean z18, boolean z19, String str17, List list4, AdvertisementVerticalAlias advertisementVerticalAlias, FavoritesToast favoritesToast, String str18, String str19, Image image, SerpAdvertSpecification serpAdvertSpecification, boolean z22, boolean z23, RealtorBonus realtorBonus, BadgeSticker badgeSticker, SnippetType snippetType, KeyAttributes keyAttributes, BuyerBonuses buyerBonuses, String str20, GeoDistance geoDistance, int i13, int i14, C42822w c42822w) {
        this(j12, str, list, (i13 & 8) != 0 ? null : list2, z12, str2, i12, serpDisplayType, (i13 & 256) != 0 ? null : advertComparison, str3, str4, z13, deliveryTerms, str5, str6, str7, str8, j13, str9, str10, (i13 & 1048576) != 0 ? null : str11, (i13 & 2097152) != 0 ? null : str12, (i13 & 4194304) != 0 ? null : str13, (i13 & 8388608) != 0 ? null : discountIcon, (i13 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : priceList, deepLink, map, action, (i13 & 268435456) != 0 ? null : action2, advertActions, z14, (i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : universalColor, (i14 & 1) != 0 ? null : str14, z15, z16, str15, (i14 & 16) != 0 ? null : action3, (i14 & 32) != 0 ? false : z17, (i14 & 64) != 0 ? null : priceTypeBadge, (i14 & 128) != 0 ? null : serpBadgeBar, (i14 & 256) != 0 ? null : radiusInfo, (i14 & 512) != 0 ? null : advertSellerInfo, (i14 & 1024) != 0 ? null : list3, (i14 & 2048) != 0 ? null : quorumFilterInfo, (i14 & 4096) != 0 ? null : str16, (i14 & 8192) != 0 ? false : z18, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z19, (32768 & i14) != 0 ? null : str17, (65536 & i14) != 0 ? null : list4, (131072 & i14) != 0 ? null : advertisementVerticalAlias, (262144 & i14) != 0 ? null : favoritesToast, (524288 & i14) != 0 ? null : str18, (i14 & 1048576) != 0 ? null : str19, (i14 & 2097152) != 0 ? null : image, (i14 & 4194304) != 0 ? null : serpAdvertSpecification, (i14 & 8388608) != 0 ? false : z22, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z23, (33554432 & i14) != 0 ? null : realtorBonus, (67108864 & i14) != 0 ? null : badgeSticker, (134217728 & i14) != 0 ? null : snippetType, (i14 & 268435456) != 0 ? null : keyAttributes, (536870912 & i14) != 0 ? null : buyerBonuses, (1073741824 & i14) != 0 ? null : str20, (i14 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : geoDistance);
    }
}
