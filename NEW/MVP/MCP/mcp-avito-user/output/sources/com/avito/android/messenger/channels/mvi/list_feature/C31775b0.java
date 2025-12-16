package com.avito.android.messenger.channels.mvi.list_feature;

import HY.g;
import com.avito.android.messenger.channels.mvi.list_feature.W;
import kotlin.C42729a0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ChannelsListActorSubscriptions.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022$\u0010\u0004\u001a \u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0001\u0012\u0004\u0012\u00020\u00010\u0000\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/messenger/channels/mvi/list_feature/W$b;", "<name for destructuring parameter 0>", "LHY/g;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$doSubscribeToTypingEvents$4", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.b0, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C31775b0 extends SuspendLambda implements Y41.p<kotlin.Q<? extends kotlin.Q<? extends String, ? extends String>, ? extends InterfaceC43160i<? extends W.b>>, Continuation<? super InterfaceC43160i<? extends HY.g>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f187983q;

    /* compiled from: ChannelsListActorSubscriptions.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LHY/g;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$doSubscribeToTypingEvents$4$1$1", f = "ChannelsListActorSubscriptions.kt", i = {0, 1}, l = {405, 411, 412}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.b0$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.g>, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f187984q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f187985r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ W.b f187986s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(W.b bVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f187986s = bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f187986s, continuation);
            aVar.f187985r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super HY.g> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:21:0x0074 A[RETURN] */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
            /*
                r8 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r8.f187984q
                r2 = 3
                r3 = 2
                r4 = 1
                com.avito.android.messenger.channels.mvi.list_feature.W$b r5 = r8.f187986s
                if (r1 == 0) goto L2f
                if (r1 == r4) goto L27
                if (r1 == r3) goto L1f
                if (r1 != r2) goto L17
                kotlin.C42729a0.b(r9)
                goto L75
            L17:
                java.lang.IllegalStateException r9 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r9.<init>(r0)
                throw r9
            L1f:
                java.lang.Object r1 = r8.f187985r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L5c
            L27:
                java.lang.Object r1 = r8.f187985r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r9)
                goto L4f
            L2f:
                kotlin.C42729a0.b(r9)
                java.lang.Object r9 = r8.f187985r
                kotlinx.coroutines.flow.j r9 = (kotlinx.coroutines.flow.InterfaceC43172j) r9
                HY.g$b$c r1 = new HY.g$b$c
                java.lang.String r6 = r5.getF187885a()
                java.lang.String r7 = r5.getF187886b()
                r1.<init>(r6, r7)
                r8.f187985r = r9
                r8.f187984q = r4
                java.lang.Object r1 = r9.emit(r1, r8)
                if (r1 != r0) goto L4e
                return r0
            L4e:
                r1 = r9
            L4f:
                r8.f187985r = r1
                r8.f187984q = r3
                r3 = 3000(0xbb8, double:1.482E-320)
                java.lang.Object r9 = kotlinx.coroutines.C43131e0.b(r3, r8)
                if (r9 != r0) goto L5c
                return r0
            L5c:
                HY.g$b$d r9 = new HY.g$b$d
                java.lang.String r3 = r5.getF187885a()
                java.lang.String r4 = r5.getF187886b()
                r9.<init>(r3, r4)
                r3 = 0
                r8.f187985r = r3
                r8.f187984q = r2
                java.lang.Object r9 = r1.emit(r9, r8)
                if (r9 != r0) goto L75
                return r0
            L75:
                kotlin.G0 r9 = kotlin.G0.f406611a
                return r9
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.C31775b0.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActorSubscriptions$doSubscribeToTypingEvents$4$invokeSuspend$$inlined$flatMapLatest$1", f = "ChannelsListActorSubscriptions.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.b0$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super HY.g>, W.b, Continuation<? super kotlin.G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f187987q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f187988r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f187989s;

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super HY.g> interfaceC43172j, W.b bVar, Continuation<? super kotlin.G0> continuation) {
            b bVar2 = new b(3, continuation);
            bVar2.f187988r = interfaceC43172j;
            bVar2.f187989s = bVar;
            return bVar2.invokeSuspend(kotlin.G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43160i c43210w;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f187987q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f187988r;
                W.b bVar = (W.b) this.f187989s;
                if (bVar instanceof W.b.a) {
                    c43210w = C43175k.G(new a(bVar, null));
                } else {
                    if (!(bVar instanceof W.b.C5523b)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    W.b.C5523b c5523b = (W.b.C5523b) bVar;
                    c43210w = new C43210w(new g.b.d(c5523b.f187885a, c5523b.f187886b));
                }
                this.f187987q = 1;
                if (C43175k.u(this, c43210w, interfaceC43172j) == coroutine_suspended) {
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

    public C31775b0() {
        throw null;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31775b0 c31775b0 = new C31775b0(2, continuation);
        c31775b0.f187983q = obj;
        return c31775b0;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends kotlin.Q<? extends String, ? extends String>, ? extends InterfaceC43160i<? extends W.b>> q12, Continuation<? super InterfaceC43160i<? extends HY.g>> continuation) {
        return ((C31775b0) create(q12, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        return C43175k.Y((InterfaceC43160i) ((kotlin.Q) this.f187983q).f406620c, new b(3, null));
    }
}
