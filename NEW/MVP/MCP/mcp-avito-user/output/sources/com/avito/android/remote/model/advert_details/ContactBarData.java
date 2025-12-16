package com.avito.android.remote.model.advert_details;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.AdvertPrice;
import com.avito.android.remote.model.AdvertisementCategoryAlias;
import com.avito.android.remote.model.AdvertisementVerticalAlias;
import com.avito.android.remote.model.IceBreakers;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.SearchParamsConverterKt;
import com.avito.android.remote.model.SellerInfoAdvantage;
import com.avito.android.remote.model.SellerRating;
import com.avito.android.remote.model.VehicleType;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.service_seller_type.ServiceSellerType;
import com.avito.android.remote.model.text.AttributedText;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.InterfaceC42830m;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: ContactBarData.kt */
@d
@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bF\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b;\b\u0087\b\u0018\u00002\u00020\u0001B«\u0003\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\u0002\u0012\u0006\u0010\u000b\u001a\u00020\u0002\u0012\u0006\u0010\f\u001a\u00020\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0006\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0017\u001a\u00020\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010!\u001a\u00020 \u0012\u0006\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0016\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\b\b\u0002\u0010,\u001a\u00020\u0016\u0012\b\b\u0002\u0010-\u001a\u00020\u0016\u0012\b\b\u0002\u0010.\u001a\u00020\u0016\u0012\b\b\u0002\u0010/\u001a\u00020\u0016\u0012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\b\b\u0002\u00105\u001a\u00020\u0016\u0012\b\b\u0002\u00106\u001a\u00020\u0016\u0012\b\b\u0002\u00107\u001a\u00020\u0016\u0012\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010:\u001a\u00020\u0016¢\u0006\u0004\b;\u0010<J\r\u0010=\u001a\u00020\u0016¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020\u0016¢\u0006\u0004\b?\u0010>J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0010\u0010B\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0010\u0010F\u001a\u00020\bHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bH\u0010AJ\u0010\u0010I\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bI\u0010AJ\u0010\u0010J\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010AJ\u0012\u0010K\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bM\u0010EJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u0010AJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010AJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0010\u0010T\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bT\u0010>J\u0012\u0010U\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bU\u0010AJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bV\u0010AJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bW\u0010AJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bX\u0010AJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bY\u0010AJ\u0010\u0010Z\u001a\u00020\u001dHÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0012\u0010\\\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\\\u0010AJ\u0010\u0010]\u001a\u00020 HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0010\u0010_\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b_\u0010AJ\u0010\u0010`\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\b`\u0010>J\u0012\u0010a\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0012\u0010c\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u001e\u0010e\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010(HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0012\u0010g\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0010\u0010i\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bi\u0010>J\u0010\u0010j\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bj\u0010>J\u0010\u0010k\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bk\u0010>J\u0010\u0010l\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bl\u0010>J\u0018\u0010m\u001a\n\u0012\u0004\u0012\u000201\u0018\u000100HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0012\u0010o\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\bo\u0010pJ\u0010\u0010q\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bq\u0010>J\u0010\u0010r\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\br\u0010>J\u0010\u0010s\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bs\u0010>J\u0012\u0010t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bt\u0010AJ\u0012\u0010u\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bu\u0010AJ\u0010\u0010v\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bv\u0010>JÜ\u0003\u0010w\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\u00022\b\b\u0002\u0010\u000b\u001a\u00020\u00022\b\b\u0002\u0010\f\u001a\u00020\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0017\u001a\u00020\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u001e\u001a\u00020\u001d2\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010!\u001a\u00020 2\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00162\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\u0016\b\u0002\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\b\b\u0002\u0010,\u001a\u00020\u00162\b\b\u0002\u0010-\u001a\u00020\u00162\b\b\u0002\u0010.\u001a\u00020\u00162\b\b\u0002\u0010/\u001a\u00020\u00162\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001002\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\b\b\u0002\u00105\u001a\u00020\u00162\b\b\u0002\u00106\u001a\u00020\u00162\b\b\u0002\u00107\u001a\u00020\u00162\n\b\u0002\u00108\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00109\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010:\u001a\u00020\u0016HÆ\u0001¢\u0006\u0004\bw\u0010xJ\u0010\u0010y\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\by\u0010AJ\u0010\u0010{\u001a\u00020zHÖ\u0001¢\u0006\u0004\b{\u0010|J\u001b\u0010\u007f\u001a\u00020\u00162\b\u0010~\u001a\u0004\u0018\u00010}HÖ\u0003¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0012\u0010\u0081\u0001\u001a\u00020zHÖ\u0001¢\u0006\u0005\b\u0081\u0001\u0010|J'\u0010\u0086\u0001\u001a\u00030\u0085\u00012\b\u0010\u0083\u0001\u001a\u00030\u0082\u00012\u0007\u0010\u0084\u0001\u001a\u00020zHÖ\u0001¢\u0006\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0019\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u0003\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010AR\u0019\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010CR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010ER\u0019\u0010\t\u001a\u00020\b8\u0006¢\u0006\u000e\n\u0005\b\t\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010GR\u0019\u0010\n\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\n\u0010\u0088\u0001\u001a\u0005\b\u0090\u0001\u0010AR\u0019\u0010\u000b\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010\u0088\u0001\u001a\u0005\b\u0091\u0001\u0010AR\u0019\u0010\f\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u0088\u0001\u001a\u0005\b\u0092\u0001\u0010AR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010LR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u008c\u0001\u001a\u0005\b\u0095\u0001\u0010ER\u001b\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010OR\u001b\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0012\u0010\u0088\u0001\u001a\u0005\b\u0098\u0001\u0010AR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010\u0088\u0001\u001a\u0005\b\u0099\u0001\u0010AR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010SR\u0018\u0010\u0017\u001a\u00020\u00168\u0006¢\u0006\r\n\u0005\b\u0017\u0010\u009c\u0001\u001a\u0004\b\u0017\u0010>R\u001b\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010\u0088\u0001\u001a\u0005\b\u009d\u0001\u0010AR&\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u0016\n\u0005\b\u0019\u0010\u0088\u0001\u0012\u0006\b\u009f\u0001\u0010 \u0001\u001a\u0005\b\u009e\u0001\u0010AR\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010\u0088\u0001\u001a\u0005\b¡\u0001\u0010AR\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u0088\u0001\u001a\u0005\b¢\u0001\u0010AR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u0088\u0001\u001a\u0005\b£\u0001\u0010AR\u0019\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010[R\u001b\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b\u001f\u0010\u0088\u0001\u001a\u0005\b¦\u0001\u0010AR\u0019\u0010!\u001a\u00020 8\u0006¢\u0006\u000e\n\u0005\b!\u0010§\u0001\u001a\u0005\b¨\u0001\u0010^R\u0019\u0010\"\u001a\u00020\u00028\u0006¢\u0006\u000e\n\u0005\b\"\u0010\u0088\u0001\u001a\u0005\b©\u0001\u0010AR\u0019\u0010#\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b#\u0010\u009c\u0001\u001a\u0005\bª\u0001\u0010>R\u001b\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\u000e\n\u0005\b%\u0010«\u0001\u001a\u0005\b¬\u0001\u0010bR\u001b\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u00ad\u0001\u001a\u0005\b®\u0001\u0010dR'\u0010)\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0006¢\u0006\u000e\n\u0005\b)\u0010¯\u0001\u001a\u0005\b°\u0001\u0010fR\u001b\u0010+\u001a\u0004\u0018\u00010*8\u0006¢\u0006\u000e\n\u0005\b+\u0010±\u0001\u001a\u0005\b²\u0001\u0010hR\u0019\u0010,\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b,\u0010\u009c\u0001\u001a\u0005\b³\u0001\u0010>R\u0019\u0010-\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b-\u0010\u009c\u0001\u001a\u0005\b´\u0001\u0010>R\u0019\u0010.\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b.\u0010\u009c\u0001\u001a\u0005\bµ\u0001\u0010>R\u0018\u0010/\u001a\u00020\u00168\u0006¢\u0006\r\n\u0005\b/\u0010\u009c\u0001\u001a\u0004\b/\u0010>R!\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u0001008\u0006¢\u0006\u000e\n\u0005\b2\u0010¶\u0001\u001a\u0005\b·\u0001\u0010nR\u001b\u00104\u001a\u0004\u0018\u0001038\u0006¢\u0006\u000e\n\u0005\b4\u0010¸\u0001\u001a\u0005\b¹\u0001\u0010pR\u0019\u00105\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b5\u0010\u009c\u0001\u001a\u0005\bº\u0001\u0010>R\u0019\u00106\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b6\u0010\u009c\u0001\u001a\u0005\b»\u0001\u0010>R\u0019\u00107\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b7\u0010\u009c\u0001\u001a\u0005\b¼\u0001\u0010>R\u001b\u00108\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b8\u0010\u0088\u0001\u001a\u0005\b½\u0001\u0010AR\u001b\u00109\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\u000e\n\u0005\b9\u0010\u0088\u0001\u001a\u0005\b¾\u0001\u0010AR\u0019\u0010:\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b:\u0010\u009c\u0001\u001a\u0005\b¿\u0001\u0010>¨\u0006À\u0001"}, d2 = {"Lcom/avito/android/remote/model/advert_details/ContactBarData;", "Landroid/os/Parcelable;", "", "name", "Lcom/avito/android/remote/model/advert_details/SellerOnlineStatus;", "onlineStatus", "Lcom/avito/android/remote/model/Image;", "avatar", "Lcom/avito/android/remote/model/advert_details/UserIconType;", "iconType", "advertId", "advertTitle", "advertDescription", "Lcom/avito/android/remote/model/AdvertPrice;", "advertPrice", "advertImage", "Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;", "sellerType", "categoryId", "adjustCategoryId", "Lcom/avito/android/remote/model/AdvertisementCategoryAlias;", "adjustCategoryAlias", "", "isFromCompany", SearchParamsConverterKt.METRO_ID, "userHashId", "userKey", SearchParamsConverterKt.LOCATION_ID, SearchParamsConverterKt.SHOP_ID, "Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "verticalAlias", "microCategoryId", "Lcom/avito/android/remote/model/VehicleType;", "vehicleType", SearchParamsConverterKt.SOURCE, "showTrade", "Lcom/avito/android/remote/model/IceBreakers;", "iceBreakers", "", "customerValue", "", "viewItemAndBuyerEventsParams", "Lcom/avito/android/remote/model/SellerRating;", "sellerRating", "trackVacanciesSurvey", "hideStatusContainer", "showOnlineStatusBottom", "isSimpleContactBar", "", "Lcom/avito/android/remote/model/SellerInfoAdvantage;", "advantages", "Lcom/avito/android/remote/model/text/AttributedText;", "contactsTitle", "hideContactBarButtons", "hasPriorityMethod", "hasInstallmentsStickyBlock", "jobRknDisclaimer", "earlyAccessStatus", "showOnlineStatusWithSellerType", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/advert_details/SellerOnlineStatus;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/advert_details/UserIconType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertPrice;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertisementCategoryAlias;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertisementVerticalAlias;Ljava/lang/String;Lcom/avito/android/remote/model/VehicleType;Ljava/lang/String;ZLcom/avito/android/remote/model/IceBreakers;Ljava/lang/Double;Ljava/util/Map;Lcom/avito/android/remote/model/SellerRating;ZZZZLjava/util/List;Lcom/avito/android/remote/model/text/AttributedText;ZZZLjava/lang/String;Ljava/lang/String;Z)V", "hasRatingDeeplink", "()Z", "isContentContactBarEmpty", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/advert_details/SellerOnlineStatus;", "component3", "()Lcom/avito/android/remote/model/Image;", "component4", "()Lcom/avito/android/remote/model/advert_details/UserIconType;", "component5", "component6", "component7", "component8", "()Lcom/avito/android/remote/model/AdvertPrice;", "component9", "component10", "()Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;", "component11", "component12", "component13", "()Lcom/avito/android/remote/model/AdvertisementCategoryAlias;", "component14", "component15", "component16", "component17", "component18", "component19", "component20", "()Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "component21", "component22", "()Lcom/avito/android/remote/model/VehicleType;", "component23", "component24", "component25", "()Lcom/avito/android/remote/model/IceBreakers;", "component26", "()Ljava/lang/Double;", "component27", "()Ljava/util/Map;", "component28", "()Lcom/avito/android/remote/model/SellerRating;", "component29", "component30", "component31", "component32", "component33", "()Ljava/util/List;", "component34", "()Lcom/avito/android/remote/model/text/AttributedText;", "component35", "component36", "component37", "component38", "component39", "component40", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/advert_details/SellerOnlineStatus;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/advert_details/UserIconType;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertPrice;Lcom/avito/android/remote/model/Image;Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertisementCategoryAlias;ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/AdvertisementVerticalAlias;Ljava/lang/String;Lcom/avito/android/remote/model/VehicleType;Ljava/lang/String;ZLcom/avito/android/remote/model/IceBreakers;Ljava/lang/Double;Ljava/util/Map;Lcom/avito/android/remote/model/SellerRating;ZZZZLjava/util/List;Lcom/avito/android/remote/model/text/AttributedText;ZZZLjava/lang/String;Ljava/lang/String;Z)Lcom/avito/android/remote/model/advert_details/ContactBarData;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "Lcom/avito/android/remote/model/advert_details/SellerOnlineStatus;", "getOnlineStatus", "Lcom/avito/android/remote/model/Image;", "getAvatar", "Lcom/avito/android/remote/model/advert_details/UserIconType;", "getIconType", "getAdvertId", "getAdvertTitle", "getAdvertDescription", "Lcom/avito/android/remote/model/AdvertPrice;", "getAdvertPrice", "getAdvertImage", "Lcom/avito/android/remote/model/service_seller_type/ServiceSellerType;", "getSellerType", "getCategoryId", "getAdjustCategoryId", "Lcom/avito/android/remote/model/AdvertisementCategoryAlias;", "getAdjustCategoryAlias", "Z", "getMetroId", "getUserHashId", "getUserHashId$annotations", "()V", "getUserKey", "getLocationId", "getShopId", "Lcom/avito/android/remote/model/AdvertisementVerticalAlias;", "getVerticalAlias", "getMicroCategoryId", "Lcom/avito/android/remote/model/VehicleType;", "getVehicleType", "getSource", "getShowTrade", "Lcom/avito/android/remote/model/IceBreakers;", "getIceBreakers", "Ljava/lang/Double;", "getCustomerValue", "Ljava/util/Map;", "getViewItemAndBuyerEventsParams", "Lcom/avito/android/remote/model/SellerRating;", "getSellerRating", "getTrackVacanciesSurvey", "getHideStatusContainer", "getShowOnlineStatusBottom", "Ljava/util/List;", "getAdvantages", "Lcom/avito/android/remote/model/text/AttributedText;", "getContactsTitle", "getHideContactBarButtons", "getHasPriorityMethod", "getHasInstallmentsStickyBlock", "getJobRknDisclaimer", "getEarlyAccessStatus", "getShowOnlineStatusWithSellerType", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class ContactBarData implements Parcelable {

    @k
    public static final Parcelable.Creator<ContactBarData> CREATOR = new Creator();

    @l
    private final AdvertisementCategoryAlias adjustCategoryAlias;

    @l
    private final String adjustCategoryId;

    @l
    private final List<SellerInfoAdvantage> advantages;

    @k
    private final String advertDescription;

    @k
    private final String advertId;

    @l
    private final Image advertImage;

    @l
    private final AdvertPrice advertPrice;

    @k
    private final String advertTitle;

    @l
    private final Image avatar;

    @l
    private final String categoryId;

    @l
    private final AttributedText contactsTitle;

    @l
    private final Double customerValue;

    @l
    private final String earlyAccessStatus;
    private final boolean hasInstallmentsStickyBlock;
    private final boolean hasPriorityMethod;
    private final boolean hideContactBarButtons;
    private final boolean hideStatusContainer;

    @l
    private final IceBreakers iceBreakers;

    @k
    private final UserIconType iconType;
    private final boolean isFromCompany;
    private final boolean isSimpleContactBar;

    @l
    private final String jobRknDisclaimer;

    @l
    private final String locationId;

    @l
    private final String metroId;

    @l
    private final String microCategoryId;

    @k
    private final String name;

    @k
    private final SellerOnlineStatus onlineStatus;

    @l
    private final SellerRating sellerRating;

    @l
    private final ServiceSellerType sellerType;

    @l
    private final String shopId;
    private final boolean showOnlineStatusBottom;
    private final boolean showOnlineStatusWithSellerType;
    private final boolean showTrade;

    @k
    private final String source;
    private final boolean trackVacanciesSurvey;

    @l
    private final String userHashId;

    @l
    private final String userKey;

    @k
    private final VehicleType vehicleType;

    @k
    private final AdvertisementVerticalAlias verticalAlias;

    @l
    private final Map<String, String> viewItemAndBuyerEventsParams;

    /* compiled from: ContactBarData.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<ContactBarData> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactBarData createFromParcel(@k Parcel parcel) {
            AdvertisementCategoryAlias advertisementCategoryAlias;
            String str;
            String str2;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList;
            String string = parcel.readString();
            SellerOnlineStatus sellerOnlineStatusCreateFromParcel = SellerOnlineStatus.CREATOR.createFromParcel(parcel);
            Image image = (Image) parcel.readParcelable(ContactBarData.class.getClassLoader());
            UserIconType userIconTypeValueOf = UserIconType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            AdvertPrice advertPriceCreateFromParcel = parcel.readInt() == 0 ? null : AdvertPrice.CREATOR.createFromParcel(parcel);
            Image image2 = (Image) parcel.readParcelable(ContactBarData.class.getClassLoader());
            ServiceSellerType serviceSellerTypeCreateFromParcel = parcel.readInt() == 0 ? null : ServiceSellerType.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            AdvertisementCategoryAlias advertisementCategoryAliasValueOf = parcel.readInt() == 0 ? null : AdvertisementCategoryAlias.valueOf(parcel.readString());
            boolean z12 = parcel.readInt() != 0;
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            AdvertisementVerticalAlias advertisementVerticalAliasValueOf = AdvertisementVerticalAlias.valueOf(parcel.readString());
            String string12 = parcel.readString();
            VehicleType vehicleTypeValueOf = VehicleType.valueOf(parcel.readString());
            String string13 = parcel.readString();
            boolean z13 = parcel.readInt() != 0;
            IceBreakers iceBreakersCreateFromParcel = parcel.readInt() == 0 ? null : IceBreakers.CREATOR.createFromParcel(parcel);
            Double dValueOf = parcel.readInt() == 0 ? null : Double.valueOf(parcel.readDouble());
            if (parcel.readInt() == 0) {
                str2 = string5;
                str = string6;
                advertisementCategoryAlias = advertisementCategoryAliasValueOf;
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                advertisementCategoryAlias = advertisementCategoryAliasValueOf;
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                str = string6;
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    i12 = i12;
                    string5 = string5;
                }
                str2 = string5;
                linkedHashMap = linkedHashMap2;
            }
            SellerRating sellerRatingCreateFromParcel = parcel.readInt() == 0 ? null : SellerRating.CREATOR.createFromParcel(parcel);
            boolean z14 = parcel.readInt() != 0;
            boolean z15 = parcel.readInt() != 0;
            boolean z16 = parcel.readInt() != 0;
            boolean z17 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i13);
                int iC2 = 0;
                while (iC2 != i13) {
                    iC2 = a.c(SellerInfoAdvantage.CREATOR, parcel, arrayList2, iC2, 1);
                    i13 = i13;
                }
                arrayList = arrayList2;
            }
            return new ContactBarData(string, sellerOnlineStatusCreateFromParcel, image, userIconTypeValueOf, string2, string3, string4, advertPriceCreateFromParcel, image2, serviceSellerTypeCreateFromParcel, str2, str, advertisementCategoryAlias, z12, string7, string8, string9, string10, string11, advertisementVerticalAliasValueOf, string12, vehicleTypeValueOf, string13, z13, iceBreakersCreateFromParcel, dValueOf, linkedHashMap, sellerRatingCreateFromParcel, z14, z15, z16, z17, arrayList, (AttributedText) parcel.readParcelable(ContactBarData.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readString(), parcel.readInt() != 0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final ContactBarData[] newArray(int i12) {
            return new ContactBarData[i12];
        }
    }

    public ContactBarData(@k String str, @k SellerOnlineStatus sellerOnlineStatus, @l Image image, @k UserIconType userIconType, @k String str2, @k String str3, @k String str4, @l AdvertPrice advertPrice, @l Image image2, @l ServiceSellerType serviceSellerType, @l String str5, @l String str6, @l AdvertisementCategoryAlias advertisementCategoryAlias, boolean z12, @l String str7, @l String str8, @l String str9, @l String str10, @l String str11, @k AdvertisementVerticalAlias advertisementVerticalAlias, @l String str12, @k VehicleType vehicleType, @k String str13, boolean z13, @l IceBreakers iceBreakers, @l Double d12, @l Map<String, String> map, @l SellerRating sellerRating, boolean z14, boolean z15, boolean z16, boolean z17, @l List<SellerInfoAdvantage> list, @l AttributedText attributedText, boolean z18, boolean z19, boolean z22, @l String str14, @l String str15, boolean z23) {
        this.name = str;
        this.onlineStatus = sellerOnlineStatus;
        this.avatar = image;
        this.iconType = userIconType;
        this.advertId = str2;
        this.advertTitle = str3;
        this.advertDescription = str4;
        this.advertPrice = advertPrice;
        this.advertImage = image2;
        this.sellerType = serviceSellerType;
        this.categoryId = str5;
        this.adjustCategoryId = str6;
        this.adjustCategoryAlias = advertisementCategoryAlias;
        this.isFromCompany = z12;
        this.metroId = str7;
        this.userHashId = str8;
        this.userKey = str9;
        this.locationId = str10;
        this.shopId = str11;
        this.verticalAlias = advertisementVerticalAlias;
        this.microCategoryId = str12;
        this.vehicleType = vehicleType;
        this.source = str13;
        this.showTrade = z13;
        this.iceBreakers = iceBreakers;
        this.customerValue = d12;
        this.viewItemAndBuyerEventsParams = map;
        this.sellerRating = sellerRating;
        this.trackVacanciesSurvey = z14;
        this.hideStatusContainer = z15;
        this.showOnlineStatusBottom = z16;
        this.isSimpleContactBar = z17;
        this.advantages = list;
        this.contactsTitle = attributedText;
        this.hideContactBarButtons = z18;
        this.hasPriorityMethod = z19;
        this.hasInstallmentsStickyBlock = z22;
        this.jobRknDisclaimer = str14;
        this.earlyAccessStatus = str15;
        this.showOnlineStatusWithSellerType = z23;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final ServiceSellerType getSellerType() {
        return this.sellerType;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getAdjustCategoryId() {
        return this.adjustCategoryId;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final AdvertisementCategoryAlias getAdjustCategoryAlias() {
        return this.adjustCategoryAlias;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsFromCompany() {
        return this.isFromCompany;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final String getMetroId() {
        return this.metroId;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final String getUserHashId() {
        return this.userHashId;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final String getUserKey() {
        return this.userKey;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final String getShopId() {
        return this.shopId;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final SellerOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    @k
    /* renamed from: component20, reason: from getter */
    public final AdvertisementVerticalAlias getVerticalAlias() {
        return this.verticalAlias;
    }

    @l
    /* renamed from: component21, reason: from getter */
    public final String getMicroCategoryId() {
        return this.microCategoryId;
    }

    @k
    /* renamed from: component22, reason: from getter */
    public final VehicleType getVehicleType() {
        return this.vehicleType;
    }

    @k
    /* renamed from: component23, reason: from getter */
    public final String getSource() {
        return this.source;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getShowTrade() {
        return this.showTrade;
    }

    @l
    /* renamed from: component25, reason: from getter */
    public final IceBreakers getIceBreakers() {
        return this.iceBreakers;
    }

    @l
    /* renamed from: component26, reason: from getter */
    public final Double getCustomerValue() {
        return this.customerValue;
    }

    @l
    public final Map<String, String> component27() {
        return this.viewItemAndBuyerEventsParams;
    }

    @l
    /* renamed from: component28, reason: from getter */
    public final SellerRating getSellerRating() {
        return this.sellerRating;
    }

    /* renamed from: component29, reason: from getter */
    public final boolean getTrackVacanciesSurvey() {
        return this.trackVacanciesSurvey;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Image getAvatar() {
        return this.avatar;
    }

    /* renamed from: component30, reason: from getter */
    public final boolean getHideStatusContainer() {
        return this.hideStatusContainer;
    }

    /* renamed from: component31, reason: from getter */
    public final boolean getShowOnlineStatusBottom() {
        return this.showOnlineStatusBottom;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getIsSimpleContactBar() {
        return this.isSimpleContactBar;
    }

    @l
    public final List<SellerInfoAdvantage> component33() {
        return this.advantages;
    }

    @l
    /* renamed from: component34, reason: from getter */
    public final AttributedText getContactsTitle() {
        return this.contactsTitle;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getHideContactBarButtons() {
        return this.hideContactBarButtons;
    }

    /* renamed from: component36, reason: from getter */
    public final boolean getHasPriorityMethod() {
        return this.hasPriorityMethod;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getHasInstallmentsStickyBlock() {
        return this.hasInstallmentsStickyBlock;
    }

    @l
    /* renamed from: component38, reason: from getter */
    public final String getJobRknDisclaimer() {
        return this.jobRknDisclaimer;
    }

    @l
    /* renamed from: component39, reason: from getter */
    public final String getEarlyAccessStatus() {
        return this.earlyAccessStatus;
    }

    @k
    /* renamed from: component4, reason: from getter */
    public final UserIconType getIconType() {
        return this.iconType;
    }

    /* renamed from: component40, reason: from getter */
    public final boolean getShowOnlineStatusWithSellerType() {
        return this.showOnlineStatusWithSellerType;
    }

    @k
    /* renamed from: component5, reason: from getter */
    public final String getAdvertId() {
        return this.advertId;
    }

    @k
    /* renamed from: component6, reason: from getter */
    public final String getAdvertTitle() {
        return this.advertTitle;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final String getAdvertDescription() {
        return this.advertDescription;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final AdvertPrice getAdvertPrice() {
        return this.advertPrice;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Image getAdvertImage() {
        return this.advertImage;
    }

    @k
    public final ContactBarData copy(@k String name, @k SellerOnlineStatus onlineStatus, @l Image avatar, @k UserIconType iconType, @k String advertId, @k String advertTitle, @k String advertDescription, @l AdvertPrice advertPrice, @l Image advertImage, @l ServiceSellerType sellerType, @l String categoryId, @l String adjustCategoryId, @l AdvertisementCategoryAlias adjustCategoryAlias, boolean isFromCompany, @l String metroId, @l String userHashId, @l String userKey, @l String locationId, @l String shopId, @k AdvertisementVerticalAlias verticalAlias, @l String microCategoryId, @k VehicleType vehicleType, @k String source, boolean showTrade, @l IceBreakers iceBreakers, @l Double customerValue, @l Map<String, String> viewItemAndBuyerEventsParams, @l SellerRating sellerRating, boolean trackVacanciesSurvey, boolean hideStatusContainer, boolean showOnlineStatusBottom, boolean isSimpleContactBar, @l List<SellerInfoAdvantage> advantages, @l AttributedText contactsTitle, boolean hideContactBarButtons, boolean hasPriorityMethod, boolean hasInstallmentsStickyBlock, @l String jobRknDisclaimer, @l String earlyAccessStatus, boolean showOnlineStatusWithSellerType) {
        return new ContactBarData(name, onlineStatus, avatar, iconType, advertId, advertTitle, advertDescription, advertPrice, advertImage, sellerType, categoryId, adjustCategoryId, adjustCategoryAlias, isFromCompany, metroId, userHashId, userKey, locationId, shopId, verticalAlias, microCategoryId, vehicleType, source, showTrade, iceBreakers, customerValue, viewItemAndBuyerEventsParams, sellerRating, trackVacanciesSurvey, hideStatusContainer, showOnlineStatusBottom, isSimpleContactBar, advantages, contactsTitle, hideContactBarButtons, hasPriorityMethod, hasInstallmentsStickyBlock, jobRknDisclaimer, earlyAccessStatus, showOnlineStatusWithSellerType);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ContactBarData)) {
            return false;
        }
        ContactBarData contactBarData = (ContactBarData) other;
        return L.f(this.name, contactBarData.name) && L.f(this.onlineStatus, contactBarData.onlineStatus) && L.f(this.avatar, contactBarData.avatar) && this.iconType == contactBarData.iconType && L.f(this.advertId, contactBarData.advertId) && L.f(this.advertTitle, contactBarData.advertTitle) && L.f(this.advertDescription, contactBarData.advertDescription) && L.f(this.advertPrice, contactBarData.advertPrice) && L.f(this.advertImage, contactBarData.advertImage) && L.f(this.sellerType, contactBarData.sellerType) && L.f(this.categoryId, contactBarData.categoryId) && L.f(this.adjustCategoryId, contactBarData.adjustCategoryId) && this.adjustCategoryAlias == contactBarData.adjustCategoryAlias && this.isFromCompany == contactBarData.isFromCompany && L.f(this.metroId, contactBarData.metroId) && L.f(this.userHashId, contactBarData.userHashId) && L.f(this.userKey, contactBarData.userKey) && L.f(this.locationId, contactBarData.locationId) && L.f(this.shopId, contactBarData.shopId) && this.verticalAlias == contactBarData.verticalAlias && L.f(this.microCategoryId, contactBarData.microCategoryId) && this.vehicleType == contactBarData.vehicleType && L.f(this.source, contactBarData.source) && this.showTrade == contactBarData.showTrade && L.f(this.iceBreakers, contactBarData.iceBreakers) && L.f(this.customerValue, contactBarData.customerValue) && L.f(this.viewItemAndBuyerEventsParams, contactBarData.viewItemAndBuyerEventsParams) && L.f(this.sellerRating, contactBarData.sellerRating) && this.trackVacanciesSurvey == contactBarData.trackVacanciesSurvey && this.hideStatusContainer == contactBarData.hideStatusContainer && this.showOnlineStatusBottom == contactBarData.showOnlineStatusBottom && this.isSimpleContactBar == contactBarData.isSimpleContactBar && L.f(this.advantages, contactBarData.advantages) && L.f(this.contactsTitle, contactBarData.contactsTitle) && this.hideContactBarButtons == contactBarData.hideContactBarButtons && this.hasPriorityMethod == contactBarData.hasPriorityMethod && this.hasInstallmentsStickyBlock == contactBarData.hasInstallmentsStickyBlock && L.f(this.jobRknDisclaimer, contactBarData.jobRknDisclaimer) && L.f(this.earlyAccessStatus, contactBarData.earlyAccessStatus) && this.showOnlineStatusWithSellerType == contactBarData.showOnlineStatusWithSellerType;
    }

    @l
    public final AdvertisementCategoryAlias getAdjustCategoryAlias() {
        return this.adjustCategoryAlias;
    }

    @l
    public final String getAdjustCategoryId() {
        return this.adjustCategoryId;
    }

    @l
    public final List<SellerInfoAdvantage> getAdvantages() {
        return this.advantages;
    }

    @k
    public final String getAdvertDescription() {
        return this.advertDescription;
    }

    @k
    public final String getAdvertId() {
        return this.advertId;
    }

    @l
    public final Image getAdvertImage() {
        return this.advertImage;
    }

    @l
    public final AdvertPrice getAdvertPrice() {
        return this.advertPrice;
    }

    @k
    public final String getAdvertTitle() {
        return this.advertTitle;
    }

    @l
    public final Image getAvatar() {
        return this.avatar;
    }

    @l
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    public final AttributedText getContactsTitle() {
        return this.contactsTitle;
    }

    @l
    public final Double getCustomerValue() {
        return this.customerValue;
    }

    @l
    public final String getEarlyAccessStatus() {
        return this.earlyAccessStatus;
    }

    public final boolean getHasInstallmentsStickyBlock() {
        return this.hasInstallmentsStickyBlock;
    }

    public final boolean getHasPriorityMethod() {
        return this.hasPriorityMethod;
    }

    public final boolean getHideContactBarButtons() {
        return this.hideContactBarButtons;
    }

    public final boolean getHideStatusContainer() {
        return this.hideStatusContainer;
    }

    @l
    public final IceBreakers getIceBreakers() {
        return this.iceBreakers;
    }

    @k
    public final UserIconType getIconType() {
        return this.iconType;
    }

    @l
    public final String getJobRknDisclaimer() {
        return this.jobRknDisclaimer;
    }

    @l
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    public final String getMetroId() {
        return this.metroId;
    }

    @l
    public final String getMicroCategoryId() {
        return this.microCategoryId;
    }

    @k
    public final String getName() {
        return this.name;
    }

    @k
    public final SellerOnlineStatus getOnlineStatus() {
        return this.onlineStatus;
    }

    @l
    public final SellerRating getSellerRating() {
        return this.sellerRating;
    }

    @l
    public final ServiceSellerType getSellerType() {
        return this.sellerType;
    }

    @l
    public final String getShopId() {
        return this.shopId;
    }

    public final boolean getShowOnlineStatusBottom() {
        return this.showOnlineStatusBottom;
    }

    public final boolean getShowOnlineStatusWithSellerType() {
        return this.showOnlineStatusWithSellerType;
    }

    public final boolean getShowTrade() {
        return this.showTrade;
    }

    @k
    public final String getSource() {
        return this.source;
    }

    public final boolean getTrackVacanciesSurvey() {
        return this.trackVacanciesSurvey;
    }

    @l
    public final String getUserHashId() {
        return this.userHashId;
    }

    @l
    public final String getUserKey() {
        return this.userKey;
    }

    @k
    public final VehicleType getVehicleType() {
        return this.vehicleType;
    }

    @k
    public final AdvertisementVerticalAlias getVerticalAlias() {
        return this.verticalAlias;
    }

    @l
    public final Map<String, String> getViewItemAndBuyerEventsParams() {
        return this.viewItemAndBuyerEventsParams;
    }

    public final boolean hasRatingDeeplink() {
        SellerRating sellerRating = this.sellerRating;
        return (sellerRating != null ? sellerRating.getDeeplink() : null) != null;
    }

    public int hashCode() {
        int iHashCode = (this.onlineStatus.hashCode() + (this.name.hashCode() * 31)) * 31;
        Image image = this.avatar;
        int iD2 = H.d(H.d(H.d((this.iconType.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31)) * 31, 31, this.advertId), 31, this.advertTitle), 31, this.advertDescription);
        AdvertPrice advertPrice = this.advertPrice;
        int iHashCode2 = (iD2 + (advertPrice == null ? 0 : advertPrice.hashCode())) * 31;
        Image image2 = this.advertImage;
        int iHashCode3 = (iHashCode2 + (image2 == null ? 0 : image2.hashCode())) * 31;
        ServiceSellerType serviceSellerType = this.sellerType;
        int iHashCode4 = (iHashCode3 + (serviceSellerType == null ? 0 : serviceSellerType.hashCode())) * 31;
        String str = this.categoryId;
        int iHashCode5 = (iHashCode4 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.adjustCategoryId;
        int iHashCode6 = (iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31;
        AdvertisementCategoryAlias advertisementCategoryAlias = this.adjustCategoryAlias;
        int i12 = r.i((iHashCode6 + (advertisementCategoryAlias == null ? 0 : advertisementCategoryAlias.hashCode())) * 31, 31, this.isFromCompany);
        String str3 = this.metroId;
        int iHashCode7 = (i12 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.userHashId;
        int iHashCode8 = (iHashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.userKey;
        int iHashCode9 = (iHashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.locationId;
        int iHashCode10 = (iHashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.shopId;
        int iHashCode11 = (this.verticalAlias.hashCode() + ((iHashCode10 + (str7 == null ? 0 : str7.hashCode())) * 31)) * 31;
        String str8 = this.microCategoryId;
        int i13 = r.i(H.d((this.vehicleType.hashCode() + ((iHashCode11 + (str8 == null ? 0 : str8.hashCode())) * 31)) * 31, 31, this.source), 31, this.showTrade);
        IceBreakers iceBreakers = this.iceBreakers;
        int iHashCode12 = (i13 + (iceBreakers == null ? 0 : iceBreakers.hashCode())) * 31;
        Double d12 = this.customerValue;
        int iHashCode13 = (iHashCode12 + (d12 == null ? 0 : d12.hashCode())) * 31;
        Map<String, String> map = this.viewItemAndBuyerEventsParams;
        int iHashCode14 = (iHashCode13 + (map == null ? 0 : map.hashCode())) * 31;
        SellerRating sellerRating = this.sellerRating;
        int i14 = r.i(r.i(r.i(r.i((iHashCode14 + (sellerRating == null ? 0 : sellerRating.hashCode())) * 31, 31, this.trackVacanciesSurvey), 31, this.hideStatusContainer), 31, this.showOnlineStatusBottom), 31, this.isSimpleContactBar);
        List<SellerInfoAdvantage> list = this.advantages;
        int iHashCode15 = (i14 + (list == null ? 0 : list.hashCode())) * 31;
        AttributedText attributedText = this.contactsTitle;
        int i15 = r.i(r.i(r.i((iHashCode15 + (attributedText == null ? 0 : attributedText.hashCode())) * 31, 31, this.hideContactBarButtons), 31, this.hasPriorityMethod), 31, this.hasInstallmentsStickyBlock);
        String str9 = this.jobRknDisclaimer;
        int iHashCode16 = (i15 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.earlyAccessStatus;
        return Boolean.hashCode(this.showOnlineStatusWithSellerType) + ((iHashCode16 + (str10 != null ? str10.hashCode() : 0)) * 31);
    }

    public final boolean isContentContactBarEmpty() {
        String replySpeed;
        return this.hideContactBarButtons && this.sellerRating == null && !this.onlineStatus.isOnline() && ((replySpeed = this.onlineStatus.getReplySpeed()) == null || replySpeed.length() == 0);
    }

    public final boolean isFromCompany() {
        return this.isFromCompany;
    }

    public final boolean isSimpleContactBar() {
        return this.isSimpleContactBar;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("ContactBarData(name=");
        sb2.append(this.name);
        sb2.append(", onlineStatus=");
        sb2.append(this.onlineStatus);
        sb2.append(", avatar=");
        sb2.append(this.avatar);
        sb2.append(", iconType=");
        sb2.append(this.iconType);
        sb2.append(", advertId=");
        sb2.append(this.advertId);
        sb2.append(", advertTitle=");
        sb2.append(this.advertTitle);
        sb2.append(", advertDescription=");
        sb2.append(this.advertDescription);
        sb2.append(", advertPrice=");
        sb2.append(this.advertPrice);
        sb2.append(", advertImage=");
        sb2.append(this.advertImage);
        sb2.append(", sellerType=");
        sb2.append(this.sellerType);
        sb2.append(", categoryId=");
        sb2.append(this.categoryId);
        sb2.append(", adjustCategoryId=");
        sb2.append(this.adjustCategoryId);
        sb2.append(", adjustCategoryAlias=");
        sb2.append(this.adjustCategoryAlias);
        sb2.append(", isFromCompany=");
        sb2.append(this.isFromCompany);
        sb2.append(", metroId=");
        sb2.append(this.metroId);
        sb2.append(", userHashId=");
        sb2.append(this.userHashId);
        sb2.append(", userKey=");
        sb2.append(this.userKey);
        sb2.append(", locationId=");
        sb2.append(this.locationId);
        sb2.append(", shopId=");
        sb2.append(this.shopId);
        sb2.append(", verticalAlias=");
        sb2.append(this.verticalAlias);
        sb2.append(", microCategoryId=");
        sb2.append(this.microCategoryId);
        sb2.append(", vehicleType=");
        sb2.append(this.vehicleType);
        sb2.append(", source=");
        sb2.append(this.source);
        sb2.append(", showTrade=");
        sb2.append(this.showTrade);
        sb2.append(", iceBreakers=");
        sb2.append(this.iceBreakers);
        sb2.append(", customerValue=");
        sb2.append(this.customerValue);
        sb2.append(", viewItemAndBuyerEventsParams=");
        sb2.append(this.viewItemAndBuyerEventsParams);
        sb2.append(", sellerRating=");
        sb2.append(this.sellerRating);
        sb2.append(", trackVacanciesSurvey=");
        sb2.append(this.trackVacanciesSurvey);
        sb2.append(", hideStatusContainer=");
        sb2.append(this.hideStatusContainer);
        sb2.append(", showOnlineStatusBottom=");
        sb2.append(this.showOnlineStatusBottom);
        sb2.append(", isSimpleContactBar=");
        sb2.append(this.isSimpleContactBar);
        sb2.append(", advantages=");
        sb2.append(this.advantages);
        sb2.append(", contactsTitle=");
        sb2.append(this.contactsTitle);
        sb2.append(", hideContactBarButtons=");
        sb2.append(this.hideContactBarButtons);
        sb2.append(", hasPriorityMethod=");
        sb2.append(this.hasPriorityMethod);
        sb2.append(", hasInstallmentsStickyBlock=");
        sb2.append(this.hasInstallmentsStickyBlock);
        sb2.append(", jobRknDisclaimer=");
        sb2.append(this.jobRknDisclaimer);
        sb2.append(", earlyAccessStatus=");
        sb2.append(this.earlyAccessStatus);
        sb2.append(", showOnlineStatusWithSellerType=");
        return r.x(sb2, this.showOnlineStatusWithSellerType, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.name);
        this.onlineStatus.writeToParcel(parcel, flags);
        parcel.writeParcelable(this.avatar, flags);
        parcel.writeString(this.iconType.name());
        parcel.writeString(this.advertId);
        parcel.writeString(this.advertTitle);
        parcel.writeString(this.advertDescription);
        AdvertPrice advertPrice = this.advertPrice;
        if (advertPrice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertPrice.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.advertImage, flags);
        ServiceSellerType serviceSellerType = this.sellerType;
        if (serviceSellerType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serviceSellerType.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.categoryId);
        parcel.writeString(this.adjustCategoryId);
        AdvertisementCategoryAlias advertisementCategoryAlias = this.adjustCategoryAlias;
        if (advertisementCategoryAlias == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(advertisementCategoryAlias.name());
        }
        parcel.writeInt(this.isFromCompany ? 1 : 0);
        parcel.writeString(this.metroId);
        parcel.writeString(this.userHashId);
        parcel.writeString(this.userKey);
        parcel.writeString(this.locationId);
        parcel.writeString(this.shopId);
        parcel.writeString(this.verticalAlias.name());
        parcel.writeString(this.microCategoryId);
        parcel.writeString(this.vehicleType.name());
        parcel.writeString(this.source);
        parcel.writeInt(this.showTrade ? 1 : 0);
        IceBreakers iceBreakers = this.iceBreakers;
        if (iceBreakers == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            iceBreakers.writeToParcel(parcel, flags);
        }
        Double d12 = this.customerValue;
        if (d12 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.advert.item.delivery_suggests.l.v(parcel, 1, d12);
        }
        Map<String, String> map = this.viewItemAndBuyerEventsParams;
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
        SellerRating sellerRating = this.sellerRating;
        if (sellerRating == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sellerRating.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.trackVacanciesSurvey ? 1 : 0);
        parcel.writeInt(this.hideStatusContainer ? 1 : 0);
        parcel.writeInt(this.showOnlineStatusBottom ? 1 : 0);
        parcel.writeInt(this.isSimpleContactBar ? 1 : 0);
        List<SellerInfoAdvantage> list = this.advantages;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((SellerInfoAdvantage) itA.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeParcelable(this.contactsTitle, flags);
        parcel.writeInt(this.hideContactBarButtons ? 1 : 0);
        parcel.writeInt(this.hasPriorityMethod ? 1 : 0);
        parcel.writeInt(this.hasInstallmentsStickyBlock ? 1 : 0);
        parcel.writeString(this.jobRknDisclaimer);
        parcel.writeString(this.earlyAccessStatus);
        parcel.writeInt(this.showOnlineStatusWithSellerType ? 1 : 0);
    }

    @InterfaceC42830m
    public static /* synthetic */ void getUserHashId$annotations() {
    }

    public /* synthetic */ ContactBarData(String str, SellerOnlineStatus sellerOnlineStatus, Image image, UserIconType userIconType, String str2, String str3, String str4, AdvertPrice advertPrice, Image image2, ServiceSellerType serviceSellerType, String str5, String str6, AdvertisementCategoryAlias advertisementCategoryAlias, boolean z12, String str7, String str8, String str9, String str10, String str11, AdvertisementVerticalAlias advertisementVerticalAlias, String str12, VehicleType vehicleType, String str13, boolean z13, IceBreakers iceBreakers, Double d12, Map map, SellerRating sellerRating, boolean z14, boolean z15, boolean z16, boolean z17, List list, AttributedText attributedText, boolean z18, boolean z19, boolean z22, String str14, String str15, boolean z23, int i12, int i13, C42822w c42822w) {
        this(str, sellerOnlineStatus, (i12 & 4) != 0 ? null : image, userIconType, str2, str3, str4, advertPrice, image2, (i12 & 512) != 0 ? null : serviceSellerType, str5, str6, advertisementCategoryAlias, z12, str7, str8, str9, str10, str11, advertisementVerticalAlias, (1048576 & i12) != 0 ? null : str12, vehicleType, str13, (8388608 & i12) != 0 ? false : z13, (16777216 & i12) != 0 ? null : iceBreakers, (33554432 & i12) != 0 ? null : d12, (67108864 & i12) != 0 ? null : map, (134217728 & i12) != 0 ? null : sellerRating, (268435456 & i12) != 0 ? false : z14, (536870912 & i12) != 0 ? false : z15, (1073741824 & i12) != 0 ? false : z16, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? false : z17, (i13 & 1) != 0 ? null : list, (i13 & 2) != 0 ? null : attributedText, (i13 & 4) != 0 ? false : z18, (i13 & 8) != 0 ? false : z19, (i13 & 16) != 0 ? false : z22, (i13 & 32) != 0 ? null : str14, (i13 & 64) != 0 ? null : str15, (i13 & 128) != 0 ? false : z23);
    }
}
