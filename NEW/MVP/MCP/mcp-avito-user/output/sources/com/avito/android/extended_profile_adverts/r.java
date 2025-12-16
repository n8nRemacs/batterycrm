package com.avito.android.extended_profile_adverts;

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
import pA.InterfaceC46926a;

/* compiled from: ProfileAdvertsView.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_adverts.ProfileAdvertsView$3", f = "ProfileAdvertsView.kt", i = {}, l = {60}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class r extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f150960q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ s f150961r;

    /* compiled from: ProfileAdvertsView.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LpA/a;", "it", "Lkotlin/G0;", "emit", "(LpA/a;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ s f150962b;

        public a(s sVar) {
            this.f150962b = sVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            InterfaceC46926a interfaceC46926a = (InterfaceC46926a) obj;
            boolean z12 = interfaceC46926a instanceof InterfaceC46926a.e;
            s sVar = this.f150962b;
            if (z12) {
                sVar.f150966e.Ld(((InterfaceC46926a.e) interfaceC46926a).f428231a, null);
                sVar.f150964c.accept(interfaceC46926a);
            } else {
                if (interfaceC46926a instanceof InterfaceC46926a.b ? true : interfaceC46926a instanceof InterfaceC46926a.C12255a ? true : interfaceC46926a instanceof InterfaceC46926a.d ? true : interfaceC46926a instanceof InterfaceC46926a.c) {
                    sVar.f150964c.accept(interfaceC46926a);
                } else {
                    boolean z13 = interfaceC46926a instanceof InterfaceC46926a.f;
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public r(s sVar, Continuation<? super r> continuation) {
        super(2, continuation);
        this.f150961r = sVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new r(this.f150961r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((r) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f150960q;
        if (i12 == 0) {
            C42729a0.b(obj);
            s sVar = this.f150961r;
            sVar.f150964c.accept(InterfaceC46926a.f.f428232a);
            a aVar = new a(sVar);
            this.f150960q = 1;
            if (sVar.f150965d.collect(aVar, this) == coroutine_suspended) {
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
