package com.avito.android.sbc.create.mvi;

import com.avito.android.sbc.create.mvi.C34469a;
import ep0.C40143a;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendFunction;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: PrivateStateHolder.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u0005\"\b\b\u0000\u0010\u0000*\u00028\u0001\"\u0004\b\u0001\u0010\u0001\"\u0004\b\u0002\u0010\u0002\"\u0004\b\u0003\u0010\u0003*\b\u0012\u0004\u0012\u00028\u00030\u0004H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"T", "ReadWriteAccessContextT", "ValueT", "R", "Lkotlinx/coroutines/flow/j;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V", "com/avito/android/arch/mvi/utils/q"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.sbc.create.mvi.CreateDiscountDispatchActor$handleAutoDispatchForecastReceived$$inlined$flowWithAccessToMutableStateFrom$1", f = "CreateDiscountDispatchActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
public final class M extends SuspendLambda implements Y41.p<InterfaceC43172j<? super Uo0.f>, Continuation<? super kotlin.G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f259325q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.arch.mvi.utils.o f259326r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Object f259327s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C34469a.b f259328t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ C34469a f259329u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C40143a f259330v;

    /* compiled from: PrivateStateHolder.kt */
    @kotlin.jvm.internal.s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a extends kotlin.jvm.internal.H implements Y41.p<Uo0.f, Continuation<? super kotlin.G0>, Object>, SuspendFunction {
        @Override // Y41.p
        public final Object invoke(Uo0.f fVar, Continuation<? super kotlin.G0> continuation) {
            return ((InterfaceC43172j) this.receiver).emit(fVar, continuation);
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public M(com.avito.android.arch.mvi.utils.o oVar, Object obj, Continuation continuation, C34469a.b bVar, C34469a c34469a, C40143a c40143a) {
        super(2, continuation);
        this.f259326r = oVar;
        this.f259327s = obj;
        this.f259328t = bVar;
        this.f259329u = c34469a;
        this.f259330v = c40143a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<kotlin.G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        M m12 = new M(this.f259326r, this.f259327s, continuation, this.f259328t, this.f259329u, this.f259330v);
        m12.f259325q = obj;
        return m12;
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Uo0.f> interfaceC43172j, Continuation<? super kotlin.G0> continuation) {
        return ((M) create(interfaceC43172j, continuation)).invokeSuspend(kotlin.G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:41:0x00fc  */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r29) throws android.content.res.Resources.NotFoundException {
        /*
            Method dump skipped, instructions count: 391
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.sbc.create.mvi.M.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
