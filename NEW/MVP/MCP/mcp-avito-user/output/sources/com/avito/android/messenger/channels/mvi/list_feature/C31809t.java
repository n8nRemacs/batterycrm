package com.avito.android.messenger.channels.mvi.list_feature;

import HY.g;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$$inlined$flowWithAccessToMutableStateFrom$5", f = "ChannelsListActor.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.t, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31809t extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f188204q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f188205r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f188206s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g.b f188207t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C31772a f188208u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ g.b f188209v;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.t$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<HY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(HY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31809t(g.b bVar, g.b bVar2, com.avito.android.arch.mvi.utils.o oVar, C31772a c31772a, Continuation continuation) {
        super(2, continuation);
        this.f188206s = oVar;
        this.f188207t = bVar;
        this.f188208u = c31772a;
        this.f188209v = bVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31772a c31772a = this.f188208u;
        C31809t c31809t = new C31809t(this.f188207t, this.f188209v, this.f188206s, c31772a, continuation);
        c31809t.f188205r = obj;
        return c31809t;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31809t) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:23:0x0076  */
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
            int r1 = r10.f188204q
            r2 = 1
            if (r1 == 0) goto L18
            if (r1 != r2) goto L10
            kotlin.C42729a0.b(r11)
            goto Ld1
        L10:
            java.lang.IllegalStateException r11 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r11.<init>(r0)
            throw r11
        L18:
            kotlin.C42729a0.b(r11)
            java.lang.Object r11 = r10.f188205r
            r5 = r11
            kotlinx.coroutines.flow.j r5 = (kotlinx.coroutines.flow.InterfaceC43172j) r5
            com.avito.android.arch.mvi.utils.o r11 = r10.f188206s
            com.avito.android.arch.mvi.utils.o$a r11 = r11.f92114c
            com.avito.android.messenger.channels.mvi.list_feature.t$a r3 = new com.avito.android.messenger.channels.mvi.list_feature.t$a
            java.lang.String r8 = "emit(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;"
            r9 = 0
            r4 = 2
            java.lang.Class<kotlinx.coroutines.flow.j> r6 = kotlinx.coroutines.flow.InterfaceC43172j.class
            java.lang.String r7 = "emit"
            r3.<init>(r4, r5, r6, r7, r8, r9)
            java.lang.Object r1 = r11.getValue()
            HY.m r1 = (HY.m) r1
            HY.m$c r3 = r1.f7251b
            HY.m$c$b r4 = HY.m.c.b.f7265a
            boolean r3 = kotlin.jvm.internal.L.f(r3, r4)
            r4 = 0
            HY.g$b r5 = r10.f188209v
            if (r3 == 0) goto L76
            HY.m$b r1 = r1.f7255f
            if (r1 == 0) goto L76
            HY.m$d r1 = r1.f7263b
            boolean r1 = r1.getF7270b()
            if (r1 != 0) goto L76
            r1 = r5
            HY.g$b$a r1 = (HY.g.b.a) r1
            java.lang.String r1 = r1.f7199a
            java.lang.Object r3 = r11.getValue()
            HY.m r3 = (HY.m) r3
            ru.avito.messenger.MessengerUserHashInfo r3 = r3.f7250a
            if (r3 == 0) goto L62
            java.lang.String r3 = r3.f430682d
            goto L63
        L62:
            r3 = r4
        L63:
            boolean r1 = kotlin.jvm.internal.L.f(r1, r3)
            if (r1 == 0) goto L76
            com.avito.android.messenger.channels.analytics.UseCaseScenario r1 = com.avito.android.messenger.channels.analytics.UseCaseScenario.f187087l
            r10.f188204q = r2
            com.avito.android.messenger.channels.mvi.list_feature.a r2 = r10.f188208u
            java.lang.Object r11 = r2.h(r11, r1, r10)
            if (r11 != r0) goto Ld1
            return r0
        L76:
            com.avito.android.util.X2 r0 = com.avito.android.util.X2.f318778a
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "PrivateAction.BlacklistUpdated: userInfo = ("
            r1.<init>(r2)
            java.lang.Object r2 = r11.getValue()
            HY.m r2 = (HY.m) r2
            ru.avito.messenger.MessengerUserHashInfo r2 = r2.f7250a
            if (r2 == 0) goto L91
            r3 = 0
            kotlin.Q[] r3 = new kotlin.Q[r3]
            java.lang.String r2 = com.avito.android.messenger.util.i.b(r2, r3)
            goto L92
        L91:
            r2 = r4
        L92:
            r1.append(r2)
            java.lang.String r2 = "), blackListEventOwnerId = "
            r1.append(r2)
            HY.g$b$a r5 = (HY.g.b.a) r5
            java.lang.String r2 = r5.f7199a
            r1.append(r2)
            java.lang.String r2 = ", initialLoadingState = "
            r1.append(r2)
            java.lang.Object r2 = r11.getValue()
            HY.m r2 = (HY.m) r2
            HY.m$c r2 = r2.f7251b
            r1.append(r2)
            java.lang.String r2 = ", mainListBottomTimestamp = "
            r1.append(r2)
            java.lang.Object r11 = r11.getValue()
            HY.m r11 = (HY.m) r11
            HY.m$b r11 = r11.f7255f
            r1.append(r11)
            java.lang.String r11 = " => do nothing"
            r1.append(r11)
            java.lang.String r11 = r1.toString()
            java.lang.String r1 = "ChannelsListActor"
            r0.j(r1, r11, r4)
            kotlin.G0 r11 = kotlin.G0.f406611a
        Ld1:
            kotlin.G0 r11 = kotlin.G0.f406611a
            return r11
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.C31809t.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
