package com.avito.android.remote.model;

import K51.d;
import Y61.k;
import Y61.l;
import android.os.Parcel;
import android.os.Parcelable;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import com.adjust.sdk.Constants;
import com.akita.compose.theme.re23.style.C0;
import com.avito.android.actions_sheet.a;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.cart_snippet_actions.models.api.CartSnippetActionsStepper;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.autotekateaser.AutotekaLink;
import com.avito.android.remote.model.autotekateaser.AutotekaPurchaseAction;
import com.avito.android.remote.model.badge_bar.SerpBadgeBar;
import com.avito.android.remote.model.category_parameters.AddressParameter;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.favorite_contacts.Contacts;
import com.avito.android.remote.model.notifications_settings.NotificationsSettings;
import com.avito.android.remote.model.sales.utils.BadgeSticker;
import com.avito.android.remote.model.snippet_type.SnippetType;
import com.avito.android.remote.model.text.TooltipAttribute;
import com.google.gson.annotations.c;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: FavoritesResult.kt */
@d
@Metadata(d1 = {"\u0000Ê\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\bD\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b=\b\u0087\b\u0018\u00002\u00020\u00012\u00020\u0002B÷\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f\u0012\u0006\u0010\u000f\u001a\u00020\u000e\u0012\u0006\u0010\u0010\u001a\u00020\f\u0012\u0006\u0010\u0011\u001a\u00020\f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013\u0012\b\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u001a\u001a\u00020\u0019\u0012\b\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\b\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\b\u0010 \u001a\u0004\u0018\u00010\u001f\u0012\b\u0010\"\u001a\u0004\u0018\u00010!\u0012\b\u0010$\u001a\u0004\u0018\u00010#\u0012\b\u0010&\u001a\u0004\u0018\u00010%\u0012\b\u0010(\u001a\u0004\u0018\u00010'\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+\u0012\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-\u0012\n\b\u0002\u00100\u001a\u0004\u0018\u00010/\u0012\n\b\u0002\u00102\u001a\u0004\u0018\u000101\u0012\n\b\u0002\u00104\u001a\u0004\u0018\u000103\u0012\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u0005\u0012\u0016\b\u0002\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u000107\u0012\n\b\u0002\u0010:\u001a\u0004\u0018\u000109\u0012\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<\u0012\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b?\u0010@J\u0010\u0010A\u001a\u00020\u0003HÆ\u0003¢\u0006\u0004\bA\u0010BJ\u0010\u0010C\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\bC\u0010DJ\u0010\u0010E\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\bE\u0010FJ\u0012\u0010G\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bG\u0010DJ\u0010\u0010H\u001a\u00020\nHÆ\u0003¢\u0006\u0004\bH\u0010IJ\u0010\u0010J\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bJ\u0010KJ\u0010\u0010L\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0010\u0010N\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bN\u0010KJ\u0010\u0010O\u001a\u00020\fHÆ\u0003¢\u0006\u0004\bO\u0010KJ\u0012\u0010P\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0004\bP\u0010QJ\u0018\u0010R\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\bR\u0010SJ\u0012\u0010T\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bV\u0010DJ\u0010\u0010W\u001a\u00020\u0019HÆ\u0003¢\u0006\u0004\bW\u0010XJ\u0012\u0010Y\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bY\u0010ZJ\u0012\u0010[\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\b[\u0010\\J\u0012\u0010]\u001a\u0004\u0018\u00010\u001fHÆ\u0003¢\u0006\u0004\b]\u0010^J\u0012\u0010_\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\b_\u0010`J\u0012\u0010a\u001a\u0004\u0018\u00010#HÆ\u0003¢\u0006\u0004\ba\u0010bJ\u0012\u0010c\u001a\u0004\u0018\u00010%HÆ\u0003¢\u0006\u0004\bc\u0010dJ\u0012\u0010e\u001a\u0004\u0018\u00010'HÆ\u0003¢\u0006\u0004\be\u0010fJ\u0012\u0010g\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bg\u0010hJ\u0012\u0010i\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bi\u0010jJ\u0012\u0010k\u001a\u0004\u0018\u00010-HÆ\u0003¢\u0006\u0004\bk\u0010lJ\u0012\u0010m\u001a\u0004\u0018\u00010/HÆ\u0003¢\u0006\u0004\bm\u0010nJ\u0012\u0010o\u001a\u0004\u0018\u000101HÆ\u0003¢\u0006\u0004\bo\u0010pJ\u0012\u0010q\u001a\u0004\u0018\u000103HÆ\u0003¢\u0006\u0004\bq\u0010rJ\u0012\u0010s\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bs\u0010DJ\u0012\u0010t\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\bt\u0010DJ\u001e\u0010u\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u000107HÆ\u0003¢\u0006\u0004\bu\u0010vJ\u0012\u0010w\u001a\u0004\u0018\u000109HÆ\u0003¢\u0006\u0004\bw\u0010xJ\u0012\u0010y\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\by\u0010DJ\u0012\u0010z\u001a\u0004\u0018\u00010<HÆ\u0003¢\u0006\u0004\bz\u0010{J\u0012\u0010|\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b|\u0010DJ¨\u0003\u0010}\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\f2\b\b\u0002\u0010\u0011\u001a\u00020\f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00132\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u001a\u001a\u00020\u00192\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\n\b\u0002\u0010 \u001a\u0004\u0018\u00010\u001f2\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010$\u001a\u0004\u0018\u00010#2\n\b\u0002\u0010&\u001a\u0004\u0018\u00010%2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010'2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+2\n\b\u0002\u0010.\u001a\u0004\u0018\u00010-2\n\b\u0002\u00100\u001a\u0004\u0018\u00010/2\n\b\u0002\u00102\u001a\u0004\u0018\u0001012\n\b\u0002\u00104\u001a\u0004\u0018\u0001032\n\b\u0002\u00105\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u00106\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001072\n\b\u0002\u0010:\u001a\u0004\u0018\u0001092\n\b\u0002\u0010;\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010=\u001a\u0004\u0018\u00010<2\n\b\u0002\u0010>\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0004\b}\u0010~J\u0010\u0010\u007f\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u007f\u0010DJ\u0012\u0010\u0080\u0001\u001a\u00020\nHÖ\u0001¢\u0006\u0005\b\u0080\u0001\u0010IJ\u001f\u0010\u0083\u0001\u001a\u00020\f2\n\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u0001HÖ\u0003¢\u0006\u0006\b\u0083\u0001\u0010\u0084\u0001J\u0012\u0010\u0085\u0001\u001a\u00020\nHÖ\u0001¢\u0006\u0005\b\u0085\u0001\u0010IJ'\u0010\u008a\u0001\u001a\u00030\u0089\u00012\b\u0010\u0087\u0001\u001a\u00030\u0086\u00012\u0007\u0010\u0088\u0001\u001a\u00020\nHÖ\u0001¢\u0006\u0006\b\u008a\u0001\u0010\u008b\u0001R\u001c\u0010\u0004\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0004\u0010\u008c\u0001\u001a\u0005\b\u008d\u0001\u0010BR\u001c\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0006\u0010\u008e\u0001\u001a\u0005\b\u008f\u0001\u0010DR\u001c\u0010\b\u001a\u00020\u00078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\b\u0010\u0090\u0001\u001a\u0005\b\u0091\u0001\u0010FR\u001e\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\t\u0010\u008e\u0001\u001a\u0005\b\u0092\u0001\u0010DR\u001c\u0010\u000b\u001a\u00020\n8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000b\u0010\u0093\u0001\u001a\u0005\b\u0094\u0001\u0010IR\u001c\u0010\r\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\r\u0010\u0095\u0001\u001a\u0005\b\u0096\u0001\u0010KR\u001c\u0010\u000f\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u000f\u0010\u0097\u0001\u001a\u0005\b\u0098\u0001\u0010MR\u001b\u0010\u0010\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0010\u0010\u0095\u0001\u001a\u0004\b\u0010\u0010KR\u001b\u0010\u0011\u001a\u00020\f8\u0006X\u0087\u0004¢\u0006\r\n\u0005\b\u0011\u0010\u0095\u0001\u001a\u0004\b\u0011\u0010KR\u001e\u0010\u0012\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0012\u0010\u0099\u0001\u001a\u0005\b\u009a\u0001\u0010QR$\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0015\u0010\u009b\u0001\u001a\u0005\b\u009c\u0001\u0010SR\u001e\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0017\u0010\u009d\u0001\u001a\u0005\b\u009e\u0001\u0010UR\u001e\u0010\u0018\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u0018\u0010\u008e\u0001\u001a\u0005\b\u009f\u0001\u0010DR\u001c\u0010\u001a\u001a\u00020\u00198\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001a\u0010 \u0001\u001a\u0005\b¡\u0001\u0010XR\u001e\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001c\u0010¢\u0001\u001a\u0005\b£\u0001\u0010ZR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010¤\u0001\u001a\u0005\b¥\u0001\u0010\\R\u001e\u0010 \u001a\u0004\u0018\u00010\u001f8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b \u0010¦\u0001\u001a\u0005\b§\u0001\u0010^R\u001e\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010¨\u0001\u001a\u0005\b©\u0001\u0010`R\u001e\u0010$\u001a\u0004\u0018\u00010#8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b$\u0010ª\u0001\u001a\u0005\b«\u0001\u0010bR\u001e\u0010&\u001a\u0004\u0018\u00010%8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b&\u0010¬\u0001\u001a\u0005\b\u00ad\u0001\u0010dR\u001e\u0010(\u001a\u0004\u0018\u00010'8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b(\u0010®\u0001\u001a\u0005\b¯\u0001\u0010fR\u001e\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010°\u0001\u001a\u0005\b±\u0001\u0010hR\u001e\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010²\u0001\u001a\u0005\b³\u0001\u0010jR\u001e\u0010.\u001a\u0004\u0018\u00010-8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b.\u0010´\u0001\u001a\u0005\bµ\u0001\u0010lR\u001e\u00100\u001a\u0004\u0018\u00010/8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b0\u0010¶\u0001\u001a\u0005\b·\u0001\u0010nR\u001e\u00102\u001a\u0004\u0018\u0001018\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b2\u0010¸\u0001\u001a\u0005\b¹\u0001\u0010pR\u001e\u00104\u001a\u0004\u0018\u0001038\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b4\u0010º\u0001\u001a\u0005\b»\u0001\u0010rR\u001e\u00105\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b5\u0010\u008e\u0001\u001a\u0005\b¼\u0001\u0010DR\u001e\u00106\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b6\u0010\u008e\u0001\u001a\u0005\b½\u0001\u0010DR*\u00108\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u0001078\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b8\u0010¾\u0001\u001a\u0005\b¿\u0001\u0010vR\u001e\u0010:\u001a\u0004\u0018\u0001098\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b:\u0010À\u0001\u001a\u0005\bÁ\u0001\u0010xR\u001e\u0010;\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b;\u0010\u008e\u0001\u001a\u0005\bÂ\u0001\u0010DR\u001e\u0010=\u001a\u0004\u0018\u00010<8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b=\u0010Ã\u0001\u001a\u0005\bÄ\u0001\u0010{R\u001e\u0010>\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b>\u0010\u008e\u0001\u001a\u0005\bÅ\u0001\u0010D¨\u0006Æ\u0001"}, d2 = {"Lcom/avito/android/remote/model/FavoriteAdvertV1;", "Landroid/os/Parcelable;", "Lcom/avito/android/remote/model/FavoriteElement;", "", "id", "", "title", "Lcom/avito/android/deep_linking/links/DeepLink;", Constants.DEEPLINK, AddressParameter.TYPE, "", "categoryId", "", "hasDelivery", "Lcom/avito/android/remote/model/AdvertImage;", "images", "isActive", "isFavorite", "timestamp", "", "Lcom/avito/android/remote/model/GeoReference;", "geoReferences", "Lcom/avito/android/remote/model/FavoriteAdvertPrice;", "price", "note", "Lcom/avito/android/remote/model/Contacting;", "contacting", "Lcom/avito/android/remote/model/DeliveryAction;", NotificationsSettings.Section.SECTION_DELIVERY, "Lcom/avito/android/remote/model/StocksQuantity;", "stocksQuantity", "Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "cartButton", "Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "badgeSticker", "Lcom/avito/android/remote/model/BuyWithDeliveryInFavorites;", "buyWithDelivery", "Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;", "autotekaPurchaseAction", "Lcom/avito/android/remote/model/autotekateaser/AutotekaLink;", "autotekaLink", "Lcom/avito/android/remote/model/FavoriteAdvertActionButton;", "actionButton", "Lcom/avito/android/remote/model/RelatedProducts;", "relatedProducts", "Lcom/avito/android/remote/model/favorite_contacts/Contacts;", "contacts", "Lcom/avito/android/remote/model/KeyAttributes;", "keyAttributes", "Lcom/avito/android/remote/model/snippet_type/SnippetType;", "snippetType", "Lcom/avito/android/remote/model/AdvertSellerInfo;", "sellerInfo", "location", "distance", "", "analyticParams", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "xHash", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR, "jobAggregationDisclaimer", "<init>", "(JLjava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;IZLcom/avito/android/remote/model/AdvertImage;ZZLjava/lang/Long;Ljava/util/List;Lcom/avito/android/remote/model/FavoriteAdvertPrice;Ljava/lang/String;Lcom/avito/android/remote/model/Contacting;Lcom/avito/android/remote/model/DeliveryAction;Lcom/avito/android/remote/model/StocksQuantity;Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;Lcom/avito/android/remote/model/sales/utils/BadgeSticker;Lcom/avito/android/remote/model/BuyWithDeliveryInFavorites;Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;Lcom/avito/android/remote/model/autotekateaser/AutotekaLink;Lcom/avito/android/remote/model/FavoriteAdvertActionButton;Lcom/avito/android/remote/model/RelatedProducts;Lcom/avito/android/remote/model/favorite_contacts/Contacts;Lcom/avito/android/remote/model/KeyAttributes;Lcom/avito/android/remote/model/snippet_type/SnippetType;Lcom/avito/android/remote/model/AdvertSellerInfo;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/remote/model/SerpDisplayType;Ljava/lang/String;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Ljava/lang/String;)V", "component1", "()J", "component2", "()Ljava/lang/String;", "component3", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component4", "component5", "()I", "component6", "()Z", "component7", "()Lcom/avito/android/remote/model/AdvertImage;", "component8", "component9", "component10", "()Ljava/lang/Long;", "component11", "()Ljava/util/List;", "component12", "()Lcom/avito/android/remote/model/FavoriteAdvertPrice;", "component13", "component14", "()Lcom/avito/android/remote/model/Contacting;", "component15", "()Lcom/avito/android/remote/model/DeliveryAction;", "component16", "()Lcom/avito/android/remote/model/StocksQuantity;", "component17", "()Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "component18", "()Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "component19", "()Lcom/avito/android/remote/model/BuyWithDeliveryInFavorites;", "component20", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;", "component21", "()Lcom/avito/android/remote/model/autotekateaser/AutotekaLink;", "component22", "()Lcom/avito/android/remote/model/FavoriteAdvertActionButton;", "component23", "()Lcom/avito/android/remote/model/RelatedProducts;", "component24", "()Lcom/avito/android/remote/model/favorite_contacts/Contacts;", "component25", "()Lcom/avito/android/remote/model/KeyAttributes;", "component26", "()Lcom/avito/android/remote/model/snippet_type/SnippetType;", "component27", "()Lcom/avito/android/remote/model/AdvertSellerInfo;", "component28", "component29", "component30", "()Ljava/util/Map;", "component31", "()Lcom/avito/android/remote/model/SerpDisplayType;", "component32", "component33", "()Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "component34", "copy", "(JLjava/lang/String;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/String;IZLcom/avito/android/remote/model/AdvertImage;ZZLjava/lang/Long;Ljava/util/List;Lcom/avito/android/remote/model/FavoriteAdvertPrice;Ljava/lang/String;Lcom/avito/android/remote/model/Contacting;Lcom/avito/android/remote/model/DeliveryAction;Lcom/avito/android/remote/model/StocksQuantity;Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;Lcom/avito/android/remote/model/sales/utils/BadgeSticker;Lcom/avito/android/remote/model/BuyWithDeliveryInFavorites;Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;Lcom/avito/android/remote/model/autotekateaser/AutotekaLink;Lcom/avito/android/remote/model/FavoriteAdvertActionButton;Lcom/avito/android/remote/model/RelatedProducts;Lcom/avito/android/remote/model/favorite_contacts/Contacts;Lcom/avito/android/remote/model/KeyAttributes;Lcom/avito/android/remote/model/snippet_type/SnippetType;Lcom/avito/android/remote/model/AdvertSellerInfo;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Lcom/avito/android/remote/model/SerpDisplayType;Ljava/lang/String;Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;Ljava/lang/String;)Lcom/avito/android/remote/model/FavoriteAdvertV1;", "toString", "hashCode", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "J", "getId", "Ljava/lang/String;", "getTitle", "Lcom/avito/android/deep_linking/links/DeepLink;", "getDeeplink", "getAddress", "I", "getCategoryId", "Z", "getHasDelivery", "Lcom/avito/android/remote/model/AdvertImage;", "getImages", "Ljava/lang/Long;", "getTimestamp", "Ljava/util/List;", "getGeoReferences", "Lcom/avito/android/remote/model/FavoriteAdvertPrice;", "getPrice", "getNote", "Lcom/avito/android/remote/model/Contacting;", "getContacting", "Lcom/avito/android/remote/model/DeliveryAction;", "getDelivery", "Lcom/avito/android/remote/model/StocksQuantity;", "getStocksQuantity", "Lcom/avito/android/cart_snippet_actions/models/api/CartSnippetActionsStepper;", "getCartButton", "Lcom/avito/android/remote/model/sales/utils/BadgeSticker;", "getBadgeSticker", "Lcom/avito/android/remote/model/BuyWithDeliveryInFavorites;", "getBuyWithDelivery", "Lcom/avito/android/remote/model/autotekateaser/AutotekaPurchaseAction;", "getAutotekaPurchaseAction", "Lcom/avito/android/remote/model/autotekateaser/AutotekaLink;", "getAutotekaLink", "Lcom/avito/android/remote/model/FavoriteAdvertActionButton;", "getActionButton", "Lcom/avito/android/remote/model/RelatedProducts;", "getRelatedProducts", "Lcom/avito/android/remote/model/favorite_contacts/Contacts;", "getContacts", "Lcom/avito/android/remote/model/KeyAttributes;", "getKeyAttributes", "Lcom/avito/android/remote/model/snippet_type/SnippetType;", "getSnippetType", "Lcom/avito/android/remote/model/AdvertSellerInfo;", "getSellerInfo", "getLocation", "getDistance", "Ljava/util/Map;", "getAnalyticParams", "Lcom/avito/android/remote/model/SerpDisplayType;", "getDisplayType", "getXHash", "Lcom/avito/android/remote/model/badge_bar/SerpBadgeBar;", "getBadgeBar", "getJobAggregationDisclaimer", "_avito-discouraged_avito-api_favorite"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class FavoriteAdvertV1 implements Parcelable, FavoriteElement {

    @k
    public static final Parcelable.Creator<FavoriteAdvertV1> CREATOR = new Creator();

    @c("actionButton")
    @l
    private final FavoriteAdvertActionButton actionButton;

    @c(AddressParameter.TYPE)
    @l
    private final String address;

    @c("analyticParams")
    @l
    private final Map<String, String> analyticParams;

    @c("autotekaLink")
    @l
    private final AutotekaLink autotekaLink;

    @c("autotekaPurchaseAction")
    @l
    private final AutotekaPurchaseAction autotekaPurchaseAction;

    @c(AdvertDetailsBlockIdKt.BLOCK_ID_BADGE_BAR)
    @l
    private final SerpBadgeBar badgeBar;

    @c("badgeSticker")
    @l
    private final BadgeSticker badgeSticker;

    @c("buyButton")
    @l
    private final BuyWithDeliveryInFavorites buyWithDelivery;

    @c("cartButton")
    @l
    private final CartSnippetActionsStepper cartButton;

    @c("categoryId")
    private final int categoryId;

    @c("contacting")
    @k
    private final Contacting contacting;

    @c("contacts")
    @l
    private final Contacts contacts;

    @c(TooltipAttribute.PARAM_DEEP_LINK)
    @k
    private final DeepLink deeplink;

    @c(NotificationsSettings.Section.SECTION_DELIVERY)
    @l
    private final DeliveryAction delivery;

    @c("displayType")
    @l
    private final SerpDisplayType displayType;

    @c("distance")
    @l
    private final String distance;

    @c("geoReferences")
    @l
    private final List<GeoReference> geoReferences;

    @c("hasDelivery")
    private final boolean hasDelivery;

    @c("id")
    private final long id;

    @c("images")
    @k
    private final AdvertImage images;

    @c("isActive")
    private final boolean isActive;

    @c("isFavorite")
    private final boolean isFavorite;

    @c("jobAggregationDisclaimer")
    @l
    private final String jobAggregationDisclaimer;

    @c("keyAttributes")
    @l
    private final KeyAttributes keyAttributes;

    @c("location")
    @l
    private final String location;

    @c("note")
    @l
    private final String note;

    @c("price")
    @l
    private final FavoriteAdvertPrice price;

    @c("relatedProducts")
    @l
    private final RelatedProducts relatedProducts;

    @c("sellerInfo")
    @l
    private final AdvertSellerInfo sellerInfo;

    @c("snippetType")
    @l
    private final SnippetType snippetType;

    @c("stocksQuantity")
    @l
    private final StocksQuantity stocksQuantity;

    @c("timestamp")
    @l
    private final Long timestamp;

    @c("title")
    @k
    private final String title;

    @c("xHash")
    @l
    private final String xHash;

    /* compiled from: FavoritesResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<FavoriteAdvertV1> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteAdvertV1 createFromParcel(@k Parcel parcel) {
            ArrayList arrayList;
            ArrayList arrayList2;
            Long l12;
            LinkedHashMap linkedHashMap;
            long j12 = parcel.readLong();
            String string = parcel.readString();
            DeepLink deepLink = (DeepLink) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader());
            String string2 = parcel.readString();
            int i12 = parcel.readInt();
            boolean z12 = parcel.readInt() != 0;
            AdvertImage advertImage = (AdvertImage) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader());
            boolean z13 = parcel.readInt() != 0;
            boolean z14 = parcel.readInt() != 0;
            Long lValueOf = parcel.readInt() == 0 ? null : Long.valueOf(parcel.readLong());
            if (parcel.readInt() == 0) {
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                ArrayList arrayList3 = new ArrayList(i13);
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = a.l(FavoriteAdvertV1.class, parcel, arrayList3, iL2, 1);
                    i13 = i13;
                }
                arrayList = arrayList3;
            }
            FavoriteAdvertPrice favoriteAdvertPriceCreateFromParcel = parcel.readInt() == 0 ? null : FavoriteAdvertPrice.CREATOR.createFromParcel(parcel);
            String string3 = parcel.readString();
            Contacting contactingCreateFromParcel = Contacting.CREATOR.createFromParcel(parcel);
            DeliveryAction deliveryActionCreateFromParcel = parcel.readInt() == 0 ? null : DeliveryAction.CREATOR.createFromParcel(parcel);
            StocksQuantity stocksQuantityCreateFromParcel = parcel.readInt() == 0 ? null : StocksQuantity.CREATOR.createFromParcel(parcel);
            CartSnippetActionsStepper cartSnippetActionsStepper = (CartSnippetActionsStepper) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader());
            BadgeSticker badgeSticker = (BadgeSticker) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader());
            BuyWithDeliveryInFavorites buyWithDeliveryInFavoritesCreateFromParcel = parcel.readInt() == 0 ? null : BuyWithDeliveryInFavorites.CREATOR.createFromParcel(parcel);
            AutotekaPurchaseAction autotekaPurchaseAction = (AutotekaPurchaseAction) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader());
            AutotekaLink autotekaLink = (AutotekaLink) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader());
            FavoriteAdvertActionButton favoriteAdvertActionButtonCreateFromParcel = parcel.readInt() == 0 ? null : FavoriteAdvertActionButton.CREATOR.createFromParcel(parcel);
            RelatedProducts relatedProducts = (RelatedProducts) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader());
            Contacts contacts = (Contacts) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader());
            KeyAttributes keyAttributes = (KeyAttributes) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader());
            SnippetType snippetType = (SnippetType) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader());
            AdvertSellerInfo advertSellerInfo = (AdvertSellerInfo) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader());
            String string4 = parcel.readString();
            String string5 = parcel.readString();
            if (parcel.readInt() == 0) {
                arrayList2 = arrayList;
                l12 = lValueOf;
                linkedHashMap = null;
            } else {
                int i14 = parcel.readInt();
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(i14);
                arrayList2 = arrayList;
                int iA2 = 0;
                while (iA2 != i14) {
                    iA2 = C0.a(parcel, linkedHashMap2, parcel.readString(), iA2, 1);
                    i14 = i14;
                    lValueOf = lValueOf;
                }
                l12 = lValueOf;
                linkedHashMap = linkedHashMap2;
            }
            return new FavoriteAdvertV1(j12, string, deepLink, string2, i12, z12, advertImage, z13, z14, l12, arrayList2, favoriteAdvertPriceCreateFromParcel, string3, contactingCreateFromParcel, deliveryActionCreateFromParcel, stocksQuantityCreateFromParcel, cartSnippetActionsStepper, badgeSticker, buyWithDeliveryInFavoritesCreateFromParcel, autotekaPurchaseAction, autotekaLink, favoriteAdvertActionButtonCreateFromParcel, relatedProducts, contacts, keyAttributes, snippetType, advertSellerInfo, string4, string5, linkedHashMap, parcel.readInt() == 0 ? null : SerpDisplayType.valueOf(parcel.readString()), parcel.readString(), (SerpBadgeBar) parcel.readParcelable(FavoriteAdvertV1.class.getClassLoader()), parcel.readString());
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final FavoriteAdvertV1[] newArray(int i12) {
            return new FavoriteAdvertV1[i12];
        }
    }

    public FavoriteAdvertV1(long j12, @k String str, @k DeepLink deepLink, @l String str2, int i12, boolean z12, @k AdvertImage advertImage, boolean z13, boolean z14, @l Long l12, @l List<GeoReference> list, @l FavoriteAdvertPrice favoriteAdvertPrice, @l String str3, @k Contacting contacting, @l DeliveryAction deliveryAction, @l StocksQuantity stocksQuantity, @l CartSnippetActionsStepper cartSnippetActionsStepper, @l BadgeSticker badgeSticker, @l BuyWithDeliveryInFavorites buyWithDeliveryInFavorites, @l AutotekaPurchaseAction autotekaPurchaseAction, @l AutotekaLink autotekaLink, @l FavoriteAdvertActionButton favoriteAdvertActionButton, @l RelatedProducts relatedProducts, @l Contacts contacts, @l KeyAttributes keyAttributes, @l SnippetType snippetType, @l AdvertSellerInfo advertSellerInfo, @l String str4, @l String str5, @l Map<String, String> map, @l SerpDisplayType serpDisplayType, @l String str6, @l SerpBadgeBar serpBadgeBar, @l String str7) {
        this.id = j12;
        this.title = str;
        this.deeplink = deepLink;
        this.address = str2;
        this.categoryId = i12;
        this.hasDelivery = z12;
        this.images = advertImage;
        this.isActive = z13;
        this.isFavorite = z14;
        this.timestamp = l12;
        this.geoReferences = list;
        this.price = favoriteAdvertPrice;
        this.note = str3;
        this.contacting = contacting;
        this.delivery = deliveryAction;
        this.stocksQuantity = stocksQuantity;
        this.cartButton = cartSnippetActionsStepper;
        this.badgeSticker = badgeSticker;
        this.buyWithDelivery = buyWithDeliveryInFavorites;
        this.autotekaPurchaseAction = autotekaPurchaseAction;
        this.autotekaLink = autotekaLink;
        this.actionButton = favoriteAdvertActionButton;
        this.relatedProducts = relatedProducts;
        this.contacts = contacts;
        this.keyAttributes = keyAttributes;
        this.snippetType = snippetType;
        this.sellerInfo = advertSellerInfo;
        this.location = str4;
        this.distance = str5;
        this.analyticParams = map;
        this.displayType = serpDisplayType;
        this.xHash = str6;
        this.badgeBar = serpBadgeBar;
        this.jobAggregationDisclaimer = str7;
    }

    /* renamed from: component1, reason: from getter */
    public final long getId() {
        return this.id;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @l
    public final List<GeoReference> component11() {
        return this.geoReferences;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final FavoriteAdvertPrice getPrice() {
        return this.price;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final String getNote() {
        return this.note;
    }

    @k
    /* renamed from: component14, reason: from getter */
    public final Contacting getContacting() {
        return this.contacting;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final DeliveryAction getDelivery() {
        return this.delivery;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final StocksQuantity getStocksQuantity() {
        return this.stocksQuantity;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final CartSnippetActionsStepper getCartButton() {
        return this.cartButton;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final BadgeSticker getBadgeSticker() {
        return this.badgeSticker;
    }

    @l
    /* renamed from: component19, reason: from getter */
    public final BuyWithDeliveryInFavorites getBuyWithDelivery() {
        return this.buyWithDelivery;
    }

    @k
    /* renamed from: component2, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final AutotekaPurchaseAction getAutotekaPurchaseAction() {
        return this.autotekaPurchaseAction;
    }

    @l
    /* renamed from: component21, reason: from getter */
    public final AutotekaLink getAutotekaLink() {
        return this.autotekaLink;
    }

    @l
    /* renamed from: component22, reason: from getter */
    public final FavoriteAdvertActionButton getActionButton() {
        return this.actionButton;
    }

    @l
    /* renamed from: component23, reason: from getter */
    public final RelatedProducts getRelatedProducts() {
        return this.relatedProducts;
    }

    @l
    /* renamed from: component24, reason: from getter */
    public final Contacts getContacts() {
        return this.contacts;
    }

    @l
    /* renamed from: component25, reason: from getter */
    public final KeyAttributes getKeyAttributes() {
        return this.keyAttributes;
    }

    @l
    /* renamed from: component26, reason: from getter */
    public final SnippetType getSnippetType() {
        return this.snippetType;
    }

    @l
    /* renamed from: component27, reason: from getter */
    public final AdvertSellerInfo getSellerInfo() {
        return this.sellerInfo;
    }

    @l
    /* renamed from: component28, reason: from getter */
    public final String getLocation() {
        return this.location;
    }

    @l
    /* renamed from: component29, reason: from getter */
    public final String getDistance() {
        return this.distance;
    }

    @k
    /* renamed from: component3, reason: from getter */
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final Map<String, String> component30() {
        return this.analyticParams;
    }

    @l
    /* renamed from: component31, reason: from getter */
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    /* renamed from: component32, reason: from getter */
    public final String getXHash() {
        return this.xHash;
    }

    @l
    /* renamed from: component33, reason: from getter */
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    /* renamed from: component34, reason: from getter */
    public final String getJobAggregationDisclaimer() {
        return this.jobAggregationDisclaimer;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getAddress() {
        return this.address;
    }

    /* renamed from: component5, reason: from getter */
    public final int getCategoryId() {
        return this.categoryId;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getHasDelivery() {
        return this.hasDelivery;
    }

    @k
    /* renamed from: component7, reason: from getter */
    public final AdvertImage getImages() {
        return this.images;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getIsFavorite() {
        return this.isFavorite;
    }

    @k
    public final FavoriteAdvertV1 copy(long id2, @k String title, @k DeepLink deeplink, @l String address, int categoryId, boolean hasDelivery, @k AdvertImage images, boolean isActive, boolean isFavorite, @l Long timestamp, @l List<GeoReference> geoReferences, @l FavoriteAdvertPrice price, @l String note, @k Contacting contacting, @l DeliveryAction delivery, @l StocksQuantity stocksQuantity, @l CartSnippetActionsStepper cartButton, @l BadgeSticker badgeSticker, @l BuyWithDeliveryInFavorites buyWithDelivery, @l AutotekaPurchaseAction autotekaPurchaseAction, @l AutotekaLink autotekaLink, @l FavoriteAdvertActionButton actionButton, @l RelatedProducts relatedProducts, @l Contacts contacts, @l KeyAttributes keyAttributes, @l SnippetType snippetType, @l AdvertSellerInfo sellerInfo, @l String location, @l String distance, @l Map<String, String> analyticParams, @l SerpDisplayType displayType, @l String xHash, @l SerpBadgeBar badgeBar, @l String jobAggregationDisclaimer) {
        return new FavoriteAdvertV1(id2, title, deeplink, address, categoryId, hasDelivery, images, isActive, isFavorite, timestamp, geoReferences, price, note, contacting, delivery, stocksQuantity, cartButton, badgeSticker, buyWithDelivery, autotekaPurchaseAction, autotekaLink, actionButton, relatedProducts, contacts, keyAttributes, snippetType, sellerInfo, location, distance, analyticParams, displayType, xHash, badgeBar, jobAggregationDisclaimer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FavoriteAdvertV1)) {
            return false;
        }
        FavoriteAdvertV1 favoriteAdvertV1 = (FavoriteAdvertV1) other;
        return this.id == favoriteAdvertV1.id && L.f(this.title, favoriteAdvertV1.title) && L.f(this.deeplink, favoriteAdvertV1.deeplink) && L.f(this.address, favoriteAdvertV1.address) && this.categoryId == favoriteAdvertV1.categoryId && this.hasDelivery == favoriteAdvertV1.hasDelivery && L.f(this.images, favoriteAdvertV1.images) && this.isActive == favoriteAdvertV1.isActive && this.isFavorite == favoriteAdvertV1.isFavorite && L.f(this.timestamp, favoriteAdvertV1.timestamp) && L.f(this.geoReferences, favoriteAdvertV1.geoReferences) && L.f(this.price, favoriteAdvertV1.price) && L.f(this.note, favoriteAdvertV1.note) && L.f(this.contacting, favoriteAdvertV1.contacting) && L.f(this.delivery, favoriteAdvertV1.delivery) && L.f(this.stocksQuantity, favoriteAdvertV1.stocksQuantity) && L.f(this.cartButton, favoriteAdvertV1.cartButton) && L.f(this.badgeSticker, favoriteAdvertV1.badgeSticker) && L.f(this.buyWithDelivery, favoriteAdvertV1.buyWithDelivery) && L.f(this.autotekaPurchaseAction, favoriteAdvertV1.autotekaPurchaseAction) && L.f(this.autotekaLink, favoriteAdvertV1.autotekaLink) && L.f(this.actionButton, favoriteAdvertV1.actionButton) && L.f(this.relatedProducts, favoriteAdvertV1.relatedProducts) && L.f(this.contacts, favoriteAdvertV1.contacts) && L.f(this.keyAttributes, favoriteAdvertV1.keyAttributes) && this.snippetType == favoriteAdvertV1.snippetType && L.f(this.sellerInfo, favoriteAdvertV1.sellerInfo) && L.f(this.location, favoriteAdvertV1.location) && L.f(this.distance, favoriteAdvertV1.distance) && L.f(this.analyticParams, favoriteAdvertV1.analyticParams) && this.displayType == favoriteAdvertV1.displayType && L.f(this.xHash, favoriteAdvertV1.xHash) && L.f(this.badgeBar, favoriteAdvertV1.badgeBar) && L.f(this.jobAggregationDisclaimer, favoriteAdvertV1.jobAggregationDisclaimer);
    }

    @l
    public final FavoriteAdvertActionButton getActionButton() {
        return this.actionButton;
    }

    @l
    public final String getAddress() {
        return this.address;
    }

    @l
    public final Map<String, String> getAnalyticParams() {
        return this.analyticParams;
    }

    @l
    public final AutotekaLink getAutotekaLink() {
        return this.autotekaLink;
    }

    @l
    public final AutotekaPurchaseAction getAutotekaPurchaseAction() {
        return this.autotekaPurchaseAction;
    }

    @l
    public final SerpBadgeBar getBadgeBar() {
        return this.badgeBar;
    }

    @l
    public final BadgeSticker getBadgeSticker() {
        return this.badgeSticker;
    }

    @l
    public final BuyWithDeliveryInFavorites getBuyWithDelivery() {
        return this.buyWithDelivery;
    }

    @l
    public final CartSnippetActionsStepper getCartButton() {
        return this.cartButton;
    }

    public final int getCategoryId() {
        return this.categoryId;
    }

    @k
    public final Contacting getContacting() {
        return this.contacting;
    }

    @l
    public final Contacts getContacts() {
        return this.contacts;
    }

    @k
    public final DeepLink getDeeplink() {
        return this.deeplink;
    }

    @l
    public final DeliveryAction getDelivery() {
        return this.delivery;
    }

    @l
    public final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @l
    public final String getDistance() {
        return this.distance;
    }

    @l
    public final List<GeoReference> getGeoReferences() {
        return this.geoReferences;
    }

    public final boolean getHasDelivery() {
        return this.hasDelivery;
    }

    public final long getId() {
        return this.id;
    }

    @k
    public final AdvertImage getImages() {
        return this.images;
    }

    @l
    public final String getJobAggregationDisclaimer() {
        return this.jobAggregationDisclaimer;
    }

    @l
    public final KeyAttributes getKeyAttributes() {
        return this.keyAttributes;
    }

    @l
    public final String getLocation() {
        return this.location;
    }

    @l
    public final String getNote() {
        return this.note;
    }

    @l
    public final FavoriteAdvertPrice getPrice() {
        return this.price;
    }

    @l
    public final RelatedProducts getRelatedProducts() {
        return this.relatedProducts;
    }

    @l
    public final AdvertSellerInfo getSellerInfo() {
        return this.sellerInfo;
    }

    @l
    public final SnippetType getSnippetType() {
        return this.snippetType;
    }

    @l
    public final StocksQuantity getStocksQuantity() {
        return this.stocksQuantity;
    }

    @l
    public final Long getTimestamp() {
        return this.timestamp;
    }

    @k
    public final String getTitle() {
        return this.title;
    }

    @l
    public final String getXHash() {
        return this.xHash;
    }

    public int hashCode() {
        int iE2 = a.e(this.deeplink, H.d(Long.hashCode(this.id) * 31, 31, this.title), 31);
        String str = this.address;
        int i12 = r.i(r.i((this.images.hashCode() + r.i(r.e(this.categoryId, (iE2 + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.hasDelivery)) * 31, 31, this.isActive), 31, this.isFavorite);
        Long l12 = this.timestamp;
        int iHashCode = (i12 + (l12 == null ? 0 : l12.hashCode())) * 31;
        List<GeoReference> list = this.geoReferences;
        int iHashCode2 = (iHashCode + (list == null ? 0 : list.hashCode())) * 31;
        FavoriteAdvertPrice favoriteAdvertPrice = this.price;
        int iHashCode3 = (iHashCode2 + (favoriteAdvertPrice == null ? 0 : favoriteAdvertPrice.hashCode())) * 31;
        String str2 = this.note;
        int iHashCode4 = (this.contacting.hashCode() + ((iHashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        DeliveryAction deliveryAction = this.delivery;
        int iHashCode5 = (iHashCode4 + (deliveryAction == null ? 0 : deliveryAction.hashCode())) * 31;
        StocksQuantity stocksQuantity = this.stocksQuantity;
        int iHashCode6 = (iHashCode5 + (stocksQuantity == null ? 0 : stocksQuantity.hashCode())) * 31;
        CartSnippetActionsStepper cartSnippetActionsStepper = this.cartButton;
        int iHashCode7 = (iHashCode6 + (cartSnippetActionsStepper == null ? 0 : cartSnippetActionsStepper.hashCode())) * 31;
        BadgeSticker badgeSticker = this.badgeSticker;
        int iHashCode8 = (iHashCode7 + (badgeSticker == null ? 0 : badgeSticker.hashCode())) * 31;
        BuyWithDeliveryInFavorites buyWithDeliveryInFavorites = this.buyWithDelivery;
        int iHashCode9 = (iHashCode8 + (buyWithDeliveryInFavorites == null ? 0 : buyWithDeliveryInFavorites.hashCode())) * 31;
        AutotekaPurchaseAction autotekaPurchaseAction = this.autotekaPurchaseAction;
        int iHashCode10 = (iHashCode9 + (autotekaPurchaseAction == null ? 0 : autotekaPurchaseAction.hashCode())) * 31;
        AutotekaLink autotekaLink = this.autotekaLink;
        int iHashCode11 = (iHashCode10 + (autotekaLink == null ? 0 : autotekaLink.hashCode())) * 31;
        FavoriteAdvertActionButton favoriteAdvertActionButton = this.actionButton;
        int iHashCode12 = (iHashCode11 + (favoriteAdvertActionButton == null ? 0 : favoriteAdvertActionButton.hashCode())) * 31;
        RelatedProducts relatedProducts = this.relatedProducts;
        int iHashCode13 = (iHashCode12 + (relatedProducts == null ? 0 : relatedProducts.hashCode())) * 31;
        Contacts contacts = this.contacts;
        int iHashCode14 = (iHashCode13 + (contacts == null ? 0 : contacts.hashCode())) * 31;
        KeyAttributes keyAttributes = this.keyAttributes;
        int iHashCode15 = (iHashCode14 + (keyAttributes == null ? 0 : keyAttributes.hashCode())) * 31;
        SnippetType snippetType = this.snippetType;
        int iHashCode16 = (iHashCode15 + (snippetType == null ? 0 : snippetType.hashCode())) * 31;
        AdvertSellerInfo advertSellerInfo = this.sellerInfo;
        int iHashCode17 = (iHashCode16 + (advertSellerInfo == null ? 0 : advertSellerInfo.hashCode())) * 31;
        String str3 = this.location;
        int iHashCode18 = (iHashCode17 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.distance;
        int iHashCode19 = (iHashCode18 + (str4 == null ? 0 : str4.hashCode())) * 31;
        Map<String, String> map = this.analyticParams;
        int iHashCode20 = (iHashCode19 + (map == null ? 0 : map.hashCode())) * 31;
        SerpDisplayType serpDisplayType = this.displayType;
        int iHashCode21 = (iHashCode20 + (serpDisplayType == null ? 0 : serpDisplayType.hashCode())) * 31;
        String str5 = this.xHash;
        int iHashCode22 = (iHashCode21 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SerpBadgeBar serpBadgeBar = this.badgeBar;
        int iHashCode23 = (iHashCode22 + (serpBadgeBar == null ? 0 : serpBadgeBar.hashCode())) * 31;
        String str6 = this.jobAggregationDisclaimer;
        return iHashCode23 + (str6 != null ? str6.hashCode() : 0);
    }

    public final boolean isActive() {
        return this.isActive;
    }

    public final boolean isFavorite() {
        return this.isFavorite;
    }

    @k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("FavoriteAdvertV1(id=");
        sb2.append(this.id);
        sb2.append(", title=");
        sb2.append(this.title);
        sb2.append(", deeplink=");
        sb2.append(this.deeplink);
        sb2.append(", address=");
        sb2.append(this.address);
        sb2.append(", categoryId=");
        sb2.append(this.categoryId);
        sb2.append(", hasDelivery=");
        sb2.append(this.hasDelivery);
        sb2.append(", images=");
        sb2.append(this.images);
        sb2.append(", isActive=");
        sb2.append(this.isActive);
        sb2.append(", isFavorite=");
        sb2.append(this.isFavorite);
        sb2.append(", timestamp=");
        sb2.append(this.timestamp);
        sb2.append(", geoReferences=");
        sb2.append(this.geoReferences);
        sb2.append(", price=");
        sb2.append(this.price);
        sb2.append(", note=");
        sb2.append(this.note);
        sb2.append(", contacting=");
        sb2.append(this.contacting);
        sb2.append(", delivery=");
        sb2.append(this.delivery);
        sb2.append(", stocksQuantity=");
        sb2.append(this.stocksQuantity);
        sb2.append(", cartButton=");
        sb2.append(this.cartButton);
        sb2.append(", badgeSticker=");
        sb2.append(this.badgeSticker);
        sb2.append(", buyWithDelivery=");
        sb2.append(this.buyWithDelivery);
        sb2.append(", autotekaPurchaseAction=");
        sb2.append(this.autotekaPurchaseAction);
        sb2.append(", autotekaLink=");
        sb2.append(this.autotekaLink);
        sb2.append(", actionButton=");
        sb2.append(this.actionButton);
        sb2.append(", relatedProducts=");
        sb2.append(this.relatedProducts);
        sb2.append(", contacts=");
        sb2.append(this.contacts);
        sb2.append(", keyAttributes=");
        sb2.append(this.keyAttributes);
        sb2.append(", snippetType=");
        sb2.append(this.snippetType);
        sb2.append(", sellerInfo=");
        sb2.append(this.sellerInfo);
        sb2.append(", location=");
        sb2.append(this.location);
        sb2.append(", distance=");
        sb2.append(this.distance);
        sb2.append(", analyticParams=");
        sb2.append(this.analyticParams);
        sb2.append(", displayType=");
        sb2.append(this.displayType);
        sb2.append(", xHash=");
        sb2.append(this.xHash);
        sb2.append(", badgeBar=");
        sb2.append(this.badgeBar);
        sb2.append(", jobAggregationDisclaimer=");
        return C22026a.c(sb2, this.jobAggregationDisclaimer, ')');
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        parcel.writeLong(this.id);
        parcel.writeString(this.title);
        parcel.writeParcelable(this.deeplink, flags);
        parcel.writeString(this.address);
        parcel.writeInt(this.categoryId);
        parcel.writeInt(this.hasDelivery ? 1 : 0);
        parcel.writeParcelable(this.images, flags);
        parcel.writeInt(this.isActive ? 1 : 0);
        parcel.writeInt(this.isFavorite ? 1 : 0);
        Long l12 = this.timestamp;
        if (l12 == null) {
            parcel.writeInt(0);
        } else {
            C0.m(parcel, 1, l12);
        }
        List<GeoReference> list = this.geoReferences;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        FavoriteAdvertPrice favoriteAdvertPrice = this.price;
        if (favoriteAdvertPrice == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            favoriteAdvertPrice.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.note);
        this.contacting.writeToParcel(parcel, flags);
        DeliveryAction deliveryAction = this.delivery;
        if (deliveryAction == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            deliveryAction.writeToParcel(parcel, flags);
        }
        StocksQuantity stocksQuantity = this.stocksQuantity;
        if (stocksQuantity == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            stocksQuantity.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.cartButton, flags);
        parcel.writeParcelable(this.badgeSticker, flags);
        BuyWithDeliveryInFavorites buyWithDeliveryInFavorites = this.buyWithDelivery;
        if (buyWithDeliveryInFavorites == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            buyWithDeliveryInFavorites.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.autotekaPurchaseAction, flags);
        parcel.writeParcelable(this.autotekaLink, flags);
        FavoriteAdvertActionButton favoriteAdvertActionButton = this.actionButton;
        if (favoriteAdvertActionButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            favoriteAdvertActionButton.writeToParcel(parcel, flags);
        }
        parcel.writeParcelable(this.relatedProducts, flags);
        parcel.writeParcelable(this.contacts, flags);
        parcel.writeParcelable(this.keyAttributes, flags);
        parcel.writeParcelable(this.snippetType, flags);
        parcel.writeParcelable(this.sellerInfo, flags);
        parcel.writeString(this.location);
        parcel.writeString(this.distance);
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
        SerpDisplayType serpDisplayType = this.displayType;
        if (serpDisplayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpDisplayType.name());
        }
        parcel.writeString(this.xHash);
        parcel.writeParcelable(this.badgeBar, flags);
        parcel.writeString(this.jobAggregationDisclaimer);
    }

    public /* synthetic */ FavoriteAdvertV1(long j12, String str, DeepLink deepLink, String str2, int i12, boolean z12, AdvertImage advertImage, boolean z13, boolean z14, Long l12, List list, FavoriteAdvertPrice favoriteAdvertPrice, String str3, Contacting contacting, DeliveryAction deliveryAction, StocksQuantity stocksQuantity, CartSnippetActionsStepper cartSnippetActionsStepper, BadgeSticker badgeSticker, BuyWithDeliveryInFavorites buyWithDeliveryInFavorites, AutotekaPurchaseAction autotekaPurchaseAction, AutotekaLink autotekaLink, FavoriteAdvertActionButton favoriteAdvertActionButton, RelatedProducts relatedProducts, Contacts contacts, KeyAttributes keyAttributes, SnippetType snippetType, AdvertSellerInfo advertSellerInfo, String str4, String str5, Map map, SerpDisplayType serpDisplayType, String str6, SerpBadgeBar serpBadgeBar, String str7, int i13, int i14, C42822w c42822w) {
        this(j12, str, deepLink, str2, i12, z12, advertImage, z13, z14, (i13 & 512) != 0 ? null : l12, list, favoriteAdvertPrice, str3, contacting, deliveryAction, stocksQuantity, cartSnippetActionsStepper, badgeSticker, buyWithDeliveryInFavorites, autotekaPurchaseAction, autotekaLink, (2097152 & i13) != 0 ? null : favoriteAdvertActionButton, (4194304 & i13) != 0 ? null : relatedProducts, (8388608 & i13) != 0 ? null : contacts, (16777216 & i13) != 0 ? null : keyAttributes, (33554432 & i13) != 0 ? null : snippetType, (67108864 & i13) != 0 ? null : advertSellerInfo, (134217728 & i13) != 0 ? null : str4, (268435456 & i13) != 0 ? null : str5, (536870912 & i13) != 0 ? null : map, (1073741824 & i13) != 0 ? null : serpDisplayType, (i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : str6, (i14 & 1) != 0 ? null : serpBadgeBar, (i14 & 2) != 0 ? null : str7);
    }
}
