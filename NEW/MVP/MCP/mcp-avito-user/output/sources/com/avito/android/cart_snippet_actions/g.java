package com.avito.android.cart_snippet_actions;

import Cn.InterfaceC13327a;
import Dn.C13419a;
import Y41.p;
import com.avito.android.remote.model.TypedResult;
import java.util.ArrayList;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.T;

/* compiled from: CartActionsInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LDn/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.cart_snippet_actions.CartActionsInteractorImpl$updateItems$1$1", f = "CartActionsInteractor.kt", i = {}, l = {47}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes12.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super TypedResult<C13419a>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f116249q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ i f116250r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ boolean f116251s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ boolean f116252t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f116253u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ ArrayList f116254v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ boolean f116255w;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(i iVar, boolean z12, boolean z13, String str, ArrayList arrayList, boolean z14, Continuation continuation) {
        super(2, continuation);
        this.f116250r = iVar;
        this.f116251s = z12;
        this.f116252t = z13;
        this.f116253u = str;
        this.f116254v = arrayList;
        this.f116255w = z14;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        ArrayList arrayList = this.f116254v;
        return new g(this.f116250r, this.f116251s, this.f116252t, this.f116253u, arrayList, this.f116255w, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super TypedResult<C13419a>> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f116249q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC13327a interfaceC13327a = this.f116250r.f116258b.get();
            Boolean boolBoxBoolean = Boxing.boxBoolean(this.f116251s);
            if (!boolBoxBoolean.booleanValue()) {
                boolBoxBoolean = null;
            }
            Boolean bool = boolBoxBoolean;
            Dn.d dVar = new Dn.d(this.f116253u, bool, this.f116254v, Boxing.boxLong(this.f116252t ? 1L : 0L), Boxing.boxBoolean(this.f116255w));
            this.f116249q = 1;
            obj = interfaceC13327a.a(dVar, this);
            if (obj == coroutine_suspended) {
                return coroutine_suspended;
            }
        } else {
            if (i12 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            C42729a0.b(obj);
        }
        return obj;
    }
}
