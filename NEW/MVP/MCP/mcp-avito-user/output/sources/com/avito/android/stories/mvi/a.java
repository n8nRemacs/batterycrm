package com.avito.android.stories.mvi;

import Cx0.InterfaceC13369a;
import Fx0.InterfaceC13851a;
import android.net.Uri;
import android.webkit.CookieManager;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deep_linking.links.NoMatchLink;
import com.avito.android.deep_linking.x;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.remote.error.ApiError;
import com.avito.android.remote.interceptor.I;
import com.avito.android.stories.G;
import com.avito.android.stories.StoriesArguments;
import com.avito.android.stories.analytics.CloseType;
import com.avito.android.stories.mvi.entity.LoadState;
import com.avito.android.stories.mvi.entity.StoriesInternalAction;
import com.avito.android.stories.mvi.entity.StoriesState;
import com.avito.android.stories.r;
import com.avito.android.util.C35809h6;
import com.avito.android.util.P2;
import com.avito.android.util.V2;
import java.util.Collections;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43137a0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.y;
import okhttp3.internal.ws.WebSocketProtocol;

/* compiled from: StoriesActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/stories/mvi/a;", "Lcom/avito/android/arch/mvi/a;", "LFx0/a;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lcom/avito/android/stories/mvi/entity/StoriesState;", "_avito_stories_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class a implements com.avito.android.arch.mvi.a<InterfaceC13851a, StoriesInternalAction, StoriesState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC13369a f285172a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final x f285173b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f285174c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final G f285175d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final r f285176e;

    /* compiled from: StoriesActor.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$OpenUri;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$process$10", f = "StoriesActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.stories.mvi.a$a, reason: collision with other inner class name */
    public static final class C8535a extends SuspendLambda implements Y41.q<InterfaceC43172j<? super StoriesInternalAction.OpenUri>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Throwable f285177q;

        public C8535a() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction.OpenUri> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            C8535a c8535a = new C8535a(3, continuation);
            c8535a.f285177q = th2;
            return c8535a.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            V2.f318762a.a("StoriesActor", "openDeepLinkError", this.f285177q);
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$process$11", f = "StoriesActor.kt", i = {0}, l = {139, 140}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StoriesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285178q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285179r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ StoriesState f285181t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(StoriesState storiesState, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f285181t = storiesState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = a.this.new b(this.f285181t, continuation);
            bVar.f285179r = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((b) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285178q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f285179r;
                StoriesInternalAction.SetStoriesBackground setStoriesBackground = StoriesInternalAction.SetStoriesBackground.f285258b;
                this.f285179r = interfaceC43172j;
                this.f285178q = 1;
                if (interfaceC43172j.emit(setStoriesBackground, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return G0.f406611a;
                }
                interfaceC43172j = (InterfaceC43172j) this.f285179r;
                C42729a0.b(obj);
            }
            this.f285179r = null;
            this.f285178q = 2;
            if (a.c(a.this, interfaceC43172j, this.f285181t, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$process$2", f = "StoriesActor.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StoriesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285182q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285183r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13851a f285184s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(InterfaceC13851a interfaceC13851a, Continuation<? super c> continuation) {
            super(2, continuation);
            this.f285184s = interfaceC13851a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            c cVar = new c(this.f285184s, continuation);
            cVar.f285183r = obj;
            return cVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285182q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f285183r;
                InterfaceC13851a.k kVar = (InterfaceC13851a.k) this.f285184s;
                if (kVar.f6077a.length() > 0) {
                    StoriesInternalAction.StoryViewed storyViewed = new StoriesInternalAction.StoryViewed(kVar.f6077a);
                    this.f285182q = 1;
                    if (interfaceC43172j.emit(storyViewed, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$process$3", f = "StoriesActor.kt", i = {}, l = {64}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StoriesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285185q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285186r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13851a f285187s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(InterfaceC13851a interfaceC13851a, Continuation<? super d> continuation) {
            super(2, continuation);
            this.f285187s = interfaceC13851a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = new d(this.f285187s, continuation);
            dVar.f285186r = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((d) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285185q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f285186r;
                InterfaceC13851a.b bVar = (InterfaceC13851a.b) this.f285187s;
                if (bVar.f6067a.length() > 0) {
                    StoriesInternalAction.FullStoryViewed fullStoryViewed = new StoriesInternalAction.FullStoryViewed(bVar.f6067a);
                    this.f285185q = 1;
                    if (interfaceC43172j.emit(fullStoryViewed, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesActor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$process$4", f = "StoriesActor.kt", i = {2}, l = {73, 79, 84}, m = "invokeSuspend", n = {"error"}, s = {"L$0"})
    public static final class e extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StoriesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285188q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285189r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13851a f285190s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f285191t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ StoriesState f285192u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC13851a interfaceC13851a, a aVar, StoriesState storiesState, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f285190s = interfaceC13851a;
            this.f285191t = aVar;
            this.f285192u = storiesState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            e eVar = new e(this.f285190s, this.f285191t, this.f285192u, continuation);
            eVar.f285189r = obj;
            return eVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((e) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            ApiError apiError;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285188q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f285189r;
                P2<G0> p22 = ((InterfaceC13851a.c) this.f285190s).f6068a;
                if (p22 instanceof P2.c) {
                    StoriesInternalAction.Loading loading = StoriesInternalAction.Loading.f285251b;
                    this.f285188q = 1;
                    if (interfaceC43172j.emit(loading, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else if (p22 instanceof P2.a) {
                    ApiError apiError2 = ((P2.a) p22).f318719a;
                    boolean z12 = apiError2 instanceof ApiError.NetworkIOError;
                    StoriesState storiesState = this.f285192u;
                    a aVar = this.f285191t;
                    if (z12) {
                        String message = ((ApiError.NetworkIOError) apiError2).getF244063c();
                        if (message.length() == 0) {
                            message = CloseType.f285076d.a();
                        }
                        this.f285188q = 2;
                        if (a.d(aVar, interfaceC43172j, storiesState, message, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        String message2 = apiError2.getF244063c();
                        if (message2.length() == 0) {
                            message2 = CloseType.f285078f.a();
                        }
                        this.f285189r = apiError2;
                        this.f285188q = 3;
                        if (a.d(aVar, interfaceC43172j, storiesState, message2, this) == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        apiError = apiError2;
                        V2.f318762a.d("StoriesActor webView load error", apiError.getF244063c());
                    }
                }
            } else if (i12 == 1 || i12 == 2) {
                C42729a0.b(obj);
            } else {
                if (i12 != 3) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                apiError = (ApiError) this.f285189r;
                C42729a0.b(obj);
                V2.f318762a.d("StoriesActor webView load error", apiError.getF244063c());
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$process$5", f = "StoriesActor.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
    public static final class f extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StoriesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285193q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285194r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StoriesState f285195s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f285196t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(a aVar, StoriesState storiesState, Continuation continuation) {
            super(2, continuation);
            this.f285195s = storiesState;
            this.f285196t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            f fVar = new f(this.f285196t, this.f285195s, continuation);
            fVar.f285194r = obj;
            return fVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((f) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285193q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f285194r;
                StoriesState storiesState = this.f285195s;
                LoadState loadState = storiesState.f285270i;
                loadState.getClass();
                boolean z12 = loadState == LoadState.f285239b;
                a aVar = this.f285196t;
                if (z12) {
                    aVar.f285172a.a(CloseType.f285077e.a(), storiesState.f285264c, storiesState.f285267f, storiesState.f285263b);
                }
                this.f285193q = 1;
                aVar.getClass();
                Object objEmit = interfaceC43172j.emit(new StoriesInternalAction.Close(false, false, storiesState.f285264c, storiesState.f285266e, storiesState.f285269h, 1, null), this);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = G0.f406611a;
                }
                if (objEmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$process$6", f = "StoriesActor.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
    public static final class g extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StoriesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285197q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285198r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ StoriesState f285199s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ a f285200t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(a aVar, StoriesState storiesState, Continuation continuation) {
            super(2, continuation);
            this.f285199s = storiesState;
            this.f285200t = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            g gVar = new g(this.f285200t, this.f285199s, continuation);
            gVar.f285198r = obj;
            return gVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((g) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285197q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f285198r;
                StoriesState storiesState = this.f285199s;
                LoadState loadState = storiesState.f285270i;
                loadState.getClass();
                LoadState loadState2 = LoadState.f285239b;
                a aVar = this.f285200t;
                if (loadState == loadState2) {
                    aVar.f285172a.a(CloseType.f285075c.a(), storiesState.f285264c, storiesState.f285267f, storiesState.f285263b);
                }
                this.f285197q = 1;
                aVar.getClass();
                Object objEmit = interfaceC43172j.emit(new StoriesInternalAction.Close(false, true, storiesState.f285264c, storiesState.f285266e, storiesState.f285269h, 1, null), this);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = G0.f406611a;
                }
                if (objEmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$process$7", f = "StoriesActor.kt", i = {}, l = {121}, m = "invokeSuspend", n = {}, s = {})
    public static final class h extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StoriesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285201q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285202r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ StoriesState f285204t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(StoriesState storiesState, Continuation<? super h> continuation) {
            super(2, continuation);
            this.f285204t = storiesState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            h hVar = a.this.new h(this.f285204t, continuation);
            hVar.f285202r = obj;
            return hVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((h) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285201q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f285202r;
                this.f285201q = 1;
                a.this.getClass();
                StoriesState storiesState = this.f285204t;
                Object objEmit = interfaceC43172j.emit(new StoriesInternalAction.Close(false, true, storiesState.f285264c, storiesState.f285266e, storiesState.f285269h, 1, null), this);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = G0.f406611a;
                }
                if (objEmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$process$8", f = "StoriesActor.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
    public static final class i extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StoriesInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285205q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285206r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ StoriesState f285208t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(StoriesState storiesState, Continuation<? super i> continuation) {
            super(2, continuation);
            this.f285208t = storiesState;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            i iVar = a.this.new i(this.f285208t, continuation);
            iVar.f285206r = obj;
            return iVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((i) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285205q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f285206r;
                String strA = CloseType.f285074b.a();
                a aVar = a.this;
                aVar.getClass();
                StoriesState storiesState = this.f285208t;
                aVar.f285172a.a(strA, storiesState.f285264c, storiesState.f285267f, storiesState.f285263b);
                this.f285205q = 1;
                aVar.getClass();
                Object objEmit = interfaceC43172j.emit(new StoriesInternalAction.Close(false, true, storiesState.f285264c, storiesState.f285266e, storiesState.f285269h, 1, null), this);
                if (objEmit != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objEmit = G0.f406611a;
                }
                if (objEmit == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: StoriesActor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/stories/mvi/entity/StoriesInternalAction$OpenUri;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.stories.mvi.StoriesActor$process$9", f = "StoriesActor.kt", i = {}, l = {134}, m = "invokeSuspend", n = {}, s = {})
    public static final class j extends SuspendLambda implements Y41.p<InterfaceC43172j<? super StoriesInternalAction.OpenUri>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f285209q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f285210r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ InterfaceC13851a f285212t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC13851a interfaceC13851a, Continuation<? super j> continuation) {
            super(2, continuation);
            this.f285212t = interfaceC13851a;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            j jVar = a.this.new j(this.f285212t, continuation);
            jVar.f285210r = obj;
            return jVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super StoriesInternalAction.OpenUri> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((j) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f285209q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f285210r;
                a aVar = a.this;
                x xVar = aVar.f285173b;
                InterfaceC13851a.d dVar = (InterfaceC13851a.d) this.f285212t;
                DeepLink deepLinkE = xVar.e(dVar.f6069a);
                if (deepLinkE instanceof NoMatchLink) {
                    StoriesInternalAction.OpenUri openUri = new StoriesInternalAction.OpenUri(dVar.f6069a);
                    this.f285209q = 1;
                    if (interfaceC43172j.emit(openUri, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    b.a.a(aVar.f285174c, deepLinkE, null, dVar.f6070b, 2);
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    @Inject
    public a(@Y61.k InterfaceC13369a interfaceC13369a, @Y61.k x xVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k G g12, @Y61.k r rVar) {
        this.f285172a = interfaceC13369a;
        this.f285173b = xVar;
        this.f285174c = aVar;
        this.f285175d = g12;
        this.f285176e = rVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:32:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x0016  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.stories.mvi.a r7, kotlinx.coroutines.flow.InterfaceC43172j r8, com.avito.android.stories.mvi.entity.StoriesState r9, kotlin.coroutines.jvm.internal.ContinuationImpl r10) {
        /*
            r7.getClass()
            boolean r0 = r10 instanceof com.avito.android.stories.mvi.c
            if (r0 == 0) goto L16
            r0 = r10
            com.avito.android.stories.mvi.c r0 = (com.avito.android.stories.mvi.c) r0
            int r1 = r0.f285221v
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L16
            int r1 = r1 - r2
            r0.f285221v = r1
            goto L1b
        L16:
            com.avito.android.stories.mvi.c r0 = new com.avito.android.stories.mvi.c
            r0.<init>(r7, r10)
        L1b:
            java.lang.Object r10 = r0.f285219t
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f285221v
            r3 = 3
            r4 = 2
            r5 = 1
            if (r2 == 0) goto L4e
            if (r2 == r5) goto L44
            if (r2 == r4) goto L3a
            if (r2 != r3) goto L32
            kotlin.C42729a0.b(r10)
            goto L86
        L32:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.String r8 = "call to 'resume' before 'invoke' with coroutine"
            r7.<init>(r8)
            throw r7
        L3a:
            com.avito.android.stories.mvi.entity.StoriesState r7 = r0.f285218s
            kotlinx.coroutines.flow.j r8 = r0.f285217r
            com.avito.android.stories.mvi.a r9 = r0.f285216q
            kotlin.C42729a0.b(r10)
            goto L76
        L44:
            com.avito.android.stories.mvi.entity.StoriesState r9 = r0.f285218s
            kotlinx.coroutines.flow.j r8 = r0.f285217r
            com.avito.android.stories.mvi.a r7 = r0.f285216q
            kotlin.C42729a0.b(r10)
            goto L62
        L4e:
            kotlin.C42729a0.b(r10)
            com.avito.android.stories.mvi.entity.StoriesInternalAction$Loading r10 = com.avito.android.stories.mvi.entity.StoriesInternalAction.Loading.f285251b
            r0.f285216q = r7
            r0.f285217r = r8
            r0.f285218s = r9
            r0.f285221v = r5
            java.lang.Object r10 = r8.emit(r10, r0)
            if (r10 != r1) goto L62
            goto L88
        L62:
            com.avito.android.stories.mvi.entity.StoriesInternalAction$ResumeView r10 = com.avito.android.stories.mvi.entity.StoriesInternalAction.ResumeView.f285255b
            r0.f285216q = r7
            r0.f285217r = r8
            r0.f285218s = r9
            r0.f285221v = r4
            java.lang.Object r10 = r8.emit(r10, r0)
            if (r10 != r1) goto L73
            goto L88
        L73:
            r6 = r9
            r9 = r7
            r7 = r6
        L76:
            r10 = 0
            r0.f285216q = r10
            r0.f285217r = r10
            r0.f285218s = r10
            r0.f285221v = r3
            java.lang.Object r7 = r9.e(r8, r7, r0)
            if (r7 != r1) goto L86
            goto L88
        L86:
            kotlin.G0 r1 = kotlin.G0.f406611a
        L88:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.stories.mvi.a.c(com.avito.android.stories.mvi.a, kotlinx.coroutines.flow.j, com.avito.android.stories.mvi.entity.StoriesState, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object d(com.avito.android.stories.mvi.a r21, kotlinx.coroutines.flow.InterfaceC43172j r22, com.avito.android.stories.mvi.entity.StoriesState r23, java.lang.String r24, kotlin.coroutines.jvm.internal.ContinuationImpl r25) {
        /*
            r0 = r21
            r1 = r22
            r2 = r23
            r3 = r25
            r21.getClass()
            boolean r4 = r3 instanceof com.avito.android.stories.mvi.d
            if (r4 == 0) goto L1e
            r4 = r3
            com.avito.android.stories.mvi.d r4 = (com.avito.android.stories.mvi.d) r4
            int r5 = r4.f285226u
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r7 = r5 & r6
            if (r7 == 0) goto L1e
            int r5 = r5 - r6
            r4.f285226u = r5
            goto L23
        L1e:
            com.avito.android.stories.mvi.d r4 = new com.avito.android.stories.mvi.d
            r4.<init>(r0, r3)
        L23:
            java.lang.Object r3 = r4.f285224s
            java.lang.Object r5 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r6 = r4.f285226u
            r7 = 2
            r8 = 1
            if (r6 == 0) goto L4d
            if (r6 == r8) goto L40
            if (r6 != r7) goto L38
            kotlin.C42729a0.b(r3)
            goto Lad
        L38:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
            r0.<init>(r1)
            throw r0
        L40:
            kotlinx.coroutines.flow.j r0 = r4.f285223r
            com.avito.android.stories.mvi.a r1 = r4.f285222q
            kotlin.C42729a0.b(r3)
            r20 = r1
            r1 = r0
            r0 = r20
            goto L96
        L4d:
            kotlin.C42729a0.b(r3)
            com.avito.android.stories.mvi.entity.LoadState r3 = r2.f285270i
            r3.getClass()
            com.avito.android.stories.mvi.entity.LoadState r6 = com.avito.android.stories.mvi.entity.LoadState.f285239b
            if (r3 != r6) goto Lad
            int r3 = r24.length()
            if (r3 != 0) goto L66
            com.avito.android.stories.analytics.CloseType r3 = com.avito.android.stories.analytics.CloseType.f285078f
            java.lang.String r3 = r3.a()
            goto L68
        L66:
            r3 = r24
        L68:
            java.lang.String r6 = r2.f285263b
            Cx0.a r9 = r0.f285172a
            java.lang.String r10 = r2.f285264c
            java.lang.String r11 = r2.f285267f
            r9.a(r3, r10, r11, r6)
            com.avito.android.stories.mvi.entity.StoriesInternalAction$Close r3 = new com.avito.android.stories.mvi.entity.StoriesInternalAction$Close
            r18 = 3
            r19 = 0
            r13 = 0
            r14 = 0
            java.lang.String r15 = r2.f285264c
            java.util.List<java.lang.String> r6 = r2.f285266e
            boolean r2 = r2.f285269h
            r12 = r3
            r16 = r6
            r17 = r2
            r12.<init>(r13, r14, r15, r16, r17, r18, r19)
            r4.f285222q = r0
            r4.f285223r = r1
            r4.f285226u = r8
            java.lang.Object r2 = r1.emit(r3, r4)
            if (r2 != r5) goto L96
            goto Laf
        L96:
            com.avito.android.stories.mvi.entity.StoriesInternalAction$ShowToast r2 = new com.avito.android.stories.mvi.entity.StoriesInternalAction$ShowToast
            com.avito.android.stories.r r0 = r0.f285176e
            java.lang.String r0 = r0.f285296a
            r2.<init>(r0)
            r0 = 0
            r4.f285222q = r0
            r4.f285223r = r0
            r4.f285226u = r7
            java.lang.Object r0 = r1.emit(r2, r4)
            if (r0 != r5) goto Lad
            goto Laf
        Lad:
            kotlin.G0 r5 = kotlin.G0.f406611a
        Laf:
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.stories.mvi.a.d(com.avito.android.stories.mvi.a, kotlinx.coroutines.flow.j, com.avito.android.stories.mvi.entity.StoriesState, java.lang.String, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        StoriesState storiesState = (StoriesState) aVar.invoke();
        return C43175k.N(new C43152f0(new C43137a0(new com.avito.android.stories.mvi.f(this, storiesState, null), C43175k.B(new com.avito.android.stories.mvi.e(this, storiesState, null), y.a(this.f285174c.d9()))), new com.avito.android.stories.mvi.g(3, null)), C43175k.C(new com.avito.android.stories.mvi.b(this, aVar, null), c43197r1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Object e(InterfaceC43172j interfaceC43172j, StoriesState storiesState, ContinuationImpl continuationImpl) {
        String str;
        String str2;
        G g12 = this.f285175d;
        CookieManager cookieManager = g12.f284981b;
        cookieManager.setAcceptCookie(true);
        for (com.avito.android.cookie_provider.a aVar : g12.f284982c.a()) {
            cookieManager.setCookie(aVar.f126169a, aVar.f126170b);
        }
        String str3 = storiesState.f285264c;
        StoriesArguments storiesArguments = g12.f284980a;
        Uri.Builder builderBuildUpon = (str3 != null ? C35809h6.c(Uri.parse(storiesArguments.f284988b), "selectedId", str3) : Uri.parse(storiesArguments.f284988b)).buildUpon();
        String str4 = storiesState.f285265d;
        if ((str4 == null || builderBuildUpon.appendQueryParameter("selectedPage", str4) == null) && (str = storiesArguments.f284989c) != null) {
            builderBuildUpon.appendQueryParameter("selectedPage", str);
        }
        String str5 = storiesState.f285268g;
        if ((str5 == null || builderBuildUpon.appendQueryParameter("crossCategoryTag", str5) == null) && (str2 = storiesArguments.f284992f) != null) {
            builderBuildUpon.appendQueryParameter("crossCategoryTag", str2);
        }
        String string = builderBuildUpon.toString();
        I i12 = g12.f284983d;
        String f253512a = i12.getF253555a();
        Q q12 = f253512a != null ? new Q(string, Collections.singletonMap(i12.getKey(), f253512a)) : new Q(string, P0.c());
        Object objEmit = interfaceC43172j.emit(new StoriesInternalAction.LoadWebViewUrl((String) q12.f406619b, (Map) q12.f406620c), continuationImpl);
        return objEmit == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objEmit : G0.f406611a;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: f, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<StoriesInternalAction> b(@Y61.k InterfaceC13851a interfaceC13851a, @Y61.k StoriesState storiesState) {
        C43210w c43210w;
        if (interfaceC13851a instanceof InterfaceC13851a.l) {
            return new C43210w(new StoriesInternalAction.TriggerUxFeedback(((InterfaceC13851a.l) interfaceC13851a).f6078a));
        }
        if (interfaceC13851a.equals(InterfaceC13851a.m.f6079a)) {
            c43210w = new C43210w(StoriesInternalAction.Ready.f285254b);
        } else {
            if (interfaceC13851a instanceof InterfaceC13851a.k) {
                return C43175k.G(new c(interfaceC13851a, null));
            }
            if (interfaceC13851a instanceof InterfaceC13851a.b) {
                return C43175k.G(new d(interfaceC13851a, null));
            }
            if (interfaceC13851a instanceof InterfaceC13851a.j) {
                return new C43210w(new StoriesInternalAction.SelectedPage(((InterfaceC13851a.j) interfaceC13851a).f6076a));
            }
            if (interfaceC13851a instanceof InterfaceC13851a.c) {
                return C43175k.G(new e(interfaceC13851a, this, storiesState, null));
            }
            if (interfaceC13851a.equals(InterfaceC13851a.f.f6072a)) {
                return C43175k.G(new f(this, storiesState, null));
            }
            if (interfaceC13851a.equals(InterfaceC13851a.i.f6075a)) {
                return C43175k.G(new g(this, storiesState, null));
            }
            if (interfaceC13851a.equals(InterfaceC13851a.e.f6071a)) {
                return C43175k.G(new h(storiesState, null));
            }
            if (interfaceC13851a.equals(InterfaceC13851a.C0312a.f6066a)) {
                return C43175k.G(new i(storiesState, null));
            }
            if (interfaceC13851a instanceof InterfaceC13851a.d) {
                return new C43152f0(C43175k.G(new j(interfaceC13851a, null)), new C8535a(3, null));
            }
            if (interfaceC13851a.equals(InterfaceC13851a.h.f6074a)) {
                return C43175k.G(new b(storiesState, null));
            }
            if (!interfaceC13851a.equals(InterfaceC13851a.g.f6073a)) {
                throw new NoWhenBranchMatchedException();
            }
            c43210w = new C43210w(StoriesInternalAction.SetDefaultBackground.f285257b);
        }
        return c43210w;
    }
}
