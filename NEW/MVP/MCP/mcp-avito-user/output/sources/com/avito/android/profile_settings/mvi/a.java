package com.avito.android.profile_settings.mvi;

import Db0.InterfaceC13382a;
import Y41.p;
import com.avito.android.deeplink_handler.handler.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ProfileSettingsActor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/profile_settings/mvi/entity/a;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings.mvi.ProfileSettingsActor$process$1", f = "ProfileSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class a extends SuspendLambda implements p<InterfaceC43172j<? super com.avito.android.profile_settings.mvi.entity.a>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ b f228455q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC13382a f228456r;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(b bVar, InterfaceC13382a interfaceC13382a, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f228455q = bVar;
        this.f228456r = interfaceC13382a;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new a(this.f228455q, this.f228456r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(InterfaceC43172j<? super com.avito.android.profile_settings.mvi.entity.a> interfaceC43172j, Continuation<? super G0> continuation) {
        return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        b.a.a(this.f228455q.f228458b, ((InterfaceC13382a.b) this.f228456r).f3254a, null, null, 6);
        return G0.f406611a;
    }
}
