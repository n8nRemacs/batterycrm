package com.avito.android.virtual_deal_room_client_creation.clients.interactor;

import WN0.f;
import Y41.p;
import Y61.k;
import Y61.l;
import androidx.compose.runtime.internal.P;
import com.avito.android.error.z;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.UniversalImage;
import com.avito.android.util.C35936s;
import com.avito.android.util.InterfaceC35945t1;
import com.avito.android.util.N3;
import com.avito.android.util.R0;
import com.avito.android.virtual_deal_room_client_creation.clients.mvi.entity.ClientsInternalAction;
import h31.e;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43131e0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.I0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: ClientsInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/interactor/b;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/interactor/a;", "_avito_virtual-deal-room-client-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b implements com.avito.android.virtual_deal_room_client_creation.clients.interactor.a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<UN0.a> f326545a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final InterfaceC35945t1<String> f326546b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final R0 f326547c;

    /* renamed from: d, reason: collision with root package name */
    @l
    public N0 f326548d;

    /* renamed from: e, reason: collision with root package name */
    @l
    public N0 f326549e;

    /* compiled from: ClientsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.interactor.ClientsInteractorImpl$load$1", f = "ClientsInteractor.kt", i = {0}, l = {40}, m = "invokeSuspend", n = {"$this$channelFlow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements p<I0<? super ClientsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326550q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f326551r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ int f326552s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ b f326553t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f326554u;

        /* compiled from: ClientsInteractor.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.interactor.ClientsInteractorImpl$load$1$1", f = "ClientsInteractor.kt", i = {}, l = {43, 53, 74}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.interactor.b$a$a, reason: collision with other inner class name */
        public static final class C10098a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f326555q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f326556r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ int f326557s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ String f326558t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ I0<ClientsInternalAction> f326559u;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10098a(b bVar, int i12, String str, I0<? super ClientsInternalAction> i02, Continuation<? super C10098a> continuation) {
                super(2, continuation);
                this.f326556r = bVar;
                this.f326557s = i12;
                this.f326558t = str;
                this.f326559u = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C10098a(this.f326556r, this.f326557s, this.f326558t, this.f326559u, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C10098a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object objC;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f326555q;
                int i13 = this.f326557s;
                b bVar = this.f326556r;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    UN0.a aVar = bVar.f326545a.get();
                    WN0.a aVar2 = new WN0.a(new WN0.b(i13, 20L), this.f326558t);
                    this.f326555q = 1;
                    objC = aVar.c(aVar2, this);
                    if (objC == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2 && i12 != 3) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        return G0.f406611a;
                    }
                    C42729a0.b(obj);
                    objC = obj;
                }
                TypedResult typedResult = (TypedResult) objC;
                boolean z12 = typedResult instanceof TypedResult.Success;
                I0<ClientsInternalAction> i02 = this.f326559u;
                if (z12) {
                    f fVar = (f) ((TypedResult.Success) typedResult).getResult();
                    List<WN0.e> listA = fVar.getResult().a();
                    ArrayList arrayList = new ArrayList(C42745f0.q(listA, 10));
                    for (WN0.e eVar : listA) {
                        String id2 = eVar.getId();
                        WN0.d avatar = eVar.getAvatar();
                        arrayList.add(new PN0.a(avatar != null ? new UniversalImage(avatar.getLightImage(), avatar.getDarkImage()) : null, id2, eVar.getName(), bVar.f326546b.a(eVar.getPhone())));
                    }
                    ClientsInternalAction.Content content = new ClientsInternalAction.Content(i13 + 1, arrayList, ((long) fVar.getResult().a().size()) < 20);
                    this.f326555q = 2;
                    if (i02.send(content, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (!(typedResult instanceof TypedResult.Error)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    TypedResult.Error error = (TypedResult.Error) typedResult;
                    ClientsInternalAction.Error error2 = new ClientsInternalAction.Error(z.n(C35936s.a(error.getError(), error.getCause())));
                    this.f326555q = 3;
                    if (i02.send(error2, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(int i12, b bVar, String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f326552s = i12;
            this.f326553t = bVar;
            this.f326554u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            a aVar = new a(this.f326552s, this.f326553t, this.f326554u, continuation);
            aVar.f326551r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super ClientsInternalAction> i02, Continuation<? super G0> continuation) {
            return ((a) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            I0 i02;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f326550q;
            if (i12 == 0) {
                C42729a0.b(obj);
                I0 i03 = (I0) this.f326551r;
                ClientsInternalAction.Loading loading = new ClientsInternalAction.Loading(this.f326552s == 0);
                this.f326551r = i03;
                this.f326550q = 1;
                if (i03.send(loading, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                i02 = i03;
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                i02 = (I0) this.f326551r;
                C42729a0.b(obj);
            }
            b bVar = this.f326553t;
            N0 n02 = bVar.f326548d;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            bVar.f326548d = C43259k.d(i02, bVar.f326547c.a(), null, new C10098a(this.f326553t, this.f326552s, this.f326554u, i02, null), 2);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientsInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.interactor.ClientsInteractorImpl$search$1", f = "ClientsInteractor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.interactor.b$b, reason: collision with other inner class name */
    public static final class C10099b extends SuspendLambda implements p<I0<? super ClientsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f326560q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f326562s;

        /* compiled from: ClientsInteractor.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.interactor.ClientsInteractorImpl$search$1$1", f = "ClientsInteractor.kt", i = {}, l = {83, 85}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.interactor.b$b$a */
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f326563q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ b f326564r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ String f326565s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ I0<ClientsInternalAction> f326566t;

            /* compiled from: ClientsInteractor.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;", "it", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/virtual_deal_room_client_creation/clients/mvi/entity/ClientsInternalAction;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.virtual_deal_room_client_creation.clients.interactor.ClientsInteractorImpl$search$1$1$1", f = "ClientsInteractor.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.virtual_deal_room_client_creation.clients.interactor.b$b$a$a, reason: collision with other inner class name */
            public static final class C10100a extends SuspendLambda implements p<ClientsInternalAction, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f326567q;

                /* renamed from: r, reason: collision with root package name */
                public /* synthetic */ Object f326568r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ I0<ClientsInternalAction> f326569s;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                /* JADX WARN: Multi-variable type inference failed */
                public C10100a(I0<? super ClientsInternalAction> i02, Continuation<? super C10100a> continuation) {
                    super(2, continuation);
                    this.f326569s = i02;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @k
                public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                    C10100a c10100a = new C10100a(this.f326569s, continuation);
                    c10100a.f326568r = obj;
                    return c10100a;
                }

                @Override // Y41.p
                public final Object invoke(ClientsInternalAction clientsInternalAction, Continuation<? super G0> continuation) {
                    return ((C10100a) create(clientsInternalAction, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f326567q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ClientsInternalAction clientsInternalAction = (ClientsInternalAction) this.f326568r;
                        this.f326567q = 1;
                        if (this.f326569s.send(clientsInternalAction, this) == coroutine_suspended) {
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

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public a(b bVar, String str, I0<? super ClientsInternalAction> i02, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f326564r = bVar;
                this.f326565s = str;
                this.f326566t = i02;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f326564r, this.f326565s, this.f326566t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f326563q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f326563q = 1;
                    if (C43131e0.b(200L, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        if (i12 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        C42729a0.b(obj);
                        return G0.f406611a;
                    }
                    C42729a0.b(obj);
                }
                InterfaceC43160i interfaceC43160iB = this.f326564r.b(0, this.f326565s);
                C10100a c10100a = new C10100a(this.f326566t, null);
                this.f326563q = 2;
                if (C43175k.j(interfaceC43160iB, c10100a, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C10099b(String str, Continuation<? super C10099b> continuation) {
            super(2, continuation);
            this.f326562s = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            C10099b c10099b = b.this.new C10099b(this.f326562s, continuation);
            c10099b.f326560q = obj;
            return c10099b;
        }

        @Override // Y41.p
        public final Object invoke(I0<? super ClientsInternalAction> i02, Continuation<? super G0> continuation) {
            return ((C10099b) create(i02, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            I0 i02 = (I0) this.f326560q;
            b bVar = b.this;
            N0 n02 = bVar.f326549e;
            if (n02 != null) {
                ((V0) n02).c(null);
            }
            bVar.f326549e = C43259k.d(i02, null, null, new a(bVar, this.f326562s, i02, null), 3);
            return G0.f406611a;
        }
    }

    @Inject
    public b(@k e<UN0.a> eVar, @N3.c @k InterfaceC35945t1<String> interfaceC35945t1, @k R0 r02) {
        this.f326545a = eVar;
        this.f326546b = interfaceC35945t1;
        this.f326547c = r02;
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.clients.interactor.a
    @k
    public final InterfaceC43160i<ClientsInternalAction> a(@k String str) {
        return C43175k.h(new C10099b(str, null));
    }

    @Override // com.avito.android.virtual_deal_room_client_creation.clients.interactor.a
    @k
    public final InterfaceC43160i b(int i12, @k String str) {
        return C43175k.h(new a(i12, this, str, null));
    }
}
