package com.avito.android.profile.user_profile.header;

import Ua0.InterfaceC15503a;
import Y41.p;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ProfileHeaderView.kt */
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0002\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlin/G0;", "it", "<anonymous>", "(V)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.header.ProfileHeaderView$1", f = "ProfileHeaderView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<G0, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f226151q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f226151q = bVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new a(this.f226151q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(G0 g02, Continuation<? super G0> continuation) {
        return ((a) create(g02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        this.f226151q.f226152a.invoke(InterfaceC15503a.u.f16470a);
        return G0.f406611a;
    }
}
