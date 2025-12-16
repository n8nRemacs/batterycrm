package com.avito.android.messenger.conversation.mvi.messages;

import androidx.compose.runtime.U1;
import com.avito.android.messenger.conversation.mvi.messages.g0;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;

/* compiled from: MessageListView.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/compose/runtime/U1;", "Lcom/avito/android/messenger/conversation/mvi/messages/g0$c;", "Lkotlin/G0;", "<anonymous>", "(Landroidx/compose/runtime/U1;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.MessageListViewImpl$collectListAsState$1", f = "MessageListView.kt", i = {}, l = {362}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class r0 extends SuspendLambda implements Y41.p<U1<g0.c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f193136q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f193137r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ q0 f193138s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ n2<g0.c> f193139t;

    /* compiled from: MessageListView.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.conversation.mvi.messages.MessageListViewImpl$collectListAsState$1$1", f = "MessageListView.kt", i = {}, l = {363}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f193140q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ n2<g0.c> f193141r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ U1<g0.c> f193142s;

        /* compiled from: MessageListView.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/messenger/conversation/mvi/messages/g0$c;", "it", "Lkotlin/G0;", "emit", "(Lcom/avito/android/messenger/conversation/mvi/messages/g0$c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.messenger.conversation.mvi.messages.r0$a$a, reason: collision with other inner class name */
        public static final class C5709a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ U1<g0.c> f193143b;

            public C5709a(U1<g0.c> u12) {
                this.f193143b = u12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                g0.c cVar = (g0.c) obj;
                U1<g0.c> u12 = this.f193143b;
                g0.c f42167b = u12.getF42167b();
                if (f42167b.f192970b.f192956a.size() != cVar.f192970b.f192956a.size() || !kotlin.jvm.internal.L.f(f42167b.getPerfTrackerParams(), cVar.getPerfTrackerParams()) || !kotlin.jvm.internal.L.f(f42167b.f192970b.f192956a, cVar.f192970b.f192956a)) {
                    u12.setValue(cVar);
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(n2<g0.c> n2Var, U1<g0.c> u12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f193141r = n2Var;
            this.f193142s = u12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return new a(this.f193141r, this.f193142s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f193140q;
            if (i12 == 0) {
                C42729a0.b(obj);
                C5709a c5709a = new C5709a(this.f193142s);
                this.f193140q = 1;
                if (this.f193141r.collect(c5709a, this) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r0(q0 q0Var, n2<g0.c> n2Var, Continuation<? super r0> continuation) {
        super(2, continuation);
        this.f193138s = q0Var;
        this.f193139t = n2Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        r0 r0Var = new r0(this.f193138s, this.f193139t, continuation);
        r0Var.f193137r = obj;
        return r0Var;
    }

    @Override // Y41.p
    public final Object invoke(U1<g0.c> u12, Continuation<? super G0> continuation) {
        return ((r0) create(u12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f193136q;
        if (i12 == 0) {
            C42729a0.b(obj);
            U1 u12 = (U1) this.f193137r;
            kotlinx.coroutines.scheduling.c cVarC = this.f193138s.f193110h.c();
            a aVar = new a(this.f193139t, u12, null);
            this.f193136q = 1;
            if (C43259k.g(cVarC, aVar, this) == coroutine_suspended) {
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
