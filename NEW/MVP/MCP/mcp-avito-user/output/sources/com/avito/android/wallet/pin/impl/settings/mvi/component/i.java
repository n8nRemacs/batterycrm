package com.avito.android.wallet.pin.impl.settings.mvi.component;

import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.avito.android.wallet.pin.impl.settings.mvi.entity.WalletSecuritySettingsInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.InterfaceC43076a0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import nP0.C44317d;

/* compiled from: WalletSecuritySettingsBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/wallet/pin/impl/settings/mvi/component/i;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "_avito_wallet-pin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class i implements com.avito.android.arch.mvi.b<WalletSecuritySettingsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final n f328811a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.wallet_biometry.f f328812b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f328813c;

    /* compiled from: WalletSecuritySettingsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.pin.impl.settings.mvi.component.WalletSecuritySettingsBootstrap$produce$1", f = "WalletSecuritySettingsBootstrap.kt", i = {0}, l = {AvailableCode.APP_IS_BACKGROUND_OR_LOCKED, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow"}, s = {"L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super WalletSecuritySettingsInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f328814q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f328815r;

        /* compiled from: WalletSecuritySettingsBootstrap.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.settings.mvi.component.WalletSecuritySettingsBootstrap$produce$1$1", f = "WalletSecuritySettingsBootstrap.kt", i = {0, 0, 1, 2}, l = {32, 37, 37, 39, 41, 44}, m = "invokeSuspend", n = {"pinCipherDeferred", "contentDeferred", "contentDeferred", "contentDeferred"}, s = {"L$0", "L$1", "L$0", "L$0"})
        /* renamed from: com.avito.android.wallet.pin.impl.settings.mvi.component.i$a$a, reason: collision with other inner class name */
        public static final class C10207a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public l0.h f328817q;

            /* renamed from: r, reason: collision with root package name */
            public Object f328818r;

            /* renamed from: s, reason: collision with root package name */
            public int f328819s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ i f328820t;

            /* renamed from: u, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j<WalletSecuritySettingsInternalAction> f328821u;

            /* compiled from: WalletSecuritySettingsBootstrap.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.wallet.pin.impl.settings.mvi.component.WalletSecuritySettingsBootstrap$produce$1$1$1", f = "WalletSecuritySettingsBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.wallet.pin.impl.settings.mvi.component.i$a$a$a, reason: collision with other inner class name */
            public static final class C10208a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f328822q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ l0.h<InterfaceC43076a0<CP0.d>> f328823r;

                /* renamed from: s, reason: collision with root package name */
                public final /* synthetic */ l0.h<InterfaceC43076a0<TypedResult<C44317d>>> f328824s;

                /* renamed from: t, reason: collision with root package name */
                public final /* synthetic */ i f328825t;

                /* compiled from: WalletSecuritySettingsBootstrap.kt */
                @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "LCP0/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)LCP0/d;"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.avito.android.wallet.pin.impl.settings.mvi.component.WalletSecuritySettingsBootstrap$produce$1$1$1$1", f = "WalletSecuritySettingsBootstrap.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.avito.android.wallet.pin.impl.settings.mvi.component.i$a$a$a$a, reason: collision with other inner class name */
                public static final class C10209a extends SuspendLambda implements Y41.p<T, Continuation<? super CP0.d>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public int f328826q;

                    /* renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ i f328827r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C10209a(i iVar, Continuation<? super C10209a> continuation) {
                        super(2, continuation);
                        this.f328827r = iVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.k
                    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                        return new C10209a(this.f328827r, continuation);
                    }

                    @Override // Y41.p
                    public final Object invoke(T t12, Continuation<? super CP0.d> continuation) {
                        return ((C10209a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = this.f328826q;
                        if (i12 == 0) {
                            C42729a0.b(obj);
                            com.avito.android.wallet_biometry.f fVar = this.f328827r.f328812b;
                            this.f328826q = 1;
                            obj = fVar.b(this);
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

                /* compiled from: WalletSecuritySettingsBootstrap.kt */
                @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/T;", "Lcom/avito/android/remote/model/TypedResult;", "LnP0/d;", "<anonymous>", "(Lkotlinx/coroutines/T;)Lcom/avito/android/remote/model/TypedResult;"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.avito.android.wallet.pin.impl.settings.mvi.component.WalletSecuritySettingsBootstrap$produce$1$1$1$2", f = "WalletSecuritySettingsBootstrap.kt", i = {}, l = {34}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.avito.android.wallet.pin.impl.settings.mvi.component.i$a$a$a$b */
                public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super TypedResult<C44317d>>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public int f328828q;

                    /* renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ i f328829r;

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public b(i iVar, Continuation<? super b> continuation) {
                        super(2, continuation);
                        this.f328829r = iVar;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.k
                    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                        return new b(this.f328829r, continuation);
                    }

                    @Override // Y41.p
                    public final Object invoke(T t12, Continuation<? super TypedResult<C44317d>> continuation) {
                        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        int i12 = this.f328828q;
                        if (i12 == 0) {
                            C42729a0.b(obj);
                            n nVar = this.f328829r.f328811a;
                            this.f328828q = 1;
                            obj = nVar.f328846a.get().a(nVar.f328847b, this);
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

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10208a(l0.h<InterfaceC43076a0<CP0.d>> hVar, l0.h<InterfaceC43076a0<TypedResult<C44317d>>> hVar2, i iVar, Continuation<? super C10208a> continuation) {
                    super(2, continuation);
                    this.f328823r = hVar;
                    this.f328824s = hVar2;
                    this.f328825t = iVar;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    C10208a c10208a = new C10208a(this.f328823r, this.f328824s, this.f328825t, continuation);
                    c10208a.f328822q = obj;
                    return c10208a;
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C10208a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                /* JADX WARN: Type inference failed for: r0v1, types: [T, kotlinx.coroutines.a0] */
                /* JADX WARN: Type inference failed for: r6v3, types: [T, kotlinx.coroutines.a0] */
                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    T t12 = (T) this.f328822q;
                    i iVar = this.f328825t;
                    this.f328823r.f406842b = C43259k.b(t12, null, new C10209a(iVar, null), 3);
                    this.f328824s.f406842b = C43259k.b(t12, null, new b(iVar, null), 3);
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public C10207a(i iVar, InterfaceC43172j<? super WalletSecuritySettingsInternalAction> interfaceC43172j, Continuation<? super C10207a> continuation) {
                super(2, continuation);
                this.f328820t = iVar;
                this.f328821u = interfaceC43172j;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C10207a(this.f328820t, this.f328821u, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C10207a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            /* JADX WARN: Removed duplicated region for block: B:16:0x006d A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:17:0x006e  */
            /* JADX WARN: Removed duplicated region for block: B:20:0x0073  */
            /* JADX WARN: Removed duplicated region for block: B:23:0x0086 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
            /* JADX WARN: Removed duplicated region for block: B:27:0x0097 A[RETURN] */
            /* JADX WARN: Removed duplicated region for block: B:30:0x009e  */
            /* JADX WARN: Removed duplicated region for block: B:33:0x00b5  */
            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r9) {
                /*
                    Method dump skipped, instructions count: 242
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.settings.mvi.component.i.a.C10207a.invokeSuspend(java.lang.Object):java.lang.Object");
            }
        }

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = i.this.new a(continuation);
            aVar.f328815r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super WalletSecuritySettingsInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            InterfaceC43172j interfaceC43172j;
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f328814q;
            if (i12 == 0) {
                C42729a0.b(obj);
                interfaceC43172j = (InterfaceC43172j) this.f328815r;
                WalletSecuritySettingsInternalAction.ShowContentLoading showContentLoading = new WalletSecuritySettingsInternalAction.ShowContentLoading();
                this.f328815r = interfaceC43172j;
                this.f328814q = 1;
                if (interfaceC43172j.emit(showContentLoading, this) == coroutine_suspended) {
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
                interfaceC43172j = (InterfaceC43172j) this.f328815r;
                C42729a0.b(obj);
            }
            C10207a c10207a = new C10207a(i.this, interfaceC43172j, null);
            this.f328815r = null;
            this.f328814q = 2;
            if (U.c(c10207a, this) == coroutine_suspended) {
                return coroutine_suspended;
            }
            return G0.f406611a;
        }
    }

    /* compiled from: WalletSecuritySettingsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0005\u001a\u00020\u0004*\b\u0012\u0004\u0012\u00020\u00010\u00002\u0006\u0010\u0003\u001a\u00020\u0002H\u008a@¢\u0006\u0004\b\u0005\u0010\u0006"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/wallet/pin/impl/settings/mvi/entity/WalletSecuritySettingsInternalAction;", "", "error", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;Ljava/lang/Throwable;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.wallet.pin.impl.settings.mvi.component.WalletSecuritySettingsBootstrap$produce$2", f = "WalletSecuritySettingsBootstrap.kt", i = {}, l = {49}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super WalletSecuritySettingsInternalAction>, Throwable, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f328830q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f328831r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Throwable f328832s;

        public b() {
            throw null;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super WalletSecuritySettingsInternalAction> interfaceC43172j, Throwable th2, Continuation<? super G0> continuation) {
            b bVar = new b(3, continuation);
            bVar.f328831r = interfaceC43172j;
            bVar.f328832s = th2;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f328830q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f328831r;
                WalletSecuritySettingsInternalAction.ShowContentLoadingError showContentLoadingError = new WalletSecuritySettingsInternalAction.ShowContentLoadingError(this.f328832s);
                this.f328831r = null;
                this.f328830q = 1;
                if (interfaceC43172j.emit(showContentLoadingError, this) == coroutine_suspended) {
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

    @Inject
    public i(@Y61.k n nVar, @Y61.k com.avito.android.wallet_biometry.f fVar, @Y61.k R0 r02) {
        this.f328811a = nVar;
        this.f328812b = fVar;
        this.f328813c = r02;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<WalletSecuritySettingsInternalAction> a() {
        return new C43152f0(C43175k.G(new a(null)), new b(3, null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
