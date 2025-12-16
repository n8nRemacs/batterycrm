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
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.remote.model.additional_buttons.AdditionalButtons;
import com.avito.android.remote.model.category_parameters.slot.auto_group_block.PluralsKeys;
import com.avito.android.remote.model.search.map.SerpFloatingContainer;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
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

/* compiled from: SerpElementResult.kt */
@d
@Keep
@Metadata(d1 = {"\u0000\u0094\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b1\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b,\b\u0087\b\u0018\u00002\u00020\u0001BÏ\u0002\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b\u0012\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u0016\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d\u0012\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0002\u0012\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!\u0012\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001b\u0012\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$\u0012\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&\u0012\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b\u0012\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)\u0012\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+¢\u0006\u0004\b-\u0010.J\u001b\u0010/\u001a\u00020\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b/\u00100J\u0016\u00101\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b3\u00104J\u0010\u00105\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b5\u00104J\u0012\u00106\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b6\u00107J\u0012\u00108\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b8\u00107J\u0012\u00109\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b9\u00107J\u001e\u0010:\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b:\u0010;J\u0012\u0010<\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b<\u00107J\u0012\u0010=\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b=\u0010>J\u0012\u0010?\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b?\u00107J\u0012\u0010@\u001a\u0004\u0018\u00010\u0014HÆ\u0003¢\u0006\u0004\b@\u0010AJ\u0012\u0010B\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bB\u0010CJ\u0012\u0010D\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bD\u0010CJ\u0012\u0010E\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bE\u0010CJ\u0012\u0010F\u001a\u0004\u0018\u00010\u0016HÆ\u0003¢\u0006\u0004\bF\u0010CJ\u0012\u0010G\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bG\u0010HJ\u0012\u0010I\u001a\u0004\u0018\u00010\u001dHÆ\u0003¢\u0006\u0004\bI\u0010JJ\u0018\u0010K\u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\bK\u00102J\u0012\u0010L\u001a\u0004\u0018\u00010!HÆ\u0003¢\u0006\u0004\bL\u0010MJ\u0012\u0010N\u001a\u0004\u0018\u00010\u001bHÆ\u0003¢\u0006\u0004\bN\u0010HJ\u0012\u0010O\u001a\u0004\u0018\u00010$HÆ\u0003¢\u0006\u0004\bO\u0010PJ\u0012\u0010Q\u001a\u0004\u0018\u00010&HÆ\u0003¢\u0006\u0004\bQ\u0010RJ\u0012\u0010S\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\bS\u00107J\u0012\u0010T\u001a\u0004\u0018\u00010)HÆ\u0003¢\u0006\u0004\bT\u0010UJ\u0012\u0010V\u001a\u0004\u0018\u00010+HÆ\u0003¢\u0006\u0004\bV\u0010WJÚ\u0002\u0010X\u001a\u00020\u00002\u000e\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\n\b\u0002\u0010\u0017\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0018\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u00162\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010\u001e\u001a\u0004\u0018\u00010\u001d2\u0010\b\u0002\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00022\n\b\u0002\u0010\"\u001a\u0004\u0018\u00010!2\n\b\u0002\u0010#\u001a\u0004\u0018\u00010\u001b2\n\b\u0002\u0010%\u001a\u0004\u0018\u00010$2\n\b\u0002\u0010'\u001a\u0004\u0018\u00010&2\n\b\u0002\u0010(\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010*\u001a\u0004\u0018\u00010)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010+HÆ\u0001¢\u0006\u0004\bX\u0010YJ\u0010\u0010Z\u001a\u00020\bHÖ\u0001¢\u0006\u0004\bZ\u00107J\u0010\u0010[\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\b[\u0010\\J\u001a\u0010_\u001a\u00020\u00162\b\u0010^\u001a\u0004\u0018\u00010]HÖ\u0003¢\u0006\u0004\b_\u0010`J\u0010\u0010a\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\ba\u0010\\J \u0010f\u001a\u00020e2\u0006\u0010c\u001a\u00020b2\u0006\u0010d\u001a\u00020\u001dHÖ\u0001¢\u0006\u0004\bf\u0010gJ\u0012\u0010h\u001a\u0004\u0018\u00010\nHÂ\u0003¢\u0006\u0004\bh\u0010iR \u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0004\u0010j\u001a\u0004\bk\u00102R\u001a\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010l\u001a\u0004\bm\u00104R\u001a\u0010\u0007\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010l\u001a\u0004\bn\u00104R\u001c\u0010\t\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\t\u0010o\u001a\u0004\bp\u00107R\u0016\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010qR\u001c\u0010\f\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010o\u001a\u0004\br\u00107R\u001c\u0010\r\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\r\u0010o\u001a\u0004\bs\u00107R(\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\b\u0018\u00010\u000e8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000f\u0010t\u001a\u0004\bu\u0010;R\u001c\u0010\u0010\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0010\u0010o\u001a\u0004\bv\u00107R\u001c\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0012\u0010w\u001a\u0004\bx\u0010>R\u001c\u0010\u0013\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0013\u0010o\u001a\u0004\by\u00107R\u001c\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0015\u0010z\u001a\u0004\b{\u0010AR\u001c\u0010\u0017\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0017\u0010|\u001a\u0004\b\u0017\u0010CR\u001c\u0010\u0018\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0018\u0010|\u001a\u0004\b\u0018\u0010CR\u001c\u0010\u0019\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0019\u0010|\u001a\u0004\b\u0019\u0010CR\u001c\u0010\u001a\u001a\u0004\u0018\u00010\u00168\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001a\u0010|\u001a\u0004\b}\u0010CR\u001c\u0010\u001c\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u001c\u0010~\u001a\u0004\b\u007f\u0010HR\u001e\u0010\u001e\u001a\u0004\u0018\u00010\u001d8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\u001e\u0010\u0080\u0001\u001a\u0005\b\u0081\u0001\u0010JR#\u0010 \u001a\n\u0012\u0004\u0012\u00020\u001f\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\r\n\u0004\b \u0010j\u001a\u0005\b\u0082\u0001\u00102R\u001e\u0010\"\u001a\u0004\u0018\u00010!8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b\"\u0010\u0083\u0001\u001a\u0005\b\u0084\u0001\u0010MR\u001d\u0010#\u001a\u0004\u0018\u00010\u001b8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b#\u0010~\u001a\u0005\b\u0085\u0001\u0010HR\u001e\u0010%\u001a\u0004\u0018\u00010$8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b%\u0010\u0086\u0001\u001a\u0005\b\u0087\u0001\u0010PR\u001e\u0010'\u001a\u0004\u0018\u00010&8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b'\u0010\u0088\u0001\u001a\u0005\b\u0089\u0001\u0010RR\u001d\u0010(\u001a\u0004\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\r\n\u0004\b(\u0010o\u001a\u0005\b\u008a\u0001\u00107R\u001e\u0010*\u001a\u0004\u0018\u00010)8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b*\u0010\u008b\u0001\u001a\u0005\b\u008c\u0001\u0010UR\u001e\u0010,\u001a\u0004\u0018\u00010+8\u0006X\u0087\u0004¢\u0006\u000e\n\u0005\b,\u0010\u008d\u0001\u001a\u0005\b\u008e\u0001\u0010WR\u0013\u0010\u0090\u0001\u001a\u00020\n8F¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010i¨\u0006\u0091\u0001"}, d2 = {"Lcom/avito/android/remote/model/SerpElementResult;", "Landroid/os/Parcelable;", "", "Lcom/avito/android/remote/model/SerpElement;", "elements", "", "count", "lastStamp", "", "subscriptionId", "Lcom/avito/android/remote/model/SerpDisplayType;", "displayType", "searchHint", "xHash", "", "firebaseParams", "emptySearchText", "Lcom/avito/android/remote/model/EmptySearchContent;", "emptySearchContent", "nextPageId", "Lcom/avito/android/remote/model/SearchDescription;", "searchDescription", "", "isSubscribed", "isVerticalMain", "isCrossVertical", "shouldShowSaveSearch", "Lcom/avito/android/deep_linking/links/DeepLink;", "onboarding", "", "verticalId", "Lcom/avito/android/remote/model/ux_feedback/UxFeedbackConfigOld;", "uxFeedbackConfigs", "Lcom/avito/android/remote/model/SerpResultCategoryDetails;", "categoryDetails", "onDisplayClickstreamDeeplink", "Lcom/avito/android/remote/model/NavigationBarStyle;", "navigationBarStyle", "Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;", "additionalButtons", "newSerpMapInteraction", "Lcom/avito/android/remote/model/SharingButton;", "sharingButton", "Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;", "floatingContainer", "<init>", "(Ljava/util/List;JJLjava/lang/String;Lcom/avito/android/remote/model/SerpDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/avito/android/remote/model/EmptySearchContent;Ljava/lang/String;Lcom/avito/android/remote/model/SearchDescription;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/remote/model/SerpResultCategoryDetails;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/NavigationBarStyle;Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;Ljava/lang/String;Lcom/avito/android/remote/model/SharingButton;Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;)V", "cloneWithNewElements", "(Ljava/util/List;)Lcom/avito/android/remote/model/SerpElementResult;", "component1", "()Ljava/util/List;", "component2", "()J", "component3", "component4", "()Ljava/lang/String;", "component6", "component7", "component8", "()Ljava/util/Map;", "component9", "component10", "()Lcom/avito/android/remote/model/EmptySearchContent;", "component11", "component12", "()Lcom/avito/android/remote/model/SearchDescription;", "component13", "()Ljava/lang/Boolean;", "component14", "component15", "component16", "component17", "()Lcom/avito/android/deep_linking/links/DeepLink;", "component18", "()Ljava/lang/Integer;", "component19", "component20", "()Lcom/avito/android/remote/model/SerpResultCategoryDetails;", "component21", "component22", "()Lcom/avito/android/remote/model/NavigationBarStyle;", "component23", "()Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;", "component24", "component25", "()Lcom/avito/android/remote/model/SharingButton;", "component26", "()Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;", "copy", "(Ljava/util/List;JJLjava/lang/String;Lcom/avito/android/remote/model/SerpDisplayType;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;Lcom/avito/android/remote/model/EmptySearchContent;Ljava/lang/String;Lcom/avito/android/remote/model/SearchDescription;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Ljava/lang/Boolean;Lcom/avito/android/deep_linking/links/DeepLink;Ljava/lang/Integer;Ljava/util/List;Lcom/avito/android/remote/model/SerpResultCategoryDetails;Lcom/avito/android/deep_linking/links/DeepLink;Lcom/avito/android/remote/model/NavigationBarStyle;Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;Ljava/lang/String;Lcom/avito/android/remote/model/SharingButton;Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;)Lcom/avito/android/remote/model/SerpElementResult;", "toString", "hashCode", "()I", "", PluralsKeys.OTHER, "equals", "(Ljava/lang/Object;)Z", "describeContents", "Landroid/os/Parcel;", "parcel", "flags", "Lkotlin/G0;", "writeToParcel", "(Landroid/os/Parcel;I)V", "component5", "()Lcom/avito/android/remote/model/SerpDisplayType;", "Ljava/util/List;", "getElements", "J", "getCount", "getLastStamp", "Ljava/lang/String;", "getSubscriptionId", "Lcom/avito/android/remote/model/SerpDisplayType;", "getSearchHint", "getXHash", "Ljava/util/Map;", "getFirebaseParams", "getEmptySearchText", "Lcom/avito/android/remote/model/EmptySearchContent;", "getEmptySearchContent", "getNextPageId", "Lcom/avito/android/remote/model/SearchDescription;", "getSearchDescription", "Ljava/lang/Boolean;", "getShouldShowSaveSearch", "Lcom/avito/android/deep_linking/links/DeepLink;", "getOnboarding", "Ljava/lang/Integer;", "getVerticalId", "getUxFeedbackConfigs", "Lcom/avito/android/remote/model/SerpResultCategoryDetails;", "getCategoryDetails", "getOnDisplayClickstreamDeeplink", "Lcom/avito/android/remote/model/NavigationBarStyle;", "getNavigationBarStyle", "Lcom/avito/android/remote/model/additional_buttons/AdditionalButtons;", "getAdditionalButtons", "getNewSerpMapInteraction", "Lcom/avito/android/remote/model/SharingButton;", "getSharingButton", "Lcom/avito/android/remote/model/search/map/SerpFloatingContainer;", "getFloatingContainer", "getSerpDisplayType", "serpDisplayType", "_avito-discouraged_avito-api_search"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes17.dex */
public final /* data */ class SerpElementResult implements Parcelable {

    @k
    public static final Parcelable.Creator<SerpElementResult> CREATOR = new Creator();

    @c("additionalButtons")
    @l
    private final AdditionalButtons additionalButtons;

    @c("analytics")
    @l
    private final SerpResultCategoryDetails categoryDetails;

    @c("count")
    private final long count;

    @c("displayType")
    @l
    private final SerpDisplayType displayType;

    @c("items")
    @k
    private final List<SerpElement> elements;

    @c("emptySearchContent")
    @l
    private final EmptySearchContent emptySearchContent;

    @c("emptySearch")
    @l
    private final String emptySearchText;

    @c("firebaseParams")
    @l
    private final Map<String, String> firebaseParams;

    @c("buttons")
    @l
    private final SerpFloatingContainer floatingContainer;

    @c("isCrossVertical")
    @l
    private final Boolean isCrossVertical;

    @c("isSubscribed")
    @l
    private final Boolean isSubscribed;

    @c("isVerticalMain")
    @l
    private final Boolean isVerticalMain;

    @c("lastStamp")
    private final long lastStamp;

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

    @c("saveToHistoryDescription")
    @l
    private final SearchDescription searchDescription;

    @c("searchHint")
    @l
    private final String searchHint;

    @c("sharing")
    @l
    private final SharingButton sharingButton;

    @c("shouldShowSaveSearch")
    @l
    private final Boolean shouldShowSaveSearch;

    @c("subscriptionId")
    @l
    private final String subscriptionId;

    @c("uxFeedbackConfigs")
    @l
    private final List<UxFeedbackConfigOld> uxFeedbackConfigs;

    @c("verticalId")
    @l
    private final Integer verticalId;

    @c("xHash")
    @l
    private final String xHash;

    /* compiled from: SerpElementResult.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class Creator implements Parcelable.Creator<SerpElementResult> {
        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpElementResult createFromParcel(@k Parcel parcel) {
            LinkedHashMap linkedHashMap;
            Boolean boolValueOf;
            Boolean boolValueOf2;
            Boolean boolValueOf3;
            Boolean boolValueOf4;
            String str;
            EmptySearchContent emptySearchContent;
            ArrayList arrayList;
            List<SerpElement> listCreate = SerpElementOptimizedParceler.INSTANCE.create(parcel);
            long j12 = parcel.readLong();
            long j13 = parcel.readLong();
            String string = parcel.readString();
            SerpDisplayType serpDisplayTypeValueOf = parcel.readInt() == 0 ? null : SerpDisplayType.valueOf(parcel.readString());
            String string2 = parcel.readString();
            String string3 = parcel.readString();
            if (parcel.readInt() == 0) {
                linkedHashMap = null;
            } else {
                int i12 = parcel.readInt();
                linkedHashMap = new LinkedHashMap(i12);
                int iA2 = 0;
                while (iA2 != i12) {
                    iA2 = C0.a(parcel, linkedHashMap, parcel.readString(), iA2, 1);
                }
            }
            String string4 = parcel.readString();
            EmptySearchContent emptySearchContentCreateFromParcel = parcel.readInt() == 0 ? null : EmptySearchContent.CREATOR.createFromParcel(parcel);
            String string5 = parcel.readString();
            SearchDescription searchDescription = (SearchDescription) parcel.readParcelable(SerpElementResult.class.getClassLoader());
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
            DeepLink deepLink = (DeepLink) parcel.readParcelable(SerpElementResult.class.getClassLoader());
            Integer numValueOf = parcel.readInt() == 0 ? null : Integer.valueOf(parcel.readInt());
            if (parcel.readInt() == 0) {
                emptySearchContent = emptySearchContentCreateFromParcel;
                str = string5;
                arrayList = null;
            } else {
                int i13 = parcel.readInt();
                str = string5;
                ArrayList arrayList2 = new ArrayList(i13);
                emptySearchContent = emptySearchContentCreateFromParcel;
                int iL2 = 0;
                while (iL2 != i13) {
                    iL2 = a.l(SerpElementResult.class, parcel, arrayList2, iL2, 1);
                    i13 = i13;
                }
                arrayList = arrayList2;
            }
            return new SerpElementResult(listCreate, j12, j13, string, serpDisplayTypeValueOf, string2, string3, linkedHashMap, string4, emptySearchContent, str, searchDescription, boolValueOf, boolValueOf2, boolValueOf3, boolValueOf4, deepLink, numValueOf, arrayList, (SerpResultCategoryDetails) parcel.readParcelable(SerpElementResult.class.getClassLoader()), (DeepLink) parcel.readParcelable(SerpElementResult.class.getClassLoader()), (NavigationBarStyle) parcel.readParcelable(SerpElementResult.class.getClassLoader()), parcel.readInt() == 0 ? null : AdditionalButtons.CREATOR.createFromParcel(parcel), parcel.readString(), parcel.readInt() == 0 ? null : SharingButton.CREATOR.createFromParcel(parcel), parcel.readInt() == 0 ? null : SerpFloatingContainer.CREATOR.createFromParcel(parcel));
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // android.os.Parcelable.Creator
        @k
        public final SerpElementResult[] newArray(int i12) {
            return new SerpElementResult[i12];
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public SerpElementResult(@k List<? extends SerpElement> list, long j12, long j13, @l String str, @l SerpDisplayType serpDisplayType, @l String str2, @l String str3, @l Map<String, String> map, @l String str4, @l EmptySearchContent emptySearchContent, @l String str5, @l SearchDescription searchDescription, @l Boolean bool, @l Boolean bool2, @l Boolean bool3, @l Boolean bool4, @l DeepLink deepLink, @l Integer num, @l List<UxFeedbackConfigOld> list2, @l SerpResultCategoryDetails serpResultCategoryDetails, @l DeepLink deepLink2, @l NavigationBarStyle navigationBarStyle, @l AdditionalButtons additionalButtons, @l String str6, @l SharingButton sharingButton, @l SerpFloatingContainer serpFloatingContainer) {
        this.elements = list;
        this.count = j12;
        this.lastStamp = j13;
        this.subscriptionId = str;
        this.displayType = serpDisplayType;
        this.searchHint = str2;
        this.xHash = str3;
        this.firebaseParams = map;
        this.emptySearchText = str4;
        this.emptySearchContent = emptySearchContent;
        this.nextPageId = str5;
        this.searchDescription = searchDescription;
        this.isSubscribed = bool;
        this.isVerticalMain = bool2;
        this.isCrossVertical = bool3;
        this.shouldShowSaveSearch = bool4;
        this.onboarding = deepLink;
        this.verticalId = num;
        this.uxFeedbackConfigs = list2;
        this.categoryDetails = serpResultCategoryDetails;
        this.onDisplayClickstreamDeeplink = deepLink2;
        this.navigationBarStyle = navigationBarStyle;
        this.additionalButtons = additionalButtons;
        this.newSerpMapInteraction = str6;
        this.sharingButton = sharingButton;
        this.floatingContainer = serpFloatingContainer;
    }

    /* renamed from: component5, reason: from getter */
    private final SerpDisplayType getDisplayType() {
        return this.displayType;
    }

    @k
    public final SerpElementResult cloneWithNewElements(@k List<? extends SerpElement> elements) {
        return new SerpElementResult(elements, this.count, this.lastStamp, this.subscriptionId, this.displayType, this.searchHint, this.xHash, this.firebaseParams, this.emptySearchText, this.emptySearchContent, this.nextPageId, this.searchDescription, this.isSubscribed, this.isVerticalMain, this.isCrossVertical, this.shouldShowSaveSearch, this.onboarding, this.verticalId, this.uxFeedbackConfigs, this.categoryDetails, this.onDisplayClickstreamDeeplink, this.navigationBarStyle, this.additionalButtons, this.newSerpMapInteraction, this.sharingButton, null, 33554432, null);
    }

    @k
    public final List<SerpElement> component1() {
        return this.elements;
    }

    @l
    /* renamed from: component10, reason: from getter */
    public final EmptySearchContent getEmptySearchContent() {
        return this.emptySearchContent;
    }

    @l
    /* renamed from: component11, reason: from getter */
    public final String getNextPageId() {
        return this.nextPageId;
    }

    @l
    /* renamed from: component12, reason: from getter */
    public final SearchDescription getSearchDescription() {
        return this.searchDescription;
    }

    @l
    /* renamed from: component13, reason: from getter */
    public final Boolean getIsSubscribed() {
        return this.isSubscribed;
    }

    @l
    /* renamed from: component14, reason: from getter */
    public final Boolean getIsVerticalMain() {
        return this.isVerticalMain;
    }

    @l
    /* renamed from: component15, reason: from getter */
    public final Boolean getIsCrossVertical() {
        return this.isCrossVertical;
    }

    @l
    /* renamed from: component16, reason: from getter */
    public final Boolean getShouldShowSaveSearch() {
        return this.shouldShowSaveSearch;
    }

    @l
    /* renamed from: component17, reason: from getter */
    public final DeepLink getOnboarding() {
        return this.onboarding;
    }

    @l
    /* renamed from: component18, reason: from getter */
    public final Integer getVerticalId() {
        return this.verticalId;
    }

    @l
    public final List<UxFeedbackConfigOld> component19() {
        return this.uxFeedbackConfigs;
    }

    /* renamed from: component2, reason: from getter */
    public final long getCount() {
        return this.count;
    }

    @l
    /* renamed from: component20, reason: from getter */
    public final SerpResultCategoryDetails getCategoryDetails() {
        return this.categoryDetails;
    }

    @l
    /* renamed from: component21, reason: from getter */
    public final DeepLink getOnDisplayClickstreamDeeplink() {
        return this.onDisplayClickstreamDeeplink;
    }

    @l
    /* renamed from: component22, reason: from getter */
    public final NavigationBarStyle getNavigationBarStyle() {
        return this.navigationBarStyle;
    }

    @l
    /* renamed from: component23, reason: from getter */
    public final AdditionalButtons getAdditionalButtons() {
        return this.additionalButtons;
    }

    @l
    /* renamed from: component24, reason: from getter */
    public final String getNewSerpMapInteraction() {
        return this.newSerpMapInteraction;
    }

    @l
    /* renamed from: component25, reason: from getter */
    public final SharingButton getSharingButton() {
        return this.sharingButton;
    }

    @l
    /* renamed from: component26, reason: from getter */
    public final SerpFloatingContainer getFloatingContainer() {
        return this.floatingContainer;
    }

    /* renamed from: component3, reason: from getter */
    public final long getLastStamp() {
        return this.lastStamp;
    }

    @l
    /* renamed from: component4, reason: from getter */
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @l
    /* renamed from: component6, reason: from getter */
    public final String getSearchHint() {
        return this.searchHint;
    }

    @l
    /* renamed from: component7, reason: from getter */
    public final String getXHash() {
        return this.xHash;
    }

    @l
    public final Map<String, String> component8() {
        return this.firebaseParams;
    }

    @l
    /* renamed from: component9, reason: from getter */
    public final String getEmptySearchText() {
        return this.emptySearchText;
    }

    @k
    public final SerpElementResult copy(@k List<? extends SerpElement> elements, long count, long lastStamp, @l String subscriptionId, @l SerpDisplayType displayType, @l String searchHint, @l String xHash, @l Map<String, String> firebaseParams, @l String emptySearchText, @l EmptySearchContent emptySearchContent, @l String nextPageId, @l SearchDescription searchDescription, @l Boolean isSubscribed, @l Boolean isVerticalMain, @l Boolean isCrossVertical, @l Boolean shouldShowSaveSearch, @l DeepLink onboarding, @l Integer verticalId, @l List<UxFeedbackConfigOld> uxFeedbackConfigs, @l SerpResultCategoryDetails categoryDetails, @l DeepLink onDisplayClickstreamDeeplink, @l NavigationBarStyle navigationBarStyle, @l AdditionalButtons additionalButtons, @l String newSerpMapInteraction, @l SharingButton sharingButton, @l SerpFloatingContainer floatingContainer) {
        return new SerpElementResult(elements, count, lastStamp, subscriptionId, displayType, searchHint, xHash, firebaseParams, emptySearchText, emptySearchContent, nextPageId, searchDescription, isSubscribed, isVerticalMain, isCrossVertical, shouldShowSaveSearch, onboarding, verticalId, uxFeedbackConfigs, categoryDetails, onDisplayClickstreamDeeplink, navigationBarStyle, additionalButtons, newSerpMapInteraction, sharingButton, floatingContainer);
    }

    @Override // android.os.Parcelable
    public int describeContents() {
        return 0;
    }

    public boolean equals(@l Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SerpElementResult)) {
            return false;
        }
        SerpElementResult serpElementResult = (SerpElementResult) other;
        return L.f(this.elements, serpElementResult.elements) && this.count == serpElementResult.count && this.lastStamp == serpElementResult.lastStamp && L.f(this.subscriptionId, serpElementResult.subscriptionId) && this.displayType == serpElementResult.displayType && L.f(this.searchHint, serpElementResult.searchHint) && L.f(this.xHash, serpElementResult.xHash) && L.f(this.firebaseParams, serpElementResult.firebaseParams) && L.f(this.emptySearchText, serpElementResult.emptySearchText) && L.f(this.emptySearchContent, serpElementResult.emptySearchContent) && L.f(this.nextPageId, serpElementResult.nextPageId) && L.f(this.searchDescription, serpElementResult.searchDescription) && L.f(this.isSubscribed, serpElementResult.isSubscribed) && L.f(this.isVerticalMain, serpElementResult.isVerticalMain) && L.f(this.isCrossVertical, serpElementResult.isCrossVertical) && L.f(this.shouldShowSaveSearch, serpElementResult.shouldShowSaveSearch) && L.f(this.onboarding, serpElementResult.onboarding) && L.f(this.verticalId, serpElementResult.verticalId) && L.f(this.uxFeedbackConfigs, serpElementResult.uxFeedbackConfigs) && L.f(this.categoryDetails, serpElementResult.categoryDetails) && L.f(this.onDisplayClickstreamDeeplink, serpElementResult.onDisplayClickstreamDeeplink) && L.f(this.navigationBarStyle, serpElementResult.navigationBarStyle) && L.f(this.additionalButtons, serpElementResult.additionalButtons) && L.f(this.newSerpMapInteraction, serpElementResult.newSerpMapInteraction) && L.f(this.sharingButton, serpElementResult.sharingButton) && L.f(this.floatingContainer, serpElementResult.floatingContainer);
    }

    @l
    public final AdditionalButtons getAdditionalButtons() {
        return this.additionalButtons;
    }

    @l
    public final SerpResultCategoryDetails getCategoryDetails() {
        return this.categoryDetails;
    }

    public final long getCount() {
        return this.count;
    }

    @k
    public final List<SerpElement> getElements() {
        return this.elements;
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
    public final Map<String, String> getFirebaseParams() {
        return this.firebaseParams;
    }

    @l
    public final SerpFloatingContainer getFloatingContainer() {
        return this.floatingContainer;
    }

    public final long getLastStamp() {
        return this.lastStamp;
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
    public final SearchDescription getSearchDescription() {
        return this.searchDescription;
    }

    @l
    public final String getSearchHint() {
        return this.searchHint;
    }

    @k
    public final SerpDisplayType getSerpDisplayType() {
        return SerpDisplayTypeKt.orDefault(this.displayType);
    }

    @l
    public final SharingButton getSharingButton() {
        return this.sharingButton;
    }

    @l
    public final Boolean getShouldShowSaveSearch() {
        return this.shouldShowSaveSearch;
    }

    @l
    public final String getSubscriptionId() {
        return this.subscriptionId;
    }

    @l
    public final List<UxFeedbackConfigOld> getUxFeedbackConfigs() {
        return this.uxFeedbackConfigs;
    }

    @l
    public final Integer getVerticalId() {
        return this.verticalId;
    }

    @l
    public final String getXHash() {
        return this.xHash;
    }

    public int hashCode() {
        int iG2 = r.g(r.g(this.elements.hashCode() * 31, 31, this.count), 31, this.lastStamp);
        String str = this.subscriptionId;
        int iHashCode = (iG2 + (str == null ? 0 : str.hashCode())) * 31;
        SerpDisplayType serpDisplayType = this.displayType;
        int iHashCode2 = (iHashCode + (serpDisplayType == null ? 0 : serpDisplayType.hashCode())) * 31;
        String str2 = this.searchHint;
        int iHashCode3 = (iHashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.xHash;
        int iHashCode4 = (iHashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        Map<String, String> map = this.firebaseParams;
        int iHashCode5 = (iHashCode4 + (map == null ? 0 : map.hashCode())) * 31;
        String str4 = this.emptySearchText;
        int iHashCode6 = (iHashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31;
        EmptySearchContent emptySearchContent = this.emptySearchContent;
        int iHashCode7 = (iHashCode6 + (emptySearchContent == null ? 0 : emptySearchContent.hashCode())) * 31;
        String str5 = this.nextPageId;
        int iHashCode8 = (iHashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        SearchDescription searchDescription = this.searchDescription;
        int iHashCode9 = (iHashCode8 + (searchDescription == null ? 0 : searchDescription.hashCode())) * 31;
        Boolean bool = this.isSubscribed;
        int iHashCode10 = (iHashCode9 + (bool == null ? 0 : bool.hashCode())) * 31;
        Boolean bool2 = this.isVerticalMain;
        int iHashCode11 = (iHashCode10 + (bool2 == null ? 0 : bool2.hashCode())) * 31;
        Boolean bool3 = this.isCrossVertical;
        int iHashCode12 = (iHashCode11 + (bool3 == null ? 0 : bool3.hashCode())) * 31;
        Boolean bool4 = this.shouldShowSaveSearch;
        int iHashCode13 = (iHashCode12 + (bool4 == null ? 0 : bool4.hashCode())) * 31;
        DeepLink deepLink = this.onboarding;
        int iHashCode14 = (iHashCode13 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Integer num = this.verticalId;
        int iHashCode15 = (iHashCode14 + (num == null ? 0 : num.hashCode())) * 31;
        List<UxFeedbackConfigOld> list = this.uxFeedbackConfigs;
        int iHashCode16 = (iHashCode15 + (list == null ? 0 : list.hashCode())) * 31;
        SerpResultCategoryDetails serpResultCategoryDetails = this.categoryDetails;
        int iHashCode17 = (iHashCode16 + (serpResultCategoryDetails == null ? 0 : serpResultCategoryDetails.hashCode())) * 31;
        DeepLink deepLink2 = this.onDisplayClickstreamDeeplink;
        int iHashCode18 = (iHashCode17 + (deepLink2 == null ? 0 : deepLink2.hashCode())) * 31;
        NavigationBarStyle navigationBarStyle = this.navigationBarStyle;
        int iHashCode19 = (iHashCode18 + (navigationBarStyle == null ? 0 : navigationBarStyle.hashCode())) * 31;
        AdditionalButtons additionalButtons = this.additionalButtons;
        int iHashCode20 = (iHashCode19 + (additionalButtons == null ? 0 : additionalButtons.hashCode())) * 31;
        String str6 = this.newSerpMapInteraction;
        int iHashCode21 = (iHashCode20 + (str6 == null ? 0 : str6.hashCode())) * 31;
        SharingButton sharingButton = this.sharingButton;
        int iHashCode22 = (iHashCode21 + (sharingButton == null ? 0 : sharingButton.hashCode())) * 31;
        SerpFloatingContainer serpFloatingContainer = this.floatingContainer;
        return iHashCode22 + (serpFloatingContainer != null ? serpFloatingContainer.hashCode() : 0);
    }

    @l
    public final Boolean isCrossVertical() {
        return this.isCrossVertical;
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
        return "SerpElementResult(elements=" + this.elements + ", count=" + this.count + ", lastStamp=" + this.lastStamp + ", subscriptionId=" + this.subscriptionId + ", displayType=" + this.displayType + ", searchHint=" + this.searchHint + ", xHash=" + this.xHash + ", firebaseParams=" + this.firebaseParams + ", emptySearchText=" + this.emptySearchText + ", emptySearchContent=" + this.emptySearchContent + ", nextPageId=" + this.nextPageId + ", searchDescription=" + this.searchDescription + ", isSubscribed=" + this.isSubscribed + ", isVerticalMain=" + this.isVerticalMain + ", isCrossVertical=" + this.isCrossVertical + ", shouldShowSaveSearch=" + this.shouldShowSaveSearch + ", onboarding=" + this.onboarding + ", verticalId=" + this.verticalId + ", uxFeedbackConfigs=" + this.uxFeedbackConfigs + ", categoryDetails=" + this.categoryDetails + ", onDisplayClickstreamDeeplink=" + this.onDisplayClickstreamDeeplink + ", navigationBarStyle=" + this.navigationBarStyle + ", additionalButtons=" + this.additionalButtons + ", newSerpMapInteraction=" + this.newSerpMapInteraction + ", sharingButton=" + this.sharingButton + ", floatingContainer=" + this.floatingContainer + ')';
    }

    @Override // android.os.Parcelable
    public void writeToParcel(@k Parcel parcel, int flags) {
        SerpElementOptimizedParceler.INSTANCE.write((List<? extends SerpElement>) this.elements, parcel, flags);
        parcel.writeLong(this.count);
        parcel.writeLong(this.lastStamp);
        parcel.writeString(this.subscriptionId);
        SerpDisplayType serpDisplayType = this.displayType;
        if (serpDisplayType == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            parcel.writeString(serpDisplayType.name());
        }
        parcel.writeString(this.searchHint);
        parcel.writeString(this.xHash);
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
        parcel.writeString(this.emptySearchText);
        EmptySearchContent emptySearchContent = this.emptySearchContent;
        if (emptySearchContent == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            emptySearchContent.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.nextPageId);
        parcel.writeParcelable(this.searchDescription, flags);
        Boolean bool = this.isSubscribed;
        if (bool == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool);
        }
        Boolean bool2 = this.isVerticalMain;
        if (bool2 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool2);
        }
        Boolean bool3 = this.isCrossVertical;
        if (bool3 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool3);
        }
        Boolean bool4 = this.shouldShowSaveSearch;
        if (bool4 == null) {
            parcel.writeInt(0);
        } else {
            C0.l(parcel, 1, bool4);
        }
        parcel.writeParcelable(this.onboarding, flags);
        Integer num = this.verticalId;
        if (num == null) {
            parcel.writeInt(0);
        } else {
            a.C(parcel, 1, num);
        }
        List<UxFeedbackConfigOld> list = this.uxFeedbackConfigs;
        if (list == null) {
            parcel.writeInt(0);
        } else {
            Iterator itA = a.A(list, parcel, 1);
            while (itA.hasNext()) {
                parcel.writeParcelable((Parcelable) itA.next(), flags);
            }
        }
        parcel.writeParcelable(this.categoryDetails, flags);
        parcel.writeParcelable(this.onDisplayClickstreamDeeplink, flags);
        parcel.writeParcelable(this.navigationBarStyle, flags);
        AdditionalButtons additionalButtons = this.additionalButtons;
        if (additionalButtons == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            additionalButtons.writeToParcel(parcel, flags);
        }
        parcel.writeString(this.newSerpMapInteraction);
        SharingButton sharingButton = this.sharingButton;
        if (sharingButton == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            sharingButton.writeToParcel(parcel, flags);
        }
        SerpFloatingContainer serpFloatingContainer = this.floatingContainer;
        if (serpFloatingContainer == null) {
            parcel.writeInt(0);
        } else {
            parcel.writeInt(1);
            serpFloatingContainer.writeToParcel(parcel, flags);
        }
    }

    public /* synthetic */ SerpElementResult(List list, long j12, long j13, String str, SerpDisplayType serpDisplayType, String str2, String str3, Map map, String str4, EmptySearchContent emptySearchContent, String str5, SearchDescription searchDescription, Boolean bool, Boolean bool2, Boolean bool3, Boolean bool4, DeepLink deepLink, Integer num, List list2, SerpResultCategoryDetails serpResultCategoryDetails, DeepLink deepLink2, NavigationBarStyle navigationBarStyle, AdditionalButtons additionalButtons, String str6, SharingButton sharingButton, SerpFloatingContainer serpFloatingContainer, int i12, C42822w c42822w) {
        this(list, (i12 & 2) != 0 ? 0L : j12, (i12 & 4) == 0 ? j13 : 0L, (i12 & 8) != 0 ? null : str, (i12 & 16) != 0 ? null : serpDisplayType, (i12 & 32) != 0 ? null : str2, (i12 & 64) != 0 ? null : str3, (i12 & 128) != 0 ? null : map, (i12 & 256) != 0 ? null : str4, (i12 & 512) != 0 ? null : emptySearchContent, (i12 & 1024) != 0 ? null : str5, (i12 & 2048) != 0 ? null : searchDescription, (i12 & 4096) != 0 ? null : bool, (i12 & 8192) != 0 ? null : bool2, (i12 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : bool3, (i12 & 32768) != 0 ? null : bool4, (i12 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : deepLink, (i12 & 131072) != 0 ? null : num, (i12 & 262144) != 0 ? null : list2, (i12 & 524288) != 0 ? null : serpResultCategoryDetails, (i12 & 1048576) != 0 ? null : deepLink2, (i12 & 2097152) != 0 ? null : navigationBarStyle, (i12 & 4194304) != 0 ? null : additionalButtons, (i12 & 8388608) != 0 ? null : str6, (i12 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? null : sharingButton, (i12 & 33554432) != 0 ? null : serpFloatingContainer);
    }
}
