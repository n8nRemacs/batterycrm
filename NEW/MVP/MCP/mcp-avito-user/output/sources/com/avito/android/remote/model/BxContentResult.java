package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.annotation.Keep;
import androidx.appcompat.app.r;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.additional_buttons.AdditionalButtons;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.map.SerpFloatingContainer;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.ux.feedback.remote.UxFeedbackConfig;
import com.google.gson.annotations.c;
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

/* compiled from: BxContentResult.kt */
@d
@Keep
@Metadata(d1 = {"\u0000¼\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b=\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b8\b\u0087\b\u0018\u00002\u00020\u0001BÇ\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u0018\u0012\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u0007\u0012\b\b\u0002\u0010)\u001a\u00020(\u0012\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010*\u0012\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,\u0012\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0002\u0012\b\b\u0002\u00100\u001a\u00020(\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0007\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:¢\u0006\u0004\b<\u0010=J\u0016\u0010>\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b>\u0010?J\u0012\u0010@\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bD\u0010CJ\u0018\u0010E\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bE\u0010?J\u0012\u0010F\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\bF\u0010GJ\u0012\u0010H\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0012\u0010J\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0012\u0010L\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bN\u0010OJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0012\u0010R\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bT\u0010SJ\u0012\u0010U\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bU\u0010SJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\bV\u0010SJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bW\u0010CJ\u0012\u0010X\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bX\u0010CJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b_\u0010SJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b`\u0010CJ\u0012\u0010a\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\ba\u0010CJ\u0010\u0010b\u001a\u00020(HÆ\u0003¢\u0006\u0004\bb\u0010cJ\u001e\u0010d\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010*HÆ\u0003¢\u0006\u0004\bd\u0010eJ\u0012\u0010f\u001a\u0004\u0018\u00010,HÆ\u0003¢\u0006\u0004\bf\u0010gJ\u0018\u0010h\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bh\u0010?J\u0010\u0010i\u001a\u00020(HÆ\u0003¢\u0006\u0004\bi\u0010cJ\u0012\u0010j\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0004\bj\u0010kJ\u0012\u0010l\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0018\u0010n\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bn\u0010?J\u0012\u0010o\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\bo\u0010CJ\u0012\u0010p\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bp\u0010OJ\u0012\u0010q\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0004\bq\u0010rJ\u0012\u0010s\u001a\u0004\u0018\u00010:HÆ\u0003¢\u0006\u0004\bs\u0010tJÒ\u0003\u0010u\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010\u00182\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010'\u001a\u0004\u0018\u00010\u00072\b\b\u0002\u0010)\u001a\u00020(2\u0016\b\u0002\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010*2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010,2\u0010\b\u0002\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00022\b\b\u0002\u00100\u001a\u00020(2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\u0010\b\u0002\u00105\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00022\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:HÆ\u0001¢\u0006\u0004\bu\u0010vJ\u0010\u0010w\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\bw\u0010CJ\u0010\u0010y\u001a\u00020xHÖ\u0001¢\u0006\u0004\by\u0010zJ\u001a\u0010}\u001a\u00020\u00182\b\u0010|\u001a\u0004\u0018\u00010{HÖ\u0003¢\u0006\u0004\b}\u0010~J\u0010\u0010\u007f\u001a\u00020xHÖ\u0001¢\u0006\u0004\b\u007f\u0010zJ'\u0010\u0084\u0001\u001a\u00030\u0083\u00012\b\u0010\u0081\u0001\u001a\u00030\u0080\u00012\u0007\u0010\u0082\u0001\u001a\u00020xHÖ\u0001¢\u0006\u0006\b\u0084\u0001\u0010\u0085\u0001R\"\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0004\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010?R\u001e\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010AR\u001e\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\b\u0010\u008a\u0001\u001a\u0005\b\u008b\u0001\u0010CR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u008a\u0001\u001a\u0005\b\u008c\u0001\u0010CR$\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u0086\u0001\u001a\u0005\b\u008d\u0001\u0010?R\u001e\u0010\r\u001a\u0004\u0018\u00010\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010GR\u001e\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010IR\u001e\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0011\u0010\u0092\u0001\u001a\u0005\b\u0093\u0001\u0010KR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0013\u0010\u0094\u0001\u001a\u0005\b\u0095\u0001\u0010MR\u001e\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010\u0096\u0001\u001a\u0005\b\u0097\u0001\u0010OR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u0098\u0001\u001a\u0005\b\u0099\u0001\u0010QR\u001e\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0019\u0010\u009a\u0001\u001a\u0005\b\u009b\u0001\u0010SR\u001e\u0010\u001a\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010\u009a\u0001\u001a\u0005\b\u009c\u0001\u0010SR\u001e\u0010\u001b\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001b\u0010\u009a\u0001\u001a\u0005\b\u009d\u0001\u0010SR\u001d\u0010\u001c\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u001c\u0010\u009a\u0001\u001a\u0004\b\u001c\u0010SR\u001e\u0010\u001d\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001d\u0010\u008a\u0001\u001a\u0005\b\u009e\u0001\u0010CR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u008a\u0001\u001a\u0005\b\u009f\u0001\u0010CR\u001e\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0010 \u0001\u001a\u0005\b¡\u0001\u0010ZR\u001e\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010¢\u0001\u001a\u0005\b£\u0001\u0010\\R\u001e\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010^R\u001d\u0010%\u001a\u0004\u0018\u00010\u00188\u0006X\u0087\u0004¢\u0006\r\n\u0005\b%\u0010\u009a\u0001\u001a\u0004\b%\u0010SR\u001e\u0010&\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010\u008a\u0001\u001a\u0005\b¦\u0001\u0010CR\u001e\u0010'\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u008a\u0001\u001a\u0005\b§\u0001\u0010CR\u001c\u0010)\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b)\u0010¨\u0001\u001a\u0005\b©\u0001\u0010cR*\u0010+\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010*8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b+\u0010ª\u0001\u001a\u0005\b«\u0001\u0010eR\u001e\u0010-\u001a\u0004\u0018\u00010,8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b-\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010gR$\u0010/\u001a\n\u0012\u0004\u0012\u00020.\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b/\u0010\u0086\u0001\u001a\u0005\b®\u0001\u0010?R\u001c\u00100\u001a\u00020(8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010¨\u0001\u001a\u0005\b¯\u0001\u0010cR\u001e\u00102\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010°\u0001\u001a\u0005\b±\u0001\u0010kR\u001e\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b4\u0010²\u0001\u001a\u0005\b³\u0001\u0010mR$\u00105\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b5\u0010\u0086\u0001\u001a\u0005\b´\u0001\u0010?R\u001e\u00106\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b6\u0010\u008a\u0001\u001a\u0005\bµ\u0001\u0010CR\u001e\u00107\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b7\u0010\u0096\u0001\u001a\u0005\b¶\u0001\u0010OR\u001e\u00109\u001a\u0004\u0018\u0001088\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b9\u0010·\u0001\u001a\u0005\b¸\u0001\u0010rR\u001e\u0010;\u001a\u0004\u0018\u00010:8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b;\u0010¹\u0001\u001a\u0005\bº\u0001\u0010t¨\u0006»\u0001"}, d2 = {"Lcom/avito/android/remote/model/BxContentResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/SerpElement;", "items", "Lcom/avito/android/remote/model/ScreenContent;", "screenContent", "", "searchHint", "xHash", "Lcom/avito/android/remote/model/HomeTabItem;", "tabs", "Lcom/avito/android/remote/model/Location;", "location", "Lcom/avito/android/remote/model/Options;", "options", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "Lcom/avito/android/remote/model/AdvertItemActions;", "moreActions", "Lcom/avito/android/deep_linking/links/DeepLink;", "onboarding", "Lcom/avito/android/remote/model/BxContentBusiness360;", "business360", "", "shouldShowSaveSearch", "shouldShowSaveSearchButtonOnMap", "shouldShowFiltersButton", "isVerticalMain", "crossCategoryTag", "emptySearchText", "Lcom/avito/android/remote/model/EmptySearchContent;", "emptySearchContent", "Lcom/avito/android/remote/model/SerpResultCategoryDetails;", "categoryDetails", "Lcom/avito/android/remote/model/NavigationBarStyle;", "navigationBarStyle", "isSubscribed", "subscriptionId", "nextPageId", "", "lastStamp", "", "firebaseParams", "Lcom/avito/android/ux/feedback/remote/UxFeedbackConfig;", "uxFeedbackConfig", "Lcom/avito/android/remote/model/ux_feedback/UxFeedbackConfigOld;", "uxFeedbackConfigs", "count", "Lcom/avito/android/remote/model/SharingButton;", "sharingButton", "Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;", "additionalButtons", "features", "newSerpMapInteraction", "onDisplayClickstreamDeeplink", "Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;", "floatingContainer", "Lcom/avito/android/remote/model/FilterHintToast;", "filterHintToast", "<init>", "(Ljava/util/List;Lcom/avito/android/remote/model/ScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/Location;Lcom/avito/android/remote/model/Options;Lcom/avito/android/remote/model/SerpDisplayType;Lcom/avito/android/remote/model/AdvertItemActions;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/BxContentBusiness360;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/EmptySearchContent;Lcom/avito/android/remote/model/SerpResultCategoryDetails;Lcom/avito/android/remote/model/NavigationBarStyle;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Lcom/avito/android/ux/feedback/remote/UxFeedbackConfig;Ljava/util/List;JLcom/avito/android/remote/model/SharingButton;Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;Lcom/avito/android/remote/model/FilterHintToast;)V", "component1", "()Ljava/util/List;", "component2", "()Lcom/avito/android/remote/model/ScreenContent;", "component3", "()Ljava/lang/String;", "component4", "component5", "component6", "()Lcom/avito/android/remote/model/Location;", "component7", "()Lcom/avito/android/remote/model/Options;", "component8", "()Lcom/avito/android/remote/model/SerpDisplayType;", "component9", "()Lcom/avito/android/remote/model/AdvertItemActions;", "component10", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component11", "()Lcom/avito/android/remote/model/BxContentBusiness360;", "component12", "()Ljava/lang/Boolean;", "component13", "component14", "component15", "component16", "component17", "component18", "()Lcom/avito/android/remote/model/EmptySearchContent;", "component19", "()Lcom/avito/android/remote/model/SerpResultCategoryDetails;", "component20", "()Lcom/avito/android/remote/model/NavigationBarStyle;", "component21", "component22", "component23", "component24", "()J", "component25", "()Ljava/util/Map;", "component26", "()Lcom/avito/android/ux/feedback/remote/UxFeedbackConfig;", "component27", "component28", "component29", "()Lcom/avito/android/remote/model/SharingButton;", "component30", "()Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;", "component31", "component32", "component33", "component34", "()Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;", "component35", "()Lcom/avito/android/remote/model/FilterHintToast;", "copy", "(Ljava/util/List;Lcom/avito/android/remote/model/ScreenContent;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;Lcom/avito/android/remote/model/Location;Lcom/avito/android/remote/model/Options;Lcom/avito/android/remote/model/SerpDisplayType;Lcom/avito/android/remote/model/AdvertItemActions;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/BxContentBusiness360;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/EmptySearchContent;Lcom/avito/android/remote/model/SerpResultCategoryDetails;Lcom/avito/android/remote/model/NavigationBarStyle;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/String;JLjava/util/Map;Lcom/avito/android/ux/feedback/remote/UxFeedbackConfig;Ljava/util/List;JLcom/avito/android/remote/model/SharingButton;Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;Lcom/avito/android/remote/model/FilterHintToast;)Lcom/avito/android/remote/model/BxContentResult;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/util/List;", "getItems", "Lcom/avito/android/remote/model/ScreenContent;", "getScreenContent", "Ljava/lang/String;", "getSearchHint", "getXHash", "getTabs", "Lcom/avito/android/remote/model/Location;", "getLocation", "Lcom/avito/android/remote/model/Options;", "getOptions", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "Lcom/avito/android/remote/model/AdvertItemActions;", "getMoreActions", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnboarding", "Lcom/avito/android/remote/model/BxContentBusiness360;", "getBusiness360", "Ljava/lang/Boolean;", "getShouldShowSaveSearch", "getShouldShowSaveSearchButtonOnMap", "getShouldShowFiltersButton", "getCrossCategoryTag", "getEmptySearchText", "Lcom/avito/android/remote/model/EmptySearchContent;", "getEmptySearchContent", "Lcom/avito/android/remote/model/SerpResultCategoryDetails;", "getCategoryDetails", "Lcom/avito/android/remote/model/NavigationBarStyle;", "getNavigationBarStyle", "getSubscriptionId", "getNextPageId", "J", "getLastStamp", "Ljava/util/Map;", "getFirebaseParams", "Lcom/avito/android/ux/feedback/remote/UxFeedbackConfig;", "getUxFeedbackConfig", "getUxFeedbackConfigs", "getCount", "Lcom/avito/android/remote/model/SharingButton;", "getSharingButton", "Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;", "getAdditionalButtons", "getFeatures", "getNewSerpMapInteraction", "getOnDisplayClickstreamDeeplink", "Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;", "getFloatingContainer", "Lcom/avito/android/remote/model/FilterHintToast;", "getFilterHintToast", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class BxContentResult implements Parcelable {

    @k
    public static final Parcelable.Creator<BxContentResult> CREATOR = new Creator();

    @c("additionalButtons")
    @l
    private final AdditionalButtons additionalButtons;

    @c("business360")
    @l
    private final BxContentBusiness360 business360;

    @c("analytics")
    @l
    private final SerpResultCategoryDetails categoryDetails;

    @c("count")
    private final long count;

    @c("crossCategoryTag")
    @l
    private final String crossCategoryTag;

    @c("displayType")
    @l
    private final SerpDisplayType displayType;

    @c("emptySearchContent")
    @l
    private final EmptySearchContent emptySearchContent;

    @c("emptySearch")
    @l
    private final String emptySearchText;

    @c("features")
    @l
    private final List<String> features;

    @c("filterHintToast")
    @l
    private final FilterHintToast filterHintToast;

    @c("firebaseParams")
    @l
    private final Map<String, String> firebaseParams;

    @c("buttons")
    @l
    private final SerpFloatingContainer floatingContainer;

    @c("isSubscribed")
    @l
    private final Boolean isSubscribed;

    @c("isVerticalMain")
    @l
    private final Boolean isVerticalMain;

    @c("items")
    @k
    private final List<SerpElement> items;

    @c("lastStamp")
    private final long lastStamp;

    @c("location")
    @l
    private final Location location;

    @c("moreActions")
    @l
    private final AdvertItemActions moreActions;

    @c("navigationBarStyle")
    @l
    private final NavigationBarStyle navigationBarStyle;

    @c("serpMapButtonPosition")
    @l
    private final String newSerpMapInteraction;

    @c("nextPageId")
    @l
    private final String nextPageId;

    @c("onDisplayClickstreamDeeplink")
    @l
    private final DeepLink onDisplayClickstreamDeeplink;

    @c("onboarding")
    @l
    private final DeepLink onboarding;

    @c("options")
    @l
    private final Options options;

    @c("screenContent")
    @l
    private final ScreenContent screenContent;

    @c("searchHint")
    @l
    private final String searchHint;

    @c("sharing")
    @l
    private final SharingButton sharingButton;

    @c("shouldShowFiltersButton")
    @l
    private final Boolean shouldShowFiltersButton;

    @c("shouldShowSaveSearch")
    @l
    private final Boolean shouldShowSaveSearch;

    @c("shouldShowSaveSearchButtonOnMap")
    @l
    private final Boolean shouldShowSaveSearchButtonOnMap;

    @c("subscriptionId")
    @l
    private final String subscriptionId;

    @c("feeds")
    @l
    private final List<HomeTabItem> tabs;

    @c("uxFeedbackConfig")
    @l
    private final UxFeedbackConfig uxFeedbackConfig;

    @c("uxFeedbackConfigs")
    @l
    private final List<UxFeedbackConfigOld> uxFeedbackConfigs;

    @c("xHash")
    @l
    private final String xHash;

    /* compiled from: BxContentResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<BxContentResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BxContentResult createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            Boolean boolValueOf5;
            Boolean bool;
            BxContentBusiness360 bxContentBusiness360;
            LinkedHashMap linkedHashMap;
            ArrayList arrayList2;
            int i12 = parcel.readInt();
            ArrayList arrayList3 = new ArrayList(i12);
            int iL2 = 0;
            while (iL2 != i12) {
                iL2 = a.l(BxContentResult.class, parcel, arrayList3, iL2, 1);
            }
            ScreenContent screenContentCreateFromParcel = parcel.readInt() == 0 ? null : ScreenContent.CREATOR.createFromParcel(parcel);
            String string = parcel.readString();
            String string2 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                arrayList = new ArrayList(i13);
                int iL3 = 0;
                while (iL3 != i13) {
                    iL3 = a.l(BxContentResult.class, parcel, arrayList, iL3, 1);
                }
            }
            Location location = (Location) parcel.readParcelable(BxContentResult.class.getClassLoader());
            Options optionsCreateFromParcel = parcel.readInt() == 0 ? null : Options.CREATOR.createFromParcel(parcel);
            SerpDisplayType serpDisplayTypeValueOf = parcel.readInt() == 0 ? null : SerpDisplayType.valueOf(parcel.readString());
            AdvertItemActions advertItemActions = (AdvertItemActions) parcel.readParcelable(BxContentResult.class.getClassLoader());
            DeepLink deepLink = (DeepLink) parcel.readParcelable(BxContentResult.class.getClassLoader());
            BxContentBusiness360 bxContentBusiness360CreateFromParcel = parcel.readInt() == 0 ? null : BxContentBusiness360.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
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
            String string3 = parcel.readString();
            String string4 = parcel.readString();
            EmptySearchContent emptySearchContentCreateFromParcel = parcel.readInt() == 0 ? null : EmptySearchContent.CREATOR.createFromParcel(parcel);
            SerpResultCategoryDetails serpResultCategoryDetails = (SerpResultCategoryDetails) parcel.readParcelable(BxContentResult.class.getClassLoader());
            NavigationBarStyle navigationBarStyle = (NavigationBarStyle) parcel.readParcelable(BxContentResult.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf5 = null;
            } else {
                boolValueOf5 = Boolean.valueOf(parcel.readInt() != 0);
            }
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            long j12 = parcel.readLong();
            if (parcel.readInt() == 0) {
                bxContentBusiness360 = bxContentBusiness360CreateFromParcel;
                bool = boolValueOf;
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                bool = boolValueOf;
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    i14 = i14;
                    bxContentBusiness360CreateFromParcel = bxContentBusiness360CreateFromParcel;
                }
                bxContentBusiness360 = bxContentBusiness360CreateFromParcel;
                linkedHashMap = linkedHashMap2;
            }
            UxFeedbackConfig uxFeedbackConfig = (UxFeedbackConfig) parcel.readParcelable(BxContentResult.class.getClassLoader());
            if (parcel.readInt() == 0) {
                arrayList2 = null;
            } else {
                int i15 = parcel.readInt();
                ArrayList arrayList4 = new ArrayList(i15);
                int iL4 = 0;
                while (iL4 != i15) {
                    iL4 = a.l(BxContentResult.class, parcel, arrayList4, iL4, 1);
                }
                arrayList2 = arrayList4;
            }
            return new BxContentResult(arrayList3, screenContentCreateFromParcel, string, string2, arrayList, location, optionsCreateFromParcel, serpDisplayTypeValueOf, advertItemActions, deepLink, bxContentBusiness360, bool, boolValueOf2, boolValueOf3, boolValueOf4, string3, string4, emptySearchContentCreateFromParcel, serpResultCategoryDetails, navigationBarStyle, boolValueOf5, string5, string6, j12, linkedHashMap, uxFeedbackConfig, arrayList2, parcel.readLong(), parcel.readInt() == 0 ? null : SharingButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : AdditionalButtons.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), (DeepLink) parcel.readParcelable(BxContentResult.class.getClassLoader()), parcel.readInt() == 0 ? null : SerpFloatingContainer.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : FilterHintToast.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final BxContentResult[] newArray(int i12) {
            return new BxContentResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public BxContentResult(@k List<? extends SerpElement> list, @l ScreenContent screenContent, @l String str, @l String str2, @l List<HomeTabItem> list2, @l Location location, @l Options options, @l SerpDisplayType serpDisplayType, @l AdvertItemActions advertItemActions, @l DeepLink deepLink, @l BxContentBusiness360 bxContentBusiness360, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l String str3, @l String str4, @l EmptySearchContent emptySearchContent, @l SerpResultCategoryDetails serpResultCategoryDetails, @l NavigationBarStyle navigationBarStyle, @l Boolean bool5, @l String str5, @l String str6, long j12, @l Map<String, String> map, @l UxFeedbackConfig uxFeedbackConfig, @l List<UxFeedbackConfigOld> list3, long j13, @l SharingButton sharingButton, @l AdditionalButtons additionalButtons, @l List<String> list4, @l String str7, @l DeepLink deepLink2, @l SerpFloatingContainer serpFloatingContainer, @l FilterHintToast filterHintToast) {
        this.items = list;
        this.screenContent = screenContent;
        this.searchHint = str;
        this.xHash = str2;
        this.tabs = list2;
        this.location = location;
        this.options = options;
        this.displayType = serpDisplayType;
        this.moreActions = advertItemActions;
        this.onboarding = deepLink;
        this.business360 = bxContentBusiness360;
        this.shouldShowSaveSearch = bool;
        this.shouldShowSaveSearchButtonOnMap = bool2;
        this.shouldShowFiltersButton = bool3;
        this.isVerticalMain = bool4;
        this.crossCategoryTag = str3;
        this.emptySearchText = str4;
        this.emptySearchContent = emptySearchContent;
        this.categoryDetails = serpResultCategoryDetails;
        this.navigationBarStyle = navigationBarStyle;
        this.isSubscribed = bool5;
        this.subscriptionId = str5;
        this.nextPageId = str6;
        this.lastStamp = j12;
        this.firebaseParams = map;
        this.uxFeedbackConfig = uxFeedbackConfig;
        this.uxFeedbackConfigs = list3;
        this.count = j13;
        this.sharingButton = sharingButton;
        this.additionalButtons = additionalButtons;
        this.features = list4;
        this.newSerpMapInteraction = str7;
        this.onDisplayClickstreamDeeplink = deepLink2;
        this.floatingContainer = serpFloatingContainer;
        this.filterHintToast = filterHintToast;
    }

    public static /* synthetic */ BxContentResult copy$default(BxContentResult bxContentResult, List list, ScreenContent screenContent, String str, String str2, List list2, Location location, Options options, SerpDisplayType serpDisplayType, AdvertItemActions advertItemActions, DeepLink deepLink, BxContentBusiness360 bxContentBusiness360, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str3, String str4, EmptySearchContent emptySearchContent, SerpResultCategoryDetails serpResultCategoryDetails, NavigationBarStyle navigationBarStyle, Boolean bool5, String str5, String str6, long j12, Map map, UxFeedbackConfig uxFeedbackConfig, List list3, long j13, SharingButton sharingButton, AdditionalButtons additionalButtons, List list4, String str7, DeepLink deepLink2, SerpFloatingContainer serpFloatingContainer, FilterHintToast filterHintToast, int i12, int i13, Object obj) {
        List list5 = (i12 & 1) != 0 ? bxContentResult.items : list;
        ScreenContent screenContent2 = (i12 & 2) != 0 ? bxContentResult.screenContent : screenContent;
        String str8 = (i12 & 4) != 0 ? bxContentResult.searchHint : str;
        String str9 = (i12 & 8) != 0 ? bxContentResult.xHash : str2;
        List list6 = (i12 & 16) != 0 ? bxContentResult.tabs : list2;
        Location location2 = (i12 & 32) != 0 ? bxContentResult.location : location;
        Options options2 = (i12 & 64) != 0 ? bxContentResult.options : options;
        SerpDisplayType serpDisplayType2 = (i12 & 128) != 0 ? bxContentResult.displayType : serpDisplayType;
        AdvertItemActions advertItemActions2 = (i12 & 256) != 0 ? bxContentResult.moreActions : advertItemActions;
        DeepLink deepLink3 = (i12 & 512) != 0 ? bxContentResult.onboarding : deepLink;
        BxContentBusiness360 bxContentBusiness3602 = (i12 & 1024) != 0 ? bxContentResult.business360 : bxContentBusiness360;
        Boolean bool6 = (i12 & 2048) != 0 ? bxContentResult.shouldShowSaveSearch : bool;
        Boolean bool7 = (i12 & 4096) != 0 ? bxContentResult.shouldShowSaveSearchButtonOnMap : bool2;
        return bxContentResult.copy(list5, screenContent2, str8, str9, list6, location2, options2, serpDisplayType2, advertItemActions2, deepLink3, bxContentBusiness3602, bool6, bool7, (i12 & 8192) != 0 ? bxContentResult.shouldShowFiltersButton : bool3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? bxContentResult.isVerticalMain : bool4, (i12 & 32768) != 0 ? bxContentResult.crossCategoryTag : str3, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? bxContentResult.emptySearchText : str4, (i12 & 131072) != 0 ? bxContentResult.emptySearchContent : emptySearchContent, (i12 & 262144) != 0 ? bxContentResult.categoryDetails : serpResultCategoryDetails, (i12 & 524288) != 0 ? bxContentResult.navigationBarStyle : navigationBarStyle, (i12 & 1048576) != 0 ? bxContentResult.isSubscribed : bool5, (i12 & 2097152) != 0 ? bxContentResult.subscriptionId : str5, (i12 & 4194304) != 0 ? bxContentResult.nextPageId : str6, (i12 & 8388608) != 0 ? bxContentResult.lastStamp : j12, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? bxContentResult.firebaseParams : map, (33554432 & i12) != 0 ? bxContentResult.uxFeedbackConfig : uxFeedbackConfig, (i12 & 67108864) != 0 ? bxContentResult.uxFeedbackConfigs : list3, (i12 & 134217728) != 0 ? bxContentResult.count : j13, (i12 & 268435456) != 0 ? bxContentResult.sharingButton : sharingButton, (536870912 & i12) != 0 ? bxContentResult.additionalButtons : additionalButtons, (i12 & 1073741824) != 0 ? bxContentResult.features : list4, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? bxContentResult.newSerpMapInteraction : str7, (i13 & 1) != 0 ? bxContentResult.onDisplayClickstreamDeeplink : deepLink2, (i13 & 2) != 0 ? bxContentResult.floatingContainer : serpFloatingContainer, (i13 & 4) != 0 ? bxContentResult.filterHintToast : filterHintToast);
    }

    @k
    public final List<SerpElement> component1() {
        return this.items;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final DeepLink getOnboarding() {
        return this.onboarding;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final BxContentBusiness360 getBusiness360() {
        return this.business360;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final Boolean getShouldShowSaveSearch() {
        return this.shouldShowSaveSearch;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Boolean getShouldShowSaveSearchButtonOnMap() {
        return this.shouldShowSaveSearchButtonOnMap;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Boolean getShouldShowFiltersButton() {
        return this.shouldShowFiltersButton;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final Boolean getIsVerticalMain() {
        return this.isVerticalMain;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final String getCrossCategoryTag() {
        return this.crossCategoryTag;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final String getEmptySearchText() {
        return this.emptySearchText;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final EmptySearchContent getEmptySearchContent() {
        return this.emptySearchContent;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final SerpResultCategoryDetails getCategoryDetails() {
        return this.categoryDetails;
    }

    @l
    /* renamed from: component2, reason: from getter */
    public final ScreenContent getScreenContent() {
        return this.screenContent;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final NavigationBarStyle getNavigationBarStyle() {
        return this.navigationBarStyle;
    }

    @l
    /* renamed from: component21, reason: from getter */
    public final Boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    @l
    /* renamed from: component22, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @l
    /* renamed from: component23, reason: from getter */
    public final String getNextPageId() {
        return this.nextPageId;
    }

    /* renamed from: component24, reason: from getter */
    public final long getLastStamp() {
        return this.lastStamp;
    }

    @l
    public final Map<String, String> component25() {
        return this.firebaseParams;
    }

    @l
    /* renamed from: component26, reason: from getter */
    public final UxFeedbackConfig getUxFeedbackConfig() {
        return this.uxFeedbackConfig;
    }

    @l
    public final List<UxFeedbackConfigOld> component27() {
        return this.uxFeedbackConfigs;
    }

    /* renamed from: component28, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    @l
    /* renamed from: component29, reason: from getter */
    public final SharingButton getSharingButton() {
        return this.sharingButton;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    @l
    /* renamed from: component30, reason: from getter */
    public final AdditionalButtons getAdditionalButtons() {
        return this.additionalButtons;
    }

    @l
    public final List<String> component31() {
        return this.features;
    }

    @l
    /* renamed from: component32, reason: from getter */
    public final String getNewSerpMapInteraction() {
        return this.newSerpMapInteraction;
    }

    @l
    /* renamed from: component33, reason: from getter */
    public final DeepLink getOnDisplayClickstreamDeeplink() {
        return this.onDisplayClickstreamDeeplink;
    }

    @l
    /* renamed from: component34, reason: from getter */
    public final SerpFloatingContainer getFloatingContainer() {
        return this.floatingContainer;
    }

    @l
    /* renamed from: component35, reason: from getter */
    public final FilterHintToast getFilterHintToast() {
        return this.filterHintToast;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getXHash() {
        return this.xHash;
    }

    @l
    public final List<HomeTabItem> component5() {
        return this.tabs;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final Location getLocation() {
        return this.location;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final Options getOptions() {
        return this.options;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final AdvertItemActions getMoreActions() {
        return this.moreActions;
    }

    @k
    public final BxContentResult copy(@k List<? extends SerpElement> items, @l ScreenContent screenContent, @l String searchHint, @l String xHash, @l List<HomeTabItem> tabs, @l Location location, @l Options options, @l SerpDisplayType displayType, @l AdvertItemActions moreActions, @l DeepLink onboarding, @l BxContentBusiness360 business360, @l Boolean shouldShowSaveSearch, @l Boolean shouldShowSaveSearchButtonOnMap, @l Boolean shouldShowFiltersButton, @l Boolean isVerticalMain, @l String crossCategoryTag, @l String emptySearchText, @l EmptySearchContent emptySearchContent, @l SerpResultCategoryDetails categoryDetails, @l NavigationBarStyle navigationBarStyle, @l Boolean isSubscribed, @l String subscriptionId, @l String nextPageId, long lastStamp, @l Map<String, String> firebaseParams, @l UxFeedbackConfig uxFeedbackConfig, @l List<UxFeedbackConfigOld> uxFeedbackConfigs, long count, @l SharingButton sharingButton, @l AdditionalButtons additionalButtons, @l List<String> features, @l String newSerpMapInteraction, @l DeepLink onDisplayClickstreamDeeplink, @l SerpFloatingContainer floatingContainer, @l FilterHintToast filterHintToast) {
        return new BxContentResult(items, screenContent, searchHint, xHash, tabs, location, options, displayType, moreActions, onboarding, business360, shouldShowSaveSearch, shouldShowSaveSearchButtonOnMap, shouldShowFiltersButton, isVerticalMain, crossCategoryTag, emptySearchText, emptySearchContent, categoryDetails, navigationBarStyle, isSubscribed, subscriptionId, nextPageId, lastStamp, firebaseParams, uxFeedbackConfig, uxFeedbackConfigs, count, sharingButton, additionalButtons, features, newSerpMapInteraction, onDisplayClickstreamDeeplink, floatingContainer, filterHintToast);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BxContentResult)) {
            return false;
        }
        BxContentResult bxContentResult = (BxContentResult) other;
        return L.f(this.items, bxContentResult.items) && L.f(this.screenContent, bxContentResult.screenContent) && L.f(this.searchHint, bxContentResult.searchHint) && L.f(this.xHash, bxContentResult.xHash) && L.f(this.tabs, bxContentResult.tabs) && L.f(this.location, bxContentResult.location) && L.f(this.options, bxContentResult.options) && this.displayType == bxContentResult.displayType && L.f(this.moreActions, bxContentResult.moreActions) && L.f(this.onboarding, bxContentResult.onboarding) && L.f(this.business360, bxContentResult.business360) && L.f(this.shouldShowSaveSearch, bxContentResult.shouldShowSaveSearch) && L.f(this.shouldShowSaveSearchButtonOnMap, bxContentResult.shouldShowSaveSearchButtonOnMap) && L.f(this.shouldShowFiltersButton, bxContentResult.shouldShowFiltersButton) && L.f(this.isVerticalMain, bxContentResult.isVerticalMain) && L.f(this.crossCategoryTag, bxContentResult.crossCategoryTag) && L.f(this.emptySearchText, bxContentResult.emptySearchText) && L.f(this.emptySearchContent, bxContentResult.emptySearchContent) && L.f(this.categoryDetails, bxContentResult.categoryDetails) && L.f(this.navigationBarStyle, bxContentResult.navigationBarStyle) && L.f(this.isSubscribed, bxContentResult.isSubscribed) && L.f(this.subscriptionId, bxContentResult.subscriptionId) && L.f(this.nextPageId, bxContentResult.nextPageId) && this.lastStamp == bxContentResult.lastStamp && L.f(this.firebaseParams, bxContentResult.firebaseParams) && L.f(this.uxFeedbackConfig, bxContentResult.uxFeedbackConfig) && L.f(this.uxFeedbackConfigs, bxContentResult.uxFeedbackConfigs) && this.count == bxContentResult.count && L.f(this.sharingButton, bxContentResult.sharingButton) && L.f(this.additionalButtons, bxContentResult.additionalButtons) && L.f(this.features, bxContentResult.features) && L.f(this.newSerpMapInteraction, bxContentResult.newSerpMapInteraction) && L.f(this.onDisplayClickstreamDeeplink, bxContentResult.onDisplayClickstreamDeeplink) && L.f(this.floatingContainer, bxContentResult.floatingContainer) && L.f(this.filterHintToast, bxContentResult.filterHintToast);
    }

    @l
    public final AdditionalButtons getAdditionalButtons() {
        return this.additionalButtons;
    }

    @l
    public final BxContentBusiness360 getBusiness360() {
        return this.business360;
    }

    @l
    public final SerpResultCategoryDetails getCategoryDetails() {
        return this.categoryDetails;
    }

    public final long getCount() {
        return this.count;
    }

    @l
    public final String getCrossCategoryTag() {
        return this.crossCategoryTag;
    }

    @l
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    public final EmptySearchContent getEmptySearchContent() {
        return this.emptySearchContent;
    }

    @l
    public final String getEmptySearchText() {
        return this.emptySearchText;
    }

    @l
    public final List<String> getFeatures() {
        return this.features;
    }

    @l
    public final FilterHintToast getFilterHintToast() {
        return this.filterHintToast;
    }

    @l
    public final Map<String, String> getFirebaseParams() {
        return this.firebaseParams;
    }

    @l
    public final SerpFloatingContainer getFloatingContainer() {
        return this.floatingContainer;
    }

    @k
    public final List<SerpElement> getItems() {
        return this.items;
    }

    public final long getLastStamp() {
        return this.lastStamp;
    }

    @l
    public final Location getLocation() {
        return this.location;
    }

    @l
    public final AdvertItemActions getMoreActions() {
        return this.moreActions;
    }

    @l
    public final NavigationBarStyle getNavigationBarStyle() {
        return this.navigationBarStyle;
    }

    @l
    public final String getNewSerpMapInteraction() {
        return this.newSerpMapInteraction;
    }

    @l
    public final String getNextPageId() {
        return this.nextPageId;
    }

    @l
    public final DeepLink getOnDisplayClickstreamDeeplink() {
        return this.onDisplayClickstreamDeeplink;
    }

    @l
    public final DeepLink getOnboarding() {
        return this.onboarding;
    }

    @l
    public final Options getOptions() {
        return this.options;
    }

    @l
    public final ScreenContent getScreenContent() {
        return this.screenContent;
    }

    @l
    public final String getSearchHint() {
        return this.searchHint;
    }

    @l
    public final SharingButton getSharingButton() {
        return this.sharingButton;
    }

    @l
    public final Boolean getShouldShowFiltersButton() {
        return this.shouldShowFiltersButton;
    }

    @l
    public final Boolean getShouldShowSaveSearch() {
        return this.shouldShowSaveSearch;
    }

    @l
    public final Boolean getShouldShowSaveSearchButtonOnMap() {
        return this.shouldShowSaveSearchButtonOnMap;
    }

    @l
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @l
    public final List<HomeTabItem> getTabs() {
        return this.tabs;
    }

    @l
    public final UxFeedbackConfig getUxFeedbackConfig() {
        return this.uxFeedbackConfig;
    }

    @l
    public final List<UxFeedbackConfigOld> getUxFeedbackConfigs() {
        return this.uxFeedbackConfigs;
    }

    @l
    public final String getXHash() {
        return this.xHash;
    }

    public int hashCode() {
        int iHashCode = this.items.hashCode() * 31;
        ScreenContent screenContent = this.screenContent;
        int iHashCode2 = (iHashCode + (screenContent == null ? 0 : screenContent.hashCode())) * 31;
        String str = this.searchHint;
        int iHashCode3 = (iHashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.xHash;
        int iHashCode4 = (iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        List<HomeTabItem> list = this.tabs;
        int iHashCode5 = (iHashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        Location location = this.location;
        int iHashCode6 = (iHashCode5 + (location == null ? 0 : location.hashCode())) * 31;
        Options options = this.options;
        int iHashCode7 = (iHashCode6 + (options == null ? 0 : options.hashCode())) * 31;
        SerpDisplayType serpDisplayType = this.displayType;
        int iHashCode8 = (iHashCode7 + (serpDisplayType == null ? 0 : serpDisplayType.hashCode())) * 31;
        AdvertItemActions advertItemActions = this.moreActions;
        int iHashCode9 = (iHashCode8 + (advertItemActions == null ? 0 : advertItemActions.hashCode())) * 31;
        DeepLink deepLink = this.onboarding;
        int iHashCode10 = (iHashCode9 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        BxContentBusiness360 bxContentBusiness360 = this.business360;
        int iHashCode11 = (iHashCode10 + (bxContentBusiness360 == null ? 0 : bxContentBusiness360.hashCode())) * 31;
        Boolean bool = this.shouldShowSaveSearch;
        int iHashCode12 = (iHashCode11 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.shouldShowSaveSearchButtonOnMap;
        int iHashCode13 = (iHashCode12 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.shouldShowFiltersButton;
        int iHashCode14 = (iHashCode13 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.isVerticalMain;
        int iHashCode15 = (iHashCode14 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        String str3 = this.crossCategoryTag;
        int iHashCode16 = (iHashCode15 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.emptySearchText;
        int iHashCode17 = (iHashCode16 + (str4 == null ? 0 : str4.hashCode())) * 31;
        EmptySearchContent emptySearchContent = this.emptySearchContent;
        int iHashCode18 = (iHashCode17 + (emptySearchContent == null ? 0 : emptySearchContent.hashCode())) * 31;
        SerpResultCategoryDetails serpResultCategoryDetails = this.categoryDetails;
        int iHashCode19 = (iHashCode18 + (serpResultCategoryDetails == null ? 0 : serpResultCategoryDetails.hashCode())) * 31;
        NavigationBarStyle navigationBarStyle = this.navigationBarStyle;
        int iHashCode20 = (iHashCode19 + (navigationBarStyle == null ? 0 : navigationBarStyle.hashCode())) * 31;
        Boolean bool5 = this.isSubscribed;
        int iHashCode21 = (iHashCode20 + (bool5 == null ? 0 : bool5.hashCode())) * 31;
        String str5 = this.subscriptionId;
        int iHashCode22 = (iHashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.nextPageId;
        int iG2 = r.g((iHashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31, 31, this.lastStamp);
        Map<String, String> map = this.firebaseParams;
        int iHashCode23 = (iG2 + (map == null ? 0 : map.hashCode())) * 31;
        UxFeedbackConfig uxFeedbackConfig = this.uxFeedbackConfig;
        int iHashCode24 = (iHashCode23 + (uxFeedbackConfig == null ? 0 : uxFeedbackConfig.hashCode())) * 31;
        List<UxFeedbackConfigOld> list2 = this.uxFeedbackConfigs;
        int iG3 = r.g((iHashCode24 + (list2 == null ? 0 : list2.hashCode())) * 31, 31, this.count);
        SharingButton sharingButton = this.sharingButton;
        int iHashCode25 = (iG3 + (sharingButton == null ? 0 : sharingButton.hashCode())) * 31;
        AdditionalButtons additionalButtons = this.additionalButtons;
        int iHashCode26 = (iHashCode25 + (additionalButtons == null ? 0 : additionalButtons.hashCode())) * 31;
        List<String> list3 = this.features;
        int iHashCode27 = (iHashCode26 + (list3 == null ? 0 : list3.hashCode())) * 31;
        String str7 = this.newSerpMapInteraction;
        int iHashCode28 = (iHashCode27 + (str7 == null ? 0 : str7.hashCode())) * 31;
        DeepLink deepLink2 = this.onDisplayClickstreamDeeplink;
        int iHashCode29 = (iHashCode28 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        SerpFloatingContainer serpFloatingContainer = this.floatingContainer;
        int iHashCode30 = (iHashCode29 + (serpFloatingContainer == null ? 0 : serpFloatingContainer.hashCode())) * 31;
        FilterHintToast filterHintToast = this.filterHintToast;
        return iHashCode30 + (filterHintToast != null ? filterHintToast.hashCode() : 0);
    }

    @l
    public final Boolean isSubscribed() {
        return this.isSubscribed;
    }

    @l
    public final Boolean isVerticalMain() {
        return this.isVerticalMain;
    }

    @k
    public String toString() {
        return "BxContentResult(items=" + this.items + ", screenContent=" + this.screenContent + ", searchHint=" + this.searchHint + ", xHash=" + this.xHash + ", tabs=" + this.tabs + ", location=" + this.location + ", options=" + this.options + ", displayType=" + this.displayType + ", moreActions=" + this.moreActions + ", onboarding=" + this.onboarding + ", business360=" + this.business360 + ", shouldShowSaveSearch=" + this.shouldShowSaveSearch + ", shouldShowSaveSearchButtonOnMap=" + this.shouldShowSaveSearchButtonOnMap + ", shouldShowFiltersButton=" + this.shouldShowFiltersButton + ", isVerticalMain=" + this.isVerticalMain + ", crossCategoryTag=" + this.crossCategoryTag + ", emptySearchText=" + this.emptySearchText + ", emptySearchContent=" + this.emptySearchContent + ", categoryDetails=" + this.categoryDetails + ", navigationBarStyle=" + this.navigationBarStyle + ", isSubscribed=" + this.isSubscribed + ", subscriptionId=" + this.subscriptionId + ", nextPageId=" + this.nextPageId + ", lastStamp=" + this.lastStamp + ", firebaseParams=" + this.firebaseParams + ", uxFeedbackConfig=" + this.uxFeedbackConfig + ", uxFeedbackConfigs=" + this.uxFeedbackConfigs + ", count=" + this.count + ", sharingButton=" + this.sharingButton + ", additionalButtons=" + this.additionalButtons + ", features=" + this.features + ", newSerpMapInteraction=" + this.newSerpMapInteraction + ", onDisplayClickstreamDeeplink=" + this.onDisplayClickstreamDeeplink + ", floatingContainer=" + this.floatingContainer + ", filterHintToast=" + this.filterHintToast + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        Iterator itJ = C0.j(this.items, parcel);
        while (itJ.hasNext()) {
            parcel.writeParcelable((Parcelable) itJ.next(), flags);
        }
        ScreenContent screenContent = this.screenContent;
        if (screenContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            screenContent.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.searchHint);
        parcel.writeString(this.xHash);
        List<HomeTabItem> list = this.tabs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.location, flags);
        Options options = this.options;
        if (options == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            options.writeToParcel(parcel, flags);
        }
        SerpDisplayType serpDisplayType = this.displayType;
        if (serpDisplayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpDisplayType.name());
        }
        parcel.writeParcelable(this.moreActions, flags);
        parcel.writeParcelable(this.onboarding, flags);
        BxContentBusiness360 bxContentBusiness360 = this.business360;
        if (bxContentBusiness360 == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            bxContentBusiness360.writeToParcel(parcel, flags);
        }
        Boolean bool = this.shouldShowSaveSearch;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.shouldShowSaveSearchButtonOnMap;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.shouldShowFiltersButton;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Boolean bool4 = this.isVerticalMain;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        parcel.writeString(this.crossCategoryTag);
        parcel.writeString(this.emptySearchText);
        EmptySearchContent emptySearchContent = this.emptySearchContent;
        if (emptySearchContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            emptySearchContent.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.categoryDetails, flags);
        parcel.writeParcelable(this.navigationBarStyle, flags);
        Boolean bool5 = this.isSubscribed;
        if (bool5 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool5);
        }
        parcel.writeString(this.subscriptionId);
        parcel.writeString(this.nextPageId);
        parcel.writeLong(this.lastStamp);
        Map<String, String> map = this.firebaseParams;
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
        parcel.writeParcelable(this.uxFeedbackConfig, flags);
        List<UxFeedbackConfigOld> list2 = this.uxFeedbackConfigs;
        if (list2 == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA2 = a.A(list2, parcel, 1);
            while (itA2.hasNext()) {
                parcel.writeParcelable((Parcelable) itA2.next(), flags);
            }
        }
        parcel.writeLong(this.count);
        SharingButton sharingButton = this.sharingButton;
        if (sharingButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sharingButton.writeToParcel(parcel, flags);
        }
        AdditionalButtons additionalButtons = this.additionalButtons;
        if (additionalButtons == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalButtons.writeToParcel(parcel, flags);
        }
        parcel.writeStringList(this.features);
        parcel.writeString(this.newSerpMapInteraction);
        parcel.writeParcelable(this.onDisplayClickstreamDeeplink, flags);
        SerpFloatingContainer serpFloatingContainer = this.floatingContainer;
        if (serpFloatingContainer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serpFloatingContainer.writeToParcel(parcel, flags);
        }
        FilterHintToast filterHintToast = this.filterHintToast;
        if (filterHintToast == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            filterHintToast.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ BxContentResult(List list, ScreenContent screenContent, String str, String str2, List list2, Location location, Options options, SerpDisplayType serpDisplayType, AdvertItemActions advertItemActions, DeepLink deepLink, BxContentBusiness360 bxContentBusiness360, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, String str3, String str4, EmptySearchContent emptySearchContent, SerpResultCategoryDetails serpResultCategoryDetails, NavigationBarStyle navigationBarStyle, Boolean bool5, String str5, String str6, long j12, Map map, UxFeedbackConfig uxFeedbackConfig, List list3, long j13, SharingButton sharingButton, AdditionalButtons additionalButtons, List list4, String str7, DeepLink deepLink2, SerpFloatingContainer serpFloatingContainer, FilterHintToast filterHintToast, int i12, int i13, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? null : screenContent, (i12 & 4) != 0 ? null : str, (i12 & 8) != 0 ? null : str2, (i12 & 16) != 0 ? null : list2, (i12 & 32) != 0 ? null : location, (i12 & 64) != 0 ? null : options, (i12 & 128) != 0 ? null : serpDisplayType, (i12 & 256) != 0 ? null : advertItemActions, (i12 & 512) != 0 ? null : deepLink, (i12 & 1024) != 0 ? null : bxContentBusiness360, (i12 & 2048) != 0 ? null : bool, (i12 & 4096) != 0 ? null : bool2, (i12 & 8192) != 0 ? null : bool3, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool4, (i12 & 32768) != 0 ? null : str3, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : str4, (i12 & 131072) != 0 ? null : emptySearchContent, (i12 & 262144) != 0 ? null : serpResultCategoryDetails, (i12 & 524288) != 0 ? null : navigationBarStyle, (i12 & 1048576) != 0 ? null : bool5, (i12 & 2097152) != 0 ? null : str5, (i12 & 4194304) != 0 ? null : str6, (i12 & 8388608) != 0 ? 0L : j12, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : map, (i12 & 33554432) != 0 ? null : uxFeedbackConfig, (i12 & 67108864) != 0 ? null : list3, (i12 & 134217728) == 0 ? j13 : 0L, (i12 & 268435456) != 0 ? null : sharingButton, (i12 & 536870912) != 0 ? null : additionalButtons, (i12 & 1073741824) != 0 ? null : list4, (i12 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : str7, (i13 & 1) != 0 ? null : deepLink2, (i13 & 2) != 0 ? null : serpFloatingContainer, (i13 & 4) == 0 ? filterHintToast : null);
    }
}
