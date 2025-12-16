package com.avito.android.select;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.compose.foundation.H;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.remote.model.ParcelableEntity;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.Size;
import com.avito.android.remote.model.category_parameters.DisplayingImageParams;
import com.avito.android.remote.model.category_parameters.MultiselectParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import okhttp3.internal.http2.Http2;

/* compiled from: Arguments.kt */
@K51.d
@Keep
@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bA\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001B¿\u0003\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0012\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u0006\u0012\u0012\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u0006\u0012\u0006\u0010\f\u001a\u00020\u0004\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u000e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0002\u0012\u0006\u0010\u0011\u001a\u00020\u0002\u0012\u0006\u0010\u0012\u001a\u00020\u0002\u0012\u0006\u0010\u0013\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\b\u0002\u0010\u0018\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u001e\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u001f\u001a\u00020\u0002\u0012\b\b\u0002\u0010 \u001a\u00020\u0002\u0012\b\b\u0002\u0010!\u001a\u00020\u0002\u0012\b\b\u0002\u0010\"\u001a\u00020\u0002\u0012\b\b\u0002\u0010#\u001a\u00020\u0002\u0012\b\b\u0002\u0010$\u001a\u00020\u0002\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0004\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(\u0012\b\b\u0002\u0010*\u001a\u00020\u0002\u0012\b\b\u0002\u0010+\u001a\u00020\u0002\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010-\u001a\u00020\u0002\u0012\b\b\u0002\u0010.\u001a\u00020\u0002\u0012\b\b\u0002\u0010/\u001a\u00020\u0002\u0012\b\b\u0002\u00100\u001a\u00020\u0016\u0012\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0016¢\u0006\u0004\b3\u00104J\r\u00105\u001a\u00020\u0002¢\u0006\u0004\b5\u00106J\u0010\u00107\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b7\u00106J\u0010\u00108\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b8\u00109J\u0018\u0010:\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b:\u0010;J\u001c\u0010<\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u0006HÆ\u0003¢\u0006\u0004\b<\u0010;J\u001c\u0010=\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u0006HÆ\u0003¢\u0006\u0004\b=\u0010;J\u0010\u0010>\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b>\u00109J\u0012\u0010?\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b?\u00109J\u0010\u0010@\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b@\u00106J\u0010\u0010A\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bA\u00106J\u0010\u0010B\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bB\u00106J\u0010\u0010C\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bC\u00106J\u0010\u0010D\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bD\u00106J\u0010\u0010E\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bE\u00106J\u0010\u0010F\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bF\u00106J\u0010\u0010G\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bG\u00106J\u0012\u0010H\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bJ\u00106J\u0012\u0010K\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bK\u00109J\u0012\u0010L\u001a\u0004\u0018\u00010\u001aHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bN\u00109J\u0012\u0010O\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bO\u00109J\u0010\u0010P\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bP\u00106J\u0010\u0010Q\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bQ\u00106J\u0010\u0010R\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bR\u00106J\u0010\u0010S\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bS\u00106J\u0010\u0010T\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bT\u00106J\u0010\u0010U\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bU\u00106J\u0010\u0010V\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\bV\u00106J\u0012\u0010W\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\bW\u00109J\u0012\u0010X\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bX\u0010YJ\u0012\u0010Z\u001a\u0004\u0018\u00010(HÆ\u0003¢\u0006\u0004\bZ\u0010[J\u0010\u0010\\\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\\\u00106J\u0010\u0010]\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b]\u00106J\u0012\u0010^\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b^\u00109J\u0010\u0010_\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b_\u00106J\u0010\u0010`\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b`\u00106J\u0010\u0010a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\ba\u00106J\u0010\u0010b\u001a\u00020\u0016HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u0012\u0010d\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bd\u0010IJ\u0012\u0010e\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\be\u0010IJØ\u0003\u0010f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\u0010\b\u0002\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0014\b\u0002\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u00062\u0014\b\u0002\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u00062\b\b\u0002\u0010\f\u001a\u00020\u00042\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u000e\u001a\u00020\u00022\b\b\u0002\u0010\u000f\u001a\u00020\u00022\b\b\u0002\u0010\u0010\u001a\u00020\u00022\b\b\u0002\u0010\u0011\u001a\u00020\u00022\b\b\u0002\u0010\u0012\u001a\u00020\u00022\b\b\u0002\u0010\u0013\u001a\u00020\u00022\b\b\u0002\u0010\u0014\u001a\u00020\u00022\b\b\u0002\u0010\u0015\u001a\u00020\u00022\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\b\b\u0002\u0010\u0018\u001a\u00020\u00022\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u001a2\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010\u001e\u001a\u00020\u00022\b\b\u0002\u0010\u001f\u001a\u00020\u00022\b\b\u0002\u0010 \u001a\u00020\u00022\b\b\u0002\u0010!\u001a\u00020\u00022\b\b\u0002\u0010\"\u001a\u00020\u00022\b\b\u0002\u0010#\u001a\u00020\u00022\b\b\u0002\u0010$\u001a\u00020\u00022\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010)\u001a\u0004\u0018\u00010(2\b\b\u0002\u0010*\u001a\u00020\u00022\b\b\u0002\u0010+\u001a\u00020\u00022\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00042\b\b\u0002\u0010-\u001a\u00020\u00022\b\b\u0002\u0010.\u001a\u00020\u00022\b\b\u0002\u0010/\u001a\u00020\u00022\b\b\u0002\u00100\u001a\u00020\u00162\n\b\u0002\u00101\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u00102\u001a\u0004\u0018\u00010\u0016HÆ\u0001¢\u0006\u0004\bf\u0010gJ\u0010\u0010h\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\bh\u00109J\u0010\u0010i\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\bi\u0010cJ\u001a\u0010l\u001a\u00020\u00022\b\u0010k\u001a\u0004\u0018\u00010jHÖ\u0003¢\u0006\u0004\bl\u0010mJ\u0010\u0010n\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\bn\u0010cJ \u0010s\u001a\u00020r2\u0006\u0010p\u001a\u00020o2\u0006\u0010q\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\bs\u0010tR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010u\u001a\u0004\b\u0003\u00106R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010v\u001a\u0004\bw\u00109R\u001f\u0010\b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010x\u001a\u0004\by\u0010;R#\u0010\n\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010x\u001a\u0004\bz\u0010;R#\u0010\u000b\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00040\t0\u00068\u0006¢\u0006\f\n\u0004\b\u000b\u0010x\u001a\u0004\b{\u0010;R\u0017\u0010\f\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\f\u0010v\u001a\u0004\b|\u00109R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\r\u0010v\u001a\u0004\b}\u00109R\u0017\u0010\u000e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010u\u001a\u0004\b~\u00106R\u0017\u0010\u000f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010u\u001a\u0004\b\u007f\u00106R\u0018\u0010\u0010\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u0010\u0010u\u001a\u0005\b\u0080\u0001\u00106R\u0018\u0010\u0011\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u0011\u0010u\u001a\u0005\b\u0081\u0001\u00106R\u0018\u0010\u0012\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u0012\u0010u\u001a\u0005\b\u0082\u0001\u00106R\u0018\u0010\u0013\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u0013\u0010u\u001a\u0005\b\u0083\u0001\u00106R\u0018\u0010\u0014\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u0014\u0010u\u001a\u0005\b\u0084\u0001\u00106R\u0018\u0010\u0015\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u0015\u0010u\u001a\u0005\b\u0085\u0001\u00106R\u001b\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\u000e\n\u0005\b\u0017\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010IR\u0018\u0010\u0018\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\u0018\u0010u\u001a\u0005\b\u0088\u0001\u00106R\u001a\u0010\u0019\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b\u0019\u0010v\u001a\u0005\b\u0089\u0001\u00109R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u001a8\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010MR\u001a\u0010\u001c\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b\u001c\u0010v\u001a\u0005\b\u008c\u0001\u00109R\u001a\u0010\u001d\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b\u001d\u0010v\u001a\u0005\b\u008d\u0001\u00109R\u0017\u0010\u001e\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001e\u0010u\u001a\u0004\b\u001e\u00106R\u0017\u0010\u001f\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u001f\u0010u\u001a\u0004\b\u001f\u00106R\u0017\u0010 \u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b \u0010u\u001a\u0004\b \u00106R\u0018\u0010!\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b!\u0010u\u001a\u0005\b\u008e\u0001\u00106R\u0018\u0010\"\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b\"\u0010u\u001a\u0005\b\u008f\u0001\u00106R\u0018\u0010#\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b#\u0010u\u001a\u0005\b\u0090\u0001\u00106R\u0018\u0010$\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b$\u0010u\u001a\u0005\b\u0091\u0001\u00106R\u001a\u0010%\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b%\u0010v\u001a\u0005\b\u0092\u0001\u00109R\u001b\u0010'\u001a\u0004\u0018\u00010&8\u0006¢\u0006\u000e\n\u0005\b'\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010YR\u001b\u0010)\u001a\u0004\u0018\u00010(8\u0006¢\u0006\u000e\n\u0005\b)\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010[R\u0018\u0010*\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b*\u0010u\u001a\u0005\b\u0097\u0001\u00106R\u0017\u0010+\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b+\u0010u\u001a\u0004\b+\u00106R\u001a\u0010,\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\r\n\u0004\b,\u0010v\u001a\u0005\b\u0098\u0001\u00109R\u0018\u0010-\u001a\u00020\u00028\u0006¢\u0006\r\n\u0004\b-\u0010u\u001a\u0005\b\u0099\u0001\u00106R\u0017\u0010.\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b.\u0010u\u001a\u0004\b.\u00106R\u0017\u0010/\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b/\u0010u\u001a\u0004\b/\u00106R\u0019\u00100\u001a\u00020\u00168\u0006¢\u0006\u000e\n\u0005\b0\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010cR\u001b\u00101\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\u000e\n\u0005\b1\u0010\u0086\u0001\u001a\u0005\b\u009c\u0001\u0010IR\u001b\u00102\u001a\u0004\u0018\u00010\u00168\u0006¢\u0006\u000e\n\u0005\b2\u0010\u0086\u0001\u001a\u0005\b\u009d\u0001\u0010I¨\u0006\u009e\u0001"}, d2 = {"Lcom/avito/android/select/Arguments;", "Landroid/os/Parcelable;", "", "isRedesigned", "", "requestId", "", "Lcom/avito/android/remote/model/category_parameters/MultiselectParameter$Displaying$Group;", "groups", "Lcom/avito/android/remote/model/ParcelableEntity;", "variants", "selected", "title", "description", "showSearch", "hideHeader", "showSearchClearButton", "multiSelect", "canClear", "requestFocus", "areGroupsCollapsible", "typoCorrectionEnabled", "", "attributeId", "withImages", "titlePattern", "Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "imageParams", "confirmButtonTitle", "variantIdForEmptySearch", "isFromFilters", "isFromInlineFilters", "isPaginationSuggest", "withLeftIcon", "needFooter", "hideClear", "showCloseButton", "defaultValue", "Lcom/avito/android/remote/model/Size;", "optionImageSize", "Lcom/avito/android/remote/model/SearchParams;", "searchParams", "candy", "isChips", "itemsStyle", "submitButtonEnabled", "isFullScreen", "isSectionedPagination", "titleMaxLinesCount", "searchErrorTextRes", "searchErrorGravity", "<init>", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Integer;ZLjava/lang/String;Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/lang/String;Lcom/avito/android/remote/model/Size;Lcom/avito/android/remote/model/SearchParams;ZZLjava/lang/String;ZZZILjava/lang/Integer;Ljava/lang/Integer;)V", "hasGroups", "()Z", "component1", "component2", "()Ljava/lang/String;", "component3", "()Ljava/util/List;", "component4", "component5", "component6", "component7", "component8", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "()Ljava/lang/Integer;", "component17", "component18", "component19", "()Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "component20", "component21", "component22", "component23", "component24", "component25", "component26", "component27", "component28", "component29", "component30", "()Lcom/avito/android/remote/model/Size;", "component31", "()Lcom/avito/android/remote/model/SearchParams;", "component32", "component33", "component34", "component35", "component36", "component37", "component38", "()I", "component39", "component40", "copy", "(ZLjava/lang/String;Ljava/util/List;Ljava/util/List;Ljava/util/List;Ljava/lang/String;Ljava/lang/String;ZZZZZZZZLjava/lang/Integer;ZLjava/lang/String;Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;Ljava/lang/String;Ljava/lang/String;ZZZZZZZLjava/lang/String;Lcom/avito/android/remote/model/Size;Lcom/avito/android/remote/model/SearchParams;ZZLjava/lang/String;ZZZILjava/lang/Integer;Ljava/lang/Integer;)Lcom/avito/android/select/Arguments;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "Ljava/lang/String;", "getRequestId", "Ljava/util/List;", "getGroups", "getVariants", "getSelected", "getTitle", "getDescription", "getShowSearch", "getHideHeader", "getShowSearchClearButton", "getMultiSelect", "getCanClear", "getRequestFocus", "getAreGroupsCollapsible", "getTypoCorrectionEnabled", "Ljava/lang/Integer;", "getAttributeId", "getWithImages", "getTitlePattern", "Lcom/avito/android/remote/model/category_parameters/DisplayingImageParams;", "getImageParams", "getConfirmButtonTitle", "getVariantIdForEmptySearch", "getWithLeftIcon", "getNeedFooter", "getHideClear", "getShowCloseButton", "getDefaultValue", "Lcom/avito/android/remote/model/Size;", "getOptionImageSize", "Lcom/avito/android/remote/model/SearchParams;", "getSearchParams", "getCandy", "getItemsStyle", "getSubmitButtonEnabled", "I", "getTitleMaxLinesCount", "getSearchErrorTextRes", "getSearchErrorGravity", "_avito-discouraged_avito-app_core"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class Arguments implements Parcelable {

    @Y61.k
    public static final Parcelable.Creator<Arguments> CREATOR = new a();
    private final boolean areGroupsCollapsible;

    @Y61.l
    private final Integer attributeId;
    private final boolean canClear;
    private final boolean candy;

    @Y61.l
    private final String confirmButtonTitle;

    @Y61.l
    private final String defaultValue;

    @Y61.l
    private final String description;

    @Y61.l
    private final List<MultiselectParameter.Displaying.Group> groups;
    private final boolean hideClear;
    private final boolean hideHeader;

    @Y61.l
    private final DisplayingImageParams imageParams;
    private final boolean isChips;
    private final boolean isFromFilters;
    private final boolean isFromInlineFilters;
    private final boolean isFullScreen;
    private final boolean isPaginationSuggest;
    private final boolean isRedesigned;
    private final boolean isSectionedPagination;

    @Y61.l
    private final String itemsStyle;
    private final boolean multiSelect;
    private final boolean needFooter;

    @Y61.l
    private final Size optionImageSize;
    private final boolean requestFocus;

    @Y61.k
    private final String requestId;

    @Y61.l
    private final Integer searchErrorGravity;

    @Y61.l
    private final Integer searchErrorTextRes;

    @Y61.l
    private final SearchParams searchParams;

    @Y61.k
    private final List<ParcelableEntity<String>> selected;
    private final boolean showCloseButton;
    private final boolean showSearch;
    private final boolean showSearchClearButton;
    private final boolean submitButtonEnabled;

    @Y61.k
    private final String title;
    private final int titleMaxLinesCount;

    @Y61.l
    private final String titlePattern;
    private final boolean typoCorrectionEnabled;

    @Y61.l
    private final String variantIdForEmptySearch;

    @Y61.k
    private final List<ParcelableEntity<String>> variants;
    private final boolean withImages;
    private final boolean withLeftIcon;

    /* compiled from: Arguments.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a implements Parcelable.Creator<Arguments> {
        @Override // android.os.Parcelable.Creator
        public final Arguments createFromParcel(Parcel parcel) {
            ArrayList arrayList;
            boolean z12 = parcel.readInt() != 0;
            String string = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                arrayList = new ArrayList(i12);
                int iL2 = 0;
                while (iL2 != i12) {
                    iL2 = com.avito.android.actions_sheet.a.l(Arguments.class, parcel, arrayList, iL2, 1);
                }
            }
            int i13 = parcel.readInt();
            ArrayList arrayList2 = new ArrayList(i13);
            int iL3 = 0;
            while (iL3 != i13) {
                iL3 = com.avito.android.actions_sheet.a.l(Arguments.class, parcel, arrayList2, iL3, 1);
            }
            int i14 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i14);
            int iL4 = 0;
            while (iL4 != i14) {
                iL4 = com.avito.android.actions_sheet.a.l(Arguments.class, parcel, arrayList3, iL4, 1);
            }
            return new Arguments(z12, string, arrayList, arrayList2, arrayList3, parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() != 0, parcel.readString(), (DisplayingImageParams) parcel.readParcelable(Arguments.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), (Size) parcel.readParcelable(Arguments.class.getClassLoader()), (SearchParams) parcel.readParcelable(Arguments.class.getClassLoader()), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readString(), parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt() != 0, parcel.readInt(), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()), parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt()));
        }

        @Override // android.os.Parcelable.Creator
        public final Arguments[] newArray(int i12) {
            return new Arguments[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public Arguments(boolean z12, @Y61.k String str, @Y61.l List<MultiselectParameter.Displaying.Group> list, @Y61.k List<? extends ParcelableEntity<String>> list2, @Y61.k List<? extends ParcelableEntity<String>> list3, @Y61.k String str2, @Y61.l String str3, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22, @Y61.l Integer num, boolean z23, @Y61.l String str4, @Y61.l DisplayingImageParams displayingImageParams, @Y61.l String str5, @Y61.l String str6, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z32, @Y61.l String str7, @Y61.l Size size, @Y61.l SearchParams searchParams, boolean z33, boolean z34, @Y61.l String str8, boolean z35, boolean z36, boolean z37, int i12, @Y61.l Integer num2, @Y61.l Integer num3) {
        this.isRedesigned = z12;
        this.requestId = str;
        this.groups = list;
        this.variants = list2;
        this.selected = list3;
        this.title = str2;
        this.description = str3;
        this.showSearch = z13;
        this.hideHeader = z14;
        this.showSearchClearButton = z15;
        this.multiSelect = z16;
        this.canClear = z17;
        this.requestFocus = z18;
        this.areGroupsCollapsible = z19;
        this.typoCorrectionEnabled = z22;
        this.attributeId = num;
        this.withImages = z23;
        this.titlePattern = str4;
        this.imageParams = displayingImageParams;
        this.confirmButtonTitle = str5;
        this.variantIdForEmptySearch = str6;
        this.isFromFilters = z24;
        this.isFromInlineFilters = z25;
        this.isPaginationSuggest = z26;
        this.withLeftIcon = z27;
        this.needFooter = z28;
        this.hideClear = z29;
        this.showCloseButton = z32;
        this.defaultValue = str7;
        this.optionImageSize = size;
        this.searchParams = searchParams;
        this.candy = z33;
        this.isChips = z34;
        this.itemsStyle = str8;
        this.submitButtonEnabled = z35;
        this.isFullScreen = z36;
        this.isSectionedPagination = z37;
        this.titleMaxLinesCount = i12;
        this.searchErrorTextRes = num2;
        this.searchErrorGravity = num3;
    }

    /* renamed from: component1, reason: from getter */
    public final boolean getIsRedesigned() {
        return this.isRedesigned;
    }

    /* renamed from: component10, reason: from getter */
    public final boolean getShowSearchClearButton() {
        return this.showSearchClearButton;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getMultiSelect() {
        return this.multiSelect;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getCanClear() {
        return this.canClear;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getRequestFocus() {
        return this.requestFocus;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getAreGroupsCollapsible() {
        return this.areGroupsCollapsible;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getTypoCorrectionEnabled() {
        return this.typoCorrectionEnabled;
    }

    @Y61.l
    /* renamed from: component16, reason: from getter */
    public final Integer getAttributeId() {
        return this.attributeId;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getWithImages() {
        return this.withImages;
    }

    @Y61.l
    /* renamed from: component18, reason: from getter */
    public final String getTitlePattern() {
        return this.titlePattern;
    }

    @Y61.l
    /* renamed from: component19, reason: from getter */
    public final DisplayingImageParams getImageParams() {
        return this.imageParams;
    }

    @Y61.k
    /* renamed from: component2, reason: from getter */
    public final String getRequestId() {
        return this.requestId;
    }

    @Y61.l
    /* renamed from: component20, reason: from getter */
    public final String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }

    @Y61.l
    /* renamed from: component21, reason: from getter */
    public final String getVariantIdForEmptySearch() {
        return this.variantIdForEmptySearch;
    }

    /* renamed from: component22, reason: from getter */
    public final boolean getIsFromFilters() {
        return this.isFromFilters;
    }

    /* renamed from: component23, reason: from getter */
    public final boolean getIsFromInlineFilters() {
        return this.isFromInlineFilters;
    }

    /* renamed from: component24, reason: from getter */
    public final boolean getIsPaginationSuggest() {
        return this.isPaginationSuggest;
    }

    /* renamed from: component25, reason: from getter */
    public final boolean getWithLeftIcon() {
        return this.withLeftIcon;
    }

    /* renamed from: component26, reason: from getter */
    public final boolean getNeedFooter() {
        return this.needFooter;
    }

    /* renamed from: component27, reason: from getter */
    public final boolean getHideClear() {
        return this.hideClear;
    }

    /* renamed from: component28, reason: from getter */
    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    @Y61.l
    /* renamed from: component29, reason: from getter */
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    @Y61.l
    public final List<MultiselectParameter.Displaying.Group> component3() {
        return this.groups;
    }

    @Y61.l
    /* renamed from: component30, reason: from getter */
    public final Size getOptionImageSize() {
        return this.optionImageSize;
    }

    @Y61.l
    /* renamed from: component31, reason: from getter */
    public final SearchParams getSearchParams() {
        return this.searchParams;
    }

    /* renamed from: component32, reason: from getter */
    public final boolean getCandy() {
        return this.candy;
    }

    /* renamed from: component33, reason: from getter */
    public final boolean getIsChips() {
        return this.isChips;
    }

    @Y61.l
    /* renamed from: component34, reason: from getter */
    public final String getItemsStyle() {
        return this.itemsStyle;
    }

    /* renamed from: component35, reason: from getter */
    public final boolean getSubmitButtonEnabled() {
        return this.submitButtonEnabled;
    }

    /* renamed from: component36, reason: from getter */
    public final boolean getIsFullScreen() {
        return this.isFullScreen;
    }

    /* renamed from: component37, reason: from getter */
    public final boolean getIsSectionedPagination() {
        return this.isSectionedPagination;
    }

    /* renamed from: component38, reason: from getter */
    public final int getTitleMaxLinesCount() {
        return this.titleMaxLinesCount;
    }

    @Y61.l
    /* renamed from: component39, reason: from getter */
    public final Integer getSearchErrorTextRes() {
        return this.searchErrorTextRes;
    }

    @Y61.k
    public final List<ParcelableEntity<String>> component4() {
        return this.variants;
    }

    @Y61.l
    /* renamed from: component40, reason: from getter */
    public final Integer getSearchErrorGravity() {
        return this.searchErrorGravity;
    }

    @Y61.k
    public final List<ParcelableEntity<String>> component5() {
        return this.selected;
    }

    @Y61.k
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @Y61.l
    /* renamed from: component7, reason: from getter */
    public final String getDescription() {
        return this.description;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getShowSearch() {
        return this.showSearch;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getHideHeader() {
        return this.hideHeader;
    }

    @Y61.k
    public final Arguments copy(boolean isRedesigned, @Y61.k String requestId, @Y61.l List<MultiselectParameter.Displaying.Group> groups, @Y61.k List<? extends ParcelableEntity<String>> variants, @Y61.k List<? extends ParcelableEntity<String>> selected, @Y61.k String title, @Y61.l String description, boolean showSearch, boolean hideHeader, boolean showSearchClearButton, boolean multiSelect, boolean canClear, boolean requestFocus, boolean areGroupsCollapsible, boolean typoCorrectionEnabled, @Y61.l Integer attributeId, boolean withImages, @Y61.l String titlePattern, @Y61.l DisplayingImageParams imageParams, @Y61.l String confirmButtonTitle, @Y61.l String variantIdForEmptySearch, boolean isFromFilters, boolean isFromInlineFilters, boolean isPaginationSuggest, boolean withLeftIcon, boolean needFooter, boolean hideClear, boolean showCloseButton, @Y61.l String defaultValue, @Y61.l Size optionImageSize, @Y61.l SearchParams searchParams, boolean candy, boolean isChips, @Y61.l String itemsStyle, boolean submitButtonEnabled, boolean isFullScreen, boolean isSectionedPagination, int titleMaxLinesCount, @Y61.l Integer searchErrorTextRes, @Y61.l Integer searchErrorGravity) {
        return new Arguments(isRedesigned, requestId, groups, variants, selected, title, description, showSearch, hideHeader, showSearchClearButton, multiSelect, canClear, requestFocus, areGroupsCollapsible, typoCorrectionEnabled, attributeId, withImages, titlePattern, imageParams, confirmButtonTitle, variantIdForEmptySearch, isFromFilters, isFromInlineFilters, isPaginationSuggest, withLeftIcon, needFooter, hideClear, showCloseButton, defaultValue, optionImageSize, searchParams, candy, isChips, itemsStyle, submitButtonEnabled, isFullScreen, isSectionedPagination, titleMaxLinesCount, searchErrorTextRes, searchErrorGravity);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@Y61.l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Arguments)) {
            return false;
        }
        Arguments arguments = (Arguments) other;
        return this.isRedesigned == arguments.isRedesigned && L.f(this.requestId, arguments.requestId) && L.f(this.groups, arguments.groups) && L.f(this.variants, arguments.variants) && L.f(this.selected, arguments.selected) && L.f(this.title, arguments.title) && L.f(this.description, arguments.description) && this.showSearch == arguments.showSearch && this.hideHeader == arguments.hideHeader && this.showSearchClearButton == arguments.showSearchClearButton && this.multiSelect == arguments.multiSelect && this.canClear == arguments.canClear && this.requestFocus == arguments.requestFocus && this.areGroupsCollapsible == arguments.areGroupsCollapsible && this.typoCorrectionEnabled == arguments.typoCorrectionEnabled && L.f(this.attributeId, arguments.attributeId) && this.withImages == arguments.withImages && L.f(this.titlePattern, arguments.titlePattern) && L.f(this.imageParams, arguments.imageParams) && L.f(this.confirmButtonTitle, arguments.confirmButtonTitle) && L.f(this.variantIdForEmptySearch, arguments.variantIdForEmptySearch) && this.isFromFilters == arguments.isFromFilters && this.isFromInlineFilters == arguments.isFromInlineFilters && this.isPaginationSuggest == arguments.isPaginationSuggest && this.withLeftIcon == arguments.withLeftIcon && this.needFooter == arguments.needFooter && this.hideClear == arguments.hideClear && this.showCloseButton == arguments.showCloseButton && L.f(this.defaultValue, arguments.defaultValue) && L.f(this.optionImageSize, arguments.optionImageSize) && L.f(this.searchParams, arguments.searchParams) && this.candy == arguments.candy && this.isChips == arguments.isChips && L.f(this.itemsStyle, arguments.itemsStyle) && this.submitButtonEnabled == arguments.submitButtonEnabled && this.isFullScreen == arguments.isFullScreen && this.isSectionedPagination == arguments.isSectionedPagination && this.titleMaxLinesCount == arguments.titleMaxLinesCount && L.f(this.searchErrorTextRes, arguments.searchErrorTextRes) && L.f(this.searchErrorGravity, arguments.searchErrorGravity);
    }

    public final boolean getAreGroupsCollapsible() {
        return this.areGroupsCollapsible;
    }

    @Y61.l
    public final Integer getAttributeId() {
        return this.attributeId;
    }

    public final boolean getCanClear() {
        return this.canClear;
    }

    public final boolean getCandy() {
        return this.candy;
    }

    @Y61.l
    public final String getConfirmButtonTitle() {
        return this.confirmButtonTitle;
    }

    @Y61.l
    public final String getDefaultValue() {
        return this.defaultValue;
    }

    @Y61.l
    public final String getDescription() {
        return this.description;
    }

    @Y61.l
    public final List<MultiselectParameter.Displaying.Group> getGroups() {
        return this.groups;
    }

    public final boolean getHideClear() {
        return this.hideClear;
    }

    public final boolean getHideHeader() {
        return this.hideHeader;
    }

    @Y61.l
    public final DisplayingImageParams getImageParams() {
        return this.imageParams;
    }

    @Y61.l
    public final String getItemsStyle() {
        return this.itemsStyle;
    }

    public final boolean getMultiSelect() {
        return this.multiSelect;
    }

    public final boolean getNeedFooter() {
        return this.needFooter;
    }

    @Y61.l
    public final Size getOptionImageSize() {
        return this.optionImageSize;
    }

    public final boolean getRequestFocus() {
        return this.requestFocus;
    }

    @Y61.k
    public final String getRequestId() {
        return this.requestId;
    }

    @Y61.l
    public final Integer getSearchErrorGravity() {
        return this.searchErrorGravity;
    }

    @Y61.l
    public final Integer getSearchErrorTextRes() {
        return this.searchErrorTextRes;
    }

    @Y61.l
    public final SearchParams getSearchParams() {
        return this.searchParams;
    }

    @Y61.k
    public final List<ParcelableEntity<String>> getSelected() {
        return this.selected;
    }

    public final boolean getShowCloseButton() {
        return this.showCloseButton;
    }

    public final boolean getShowSearch() {
        return this.showSearch;
    }

    public final boolean getShowSearchClearButton() {
        return this.showSearchClearButton;
    }

    public final boolean getSubmitButtonEnabled() {
        return this.submitButtonEnabled;
    }

    @Y61.k
    public final String getTitle() {
        return this.title;
    }

    public final int getTitleMaxLinesCount() {
        return this.titleMaxLinesCount;
    }

    @Y61.l
    public final String getTitlePattern() {
        return this.titlePattern;
    }

    public final boolean getTypoCorrectionEnabled() {
        return this.typoCorrectionEnabled;
    }

    @Y61.l
    public final String getVariantIdForEmptySearch() {
        return this.variantIdForEmptySearch;
    }

    @Y61.k
    public final List<ParcelableEntity<String>> getVariants() {
        return this.variants;
    }

    public final boolean getWithImages() {
        return this.withImages;
    }

    public final boolean getWithLeftIcon() {
        return this.withLeftIcon;
    }

    public final boolean hasGroups() {
        return this.groups != null;
    }

    public int hashCode() {
        int iD2 = H.d(Boolean.hashCode(this.isRedesigned) * 31, 31, this.requestId);
        List<MultiselectParameter.Displaying.Group> list = this.groups;
        int iD3 = H.d(H.e(H.e((iD2 + (list == null ? 0 : list.hashCode())) * 31, 31, this.variants), 31, this.selected), 31, this.title);
        String str = this.description;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iD3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.showSearch), 31, this.hideHeader), 31, this.showSearchClearButton), 31, this.multiSelect), 31, this.canClear), 31, this.requestFocus), 31, this.areGroupsCollapsible), 31, this.typoCorrectionEnabled);
        Integer num = this.attributeId;
        int i13 = androidx.appcompat.app.r.i((i12 + (num == null ? 0 : num.hashCode())) * 31, 31, this.withImages);
        String str2 = this.titlePattern;
        int iHashCode = (i13 + (str2 == null ? 0 : str2.hashCode())) * 31;
        DisplayingImageParams displayingImageParams = this.imageParams;
        int iHashCode2 = (iHashCode + (displayingImageParams == null ? 0 : displayingImageParams.hashCode())) * 31;
        String str3 = this.confirmButtonTitle;
        int iHashCode3 = (iHashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.variantIdForEmptySearch;
        int i14 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.isFromFilters), 31, this.isFromInlineFilters), 31, this.isPaginationSuggest), 31, this.withLeftIcon), 31, this.needFooter), 31, this.hideClear), 31, this.showCloseButton);
        String str5 = this.defaultValue;
        int iHashCode4 = (i14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Size size = this.optionImageSize;
        int iHashCode5 = (iHashCode4 + (size == null ? 0 : size.hashCode())) * 31;
        SearchParams searchParams = this.searchParams;
        int i15 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((iHashCode5 + (searchParams == null ? 0 : searchParams.hashCode())) * 31, 31, this.candy), 31, this.isChips);
        String str6 = this.itemsStyle;
        int iE2 = androidx.appcompat.app.r.e(this.titleMaxLinesCount, androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((i15 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.submitButtonEnabled), 31, this.isFullScreen), 31, this.isSectionedPagination), 31);
        Integer num2 = this.searchErrorTextRes;
        int iHashCode6 = (iE2 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.searchErrorGravity;
        return iHashCode6 + (num3 != null ? num3.hashCode() : 0);
    }

    public final boolean isChips() {
        return this.isChips;
    }

    public final boolean isFromFilters() {
        return this.isFromFilters;
    }

    public final boolean isFromInlineFilters() {
        return this.isFromInlineFilters;
    }

    public final boolean isFullScreen() {
        return this.isFullScreen;
    }

    public final boolean isPaginationSuggest() {
        return this.isPaginationSuggest;
    }

    public final boolean isRedesigned() {
        return this.isRedesigned;
    }

    public final boolean isSectionedPagination() {
        return this.isSectionedPagination;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("Arguments(isRedesigned=");
        sb2.append(this.isRedesigned);
        sb2.append(", requestId=");
        sb2.append(this.requestId);
        sb2.append(", groups=");
        sb2.append(this.groups);
        sb2.append(", variants=");
        sb2.append(this.variants);
        sb2.append(", selected=");
        sb2.append(this.selected);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", description=");
        sb2.append(this.description);
        sb2.append(", showSearch=");
        sb2.append(this.showSearch);
        sb2.append(", hideHeader=");
        sb2.append(this.hideHeader);
        sb2.append(", showSearchClearButton=");
        sb2.append(this.showSearchClearButton);
        sb2.append(", multiSelect=");
        sb2.append(this.multiSelect);
        sb2.append(", canClear=");
        sb2.append(this.canClear);
        sb2.append(", requestFocus=");
        sb2.append(this.requestFocus);
        sb2.append(", areGroupsCollapsible=");
        sb2.append(this.areGroupsCollapsible);
        sb2.append(", typoCorrectionEnabled=");
        sb2.append(this.typoCorrectionEnabled);
        sb2.append(", attributeId=");
        sb2.append(this.attributeId);
        sb2.append(", withImages=");
        sb2.append(this.withImages);
        sb2.append(", titlePattern=");
        sb2.append(this.titlePattern);
        sb2.append(", imageParams=");
        sb2.append(this.imageParams);
        sb2.append(", confirmButtonTitle=");
        sb2.append(this.confirmButtonTitle);
        sb2.append(", variantIdForEmptySearch=");
        sb2.append(this.variantIdForEmptySearch);
        sb2.append(", isFromFilters=");
        sb2.append(this.isFromFilters);
        sb2.append(", isFromInlineFilters=");
        sb2.append(this.isFromInlineFilters);
        sb2.append(", isPaginationSuggest=");
        sb2.append(this.isPaginationSuggest);
        sb2.append(", withLeftIcon=");
        sb2.append(this.withLeftIcon);
        sb2.append(", needFooter=");
        sb2.append(this.needFooter);
        sb2.append(", hideClear=");
        sb2.append(this.hideClear);
        sb2.append(", showCloseButton=");
        sb2.append(this.showCloseButton);
        sb2.append(", defaultValue=");
        sb2.append(this.defaultValue);
        sb2.append(", optionImageSize=");
        sb2.append(this.optionImageSize);
        sb2.append(", searchParams=");
        sb2.append(this.searchParams);
        sb2.append(", candy=");
        sb2.append(this.candy);
        sb2.append(", isChips=");
        sb2.append(this.isChips);
        sb2.append(", itemsStyle=");
        sb2.append(this.itemsStyle);
        sb2.append(", submitButtonEnabled=");
        sb2.append(this.submitButtonEnabled);
        sb2.append(", isFullScreen=");
        sb2.append(this.isFullScreen);
        sb2.append(", isSectionedPagination=");
        sb2.append(this.isSectionedPagination);
        sb2.append(", titleMaxLinesCount=");
        sb2.append(this.titleMaxLinesCount);
        sb2.append(", searchErrorTextRes=");
        sb2.append(this.searchErrorTextRes);
        sb2.append(", searchErrorGravity=");
        return com.akita.compose.component.accordion.s.j(sb2, this.searchErrorGravity, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@Y61.k Parcel parcel, int flags) {
        parcel.writeInt(this.isRedesigned ? 1 : 0);
        parcel.writeString(this.requestId);
        List<MultiselectParameter.Displaying.Group> list = this.groups;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = com.avito.android.actions_sheet.a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        Iterator itJ = C0.j(this.variants, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        Iterator itJ2 = C0.j(this.selected, parcel);
        while (itJ2.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ2.next(), flags);
        }
        parcel.writeString(this.title);
        parcel.writeString(this.description);
        parcel.writeInt(this.showSearch ? 1 : 0);
        parcel.writeInt(this.hideHeader ? 1 : 0);
        parcel.writeInt(this.showSearchClearButton ? 1 : 0);
        parcel.writeInt(this.multiSelect ? 1 : 0);
        parcel.writeInt(this.canClear ? 1 : 0);
        parcel.writeInt(this.requestFocus ? 1 : 0);
        parcel.writeInt(this.areGroupsCollapsible ? 1 : 0);
        parcel.writeInt(this.typoCorrectionEnabled ? 1 : 0);
        Integer num = this.attributeId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num);
        }
        parcel.writeInt(this.withImages ? 1 : 0);
        parcel.writeString(this.titlePattern);
        parcel.writeParcelable(this.imageParams, flags);
        parcel.writeString(this.confirmButtonTitle);
        parcel.writeString(this.variantIdForEmptySearch);
        parcel.writeInt(this.isFromFilters ? 1 : 0);
        parcel.writeInt(this.isFromInlineFilters ? 1 : 0);
        parcel.writeInt(this.isPaginationSuggest ? 1 : 0);
        parcel.writeInt(this.withLeftIcon ? 1 : 0);
        parcel.writeInt(this.needFooter ? 1 : 0);
        parcel.writeInt(this.hideClear ? 1 : 0);
        parcel.writeInt(this.showCloseButton ? 1 : 0);
        parcel.writeString(this.defaultValue);
        parcel.writeParcelable(this.optionImageSize, flags);
        parcel.writeParcelable(this.searchParams, flags);
        parcel.writeInt(this.candy ? 1 : 0);
        parcel.writeInt(this.isChips ? 1 : 0);
        parcel.writeString(this.itemsStyle);
        parcel.writeInt(this.submitButtonEnabled ? 1 : 0);
        parcel.writeInt(this.isFullScreen ? 1 : 0);
        parcel.writeInt(this.isSectionedPagination ? 1 : 0);
        parcel.writeInt(this.titleMaxLinesCount);
        Integer num2 = this.searchErrorTextRes;
        if (num2 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num2);
        }
        Integer num3 = this.searchErrorGravity;
        if (num3 == null) {
            parcel.writeInt(0);
        } else {
            com.avito.android.actions_sheet.a.C(parcel, 1, num3);
        }
    }

    public /* synthetic */ Arguments(boolean z12, String str, List list, List list2, List list3, String str2, String str3, boolean z13, boolean z14, boolean z15, boolean z16, boolean z17, boolean z18, boolean z19, boolean z22, Integer num, boolean z23, String str4, DisplayingImageParams displayingImageParams, String str5, String str6, boolean z24, boolean z25, boolean z26, boolean z27, boolean z28, boolean z29, boolean z32, String str7, Size size, SearchParams searchParams, boolean z33, boolean z34, String str8, boolean z35, boolean z36, boolean z37, int i12, Integer num2, Integer num3, int i13, int i14, C42822w c42822w) {
        this((i13 & 1) != 0 ? false : z12, str, (i13 & 4) != 0 ? null : list, list2, list3, str2, (i13 & 64) != 0 ? null : str3, z13, (i13 & 256) != 0 ? false : z14, (i13 & 512) != 0 ? true : z15, z16, z17, z18, (i13 & 8192) != 0 ? true : z19, (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? false : z22, (32768 & i13) != 0 ? -1 : num, (65536 & i13) != 0 ? false : z23, (131072 & i13) != 0 ? null : str4, (262144 & i13) != 0 ? null : displayingImageParams, (524288 & i13) != 0 ? null : str5, (1048576 & i13) != 0 ? null : str6, (2097152 & i13) != 0 ? false : z24, (4194304 & i13) != 0 ? false : z25, (8388608 & i13) != 0 ? false : z26, (16777216 & i13) != 0 ? false : z27, (33554432 & i13) != 0 ? false : z28, (67108864 & i13) != 0 ? false : z29, (134217728 & i13) != 0 ? true : z32, (268435456 & i13) != 0 ? null : str7, (536870912 & i13) != 0 ? null : size, (1073741824 & i13) != 0 ? null : searchParams, (i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? false : z33, (i14 & 1) != 0 ? false : z34, (i14 & 2) != 0 ? null : str8, (i14 & 4) != 0 ? false : z35, (i14 & 8) != 0 ? false : z36, (i14 & 16) != 0 ? false : z37, (i14 & 32) != 0 ? 2 : i12, (i14 & 64) != 0 ? null : num2, (i14 & 128) != 0 ? null : num3);
    }
}
