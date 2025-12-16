package com.avito.avcalls.android.call;

import com.avito.avcalls.android.call.AbstractC36187o;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.Z1;
import xQ0.f;

/* compiled from: CallSession.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.avcalls.android.call.CallSession$3", f = "CallSession.kt", i = {}, l = {116}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.avcalls.android.call.n, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
final class C36186n extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f331575q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ AbstractC36187o f331576r;

    /* compiled from: CallSession.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LxQ0/b;", "it", "Lkotlin/G0;", "emit", "(LxQ0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    /* renamed from: com.avito.avcalls.android.call.n$a */
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ AbstractC36187o f331577b;

        public a(AbstractC36187o abstractC36187o) {
            this.f331577b = abstractC36187o;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            xQ0.b bVar = (xQ0.b) obj;
            xQ0.f fVar = bVar.f442471d;
            if ((fVar instanceof f.C12872f) || (fVar instanceof f.e)) {
                return G0.f406611a;
            }
            AbstractC36187o.b bVar2 = AbstractC36187o.b.f331591b;
            AbstractC36187o abstractC36187o = this.f331577b;
            AbstractC36187o.a(abstractC36187o, bVar2);
            if (bVar.f442474g) {
                AbstractC36187o.a(abstractC36187o, AbstractC36187o.b.f331592c);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C36186n(AbstractC36187o abstractC36187o, Continuation<? super C36186n> continuation) {
        super(2, continuation);
        this.f331576r = abstractC36187o;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new C36186n(this.f331576r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((C36186n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f331575q;
        if (i12 == 0) {
            C42729a0.b(obj);
            AbstractC36187o abstractC36187o = this.f331576r;
            Z1<xQ0.b> z12 = abstractC36187o.f331590m;
            a aVar = new a(abstractC36187o);
            this.f331575q = 1;
            if (z12.collect(aVar, this) == coroutine_suspended) {
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
