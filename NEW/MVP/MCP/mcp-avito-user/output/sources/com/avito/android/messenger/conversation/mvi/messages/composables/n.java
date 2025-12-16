package com.avito.android.messenger.conversation.mvi.messages.composables;

import androidx.compose.foundation.interaction.a;
import androidx.compose.foundation.layout.C20588k2;
import androidx.compose.foundation.layout.R1;
import androidx.compose.foundation.layout.V1;
import androidx.compose.foundation.lazy.C20650b;
import androidx.compose.foundation.lazy.K;
import androidx.compose.foundation.lazy.w0;
import androidx.compose.runtime.A;
import androidx.compose.runtime.B;
import androidx.compose.runtime.C22039c2;
import androidx.compose.runtime.C22066f2;
import androidx.compose.runtime.C22126m3;
import androidx.compose.runtime.InterfaceC22132o;
import androidx.compose.runtime.InterfaceC22181t;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.InterfaceC22215f;
import androidx.compose.ui.platform.C22501m2;
import androidx.compose.ui.unit.h;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.messenger.conversation.mvi.messages.f0;
import com.avito.android.messenger.conversation.mvi.messages.g0;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: MessageList.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002¨\u0006\u0004²\u0006\u0018\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00020\u00008\nX\u008a\u0084\u0002"}, d2 = {"Lkotlin/Function1;", "Lcom/avito/android/messenger/conversation/mvi/messages/f0;", "Lkotlin/G0;", "onScrollActionState", "_avito_messenger_impl"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class n {

    /* compiled from: MessageList.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.MessageListKt$ScrollStateObserver$1$1", f = "MessageList.kt", i = {}, l = {144}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f192714q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ w0 f192715r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f192716s;

        /* compiled from: MessageList.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.n$a$a, reason: collision with other inner class name */
        public static final class C5693a extends N implements Y41.a<Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ w0 f192717l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C5693a(w0 w0Var) {
                super(0);
                this.f192717l = w0Var;
            }

            @Override // Y41.a
            public final Boolean invoke() {
                K k12 = (K) C42745f0.G(this.f192717l.j().h());
                boolean z12 = false;
                if (k12 != null && k12.getF29645a() == 0) {
                    z12 = true;
                }
                return Boolean.valueOf(z12);
            }
        }

        /* compiled from: MessageList.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f192718b;

            public b(InterfaceC22204y1 interfaceC22204y1) {
                this.f192718b = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                ((Y41.l) this.f192718b.getF42167b()).invoke(new f0.c(((Boolean) obj).booleanValue()));
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(w0 w0Var, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f192715r = w0Var;
            this.f192716s = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f192715r, this.f192716s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f192714q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i interfaceC43160iR = C43175k.r(C22126m3.n(new C5693a(this.f192715r)));
                b bVar = new b(this.f192716s);
                this.f192714q = 1;
                if (interfaceC43160iR.collect(bVar, this) == coroutine_suspended) {
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

    /* compiled from: MessageList.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.MessageListKt$ScrollStateObserver$2$1", f = "MessageList.kt", i = {}, l = {156}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f192719q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ w0 f192720r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f192721s;

        /* compiled from: MessageList.kt */
        @Metadata(d1 = {"\u0000\n\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"<anonymous>", "", "invoke", "()Ljava/lang/Boolean;"}, k = 3, mv = {1, 9, 0}, xi = 48)
        public static final class a extends N implements Y41.a<Boolean> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ w0 f192722l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(w0 w0Var) {
                super(0);
                this.f192722l = w0Var;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0023  */
            @Override // Y41.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Boolean invoke() {
                /*
                    r3 = this;
                    androidx.compose.foundation.lazy.w0 r0 = r3.f192722l
                    androidx.compose.foundation.lazy.Y r1 = r0.j()
                    java.util.List r1 = r1.h()
                    java.lang.Object r1 = kotlin.collections.C42745f0.S(r1)
                    androidx.compose.foundation.lazy.K r1 = (androidx.compose.foundation.lazy.K) r1
                    androidx.compose.foundation.lazy.Y r0 = r0.j()
                    int r0 = r0.getF28948n()
                    if (r1 == 0) goto L23
                    int r1 = r1.getF29645a()
                    r2 = 1
                    int r0 = r0 - r2
                    if (r1 != r0) goto L23
                    goto L24
                L23:
                    r2 = 0
                L24:
                    java.lang.Boolean r0 = java.lang.Boolean.valueOf(r2)
                    return r0
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.n.b.a.invoke():java.lang.Object");
            }
        }

        /* compiled from: MessageList.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "emit", "(ZLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.n$b$b, reason: collision with other inner class name */
        public static final class C5694b<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f192723b;

            public C5694b(InterfaceC22204y1 interfaceC22204y1) {
                this.f192723b = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                ((Boolean) obj).getClass();
                ((Y41.l) this.f192723b.getF42167b()).invoke(f0.d.f192951a);
                return G0.f406611a;
            }
        }

        /* compiled from: SafeCollector.common.kt */
        @s0
        @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
        public static final class c implements InterfaceC43160i<Boolean> {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43160i f192724b;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            public static final class a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ InterfaceC43172j f192725b;

                /* compiled from: Emitters.kt */
                @s0
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.MessageListKt$ScrollStateObserver$2$1$invokeSuspend$$inlined$filter$1$2", f = "MessageList.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                /* renamed from: com.avito.android.messenger.conversation.mvi.messages.composables.n$b$c$a$a, reason: collision with other inner class name */
                public static final class C5695a extends ContinuationImpl {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f192726q;

                    /* renamed from: r, reason: collision with root package name */
                    public int f192727r;

                    public C5695a(Continuation continuation) {
                        super(continuation);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        this.f192726q = obj;
                        this.f192727r |= BeduinInputModel.MIN_TEXT_VERSION;
                        return a.this.emit(null, this);
                    }
                }

                public a(InterfaceC43172j interfaceC43172j) {
                    this.f192725b = interfaceC43172j;
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
                        boolean r0 = r6 instanceof com.avito.android.messenger.conversation.mvi.messages.composables.n.b.c.a.C5695a
                        if (r0 == 0) goto L13
                        r0 = r6
                        com.avito.android.messenger.conversation.mvi.messages.composables.n$b$c$a$a r0 = (com.avito.android.messenger.conversation.mvi.messages.composables.n.b.c.a.C5695a) r0
                        int r1 = r0.f192727r
                        r2 = -2147483648(0xffffffff80000000, float:-0.0)
                        r3 = r1 & r2
                        if (r3 == 0) goto L13
                        int r1 = r1 - r2
                        r0.f192727r = r1
                        goto L18
                    L13:
                        com.avito.android.messenger.conversation.mvi.messages.composables.n$b$c$a$a r0 = new com.avito.android.messenger.conversation.mvi.messages.composables.n$b$c$a$a
                        r0.<init>(r6)
                    L18:
                        java.lang.Object r6 = r0.f192726q
                        java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                        int r2 = r0.f192727r
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
                        java.lang.Boolean r6 = (java.lang.Boolean) r6
                        boolean r6 = r6.booleanValue()
                        if (r6 == 0) goto L48
                        r0.f192727r = r3
                        kotlinx.coroutines.flow.j r6 = r4.f192725b
                        java.lang.Object r5 = r6.emit(r5, r0)
                        if (r5 != r1) goto L48
                        return r1
                    L48:
                        kotlin.G0 r5 = kotlin.G0.f406611a
                        return r5
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.n.b.c.a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                }
            }

            public c(InterfaceC43160i interfaceC43160i) {
                this.f192724b = interfaceC43160i;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43160i
            @Y61.l
            public final Object collect(@Y61.k InterfaceC43172j<? super Boolean> interfaceC43172j, @Y61.k Continuation continuation) {
                Object objCollect = this.f192724b.collect(new a(interfaceC43172j), continuation);
                return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(w0 w0Var, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f192720r = w0Var;
            this.f192721s = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new b(this.f192720r, this.f192721s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f192719q;
            if (i12 == 0) {
                C42729a0.b(obj);
                c cVar = new c(C22126m3.n(new a(this.f192720r)));
                C5694b c5694b = new C5694b(this.f192721s);
                this.f192719q = 1;
                if (cVar.collect(c5694b, this) == coroutine_suspended) {
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

    /* compiled from: MessageList.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.composables.MessageListKt$ScrollStateObserver$3$1", f = "MessageList.kt", i = {}, l = {162}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f192729q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ w0 f192730r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22204y1 f192731s;

        /* compiled from: MessageList.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/foundation/interaction/j;", "interaction", "Lkotlin/G0;", "emit", "(Landroidx/compose/foundation/interaction/j;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC22204y1 f192732b;

            public a(InterfaceC22204y1 interfaceC22204y1) {
                this.f192732b = interfaceC22204y1;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                if (((androidx.compose.foundation.interaction.j) obj) instanceof a.b) {
                    ((Y41.l) this.f192732b.getF42167b()).invoke(f0.e.f192952a);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(w0 w0Var, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
            super(2, continuation);
            this.f192730r = w0Var;
            this.f192731s = interfaceC22204y1;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new c(this.f192730r, this.f192731s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f192729q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43160i<androidx.compose.foundation.interaction.j> interfaceC43160iC = this.f192730r.f29719f.c();
                a aVar = new a(this.f192731s);
                this.f192729q = 1;
                if (interfaceC43160iC.collect(aVar, this) == coroutine_suspended) {
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

    /* compiled from: MessageList.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class d extends N implements Y41.p<A, Integer, G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ w0 f192733l;

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l<f0, G0> f192734m;

        /* renamed from: n, reason: collision with root package name */
        public final /* synthetic */ int f192735n;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public d(w0 w0Var, Y41.l<? super f0, G0> lVar, int i12) {
            super(2);
            this.f192733l = w0Var;
            this.f192734m = lVar;
            this.f192735n = i12;
        }

        @Override // Y41.p
        public final G0 invoke(A a12, Integer num) {
            num.intValue();
            int iA2 = C22066f2.a(this.f192735n | 1);
            n.b(this.f192733l, this.f192734m, a12, iA2);
            return G0.f406611a;
        }
    }

    @InterfaceC22132o
    @InterfaceC22181t
    public static final void a(@Y61.k List list, @Y61.k Y41.l lVar, @Y61.k Y41.l lVar2, @Y61.k InterfaceC43160i interfaceC43160i, @Y61.l androidx.compose.ui.v vVar, @Y61.l g0.b bVar, @Y61.l A a12, int i12) {
        B bE2 = a12.E(1706743400);
        w0 w0Var = (w0) com.avito.android.analytics.screens.compose.s.b(m.f192213l, bE2);
        u.a(w0Var, interfaceC43160i, bE2, 64);
        b(w0Var, lVar2, bE2, (i12 >> 3) & 112);
        bE2.C(352810680);
        bE2.C(1724787834);
        Object objT = bE2.t();
        A.f37866a.getClass();
        if (objT == A.a.f37868b) {
            objT = new o(lVar2);
            bE2.H(objT);
        }
        bE2.X(false);
        bE2.X(false);
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        float f12 = 12;
        V1 v1D = R1.d(f12, 72, f12, 16);
        androidx.compose.ui.v vVarA = androidx.compose.ui.input.nestedscroll.e.a(vVar, (o) objT, null);
        InterfaceC22215f.f39074a.getClass();
        C20650b.a(androidx.compose.ui.semantics.r.b(C22501m2.a(C20588k2.v(0.0f, 592, 1, C20588k2.x(vVarA, InterfaceC22215f.a.f39083i, 2)), "MessageList"), false, new f(list)), w0Var, v1D, true, null, null, null, false, null, new k(list, bVar, lVar), bE2, 3072, 496);
        C22039c2 c22039c2Z = bE2.Z();
        if (c22039c2Z != null) {
            c22039c2Z.f38184d = new l(list, lVar, lVar2, interfaceC43160i, vVar, bVar, i12);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x00bb  */
    @androidx.compose.runtime.InterfaceC22132o
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void b(@Y61.k androidx.compose.foundation.lazy.w0 r9, @Y61.k Y41.l<? super com.avito.android.messenger.conversation.mvi.messages.f0, kotlin.G0> r10, @Y61.l androidx.compose.runtime.A r11, int r12) {
        /*
            r0 = -1539651144(0xffffffffa43ac9b8, float:-4.0503183E-17)
            androidx.compose.runtime.B r11 = r11.E(r0)
            r0 = r12 & 14
            r1 = 4
            if (r0 != 0) goto L17
            boolean r0 = r11.B(r9)
            if (r0 == 0) goto L14
            r0 = r1
            goto L15
        L14:
            r0 = 2
        L15:
            r0 = r0 | r12
            goto L18
        L17:
            r0 = r12
        L18:
            r2 = r12 & 112(0x70, float:1.57E-43)
            if (r2 != 0) goto L28
            boolean r2 = r11.u(r10)
            if (r2 == 0) goto L25
            r2 = 32
            goto L27
        L25:
            r2 = 16
        L27:
            r0 = r0 | r2
        L28:
            r2 = r0 & 91
            r3 = 18
            if (r2 != r3) goto L3a
            boolean r2 = r11.c()
            if (r2 != 0) goto L35
            goto L3a
        L35:
            r11.f()
            goto Lcb
        L3a:
            androidx.compose.runtime.y1 r2 = androidx.compose.runtime.C22126m3.m(r10, r11)
            r3 = 1431297601(0x554fde41, float:1.4284593E13)
            r11.C(r3)
            r0 = r0 & 14
            r3 = 0
            r4 = 1
            if (r0 != r1) goto L4c
            r5 = r4
            goto L4d
        L4c:
            r5 = r3
        L4d:
            boolean r6 = r11.B(r2)
            r5 = r5 | r6
            java.lang.Object r6 = r11.t()
            r7 = 0
            androidx.compose.runtime.A$a r8 = androidx.compose.runtime.A.f37866a
            if (r5 != 0) goto L62
            r8.getClass()
            androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r5) goto L6a
        L62:
            com.avito.android.messenger.conversation.mvi.messages.composables.n$a r6 = new com.avito.android.messenger.conversation.mvi.messages.composables.n$a
            r6.<init>(r9, r2, r7)
            r11.H(r6)
        L6a:
            Y41.p r6 = (Y41.p) r6
            r11.X(r3)
            androidx.compose.runtime.C22187u0.d(r6, r11, r9)
            r5 = 1431307918(0x5550068e, float:1.4295411E13)
            r11.C(r5)
            if (r0 != r1) goto L7c
            r5 = r4
            goto L7d
        L7c:
            r5 = r3
        L7d:
            boolean r6 = r11.B(r2)
            r5 = r5 | r6
            java.lang.Object r6 = r11.t()
            if (r5 != 0) goto L8f
            r8.getClass()
            androidx.compose.runtime.A$a$a r5 = androidx.compose.runtime.A.a.f37868b
            if (r6 != r5) goto L97
        L8f:
            com.avito.android.messenger.conversation.mvi.messages.composables.n$b r6 = new com.avito.android.messenger.conversation.mvi.messages.composables.n$b
            r6.<init>(r9, r2, r7)
            r11.H(r6)
        L97:
            Y41.p r6 = (Y41.p) r6
            r11.X(r3)
            androidx.compose.runtime.C22187u0.d(r6, r11, r9)
            r5 = 1431322424(0x55503f38, float:1.4310621E13)
            r11.C(r5)
            if (r0 != r1) goto La8
            goto La9
        La8:
            r4 = r3
        La9:
            boolean r0 = r11.B(r2)
            r0 = r0 | r4
            java.lang.Object r1 = r11.t()
            if (r0 != 0) goto Lbb
            r8.getClass()
            androidx.compose.runtime.A$a$a r0 = androidx.compose.runtime.A.a.f37868b
            if (r1 != r0) goto Lc3
        Lbb:
            com.avito.android.messenger.conversation.mvi.messages.composables.n$c r1 = new com.avito.android.messenger.conversation.mvi.messages.composables.n$c
            r1.<init>(r9, r2, r7)
            r11.H(r1)
        Lc3:
            Y41.p r1 = (Y41.p) r1
            r11.X(r3)
            androidx.compose.runtime.C22187u0.d(r1, r11, r9)
        Lcb:
            androidx.compose.runtime.c2 r11 = r11.Z()
            if (r11 == 0) goto Ld8
            com.avito.android.messenger.conversation.mvi.messages.composables.n$d r0 = new com.avito.android.messenger.conversation.mvi.messages.composables.n$d
            r0.<init>(r9, r10, r12)
            r11.f38184d = r0
        Ld8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.conversation.mvi.messages.composables.n.b(androidx.compose.foundation.lazy.w0, Y41.l, androidx.compose.runtime.A, int):void");
    }
}
