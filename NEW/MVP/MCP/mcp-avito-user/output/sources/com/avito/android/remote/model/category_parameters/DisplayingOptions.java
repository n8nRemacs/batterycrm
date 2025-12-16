package com.avito.android.remote.model.category_parameters;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context.ChannelContext;
import com.avito.android.remote.model.price_list.PriceListDisplayingOptions;
import com.avito.android.remote.model.text.AttributedText;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: DisplayingOptions.kt */
@d
@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b>\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001BÙ\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0007\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0004\u0012\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u000105\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b8\u00109J\u0012\u0010:\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b:\u0010;J\u0018\u0010<\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u0010;J\u0012\u0010A\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bA\u0010;J\u0012\u0010B\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bD\u0010EJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bF\u0010?J\u0010\u0010G\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bI\u0010?J\u0012\u0010J\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bJ\u0010;J\u0012\u0010K\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bK\u0010?J\u0012\u0010L\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bL\u0010?J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u0010;J\u0012\u0010N\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u0010;J\u0012\u0010Q\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bQ\u0010;J\u0012\u0010R\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bR\u0010;J\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u0010;J\u0012\u0010T\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bT\u0010;J\u0012\u0010U\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b[\u0010OJ\u0012\u0010\\\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\\\u0010?J\u0012\u0010]\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b]\u0010;J\u0012\u0010^\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\b^\u0010_J\u0012\u0010`\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\b`\u0010aJ\u0012\u0010b\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bd\u0010?J\u0012\u0010e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\be\u0010?J\u0012\u0010f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bf\u0010;J\u0012\u0010g\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bg\u0010?J\u0012\u0010h\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bh\u0010?J\u0018\u0010i\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bi\u0010=J\u0012\u0010j\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bj\u0010;J\u0012\u0010k\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bk\u0010;J\u0012\u0010l\u001a\u0004\u0018\u000105HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bn\u0010;Jî\u0003\u0010o\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010\u0010\u001a\u00020\u00072\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010$\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010.\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010/\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00100\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00042\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00104\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u0001052\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\bo\u0010pJ\u0010\u0010q\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\bq\u0010;J\u0010\u0010r\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\br\u0010sJ\u001a\u0010v\u001a\u00020\u00072\b\u0010u\u001a\u0004\u0018\u00010tHÖ\u0003¢\u0006\u0004\bv\u0010wJ\u0010\u0010x\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\bx\u0010sJ \u0010}\u001a\u00020|2\u0006\u0010z\u001a\u00020y2\u0006\u0010{\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b}\u0010~R\u001d\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0003\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010;R$\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010\u0081\u0001\u001a\u0005\b\u0082\u0001\u0010=R\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\b\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010?R\u001d\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\t\u0010\u007f\u001a\u0005\b\u0085\u0001\u0010;R\u001d\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\n\u0010\u007f\u001a\u0005\b\u0086\u0001\u0010;R\u001e\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\f\u0010\u0087\u0001\u001a\u0005\b\u0088\u0001\u0010CR\u001e\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000e\u0010\u0089\u0001\u001a\u0005\b\u008a\u0001\u0010ER\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u0083\u0001\u001a\u0005\b\u008b\u0001\u0010?R\u001c\u0010\u0010\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0010\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010HR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u0083\u0001\u001a\u0005\b\u008e\u0001\u0010?R\u001d\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0012\u0010\u007f\u001a\u0005\b\u008f\u0001\u0010;R\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u0083\u0001\u001a\u0005\b\u0090\u0001\u0010?R\u001e\u0010\u0014\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0014\u0010\u0083\u0001\u001a\u0005\b\u0091\u0001\u0010?R\u001d\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0015\u0010\u007f\u001a\u0005\b\u0092\u0001\u0010;R\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010OR\u001d\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0018\u0010\u007f\u001a\u0005\b\u0095\u0001\u0010;R\u001d\u0010\u0019\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u0019\u0010\u007f\u001a\u0005\b\u0096\u0001\u0010;R\u001d\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001a\u0010\u007f\u001a\u0005\b\u0097\u0001\u0010;R\u001d\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001b\u0010\u007f\u001a\u0005\b\u0098\u0001\u0010;R\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b\u001c\u0010\u007f\u001a\u0005\b\u0099\u0001\u0010;R\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010VR\u001e\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0010\u009c\u0001\u001a\u0005\b\u009d\u0001\u0010XR\u001e\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u009e\u0001\u001a\u0005\b\u009f\u0001\u0010ZR\u001e\u0010#\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b#\u0010\u0093\u0001\u001a\u0005\b \u0001\u0010OR\u001e\u0010$\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010\u0083\u0001\u001a\u0005\b¡\u0001\u0010?R\u001d\u0010%\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b%\u0010\u007f\u001a\u0005\b¢\u0001\u0010;R\u001b\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\b'\u0010£\u0001\u001a\u0005\b¤\u0001\u0010_R\u001e\u0010)\u001a\u0004\u0018\u00010(8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010¥\u0001\u001a\u0005\b¦\u0001\u0010aR\u001e\u0010+\u001a\u0004\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010§\u0001\u001a\u0005\b¨\u0001\u0010cR\u001e\u0010,\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u0083\u0001\u001a\u0005\b©\u0001\u0010?R\u001e\u0010-\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010\u0083\u0001\u001a\u0005\bª\u0001\u0010?R\u001d\u0010.\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b.\u0010\u007f\u001a\u0005\b«\u0001\u0010;R\u001e\u0010/\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b/\u0010\u0083\u0001\u001a\u0005\b¬\u0001\u0010?R\u001e\u00100\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010\u0083\u0001\u001a\u0005\b\u00ad\u0001\u0010?R$\u00102\u001a\n\u0012\u0004\u0012\u000201\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010\u0081\u0001\u001a\u0005\b®\u0001\u0010=R\u001d\u00103\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b3\u0010\u007f\u001a\u0005\b¯\u0001\u0010;R\u001d\u00104\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b4\u0010\u007f\u001a\u0005\b°\u0001\u0010;R\u001e\u00106\u001a\u0004\u0018\u0001058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b6\u0010±\u0001\u001a\u0005\b²\u0001\u0010mR\u001d\u00107\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b7\u0010\u007f\u001a\u0005\b³\u0001\u0010;¨\u0006´\u0001"}, d2 = {"Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "Landroid/os/Parcelable;", "", "type", "", "Lcom/avito/android/remote/model/category_parameters/MaskInfo;", "masks", "", "multiline", "prefix", "postfix", "", "length", "Lcom/avito/android/remote/model/category_parameters/FormatterType;", "formatter", "visible", "hideTitle", "enabled", "defaultValue", "disableMask", "sendUncheckedValue", "subTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "attributedSubtitle", ChannelContext.Item.PLACEHOLDER, "editScreenTitle", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "addButtonTitle", "editButtonTitle", "Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "dialogDisplaying", "Lcom/avito/android/remote/model/category_parameters/Badge;", "badge", "Lcom/avito/android/deep_linking/links/DeepLink;", "titleTipAction", "titleTipText", "shouldShowAlertBannerOnFocus", "alertBannerText", "Lcom/avito/android/remote/model/category_parameters/PhotoWidgetWithGroups;", "photoWidgetWithGroups", "Lcom/avito/android/remote/model/price_list/PriceListDisplayingOptions;", "priceListDisplaying", "Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "customPaddings", "withClearButton", "toFillIn", "titleStyle", "needFormatting", "showsAddressValue", "Lcom/avito/android/remote/model/category_parameters/ClearanceValue;", "clearanceValues", "label", "subtitle", "Lcom/avito/android/remote/model/UniversalImage;", "universalImage", "description", "<init>", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/FormatterType;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;Lcom/avito/android/remote/model/category_parameters/Badge;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/PhotoWidgetWithGroups;Lcom/avito/android/remote/model/price_list/PriceListDisplayingOptions;Lcom/avito/android/remote/model/category_parameters/CustomPaddings;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/util/List;", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "component6", "()Ljava/lang/Integer;", "component7", "()Lcom/avito/android/remote/model/category_parameters/FormatterType;", "component8", "component9", "()Z", "component10", "component11", "component12", "component13", "component14", "component15", "()Lcom/avito/android/remote/model/text/AttributedText;", "component16", "component17", "component18", "component19", "component20", "component21", "()Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "component22", "()Lcom/avito/android/remote/model/category_parameters/Badge;", "component23", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component24", "component25", "component26", "component27", "()Lcom/avito/android/remote/model/category_parameters/PhotoWidgetWithGroups;", "component28", "()Lcom/avito/android/remote/model/price_list/PriceListDisplayingOptions;", "component29", "()Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "component30", "component31", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "()Lcom/avito/android/remote/model/UniversalImage;", "component39", "copy", "(Ljava/lang/String;Ljava/util/List;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Lcom/avito/android/remote/model/category_parameters/FormatterType;Ljava/lang/Boolean;ZLjava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;Lcom/avito/android/remote/model/category_parameters/Badge;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/Boolean;Ljava/lang/String;Lcom/avito/android/remote/model/category_parameters/PhotoWidgetWithGroups;Lcom/avito/android/remote/model/price_list/PriceListDisplayingOptions;Lcom/avito/android/remote/model/category_parameters/CustomPaddings;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UniversalImage;Ljava/lang/String;)Lcom/avito/android/remote/model/category_parameters/DisplayingOptions;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getType", "Ljava/util/List;", "getMasks", "Ljava/lang/Boolean;", "getMultiline", "getPrefix", "getPostfix", "Ljava/lang/Integer;", "getLength", "Lcom/avito/android/remote/model/category_parameters/FormatterType;", "getFormatter", "getVisible", "Z", "getHideTitle", "getEnabled", "getDefaultValue", "getDisableMask", "getSendUncheckedValue", "getSubTitle", "Lcom/avito/android/remote/model/text/AttributedText;", "getAttributedSubtitle", "getPlaceholder", "getEditScreenTitle", "getStyle", "getAddButtonTitle", "getEditButtonTitle", "Lcom/avito/android/remote/model/category_parameters/DialogDisplaying;", "getDialogDisplaying", "Lcom/avito/android/remote/model/category_parameters/Badge;", "getBadge", "Lcom/avito/android/deep_linking/links/DeepLink;", "getTitleTipAction", "getTitleTipText", "getShouldShowAlertBannerOnFocus", "getAlertBannerText", "Lcom/avito/android/remote/model/category_parameters/PhotoWidgetWithGroups;", "getPhotoWidgetWithGroups", "Lcom/avito/android/remote/model/price_list/PriceListDisplayingOptions;", "getPriceListDisplaying", "Lcom/avito/android/remote/model/category_parameters/CustomPaddings;", "getCustomPaddings", "getWithClearButton", "getToFillIn", "getTitleStyle", "getNeedFormatting", "getShowsAddressValue", "getClearanceValues", "getLabel", "getSubtitle", "Lcom/avito/android/remote/model/UniversalImage;", "getUniversalImage", "getDescription", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class DisplayingOptions implements Parcelable {

    @k
    public static final Parcelable.Creator<DisplayingOptions> CREATOR = new Creator();

    @c("addButtonTitle")
    @l
    private final String addButtonTitle;

    @c("alertBannerText")
    @l
    private final String alertBannerText;

    @c("attributedSubtitle")
    @l
    private final AttributedText attributedSubtitle;

    @c("badge")
    @l
    private final Badge badge;

    @c("clearanceValues")
    @l
    private final List<ClearanceValue> clearanceValues;

    @c("customPaddings")
    @l
    private final CustomPaddings customPaddings;

    @c("defaultValue")
    @l
    private final String defaultValue;

    @c("description")
    @l
    private final String description;

    @c("dialog")
    @l
    private final DialogDisplaying dialogDisplaying;

    @c("disableMask")
    @l
    private final Boolean disableMask;

    @c("editButtonTitle")
    @l
    private final String editButtonTitle;

    @c("editScreenTitle")
    @l
    private final String editScreenTitle;

    @c("enabled")
    @l
    private final Boolean enabled;

    @c("formatter")
    @l
    private final FormatterType formatter;

    @c("hideTitle")
    private final boolean hideTitle;

    @c("label")
    @l
    private final String label;

    @c("length")
    @l
    private final Integer length;

    @c("masks")
    @l
    private final List<MaskInfo> masks;

    @c("multiline")
    @l
    private final Boolean multiline;

    @c("needFormatting")
    @l
    private final Boolean needFormatting;

    @l
    private final PhotoWidgetWithGroups photoWidgetWithGroups;

    @c(ChannelContext.Item.PLACEHOLDER)
    @l
    private final String placeholder;

    @c("postfix")
    @l
    private final String postfix;

    @c("prefix")
    @l
    private final String prefix;

    @c("priceListDisplaying")
    @l
    private final PriceListDisplayingOptions priceListDisplaying;

    @c("sendUncheckedValue")
    @l
    private final Boolean sendUncheckedValue;

    @c("shouldShowAlertBannerOnFocus")
    @l
    private final Boolean shouldShowAlertBannerOnFocus;

    @c("showsAddressValue")
    @l
    private final Boolean showsAddressValue;

    @c(BeduinPromoBlockModel.SERIALIZED_NAME_STYLE)
    @l
    private final String style;

    @c("subTitle")
    @l
    private final String subTitle;

    @c("subtitle")
    @l
    private final String subtitle;

    @c("titleStyle")
    @l
    private final String titleStyle;

    @c("titleTipAction")
    @l
    private final DeepLink titleTipAction;

    @c("titleTipText")
    @l
    private final AttributedText titleTipText;

    @c("toFillIn")
    @l
    private final Boolean toFillIn;

    @c("type")
    @l
    private final String type;

    @c("universalImage")
    @l
    private final UniversalImage universalImage;

    @c("visible")
    @l
    private final Boolean visible;

    @c("showClearButton")
    @l
    private final Boolean withClearButton;

    /* compiled from: DisplayingOptions.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<DisplayingOptions> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DisplayingOptions createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean boolValueOf6;
            Boolean boolValueOf7;
            Boolean boolValueOf8;
            Boolean boolValueOf9;
            Boolean boolValueOf10;
            String str;
            ArrayList arrayList2;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(MaskInfo.CREATOR, parcel, arrayList, iC2, 1);
                }
            }
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            FormatterType formatterTypeValueOf = parcel.readInt() == 0 ? null : FormatterType.valueOf(parcel.readString());
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            boolean z12 = parcel.readInt() != 0;
            if (parcel.readInt() == 0) {
                boolValueOf3 = null;
            } else {
                boolValueOf3 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string4 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(DisplayingOptions.class.getClassLoader());
            String string6 = parcel.readString();
            String string7 = parcel.readString();
            String string8 = parcel.readString();
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            DialogDisplaying dialogDisplayingCreateFromParcel = parcel.readInt() == 0 ? null : DialogDisplaying.CREATOR.createFromParcel(parcel);
            Badge badgeCreateFromParcel = parcel.readInt() == 0 ? null : Badge.CREATOR.createFromParcel(parcel);
            DeepLink deepLink = (DeepLink) parcel.readParcelable(DisplayingOptions.class.getClassLoader());
            AttributedText attributedText2 = (AttributedText) parcel.readParcelable(DisplayingOptions.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf6 = null;
            } else {
                boolValueOf6 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string11 = parcel.readString();
            PhotoWidgetWithGroups photoWidgetWithGroupsCreateFromParcel = parcel.readInt() == 0 ? null : PhotoWidgetWithGroups.CREATOR.createFromParcel(parcel);
            PriceListDisplayingOptions priceListDisplayingOptionsCreateFromParcel = parcel.readInt() == 0 ? null : PriceListDisplayingOptions.CREATOR.createFromParcel(parcel);
            CustomPaddings customPaddingsCreateFromParcel = parcel.readInt() == 0 ? null : CustomPaddings.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf7 = null;
            } else {
                boolValueOf7 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf8 = null;
            } else {
                boolValueOf8 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string12 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf9 = null;
            } else {
                boolValueOf9 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                boolValueOf10 = null;
            } else {
                boolValueOf10 = Boolean.valueOf(parcel.readInt() != 0);
            }
            if (parcel.readInt() == 0) {
                arrayList2 = null;
                str = string4;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                int iC3 = 0;
                while (iC3 != i13) {
                    iC3 = a.c(ClearanceValue.CREATOR, parcel, arrayList3, iC3, 1);
                    i13 = i13;
                    string4 = string4;
                }
                str = string4;
                arrayList2 = arrayList3;
            }
            return new DisplayingOptions(string, arrayList, boolValueOf, string2, string3, numValueOf, formatterTypeValueOf, boolValueOf2, z12, boolValueOf3, str, boolValueOf4, boolValueOf5, string5, attributedText, string6, string7, string8, string9, string10, dialogDisplayingCreateFromParcel, badgeCreateFromParcel, deepLink, attributedText2, boolValueOf6, string11, photoWidgetWithGroupsCreateFromParcel, priceListDisplayingOptionsCreateFromParcel, customPaddingsCreateFromParcel, boolValueOf7, boolValueOf8, string12, boolValueOf9, boolValueOf10, arrayList2, parcel.readString(), parcel.readString(), (UniversalImage) parcel.readParcelable(DisplayingOptions.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final DisplayingOptions[] newArray(int i12) {
            return new DisplayingOptions[i12];
        }
    }

    public DisplayingOptions(@l String str, @l List<MaskInfo> list, @l Boolean bool, @l String str2, @l String str3, @l Integer num, @l FormatterType formatterType, @l Boolean bool2, boolean z12, @l Boolean bool3, @l String str4, @l Boolean bool4, @l Boolean bool5, @l String str5, @l AttributedText attributedText, @l String str6, @l String str7, @l String str8, @l String str9, @l String str10, @l DialogDisplaying dialogDisplaying, @l Badge badge, @l DeepLink deepLink, @l AttributedText attributedText2, @l Boolean bool6, @l String str11, @l PhotoWidgetWithGroups photoWidgetWithGroups, @l PriceListDisplayingOptions priceListDisplayingOptions, @l CustomPaddings customPaddings, @l Boolean bool7, @l Boolean bool8, @l String str12, @l Boolean bool9, @l Boolean bool10, @l List<ClearanceValue> list2, @l String str13, @l String str14, @l UniversalImage universalImage, @l String str15) {
        this.type = str;
        this.masks = list;
        this.multiline = bool;
        this.prefix = str2;
        this.postfix = str3;
        this.length = num;
        this.formatter = formatterType;
        this.visible = bool2;
        this.hideTitle = z12;
        this.enabled = bool3;
        this.defaultValue = str4;
        this.disableMask = bool4;
        this.sendUncheckedValue = bool5;
        this.subTitle = str5;
        this.attributedSubtitle = attributedText;
        this.placeholder = str6;
        this.editScreenTitle = str7;
        this.style = str8;
        this.addButtonTitle = str9;
        this.editButtonTitle = str10;
        this.dialogDisplaying = dialogDisplaying;
        this.badge = badge;
        this.titleTipAction = deepLink;
        this.titleTipText = attributedText2;
        this.shouldShowAlertBannerOnFocus = bool6;
        this.alertBannerText = str11;
        this.photoWidgetWithGroups = photoWidgetWithGroups;
        this.priceListDisplaying = priceListDisplayingOptions;
        this.customPaddings = customPaddings;
        this.withClearButton = bool7;
        this.toFillIn = bool8;
        this.titleStyle = str12;
        this.needFormatting = bool9;
        this.showsAddressValue = bool10;
        this.clearanceValues = list2;
        this.label = str13;
        this.subtitle = str14;
        this.universalImage = universalImage;
        this.description = str15;
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final Boolean getDisableMask() {
        return this.disableMask;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Boolean getSendUncheckedValue() {
        return this.sendUncheckedValue;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final String getEditScreenTitle() {
        return this.editScreenTitle;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final String getStyle() {
        return this.style;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final String getAddButtonTitle() {
        return this.addButtonTitle;
    }

    @l
    public final List<MaskInfo> component2() {
        return this.masks;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final String getEditButtonTitle() {
        return this.editButtonTitle;
    }

    @l
    /* renamed from: component21, reason: from getter */
    public final DialogDisplaying getDialogDisplaying() {
        return this.dialogDisplaying;
    }

    @l
    /* renamed from: component22, reason: from getter */
    public final Badge getBadge() {
        return this.badge;
    }

    @l
    /* renamed from: component23, reason: from getter */
    public final DeepLink getTitleTipAction() {
        return this.titleTipAction;
    }

    @l
    /* renamed from: component24, reason: from getter */
    public final AttributedText getTitleTipText() {
        return this.titleTipText;
    }

    @l
    /* renamed from: component25, reason: from getter */
    public final Boolean getShouldShowAlertBannerOnFocus() {
        return this.shouldShowAlertBannerOnFocus;
    }

    @l
    /* renamed from: component26, reason: from getter */
    public final String getAlertBannerText() {
        return this.alertBannerText;
    }

    @l
    /* renamed from: component27, reason: from getter */
    public final PhotoWidgetWithGroups getPhotoWidgetWithGroups() {
        return this.photoWidgetWithGroups;
    }

    @l
    /* renamed from: component28, reason: from getter */
    public final PriceListDisplayingOptions getPriceListDisplaying() {
        return this.priceListDisplaying;
    }

    @l
    /* renamed from: component29, reason: from getter */
    public final CustomPaddings getCustomPaddings() {
        return this.customPaddings;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final Boolean getMultiline() {
        return this.multiline;
    }

    @l
    /* renamed from: component30, reason: from getter */
    public final Boolean getWithClearButton() {
        return this.withClearButton;
    }

    @l
    /* renamed from: component31, reason: from getter */
    public final Boolean getToFillIn() {
        return this.toFillIn;
    }

    @l
    /* renamed from: component32, reason: from getter */
    public final String getTitleStyle() {
        return this.titleStyle;
    }

    @l
    /* renamed from: component33, reason: from getter */
    public final Boolean getNeedFormatting() {
        return this.needFormatting;
    }

    @l
    /* renamed from: component34, reason: from getter */
    public final Boolean getShowsAddressValue() {
        return this.showsAddressValue;
    }

    @l
    public final List<ClearanceValue> component35() {
        return this.clearanceValues;
    }

    @l
    /* renamed from: component36, reason: from getter */
    public final String getLabel() {
        return this.label;
    }

    @l
    /* renamed from: component37, reason: from getter */
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    /* renamed from: component38, reason: from getter */
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    @l
    /* renamed from: component39, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getPrefix() {
        return this.prefix;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final String getPostfix() {
        return this.postfix;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Integer getLength() {
        return this.length;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final FormatterType getFormatter() {
        return this.formatter;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final Boolean getVisible() {
        return this.visible;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHideTitle() {
        return this.hideTitle;
    }

    @k
    public final DisplayingOptions copy(@l String type, @l List<MaskInfo> masks, @l Boolean multiline, @l String prefix, @l String postfix, @l Integer length, @l FormatterType formatter, @l Boolean visible, boolean hideTitle, @l Boolean enabled, @l String defaultValue, @l Boolean disableMask, @l Boolean sendUncheckedValue, @l String subTitle, @l AttributedText attributedSubtitle, @l String placeholder, @l String editScreenTitle, @l String style, @l String addButtonTitle, @l String editButtonTitle, @l DialogDisplaying dialogDisplaying, @l Badge badge, @l DeepLink titleTipAction, @l AttributedText titleTipText, @l Boolean shouldShowAlertBannerOnFocus, @l String alertBannerText, @l PhotoWidgetWithGroups photoWidgetWithGroups, @l PriceListDisplayingOptions priceListDisplaying, @l CustomPaddings customPaddings, @l Boolean withClearButton, @l Boolean toFillIn, @l String titleStyle, @l Boolean needFormatting, @l Boolean showsAddressValue, @l List<ClearanceValue> clearanceValues, @l String label, @l String subtitle, @l UniversalImage universalImage, @l String description) {
        return new DisplayingOptions(type, masks, multiline, prefix, postfix, length, formatter, visible, hideTitle, enabled, defaultValue, disableMask, sendUncheckedValue, subTitle, attributedSubtitle, placeholder, editScreenTitle, style, addButtonTitle, editButtonTitle, dialogDisplaying, badge, titleTipAction, titleTipText, shouldShowAlertBannerOnFocus, alertBannerText, photoWidgetWithGroups, priceListDisplaying, customPaddings, withClearButton, toFillIn, titleStyle, needFormatting, showsAddressValue, clearanceValues, label, subtitle, universalImage, description);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof DisplayingOptions)) {
            return false;
        }
        DisplayingOptions displayingOptions = (DisplayingOptions) other;
        return L.f(this.type, displayingOptions.type) && L.f(this.masks, displayingOptions.masks) && L.f(this.multiline, displayingOptions.multiline) && L.f(this.prefix, displayingOptions.prefix) && L.f(this.postfix, displayingOptions.postfix) && L.f(this.length, displayingOptions.length) && this.formatter == displayingOptions.formatter && L.f(this.visible, displayingOptions.visible) && this.hideTitle == displayingOptions.hideTitle && L.f(this.enabled, displayingOptions.enabled) && L.f(this.defaultValue, displayingOptions.defaultValue) && L.f(this.disableMask, displayingOptions.disableMask) && L.f(this.sendUncheckedValue, displayingOptions.sendUncheckedValue) && L.f(this.subTitle, displayingOptions.subTitle) && L.f(this.attributedSubtitle, displayingOptions.attributedSubtitle) && L.f(this.placeholder, displayingOptions.placeholder) && L.f(this.editScreenTitle, displayingOptions.editScreenTitle) && L.f(this.style, displayingOptions.style) && L.f(this.addButtonTitle, displayingOptions.addButtonTitle) && L.f(this.editButtonTitle, displayingOptions.editButtonTitle) && L.f(this.dialogDisplaying, displayingOptions.dialogDisplaying) && L.f(this.badge, displayingOptions.badge) && L.f(this.titleTipAction, displayingOptions.titleTipAction) && L.f(this.titleTipText, displayingOptions.titleTipText) && L.f(this.shouldShowAlertBannerOnFocus, displayingOptions.shouldShowAlertBannerOnFocus) && L.f(this.alertBannerText, displayingOptions.alertBannerText) && L.f(this.photoWidgetWithGroups, displayingOptions.photoWidgetWithGroups) && L.f(this.priceListDisplaying, displayingOptions.priceListDisplaying) && L.f(this.customPaddings, displayingOptions.customPaddings) && L.f(this.withClearButton, displayingOptions.withClearButton) && L.f(this.toFillIn, displayingOptions.toFillIn) && L.f(this.titleStyle, displayingOptions.titleStyle) && L.f(this.needFormatting, displayingOptions.needFormatting) && L.f(this.showsAddressValue, displayingOptions.showsAddressValue) && L.f(this.clearanceValues, displayingOptions.clearanceValues) && L.f(this.label, displayingOptions.label) && L.f(this.subtitle, displayingOptions.subtitle) && L.f(this.universalImage, displayingOptions.universalImage) && L.f(this.description, displayingOptions.description);
    }

    @l
    public final String getAddButtonTitle() {
        return this.addButtonTitle;
    }

    @l
    public final String getAlertBannerText() {
        return this.alertBannerText;
    }

    @l
    public final AttributedText getAttributedSubtitle() {
        return this.attributedSubtitle;
    }

    @l
    public final Badge getBadge() {
        return this.badge;
    }

    @l
    public final List<ClearanceValue> getClearanceValues() {
        return this.clearanceValues;
    }

    @l
    public final CustomPaddings getCustomPaddings() {
        return this.customPaddings;
    }

    @l
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    @l
    public final String getDescription() {
        return this.description;
    }

    @l
    public final DialogDisplaying getDialogDisplaying() {
        return this.dialogDisplaying;
    }

    @l
    public final Boolean getDisableMask() {
        return this.disableMask;
    }

    @l
    public final String getEditButtonTitle() {
        return this.editButtonTitle;
    }

    @l
    public final String getEditScreenTitle() {
        return this.editScreenTitle;
    }

    @l
    public final Boolean getEnabled() {
        return this.enabled;
    }

    @l
    public final FormatterType getFormatter() {
        return this.formatter;
    }

    public final boolean getHideTitle() {
        return this.hideTitle;
    }

    @l
    public final String getLabel() {
        return this.label;
    }

    @l
    public final Integer getLength() {
        return this.length;
    }

    @l
    public final List<MaskInfo> getMasks() {
        return this.masks;
    }

    @l
    public final Boolean getMultiline() {
        return this.multiline;
    }

    @l
    public final Boolean getNeedFormatting() {
        return this.needFormatting;
    }

    @l
    public final PhotoWidgetWithGroups getPhotoWidgetWithGroups() {
        return this.photoWidgetWithGroups;
    }

    @l
    public final String getPlaceholder() {
        return this.placeholder;
    }

    @l
    public final String getPostfix() {
        return this.postfix;
    }

    @l
    public final String getPrefix() {
        return this.prefix;
    }

    @l
    public final PriceListDisplayingOptions getPriceListDisplaying() {
        return this.priceListDisplaying;
    }

    @l
    public final Boolean getSendUncheckedValue() {
        return this.sendUncheckedValue;
    }

    @l
    public final Boolean getShouldShowAlertBannerOnFocus() {
        return this.shouldShowAlertBannerOnFocus;
    }

    @l
    public final Boolean getShowsAddressValue() {
        return this.showsAddressValue;
    }

    @l
    public final String getStyle() {
        return this.style;
    }

    @l
    public final String getSubTitle() {
        return this.subTitle;
    }

    @l
    public final String getSubtitle() {
        return this.subtitle;
    }

    @l
    public final String getTitleStyle() {
        return this.titleStyle;
    }

    @l
    public final DeepLink getTitleTipAction() {
        return this.titleTipAction;
    }

    @l
    public final AttributedText getTitleTipText() {
        return this.titleTipText;
    }

    @l
    public final Boolean getToFillIn() {
        return this.toFillIn;
    }

    @l
    public final String getType() {
        return this.type;
    }

    @l
    public final UniversalImage getUniversalImage() {
        return this.universalImage;
    }

    @l
    public final Boolean getVisible() {
        return this.visible;
    }

    @l
    public final Boolean getWithClearButton() {
        return this.withClearButton;
    }

    public int hashCode() {
        String str = this.type;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        List<MaskInfo> list = this.masks;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        Boolean bool = this.multiline;
        int iHashCode3 = (iHashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.prefix;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.postfix;
        int iHashCode5 = (iHashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Integer num = this.length;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        FormatterType formatterType = this.formatter;
        int iHashCode7 = (iHashCode6 + (formatterType == null ? 0 : formatterType.hashCode())) * 31;
        Boolean bool2 = this.visible;
        int i12 = r.i((iHashCode7 + (bool2 == null ? 0 : bool2.hashCode())) * 31, 31, this.hideTitle);
        Boolean bool3 = this.enabled;
        int iHashCode8 = (i12 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        String str4 = this.defaultValue;
        int iHashCode9 = (iHashCode8 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Boolean bool4 = this.disableMask;
        int iHashCode10 = (iHashCode9 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        Boolean bool5 = this.sendUncheckedValue;
        int iHashCode11 = (iHashCode10 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str5 = this.subTitle;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        AttributedText attributedText = this.attributedSubtitle;
        int iHashCode13 = (iHashCode12 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str6 = this.placeholder;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        String str7 = this.editScreenTitle;
        int iHashCode15 = (iHashCode14 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.style;
        int iHashCode16 = (iHashCode15 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.addButtonTitle;
        int iHashCode17 = (iHashCode16 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.editButtonTitle;
        int iHashCode18 = (iHashCode17 + (str10 == null ? 0 : str10.hashCode())) * 31;
        DialogDisplaying dialogDisplaying = this.dialogDisplaying;
        int iHashCode19 = (iHashCode18 + (dialogDisplaying == null ? 0 : dialogDisplaying.hashCode())) * 31;
        Badge badge = this.badge;
        int iHashCode20 = (iHashCode19 + (badge == null ? 0 : badge.hashCode())) * 31;
        DeepLink deepLink = this.titleTipAction;
        int iHashCode21 = (iHashCode20 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        AttributedText attributedText2 = this.titleTipText;
        int iHashCode22 = (iHashCode21 + (attributedText2 == null ? 0 : attributedText2.hashCode())) * 31;
        Boolean bool6 = this.shouldShowAlertBannerOnFocus;
        int iHashCode23 = (iHashCode22 + (bool6 == null ? 0 : bool6.hashCode())) * 31;
        String str11 = this.alertBannerText;
        int iHashCode24 = (iHashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        PhotoWidgetWithGroups photoWidgetWithGroups = this.photoWidgetWithGroups;
        int iHashCode25 = (iHashCode24 + (photoWidgetWithGroups == null ? 0 : photoWidgetWithGroups.hashCode())) * 31;
        PriceListDisplayingOptions priceListDisplayingOptions = this.priceListDisplaying;
        int iHashCode26 = (iHashCode25 + (priceListDisplayingOptions == null ? 0 : priceListDisplayingOptions.hashCode())) * 31;
        CustomPaddings customPaddings = this.customPaddings;
        int iHashCode27 = (iHashCode26 + (customPaddings == null ? 0 : customPaddings.hashCode())) * 31;
        Boolean bool7 = this.withClearButton;
        int iHashCode28 = (iHashCode27 + (bool7 == null ? 0 : bool7.hashCode())) * 31;
        Boolean bool8 = this.toFillIn;
        int iHashCode29 = (iHashCode28 + (bool8 == null ? 0 : bool8.hashCode())) * 31;
        String str12 = this.titleStyle;
        int iHashCode30 = (iHashCode29 + (str12 == null ? 0 : str12.hashCode())) * 31;
        Boolean bool9 = this.needFormatting;
        int iHashCode31 = (iHashCode30 + (bool9 == null ? 0 : bool9.hashCode())) * 31;
        Boolean bool10 = this.showsAddressValue;
        int iHashCode32 = (iHashCode31 + (bool10 == null ? 0 : bool10.hashCode())) * 31;
        List<ClearanceValue> list2 = this.clearanceValues;
        int iHashCode33 = (iHashCode32 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str13 = this.label;
        int iHashCode34 = (iHashCode33 + (str13 == null ? 0 : str13.hashCode())) * 31;
        String str14 = this.subtitle;
        int iHashCode35 = (iHashCode34 + (str14 == null ? 0 : str14.hashCode())) * 31;
        UniversalImage universalImage = this.universalImage;
        int iHashCode36 = (iHashCode35 + (universalImage == null ? 0 : universalImage.hashCode())) * 31;
        String str15 = this.description;
        return iHashCode36 + (str15 != null ? str15.hashCode() : 0);
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DisplayingOptions(type=");
        sb2.append(this.type);
        sb2.append(", masks=");
        sb2.append(this.masks);
        sb2.append(", multiline=");
        sb2.append(this.multiline);
        sb2.append(", prefix=");
        sb2.append(this.prefix);
        sb2.append(", postfix=");
        sb2.append(this.postfix);
        sb2.append(", length=");
        sb2.append(this.length);
        sb2.append(", formatter=");
        sb2.append(this.formatter);
        sb2.append(", visible=");
        sb2.append(this.visible);
        sb2.append(", hideTitle=");
        sb2.append(this.hideTitle);
        sb2.append(", enabled=");
        sb2.append(this.enabled);
        sb2.append(", defaultValue=");
        sb2.append(this.defaultValue);
        sb2.append(", disableMask=");
        sb2.append(this.disableMask);
        sb2.append(", sendUncheckedValue=");
        sb2.append(this.sendUncheckedValue);
        sb2.append(", subTitle=");
        sb2.append(this.subTitle);
        sb2.append(", attributedSubtitle=");
        sb2.append(this.attributedSubtitle);
        sb2.append(", placeholder=");
        sb2.append(this.placeholder);
        sb2.append(", editScreenTitle=");
        sb2.append(this.editScreenTitle);
        sb2.append(", style=");
        sb2.append(this.style);
        sb2.append(", addButtonTitle=");
        sb2.append(this.addButtonTitle);
        sb2.append(", editButtonTitle=");
        sb2.append(this.editButtonTitle);
        sb2.append(", dialogDisplaying=");
        sb2.append(this.dialogDisplaying);
        sb2.append(", badge=");
        sb2.append(this.badge);
        sb2.append(", titleTipAction=");
        sb2.append(this.titleTipAction);
        sb2.append(", titleTipText=");
        sb2.append(this.titleTipText);
        sb2.append(", shouldShowAlertBannerOnFocus=");
        sb2.append(this.shouldShowAlertBannerOnFocus);
        sb2.append(", alertBannerText=");
        sb2.append(this.alertBannerText);
        sb2.append(", photoWidgetWithGroups=");
        sb2.append(this.photoWidgetWithGroups);
        sb2.append(", priceListDisplaying=");
        sb2.append(this.priceListDisplaying);
        sb2.append(", customPaddings=");
        sb2.append(this.customPaddings);
        sb2.append(", withClearButton=");
        sb2.append(this.withClearButton);
        sb2.append(", toFillIn=");
        sb2.append(this.toFillIn);
        sb2.append(", titleStyle=");
        sb2.append(this.titleStyle);
        sb2.append(", needFormatting=");
        sb2.append(this.needFormatting);
        sb2.append(", showsAddressValue=");
        sb2.append(this.showsAddressValue);
        sb2.append(", clearanceValues=");
        sb2.append(this.clearanceValues);
        sb2.append(", label=");
        sb2.append(this.label);
        sb2.append(", subtitle=");
        sb2.append(this.subtitle);
        sb2.append(", universalImage=");
        sb2.append(this.universalImage);
        sb2.append(", description=");
        return C22026a.c(sb2, this.description, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.type);
        List<MaskInfo> list = this.masks;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((MaskInfo) itA.next()).writeToParcel(parcel, flags);
            }
        }
        Boolean bool = this.multiline;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.prefix);
        parcel.writeString(this.postfix);
        Integer num = this.length;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        FormatterType formatterType = this.formatter;
        if (formatterType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(formatterType.name());
        }
        Boolean bool2 = this.visible;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        parcel.writeInt(this.hideTitle ? 1 : 0);
        Boolean bool3 = this.enabled;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        parcel.writeString(this.defaultValue);
        Boolean bool4 = this.disableMask;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        Boolean bool5 = this.sendUncheckedValue;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool5);
        }
        parcel.writeString(this.subTitle);
        parcel.writeParcelable(this.attributedSubtitle, flags);
        parcel.writeString(this.placeholder);
        parcel.writeString(this.editScreenTitle);
        parcel.writeString(this.style);
        parcel.writeString(this.addButtonTitle);
        parcel.writeString(this.editButtonTitle);
        DialogDisplaying dialogDisplaying = this.dialogDisplaying;
        if (dialogDisplaying == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            dialogDisplaying.writeToParcel(parcel, flags);
        }
        Badge badge = this.badge;
        if (badge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            badge.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.titleTipAction, flags);
        parcel.writeParcelable(this.titleTipText, flags);
        Boolean bool6 = this.shouldShowAlertBannerOnFocus;
        if (bool6 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool6);
        }
        parcel.writeString(this.alertBannerText);
        PhotoWidgetWithGroups photoWidgetWithGroups = this.photoWidgetWithGroups;
        if (photoWidgetWithGroups == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            photoWidgetWithGroups.writeToParcel(parcel, flags);
        }
        PriceListDisplayingOptions priceListDisplayingOptions = this.priceListDisplaying;
        if (priceListDisplayingOptions == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceListDisplayingOptions.writeToParcel(parcel, flags);
        }
        CustomPaddings customPaddings = this.customPaddings;
        if (customPaddings == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            customPaddings.writeToParcel(parcel, flags);
        }
        Boolean bool7 = this.withClearButton;
        if (bool7 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool7);
        }
        Boolean bool8 = this.toFillIn;
        if (bool8 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool8);
        }
        parcel.writeString(this.titleStyle);
        Boolean bool9 = this.needFormatting;
        if (bool9 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool9);
        }
        Boolean bool10 = this.showsAddressValue;
        if (bool10 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool10);
        }
        List<ClearanceValue> list2 = this.clearanceValues;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                ((ClearanceValue) itA2.next()).writeToParcel(parcel, flags);
            }
        }
        parcel.writeString(this.label);
        parcel.writeString(this.subtitle);
        parcel.writeParcelable(this.universalImage, flags);
        parcel.writeString(this.description);
    }

    public /* synthetic */ DisplayingOptions(String str, List list, Boolean bool, String str2, String str3, Integer num, FormatterType formatterType, Boolean bool2, boolean z12, Boolean bool3, String str4, Boolean bool4, Boolean bool5, String str5, AttributedText attributedText, String str6, String str7, String str8, String str9, String str10, DialogDisplaying dialogDisplaying, Badge badge, DeepLink deepLink, AttributedText attributedText2, Boolean bool6, String str11, PhotoWidgetWithGroups photoWidgetWithGroups, PriceListDisplayingOptions priceListDisplayingOptions, CustomPaddings customPaddings, Boolean bool7, Boolean bool8, String str12, Boolean bool9, Boolean bool10, List list2, String str13, String str14, UniversalImage universalImage, String str15, int i12, int i13, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : list, bool, str2, str3, num, formatterType, bool2, (i12 & 256) != 0 ? false : z12, (i12 & 512) != 0 ? null : bool3, (i12 & 1024) != 0 ? null : str4, (i12 & 2048) != 0 ? null : bool4, (i12 & 4096) != 0 ? Boolean.FALSE : bool5, (i12 & 8192) != 0 ? null : str5, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : attributedText, (32768 & i12) != 0 ? null : str6, (65536 & i12) != 0 ? null : str7, (131072 & i12) != 0 ? null : str8, (262144 & i12) != 0 ? null : str9, (524288 & i12) != 0 ? null : str10, (1048576 & i12) != 0 ? null : dialogDisplaying, (2097152 & i12) != 0 ? null : badge, (4194304 & i12) != 0 ? null : deepLink, (8388608 & i12) != 0 ? null : attributedText2, (16777216 & i12) != 0 ? null : bool6, (33554432 & i12) != 0 ? null : str11, (67108864 & i12) != 0 ? null : photoWidgetWithGroups, (134217728 & i12) != 0 ? null : priceListDisplayingOptions, (268435456 & i12) != 0 ? null : customPaddings, (536870912 & i12) != 0 ? null : bool7, (1073741824 & i12) != 0 ? null : bool8, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : str12, (i13 & 1) != 0 ? null : bool9, (i13 & 2) != 0 ? null : bool10, (i13 & 4) != 0 ? null : list2, (i13 & 8) != 0 ? null : str13, (i13 & 16) != 0 ? null : str14, (i13 & 32) != 0 ? null : universalImage, (i13 & 64) != 0 ? null : str15);
    }
}
