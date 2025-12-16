package com.avito.android.extended_profile.mvi;

import com.avito.android.advertising.CommercialItem;
import com.avito.android.extended_profile.data.b;
import com.avito.android.extended_profile.di.r;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import com.avito.android.extended_profile.mvi.entity.a;
import com.avito.android.extended_profile_ui_components.search_input.suggest.SuggestItem;
import com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem;
import com.avito.android.extended_profile_widgets.adapter.base_info_ml.BaseInfoMlItem;
import com.avito.android.extended_profile_widgets.adapter.header.HeaderItem;
import com.avito.android.extended_profile_widgets.adapter.search.ExtendedProfileSearchTabType;
import com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.TabsWithWidgetsItem;
import com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.WidgetTab;
import com.avito.android.remote.model.ExtendedProfile;
import com.avito.android.remote.model.ExtendedProfileBaseInfoMl;
import com.avito.android.remote.model.ExtendedProfilePhoneDisclaimer;
import com.avito.android.remote.model.SubscribeInfo;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.collections.C42756l;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: ExtendedProfileReducer.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001¨\u0006\u0004"}, d2 = {"Lcom/avito/android/extended_profile/mvi/C;", "Lcom/avito/android/arch/mvi/u;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "Lcom/avito/android/extended_profile/mvi/entity/a;", "_avito_extended-profile_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class C implements com.avito.android.arch.mvi.u<ExtendedProfileInternalAction, com.avito.android.extended_profile.mvi.entity.a> {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f150033b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.extended_profile.search.n f150034c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final I30.d f150035d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final Y41.a<Integer> f150036e;

    /* compiled from: ExtendedProfileReducer.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f150037a;

        static {
            int[] iArr = new int[ExtendedProfileSearchTabType.values().length];
            try {
                ExtendedProfileSearchTabType extendedProfileSearchTabType = ExtendedProfileSearchTabType.f154620c;
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ExtendedProfileSearchTabType extendedProfileSearchTabType2 = ExtendedProfileSearchTabType.f154620c;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f150037a = iArr;
        }
    }

    /* compiled from: ExtendedProfileReducer.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/extended_profile/data/g;", "group", "", "invoke", "(Lcom/avito/android/extended_profile/data/g;)Ljava/lang/Boolean;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.extended_profile.data.g, Boolean> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f150038l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public b(Y41.l<? super QH.a, Boolean> lVar) {
            super(1);
            this.f150038l = (kotlin.jvm.internal.N) lVar;
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0035  */
        /* JADX WARN: Type inference failed for: r2v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Boolean invoke(com.avito.android.extended_profile.data.g r5) {
            /*
                r4 = this;
                com.avito.android.extended_profile.data.g r5 = (com.avito.android.extended_profile.data.g) r5
                boolean r0 = r5 instanceof com.avito.android.extended_profile.data.h
                r1 = 1
                if (r0 == 0) goto L9
                r0 = r1
                goto Lb
            L9:
                boolean r0 = r5 instanceof com.avito.android.extended_profile.data.a
            Lb:
                if (r0 == 0) goto Lf
                r0 = r1
                goto L11
            Lf:
                boolean r0 = r5 instanceof com.avito.android.extended_profile.data.j
            L11:
                if (r0 == 0) goto L15
                r0 = r1
                goto L17
            L15:
                boolean r0 = r5 instanceof com.avito.android.extended_profile.data.f
            L17:
                if (r0 == 0) goto L1b
                r0 = r1
                goto L1d
            L1b:
                boolean r0 = r5 instanceof com.avito.android.extended_profile.data.k
            L1d:
                kotlin.jvm.internal.N r2 = r4.f150038l
                r3 = 0
                if (r0 == 0) goto L54
                java.util.List r5 = r5.getItems()
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                boolean r0 = r5 instanceof java.util.Collection
                if (r0 == 0) goto L37
                r0 = r5
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L37
            L35:
                r1 = r3
                goto L8c
            L37:
                java.util.Iterator r5 = r5.iterator()
            L3b:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L35
                java.lang.Object r0 = r5.next()
                QH.a r0 = (QH.a) r0
                java.lang.Object r0 = r2.invoke(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L3b
                goto L8c
            L54:
                boolean r0 = r5 instanceof com.avito.android.extended_profile.data.e
                if (r0 == 0) goto L91
                com.avito.android.extended_profile.data.e r5 = (com.avito.android.extended_profile.data.e) r5
                com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.TabsWithWidgetsItem r5 = r5.f149482d
                java.util.List<com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.WidgetTab> r5 = r5.f154936e
                java.lang.Iterable r5 = (java.lang.Iterable) r5
                boolean r0 = r5 instanceof java.util.Collection
                if (r0 == 0) goto L6e
                r0 = r5
                java.util.Collection r0 = (java.util.Collection) r0
                boolean r0 = r0.isEmpty()
                if (r0 == 0) goto L6e
                goto L35
            L6e:
                java.util.Iterator r5 = r5.iterator()
            L72:
                boolean r0 = r5.hasNext()
                if (r0 == 0) goto L35
                java.lang.Object r0 = r5.next()
                com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.WidgetTab r0 = (com.avito.android.extended_profile_widgets.adapter.tabs_with_widgets.WidgetTab) r0
                com.avito.android.extended_profile_widgets.adapter.ExtendedProfileWidgetItem r0 = r0.f154941d
                java.lang.Object r0 = r2.invoke(r0)
                java.lang.Boolean r0 = (java.lang.Boolean) r0
                boolean r0 = r0.booleanValue()
                if (r0 == 0) goto L72
            L8c:
                java.lang.Boolean r5 = java.lang.Boolean.valueOf(r1)
                return r5
            L91:
                kotlin.NoWhenBranchMatchedException r5 = new kotlin.NoWhenBranchMatchedException
                r5.<init>()
                throw r5
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.mvi.C.b.invoke(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: ExtendedProfileReducer.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/extended_profile/data/g;", "group", "invoke", "(Lcom/avito/android/extended_profile/data/g;)Lcom/avito/android/extended_profile/data/g;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.extended_profile.data.g, com.avito.android.extended_profile.data.g> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f150040m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ kotlin.jvm.internal.N f150041n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public c(Y41.l<? super QH.a, ? extends ExtendedProfileWidgetItem> lVar, Y41.l<? super QH.a, Boolean> lVar2) {
            super(1);
            this.f150040m = (kotlin.jvm.internal.N) lVar;
            this.f150041n = (kotlin.jvm.internal.N) lVar2;
        }

        /* JADX WARN: Type inference failed for: r3v0, types: [Y41.l, kotlin.jvm.internal.N] */
        /* JADX WARN: Type inference failed for: r4v0, types: [Y41.l, kotlin.jvm.internal.N] */
        @Override // Y41.l
        public final com.avito.android.extended_profile.data.g invoke(com.avito.android.extended_profile.data.g gVar) {
            com.avito.android.extended_profile.data.g aVar;
            com.avito.android.extended_profile.data.g gVar2 = gVar;
            boolean z12 = gVar2 instanceof com.avito.android.extended_profile.data.j;
            ?? r32 = this.f150041n;
            ?? r42 = this.f150040m;
            C c12 = C.this;
            if (z12) {
                com.avito.android.extended_profile.data.j jVar = (com.avito.android.extended_profile.data.j) gVar2;
                List<QH.a> list = ((com.avito.android.extended_profile.data.j) gVar2).f149497d;
                o0 o0Var = new o0(r32);
                c12.getClass();
                return com.avito.android.extended_profile.data.j.a(jVar, C.c(list, o0Var, r42), null, 5);
            }
            if (gVar2 instanceof com.avito.android.extended_profile.data.k) {
                com.avito.android.extended_profile.data.k kVar = (com.avito.android.extended_profile.data.k) gVar2;
                List<QH.a> list2 = ((com.avito.android.extended_profile.data.k) gVar2).f149500d;
                p0 p0Var = new p0(r32);
                c12.getClass();
                aVar = new com.avito.android.extended_profile.data.k(kVar.f149499c, C.c(list2, p0Var, r42));
            } else if (gVar2 instanceof com.avito.android.extended_profile.data.f) {
                com.avito.android.extended_profile.data.f fVar = (com.avito.android.extended_profile.data.f) gVar2;
                List<QH.a> list3 = ((com.avito.android.extended_profile.data.f) gVar2).f149485d;
                q0 q0Var = new q0(r32);
                c12.getClass();
                aVar = new com.avito.android.extended_profile.data.f(fVar.f149484c, C.c(list3, q0Var, r42));
            } else if (gVar2 instanceof com.avito.android.extended_profile.data.h) {
                com.avito.android.extended_profile.data.h hVar = (com.avito.android.extended_profile.data.h) gVar2;
                aVar = new com.avito.android.extended_profile.data.h(hVar.f149488c, (HeaderItem) r42.invoke(hVar.f149489d));
            } else {
                if (!(gVar2 instanceof com.avito.android.extended_profile.data.a)) {
                    if (!(gVar2 instanceof com.avito.android.extended_profile.data.e)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    com.avito.android.extended_profile.data.e eVar = (com.avito.android.extended_profile.data.e) gVar2;
                    TabsWithWidgetsItem tabsWithWidgetsItem = eVar.f149482d;
                    List<WidgetTab> list4 = tabsWithWidgetsItem.f154936e;
                    r0 r0Var = new r0(r32);
                    s0 s0Var = new s0(r42);
                    c12.getClass();
                    TabsWithWidgetsItem tabsWithWidgetsItemA = TabsWithWidgetsItem.a(tabsWithWidgetsItem, C.c(list4, r0Var, s0Var), 0, 55);
                    WidgetTab widgetTab = (WidgetTab) C42745f0.K(tabsWithWidgetsItemA.f154937f, tabsWithWidgetsItemA.f154936e);
                    return com.avito.android.extended_profile.data.e.a(eVar, tabsWithWidgetsItemA, C42756l.B(new ExtendedProfileWidgetItem[]{tabsWithWidgetsItemA, widgetTab != null ? widgetTab.f154941d : null}), 1);
                }
                com.avito.android.extended_profile.data.a aVar2 = (com.avito.android.extended_profile.data.a) gVar2;
                aVar = new com.avito.android.extended_profile.data.a(aVar2.f149464c, (BaseInfoMlItem) r42.invoke(aVar2.f149465d));
            }
            return aVar;
        }
    }

    @Inject
    public C(@r.h @Y61.k String str, @Y61.k com.avito.android.extended_profile.search.n nVar, @Y61.k I30.d dVar, @Y61.k Y41.a<Integer> aVar) {
        this.f150033b = str;
        this.f150034c = nVar;
        this.f150035d = dVar;
        this.f150036e = aVar;
    }

    public static com.avito.android.extended_profile.mvi.entity.a b(com.avito.android.extended_profile.mvi.entity.a aVar, String str, CommercialItem commercialItem) {
        com.avito.android.extended_profile.data.b bVar = aVar.f150240b;
        com.avito.android.extended_profile.data.b bVarA = null;
        if (bVar != null) {
            bVarA = com.avito.android.extended_profile.data.b.a(bVar, c(bVar.f149466a, new m0(str), new n0(str, commercialItem)), null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        return com.avito.android.extended_profile.mvi.entity.a.a(aVar, bVarA, null, null, null, null, null, null, 2046);
    }

    public static List c(List list, Y41.l lVar, Y41.l lVar2) {
        Iterator it = list.iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (((Boolean) lVar.invoke(it.next())).booleanValue()) {
                break;
            }
            i12++;
        }
        if (i12 == -1) {
            return list;
        }
        ArrayList arrayList = new ArrayList(list);
        arrayList.set(i12, lVar2.invoke(arrayList.get(i12)));
        return arrayList;
    }

    /* JADX WARN: Type inference failed for: r1v10, types: [java.lang.Object, java.util.List] */
    @Override // com.avito.android.arch.mvi.u
    public final com.avito.android.extended_profile.mvi.entity.a a(ExtendedProfileInternalAction extendedProfileInternalAction, com.avito.android.extended_profile.mvi.entity.a aVar) {
        com.avito.android.extended_profile.data.b bVarA;
        com.avito.android.extended_profile.data.b bVarA2;
        ExtendedProfile.ProfileData.AnalyticParams analyticParams;
        ExtendedProfileWidgetItem extendedProfileWidgetItem;
        ExtendedProfileBaseInfoMl.Subscribe subscribe;
        a.e eVar;
        SubscribeInfo subscribeInfo;
        List<ExtendedProfileBaseInfoMl.Action> list;
        Object next;
        ExtendedProfileInternalAction extendedProfileInternalAction2 = extendedProfileInternalAction;
        com.avito.android.extended_profile.mvi.entity.a aVar2 = aVar;
        boolean z12 = extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.DataLoaded;
        a.e eVar2 = aVar2.f150249k;
        ExtendedProfileWidgetItem extendedProfileWidgetItem2 = null;
        I30.d dVar = this.f150035d;
        if (z12) {
            com.avito.android.extended_profile.data.b bVar = ((ExtendedProfileInternalAction.DataLoaded) extendedProfileInternalAction2).f150162b;
            com.avito.android.extended_profile.data.b bVarE = e(bVar, null, null);
            Boolean bool = eVar2.f150282a;
            List<com.avito.android.extended_profile.data.g> list2 = bVar.f149466a;
            Iterator<T> it = list2.iterator();
            loop0: while (true) {
                if (!it.hasNext()) {
                    extendedProfileWidgetItem = null;
                    break;
                }
                for (QH.a aVar3 : ((com.avito.android.extended_profile.data.g) it.next()).getItems()) {
                    if (aVar3 instanceof BaseInfoMlItem) {
                        extendedProfileWidgetItem = (ExtendedProfileWidgetItem) aVar3;
                        break loop0;
                    }
                }
            }
            BaseInfoMlItem baseInfoMlItem = (BaseInfoMlItem) extendedProfileWidgetItem;
            if (baseInfoMlItem == null || (list = baseInfoMlItem.f154257l) == null) {
                subscribe = null;
            } else {
                Iterator<T> it2 = list.iterator();
                while (true) {
                    if (!it2.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it2.next();
                    if (next instanceof ExtendedProfileBaseInfoMl.Subscribe) {
                        break;
                    }
                }
                if (!(next instanceof ExtendedProfileBaseInfoMl.Subscribe)) {
                    next = null;
                }
                subscribe = (ExtendedProfileBaseInfoMl.Subscribe) next;
            }
            Boolean boolIsSubscribed = subscribe != null ? subscribe.isSubscribed() : null;
            Boolean boolIsNotificationsActivated = subscribe != null ? subscribe.isNotificationsActivated() : null;
            Iterator<T> it3 = list2.iterator();
            loop3: while (true) {
                if (!it3.hasNext()) {
                    break;
                }
                for (QH.a aVar4 : ((com.avito.android.extended_profile.data.g) it3.next()).getItems()) {
                    if (aVar4 instanceof HeaderItem) {
                        extendedProfileWidgetItem2 = (ExtendedProfileWidgetItem) aVar4;
                        break loop3;
                    }
                }
            }
            HeaderItem headerItem = (HeaderItem) extendedProfileWidgetItem2;
            if (headerItem == null || (subscribeInfo = headerItem.f154425j) == null) {
                eVar = new a.e(bool, boolIsSubscribed != null ? boolIsSubscribed.booleanValue() : false, boolIsNotificationsActivated, false, false, null, null, false, dVar.b(), 248, null);
            } else {
                boolean zBooleanValue = (boolIsSubscribed == null && (boolIsSubscribed = subscribeInfo.isSubscribed()) == null) ? false : boolIsSubscribed.booleanValue();
                if (boolIsNotificationsActivated == null) {
                    boolIsNotificationsActivated = subscribeInfo.isNotificationsActivated();
                }
                eVar = new a.e(bool, zBooleanValue, boolIsNotificationsActivated, false, false, subscribeInfo.getSubscribers(), subscribeInfo.getSubscriptions(), false, dVar.b(), 152, null);
            }
            return new com.avito.android.extended_profile.mvi.entity.a(bVarE, false, null, null, false, null, null, null, null, eVar, null, 1534, null);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.DataLoading) {
            return new com.avito.android.extended_profile.mvi.entity.a(null, true, null, null, false, null, null, null, null, new a.e(eVar2.f150282a, false, null, false, false, null, null, false, false, 510, null), null, 1533, null);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.LoadingError) {
            return new com.avito.android.extended_profile.mvi.entity.a(null, false, ((ExtendedProfileInternalAction.LoadingError) extendedProfileInternalAction2).f150167b, null, false, null, null, null, null, null, null, 2043, null);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.PlaceholderLoaded) {
            com.avito.android.extended_profile.data.d dVar2 = ((ExtendedProfileInternalAction.PlaceholderLoaded) extendedProfileInternalAction2).f150210b;
            return new com.avito.android.extended_profile.mvi.entity.a(null, false, null, new a.g(dVar2.f149478a, dVar2.f149479b, dVar2.f149480c), false, null, null, null, null, null, null, 2039, null);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnTextItemExpandClicked) {
            return h(aVar2, new W(extendedProfileInternalAction2), new e0(extendedProfileInternalAction2));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnAboutV2GalleryScrollChanged) {
            return h(aVar2, new f0(extendedProfileInternalAction2), new g0(extendedProfileInternalAction2));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnAboutV2TextExpandClicked) {
            return h(aVar2, new h0(extendedProfileInternalAction2), new i0(extendedProfileInternalAction2));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnGalleryScrollPositionChanged) {
            return h(aVar2, new j0(extendedProfileInternalAction2), new k0(extendedProfileInternalAction2));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnPremiumBannerScrollChanged) {
            return h(aVar2, new l0(extendedProfileInternalAction2), new L(extendedProfileInternalAction2));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnSubscribeChanged) {
            ExtendedProfileInternalAction.OnSubscribeChanged onSubscribeChanged = (ExtendedProfileInternalAction.OnSubscribeChanged) extendedProfileInternalAction2;
            return d(com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, a.e.a(eVar2, null, onSubscribeChanged.f150189b, onSubscribeChanged.f150190c, false, false, onSubscribeChanged.f150191d, onSubscribeChanged.f150192e, false, false, 273), null, 1535));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.SubscriptionProgress) {
            return d(com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, a.e.a(eVar2, null, false, null, ((ExtendedProfileInternalAction.SubscriptionProgress) extendedProfileInternalAction2).f150222b, false, null, null, false, false, 503), null, 1535));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnSubscribeNotificationChanged) {
            ExtendedProfileInternalAction.OnSubscribeNotificationChanged onSubscribeNotificationChanged = (ExtendedProfileInternalAction.OnSubscribeNotificationChanged) extendedProfileInternalAction2;
            return d(com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, a.e.a(eVar2, null, onSubscribeNotificationChanged.f150193b, onSubscribeNotificationChanged.f150194c, false, false, null, null, false, false, 489), null, 1535));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.SubscriptionNotificationChangeProgress) {
            return d(com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, a.e.a(eVar2, null, false, null, false, ((ExtendedProfileInternalAction.SubscriptionNotificationChangeProgress) extendedProfileInternalAction2).f150221b, null, null, false, false, 495), null, 1535));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateNotificationEnabledState) {
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, a.e.a(aVar2.f150249k, null, false, null, false, false, null, null, false, dVar.b(), 255), null, 1535);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenSubscriptionSettings) {
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, a.e.a(eVar2, null, false, null, false, false, null, null, true, false, 383), null, 1535);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.DismissSubscriptionSettings) {
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, a.e.a(eVar2, null, false, null, false, false, null, null, false, false, 383), null, 1535);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateTargetSubscribe) {
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, a.e.a(eVar2, ((ExtendedProfileInternalAction.UpdateTargetSubscribe) extendedProfileInternalAction2).f150236b, false, null, false, false, null, null, false, false, 510), null, 1535);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnCarouselScrollChanged) {
            return h(aVar2, new M(extendedProfileInternalAction2), new N(extendedProfileInternalAction2));
        }
        boolean z13 = extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.ShowPhoneDialog;
        com.avito.android.extended_profile.data.b bVar2 = aVar2.f150240b;
        if (z13) {
            ExtendedProfileInternalAction.ShowPhoneDialog showPhoneDialog = (ExtendedProfileInternalAction.ShowPhoneDialog) extendedProfileInternalAction2;
            String fromPage = (bVar2 == null || (analyticParams = bVar2.f149470e) == null) ? null : analyticParams.getFromPage();
            ExtendedProfilePhoneDisclaimer extendedProfilePhoneDisclaimer = showPhoneDialog.f150218b.f151600b;
            FA.a aVar5 = new FA.a(this.f150033b, showPhoneDialog.f150219c, fromPage, extendedProfilePhoneDisclaimer != null ? extendedProfilePhoneDisclaimer.getIsAnonymous() : null);
            com.avito.android.extended_profile_phone_dialog.f fVar = showPhoneDialog.f150218b;
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, fVar, new a.d(fVar, aVar5), null, null, null, null, 1951);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnPhoneCallCanceled) {
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, null, null, 1983);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnCategorizerScrollChanged) {
            return h(aVar2, new O(extendedProfileInternalAction2), new P(extendedProfileInternalAction2));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnSelectionsScrollStateAction) {
            return h(aVar2, new Q(extendedProfileInternalAction2), new S(extendedProfileInternalAction2));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UniversalWidgetCarouselContainerScrollStateAction) {
            return h(aVar2, new T(extendedProfileInternalAction2), new U(extendedProfileInternalAction2));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.JobCarouselScrollPositionChanged) {
            return h(aVar2, new V(extendedProfileInternalAction2), new X(extendedProfileInternalAction2));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnTabsWithWidgetsClicked) {
            return g(aVar2, J.f150048l, new K((ExtendedProfileInternalAction.OnTabsWithWidgetsClicked) extendedProfileInternalAction2));
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnAdvertsTabSelected) {
            if (bVar2 != null) {
                b.a aVar6 = bVar2.f149467b;
                bVarA2 = com.avito.android.extended_profile.data.b.a(bVar2, null, aVar6 != null ? b.a.a(aVar6, null, Integer.valueOf(((ExtendedProfileInternalAction.OnAdvertsTabSelected) extendedProfileInternalAction2).f150173b), 3) : null, 125);
            } else {
                bVarA2 = null;
            }
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, bVarA2, null, null, null, null, null, null, 2046);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnProfileAdvertsUpdates) {
            if (bVar2 != null) {
                b.a aVar7 = bVar2.f149467b;
                bVarA = com.avito.android.extended_profile.data.b.a(bVar2, null, aVar7 != null ? b.a.a(aVar7, c(aVar7.f149475b, new Y(extendedProfileInternalAction2), new Z(this, extendedProfileInternalAction2)), null, 5) : null, 125);
            } else {
                bVarA = null;
            }
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, bVarA, null, null, null, null, null, null, 2046);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateActiveAdvertsSearchState) {
            return g(com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, ((ExtendedProfileInternalAction.UpdateActiveAdvertsSearchState) extendedProfileInternalAction2).f150228b, null, null, null, 1919), a0.f150133l, new d0(this, extendedProfileInternalAction2));
        }
        boolean z14 = extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateActiveAdvertsFiltersCount;
        a.C4397a c4397a = aVar2.f150247i;
        a.b bVar3 = aVar2.f150248j;
        if (z14) {
            if (bVar2 == null || c4397a == null) {
                return aVar2;
            }
            a.C4397a c4397aA = a.C4397a.a(c4397a, false, false, null, null, null, null, null, false, null, null, Integer.valueOf(((ExtendedProfileInternalAction.UpdateActiveAdvertsFiltersCount) extendedProfileInternalAction2).f150227b), null, 1015807);
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, e(bVar2, c4397aA, bVar3), null, null, c4397aA, null, null, null, 1918);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateVisibleItems) {
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, bVar2 != null ? e(bVar2, c4397a, bVar3) : null, null, null, null, null, null, null, 2046);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateClosedAdvertsSearchState) {
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, bVar2 != null ? e(bVar2, c4397a, ((ExtendedProfileInternalAction.UpdateClosedAdvertsSearchState) extendedProfileInternalAction2).f150230b) : null, null, null, null, ((ExtendedProfileInternalAction.UpdateClosedAdvertsSearchState) extendedProfileInternalAction2).f150230b, null, null, 1790);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnSearchTabSelected) {
            return g(aVar2, H.f150046l, new I((ExtendedProfileInternalAction.OnSearchTabSelected) extendedProfileInternalAction2));
        }
        boolean z15 = extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.SuggestLoaded;
        a.f fVar2 = aVar2.f150250l;
        if (z15) {
            ?? r12 = ((ExtendedProfileInternalAction.SuggestLoaded) extendedProfileInternalAction2).f150223b;
            boolean z16 = fVar2.f150291a;
            fVar2.getClass();
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, null, new a.f(z16, r12), 1023);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.SetSuggestsVisible) {
            boolean z17 = ((ExtendedProfileInternalAction.SetSuggestsVisible) extendedProfileInternalAction2).f150212b;
            List<SuggestItem> list3 = fVar2.f150292b;
            fVar2.getClass();
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, null, new a.f(z17, list3), 1023);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.GotCommercialItem) {
            return com.avito.android.extended_profile.mvi.entity.a.a(aVar2, null, null, null, null, null, null, null, 2031);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateCommercialItem) {
            CommercialItem commercialItem = ((ExtendedProfileInternalAction.UpdateCommercialItem) extendedProfileInternalAction2).f150231b;
            return b(aVar2, commercialItem.getF77949c(), commercialItem);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.RemoveCommercialItem) {
            return b(aVar2, ((ExtendedProfileInternalAction.RemoveCommercialItem) extendedProfileInternalAction2).f150211b, null);
        }
        if (extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenSearchFilters ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OnShareMenuClick ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenNotificationsSettings ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.CloseScreen ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.ShowCommonErrorToastBar ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.ShowCustomToastBar ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateShareMenuVisibility ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.NotifyItemsChanged ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenGallery ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenInlineFilter ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenInlineFilterWithId ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateFloatingContactBar ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.ShowEnableNotificationDialog ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.UpdateExtendedProfileLazyColumnComponent ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.SuggestLoadingError ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.OpenInProfileTab ? true : extendedProfileInternalAction2 instanceof ExtendedProfileInternalAction.ShowScreenByJson) {
            return aVar2;
        }
        throw new NoWhenBranchMatchedException();
    }

    public final com.avito.android.extended_profile.mvi.entity.a d(com.avito.android.extended_profile.mvi.entity.a aVar) {
        com.avito.android.extended_profile.mvi.entity.a aVarH = h(aVar, F.f150044l, new G(aVar));
        return h(aVarH, D.f150042l, new E(aVarH));
    }

    public final com.avito.android.extended_profile.data.b e(com.avito.android.extended_profile.data.b bVar, a.C4397a c4397a, a.b bVar2) {
        return com.avito.android.extended_profile.data.b.a(bVar, f(bVar.f149466a, c4397a, bVar2), null, WebSocketProtocol.PAYLOAD_SHORT);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0237 A[PHI: r5
  0x0237: PHI (r5v18 java.lang.Integer) = (r5v5 java.lang.Integer), (r5v7 java.lang.Integer) binds: [B:113:0x0235, B:118:0x0244] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Type inference failed for: r4v0 */
    /* JADX WARN: Type inference failed for: r4v1 */
    /* JADX WARN: Type inference failed for: r4v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.util.ArrayList f(java.util.List r36, com.avito.android.extended_profile.mvi.entity.a.C4397a r37, com.avito.android.extended_profile.mvi.entity.a.b r38) {
        /*
            Method dump skipped, instructions count: 744
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.extended_profile.mvi.C.f(java.util.List, com.avito.android.extended_profile.mvi.entity.a$a, com.avito.android.extended_profile.mvi.entity.a$b):java.util.ArrayList");
    }

    public final com.avito.android.extended_profile.mvi.entity.a g(com.avito.android.extended_profile.mvi.entity.a aVar, Y41.l<? super com.avito.android.extended_profile.data.g, Boolean> lVar, Y41.l<? super com.avito.android.extended_profile.data.g, ? extends com.avito.android.extended_profile.data.g> lVar2) {
        com.avito.android.extended_profile.data.b bVar = aVar.f150240b;
        return com.avito.android.extended_profile.mvi.entity.a.a(aVar, bVar != null ? com.avito.android.extended_profile.data.b.a(bVar, f(c(bVar.f149466a, lVar, lVar2), aVar.f150247i, aVar.f150248j), null, WebSocketProtocol.PAYLOAD_SHORT) : null, null, null, null, null, null, null, 2046);
    }

    public final com.avito.android.extended_profile.mvi.entity.a h(com.avito.android.extended_profile.mvi.entity.a aVar, Y41.l<? super QH.a, Boolean> lVar, Y41.l<? super QH.a, ? extends ExtendedProfileWidgetItem> lVar2) {
        com.avito.android.extended_profile.data.b bVar = aVar.f150240b;
        com.avito.android.extended_profile.data.b bVarA = null;
        if (bVar != null) {
            bVarA = com.avito.android.extended_profile.data.b.a(bVar, c(bVar.f149466a, new b(lVar), new c(lVar2, lVar)), null, WebSocketProtocol.PAYLOAD_SHORT);
        }
        return com.avito.android.extended_profile.mvi.entity.a.a(aVar, bVarA, null, null, null, null, null, null, 2046);
    }
}
