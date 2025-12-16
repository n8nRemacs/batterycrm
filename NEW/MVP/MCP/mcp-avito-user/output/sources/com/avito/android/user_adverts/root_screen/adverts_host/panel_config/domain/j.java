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
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;

/* compiled from: ItemsConfigStorage.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/j;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/i;", "a", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class j implements i {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final cK0.b f313284a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final R0 f313285b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f313286c;

    /* compiled from: ItemsConfigStorage.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\t¨\u0006\n"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/panel_config/domain/j$a;", "", "<init>", "()V", "", "MAX_SMB_STATS_ONBOARDING_SHOW_COUNT", "I", "", "ONE_DAY_MILLISECONDS", "J", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: ItemsConfigStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.ItemsConfigStorageImpl$hideStatsOnboarding$2", f = "ItemsConfigStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return j.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            j jVar = j.this;
            jVar.f313284a.b(jVar.f313286c.now());
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public j(@Y61.k cK0.b bVar, @Y61.k R0 r02, @Y61.k com.avito.android.server_time.f fVar) {
        this.f313284a = bVar;
        this.f313285b = r02;
        this.f313286c = fVar;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.i
    @Y61.l
    public final Object a(@Y61.k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f313285b.a(), new b(null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.panel_config.domain.i
    @Y61.l
    public final Object b(@Y61.k C35593a.b.C9618a.C9619a c9619a) {
        return C43259k.g(this.f313285b.a(), new k(this, null), c9619a);
    }
}
