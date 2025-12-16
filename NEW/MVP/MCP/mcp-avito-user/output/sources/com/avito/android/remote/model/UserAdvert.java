package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import aW.InterfaceC19823a;
import aW.InterfaceC19824b;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.container.promo_block.BeduinPromoBlockModel;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.UserAdvertStatusType;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.messenger.context_actions.ContextActionHandler;
import com.avito.android.remote.model.text.AttributedText;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.avito.android.remote.model.user_adverts.FashionAuthentication;
import com.avito.android.remote.model.user_adverts.RealtyLeadgen;
import com.avito.android.remote.model.user_adverts.RealtyOwnerVerificationBadge;
import com.google.gson.annotations.c;
import com.huawei.hms.framework.common.hianalytics.CrashHianalyticsData;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: UserAdvert.kt */
@InterfaceC19823a
@d
@Metadata(d1 = {"\u0000Þ\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\bI\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bV\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002:\u001cá\u0001â\u0001ã\u0001ä\u0001å\u0001æ\u0001ç\u0001è\u0001é\u0001ê\u0001ë\u0001ì\u0001í\u0001î\u0001B«\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u000e\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016\u0012\b\u0010\u001a\u001a\u0004\u0018\u00010\u0019\u0012\b\u0010\u001b\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0006\u0010 \u001a\u00020\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010#\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010%\u001a\u0004\u0018\u00010$\u0012\b\u0010&\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\b\u0010*\u001a\u0004\u0018\u00010)\u0012\b\u0010,\u001a\u0004\u0018\u00010+\u0012\b\u0010-\u001a\u0004\u0018\u00010\u001f\u0012\b\u0010/\u001a\u0004\u0018\u00010.\u0012\b\u00101\u001a\u0004\u0018\u000100\u0012\u000e\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016\u0012\b\u00103\u001a\u0004\u0018\u00010\u0003\u0012\b\u00104\u001a\u0004\u0018\u00010!\u0012\b\u00105\u001a\u0004\u0018\u00010\u0003\u0012\b\u00106\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u00109\u001a\u0004\u0018\u000108\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>\u0012\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@\u0012\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B\u0012\n\b\u0002\u0010E\u001a\u0004\u0018\u00010D¢\u0006\u0004\bF\u0010GJ\u0010\u0010H\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bJ\u0010IJ\u0012\u0010K\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\bK\u0010LJ\u0012\u0010M\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bM\u0010NJ\u0012\u0010O\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bQ\u0010IJ\u0012\u0010R\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bT\u0010IJ\u0010\u0010U\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\bU\u0010VJ\u0012\u0010W\u001a\u0004\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0018\u0010[\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\u0019HÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b_\u0010IJ\u0012\u0010`\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b`\u0010IJ\u0012\u0010a\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0010\u0010c\u001a\u00020\u001fHÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0012\u0010e\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0012\u0010g\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0012\u0010i\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0012\u0010k\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bk\u0010IJ\u0012\u0010l\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\bl\u0010mJ\u0012\u0010n\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bn\u0010oJ\u0012\u0010p\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bp\u0010qJ\u0012\u0010r\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\br\u0010hJ\u0012\u0010s\u001a\u0004\u0018\u00010.HÆ\u0003¢\u0006\u0004\bs\u0010tJ\u0012\u0010u\u001a\u0004\u0018\u000100HÆ\u0003¢\u0006\u0004\bu\u0010vJ\u0018\u0010w\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bw\u0010\\J\u0012\u0010x\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bx\u0010IJ\u0012\u0010y\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\by\u0010fJ\u0012\u0010z\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bz\u0010IJ\u0012\u0010{\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b{\u0010IJ\u0012\u0010|\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\b|\u0010IJ\u0012\u0010}\u001a\u0004\u0018\u000108HÆ\u0003¢\u0006\u0004\b}\u0010~J\u0013\u0010\u007f\u001a\u0004\u0018\u00010:HÆ\u0003¢\u0006\u0005\b\u007f\u0010\u0080\u0001J\u0015\u0010\u0081\u0001\u001a\u0004\u0018\u00010<HÆ\u0003¢\u0006\u0006\b\u0081\u0001\u0010\u0082\u0001J\u0015\u0010\u0083\u0001\u001a\u0004\u0018\u00010>HÆ\u0003¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0015\u0010\u0085\u0001\u001a\u0004\u0018\u00010@HÆ\u0003¢\u0006\u0006\b\u0085\u0001\u0010\u0086\u0001J\u0015\u0010\u0087\u0001\u001a\u0004\u0018\u00010BHÆ\u0003¢\u0006\u0006\b\u0087\u0001\u0010\u0088\u0001J\u0015\u0010\u0089\u0001\u001a\u0004\u0018\u00010DHÆ\u0003¢\u0006\u0006\b\u0089\u0001\u0010\u008a\u0001J÷\u0003\u0010\u008b\u0001\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0010\b\u0002\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00192\n\b\u0002\u0010\u001b\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\b\b\u0002\u0010 \u001a\u00020\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010-\u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010/\u001a\u0004\u0018\u00010.2\n\b\u0002\u00101\u001a\u0004\u0018\u0001002\u0010\b\u0002\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00162\n\b\u0002\u00103\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00104\u001a\u0004\u0018\u00010!2\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00107\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u00109\u001a\u0004\u0018\u0001082\n\b\u0002\u0010;\u001a\u0004\u0018\u00010:2\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010?\u001a\u0004\u0018\u00010>2\n\b\u0002\u0010A\u001a\u0004\u0018\u00010@2\n\b\u0002\u0010C\u001a\u0004\u0018\u00010B2\n\b\u0002\u0010E\u001a\u0004\u0018\u00010DHÆ\u0001¢\u0006\u0006\b\u008b\u0001\u0010\u008c\u0001J\u0012\u0010\u008d\u0001\u001a\u00020\u0003HÖ\u0001¢\u0006\u0005\b\u008d\u0001\u0010IJ\u0014\u0010\u008f\u0001\u001a\u00030\u008e\u0001HÖ\u0001¢\u0006\u0006\b\u008f\u0001\u0010\u0090\u0001J\u001f\u0010\u0093\u0001\u001a\u00020\u001f2\n\u0010\u0092\u0001\u001a\u0005\u0018\u00010\u0091\u0001HÖ\u0003¢\u0006\u0006\b\u0093\u0001\u0010\u0094\u0001J\u0014\u0010\u0095\u0001\u001a\u00030\u008e\u0001HÖ\u0001¢\u0006\u0006\b\u0095\u0001\u0010\u0090\u0001J(\u0010\u009a\u0001\u001a\u00030\u0099\u00012\b\u0010\u0097\u0001\u001a\u00030\u0096\u00012\b\u0010\u0098\u0001\u001a\u00030\u008e\u0001HÖ\u0001¢\u0006\u0006\b\u009a\u0001\u0010\u009b\u0001R\u0019\u0010\u0004\u001a\u00020\u00038\u0006¢\u0006\u000e\n\u0005\b\u0004\u0010\u009c\u0001\u001a\u0005\b\u009d\u0001\u0010IR\u0019\u0010\u0005\u001a\u00020\u00038\u0006¢\u0006\u000e\n\u0005\b\u0005\u0010\u009c\u0001\u001a\u0005\b\u009e\u0001\u0010IR\u001b\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\u000e\n\u0005\b\u0007\u0010\u009f\u0001\u001a\u0005\b \u0001\u0010LR\u001b\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\u000e\n\u0005\b\t\u0010¡\u0001\u001a\u0005\b¢\u0001\u0010NR\u001b\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\u000e\n\u0005\b\u000b\u0010£\u0001\u001a\u0005\b¤\u0001\u0010PR\u001b\u0010\f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\f\u0010\u009c\u0001\u001a\u0005\b¥\u0001\u0010IR\u001b\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\u000e\n\u0005\b\u000e\u0010¦\u0001\u001a\u0005\b§\u0001\u0010SR\u001b\u0010\u000f\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u000f\u0010\u009c\u0001\u001a\u0005\b¨\u0001\u0010IR\u0019\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\u000e\n\u0005\b\u0011\u0010©\u0001\u001a\u0005\bª\u0001\u0010VR\u001b\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\u000e\n\u0005\b\u0013\u0010«\u0001\u001a\u0005\b¬\u0001\u0010XR\u001b\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\u000e\n\u0005\b\u0015\u0010\u00ad\u0001\u001a\u0005\b®\u0001\u0010ZR!\u0010\u0018\u001a\n\u0012\u0004\u0012\u00020\u0017\u0018\u00010\u00168\u0006¢\u0006\u000e\n\u0005\b\u0018\u0010¯\u0001\u001a\u0005\b°\u0001\u0010\\R\u001b\u0010\u001a\u001a\u0004\u0018\u00010\u00198\u0006¢\u0006\u000e\n\u0005\b\u001a\u0010±\u0001\u001a\u0005\b²\u0001\u0010^R\u001b\u0010\u001b\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001b\u0010\u009c\u0001\u001a\u0005\b³\u0001\u0010IR\u001b\u0010\u001c\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b\u001c\u0010\u009c\u0001\u001a\u0005\b´\u0001\u0010IR\u001b\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006¢\u0006\u000e\n\u0005\b\u001e\u0010µ\u0001\u001a\u0005\b¶\u0001\u0010bR\u0018\u0010 \u001a\u00020\u001f8\u0006¢\u0006\r\n\u0005\b \u0010·\u0001\u001a\u0004\b \u0010dR\u001b\u0010\"\u001a\u0004\u0018\u00010!8\u0006¢\u0006\u000e\n\u0005\b\"\u0010¸\u0001\u001a\u0005\b¹\u0001\u0010fR\u001b\u0010#\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\u000e\n\u0005\b#\u0010º\u0001\u001a\u0005\b»\u0001\u0010hR\u001b\u0010%\u001a\u0004\u0018\u00010$8\u0006¢\u0006\u000e\n\u0005\b%\u0010¼\u0001\u001a\u0005\b½\u0001\u0010jR\u001b\u0010&\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b&\u0010\u009c\u0001\u001a\u0005\b¾\u0001\u0010IR\u001b\u0010(\u001a\u0004\u0018\u00010'8\u0006¢\u0006\u000e\n\u0005\b(\u0010¿\u0001\u001a\u0005\bÀ\u0001\u0010mR\u001b\u0010*\u001a\u0004\u0018\u00010)8\u0006¢\u0006\u000e\n\u0005\b*\u0010Á\u0001\u001a\u0005\bÂ\u0001\u0010oR\u001b\u0010,\u001a\u0004\u0018\u00010+8\u0006¢\u0006\u000e\n\u0005\b,\u0010Ã\u0001\u001a\u0005\bÄ\u0001\u0010qR\u001a\u0010-\u001a\u0004\u0018\u00010\u001f8\u0006¢\u0006\r\n\u0005\b-\u0010º\u0001\u001a\u0004\b-\u0010hR\u001b\u0010/\u001a\u0004\u0018\u00010.8\u0006¢\u0006\u000e\n\u0005\b/\u0010Å\u0001\u001a\u0005\bÆ\u0001\u0010tR\u001b\u00101\u001a\u0004\u0018\u0001008\u0006¢\u0006\u000e\n\u0005\b1\u0010Ç\u0001\u001a\u0005\bÈ\u0001\u0010vR!\u00102\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00168\u0006¢\u0006\u000e\n\u0005\b2\u0010¯\u0001\u001a\u0005\bÉ\u0001\u0010\\R\u001b\u00103\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b3\u0010\u009c\u0001\u001a\u0005\bÊ\u0001\u0010IR\u001b\u00104\u001a\u0004\u0018\u00010!8\u0006¢\u0006\u000e\n\u0005\b4\u0010¸\u0001\u001a\u0005\bË\u0001\u0010fR\u001b\u00105\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b5\u0010\u009c\u0001\u001a\u0005\bÌ\u0001\u0010IR\u001b\u00106\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b6\u0010\u009c\u0001\u001a\u0005\bÍ\u0001\u0010IR\u001b\u00107\u001a\u0004\u0018\u00010\u00038\u0006¢\u0006\u000e\n\u0005\b7\u0010\u009c\u0001\u001a\u0005\bÎ\u0001\u0010IR\u001b\u00109\u001a\u0004\u0018\u0001088\u0006¢\u0006\u000e\n\u0005\b9\u0010Ï\u0001\u001a\u0005\bÐ\u0001\u0010~R\u001c\u0010;\u001a\u0004\u0018\u00010:8\u0006¢\u0006\u000f\n\u0005\b;\u0010Ñ\u0001\u001a\u0006\bÒ\u0001\u0010\u0080\u0001R\u001c\u0010=\u001a\u0004\u0018\u00010<8\u0006¢\u0006\u000f\n\u0005\b=\u0010Ó\u0001\u001a\u0006\bÔ\u0001\u0010\u0082\u0001R\u001c\u0010?\u001a\u0004\u0018\u00010>8\u0006¢\u0006\u000f\n\u0005\b?\u0010Õ\u0001\u001a\u0006\bÖ\u0001\u0010\u0084\u0001R\u001c\u0010A\u001a\u0004\u0018\u00010@8\u0006¢\u0006\u000f\n\u0005\bA\u0010×\u0001\u001a\u0006\bØ\u0001\u0010\u0086\u0001R\u001c\u0010C\u001a\u0004\u0018\u00010B8\u0006¢\u0006\u000f\n\u0005\bC\u0010Ù\u0001\u001a\u0006\bÚ\u0001\u0010\u0088\u0001R\u001c\u0010E\u001a\u0004\u0018\u00010D8\u0006¢\u0006\u000f\n\u0005\bE\u0010Û\u0001\u001a\u0006\bÜ\u0001\u0010\u008a\u0001R(\u0010Ý\u0001\u001a\u00020\u00108\u0016@\u0016X\u0096\u000e¢\u0006\u0017\n\u0006\bÝ\u0001\u0010©\u0001\u001a\u0005\bÞ\u0001\u0010V\"\u0006\bß\u0001\u0010à\u0001¨\u0006ï\u0001"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/SerpElement;", "", "id", "title", "Lcom/avito/android/remote/model/NameIdEntity;", "category", "Lcom/avito/android/remote/model/AdvertImage;", "image", "Lcom/avito/android/remote/model/Video;", "video", "price", "Lcom/avito/android/remote/model/text/AttributedText;", "saleInfo", "shortcut", "", CrashHianalyticsData.TIME, "Lcom/avito/android/remote/model/AdvertStats;", "stats", "Lcom/avito/android/remote/model/UserAdvert$AdvertTips;", "tip", "", "Lcom/avito/android/remote/model/Service;", "servicesIcons", "Lcom/avito/android/remote/model/TimeToLive;", "ttl", "declineReason", "reservationInfo", "Lcom/avito/android/remote/model/user_adverts/RealtyLeadgen;", "realtyLeadgen", "", "isModerated", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "hasDelivery", "Lcom/avito/android/remote/model/UserAdvert$Status;", "status", "shortcutTitle", "Lcom/avito/android/remote/model/UserAdvert$PriceBadge;", "priceBadge", "Lcom/avito/android/remote/model/user_adverts/RealtyOwnerVerificationBadge;", "badge", "Lcom/avito/android/remote/model/user_adverts/FashionAuthentication;", "fashionAuthentication", "isAutoPublishOn", "Lcom/avito/android/remote/model/UserAdvert$VerificationStatus;", "verificationStatus", "Lcom/avito/android/remote/model/UserAdvert$LiquidityStatus;", "liquidityStatus", "actions", "availableStocks", "editDeeplink", "fillParameters", "deliveryAlertText", "location", "Lcom/avito/android/remote/model/UserAdvert$AddressesAdditionalInfo;", "addressesAdditionalInfo", "Lcom/avito/android/remote/model/UserAdvert$ContactsBbl;", "contactsBbl", "Lcom/avito/android/remote/model/UserAdvert$LinkedAdvertisementsInfo;", "linkedAdvertisements", "Lcom/avito/android/remote/model/UserAdvert$ActionButton;", "actionButton", "Lcom/avito/android/remote/model/UserAdvert$SearchPosition;", "searchPosition", "Lcom/avito/android/remote/model/UserAdvert$RightAction;", "rightAction", "Lcom/avito/android/remote/model/UserAdvert$Space;", "space", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/NameIdEntity;Lcom/avito/android/remote/model/AdvertImage;Lcom/avito/android/remote/model/Video;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;JLcom/avito/android/remote/model/AdvertStats;Lcom/avito/android/remote/model/UserAdvert$AdvertTips;Ljava/util/List;Lcom/avito/android/remote/model/TimeToLive;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_adverts/RealtyLeadgen;ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UserAdvert$Status;Ljava/lang/String;Lcom/avito/android/remote/model/UserAdvert$PriceBadge;Lcom/avito/android/remote/model/user_adverts/RealtyOwnerVerificationBadge;Lcom/avito/android/remote/model/user_adverts/FashionAuthentication;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UserAdvert$VerificationStatus;Lcom/avito/android/remote/model/UserAdvert$LiquidityStatus;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UserAdvert$AddressesAdditionalInfo;Lcom/avito/android/remote/model/UserAdvert$ContactsBbl;Lcom/avito/android/remote/model/UserAdvert$LinkedAdvertisementsInfo;Lcom/avito/android/remote/model/UserAdvert$ActionButton;Lcom/avito/android/remote/model/UserAdvert$SearchPosition;Lcom/avito/android/remote/model/UserAdvert$RightAction;Lcom/avito/android/remote/model/UserAdvert$Space;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "()Lcom/avito/android/remote/model/NameIdEntity;", "component4", "()Lcom/avito/android/remote/model/AdvertImage;", "component5", "()Lcom/avito/android/remote/model/Video;", "component6", "component7", "()Lcom/avito/android/remote/model/text/AttributedText;", "component8", "component9", "()J", "component10", "()Lcom/avito/android/remote/model/AdvertStats;", "component11", "()Lcom/avito/android/remote/model/UserAdvert$AdvertTips;", "component12", "()Ljava/util/List;", "component13", "()Lcom/avito/android/remote/model/TimeToLive;", "component14", "component15", "component16", "()Lcom/avito/android/remote/model/user_adverts/RealtyLeadgen;", "component17", "()Z", "component18", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component19", "()Ljava/lang/Boolean;", "component20", "()Lcom/avito/android/remote/model/UserAdvert$Status;", "component21", "component22", "()Lcom/avito/android/remote/model/UserAdvert$PriceBadge;", "component23", "()Lcom/avito/android/remote/model/user_adverts/RealtyOwnerVerificationBadge;", "component24", "()Lcom/avito/android/remote/model/user_adverts/FashionAuthentication;", "component25", "component26", "()Lcom/avito/android/remote/model/UserAdvert$VerificationStatus;", "component27", "()Lcom/avito/android/remote/model/UserAdvert$LiquidityStatus;", "component28", "component29", "component30", "component31", "component32", "component33", "component34", "()Lcom/avito/android/remote/model/UserAdvert$AddressesAdditionalInfo;", "component35", "()Lcom/avito/android/remote/model/UserAdvert$ContactsBbl;", "component36", "()Lcom/avito/android/remote/model/UserAdvert$LinkedAdvertisementsInfo;", "component37", "()Lcom/avito/android/remote/model/UserAdvert$ActionButton;", "component38", "()Lcom/avito/android/remote/model/UserAdvert$SearchPosition;", "component39", "()Lcom/avito/android/remote/model/UserAdvert$RightAction;", "component40", "()Lcom/avito/android/remote/model/UserAdvert$Space;", "copy", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/NameIdEntity;Lcom/avito/android/remote/model/AdvertImage;Lcom/avito/android/remote/model/Video;Ljava/lang/String;Lcom/avito/android/remote/model/text/AttributedText;Ljava/lang/String;JLcom/avito/android/remote/model/AdvertStats;Lcom/avito/android/remote/model/UserAdvert$AdvertTips;Ljava/util/List;Lcom/avito/android/remote/model/TimeToLive;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/user_adverts/RealtyLeadgen;ZLcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UserAdvert$Status;Ljava/lang/String;Lcom/avito/android/remote/model/UserAdvert$PriceBadge;Lcom/avito/android/remote/model/user_adverts/RealtyOwnerVerificationBadge;Lcom/avito/android/remote/model/user_adverts/FashionAuthentication;Ljava/lang/Boolean;Lcom/avito/android/remote/model/UserAdvert$VerificationStatus;Lcom/avito/android/remote/model/UserAdvert$LiquidityStatus;Ljava/util/List;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/remote/model/UserAdvert$AddressesAdditionalInfo;Lcom/avito/android/remote/model/UserAdvert$ContactsBbl;Lcom/avito/android/remote/model/UserAdvert$LinkedAdvertisementsInfo;Lcom/avito/android/remote/model/UserAdvert$ActionButton;Lcom/avito/android/remote/model/UserAdvert$SearchPosition;Lcom/avito/android/remote/model/UserAdvert$RightAction;Lcom/avito/android/remote/model/UserAdvert$Space;)Lcom/avito/android/remote/model/UserAdvert;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getId", "getTitle", "Lcom/avito/android/remote/model/NameIdEntity;", "getCategory", "Lcom/avito/android/remote/model/AdvertImage;", "getImage", "Lcom/avito/android/remote/model/Video;", "getVideo", "getPrice", "Lcom/avito/android/remote/model/text/AttributedText;", "getSaleInfo", "getShortcut", "J", "getTime", "Lcom/avito/android/remote/model/AdvertStats;", "getStats", "Lcom/avito/android/remote/model/UserAdvert$AdvertTips;", "getTip", "Ljava/util/List;", "getServicesIcons", "Lcom/avito/android/remote/model/TimeToLive;", "getTtl", "getDeclineReason", "getReservationInfo", "Lcom/avito/android/remote/model/user_adverts/RealtyLeadgen;", "getRealtyLeadgen", "Z", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "Ljava/lang/Boolean;", "getHasDelivery", "Lcom/avito/android/remote/model/UserAdvert$Status;", "getStatus", "getShortcutTitle", "Lcom/avito/android/remote/model/UserAdvert$PriceBadge;", "getPriceBadge", "Lcom/avito/android/remote/model/user_adverts/RealtyOwnerVerificationBadge;", "getBadge", "Lcom/avito/android/remote/model/user_adverts/FashionAuthentication;", "getFashionAuthentication", "Lcom/avito/android/remote/model/UserAdvert$VerificationStatus;", "getVerificationStatus", "Lcom/avito/android/remote/model/UserAdvert$LiquidityStatus;", "getLiquidityStatus", "getActions", "getAvailableStocks", "getEditDeeplink", "getFillParameters", "getDeliveryAlertText", "getLocation", "Lcom/avito/android/remote/model/UserAdvert$AddressesAdditionalInfo;", "getAddressesAdditionalInfo", "Lcom/avito/android/remote/model/UserAdvert$ContactsBbl;", "getContactsBbl", "Lcom/avito/android/remote/model/UserAdvert$LinkedAdvertisementsInfo;", "getLinkedAdvertisements", "Lcom/avito/android/remote/model/UserAdvert$ActionButton;", "getActionButton", "Lcom/avito/android/remote/model/UserAdvert$SearchPosition;", "getSearchPosition", "Lcom/avito/android/remote/model/UserAdvert$RightAction;", "getRightAction", "Lcom/avito/android/remote/model/UserAdvert$Space;", "getSpace", "uniqueId", "getUniqueId", "setUniqueId", "(J)V", "ActionButton", "AddressesAdditionalInfo", "AdvertTips", "ContactsBbl", "ContactsProgressbar", "LinkedAdvertisementsInfo", "LinkedAdvertisementsOnboarding", "LiquidityStatus", "PriceBadge", "RightAction", "SearchPosition", "Space", "Status", "VerificationStatus", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class UserAdvert implements Parcelable, SerpElement {

    @k
    public static final Parcelable.Creator<UserAdvert> CREATOR = new Creator();

    @l
    private final ActionButton actionButton;

    @l
    private final List<String> actions;

    @l
    private final AddressesAdditionalInfo addressesAdditionalInfo;

    @l
    private final String availableStocks;

    @l
    private final RealtyOwnerVerificationBadge badge;

    @l
    private final NameIdEntity category;

    @l
    private final ContactsBbl contactsBbl;

    @l
    private final String declineReason;

    @l
    private final DeepLink deepLink;

    @l
    private final String deliveryAlertText;

    @l
    private final DeepLink editDeeplink;

    @l
    private final FashionAuthentication fashionAuthentication;

    @l
    private final String fillParameters;

    @l
    private final Boolean hasDelivery;

    @k
    private final String id;

    @l
    private final AdvertImage image;

    @l
    private final Boolean isAutoPublishOn;
    private final boolean isModerated;

    @l
    private final LinkedAdvertisementsInfo linkedAdvertisements;

    @l
    private final LiquidityStatus liquidityStatus;

    @l
    private final String location;

    @l
    private final String price;

    @l
    private final PriceBadge priceBadge;

    @l
    private final RealtyLeadgen realtyLeadgen;

    @l
    private final String reservationInfo;

    @l
    private final RightAction rightAction;

    @l
    private final AttributedText saleInfo;

    @l
    private final SearchPosition searchPosition;

    @l
    private final List<Service> servicesIcons;

    @l
    private final String shortcut;

    @l
    private final String shortcutTitle;

    @l
    private final Space space;

    @l
    private final AdvertStats stats;

    @l
    private final Status status;
    private final long time;

    @l
    private final AdvertTips tip;

    @k
    private final String title;

    @l
    private final TimeToLive ttl;
    private long uniqueId;

    @l
    private final VerificationStatus verificationStatus;

    @l
    private final Video video;

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$ActionButton;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ActionButton implements Parcelable {

        @k
        public static final Parcelable.Creator<ActionButton> CREATOR = new Creator();

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @k
        private final DeepLink deeplink;

        @c("title")
        @k
        private final String title;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ActionButton> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionButton createFromParcel(@k Parcel parcel) {
                return new ActionButton(parcel.readString(), (DeepLink) parcel.readParcelable(ActionButton.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ActionButton[] newArray(int i12) {
                return new ActionButton[i12];
            }
        }

        public ActionButton(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.deeplink = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deeplink, flags);
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$AddressesAdditionalInfo;", "Landroid/os/Parcelable;", "", "delimiter", "content", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getDelimiter", "()Ljava/lang/String;", "getContent", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class AddressesAdditionalInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<AddressesAdditionalInfo> CREATOR = new Creator();

        @c("content")
        @l
        private final String content;

        @c("delimiter")
        @l
        private final String delimiter;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AddressesAdditionalInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AddressesAdditionalInfo createFromParcel(@k Parcel parcel) {
                return new AddressesAdditionalInfo(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AddressesAdditionalInfo[] newArray(int i12) {
                return new AddressesAdditionalInfo[i12];
            }
        }

        public AddressesAdditionalInfo(@l String str, @l String str2) {
            this.delimiter = str;
            this.content = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final String getContent() {
            return this.content;
        }

        @l
        public final String getDelimiter() {
            return this.delimiter;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.delimiter);
            parcel.writeString(this.content);
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\n\u0010\u000bJ$\u0010\f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\tJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0011J \u0010\u001c\u001a\u00020\u001b2\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001e\u001a\u0004\b\u001f\u0010\tR\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010 \u001a\u0004\b!\u0010\u000b¨\u0006\""}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$AdvertTips;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/avito/android/deep_linking/links/DeepLink;", "copy", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)Lcom/avito/android/remote/model/UserAdvert$AdvertTips;", "toString", "", "hashCode", "()I", "", PluralsKeys.OTHER, "", "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class AdvertTips implements Parcelable {

        @k
        public static final Parcelable.Creator<AdvertTips> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deepLink;

        @c("title")
        @k
        private final String title;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<AdvertTips> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdvertTips createFromParcel(@k Parcel parcel) {
                return new AdvertTips(parcel.readString(), (DeepLink) parcel.readParcelable(AdvertTips.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final AdvertTips[] newArray(int i12) {
                return new AdvertTips[i12];
            }
        }

        public AdvertTips(@k String str, @k DeepLink deepLink) {
            this.title = str;
            this.deepLink = deepLink;
        }

        public static /* synthetic */ AdvertTips copy$default(AdvertTips advertTips, String str, DeepLink deepLink, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                str = advertTips.title;
            }
            if ((i12 & 2) != 0) {
                deepLink = advertTips.deepLink;
            }
            return advertTips.copy(str, deepLink);
        }

        @k
        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        @k
        /* renamed from: component2, reason: from getter */
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final AdvertTips copy(@k String title, @k DeepLink deepLink) {
            return new AdvertTips(title, deepLink);
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public boolean equals(@l Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AdvertTips)) {
                return false;
            }
            AdvertTips advertTips = (AdvertTips) other;
            return L.f(this.title, advertTips.title) && L.f(this.deepLink, advertTips.deepLink);
        }

        @k
        public final DeepLink getDeepLink() {
            return this.deepLink;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            return this.deepLink.hashCode() + (this.title.hashCode() * 31);
        }

        @k
        public String toString() {
            StringBuilder sb2 = new StringBuilder("AdvertTips(title=");
            sb2.append(this.title);
            sb2.append(", deepLink=");
            return a.v(sb2, this.deepLink, ')');
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.deepLink, flags);
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0018\u0010\u0014¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$ContactsBbl;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/UserAdvert$ContactsProgressbar;", "progressbar", "titleColor", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/UserAdvert$ContactsProgressbar;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/UserAdvert$ContactsProgressbar;", "getProgressbar", "()Lcom/avito/android/remote/model/UserAdvert$ContactsProgressbar;", "getTitleColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContactsBbl implements Parcelable {

        @k
        public static final Parcelable.Creator<ContactsBbl> CREATOR = new Creator();

        @c("progressbar")
        @l
        private final ContactsProgressbar progressbar;

        @c("title")
        @k
        private final String title;

        @c("titleColor")
        @l
        private final String titleColor;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ContactsBbl> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContactsBbl createFromParcel(@k Parcel parcel) {
                return new ContactsBbl(parcel.readString(), parcel.readInt() == 0 ? null : ContactsProgressbar.CREATOR.createFromParcel(parcel), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContactsBbl[] newArray(int i12) {
                return new ContactsBbl[i12];
            }
        }

        public ContactsBbl(@k String str, @l ContactsProgressbar contactsProgressbar, @l String str2) {
            this.title = str;
            this.progressbar = contactsProgressbar;
            this.titleColor = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final ContactsProgressbar getProgressbar() {
            return this.progressbar;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final String getTitleColor() {
            return this.titleColor;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            ContactsProgressbar contactsProgressbar = this.progressbar;
            if (contactsProgressbar == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                contactsProgressbar.writeToParcel(parcel, flags);
            }
            parcel.writeString(this.titleColor);
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ \u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\f2\u0006\u0010\u000e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001a\u0010\u0006\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0015\u001a\u0004\b\u0018\u0010\u0017¨\u0006\u0019"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$ContactsProgressbar;", "Landroid/os/Parcelable;", "", "percentage", "Lcom/avito/android/remote/model/UniversalColor;", "color", "colorBackground", "<init>", "(FLcom/avito/android/remote/model/UniversalColor;Lcom/avito/android/remote/model/UniversalColor;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "F", "getPercentage", "()F", "Lcom/avito/android/remote/model/UniversalColor;", "getColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getColorBackground", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class ContactsProgressbar implements Parcelable {

        @k
        public static final Parcelable.Creator<ContactsProgressbar> CREATOR = new Creator();

        @c("color")
        @k
        private final UniversalColor color;

        @c("colorBackground")
        @k
        private final UniversalColor colorBackground;

        @c("percentage")
        private final float percentage;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<ContactsProgressbar> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContactsProgressbar createFromParcel(@k Parcel parcel) {
                return new ContactsProgressbar(parcel.readFloat(), (UniversalColor) parcel.readParcelable(ContactsProgressbar.class.getClassLoader()), (UniversalColor) parcel.readParcelable(ContactsProgressbar.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final ContactsProgressbar[] newArray(int i12) {
                return new ContactsProgressbar[i12];
            }
        }

        public ContactsProgressbar(float f12, @k UniversalColor universalColor, @k UniversalColor universalColor2) {
            this.percentage = f12;
            this.color = universalColor;
            this.colorBackground = universalColor2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final UniversalColor getColor() {
            return this.color;
        }

        @k
        public final UniversalColor getColorBackground() {
            return this.colorBackground;
        }

        public final float getPercentage() {
            return this.percentage;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeFloat(this.percentage);
            parcel.writeParcelable(this.color, flags);
            parcel.writeParcelable(this.colorBackground, flags);
        }
    }

    /* compiled from: UserAdvert.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<UserAdvert> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserAdvert createFromParcel(@k Parcel parcel) {
            AdvertTips advertTips;
            AdvertStats advertStats;
            ArrayList arrayList;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            String string = parcel.readString();
            String string2 = parcel.readString();
            NameIdEntity nameIdEntityCreateFromParcel = parcel.readInt() == 0 ? null : NameIdEntity.CREATOR.createFromParcel(parcel);
            AdvertImage advertImageCreateFromParcel = parcel.readInt() == 0 ? null : AdvertImage.CREATOR.createFromParcel(parcel);
            Video videoCreateFromParcel = parcel.readInt() == 0 ? null : Video.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            AttributedText attributedText = (AttributedText) parcel.readParcelable(UserAdvert.class.getClassLoader());
            String string4 = parcel.readString();
            long j12 = parcel.readLong();
            AdvertStats advertStatsCreateFromParcel = parcel.readInt() == 0 ? null : AdvertStats.CREATOR.createFromParcel(parcel);
            AdvertTips advertTipsCreateFromParcel = parcel.readInt() == 0 ? null : AdvertTips.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                advertStats = advertStatsCreateFromParcel;
                advertTips = advertTipsCreateFromParcel;
                arrayList = null;
            } else {
                int i12 = parcel.readInt();
                ArrayList arrayList2 = new ArrayList(i12);
                advertTips = advertTipsCreateFromParcel;
                int iC2 = 0;
                while (iC2 != i12) {
                    iC2 = a.c(Service.CREATOR, parcel, arrayList2, iC2, 1);
                    i12 = i12;
                    advertStatsCreateFromParcel = advertStatsCreateFromParcel;
                }
                advertStats = advertStatsCreateFromParcel;
                arrayList = arrayList2;
            }
            TimeToLive timeToLiveCreateFromParcel = parcel.readInt() == 0 ? null : TimeToLive.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            String string6 = parcel.readString();
            RealtyLeadgen realtyLeadgenCreateFromParcel = parcel.readInt() == 0 ? null : RealtyLeadgen.CREATOR.createFromParcel(parcel);
            boolean z12 = parcel.readInt() != 0;
            DeepLink deepLink = (DeepLink) parcel.readParcelable(UserAdvert.class.getClassLoader());
            if (parcel.readInt() == 0) {
                boolValueOf = null;
            } else {
                boolValueOf = Boolean.valueOf(parcel.readInt() != 0);
            }
            Status statusCreateFromParcel = parcel.readInt() == 0 ? null : Status.CREATOR.createFromParcel(parcel);
            String string7 = parcel.readString();
            PriceBadge priceBadgeCreateFromParcel = parcel.readInt() == 0 ? null : PriceBadge.CREATOR.createFromParcel(parcel);
            RealtyOwnerVerificationBadge realtyOwnerVerificationBadgeCreateFromParcel = parcel.readInt() == 0 ? null : RealtyOwnerVerificationBadge.CREATOR.createFromParcel(parcel);
            FashionAuthentication fashionAuthenticationCreateFromParcel = parcel.readInt() == 0 ? null : FashionAuthentication.CREATOR.createFromParcel(parcel);
            if (parcel.readInt() == 0) {
                boolValueOf2 = null;
            } else {
                boolValueOf2 = Boolean.valueOf(parcel.readInt() != 0);
            }
            return new UserAdvert(string, string2, nameIdEntityCreateFromParcel, advertImageCreateFromParcel, videoCreateFromParcel, string3, attributedText, string4, j12, advertStats, advertTips, arrayList, timeToLiveCreateFromParcel, string5, string6, realtyLeadgenCreateFromParcel, z12, deepLink, boolValueOf, statusCreateFromParcel, string7, priceBadgeCreateFromParcel, realtyOwnerVerificationBadgeCreateFromParcel, fashionAuthenticationCreateFromParcel, boolValueOf2, parcel.readInt() == 0 ? null : VerificationStatus.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LiquidityStatus.CREATOR.createFromParcel(parcel), parcel.createStringArrayList(), parcel.readString(), (DeepLink) parcel.readParcelable(UserAdvert.class.getClassLoader()), parcel.readString(), parcel.readString(), parcel.readString(), parcel.readInt() == 0 ? null : AddressesAdditionalInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ContactsBbl.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : LinkedAdvertisementsInfo.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : ActionButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SearchPosition.CREATOR.createFromParcel(parcel), (RightAction) parcel.readParcelable(UserAdvert.class.getClassLoader()), parcel.readInt() == 0 ? null : Space.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final UserAdvert[] newArray(int i12) {
            return new UserAdvert[i12];
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$LinkedAdvertisementsInfo;", "Landroid/os/Parcelable;", "", "title", "count", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "Lcom/avito/android/remote/model/UserAdvert$LinkedAdvertisementsOnboarding;", "onboarding", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UserAdvert$LinkedAdvertisementsOnboarding;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getCount", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/UserAdvert$LinkedAdvertisementsOnboarding;", "getOnboarding", "()Lcom/avito/android/remote/model/UserAdvert$LinkedAdvertisementsOnboarding;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LinkedAdvertisementsInfo implements Parcelable {

        @k
        public static final Parcelable.Creator<LinkedAdvertisementsInfo> CREATOR = new Creator();

        @c("count")
        @k
        private final String count;

        @c(Constants.DEEPLINK)
        @k
        private final DeepLink deeplink;

        @c("onboarding")
        @l
        private final LinkedAdvertisementsOnboarding onboarding;

        @c("title")
        @k
        private final String title;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LinkedAdvertisementsInfo> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LinkedAdvertisementsInfo createFromParcel(@k Parcel parcel) {
                return new LinkedAdvertisementsInfo(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(LinkedAdvertisementsInfo.class.getClassLoader()), parcel.readInt() == 0 ? null : LinkedAdvertisementsOnboarding.CREATOR.createFromParcel(parcel));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LinkedAdvertisementsInfo[] newArray(int i12) {
                return new LinkedAdvertisementsInfo[i12];
            }
        }

        public LinkedAdvertisementsInfo(@k String str, @k String str2, @k DeepLink deepLink, @l LinkedAdvertisementsOnboarding linkedAdvertisementsOnboarding) {
            this.title = str;
            this.count = str2;
            this.deeplink = deepLink;
            this.onboarding = linkedAdvertisementsOnboarding;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getCount() {
            return this.count;
        }

        @k
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final LinkedAdvertisementsOnboarding getOnboarding() {
            return this.onboarding;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.count);
            parcel.writeParcelable(this.deeplink, flags);
            LinkedAdvertisementsOnboarding linkedAdvertisementsOnboarding = this.onboarding;
            if (linkedAdvertisementsOnboarding == null) {
                parcel.writeInt(0);
            } else {
                parcel.writeInt(1);
                linkedAdvertisementsOnboarding.writeToParcel(parcel, flags);
            }
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0004\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$LinkedAdvertisementsOnboarding;", "Landroid/os/Parcelable;", "", "title", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "getSubtitle", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LinkedAdvertisementsOnboarding implements Parcelable {

        @k
        public static final Parcelable.Creator<LinkedAdvertisementsOnboarding> CREATOR = new Creator();

        @c("subtitle")
        @k
        private final String subtitle;

        @c("title")
        @k
        private final String title;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LinkedAdvertisementsOnboarding> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LinkedAdvertisementsOnboarding createFromParcel(@k Parcel parcel) {
                return new LinkedAdvertisementsOnboarding(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LinkedAdvertisementsOnboarding[] newArray(int i12) {
                return new LinkedAdvertisementsOnboarding[i12];
            }
        }

        public LinkedAdvertisementsOnboarding(@k String str, @k String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getSubtitle() {
            return this.subtitle;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeString(this.subtitle);
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ \u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\u0010\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0017\u0010\u0016R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$LiquidityStatus;", "Landroid/os/Parcelable;", "", "statusText", "statusTextColor", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, "", "finishTime", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Long;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStatusText", "()Ljava/lang/String;", "getStatusTextColor", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Ljava/lang/Long;", "getFinishTime", "()Ljava/lang/Long;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class LiquidityStatus implements Parcelable {

        @k
        public static final Parcelable.Creator<LiquidityStatus> CREATOR = new Creator();

        @c(Constants.DEEPLINK)
        @l
        private final DeepLink deeplink;

        @c("finishTime")
        @l
        private final Long finishTime;

        @c("statusText")
        @k
        private final String statusText;

        @c("statusTextColor")
        @l
        private final String statusTextColor;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<LiquidityStatus> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LiquidityStatus createFromParcel(@k Parcel parcel) {
                return new LiquidityStatus(parcel.readString(), parcel.readString(), (DeepLink) parcel.readParcelable(LiquidityStatus.class.getClassLoader()), parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final LiquidityStatus[] newArray(int i12) {
                return new LiquidityStatus[i12];
            }
        }

        public LiquidityStatus(@k String str, @l String str2, @l DeepLink deepLink, @l Long l12) {
            this.statusText = str;
            this.statusTextColor = str2;
            this.deeplink = deepLink;
            this.finishTime = l12;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final DeepLink getDeeplink() {
            return this.deeplink;
        }

        @l
        public final Long getFinishTime() {
            return this.finishTime;
        }

        @k
        public final String getStatusText() {
            return this.statusText;
        }

        @l
        public final String getStatusTextColor() {
            return this.statusTextColor;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.statusText);
            parcel.writeString(this.statusTextColor);
            parcel.writeParcelable(this.deeplink, flags);
            Long l12 = this.finishTime;
            if (l12 == null) {
                parcel.writeInt(0);
            } else {
                C0.m(parcel, 1, l12);
            }
        }
    }

    /* compiled from: UserAdvert.kt */
    @InterfaceC19824b
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$RightAction;", "Landroid/os/Parcelable;", "Button", "Icon", "Lcom/avito/android/remote/model/UserAdvert$RightAction$Button;", "Lcom/avito/android/remote/model/UserAdvert$RightAction$Icon;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public interface RightAction extends Parcelable {

        /* compiled from: UserAdvert.kt */
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\b\u0007\u0018\u00002\u00020\u0001:\u0001\u001cB\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001d"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$RightAction$Button;", "Lcom/avito/android/remote/model/UserAdvert$RightAction;", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "Lcom/avito/android/remote/model/UserAdvert$RightAction$Button$Style;", BeduinPromoBlockModel.SERIALIZED_NAME_STYLE, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/UserAdvert$RightAction$Button$Style;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "Lcom/avito/android/remote/model/UserAdvert$RightAction$Button$Style;", "getStyle", "()Lcom/avito/android/remote/model/UserAdvert$RightAction$Button$Style;", "Style", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        @d
        public static final class Button implements RightAction {

            @k
            public static final Parcelable.Creator<Button> CREATOR = new Creator();

            @k
            private final DeepLink deepLink;

            @k
            private final Style style;

            @k
            private final String title;

            /* compiled from: UserAdvert.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Button> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Button createFromParcel(@k Parcel parcel) {
                    return new Button(parcel.readString(), (DeepLink) parcel.readParcelable(Button.class.getClassLoader()), Style.CREATOR.createFromParcel(parcel));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Button[] newArray(int i12) {
                    return new Button[i12];
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* compiled from: UserAdvert.kt */
            @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u00012\u00020\u0002B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0004J\u0010\u0010\u0006\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J \u0010\f\u001a\u00020\u000b2\u0006\u0010\t\u001a\u00020\b2\u0006\u0010\n\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\f\u0010\rj\u0002\b\u000ej\u0002\b\u000f¨\u0006\u0010"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$RightAction$Button$Style;", "", "Landroid/os/Parcelable;", "<init>", "(Ljava/lang/String;I)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Primary", "Secondary", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
            @d
            public static final class Style implements Parcelable {
                private static final /* synthetic */ kotlin.enums.a $ENTRIES;
                private static final /* synthetic */ Style[] $VALUES;

                @k
                public static final Parcelable.Creator<Style> CREATOR;
                public static final Style Primary = new Style("Primary", 0);
                public static final Style Secondary = new Style("Secondary", 1);

                /* compiled from: UserAdvert.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                public static final class Creator implements Parcelable.Creator<Style> {
                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Style createFromParcel(@k Parcel parcel) {
                        return Style.valueOf(parcel.readString());
                    }

                    /* JADX WARN: Can't rename method to resolve collision */
                    @Override // android.os.Parcelable.Creator
                    @k
                    public final Style[] newArray(int i12) {
                        return new Style[i12];
                    }
                }

                private static final /* synthetic */ Style[] $values() {
                    return new Style[]{Primary, Secondary};
                }

                static {
                    Style[] styleArr$values = $values();
                    $VALUES = styleArr$values;
                    $ENTRIES = kotlin.enums.c.a(styleArr$values);
                    CREATOR = new Creator();
                }

                private Style(String str, int i12) {
                }

                @k
                public static kotlin.enums.a<Style> getEntries() {
                    return $ENTRIES;
                }

                public static Style valueOf(String str) {
                    return (Style) Enum.valueOf(Style.class, str);
                }

                public static Style[] values() {
                    return (Style[]) $VALUES.clone();
                }

                @Override // android.os.Parcelable
                public int describeContents() {
                    return 0;
                }

                @Override // android.os.Parcelable
                public void writeToParcel(@k Parcel parcel, int flags) {
                    parcel.writeString(name());
                }
            }

            public Button(@k String str, @k DeepLink deepLink, @k Style style) {
                this.title = str;
                this.deepLink = deepLink;
                this.style = style;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @k
            public final Style getStyle() {
                return this.style;
            }

            @k
            public final String getTitle() {
                return this.title;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.title);
                parcel.writeParcelable(this.deepLink, flags);
                this.style.writeToParcel(parcel, flags);
            }
        }

        /* compiled from: UserAdvert.kt */
        @d
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$RightAction$Icon;", "Lcom/avito/android/remote/model/UserAdvert$RightAction;", "", "name", "Lcom/avito/android/deep_linking/links/DeepLink;", ContextActionHandler.Link.DEEPLINK, "<init>", "(Ljava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getName", "()Ljava/lang/String;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeepLink", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class Icon implements RightAction {

            @k
            public static final Parcelable.Creator<Icon> CREATOR = new Creator();

            @k
            private final DeepLink deepLink;

            @k
            private final String name;

            /* compiled from: UserAdvert.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            public static final class Creator implements Parcelable.Creator<Icon> {
                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Icon createFromParcel(@k Parcel parcel) {
                    return new Icon(parcel.readString(), (DeepLink) parcel.readParcelable(Icon.class.getClassLoader()));
                }

                /* JADX WARN: Can't rename method to resolve collision */
                @Override // android.os.Parcelable.Creator
                @k
                public final Icon[] newArray(int i12) {
                    return new Icon[i12];
                }
            }

            public Icon(@k String str, @k DeepLink deepLink) {
                this.name = str;
                this.deepLink = deepLink;
            }

            @Override // android.os.Parcelable
            public int describeContents() {
                return 0;
            }

            @k
            public final DeepLink getDeepLink() {
                return this.deepLink;
            }

            @k
            public final String getName() {
                return this.name;
            }

            @Override // android.os.Parcelable
            public void writeToParcel(@k Parcel parcel, int flags) {
                parcel.writeString(this.name);
                parcel.writeParcelable(this.deepLink, flags);
            }
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\b\u0007\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ \u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000f\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$SearchPosition;", "Landroid/os/Parcelable;", "", "blinking", "Lcom/avito/android/remote/model/text/AttributedText;", "text", "Lcom/avito/android/deep_linking/links/DeepLink;", TooltipAttribute.PARAM_DEEP_LINK, "<init>", "(ZLcom/avito/android/remote/model/text/AttributedText;Lcom/avito/android/deep_linking/links/DeepLink;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Z", "getBlinking", "()Z", "Lcom/avito/android/remote/model/text/AttributedText;", "getText", "()Lcom/avito/android/remote/model/text/AttributedText;", "Lcom/avito/android/deep_linking/links/DeepLink;", "getUri", "()Lcom/avito/android/deep_linking/links/DeepLink;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class SearchPosition implements Parcelable {

        @k
        public static final Parcelable.Creator<SearchPosition> CREATOR = new Creator();

        @c("blinking")
        private final boolean blinking;

        @c("text")
        @k
        private final AttributedText text;

        @c(TooltipAttribute.PARAM_DEEP_LINK)
        @l
        private final DeepLink uri;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<SearchPosition> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchPosition createFromParcel(@k Parcel parcel) {
                return new SearchPosition(parcel.readInt() != 0, (AttributedText) parcel.readParcelable(SearchPosition.class.getClassLoader()), (DeepLink) parcel.readParcelable(SearchPosition.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final SearchPosition[] newArray(int i12) {
                return new SearchPosition[i12];
            }
        }

        public SearchPosition(boolean z12, @k AttributedText attributedText, @l DeepLink deepLink) {
            this.blinking = z12;
            this.text = attributedText;
            this.uri = deepLink;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        public final boolean getBlinking() {
            return this.blinking;
        }

        @k
        public final AttributedText getText() {
            return this.text;
        }

        @l
        public final DeepLink getUri() {
            return this.uri;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeInt(this.blinking ? 1 : 0);
            parcel.writeParcelable(this.text, flags);
            parcel.writeParcelable(this.uri, flags);
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0007\u0018\u00002\u00020\u0001B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ \u0010\r\u001a\u00020\f2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\u000b\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u000f\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u0012"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$Space;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/text/AttributedText;", "badge", "<init>", "(Lcom/avito/android/remote/model/text/AttributedText;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/model/text/AttributedText;", "getBadge", "()Lcom/avito/android/remote/model/text/AttributedText;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Space implements Parcelable {

        @k
        public static final Parcelable.Creator<Space> CREATOR = new Creator();

        @c("badge")
        @l
        private final AttributedText badge;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Space> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Space createFromParcel(@k Parcel parcel) {
                return new Space((AttributedText) parcel.readParcelable(Space.class.getClassLoader()));
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Space[] newArray(int i12) {
                return new Space[i12];
            }
        }

        public Space(@l AttributedText attributedText) {
            this.badge = attributedText;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final AttributedText getBadge() {
            return this.badge;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeParcelable(this.badge, flags);
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ \u0010\u000f\u001a\u00020\u000e2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$Status;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/UserAdvertStatusType;", "type", "", "description", "<init>", "(Lcom/avito/android/remote/UserAdvertStatusType;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Lcom/avito/android/remote/UserAdvertStatusType;", "getType", "()Lcom/avito/android/remote/UserAdvertStatusType;", "Ljava/lang/String;", "getDescription", "()Ljava/lang/String;", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class Status implements Parcelable {

        @k
        public static final Parcelable.Creator<Status> CREATOR = new Creator();

        @c("description")
        @k
        private final String description;

        @c("type")
        @k
        private final UserAdvertStatusType type;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<Status> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Status createFromParcel(@k Parcel parcel) {
                return new Status(UserAdvertStatusType.valueOf(parcel.readString()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final Status[] newArray(int i12) {
                return new Status[i12];
            }
        }

        public Status(@k UserAdvertStatusType userAdvertStatusType, @k String str) {
            this.type = userAdvertStatusType;
            this.description = str;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getDescription() {
            return this.description;
        }

        @k
        public final UserAdvertStatusType getType() {
            return this.type;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.type.name());
            parcel.writeString(this.description);
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ \u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0012R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0013\u0010\u0012¨\u0006\u0014"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$VerificationStatus;", "Landroid/os/Parcelable;", "", "statusText", "statusTextColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getStatusText", "()Ljava/lang/String;", "getStatusTextColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class VerificationStatus implements Parcelable {

        @k
        public static final Parcelable.Creator<VerificationStatus> CREATOR = new Creator();

        @c("statusText")
        @k
        private final String statusText;

        @c("statusTextColor")
        @l
        private final String statusTextColor;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<VerificationStatus> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final VerificationStatus createFromParcel(@k Parcel parcel) {
                return new VerificationStatus(parcel.readString(), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final VerificationStatus[] newArray(int i12) {
                return new VerificationStatus[i12];
            }
        }

        public VerificationStatus(@k String str, @l String str2) {
            this.statusText = str;
            this.statusTextColor = str2;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @k
        public final String getStatusText() {
            return this.statusText;
        }

        @l
        public final String getStatusTextColor() {
            return this.statusTextColor;
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.statusText);
            parcel.writeString(this.statusTextColor);
        }
    }

    public UserAdvert(@k String str, @k String str2, @l NameIdEntity nameIdEntity, @l AdvertImage advertImage, @l Video video, @l String str3, @l AttributedText attributedText, @l String str4, long j12, @l AdvertStats advertStats, @l AdvertTips advertTips, @l List<Service> list, @l TimeToLive timeToLive, @l String str5, @l String str6, @l RealtyLeadgen realtyLeadgen, boolean z12, @l DeepLink deepLink, @l Boolean bool, @l Status status, @l String str7, @l PriceBadge priceBadge, @l RealtyOwnerVerificationBadge realtyOwnerVerificationBadge, @l FashionAuthentication fashionAuthentication, @l Boolean bool2, @l VerificationStatus verificationStatus, @l LiquidityStatus liquidityStatus, @l List<String> list2, @l String str8, @l DeepLink deepLink2, @l String str9, @l String str10, @l String str11, @l AddressesAdditionalInfo addressesAdditionalInfo, @l ContactsBbl contactsBbl, @l LinkedAdvertisementsInfo linkedAdvertisementsInfo, @l ActionButton actionButton, @l SearchPosition searchPosition, @l RightAction rightAction, @l Space space) {
        this.id = str;
        this.title = str2;
        this.category = nameIdEntity;
        this.image = advertImage;
        this.video = video;
        this.price = str3;
        this.saleInfo = attributedText;
        this.shortcut = str4;
        this.time = j12;
        this.stats = advertStats;
        this.tip = advertTips;
        this.servicesIcons = list;
        this.ttl = timeToLive;
        this.declineReason = str5;
        this.reservationInfo = str6;
        this.realtyLeadgen = realtyLeadgen;
        this.isModerated = z12;
        this.deepLink = deepLink;
        this.hasDelivery = bool;
        this.status = status;
        this.shortcutTitle = str7;
        this.priceBadge = priceBadge;
        this.badge = realtyOwnerVerificationBadge;
        this.fashionAuthentication = fashionAuthentication;
        this.isAutoPublishOn = bool2;
        this.verificationStatus = verificationStatus;
        this.liquidityStatus = liquidityStatus;
        this.actions = list2;
        this.availableStocks = str8;
        this.editDeeplink = deepLink2;
        this.fillParameters = str9;
        this.deliveryAlertText = str10;
        this.location = str11;
        this.addressesAdditionalInfo = addressesAdditionalInfo;
        this.contactsBbl = contactsBbl;
        this.linkedAdvertisements = linkedAdvertisementsInfo;
        this.actionButton = actionButton;
        this.searchPosition = searchPosition;
        this.rightAction = rightAction;
        this.space = space;
    }

    @k
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final AdvertStats getStats() {
        return this.stats;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final AdvertTips getTip() {
        return this.tip;
    }

    @l
    public final List<Service> component12() {
        return this.servicesIcons;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final TimeToLive getTtl() {
        return this.ttl;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final String getDeclineReason() {
        return this.declineReason;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final String getReservationInfo() {
        return this.reservationInfo;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final RealtyLeadgen getRealtyLeadgen() {
        return this.realtyLeadgen;
    }

    /* renamed from: component17, reason: from getter */
    public final boolean getIsModerated() {
        return this.isModerated;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final Boolean getHasDelivery() {
        return this.hasDelivery;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final Status getStatus() {
        return this.status;
    }

    @l
    /* renamed from: component21, reason: from getter */
    public final String getShortcutTitle() {
        return this.shortcutTitle;
    }

    @l
    /* renamed from: component22, reason: from getter */
    public final PriceBadge getPriceBadge() {
        return this.priceBadge;
    }

    @l
    /* renamed from: component23, reason: from getter */
    public final RealtyOwnerVerificationBadge getBadge() {
        return this.badge;
    }

    @l
    /* renamed from: component24, reason: from getter */
    public final FashionAuthentication getFashionAuthentication() {
        return this.fashionAuthentication;
    }

    @l
    /* renamed from: component25, reason: from getter */
    public final Boolean getIsAutoPublishOn() {
        return this.isAutoPublishOn;
    }

    @l
    /* renamed from: component26, reason: from getter */
    public final VerificationStatus getVerificationStatus() {
        return this.verificationStatus;
    }

    @l
    /* renamed from: component27, reason: from getter */
    public final LiquidityStatus getLiquidityStatus() {
        return this.liquidityStatus;
    }

    @l
    public final List<String> component28() {
        return this.actions;
    }

    @l
    /* renamed from: component29, reason: from getter */
    public final String getAvailableStocks() {
        return this.availableStocks;
    }

    @l
    /* renamed from: component3, reason: from getter */
    public final NameIdEntity getCategory() {
        return this.category;
    }

    @l
    /* renamed from: component30, reason: from getter */
    public final DeepLink getEditDeeplink() {
        return this.editDeeplink;
    }

    @l
    /* renamed from: component31, reason: from getter */
    public final String getFillParameters() {
        return this.fillParameters;
    }

    @l
    /* renamed from: component32, reason: from getter */
    public final String getDeliveryAlertText() {
        return this.deliveryAlertText;
    }

    @l
    /* renamed from: component33, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @l
    /* renamed from: component34, reason: from getter */
    public final AddressesAdditionalInfo getAddressesAdditionalInfo() {
        return this.addressesAdditionalInfo;
    }

    @l
    /* renamed from: component35, reason: from getter */
    public final ContactsBbl getContactsBbl() {
        return this.contactsBbl;
    }

    @l
    /* renamed from: component36, reason: from getter */
    public final LinkedAdvertisementsInfo getLinkedAdvertisements() {
        return this.linkedAdvertisements;
    }

    @l
    /* renamed from: component37, reason: from getter */
    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    @l
    /* renamed from: component38, reason: from getter */
    public final SearchPosition getSearchPosition() {
        return this.searchPosition;
    }

    @l
    /* renamed from: component39, reason: from getter */
    public final RightAction getRightAction() {
        return this.rightAction;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final AdvertImage getImage() {
        return this.image;
    }

    @l
    /* renamed from: component40, reason: from getter */
    public final Space getSpace() {
        return this.space;
    }

    @l
    /* renamed from: component5, reason: from getter */
    public final Video getVideo() {
        return this.video;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getPrice() {
        return this.price;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final AttributedText getSaleInfo() {
        return this.saleInfo;
    }

    @l
    /* renamed from: component8, reason: from getter */
    public final String getShortcut() {
        return this.shortcut;
    }

    /* renamed from: component9, reason: from getter */
    public final long getTime() {
        return this.time;
    }

    @k
    public final UserAdvert copy(@k String id2, @k String title, @l NameIdEntity category, @l AdvertImage image, @l Video video, @l String price, @l AttributedText saleInfo, @l String shortcut, long time, @l AdvertStats stats, @l AdvertTips tip, @l List<Service> servicesIcons, @l TimeToLive ttl, @l String declineReason, @l String reservationInfo, @l RealtyLeadgen realtyLeadgen, boolean isModerated, @l DeepLink deepLink, @l Boolean hasDelivery, @l Status status, @l String shortcutTitle, @l PriceBadge priceBadge, @l RealtyOwnerVerificationBadge badge, @l FashionAuthentication fashionAuthentication, @l Boolean isAutoPublishOn, @l VerificationStatus verificationStatus, @l LiquidityStatus liquidityStatus, @l List<String> actions, @l String availableStocks, @l DeepLink editDeeplink, @l String fillParameters, @l String deliveryAlertText, @l String location, @l AddressesAdditionalInfo addressesAdditionalInfo, @l ContactsBbl contactsBbl, @l LinkedAdvertisementsInfo linkedAdvertisements, @l ActionButton actionButton, @l SearchPosition searchPosition, @l RightAction rightAction, @l Space space) {
        return new UserAdvert(id2, title, category, image, video, price, saleInfo, shortcut, time, stats, tip, servicesIcons, ttl, declineReason, reservationInfo, realtyLeadgen, isModerated, deepLink, hasDelivery, status, shortcutTitle, priceBadge, badge, fashionAuthentication, isAutoPublishOn, verificationStatus, liquidityStatus, actions, availableStocks, editDeeplink, fillParameters, deliveryAlertText, location, addressesAdditionalInfo, contactsBbl, linkedAdvertisements, actionButton, searchPosition, rightAction, space);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof UserAdvert)) {
            return false;
        }
        UserAdvert userAdvert = (UserAdvert) other;
        return L.f(this.id, userAdvert.id) && L.f(this.title, userAdvert.title) && L.f(this.category, userAdvert.category) && L.f(this.image, userAdvert.image) && L.f(this.video, userAdvert.video) && L.f(this.price, userAdvert.price) && L.f(this.saleInfo, userAdvert.saleInfo) && L.f(this.shortcut, userAdvert.shortcut) && this.time == userAdvert.time && L.f(this.stats, userAdvert.stats) && L.f(this.tip, userAdvert.tip) && L.f(this.servicesIcons, userAdvert.servicesIcons) && L.f(this.ttl, userAdvert.ttl) && L.f(this.declineReason, userAdvert.declineReason) && L.f(this.reservationInfo, userAdvert.reservationInfo) && L.f(this.realtyLeadgen, userAdvert.realtyLeadgen) && this.isModerated == userAdvert.isModerated && L.f(this.deepLink, userAdvert.deepLink) && L.f(this.hasDelivery, userAdvert.hasDelivery) && L.f(this.status, userAdvert.status) && L.f(this.shortcutTitle, userAdvert.shortcutTitle) && L.f(this.priceBadge, userAdvert.priceBadge) && L.f(this.badge, userAdvert.badge) && L.f(this.fashionAuthentication, userAdvert.fashionAuthentication) && L.f(this.isAutoPublishOn, userAdvert.isAutoPublishOn) && L.f(this.verificationStatus, userAdvert.verificationStatus) && L.f(this.liquidityStatus, userAdvert.liquidityStatus) && L.f(this.actions, userAdvert.actions) && L.f(this.availableStocks, userAdvert.availableStocks) && L.f(this.editDeeplink, userAdvert.editDeeplink) && L.f(this.fillParameters, userAdvert.fillParameters) && L.f(this.deliveryAlertText, userAdvert.deliveryAlertText) && L.f(this.location, userAdvert.location) && L.f(this.addressesAdditionalInfo, userAdvert.addressesAdditionalInfo) && L.f(this.contactsBbl, userAdvert.contactsBbl) && L.f(this.linkedAdvertisements, userAdvert.linkedAdvertisements) && L.f(this.actionButton, userAdvert.actionButton) && L.f(this.searchPosition, userAdvert.searchPosition) && L.f(this.rightAction, userAdvert.rightAction) && L.f(this.space, userAdvert.space);
    }

    @l
    public final ActionButton getActionButton() {
        return this.actionButton;
    }

    @l
    public final List<String> getActions() {
        return this.actions;
    }

    @l
    public final AddressesAdditionalInfo getAddressesAdditionalInfo() {
        return this.addressesAdditionalInfo;
    }

    @l
    public final String getAvailableStocks() {
        return this.availableStocks;
    }

    @l
    public final RealtyOwnerVerificationBadge getBadge() {
        return this.badge;
    }

    @l
    public final NameIdEntity getCategory() {
        return this.category;
    }

    @l
    public final ContactsBbl getContactsBbl() {
        return this.contactsBbl;
    }

    @l
    public final String getDeclineReason() {
        return this.declineReason;
    }

    @l
    public final DeepLink getDeepLink() {
        return this.deepLink;
    }

    @l
    public final String getDeliveryAlertText() {
        return this.deliveryAlertText;
    }

    @l
    public final DeepLink getEditDeeplink() {
        return this.editDeeplink;
    }

    @l
    public final FashionAuthentication getFashionAuthentication() {
        return this.fashionAuthentication;
    }

    @l
    public final String getFillParameters() {
        return this.fillParameters;
    }

    @l
    public final Boolean getHasDelivery() {
        return this.hasDelivery;
    }

    @k
    public final String getId() {
        return this.id;
    }

    @l
    public final AdvertImage getImage() {
        return this.image;
    }

    @l
    public final LinkedAdvertisementsInfo getLinkedAdvertisements() {
        return this.linkedAdvertisements;
    }

    @l
    public final LiquidityStatus getLiquidityStatus() {
        return this.liquidityStatus;
    }

    @l
    public final String getLocation() {
        return this.location;
    }

    @l
    public final String getPrice() {
        return this.price;
    }

    @l
    public final PriceBadge getPriceBadge() {
        return this.priceBadge;
    }

    @l
    public final RealtyLeadgen getRealtyLeadgen() {
        return this.realtyLeadgen;
    }

    @l
    public final String getReservationInfo() {
        return this.reservationInfo;
    }

    @l
    public final RightAction getRightAction() {
        return this.rightAction;
    }

    @l
    public final AttributedText getSaleInfo() {
        return this.saleInfo;
    }

    @l
    public final SearchPosition getSearchPosition() {
        return this.searchPosition;
    }

    @l
    public final List<Service> getServicesIcons() {
        return this.servicesIcons;
    }

    @l
    public final String getShortcut() {
        return this.shortcut;
    }

    @l
    public final String getShortcutTitle() {
        return this.shortcutTitle;
    }

    @l
    public final Space getSpace() {
        return this.space;
    }

    @l
    public final AdvertStats getStats() {
        return this.stats;
    }

    @l
    public final Status getStatus() {
        return this.status;
    }

    public final long getTime() {
        return this.time;
    }

    @l
    public final AdvertTips getTip() {
        return this.tip;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final TimeToLive getTtl() {
        return this.ttl;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public long getUniqueId() {
        return this.uniqueId;
    }

    @l
    public final VerificationStatus getVerificationStatus() {
        return this.verificationStatus;
    }

    @l
    public final Video getVideo() {
        return this.video;
    }

    public int hashCode() {
        int iD2 = H.d(this.id.hashCode() * 31, 31, this.title);
        NameIdEntity nameIdEntity = this.category;
        int iHashCode = (iD2 + (nameIdEntity == null ? 0 : nameIdEntity.hashCode())) * 31;
        AdvertImage advertImage = this.image;
        int iHashCode2 = (iHashCode + (advertImage == null ? 0 : advertImage.hashCode())) * 31;
        Video video = this.video;
        int iHashCode3 = (iHashCode2 + (video == null ? 0 : video.hashCode())) * 31;
        String str = this.price;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        AttributedText attributedText = this.saleInfo;
        int iHashCode5 = (iHashCode4 + (attributedText == null ? 0 : attributedText.hashCode())) * 31;
        String str2 = this.shortcut;
        int iG2 = r.g((iHashCode5 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.time);
        AdvertStats advertStats = this.stats;
        int iHashCode6 = (iG2 + (advertStats == null ? 0 : advertStats.hashCode())) * 31;
        AdvertTips advertTips = this.tip;
        int iHashCode7 = (iHashCode6 + (advertTips == null ? 0 : advertTips.hashCode())) * 31;
        List<Service> list = this.servicesIcons;
        int iHashCode8 = (iHashCode7 + (list == null ? 0 : list.hashCode())) * 31;
        TimeToLive timeToLive = this.ttl;
        int iHashCode9 = (iHashCode8 + (timeToLive == null ? 0 : timeToLive.hashCode())) * 31;
        String str3 = this.declineReason;
        int iHashCode10 = (iHashCode9 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.reservationInfo;
        int iHashCode11 = (iHashCode10 + (str4 == null ? 0 : str4.hashCode())) * 31;
        RealtyLeadgen realtyLeadgen = this.realtyLeadgen;
        int i12 = r.i((iHashCode11 + (realtyLeadgen == null ? 0 : realtyLeadgen.hashCode())) * 31, 31, this.isModerated);
        DeepLink deepLink = this.deepLink;
        int iHashCode12 = (i12 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Boolean bool = this.hasDelivery;
        int iHashCode13 = (iHashCode12 + (bool == null ? 0 : bool.hashCode())) * 31;
        Status status = this.status;
        int iHashCode14 = (iHashCode13 + (status == null ? 0 : status.hashCode())) * 31;
        String str5 = this.shortcutTitle;
        int iHashCode15 = (iHashCode14 + (str5 == null ? 0 : str5.hashCode())) * 31;
        PriceBadge priceBadge = this.priceBadge;
        int iHashCode16 = (iHashCode15 + (priceBadge == null ? 0 : priceBadge.hashCode())) * 31;
        RealtyOwnerVerificationBadge realtyOwnerVerificationBadge = this.badge;
        int iHashCode17 = (iHashCode16 + (realtyOwnerVerificationBadge == null ? 0 : realtyOwnerVerificationBadge.hashCode())) * 31;
        FashionAuthentication fashionAuthentication = this.fashionAuthentication;
        int iHashCode18 = (iHashCode17 + (fashionAuthentication == null ? 0 : fashionAuthentication.hashCode())) * 31;
        Boolean bool2 = this.isAutoPublishOn;
        int iHashCode19 = (iHashCode18 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        VerificationStatus verificationStatus = this.verificationStatus;
        int iHashCode20 = (iHashCode19 + (verificationStatus == null ? 0 : verificationStatus.hashCode())) * 31;
        LiquidityStatus liquidityStatus = this.liquidityStatus;
        int iHashCode21 = (iHashCode20 + (liquidityStatus == null ? 0 : liquidityStatus.hashCode())) * 31;
        List<String> list2 = this.actions;
        int iHashCode22 = (iHashCode21 + (list2 == null ? 0 : list2.hashCode())) * 31;
        String str6 = this.availableStocks;
        int iHashCode23 = (iHashCode22 + (str6 == null ? 0 : str6.hashCode())) * 31;
        DeepLink deepLink2 = this.editDeeplink;
        int iHashCode24 = (iHashCode23 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        String str7 = this.fillParameters;
        int iHashCode25 = (iHashCode24 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.deliveryAlertText;
        int iHashCode26 = (iHashCode25 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.location;
        int iHashCode27 = (iHashCode26 + (str9 == null ? 0 : str9.hashCode())) * 31;
        AddressesAdditionalInfo addressesAdditionalInfo = this.addressesAdditionalInfo;
        int iHashCode28 = (iHashCode27 + (addressesAdditionalInfo == null ? 0 : addressesAdditionalInfo.hashCode())) * 31;
        ContactsBbl contactsBbl = this.contactsBbl;
        int iHashCode29 = (iHashCode28 + (contactsBbl == null ? 0 : contactsBbl.hashCode())) * 31;
        LinkedAdvertisementsInfo linkedAdvertisementsInfo = this.linkedAdvertisements;
        int iHashCode30 = (iHashCode29 + (linkedAdvertisementsInfo == null ? 0 : linkedAdvertisementsInfo.hashCode())) * 31;
        ActionButton actionButton = this.actionButton;
        int iHashCode31 = (iHashCode30 + (actionButton == null ? 0 : actionButton.hashCode())) * 31;
        SearchPosition searchPosition = this.searchPosition;
        int iHashCode32 = (iHashCode31 + (searchPosition == null ? 0 : searchPosition.hashCode())) * 31;
        RightAction rightAction = this.rightAction;
        int iHashCode33 = (iHashCode32 + (rightAction == null ? 0 : rightAction.hashCode())) * 31;
        Space space = this.space;
        return iHashCode33 + (space != null ? space.hashCode() : 0);
    }

    @l
    public final Boolean isAutoPublishOn() {
        return this.isAutoPublishOn;
    }

    public final boolean isModerated() {
        return this.isModerated;
    }

    @Override // com.avito.android.remote.model.SerpElement
    public void setUniqueId(long j12) {
        this.uniqueId = j12;
    }

    @k
    public String toString() {
        return "UserAdvert(id=" + this.id + ", title=" + this.title + ", category=" + this.category + ", image=" + this.image + ", video=" + this.video + ", price=" + this.price + ", saleInfo=" + this.saleInfo + ", shortcut=" + this.shortcut + ", time=" + this.time + ", stats=" + this.stats + ", tip=" + this.tip + ", servicesIcons=" + this.servicesIcons + ", ttl=" + this.ttl + ", declineReason=" + this.declineReason + ", reservationInfo=" + this.reservationInfo + ", realtyLeadgen=" + this.realtyLeadgen + ", isModerated=" + this.isModerated + ", deepLink=" + this.deepLink + ", hasDelivery=" + this.hasDelivery + ", status=" + this.status + ", shortcutTitle=" + this.shortcutTitle + ", priceBadge=" + this.priceBadge + ", badge=" + this.badge + ", fashionAuthentication=" + this.fashionAuthentication + ", isAutoPublishOn=" + this.isAutoPublishOn + ", verificationStatus=" + this.verificationStatus + ", liquidityStatus=" + this.liquidityStatus + ", actions=" + this.actions + ", availableStocks=" + this.availableStocks + ", editDeeplink=" + this.editDeeplink + ", fillParameters=" + this.fillParameters + ", deliveryAlertText=" + this.deliveryAlertText + ", location=" + this.location + ", addressesAdditionalInfo=" + this.addressesAdditionalInfo + ", contactsBbl=" + this.contactsBbl + ", linkedAdvertisements=" + this.linkedAdvertisements + ", actionButton=" + this.actionButton + ", searchPosition=" + this.searchPosition + ", rightAction=" + this.rightAction + ", space=" + this.space + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeString(this.id);
        parcel.writeString(this.title);
        NameIdEntity nameIdEntity = this.category;
        if (nameIdEntity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            nameIdEntity.writeToParcel(parcel, flags);
        }
        AdvertImage advertImage = this.image;
        if (advertImage == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertImage.writeToParcel(parcel, flags);
        }
        Video video = this.video;
        if (video == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            video.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.price);
        parcel.writeParcelable(this.saleInfo, flags);
        parcel.writeString(this.shortcut);
        parcel.writeLong(this.time);
        AdvertStats advertStats = this.stats;
        if (advertStats == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertStats.writeToParcel(parcel, flags);
        }
        AdvertTips advertTips = this.tip;
        if (advertTips == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            advertTips.writeToParcel(parcel, flags);
        }
        List<Service> list = this.servicesIcons;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                ((Service) itA.next()).writeToParcel(parcel, flags);
            }
        }
        TimeToLive timeToLive = this.ttl;
        if (timeToLive == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            timeToLive.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.declineReason);
        parcel.writeString(this.reservationInfo);
        RealtyLeadgen realtyLeadgen = this.realtyLeadgen;
        if (realtyLeadgen == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realtyLeadgen.writeToParcel(parcel, flags);
        }
        parcel.writeInt(this.isModerated ? 1 : 0);
        parcel.writeParcelable(this.deepLink, flags);
        Boolean bool = this.hasDelivery;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Status status = this.status;
        if (status == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            status.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.shortcutTitle);
        PriceBadge priceBadge = this.priceBadge;
        if (priceBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            priceBadge.writeToParcel(parcel, flags);
        }
        RealtyOwnerVerificationBadge realtyOwnerVerificationBadge = this.badge;
        if (realtyOwnerVerificationBadge == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            realtyOwnerVerificationBadge.writeToParcel(parcel, flags);
        }
        FashionAuthentication fashionAuthentication = this.fashionAuthentication;
        if (fashionAuthentication == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            fashionAuthentication.writeToParcel(parcel, flags);
        }
        Boolean bool2 = this.isAutoPublishOn;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        VerificationStatus verificationStatus = this.verificationStatus;
        if (verificationStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            verificationStatus.writeToParcel(parcel, flags);
        }
        LiquidityStatus liquidityStatus = this.liquidityStatus;
        if (liquidityStatus == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            liquidityStatus.writeToParcel(parcel, flags);
        }
        parcel.writeStringList(this.actions);
        parcel.writeString(this.availableStocks);
        parcel.writeParcelable(this.editDeeplink, flags);
        parcel.writeString(this.fillParameters);
        parcel.writeString(this.deliveryAlertText);
        parcel.writeString(this.location);
        AddressesAdditionalInfo addressesAdditionalInfo = this.addressesAdditionalInfo;
        if (addressesAdditionalInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            addressesAdditionalInfo.writeToParcel(parcel, flags);
        }
        ContactsBbl contactsBbl = this.contactsBbl;
        if (contactsBbl == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            contactsBbl.writeToParcel(parcel, flags);
        }
        LinkedAdvertisementsInfo linkedAdvertisementsInfo = this.linkedAdvertisements;
        if (linkedAdvertisementsInfo == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            linkedAdvertisementsInfo.writeToParcel(parcel, flags);
        }
        ActionButton actionButton = this.actionButton;
        if (actionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            actionButton.writeToParcel(parcel, flags);
        }
        SearchPosition searchPosition = this.searchPosition;
        if (searchPosition == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            searchPosition.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.rightAction, flags);
        Space space = this.space;
        if (space == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            space.writeToParcel(parcel, flags);
        }
    }

    /* compiled from: UserAdvert.kt */
    @d
    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001BK\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ \u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001c\u0010\u001bR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u0019\u001a\u0004\b\u001e\u0010\u001bR\u001c\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010\u0019\u001a\u0004\b\u001f\u0010\u001bR\u001c\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\n\u0010\u0016\u001a\u0004\b \u0010\u0018R\u0017\u0010&\u001a\u00020!8F¢\u0006\f\u0012\u0004\b$\u0010%\u001a\u0004\b\"\u0010#R\u0019\u0010)\u001a\u0004\u0018\u00010!8F¢\u0006\f\u0012\u0004\b(\u0010%\u001a\u0004\b'\u0010#¨\u0006*"}, d2 = {"Lcom/avito/android/remote/model/UserAdvert$PriceBadge;", "Landroid/os/Parcelable;", "", "title", "Lcom/avito/android/remote/model/Color;", "titleColor", "titleColorDark", "titleColorName", "backgroundColor", "backgroundColorDark", "backgroundColorName", "<init>", "(Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Ljava/lang/String;Lcom/avito/android/remote/model/Color;Lcom/avito/android/remote/model/Color;Ljava/lang/String;)V", "", "describeContents", "()I", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "Ljava/lang/String;", "getTitle", "()Ljava/lang/String;", "Lcom/avito/android/remote/model/Color;", "getTitleColor", "()Lcom/avito/android/remote/model/Color;", "getTitleColorDark", "getTitleColorName", "getBackgroundColor", "getBackgroundColorDark", "getBackgroundColorName", "Lcom/avito/android/remote/model/UniversalColor;", "getUniversalTitleColor", "()Lcom/avito/android/remote/model/UniversalColor;", "getUniversalTitleColor$annotations", "()V", "universalTitleColor", "getUniversalBackgroundColor", "getUniversalBackgroundColor$annotations", "universalBackgroundColor", "_avito-discouraged_api-models_models"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class PriceBadge implements Parcelable {

        @k
        public static final Parcelable.Creator<PriceBadge> CREATOR = new Creator();

        @c("backgroundColor")
        @l
        private final Color backgroundColor;

        @c("backgroundColorDark")
        @l
        private final Color backgroundColorDark;

        @c("backgroundColorName")
        @l
        private final String backgroundColorName;

        @c("title")
        @k
        private final String title;

        @c("titleColor")
        @l
        private final Color titleColor;

        @c("titleColorDark")
        @l
        private final Color titleColorDark;

        @c("titleColorName")
        @l
        private final String titleColorName;

        /* compiled from: UserAdvert.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class Creator implements Parcelable.Creator<PriceBadge> {
            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PriceBadge createFromParcel(@k Parcel parcel) {
                return new PriceBadge(parcel.readString(), (Color) parcel.readParcelable(PriceBadge.class.getClassLoader()), (Color) parcel.readParcelable(PriceBadge.class.getClassLoader()), parcel.readString(), (Color) parcel.readParcelable(PriceBadge.class.getClassLoader()), (Color) parcel.readParcelable(PriceBadge.class.getClassLoader()), parcel.readString());
            }

            /* JADX WARN: Can't rename method to resolve collision */
            @Override // android.os.Parcelable.Creator
            @k
            public final PriceBadge[] newArray(int i12) {
                return new PriceBadge[i12];
            }
        }

        public PriceBadge(@k String str, @l Color color, @l Color color2, @l String str2, @l Color color3, @l Color color4, @l String str3) {
            this.title = str;
            this.titleColor = color;
            this.titleColorDark = color2;
            this.titleColorName = str2;
            this.backgroundColor = color3;
            this.backgroundColorDark = color4;
            this.backgroundColorName = str3;
        }

        @Override // android.os.Parcelable
        public int describeContents() {
            return 0;
        }

        @l
        public final Color getBackgroundColor() {
            return this.backgroundColor;
        }

        @l
        public final Color getBackgroundColorDark() {
            return this.backgroundColorDark;
        }

        @l
        public final String getBackgroundColorName() {
            return this.backgroundColorName;
        }

        @k
        public final String getTitle() {
            return this.title;
        }

        @l
        public final Color getTitleColor() {
            return this.titleColor;
        }

        @l
        public final Color getTitleColorDark() {
            return this.titleColorDark;
        }

        @l
        public final String getTitleColorName() {
            return this.titleColorName;
        }

        @l
        public final UniversalColor getUniversalBackgroundColor() {
            Color color = this.backgroundColor;
            if (color == null && this.backgroundColorName == null) {
                return null;
            }
            return UniversalColorKt.universalColorOf(this.backgroundColorName, color, this.backgroundColorDark);
        }

        @k
        public final UniversalColor getUniversalTitleColor() {
            return UniversalColorKt.universalColorOf(this.titleColorName, this.titleColor, this.titleColorDark);
        }

        @Override // android.os.Parcelable
        public void writeToParcel(@k Parcel parcel, int flags) {
            parcel.writeString(this.title);
            parcel.writeParcelable(this.titleColor, flags);
            parcel.writeParcelable(this.titleColorDark, flags);
            parcel.writeString(this.titleColorName);
            parcel.writeParcelable(this.backgroundColor, flags);
            parcel.writeParcelable(this.backgroundColorDark, flags);
            parcel.writeString(this.backgroundColorName);
        }

        public static /* synthetic */ void getUniversalBackgroundColor$annotations() {
        }

        public static /* synthetic */ void getUniversalTitleColor$annotations() {
        }
    }

    public /* synthetic */ UserAdvert(String str, String str2, NameIdEntity nameIdEntity, AdvertImage advertImage, Video video, String str3, AttributedText attributedText, String str4, long j12, AdvertStats advertStats, AdvertTips advertTips, List list, TimeToLive timeToLive, String str5, String str6, RealtyLeadgen realtyLeadgen, boolean z12, DeepLink deepLink, Boolean bool, Status status, String str7, PriceBadge priceBadge, RealtyOwnerVerificationBadge realtyOwnerVerificationBadge, FashionAuthentication fashionAuthentication, Boolean bool2, VerificationStatus verificationStatus, LiquidityStatus liquidityStatus, List list2, String str8, DeepLink deepLink2, String str9, String str10, String str11, AddressesAdditionalInfo addressesAdditionalInfo, ContactsBbl contactsBbl, LinkedAdvertisementsInfo linkedAdvertisementsInfo, ActionButton actionButton, SearchPosition searchPosition, RightAction rightAction, Space space, int i12, int i13, C42822w c42822w) {
        this(str, str2, nameIdEntity, advertImage, video, str3, attributedText, str4, j12, advertStats, advertTips, list, timeToLive, str5, str6, realtyLeadgen, z12, deepLink, bool, status, str7, priceBadge, realtyOwnerVerificationBadge, fashionAuthentication, bool2, verificationStatus, liquidityStatus, list2, str8, deepLink2, str9, str10, (i13 & 1) != 0 ? null : str11, (i13 & 2) != 0 ? null : addressesAdditionalInfo, (i13 & 4) != 0 ? null : contactsBbl, (i13 & 8) != 0 ? null : linkedAdvertisementsInfo, (i13 & 16) != 0 ? null : actionButton, (i13 & 32) != 0 ? null : searchPosition, (i13 & 64) != 0 ? null : rightAction, (i13 & 128) != 0 ? null : space);
    }
}
