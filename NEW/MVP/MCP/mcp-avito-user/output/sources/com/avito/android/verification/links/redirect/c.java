package com.avito.android.verification.links.redirect;

import Y41.p;
import Y61.l;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: VerificationRedirectLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/verification/links/redirect/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/verification/links/redirect/a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.links.redirect.VerificationRedirectLinkAsyncHandler$doHandleSuspend$result$1", f = "VerificationRedirectLinkAsyncHandler.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f324342q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f324343r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VerificationRedirectLink f324344s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, VerificationRedirectLink verificationRedirectLink, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f324343r = dVar;
        this.f324344s = verificationRedirectLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f324343r, this.f324344s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super a> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    /* JADX WARN: Type inference failed for: r1v2, types: [java.lang.Object, java.util.Map] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f324342q;
        if (i12 == 0) {
            C42729a0.b(obj);
            g gVar = this.f324343r.f324348j;
            LinkedHashMap linkedHashMap = new LinkedHashMap((Map) this.f324344s.f324333b);
            this.f324342q = 1;
            obj = gVar.a(linkedHashMap, this);
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
