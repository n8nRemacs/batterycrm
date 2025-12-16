package com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import bW.InterfaceC25571b;
import com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.g;
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

/* compiled from: ServiceFreemiumNpsStorage.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/user_adverts/root_screen/adverts_host/service_freemium/domain/c;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/service_freemium/domain/b;", "_avito_user-adverts_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class c implements com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.b {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final R0 f313840a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC25571b f313841b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final g f313842c;

    /* compiled from: ServiceFreemiumNpsStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/user_adverts/root_screen/adverts_host/service_freemium/domain/a;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/user_adverts/root_screen/adverts_host/service_freemium/domain/a;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.ServiceFreemiumNpsStorageImpl$fetchFreemiumNps$2", f = "ServiceFreemiumNpsStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.a>, Object> {
        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new a(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.a> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            c cVar = c.this;
            if (cVar.f313841b.a() && cVar.f313842c.f314160a.getBoolean("srv_freemium_nps_pref_key", true)) {
                return new com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.a(new com.avito.android.user_adverts.root_screen.adverts_host.ux_feedback.service_freemium_nps.a());
            }
            return null;
        }
    }

    /* compiled from: ServiceFreemiumNpsStorage.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.ServiceFreemiumNpsStorageImpl$markFreemiumNpsDone$2", f = "ServiceFreemiumNpsStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {
        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return c.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            c.this.f313842c.f314160a.putBoolean("srv_freemium_nps_pref_key", false);
            return G0.f406611a;
        }
    }

    @Inject
    public c(@k R0 r02, @k InterfaceC25571b interfaceC25571b, @k g gVar) {
        this.f313840a = r02;
        this.f313841b = interfaceC25571b;
        this.f313842c = gVar;
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.b
    @l
    public final Object a(@k Continuation<? super com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.a> continuation) {
        return C43259k.g(this.f313840a.a(), new a(null), continuation);
    }

    @Override // com.avito.android.user_adverts.root_screen.adverts_host.service_freemium.domain.b
    @l
    public final Object b(@k Continuation<? super G0> continuation) {
        Object objG = C43259k.g(this.f313840a.a(), new b(null), continuation);
        return objG == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objG : G0.f406611a;
    }
}
