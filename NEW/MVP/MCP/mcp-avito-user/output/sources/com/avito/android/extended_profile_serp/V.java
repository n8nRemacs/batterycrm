package com.avito.android.extended_profile_serp;

import bB.InterfaceC25487a;
import com.avito.android.extended_profile_serp.ExtendedProfileSerpFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;

/* compiled from: ExtendedProfileSerpView.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "text", "Lkotlin/G0;", "<anonymous>", "(Ljava/lang/String;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_serp.ExtendedProfileSerpView$initSearchBarView$4", f = "ExtendedProfileSerpView.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class V extends SuspendLambda implements Y41.p<String, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f152578q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ F f152579r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public V(F f12, Continuation<? super V> continuation) {
        super(2, continuation);
        this.f152579r = f12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        V v12 = new V(this.f152579r, continuation);
        v12.f152578q = obj;
        return v12;
    }

    @Override // Y41.p
    public final Object invoke(String str, Continuation<? super G0> continuation) {
        return ((V) create(str, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        String str = (String) this.f152578q;
        F f12 = this.f152579r;
        ((ExtendedProfileSerpFragment.e) f12.f152526c).invoke(new InterfaceC25487a.q(str));
        f12.f152547x.b();
        return G0.f406611a;
    }
}
