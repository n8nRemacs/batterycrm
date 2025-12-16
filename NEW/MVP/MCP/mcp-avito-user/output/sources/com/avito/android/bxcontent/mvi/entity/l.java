package com.avito.android.bxcontent.mvi.entity;

import androidx.compose.foundation.H;
import androidx.media3.common.C23088b;
import com.avito.android.AnalyticParams;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.model.AdvertListAdditionalTopics;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.home.appending_item.loader.AppendingLoaderItem;
import com.avito.android.home.appending_item.retry.AppendingRetryItem;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.NavigationBarStyle;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpDisplayType;
import com.avito.android.remote.model.SerpSpaceType;
import com.avito.android.remote.model.ToolbarConfig;
import com.avito.android.remote.model.ToolbarShareButton;
import com.avito.android.remote.model.search.Filter;
import com.avito.android.remote.model.serpomap_behavior.SwitchSerpMapButtonState;
import com.avito.android.remote.model.ux_feedback.UxFeedbackConfigOld;
import com.avito.android.scroll_tracker.d;
import com.avito.android.scroll_tracker.i;
import com.avito.android.serp.CallInfo;
import com.avito.android.serp.adapter.LayoutType;
import com.avito.android.serp.adapter.home_section_tab.SectionTagsItem;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.mini_menu.MiniMenuBlockItem;
import com.avito.android.serp.adapter.mini_menu.item.MiniMenuItem;
import com.avito.android.shortcut_navigation_bar.InlineAction;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import com.avito.android.visual_rubricator.VisualRubricatorWidgetItem;
import com.avito.android.visual_rubricator.element.VisualRubricatorWidgetElementItem;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.collections.P0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import shark.AndroidResourceIdNames;

/* compiled from: BxContentState.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/l;", "Lcom/avito/android/analytics/screens/mvi/q;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class l extends com.avito.android.analytics.screens.mvi.q {

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final a f112297o0 = new a(null);

    /* renamed from: A, reason: collision with root package name */
    @Y61.l
    public final SearchParams f112298A;

    /* renamed from: B, reason: collision with root package name */
    public final boolean f112299B;

    /* renamed from: C, reason: collision with root package name */
    public final boolean f112300C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.l
    public final ToolbarConfig f112301D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.l
    public final ToolbarShareButton f112302E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.l
    public final NavigationBarStyle f112303F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.l
    public final String f112304G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.l
    public final String f112305H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final PresentationType f112306I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final SerpSpaceType f112307J;

    /* renamed from: K, reason: collision with root package name */
    @Y61.k
    public final String f112308K;

    /* renamed from: L, reason: collision with root package name */
    public final int f112309L;

    /* renamed from: M, reason: collision with root package name */
    @Y61.l
    public final String f112310M;

    /* renamed from: N, reason: collision with root package name */
    @Y61.l
    public final LayoutType f112311N;

    /* renamed from: O, reason: collision with root package name */
    @Y61.l
    public final Long f112312O;

    /* renamed from: P, reason: collision with root package name */
    @Y61.l
    public final String f112313P;

    /* renamed from: Q, reason: collision with root package name */
    @Y61.l
    public final String f112314Q;

    /* renamed from: R, reason: collision with root package name */
    @Y61.l
    public final List<String> f112315R;

    /* renamed from: S, reason: collision with root package name */
    @Y61.l
    public final AnalyticParams f112316S;

    /* renamed from: T, reason: collision with root package name */
    @Y61.l
    public final AdvertListAdditionalTopics f112317T;

    /* renamed from: U, reason: collision with root package name */
    @Y61.l
    public final Boolean f112318U;

    /* renamed from: V, reason: collision with root package name */
    @Y61.k
    public final w f112319V;

    /* renamed from: W, reason: collision with root package name */
    @Y61.l
    public final B f112320W;

    /* renamed from: X, reason: collision with root package name */
    @Y61.l
    public final List<UxFeedbackConfigOld> f112321X;

    /* renamed from: Y, reason: collision with root package name */
    @Y61.l
    public final z f112322Y;

    /* renamed from: Z, reason: collision with root package name */
    @Y61.l
    public final x f112323Z;

    /* renamed from: a0, reason: collision with root package name */
    @Y61.k
    public final C29126a f112324a0;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final List<ShortcutNavigationItem> f112325b;

    /* renamed from: b0, reason: collision with root package name */
    @Y61.l
    public final String f112326b0;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final LoadState f112327c;

    /* renamed from: c0, reason: collision with root package name */
    @Y61.k
    public final v f112328c0;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final com.avito.android.serp.adapter.home_section_tab.a f112329d;

    /* renamed from: d0, reason: collision with root package name */
    @Y61.k
    public final s f112330d0;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final SectionTagsItem f112331e;

    /* renamed from: e0, reason: collision with root package name */
    @Y61.l
    public final A f112332e0;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final FeedId f112333f;

    /* renamed from: f0, reason: collision with root package name */
    @Y61.k
    public final C f112334f0;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final List<l1> f112335g;

    /* renamed from: g0, reason: collision with root package name */
    @Y61.k
    public final y f112336g0;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Map<FeedId, t> f112337h;

    /* renamed from: h0, reason: collision with root package name */
    @Y61.l
    public final Filter f112338h0;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final LoadState f112339i;

    /* renamed from: i0, reason: collision with root package name */
    public final boolean f112340i0;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final SerpDisplayType f112341j;

    /* renamed from: j0, reason: collision with root package name */
    @Y61.l
    public final String f112342j0;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final Location f112343k;

    /* renamed from: k0, reason: collision with root package name */
    @Y61.k
    public final SwitchSerpMapButtonState f112344k0;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final SearchParams f112345l;

    /* renamed from: l0, reason: collision with root package name */
    public final boolean f112346l0;

    /* renamed from: m, reason: collision with root package name */
    @Y61.l
    public final String f112347m;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final q f112348m0;

    /* renamed from: n, reason: collision with root package name */
    @Y61.l
    public final String f112349n;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.l
    public final u f112350n0;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final String f112351o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.l
    public final DeepLink f112352p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.l
    public final Integer f112353q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.l
    public final CallInfo f112354r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.l
    public final String f112355s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.l
    public final d.a f112356t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.l
    public final i.a f112357u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.l
    public final Long f112358v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.l
    public final l1 f112359w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final InlineAction.Predefined.State f112360x;

    /* renamed from: y, reason: collision with root package name */
    public final boolean f112361y;

    /* renamed from: z, reason: collision with root package name */
    public final boolean f112362z;

    /* compiled from: BxContentState.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/l$a;", "", "<init>", "()V", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(List list, LoadState loadState, com.avito.android.serp.adapter.home_section_tab.a aVar, SectionTagsItem sectionTagsItem, FeedId feedId, List list2, Map map, LoadState loadState2, SerpDisplayType serpDisplayType, Location location, SearchParams searchParams, String str, String str2, String str3, DeepLink deepLink, Integer num, CallInfo callInfo, String str4, d.a aVar2, i.a aVar3, Long l12, l1 l1Var, InlineAction.Predefined.State state, boolean z12, boolean z13, SearchParams searchParams2, boolean z14, boolean z15, ToolbarConfig toolbarConfig, ToolbarShareButton toolbarShareButton, NavigationBarStyle navigationBarStyle, String str5, String str6, PresentationType presentationType, SerpSpaceType serpSpaceType, String str7, int i12, String str8, LayoutType layoutType, Long l13, String str9, String str10, List list3, AnalyticParams analyticParams, AdvertListAdditionalTopics advertListAdditionalTopics, Boolean bool, w wVar, B b12, List list4, z zVar, x xVar, C29126a c29126a, String str11, v vVar, s sVar, A a12, C c12, y yVar, Filter filter, boolean z16, String str12, SwitchSerpMapButtonState switchSerpMapButtonState, boolean z17, q qVar, u uVar, int i13, int i14, int i15, C42822w c42822w) {
        FeedId feedId2;
        C29126a c29126a2;
        v vVar2;
        s sVar2;
        C c13;
        Filter filter2;
        boolean z18;
        y yVar2;
        List list5 = (i13 & 1) != 0 ? null : list;
        com.avito.android.serp.adapter.home_section_tab.a aVar4 = (i13 & 4) != 0 ? null : aVar;
        SectionTagsItem sectionTagsItem2 = (i13 & 8) != 0 ? null : sectionTagsItem;
        if ((i13 & 16) != 0) {
            FeedId.f112034d.getClass();
            feedId2 = FeedId.f112035e;
        } else {
            feedId2 = feedId;
        }
        List list6 = (i13 & 32) != 0 ? C42784z0.f406748b : list2;
        Map mapC = (i13 & 64) != 0 ? P0.c() : map;
        Location location2 = (i13 & 512) != 0 ? null : location;
        SearchParams empty = (i13 & 1024) != 0 ? SearchParams.INSTANCE.getEMPTY() : searchParams;
        String str13 = (i13 & 2048) != 0 ? null : str;
        String str14 = (i13 & 4096) != 0 ? null : str2;
        String str15 = (i13 & 8192) != 0 ? "initial_appearance" : str3;
        DeepLink deepLink2 = (i13 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? null : deepLink;
        Integer num2 = (32768 & i13) != 0 ? null : num;
        CallInfo callInfo2 = (i13 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? null : callInfo;
        String str16 = (i13 & 131072) != 0 ? null : str4;
        d.a aVar5 = (i13 & 262144) != 0 ? null : aVar2;
        i.a aVar6 = (i13 & 524288) != 0 ? null : aVar3;
        Long l14 = (i13 & 1048576) != 0 ? null : l12;
        l1 l1Var2 = (i13 & 2097152) != 0 ? null : l1Var;
        boolean z19 = (i13 & 8388608) != 0 ? false : z12;
        boolean z22 = (i13 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? false : z13;
        SearchParams searchParams3 = (i13 & 33554432) != 0 ? null : searchParams2;
        boolean z23 = (i13 & 67108864) != 0 ? false : z14;
        boolean z24 = (i13 & 134217728) != 0 ? true : z15;
        ToolbarConfig toolbarConfig2 = (i13 & 268435456) != 0 ? null : toolbarConfig;
        ToolbarShareButton toolbarShareButton2 = (i13 & 536870912) != 0 ? null : toolbarShareButton;
        NavigationBarStyle navigationBarStyle2 = (i13 & 1073741824) != 0 ? null : navigationBarStyle;
        String str17 = (i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? null : str5;
        String str18 = (i14 & 1) != 0 ? null : str6;
        int i16 = (i14 & 16) != 0 ? 3 : i12;
        String str19 = (i14 & 32) != 0 ? null : str8;
        LayoutType layoutType2 = (i14 & 64) != 0 ? null : layoutType;
        Long l15 = (i14 & 128) != 0 ? null : l13;
        String str20 = (i14 & 256) != 0 ? null : str9;
        String str21 = (i14 & 512) != 0 ? null : str10;
        List list7 = (i14 & 1024) != 0 ? null : list3;
        AnalyticParams analyticParams2 = (i14 & 2048) != 0 ? null : analyticParams;
        AdvertListAdditionalTopics advertListAdditionalTopics2 = (i14 & 4096) != 0 ? null : advertListAdditionalTopics;
        Boolean bool2 = (i14 & 8192) != 0 ? null : bool;
        List list8 = (65536 & i14) != 0 ? null : list4;
        z zVar2 = (i14 & 131072) != 0 ? null : zVar;
        x xVar2 = (i14 & 262144) != 0 ? null : xVar;
        if ((i14 & 524288) != 0) {
            C29126a.f112054c.getClass();
            c29126a2 = C29126a.f112055d;
        } else {
            c29126a2 = c29126a;
        }
        String str22 = (1048576 & i14) != 0 ? null : str11;
        if ((i14 & 2097152) != 0) {
            v.f112432c.getClass();
            vVar2 = v.f112433d;
        } else {
            vVar2 = vVar;
        }
        if ((4194304 & i14) != 0) {
            s.f112419b.getClass();
            sVar2 = s.f112420c;
        } else {
            sVar2 = sVar;
        }
        A a13 = (i14 & 8388608) != 0 ? null : a12;
        if ((i14 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0) {
            C.f112030c.getClass();
            c13 = C.f112031d;
        } else {
            c13 = c12;
        }
        if ((i14 & 33554432) != 0) {
            filter2 = null;
            z18 = false;
            yVar2 = new y(false, null, 3, null);
        } else {
            filter2 = null;
            z18 = false;
            yVar2 = yVar;
        }
        this(list5, loadState, aVar4, sectionTagsItem2, feedId2, list6, mapC, loadState2, serpDisplayType, location2, empty, str13, str14, str15, deepLink2, num2, callInfo2, str16, aVar5, aVar6, l14, l1Var2, state, z19, z22, searchParams3, z23, z24, toolbarConfig2, toolbarShareButton2, navigationBarStyle2, str17, str18, presentationType, serpSpaceType, str7, i16, str19, layoutType2, l15, str20, str21, list7, analyticParams2, advertListAdditionalTopics2, bool2, wVar, b12, list8, zVar2, xVar2, c29126a2, str22, vVar2, sVar2, a13, c13, yVar2, (i14 & 67108864) != 0 ? filter2 : filter, (i14 & 134217728) != 0 ? z18 : z16, (268435456 & i14) != 0 ? filter2 : str12, (536870912 & i14) != 0 ? new SwitchSerpMapButtonState(null, 0.0f, false, false, 15, null) : switchSerpMapButtonState, (i14 & 1073741824) != 0 ? z18 : z17, qVar, (i15 & 1) != 0 ? filter2 : uVar);
    }

    public static l a(l lVar, List list, LoadState loadState, com.avito.android.serp.adapter.home_section_tab.a aVar, SectionTagsItem sectionTagsItem, FeedId feedId, List list2, Map map, LoadState loadState2, SerpDisplayType serpDisplayType, Location location, SearchParams searchParams, String str, String str2, String str3, Integer num, CallInfo callInfo, String str4, l1 l1Var, InlineAction.Predefined.State state, boolean z12, boolean z13, SearchParams searchParams2, boolean z14, boolean z15, ToolbarConfig toolbarConfig, ToolbarShareButton toolbarShareButton, NavigationBarStyle navigationBarStyle, String str5, int i12, String str6, LayoutType layoutType, Long l12, w wVar, B b12, List list3, z zVar, x xVar, C29126a c29126a, v vVar, s sVar, A a12, C c12, y yVar, Filter filter, boolean z16, String str7, SwitchSerpMapButtonState switchSerpMapButtonState, boolean z17, q qVar, u uVar, int i13, int i14, int i15) {
        d.a aVar2;
        l1 l1Var2;
        PresentationType presentationType;
        int i16;
        String str8;
        v vVar2;
        List list4 = (i13 & 1) != 0 ? lVar.f112325b : list;
        LoadState loadState3 = (i13 & 2) != 0 ? lVar.f112327c : loadState;
        com.avito.android.serp.adapter.home_section_tab.a aVar3 = (i13 & 4) != 0 ? lVar.f112329d : aVar;
        SectionTagsItem sectionTagsItem2 = (i13 & 8) != 0 ? lVar.f112331e : sectionTagsItem;
        FeedId feedId2 = (i13 & 16) != 0 ? lVar.f112333f : feedId;
        List list5 = (i13 & 32) != 0 ? lVar.f112335g : list2;
        Map map2 = (i13 & 64) != 0 ? lVar.f112337h : map;
        LoadState loadState4 = (i13 & 128) != 0 ? lVar.f112339i : loadState2;
        SerpDisplayType serpDisplayType2 = (i13 & 256) != 0 ? lVar.f112341j : serpDisplayType;
        Location location2 = (i13 & 512) != 0 ? lVar.f112343k : location;
        SearchParams searchParams3 = (i13 & 1024) != 0 ? lVar.f112345l : searchParams;
        String str9 = (i13 & 2048) != 0 ? lVar.f112347m : str;
        String str10 = (i13 & 4096) != 0 ? lVar.f112349n : str2;
        String str11 = (i13 & 8192) != 0 ? lVar.f112351o : str3;
        DeepLink deepLink = lVar.f112352p;
        Integer num2 = (i13 & 32768) != 0 ? lVar.f112353q : num;
        CallInfo callInfo2 = (i13 & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? lVar.f112354r : callInfo;
        String str12 = (i13 & 131072) != 0 ? lVar.f112355s : str4;
        d.a aVar4 = lVar.f112356t;
        i.a aVar5 = lVar.f112357u;
        Long l13 = lVar.f112358v;
        if ((i13 & 2097152) != 0) {
            aVar2 = aVar4;
            l1Var2 = lVar.f112359w;
        } else {
            aVar2 = aVar4;
            l1Var2 = l1Var;
        }
        InlineAction.Predefined.State state2 = (i13 & 4194304) != 0 ? lVar.f112360x : state;
        boolean z18 = (i13 & 8388608) != 0 ? lVar.f112361y : z12;
        boolean z19 = (i13 & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? lVar.f112362z : z13;
        SearchParams searchParams4 = (i13 & 33554432) != 0 ? lVar.f112298A : searchParams2;
        boolean z22 = (i13 & 67108864) != 0 ? lVar.f112299B : z14;
        boolean z23 = (i13 & 134217728) != 0 ? lVar.f112300C : z15;
        ToolbarConfig toolbarConfig2 = (i13 & 268435456) != 0 ? lVar.f112301D : toolbarConfig;
        ToolbarShareButton toolbarShareButton2 = (i13 & 536870912) != 0 ? lVar.f112302E : toolbarShareButton;
        NavigationBarStyle navigationBarStyle2 = (i13 & 1073741824) != 0 ? lVar.f112303F : navigationBarStyle;
        String str13 = (i13 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? lVar.f112304G : str5;
        String str14 = lVar.f112305H;
        PresentationType presentationType2 = lVar.f112306I;
        SerpSpaceType serpSpaceType = lVar.f112307J;
        String str15 = lVar.f112308K;
        if ((i14 & 16) != 0) {
            presentationType = presentationType2;
            i16 = lVar.f112309L;
        } else {
            presentationType = presentationType2;
            i16 = i12;
        }
        String str16 = (i14 & 32) != 0 ? lVar.f112310M : str6;
        LayoutType layoutType2 = (i14 & 64) != 0 ? lVar.f112311N : layoutType;
        Long l14 = (i14 & 128) != 0 ? lVar.f112312O : l12;
        String str17 = lVar.f112313P;
        String str18 = lVar.f112314Q;
        List<String> list6 = lVar.f112315R;
        AnalyticParams analyticParams = lVar.f112316S;
        AdvertListAdditionalTopics advertListAdditionalTopics = lVar.f112317T;
        Boolean bool = lVar.f112318U;
        w wVar2 = (i14 & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? lVar.f112319V : wVar;
        B b13 = (32768 & i14) != 0 ? lVar.f112320W : b12;
        List list7 = (65536 & i14) != 0 ? lVar.f112321X : list3;
        z zVar2 = (131072 & i14) != 0 ? lVar.f112322Y : zVar;
        x xVar2 = (262144 & i14) != 0 ? lVar.f112323Z : xVar;
        C29126a c29126a2 = (524288 & i14) != 0 ? lVar.f112324a0 : c29126a;
        String str19 = lVar.f112326b0;
        if ((i14 & 2097152) != 0) {
            str8 = str19;
            vVar2 = lVar.f112328c0;
        } else {
            str8 = str19;
            vVar2 = vVar;
        }
        s sVar2 = (4194304 & i14) != 0 ? lVar.f112330d0 : sVar;
        A a13 = (8388608 & i14) != 0 ? lVar.f112332e0 : a12;
        C c13 = (16777216 & i14) != 0 ? lVar.f112334f0 : c12;
        y yVar2 = (33554432 & i14) != 0 ? lVar.f112336g0 : yVar;
        Filter filter2 = (67108864 & i14) != 0 ? lVar.f112338h0 : filter;
        boolean z24 = (134217728 & i14) != 0 ? lVar.f112340i0 : z16;
        String str20 = (268435456 & i14) != 0 ? lVar.f112342j0 : str7;
        SwitchSerpMapButtonState switchSerpMapButtonState2 = (536870912 & i14) != 0 ? lVar.f112344k0 : switchSerpMapButtonState;
        boolean z25 = (1073741824 & i14) != 0 ? lVar.f112346l0 : z17;
        q qVar2 = (i14 & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? lVar.f112348m0 : qVar;
        u uVar2 = (i15 & 1) != 0 ? lVar.f112350n0 : uVar;
        lVar.getClass();
        return new l(list4, loadState3, aVar3, sectionTagsItem2, feedId2, list5, map2, loadState4, serpDisplayType2, location2, searchParams3, str9, str10, str11, deepLink, num2, callInfo2, str12, aVar2, aVar5, l13, l1Var2, state2, z18, z19, searchParams4, z22, z23, toolbarConfig2, toolbarShareButton2, navigationBarStyle2, str13, str14, presentationType, serpSpaceType, str15, i16, str16, layoutType2, l14, str17, str18, list6, analyticParams, advertListAdditionalTopics, bool, wVar2, b13, list7, zVar2, xVar2, c29126a2, str8, vVar2, sVar2, a13, c13, yVar2, filter2, z24, str20, switchSerpMapButtonState2, z25, qVar2, uVar2);
    }

    @Y61.k
    /* renamed from: c, reason: from getter */
    public final C29126a getF112324a0() {
        return this.f112324a0;
    }

    @Y61.k
    public final Map<FeedId, t> d() {
        return this.f112337h;
    }

    @Y61.l
    public final String e() {
        return C35800g5.a(new C35792f5(this.f112304G));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof l)) {
            return false;
        }
        l lVar = (l) obj;
        return L.f(this.f112325b, lVar.f112325b) && this.f112327c == lVar.f112327c && L.f(this.f112329d, lVar.f112329d) && L.f(this.f112331e, lVar.f112331e) && L.f(this.f112333f, lVar.f112333f) && L.f(this.f112335g, lVar.f112335g) && L.f(this.f112337h, lVar.f112337h) && this.f112339i == lVar.f112339i && this.f112341j == lVar.f112341j && L.f(this.f112343k, lVar.f112343k) && L.f(this.f112345l, lVar.f112345l) && L.f(this.f112347m, lVar.f112347m) && L.f(this.f112349n, lVar.f112349n) && L.f(this.f112351o, lVar.f112351o) && L.f(this.f112352p, lVar.f112352p) && L.f(this.f112353q, lVar.f112353q) && L.f(this.f112354r, lVar.f112354r) && L.f(this.f112355s, lVar.f112355s) && L.f(this.f112356t, lVar.f112356t) && L.f(this.f112357u, lVar.f112357u) && L.f(this.f112358v, lVar.f112358v) && L.f(this.f112359w, lVar.f112359w) && this.f112360x == lVar.f112360x && this.f112361y == lVar.f112361y && this.f112362z == lVar.f112362z && L.f(this.f112298A, lVar.f112298A) && this.f112299B == lVar.f112299B && this.f112300C == lVar.f112300C && L.f(this.f112301D, lVar.f112301D) && L.f(this.f112302E, lVar.f112302E) && L.f(this.f112303F, lVar.f112303F) && L.f(this.f112304G, lVar.f112304G) && L.f(this.f112305H, lVar.f112305H) && this.f112306I == lVar.f112306I && this.f112307J == lVar.f112307J && L.f(this.f112308K, lVar.f112308K) && this.f112309L == lVar.f112309L && L.f(this.f112310M, lVar.f112310M) && this.f112311N == lVar.f112311N && L.f(this.f112312O, lVar.f112312O) && L.f(this.f112313P, lVar.f112313P) && L.f(this.f112314Q, lVar.f112314Q) && L.f(this.f112315R, lVar.f112315R) && L.f(this.f112316S, lVar.f112316S) && L.f(this.f112317T, lVar.f112317T) && L.f(this.f112318U, lVar.f112318U) && L.f(this.f112319V, lVar.f112319V) && L.f(this.f112320W, lVar.f112320W) && L.f(this.f112321X, lVar.f112321X) && L.f(this.f112322Y, lVar.f112322Y) && L.f(this.f112323Z, lVar.f112323Z) && L.f(this.f112324a0, lVar.f112324a0) && L.f(this.f112326b0, lVar.f112326b0) && L.f(this.f112328c0, lVar.f112328c0) && L.f(this.f112330d0, lVar.f112330d0) && L.f(this.f112332e0, lVar.f112332e0) && L.f(this.f112334f0, lVar.f112334f0) && L.f(this.f112336g0, lVar.f112336g0) && L.f(this.f112338h0, lVar.f112338h0) && this.f112340i0 == lVar.f112340i0 && L.f(this.f112342j0, lVar.f112342j0) && L.f(this.f112344k0, lVar.f112344k0) && this.f112346l0 == lVar.f112346l0 && L.f(this.f112348m0, lVar.f112348m0) && L.f(this.f112350n0, lVar.f112350n0);
    }

    @Y61.k
    public final t f() {
        t.f112422f.getClass();
        return this.f112337h.getOrDefault(this.f112333f, t.f112423g);
    }

    @Y61.k
    /* renamed from: g, reason: from getter */
    public final FeedId getF112333f() {
        return this.f112333f;
    }

    @Y61.l
    public final String getLocationId() {
        String id2;
        Location location = this.f112343k;
        return (location == null || (id2 = location.getId()) == null) ? this.f112345l.getLocationId() : id2;
    }

    @Y61.k
    public final ArrayList h() {
        List<l1> list = f().f112428e;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            l1 l1Var = (l1) obj;
            if (!(l1Var instanceof AppendingLoaderItem) && !(l1Var instanceof AppendingRetryItem) && !(l1Var instanceof com.avito.android.serp.adapter.skeleton.f) && !(l1Var instanceof com.avito.android.serp.adapter.skeleton.j)) {
                if (l1Var instanceof MiniMenuBlockItem) {
                    List<MiniMenuItem> list2 = ((MiniMenuBlockItem) l1Var).f270308c;
                    if (!(list2 instanceof Collection) || !list2.isEmpty()) {
                        Iterator<T> it = list2.iterator();
                        while (it.hasNext()) {
                            if (((MiniMenuItem) it.next()).f270351g) {
                                break;
                            }
                        }
                    }
                }
                if (l1Var instanceof VisualRubricatorWidgetItem) {
                    List<VisualRubricatorWidgetElementItem> listH6 = ((VisualRubricatorWidgetItem) l1Var).h6();
                    if (!(listH6 instanceof Collection) || !listH6.isEmpty()) {
                        Iterator<T> it2 = listH6.iterator();
                        while (it2.hasNext()) {
                            if (((VisualRubricatorWidgetElementItem) it2.next()).getF327369l()) {
                                break;
                            }
                        }
                    }
                }
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final int hashCode() {
        List<ShortcutNavigationItem> list = this.f112325b;
        int iHashCode = (this.f112327c.hashCode() + ((list == null ? 0 : list.hashCode()) * 31)) * 31;
        com.avito.android.serp.adapter.home_section_tab.a aVar = this.f112329d;
        int iHashCode2 = (iHashCode + (aVar == null ? 0 : aVar.hashCode())) * 31;
        SectionTagsItem sectionTagsItem = this.f112331e;
        int iH2 = com.avito.android.actions_sheet.a.h(this.f112341j, (this.f112339i.hashCode() + AK.c.c(H.e((this.f112333f.hashCode() + ((iHashCode2 + (sectionTagsItem == null ? 0 : sectionTagsItem.hashCode())) * 31)) * 31, 31, this.f112335g), 31, this.f112337h)) * 31, 31);
        Location location = this.f112343k;
        int iHashCode3 = (this.f112345l.hashCode() + ((iH2 + (location == null ? 0 : location.hashCode())) * 31)) * 31;
        String str = this.f112347m;
        int iHashCode4 = (iHashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.f112349n;
        int iD2 = H.d((iHashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31, 31, this.f112351o);
        DeepLink deepLink = this.f112352p;
        int iHashCode5 = (iD2 + (deepLink == null ? 0 : deepLink.hashCode())) * 31;
        Integer num = this.f112353q;
        int iHashCode6 = (iHashCode5 + (num == null ? 0 : num.hashCode())) * 31;
        CallInfo callInfo = this.f112354r;
        int iHashCode7 = (iHashCode6 + (callInfo == null ? 0 : callInfo.hashCode())) * 31;
        String str3 = this.f112355s;
        int iHashCode8 = (iHashCode7 + (str3 == null ? 0 : str3.hashCode())) * 31;
        d.a aVar2 = this.f112356t;
        int iHashCode9 = (iHashCode8 + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        i.a aVar3 = this.f112357u;
        int iHashCode10 = (iHashCode9 + (aVar3 == null ? 0 : aVar3.hashCode())) * 31;
        Long l12 = this.f112358v;
        int iHashCode11 = (iHashCode10 + (l12 == null ? 0 : l12.hashCode())) * 31;
        l1 l1Var = this.f112359w;
        int i12 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((this.f112360x.hashCode() + ((iHashCode11 + (l1Var == null ? 0 : l1Var.hashCode())) * 31)) * 31, 31, this.f112361y), 31, this.f112362z);
        SearchParams searchParams = this.f112298A;
        int i13 = androidx.appcompat.app.r.i(androidx.appcompat.app.r.i((i12 + (searchParams == null ? 0 : searchParams.hashCode())) * 31, 31, this.f112299B), 31, this.f112300C);
        ToolbarConfig toolbarConfig = this.f112301D;
        int iHashCode12 = (i13 + (toolbarConfig == null ? 0 : toolbarConfig.hashCode())) * 31;
        ToolbarShareButton toolbarShareButton = this.f112302E;
        int iHashCode13 = (iHashCode12 + (toolbarShareButton == null ? 0 : toolbarShareButton.hashCode())) * 31;
        NavigationBarStyle navigationBarStyle = this.f112303F;
        int iHashCode14 = (iHashCode13 + (navigationBarStyle == null ? 0 : navigationBarStyle.hashCode())) * 31;
        String str4 = this.f112304G;
        int iHashCode15 = (iHashCode14 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.f112305H;
        int iE2 = androidx.appcompat.app.r.e(this.f112309L, H.d((this.f112307J.hashCode() + ((this.f112306I.hashCode() + ((iHashCode15 + (str5 == null ? 0 : str5.hashCode())) * 31)) * 31)) * 31, 31, this.f112308K), 31);
        String str6 = this.f112310M;
        int iHashCode16 = (iE2 + (str6 == null ? 0 : str6.hashCode())) * 31;
        LayoutType layoutType = this.f112311N;
        int iHashCode17 = (iHashCode16 + (layoutType == null ? 0 : layoutType.hashCode())) * 31;
        Long l13 = this.f112312O;
        int iHashCode18 = (iHashCode17 + (l13 == null ? 0 : l13.hashCode())) * 31;
        String str7 = this.f112313P;
        int iHashCode19 = (iHashCode18 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.f112314Q;
        int iHashCode20 = (iHashCode19 + (str8 == null ? 0 : str8.hashCode())) * 31;
        List<String> list2 = this.f112315R;
        int iHashCode21 = (iHashCode20 + (list2 == null ? 0 : list2.hashCode())) * 31;
        AnalyticParams analyticParams = this.f112316S;
        int iHashCode22 = (iHashCode21 + (analyticParams == null ? 0 : analyticParams.hashCode())) * 31;
        AdvertListAdditionalTopics advertListAdditionalTopics = this.f112317T;
        int iHashCode23 = (iHashCode22 + (advertListAdditionalTopics == null ? 0 : advertListAdditionalTopics.hashCode())) * 31;
        Boolean bool = this.f112318U;
        int iHashCode24 = (this.f112319V.hashCode() + ((iHashCode23 + (bool == null ? 0 : bool.hashCode())) * 31)) * 31;
        B b12 = this.f112320W;
        int iHashCode25 = (iHashCode24 + (b12 == null ? 0 : b12.hashCode())) * 31;
        List<UxFeedbackConfigOld> list3 = this.f112321X;
        int iHashCode26 = (iHashCode25 + (list3 == null ? 0 : list3.hashCode())) * 31;
        z zVar = this.f112322Y;
        int iHashCode27 = (iHashCode26 + (zVar == null ? 0 : zVar.hashCode())) * 31;
        x xVar = this.f112323Z;
        int iHashCode28 = (this.f112324a0.hashCode() + ((iHashCode27 + (xVar == null ? 0 : xVar.hashCode())) * 31)) * 31;
        String str9 = this.f112326b0;
        int iA2 = C23088b.a((this.f112328c0.hashCode() + ((iHashCode28 + (str9 == null ? 0 : str9.hashCode())) * 31)) * 31, 31, this.f112330d0.f112421a);
        A a12 = this.f112332e0;
        int iHashCode29 = (this.f112336g0.hashCode() + ((this.f112334f0.hashCode() + ((iA2 + (a12 == null ? 0 : a12.hashCode())) * 31)) * 31)) * 31;
        Filter filter = this.f112338h0;
        int i14 = androidx.appcompat.app.r.i((iHashCode29 + (filter == null ? 0 : filter.hashCode())) * 31, 31, this.f112340i0);
        String str10 = this.f112342j0;
        int iHashCode30 = (this.f112348m0.hashCode() + androidx.appcompat.app.r.i((this.f112344k0.hashCode() + ((i14 + (str10 == null ? 0 : str10.hashCode())) * 31)) * 31, 31, this.f112346l0)) * 31;
        u uVar = this.f112350n0;
        return iHashCode30 + (uVar != null ? uVar.hashCode() : 0);
    }

    @Y61.k
    /* renamed from: i, reason: from getter */
    public final w getF112319V() {
        return this.f112319V;
    }

    @Y61.l
    /* renamed from: j, reason: from getter */
    public final x getF112323Z() {
        return this.f112323Z;
    }

    @Y61.l
    /* renamed from: k, reason: from getter */
    public final NavigationBarStyle getF112303F() {
        return this.f112303F;
    }

    @Y61.l
    /* renamed from: l, reason: from getter */
    public final String getF112342j0() {
        return this.f112342j0;
    }

    @Y61.k
    /* renamed from: m, reason: from getter */
    public final PresentationType getF112306I() {
        return this.f112306I;
    }

    @Y61.l
    /* renamed from: n, reason: from getter */
    public final String getF112347m() {
        return this.f112347m;
    }

    @Y61.l
    /* renamed from: o, reason: from getter */
    public final z getF112322Y() {
        return this.f112322Y;
    }

    @Y61.l
    /* renamed from: p, reason: from getter */
    public final String getF112355s() {
        return this.f112355s;
    }

    @Y61.k
    /* renamed from: q, reason: from getter */
    public final InlineAction.Predefined.State getF112360x() {
        return this.f112360x;
    }

    @Y61.l
    /* renamed from: r, reason: from getter */
    public final SectionTagsItem getF112331e() {
        return this.f112331e;
    }

    @Y61.l
    /* renamed from: s, reason: from getter */
    public final B getF112320W() {
        return this.f112320W;
    }

    @Y61.k
    public final String toString() {
        return "BxContentState(shortcuts=" + this.f112325b + ", loadingState=" + this.f112327c + ", feedsWidget=" + this.f112329d + ", tagsWidget=" + this.f112331e + ", currentFeedId=" + this.f112333f + ", headingList=" + this.f112335g + ", content=" + this.f112337h + ", locationLoadingState=" + this.f112339i + ", displayType=" + this.f112341j + ", currentLocation=" + this.f112343k + ", currentSearchParams=" + this.f112345l + ", searchHint=" + this.f112347m + ", xHash=" + this.f112349n + ", appearanceUuid=" + this.f112351o + ", onboarding=" + this.f112352p + ", authRequestedFor=" + this.f112353q + ", callInfo=" + this.f112354r + ", subscriptionId=" + this.f112355s + ", snippetScrollDepthState=" + this.f112356t + ", snippetViewingDepthState=" + this.f112357u + ", idProvider=" + this.f112358v + ", headerToolbarItem=" + this.f112359w + ", subscriptionInlineActionState=" + this.f112360x + ", shouldShowSaveSearch=" + this.f112361y + ", shouldShowSaveSearchButtonOnMap=" + this.f112362z + ", verticalFilterSearchParams=" + this.f112298A + ", isVerticalMain=" + this.f112299B + ", changeMainPageLocation=" + this.f112300C + ", toolbarConfig=" + this.f112301D + ", toolbarShareButton=" + this.f112302E + ", navigationBarStyle=" + this.f112303F + ", context=" + this.f112304G + ", fromPage=" + this.f112305H + ", presentationType=" + this.f112306I + ", serpSpaceType=" + this.f112307J + ", onboardingId=" + this.f112308K + ", bottomSheetState=" + this.f112309L + ", pageId=" + this.f112310M + ", layoutType=" + this.f112311N + ", lastStamp=" + this.f112312O + ", screenTitle=" + this.f112313P + ", screenSubTitle=" + this.f112314Q + ", itemIds=" + this.f112315R + ", analyticParams=" + this.f112316S + ", advertListAdditionalTopics=" + this.f112317T + ", stayInAppOnBack=" + this.f112318U + ", headerBarState=" + this.f112319V + ", udfToolbar=" + this.f112320W + ", uxFeedbackConfigs=" + this.f112321X + ", searchPromoHeaderState=" + this.f112322Y + ", heroBannerState=" + this.f112323Z + ", beduinScreenContentState=" + this.f112324a0 + ", pushSrc=" + this.f112326b0 + ", floatingPromoWidgetState=" + this.f112328c0 + ", featuredWidgetState=" + this.f112330d0 + ", serpMapSelectDatesButtonState=" + this.f112332e0 + ", universalButtonState=" + this.f112334f0 + ", recsReloadState=" + this.f112336g0 + ", actionHorizontalBlock=" + this.f112338h0 + ", isActionHorizontalBlockLoadedWithInlines=" + this.f112340i0 + ", newSerpMapInteraction=" + this.f112342j0 + ", switchSerpMapButtonState=" + this.f112344k0 + ", isSnippetRedesign=" + this.f112346l0 + ", viewState=" + this.f112348m0 + ", filterHintToast=" + this.f112350n0 + ')';
    }

    /* JADX WARN: Multi-variable type inference failed */
    public l(@Y61.l List<? extends ShortcutNavigationItem> list, @Y61.k LoadState loadState, @Y61.l com.avito.android.serp.adapter.home_section_tab.a aVar, @Y61.l SectionTagsItem sectionTagsItem, @Y61.k FeedId feedId, @Y61.k List<? extends l1> list2, @Y61.k Map<FeedId, t> map, @Y61.k LoadState loadState2, @Y61.k SerpDisplayType serpDisplayType, @Y61.l Location location, @Y61.k SearchParams searchParams, @Y61.l String str, @Y61.l String str2, @Y61.k String str3, @Y61.l DeepLink deepLink, @Y61.l Integer num, @Y61.l CallInfo callInfo, @Y61.l String str4, @Y61.l d.a aVar2, @Y61.l i.a aVar3, @Y61.l Long l12, @Y61.l l1 l1Var, @Y61.k InlineAction.Predefined.State state, boolean z12, boolean z13, @Y61.l SearchParams searchParams2, boolean z14, boolean z15, @Y61.l ToolbarConfig toolbarConfig, @Y61.l ToolbarShareButton toolbarShareButton, @Y61.l NavigationBarStyle navigationBarStyle, @Y61.l String str5, @Y61.l String str6, @Y61.k PresentationType presentationType, @Y61.k SerpSpaceType serpSpaceType, @Y61.k String str7, int i12, @Y61.l String str8, @Y61.l LayoutType layoutType, @Y61.l Long l13, @Y61.l String str9, @Y61.l String str10, @Y61.l List<String> list3, @Y61.l AnalyticParams analyticParams, @Y61.l AdvertListAdditionalTopics advertListAdditionalTopics, @Y61.l Boolean bool, @Y61.k w wVar, @Y61.l B b12, @Y61.l List<UxFeedbackConfigOld> list4, @Y61.l z zVar, @Y61.l x xVar, @Y61.k C29126a c29126a, @Y61.l String str11, @Y61.k v vVar, @Y61.k s sVar, @Y61.l A a12, @Y61.k C c12, @Y61.k y yVar, @Y61.l Filter filter, boolean z16, @Y61.l String str12, @Y61.k SwitchSerpMapButtonState switchSerpMapButtonState, boolean z17, @Y61.k q qVar, @Y61.l u uVar) {
        this.f112325b = list;
        this.f112327c = loadState;
        this.f112329d = aVar;
        this.f112331e = sectionTagsItem;
        this.f112333f = feedId;
        this.f112335g = list2;
        this.f112337h = map;
        this.f112339i = loadState2;
        this.f112341j = serpDisplayType;
        this.f112343k = location;
        this.f112345l = searchParams;
        this.f112347m = str;
        this.f112349n = str2;
        this.f112351o = str3;
        this.f112352p = deepLink;
        this.f112353q = num;
        this.f112354r = callInfo;
        this.f112355s = str4;
        this.f112356t = aVar2;
        this.f112357u = aVar3;
        this.f112358v = l12;
        this.f112359w = l1Var;
        this.f112360x = state;
        this.f112361y = z12;
        this.f112362z = z13;
        this.f112298A = searchParams2;
        this.f112299B = z14;
        this.f112300C = z15;
        this.f112301D = toolbarConfig;
        this.f112302E = toolbarShareButton;
        this.f112303F = navigationBarStyle;
        this.f112304G = str5;
        this.f112305H = str6;
        this.f112306I = presentationType;
        this.f112307J = serpSpaceType;
        this.f112308K = str7;
        this.f112309L = i12;
        this.f112310M = str8;
        this.f112311N = layoutType;
        this.f112312O = l13;
        this.f112313P = str9;
        this.f112314Q = str10;
        this.f112315R = list3;
        this.f112316S = analyticParams;
        this.f112317T = advertListAdditionalTopics;
        this.f112318U = bool;
        this.f112319V = wVar;
        this.f112320W = b12;
        this.f112321X = list4;
        this.f112322Y = zVar;
        this.f112323Z = xVar;
        this.f112324a0 = c29126a;
        this.f112326b0 = str11;
        this.f112328c0 = vVar;
        this.f112330d0 = sVar;
        this.f112332e0 = a12;
        this.f112334f0 = c12;
        this.f112336g0 = yVar;
        this.f112338h0 = filter;
        this.f112340i0 = z16;
        this.f112342j0 = str12;
        this.f112344k0 = switchSerpMapButtonState;
        this.f112346l0 = z17;
        this.f112348m0 = qVar;
        this.f112350n0 = uVar;
    }
}
