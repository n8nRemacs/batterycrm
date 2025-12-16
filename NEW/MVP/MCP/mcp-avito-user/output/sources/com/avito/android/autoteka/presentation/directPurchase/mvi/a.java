package com.avito.android.autoteka.presentation.directPurchase.mvi;

import Kf.InterfaceC14310a;
import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutotekaDirectPurchaseActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LKf/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.autoteka.presentation.directPurchase.mvi.AutotekaDirectPurchaseActor$process$1", f = "AutotekaDirectPurchaseActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super Kf.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ InterfaceC14310a f97294q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ b f97295r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(InterfaceC14310a interfaceC14310a, b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f97294q = interfaceC14310a;
        this.f97295r = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f97294q, this.f97295r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super Kf.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        InterfaceC14310a interfaceC14310a = this.f97294q;
        if (interfaceC14310a instanceof InterfaceC14310a.C0589a) {
            b.a.a(this.f97295r.f97296a, ((InterfaceC14310a.C0589a) interfaceC14310a).f9592a, null, null, 6);
        }
        return G0.f406611a;
    }
}
