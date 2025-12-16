package com.avito.android.virtual_deal_room.client_edit;

import CN0.b;
import Cd.C13243a;
import Gf0.ViewOnClickListenerC13875b;
import Y41.p;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.R;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.virtual_deal_room.VDRClientEditScreen;
import com.avito.android.virtual_deal_room.client_edit.model.ClientEditArguments;
import com.avito.android.virtual_deal_room.client_edit.model.ClientSaveResult;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.KotlinNothingValueException;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.n2;
import kr.C43490a;
import z1.AbstractC50339a;

/* compiled from: ClientEditDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/ClientEditDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClientEditDialogFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final a f326105o0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.virtual_deal_room.client_edit.i f326106h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f326107i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f326108j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.virtual_deal_room.client_edit.f f326109k0;

    /* renamed from: l0, reason: collision with root package name */
    public boolean f326110l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f326111m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f326112n0;

    /* compiled from: ClientEditDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/ClientEditDialogFragment$a;", "", "<init>", "()V", "_avito_virtual-deal-room_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ClientEditDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room.client_edit.ClientEditDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C10077a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ClientEditArguments f326113l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10077a(ClientEditArguments clientEditArguments) {
                super(1);
                this.f326113l = clientEditArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("client_edit_arguments", this.f326113l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ClientEditDialogFragment a(@Y61.k ClientEditArguments clientEditArguments) {
            ClientEditDialogFragment clientEditDialogFragment = new ClientEditDialogFragment();
            C35966w1.a(clientEditDialogFragment, -1, new C10077a(clientEditArguments));
            return clientEditDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: ClientEditDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/virtual_deal_room/client_edit/model/ClientEditArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ClientEditArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ClientEditArguments invoke() {
            Parcelable parcelable = ClientEditDialogFragment.this.requireArguments().getParcelable("client_edit_arguments");
            if (parcelable != null) {
                return (ClientEditArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: ClientEditDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room.client_edit.ClientEditDialogFragment$onCreateDialog$1", f = "ClientEditDialogFragment.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326115q;

        /* compiled from: ClientEditDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.virtual_deal_room.client_edit.ClientEditDialogFragment$onCreateDialog$1$1", f = "ClientEditDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f326117q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ClientEditDialogFragment f326118r;

            /* compiled from: ClientEditDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.virtual_deal_room.client_edit.ClientEditDialogFragment$onCreateDialog$1$1$1", f = "ClientEditDialogFragment.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.virtual_deal_room.client_edit.ClientEditDialogFragment$c$a$a, reason: collision with other inner class name */
            public static final class C10078a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f326119q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ClientEditDialogFragment f326120r;

                /* compiled from: ClientEditDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.virtual_deal_room.client_edit.ClientEditDialogFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C10079a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.virtual_deal_room.client_edit.c f326121b;

                    public C10079a(com.avito.android.virtual_deal_room.client_edit.c cVar) {
                        this.f326121b = cVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f326121b.c((CN0.c) obj);
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f326121b, com.avito.android.virtual_deal_room.client_edit.c.class, "render", "render(Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10078a(ClientEditDialogFragment clientEditDialogFragment, Continuation<? super C10078a> continuation) {
                    super(2, continuation);
                    this.f326120r = clientEditDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C10078a(this.f326120r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C10078a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f326119q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ClientEditDialogFragment clientEditDialogFragment = this.f326120r;
                        n2<CN0.c> state = ((com.avito.android.virtual_deal_room.client_edit.h) clientEditDialogFragment.f326107i0.getValue()).getState();
                        com.avito.android.virtual_deal_room.client_edit.f fVar = clientEditDialogFragment.f326109k0;
                        if (fVar == null) {
                            fVar = null;
                        }
                        C10079a c10079a = new C10079a(fVar);
                        this.f326119q = 1;
                        if (state.collect(c10079a, this) == coroutine_suspended) {
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

            /* compiled from: ClientEditDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.virtual_deal_room.client_edit.ClientEditDialogFragment$onCreateDialog$1$1$2", f = "ClientEditDialogFragment.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f326122q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ClientEditDialogFragment f326123r;

                /* compiled from: ClientEditDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.virtual_deal_room.client_edit.ClientEditDialogFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C10080a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ClientEditDialogFragment f326124b;

                    public C10080a(ClientEditDialogFragment clientEditDialogFragment) {
                        this.f326124b = clientEditDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        View viewV;
                        CN0.b bVar = (CN0.b) obj;
                        a aVar = ClientEditDialogFragment.f326105o0;
                        ClientEditDialogFragment clientEditDialogFragment = this.f326124b;
                        if (bVar instanceof b.a) {
                            String tag = clientEditDialogFragment.getTag();
                            if (tag == null) {
                                tag = "";
                            }
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("client_edit_result", ((b.a) bVar).f2138a);
                            G0 g02 = G0.f406611a;
                            clientEditDialogFragment.getParentFragmentManager().o0(bundle, tag);
                            clientEditDialogFragment.f326110l0 = true;
                            clientEditDialogFragment.dismiss();
                        } else if (L.f(bVar, b.C0106b.f2139a)) {
                            clientEditDialogFragment.f326110l0 = false;
                            clientEditDialogFragment.dismiss();
                        } else {
                            if (bVar instanceof b.d) {
                                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(clientEditDialogFragment.getContext(), R.style.Theme_DesignSystem_Re23);
                                com.avito.android.lib.design.bottom_sheet.d dVar2 = clientEditDialogFragment.f326111m0;
                                if (dVar2 != null && (viewV = dVar2.v()) != null) {
                                    C43490a.a(dVar, new ToastBarState(((b.d) bVar).f2141a, viewV, null, null, null, null, null, 0, false, false, null, null, 4092, null), null, 28);
                                }
                            } else if (bVar instanceof b.e) {
                                com.avito.android.virtual_deal_room.client_edit.f fVar = clientEditDialogFragment.f326109k0;
                                (fVar != null ? fVar : null).e(((b.e) bVar).f2142a, R.id.name_container);
                            } else if (bVar instanceof b.h) {
                                com.avito.android.virtual_deal_room.client_edit.f fVar2 = clientEditDialogFragment.f326109k0;
                                (fVar2 != null ? fVar2 : null).e(((b.h) bVar).f2145a, R.id.surname_container);
                            } else if (bVar instanceof b.c) {
                                com.avito.android.virtual_deal_room.client_edit.f fVar3 = clientEditDialogFragment.f326109k0;
                                (fVar3 != null ? fVar3 : null).e(((b.c) bVar).f2140a, R.id.email_container);
                            } else if (bVar instanceof b.g) {
                                com.avito.android.virtual_deal_room.client_edit.f fVar4 = clientEditDialogFragment.f326109k0;
                                (fVar4 != null ? fVar4 : null).e(((b.g) bVar).f2144a, R.id.phone_container);
                            } else if (bVar instanceof b.f) {
                                com.avito.android.virtual_deal_room.client_edit.f fVar5 = clientEditDialogFragment.f326109k0;
                                (fVar5 != null ? fVar5 : null).e(((b.f) bVar).f2143a, R.id.patronymic_container);
                            }
                        }
                        G0 g03 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g03;
                    }

                    public final boolean equals(@Y61.l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f326124b, ClientEditDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/virtual_deal_room/client_edit/mvi/entity/ClientEditOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ClientEditDialogFragment clientEditDialogFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f326123r = clientEditDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f326123r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f326122q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ClientEditDialogFragment clientEditDialogFragment = this.f326123r;
                        InterfaceC43160i<CN0.b> events = ((com.avito.android.virtual_deal_room.client_edit.h) clientEditDialogFragment.f326107i0.getValue()).getEvents();
                        C10080a c10080a = new C10080a(clientEditDialogFragment);
                        this.f326122q = 1;
                        if (events.collect(c10080a, this) == coroutine_suspended) {
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
            public a(ClientEditDialogFragment clientEditDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f326118r = clientEditDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f326118r, continuation);
                aVar.f326117q = obj;
                return aVar;
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
                T t12 = (T) this.f326117q;
                ClientEditDialogFragment clientEditDialogFragment = this.f326118r;
                C43259k.d(t12, null, null, new C10078a(clientEditDialogFragment, null), 3);
                C43259k.d(t12, null, null, new b(clientEditDialogFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ClientEditDialogFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f326115q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                ClientEditDialogFragment clientEditDialogFragment = ClientEditDialogFragment.this;
                a aVar = new a(clientEditDialogFragment, null);
                this.f326115q = 1;
                if (C23056p0.b(clientEditDialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ClientEditDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.virtual_deal_room.client_edit.c) this.receiver).b(view);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.virtual_deal_room.client_edit.c) this.receiver).a(view);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientEditDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LCN0/a;", "it", "Lkotlin/G0;", "invoke", "(LCN0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<CN0.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(CN0.a aVar) {
            ((com.avito.android.virtual_deal_room.client_edit.h) ClientEditDialogFragment.this.f326107i0.getValue()).accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f326126l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f326126l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f326126l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<Fragment> {
        public h() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return ClientEditDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f326128l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f326128l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f326128l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f326129l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f326129l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f326129l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f326130l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f326130l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f326130l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ClientEditDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room/client_edit/h;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/virtual_deal_room/client_edit/h;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.virtual_deal_room.client_edit.h> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.virtual_deal_room.client_edit.h invoke() {
            com.avito.android.virtual_deal_room.client_edit.i iVar = ClientEditDialogFragment.this.f326106h0;
            if (iVar == null) {
                iVar = null;
            }
            return (com.avito.android.virtual_deal_room.client_edit.h) iVar.get();
        }
    }

    public ClientEditDialogFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f326107i0 = new O0(m0.f406844a.b(com.avito.android.virtual_deal_room.client_edit.h.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f326112n0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.virtual_deal_room.client_edit.di.b.a().a((HN0.a) C29972i.a(C29972i.b(this), HN0.a.class), new C28478k(VDRClientEditScreen.f326098d, s.b(this), null, 4, null), (ClientEditArguments) this.f326112n0.getValue(), new f(), getLifecycle(), C22981N.a(getLifecycle())).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f326108j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    @SuppressLint({"InflateParams"})
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        View view;
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(requireContext(), 0, 2, null);
        dVar.S(C35835l0.g(dVar.getContext()).y);
        dVar.K(true);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.virtual_deal_room_edit_client_header, (ViewGroup) null);
        com.avito.android.virtual_deal_room.client_edit.f fVar = this.f326109k0;
        if (fVar == null) {
            fVar = null;
        }
        if (viewInflate != null) {
            fVar.getClass();
            View viewFindViewById = viewInflate.findViewById(R.id.edit_client_bottom_sheet_close_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ((ImageView) viewFindViewById).setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(fVar, 15));
            viewInflate.setOnClickListener(new ViewOnClickListenerC13875b(viewInflate, 1));
            view = viewInflate;
        } else {
            view = null;
        }
        fVar.f326160d = view;
        dVar.H(viewInflate);
        com.avito.android.virtual_deal_room.client_edit.f fVar2 = this.f326109k0;
        d dVar2 = new d(1, fVar2 != null ? fVar2 : null, com.avito.android.virtual_deal_room.client_edit.c.class, "setContentView", "setContentView(Landroid/view/View;)V", 0);
        com.avito.android.virtual_deal_room.client_edit.f fVar3 = this.f326109k0;
        dVar.B(R.layout.virtual_deal_room_edit_client_layout, R.layout.virtual_deal_room_common_edit_dialog_footer, dVar2, new e(1, fVar3 != null ? fVar3 : null, com.avito.android.virtual_deal_room.client_edit.c.class, "setFooterView", "setFooterView(Landroid/view/View;)V", 0), false);
        this.f326111m0 = dVar;
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.virtual_deal_room.client_edit.f fVar = this.f326109k0;
        if (fVar == null) {
            fVar = null;
        }
        fVar.a(null);
        fVar.f326160d = null;
        fVar.b(null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f326110l0) {
            return;
        }
        String tag = getTag();
        if (tag == null) {
            tag = "";
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("client_edit_result", ClientSaveResult.Dismissed.f326196b);
        G0 g02 = G0.f406611a;
        getParentFragmentManager().o0(bundle, tag);
    }
}
