package com.avito.android.bxcontent.mvi;

import Ax.InterfaceC13095a;
import android.os.Bundle;
import androidx.core.os.C22777e;
import com.avito.android.C36135w2;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.arch.mvi.utils.n;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.bxcontent.mvi.C;
import com.avito.android.bxcontent.mvi.entity.BxContentInternalAction;
import com.avito.android.bxcontent.mvi.entity.C29167c;
import com.avito.android.bxcontent.mvi.entity.C29168d;
import com.avito.android.bxcontent.mvi.entity.FeedId;
import com.avito.android.bxcontent.mvi.entity.InterfaceC29127b;
import com.avito.android.bxcontent.mvi.entity.ItemsSearchLinkHandleForceType;
import com.avito.android.bxcontent.mvi.entity.LoadState;
import com.avito.android.bxcontent.mvi.entity.RecsReloadingState;
import com.avito.android.bxcontent.mvi.entity.i;
import com.avito.android.deep_linking.links.CategoriesLink;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.ItemsSearchLink;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.module.U7;
import com.avito.android.recent_query_search.item.RecentQuerySearchItem;
import com.avito.android.remote.model.Location;
import com.avito.android.remote.model.ParametrizedEvent;
import com.avito.android.remote.model.PresentationType;
import com.avito.android.remote.model.PresentationTypeKt;
import com.avito.android.remote.model.SearchParams;
import com.avito.android.remote.model.SerpSpaceTypeKt;
import com.avito.android.remote.model.ToolbarShareButton;
import com.avito.android.remote.model.additional_buttons.UniversalButton;
import com.avito.android.remote.model.serpomap_behavior.SwitchSerpMapButtonType;
import com.avito.android.rubricator.items.RubricatorRefinedItem;
import com.avito.android.search.filter.link.show.FiltersShowLink;
import com.avito.android.serp.adapter.InterfaceC34736h0;
import com.avito.android.serp.adapter.home_section_tab.SectionTag;
import com.avito.android.serp.adapter.home_section_tab.SectionTagsItem;
import com.avito.android.serp.adapter.l1;
import com.avito.android.serp.adapter.location_notification.LocationNotificationItem;
import com.avito.android.serp.adapter.snippet.SnippetItem;
import com.avito.android.serp_list.Mode;
import com.avito.android.shortcut_navigation_bar.adapter.ShortcutNavigationItem;
import com.avito.android.util.C35792f5;
import com.avito.android.util.C35800g5;
import es0.InterfaceC40152b;
import fs0.InterfaceC40473b;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import javax.inject.Provider;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.time.DurationUnit;
import kotlin.time.e;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43189o1;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import lW.InterfaceC43691a;
import nM.InterfaceC44291a;
import okhttp3.internal.http2.Http2;
import okhttp3.internal.http2.Http2Connection;
import pl.C47107a;
import sN0.InterfaceC48080b;
import shark.AndroidResourceIdNames;
import uv0.InterfaceC49118a;

/* compiled from: BxContentActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001:\u0001\u0005¨\u0006\u0006"}, d2 = {"Lcom/avito/android/bxcontent/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "Lcom/avito/android/bxcontent/mvi/entity/b;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/bxcontent/mvi/entity/l;", "a", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: com.avito.android.bxcontent.mvi.a, reason: case insensitive filesystem */
/* loaded from: classes12.dex */
public final class C29105a implements com.avito.android.arch.mvi.a<InterfaceC29127b, BxContentInternalAction, com.avito.android.bxcontent.mvi.entity.l> {

    /* renamed from: K, reason: collision with root package name */
    public static final long f111515K;

    /* renamed from: L, reason: collision with root package name */
    public static final /* synthetic */ int f111516L = 0;

    /* renamed from: A, reason: collision with root package name */
    @Y61.k
    public final InterfaceC34736h0 f111517A;

    /* renamed from: B, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.progress_info_toast_bar.interactor.g f111518B;

    /* renamed from: C, reason: collision with root package name */
    @Y61.k
    public final String f111519C;

    /* renamed from: D, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f111520D;

    /* renamed from: E, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.onboarding.q f111521E;

    /* renamed from: F, reason: collision with root package name */
    @Y61.k
    public final InterfaceC44291a f111522F;

    /* renamed from: G, reason: collision with root package name */
    @Y61.k
    public final C47107a f111523G;

    /* renamed from: H, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.last_search_tooltip.b f111524H;

    /* renamed from: I, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.serp.a f111525I;

    /* renamed from: J, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.arch.mvi.utils.o f111526J;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f111527a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.bxcontent.mvi.C> f111528b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.bxcontent.analytics.a> f111529c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC43691a> f111530d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final U7 f111531e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Provider<com.avito.android.onboarding_manager.e> f111532f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.serp.adapter.rich_snippets.service.order_request.e f111533g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final Provider<InterfaceC13095a> f111534h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.mvi.sources.a f111535i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.services_transportation_widget.interactor.g f111536j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final ED.a f111537k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final C36135w2 f111538l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bottom_navigation.space.a f111539m;

    /* renamed from: n, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.home.bottom_navigation.H f111540n;

    /* renamed from: o, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40152b f111541o;

    /* renamed from: p, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40473b f111542p;

    /* renamed from: q, reason: collision with root package name */
    @Y61.k
    public final InterfaceC48080b f111543q;

    /* renamed from: r, reason: collision with root package name */
    @Y61.k
    public final InterfaceC49118a f111544r;

    /* renamed from: s, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.video_snippets.g f111545s;

    /* renamed from: t, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.mvi.usecase.analytics.a f111546t;

    /* renamed from: u, reason: collision with root package name */
    @Y61.k
    public final C29168d f111547u;

    /* renamed from: v, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.main_start_onboarding.a f111548v;

    /* renamed from: w, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.home.o f111549w;

    /* renamed from: x, reason: collision with root package name */
    @Y61.k
    public final Z0 f111550x;

    /* renamed from: y, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.business360.a f111551y;

    /* renamed from: z, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.bxcontent.business360.d f111552z;

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$33", f = "BxContentActor.kt", i = {}, l = {1207}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$A */
    public static final class A extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111553q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111554r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ C29105a f111555s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public A(C29105a c29105a, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f111554r = lVar;
            this.f111555s = c29105a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new A(this.f111555s, this.f111554r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((A) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111553q;
            if (i12 == 0) {
                C42729a0.b(obj);
                com.avito.android.bxcontent.mvi.entity.l lVar = this.f111554r;
                boolean zIsMain = lVar.f112306I.isMain();
                C29105a c29105a = this.f111555s;
                if (zIsMain) {
                    c29105a.f111541o.a();
                }
                ED.a aVar = c29105a.f111537k;
                aVar.getClass();
                kotlin.reflect.n<Object> nVar = ED.a.f3880g[1];
                if (((Boolean) aVar.f3882c.a().invoke()).booleanValue() && lVar.f112306I.isSerp() && kotlin.jvm.internal.L.f(lVar.f112345l.getCategoryId(), "426")) {
                    c29105a.f111542p.a();
                }
                this.f111553q = 1;
                if (c29105a.f111544r.a(this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$35", f = "BxContentActor.kt", i = {}, l = {1250}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$B */
    public static final class B extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111556q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111557r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111558s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C29105a f111559t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public B(C29105a c29105a, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f111558s = lVar;
            this.f111559t = c29105a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            B b12 = new B(this.f111559t, this.f111558s, continuation);
            b12.f111557r = obj;
            return b12;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((B) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            ParametrizedEvent showEvent;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111556q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f111557r;
                com.avito.android.bxcontent.mvi.entity.C c12 = this.f111558s.f112334f0;
                if (!c12.f112032a) {
                    UniversalButton universalButton = c12.f112033b;
                    if (universalButton != null && (showEvent = universalButton.getShowEvent()) != null) {
                        int i13 = C29105a.f111516L;
                        this.f111559t.g().O(showEvent);
                    }
                    BxContentInternalAction.ShowUniversalButton showUniversalButton = BxContentInternalAction.ShowUniversalButton.f111978b;
                    this.f111556q = 1;
                    if (interfaceC43172j.emit(showUniversalButton, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$38", f = "BxContentActor.kt", i = {}, l = {1338}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$C */
    public static final class C extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111560q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111561r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111562s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C29105a f111563t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C(C29105a c29105a, InterfaceC29127b interfaceC29127b, Continuation continuation) {
            super(2, continuation);
            this.f111562s = interfaceC29127b;
            this.f111563t = c29105a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C c12 = new C(this.f111563t, this.f111562s, continuation);
            c12.f111561r = obj;
            return c12;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((C) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111560q;
            InterfaceC29127b interfaceC29127b = this.f111562s;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f111561r;
                BxContentInternalAction.RecsReloadButtonVisibilityChanged recsReloadButtonVisibilityChanged = new BxContentInternalAction.RecsReloadButtonVisibilityChanged(((InterfaceC29127b.C29129a0) interfaceC29127b).f112117a);
                this.f111560q = 1;
                if (interfaceC43172j.emit(recsReloadButtonVisibilityChanged, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            if (((InterfaceC29127b.C29129a0) interfaceC29127b).f112117a) {
                int i13 = C29105a.f111516L;
                this.f111563t.g().r();
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$39", f = "BxContentActor.kt", i = {}, l = {1347}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$D */
    public static final class D extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111564q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111565r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111566s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111568u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public D(com.avito.android.bxcontent.mvi.entity.l lVar, Continuation<? super D> continuation) {
            super(3, continuation);
            this.f111568u = lVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            D d12 = C29105a.this.new D(this.f111568u, continuation);
            d12.f111565r = interfaceC43172j;
            d12.f111566s = xVar;
            return d12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111564q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111565r;
                com.avito.android.arch.mvi.utils.x xVar = this.f111566s;
                int i13 = C29105a.f111516L;
                C29105a c29105a = C29105a.this;
                c29105a.g().s();
                c29105a.f111545s.g();
                C43210w c43210w = new C43210w(new BxContentInternalAction.RecsReloadButtonVisibilityChanged(false));
                C43210w c43210w2 = new C43210w(new BxContentInternalAction.UpdateRecsReloadState(RecsReloadingState.f112050c));
                com.avito.android.bxcontent.mvi.C cI2 = c29105a.i();
                com.avito.android.bxcontent.mvi.entity.l lVar = this.f111568u;
                kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(c43210w, c43210w2, cI2.e(null, new C.b(lVar.f112333f, 0, 0, lVar.f112343k, null, false, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a, lVar.f112306I, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b, "update_button", c29105a.f111517A.getLayoutType(), lVar.f112308K, null, null, lVar.f112313P, lVar.f112314Q, lVar.f112315R, lVar.f112316S, lVar.f112317T, lVar.f112326b0, 54, null)));
                this.f111565r = null;
                this.f111564q = 1;
                if (C43175k.u(this, mVarN, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$4", f = "BxContentActor.kt", i = {1, 1, 1, 2, 2, 2, 3, 3, 3, 4, 4, 4, 6, 6}, l = {269, 282, 283, 284, 285, 286, 317, 319}, m = "invokeSuspend", n = {"$this$flowWithMutablePrivateStateAccess", "stateHolder", "link", "$this$flowWithMutablePrivateStateAccess", "stateHolder", "link", "$this$flowWithMutablePrivateStateAccess", "stateHolder", "link", "$this$flowWithMutablePrivateStateAccess", "stateHolder", "link", "$this$flowWithMutablePrivateStateAccess", "link"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$1"})
    /* renamed from: com.avito.android.bxcontent.mvi.a$E */
    public static final class E extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.l<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111569A;

        /* renamed from: q, reason: collision with root package name */
        public DeepLink f111570q;

        /* renamed from: r, reason: collision with root package name */
        public Object[] f111571r;

        /* renamed from: s, reason: collision with root package name */
        public Object[] f111572s;

        /* renamed from: t, reason: collision with root package name */
        public int f111573t;

        /* renamed from: u, reason: collision with root package name */
        public int f111574u;

        /* renamed from: v, reason: collision with root package name */
        public int f111575v;

        /* renamed from: w, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111576w;

        /* renamed from: x, reason: collision with root package name */
        public /* synthetic */ Object f111577x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111578y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ C29105a f111579z;

        /* compiled from: BxContentActor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/i;", "invoke", "(Lcom/avito/android/bxcontent/mvi/entity/i;)Lcom/avito/android/bxcontent/mvi/entity/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.mvi.a$E$a, reason: collision with other inner class name */
        public static final class C3290a extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.bxcontent.mvi.entity.i, com.avito.android.bxcontent.mvi.entity.i> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ItemsSearchLink f111580l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3290a(ItemsSearchLink itemsSearchLink) {
                super(1);
                this.f111580l = itemsSearchLink;
            }

            @Override // Y41.l
            public final com.avito.android.bxcontent.mvi.entity.i invoke(com.avito.android.bxcontent.mvi.entity.i iVar) {
                ItemsSearchLink itemsSearchLink = this.f111580l;
                return new com.avito.android.bxcontent.mvi.entity.i(itemsSearchLink.f133403b, itemsSearchLink.f133404c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public E(C29105a c29105a, InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111578y = interfaceC29127b;
            this.f111579z = c29105a;
            this.f111569A = lVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<com.avito.android.bxcontent.mvi.entity.i> lVar, Continuation<? super kotlin.G0> continuation) {
            InterfaceC29127b interfaceC29127b = this.f111578y;
            E e12 = new E(this.f111579z, interfaceC29127b, this.f111569A, continuation);
            e12.f111576w = interfaceC43172j;
            e12.f111577x = lVar;
            return e12.invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:29:0x00f8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:32:0x010b  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x0127  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x0195  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x01e9 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:56:0x0228 A[RETURN] */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:33:0x0122 -> B:35:0x0125). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r46) {
            /*
                Method dump skipped, instructions count: 594
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29105a.E.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BxContentActor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$40", f = "BxContentActor.kt", i = {}, l = {1474}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$F */
    public static final class F extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111581q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111582r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111583s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111584t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C29105a f111585u;

        /* compiled from: BxContentActor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.bxcontent.mvi.a$F$a, reason: collision with other inner class name */
        public /* synthetic */ class C3291a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f111586a;

            static {
                int[] iArr = new int[SwitchSerpMapButtonType.values().length];
                try {
                    iArr[SwitchSerpMapButtonType.SERP.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[SwitchSerpMapButtonType.MAP.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f111586a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public F(C29105a c29105a, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111584t = lVar;
            this.f111585u = c29105a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            com.avito.android.bxcontent.mvi.entity.l lVar = this.f111584t;
            F f12 = new F(this.f111585u, lVar, continuation);
            f12.f111582r = interfaceC43172j;
            f12.f111583s = xVar;
            return f12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            int i12;
            int i13;
            int i14;
            InterfaceC43160i interfaceC43160iW;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i15 = this.f111581q;
            if (i15 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f111582r;
                com.avito.android.arch.mvi.utils.x xVar = this.f111583s;
                com.avito.android.bxcontent.mvi.entity.l lVar = this.f111584t;
                SwitchSerpMapButtonType buttonType = lVar.f112344k0.getButtonType();
                int i16 = C29105a.f111516L;
                C29105a c29105a = this.f111585u;
                com.avito.android.bxcontent.analytics.a aVarG = c29105a.g();
                int[] iArr = C3291a.f111586a;
                int i17 = iArr[buttonType.ordinal()];
                if (i17 == 1) {
                    i12 = 1;
                } else {
                    if (i17 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i12 = 0;
                }
                aVarG.M(i12);
                int i18 = iArr[buttonType.ordinal()];
                if (i18 == 1) {
                    i13 = 3;
                } else {
                    if (i18 != 2) {
                        throw new NoWhenBranchMatchedException();
                    }
                    i13 = 5;
                }
                C43210w c43210w = new C43210w(new BxContentInternalAction.BottomSheetStateChanged(i13, false));
                InterfaceC43160i interfaceC43160iE = buttonType == SwitchSerpMapButtonType.SERP ? c29105a.i().e(null, new C.b(null, 0, 0, null, null, false, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a, lVar.f112306I, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b, lVar.f112305H, c29105a.f111517A.getLayoutType(), lVar.f112308K, null, null, null, null, null, lVar.f112316S, null, null, 901183, null)) : C43175k.w();
                if (buttonType == SwitchSerpMapButtonType.MAP) {
                    i14 = 1;
                    interfaceC43160iW = C43175k.N(new C43210w(new BxContentInternalAction.PanelStateChanged()), C29105a.d(c29105a, lVar));
                } else {
                    i14 = 1;
                    interfaceC43160iW = C43175k.w();
                }
                InterfaceC43160i[] interfaceC43160iArr = new InterfaceC43160i[3];
                interfaceC43160iArr[0] = c43210w;
                interfaceC43160iArr[i14] = interfaceC43160iE;
                interfaceC43160iArr[2] = interfaceC43160iW;
                kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(interfaceC43160iArr);
                this.f111582r = mVarN;
                this.f111581q = i14;
                if (C43175k.u(this, mVarN, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i15 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$41", f = "BxContentActor.kt", i = {}, l = {1502}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$G */
    public static final class G extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, Throwable, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111587q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111588r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f111589s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111590t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public G(com.avito.android.bxcontent.mvi.entity.l lVar, Continuation<? super G> continuation) {
            super(3, continuation);
            this.f111590t = lVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Throwable th2, Continuation<? super kotlin.G0> continuation) {
            G g12 = new G(this.f111590t, continuation);
            g12.f111588r = interfaceC43172j;
            g12.f111589s = th2;
            return g12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111587q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111588r;
                BxContentInternalAction.Error.Other other = new BxContentInternalAction.Error.Other(this.f111589s, null, this.f111590t.f().f112427d, 2, null);
                this.f111588r = null;
                this.f111587q = 1;
                if (interfaceC43172j.emit(other, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$5", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$H */
    public static final class H extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111591q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C29105a f111592r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public H(C29105a c29105a, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f111591q = lVar;
            this.f111592r = c29105a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new H(this.f111592r, this.f111591q, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((H) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.bxcontent.mvi.entity.l lVar = this.f111591q;
            String locationId = lVar.getLocationId();
            C29105a c29105a = this.f111592r;
            com.avito.android.deeplink_handler.handler.composite.a aVar = c29105a.f111527a;
            if (kotlin.jvm.internal.L.f(locationId, "")) {
                locationId = "621540";
            }
            b.a.a(aVar, new CategoriesLink(null, locationId, 1, null), null, null, 6);
            c29105a.g().e(lVar.f112306I);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$6", f = "BxContentActor.kt", i = {}, l = {356, 358}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$I */
    public static final class I extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111593q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111594r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111595s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111596t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111597u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C29105a f111598v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public I(C29105a c29105a, InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111596t = lVar;
            this.f111597u = interfaceC29127b;
            this.f111598v = c29105a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            com.avito.android.bxcontent.mvi.entity.l lVar = this.f111596t;
            InterfaceC29127b interfaceC29127b = this.f111597u;
            I i12 = new I(this.f111598v, interfaceC29127b, lVar, continuation);
            i12.f111594r = interfaceC43172j;
            i12.f111595s = xVar;
            return i12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object next;
            SectionTag sectionTag;
            List<SectionTag> list;
            Object next2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111593q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111594r;
                com.avito.android.arch.mvi.utils.x xVar = this.f111595s;
                com.avito.android.bxcontent.mvi.entity.l lVar = this.f111596t;
                Iterator<T> it = lVar.f().f112428e.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        next = null;
                        break;
                    }
                    next = it.next();
                    if (((l1) next) instanceof SectionTagsItem) {
                        break;
                    }
                }
                SectionTagsItem sectionTagsItem = next instanceof SectionTagsItem ? (SectionTagsItem) next : null;
                InterfaceC29127b interfaceC29127b = this.f111597u;
                if (sectionTagsItem == null || (list = sectionTagsItem.f270152d) == null) {
                    sectionTag = null;
                } else {
                    Iterator<T> it2 = list.iterator();
                    while (true) {
                        if (!it2.hasNext()) {
                            next2 = null;
                            break;
                        }
                        next2 = it2.next();
                        if (kotlin.jvm.internal.L.f(((SectionTag) next2).f270145c, ((InterfaceC29127b.C29128a) interfaceC29127b).f112115a)) {
                            break;
                        }
                    }
                    sectionTag = (SectionTag) next2;
                }
                FeedId feedId = new FeedId(((InterfaceC29127b.C29128a) interfaceC29127b).f112115a, sectionTag != null ? Collections.singletonList(sectionTag.f270147e) : C42745f0.V(((InterfaceC29127b.C29128a) interfaceC29127b).f112116b));
                com.avito.android.bxcontent.mvi.entity.t.f112422f.getClass();
                if (lVar.f112337h.getOrDefault(feedId, com.avito.android.bxcontent.mvi.entity.t.f112423g).f112425b == LoadState.f112045d) {
                    BxContentInternalAction.UpdateCurrentFeed updateCurrentFeed = new BxContentInternalAction.UpdateCurrentFeed(feedId);
                    this.f111594r = null;
                    this.f111593q = 1;
                    if (interfaceC43172j.emit(updateCurrentFeed, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    int i13 = C29105a.f111516L;
                    C29105a c29105a = this.f111598v;
                    kotlinx.coroutines.flow.X xE2 = c29105a.i().e(null, new C.b(feedId, 0, 1, lVar.f112343k, null, false, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a, lVar.f112306I, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b, lVar.f112305H, c29105a.f111517A.getLayoutType(), lVar.f112308K, lVar.f112312O, lVar.f112310M, null, null, null, null, null, null, 1032208, null));
                    this.f111594r = null;
                    this.f111593q = 2;
                    if (C43175k.u(this, xE2, interfaceC43172j) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$7", f = "BxContentActor.kt", i = {}, l = {388}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$J */
    public static final class J extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111599q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111600r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111601s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111602t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C29105a f111603u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public J(C29105a c29105a, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111602t = lVar;
            this.f111603u = c29105a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            com.avito.android.bxcontent.mvi.entity.l lVar = this.f111602t;
            J j12 = new J(this.f111603u, lVar, continuation);
            j12.f111600r = interfaceC43172j;
            j12.f111601s = xVar;
            return j12.invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:23:0x00d0 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r32) {
            /*
                r31 = this;
                r0 = r31
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f111599q
                r3 = 1
                if (r2 == 0) goto L1a
                if (r2 != r3) goto L12
                kotlin.C42729a0.b(r32)
                goto Ld1
            L12:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L1a:
                kotlin.C42729a0.b(r32)
                kotlinx.coroutines.flow.j r2 = r0.f111600r
                com.avito.android.arch.mvi.utils.x r4 = r0.f111601s
                com.avito.android.bxcontent.mvi.entity.l r5 = r0.f111602t
                com.avito.android.bxcontent.mvi.entity.t r6 = r5.f()
                com.avito.android.bxcontent.mvi.entity.y r7 = r5.f112336g0
                r7.getClass()
                com.avito.android.bxcontent.mvi.entity.RecsReloadingState r8 = com.avito.android.bxcontent.mvi.entity.RecsReloadingState.f112051d
                com.avito.android.bxcontent.mvi.entity.RecsReloadingState r7 = r7.f112445b
                if (r7 != r8) goto L37
                java.lang.String r7 = "update_button"
            L34:
                r18 = r7
                goto L3a
            L37:
                java.lang.String r7 = r5.f112305H
                goto L34
            L3a:
                int r7 = com.avito.android.bxcontent.mvi.C29105a.f111516L
                com.avito.android.bxcontent.mvi.a r7 = r0.f111603u
                com.avito.android.bxcontent.mvi.C r15 = r7.i()
                int r8 = r6.f112427d
                int r11 = r8 + 1
                java.lang.Object r8 = r4.getValue()
                com.avito.android.bxcontent.mvi.entity.i r8 = (com.avito.android.bxcontent.mvi.entity.i) r8
                com.avito.android.remote.model.SearchParams r14 = r8.f112295a
                java.lang.Object r4 = r4.getValue()
                com.avito.android.bxcontent.mvi.entity.i r4 = (com.avito.android.bxcontent.mvi.entity.i) r4
                java.lang.String r4 = r4.f112296b
                com.avito.android.w2 r8 = r7.f111538l
                r8.getClass()
                kotlin.reflect.n<java.lang.Object>[] r9 = com.avito.android.C36135w2.f327457X
                r10 = 34
                r9 = r9[r10]
                com.avito.android.A0$a r8 = r8.f327462E
                DE0.a r8 = r8.a()
                java.lang.Object r8 = r8.invoke()
                java.lang.Boolean r8 = (java.lang.Boolean) r8
                boolean r8 = r8.booleanValue()
                com.avito.android.serp.adapter.h0 r7 = r7.f111517A
                if (r8 == 0) goto L83
                com.avito.android.serp.adapter.LayoutType r8 = r5.f112311N
                if (r8 != 0) goto L80
                com.avito.android.serp.adapter.LayoutType r7 = r7.getLayoutType()
            L7d:
                r19 = r7
                goto L88
            L80:
                r19 = r8
                goto L88
            L83:
                com.avito.android.serp.adapter.LayoutType r7 = r7.getLayoutType()
                goto L7d
            L88:
                com.avito.android.bxcontent.mvi.C$b r7 = new com.avito.android.bxcontent.mvi.C$b
                r8 = r7
                r27 = 0
                r28 = 0
                com.avito.android.bxcontent.mvi.entity.FeedId r9 = r5.f112333f
                int r10 = r6.f112424a
                com.avito.android.remote.model.Location r12 = r5.f112343k
                r13 = 0
                r6 = 0
                r17 = r14
                r14 = r6
                com.avito.android.remote.model.PresentationType r6 = r5.f112306I
                r16 = r6
                java.lang.String r6 = r5.f112308K
                r20 = r6
                java.lang.Long r6 = r5.f112312O
                r21 = r6
                java.lang.String r6 = r5.f112310M
                r22 = r6
                r23 = 0
                r24 = 0
                r25 = 0
                com.avito.android.AnalyticParams r5 = r5.f112316S
                r26 = r5
                r29 = 901168(0xdc030, float:1.262805E-39)
                r30 = 0
                r5 = r15
                r15 = r17
                r17 = r4
                r8.<init>(r9, r10, r11, r12, r13, r14, r15, r16, r17, r18, r19, r20, r21, r22, r23, r24, r25, r26, r27, r28, r29, r30)
                r4 = 0
                kotlinx.coroutines.flow.X r5 = r5.e(r4, r7)
                r0.f111600r = r4
                r0.f111599q = r3
                java.lang.Object r2 = kotlinx.coroutines.flow.C43175k.u(r0, r5, r2)
                if (r2 != r1) goto Ld1
                return r1
            Ld1:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29105a.J.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$8", f = "BxContentActor.kt", i = {}, l = {422}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$K */
    public static final class K extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111604q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111605r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111606s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111608u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111609v;

        /* compiled from: BxContentActor.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$8$1", f = "BxContentActor.kt", i = {}, l = {451}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.bxcontent.mvi.a$K$a, reason: collision with other inner class name */
        public static final class C3292a extends SuspendLambda implements Y41.p<BxContentInternalAction, Continuation<? super kotlin.G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f111610q;

            public C3292a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C3292a(2, continuation);
            }

            @Override // Y41.p
            public final Object invoke(BxContentInternalAction bxContentInternalAction, Continuation<? super kotlin.G0> continuation) {
                return ((C3292a) create(bxContentInternalAction, continuation)).invokeSuspend(kotlin.G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f111610q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    long j12 = C29105a.f111515K;
                    this.f111610q = 1;
                    if (C43131e0.c(j12, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                return kotlin.G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public K(InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111608u = lVar;
            this.f111609v = interfaceC29127b;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            C29105a c29105a = C29105a.this;
            com.avito.android.bxcontent.mvi.entity.l lVar = this.f111608u;
            K k12 = c29105a.new K(this.f111609v, lVar, continuation);
            k12.f111605r = interfaceC43172j;
            k12.f111606s = xVar;
            return k12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111604q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111605r;
                com.avito.android.arch.mvi.utils.x xVar = this.f111606s;
                C29105a c29105a = C29105a.this;
                c29105a.f111545s.g();
                com.avito.android.bxcontent.mvi.entity.l lVar = this.f111608u;
                com.avito.android.bxcontent.mvi.entity.t tVarF = lVar.f();
                com.avito.android.bxcontent.mvi.entity.y yVar = lVar.f112336g0;
                yVar.getClass();
                String str = yVar.f112445b == RecsReloadingState.f112051d ? "update_button" : lVar.f112305H;
                com.avito.android.bxcontent.mvi.C cI2 = c29105a.i();
                List<ShortcutNavigationItem> list = lVar.f112325b;
                C43197r1 c43197r1 = new C43197r1(new C3292a(2, null), cI2.e((list == null || list.isEmpty()) ? new C.c(lVar.getLocationId(), null, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a, ((InterfaceC29127b.C29142h0) this.f111609v).f112138a, lVar.f112306I, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b, lVar.f112307J, 2, null) : null, new C.b(lVar.f112333f, tVarF.f112424a, tVarF.f112427d, lVar.f112343k, null, false, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a, lVar.f112306I, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b, str, c29105a.f111517A.getLayoutType(), lVar.f112308K, lVar.f112312O, lVar.f112310M, null, null, null, lVar.f112316S, null, null, 901168, null)));
                this.f111605r = null;
                this.f111604q = 1;
                if (C43175k.u(this, c43197r1, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$9", f = "BxContentActor.kt", i = {}, l = {467}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$L */
    public static final class L extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111611q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111612r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111613s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111615u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111616v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public L(InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111615u = lVar;
            this.f111616v = interfaceC29127b;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            C29105a c29105a = C29105a.this;
            com.avito.android.bxcontent.mvi.entity.l lVar = this.f111615u;
            L l12 = c29105a.new L(this.f111616v, lVar, continuation);
            l12.f111612r = interfaceC43172j;
            l12.f111613s = xVar;
            return l12.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            C43210w c43210w;
            C.c cVar;
            Object next;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111611q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111612r;
                com.avito.android.arch.mvi.utils.x xVar = this.f111613s;
                C29105a c29105a = C29105a.this;
                c29105a.f111545s.g();
                com.avito.android.bxcontent.mvi.entity.l lVar = this.f111615u;
                SectionTagsItem sectionTagsItem = lVar.f112331e;
                FeedId feedId = lVar.f112333f;
                if (sectionTagsItem != null) {
                    Iterator<T> it = sectionTagsItem.f270152d.iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            next = null;
                            break;
                        }
                        next = it.next();
                        if (((SectionTag) next).f270148f == null) {
                            break;
                        }
                    }
                    SectionTag sectionTag = (SectionTag) next;
                    if (kotlin.jvm.internal.L.f(feedId.f112036b, sectionTag != null ? sectionTag.f270145c : null)) {
                        FeedId.f112034d.getClass();
                        feedId = FeedId.f112035e;
                    }
                }
                FeedId feedId2 = feedId;
                C43210w c43210w2 = new C43210w(new BxContentInternalAction.UpdateCachedContent(feedId2));
                C43210w c43210w3 = new C43210w(new BxContentInternalAction.UpdateRecsReloadState(RecsReloadingState.f112049b));
                C43210w c43210w4 = new C43210w(BxContentInternalAction.ResetVerticalFilter.f111954b);
                com.avito.android.bxcontent.mvi.C cI2 = c29105a.i();
                List<ShortcutNavigationItem> list = lVar.f112325b;
                if (list == null || list.isEmpty()) {
                    c43210w = c43210w4;
                    cVar = new C.c(lVar.getLocationId(), null, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a, ((InterfaceC29127b.C29136e0) this.f111616v).f112128a, lVar.f112306I, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b, lVar.f112307J, 2, null);
                } else {
                    c43210w = c43210w4;
                    cVar = null;
                }
                kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(c43210w2, c43210w3, c43210w, cI2.e(cVar, new C.b(feedId2, 0, 0, lVar.f112343k, null, false, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a, lVar.f112306I, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b, lVar.f112305H, c29105a.f111517A.getLayoutType(), lVar.f112308K, null, null, lVar.f112313P, lVar.f112314Q, lVar.f112315R, lVar.f112316S, lVar.f112317T, lVar.f112326b0, 54, null)));
                this.f111612r = null;
                this.f111611q = 1;
                if (C43175k.u(this, mVarN, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u001a\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004ø\u0001\u0000ø\u0001\u0001¢\u0006\u0006\n\u0004\b\t\u0010\nR\u0014\u0010\u000b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\u0006R\u0014\u0010\f\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\f\u0010\u0006\u0082\u0002\u000b\n\u0005\b¡\u001e0\u0001\n\u0002\b!¨\u0006\r"}, d2 = {"Lcom/avito/android/bxcontent/mvi/a$a;", "", "<init>", "()V", "", "FROM_PAGE_B360_MAIN", "Ljava/lang/String;", "KEY_VERTICAL_ID", "Lkotlin/time/e;", "PROGRESS_DELAY_MS", "J", "UPDATE_BUTTON_FROM_PAGE", "VALUE_REAL_ESTATE_ID", "_avito_serp_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.a$a, reason: collision with other inner class name */
    public static final class C3293a {
        public /* synthetic */ C3293a(C42822w c42822w) {
            this();
        }

        public C3293a() {
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.bxcontent.mvi.a$b, reason: case insensitive filesystem */
    public /* synthetic */ class C29106b {
        static {
            int[] iArr = new int[ItemsSearchLinkHandleForceType.values().length];
            try {
                iArr[0] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                ItemsSearchLinkHandleForceType itemsSearchLinkHandleForceType = ItemsSearchLinkHandleForceType.f112038b;
                iArr[1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                ItemsSearchLinkHandleForceType itemsSearchLinkHandleForceType2 = ItemsSearchLinkHandleForceType.f112038b;
                iArr[2] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$flowWithPrivateStateAccess$1", f = "BxContentActor.kt", i = {}, l = {1803}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$c, reason: case insensitive filesystem */
    public static final class C29107c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111617q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111618r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ SuspendLambda f111619s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.arch.mvi.utils.n<com.avito.android.bxcontent.mvi.entity.i, com.avito.android.bxcontent.mvi.entity.j, ?> f111620t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.j f111621u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public C29107c(Y41.q<? super InterfaceC43172j<? super BxContentInternalAction>, ? super com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, ? super Continuation<? super kotlin.G0>, ? extends Object> qVar, com.avito.android.arch.mvi.utils.n<com.avito.android.bxcontent.mvi.entity.i, com.avito.android.bxcontent.mvi.entity.j, ?> nVar, com.avito.android.bxcontent.mvi.entity.j jVar, Continuation<? super C29107c> continuation) {
            super(2, continuation);
            this.f111619s = (SuspendLambda) qVar;
            this.f111620t = nVar;
            this.f111621u = jVar;
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C29107c c29107c = new C29107c(this.f111619s, this.f111620t, this.f111621u, continuation);
            c29107c.f111618r = obj;
            return c29107c;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((C29107c) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r2v1, types: [Y41.q, kotlin.coroutines.jvm.internal.SuspendLambda] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111617q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f111618r;
                com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVarB = this.f111620t.b(this.f111621u);
                this.f111617q = 1;
                if (this.f111619s.invoke(interfaceC43172j, xVarB, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$10", f = "BxContentActor.kt", i = {}, l = {523}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$d, reason: case insensitive filesystem */
    public static final class C29108d extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.l<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111622q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111623r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f111624s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111625t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C29105a f111626u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111627v;

        /* compiled from: BxContentActor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/i;", "invoke", "(Lcom/avito/android/bxcontent/mvi/entity/i;)Lcom/avito/android/bxcontent/mvi/entity/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.mvi.a$d$a, reason: collision with other inner class name */
        public static final class C3294a extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.bxcontent.mvi.entity.i, com.avito.android.bxcontent.mvi.entity.i> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ SearchParams f111628l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3294a(SearchParams searchParams) {
                super(1);
                this.f111628l = searchParams;
            }

            @Override // Y41.l
            public final com.avito.android.bxcontent.mvi.entity.i invoke(com.avito.android.bxcontent.mvi.entity.i iVar) {
                return new com.avito.android.bxcontent.mvi.entity.i(this.f111628l, iVar.f112296b);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29108d(C29105a c29105a, InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111625t = interfaceC29127b;
            this.f111626u = c29105a;
            this.f111627v = lVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<com.avito.android.bxcontent.mvi.entity.i> lVar, Continuation<? super kotlin.G0> continuation) {
            InterfaceC29127b interfaceC29127b = this.f111625t;
            C29108d c29108d = new C29108d(this.f111626u, interfaceC29127b, this.f111627v, continuation);
            c29108d.f111623r = interfaceC43172j;
            c29108d.f111624s = lVar;
            return c29108d.invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111622q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111623r;
                com.avito.android.arch.mvi.utils.l lVar = this.f111624s;
                SearchParams searchParams = ((com.avito.android.bxcontent.mvi.entity.i) lVar.getValue()).f112295a;
                SearchParams searchParams2 = ((com.avito.android.bxcontent.mvi.entity.i) lVar.getValue()).f112295a;
                InterfaceC29127b.C29138f0 c29138f0 = (InterfaceC29127b.C29138f0) this.f111625t;
                SearchParams searchParamsCopy = searchParams2.copy(((-1234173943) & 1) != 0 ? searchParams2.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams2.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams2.locationId : null, ((-1234173943) & 8) != 0 ? searchParams2.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams2.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams2.directionId : null, ((-1234173943) & 64) != 0 ? searchParams2.districtId : null, ((-1234173943) & 128) != 0 ? searchParams2.params : null, ((-1234173943) & 256) != 0 ? searchParams2.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams2.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams2.query : null, ((-1234173943) & 2048) != 0 ? searchParams2.title : null, ((-1234173943) & 4096) != 0 ? searchParams2.owner : null, ((-1234173943) & 8192) != 0 ? searchParams2.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams2.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams2.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams2.radius : null, ((-1234173943) & 131072) != 0 ? searchParams2.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams2.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams2.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams2.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams2.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams2.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams2.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams2.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams2.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams2.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams2.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams2.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams2.area : c29138f0.f112130a, ((-1234173943) & 1073741824) != 0 ? searchParams2.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams2.clarifyIconType : null, (0 & 1) != 0 ? searchParams2.drawId : null);
                C3294a c3294a = new C3294a(searchParamsCopy);
                C29105a c29105a = this.f111626u;
                C29105a.e(c29105a, lVar, c3294a);
                if (searchParams.getArea() == null && !searchParams.equals(searchParamsCopy)) {
                    com.avito.android.bxcontent.mvi.entity.l lVar2 = this.f111627v;
                    if (lVar2.f112306I.isFullMap()) {
                        kotlinx.coroutines.flow.X xE2 = c29105a.i().e(new C.c(((com.avito.android.bxcontent.mvi.entity.i) lVar.getValue()).f112295a.getLocationId(), null, ((com.avito.android.bxcontent.mvi.entity.i) lVar.getValue()).f112295a, c29138f0.f112131b, lVar2.f112306I, ((com.avito.android.bxcontent.mvi.entity.i) lVar.getValue()).f112296b, lVar2.f112307J, 2, null), null);
                        this.f111623r = null;
                        this.f111622q = 1;
                        if (C43175k.u(this, xE2, interfaceC43172j) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$11", f = "BxContentActor.kt", i = {}, l = {561}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$e, reason: case insensitive filesystem */
    public static final class C29109e extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111629q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111630r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111631s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111632t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111633u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C29105a f111634v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29109e(C29105a c29105a, InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111632t = interfaceC29127b;
            this.f111633u = lVar;
            this.f111634v = c29105a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            InterfaceC29127b interfaceC29127b = this.f111632t;
            com.avito.android.bxcontent.mvi.entity.l lVar = this.f111633u;
            C29109e c29109e = new C29109e(this.f111634v, interfaceC29127b, lVar, continuation);
            c29109e.f111630r = interfaceC43172j;
            c29109e.f111631s = xVar;
            return c29109e.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111629q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f111630r;
                com.avito.android.arch.mvi.utils.x xVar = this.f111631s;
                Integer num = ((InterfaceC29127b.C29140g0) this.f111632t).f112133a;
                com.avito.android.bxcontent.mvi.entity.l lVar = this.f111633u;
                C43210w c43210w = new C43210w(new BxContentInternalAction.BottomSheetStateChanged(num != null ? num.intValue() : lVar.f112309L, false));
                int i13 = C29105a.f111516L;
                C29105a c29105a = this.f111634v;
                kotlinx.coroutines.flow.internal.m mVarN = C43175k.N(c43210w, c29105a.i().e(null, new C.b(null, 0, 0, null, null, false, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a, lVar.f112306I, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b, lVar.f112305H, c29105a.f111517A.getLayoutType(), lVar.f112308K, null, null, null, null, null, lVar.f112316S, null, null, 901183, null)));
                this.f111630r = mVarN;
                this.f111629q = 1;
                if (C43175k.u(this, mVarN, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$12", f = "BxContentActor.kt", i = {0, 0, 0, 1, 1, 1, 2, 2, 2, 3, 3, 3, 3, 4, 4, 6, 6, 7, 7, 8, 8, 8}, l = {566, 567, 568, 570, 579, 605, 629, 630, 631, 632}, m = "invokeSuspend", n = {"$this$flowWithMutablePrivateStateAccess", "stateHolder", "location", "$this$flowWithMutablePrivateStateAccess", "stateHolder", "location", "$this$flowWithMutablePrivateStateAccess", "stateHolder", "location", "$this$flowWithMutablePrivateStateAccess", "stateHolder", "location", "$this$forEach$iv", "$this$flowWithMutablePrivateStateAccess", "stateHolder", "$this$flowWithMutablePrivateStateAccess", "stateHolder", "$this$flowWithMutablePrivateStateAccess", "stateHolder", "$this$flowWithMutablePrivateStateAccess", "stateHolder", "$this$forEach$iv"}, s = {"L$0", "L$1", "L$5", "L$0", "L$1", "L$5", "L$0", "L$1", "L$5", "L$0", "L$1", "L$5", "L$6", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$0", "L$1", "L$2"})
    /* renamed from: com.avito.android.bxcontent.mvi.a$f, reason: case insensitive filesystem */
    public static final class C29110f extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.l<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: A, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111635A;

        /* renamed from: B, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111636B;

        /* renamed from: C, reason: collision with root package name */
        public final /* synthetic */ C29105a f111637C;

        /* renamed from: q, reason: collision with root package name */
        public Object f111638q;

        /* renamed from: r, reason: collision with root package name */
        public com.avito.android.bxcontent.mvi.entity.l f111639r;

        /* renamed from: s, reason: collision with root package name */
        public InterfaceC29127b f111640s;

        /* renamed from: t, reason: collision with root package name */
        public Location f111641t;

        /* renamed from: u, reason: collision with root package name */
        public Object[] f111642u;

        /* renamed from: v, reason: collision with root package name */
        public int f111643v;

        /* renamed from: w, reason: collision with root package name */
        public int f111644w;

        /* renamed from: x, reason: collision with root package name */
        public int f111645x;

        /* renamed from: y, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111646y;

        /* renamed from: z, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f111647z;

        /* compiled from: BxContentActor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/i;", "invoke", "(Lcom/avito/android/bxcontent/mvi/entity/i;)Lcom/avito/android/bxcontent/mvi/entity/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.mvi.a$f$a, reason: collision with other inner class name */
        public static final class C3295a extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.bxcontent.mvi.entity.i, com.avito.android.bxcontent.mvi.entity.i> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.arch.mvi.utils.l<com.avito.android.bxcontent.mvi.entity.i> f111648l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ Location f111649m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3295a(com.avito.android.arch.mvi.utils.l<com.avito.android.bxcontent.mvi.entity.i> lVar, Location location) {
                super(1);
                this.f111648l = lVar;
                this.f111649m = location;
            }

            @Override // Y41.l
            public final com.avito.android.bxcontent.mvi.entity.i invoke(com.avito.android.bxcontent.mvi.entity.i iVar) {
                SearchParams searchParams = this.f111648l.getValue().f112295a;
                return new com.avito.android.bxcontent.mvi.entity.i(searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : this.f111649m.getId(), ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null), iVar.f112296b);
            }
        }

        /* compiled from: BxContentActor.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.bxcontent.mvi.a$f$b */
        public /* synthetic */ class b {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f111650a;

            static {
                int[] iArr = new int[PresentationType.values().length];
                try {
                    iArr[PresentationType.PUSH.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                f111650a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29110f(C29105a c29105a, InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111635A = interfaceC29127b;
            this.f111636B = lVar;
            this.f111637C = c29105a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<com.avito.android.bxcontent.mvi.entity.i> lVar, Continuation<? super kotlin.G0> continuation) {
            InterfaceC29127b interfaceC29127b = this.f111635A;
            com.avito.android.bxcontent.mvi.entity.l lVar2 = this.f111636B;
            C29110f c29110f = new C29110f(this.f111637C, interfaceC29127b, lVar2, continuation);
            c29110f.f111646y = interfaceC43172j;
            c29110f.f111647z = lVar;
            return c29110f.invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:23:0x00f5 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:26:0x010e A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:29:0x0121  */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0143  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x01fd  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x02a8 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x02b9  */
        /* JADX WARN: Removed duplicated region for block: B:59:0x02dd  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:30:0x013c -> B:32:0x013f). Please report as a decompilation issue!!! */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:57:0x02d0 -> B:58:0x02d6). Please report as a decompilation issue!!! */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r41) {
            /*
                Method dump skipped, instructions count: 832
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29105a.C29110f.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$13", f = "BxContentActor.kt", i = {0, 0, 0}, l = {650, 651}, m = "invokeSuspend", n = {"$this$flowWithPrivateStateAccess", "stateHolder", "searchParams"}, s = {"L$0", "L$1", "L$2"})
    /* renamed from: com.avito.android.bxcontent.mvi.a$g, reason: case insensitive filesystem */
    public static final class C29111g extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public SearchParams f111651q;

        /* renamed from: r, reason: collision with root package name */
        public int f111652r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111653s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111654t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111655u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111656v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29111g(InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111655u = lVar;
            this.f111656v = interfaceC29127b;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            com.avito.android.bxcontent.mvi.entity.l lVar = this.f111655u;
            C29111g c29111g = new C29111g(this.f111656v, lVar, continuation);
            c29111g.f111653s = interfaceC43172j;
            c29111g.f111654t = xVar;
            return c29111g.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            com.avito.android.arch.mvi.utils.x xVar;
            SearchParams searchParams;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111652r;
            com.avito.android.bxcontent.mvi.entity.l lVar = this.f111655u;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = this.f111653s;
                com.avito.android.arch.mvi.utils.x xVar2 = this.f111654t;
                SearchParams searchParams2 = lVar.f112298A;
                if (searchParams2 == null) {
                    searchParams2 = ((com.avito.android.bxcontent.mvi.entity.i) xVar2.getValue()).f112295a;
                }
                BxContentInternalAction.UpdateVerticalSearchParams updateVerticalSearchParams = new BxContentInternalAction.UpdateVerticalSearchParams(null);
                this.f111653s = interfaceC43172j;
                this.f111654t = xVar2;
                this.f111651q = searchParams2;
                this.f111652r = 1;
                if (interfaceC43172j.emit(updateVerticalSearchParams, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                xVar = xVar2;
                searchParams = searchParams2;
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return kotlin.G0.f406611a;
                }
                searchParams = this.f111651q;
                xVar = this.f111654t;
                interfaceC43172j = this.f111653s;
                C42729a0.b(obj);
            }
            String locationId = searchParams.getLocationId();
            if (locationId == null) {
                locationId = lVar.getLocationId();
            }
            String str = locationId;
            InterfaceC29127b.V v12 = (InterfaceC29127b.V) this.f111656v;
            String clarifyIconType = v12.f112108a;
            if (clarifyIconType == null) {
                clarifyIconType = searchParams.getClarifyIconType();
            }
            SearchParams searchParams3 = searchParams;
            SearchParams searchParamsCopy = searchParams3.copy(((-1234173943) & 1) != 0 ? searchParams3.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams3.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams3.locationId : str, ((-1234173943) & 8) != 0 ? searchParams3.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams3.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams3.directionId : null, ((-1234173943) & 64) != 0 ? searchParams3.districtId : null, ((-1234173943) & 128) != 0 ? searchParams3.params : null, ((-1234173943) & 256) != 0 ? searchParams3.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams3.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams3.query : null, ((-1234173943) & 2048) != 0 ? searchParams3.title : null, ((-1234173943) & 4096) != 0 ? searchParams3.owner : null, ((-1234173943) & 8192) != 0 ? searchParams3.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams3.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams3.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams3.radius : null, ((-1234173943) & 131072) != 0 ? searchParams3.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams3.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams3.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams3.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams3.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams3.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams3.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams3.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams3.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams3.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams3.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams3.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams3.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams3.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams3.clarifyIconType : clarifyIconType, (0 & 1) != 0 ? searchParams3.drawId : null);
            String parameterValue = v12.f112109b;
            if (parameterValue == null) {
                parameterValue = PresentationTypeKt.toParameterValue(lVar.f112306I);
            }
            String str2 = parameterValue;
            String str3 = ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b;
            BxContentInternalAction.OpenDeeplink openDeeplink = new BxContentInternalAction.OpenDeeplink(new FiltersShowLink(lVar.f112306I, searchParamsCopy, searchParams.getArea(), str3, str2, v12.f112110c, com.avito.android.bxcontent.mvi.entity.o.a(lVar)));
            this.f111653s = null;
            this.f111654t = null;
            this.f111651q = null;
            this.f111652r = 2;
            if (interfaceC43172j.emit(openDeeplink, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$14", f = "BxContentActor.kt", i = {}, l = {676, 678}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$h, reason: case insensitive filesystem */
    public static final class C29112h extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111657q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111658r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111659s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111660t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111661u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29112h(InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111660t = lVar;
            this.f111661u = interfaceC29127b;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            com.avito.android.bxcontent.mvi.entity.l lVar = this.f111660t;
            C29112h c29112h = new C29112h(this.f111661u, lVar, continuation);
            c29112h.f111658r = interfaceC43172j;
            c29112h.f111659s = xVar;
            return c29112h.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111657q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111658r;
                com.avito.android.arch.mvi.utils.x xVar = this.f111659s;
                boolean zIsMain = this.f111660t.f112306I.isMain();
                boolean zC2 = C35800g5.c(new C35792f5(((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b));
                if (((InterfaceC29127b.E) this.f111661u).f112076a && (zIsMain || zC2)) {
                    BxContentInternalAction.ExitSpace exitSpace = BxContentInternalAction.ExitSpace.f111903b;
                    this.f111658r = null;
                    this.f111657q = 1;
                    if (interfaceC43172j.emit(exitSpace, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    BxContentInternalAction.LeaveScreen leaveScreen = BxContentInternalAction.LeaveScreen.f111909b;
                    this.f111658r = null;
                    this.f111657q = 2;
                    if (interfaceC43172j.emit(leaveScreen, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$15", f = "BxContentActor.kt", i = {}, l = {698}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$i, reason: case insensitive filesystem */
    public static final class C29113i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111662q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111663r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111664s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C29105a f111665t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29113i(C29105a c29105a, InterfaceC29127b interfaceC29127b, Continuation continuation) {
            super(2, continuation);
            this.f111664s = interfaceC29127b;
            this.f111665t = c29105a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C29113i c29113i = new C29113i(this.f111665t, this.f111664s, continuation);
            c29113i.f111663r = obj;
            return c29113i;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((C29113i) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111662q;
            InterfaceC29127b interfaceC29127b = this.f111664s;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f111663r;
                BxContentInternalAction.RemoveItem.ByStringId byStringId = new BxContentInternalAction.RemoveItem.ByStringId(((InterfaceC29127b.C29160t) interfaceC29127b).f112172a.f273716c);
                this.f111662q = 1;
                if (interfaceC43172j.emit(byStringId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            int i13 = C29105a.f111516L;
            this.f111665t.i().g(((InterfaceC29127b.C29160t) interfaceC29127b).f112172a);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$16", f = "BxContentActor.kt", i = {}, l = {703, 704}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$j, reason: case insensitive filesystem */
    public static final class C29114j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111666q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111667r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111669t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29114j(InterfaceC29127b interfaceC29127b, Continuation<? super C29114j> continuation) {
            super(2, continuation);
            this.f111669t = interfaceC29127b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C29114j c29114j = C29105a.this.new C29114j(this.f111669t, continuation);
            c29114j.f111667r = obj;
            return c29114j;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((C29114j) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111666q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f111667r;
                BxContentInternalAction.RemoveItem.RecentQuerySearch recentQuerySearch = BxContentInternalAction.RemoveItem.RecentQuerySearch.f111951b;
                this.f111666q = 1;
                if (interfaceC43172j.emit(recentQuerySearch, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return kotlin.G0.f406611a;
                }
                C42729a0.b(obj);
            }
            int i13 = C29105a.f111516L;
            com.avito.android.bxcontent.mvi.C cI2 = C29105a.this.i();
            InterfaceC29127b.C29146j0 c29146j0 = (InterfaceC29127b.C29146j0) this.f111669t;
            RecentQuerySearchItem recentQuerySearchItem = c29146j0.f112142a;
            int i14 = c29146j0.f112143b;
            String str = c29146j0.f112144c;
            this.f111666q = 2;
            if (cI2.k(recentQuerySearchItem, str, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$17", f = "BxContentActor.kt", i = {0}, l = {718, 731}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.bxcontent.mvi.a$k, reason: case insensitive filesystem */
    public static final class C29115k extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111670q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111671r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111672s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29115k(InterfaceC29127b interfaceC29127b, Continuation<? super C29115k> continuation) {
            super(2, continuation);
            this.f111672s = interfaceC29127b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            C29115k c29115k = new C29115k(this.f111672s, continuation);
            c29115k.f111671r = obj;
            return c29115k;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((C29115k) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
        /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue
        java.lang.NullPointerException: Cannot invoke "java.util.List.iterator()" because the return value of "jadx.core.dex.visitors.regions.SwitchOverStringVisitor$SwitchData.getNewCases()" is null
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.restoreSwitchOverString(SwitchOverStringVisitor.java:109)
        	at jadx.core.dex.visitors.regions.SwitchOverStringVisitor.visitRegion(SwitchOverStringVisitor.java:66)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:77)
        	at jadx.core.dex.visitors.regions.DepthRegionTraversal.traverseIterativeStepInternal(DepthRegionTraversal.java:82)
         */
        /* JADX WARN: Removed duplicated region for block: B:38:0x009d  */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a4  */
        /* JADX WARN: Removed duplicated region for block: B:42:0x00a9  */
        /* JADX WARN: Removed duplicated region for block: B:45:0x00ae  */
        /* JADX WARN: Removed duplicated region for block: B:46:0x00b1  */
        /* JADX WARN: Removed duplicated region for block: B:48:0x00b4  */
        /* JADX WARN: Removed duplicated region for block: B:49:0x00b7  */
        /* JADX WARN: Removed duplicated region for block: B:51:0x00ba A[ADDED_TO_REGION] */
        /* JADX WARN: Removed duplicated region for block: B:54:0x00cb A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f111670q
                r2 = 2
                com.avito.android.bxcontent.mvi.entity.b r3 = r9.f111672s
                r4 = 1
                if (r1 == 0) goto L25
                if (r1 == r4) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r10)
                goto Lcc
            L15:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L1d:
                java.lang.Object r1 = r9.f111671r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L42
            L25:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f111671r
                r1 = r10
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateVerticalFilterItem r10 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateVerticalFilterItem
                r5 = r3
                com.avito.android.bxcontent.mvi.entity.b$M0 r5 = (com.avito.android.bxcontent.mvi.entity.InterfaceC29127b.M0) r5
                com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem$VerticalFilterItem r5 = r5.f112098a
                r10.<init>(r5)
                r9.f111671r = r1
                r9.f111670q = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto L42
                return r0
            L42:
                com.avito.android.bxcontent.mvi.entity.b$M0 r3 = (com.avito.android.bxcontent.mvi.entity.InterfaceC29127b.M0) r3
                com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem$VerticalFilterItem r10 = r3.f112098a
                java.util.List<com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam> r10 = r10.f272538j
                java.lang.Iterable r10 = (java.lang.Iterable) r10
                java.util.Iterator r10 = r10.iterator()
            L4e:
                boolean r5 = r10.hasNext()
                r6 = 0
                if (r5 == 0) goto L69
                java.lang.Object r5 = r10.next()
                r7 = r5
                com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam r7 = (com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam) r7
                java.lang.String r7 = r7.getKey()
                java.lang.String r8 = "verticalId"
                boolean r7 = kotlin.jvm.internal.L.f(r7, r8)
                if (r7 == 0) goto L4e
                goto L6a
            L69:
                r5 = r6
            L6a:
                com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam r5 = (com.avito.android.remote.model.vertical_main.SearchFormWidgetSubmitParam) r5
                if (r5 == 0) goto L73
                java.lang.String r10 = r5.getValue()
                goto L74
            L73:
                r10 = r6
            L74:
                if (r10 == 0) goto L9d
                int r5 = r10.hashCode()
                r7 = 52
                if (r5 == r7) goto L94
                switch(r5) {
                    case 48657: goto L8b;
                    case 48658: goto L82;
                    default: goto L81;
                }
            L81:
                goto L9d
            L82:
                java.lang.String r5 = "112"
                boolean r10 = r10.equals(r5)
                if (r10 != 0) goto L9e
                goto L9d
            L8b:
                java.lang.String r5 = "111"
                boolean r10 = r10.equals(r5)
                if (r10 != 0) goto L9e
                goto L9d
            L94:
                java.lang.String r5 = "4"
                boolean r10 = r10.equals(r5)
                if (r10 == 0) goto L9d
                goto L9e
            L9d:
                r4 = 0
            L9e:
                com.avito.android.serp.adapter.vertical_main.VerticalPromoBlockItem$VerticalFilterItem r10 = r3.f112098a
                com.avito.android.remote.model.vertical_main.SearchFormWidgetAction r10 = r10.f272537i
                if (r10 == 0) goto La9
                com.avito.android.deep_linking.links.DeepLink r10 = r10.getUri()
                goto Laa
            La9:
                r10 = r6
            Laa:
                boolean r3 = r10 instanceof com.avito.android.deep_linking.links.ItemsSearchLink
                if (r3 == 0) goto Lb1
                com.avito.android.deep_linking.links.ItemsSearchLink r10 = (com.avito.android.deep_linking.links.ItemsSearchLink) r10
                goto Lb2
            Lb1:
                r10 = r6
            Lb2:
                if (r10 == 0) goto Lb7
                com.avito.android.remote.model.SearchParams r10 = r10.f133403b
                goto Lb8
            Lb7:
                r10 = r6
            Lb8:
                if (r4 == 0) goto Lcc
                if (r10 == 0) goto Lcc
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateVerticalSearchParams r3 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateVerticalSearchParams
                r3.<init>(r10)
                r9.f111671r = r6
                r9.f111670q = r2
                java.lang.Object r10 = r1.emit(r3, r9)
                if (r10 != r0) goto Lcc
                return r0
            Lcc:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29105a.C29115k.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/l;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/l;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$18", f = "BxContentActor.kt", i = {0, 0, 0, 1, 1, 1, 2, 4}, l = {776, 777, 778, 797, 801, 806}, m = "invokeSuspend", n = {"$this$flowWithMutablePrivateStateAccess", "stateHolder", "topSheetParams", "$this$flowWithMutablePrivateStateAccess", "stateHolder", "topSheetParams", "$this$flowWithMutablePrivateStateAccess", "$this$flowWithMutablePrivateStateAccess"}, s = {"L$0", "L$1", "L$2", "L$0", "L$1", "L$2", "L$0", "L$0"})
    /* renamed from: com.avito.android.bxcontent.mvi.a$l, reason: case insensitive filesystem */
    public static final class C29116l extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.l<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public C.c f111673q;

        /* renamed from: r, reason: collision with root package name */
        public int f111674r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111675s;

        /* renamed from: t, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.l f111676t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111677u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C29105a f111678v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111679w;

        /* compiled from: BxContentActor.kt */
        @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000*\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lcom/avito/android/bxcontent/mvi/entity/i;", "invoke", "(Lcom/avito/android/bxcontent/mvi/entity/i;)Lcom/avito/android/bxcontent/mvi/entity/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.bxcontent.mvi.a$l$a, reason: collision with other inner class name */
        public static final class C3296a extends kotlin.jvm.internal.N implements Y41.l<com.avito.android.bxcontent.mvi.entity.i, com.avito.android.bxcontent.mvi.entity.i> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ InterfaceC29127b f111680l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111681m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C3296a(InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar) {
                super(1);
                this.f111680l = interfaceC29127b;
                this.f111681m = lVar;
            }

            @Override // Y41.l
            public final com.avito.android.bxcontent.mvi.entity.i invoke(com.avito.android.bxcontent.mvi.entity.i iVar) {
                InterfaceC29127b.C29163w c29163w = (InterfaceC29127b.C29163w) this.f111680l;
                SearchParams searchParamsCopy = ((ItemsSearchLink) c29163w.f112179a).f133403b;
                if (this.f111681m.f112306I.isMap()) {
                    searchParamsCopy = searchParamsCopy.copy(((-1234173943) & 1) != 0 ? searchParamsCopy.categoryId : null, ((-1234173943) & 2) != 0 ? searchParamsCopy.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParamsCopy.locationId : null, ((-1234173943) & 8) != 0 ? searchParamsCopy.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParamsCopy.metroIds : null, ((-1234173943) & 32) != 0 ? searchParamsCopy.directionId : null, ((-1234173943) & 64) != 0 ? searchParamsCopy.districtId : null, ((-1234173943) & 128) != 0 ? searchParamsCopy.params : null, ((-1234173943) & 256) != 0 ? searchParamsCopy.priceMax : null, ((-1234173943) & 512) != 0 ? searchParamsCopy.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParamsCopy.query : null, ((-1234173943) & 2048) != 0 ? searchParamsCopy.title : null, ((-1234173943) & 4096) != 0 ? searchParamsCopy.owner : null, ((-1234173943) & 8192) != 0 ? searchParamsCopy.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParamsCopy.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParamsCopy.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParamsCopy.radius : null, ((-1234173943) & 131072) != 0 ? searchParamsCopy.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParamsCopy.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParamsCopy.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParamsCopy.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParamsCopy.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParamsCopy.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParamsCopy.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParamsCopy.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParamsCopy.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParamsCopy.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParamsCopy.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParamsCopy.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParamsCopy.area : ((ItemsSearchLink) c29163w.f112179a).f133405d, ((-1234173943) & 1073741824) != 0 ? searchParamsCopy.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParamsCopy.clarifyIconType : null, (0 & 1) != 0 ? searchParamsCopy.drawId : null);
                }
                return new com.avito.android.bxcontent.mvi.entity.i(searchParamsCopy, ((ItemsSearchLink) c29163w.f112179a).f133404c);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C29116l(C29105a c29105a, InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111677u = interfaceC29127b;
            this.f111678v = c29105a;
            this.f111679w = lVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.l<com.avito.android.bxcontent.mvi.entity.i> lVar, Continuation<? super kotlin.G0> continuation) {
            InterfaceC29127b interfaceC29127b = this.f111677u;
            C29116l c29116l = new C29116l(this.f111678v, interfaceC29127b, this.f111679w, continuation);
            c29116l.f111675s = interfaceC43172j;
            c29116l.f111676t = lVar;
            return c29116l.invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:30:0x0114 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:33:0x0142  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x019d A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:39:0x01a6  */
        /* JADX WARN: Removed duplicated region for block: B:53:0x01f2 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r36) {
            /*
                Method dump skipped, instructions count: 520
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29105a.C29116l.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$19", f = "BxContentActor.kt", i = {0}, l = {836, 838}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.bxcontent.mvi.a$m */
    public static final class m extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111682q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111683r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111684s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111685t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C29105a f111686u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public m(C29105a c29105a, InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f111684s = interfaceC29127b;
            this.f111685t = lVar;
            this.f111686u = c29105a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            m mVar = new m(this.f111686u, this.f111684s, this.f111685t, continuation);
            mVar.f111683r = obj;
            return mVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((m) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x0086  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r8) {
            /*
                r7 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r7.f111682q
                r2 = 1
                com.avito.android.bxcontent.mvi.entity.b r3 = r7.f111684s
                r4 = 2
                if (r1 == 0) goto L25
                if (r1 == r2) goto L1d
                if (r1 != r4) goto L15
                kotlin.C42729a0.b(r8)
                goto L96
            L15:
                java.lang.IllegalStateException r8 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r8.<init>(r0)
                throw r8
            L1d:
                java.lang.Object r1 = r7.f111683r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r8)
                goto L42
            L25:
                kotlin.C42729a0.b(r8)
                java.lang.Object r8 = r7.f111683r
                r1 = r8
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$FloatingViewsStateUpdate r8 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$FloatingViewsStateUpdate
                r5 = r3
                com.avito.android.bxcontent.mvi.entity.b$A r5 = (com.avito.android.bxcontent.mvi.entity.InterfaceC29127b.A) r5
                com.avito.android.floating_views.FloatingViewsPresenter$Subscriber$b r5 = r5.f112060a
                r8.<init>(r5)
                r7.f111683r = r1
                r7.f111682q = r2
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L42
                return r0
            L42:
                com.avito.android.bxcontent.mvi.entity.l r8 = r7.f111685t
                com.avito.android.remote.model.PresentationType r5 = r8.f112306I
                boolean r5 = r5.isFullMap()
                if (r5 == 0) goto L96
                int r8 = r8.f112309L
                java.lang.Integer r8 = kotlin.coroutines.jvm.internal.Boxing.boxInt(r8)
                int r5 = com.avito.android.bxcontent.mvi.C29105a.f111516L
                com.avito.android.bxcontent.mvi.a r5 = r7.f111686u
                r5.getClass()
                if (r8 != 0) goto L5c
                goto L63
            L5c:
                int r5 = r8.intValue()
                r6 = 4
                if (r5 == r6) goto L6f
            L63:
                if (r8 != 0) goto L66
                goto L6d
            L66:
                int r5 = r8.intValue()
                r6 = 3
                if (r5 == r6) goto L6f
            L6d:
                if (r8 != 0) goto L96
            L6f:
                com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateInlineActions r8 = new com.avito.android.bxcontent.mvi.entity.BxContentInternalAction$UpdateInlineActions
                com.avito.android.bxcontent.mvi.entity.b$A r3 = (com.avito.android.bxcontent.mvi.entity.InterfaceC29127b.A) r3
                com.avito.android.floating_views.FloatingViewsPresenter$Subscriber$b r3 = r3.f112060a
                r3.getClass()
                boolean r5 = r3 instanceof com.avito.android.floating_views.FloatingViewsPresenter.Subscriber.b.C4630b
                r6 = 0
                if (r5 == 0) goto L86
                com.avito.android.floating_views.FloatingViewsPresenter$Subscriber$b$b r3 = (com.avito.android.floating_views.FloatingViewsPresenter.Subscriber.b.C4630b) r3
                com.avito.android.floating_views.FloatingViewsPresenter$Subscriber$DisplayMode r5 = com.avito.android.floating_views.FloatingViewsPresenter.Subscriber.DisplayMode.f158441b
                com.avito.android.floating_views.FloatingViewsPresenter$Subscriber$DisplayMode r3 = r3.f158446a
                if (r3 != r5) goto L86
                goto L87
            L86:
                r2 = r6
            L87:
                r3 = 0
                r8.<init>(r2, r6, r4, r3)
                r7.f111683r = r3
                r7.f111682q = r4
                java.lang.Object r8 = r1.emit(r8, r7)
                if (r8 != r0) goto L96
                return r0
            L96:
                kotlin.G0 r8 = kotlin.G0.f406611a
                return r8
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29105a.m.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$20", f = "BxContentActor.kt", i = {}, l = {857}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$n */
    public static final class n extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111687q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111688r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111689s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111690t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ C29105a f111691u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public n(C29105a c29105a, InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f111689s = interfaceC29127b;
            this.f111690t = lVar;
            this.f111691u = c29105a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            n nVar = new n(this.f111691u, this.f111689s, this.f111690t, continuation);
            nVar.f111688r = obj;
            return nVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((n) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            String id2;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111687q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f111688r;
                com.avito.android.serp.adapter.location_notification.a aVar = ((InterfaceC29127b.G) this.f111689s).f112080a;
                com.avito.android.bxcontent.mvi.entity.l lVar = this.f111690t;
                Location location = lVar.f112343k;
                if (location == null || (id2 = location.getId()) == null) {
                    id2 = "621540";
                }
                InterfaceC43691a interfaceC43691a = this.f111691u.f111530d.get();
                String str = aVar.f270248a;
                LocationNotificationItem.TooltipType tooltipType = aVar.f270250c;
                String str2 = tooltipType != null ? tooltipType.f270247b : null;
                if (str2 == null) {
                    str2 = "";
                }
                boolean z12 = aVar.f270249b;
                interfaceC43691a.c(str, id2, str2, z12);
                BxContentInternalAction notificationLocationChanged = z12 ? new BxContentInternalAction.NotificationLocationChanged(id2, aVar.f270248a, lVar.f112306I) : BxContentInternalAction.RemoveItem.Laas.f111950b;
                this.f111687q = 1;
                if (interfaceC43172j.emit(notificationLocationChanged, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$21", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$o */
    public static final class o extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111692q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C29105a f111693r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111694s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public o(C29105a c29105a, InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f111692q = interfaceC29127b;
            this.f111693r = c29105a;
            this.f111694s = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new o(this.f111693r, this.f111692q, this.f111694s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((o) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            InterfaceC29127b.H h12 = (InterfaceC29127b.H) this.f111692q;
            LocationNotificationItem.TooltipType tooltipType = h12.f112082a.f270250c;
            InterfaceC43691a interfaceC43691a = this.f111693r.f111530d.get();
            String str = h12.f112082a.f270248a;
            String str2 = tooltipType != null ? tooltipType.f270247b : null;
            if (str2 == null) {
                str2 = "";
            }
            Location location = this.f111694s.f112343k;
            String id2 = location != null ? location.getId() : null;
            interfaceC43691a.a(str, str2, id2 != null ? id2 : "");
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$22", f = "BxContentActor.kt", i = {}, l = {904}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$p */
    public static final class p extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111695q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111696r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111697s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111698t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111699u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ C29105a f111700v;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public p(C29105a c29105a, InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(3, continuation);
            this.f111698t = lVar;
            this.f111699u = interfaceC29127b;
            this.f111700v = c29105a;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            com.avito.android.bxcontent.mvi.entity.l lVar = this.f111698t;
            InterfaceC29127b interfaceC29127b = this.f111699u;
            p pVar = new p(this.f111700v, interfaceC29127b, lVar, continuation);
            pVar.f111696r = interfaceC43172j;
            pVar.f111697s = xVar;
            return pVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111695q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111696r;
                com.avito.android.arch.mvi.utils.x xVar = this.f111697s;
                String categoryId = ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a.getCategoryId();
                InterfaceC29127b interfaceC29127b = this.f111699u;
                com.avito.android.bxcontent.mvi.entity.l lVar = this.f111698t;
                C29105a c29105a = this.f111700v;
                if (categoryId != null) {
                    int i13 = C29105a.f111516L;
                    c29105a.g().Y(categoryId, ((InterfaceC29127b.C29139g) interfaceC29127b).f112132a, lVar.f112306I);
                }
                boolean zIsMain = lVar.f112306I.isMain();
                boolean zC2 = C35800g5.c(new C35792f5(((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b));
                if (((InterfaceC29127b.C29139g) interfaceC29127b).f112132a) {
                    if (zIsMain || zC2) {
                        int i14 = C29105a.f111516L;
                        c29105a.g().R();
                    }
                } else if (zC2) {
                    int i15 = C29105a.f111516L;
                    c29105a.g().x();
                }
                if (kotlin.jvm.internal.L.f(lVar.f112318U, Boxing.boxBoolean(true))) {
                    BxContentInternalAction.OpenMainScreenOnBackToAvoidAppLeaving openMainScreenOnBackToAvoidAppLeaving = BxContentInternalAction.OpenMainScreenOnBackToAvoidAppLeaving.f111939b;
                    this.f111696r = null;
                    this.f111695q = 1;
                    if (interfaceC43172j.emit(openMainScreenOnBackToAvoidAppLeaving, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$23", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$q */
    public static final class q extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111701q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111703s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public q(com.avito.android.bxcontent.mvi.entity.l lVar, Continuation<? super q> continuation) {
            super(3, continuation);
            this.f111703s = lVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            q qVar = C29105a.this.new q(this.f111703s, continuation);
            qVar.f111701q = xVar;
            return qVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.arch.mvi.utils.x xVar = this.f111701q;
            int i12 = C29105a.f111516L;
            C29105a.this.g().j0(this.f111703s.e(), ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a.getCategoryId());
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$24", f = "BxContentActor.kt", i = {}, l = {927}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$r */
    public static final class r extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111704q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111705r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111706s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111708u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public r(com.avito.android.bxcontent.mvi.entity.l lVar, Continuation<? super r> continuation) {
            super(3, continuation);
            this.f111708u = lVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            r rVar = C29105a.this.new r(this.f111708u, continuation);
            rVar.f111705r = interfaceC43172j;
            rVar.f111706s = xVar;
            return rVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111704q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111705r;
                com.avito.android.arch.mvi.utils.x xVar = this.f111706s;
                int i13 = C29105a.f111516L;
                com.avito.android.bxcontent.analytics.a aVarG = C29105a.this.g();
                com.avito.android.bxcontent.mvi.entity.l lVar = this.f111708u;
                aVarG.b(lVar.e(), ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a.getCategoryId());
                ToolbarShareButton toolbarShareButton = lVar.f112302E;
                if (toolbarShareButton != null) {
                    BxContentInternalAction.OpenSharingDialog openSharingDialog = new BxContentInternalAction.OpenSharingDialog(toolbarShareButton);
                    this.f111705r = null;
                    this.f111704q = 1;
                    if (interfaceC43172j.emit(openSharingDialog, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$25", f = "BxContentActor.kt", i = {}, l = {956, 964, 974}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$s */
    public static final class s extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111709q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111710r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111711s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C29105a f111712t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public s(C29105a c29105a, InterfaceC29127b interfaceC29127b, Continuation continuation) {
            super(2, continuation);
            this.f111711s = interfaceC29127b;
            this.f111712t = c29105a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            s sVar = new s(this.f111712t, this.f111711s, continuation);
            sVar.f111710r = obj;
            return sVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((s) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111709q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f111710r;
                RubricatorRefinedItem rubricatorRefinedItem = ((InterfaceC29127b.N0) this.f111711s).f112100a;
                boolean z12 = rubricatorRefinedItem instanceof RubricatorRefinedItem.SerpRubricatorCategoryItem;
                C29105a c29105a = this.f111712t;
                if (z12) {
                    RubricatorRefinedItem.SerpRubricatorCategoryItem serpRubricatorCategoryItem = (RubricatorRefinedItem.SerpRubricatorCategoryItem) rubricatorRefinedItem;
                    if (serpRubricatorCategoryItem.f255760h.isEmpty()) {
                        DeepLink deepLink = ((RubricatorRefinedItem.SerpRubricatorCategoryItem) rubricatorRefinedItem).f255757e;
                        if (deepLink != null) {
                            b.a.a(c29105a.f111527a, deepLink, null, null, 6);
                        }
                    } else {
                        BxContentInternalAction.OpenCategoriesScreen openCategoriesScreen = new BxContentInternalAction.OpenCategoriesScreen(serpRubricatorCategoryItem);
                        this.f111709q = 1;
                        if (interfaceC43172j.emit(openCategoriesScreen, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (rubricatorRefinedItem instanceof RubricatorRefinedItem.SerpRubricatorGridServiceItem) {
                    if (((RubricatorRefinedItem.SerpRubricatorGridServiceItem) rubricatorRefinedItem).f255767h.isEmpty()) {
                        DeepLink deepLink2 = ((RubricatorRefinedItem.SerpRubricatorGridServiceItem) rubricatorRefinedItem).f255765f;
                        if (deepLink2 != null) {
                            b.a.a(c29105a.f111527a, deepLink2, null, null, 6);
                        }
                    } else {
                        BxContentInternalAction.OpenServicesScreen openServicesScreen = new BxContentInternalAction.OpenServicesScreen((RubricatorRefinedItem.SerpRubricatorServiceItem) rubricatorRefinedItem);
                        this.f111709q = 2;
                        if (interfaceC43172j.emit(openServicesScreen, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                } else if (rubricatorRefinedItem instanceof RubricatorRefinedItem.SerpRubricatorLinearServiceItem) {
                    DeepLink deepLink3 = ((RubricatorRefinedItem.SerpRubricatorLinearServiceItem) rubricatorRefinedItem).f255773f;
                    if (deepLink3 != null) {
                        b.a.a(c29105a.f111527a, deepLink3, null, null, 6);
                    } else {
                        BxContentInternalAction.OpenServicesScreen openServicesScreen2 = new BxContentInternalAction.OpenServicesScreen((RubricatorRefinedItem.SerpRubricatorServiceItem) rubricatorRefinedItem);
                        this.f111709q = 3;
                        if (interfaceC43172j.emit(openServicesScreen2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    }
                }
            } else {
                if (i12 != 1 && i12 != 2 && i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$ByInstance;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$26", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$t */
    public static final class t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction.RemoveItem.ByInstance>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111714r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public t(InterfaceC29127b interfaceC29127b, Continuation<? super t> continuation) {
            super(2, continuation);
            this.f111714r = interfaceC29127b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C29105a.this.new t(this.f111714r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction.RemoveItem.ByInstance> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((t) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.serp.l lVar = (com.avito.android.serp.l) C29105a.this.f111531e.get();
            SnippetItem snippetItem = ((InterfaceC29127b.C29131c) this.f111714r).f112120a;
            lVar.c(snippetItem.f272343c, snippetItem.f272349i);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction$RemoveItem$ByInstance;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$27", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$u */
    public static final class u extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction.RemoveItem.ByInstance>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111716r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public u(InterfaceC29127b interfaceC29127b, Continuation<? super u> continuation) {
            super(2, continuation);
            this.f111716r = interfaceC29127b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C29105a.this.new u(this.f111716r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction.RemoveItem.ByInstance> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((u) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.serp.l lVar = (com.avito.android.serp.l) C29105a.this.f111531e.get();
            SnippetItem snippetItem = ((InterfaceC29127b.C29158r) this.f111716r).f112164a;
            lVar.d(snippetItem.f272343c, snippetItem.f272349i);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$28", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$v */
    public static final class v extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111718r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public v(InterfaceC29127b interfaceC29127b, Continuation<? super v> continuation) {
            super(2, continuation);
            this.f111718r = interfaceC29127b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C29105a.this.new v(this.f111718r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((v) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.serp.l lVar = (com.avito.android.serp.l) C29105a.this.f111531e.get();
            SnippetItem snippetItem = ((InterfaceC29127b.z0) this.f111718r).f112193a;
            lVar.a(snippetItem.f272343c, snippetItem.f272349i);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$29", f = "BxContentActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$w */
    public static final class w extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111720r;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public w(InterfaceC29127b interfaceC29127b, Continuation<? super w> continuation) {
            super(2, continuation);
            this.f111720r = interfaceC29127b;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return C29105a.this.new w(this.f111720r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((w) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            com.avito.android.serp.l lVar = (com.avito.android.serp.l) C29105a.this.f111531e.get();
            SnippetItem snippetItem = ((InterfaceC29127b.D) this.f111720r).f112074a;
            lVar.b(snippetItem.f272343c, snippetItem.f272349i);
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$30", f = "BxContentActor.kt", i = {}, l = {1121}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$x */
    public static final class x extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111721q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111722r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111723s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111724t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111725u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public x(InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation<? super x> continuation) {
            super(3, continuation);
            this.f111724t = interfaceC29127b;
            this.f111725u = lVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            x xVar2 = new x(this.f111724t, this.f111725u, continuation);
            xVar2.f111722r = interfaceC43172j;
            xVar2.f111723s = xVar;
            return xVar2.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111721q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111722r;
                com.avito.android.arch.mvi.utils.x xVar = this.f111723s;
                String str = ((InterfaceC29127b.T) this.f111724t).f112106a;
                BxContentInternalAction.OpenInlineFilterWithId openInlineFilterWithId = new BxContentInternalAction.OpenInlineFilterWithId(this.f111725u.f112306I, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a, str, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b);
                this.f111722r = null;
                this.f111721q = 1;
                if (interfaceC43172j.emit(openInlineFilterWithId, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0005*\b\u0012\u0004\u0012\u00020\u00010\u00002\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lcom/avito/android/arch/mvi/utils/x;", "Lcom/avito/android/bxcontent/mvi/entity/i;", "stateHolder", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Lcom/avito/android/arch/mvi/utils/x;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$31", f = "BxContentActor.kt", i = {}, l = {1132}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.bxcontent.mvi.a$y */
    public static final class y extends SuspendLambda implements Y41.q<InterfaceC43172j<? super BxContentInternalAction>, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111726q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f111727r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ com.avito.android.arch.mvi.utils.x f111728s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111729t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111730u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public y(InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation<? super y> continuation) {
            super(3, continuation);
            this.f111729t = interfaceC29127b;
            this.f111730u = lVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, com.avito.android.arch.mvi.utils.x<com.avito.android.bxcontent.mvi.entity.i> xVar, Continuation<? super kotlin.G0> continuation) {
            y yVar = new y(this.f111729t, this.f111730u, continuation);
            yVar.f111727r = interfaceC43172j;
            yVar.f111728s = xVar;
            return yVar.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111726q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f111727r;
                com.avito.android.arch.mvi.utils.x xVar = this.f111728s;
                BxContentInternalAction.OpenInlineFilter openInlineFilter = new BxContentInternalAction.OpenInlineFilter(((InterfaceC29127b.S) this.f111729t).f112105a, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112295a, this.f111730u.f112306I, ((com.avito.android.bxcontent.mvi.entity.i) xVar.getValue()).f112296b);
                this.f111727r = null;
                this.f111726q = 1;
                if (interfaceC43172j.emit(openInlineFilter, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return kotlin.G0.f406611a;
        }
    }

    /* compiled from: BxContentActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/bxcontent/mvi/entity/BxContentInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.bxcontent.mvi.BxContentActor$process$32", f = "BxContentActor.kt", i = {0}, l = {1143, 1151}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    /* renamed from: com.avito.android.bxcontent.mvi.a$z */
    public static final class z extends SuspendLambda implements Y41.p<InterfaceC43172j<? super BxContentInternalAction>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f111731q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f111732r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC29127b f111733s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C29105a f111734t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.bxcontent.mvi.entity.l f111735u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public z(C29105a c29105a, InterfaceC29127b interfaceC29127b, com.avito.android.bxcontent.mvi.entity.l lVar, Continuation continuation) {
            super(2, continuation);
            this.f111733s = interfaceC29127b;
            this.f111734t = c29105a;
            this.f111735u = lVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            z zVar = new z(this.f111734t, this.f111733s, this.f111735u, continuation);
            zVar.f111732r = obj;
            return zVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super BxContentInternalAction> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((z) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f111731q;
            InterfaceC29127b interfaceC29127b = this.f111733s;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f111732r;
                InterfaceC29127b.C29147k c29147k = (InterfaceC29127b.C29147k) interfaceC29127b;
                BxContentInternalAction.BottomSheetStateChanged bottomSheetStateChanged = new BxContentInternalAction.BottomSheetStateChanged(c29147k.f112145a, c29147k.f112146b);
                this.f111732r = interfaceC43172j;
                this.f111731q = 1;
                if (interfaceC43172j.emit(bottomSheetStateChanged, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return kotlin.G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f111732r;
                C42729a0.b(obj);
            }
            int i13 = ((InterfaceC29127b.C29147k) interfaceC29127b).f112145a;
            if (i13 == 5 || i13 == 4) {
                Mode mode = Mode.f273993c;
                int i14 = C29105a.f111516L;
                this.f111734t.getClass();
                InterfaceC43160i interfaceC43160iG = C43175k.G(new C29204k(this.f111735u, mode, null));
                this.f111732r = interfaceC43160iG;
                this.f111731q = 2;
                if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            return kotlin.G0.f406611a;
        }
    }

    static {
        new C3293a(null);
        e.a aVar = kotlin.time.e.f410651c;
        f111515K = kotlin.time.g.g(100, DurationUnit.f410633e);
    }

    @Inject
    public C29105a(@Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k Provider provider, @Y61.k Provider provider2, @Y61.k Provider provider3, @Y61.k U7 u72, @J40.a @Y61.k Provider provider4, @Y61.k com.avito.android.serp.adapter.rich_snippets.service.order_request.e eVar, @Y61.k Provider provider5, @Y61.k com.avito.android.bxcontent.mvi.sources.a aVar2, @Y61.k com.avito.android.services_transportation_widget.interactor.g gVar, @Y61.k ED.a aVar3, @Y61.k C36135w2 c36135w2, @Y61.k com.avito.android.bottom_navigation.space.a aVar4, @Y61.k com.avito.android.home.bottom_navigation.H h12, @Y61.k InterfaceC40152b interfaceC40152b, @Y61.k InterfaceC40473b interfaceC40473b, @Y61.k InterfaceC48080b interfaceC48080b, @Y61.k InterfaceC49118a interfaceC49118a, @Y61.k com.avito.android.video_snippets.g gVar2, @Y61.k com.avito.android.bxcontent.mvi.usecase.analytics.a aVar5, @Y61.k C29168d c29168d, @Y61.k com.avito.android.location.r rVar, @Y61.k com.avito.android.bxcontent.mvi.A a12, @Y61.k com.avito.android.main_start_onboarding.a aVar6, @Y61.k com.avito.android.home.o oVar, @Y61.k Z0 z02, @Y61.k com.avito.android.bxcontent.business360.a aVar7, @Y61.k com.avito.android.bxcontent.business360.d dVar, @Y61.k InterfaceC34736h0 interfaceC34736h0, @Y61.k com.avito.android.progress_info_toast_bar.interactor.g gVar3, @com.avito.android.bxcontent.di.module.Z @Y61.k String str, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k com.avito.android.onboarding.q qVar, @Y61.k InterfaceC44291a interfaceC44291a, @Y61.k C47107a c47107a, @Y61.k com.avito.android.bxcontent.last_search_tooltip.b bVar, @Y61.k com.avito.android.bxcontent.serp.a aVar8) {
        Location locationF;
        this.f111527a = aVar;
        this.f111528b = provider;
        this.f111529c = provider2;
        this.f111530d = provider3;
        this.f111531e = u72;
        this.f111532f = provider4;
        this.f111533g = eVar;
        this.f111534h = provider5;
        this.f111535i = aVar2;
        this.f111536j = gVar;
        this.f111537k = aVar3;
        this.f111538l = c36135w2;
        this.f111539m = aVar4;
        this.f111540n = h12;
        this.f111541o = interfaceC40152b;
        this.f111542p = interfaceC40473b;
        this.f111543q = interfaceC48080b;
        this.f111544r = interfaceC49118a;
        this.f111545s = gVar2;
        this.f111546t = aVar5;
        this.f111547u = c29168d;
        this.f111548v = aVar6;
        this.f111549w = oVar;
        this.f111550x = z02;
        this.f111551y = aVar7;
        this.f111552z = dVar;
        this.f111517A = interfaceC34736h0;
        this.f111518B = gVar3;
        this.f111519C = str;
        this.f111520D = interfaceC28373a;
        this.f111521E = qVar;
        this.f111522F = interfaceC44291a;
        this.f111523G = c47107a;
        this.f111524H = bVar;
        this.f111525I = aVar8;
        n.a aVar9 = com.avito.android.arch.mvi.utils.n.f92111a;
        com.avito.android.bxcontent.mvi.entity.l lVarA = a12.a();
        i.a aVar10 = com.avito.android.bxcontent.mvi.entity.i.f112294c;
        boolean zIsSerp = lVarA.f112306I.isSerp();
        String id2 = null;
        SearchParams searchParamsCopy = lVarA.f112345l;
        if (zIsSerp && searchParamsCopy.getLocationId() == null && (locationF = rVar.f()) != null) {
            id2 = locationF.getId();
        }
        aVar10.getClass();
        if (id2 != null) {
            SearchParams searchParams = lVarA.f112345l;
            searchParamsCopy = searchParams.copy(((-1234173943) & 1) != 0 ? searchParams.categoryId : null, ((-1234173943) & 2) != 0 ? searchParams.geoCoords : null, ((-1234173943) & 4) != 0 ? searchParams.locationId : id2, ((-1234173943) & 8) != 0 ? searchParams.suggestLocationId : null, ((-1234173943) & 16) != 0 ? searchParams.metroIds : null, ((-1234173943) & 32) != 0 ? searchParams.directionId : null, ((-1234173943) & 64) != 0 ? searchParams.districtId : null, ((-1234173943) & 128) != 0 ? searchParams.params : null, ((-1234173943) & 256) != 0 ? searchParams.priceMax : null, ((-1234173943) & 512) != 0 ? searchParams.priceMin : null, ((-1234173943) & 1024) != 0 ? searchParams.query : null, ((-1234173943) & 2048) != 0 ? searchParams.title : null, ((-1234173943) & 4096) != 0 ? searchParams.owner : null, ((-1234173943) & 8192) != 0 ? searchParams.sort : null, ((-1234173943) & Http2.INITIAL_MAX_FRAME_SIZE) != 0 ? searchParams.withImagesOnly : null, ((-1234173943) & 32768) != 0 ? searchParams.searchRadius : null, ((-1234173943) & AndroidResourceIdNames.RESOURCE_ID_TYPE_ITERATOR) != 0 ? searchParams.radius : null, ((-1234173943) & 131072) != 0 ? searchParams.footWalkingMetro : null, ((-1234173943) & 262144) != 0 ? searchParams.withDeliveryOnly : null, ((-1234173943) & 524288) != 0 ? searchParams.localPriority : null, ((-1234173943) & 1048576) != 0 ? searchParams.earlyAccess : null, ((-1234173943) & 2097152) != 0 ? searchParams.moreExpensive : null, ((-1234173943) & 4194304) != 0 ? searchParams.widgetCategory : null, ((-1234173943) & 8388608) != 0 ? searchParams.expanded : null, ((-1234173943) & Http2Connection.OKHTTP_CLIENT_WINDOW_SIZE) != 0 ? searchParams.sellerId : null, ((-1234173943) & 33554432) != 0 ? searchParams.cv2Vacancy : null, ((-1234173943) & 67108864) != 0 ? searchParams.displayType : null, ((-1234173943) & 134217728) != 0 ? searchParams.shopId : null, ((-1234173943) & 268435456) != 0 ? searchParams.forcedLocationForRecommendation : null, ((-1234173943) & 536870912) != 0 ? searchParams.area : null, ((-1234173943) & 1073741824) != 0 ? searchParams.source : null, ((-1234173943) & BeduinInputModel.MIN_TEXT_VERSION) != 0 ? searchParams.clarifyIconType : null, (0 & 1) != 0 ? searchParams.drawId : null);
        }
        com.avito.android.bxcontent.mvi.entity.i iVar = new com.avito.android.bxcontent.mvi.entity.i(searchParamsCopy, lVarA.f112304G);
        aVar9.getClass();
        this.f111526J = new com.avito.android.arch.mvi.utils.o(iVar);
    }

    public static final boolean c(C29105a c29105a, com.avito.android.bxcontent.mvi.entity.l lVar, ItemsSearchLink itemsSearchLink, ItemsSearchLinkHandleForceType itemsSearchLinkHandleForceType) {
        c29105a.getClass();
        int iOrdinal = itemsSearchLinkHandleForceType.ordinal();
        if (iOrdinal == 0) {
            return false;
        }
        if (iOrdinal != 1) {
            if (iOrdinal != 2) {
                throw new NoWhenBranchMatchedException();
            }
            boolean z12 = lVar.f112306I.isSerp() && itemsSearchLink.f133413l.isSerp();
            PresentationType presentationType = lVar.f112306I;
            boolean z13 = presentationType.isMap() && presentationType == itemsSearchLink.f133413l;
            if (SerpSpaceTypeKt.orDefault(lVar.f112307J) != SerpSpaceTypeKt.orDefault(itemsSearchLink.f133416o)) {
                return false;
            }
            if ((!z12 || lVar.f112299B) && !z13) {
                return false;
            }
        }
        return true;
    }

    public static final InterfaceC43160i d(C29105a c29105a, com.avito.android.bxcontent.mvi.entity.l lVar) {
        int i12;
        c29105a.getClass();
        return (lVar.f112306I.isFullMap() && ((i12 = lVar.f112309L) == 4 || i12 == 3)) ? new C43210w(new BxContentInternalAction.UpdateInlineActions(false, true)) : C43175k.w();
    }

    public static final void e(C29105a c29105a, com.avito.android.arch.mvi.utils.l lVar, Y41.l lVar2) {
        c29105a.getClass();
        lVar.setValue(lVar2.invoke(lVar.getValue()));
    }

    public static InterfaceC43160i f(com.avito.android.arch.mvi.utils.n nVar, com.avito.android.bxcontent.mvi.entity.j jVar, Y41.q qVar) {
        return C43175k.G(new C29107c(qVar, nVar, jVar, null));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        InterfaceC43160i interfaceC43160iW;
        InterfaceC43160i interfaceC43160iC;
        this.f111547u.getClass();
        kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(new C29167c(this.f111526J.f92113b), new C29122d(aVar, this, null));
        kotlinx.coroutines.flow.C0 c0B = C43175k.B(new C29210n(this, null), kotlinx.coroutines.rx3.y.a(this.f111527a.V9()));
        kotlinx.coroutines.flow.C0 c0B2 = C43175k.B(new C29212o(aVar, this, null), this.f111518B.b(this.f111519C));
        C36135w2 c36135w2 = this.f111538l;
        c36135w2.getClass();
        kotlin.reflect.n<Object> nVar = C36135w2.f327457X[38];
        boolean zBooleanValue = ((Boolean) c36135w2.f327466I.a().invoke()).booleanValue();
        com.avito.android.main_start_onboarding.a aVar2 = this.f111548v;
        com.avito.android.onboarding.q qVar = this.f111521E;
        if (zBooleanValue) {
            interfaceC43160iW = ((com.avito.android.bxcontent.mvi.entity.l) aVar.invoke()).f112306I == PresentationType.MAIN ? C43175k.N(new C29216q(qVar.a(), this), C43175k.C(new com.avito.android.bxcontent.mvi.r(2, null), new C29214p(aVar2.a(), this))) : C43175k.w();
        } else {
            interfaceC43160iW = C43175k.w();
        }
        if (c36135w2.w().invoke().booleanValue()) {
            qVar.unlock();
            interfaceC43160iC = C43175k.w();
        } else {
            interfaceC43160iC = ((com.avito.android.bxcontent.mvi.entity.l) aVar.invoke()).f112306I == PresentationType.MAIN ? C43175k.C(new C29208m(this, null), new C43137a0(new C29206l(this, null), aVar2.d())) : C43175k.w();
        }
        return C43175k.N(lVarY, c0B, c0B2, interfaceC43160iW, interfaceC43160iC, ((com.avito.android.bxcontent.mvi.entity.l) aVar.invoke()).f112306I == PresentationType.MAIN ? i().a() : C43175k.w(), this.f111535i.a(aVar), new C29124e(new C43189o1(this.f111536j.getF280526a())), C43175k.Y(kotlinx.coroutines.rx3.y.a(this.f111550x.f111513a.getF231563e()), new Y0(3, null)), C43175k.C(new C29200i(aVar, this, null), c43197r1));
    }

    public final com.avito.android.bxcontent.analytics.a g() {
        return this.f111529c.get();
    }

    public final Bundle h() {
        Provider<InterfaceC13095a> provider = this.f111534h;
        if (kotlin.jvm.internal.L.f(provider.get().d(), "1")) {
            return C22777e.b(new kotlin.Q("key_disclaimer_pd", provider.get().f()));
        }
        return null;
    }

    public final com.avito.android.bxcontent.mvi.C i() {
        return this.f111528b.get();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:152:0x03d5  */
    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: j, reason: merged with bridge method [inline-methods] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final kotlinx.coroutines.flow.InterfaceC43160i<com.avito.android.bxcontent.mvi.entity.BxContentInternalAction> b(@Y61.k com.avito.android.bxcontent.mvi.entity.InterfaceC29127b r24, @Y61.k com.avito.android.bxcontent.mvi.entity.l r25) {
        /*
            Method dump skipped, instructions count: 2883
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.bxcontent.mvi.C29105a.b(com.avito.android.bxcontent.mvi.entity.b, com.avito.android.bxcontent.mvi.entity.l):kotlinx.coroutines.flow.i");
    }
}
