package I3;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.R;
import com.avito.android.active_orders.adapter.HomeActiveOrdersItem;
import com.avito.android.active_orders.adapter.HomeActiveOrdersItemImpl;
import com.avito.android.active_orders.adapter.stub.HomeActiveOrdersStubItem;
import com.avito.android.active_orders_common.items.all_orders.AllOrdersItemImpl;
import com.avito.android.active_orders_common.items.all_orders.Icon;
import com.avito.android.active_orders_common.items.comfortable_deal.BannerPayload;
import com.avito.android.active_orders_common.items.comfortable_deal.ComfortableDealOrderItemImpl;
import com.avito.android.active_orders_common.items.order.OrderItemImpl;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.safedeal.BxActiveOrderItem;
import com.avito.android.remote.model.safedeal.BxActiveOrdersWidget;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.s0;

/* compiled from: BxActiveOrdersWidgetConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LI3/b;", "LI3/a;", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class b implements I3.a {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f7902a;

    /* compiled from: BxActiveOrdersWidgetConverter.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f7903a;

        static {
            int[] iArr = new int[BxActiveOrderItem.ItemType.values().length];
            try {
                iArr[BxActiveOrderItem.ItemType.GOODS_ORDER.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BxActiveOrderItem.ItemType.SHOW_ALL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BxActiveOrderItem.ItemType.COMFORTABLE_DEAL.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f7903a = iArr;
        }
    }

    public b(boolean z12) {
        this.f7902a = z12;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // I3.a
    @l
    public final HomeActiveOrdersItem a(@k BxActiveOrdersWidget bxActiveOrdersWidget) {
        com.avito.conveyor_item.a orderItemImpl;
        if (this.f7902a) {
            return null;
        }
        int i12 = 1;
        if (bxActiveOrdersWidget.getItems().isEmpty()) {
            return new HomeActiveOrdersStubItem(null, 6, 1, null);
        }
        DeepLink onShowDeepLink = bxActiveOrdersWidget.getOnShowDeepLink();
        List<BxActiveOrderItem> items = bxActiveOrdersWidget.getItems();
        List<BxActiveOrderItem> list = items;
        ArrayList arrayList = new ArrayList(C42745f0.q(list, 10));
        int i13 = 0;
        for (Object obj : list) {
            int i14 = i13 + 1;
            if (i13 < 0) {
                C42745f0.H0();
                throw null;
            }
            BxActiveOrderItem bxActiveOrderItem = (BxActiveOrderItem) obj;
            int i15 = a.f7903a[bxActiveOrderItem.getType().ordinal()];
            if (i15 == i12) {
                String strValueOf = String.valueOf(i13);
                String title = bxActiveOrderItem.getContent().getTitle();
                AttributedText subtitle = bxActiveOrderItem.getContent().getSubtitle();
                Image image = bxActiveOrderItem.getContent().getImage();
                DeepLink onTapDeepLink = bxActiveOrderItem.getContent().getOnTapDeepLink();
                Boolean boolIsMultipleItems = bxActiveOrderItem.getContent().isMultipleItems();
                orderItemImpl = new OrderItemImpl(strValueOf, title, subtitle, image, onTapDeepLink, boolIsMultipleItems != null ? boolIsMultipleItems.booleanValue() : false, bxActiveOrderItem.getContent().getAttentionBadgeText());
            } else if (i15 == 2) {
                orderItemImpl = new AllOrdersItemImpl(String.valueOf(i13), bxActiveOrderItem.getContent().getTitle(), bxActiveOrderItem.getContent().getOnTapDeepLink(), new Icon(Integer.valueOf(R.attr.ic_arrowRight16), Integer.valueOf(R.attr.black)));
            } else {
                if (i15 != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                String strValueOf2 = String.valueOf(i13);
                String title2 = bxActiveOrderItem.getContent().getTitle();
                AttributedText subtitle2 = bxActiveOrderItem.getContent().getSubtitle();
                Image image2 = bxActiveOrderItem.getContent().getImage();
                Image badgeImage = bxActiveOrderItem.getContent().getBadgeImage();
                DeepLink onTapDeepLink2 = bxActiveOrderItem.getContent().getOnTapDeepLink();
                if (onTapDeepLink2 == null) {
                    onTapDeepLink2 = new NoMatchLink();
                }
                DeepLink deepLink = onTapDeepLink2;
                DeepLink onShowDeepLink2 = bxActiveOrderItem.getContent().getOnShowDeepLink();
                if (onShowDeepLink2 == null) {
                    onShowDeepLink2 = new NoMatchLink();
                }
                DeepLink deepLink2 = onShowDeepLink2;
                String badgeFallback = bxActiveOrderItem.getContent().getBadgeFallback();
                boolean z12 = items.size() == i12 ? i12 : 0;
                BxActiveOrderItem.BannerPayload bannerPayload = bxActiveOrderItem.getContent().getBannerPayload();
                String position = bannerPayload != null ? bannerPayload.getPosition() : null;
                BxActiveOrderItem.BannerPayload bannerPayload2 = bxActiveOrderItem.getContent().getBannerPayload();
                String page = bannerPayload2 != null ? bannerPayload2.getPage() : null;
                BxActiveOrderItem.BannerPayload bannerPayload3 = bxActiveOrderItem.getContent().getBannerPayload();
                orderItemImpl = new ComfortableDealOrderItemImpl(strValueOf2, title2, subtitle2, image2, badgeImage, deepLink, deepLink2, z12, badgeFallback, new BannerPayload(position, page, bannerPayload3 != null ? bannerPayload3.getBannerId() : null));
            }
            arrayList.add(orderItemImpl);
            i13 = i14;
            i12 = 1;
        }
        return new HomeActiveOrdersItemImpl(null, 6, onShowDeepLink, arrayList, bxActiveOrdersWidget.getAnalytics(), bxActiveOrdersWidget.getSettings(), 1, null);
    }
}
