package com.avito.android.messenger_unread_counter.impl_module.unread_popups;

import com.avito.android.R;
import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.statsd.F;
import com.avito.android.analytics.statsd.y;
import com.avito.android.app_foreground_provider.util_module.AppForegroundStatus;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.util.R0;
import com.squareup.anvil.annotations.ContributesBinding;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.EmptyCoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.rx3.y;
import lZ.C43710a;
import pZ.C47037b;
import rZ.InterfaceC47619a;
import ru.avito.messenger.InterfaceC47842z;
import ru.avito.messenger.api.entity.FoldersCountersResponse;
import sZ.AbstractC48135a;
import sZ.InterfaceC48136b;

/* compiled from: UnreadMessagesTooltipInteractorImpl.kt */
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger_unread_counter/impl_module/unread_popups/h;", "LsZ/b;", "c", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class h implements InterfaceC48136b {

    /* renamed from: p, reason: collision with root package name */
    public static final /* synthetic */ int f197752p = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final pZ.d f197753a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.messenger_unread_counter.impl_module.unread_popups.d f197754b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47619a f197755c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.app_foreground_provider.util_module.a f197756d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final o f197757e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f197758f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC47842z f197759g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final E f197760h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final R0 f197761i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final F f197762j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final JY.a f197763k;

    /* renamed from: m, reason: collision with root package name */
    public int f197765m;

    /* renamed from: o, reason: collision with root package name */
    @Y61.l
    public Integer f197767o;

    /* renamed from: l, reason: collision with root package name */
    public boolean f197764l = true;

    /* renamed from: n, reason: collision with root package name */
    public boolean f197766n = true;

    /* compiled from: UnreadMessagesTooltipInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger_unread_counter.impl_module.unread_popups.UnreadMessagesTooltipInteractorImpl$1", f = "UnreadMessagesTooltipInteractorImpl.kt", i = {}, l = {59}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f197768q;

        /* compiled from: UnreadMessagesTooltipInteractorImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;", "appForegroundStatus", "Lkotlin/G0;", "emit", "(Lcom/avito/android/app_foreground_provider/util_module/AppForegroundStatus;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger_unread_counter.impl_module.unread_popups.h$a$a, reason: collision with other inner class name */
        public static final class C5828a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f197770b;

            public C5828a(h hVar) {
                this.f197770b = hVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                if (!((AppForegroundStatus) obj).isForeground()) {
                    h hVar = this.f197770b;
                    hVar.f197765m = hVar.f197755c.a();
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
            return h.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f197768q;
            if (i12 == 0) {
                C42729a0.b(obj);
                h hVar = h.this;
                Z1 z1A = hVar.f197756d.a();
                C5828a c5828a = new C5828a(hVar);
                this.f197768q = 1;
                if (z1A.collect(c5828a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            throw new KotlinNothingValueException();
        }
    }

    /* compiled from: UnreadMessagesTooltipInteractorImpl.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger_unread_counter.impl_module.unread_popups.UnreadMessagesTooltipInteractorImpl$2", f = "UnreadMessagesTooltipInteractorImpl.kt", i = {}, l = {72}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f197771q;

        /* compiled from: UnreadMessagesTooltipInteractorImpl.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LpZ/b;", "newCounter", "Lkotlin/G0;", "emit", "(LpZ/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ h f197773b;

            public a(h hVar) {
                this.f197773b = hVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                C47037b c47037b = (C47037b) obj;
                int channelsCount = c47037b.getChannelsCount();
                h hVar = this.f197773b;
                int channelsCount2 = channelsCount > hVar.f197765m ? c47037b.getChannelsCount() - hVar.f197765m : 0;
                if (hVar.f197756d.getStatus().isForeground()) {
                    hVar.f197764l = false;
                }
                if (hVar.f197767o == null && channelsCount2 > 0) {
                    hVar.f197767o = Boxing.boxInt(channelsCount2);
                }
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger_unread_counter.impl_module.unread_popups.h$b$b, reason: collision with other inner class name */
        public static final class C5829b implements InterfaceC43160i<C47037b> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f197774b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ h f197775c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.messenger_unread_counter.impl_module.unread_popups.h$b$b$a */
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f197776b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ h f197777c;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.messenger_unread_counter.impl_module.unread_popups.UnreadMessagesTooltipInteractorImpl$2$invokeSuspend$$inlined$filter$1$2", f = "UnreadMessagesTooltipInteractorImpl.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.messenger_unread_counter.impl_module.unread_popups.h$b$b$a$a, reason: collision with other inner class name */
                public static final class C5830a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f197778q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f197779r;

                    public C5830a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f197778q = obj;
                        this.f197779r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j, h hVar) {
                    this.f197776b = interfaceC43172j;
                    this.f197777c = hVar;
                }

                /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                @Y61.l
                /*
                    Code decompiled incorrectly, please refer to instructions dump.
                    To view partially-correct add '--show-bad-code' argument
                */
                public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                    /*
                        r4 = this;
                        boolean r0 = r6 instanceof com.avito.android.messenger_unread_counter.impl_module.unread_popups.h.b.C5829b.a.C5830a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.messenger_unread_counter.impl_module.unread_popups.h$b$b$a$a r0 = (com.avito.android.messenger_unread_counter.impl_module.unread_popups.h.b.C5829b.a.C5830a) r0
                        int r1 = r0.f197779r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f197779r = r1
                        goto L18
                    L13:
                        com.avito.android.messenger_unread_counter.impl_module.unread_popups.h$b$b$a$a r0 = new com.avito.android.messenger_unread_counter.impl_module.unread_popups.h$b$b$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f197778q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f197779r
                        r3 = 1
                        if (r2 == 0) goto L31
                        if (r2 != r3) goto L29
                        kotlin.C42729a0.b(r6)
                        goto L48
                    L29:
                        java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                        java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                        r5.<init>(r6)
                        throw r5
                    L31:
                        kotlin.C42729a0.b(r6)
                        r6 = r5
                        pZ.b r6 = (pZ.C47037b) r6
                        com.avito.android.messenger_unread_counter.impl_module.unread_popups.h r6 = r4.f197777c
                        boolean r6 = r6.f197764l
                        if (r6 == 0) goto L48
                        r0.f197779r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f197776b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger_unread_counter.impl_module.unread_popups.h.b.C5829b.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public C5829b(InterfaceC43160i interfaceC43160i, h hVar) {
                this.f197774b = interfaceC43160i;
                this.f197775c = hVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super C47037b> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = ((AbstractC43168f) this.f197774b).collect(new a(interfaceC43172j, this.f197775c), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return h.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f197771q;
            if (i12 == 0) {
                C42729a0.b(obj);
                h hVar = h.this;
                C5829b c5829b = new C5829b(y.a(hVar.f197753a.getF197729a()), hVar);
                a aVar = new a(hVar);
                this.f197771q = 1;
                if (c5829b.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: UnreadMessagesTooltipInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082T¢\u0006\u0006\n\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/avito/android/messenger_unread_counter/impl_module/unread_popups/h$c;", "", "<init>", "()V", "", "COUNTER_KEY", "Ljava/lang/String;", "SHORT_TOOLTIP_ENTRY_POINT", "", "TOOLTIP_ANCHOR_OFFSET_DP", "I", "_avito_messenger-unread-counter_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class c {
        public /* synthetic */ c(C42822w c42822w) {
            this();
        }

        public c() {
        }
    }

    /* compiled from: UnreadMessagesTooltipInteractorImpl.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lru/avito/messenger/api/entity/FoldersCountersResponse;", "response", "Lkotlinx/coroutines/flow/i;", "LsZ/a;", "<anonymous>", "(Lru/avito/messenger/api/entity/FoldersCountersResponse;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger_unread_counter.impl_module.unread_popups.UnreadMessagesTooltipInteractorImpl$getUnreadMessagesPopupType$1", f = "UnreadMessagesTooltipInteractorImpl.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements Y41.p<FoldersCountersResponse, Continuation<? super InterfaceC43160i<? extends AbstractC48135a>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f197781q;

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            d dVar = h.this.new d(continuation);
            dVar.f197781q = obj;
            return dVar;
        }

        @Override // Y41.p
        public final Object invoke(FoldersCountersResponse foldersCountersResponse, Continuation<? super InterfaceC43160i<? extends AbstractC48135a>> continuation) {
            return ((d) create(foldersCountersResponse, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            FoldersCountersResponse foldersCountersResponse = (FoldersCountersResponse) this.f197781q;
            Integer num = foldersCountersResponse.getCounters().get("unreadChats");
            int iIntValue = num != null ? num.intValue() : 0;
            h hVar = h.this;
            int i12 = iIntValue - hVar.f197765m;
            if (i12 <= 0) {
                return new C43210w(AbstractC48135a.C12619a.f437722a);
            }
            if (!L.f(foldersCountersResponse.getEntryPointViewType(), "shortTooltip")) {
                return new C43210w(AbstractC48135a.C12619a.f437722a);
            }
            C43710a c43710a = new C43710a();
            InterfaceC28373a interfaceC28373a = hVar.f197758f;
            interfaceC28373a.c(c43710a);
            interfaceC28373a.c(new y.a(hVar.f197762j.a("unread_chats", "{{%app_ver%}}", "shortTooltip.show").f91030a, 1L));
            com.avito.android.messenger_unread_counter.impl_module.unread_popups.d dVar = hVar.f197754b;
            String strA = dVar.a(i12);
            dVar.getClass();
            return new C43210w(new AbstractC48135a.b(strA, Boxing.boxInt(R.style.Re23_Tooltip_Default), Boxing.boxInt(6)));
        }
    }

    static {
        new c(null);
    }

    @Inject
    public h(@Y61.k pZ.d dVar, @Y61.k com.avito.android.messenger_unread_counter.impl_module.unread_popups.d dVar2, @Y61.k InterfaceC47619a interfaceC47619a, @Y61.k com.avito.android.app_foreground_provider.util_module.a aVar, @Y61.k o oVar, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k InterfaceC47842z interfaceC47842z, @Y61.k E e12, @Y61.k R0 r02, @Y61.k F f12, @Y61.k JY.a aVar2) {
        this.f197753a = dVar;
        this.f197754b = dVar2;
        this.f197755c = interfaceC47619a;
        this.f197756d = aVar;
        this.f197757e = oVar;
        this.f197758f = interfaceC28373a;
        this.f197759g = interfaceC47842z;
        this.f197760h = e12;
        this.f197761i = r02;
        this.f197762j = f12;
        this.f197763k = aVar2;
        this.f197765m = interfaceC47619a.a();
        EmptyCoroutineContext emptyCoroutineContext = EmptyCoroutineContext.INSTANCE;
        C43259k.d(U.a(emptyCoroutineContext), null, null, new a(null), 3);
        C43259k.d(U.a(emptyCoroutineContext), null, null, new b(null), 3);
    }

    @Override // sZ.InterfaceC48136b
    @Y61.k
    public final kotlinx.coroutines.flow.internal.m a() {
        InterfaceC43160i<AbstractC48135a> interfaceC43160iB;
        InterfaceC43160i interfaceC43160iC = C43175k.C(new l(this, null), C43175k.I(this.f197761i.a(), this.f197757e.getF197796g()));
        if (this.f197766n) {
            this.f197766n = false;
            interfaceC43160iB = b();
        } else {
            interfaceC43160iB = new C43210w(AbstractC48135a.C12619a.f437722a);
        }
        return C43175k.N(interfaceC43160iC, interfaceC43160iB);
    }

    public final InterfaceC43160i<AbstractC48135a> b() {
        return C43175k.C(new d(null), new C43152f0(kotlinx.coroutines.rx3.y.a(this.f197760h.o().n(new j(this)).F()), new k(3, null)));
    }
}
