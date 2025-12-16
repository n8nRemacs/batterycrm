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
@DebugMetadata(c = "com.avito.android.messenger.channels.mvi.list_feature.ChannelsListActor$process$$inlined$flowWithAccessToMutableStateFrom$19", f = "ChannelsListActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.messenger.channels.mvi.list_feature.p, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
public final class C31802p extends SuspendLambda implements Y41.p<InterfaceC43172j<? super HY.d>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f188164q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f188165r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g.b.h f188166s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ g.b.h f188167t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C31772a f188168u;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.messenger.channels.mvi.list_feature.p$a */
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<HY.d, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(HY.d dVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(dVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C31802p(com.avito.android.arch.mvi.utils.o oVar, g.b.h hVar, Continuation continuation, g.b.h hVar2, C31772a c31772a) {
        super(2, continuation);
        this.f188165r = oVar;
        this.f188166s = hVar;
        this.f188167t = hVar2;
        this.f188168u = c31772a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C31802p c31802p = new C31802p(this.f188165r, this.f188166s, continuation, this.f188167t, this.f188168u);
        c31802p.f188164q = obj;
        return c31802p;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super HY.d> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((C31802p) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0171 A[PHI: r3 r4 r5
  0x0171: PHI (r3v26 HY.m$c) = (r3v13 HY.m$c), (r3v30 HY.m$c) binds: [B:71:0x0215, B:50:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r4v30 HY.m$c) = (r4v22 HY.m$c), (r4v38 HY.m$c) binds: [B:71:0x0215, B:50:0x016f] A[DONT_GENERATE, DONT_INLINE]
  0x0171: PHI (r5v17 HY.m$c) = (r5v10 HY.m$c), (r5v21 HY.m$c) binds: [B:71:0x0215, B:50:0x016f] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r18) {
        /*
            Method dump skipped, instructions count: 611
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.messenger.channels.mvi.list_feature.C31802p.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
