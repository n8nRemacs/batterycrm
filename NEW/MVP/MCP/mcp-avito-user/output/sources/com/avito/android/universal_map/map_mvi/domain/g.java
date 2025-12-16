package com.avito.android.universal_map.map_mvi.domain;

import com.avito.android.remote.model.TypedResult;
import com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction;
import com.avito.android.util.A4;
import com.avito.android.util.R0;
import gj.InterfaceC40691b;
import java.util.Map;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.D1;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import tG0.InterfaceC48553b;

/* compiled from: MapViewportUseCase.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/universal_map/map_mvi/domain/g;", "Lcom/avito/android/universal_map/map_mvi/domain/f;", "_avito_universal-map_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC48553b> f306151a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f306152b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC40691b f306153c;

    /* compiled from: MapViewportUseCase.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.domain.MapViewportUseCaseImpl$invoke$1", f = "MapViewportUseCase.kt", i = {0, 1}, l = {52, 68, 73, 77}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super UniversalMapInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306154q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f306155r;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ rG0.c f306157t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Float f306158u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ String f306159v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Map<String, Object> f306160w;

        /* compiled from: MapViewportUseCase.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LuG0/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.domain.MapViewportUseCaseImpl$invoke$1$result$1", f = "MapViewportUseCase.kt", i = {}, l = {61, 62}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.universal_map.map_mvi.domain.g$a$a, reason: collision with other inner class name */
        public static final class C9408a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<uG0.d>>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f306161q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ Float f306162r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ g f306163s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f306164t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ Map<String, Object> f306165u;

            /* compiled from: MapViewportUseCase.kt */
            @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LuG0/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.domain.MapViewportUseCaseImpl$invoke$1$result$1$1", f = "MapViewportUseCase.kt", i = {}, l = {61}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.universal_map.map_mvi.domain.g$a$a$a, reason: collision with other inner class name */
            public static final class C9409a extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<uG0.d>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f306166q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ Y41.l<Continuation<? super TypedResult<uG0.d>>, Object> f306167r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C9409a(Y41.l<? super Continuation<? super TypedResult<uG0.d>>, ? extends Object> lVar, Continuation<? super C9409a> continuation) {
                    super(2, continuation);
                    this.f306167r = lVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C9409a(this.f306167r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super TypedResult<uG0.d>> continuation) {
                    return ((C9409a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f306166q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        this.f306166q = 1;
                        obj = ((b) this.f306167r).invoke(this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return obj;
                }
            }

            /* compiled from: MapViewportUseCase.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "LuG0/d;", "<anonymous>", "()Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.domain.MapViewportUseCaseImpl$invoke$1$result$1$request$1", f = "MapViewportUseCase.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.universal_map.map_mvi.domain.g$a$a$b */
            public static final class b extends SuspendLambda implements Y41.l<Continuation<? super TypedResult<uG0.d>>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f306168q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ g f306169r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ String f306170s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ Map<String, Object> f306171t;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(g gVar, String str, Map<String, ? extends Object> map, Continuation<? super b> continuation) {
                    super(1, continuation);
                    this.f306169r = gVar;
                    this.f306170s = str;
                    this.f306171t = map;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.k Continuation<?> continuation) {
                    return new b(this.f306169r, this.f306170s, this.f306171t, continuation);
                }

                @Override // Y41.l
                public final Object invoke(Continuation<? super TypedResult<uG0.d>> continuation) {
                    return ((b) create(continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f306168q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        InterfaceC48553b interfaceC48553b = this.f306169r.f306151a.get();
                        Map<String, String> mapJ = A4.j(A4.f318516a, this.f306171t);
                        this.f306168q = 1;
                        obj = interfaceC48553b.g(this.f306170s, mapJ, this);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                    } else {
                        if (i12 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                    }
                    return obj;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C9408a(Float f12, g gVar, String str, Map<String, ? extends Object> map, Continuation<? super C9408a> continuation) {
                super(2, continuation);
                this.f306162r = f12;
                this.f306163s = gVar;
                this.f306164t = str;
                this.f306165u = map;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C9408a(this.f306162r, this.f306163s, this.f306164t, this.f306165u, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super TypedResult<uG0.d>> continuation) {
                return ((C9408a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) throws Throwable {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f306161q;
                if (i12 != 0) {
                    if (i12 == 1) {
                        C42729a0.b(obj);
                        return (TypedResult) obj;
                    }
                    if (i12 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                    return (TypedResult) obj;
                }
                C42729a0.b(obj);
                Float f12 = this.f306162r;
                Long lBoxLong = f12 != null ? Boxing.boxLong((long) (f12.floatValue() * 1000)) : null;
                b bVar = new b(this.f306163s, this.f306164t, this.f306165u, null);
                if (lBoxLong == null || lBoxLong.longValue() <= 0) {
                    this.f306161q = 2;
                    obj = bVar.invoke(this);
                    if (obj == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    return (TypedResult) obj;
                }
                long jLongValue = lBoxLong.longValue();
                C9409a c9409a = new C9409a(bVar, null);
                this.f306161q = 1;
                obj = D1.b(jLongValue, c9409a, this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return (TypedResult) obj;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(rG0.c cVar, Float f12, String str, Map<String, ? extends Object> map, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f306157t = cVar;
            this.f306158u = f12;
            this.f306159v = str;
            this.f306160w = map;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = g.this.new a(this.f306157t, this.f306158u, this.f306159v, this.f306160w, continuation);
            aVar.f306155r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x00a6 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
            /*
                r17 = this;
                r0 = r17
                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r2 = r0.f306154q
                r3 = 0
                com.avito.android.universal_map.map_mvi.domain.g r4 = com.avito.android.universal_map.map_mvi.domain.g.this
                r5 = 4
                r6 = 3
                r7 = 2
                r8 = 1
                if (r2 == 0) goto L39
                if (r2 == r8) goto L2f
                if (r2 == r7) goto L27
                if (r2 == r6) goto L22
                if (r2 != r5) goto L1a
                goto L22
            L1a:
                java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
                java.lang.String r2 = "call to 'resume' before 'invoke' with coroutine"
                r1.<init>(r2)
                throw r1
            L22:
                kotlin.C42729a0.b(r18)
                goto Lb9
            L27:
                java.lang.Object r2 = r0.f306155r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                kotlin.C42729a0.b(r18)
                goto L9a
            L2f:
                java.lang.Object r2 = r0.f306155r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                kotlin.C42729a0.b(r18)
                r5 = r18
                goto L64
            L39:
                kotlin.C42729a0.b(r18)
                java.lang.Object r2 = r0.f306155r
                kotlinx.coroutines.flow.j r2 = (kotlinx.coroutines.flow.InterfaceC43172j) r2
                com.avito.android.util.R0 r9 = r4.f306152b
                kotlinx.coroutines.scheduling.b r9 = r9.a()
                com.avito.android.universal_map.map_mvi.domain.g$a$a r15 = new com.avito.android.universal_map.map_mvi.domain.g$a$a
                com.avito.android.universal_map.map_mvi.domain.g r12 = com.avito.android.universal_map.map_mvi.domain.g.this
                java.lang.String r13 = r0.f306159v
                java.lang.Float r11 = r0.f306158u
                java.util.Map<java.lang.String, java.lang.Object> r14 = r0.f306160w
                r16 = 0
                r10 = r15
                r5 = r15
                r15 = r16
                r10.<init>(r11, r12, r13, r14, r15)
                r0.f306155r = r2
                r0.f306154q = r8
                java.lang.Object r5 = kotlinx.coroutines.C43259k.g(r9, r5, r0)
                if (r5 != r1) goto L64
                return r1
            L64:
                com.avito.android.remote.model.TypedResult r5 = (com.avito.android.remote.model.TypedResult) r5
                boolean r8 = r5 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r8 == 0) goto La7
                gj.b r4 = r4.f306153c
                com.avito.android.remote.model.TypedResult$Success r5 = (com.avito.android.remote.model.TypedResult.Success) r5
                java.lang.Object r5 = r5.getResult()
                uG0.d r5 = (uG0.d) r5
                java.util.List r5 = r5.a()
                com.avito.android.beduin_shared.model.utils.a.a(r4, r5)
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$ShowUserLocationMarker r4 = new com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$MapViewInternalAction$ShowUserLocationMarker
                com.avito.android.avito_map.AvitoMapPoint r5 = new com.avito.android.avito_map.AvitoMapPoint
                rG0.c r8 = r0.f306157t
                double r9 = r8.f429714a
                r15 = 0
                r13 = 0
                double r11 = r8.f429715b
                r14 = 4
                r8 = r5
                r8.<init>(r9, r11, r13, r14, r15)
                r4.<init>(r5)
                r0.f306155r = r2
                r0.f306154q = r7
                java.lang.Object r4 = r2.emit(r4, r0)
                if (r4 != r1) goto L9a
                return r1
            L9a:
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$TriggerInvokeCustomActions r4 = com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction.TriggerInvokeCustomActions.f305553b
                r0.f306155r = r3
                r0.f306154q = r6
                java.lang.Object r2 = r2.emit(r4, r0)
                if (r2 != r1) goto Lb9
                return r1
            La7:
                boolean r4 = r5 instanceof com.avito.android.remote.model.TypedResult.Error
                if (r4 == 0) goto Lb9
                com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction$TriggerShowUserLocation r4 = com.avito.android.universal_map.map.mvi.entity.UniversalMapInternalAction.TriggerShowUserLocation.f305554b
                r0.f306155r = r3
                r3 = 4
                r0.f306154q = r3
                java.lang.Object r2 = r2.emit(r4, r0)
                if (r2 != r1) goto Lb9
                return r1
            Lb9:
                kotlin.G0 r1 = kotlin.G0.f406611a
                return r1
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.universal_map.map_mvi.domain.g.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: MapViewportUseCase.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/universal_map/map/mvi/entity/UniversalMapInternalAction;", "", "it", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.universal_map.map_mvi.domain.MapViewportUseCaseImpl$invoke$2", f = "MapViewportUseCase.kt", i = {}, l = {81}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UniversalMapInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f306172q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f306173r;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UniversalMapInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f306173r = interfaceC43172j;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f306172q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f306173r;
                UniversalMapInternalAction.TriggerShowUserLocation triggerShowUserLocation = UniversalMapInternalAction.TriggerShowUserLocation.f305554b;
                this.f306172q = 1;
                if (interfaceC43172j.emit(triggerShowUserLocation, this) == coroutine_suspended) {
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

    @Inject
    public g(@Y61.k h31.e<InterfaceC48553b> eVar, @Y61.k R0 r02, @Y61.k InterfaceC40691b interfaceC40691b) {
        this.f306151a = eVar;
        this.f306152b = r02;
        this.f306153c = interfaceC40691b;
    }

    @Override // com.avito.android.universal_map.map_mvi.domain.f
    @Y61.k
    public final InterfaceC43160i<UniversalMapInternalAction> a(@Y61.k String str, @Y61.l Float f12, @Y61.l Map<String, ? extends Object> map, @Y61.k rG0.c cVar) {
        return new C43152f0(C43175k.G(new a(cVar, f12, str, map, null)), new b(3, null));
    }
}
