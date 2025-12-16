package com.avito.android.publish.free_delivery.ui.re23;

import Y41.p;
import androidx.compose.runtime.InterfaceC22204y1;
import androidx.compose.ui.focus.r;
import he0.C40926c;
import he0.InterfaceC40924a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: FreeDeliveryContent.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.publish.free_delivery.ui.re23.FreeDeliveryContentKt$FreeDeliveryContent$1", f = "FreeDeliveryContent.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ C40926c f235941q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ Y41.l<InterfaceC40924a, G0> f235942r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ int f235943s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ r f235944t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22204y1 f235945u;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(C40926c c40926c, Y41.l lVar, int i12, r rVar, InterfaceC22204y1 interfaceC22204y1, Continuation continuation) {
        super(2, continuation);
        this.f235941q = c40926c;
        this.f235942r = lVar;
        this.f235943s = i12;
        this.f235944t = rVar;
        this.f235945u = interfaceC22204y1;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        InterfaceC22204y1 interfaceC22204y1 = this.f235945u;
        return new a(this.f235941q, this.f235942r, this.f235943s, this.f235944t, interfaceC22204y1, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (!((Boolean) this.f235945u.getF42167b()).booleanValue()) {
            if (this.f235941q.f397340l) {
                this.f235942r.invoke(new InterfaceC40924a.c(this.f235943s));
            }
            this.f235944t.u(false);
        }
        return G0.f406611a;
    }
}
