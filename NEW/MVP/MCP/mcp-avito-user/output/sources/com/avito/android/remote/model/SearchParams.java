package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.compose.runtime.C22026a;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.mvi.entity.f;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.map.Area;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: SearchParams.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b5\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\\\b\u0087\b\u0018\u0000 Ã\u00012\u00020\u0001:\u0002Ã\u0001B»\u0003\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0018\u00010\f\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b.\u0010/J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u00101J\u0012\u00102\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b2\u00103J\u0012\u00104\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b4\u00101J\u0012\u00105\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b5\u00101J\u0018\u00106\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b6\u00107J\u0018\u00108\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b8\u00107J\u0018\u00109\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b9\u00107J\"\u0010:\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b<\u0010=J\u0012\u0010>\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b>\u0010=J\u0012\u0010?\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b?\u00101J\u0012\u0010@\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b@\u00101J\u0018\u0010A\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bA\u00107J\u0012\u0010B\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bB\u00101J\u0012\u0010C\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u00101J\u0012\u0010F\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bH\u00101J\u0012\u0010I\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bI\u0010DJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bJ\u0010DJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bK\u0010DJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bL\u00101J\u0012\u0010M\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bM\u00101J\u0012\u0010N\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bN\u00101J\u0012\u0010O\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bO\u00101J\u0012\u0010P\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bP\u00101J\u0012\u0010Q\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bS\u00101J\u0012\u0010T\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bT\u0010DJ\u0012\u0010U\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010*HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bY\u00101J\u0012\u0010Z\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bZ\u00101JÄ\u0003\u0010[\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0010\b\u0002\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\u001a\b\u0002\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0018\u00010\f2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010!\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\n\b\u0002\u0010+\u001a\u0004\u0018\u00010*2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b[\u0010\\J\u0010\u0010]\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b]\u00101J\u0010\u0010^\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\b^\u0010_J\u001a\u0010b\u001a\u00020\u00162\b\u0010a\u001a\u0004\u0018\u00010`HÖ\u0003¢\u0006\u0004\bb\u0010cJ\u0010\u0010d\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bd\u0010_J \u0010i\u001a\u00020h2\u0006\u0010f\u001a\u00020e2\u0006\u0010g\u001a\u00020\u0019HÖ\u0001¢\u0006\u0004\bi\u0010jR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010k\u001a\u0004\bl\u00101\"\u0004\bm\u0010nR$\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010o\u001a\u0004\bp\u00103\"\u0004\bq\u0010rR$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010k\u001a\u0004\bs\u00101\"\u0004\bt\u0010nR$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010k\u001a\u0004\bu\u00101\"\u0004\bv\u0010nR*\u0010\t\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\t\u0010w\u001a\u0004\bx\u00107\"\u0004\by\u0010zR*\u0010\n\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\n\u0010w\u001a\u0004\b{\u00107\"\u0004\b|\u0010zR*\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u000b\u0010w\u001a\u0004\b}\u00107\"\u0004\b~\u0010zR7\u0010\u000e\u001a\u0014\u0012\u0004\u0012\u00020\u0002\u0012\b\u0012\u0006\u0012\u0002\b\u00030\r\u0018\u00010\f8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0004\b\u000e\u0010\u007f\u001a\u0005\b\u0080\u0001\u0010;\"\u0006\b\u0081\u0001\u0010\u0082\u0001R(\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0010\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010=\"\u0006\b\u0085\u0001\u0010\u0086\u0001R(\u0010\u0011\u001a\u0004\u0018\u00010\u000f8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0011\u0010\u0083\u0001\u001a\u0005\b\u0087\u0001\u0010=\"\u0006\b\u0088\u0001\u0010\u0086\u0001R&\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0012\u0010k\u001a\u0005\b\u0089\u0001\u00101\"\u0005\b\u008a\u0001\u0010nR&\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0013\u0010k\u001a\u0005\b\u008b\u0001\u00101\"\u0005\b\u008c\u0001\u0010nR,\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0014\u0010w\u001a\u0005\b\u008d\u0001\u00107\"\u0005\b\u008e\u0001\u0010zR&\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0015\u0010k\u001a\u0005\b\u008f\u0001\u00101\"\u0005\b\u0090\u0001\u0010nR(\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u0017\u0010\u0091\u0001\u001a\u0005\b\u0092\u0001\u0010D\"\u0006\b\u0093\u0001\u0010\u0094\u0001R&\u0010\u0018\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u0018\u0010k\u001a\u0005\b\u0095\u0001\u00101\"\u0005\b\u0096\u0001\u0010nR(\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001a\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010G\"\u0006\b\u0099\u0001\u0010\u009a\u0001R&\u0010\u001b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u001b\u0010k\u001a\u0005\b\u009b\u0001\u00101\"\u0005\b\u009c\u0001\u0010nR(\u0010\u001c\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001c\u0010\u0091\u0001\u001a\u0005\b\u009d\u0001\u0010D\"\u0006\b\u009e\u0001\u0010\u0094\u0001R(\u0010\u001d\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001d\u0010\u0091\u0001\u001a\u0005\b\u009f\u0001\u0010D\"\u0006\b \u0001\u0010\u0094\u0001R(\u0010\u001e\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b\u001e\u0010\u0091\u0001\u001a\u0005\b¡\u0001\u0010D\"\u0006\b¢\u0001\u0010\u0094\u0001R&\u0010\u001f\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\u001f\u0010k\u001a\u0005\b£\u0001\u00101\"\u0005\b¤\u0001\u0010nR&\u0010 \u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b \u0010k\u001a\u0005\b¥\u0001\u00101\"\u0005\b¦\u0001\u0010nR&\u0010!\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b!\u0010k\u001a\u0005\b§\u0001\u00101\"\u0005\b¨\u0001\u0010nR&\u0010\"\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b\"\u0010k\u001a\u0005\b©\u0001\u00101\"\u0005\bª\u0001\u0010nR&\u0010#\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b#\u0010k\u001a\u0005\b«\u0001\u00101\"\u0005\b¬\u0001\u0010nR(\u0010%\u001a\u0004\u0018\u00010$8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b%\u0010\u00ad\u0001\u001a\u0005\b®\u0001\u0010R\"\u0006\b¯\u0001\u0010°\u0001R&\u0010&\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b&\u0010k\u001a\u0005\b±\u0001\u00101\"\u0005\b²\u0001\u0010nR(\u0010'\u001a\u0004\u0018\u00010\u00168\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b'\u0010\u0091\u0001\u001a\u0005\b³\u0001\u0010D\"\u0006\b´\u0001\u0010\u0094\u0001R(\u0010)\u001a\u0004\u0018\u00010(8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b)\u0010µ\u0001\u001a\u0005\b¶\u0001\u0010V\"\u0006\b·\u0001\u0010¸\u0001R(\u0010+\u001a\u0004\u0018\u00010*8\u0006@\u0006X\u0086\u000e¢\u0006\u0016\n\u0005\b+\u0010¹\u0001\u001a\u0005\bº\u0001\u0010X\"\u0006\b»\u0001\u0010¼\u0001R&\u0010,\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b,\u0010k\u001a\u0005\b½\u0001\u00101\"\u0005\b¾\u0001\u0010nR&\u0010-\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0014\n\u0004\b-\u0010k\u001a\u0005\b¿\u0001\u00101\"\u0005\bÀ\u0001\u0010nR\u0014\u0010Á\u0001\u001a\u00020\u00168F¢\u0006\b\u001a\u0006\bÁ\u0001\u0010Â\u0001¨\u0006Ä\u0001"}, d2 = {"Lcom/avito/android/remote/model/SearchParams;", "Landroid/os/Parcelable;", "", "categoryId", "Lcom/avito/android/remote/model/Coordinates;", SearchParamsConverterKt.GEO_COORDS, SearchParamsConverterKt.LOCATION_ID, "suggestLocationId", "", "metroIds", SearchParamsConverterKt.DIRECTION_ID, SearchParamsConverterKt.DISTRICT_ID, "", "Lcom/avito/android/remote/model/SearchParam;", "params", "", SearchParamsConverterKt.PRICE_MAX, SearchParamsConverterKt.PRICE_MIN, "query", "title", SearchParamsConverterKt.OWNER, SearchParamsConverterKt.SORT, "", SearchParamsConverterKt.WITH_IMAGES_ONLY, "searchRadius", "", "radius", SearchParamsConverterKt.FOOT_WALKING_METRO, SearchParamsConverterKt.WITH_DELIVERY_ONLY, "localPriority", "earlyAccess", SearchParamsConverterKt.MORE_EXPENSIVE, SearchParamsConverterKt.WIDGET_CATEGORY, SearchParamsConverterKt.EXPANDED, SearchParamsConverterKt.SELLER_ID, SearchParamsConverterKt.CV_2_VACANCY, "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", SearchParamsConverterKt.SHOP_ID, "forcedLocationForRecommendation", "Lcom/avito/android/remote/model/search/map/Area;", "area", "Lcom/avito/android/remote/model/Source;", SearchParamsConverterKt.SOURCE, "clarifyIconType", SearchParamsConverterKt.DRAW_ID, "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SerpDisplayType;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/search/map/Area;Lcom/avito/android/remote/model/Source;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/remote/model/Coordinates;", "component3", "component4", "component5", "()Ljava/util/List;", "component6", "component7", "component8", "()Ljava/util/Map;", "component9", "()Ljava/lang/Long;", "component10", "component11", "component12", "component13", "component14", "component15", "()Ljava/lang/Boolean;", "component16", "component17", "()Ljava/lang/Integer;", "component18", "component19", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "()Lcom/avito/android/remote/model/SerpDisplayType;", "component28", "component29", "component30", "()Lcom/avito/android/remote/model/search/map/Area;", "component31", "()Lcom/avito/android/remote/model/Source;", "component32", "component33", "copy", "(Ljava/lang/String;Lcom/avito/android/remote/model/Coordinates;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/util/Map;Ljava/lang/Long;Ljava/lang/Long;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/SerpDisplayType;Ljava/lang/String;Ljava/lang/Boolean;Lcom/avito/android/remote/model/search/map/Area;Lcom/avito/android/remote/model/Source;Ljava/lang/String;Ljava/lang/String;)Lcom/avito/android/remote/model/SearchParams;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getCategoryId", "setCategoryId", "(Ljava/lang/String;)V", "Lcom/avito/android/remote/model/Coordinates;", "getGeoCoords", "setGeoCoords", "(Lcom/avito/android/remote/model/Coordinates;)V", "getLocationId", "setLocationId", "getSuggestLocationId", "setSuggestLocationId", "Ljava/util/List;", "getMetroIds", "setMetroIds", "(Ljava/util/List;)V", "getDirectionId", "setDirectionId", "getDistrictId", "setDistrictId", "Ljava/util/Map;", "getParams", "setParams", "(Ljava/util/Map;)V", "Ljava/lang/Long;", "getPriceMax", "setPriceMax", "(Ljava/lang/Long;)V", "getPriceMin", "setPriceMin", "getQuery", "setQuery", "getTitle", "setTitle", "getOwner", "setOwner", "getSort", "setSort", "Ljava/lang/Boolean;", "getWithImagesOnly", "setWithImagesOnly", "(Ljava/lang/Boolean;)V", "getSearchRadius", "setSearchRadius", "Ljava/lang/Integer;", "getRadius", "setRadius", "(Ljava/lang/Integer;)V", "getFootWalkingMetro", "setFootWalkingMetro", "getWithDeliveryOnly", "setWithDeliveryOnly", "getLocalPriority", "setLocalPriority", "getEarlyAccess", "setEarlyAccess", "getMoreExpensive", "setMoreExpensive", "getWidgetCategory", "setWidgetCategory", "getExpanded", "setExpanded", "getSellerId", "setSellerId", "getCv2Vacancy", "setCv2Vacancy", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "setDisplayType", "(Lcom/avito/android/remote/model/SerpDisplayType;)V", "getShopId", "setShopId", "getForcedLocationForRecommendation", "setForcedLocationForRecommendation", "Lcom/avito/android/remote/model/search/map/Area;", "getArea", "setArea", "(Lcom/avito/android/remote/model/search/map/Area;)V", "Lcom/avito/android/remote/model/Source;", "getSource", "setSource", "(Lcom/avito/android/remote/model/Source;)V", "getClarifyIconType", "setClarifyIconType", "getDrawId", "setDrawId", "isLongRequest", "()Z", "Companion", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SearchParams implements Parcelable {

    @l
    private Area area;

    @l
    private String categoryId;

    @l
    private String clarifyIconType;

    @l
    private String cv2Vacancy;

    @l
    private List<String> directionId;

    @l
    private SerpDisplayType displayType;

    @l
    private List<String> districtId;

    @l
    private String drawId;

    @l
    private Boolean earlyAccess;

    @l
    private String expanded;

    @l
    private String footWalkingMetro;

    @l
    private Boolean forcedLocationForRecommendation;

    @l
    private Coordinates geoCoords;

    @l
    private Boolean localPriority;

    @l
    private String locationId;

    @l
    private List<String> metroIds;

    @l
    private String moreExpensive;

    @l
    private List<String> owner;

    @l
    private Map<String, ? extends SearchParam<?>> params;

    @l
    private Long priceMax;

    @l
    private Long priceMin;

    @l
    private String query;

    @l
    private Integer radius;

    @l
    private String searchRadius;

    @l
    private String sellerId;

    @l
    private String shopId;

    @l
    private String sort;

    @l
    private Source source;

    @l
    private String suggestLocationId;

    @l
    private String title;

    @l
    private String widgetCategory;

    @l
    private Boolean withDeliveryOnly;

    @l
    private Boolean withImagesOnly;

    /* renamed from: Companion, reason: from kotlin metadata */
    @k
    public static final Companion INSTANCE = new Companion(null);

    @k
    public static final Parcelable.Creator<SearchParams> CREATOR = new Creator();

    @k
    private static final SearchParams EMPTY = new SearchParams(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);

    /* compiled from: SearchParams.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0086\u0003\u0018\u00002\u00020\u0001:\u0001\u0007B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0011\u0010\u0003\u001a\u00020\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\b"}, d2 = {"Lcom/avito/android/remote/model/SearchParams$Companion;", "", "()V", "EMPTY", "Lcom/avito/android/remote/model/SearchParams;", "getEMPTY", "()Lcom/avito/android/remote/model/SearchParams;", "Params", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Companion {

        /* compiled from: SearchParams.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\bÆ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/avito/android/remote/model/SearchParams$Companion$Params;", "", "()V", "SEARCH_AREA_PARAM", "", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Params {

            @k
            public static final Params INSTANCE = new Params();

            @k
            public static final String SEARCH_AREA_PARAM = "searchArea";

            private Params() {
            }
        }

        public /* synthetic */ Companion(C42822w c42822w) {
            this();
        }

        @k
        public final SearchParams getEMPTY() {
            return SearchParams.EMPTY;
        }

        private Companion() {
        }
    }

    /* compiled from: SearchParams.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SearchParams> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchParams createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            String string = parcel.readString();
            Coordinates coordinatesCreateFromParcel = parcel.readInt() == 0 ? null : Coordinates.CREATOR.createFromParcel(parcel);
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList2 = parcel.createStringArrayList();
            ArrayList<String> arrayListCreateStringArrayList3 = parcel.createStringArrayList();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i12);
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = f.c(SearchParams.class, parcel, linkedHashMap2, parcel.readString(), iC2, 1);
                    linkedHashMap2 = linkedHashMap2;
                    i12 = i12;
                }
                linkedHashMap = linkedHashMap2;
            }
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            Long lValueOf2 = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            ArrayList<String> arrayListCreateStringArrayList4 = parcel.createStringArrayList();
            String string6 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string7 = parcel.readString();
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            String string8 = parcel.readString();
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
            if (parcel.readInt() == 0) {
                boolValueOf4 = null;
            } else {
                boolValueOf4 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string9 = parcel.readString();
            String string10 = parcel.readString();
            String string11 = parcel.readString();
            String string12 = parcel.readString();
            String string13 = parcel.readString();
            SerpDisplayType serpDisplayTypeValueOf = parcel.readInt() == 0 ? null : SerpDisplayType.valueOf(parcel.readString());
            String string14 = parcel.readString();
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new SearchParams(string, coordinatesCreateFromParcel, string2, string3, arrayListCreateStringArrayList, arrayListCreateStringArrayList2, arrayListCreateStringArrayList3, linkedHashMap, lValueOf, lValueOf2, string4, string5, arrayListCreateStringArrayList4, string6, boolValueOf, string7, numValueOf, string8, boolValueOf2, boolValueOf3, boolValueOf4, string9, string10, string11, string12, string13, serpDisplayTypeValueOf, string14, boolValueOf5, parcel.readInt() == 0 ? null : Area.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : Source.valueOf(parcel.readString()), parcel.readString(), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SearchParams[] newArray(int i12) {
            return new SearchParams[i12];
        }
    }

    public SearchParams() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -1, 1, null);
    }

    @l
    /* renamed from: component1, reason: from getter */
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Long getPriceMin() {
        return this.priceMin;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getQuery() {
        return this.query;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    public final List<String> component13() {
        return this.owner;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final String getSort() {
        return this.sort;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final Boolean getWithImagesOnly() {
        return this.withImagesOnly;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final String getSearchRadius() {
        return this.searchRadius;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final Integer getRadius() {
        return this.radius;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final String getFootWalkingMetro() {
        return this.footWalkingMetro;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final Boolean getWithDeliveryOnly() {
        return this.withDeliveryOnly;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final Coordinates getGeoCoords() {
        return this.geoCoords;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final Boolean getLocalPriority() {
        return this.localPriority;
    }

    @l
    /* renamed from: component21, reason: from getter */
    public final Boolean getEarlyAccess() {
        return this.earlyAccess;
    }

    @l
    /* renamed from: component22, reason: from getter */
    public final String getMoreExpensive() {
        return this.moreExpensive;
    }

    @l
    /* renamed from: component23, reason: from getter */
    public final String getWidgetCategory() {
        return this.widgetCategory;
    }

    @l
    /* renamed from: component24, reason: from getter */
    public final String getExpanded() {
        return this.expanded;
    }

    @l
    /* renamed from: component25, reason: from getter */
    public final String getSellerId() {
        return this.sellerId;
    }

    @l
    /* renamed from: component26, reason: from getter */
    public final String getCv2Vacancy() {
        return this.cv2Vacancy;
    }

    @l
    /* renamed from: component27, reason: from getter */
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    /* renamed from: component28, reason: from getter */
    public final String getShopId() {
        return this.shopId;
    }

    @l
    /* renamed from: component29, reason: from getter */
    public final Boolean getForcedLocationForRecommendation() {
        return this.forcedLocationForRecommendation;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    /* renamed from: component30, reason: from getter */
    public final Area getArea() {
        return this.area;
    }

    @l
    /* renamed from: component31, reason: from getter */
    public final Source getSource() {
        return this.source;
    }

    @l
    /* renamed from: component32, reason: from getter */
    public final String getClarifyIconType() {
        return this.clarifyIconType;
    }

    @l
    /* renamed from: component33, reason: from getter */
    public final String getDrawId() {
        return this.drawId;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getSuggestLocationId() {
        return this.suggestLocationId;
    }

    @l
    public final List<String> component5() {
        return this.metroIds;
    }

    @l
    public final List<String> component6() {
        return this.directionId;
    }

    @l
    public final List<String> component7() {
        return this.districtId;
    }

    @l
    public final Map<String, SearchParam<?>> component8() {
        return this.params;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final Long getPriceMax() {
        return this.priceMax;
    }

    @k
    public final SearchParams copy(@l String categoryId, @l Coordinates geoCoords, @l String locationId, @l String suggestLocationId, @l List<String> metroIds, @l List<String> directionId, @l List<String> districtId, @l Map<String, ? extends SearchParam<?>> params, @l Long priceMax, @l Long priceMin, @l String query, @l String title, @l List<String> owner, @l String sort, @l Boolean withImagesOnly, @l String searchRadius, @l Integer radius, @l String footWalkingMetro, @l Boolean withDeliveryOnly, @l Boolean localPriority, @l Boolean earlyAccess, @l String moreExpensive, @l String widgetCategory, @l String expanded, @l String sellerId, @l String cv2Vacancy, @l SerpDisplayType displayType, @l String shopId, @l Boolean forcedLocationForRecommendation, @l Area area, @l Source source, @l String clarifyIconType, @l String drawId) {
        return new SearchParams(categoryId, geoCoords, locationId, suggestLocationId, metroIds, directionId, districtId, params, priceMax, priceMin, query, title, owner, sort, withImagesOnly, searchRadius, radius, footWalkingMetro, withDeliveryOnly, localPriority, earlyAccess, moreExpensive, widgetCategory, expanded, sellerId, cv2Vacancy, displayType, shopId, forcedLocationForRecommendation, area, source, clarifyIconType, drawId);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SearchParams)) {
            return false;
        }
        SearchParams searchParams = (SearchParams) other;
        return L.f(this.categoryId, searchParams.categoryId) && L.f(this.geoCoords, searchParams.geoCoords) && L.f(this.locationId, searchParams.locationId) && L.f(this.suggestLocationId, searchParams.suggestLocationId) && L.f(this.metroIds, searchParams.metroIds) && L.f(this.directionId, searchParams.directionId) && L.f(this.districtId, searchParams.districtId) && L.f(this.params, searchParams.params) && L.f(this.priceMax, searchParams.priceMax) && L.f(this.priceMin, searchParams.priceMin) && L.f(this.query, searchParams.query) && L.f(this.title, searchParams.title) && L.f(this.owner, searchParams.owner) && L.f(this.sort, searchParams.sort) && L.f(this.withImagesOnly, searchParams.withImagesOnly) && L.f(this.searchRadius, searchParams.searchRadius) && L.f(this.radius, searchParams.radius) && L.f(this.footWalkingMetro, searchParams.footWalkingMetro) && L.f(this.withDeliveryOnly, searchParams.withDeliveryOnly) && L.f(this.localPriority, searchParams.localPriority) && L.f(this.earlyAccess, searchParams.earlyAccess) && L.f(this.moreExpensive, searchParams.moreExpensive) && L.f(this.widgetCategory, searchParams.widgetCategory) && L.f(this.expanded, searchParams.expanded) && L.f(this.sellerId, searchParams.sellerId) && L.f(this.cv2Vacancy, searchParams.cv2Vacancy) && this.displayType == searchParams.displayType && L.f(this.shopId, searchParams.shopId) && L.f(this.forcedLocationForRecommendation, searchParams.forcedLocationForRecommendation) && L.f(this.area, searchParams.area) && this.source == searchParams.source && L.f(this.clarifyIconType, searchParams.clarifyIconType) && L.f(this.drawId, searchParams.drawId);
    }

    @l
    public final Area getArea() {
        return this.area;
    }

    @l
    public final String getCategoryId() {
        return this.categoryId;
    }

    @l
    public final String getClarifyIconType() {
        return this.clarifyIconType;
    }

    @l
    public final String getCv2Vacancy() {
        return this.cv2Vacancy;
    }

    @l
    public final List<String> getDirectionId() {
        return this.directionId;
    }

    @l
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    public final List<String> getDistrictId() {
        return this.districtId;
    }

    @l
    public final String getDrawId() {
        return this.drawId;
    }

    @l
    public final Boolean getEarlyAccess() {
        return this.earlyAccess;
    }

    @l
    public final String getExpanded() {
        return this.expanded;
    }

    @l
    public final String getFootWalkingMetro() {
        return this.footWalkingMetro;
    }

    @l
    public final Boolean getForcedLocationForRecommendation() {
        return this.forcedLocationForRecommendation;
    }

    @l
    public final Coordinates getGeoCoords() {
        return this.geoCoords;
    }

    @l
    public final Boolean getLocalPriority() {
        return this.localPriority;
    }

    @l
    public final String getLocationId() {
        return this.locationId;
    }

    @l
    public final List<String> getMetroIds() {
        return this.metroIds;
    }

    @l
    public final String getMoreExpensive() {
        return this.moreExpensive;
    }

    @l
    public final List<String> getOwner() {
        return this.owner;
    }

    @l
    public final Map<String, SearchParam<?>> getParams() {
        return this.params;
    }

    @l
    public final Long getPriceMax() {
        return this.priceMax;
    }

    @l
    public final Long getPriceMin() {
        return this.priceMin;
    }

    @l
    public final String getQuery() {
        return this.query;
    }

    @l
    public final Integer getRadius() {
        return this.radius;
    }

    @l
    public final String getSearchRadius() {
        return this.searchRadius;
    }

    @l
    public final String getSellerId() {
        return this.sellerId;
    }

    @l
    public final String getShopId() {
        return this.shopId;
    }

    @l
    public final String getSort() {
        return this.sort;
    }

    @l
    public final Source getSource() {
        return this.source;
    }

    @l
    public final String getSuggestLocationId() {
        return this.suggestLocationId;
    }

    @l
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getWidgetCategory() {
        return this.widgetCategory;
    }

    @l
    public final Boolean getWithDeliveryOnly() {
        return this.withDeliveryOnly;
    }

    @l
    public final Boolean getWithImagesOnly() {
        return this.withImagesOnly;
    }

    public int hashCode() {
        String str = this.categoryId;
        int iHashCode = (str == null ? 0 : str.hashCode()) * 31;
        Coordinates coordinates = this.geoCoords;
        int iHashCode2 = (iHashCode + (coordinates == null ? 0 : coordinates.hashCode())) * 31;
        String str2 = this.locationId;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.suggestLocationId;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        List<String> list = this.metroIds;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        List<String> list2 = this.directionId;
        int iHashCode6 = (iHashCode5 + (list2 == null ? 0 : list2.hashCode())) * 31;
        List<String> list3 = this.districtId;
        int iHashCode7 = (iHashCode6 + (list3 == null ? 0 : list3.hashCode())) * 31;
        Map<String, ? extends SearchParam<?>> map = this.params;
        int iHashCode8 = (iHashCode7 + (map == null ? 0 : map.hashCode())) * 31;
        Long l12 = this.priceMax;
        int iHashCode9 = (iHashCode8 + (l12 == null ? 0 : l12.hashCode())) * 31;
        Long l13 = this.priceMin;
        int iHashCode10 = (iHashCode9 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str4 = this.query;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.title;
        int iHashCode12 = (iHashCode11 + (str5 == null ? 0 : str5.hashCode())) * 31;
        List<String> list4 = this.owner;
        int iHashCode13 = (iHashCode12 + (list4 == null ? 0 : list4.hashCode())) * 31;
        String str6 = this.sort;
        int iHashCode14 = (iHashCode13 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Boolean bool = this.withImagesOnly;
        int iHashCode15 = (iHashCode14 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str7 = this.searchRadius;
        int iHashCode16 = (iHashCode15 + (str7 == null ? 0 : str7.hashCode())) * 31;
        Integer num = this.radius;
        int iHashCode17 = (iHashCode16 + (num == null ? 0 : num.hashCode())) * 31;
        String str8 = this.footWalkingMetro;
        int iHashCode18 = (iHashCode17 + (str8 == null ? 0 : str8.hashCode())) * 31;
        Boolean bool2 = this.withDeliveryOnly;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.localPriority;
        int iHashCode20 = (iHashCode19 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.earlyAccess;
        int iHashCode21 = (iHashCode20 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str9 = this.moreExpensive;
        int iHashCode22 = (iHashCode21 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.widgetCategory;
        int iHashCode23 = (iHashCode22 + (str10 == null ? 0 : str10.hashCode())) * 31;
        String str11 = this.expanded;
        int iHashCode24 = (iHashCode23 + (str11 == null ? 0 : str11.hashCode())) * 31;
        String str12 = this.sellerId;
        int iHashCode25 = (iHashCode24 + (str12 == null ? 0 : str12.hashCode())) * 31;
        String str13 = this.cv2Vacancy;
        int iHashCode26 = (iHashCode25 + (str13 == null ? 0 : str13.hashCode())) * 31;
        SerpDisplayType serpDisplayType = this.displayType;
        int iHashCode27 = (iHashCode26 + (serpDisplayType == null ? 0 : serpDisplayType.hashCode())) * 31;
        String str14 = this.shopId;
        int iHashCode28 = (iHashCode27 + (str14 == null ? 0 : str14.hashCode())) * 31;
        Boolean bool5 = this.forcedLocationForRecommendation;
        int iHashCode29 = (iHashCode28 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        Area area = this.area;
        int iHashCode30 = (iHashCode29 + (area == null ? 0 : area.hashCode())) * 31;
        Source source = this.source;
        int iHashCode31 = (iHashCode30 + (source == null ? 0 : source.hashCode())) * 31;
        String str15 = this.clarifyIconType;
        int iHashCode32 = (iHashCode31 + (str15 == null ? 0 : str15.hashCode())) * 31;
        String str16 = this.drawId;
        return iHashCode32 + (str16 != null ? str16.hashCode() : 0);
    }

    public final boolean isLongRequest() {
        SearchParam<?> searchParam;
        Map<String, ? extends SearchParam<?>> map = this.params;
        return L.f((map == null || (searchParam = map.get("171940")) == null) ? null : searchParam.getValue(), "1");
    }

    public final void setArea(@l Area area) {
        this.area = area;
    }

    public final void setCategoryId(@l String str) {
        this.categoryId = str;
    }

    public final void setClarifyIconType(@l String str) {
        this.clarifyIconType = str;
    }

    public final void setCv2Vacancy(@l String str) {
        this.cv2Vacancy = str;
    }

    public final void setDirectionId(@l List<String> list) {
        this.directionId = list;
    }

    public final void setDisplayType(@l SerpDisplayType serpDisplayType) {
        this.displayType = serpDisplayType;
    }

    public final void setDistrictId(@l List<String> list) {
        this.districtId = list;
    }

    public final void setDrawId(@l String str) {
        this.drawId = str;
    }

    public final void setEarlyAccess(@l Boolean bool) {
        this.earlyAccess = bool;
    }

    public final void setExpanded(@l String str) {
        this.expanded = str;
    }

    public final void setFootWalkingMetro(@l String str) {
        this.footWalkingMetro = str;
    }

    public final void setForcedLocationForRecommendation(@l Boolean bool) {
        this.forcedLocationForRecommendation = bool;
    }

    public final void setGeoCoords(@l Coordinates coordinates) {
        this.geoCoords = coordinates;
    }

    public final void setLocalPriority(@l Boolean bool) {
        this.localPriority = bool;
    }

    public final void setLocationId(@l String str) {
        this.locationId = str;
    }

    public final void setMetroIds(@l List<String> list) {
        this.metroIds = list;
    }

    public final void setMoreExpensive(@l String str) {
        this.moreExpensive = str;
    }

    public final void setOwner(@l List<String> list) {
        this.owner = list;
    }

    public final void setParams(@l Map<String, ? extends SearchParam<?>> map) {
        this.params = map;
    }

    public final void setPriceMax(@l Long l12) {
        this.priceMax = l12;
    }

    public final void setPriceMin(@l Long l12) {
        this.priceMin = l12;
    }

    public final void setQuery(@l String str) {
        this.query = str;
    }

    public final void setRadius(@l Integer num) {
        this.radius = num;
    }

    public final void setSearchRadius(@l String str) {
        this.searchRadius = str;
    }

    public final void setSellerId(@l String str) {
        this.sellerId = str;
    }

    public final void setShopId(@l String str) {
        this.shopId = str;
    }

    public final void setSort(@l String str) {
        this.sort = str;
    }

    public final void setSource(@l Source source) {
        this.source = source;
    }

    public final void setSuggestLocationId(@l String str) {
        this.suggestLocationId = str;
    }

    public final void setTitle(@l String str) {
        this.title = str;
    }

    public final void setWidgetCategory(@l String str) {
        this.widgetCategory = str;
    }

    public final void setWithDeliveryOnly(@l Boolean bool) {
        this.withDeliveryOnly = bool;
    }

    public final void setWithImagesOnly(@l Boolean bool) {
        this.withImagesOnly = bool;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("SearchParams(categoryId=");
        sb2.append(this.categoryId);
        sb2.append(", geoCoords=");
        sb2.append(this.geoCoords);
        sb2.append(", locationId=");
        sb2.append(this.locationId);
        sb2.append(", suggestLocationId=");
        sb2.append(this.suggestLocationId);
        sb2.append(", metroIds=");
        sb2.append(this.metroIds);
        sb2.append(", directionId=");
        sb2.append(this.directionId);
        sb2.append(", districtId=");
        sb2.append(this.districtId);
        sb2.append(", params=");
        sb2.append(this.params);
        sb2.append(", priceMax=");
        sb2.append(this.priceMax);
        sb2.append(", priceMin=");
        sb2.append(this.priceMin);
        sb2.append(", query=");
        sb2.append(this.query);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", owner=");
        sb2.append(this.owner);
        sb2.append(", sort=");
        sb2.append(this.sort);
        sb2.append(", withImagesOnly=");
        sb2.append(this.withImagesOnly);
        sb2.append(", searchRadius=");
        sb2.append(this.searchRadius);
        sb2.append(", radius=");
        sb2.append(this.radius);
        sb2.append(", footWalkingMetro=");
        sb2.append(this.footWalkingMetro);
        sb2.append(", withDeliveryOnly=");
        sb2.append(this.withDeliveryOnly);
        sb2.append(", localPriority=");
        sb2.append(this.localPriority);
        sb2.append(", earlyAccess=");
        sb2.append(this.earlyAccess);
        sb2.append(", moreExpensive=");
        sb2.append(this.moreExpensive);
        sb2.append(", widgetCategory=");
        sb2.append(this.widgetCategory);
        sb2.append(", expanded=");
        sb2.append(this.expanded);
        sb2.append(", sellerId=");
        sb2.append(this.sellerId);
        sb2.append(", cv2Vacancy=");
        sb2.append(this.cv2Vacancy);
        sb2.append(", displayType=");
        sb2.append(this.displayType);
        sb2.append(", shopId=");
        sb2.append(this.shopId);
        sb2.append(", forcedLocationForRecommendation=");
        sb2.append(this.forcedLocationForRecommendation);
        sb2.append(", area=");
        sb2.append(this.area);
        sb2.append(", source=");
        sb2.append(this.source);
        sb2.append(", clarifyIconType=");
        sb2.append(this.clarifyIconType);
        sb2.append(", drawId=");
        return C22026a.c(sb2, this.drawId, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.categoryId);
        Coordinates coordinates = this.geoCoords;
        if (coordinates == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            coordinates.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.locationId);
        parcel.writeString(this.suggestLocationId);
        parcel.writeStringList(this.metroIds);
        parcel.writeStringList(this.directionId);
        parcel.writeStringList(this.districtId);
        Map<String, ? extends SearchParam<?>> map = this.params;
        if (map == null) {
            parcel.writeInt(0);
        } else {
            Iterator itH = C0.h(parcel, 1, map);
            while (itH.hasNext()) {
                Map.Entry entry = (Map.Entry) itH.next();
                parcel.writeString((String) entry.getKey());
                parcel.writeParcelable((Parcelable) entry.getValue(), flags);
            }
        }
        Long l12 = this.priceMax;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        Long l13 = this.priceMin;
        if (l13 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l13);
        }
        parcel.writeString(this.query);
        parcel.writeString(this.title);
        parcel.writeStringList(this.owner);
        parcel.writeString(this.sort);
        Boolean bool = this.withImagesOnly;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        parcel.writeString(this.searchRadius);
        Integer num = this.radius;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        parcel.writeString(this.footWalkingMetro);
        Boolean bool2 = this.withDeliveryOnly;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.localPriority;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Boolean bool4 = this.earlyAccess;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        parcel.writeString(this.moreExpensive);
        parcel.writeString(this.widgetCategory);
        parcel.writeString(this.expanded);
        parcel.writeString(this.sellerId);
        parcel.writeString(this.cv2Vacancy);
        SerpDisplayType serpDisplayType = this.displayType;
        if (serpDisplayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpDisplayType.name());
        }
        parcel.writeString(this.shopId);
        Boolean bool5 = this.forcedLocationForRecommendation;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool5);
        }
        Area area = this.area;
        if (area == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            area.writeToParcel(parcel, flags);
        }
        Source source = this.source;
        if (source == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(source.name());
        }
        parcel.writeString(this.clarifyIconType);
        parcel.writeString(this.drawId);
    }

    public SearchParams(@l String str, @l Coordinates coordinates, @l String str2, @l String str3, @l List<String> list, @l List<String> list2, @l List<String> list3, @l Map<String, ? extends SearchParam<?>> map, @l Long l12, @l Long l13, @l String str4, @l String str5, @l List<String> list4, @l String str6, @l Boolean bool, @l String str7, @l Integer num, @l String str8, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l String str9, @l String str10, @l String str11, @l String str12, @l String str13, @l SerpDisplayType serpDisplayType, @l String str14, @l Boolean bool5, @l Area area, @l Source source, @l String str15, @l String str16) {
        this.categoryId = str;
        this.geoCoords = coordinates;
        this.locationId = str2;
        this.suggestLocationId = str3;
        this.metroIds = list;
        this.directionId = list2;
        this.districtId = list3;
        this.params = map;
        this.priceMax = l12;
        this.priceMin = l13;
        this.query = str4;
        this.title = str5;
        this.owner = list4;
        this.sort = str6;
        this.withImagesOnly = bool;
        this.searchRadius = str7;
        this.radius = num;
        this.footWalkingMetro = str8;
        this.withDeliveryOnly = bool2;
        this.localPriority = bool3;
        this.earlyAccess = bool4;
        this.moreExpensive = str9;
        this.widgetCategory = str10;
        this.expanded = str11;
        this.sellerId = str12;
        this.cv2Vacancy = str13;
        this.displayType = serpDisplayType;
        this.shopId = str14;
        this.forcedLocationForRecommendation = bool5;
        this.area = area;
        this.source = source;
        this.clarifyIconType = str15;
        this.drawId = str16;
    }

    public /* synthetic */ SearchParams(String str, Coordinates coordinates, String str2, String str3, List list, List list2, List list3, Map map, Long l12, Long l13, String str4, String str5, List list4, String str6, Boolean bool, String str7, Integer num, String str8, Boolean bool2, Boolean bool3, Boolean bool4, String str9, String str10, String str11, String str12, String str13, SerpDisplayType serpDisplayType, String str14, Boolean bool5, Area area, Source source, String str15, String str16, int i12, int i13, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : str, (i12 & 2) != 0 ? null : coordinates, (i12 & 4) != 0 ? null : str2, (i12 & 8) != 0 ? null : str3, (i12 & 16) != 0 ? null : list, (i12 & 32) != 0 ? null : list2, (i12 & 64) != 0 ? null : list3, (i12 & 128) != 0 ? null : map, (i12 & 256) != 0 ? null : l12, (i12 & 512) != 0 ? null : l13, (i12 & 1024) != 0 ? null : str4, (i12 & 2048) != 0 ? null : str5, (i12 & 4096) != 0 ? null : list4, (i12 & 8192) != 0 ? null : str6, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool, (i12 & 32768) != 0 ? null : str7, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : num, (i12 & 131072) != 0 ? null : str8, (i12 & 262144) != 0 ? null : bool2, (i12 & 524288) != 0 ? null : bool3, (i12 & 1048576) != 0 ? null : bool4, (i12 & 2097152) != 0 ? null : str9, (i12 & 4194304) != 0 ? null : str10, (i12 & 8388608) != 0 ? null : str11, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : str12, (i12 & 33554432) != 0 ? null : str13, (i12 & 67108864) != 0 ? null : serpDisplayType, (i12 & 134217728) != 0 ? null : str14, (i12 & 268435456) != 0 ? null : bool5, (i12 & 536870912) != 0 ? null : area, (i12 & 1073741824) != 0 ? null : source, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : str15, (i13 & 1) != 0 ? null : str16);
    }
}
