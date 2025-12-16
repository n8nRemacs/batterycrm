package com.avito.android.serp.adapter.constructor;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.async_phone.AsyncPhoneItem;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.buy_with_delivery.AsyncBuyWithDeliveryItem;
import com.avito.android.constructor_advert.ui.serp.constructor.BuyWithDeliveryLoadingState;
import com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem;
import com.avito.android.constructor_advert.ui.serp.constructor.SellerInfoModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.ConstructorAdvertNetworkModelKt;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.FavoritesToast;
import com.avito.android.remote.model.GalleryConfigModel;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.ImageGalleryItemModel;
import com.avito.android.remote.model.SellerOnline;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SnippetSize;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.new_advert_badge.NewAdvertBadge;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.serp.adapter.C34734g0;
import com.avito.android.serp.adapter.PersistableSerpItem;
import com.avito.android.serp.adapter.SerpViewType;
import com.avito.android.serp.adapter.l1;
import com.avito.android.service_order_widget.serp.AsyncServiceOrderItem;
import com.avito.android.service_order_widget.serp.ServiceOrderRequestLoadingState;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import ru.avito.component.serp.PhoneLoadingState;

/* compiled from: SerpConstructorAdvertItem.kt */
@P
@Keep
@Metadata(d1 = {"\u0000ü\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\b\u000b\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bL\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bC\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u00032\u00020\u00042\u00020\u00052\u00020\u0006Bû\u0003\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\r\u001a\u0004\u0018\u00010\t\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u000e\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\u000e\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0017\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\u0006\u0010\u001c\u001a\u00020\u001b\u0012\u0006\u0010\u001d\u001a\u00020\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t\u0012\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012\u0012\u000e\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0012\u0012\b\u0010\"\u001a\u0004\u0018\u00010\u001b\u0012\u0006\u0010#\u001a\u00020\u001b\u0012\u0006\u0010$\u001a\u00020\u001b\u0012\b\b\u0002\u0010%\u001a\u00020\u001b\u0012\b\b\u0002\u0010&\u001a\u00020\u001b\u0012\b\u0010'\u001a\u0004\u0018\u00010\t\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\b\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010-\u001a\u00020,\u0012\u0014\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010.\u0012\u0014\u00100\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010.\u0012\u0006\u00101\u001a\u00020\u001b\u0012\u0006\u00102\u001a\u00020\u001b\u0012\u0006\u00103\u001a\u00020\u001b\u0012\u0006\u00104\u001a\u00020\u001b\u0012\u0006\u00105\u001a\u00020\u001b\u0012\u0006\u00106\u001a\u00020\u001b\u0012\u0006\u00107\u001a\u00020\u001b\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\b\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\b\b\u0002\u0010B\u001a\u00020\u001b\u0012\b\b\u0002\u0010C\u001a\u00020\u001b\u0012\u0006\u0010D\u001a\u00020\t\u0012\u0006\u0010E\u001a\u00020:\u0012\u0006\u0010F\u001a\u00020\t\u0012\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\t\u0012\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H\u0012\b\u0010J\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\bK\u0010LJ\u0010\u0010M\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0010\u0010O\u001a\u00020\tHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0010\u0010Q\u001a\u00020\u000bHÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bS\u0010PJ\u0012\u0010T\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0018\u0010X\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0018\u0010Z\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bZ\u0010YJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\ba\u0010`J\u0012\u0010b\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bb\u0010PJ\u0018\u0010c\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bc\u0010YJ\u0018\u0010d\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bd\u0010YJ\u0012\u0010e\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\be\u0010fJ\u0010\u0010g\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bg\u0010`J\u0010\u0010h\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bh\u0010`J\u0010\u0010i\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bi\u0010`J\u0010\u0010j\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bj\u0010`J\u0012\u0010k\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\bk\u0010PJ\u0012\u0010l\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0010\u0010p\u001a\u00020,HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u001e\u0010r\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010.HÆ\u0003¢\u0006\u0004\br\u0010sJ\u001e\u0010t\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010.HÆ\u0003¢\u0006\u0004\bt\u0010sJ\u0010\u0010u\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bu\u0010`J\u0010\u0010v\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bv\u0010`J\u0010\u0010w\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bw\u0010`J\u0010\u0010x\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bx\u0010`J\u0010\u0010y\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\by\u0010`J\u0010\u0010z\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\bz\u0010`J\u0010\u0010{\u001a\u00020\u001bHÆ\u0003¢\u0006\u0004\b{\u0010`J\u0012\u0010|\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b|\u0010fJ\u0012\u0010}\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\b}\u0010fJ\u0012\u0010~\u001a\u0004\u0018\u00010:HÆ\u0003¢\u0006\u0004\b~\u0010\u007fJ\u0015\u0010\u0080\u0001\u001a\u0004\u0018\u00010<HÆ\u0003¢\u0006\u0006\b\u0080\u0001\u0010\u0081\u0001J\u0015\u0010\u0082\u0001\u001a\u0004\u0018\u00010>HÆ\u0003¢\u0006\u0006\b\u0082\u0001\u0010\u0083\u0001J\u0015\u0010\u0084\u0001\u001a\u0004\u0018\u00010@HÆ\u0003¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001J\u0012\u0010\u0086\u0001\u001a\u00020\u001bHÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010`J\u0012\u0010\u0087\u0001\u001a\u00020\u001bHÆ\u0003¢\u0006\u0005\b\u0087\u0001\u0010`J\u0012\u0010\u0088\u0001\u001a\u00020\tHÆ\u0003¢\u0006\u0005\b\u0088\u0001\u0010PJ\u0013\u0010\u0089\u0001\u001a\u00020:HÆ\u0003¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J\u0012\u0010\u008b\u0001\u001a\u00020\tHÆ\u0003¢\u0006\u0005\b\u008b\u0001\u0010PJ\u0014\u0010\u008c\u0001\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0005\b\u008c\u0001\u0010PJ\u0015\u0010\u008d\u0001\u001a\u0004\u0018\u00010HHÆ\u0003¢\u0006\u0006\b\u008d\u0001\u0010\u008e\u0001J\u0015\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001JË\u0004\u0010\u0091\u0001\u001a\u00020\u00002\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\u0010\b\u0002\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00122\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010\u001d\u001a\u00020\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\t2\u0010\b\u0002\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00122\u0010\b\u0002\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00122\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u001b2\b\b\u0002\u0010#\u001a\u00020\u001b2\b\b\u0002\u0010$\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\u001b2\b\b\u0002\u0010&\u001a\u00020\u001b2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010-\u001a\u00020,2\u0016\b\u0002\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010.2\u0016\b\u0002\u00100\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010.2\b\b\u0002\u00101\u001a\u00020\u001b2\b\b\u0002\u00102\u001a\u00020\u001b2\b\b\u0002\u00103\u001a\u00020\u001b2\b\b\u0002\u00104\u001a\u00020\u001b2\b\b\u0002\u00105\u001a\u00020\u001b2\b\b\u0002\u00106\u001a\u00020\u001b2\b\b\u0002\u00107\u001a\u00020\u001b2\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\b\b\u0002\u0010B\u001a\u00020\u001b2\b\b\u0002\u0010C\u001a\u00020\u001b2\b\b\u0002\u0010D\u001a\u00020\t2\b\b\u0002\u0010E\u001a\u00020:2\b\b\u0002\u0010F\u001a\u00020\t2\n\b\u0002\u0010G\u001a\u0004\u0018\u00010\t2\n\b\u0002\u0010I\u001a\u0004\u0018\u00010H2\n\b\u0002\u0010J\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0012\u0010\u0093\u0001\u001a\u00020\tHÖ\u0001¢\u0006\u0005\b\u0093\u0001\u0010PJ\u0013\u0010\u0094\u0001\u001a\u00020:HÖ\u0001¢\u0006\u0006\b\u0094\u0001\u0010\u008a\u0001J\u001f\u0010\u0097\u0001\u001a\u00020\u001b2\n\u0010\u0096\u0001\u001a\u0005\u0018\u00010\u0095\u0001HÖ\u0003¢\u0006\u0006\b\u0097\u0001\u0010\u0098\u0001J\u0013\u0010\u0099\u0001\u001a\u00020:HÖ\u0001¢\u0006\u0006\b\u0099\u0001\u0010\u008a\u0001J'\u0010\u009e\u0001\u001a\u00030\u009d\u00012\b\u0010\u009b\u0001\u001a\u00030\u009a\u00012\u0007\u0010\u009c\u0001\u001a\u00020:HÖ\u0001¢\u0006\u0006\b\u009e\u0001\u0010\u009f\u0001R\u001c\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\b\u0010 \u0001\u001a\u0005\b¡\u0001\u0010NR\u001c\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\n\u0010¢\u0001\u001a\u0005\b£\u0001\u0010PR\u001c\u0010\f\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\f\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010RR\u001e\u0010\r\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\r\u0010¢\u0001\u001a\u0005\b¦\u0001\u0010PR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010§\u0001\u001a\u0005\b¨\u0001\u0010UR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010©\u0001\u001a\u0005\bª\u0001\u0010WR$\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010«\u0001\u001a\u0005\b¬\u0001\u0010YR$\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010«\u0001\u001a\u0005\b\u00ad\u0001\u0010YR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010®\u0001\u001a\u0005\b¯\u0001\u0010\\R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010°\u0001\u001a\u0005\b±\u0001\u0010^R\u001b\u0010\u001c\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u001c\u0010²\u0001\u001a\u0004\b\u001c\u0010`R\u001c\u0010\u001d\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010²\u0001\u001a\u0005\b³\u0001\u0010`R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010¢\u0001\u001a\u0005\b´\u0001\u0010PR$\u0010\u001f\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001f\u0010«\u0001\u001a\u0005\bµ\u0001\u0010YR$\u0010!\u001a\n\u0012\u0004\u0012\u00020 \u0018\u00010\u00128\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b!\u0010«\u0001\u001a\u0005\b¶\u0001\u0010YR\u001e\u0010\"\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\"\u0010·\u0001\u001a\u0005\b¸\u0001\u0010fR%\u0010#\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b#\u0010²\u0001\u001a\u0004\b#\u0010`\"\u0006\b¹\u0001\u0010º\u0001R%\u0010$\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b$\u0010²\u0001\u001a\u0004\b$\u0010`\"\u0006\b»\u0001\u0010º\u0001R\u001c\u0010%\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b%\u0010²\u0001\u001a\u0005\b¼\u0001\u0010`R%\u0010&\u001a\u00020\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b&\u0010²\u0001\u001a\u0004\b&\u0010`\"\u0006\b½\u0001\u0010º\u0001R\u001e\u0010'\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b'\u0010¢\u0001\u001a\u0005\b¾\u0001\u0010PR\u001e\u0010)\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b)\u0010¿\u0001\u001a\u0005\bÀ\u0001\u0010mR\u001e\u0010+\u001a\u0004\u0018\u00010*8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b+\u0010Á\u0001\u001a\u0005\bÂ\u0001\u0010oR&\u0010-\u001a\u00020,8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b-\u0010Ã\u0001\u001a\u0005\bÄ\u0001\u0010q\"\u0006\bÅ\u0001\u0010Æ\u0001R*\u0010/\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010.8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b/\u0010Ç\u0001\u001a\u0005\bÈ\u0001\u0010sR*\u00100\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\t\u0018\u00010.8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b0\u0010Ç\u0001\u001a\u0005\bÉ\u0001\u0010sR\u001b\u00101\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b1\u0010²\u0001\u001a\u0004\b1\u0010`R\u001c\u00102\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b2\u0010²\u0001\u001a\u0005\bÊ\u0001\u0010`R\u001c\u00103\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b3\u0010²\u0001\u001a\u0005\bË\u0001\u0010`R\u001b\u00104\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b4\u0010²\u0001\u001a\u0004\b4\u0010`R\u001b\u00105\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b5\u0010²\u0001\u001a\u0004\b5\u0010`R\u001b\u00106\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b6\u0010²\u0001\u001a\u0004\b6\u0010`R\u001b\u00107\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b7\u0010²\u0001\u001a\u0004\b7\u0010`R(\u00108\u001a\u0004\u0018\u00010\u001b8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b8\u0010·\u0001\u001a\u0005\bÌ\u0001\u0010f\"\u0006\bÍ\u0001\u0010Î\u0001R\u001d\u00109\u001a\u0004\u0018\u00010\u001b8\u0016X\u0096\u0004¢\u0006\r\n\u0005\b9\u0010·\u0001\u001a\u0004\b9\u0010fR\u001e\u0010;\u001a\u0004\u0018\u00010:8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b;\u0010Ï\u0001\u001a\u0005\bÐ\u0001\u0010\u007fR\u001f\u0010=\u001a\u0004\u0018\u00010<8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b=\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010\u0081\u0001R\u001f\u0010?\u001a\u0004\u0018\u00010>8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b?\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010\u0083\u0001R\u001f\u0010A\u001a\u0004\u0018\u00010@8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bA\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010\u0085\u0001R\u001c\u0010B\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bB\u0010²\u0001\u001a\u0005\b×\u0001\u0010`R\u001b\u0010C\u001a\u00020\u001b8\u0016X\u0096\u0004¢\u0006\r\n\u0005\bC\u0010²\u0001\u001a\u0004\bC\u0010`R\u001c\u0010D\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bD\u0010¢\u0001\u001a\u0005\bØ\u0001\u0010PR\u001d\u0010E\u001a\u00020:8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bE\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010\u008a\u0001R\u001c\u0010F\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bF\u0010¢\u0001\u001a\u0005\bÛ\u0001\u0010PR\u001e\u0010G\u001a\u0004\u0018\u00010\t8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bG\u0010¢\u0001\u001a\u0005\bÜ\u0001\u0010PR\u001f\u0010I\u001a\u0004\u0018\u00010H8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bI\u0010Ý\u0001\u001a\u0006\bÞ\u0001\u0010\u008e\u0001R\u001f\u0010J\u001a\u0004\u0018\u00010\u00078\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bJ\u0010ß\u0001\u001a\u0006\bà\u0001\u0010\u0090\u0001RK\u0010ä\u0001\u001a\u001d\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020 \u0012\u0005\u0012\u00030â\u00010á\u0001j\u0003`ã\u0001\u0018\u00010\u00128\u0016@\u0016X\u0096\u000e¢\u0006\u001f\n\u0006\bä\u0001\u0010«\u0001\u0012\u0006\bè\u0001\u0010é\u0001\u001a\u0005\bå\u0001\u0010Y\"\u0006\bæ\u0001\u0010ç\u0001R9\u0010ë\u0001\u001a\u0012\u0012\u0004\u0012\u00020\t\u0012\u0005\u0012\u00030\u009d\u0001\u0018\u00010ê\u00018\u0006@\u0006X\u0086\u000e¢\u0006\u0018\n\u0006\bë\u0001\u0010ì\u0001\u001a\u0006\bí\u0001\u0010î\u0001\"\u0006\bï\u0001\u0010ð\u0001R \u0010ò\u0001\u001a\u00030ñ\u00018\u0016X\u0096\u0004¢\u0006\u0010\n\u0006\bò\u0001\u0010ó\u0001\u001a\u0006\bô\u0001\u0010õ\u0001R*\u0010÷\u0001\u001a\u00030ö\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b÷\u0001\u0010ø\u0001\u001a\u0006\bù\u0001\u0010ú\u0001\"\u0006\bû\u0001\u0010ü\u0001R*\u0010þ\u0001\u001a\u00030ý\u00018\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\bþ\u0001\u0010ÿ\u0001\u001a\u0006\b\u0080\u0002\u0010\u0081\u0002\"\u0006\b\u0082\u0002\u0010\u0083\u0002R*\u0010\u0085\u0002\u001a\u00030\u0084\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0018\n\u0006\b\u0085\u0002\u0010\u0086\u0002\u001a\u0006\b\u0087\u0002\u0010\u0088\u0002\"\u0006\b\u0089\u0002\u0010\u008a\u0002R)\u0010\u0091\u0002\u001a\u00030\u008b\u00028VX\u0096\u0084\u0002¢\u0006\u0018\n\u0006\b\u008c\u0002\u0010\u008d\u0002\u0012\u0006\b\u0090\u0002\u0010é\u0001\u001a\u0006\b\u008e\u0002\u0010\u008f\u0002R\u0017\u0010\u0093\u0002\u001a\u00020:8VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u0092\u0002\u0010\u008a\u0001¨\u0006\u0094\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/constructor/SerpConstructorAdvertItem;", "Lcom/avito/android/serp/adapter/l1;", "Lcom/avito/android/async_phone/AsyncPhoneItem;", "Lcom/avito/android/service_order_widget/serp/AsyncServiceOrderItem;", "Lcom/avito/android/buy_with_delivery/AsyncBuyWithDeliveryItem;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "Lcom/avito/android/serp/adapter/PersistableSerpItem;", "", "id", "", "stringId", "Lcom/avito/android/remote/model/SnippetSize;", "size", "title", "Lcom/avito/android/constructor_advert/ui/serp/constructor/PriceModel;", "price", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "Lcom/avito/android/remote/model/DimmedImage;", "imageList", "Lcom/avito/android/remote/model/ConstructorAdvertGalleryItemModel;", "galleryItemsList", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "badgeSticker", "", "isDelivery", "hasDiscount", "nativeVideoABCategory", "exposureParams", "Lcom/avito/android/beduin_models/BeduinModel;", "freeForm", "reserved", "isViewed", "isFavorite", "canBeHidden", "isHidden", "analyticsContext", "Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "verticalAlias", "Lcom/avito/android/remote/model/FavoritesToast;", "favoritesToast", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "", "analyticParams", "additionalAnalyticsParams", "isExternalAd", "hasVideo", "hasRealtyLayout", "isRedesign", "isStrRedesign", "isUnavailable", "isExtendedGallery", "cvViewed", "isCvHidden", "", "categoryId", "Lcom/avito/android/constructor_advert/ui/serp/constructor/SellerInfoModel;", "sellerInfo", "Lcom/avito/android/remote/model/SellerOnline;", "sellerOnline", "Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;", "newAdvertBadge", "hasStablePosition", "isFeatured", "featuredSectionTitle", "featuredSectionPosition", "featuredSectionType", "xHash", "Lcom/avito/android/remote/model/GalleryConfigModel;", "galleryConfig", "gigShiftId", "<init>", "(JLjava/lang/String;Lcom/avito/android/remote/model/SnippetSize;Ljava/lang/String;Lcom/avito/android/constructor_advert/ui/serp/constructor/PriceModel;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/remote/model/sales/utils/BadgeSticker;ZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;ZZZZLjava/lang/String;Lcom/avito/android/remote/model/AdvertisementVerticalAlias;Lcom/avito/android/remote/model/FavoritesToast;Lcom/avito/android/remote/model/SerpDisplayType;Ljava/util/Map;Ljava/util/Map;ZZZZZZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/avito/android/constructor_advert/ui/serp/constructor/SellerInfoModel;Lcom/avito/android/remote/model/SellerOnline;Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;ZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/GalleryConfigModel;Ljava/lang/Long;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/SnippetSize;", "component4", "component5", "()Lcom/avito/android/constructor_advert/ui/serp/constructor/PriceModel;", "component6", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component7", "()Ljava/util/List;", "component8", "component9", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "component10", "()Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "component11", "()Z", "component12", "component13", "component14", "component15", "component16", "()Ljava/lang/Boolean;", "component17", "component18", "component19", "component20", "component21", "component22", "()Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "component23", "()Lcom/avito/android/remote/model/FavoritesToast;", "component24", "()Lcom/avito/android/remote/model/SerpDisplayType;", "component25", "()Ljava/util/Map;", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "()Ljava/lang/Integer;", "component37", "()Lcom/avito/android/constructor_advert/ui/serp/constructor/SellerInfoModel;", "component38", "()Lcom/avito/android/remote/model/SellerOnline;", "component39", "()Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;", "component40", "component41", "component42", "component43", "()I", "component44", "component45", "component46", "()Lcom/avito/android/remote/model/GalleryConfigModel;", "component47", "()Ljava/lang/Long;", "copy", "(JLjava/lang/String;Lcom/avito/android/remote/model/SnippetSize;Ljava/lang/String;Lcom/avito/android/constructor_advert/ui/serp/constructor/PriceModel;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/remote/model/sales/utils/BadgeSticker;ZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;ZZZZLjava/lang/String;Lcom/avito/android/remote/model/AdvertisementVerticalAlias;Lcom/avito/android/remote/model/FavoritesToast;Lcom/avito/android/remote/model/SerpDisplayType;Ljava/util/Map;Ljava/util/Map;ZZZZZZZLjava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Integer;Lcom/avito/android/constructor_advert/ui/serp/constructor/SellerInfoModel;Lcom/avito/android/remote/model/SellerOnline;Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;ZZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/GalleryConfigModel;Ljava/lang/Long;)Lcom/avito/android/serp/adapter/constructor/SerpConstructorAdvertItem;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getStringId", "Lcom/avito/android/remote/model/SnippetSize;", "getSize", "getTitle", "Lcom/avito/android/constructor_advert/ui/serp/constructor/PriceModel;", "getPrice", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/util/List;", "getImageList", "getGalleryItemsList", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "getBadgeBar", "Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "getBadgeSticker", "Z", "getHasDiscount", "getNativeVideoABCategory", "getExposureParams", "getFreeForm", "Ljava/lang/Boolean;", "getReserved", "setViewed", "(Z)V", "setFavorite", "getCanBeHidden", "setHidden", "getAnalyticsContext", "Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "getVerticalAlias", "Lcom/avito/android/remote/model/FavoritesToast;", "getFavoritesToast", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "setDisplayType", "(Lcom/avito/android/remote/model/SerpDisplayType;)V", "Ljava/util/Map;", "getAnalyticParams", "getAdditionalAnalyticsParams", "getHasVideo", "getHasRealtyLayout", "getCvViewed", "setCvViewed", "(Ljava/lang/Boolean;)V", "Ljava/lang/Integer;", "getCategoryId", "Lcom/avito/android/constructor_advert/ui/serp/constructor/SellerInfoModel;", "getSellerInfo", "Lcom/avito/android/remote/model/SellerOnline;", "getSellerOnline", "Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;", "getNewAdvertBadge", "getHasStablePosition", "getFeaturedSectionTitle", "I", "getFeaturedSectionPosition", "getFeaturedSectionType", "getXHash", "Lcom/avito/android/remote/model/GalleryConfigModel;", "getGalleryConfig", "Ljava/lang/Long;", "getGigShiftId", "Lej/a;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "freeFormConverted", "getFreeFormConverted", "setFreeFormConverted", "(Ljava/util/List;)V", "getFreeFormConverted$annotations", "()V", "Lkotlin/Function1;", "itemClickListener", "LY41/l;", "getItemClickListener", "()LY41/l;", "setItemClickListener", "(LY41/l;)V", "Lcom/avito/android/serp/adapter/SerpViewType;", "viewType", "Lcom/avito/android/serp/adapter/SerpViewType;", "getViewType", "()Lcom/avito/android/serp/adapter/SerpViewType;", "Lru/avito/component/serp/PhoneLoadingState;", "phoneLoadingState", "Lru/avito/component/serp/PhoneLoadingState;", "getPhoneLoadingState", "()Lru/avito/component/serp/PhoneLoadingState;", "setPhoneLoadingState", "(Lru/avito/component/serp/PhoneLoadingState;)V", "Lcom/avito/android/service_order_widget/serp/ServiceOrderRequestLoadingState;", "serviceOrderRequestLoadingState", "Lcom/avito/android/service_order_widget/serp/ServiceOrderRequestLoadingState;", "getServiceOrderRequestLoadingState", "()Lcom/avito/android/service_order_widget/serp/ServiceOrderRequestLoadingState;", "setServiceOrderRequestLoadingState", "(Lcom/avito/android/service_order_widget/serp/ServiceOrderRequestLoadingState;)V", "Lcom/avito/android/constructor_advert/ui/serp/constructor/BuyWithDeliveryLoadingState;", "buyWithDeliveryLoadingState", "Lcom/avito/android/constructor_advert/ui/serp/constructor/BuyWithDeliveryLoadingState;", "getBuyWithDeliveryLoadingState", "()Lcom/avito/android/constructor_advert/ui/serp/constructor/BuyWithDeliveryLoadingState;", "setBuyWithDeliveryLoadingState", "(Lcom/avito/android/constructor_advert/ui/serp/constructor/BuyWithDeliveryLoadingState;)V", "Lcom/avito/android/serp/adapter/g0;", "inAppCallsAwareItemData$delegate", "Lkotlin/C;", "getInAppCallsAwareItemData", "()Lcom/avito/android/serp/adapter/g0;", "getInAppCallsAwareItemData$annotations", "inAppCallsAwareItemData", "getSpanCount", "spanCount", "_avito-discouraged_avito-libs_serp-core_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
@K51.d
/* loaded from: classes3.dex */
public final /* data */ class SerpConstructorAdvertItem implements l1, AsyncPhoneItem, AsyncServiceOrderItem, AsyncBuyWithDeliveryItem, ConstructorAdvertItem, PersistableSerpItem {
    public static final int $stable = 8;

    @Y61.k
    public static final Parcelable.Creator<SerpConstructorAdvertItem> CREATOR = new a();

    @Y61.l
    private final Map<String, String> additionalAnalyticsParams;

    @Y61.l
    private final Map<String, String> analyticParams;

    @Y61.l
    private final String analyticsContext;

    @Y61.l
    private final SerpBadgeBar badgeBar;

    @Y61.l
    private final BadgeSticker badgeSticker;

    @Y61.k
    private BuyWithDeliveryLoadingState buyWithDeliveryLoadingState;
    private final boolean canBeHidden;

    @Y61.l
    private final Integer categoryId;

    @Y61.l
    private Boolean cvViewed;

    @Y61.l
    private final DeepLink deepLink;

    @Y61.k
    private SerpDisplayType displayType;

    @Y61.l
    private final List<String> exposureParams;

    @Y61.l
    private final FavoritesToast favoritesToast;
    private final int featuredSectionPosition;

    @Y61.k
    private final String featuredSectionTitle;

    @Y61.k
    private final String featuredSectionType;

    @Y61.l
    private final List<BeduinModel> freeForm;

    @Y61.l
    private List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> freeFormConverted;

    @Y61.l
    private final GalleryConfigModel galleryConfig;

    @Y61.l
    private final List<ConstructorAdvertGalleryItemModel> galleryItemsList;

    @Y61.l
    private final Long gigShiftId;
    private final boolean hasDiscount;
    private final boolean hasRealtyLayout;
    private final boolean hasStablePosition;
    private final boolean hasVideo;
    private final long id;

    @Y61.l
    private final List<DimmedImage> imageList;

    /* renamed from: inAppCallsAwareItemData$delegate, reason: from kotlin metadata */
    @Y61.k
    private final InterfaceC42726C inAppCallsAwareItemData;

    @Y61.l
    private final Boolean isCvHidden;
    private final boolean isDelivery;
    private final boolean isExtendedGallery;
    private final boolean isExternalAd;
    private boolean isFavorite;
    private final boolean isFeatured;
    private boolean isHidden;
    private final boolean isRedesign;
    private final boolean isStrRedesign;
    private final boolean isUnavailable;
    private boolean isViewed;

    @Y61.l
    private Y41.l<? super String, G0> itemClickListener;

    @Y61.l
    private final String nativeVideoABCategory;

    @Y61.l
    private final NewAdvertBadge newAdvertBadge;

    @Y61.k
    private PhoneLoadingState phoneLoadingState;

    @Y61.l
    private final com.avito.android.constructor_advert.ui.serp.constructor.PriceModel price;

    @Y61.l
    private final Boolean reserved;

    @Y61.l
    private final SellerInfoModel sellerInfo;

    @Y61.l
    private final SellerOnline sellerOnline;

    @Y61.k
    private ServiceOrderRequestLoadingState serviceOrderRequestLoadingState;

    @Y61.k
    private final SnippetSize size;

    @Y61.k
    private final String stringId;

    @Y61.l
    private final String title;

    @Y61.l
    private final AdvertisementVerticalAlias verticalAlias;

    @Y61.k
    private final SerpViewType viewType;

    @Y61.l
    private final String xHash;

    /* compiled from: SerpConstructorAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<SerpConstructorAdvertItem> {
        @Override // android.os.Parcelable.Creator
        public final SerpConstructorAdvertItem createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z12;
            ArrayList arrayList3;
            Boolean boolValueOf;
            BadgeSticker badgeSticker;
            LinkedHashMap linkedHashMap;
            LinkedHashMap linkedHashMap2;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            SnippetSize snippetSizeValueOf = SnippetSize.valueOf(parcel.readString());
            String string2 = parcel.readString();
            com.avito.android.constructor_advert.ui.serp.constructor.PriceModel priceModel = (com.avito.android.constructor_advert.ui.serp.constructor.PriceModel) parcel.readParcelable(SerpConstructorAdvertItem.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(SerpConstructorAdvertItem.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(SerpConstructorAdvertItem.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(SerpConstructorAdvertItem.class, parcel, arrayList4, iL3, 1);
                }
                arrayList2 = arrayList4;
            }
            SerpBadgeBar serpBadgeBar = (SerpBadgeBar) parcel.readParcelable(SerpConstructorAdvertItem.class.getClassLoader());
            BadgeSticker badgeSticker2 = (BadgeSticker) parcel.readParcelable(SerpConstructorAdvertItem.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                z12 = z13;
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList5 = new ArrayList(i14);
                z12 = z13;
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(SerpConstructorAdvertItem.class, parcel, arrayList5, iL4, 1);
                    i14 = i14;
                }
                arrayList3 = arrayList5;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            String string4 = parcel.readString();
            AdvertisementVerticalAlias advertisementVerticalAliasValueOf = parcel.readInt() == 0 ? null : AdvertisementVerticalAlias.valueOf(parcel.readString());
            FavoritesToast favoritesToast = (FavoritesToast) parcel.readParcelable(SerpConstructorAdvertItem.class.getClassLoader());
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                badgeSticker = badgeSticker2;
                linkedHashMap = null;
            } else {
                int i15 = parcel.readInt();
                LinkedHashMap linkedHashMap3 = new LinkedHashMap(i15);
                int iA2 = 0;
                while (iA2 != i15) {
                    iA2 = C0.a(parcel, linkedHashMap3, parcel.readString(), iA2, 1);
                    i15 = i15;
                    badgeSticker2 = badgeSticker2;
                }
                badgeSticker = badgeSticker2;
                linkedHashMap = linkedHashMap3;
            }
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i16 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i16);
                int iA3 = 0;
                while (iA3 != i16) {
                    iA3 = C0.a(parcel, linkedHashMap4, parcel.readString(), iA3, 1);
                    i16 = i16;
                }
                linkedHashMap2 = linkedHashMap4;
            }
            boolean z19 = parcel.readInt() != 0;
            boolean z22 = parcel.readInt() != 0;
            boolean z23 = parcel.readInt() != 0;
            boolean z24 = parcel.readInt() != 0;
            boolean z25 = parcel.readInt() != 0;
            boolean z26 = parcel.readInt() != 0;
            boolean z27 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SerpConstructorAdvertItem(j12, string, snippetSizeValueOf, string2, priceModel, deepLink, arrayList, arrayList2, serpBadgeBar, badgeSticker, z12, z14, string3, arrayListCreateStringArrayList, arrayList3, boolValueOf, z15, z16, z17, z18, string4, advertisementVerticalAliasValueOf, favoritesToast, serpDisplayTypeValueOf, linkedHashMap, linkedHashMap2, z19, z22, z23, z24, z25, z26, z27, boolValueOf2, boolValueOf3, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), (SellerInfoModel) parcel.readParcelable(SerpConstructorAdvertItem.class.getClassLoader()), (SellerOnline) parcel.readParcelable(SerpConstructorAdvertItem.class.getClassLoader()), (NewAdvertBadge) parcel.readParcelable(SerpConstructorAdvertItem.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt(), parcel.readString(), parcel.readString(), (GalleryConfigModel) parcel.readParcelable(SerpConstructorAdvertItem.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final SerpConstructorAdvertItem[] newArray(int i12) {
            return new SerpConstructorAdvertItem[i12];
        }
    }

    /* compiled from: SerpConstructorAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f269458a;

        static {
            int[] iArr = new int[SnippetSize.values().length];
            try {
                iArr[SnippetSize.SMALL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[SnippetSize.MEDIUM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[SnippetSize.LARGE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f269458a = iArr;
        }
    }

    /* compiled from: SerpConstructorAdvertItem.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/g0;", "invoke", "()Lcom/avito/android/serp/adapter/g0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<C34734g0> {
        public c() {
            super(0);
        }

        @Override // Y41.a
        public final C34734g0 invoke() {
            Image image;
            DimmedImage image2;
            DimmedImage dimmedImage;
            Image image3;
            SerpConstructorAdvertItem serpConstructorAdvertItem = SerpConstructorAdvertItem.this;
            SellerInfoModel sellerInfo = serpConstructorAdvertItem.getSellerInfo();
            Image image4 = null;
            String str = sellerInfo != null ? sellerInfo.f125785b : null;
            SellerInfoModel sellerInfo2 = serpConstructorAdvertItem.getSellerInfo();
            String str2 = sellerInfo2 != null ? sellerInfo2.f125787d : null;
            SellerInfoModel sellerInfo3 = serpConstructorAdvertItem.getSellerInfo();
            Image image5 = sellerInfo3 != null ? sellerInfo3.f125786c : null;
            String strValueOf = String.valueOf(serpConstructorAdvertItem.getF207391e());
            Integer categoryId = serpConstructorAdvertItem.getCategoryId();
            String string = categoryId != null ? categoryId.toString() : null;
            String title = serpConstructorAdvertItem.getTitle();
            com.avito.android.constructor_advert.ui.serp.constructor.PriceModel price = serpConstructorAdvertItem.getPrice();
            String str3 = price != null ? price.f125780b : null;
            List<DimmedImage> imageList = serpConstructorAdvertItem.getImageList();
            if (imageList == null || (dimmedImage = (DimmedImage) C42745f0.G(imageList)) == null || (image3 = dimmedImage.getImage()) == null) {
                List<ConstructorAdvertGalleryItemModel> galleryItemsList = serpConstructorAdvertItem.getGalleryItemsList();
                if (galleryItemsList != null) {
                    Iterator<T> it = galleryItemsList.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            break;
                        }
                        ConstructorAdvertGalleryItemModel constructorAdvertGalleryItemModel = (ConstructorAdvertGalleryItemModel) it.next();
                        ImageGalleryItemModel imageGalleryItemModel = constructorAdvertGalleryItemModel instanceof ImageGalleryItemModel ? (ImageGalleryItemModel) constructorAdvertGalleryItemModel : null;
                        Image image6 = (imageGalleryItemModel == null || (image2 = imageGalleryItemModel.getImage()) == null) ? null : image2.getImage();
                        if (image6 != null) {
                            image4 = image6;
                            break;
                        }
                    }
                }
                image = image4;
            } else {
                image = image3;
            }
            return new C34734g0(str, str2, image5, strValueOf, string, title, str3, image, null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerpConstructorAdvertItem(long j12, @Y61.k String str, @Y61.k SnippetSize snippetSize, @Y61.l String str2, @Y61.l com.avito.android.constructor_advert.ui.serp.constructor.PriceModel priceModel, @Y61.l DeepLink deepLink, @Y61.l List<DimmedImage> list, @Y61.l List<? extends ConstructorAdvertGalleryItemModel> list2, @Y61.l SerpBadgeBar serpBadgeBar, @Y61.l BadgeSticker badgeSticker, boolean z12, boolean z13, @Y61.l String str3, @Y61.l List<String> list3, @Y61.l List<? extends BeduinModel> list4, @Y61.l Boolean bool, boolean z14, boolean z15, boolean z16, boolean z17, @Y61.l String str4, @Y61.l AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l FavoritesToast favoritesToast, @Y61.k SerpDisplayType serpDisplayType, @Y61.l Map<String, String> map, @Y61.l Map<String, String> map2, boolean z18, boolean z19, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, @Y61.l Boolean bool2, @Y61.l Boolean bool3, @Y61.l Integer num, @Y61.l SellerInfoModel sellerInfoModel, @Y61.l SellerOnline sellerOnline, @Y61.l NewAdvertBadge newAdvertBadge, boolean z27, boolean z28, @Y61.k String str5, int i12, @Y61.k String str6, @Y61.l String str7, @Y61.l GalleryConfigModel galleryConfigModel, @Y61.l Long l12) {
        this.id = j12;
        this.stringId = str;
        this.size = snippetSize;
        this.title = str2;
        this.price = priceModel;
        this.deepLink = deepLink;
        this.imageList = list;
        this.galleryItemsList = list2;
        this.badgeBar = serpBadgeBar;
        this.badgeSticker = badgeSticker;
        this.isDelivery = z12;
        this.hasDiscount = z13;
        this.nativeVideoABCategory = str3;
        this.exposureParams = list3;
        this.freeForm = list4;
        this.reserved = bool;
        this.isViewed = z14;
        this.isFavorite = z15;
        this.canBeHidden = z16;
        this.isHidden = z17;
        this.analyticsContext = str4;
        this.verticalAlias = advertisementVerticalAlias;
        this.favoritesToast = favoritesToast;
        this.displayType = serpDisplayType;
        this.analyticParams = map;
        this.additionalAnalyticsParams = map2;
        this.isExternalAd = z18;
        this.hasVideo = z19;
        this.hasRealtyLayout = z22;
        this.isRedesign = z23;
        this.isStrRedesign = z24;
        this.isUnavailable = z25;
        this.isExtendedGallery = z26;
        this.cvViewed = bool2;
        this.isCvHidden = bool3;
        this.categoryId = num;
        this.sellerInfo = sellerInfoModel;
        this.sellerOnline = sellerOnline;
        this.newAdvertBadge = newAdvertBadge;
        this.hasStablePosition = z27;
        this.isFeatured = z28;
        this.featuredSectionTitle = str5;
        this.featuredSectionPosition = i12;
        this.featuredSectionType = str6;
        this.xHash = str7;
        this.galleryConfig = galleryConfigModel;
        this.gigShiftId = l12;
        this.viewType = SerpViewType.f268583c;
        this.phoneLoadingState = PhoneLoadingState.f430441b;
        this.serviceOrderRequestLoadingState = ServiceOrderRequestLoadingState.f279048b;
        this.buyWithDeliveryLoadingState = BuyWithDeliveryLoadingState.f125735b;
        this.inAppCallsAwareItemData = C42727D.c(new c());
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @Y61.l
    /* renamed from: component10, reason: from getter */
    public final BadgeSticker getBadgeSticker() {
        return this.badgeSticker;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getIsDelivery() {
        return this.isDelivery;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getHasDiscount() {
        return this.hasDiscount;
    }

    @Y61.l
    /* renamed from: component13, reason: from getter */
    public final String getNativeVideoABCategory() {
        return this.nativeVideoABCategory;
    }

    @Y61.l
    public final List<String> component14() {
        return this.exposureParams;
    }

    @Y61.l
    public final List<BeduinModel> component15() {
        return this.freeForm;
    }

    @Y61.l
    /* renamed from: component16, reason: from getter */
    public final Boolean getReserved() {
        return this.reserved;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsViewed() {
        return this.isViewed;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getCanBeHidden() {
        return this.canBeHidden;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getStringId() {
        return this.stringId;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    @Y61.l
    /* renamed from: component21, reason: from getter */
    public final String getAnalyticsContext() {
        return this.analyticsContext;
    }

    @Y61.l
    /* renamed from: component22, reason: from getter */
    public final AdvertisementVerticalAlias getVerticalAlias() {
        return this.verticalAlias;
    }

    @Y61.l
    /* renamed from: component23, reason: from getter */
    public final FavoritesToast getFavoritesToast() {
        return this.favoritesToast;
    }

    @Y61.k
    /* renamed from: component24, reason: from getter */
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @Y61.l
    public final Map<String, String> component25() {
        return this.analyticParams;
    }

    @Y61.l
    public final Map<String, String> component26() {
        return this.additionalAnalyticsParams;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getIsExternalAd() {
        return this.isExternalAd;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getHasVideo() {
        return this.hasVideo;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getHasRealtyLayout() {
        return this.hasRealtyLayout;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final SnippetSize getSize() {
        return this.size;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIsRedesign() {
        return this.isRedesign;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getIsStrRedesign() {
        return this.isStrRedesign;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getIsUnavailable() {
        return this.isUnavailable;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getIsExtendedGallery() {
        return this.isExtendedGallery;
    }

    @Y61.l
    /* renamed from: component34, reason: from getter */
    public final Boolean getCvViewed() {
        return this.cvViewed;
    }

    @Y61.l
    /* renamed from: component35, reason: from getter */
    public final Boolean getIsCvHidden() {
        return this.isCvHidden;
    }

    @Y61.l
    /* renamed from: component36, reason: from getter */
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    @Y61.l
    /* renamed from: component37, reason: from getter */
    public final SellerInfoModel getSellerInfo() {
        return this.sellerInfo;
    }

    @Y61.l
    /* renamed from: component38, reason: from getter */
    public final SellerOnline getSellerOnline() {
        return this.sellerOnline;
    }

    @Y61.l
    /* renamed from: component39, reason: from getter */
    public final NewAdvertBadge getNewAdvertBadge() {
        return this.newAdvertBadge;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getHasStablePosition() {
        return this.hasStablePosition;
    }

    /* renamed from: component41, reason: from getter */
    public final boolean getIsFeatured() {
        return this.isFeatured;
    }

    @Y61.k
    /* renamed from: component42, reason: from getter */
    public final String getFeaturedSectionTitle() {
        return this.featuredSectionTitle;
    }

    /* renamed from: component43, reason: from getter */
    public final int getFeaturedSectionPosition() {
        return this.featuredSectionPosition;
    }

    @Y61.k
    /* renamed from: component44, reason: from getter */
    public final String getFeaturedSectionType() {
        return this.featuredSectionType;
    }

    @Y61.l
    /* renamed from: component45, reason: from getter */
    public final String getXHash() {
        return this.xHash;
    }

    @Y61.l
    /* renamed from: component46, reason: from getter */
    public final GalleryConfigModel getGalleryConfig() {
        return this.galleryConfig;
    }

    @Y61.l
    /* renamed from: component47, reason: from getter */
    public final Long getGigShiftId() {
        return this.gigShiftId;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final com.avito.android.constructor_advert.ui.serp.constructor.PriceModel getPrice() {
        return this.price;
    }

    @Y61.l
    /* renamed from: component6, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @Y61.l
    public final List<DimmedImage> component7() {
        return this.imageList;
    }

    @Y61.l
    public final List<ConstructorAdvertGalleryItemModel> component8() {
        return this.galleryItemsList;
    }

    @Y61.l
    /* renamed from: component9, reason: from getter */
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @Y61.k
    public final SerpConstructorAdvertItem copy(long id2, @Y61.k String stringId, @Y61.k SnippetSize size, @Y61.l String title, @Y61.l com.avito.android.constructor_advert.ui.serp.constructor.PriceModel price, @Y61.l DeepLink deepLink, @Y61.l List<DimmedImage> imageList, @Y61.l List<? extends ConstructorAdvertGalleryItemModel> galleryItemsList, @Y61.l SerpBadgeBar badgeBar, @Y61.l BadgeSticker badgeSticker, boolean isDelivery, boolean hasDiscount, @Y61.l String nativeVideoABCategory, @Y61.l List<String> exposureParams, @Y61.l List<? extends BeduinModel> freeForm, @Y61.l Boolean reserved, boolean isViewed, boolean isFavorite, boolean canBeHidden, boolean isHidden, @Y61.l String analyticsContext, @Y61.l AdvertisementVerticalAlias verticalAlias, @Y61.l FavoritesToast favoritesToast, @Y61.k SerpDisplayType displayType, @Y61.l Map<String, String> analyticParams, @Y61.l Map<String, String> additionalAnalyticsParams, boolean isExternalAd, boolean hasVideo, boolean hasRealtyLayout, boolean isRedesign, boolean isStrRedesign, boolean isUnavailable, boolean isExtendedGallery, @Y61.l Boolean cvViewed, @Y61.l Boolean isCvHidden, @Y61.l Integer categoryId, @Y61.l SellerInfoModel sellerInfo, @Y61.l SellerOnline sellerOnline, @Y61.l NewAdvertBadge newAdvertBadge, boolean hasStablePosition, boolean isFeatured, @Y61.k String featuredSectionTitle, int featuredSectionPosition, @Y61.k String featuredSectionType, @Y61.l String xHash, @Y61.l GalleryConfigModel galleryConfig, @Y61.l Long gigShiftId) {
        return new SerpConstructorAdvertItem(id2, stringId, size, title, price, deepLink, imageList, galleryItemsList, badgeBar, badgeSticker, isDelivery, hasDiscount, nativeVideoABCategory, exposureParams, freeForm, reserved, isViewed, isFavorite, canBeHidden, isHidden, analyticsContext, verticalAlias, favoritesToast, displayType, analyticParams, additionalAnalyticsParams, isExternalAd, hasVideo, hasRealtyLayout, isRedesign, isStrRedesign, isUnavailable, isExtendedGallery, cvViewed, isCvHidden, categoryId, sellerInfo, sellerOnline, newAdvertBadge, hasStablePosition, isFeatured, featuredSectionTitle, featuredSectionPosition, featuredSectionType, xHash, galleryConfig, gigShiftId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerpConstructorAdvertItem)) {
            return false;
        }
        SerpConstructorAdvertItem serpConstructorAdvertItem = (SerpConstructorAdvertItem) other;
        return this.id == serpConstructorAdvertItem.id && L.f(this.stringId, serpConstructorAdvertItem.stringId) && this.size == serpConstructorAdvertItem.size && L.f(this.title, serpConstructorAdvertItem.title) && L.f(this.price, serpConstructorAdvertItem.price) && L.f(this.deepLink, serpConstructorAdvertItem.deepLink) && L.f(this.imageList, serpConstructorAdvertItem.imageList) && L.f(this.galleryItemsList, serpConstructorAdvertItem.galleryItemsList) && L.f(this.badgeBar, serpConstructorAdvertItem.badgeBar) && L.f(this.badgeSticker, serpConstructorAdvertItem.badgeSticker) && this.isDelivery == serpConstructorAdvertItem.isDelivery && this.hasDiscount == serpConstructorAdvertItem.hasDiscount && L.f(this.nativeVideoABCategory, serpConstructorAdvertItem.nativeVideoABCategory) && L.f(this.exposureParams, serpConstructorAdvertItem.exposureParams) && L.f(this.freeForm, serpConstructorAdvertItem.freeForm) && L.f(this.reserved, serpConstructorAdvertItem.reserved) && this.isViewed == serpConstructorAdvertItem.isViewed && this.isFavorite == serpConstructorAdvertItem.isFavorite && this.canBeHidden == serpConstructorAdvertItem.canBeHidden && this.isHidden == serpConstructorAdvertItem.isHidden && L.f(this.analyticsContext, serpConstructorAdvertItem.analyticsContext) && this.verticalAlias == serpConstructorAdvertItem.verticalAlias && L.f(this.favoritesToast, serpConstructorAdvertItem.favoritesToast) && this.displayType == serpConstructorAdvertItem.displayType && L.f(this.analyticParams, serpConstructorAdvertItem.analyticParams) && L.f(this.additionalAnalyticsParams, serpConstructorAdvertItem.additionalAnalyticsParams) && this.isExternalAd == serpConstructorAdvertItem.isExternalAd && this.hasVideo == serpConstructorAdvertItem.hasVideo && this.hasRealtyLayout == serpConstructorAdvertItem.hasRealtyLayout && this.isRedesign == serpConstructorAdvertItem.isRedesign && this.isStrRedesign == serpConstructorAdvertItem.isStrRedesign && this.isUnavailable == serpConstructorAdvertItem.isUnavailable && this.isExtendedGallery == serpConstructorAdvertItem.isExtendedGallery && L.f(this.cvViewed, serpConstructorAdvertItem.cvViewed) && L.f(this.isCvHidden, serpConstructorAdvertItem.isCvHidden) && L.f(this.categoryId, serpConstructorAdvertItem.categoryId) && L.f(this.sellerInfo, serpConstructorAdvertItem.sellerInfo) && L.f(this.sellerOnline, serpConstructorAdvertItem.sellerOnline) && L.f(this.newAdvertBadge, serpConstructorAdvertItem.newAdvertBadge) && this.hasStablePosition == serpConstructorAdvertItem.hasStablePosition && this.isFeatured == serpConstructorAdvertItem.isFeatured && L.f(this.featuredSectionTitle, serpConstructorAdvertItem.featuredSectionTitle) && this.featuredSectionPosition == serpConstructorAdvertItem.featuredSectionPosition && L.f(this.featuredSectionType, serpConstructorAdvertItem.featuredSectionType) && L.f(this.xHash, serpConstructorAdvertItem.xHash) && L.f(this.galleryConfig, serpConstructorAdvertItem.galleryConfig) && L.f(this.gigShiftId, serpConstructorAdvertItem.gigShiftId);
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public Map<String, String> getAdditionalAnalyticsParams() {
        return this.additionalAnalyticsParams;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public Map<String, String> getAnalyticParams() {
        return this.analyticParams;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem, com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getAnalyticsContext */
    public String getF109521b() {
        return this.analyticsContext;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public BadgeSticker getBadgeSticker() {
        return this.badgeSticker;
    }

    @Override // com.avito.android.buy_with_delivery.AsyncBuyWithDeliveryItem
    @Y61.k
    public BuyWithDeliveryLoadingState getBuyWithDeliveryLoadingState() {
        return this.buyWithDeliveryLoadingState;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    public boolean getCanBeHidden() {
        return this.canBeHidden;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public Integer getCategoryId() {
        return this.categoryId;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public Boolean getCvViewed() {
        return this.cvViewed;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public DeepLink getDeepLink() {
        return this.deepLink;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.k
    public SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public List<String> getExposureParams() {
        return this.exposureParams;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem, com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getFavoritesToast */
    public FavoritesToast getF107480p() {
        return this.favoritesToast;
    }

    @Override // com.avito.android.serp.adapter.Z
    public int getFeaturedSectionPosition() {
        return this.featuredSectionPosition;
    }

    @Override // com.avito.android.serp.adapter.Z
    @Y61.k
    public String getFeaturedSectionTitle() {
        return this.featuredSectionTitle;
    }

    @Override // com.avito.android.serp.adapter.Z
    @Y61.k
    public String getFeaturedSectionType() {
        return this.featuredSectionType;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public List<BeduinModel> getFreeForm() {
        return this.freeForm;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public List<AbstractC40112a<BeduinModel, InterfaceC40116e>> getFreeFormConverted() {
        return this.freeFormConverted;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public GalleryConfigModel getGalleryConfig() {
        return this.galleryConfig;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public List<ConstructorAdvertGalleryItemModel> getGalleryItemsList() {
        return this.galleryItemsList;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public Long getGigShiftId() {
        return this.gigShiftId;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    public boolean getHasDiscount() {
        return this.hasDiscount;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    public boolean getHasRealtyLayout() {
        return this.hasRealtyLayout;
    }

    @Override // com.avito.android.serp.adapter.PersistableSerpItem
    /* renamed from: getHasStablePosition */
    public boolean getF272887i() {
        return this.hasStablePosition;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    public boolean getHasVideo() {
        return this.hasVideo;
    }

    @Override // TV0.a
    /* renamed from: getId */
    public long getF272342b() {
        return this.id;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public List<DimmedImage> getImageList() {
        return this.imageList;
    }

    @Override // com.avito.android.serp.adapter.InAppCallsAwareItem
    @Y61.k
    public C34734g0 getInAppCallsAwareItemData() {
        return (C34734g0) this.inAppCallsAwareItemData.getValue();
    }

    @Y61.l
    public final Y41.l<String, G0> getItemClickListener() {
        return this.itemClickListener;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public String getNativeVideoABCategory() {
        return this.nativeVideoABCategory;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public NewAdvertBadge getNewAdvertBadge() {
        return this.newAdvertBadge;
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    @Y61.k
    /* renamed from: getPhoneLoadingState, reason: from getter */
    public PhoneLoadingState getF270910s() {
        return this.phoneLoadingState;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public com.avito.android.constructor_advert.ui.serp.constructor.PriceModel getPrice() {
        return this.price;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public Boolean getReserved() {
        return this.reserved;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public SellerInfoModel getSellerInfo() {
        return this.sellerInfo;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public SellerOnline getSellerOnline() {
        return this.sellerOnline;
    }

    @Y61.k
    public ServiceOrderRequestLoadingState getServiceOrderRequestLoadingState() {
        return this.serviceOrderRequestLoadingState;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.k
    public SnippetSize getSize() {
        return this.size;
    }

    @Override // com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount */
    public int getF272344d() {
        int i12 = b.f269458a[ConstructorAdvertNetworkModelKt.orDefault(getSize()).ordinal()];
        if (i12 != 1) {
            if (i12 != 2) {
                if (i12 == 3) {
                    return 6;
                }
                throw new NoWhenBranchMatchedException();
            }
        } else if (getDisplayType() != SerpDisplayType.Rich) {
            return 1;
        }
        return 2;
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public String getF429430f() {
        return this.stringId;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public String getTitle() {
        return this.title;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem, com.avito.android.serp.adapter.S
    @Y61.l
    /* renamed from: getVerticalAlias */
    public AdvertisementVerticalAlias getF109522c() {
        return this.verticalAlias;
    }

    @Override // com.avito.android.serp.adapter.l1
    @Y61.k
    /* renamed from: getViewType, reason: from getter */
    public SerpViewType getF272350j() {
        return this.viewType;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public String getXHash() {
        return this.xHash;
    }

    public int hashCode() {
        int iHashCode = (this.size.hashCode() + H.d(Long.hashCode(this.id) * 31, 31, this.stringId)) * 31;
        String str = this.title;
        int iHashCode2 = (iHashCode + (str == null ? 0 : str.hashCode())) * 31;
        com.avito.android.constructor_advert.ui.serp.constructor.PriceModel priceModel = this.price;
        int iHashCode3 = (iHashCode2 + (priceModel == null ? 0 : priceModel.hashCode())) * 31;
        DeepLink deepLink = this.deepLink;
        int iHashCode4 = (iHashCode3 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        List<DimmedImage> list = this.imageList;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<ConstructorAdvertGalleryItemModel> list2 = this.galleryItemsList;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        SerpBadgeBar serpBadgeBar = this.badgeBar;
        int iHashCode7 = (iHashCode6 + (serpBadgeBar == null ? 0 : serpBadgeBar.hashCode())) * 31;
        BadgeSticker badgeSticker = this.badgeSticker;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode7 + (badgeSticker == null ? 0 : badgeSticker.hashCode())) * 31, 31, this.isDelivery), 31, this.hasDiscount);
        String str2 = this.nativeVideoABCategory;
        int iHashCode8 = (i12 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<String> list3 = this.exposureParams;
        int iHashCode9 = (iHashCode8 + (list3 == null ? 0 : list3.hashCode())) * 31;
        List<BeduinModel> list4 = this.freeForm;
        int iHashCode10 = (iHashCode9 + (list4 == null ? 0 : list4.hashCode())) * 31;
        Boolean bool = this.reserved;
        int i13 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31, 31, this.isViewed), 31, this.isFavorite), 31, this.canBeHidden), 31, this.isHidden);
        String str3 = this.analyticsContext;
        int iHashCode11 = (i13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        AdvertisementVerticalAlias advertisementVerticalAlias = this.verticalAlias;
        int iHashCode12 = (iHashCode11 + (advertisementVerticalAlias == null ? 0 : advertisementVerticalAlias.hashCode())) * 31;
        FavoritesToast favoritesToast = this.favoritesToast;
        int iH2 = com.avito.android.actions_sheet.a.h(this.displayType, (iHashCode12 + (favoritesToast == null ? 0 : favoritesToast.hashCode())) * 31, 31);
        Map<String, String> map = this.analyticParams;
        int iHashCode13 = (iH2 + (map == null ? 0 : map.hashCode())) * 31;
        Map<String, String> map2 = this.additionalAnalyticsParams;
        int i14 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode13 + (map2 == null ? 0 : map2.hashCode())) * 31, 31, this.isExternalAd), 31, this.hasVideo), 31, this.hasRealtyLayout), 31, this.isRedesign), 31, this.isStrRedesign), 31, this.isUnavailable), 31, this.isExtendedGallery);
        Boolean bool2 = this.cvViewed;
        int iHashCode14 = (i14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCvHidden;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Integer num = this.categoryId;
        int iHashCode16 = (iHashCode15 + (num == null ? 0 : num.hashCode())) * 31;
        SellerInfoModel sellerInfoModel = this.sellerInfo;
        int iHashCode17 = (iHashCode16 + (sellerInfoModel == null ? 0 : sellerInfoModel.hashCode())) * 31;
        SellerOnline sellerOnline = this.sellerOnline;
        int iHashCode18 = (iHashCode17 + (sellerOnline == null ? 0 : sellerOnline.hashCode())) * 31;
        NewAdvertBadge newAdvertBadge = this.newAdvertBadge;
        int iD2 = H.d(androidx.appcompat.app.r.e(this.featuredSectionPosition, H.d(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode18 + (newAdvertBadge == null ? 0 : newAdvertBadge.hashCode())) * 31, 31, this.hasStablePosition), 31, this.isFeatured), 31, this.featuredSectionTitle), 31), 31, this.featuredSectionType);
        String str4 = this.xHash;
        int iHashCode19 = (iD2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        GalleryConfigModel galleryConfigModel = this.galleryConfig;
        int iHashCode20 = (iHashCode19 + (galleryConfigModel == null ? 0 : galleryConfigModel.hashCode())) * 31;
        Long l12 = this.gigShiftId;
        return iHashCode20 + (l12 != null ? l12.hashCode() : 0);
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public Boolean isCvHidden() {
        return this.isCvHidden;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    public boolean isDelivery() {
        return this.isDelivery;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    public boolean isExtendedGallery() {
        return this.isExtendedGallery;
    }

    public boolean isExternalAd() {
        return this.isExternalAd;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem, com.avito.android.serp.adapter.S
    /* renamed from: isFavorite */
    public boolean getF107475k() {
        return this.isFavorite;
    }

    @Override // com.avito.android.serp.adapter.Z
    public boolean isFeatured() {
        return this.isFeatured;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    public boolean isHidden() {
        return this.isHidden;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    public boolean isRedesign() {
        return this.isRedesign;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    public boolean isStrRedesign() {
        return this.isStrRedesign;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    public boolean isUnavailable() {
        return this.isUnavailable;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem, com.avito.android.serp.adapter.m1
    /* renamed from: isViewed */
    public boolean getF107481q() {
        return this.isViewed;
    }

    public void setBuyWithDeliveryLoadingState(@Y61.k BuyWithDeliveryLoadingState buyWithDeliveryLoadingState) {
        this.buyWithDeliveryLoadingState = buyWithDeliveryLoadingState;
    }

    public void setCvViewed(@Y61.l Boolean bool) {
        this.cvViewed = bool;
    }

    public void setDisplayType(@Y61.k SerpDisplayType serpDisplayType) {
        this.displayType = serpDisplayType;
    }

    @Override // com.avito.android.serp.adapter.S
    public void setFavorite(boolean z12) {
        this.isFavorite = z12;
    }

    public void setFreeFormConverted(@Y61.l List<? extends AbstractC40112a<BeduinModel, InterfaceC40116e>> list) {
        this.freeFormConverted = list;
    }

    @Override // La.b
    public void setHidden(boolean z12) {
        this.isHidden = z12;
    }

    public final void setItemClickListener(@Y61.l Y41.l<? super String, G0> lVar) {
        this.itemClickListener = lVar;
    }

    @Override // com.avito.android.async_phone.AsyncPhoneItem
    public void setPhoneLoadingState(@Y61.k PhoneLoadingState phoneLoadingState) {
        this.phoneLoadingState = phoneLoadingState;
    }

    public void setServiceOrderRequestLoadingState(@Y61.k ServiceOrderRequestLoadingState serviceOrderRequestLoadingState) {
        this.serviceOrderRequestLoadingState = serviceOrderRequestLoadingState;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem, com.avito.android.serp.adapter.m1
    public void setViewed(boolean z12) {
        this.isViewed = z12;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SerpConstructorAdvertItem(id=");
        sb2.append(this.id);
        sb2.append(", stringId=");
        sb2.append(this.stringId);
        sb2.append(", size=");
        sb2.append(this.size);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", deepLink=");
        sb2.append(this.deepLink);
        sb2.append(", imageList=");
        sb2.append(this.imageList);
        sb2.append(", galleryItemsList=");
        sb2.append(this.galleryItemsList);
        sb2.append(", badgeBar=");
        sb2.append(this.badgeBar);
        sb2.append(", badgeSticker=");
        sb2.append(this.badgeSticker);
        sb2.append(", isDelivery=");
        sb2.append(this.isDelivery);
        sb2.append(", hasDiscount=");
        sb2.append(this.hasDiscount);
        sb2.append(", nativeVideoABCategory=");
        sb2.append(this.nativeVideoABCategory);
        sb2.append(", exposureParams=");
        sb2.append(this.exposureParams);
        sb2.append(", freeForm=");
        sb2.append(this.freeForm);
        sb2.append(", reserved=");
        sb2.append(this.reserved);
        sb2.append(", isViewed=");
        sb2.append(this.isViewed);
        sb2.append(", isFavorite=");
        sb2.append(this.isFavorite);
        sb2.append(", canBeHidden=");
        sb2.append(this.canBeHidden);
        sb2.append(", isHidden=");
        sb2.append(this.isHidden);
        sb2.append(", analyticsContext=");
        sb2.append(this.analyticsContext);
        sb2.append(", verticalAlias=");
        sb2.append(this.verticalAlias);
        sb2.append(", favoritesToast=");
        sb2.append(this.favoritesToast);
        sb2.append(", displayType=");
        sb2.append(this.displayType);
        sb2.append(", analyticParams=");
        sb2.append(this.analyticParams);
        sb2.append(", additionalAnalyticsParams=");
        sb2.append(this.additionalAnalyticsParams);
        sb2.append(", isExternalAd=");
        sb2.append(this.isExternalAd);
        sb2.append(", hasVideo=");
        sb2.append(this.hasVideo);
        sb2.append(", hasRealtyLayout=");
        sb2.append(this.hasRealtyLayout);
        sb2.append(", isRedesign=");
        sb2.append(this.isRedesign);
        sb2.append(", isStrRedesign=");
        sb2.append(this.isStrRedesign);
        sb2.append(", isUnavailable=");
        sb2.append(this.isUnavailable);
        sb2.append(", isExtendedGallery=");
        sb2.append(this.isExtendedGallery);
        sb2.append(", cvViewed=");
        sb2.append(this.cvViewed);
        sb2.append(", isCvHidden=");
        sb2.append(this.isCvHidden);
        sb2.append(", categoryId=");
        sb2.append(this.categoryId);
        sb2.append(", sellerInfo=");
        sb2.append(this.sellerInfo);
        sb2.append(", sellerOnline=");
        sb2.append(this.sellerOnline);
        sb2.append(", newAdvertBadge=");
        sb2.append(this.newAdvertBadge);
        sb2.append(", hasStablePosition=");
        sb2.append(this.hasStablePosition);
        sb2.append(", isFeatured=");
        sb2.append(this.isFeatured);
        sb2.append(", featuredSectionTitle=");
        sb2.append(this.featuredSectionTitle);
        sb2.append(", featuredSectionPosition=");
        sb2.append(this.featuredSectionPosition);
        sb2.append(", featuredSectionType=");
        sb2.append(this.featuredSectionType);
        sb2.append(", xHash=");
        sb2.append(this.xHash);
        sb2.append(", galleryConfig=");
        sb2.append(this.galleryConfig);
        sb2.append(", gigShiftId=");
        return androidx.media3.exoplayer.analytics.m.m(sb2, this.gigShiftId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeLong(this.id);
        parcel.writeString(this.stringId);
        parcel.writeString(this.size.name());
        parcel.writeString(this.title);
        parcel.writeParcelable(this.price, flags);
        parcel.writeParcelable(this.deepLink, flags);
        List<DimmedImage> list = this.imageList;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        List<ConstructorAdvertGalleryItemModel> list2 = this.galleryItemsList;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = com.avito.android.actions_sheet.a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeParcelable(this.badgeBar, flags);
        parcel.writeParcelable(this.badgeSticker, flags);
        parcel.writeInt(this.isDelivery ? 1 : 0);
        parcel.writeInt(this.hasDiscount ? 1 : 0);
        parcel.writeString(this.nativeVideoABCategory);
        parcel.writeStringList(this.exposureParams);
        List<BeduinModel> list3 = this.freeForm;
        if (list3 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA3 = com.avito.android.actions_sheet.a.A(list3, parcel, 1);
            while (itA3.hasNext()) {
                parcel.writeParcelable((Parcelable) itA3.next(), flags);
            }
        }
        Boolean bool = this.reserved;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeInt(this.isViewed ? 1 : 0);
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeInt(this.canBeHidden ? 1 : 0);
        parcel.writeInt(this.isHidden ? 1 : 0);
        parcel.writeString(this.analyticsContext);
        AdvertisementVerticalAlias advertisementVerticalAlias = this.verticalAlias;
        if (advertisementVerticalAlias == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(advertisementVerticalAlias.name());
        }
        parcel.writeParcelable(this.favoritesToast, flags);
        parcel.writeString(this.displayType.name());
        Map<String, String> map = this.analyticParams;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeString((String) entry.getValue());
            }
        }
        Map<String, String> map2 = this.additionalAnalyticsParams;
        if (map2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH2 = C0.h(parcel, 1, map2);
            while (itH2.hasNext()) {
                Map.Entry entry2 = (Map.Entry) itH2.next();
                parcel.writeString((String) entry2.getKey());
                parcel.writeString((String) entry2.getValue());
            }
        }
        parcel.writeInt(this.isExternalAd ? 1 : 0);
        parcel.writeInt(this.hasVideo ? 1 : 0);
        parcel.writeInt(this.hasRealtyLayout ? 1 : 0);
        parcel.writeInt(this.isRedesign ? 1 : 0);
        parcel.writeInt(this.isStrRedesign ? 1 : 0);
        parcel.writeInt(this.isUnavailable ? 1 : 0);
        parcel.writeInt(this.isExtendedGallery ? 1 : 0);
        Boolean bool2 = this.cvViewed;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.isCvHidden;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Integer num = this.categoryId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeParcelable(this.sellerInfo, flags);
        parcel.writeParcelable(this.sellerOnline, flags);
        parcel.writeParcelable(this.newAdvertBadge, flags);
        parcel.writeInt(this.hasStablePosition ? 1 : 0);
        parcel.writeInt(this.isFeatured ? 1 : 0);
        parcel.writeString(this.featuredSectionTitle);
        parcel.writeInt(this.featuredSectionPosition);
        parcel.writeString(this.featuredSectionType);
        parcel.writeString(this.xHash);
        parcel.writeParcelable(this.galleryConfig, flags);
        Long l12 = this.gigShiftId;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
    }

    public static /* synthetic */ void getFreeFormConverted$annotations() {
    }

    public static /* synthetic */ void getInAppCallsAwareItemData$annotations() {
    }

    public /* synthetic */ SerpConstructorAdvertItem(long j12, String str, SnippetSize snippetSize, String str2, com.avito.android.constructor_advert.ui.serp.constructor.PriceModel priceModel, DeepLink deepLink, List list, List list2, SerpBadgeBar serpBadgeBar, BadgeSticker badgeSticker, boolean z12, boolean z13, String str3, List list3, List list4, Boolean bool, boolean z14, boolean z15, boolean z16, boolean z17, String str4, AdvertisementVerticalAlias advertisementVerticalAlias, FavoritesToast favoritesToast, SerpDisplayType serpDisplayType, Map map, Map map2, boolean z18, boolean z19, boolean z22, boolean z23, boolean z24, boolean z25, boolean z26, Boolean bool2, Boolean bool3, Integer num, SellerInfoModel sellerInfoModel, SellerOnline sellerOnline, NewAdvertBadge newAdvertBadge, boolean z27, boolean z28, String str5, int i12, String str6, String str7, GalleryConfigModel galleryConfigModel, Long l12, int i13, int i14, C42822w c42822w) {
        this(j12, str, snippetSize, str2, priceModel, deepLink, list, list2, serpBadgeBar, badgeSticker, z12, z13, (i13 & 4096) != 0 ? null : str3, (i13 & 8192) != 0 ? null : list3, list4, bool, z14, z15, (262144 & i13) != 0 ? true : z16, (i13 & 524288) != 0 ? false : z17, str4, advertisementVerticalAlias, favoritesToast, serpDisplayType, map, map2, z18, z19, z22, z23, z24, z25, z26, (i14 & 2) != 0 ? null : bool2, (i14 & 4) != 0 ? null : bool3, (i14 & 8) != 0 ? null : num, sellerInfoModel, (i14 & 32) != 0 ? null : sellerOnline, (i14 & 64) != 0 ? null : newAdvertBadge, (i14 & 128) != 0 ? false : z27, (i14 & 256) != 0 ? false : z28, str5, i12, str6, (i14 & 4096) != 0 ? null : str7, (i14 & 8192) != 0 ? null : galleryConfigModel, l12);
    }
}
