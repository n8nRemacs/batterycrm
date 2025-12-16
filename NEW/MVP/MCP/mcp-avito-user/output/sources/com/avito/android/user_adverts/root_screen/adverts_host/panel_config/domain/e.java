package com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain;

import Y41.p;
import com.avito.android.user_adverts.root_screen.adverts_host.panel_config.mvi.C35593a;
import com.avito.android.util.R0;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: ItemsConfigNpsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/e;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/c;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class e implements c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f313261a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.g f313262b;

    /* compiled from: ItemsConfigNpsStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.ItemsConfigNpsStorageImpl$markServicesSxNpsDone$2", f = "ItemsConfigNpsStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return e.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            e.this.f313262b.f314157a.putBoolean("srv_sx_nps_pref_key", false);
            return G0.f406611a;
        }
    }

    @Inject
    public e(@Y61.k R0 r02, @Y61.k com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.g gVar) {
        this.f313261a = r02;
        this.f313262b = gVar;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.c
    @Y61.l
    public final Object a(@Y61.k C35593a.b.C9618a.C9619a c9619a) {
        return C43259k.g(this.f313261a.a(), new d(this, null), c9619a);
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.c
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f313261a.a(), new a(null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
