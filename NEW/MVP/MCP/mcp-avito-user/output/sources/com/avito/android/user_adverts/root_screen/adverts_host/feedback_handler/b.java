package com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler;

import Y41.p;
import Y61.k;
import Y61.l;
import androidx.view.C22977J;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.j;
import i31.InterfaceC41220a;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.Y1;

/* compiled from: FeedbackHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0002\u0002\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/b;", "", "a", "b", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ int f312652e = 0;

    /* renamed from: a, reason: collision with root package name */
    @k
    public final SK0.b f312653a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C22977J f312654b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final Object f312655c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final Object f312656d;

    /* compiled from: FeedbackHandler.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/b$a;", "", "<init>", "()V", "", "AWAIT_COMPANY_START_SECONDS", "I", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: FeedbackHandler.kt */
    @i31.b
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/b$b;", "", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b$b, reason: collision with other inner class name */
    public interface InterfaceC9564b {
        @k
        b a(@k C22977J c22977j);
    }

    /* compiled from: FeedbackHandler.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.FeedbackHandler", f = "FeedbackHandler.kt", i = {0, 0}, l = {38}, m = "handle", n = {"this", "event"}, s = {"L$0", "L$1"})
    public static final class c extends ContinuationImpl {

        /* renamed from: q, reason: collision with root package name */
        public b f312657q;

        /* renamed from: r, reason: collision with root package name */
        public com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.a f312658r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f312659s;

        /* renamed from: u, reason: collision with root package name */
        public int f312661u;

        public c(Continuation<? super c> continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            this.f312659s = obj;
            this.f312661u |= BeduinInputModel.MIN_TEXT_VERSION;
            return b.this.a(null, this);
        }
    }

    /* compiled from: FeedbackHandler.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.FeedbackHandler$handle$feedbackResult$1", f = "FeedbackHandler.kt", i = {}, l = {39}, m = "invokeSuspend", n = {}, s = {})
    public static final class d extends SuspendLambda implements p<T, Continuation<? super j>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312662q;

        /* compiled from: FeedbackHandler.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j;", "result", "", "<anonymous>", "(Lcom/avito/android/user_adverts/root_screen/adverts_host/feedback_handler/j;)Z"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.FeedbackHandler$handle$feedbackResult$1$1", f = "FeedbackHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<j, Continuation<? super Boolean>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f312664q;

            public a() {
                throw null;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                a aVar = new a(2, continuation);
                aVar.f312664q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(j jVar, Continuation<? super Boolean> continuation) {
                return ((a) create(jVar, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                j jVar = (j) this.f312664q;
                return Boxing.boxBoolean((jVar instanceof j.b) || (jVar instanceof j.a));
            }
        }

        public d(Continuation<? super d> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return b.this.new d(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super j> continuation) {
            return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Type inference failed for: r6v3, types: [java.lang.Object, kotlin.C] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312662q;
            if (i12 == 0) {
                C42729a0.b(obj);
                int i13 = b.f312652e;
                Y1 y12 = (Y1) b.this.f312655c.getValue();
                a aVar = new a(2, null);
                this.f312662q = 1;
                obj = C43175k.z(y12, aVar, this);
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

    static {
        new a(null);
    }

    @i31.c
    public b(@k SK0.b bVar, @InterfaceC41220a @k C22977J c22977j) {
        this.f312653a = bVar;
        this.f312654b = c22977j;
        e eVar = e.f312667l;
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.f406616d;
        this.f312655c = C42727D.b(lazyThreadSafetyMode, eVar);
        this.f312656d = C42727D.b(lazyThreadSafetyMode, new com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.c(this));
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
    /* JADX WARN: Type inference failed for: r13v2, types: [java.lang.Object, kotlin.C] */
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object a(@Y61.k com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.a r12, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r13) {
        /*
            r11 = this;
            boolean r0 = r13 instanceof com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b.c
            if (r0 == 0) goto L13
            r0 = r13
            com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b$c r0 = (com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b.c) r0
            int r1 = r0.f312661u
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f312661u = r1
            goto L18
        L13:
            com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b$c r0 = new com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b$c
            r0.<init>(r13)
        L18:
            java.lang.Object r13 = r0.f312659s
            java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
            int r2 = r0.f312661u
            r3 = 0
            r4 = 1
            if (r2 == 0) goto L36
            if (r2 != r4) goto L2e
            com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.a r12 = r0.f312658r
            com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b r0 = r0.f312657q
            kotlin.C42729a0.b(r13)
            goto L6d
        L2e:
            java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
            java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
            r12.<init>(r13)
            throw r12
        L36:
            kotlin.C42729a0.b(r13)
            SK0.c r6 = r12.f312651a
            java.lang.Object r13 = r11.f312656d
            java.lang.Object r13 = r13.getValue()
            r9 = r13
            com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.d r9 = (com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.d) r9
            r7 = 0
            r8 = 0
            SK0.b r5 = r11.f312653a
            r10 = 6
            SK0.b.a.a(r5, r6, r7, r8, r9, r10)
            kotlin.time.e$a r13 = kotlin.time.e.f410651c
            r13 = 30
            kotlin.time.DurationUnit r2 = kotlin.time.DurationUnit.f410634f
            long r5 = kotlin.time.g.g(r13, r2)
            com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b$d r13 = new com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b$d
            r13.<init>(r3)
            r0.f312657q = r11
            r0.f312658r = r12
            r0.f312661u = r4
            long r4 = kotlinx.coroutines.C43131e0.e(r5)
            java.lang.Object r13 = kotlinx.coroutines.D1.c(r4, r13, r0)
            if (r13 != r1) goto L6c
            return r1
        L6c:
            r0 = r11
        L6d:
            com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.j r13 = (com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.j) r13
            if (r13 != 0) goto L91
            androidx.lifecycle.J r13 = r0.f312654b
            boolean r13 = kotlinx.coroutines.U.e(r13)
            if (r13 == 0) goto L91
            SK0.c r12 = r12.f312651a
            java.lang.String r12 = r12.getF315945a()
            androidx.lifecycle.J r13 = r0.f312654b
            boolean r1 = kotlinx.coroutines.U.e(r13)
            if (r1 != 0) goto L88
            goto L91
        L88:
            com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.f r1 = new com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.f
            r1.<init>(r0, r12, r3)
            r12 = 3
            kotlinx.coroutines.C43259k.d(r13, r3, r3, r1, r12)
        L91:
            kotlin.G0 r12 = kotlin.G0.f406611a
            return r12
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.b.a(com.avito.android.user_adverts.root_screen.adverts_host.feedback_handler.a, kotlin.coroutines.Continuation):java.lang.Object");
    }
}
