package com.avito.android.user_adverts.tab_screens.adverts.mvi;

import com.avito.android.user_adverts.tab_screens.adverts.mvi.C35670a;
import com.avito.android.user_adverts.tab_screens.adverts.mvi.entity.UserAdvertsListInternalAction;
import fJ0.InterfaceC40301a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: Merge.kt */
@s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.tab_screens.adverts.mvi.UserAdvertsListActor$processLoadActionWithParams$$inlined$flatMapLatest$1", f = "UserAdvertsListActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.user_adverts.tab_screens.adverts.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C35684o extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserAdvertsListInternalAction>, InterfaceC40301a.b, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f315456q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ InterfaceC43172j f315457r;

    /* renamed from: s, reason: collision with root package name */
    public /* synthetic */ Object f315458s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ C35670a f315459t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.a f315460u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ C35670a.b f315461v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C35684o(Continuation continuation, C35670a c35670a, Y41.a aVar, C35670a.b bVar) {
        super(3, continuation);
        this.f315459t = c35670a;
        this.f315460u = aVar;
        this.f315461v = bVar;
    }

    @Override // Y41.q
    public final Object invoke(InterfaceC43172j<? super UserAdvertsListInternalAction> interfaceC43172j, InterfaceC40301a.b bVar, Continuation<? super G0> continuation) {
        C35670a.b bVar2 = this.f315461v;
        C35684o c35684o = new C35684o(continuation, this.f315459t, this.f315460u, bVar2);
        c35684o.f315457r = interfaceC43172j;
        c35684o.f315458s = bVar;
        return c35684o.invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Removed duplicated region for block: B:54:0x00e7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r15) {
        /*
            Method dump skipped, instructions count: 235
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.user_adverts.tab_screens.adverts.mvi.C35684o.invokeSuspend(java.lang.Object):java.lang.Object");
    }
}
