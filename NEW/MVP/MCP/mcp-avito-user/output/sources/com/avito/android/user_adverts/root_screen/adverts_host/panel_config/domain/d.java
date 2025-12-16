package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain;

import Y41.p;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.b;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;

/* compiled from: ItemsConfigNpsStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/b$a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/b$a;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.ItemsConfigNpsStorageImpl$fetchServicesSxNps$2", f = "ItemsConfigNpsStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class d extends SuspendLambda implements p<T, Continuation<? super b.a>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public final /* synthetic */ e f313260q;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(e eVar, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f313260q = eVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new d(this.f313260q, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super b.a> continuation) {
        return ((d) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        if (this.f313260q.f313262b.f314157a.getBoolean("srv_sx_nps_pref_key", true)) {
            return new b.a(new com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.a());
        }
        return null;
    }
}
