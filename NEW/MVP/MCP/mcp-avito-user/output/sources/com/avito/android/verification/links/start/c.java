package com.avito.android.verification.links.start;

import Y41.p;
import Y61.k;
import Y61.l;
import com.avito.android.deep_linking.links.VerificationStartLink;
import java.util.LinkedHashMap;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: VerificationStartLinkAsyncHandler.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/verification/links/start/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/verification/links/start/a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.verification.links.start.VerificationStartLinkAsyncHandler$doHandleSuspend$result$1", f = "VerificationStartLinkAsyncHandler.kt", i = {}, l = {31}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class c extends SuspendLambda implements p<T, Continuation<? super a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f324507q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f324508r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ VerificationStartLink f324509s;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, VerificationStartLink verificationStartLink, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f324508r = dVar;
        this.f324509s = verificationStartLink;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new c(this.f324508r, this.f324509s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super a> continuation) {
        return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f324507q;
        if (i12 == 0) {
            C42729a0.b(obj);
            g gVar = this.f324508r.f324513j;
            LinkedHashMap linkedHashMap = new LinkedHashMap(this.f324509s.f133845b);
            this.f324507q = 1;
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
