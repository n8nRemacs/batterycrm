package com.avito.android.iac_dialer.impl_module.screens.call_screen;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.res.Resources;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.iac_dialer.impl_module.active_call_processing.mediator.c;
import com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenFragment;
import com.avito.android.iac_dialer_root.public_module.deeplink.IacLauncherIntentLink;
import com.avito.android.screen_flow.link.ScreenFlowLink;
import java.util.List;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.V0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import xK.InterfaceC49851a;
import xK.InterfaceC49853c;

/* compiled from: IacCallScreenFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenFragment$subscribeToDialerEvents$1", f = "IacCallScreenFragment.kt", i = {}, l = {196}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes14.dex */
final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f166239q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f166240r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ IacCallScreenFragment f166241s;

    /* compiled from: IacCallScreenFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenFragment$subscribeToDialerEvents$1$1", f = "IacCallScreenFragment.kt", i = {}, l = {194}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.iac_dialer.impl_module.screens.call_screen.a$a, reason: collision with other inner class name */
    public static final class C4928a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f166242q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ IacCallScreenFragment f166243r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ e2 f166244s;

        /* compiled from: IacCallScreenFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LxK/c;", "it", "Lkotlin/G0;", "emit", "(LxK/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_dialer.impl_module.screens.call_screen.a$a$a, reason: collision with other inner class name */
        public static final class C4929a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ e2 f166245b;

            public C4929a(e2 e2Var) {
                this.f166245b = e2Var;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                this.f166245b.K5((InterfaceC49853c) obj);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C4928a(IacCallScreenFragment iacCallScreenFragment, Continuation continuation, e2 e2Var) {
            super(2, continuation);
            this.f166243r = iacCallScreenFragment;
            this.f166244s = e2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new C4928a(this.f166243r, continuation, this.f166244s);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C4928a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f166242q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC49851a interfaceC49851a = this.f166243r.f166229p0;
                if (interfaceC49851a == null) {
                    interfaceC49851a = null;
                }
                c events = interfaceC49851a.getEvents();
                C4929a c4929a = new C4929a(this.f166244s);
                this.f166242q = 1;
                if (events.collect(c4929a, this) == coroutine_suspended) {
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

    /* compiled from: IacCallScreenFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenFragment$subscribeToDialerEvents$1$2", f = "IacCallScreenFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f166246q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ e2 f166247r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ IacCallScreenFragment f166248s;

        /* compiled from: IacCallScreenFragment.kt */
        @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\b\u0010\u0001\u001a\u0004\u0018\u00010\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "invoke", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.iac_dialer.impl_module.screens.call_screen.a$b$a, reason: collision with other inner class name */
        public static final class C4930a extends N implements Y41.l<Throwable, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ IacCallScreenFragment f166249l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ e2 f166250m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4930a(IacCallScreenFragment iacCallScreenFragment, e2 e2Var) {
                super(1);
                this.f166249l = iacCallScreenFragment;
                this.f166250m = e2Var;
            }

            @Override // Y41.l
            public final G0 invoke(Throwable th2) {
                com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(this.f166249l.f166237x0, "stop subscription to screenEventsFlow", null);
                this.f166250m.h4();
                return G0.f406611a;
            }
        }

        /* compiled from: IacCallScreenFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.iac_dialer.impl_module.screens.call_screen.IacCallScreenFragment$subscribeToDialerEvents$1$2$job$1", f = "IacCallScreenFragment.kt", i = {}, l = {202}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.iac_dialer.impl_module.screens.call_screen.a$b$b, reason: collision with other inner class name */
        public static final class C4931b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f166251q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ e2 f166252r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ IacCallScreenFragment f166253s;

            /* compiled from: IacCallScreenFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LxK/c;", "it", "Lkotlin/G0;", "emit", "(LxK/c;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.iac_dialer.impl_module.screens.call_screen.a$b$b$a, reason: collision with other inner class name */
            public static final class C4932a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ IacCallScreenFragment f166254b;

                public C4932a(IacCallScreenFragment iacCallScreenFragment) {
                    this.f166254b = iacCallScreenFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) throws Resources.NotFoundException {
                    InterfaceC49853c interfaceC49853c = (InterfaceC49853c) obj;
                    IacCallScreenFragment.a aVar = IacCallScreenFragment.f166225y0;
                    IacCallScreenFragment iacCallScreenFragment = this.f166254b;
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a.a(iacCallScreenFragment.f166237x0, "handleEvent: " + interfaceC49853c, null);
                    if (!(interfaceC49853c instanceof InterfaceC49853c.h) && !(interfaceC49853c instanceof InterfaceC49853c.a) && !(interfaceC49853c instanceof InterfaceC49853c.C12866c)) {
                        if (interfaceC49853c instanceof InterfaceC49853c.b) {
                            iacCallScreenFragment.requireActivity().finish();
                        } else {
                            if (interfaceC49853c instanceof InterfaceC49853c.d) {
                                ((InterfaceC49853c.d) interfaceC49853c).getClass();
                                throw null;
                            }
                            if (interfaceC49853c instanceof InterfaceC49853c.e) {
                                com.avito.android.iac_dialer.impl_module.screens.call_screen.permission.b bVar = iacCallScreenFragment.f166230q0;
                                InterfaceC49853c.e eVar = (InterfaceC49853c.e) interfaceC49853c;
                                (bVar != null ? bVar : null).a(eVar.f442382a, eVar.f442383b, eVar.f442384c, eVar.f442385d, eVar.f442386e);
                            } else if (interfaceC49853c instanceof InterfaceC49853c.f) {
                                com.avito.android.iac_dialer.impl_module.screens.call_screen.permission.b bVar2 = iacCallScreenFragment.f166230q0;
                                InterfaceC49853c.f fVar = (InterfaceC49853c.f) interfaceC49853c;
                                (bVar2 != null ? bVar2 : null).b(fVar.f442387a, fVar.f442388b, fVar.f442389c, fVar.f442390d);
                            } else if (interfaceC49853c instanceof InterfaceC49853c.g) {
                                ScreenFlowLink screenFlowLink = new ScreenFlowLink(new IacLauncherIntentLink(false), ((InterfaceC49853c.g) interfaceC49853c).f442391a.unwrap());
                                com.avito.android.deeplink_handler.handler.composite.a aVar2 = iacCallScreenFragment.f166232s0;
                                if (aVar2 == null) {
                                    aVar2 = null;
                                }
                                b.a.a(aVar2, screenFlowLink, null, null, 6);
                            }
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C4931b(IacCallScreenFragment iacCallScreenFragment, Continuation continuation, e2 e2Var) {
                super(2, continuation);
                this.f166252r = e2Var;
                this.f166253s = iacCallScreenFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new C4931b(this.f166253s, continuation, this.f166252r);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C4931b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f166251q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    e2 e2Var = this.f166252r;
                    List listE3 = e2Var.E3();
                    com.avito.android.iac_dialer_watcher.public_module.logging.logger.b bVar = com.avito.android.iac_dialer_watcher.public_module.logging.logger.b.f168184a;
                    IacCallScreenFragment iacCallScreenFragment = this.f166253s;
                    bVar.a(iacCallScreenFragment.f166237x0, "start subscription to screenEventsFlow, events in queue(" + listE3.size() + "): " + listE3, null);
                    C4932a c4932a = new C4932a(iacCallScreenFragment);
                    this.f166251q = 1;
                    if (e2.g(e2Var, c4932a, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i12 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    C42729a0.b(obj);
                }
                throw new KotlinNothingValueException();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(IacCallScreenFragment iacCallScreenFragment, Continuation continuation, e2 e2Var) {
            super(2, continuation);
            this.f166247r = e2Var;
            this.f166248s = iacCallScreenFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = new b(this.f166248s, continuation, this.f166247r);
            bVar.f166246q = obj;
            return bVar;
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
            T t12 = (T) this.f166246q;
            e2 e2Var = this.f166247r;
            IacCallScreenFragment iacCallScreenFragment = this.f166248s;
            ((V0) C43259k.d(t12, null, null, new C4931b(iacCallScreenFragment, null, e2Var), 3)).k(new C4930a(iacCallScreenFragment, e2Var));
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(IacCallScreenFragment iacCallScreenFragment, Continuation<? super a> continuation) {
        super(2, continuation);
        this.f166241s = iacCallScreenFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        a aVar = new a(this.f166241s, continuation);
        aVar.f166240r = obj;
        return aVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f166239q;
        if (i12 == 0) {
            C42729a0.b(obj);
            T t12 = (T) this.f166240r;
            e2 e2VarA = f2.a(8, 0, BufferOverflow.f410778c);
            IacCallScreenFragment iacCallScreenFragment = this.f166241s;
            C43259k.d(t12, null, null, new C4928a(iacCallScreenFragment, null, e2VarA), 3);
            Lifecycle.State state = Lifecycle.State.f46682e;
            b bVar = new b(iacCallScreenFragment, null, e2VarA);
            this.f166239q = 1;
            if (C23056p0.b(iacCallScreenFragment, state, bVar, this) == coroutine_suspended) {
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
