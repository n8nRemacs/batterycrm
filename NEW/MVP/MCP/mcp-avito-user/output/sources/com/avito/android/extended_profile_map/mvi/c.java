package com.avito.android.extended_profile_map.mvi;

import Y41.p;
import com.avito.android.analytics.event.r;
import com.avito.android.util.V2;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileMapActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LAA/b;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile_map.mvi.ExtendedProfileMapActor$sendCallContactClickEvents$1", f = "ExtendedProfileMapActor.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes13.dex */
final class c extends SuspendLambda implements p<InterfaceC43172j<? super AA.b>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f151273q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ d f151274r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ String f151275s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ String f151276t;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public c(d dVar, String str, String str2, Continuation<? super c> continuation) {
        super(2, continuation);
        this.f151274r = dVar;
        this.f151275s = str;
        this.f151276t = str2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new c(this.f151274r, this.f151275s, this.f151276t, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super AA.b> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((c) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f151273q;
        try {
            if (i12 == 0) {
                C42729a0.b(obj);
                d dVar = this.f151274r;
                dVar.f151280d.c(r.a.b(r.f90128e, this.f151275s, dVar.f151285i, null, null, 56));
                dVar.f151281e.a();
                com.avito.android.extended_profile_phone_dialog.g gVar = dVar.f151277a;
                String str = this.f151275s;
                String str2 = this.f151276t;
                this.f151273q = 1;
                if (gVar.a(str, str2, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
        } catch (Exception e12) {
            V2.f318762a.a("DEFAULT_TAG", "ExtendedProfileMapActor", e12);
        }
        return G0.f406611a;
    }
}
