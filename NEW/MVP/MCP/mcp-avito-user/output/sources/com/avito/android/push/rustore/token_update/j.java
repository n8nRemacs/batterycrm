package com.avito.android.push.rustore.token_update;

import com.avito.android.account.E;
import com.avito.android.account.P;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.push.PushService;
import com.avito.android.push.PushToken;
import com.avito.android.push.public_module.token.sending.sender.PushTokenSender;
import com.avito.android.util.R0;
import com.avito.android.util.V2;
import com.squareup.anvil.annotations.ContributesBinding;
import gg0.C40677a;
import gg0.C40679c;
import ig0.AbstractC41398a;
import javax.inject.Inject;
import javax.inject.Singleton;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Z;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.rx3.C43292o;

/* compiled from: RuStorePushTokenUpdater.kt */
@Singleton
@ContributesBinding
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/android/push/rustore/token_update/j;", "Lcom/avito/android/push/rustore/token_update/i;", "a", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class j implements i {

    /* renamed from: h, reason: collision with root package name */
    public static final /* synthetic */ int f246129h = 0;

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final e f246130a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.push.rustore.token_update.a f246131b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.push.rustore.f f246132c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final PushTokenSender f246133d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final R0 f246134e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final E f246135f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f246136g;

    /* compiled from: RuStorePushTokenUpdater.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/push/rustore/token_update/j$a;", "", "<init>", "()V", "", "TAG", "Ljava/lang/String;", "_avito_push-rustore_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: RuStorePushTokenUpdater.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.push.rustore.token_update.RuStorePushTokenUpdaterImpl$update$1", f = "RuStorePushTokenUpdater.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f246137q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ boolean f246139s;

        /* compiled from: RuStorePushTokenUpdater.kt */
        @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lkotlin/Z;", "Lcom/avito/android/push/PushToken;", "result", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        public static final class a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ j f246140b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ boolean f246141c;

            public a(j jVar, boolean z12) {
                this.f246140b = jVar;
                this.f246141c = z12;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            public final Object emit(@Y61.k Object obj, @Y61.k Continuation<? super G0> continuation) {
                Object objA;
                Object obj2 = ((Z) obj).f406625b;
                Throwable thB = Z.b(obj2);
                j jVar = this.f246140b;
                boolean z12 = this.f246141c;
                if (thB == null) {
                    PushToken pushToken = (PushToken) obj2;
                    InterfaceC28373a interfaceC28373a = jVar.f246136g;
                    Qf0.b bVar = Qf0.b.f13970a;
                    PushService pushService = pushToken.f245933c;
                    bVar.getClass();
                    interfaceC28373a.c(new C40679c(Qf0.b.a(pushService), pushToken.f245932b, true, z12, null, 16, null));
                    V2 v22 = V2.f318762a;
                    StringBuilder sb2 = new StringBuilder("sendToken: pushToken=");
                    String str = pushToken.f245932b;
                    sb2.append(str);
                    sb2.append(", isVoip=");
                    sb2.append(z12);
                    v22.c("RuStorePushTokenUpdater", sb2.toString(), null);
                    PushService pushService2 = pushToken.f245933c;
                    if (z12) {
                        v22.c("RuStorePushTokenUpdater", "skip update of voip token cause we use only Firebase for voip", null);
                        jVar.f246136g.c(new gg0.d(Qf0.b.a(pushService2), str, true, "wrong_push_service_for_voip_rst"));
                        objA = G0.f406611a;
                    } else {
                        objA = C43292o.a(jVar.f246133d.a(str, Qf0.b.a(pushService2), z12).k(new P(1, jVar, pushToken, z12)).l(new k(z12, jVar, pushToken)).r(), continuation);
                        if (objA != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                            objA = G0.f406611a;
                        }
                    }
                    if (objA == IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                        return objA;
                    }
                } else {
                    InterfaceC28373a interfaceC28373a2 = jVar.f246136g;
                    Qf0.b bVar2 = Qf0.b.f13970a;
                    PushService pushService3 = PushService.f245929d;
                    bVar2.getClass();
                    interfaceC28373a2.c(new C40679c(Qf0.b.a(pushService3), null, true, thB.getMessage(), z12));
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(boolean z12, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f246139s = z12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return j.this.new b(this.f246139s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f246137q;
            if (i12 == 0) {
                C42729a0.b(obj);
                j jVar = j.this;
                C43152f0 c43152f0A = jVar.f246132c.a();
                a aVar = new a(jVar, this.f246139s);
                this.f246137q = 1;
                if (c43152f0A.collect(aVar, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            return G0.f406611a;
        }
    }

    static {
        new a(null);
    }

    @Inject
    public j(@Y61.k e eVar, @Y61.k com.avito.android.push.rustore.token_update.a aVar, @Y61.k com.avito.android.push.rustore.f fVar, @Y61.k PushTokenSender pushTokenSender, @Y61.k R0 r02, @Y61.k E e12, @Y61.k InterfaceC28373a interfaceC28373a) {
        this.f246130a = eVar;
        this.f246131b = aVar;
        this.f246132c = fVar;
        this.f246133d = pushTokenSender;
        this.f246134e = r02;
        this.f246135f = e12;
        this.f246136g = interfaceC28373a;
    }

    @Override // com.avito.android.push.rustore.token_update.i
    public final void a(@Y61.k AbstractC41398a abstractC41398a, boolean z12) {
        V2.f318762a.c("RuStorePushTokenUpdater", "update: isVoip=" + z12 + ", reason=" + abstractC41398a.f398614a, null);
        this.f246136g.c(new C40677a(abstractC41398a.f398614a, z12, null, 4, null));
        C43259k.d(U.a(this.f246134e.a()), null, null, new b(z12, null), 3);
    }

    @Override // com.avito.android.push.rustore.token_update.i
    public final void b(@Y61.k AbstractC41398a abstractC41398a, boolean z12) {
        V2 v22 = V2.f318762a;
        v22.c("RuStorePushTokenUpdater", "updateIfNeed: isVoip=" + z12 + ", reason=" + abstractC41398a.f398614a, null);
        if (!this.f246135f.b() && z12) {
            v22.c("RuStorePushTokenUpdater", "skip update of voip token cause user is not authorized", null);
        } else if (this.f246130a.a(abstractC41398a, z12)) {
            a(abstractC41398a, z12);
        } else {
            v22.c("RuStorePushTokenUpdater", "skip update cause it is not required now", null);
        }
    }
}
