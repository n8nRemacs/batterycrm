package as0;

import Y61.k;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.C22491k0;
import com.avito.android.J0;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SellerAvatar;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.vertical_main.SellerRating;
import com.avito.android.remote.model.vertical_main.SellerWidget;
import com.avito.android.remote.model.vertical_main.SellersCarouselWidget;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.serp.adapter.vertical_main.sellers_carousel.SellersCarouselWidgetItem;
import com.avito.android.serp.adapter.vertical_main.sellers_carousel.sellers_list.SellerItem;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SellersCarouselWidgetItemConverter.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Las0/b;", "", "a", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: as0.b, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C24171b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final J0 f56766a;

    /* compiled from: SellersCarouselWidgetItemConverter.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Las0/b$a;", "", "<init>", "()V", "", "SELLER_CAROUSEL_NAME", "Ljava/lang/String;", "WIDGET_NAME", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: as0.b$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public C24171b(@k J0 j02) {
        this.f56766a = j02;
    }

    @k
    public final SellersCarouselWidgetItem a(@k SellersCarouselWidget sellersCarouselWidget) {
        String string;
        String strK = f.k(this.f56766a, new StringBuilder("sellersCarouselWidget"));
        AttributedText title = sellersCarouselWidget.getTitle();
        List<SellerWidget> sellers = sellersCarouselWidget.getSellers();
        ArrayList arrayList = new ArrayList(C42745f0.q(sellers, 10));
        for (SellerWidget sellerWidget : sellers) {
            Analytics analytics = sellersCarouselWidget.getAnalytics();
            SellersCarouselWidget.Template template = sellersCarouselWidget.getTemplate();
            String str = "sellersCarousel" + sellerWidget.getSellerId();
            String sellerId = sellerWidget.getSellerId();
            SellerAvatar avatar = sellerWidget.getAvatar();
            Image image = avatar != null ? avatar.getImage() : null;
            String name = sellerWidget.getName();
            SellerRating rating = sellerWidget.getRating();
            String str2 = rating != null ? String.format("%.1f", Arrays.copyOf(new Object[]{Float.valueOf(rating.getScoreFloat())}, 1)) : null;
            SellerRating rating2 = sellerWidget.getRating();
            arrayList.add(new SellerItem(str, sellerId, image, name, str2, (rating2 == null || (string = Integer.valueOf(rating2.getReviews()).toString()) == null) ? null : C22491k0.a(')', "(", string), analytics, sellerWidget.getUri(), template));
        }
        return new SellersCarouselWidgetItem(strK, title, arrayList, sellersCarouselWidget.getAnalytics(), sellersCarouselWidget.getTemplate(), sellersCarouselWidget.getSettings());
    }
}
