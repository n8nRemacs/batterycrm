package com.avito.android.advertising.adapter.items.avito.bdui;

import android.content.Context;
import android.widget.FrameLayout;
import androidx.view.C22977J;
import cU.s;
import cU.v;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.beduin_v2.feature.mvi.entity.BeduinOneTimeEvent;
import com.avito.android.lib.beduin_v2.feature.mvi.x;
import com.avito.android.util.D6;
import com.avito.android.util.V2;
import com.avito.beduin.v2.engine.component.B;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import kotlin.AbstractC40048c;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC40047a;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrebuiltFeatureBeduinItemImpl.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/advertising/adapter/items/avito/bdui/t;", "Lcom/avito/android/lib/beduin_v2/feature/item/a;", "_avito_advertising_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class t implements com.avito.android.lib.beduin_v2.feature.item.a {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ZS.b f87120a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final C22977J f87121b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> f87122c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f87123d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final BeduinView f87124e;

    /* compiled from: PrebuiltFeatureBeduinItemImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advertising.adapter.items.avito.bdui.PrebuiltFeatureBeduinItemImpl$bind$1", f = "PrebuiltFeatureBeduinItemImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f87125q;

        /* compiled from: PrebuiltFeatureBeduinItemImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advertising.adapter.items.avito.bdui.PrebuiltFeatureBeduinItemImpl$bind$1$1", f = "PrebuiltFeatureBeduinItemImpl.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.advertising.adapter.items.avito.bdui.t$a$a, reason: collision with other inner class name */
        public static final class C2594a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f87127q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ t f87128r;

            /* compiled from: PrebuiltFeatureBeduinItemImpl.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.advertising.adapter.items.avito.bdui.t$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2595a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f87129b;

                public C2595a(t tVar) {
                    this.f87129b = tVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    BeduinOneTimeEvent beduinOneTimeEvent = (BeduinOneTimeEvent) obj;
                    t tVar = this.f87129b;
                    tVar.getClass();
                    if (!(beduinOneTimeEvent instanceof BeduinOneTimeEvent.ShowToastBar) && !(beduinOneTimeEvent instanceof BeduinOneTimeEvent.b)) {
                        if (beduinOneTimeEvent instanceof BeduinOneTimeEvent.a) {
                            tVar.f87124e.c(((BeduinOneTimeEvent.a) beduinOneTimeEvent).f176280a);
                        } else if (!(beduinOneTimeEvent instanceof BeduinOneTimeEvent.d)) {
                            boolean z12 = beduinOneTimeEvent instanceof BeduinOneTimeEvent.c;
                        }
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f87129b, t.class, "handleEvent", "handleEvent(Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2594a(t tVar, Continuation<? super C2594a> continuation) {
                super(2, continuation);
                this.f87128r = tVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C2594a(this.f87128r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C2594a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f87127q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    t tVar = this.f87128r;
                    InterfaceC43160i<BeduinOneTimeEvent> events = tVar.f87122c.getEvents();
                    C2595a c2595a = new C2595a(tVar);
                    this.f87127q = 1;
                    if (events.collect(c2595a, this) == coroutine_suspended) {
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

        /* compiled from: PrebuiltFeatureBeduinItemImpl.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.advertising.adapter.items.avito.bdui.PrebuiltFeatureBeduinItemImpl$bind$1$2", f = "PrebuiltFeatureBeduinItemImpl.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f87130q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ t f87131r;

            /* compiled from: PrebuiltFeatureBeduinItemImpl.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.advertising.adapter.items.avito.bdui.t$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C2596a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ t f87132b;

                public C2596a(t tVar) {
                    this.f87132b = tVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    AbstractC40048c abstractC40048c = (AbstractC40048c) obj;
                    t tVar = this.f87132b;
                    tVar.getClass();
                    if (!(abstractC40048c instanceof AbstractC40048c.d)) {
                        if (abstractC40048c instanceof AbstractC40048c.a) {
                            tVar.f87124e.b(((AbstractC40048c.a) abstractC40048c).getF395211c());
                        } else if (abstractC40048c instanceof AbstractC40048c.b) {
                            V2.f318762a.f(((AbstractC40048c.b) abstractC40048c).f395216b);
                        } else {
                            boolean z12 = abstractC40048c instanceof AbstractC40048c.C11084c;
                        }
                    }
                    G0 g02 = G0.f406611a;
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    return g02;
                }

                public final boolean equals(@Y61.l Object obj) {
                    if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                        return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                    }
                    return false;
                }

                @Override // kotlin.jvm.internal.D
                @Y61.k
                public final InterfaceC43072x<?> getFunctionDelegate() {
                    return new C42801a(2, this.f87132b, t.class, "render", "render(Lcom/avito/android/lib/beduin_v2/feature/mvi/entity/BeduinState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(t tVar, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f87131r = tVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f87131r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f87130q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    t tVar = this.f87131r;
                    x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> xVar = tVar.f87122c;
                    C2596a c2596a = new C2596a(tVar);
                    this.f87130q = 1;
                    if (xVar.collect(c2596a, this) == coroutine_suspended) {
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

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = t.this.new a(continuation);
            aVar.f87125q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            T t12 = (T) this.f87125q;
            t tVar = t.this;
            C43259k.d(t12, null, null, new C2594a(tVar, null), 3);
            C43259k.d(t12, null, null, new b(tVar, null), 3);
            return G0.f406611a;
        }
    }

    /* compiled from: PrebuiltFeatureBeduinItemImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.advertising.adapter.items.avito.bdui.PrebuiltFeatureBeduinItemImpl$bind$2", f = "PrebuiltFeatureBeduinItemImpl.kt", i = {}, l = {62}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f87133q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f87135s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(String str, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f87135s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return t.this.new b(this.f87135s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f87133q;
            if (i12 == 0) {
                C42729a0.b(obj);
                t tVar = t.this;
                x<InterfaceC40047a, AbstractC40048c, BeduinOneTimeEvent> xVar = tVar.f87122c;
                InterfaceC40047a.e eVar = new InterfaceC40047a.e(this.f87135s, tVar.f87120a);
                this.f87133q = 1;
                if (xVar.ya(eVar, this) == coroutine_suspended) {
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

    public t(@Y61.k FrameLayout frameLayout, @Y61.k ZS.b bVar, @Y61.k ScreenPerformanceTracker screenPerformanceTracker, @Y61.k C22977J c22977j, @Y61.k x xVar, @Y61.k B b12, @Y61.k aU0.b bVar2) {
        this.f87120a = bVar;
        this.f87121b = c22977j;
        this.f87122c = xVar;
        Context context = frameLayout.getContext();
        cU.t tVarA = ((s.b) C29972i.a(C29972i.b(context), s.b.class)).fd().a(context, screenPerformanceTracker, bVar2, v.f57891a, b12);
        BeduinView beduinView = new BeduinView(context, null, 0, 0, 14, null);
        A aB2 = tVarA.b();
        com.avito.beduin.v2.theme.k kVarA = tVarA.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f87124e = beduinView;
        frameLayout.removeAllViews();
        frameLayout.addView(beduinView);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.item.a
    public final void T3(@Y61.k String str) {
        D6.H(this.f87124e);
        boolean z12 = this.f87123d;
        C22977J c22977j = this.f87121b;
        if (!z12) {
            this.f87123d = true;
            C43259k.d(c22977j, null, null, new a(null), 3);
        }
        C43259k.d(c22977j, null, null, new b(str, null), 3);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.item.a
    public final void a() {
        D6.w(this.f87124e);
    }

    @Override // com.avito.android.lib.beduin_v2.feature.item.a
    /* renamed from: b, reason: from getter */
    public final boolean getF87123d() {
        return this.f87123d;
    }
}
