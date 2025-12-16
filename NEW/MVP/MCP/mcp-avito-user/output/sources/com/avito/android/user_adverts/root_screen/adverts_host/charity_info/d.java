package com.avito.android.user_adverts.root_screen.adverts_host.charity_info;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.user_adverts.root_screen.adverts_host.charity_info.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.Z1;
import xI0.InterfaceC49844a;
import xI0.InterfaceC49845b;

/* compiled from: CharityViewModel.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.charity_info.CharityViewModelImpl$processShow$1", f = "CharityViewModel.kt", i = {}, l = {56}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f312543q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f312544r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC49844a.b f312545s;

    /* compiled from: CharityViewModel.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.charity_info.CharityViewModelImpl$processShow$1$1", f = "CharityViewModel.kt", i = {}, l = {57}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f312546q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ b f312547r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InterfaceC49844a.b f312548s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(b bVar, InterfaceC49844a.b bVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f312547r = bVar;
            this.f312548s = bVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f312547r, this.f312548s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f312546q;
            b bVar = this.f312547r;
            if (i12 == 0) {
                C42729a0.b(obj);
                String str = this.f312548s.f442330a;
                this.f312546q = 1;
                obj = (!bVar.f312533K.b() || str == null) ? null : C43259k.g(bVar.f312532J.a(), new c(bVar, str, null), this);
                if (obj == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            b.a aVar = (b.a) obj;
            if (aVar != null) {
                Z1<InterfaceC49845b> z12 = bVar.f312535M;
                while (!z12.N3(z12.getValue(), new InterfaceC49845b.C12858b(aVar.f312538b, aVar.f312537a))) {
                }
            } else {
                Z1<InterfaceC49845b> z13 = bVar.f312535M;
                while (!z13.N3(z13.getValue(), InterfaceC49845b.a.f442331a)) {
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, InterfaceC49844a.b bVar2, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f312544r = bVar;
        this.f312545s = bVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new d(this.f312544r, this.f312545s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f312543q;
        if (i12 == 0) {
            C42729a0.b(obj);
            b bVar = this.f312544r;
            kotlinx.coroutines.scheduling.c cVarC = bVar.f312532J.c();
            a aVar = new a(bVar, this.f312545s, null);
            this.f312543q = 1;
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
