package com.avito.android.constructor_advert.ui.serp.constructor;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin_models.BeduinModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.AdvertDetailsBlockIdKt;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.ConstructorAdvertGalleryItemModel;
import com.avito.android.remote.model.DimmedImage;
import com.avito.android.remote.model.FavoritesToast;
import com.avito.android.remote.model.GalleryConfigModel;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SellerOnline;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SnippetSize;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.new_advert_badge.NewAdvertBadge;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.serp.adapter.C34734g0;
import ej.AbstractC40112a;
import ej.InterfaceC40116e;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.C42727D;
import kotlin.InterfaceC42726C;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;

/* compiled from: ConstructorAdvertItem.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000È\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\bK\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002Bý\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u000e\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u000e\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0015\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\b\b\u0002\u0010\u0019\u001a\u00020\u0017\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0005\u0012\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e\u0012\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0017\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\b\u0002\u0010!\u001a\u00020\u0017\u0012\u0006\u0010\"\u001a\u00020\u0017\u0012\b\b\u0002\u0010#\u001a\u00020\u0017\u0012\b\b\u0002\u0010$\u001a\u00020\u0017\u0012\b\u0010%\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010&\u0012\b\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\u0006\u0010,\u001a\u00020\u0017\u0012\u0006\u0010-\u001a\u00020\u0017\u0012\u0006\u0010.\u001a\u00020\u0017\u0012\u0006\u0010/\u001a\u00020\u0017\u0012\u0006\u00100\u001a\u00020\u0017\u0012\u0006\u00101\u001a\u00020\u0017\u0012\b\u00102\u001a\u0004\u0018\u00010\u0017\u0012\b\u00103\u001a\u0004\u0018\u00010\u0017\u0012\b\u00105\u001a\u0004\u0018\u000104\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u000106\u0012\u0006\u00108\u001a\u000206\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;\u0012\b\b\u0002\u0010=\u001a\u00020\u0017\u0012\u0006\u0010>\u001a\u00020\u0005\u0012\u0006\u0010?\u001a\u000206\u0012\u0006\u0010@\u001a\u00020\u0005\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010&\u0012\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C\u0012\b\u0010E\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bN\u0010KJ\u0012\u0010O\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0018\u0010S\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bS\u0010TJ\u0018\u0010U\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bU\u0010TJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bV\u0010WJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0015HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\b\\\u0010[J\u0012\u0010]\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b]\u0010KJ\u0018\u0010^\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b^\u0010TJ\u0018\u0010_\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b_\u0010TJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0010\u0010b\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bd\u0010[J\u0010\u0010e\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\be\u0010[J\u0010\u0010f\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bf\u0010[J\u0010\u0010g\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bg\u0010[J\u0012\u0010h\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bh\u0010KJ\u001e\u0010i\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010&HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0012\u0010k\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0012\u0010m\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0010\u0010o\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bo\u0010[J\u0010\u0010p\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bp\u0010[J\u0010\u0010q\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bq\u0010[J\u0010\u0010r\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\br\u0010[J\u0010\u0010s\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bs\u0010[J\u0010\u0010t\u001a\u00020\u0017HÆ\u0003¢\u0006\u0004\bt\u0010[J\u0012\u0010u\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bu\u0010aJ\u0012\u0010v\u001a\u0004\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\bv\u0010aJ\u0012\u0010w\u001a\u0004\u0018\u000104HÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0012\u0010y\u001a\u0004\u0018\u000106HÆ\u0003¢\u0006\u0004\by\u0010zJ\u0010\u0010{\u001a\u000206HÆ\u0003¢\u0006\u0004\b{\u0010|J\u0012\u0010}\u001a\u0004\u0018\u000109HÆ\u0003¢\u0006\u0004\b}\u0010~J\u0013\u0010\u007f\u001a\u0004\u0018\u00010;HÆ\u0003¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u00020\u0017HÆ\u0003¢\u0006\u0005\b\u0081\u0001\u0010[J\u0012\u0010\u0082\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0082\u0001\u0010KJ\u0012\u0010\u0083\u0001\u001a\u000206HÆ\u0003¢\u0006\u0005\b\u0083\u0001\u0010|J\u0012\u0010\u0084\u0001\u001a\u00020\u0005HÆ\u0003¢\u0006\u0005\b\u0084\u0001\u0010KJ\u0014\u0010\u0085\u0001\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0005\b\u0085\u0001\u0010KJ \u0010\u0086\u0001\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010&HÆ\u0003¢\u0006\u0005\b\u0086\u0001\u0010jJ\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010CHÆ\u0003¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0015\u0010\u0089\u0001\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001JÁ\u0004\u0010\u008b\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u0010\b\u0002\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\u0010\b\u0002\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e2\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00132\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00152\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\u00172\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00052\u0010\b\u0002\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e2\u0010\b\u0002\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00172\b\b\u0002\u0010 \u001a\u00020\u001f2\b\b\u0002\u0010!\u001a\u00020\u00172\b\b\u0002\u0010\"\u001a\u00020\u00172\b\b\u0002\u0010#\u001a\u00020\u00172\b\b\u0002\u0010$\u001a\u00020\u00172\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020\u00172\b\b\u0002\u0010-\u001a\u00020\u00172\b\b\u0002\u0010.\u001a\u00020\u00172\b\b\u0002\u0010/\u001a\u00020\u00172\b\b\u0002\u00100\u001a\u00020\u00172\b\b\u0002\u00101\u001a\u00020\u00172\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00172\n\b\u0002\u00105\u001a\u0004\u0018\u0001042\n\b\u0002\u00107\u001a\u0004\u0018\u0001062\b\b\u0002\u00108\u001a\u0002062\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\n\b\u0002\u0010<\u001a\u0004\u0018\u00010;2\b\b\u0002\u0010=\u001a\u00020\u00172\b\b\u0002\u0010>\u001a\u00020\u00052\b\b\u0002\u0010?\u001a\u0002062\b\b\u0002\u0010@\u001a\u00020\u00052\n\b\u0002\u0010A\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010&2\n\b\u0002\u0010D\u001a\u0004\u0018\u00010C2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0012\u0010\u008d\u0001\u001a\u00020\u0005HÖ\u0001¢\u0006\u0005\b\u008d\u0001\u0010KJ\u0012\u0010\u008e\u0001\u001a\u000206HÖ\u0001¢\u0006\u0005\b\u008e\u0001\u0010|J\u001f\u0010\u0091\u0001\u001a\u00020\u00172\n\u0010\u0090\u0001\u001a\u0005\u0018\u00010\u008f\u0001HÖ\u0003¢\u0006\u0006\b\u0091\u0001\u0010\u0092\u0001J\u0012\u0010\u0093\u0001\u001a\u000206HÖ\u0001¢\u0006\u0005\b\u0093\u0001\u0010|J'\u0010\u0098\u0001\u001a\u00030\u0097\u00012\b\u0010\u0095\u0001\u001a\u00030\u0094\u00012\u0007\u0010\u0096\u0001\u001a\u000206HÖ\u0001¢\u0006\u0006\b\u0098\u0001\u0010\u0099\u0001R\u001c\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0004\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010IR\u001c\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010\u009c\u0001\u001a\u0005\b\u009d\u0001\u0010KR\u001c\u0010\b\u001a\u00020\u00078\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\b\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010MR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u009c\u0001\u001a\u0005\b \u0001\u0010KR\u001e\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010PR\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\r\u0010£\u0001\u001a\u0005\b¤\u0001\u0010RR$\u0010\u0010\u001a\n\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010¥\u0001\u001a\u0005\b¦\u0001\u0010TR$\u0010\u0012\u001a\n\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010¥\u0001\u001a\u0005\b§\u0001\u0010TR\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010¨\u0001\u001a\u0005\b©\u0001\u0010WR\u001e\u0010\u0016\u001a\u0004\u0018\u00010\u00158\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0016\u0010ª\u0001\u001a\u0005\b«\u0001\u0010YR\u001b\u0010\u0018\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\r\n\u0005\b\u0018\u0010¬\u0001\u001a\u0004\b\u0018\u0010[R\u001c\u0010\u0019\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010[R\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u009c\u0001\u001a\u0005\b®\u0001\u0010KR$\u0010\u001b\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010¥\u0001\u001a\u0005\b¯\u0001\u0010TR$\u0010\u001d\u001a\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\u000e8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010¥\u0001\u001a\u0005\b°\u0001\u0010TR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010±\u0001\u001a\u0005\b²\u0001\u0010aR&\u0010 \u001a\u00020\u001f8\u0016@\u0016X\u0096\u000e¢\u0006\u0016\n\u0005\b \u0010³\u0001\u001a\u0005\b´\u0001\u0010c\"\u0006\bµ\u0001\u0010¶\u0001R%\u0010!\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b!\u0010¬\u0001\u001a\u0004\b!\u0010[\"\u0006\b·\u0001\u0010¸\u0001R%\u0010\"\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b\"\u0010¬\u0001\u001a\u0004\b\"\u0010[\"\u0006\b¹\u0001\u0010¸\u0001R\u001c\u0010#\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b#\u0010¬\u0001\u001a\u0005\bº\u0001\u0010[R%\u0010$\u001a\u00020\u00178\u0016@\u0016X\u0096\u000e¢\u0006\u0015\n\u0005\b$\u0010¬\u0001\u001a\u0004\b$\u0010[\"\u0006\b»\u0001\u0010¸\u0001R\u001e\u0010%\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b%\u0010\u009c\u0001\u001a\u0005\b¼\u0001\u0010KR*\u0010'\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010&8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b'\u0010½\u0001\u001a\u0005\b¾\u0001\u0010jR\u001e\u0010)\u001a\u0004\u0018\u00010(8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b)\u0010¿\u0001\u001a\u0005\bÀ\u0001\u0010lR\u001e\u0010+\u001a\u0004\u0018\u00010*8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b+\u0010Á\u0001\u001a\u0005\bÂ\u0001\u0010nR\u001c\u0010,\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b,\u0010¬\u0001\u001a\u0005\bÃ\u0001\u0010[R\u001c\u0010-\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b-\u0010¬\u0001\u001a\u0005\bÄ\u0001\u0010[R\u001b\u0010.\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\r\n\u0005\b.\u0010¬\u0001\u001a\u0004\b.\u0010[R\u001b\u0010/\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\r\n\u0005\b/\u0010¬\u0001\u001a\u0004\b/\u0010[R\u001b\u00100\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\r\n\u0005\b0\u0010¬\u0001\u001a\u0004\b0\u0010[R\u001b\u00101\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\r\n\u0005\b1\u0010¬\u0001\u001a\u0004\b1\u0010[R\u001e\u00102\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b2\u0010±\u0001\u001a\u0005\bÅ\u0001\u0010aR\u001d\u00103\u001a\u0004\u0018\u00010\u00178\u0016X\u0096\u0004¢\u0006\r\n\u0005\b3\u0010±\u0001\u001a\u0004\b3\u0010aR\u001e\u00105\u001a\u0004\u0018\u0001048\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b5\u0010Æ\u0001\u001a\u0005\bÇ\u0001\u0010xR\u001e\u00107\u001a\u0004\u0018\u0001068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b7\u0010È\u0001\u001a\u0005\bÉ\u0001\u0010zR\u001c\u00108\u001a\u0002068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b8\u0010Ê\u0001\u001a\u0005\bË\u0001\u0010|R\u001e\u0010:\u001a\u0004\u0018\u0001098\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b:\u0010Ì\u0001\u001a\u0005\bÍ\u0001\u0010~R\u001f\u0010<\u001a\u0004\u0018\u00010;8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\b<\u0010Î\u0001\u001a\u0006\bÏ\u0001\u0010\u0080\u0001R\u001b\u0010=\u001a\u00020\u00178\u0016X\u0096\u0004¢\u0006\r\n\u0005\b=\u0010¬\u0001\u001a\u0004\b=\u0010[R\u001c\u0010>\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b>\u0010\u009c\u0001\u001a\u0005\bÐ\u0001\u0010KR\u001c\u0010?\u001a\u0002068\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b?\u0010Ê\u0001\u001a\u0005\bÑ\u0001\u0010|R\u001c\u0010@\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\b@\u0010\u009c\u0001\u001a\u0005\bÒ\u0001\u0010KR\u001e\u0010A\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bA\u0010\u009c\u0001\u001a\u0005\bÓ\u0001\u0010KR*\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010&8\u0016X\u0096\u0004¢\u0006\u000e\n\u0005\bB\u0010½\u0001\u001a\u0005\bÔ\u0001\u0010jR\u001f\u0010D\u001a\u0004\u0018\u00010C8\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bD\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010\u0088\u0001R\u001f\u0010E\u001a\u0004\u0018\u00010\u00038\u0016X\u0096\u0004¢\u0006\u000f\n\u0005\bE\u0010×\u0001\u001a\u0006\bØ\u0001\u0010\u008a\u0001RK\u0010Ü\u0001\u001a\u001d\u0012\u0017\u0012\u0015\u0012\u0004\u0012\u00020\u001c\u0012\u0005\u0012\u00030Ú\u00010Ù\u0001j\u0003`Û\u0001\u0018\u00010\u000e8\u0016@\u0016X\u0096\u000e¢\u0006\u001f\n\u0006\bÜ\u0001\u0010¥\u0001\u0012\u0006\bà\u0001\u0010á\u0001\u001a\u0005\bÝ\u0001\u0010T\"\u0006\bÞ\u0001\u0010ß\u0001R)\u0010è\u0001\u001a\u00030â\u00018VX\u0096\u0084\u0002¢\u0006\u0018\n\u0006\bã\u0001\u0010ä\u0001\u0012\u0006\bç\u0001\u0010á\u0001\u001a\u0006\bå\u0001\u0010æ\u0001¨\u0006é\u0001"}, d2 = {"Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItemImpl;", "Landroid/os/Parcelable;", "Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItem;", "", "id", "", "stringId", "Lcom/avito/android/remote/model/SnippetSize;", "size", "title", "Lcom/avito/android/constructor_advert/ui/serp/constructor/PriceModel;", "price", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "", "Lcom/avito/android/remote/model/DimmedImage;", "imageList", "Lcom/avito/android/remote/model/ConstructorAdvertGalleryItemModel;", "galleryItemsList", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "badgeSticker", "", "isDelivery", "hasDiscount", "nativeVideoABCategory", "exposureParams", "Lcom/avito/android/beduin_models/BeduinModel;", "freeForm", "reserved", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "isViewed", "isFavorite", "canBeHidden", "isHidden", "analyticsContext", "", "analyticParams", "Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "verticalAlias", "Lcom/avito/android/remote/model/FavoritesToast;", "favoritesToast", "hasVideo", "hasRealtyLayout", "isRedesign", "isStrRedesign", "isUnavailable", "isExtendedGallery", "cvViewed", "isCvHidden", "Lcom/avito/android/constructor_advert/ui/serp/constructor/SellerInfoModel;", "sellerInfo", "", "categoryId", "spanCount", "Lcom/avito/android/remote/model/SellerOnline;", "sellerOnline", "Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;", "newAdvertBadge", "isFeatured", "featuredSectionTitle", "featuredSectionPosition", "featuredSectionType", "xHash", "additionalAnalyticsParams", "Lcom/avito/android/remote/model/GalleryConfigModel;", "galleryConfig", "gigShiftId", "<init>", "(JLjava/lang/String;Lcom/avito/android/remote/model/SnippetSize;Ljava/lang/String;Lcom/avito/android/constructor_advert/ui/serp/constructor/PriceModel;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/remote/model/sales/utils/BadgeSticker;ZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/SerpDisplayType;ZZZZLjava/lang/String;Ljava/util/Map;Lcom/avito/android/remote/model/AdvertisementVerticalAlias;Lcom/avito/android/remote/model/FavoritesToast;ZZZZZZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/constructor_advert/ui/serp/constructor/SellerInfoModel;Ljava/lang/Integer;ILcom/avito/android/remote/model/SellerOnline;Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/remote/model/GalleryConfigModel;Ljava/lang/Long;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/remote/model/SnippetSize;", "component4", "component5", "()Lcom/avito/android/constructor_advert/ui/serp/constructor/PriceModel;", "component6", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component7", "()Ljava/util/List;", "component8", "component9", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "component10", "()Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "component11", "()Z", "component12", "component13", "component14", "component15", "component16", "()Ljava/lang/Boolean;", "component17", "()Lcom/avito/android/remote/model/SerpDisplayType;", "component18", "component19", "component20", "component21", "component22", "component23", "()Ljava/util/Map;", "component24", "()Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "component25", "()Lcom/avito/android/remote/model/FavoritesToast;", "component26", "component27", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "()Lcom/avito/android/constructor_advert/ui/serp/constructor/SellerInfoModel;", "component35", "()Ljava/lang/Integer;", "component36", "()I", "component37", "()Lcom/avito/android/remote/model/SellerOnline;", "component38", "()Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;", "component39", "component40", "component41", "component42", "component43", "component44", "component45", "()Lcom/avito/android/remote/model/GalleryConfigModel;", "component46", "()Ljava/lang/Long;", "copy", "(JLjava/lang/String;Lcom/avito/android/remote/model/SnippetSize;Ljava/lang/String;Lcom/avito/android/constructor_advert/ui/serp/constructor/PriceModel;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/util/List;Ljava/util/List;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Lcom/avito/android/remote/model/sales/utils/BadgeSticker;ZZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/lang/Boolean;Lcom/avito/android/remote/model/SerpDisplayType;ZZZZLjava/lang/String;Ljava/util/Map;Lcom/avito/android/remote/model/AdvertisementVerticalAlias;Lcom/avito/android/remote/model/FavoritesToast;ZZZZZZLjava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/constructor_advert/ui/serp/constructor/SellerInfoModel;Ljava/lang/Integer;ILcom/avito/android/remote/model/SellerOnline;Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;ZLjava/lang/String;ILjava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/remote/model/GalleryConfigModel;Ljava/lang/Long;)Lcom/avito/android/constructor_advert/ui/serp/constructor/ConstructorAdvertItemImpl;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getStringId", "Lcom/avito/android/remote/model/SnippetSize;", "getSize", "getTitle", "Lcom/avito/android/constructor_advert/ui/serp/constructor/PriceModel;", "getPrice", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/util/List;", "getImageList", "getGalleryItemsList", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "getBadgeBar", "Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "getBadgeSticker", "Z", "getHasDiscount", "getNativeVideoABCategory", "getExposureParams", "getFreeForm", "Ljava/lang/Boolean;", "getReserved", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "setDisplayType", "(Lcom/avito/android/remote/model/SerpDisplayType;)V", "setViewed", "(Z)V", "setFavorite", "getCanBeHidden", "setHidden", "getAnalyticsContext", "Ljava/util/Map;", "getAnalyticParams", "Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "getVerticalAlias", "Lcom/avito/android/remote/model/FavoritesToast;", "getFavoritesToast", "getHasVideo", "getHasRealtyLayout", "getCvViewed", "Lcom/avito/android/constructor_advert/ui/serp/constructor/SellerInfoModel;", "getSellerInfo", "Ljava/lang/Integer;", "getCategoryId", "I", "getSpanCount", "Lcom/avito/android/remote/model/SellerOnline;", "getSellerOnline", "Lcom/avito/android/remote/model/new_advert_badge/NewAdvertBadge;", "getNewAdvertBadge", "getFeaturedSectionTitle", "getFeaturedSectionPosition", "getFeaturedSectionType", "getXHash", "getAdditionalAnalyticsParams", "Lcom/avito/android/remote/model/GalleryConfigModel;", "getGalleryConfig", "Ljava/lang/Long;", "getGigShiftId", "Lej/a;", "Lej/e;", "Lcom/avito/android/beduin_shared/model/component/BeduinComponentItem;", "freeFormConverted", "getFreeFormConverted", "setFreeFormConverted", "(Ljava/util/List;)V", "getFreeFormConverted$annotations", "()V", "Lcom/avito/android/serp/adapter/g0;", "inAppCallsAwareItemData$delegate", "Lkotlin/C;", "getInAppCallsAwareItemData", "()Lcom/avito/android/serp/adapter/g0;", "getInAppCallsAwareItemData$annotations", "inAppCallsAwareItemData", "_avito_constructor-advert_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class ConstructorAdvertItemImpl implements Parcelable, ConstructorAdvertItem {

    @Y61.k
    public static final Parcelable.Creator<ConstructorAdvertItemImpl> CREATOR = new a();

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
    private final boolean canBeHidden;

    @Y61.l
    private final Integer categoryId;

    @Y61.l
    private final Boolean cvViewed;

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
    private boolean isFavorite;
    private final boolean isFeatured;
    private boolean isHidden;
    private final boolean isRedesign;
    private final boolean isStrRedesign;
    private final boolean isUnavailable;
    private boolean isViewed;

    @Y61.l
    private final String nativeVideoABCategory;

    @Y61.l
    private final NewAdvertBadge newAdvertBadge;

    @Y61.l
    private final PriceModel price;

    @Y61.l
    private final Boolean reserved;

    @Y61.l
    private final SellerInfoModel sellerInfo;

    @Y61.l
    private final SellerOnline sellerOnline;

    @Y61.k
    private final SnippetSize size;
    private final int spanCount;

    @Y61.k
    private final String stringId;

    @Y61.l
    private final String title;

    @Y61.l
    private final AdvertisementVerticalAlias verticalAlias;

    @Y61.l
    private final String xHash;

    /* compiled from: ConstructorAdvertItem.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<ConstructorAdvertItemImpl> {
        @Override // android.os.Parcelable.Creator
        public final ConstructorAdvertItemImpl createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            boolean z12;
            ArrayList arrayList3;
            Boolean boolValueOf;
            BadgeSticker badgeSticker;
            LinkedHashMap linkedHashMap;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            LinkedHashMap linkedHashMap2;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            SnippetSize snippetSizeValueOf = SnippetSize.valueOf(parcel.readString());
            String string2 = parcel.readString();
            PriceModel priceModelCreateFromParcel = parcel.readInt() == 0 ? null : PriceModel.CREATOR.createFromParcel(parcel);
            DeepLink deepLink = (DeepLink) parcel.readParcelable(ConstructorAdvertItemImpl.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(ConstructorAdvertItemImpl.class, parcel, arrayList, iL2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i13 = parcel.readInt();
                arrayList2 = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = com.avito.android.actions_sheet.a.l(ConstructorAdvertItemImpl.class, parcel, arrayList2, iL3, 1);
                }
            }
            SerpBadgeBar serpBadgeBar = (SerpBadgeBar) parcel.readParcelable(ConstructorAdvertItemImpl.class.getClassLoader());
            BadgeSticker badgeSticker2 = (BadgeSticker) parcel.readParcelable(ConstructorAdvertItemImpl.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                z12 = z13;
                arrayList3 = null;
            } else {
                int i14 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i14);
                z12 = z13;
                int iL4 = 0;
                while (iL4 != i14) {
                    iL4 = com.avito.android.actions_sheet.a.l(ConstructorAdvertItemImpl.class, parcel, arrayList4, iL4, 1);
                    i14 = i14;
                }
                arrayList3 = arrayList4;
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            SerpDisplayType serpDisplayTypeValueOf = SerpDisplayType.valueOf(parcel.readString());
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            boolean z18 = parcel.readInt() != 0;
            String string4 = parcel.readString();
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
            AdvertisementVerticalAlias advertisementVerticalAliasValueOf = parcel.readInt() == 0 ? null : AdvertisementVerticalAlias.valueOf(parcel.readString());
            FavoritesToast favoritesToast = (FavoritesToast) parcel.readParcelable(ConstructorAdvertItemImpl.class.getClassLoader());
            boolean z19 = parcel.readInt() != 0;
            boolean z22 = parcel.readInt() != 0;
            boolean z23 = parcel.readInt() != 0;
            boolean z24 = parcel.readInt() != 0;
            boolean z25 = parcel.readInt() != 0;
            boolean z26 = parcel.readInt() != 0;
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
            SellerInfoModel sellerInfoModelCreateFromParcel = parcel.readInt() == 0 ? null : SellerInfoModel.CREATOR.createFromParcel(parcel);
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            int i16 = parcel.readInt();
            SellerOnline sellerOnline = (SellerOnline) parcel.readParcelable(ConstructorAdvertItemImpl.class.getClassLoader());
            NewAdvertBadge newAdvertBadge = (NewAdvertBadge) parcel.readParcelable(ConstructorAdvertItemImpl.class.getClassLoader());
            boolean z27 = parcel.readInt() != 0;
            String string5 = parcel.readString();
            int i17 = parcel.readInt();
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap2 = null;
            } else {
                int i18 = parcel.readInt();
                LinkedHashMap linkedHashMap4 = new LinkedHashMap(i18);
                int iA3 = 0;
                while (iA3 != i18) {
                    iA3 = C0.a(parcel, linkedHashMap4, parcel.readString(), iA3, 1);
                    i18 = i18;
                }
                linkedHashMap2 = linkedHashMap4;
            }
            return new ConstructorAdvertItemImpl(j12, string, snippetSizeValueOf, string2, priceModelCreateFromParcel, deepLink, arrayList, arrayList2, serpBadgeBar, badgeSticker, z12, z14, string3, arrayListCreateStringArrayList, arrayList3, boolValueOf, serpDisplayTypeValueOf, z15, z16, z17, z18, string4, linkedHashMap, advertisementVerticalAliasValueOf, favoritesToast, z19, z22, z23, z24, z25, z26, boolValueOf2, boolValueOf3, sellerInfoModelCreateFromParcel, numValueOf, i16, sellerOnline, newAdvertBadge, z27, string5, i17, string6, string7, linkedHashMap2, (GalleryConfigModel) parcel.readParcelable(ConstructorAdvertItemImpl.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
        }

        @Override // android.os.Parcelable.Creator
        public final ConstructorAdvertItemImpl[] newArray(int i12) {
            return new ConstructorAdvertItemImpl[i12];
        }
    }

    /* compiled from: ConstructorAdvertItem.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/serp/adapter/g0;", "invoke", "()Lcom/avito/android/serp/adapter/g0;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<C34734g0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final C34734g0 invoke() {
            DimmedImage dimmedImage;
            ConstructorAdvertItemImpl constructorAdvertItemImpl = ConstructorAdvertItemImpl.this;
            SellerInfoModel sellerInfo = constructorAdvertItemImpl.getSellerInfo();
            String str = sellerInfo != null ? sellerInfo.f125785b : null;
            SellerInfoModel sellerInfo2 = constructorAdvertItemImpl.getSellerInfo();
            String str2 = sellerInfo2 != null ? sellerInfo2.f125787d : null;
            SellerInfoModel sellerInfo3 = constructorAdvertItemImpl.getSellerInfo();
            Image image = sellerInfo3 != null ? sellerInfo3.f125786c : null;
            String strValueOf = String.valueOf(constructorAdvertItemImpl.getF72677b());
            Integer categoryId = constructorAdvertItemImpl.getCategoryId();
            String string = categoryId != null ? categoryId.toString() : null;
            String title = constructorAdvertItemImpl.getTitle();
            PriceModel price = constructorAdvertItemImpl.getPrice();
            String str3 = price != null ? price.f125780b : null;
            List<DimmedImage> imageList = constructorAdvertItemImpl.getImageList();
            return new C34734g0(str, str2, image, strValueOf, string, title, str3, (imageList == null || (dimmedImage = (DimmedImage) C42745f0.G(imageList)) == null) ? null : dimmedImage.getImage(), null);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public ConstructorAdvertItemImpl(long j12, @Y61.k String str, @Y61.k SnippetSize snippetSize, @Y61.l String str2, @Y61.l PriceModel priceModel, @Y61.l DeepLink deepLink, @Y61.l List<DimmedImage> list, @Y61.l List<? extends ConstructorAdvertGalleryItemModel> list2, @Y61.l SerpBadgeBar serpBadgeBar, @Y61.l BadgeSticker badgeSticker, boolean z12, boolean z13, @Y61.l String str3, @Y61.l List<String> list3, @Y61.l List<? extends BeduinModel> list4, @Y61.l Boolean bool, @Y61.k SerpDisplayType serpDisplayType, boolean z14, boolean z15, boolean z16, boolean z17, @Y61.l String str4, @Y61.l Map<String, String> map, @Y61.l AdvertisementVerticalAlias advertisementVerticalAlias, @Y61.l FavoritesToast favoritesToast, boolean z18, boolean z19, boolean z22, boolean z23, boolean z24, boolean z25, @Y61.l Boolean bool2, @Y61.l Boolean bool3, @Y61.l SellerInfoModel sellerInfoModel, @Y61.l Integer num, int i12, @Y61.l SellerOnline sellerOnline, @Y61.l NewAdvertBadge newAdvertBadge, boolean z26, @Y61.k String str5, int i13, @Y61.k String str6, @Y61.l String str7, @Y61.l Map<String, String> map2, @Y61.l GalleryConfigModel galleryConfigModel, @Y61.l Long l12) {
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
        this.displayType = serpDisplayType;
        this.isViewed = z14;
        this.isFavorite = z15;
        this.canBeHidden = z16;
        this.isHidden = z17;
        this.analyticsContext = str4;
        this.analyticParams = map;
        this.verticalAlias = advertisementVerticalAlias;
        this.favoritesToast = favoritesToast;
        this.hasVideo = z18;
        this.hasRealtyLayout = z19;
        this.isRedesign = z22;
        this.isStrRedesign = z23;
        this.isUnavailable = z24;
        this.isExtendedGallery = z25;
        this.cvViewed = bool2;
        this.isCvHidden = bool3;
        this.sellerInfo = sellerInfoModel;
        this.categoryId = num;
        this.spanCount = i12;
        this.sellerOnline = sellerOnline;
        this.newAdvertBadge = newAdvertBadge;
        this.isFeatured = z26;
        this.featuredSectionTitle = str5;
        this.featuredSectionPosition = i13;
        this.featuredSectionType = str6;
        this.xHash = str7;
        this.additionalAnalyticsParams = map2;
        this.galleryConfig = galleryConfigModel;
        this.gigShiftId = l12;
        this.inAppCallsAwareItemData = C42727D.c(new b());
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

    @Y61.k
    /* renamed from: component17, reason: from getter */
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    /* renamed from: component18, reason: from getter */
    public final boolean getIsViewed() {
        return this.isViewed;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getStringId() {
        return this.stringId;
    }

    /* renamed from: component20, reason: from getter */
    public final boolean getCanBeHidden() {
        return this.canBeHidden;
    }

    /* renamed from: component21, reason: from getter */
    public final boolean getIsHidden() {
        return this.isHidden;
    }

    @Y61.l
    /* renamed from: component22, reason: from getter */
    public final String getAnalyticsContext() {
        return this.analyticsContext;
    }

    @Y61.l
    public final Map<String, String> component23() {
        return this.analyticParams;
    }

    @Y61.l
    /* renamed from: component24, reason: from getter */
    public final AdvertisementVerticalAlias getVerticalAlias() {
        return this.verticalAlias;
    }

    @Y61.l
    /* renamed from: component25, reason: from getter */
    public final FavoritesToast getFavoritesToast() {
        return this.favoritesToast;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getHasVideo() {
        return this.hasVideo;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getHasRealtyLayout() {
        return this.hasRealtyLayout;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getIsRedesign() {
        return this.isRedesign;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getIsStrRedesign() {
        return this.isStrRedesign;
    }

    @Y61.k
    /* renamed from: component3, reason: from getter */
    public final SnippetSize getSize() {
        return this.size;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getIsUnavailable() {
        return this.isUnavailable;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getIsExtendedGallery() {
        return this.isExtendedGallery;
    }

    @Y61.l
    /* renamed from: component32, reason: from getter */
    public final Boolean getCvViewed() {
        return this.cvViewed;
    }

    @Y61.l
    /* renamed from: component33, reason: from getter */
    public final Boolean getIsCvHidden() {
        return this.isCvHidden;
    }

    @Y61.l
    /* renamed from: component34, reason: from getter */
    public final SellerInfoModel getSellerInfo() {
        return this.sellerInfo;
    }

    @Y61.l
    /* renamed from: component35, reason: from getter */
    public final Integer getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component36, reason: from getter */
    public final int getSpanCount() {
        return this.spanCount;
    }

    @Y61.l
    /* renamed from: component37, reason: from getter */
    public final SellerOnline getSellerOnline() {
        return this.sellerOnline;
    }

    @Y61.l
    /* renamed from: component38, reason: from getter */
    public final NewAdvertBadge getNewAdvertBadge() {
        return this.newAdvertBadge;
    }

    /* renamed from: component39, reason: from getter */
    public final boolean getIsFeatured() {
        return this.isFeatured;
    }

    @Y61.l
    /* renamed from: component4, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.k
    /* renamed from: component40, reason: from getter */
    public final String getFeaturedSectionTitle() {
        return this.featuredSectionTitle;
    }

    /* renamed from: component41, reason: from getter */
    public final int getFeaturedSectionPosition() {
        return this.featuredSectionPosition;
    }

    @Y61.k
    /* renamed from: component42, reason: from getter */
    public final String getFeaturedSectionType() {
        return this.featuredSectionType;
    }

    @Y61.l
    /* renamed from: component43, reason: from getter */
    public final String getXHash() {
        return this.xHash;
    }

    @Y61.l
    public final Map<String, String> component44() {
        return this.additionalAnalyticsParams;
    }

    @Y61.l
    /* renamed from: component45, reason: from getter */
    public final GalleryConfigModel getGalleryConfig() {
        return this.galleryConfig;
    }

    @Y61.l
    /* renamed from: component46, reason: from getter */
    public final Long getGigShiftId() {
        return this.gigShiftId;
    }

    @Y61.l
    /* renamed from: component5, reason: from getter */
    public final PriceModel getPrice() {
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
    public final ConstructorAdvertItemImpl copy(long id2, @Y61.k String stringId, @Y61.k SnippetSize size, @Y61.l String title, @Y61.l PriceModel price, @Y61.l DeepLink deepLink, @Y61.l List<DimmedImage> imageList, @Y61.l List<? extends ConstructorAdvertGalleryItemModel> galleryItemsList, @Y61.l SerpBadgeBar badgeBar, @Y61.l BadgeSticker badgeSticker, boolean isDelivery, boolean hasDiscount, @Y61.l String nativeVideoABCategory, @Y61.l List<String> exposureParams, @Y61.l List<? extends BeduinModel> freeForm, @Y61.l Boolean reserved, @Y61.k SerpDisplayType displayType, boolean isViewed, boolean isFavorite, boolean canBeHidden, boolean isHidden, @Y61.l String analyticsContext, @Y61.l Map<String, String> analyticParams, @Y61.l AdvertisementVerticalAlias verticalAlias, @Y61.l FavoritesToast favoritesToast, boolean hasVideo, boolean hasRealtyLayout, boolean isRedesign, boolean isStrRedesign, boolean isUnavailable, boolean isExtendedGallery, @Y61.l Boolean cvViewed, @Y61.l Boolean isCvHidden, @Y61.l SellerInfoModel sellerInfo, @Y61.l Integer categoryId, int spanCount, @Y61.l SellerOnline sellerOnline, @Y61.l NewAdvertBadge newAdvertBadge, boolean isFeatured, @Y61.k String featuredSectionTitle, int featuredSectionPosition, @Y61.k String featuredSectionType, @Y61.l String xHash, @Y61.l Map<String, String> additionalAnalyticsParams, @Y61.l GalleryConfigModel galleryConfig, @Y61.l Long gigShiftId) {
        return new ConstructorAdvertItemImpl(id2, stringId, size, title, price, deepLink, imageList, galleryItemsList, badgeBar, badgeSticker, isDelivery, hasDiscount, nativeVideoABCategory, exposureParams, freeForm, reserved, displayType, isViewed, isFavorite, canBeHidden, isHidden, analyticsContext, analyticParams, verticalAlias, favoritesToast, hasVideo, hasRealtyLayout, isRedesign, isStrRedesign, isUnavailable, isExtendedGallery, cvViewed, isCvHidden, sellerInfo, categoryId, spanCount, sellerOnline, newAdvertBadge, isFeatured, featuredSectionTitle, featuredSectionPosition, featuredSectionType, xHash, additionalAnalyticsParams, galleryConfig, gigShiftId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ConstructorAdvertItemImpl)) {
            return false;
        }
        ConstructorAdvertItemImpl constructorAdvertItemImpl = (ConstructorAdvertItemImpl) other;
        return this.id == constructorAdvertItemImpl.id && L.f(this.stringId, constructorAdvertItemImpl.stringId) && this.size == constructorAdvertItemImpl.size && L.f(this.title, constructorAdvertItemImpl.title) && L.f(this.price, constructorAdvertItemImpl.price) && L.f(this.deepLink, constructorAdvertItemImpl.deepLink) && L.f(this.imageList, constructorAdvertItemImpl.imageList) && L.f(this.galleryItemsList, constructorAdvertItemImpl.galleryItemsList) && L.f(this.badgeBar, constructorAdvertItemImpl.badgeBar) && L.f(this.badgeSticker, constructorAdvertItemImpl.badgeSticker) && this.isDelivery == constructorAdvertItemImpl.isDelivery && this.hasDiscount == constructorAdvertItemImpl.hasDiscount && L.f(this.nativeVideoABCategory, constructorAdvertItemImpl.nativeVideoABCategory) && L.f(this.exposureParams, constructorAdvertItemImpl.exposureParams) && L.f(this.freeForm, constructorAdvertItemImpl.freeForm) && L.f(this.reserved, constructorAdvertItemImpl.reserved) && this.displayType == constructorAdvertItemImpl.displayType && this.isViewed == constructorAdvertItemImpl.isViewed && this.isFavorite == constructorAdvertItemImpl.isFavorite && this.canBeHidden == constructorAdvertItemImpl.canBeHidden && this.isHidden == constructorAdvertItemImpl.isHidden && L.f(this.analyticsContext, constructorAdvertItemImpl.analyticsContext) && L.f(this.analyticParams, constructorAdvertItemImpl.analyticParams) && this.verticalAlias == constructorAdvertItemImpl.verticalAlias && L.f(this.favoritesToast, constructorAdvertItemImpl.favoritesToast) && this.hasVideo == constructorAdvertItemImpl.hasVideo && this.hasRealtyLayout == constructorAdvertItemImpl.hasRealtyLayout && this.isRedesign == constructorAdvertItemImpl.isRedesign && this.isStrRedesign == constructorAdvertItemImpl.isStrRedesign && this.isUnavailable == constructorAdvertItemImpl.isUnavailable && this.isExtendedGallery == constructorAdvertItemImpl.isExtendedGallery && L.f(this.cvViewed, constructorAdvertItemImpl.cvViewed) && L.f(this.isCvHidden, constructorAdvertItemImpl.isCvHidden) && L.f(this.sellerInfo, constructorAdvertItemImpl.sellerInfo) && L.f(this.categoryId, constructorAdvertItemImpl.categoryId) && this.spanCount == constructorAdvertItemImpl.spanCount && L.f(this.sellerOnline, constructorAdvertItemImpl.sellerOnline) && L.f(this.newAdvertBadge, constructorAdvertItemImpl.newAdvertBadge) && this.isFeatured == constructorAdvertItemImpl.isFeatured && L.f(this.featuredSectionTitle, constructorAdvertItemImpl.featuredSectionTitle) && this.featuredSectionPosition == constructorAdvertItemImpl.featuredSectionPosition && L.f(this.featuredSectionType, constructorAdvertItemImpl.featuredSectionType) && L.f(this.xHash, constructorAdvertItemImpl.xHash) && L.f(this.additionalAnalyticsParams, constructorAdvertItemImpl.additionalAnalyticsParams) && L.f(this.galleryConfig, constructorAdvertItemImpl.galleryConfig) && L.f(this.gigShiftId, constructorAdvertItemImpl.gigShiftId);
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
    public String getF73318b() {
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

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    public boolean getHasVideo() {
        return this.hasVideo;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem, TV0.a
    /* renamed from: getId */
    public long getF72677b() {
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

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.l
    public PriceModel getPrice() {
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

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem
    @Y61.k
    public SnippetSize getSize() {
        return this.size;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem, com.avito.android.serp.adapter.i1
    /* renamed from: getSpanCount */
    public int getF75719b() {
        return this.spanCount;
    }

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem, com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId */
    public String getF75720c() {
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
    public AdvertisementVerticalAlias getF73319c() {
        return this.verticalAlias;
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
        PriceModel priceModel = this.price;
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
        int i13 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(com.avito.android.actions_sheet.a.h(this.displayType, (iHashCode10 + (bool == null ? 0 : bool.hashCode())) * 31, 31), 31, this.isViewed), 31, this.isFavorite), 31, this.canBeHidden), 31, this.isHidden);
        String str3 = this.analyticsContext;
        int iHashCode11 = (i13 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.analyticParams;
        int iHashCode12 = (iHashCode11 + (map == null ? 0 : map.hashCode())) * 31;
        AdvertisementVerticalAlias advertisementVerticalAlias = this.verticalAlias;
        int iHashCode13 = (iHashCode12 + (advertisementVerticalAlias == null ? 0 : advertisementVerticalAlias.hashCode())) * 31;
        FavoritesToast favoritesToast = this.favoritesToast;
        int i14 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode13 + (favoritesToast == null ? 0 : favoritesToast.hashCode())) * 31, 31, this.hasVideo), 31, this.hasRealtyLayout), 31, this.isRedesign), 31, this.isStrRedesign), 31, this.isUnavailable), 31, this.isExtendedGallery);
        Boolean bool2 = this.cvViewed;
        int iHashCode14 = (i14 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCvHidden;
        int iHashCode15 = (iHashCode14 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        SellerInfoModel sellerInfoModel = this.sellerInfo;
        int iHashCode16 = (iHashCode15 + (sellerInfoModel == null ? 0 : sellerInfoModel.hashCode())) * 31;
        Integer num = this.categoryId;
        int iE2 = androidx.appcompat.app.r.e(this.spanCount, (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31, 31);
        SellerOnline sellerOnline = this.sellerOnline;
        int iHashCode17 = (iE2 + (sellerOnline == null ? 0 : sellerOnline.hashCode())) * 31;
        NewAdvertBadge newAdvertBadge = this.newAdvertBadge;
        int iD2 = H.d(androidx.appcompat.app.r.e(this.featuredSectionPosition, H.d(androidx.appcompat.app.r.i((iHashCode17 + (newAdvertBadge == null ? 0 : newAdvertBadge.hashCode())) * 31, 31, this.isFeatured), 31, this.featuredSectionTitle), 31), 31, this.featuredSectionType);
        String str4 = this.xHash;
        int iHashCode18 = (iD2 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map2 = this.additionalAnalyticsParams;
        int iHashCode19 = (iHashCode18 + (map2 == null ? 0 : map2.hashCode())) * 31;
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

    @Override // com.avito.android.constructor_advert.ui.serp.constructor.ConstructorAdvertItem, com.avito.android.serp.adapter.m1
    public void setViewed(boolean z12) {
        this.isViewed = z12;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ConstructorAdvertItemImpl(id=");
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
        sb2.append(", displayType=");
        sb2.append(this.displayType);
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
        sb2.append(", analyticParams=");
        sb2.append(this.analyticParams);
        sb2.append(", verticalAlias=");
        sb2.append(this.verticalAlias);
        sb2.append(", favoritesToast=");
        sb2.append(this.favoritesToast);
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
        sb2.append(", sellerInfo=");
        sb2.append(this.sellerInfo);
        sb2.append(", categoryId=");
        sb2.append(this.categoryId);
        sb2.append(", spanCount=");
        sb2.append(this.spanCount);
        sb2.append(", sellerOnline=");
        sb2.append(this.sellerOnline);
        sb2.append(", newAdvertBadge=");
        sb2.append(this.newAdvertBadge);
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
        sb2.append(", additionalAnalyticsParams=");
        sb2.append(this.additionalAnalyticsParams);
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
        PriceModel priceModel = this.price;
        if (priceModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceModel.writeToParcel(parcel, flags);
        }
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
        parcel.writeString(this.displayType.name());
        parcel.writeInt(this.isViewed ? 1 : 0);
        parcel.writeInt(this.isFavorite ? 1 : 0);
        parcel.writeInt(this.canBeHidden ? 1 : 0);
        parcel.writeInt(this.isHidden ? 1 : 0);
        parcel.writeString(this.analyticsContext);
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
        AdvertisementVerticalAlias advertisementVerticalAlias = this.verticalAlias;
        if (advertisementVerticalAlias == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(advertisementVerticalAlias.name());
        }
        parcel.writeParcelable(this.favoritesToast, flags);
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
        SellerInfoModel sellerInfoModel = this.sellerInfo;
        if (sellerInfoModel == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerInfoModel.writeToParcel(parcel, flags);
        }
        Integer num = this.categoryId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.spanCount);
        parcel.writeParcelable(this.sellerOnline, flags);
        parcel.writeParcelable(this.newAdvertBadge, flags);
        parcel.writeInt(this.isFeatured ? 1 : 0);
        parcel.writeString(this.featuredSectionTitle);
        parcel.writeInt(this.featuredSectionPosition);
        parcel.writeString(this.featuredSectionType);
        parcel.writeString(this.xHash);
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

    public /* synthetic */ ConstructorAdvertItemImpl(long j12, String str, SnippetSize snippetSize, String str2, PriceModel priceModel, DeepLink deepLink, List list, List list2, SerpBadgeBar serpBadgeBar, BadgeSticker badgeSticker, boolean z12, boolean z13, String str3, List list3, List list4, Boolean bool, SerpDisplayType serpDisplayType, boolean z14, boolean z15, boolean z16, boolean z17, String str4, Map map, AdvertisementVerticalAlias advertisementVerticalAlias, FavoritesToast favoritesToast, boolean z18, boolean z19, boolean z22, boolean z23, boolean z24, boolean z25, Boolean bool2, Boolean bool3, SellerInfoModel sellerInfoModel, Integer num, int i12, SellerOnline sellerOnline, NewAdvertBadge newAdvertBadge, boolean z26, String str5, int i13, String str6, String str7, Map map2, GalleryConfigModel galleryConfigModel, Long l12, int i14, int i15, C42822w c42822w) {
        this(j12, str, snippetSize, str2, priceModel, deepLink, list, list2, (i14 & 256) != 0 ? null : serpBadgeBar, (i14 & 512) != 0 ? null : badgeSticker, z12, (i14 & 2048) != 0 ? false : z13, (i14 & 4096) != 0 ? null : str3, (i14 & 8192) != 0 ? null : list3, (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : list4, (32768 & i14) != 0 ? null : bool, serpDisplayType, (131072 & i14) != 0 ? false : z14, z15, (524288 & i14) != 0 ? true : z16, (1048576 & i14) != 0 ? false : z17, str4, map, advertisementVerticalAlias, (i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : favoritesToast, z18, z19, z22, z23, z24, z25, bool2, bool3, sellerInfoModel, (i15 & 4) != 0 ? null : num, i12, (i15 & 16) != 0 ? null : sellerOnline, (i15 & 32) != 0 ? null : newAdvertBadge, (i15 & 64) != 0 ? false : z26, str5, i13, str6, (i15 & 1024) != 0 ? null : str7, (i15 & 2048) != 0 ? null : map2, (i15 & 4096) != 0 ? null : galleryConfigModel, l12);
    }
}
