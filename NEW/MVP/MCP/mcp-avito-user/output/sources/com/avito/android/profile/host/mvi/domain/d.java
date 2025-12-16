package com.avito.android.profile.host.mvi.domain;

import Y41.q;
import Y61.k;
import Y61.l;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import q90.b;

/* compiled from: UserProfileHostLoader.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u00002\u0006\u0010\u0001\u001a\u00020\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lq90/b;", "proAction", "Lq90/b$a;", "employeeAction", "<anonymous>", "(Lq90/b;Lq90/b$a;)Lq90/b;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.host.mvi.domain.UserProfileHostLoader$loadProfileHostInfo$1", f = "UserProfileHostLoader.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class d extends SuspendLambda implements q<q90.b, b.a, Continuation<? super q90.b>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ q90.b f222394q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ b.a f222395r;

    public d() {
        throw null;
    }

    @Override // Y41.q
    public final Object invoke(q90.b bVar, b.a aVar, Continuation<? super q90.b> continuation) {
        d dVar = new d(3, continuation);
        dVar.f222394q = bVar;
        dVar.f222395r = aVar;
        return dVar.invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        q90.b bVar = this.f222394q;
        b.a aVar = this.f222395r;
        if (aVar instanceof b.d) {
            return bVar;
        }
        if (aVar instanceof b.c) {
            return aVar;
        }
        throw new NoWhenBranchMatchedException();
    }
}
