package com.avito.android.bxcontent.mvi.usecase.analytics;

import Y41.p;
import Y61.k;
import com.avito.android.bxcontent.analytics.StoriesFromPage;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.l;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.widget_analytics.Analytics;
import com.avito.android.remote.model.widget_analytics.EventParams;
import com.avito.android.serp.adapter.vertical_main.analytics.WidgetPageSource;
import com.avito.android.serp.analytics.widgets_tracker.a;
import java.util.LinkedHashMap;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.L;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: WidgetsActionTrackerUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/usecase/analytics/b;", "Lcom/avito/android/bxcontent/mvi/usecase/analytics/a;", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.bxcontent.mvi.usecase.analytics.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.bxcontent.analytics.a f112573a;

    /* compiled from: WidgetsActionTrackerUseCase.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f112574a;

        static {
            int[] iArr = new int[PresentationType.values().length];
            try {
                iArr[PresentationType.MAIN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[PresentationType.SERP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f112574a = iArr;
        }
    }

    /* compiled from: WidgetsActionTrackerUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.usecase.analytics.WidgetsActionTrackerUseCaseImpl$invoke$1", f = "WidgetsActionTrackerUseCase.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.usecase.analytics.b$b, reason: collision with other inner class name */
    public static final class C3308b extends SuspendLambda implements p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.serp.analytics.widgets_tracker.a f112575q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f112576r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ l f112577s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3308b(com.avito.android.serp.analytics.widgets_tracker.a aVar, b bVar, l lVar, Continuation<? super C3308b> continuation) {
            super(2, continuation);
            this.f112575q = aVar;
            this.f112576r = bVar;
            this.f112577s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@Y61.l Object obj, @k Continuation<?> continuation) {
            return new C3308b(this.f112575q, this.f112576r, this.f112577s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((C3308b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@k Object obj) {
            Map<Integer, EventParams> events;
            Map<Integer, EventParams> events2;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.serp.analytics.widgets_tracker.a aVar = this.f112575q;
            boolean z12 = aVar instanceof a.d;
            l lVar = this.f112577s;
            b bVar = this.f112576r;
            if (z12) {
                com.avito.android.bxcontent.analytics.a aVar2 = bVar.f112573a;
                a.d dVar = (a.d) aVar;
                EventParams eventParams = null;
                if (dVar instanceof a.d.b) {
                    a.d.b bVar2 = (a.d.b) dVar;
                    Analytics analytics = bVar2.f273937g;
                    if (analytics != null && (events2 = analytics.getEvents()) != null) {
                        eventParams = events2.get(4920);
                    }
                    if (eventParams != null) {
                        Map<String, String> mapC = bVar2.f273936f;
                        if (mapC == null) {
                            mapC = P0.c();
                        }
                        aVar2.u(eventParams.getVersion(), lVar.f112345l.getCategoryId(), bVar2.f273931a, lVar.f112349n, bVar2.f273932b, lVar.f112304G, b.c(lVar), bVar2.f273933c, bVar2.f273934d, bVar2.f273935e, P0.k(mapC, eventParams.getParams()));
                    } else {
                        aVar2.w(lVar.f112345l.getCategoryId(), bVar2.f273931a, lVar.f112349n, bVar2.f273932b, lVar.f112304G, b.c(lVar), bVar2.f273933c, bVar2.f273934d, bVar2.f273935e, bVar2.f273936f);
                    }
                } else if (dVar instanceof a.d.C8129a) {
                    a.d.C8129a c8129a = (a.d.C8129a) dVar;
                    Analytics analytics2 = c8129a.f273930h;
                    if (analytics2 != null && (events = analytics2.getEvents()) != null) {
                        eventParams = events.get(4921);
                    }
                    if (eventParams != null) {
                        Map<String, String> mapC2 = c8129a.f273929g;
                        if (mapC2 == null) {
                            mapC2 = P0.c();
                        }
                        int version = eventParams.getVersion();
                        String categoryId = lVar.f112345l.getCategoryId();
                        WidgetPageSource widgetPageSourceC = b.c(lVar);
                        LinkedHashMap linkedHashMapK = P0.k(mapC2, eventParams.getParams());
                        aVar2.V(version, widgetPageSourceC, c8129a.f273923a, c8129a.f273927e, c8129a.f273928f, categoryId, lVar.f112349n, c8129a.f273924b, lVar.f112304G, c8129a.f273925c, c8129a.f273926d, linkedHashMapK);
                    } else {
                        String categoryId2 = lVar.f112345l.getCategoryId();
                        WidgetPageSource widgetPageSourceC2 = b.c(lVar);
                        String str = c8129a.f273926d;
                        aVar2.J(widgetPageSourceC2, c8129a.f273923a, c8129a.f273927e, c8129a.f273928f, categoryId2, lVar.f112349n, c8129a.f273924b, lVar.f112304G, c8129a.f273925c, str, c8129a.f273929g);
                    }
                } else if (dVar instanceof a.d.c) {
                    a.d.c cVar = (a.d.c) dVar;
                    aVar2.S(b.c(lVar), lVar.f112345l.getCategoryId(), lVar.f112349n, cVar.f273938a, lVar.f112304G, cVar.f273939b);
                }
            } else if (aVar instanceof a.InterfaceC8123a) {
                com.avito.android.bxcontent.analytics.a aVar3 = bVar.f112573a;
                a.InterfaceC8123a interfaceC8123a = (a.InterfaceC8123a) aVar;
                if (interfaceC8123a instanceof a.InterfaceC8123a.c) {
                    aVar3.T(lVar.f112306I, ((a.InterfaceC8123a.c) interfaceC8123a).f273912a);
                } else if (interfaceC8123a instanceof a.InterfaceC8123a.b) {
                    a.InterfaceC8123a.b bVar3 = (a.InterfaceC8123a.b) interfaceC8123a;
                    aVar3.C(bVar3.f273911b, bVar3.f273910a);
                } else if (interfaceC8123a instanceof a.InterfaceC8123a.C8124a) {
                    a.InterfaceC8123a.C8124a c8124a = (a.InterfaceC8123a.C8124a) interfaceC8123a;
                    aVar3.H(c8124a.f273908a, c8124a.f273909b, lVar.f112306I);
                }
            } else if (aVar instanceof a.b) {
                com.avito.android.bxcontent.analytics.a aVar4 = bVar.f112573a;
                a.b bVar4 = (a.b) aVar;
                if (bVar4 instanceof a.b.c) {
                    aVar4.j(((a.b.c) bVar4).f273916a);
                } else if (bVar4 instanceof a.b.C8125a) {
                    a.b.C8125a c8125a = (a.b.C8125a) bVar4;
                    aVar4.F(c8125a.f273913a, c8125a.f273914b);
                } else if (L.f(bVar4, a.b.C8126b.f273915a)) {
                    aVar4.h();
                }
            } else if (aVar instanceof a.c) {
                com.avito.android.bxcontent.analytics.a aVar5 = bVar.f112573a;
                a.c cVar2 = (a.c) aVar;
                if (cVar2 instanceof a.c.C8128c) {
                    aVar5.N(lVar.f112345l.getCategoryId(), lVar.e(), ((a.c.C8128c) cVar2).f273921a);
                } else if (cVar2 instanceof a.c.C8127a) {
                    a.c.C8127a c8127a = (a.c.C8127a) cVar2;
                    String str2 = c8127a.f273917a;
                    StoriesFromPage storiesFromPageB = b.b(lVar);
                    String categoryId3 = lVar.f112345l.getCategoryId();
                    String strE = lVar.e();
                    aVar5.L(c8127a.f273919c, str2, c8127a.f273918b, storiesFromPageB.f109466b, categoryId3, strE);
                } else if (cVar2 instanceof a.c.b) {
                    aVar5.P(lVar.f112345l.getCategoryId(), ((a.c.b) cVar2).f273920a, b.b(lVar));
                } else if (cVar2 instanceof a.c.d) {
                    aVar5.f0(lVar.f112345l.getCategoryId(), ((a.c.d) cVar2).f273922a, b.b(lVar));
                }
            }
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k com.avito.android.bxcontent.analytics.a aVar) {
        this.f112573a = aVar;
    }

    public static StoriesFromPage b(l lVar) {
        if (lVar.e() != null) {
            return StoriesFromPage.f109462f;
        }
        if (lVar.f112299B) {
            return StoriesFromPage.f109461e;
        }
        int i12 = a.f112574a[lVar.f112306I.ordinal()];
        return i12 != 1 ? i12 != 2 ? StoriesFromPage.f109463g : StoriesFromPage.f109460d : StoriesFromPage.f109459c;
    }

    public static WidgetPageSource c(l lVar) {
        if (lVar.f112299B) {
            return WidgetPageSource.f272577f;
        }
        PresentationType presentationType = lVar.f112306I;
        return presentationType.isSerp() ? WidgetPageSource.f272576e : presentationType.isMain() ? WidgetPageSource.f272575d : WidgetPageSource.f272574c;
    }

    @Override // com.avito.android.bxcontent.mvi.usecase.analytics.a
    @k
    public final InterfaceC43160i<BxContentInternalAction> a(@k com.avito.android.serp.analytics.widgets_tracker.a aVar, @k l lVar) {
        return C43175k.G(new C3308b(aVar, this, lVar, null));
    }
}
