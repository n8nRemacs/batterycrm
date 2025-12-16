package com.avito.android.messenger.conversation.mvi.messages.utils;

import androidx.compose.runtime.A;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.runtime.internal.P;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import kotlinx.coroutines.flow.p2;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.t1;

/* compiled from: HighlightMessageStateUpdatesProvider.kt */
@P
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/utils/d;", "Lcom/avito/android/messenger/conversation/mvi/messages/utils/c;", "b", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class d extends c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f193564a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Z1<b> f193565b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final Z1<b> f193566c;

    /* compiled from: HighlightMessageStateUpdatesProvider.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.utils.HighlightMessageStateUpdatesProviderImpl$1", f = "HighlightMessageStateUpdatesProvider.kt", i = {}, l = {58}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f193567q;

        /* compiled from: HighlightMessageStateUpdatesProvider.kt */
        @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\n\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/messenger/conversation/mvi/messages/utils/d$b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.utils.HighlightMessageStateUpdatesProviderImpl$1$1$1", f = "HighlightMessageStateUpdatesProvider.kt", i = {0, 1}, l = {53, 54, 55}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.utils.d$a$a, reason: collision with other inner class name */
        public static final class C5721a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super b>, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f193569q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f193570r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ b f193571s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5721a(b bVar, Continuation<? super C5721a> continuation) {
                super(2, continuation);
                this.f193571s = bVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C5721a c5721a = new C5721a(this.f193571s, continuation);
                c5721a.f193570r = obj;
                return c5721a;
            }

            @Override // Y41.p
            public final Object invoke(InterfaceC43172j<? super b> interfaceC43172j, Continuation<? super G0> continuation) {
                return ((C5721a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:21:0x005a A[RETURN] */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r6) {
                /*
                    r5 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r1 = r5.f193569q
                    r2 = 3
                    r3 = 2
                    r4 = 1
                    if (r1 == 0) goto L2d
                    if (r1 == r4) goto L25
                    if (r1 == r3) goto L1d
                    if (r1 != r2) goto L15
                    kotlin.C42729a0.b(r6)
                    goto L5b
                L15:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r0)
                    throw r6
                L1d:
                    java.lang.Object r1 = r5.f193570r
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                    kotlin.C42729a0.b(r6)
                    goto L4f
                L25:
                    java.lang.Object r1 = r5.f193570r
                    kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                    kotlin.C42729a0.b(r6)
                    goto L42
                L2d:
                    kotlin.C42729a0.b(r6)
                    java.lang.Object r6 = r5.f193570r
                    kotlinx.coroutines.flow.j r6 = (kotlinx.coroutines.flow.InterfaceC43172j) r6
                    r5.f193570r = r6
                    r5.f193569q = r4
                    com.avito.android.messenger.conversation.mvi.messages.utils.d$b r1 = r5.f193571s
                    java.lang.Object r1 = r6.emit(r1, r5)
                    if (r1 != r0) goto L41
                    return r0
                L41:
                    r1 = r6
                L42:
                    r5.f193570r = r1
                    r5.f193569q = r3
                    r3 = 2000(0x7d0, double:9.88E-321)
                    java.lang.Object r6 = kotlinx.coroutines.C43131e0.b(r3, r5)
                    if (r6 != r0) goto L4f
                    return r0
                L4f:
                    r6 = 0
                    r5.f193570r = r6
                    r5.f193569q = r2
                    java.lang.Object r6 = r1.emit(r6, r5)
                    if (r6 != r0) goto L5b
                    return r0
                L5b:
                    kotlin.G0 r6 = kotlin.G0.f406611a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.utils.d.a.C5721a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        /* compiled from: HighlightMessageStateUpdatesProvider.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/utils/d$b;", "highlightedMessage", "Lkotlin/G0;", "emit", "(Lcom/avito/android/messenger/conversation/mvi/messages/utils/d$b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ d f193572b;

            public b(d dVar) {
                this.f193572b = dVar;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f193572b.f193566c.setValue((b) obj);
                return G0.f406611a;
            }
        }

        /* compiled from: Merge.kt */
        @s0
        @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.utils.HighlightMessageStateUpdatesProviderImpl$1$invokeSuspend$$inlined$flatMapLatest$1", f = "HighlightMessageStateUpdatesProvider.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
        public static final class c extends SuspendLambda implements Y41.q<InterfaceC43172j<? super b>, b, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f193573q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ InterfaceC43172j f193574r;

            /* renamed from: s, reason: collision with root package name */
            public /* synthetic */ Object f193575s;

            @Override // Y41.q
            public final Object invoke(InterfaceC43172j<? super b> interfaceC43172j, b bVar, Continuation<? super G0> continuation) {
                c cVar = new c(3, continuation);
                cVar.f193574r = interfaceC43172j;
                cVar.f193575s = bVar;
                return cVar.invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f193573q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC43172j interfaceC43172j = this.f193574r;
                    InterfaceC43160i interfaceC43160iG = C43175k.G(new C5721a((b) this.f193575s, null));
                    this.f193573q = 1;
                    if (C43175k.u(this, interfaceC43160iG, interfaceC43172j) == coroutine_suspended) {
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
            return d.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f193567q;
            if (i12 == 0) {
                C42729a0.b(obj);
                d dVar = d.this;
                kotlinx.coroutines.flow.internal.l lVarY = C43175k.Y(dVar.f193565b, new c(3, null));
                b bVar = new b(dVar);
                this.f193567q = 1;
                if (lVarY.collect(bVar, this) == coroutine_suspended) {
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

    /* compiled from: HighlightMessageStateUpdatesProvider.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/utils/d$b;", "", "_avito_messenger_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class b {

        /* renamed from: a, reason: collision with root package name */
        @Y61.k
        public final String f193576a;

        public b(@Y61.k String str) {
            this.f193576a = str;
        }
    }

    @Inject
    public d(@Y61.k R0 r02) {
        this.f193564a = r02;
        C43238h c43238hA = U.a(CoroutineContext.Element.DefaultImpls.plus((V0) t1.b(), r02.c()));
        this.f193565b = p2.a(null);
        this.f193566c = p2.a(null);
        C43259k.d(c43238hA, null, null, new a(null), 3);
    }

    @Override // com.avito.android.messenger.conversation.mvi.messages.utils.c
    @InterfaceC22132o
    @Y61.k
    public final InterfaceC22204y1 a(@Y61.l String str, @Y61.l A a12) {
        a12.C(1793701730);
        InterfaceC22204y1 interfaceC22204y1A = C22126m3.a(new e(this.f193566c, str), null, this.f193564a.c(), a12, 568, 0);
        a12.h();
        return interfaceC22204y1A;
    }

    public final void b(@Y61.k String str) {
        this.f193565b.setValue(new b(str));
    }
}
