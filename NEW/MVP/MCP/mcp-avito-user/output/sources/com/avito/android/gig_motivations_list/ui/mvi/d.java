package com.avito.android.gig_motivations_list.ui.mvi;

import Y41.p;
import androidx.compose.runtime.internal.P;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import wH.C49507c;
import zH.InterfaceC50463b;

/* compiled from: MotivationsListBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/gig_motivations_list/ui/mvi/d;", "Lcom/avito/android/arch/mvi/b;", "LzH/b;", "_avito_gig_motivations-list_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class d implements com.avito.android.arch.mvi.b<InterfaceC50463b> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final wH.h f160365a;

    /* compiled from: MotivationsListBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LzH/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.gig_motivations_list.ui.mvi.MotivationsListBootstrap$produce$1", f = "MotivationsListBootstrap.kt", i = {0, 1}, l = {17, 18, 18}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements p<InterfaceC43172j<? super InterfaceC50463b>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f160366q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f160367r;

        /* compiled from: MotivationsListBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LwH/c;", "it", "Lkotlin/G0;", "<anonymous>", "(LwH/c;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.gig_motivations_list.ui.mvi.MotivationsListBootstrap$produce$1$1", f = "MotivationsListBootstrap.kt", i = {}, l = {20}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.gig_motivations_list.ui.mvi.d$a$a, reason: collision with other inner class name */
        public static final class C4685a extends SuspendLambda implements p<C49507c, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f160369q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f160370r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC50463b> f160371s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C4685a(InterfaceC43172j<? super InterfaceC50463b> interfaceC43172j, Continuation<? super C4685a> continuation) {
                super(2, continuation);
                this.f160371s = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                C4685a c4685a = new C4685a(this.f160371s, continuation);
                c4685a.f160370r = obj;
                return c4685a;
            }

            @Override // Y41.p
            public final Object invoke(C49507c c49507c, Continuation<? super G0> continuation) {
                return ((C4685a) create(c49507c, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f160369q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC50463b.a aVar = new InterfaceC50463b.a((C49507c) this.f160370r);
                    this.f160369q = 1;
                    if (this.f160371s.emit(aVar, this) == coroutine_suspended) {
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

        /* compiled from: MotivationsListBootstrap.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.gig_motivations_list.ui.mvi.MotivationsListBootstrap$produce$1$2", f = "MotivationsListBootstrap.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<String, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f160372q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f160373r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<InterfaceC50463b> f160374s;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public b(InterfaceC43172j<? super InterfaceC50463b> interfaceC43172j, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f160374s = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                b bVar = new b(this.f160374s, continuation);
                bVar.f160373r = obj;
                return bVar;
            }

            @Override // Y41.p
            public final Object invoke(String str, Continuation<? super G0> continuation) {
                return ((b) create(str, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f160372q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InterfaceC50463b.C12950b c12950b = new InterfaceC50463b.C12950b((String) this.f160373r);
                    this.f160372q = 1;
                    if (this.f160374s.emit(c12950b, this) == coroutine_suspended) {
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
            a aVar = d.this.new a(continuation);
            aVar.f160367r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC50463b> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x006e A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r11) {
            /*
                r10 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r10.f160366q
                r2 = 3
                r3 = 2
                r4 = 1
                if (r1 == 0) goto L2d
                if (r1 == r4) goto L25
                if (r1 == r3) goto L1d
                if (r1 != r2) goto L15
                kotlin.C42729a0.b(r11)
                goto L6f
            L15:
                java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r11.<init>(r0)
                throw r11
            L1d:
                java.lang.Object r1 = r10.f160367r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L51
            L25:
                java.lang.Object r1 = r10.f160367r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r11)
                goto L42
            L2d:
                kotlin.C42729a0.b(r11)
                java.lang.Object r11 = r10.f160367r
                kotlinx.coroutines.flow.j r11 = (kotlinx.coroutines.flow.InterfaceC43172j) r11
                zH.b$c r1 = zH.InterfaceC50463b.c.f443996a
                r10.f160367r = r11
                r10.f160366q = r4
                java.lang.Object r1 = r11.emit(r1, r10)
                if (r1 != r0) goto L41
                return r0
            L41:
                r1 = r11
            L42:
                com.avito.android.gig_motivations_list.ui.mvi.d r11 = com.avito.android.gig_motivations_list.ui.mvi.d.this
                wH.h r11 = r11.f160365a
                r10.f160367r = r1
                r10.f160366q = r3
                java.lang.Object r11 = r11.a(r10)
                if (r11 != r0) goto L51
                return r0
            L51:
                r3 = r11
                com.avito.android.remote.model.TypedResult r3 = (com.avito.android.remote.model.TypedResult) r3
                com.avito.android.gig_motivations_list.ui.mvi.d$a$a r4 = new com.avito.android.gig_motivations_list.ui.mvi.d$a$a
                r11 = 0
                r4.<init>(r1, r11)
                com.avito.android.gig_motivations_list.ui.mvi.d$a$b r5 = new com.avito.android.gig_motivations_list.ui.mvi.d$a$b
                r5.<init>(r1, r11)
                r10.f160367r = r11
                r10.f160366q = r2
                r7 = 0
                r9 = 60
                r6 = 0
                r8 = r10
                java.lang.Object r11 = com.avito.android.error.z.s(r3, r4, r5, r6, r7, r8, r9)
                if (r11 != r0) goto L6f
                return r0
            L6f:
                kotlin.G0 r11 = kotlin.G0.f406611a
                return r11
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.gig_motivations_list.ui.mvi.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public d(@Y61.k wH.h hVar) {
        this.f160365a = hVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<InterfaceC50463b> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
