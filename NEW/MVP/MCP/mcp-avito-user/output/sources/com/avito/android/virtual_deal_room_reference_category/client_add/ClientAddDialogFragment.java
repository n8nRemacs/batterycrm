package com.avito.android.virtual_deal_room_reference_category.client_add;

import Cd.C13243a;
import Gf0.ViewOnClickListenerC13875b;
import Y41.p;
import android.annotation.SuppressLint;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Build;
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
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.state.ToastBarState;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import com.avito.android.virtual_deal_room_reference_category.client_add.model.ClientAddArguments;
import com.avito.android.virtual_deal_room_reference_category.client_add.model.ClientAddSaveResult;
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
import rO0.C47580d;
import rO0.InterfaceC47577a;
import rO0.InterfaceC47579c;
import z1.AbstractC50339a;

/* compiled from: ClientAddDialogFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/client_add/ClientAddDialogFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ClientAddDialogFragment extends BaseDialogFragment implements InterfaceC28477j.a {

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f327120n0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.virtual_deal_room_reference_category.client_add.j f327121h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f327122i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public com.avito.android.virtual_deal_room_reference_category.client_add.g f327123j0;

    /* renamed from: k0, reason: collision with root package name */
    public boolean f327124k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.lib.design.bottom_sheet.d f327125l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f327126m0;

    /* compiled from: ClientAddDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/client_add/ClientAddDialogFragment$a;", "", "<init>", "()V", "_avito_virtual-deal-room-reference-category_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: ClientAddDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddDialogFragment$a$a, reason: collision with other inner class name */
        public static final class C10135a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ ClientAddArguments f327127l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10135a(ClientAddArguments clientAddArguments) {
                super(1);
                this.f327127l = clientAddArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("client_add_arguments", this.f327127l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static ClientAddDialogFragment a(@Y61.k ClientAddArguments clientAddArguments) {
            ClientAddDialogFragment clientAddDialogFragment = new ClientAddDialogFragment();
            C35966w1.a(clientAddDialogFragment, -1, new C10135a(clientAddArguments));
            return clientAddDialogFragment;
        }

        public a() {
        }
    }

    /* compiled from: ClientAddDialogFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/virtual_deal_room_reference_category/client_add/model/ClientAddArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<ClientAddArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final ClientAddArguments invoke() {
            Bundle bundleRequireArguments = ClientAddDialogFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("client_add_arguments", ClientAddArguments.class) : bundleRequireArguments.getParcelable("client_add_arguments");
            if (parcelable != null) {
                return (ClientAddArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: ClientAddDialogFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddDialogFragment$onCreateDialog$1", f = "ClientAddDialogFragment.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f327129q;

        /* compiled from: ClientAddDialogFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddDialogFragment$onCreateDialog$1$1", f = "ClientAddDialogFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f327131q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ ClientAddDialogFragment f327132r;

            /* compiled from: ClientAddDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddDialogFragment$onCreateDialog$1$1$1", f = "ClientAddDialogFragment.kt", i = {}, l = {96}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddDialogFragment$c$a$a, reason: collision with other inner class name */
            public static final class C10136a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f327133q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ClientAddDialogFragment f327134r;

                /* compiled from: ClientAddDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddDialogFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C10137a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ com.avito.android.virtual_deal_room_reference_category.client_add.d f327135b;

                    public C10137a(com.avito.android.virtual_deal_room_reference_category.client_add.d dVar) {
                        this.f327135b = dVar;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        this.f327135b.c((C47580d) obj);
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
                        return new C42801a(2, this.f327135b, com.avito.android.virtual_deal_room_reference_category.client_add.d.class, "render", "render(Lcom/avito/android/virtual_deal_room_reference_category/client_add/mvi/entity/ClientAddState;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10136a(ClientAddDialogFragment clientAddDialogFragment, Continuation<? super C10136a> continuation) {
                    super(2, continuation);
                    this.f327134r = clientAddDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C10136a(this.f327134r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C10136a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f327133q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ClientAddDialogFragment clientAddDialogFragment = this.f327134r;
                        n2<C47580d> state = ((com.avito.android.virtual_deal_room_reference_category.client_add.i) clientAddDialogFragment.f327122i0.getValue()).getState();
                        com.avito.android.virtual_deal_room_reference_category.client_add.g gVar = clientAddDialogFragment.f327123j0;
                        if (gVar == null) {
                            gVar = null;
                        }
                        C10137a c10137a = new C10137a(gVar);
                        this.f327133q = 1;
                        if (state.collect(c10137a, this) == coroutine_suspended) {
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

            /* compiled from: ClientAddDialogFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddDialogFragment$onCreateDialog$1$1$2", f = "ClientAddDialogFragment.kt", i = {}, l = {99}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f327136q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ ClientAddDialogFragment f327137r;

                /* compiled from: ClientAddDialogFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.virtual_deal_room_reference_category.client_add.ClientAddDialogFragment$c$a$b$a, reason: collision with other inner class name */
                public /* synthetic */ class C10138a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ ClientAddDialogFragment f327138b;

                    public C10138a(ClientAddDialogFragment clientAddDialogFragment) {
                        this.f327138b = clientAddDialogFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        View viewV;
                        InterfaceC47579c interfaceC47579c = (InterfaceC47579c) obj;
                        a aVar = ClientAddDialogFragment.f327120n0;
                        ClientAddDialogFragment clientAddDialogFragment = this.f327138b;
                        if (interfaceC47579c instanceof InterfaceC47579c.a) {
                            String tag = clientAddDialogFragment.getTag();
                            if (tag == null) {
                                tag = "";
                            }
                            Bundle bundle = new Bundle();
                            bundle.putParcelable("client_add_result", ((InterfaceC47579c.a) interfaceC47579c).f429794a);
                            G0 g02 = G0.f406611a;
                            clientAddDialogFragment.getParentFragmentManager().o0(bundle, tag);
                            clientAddDialogFragment.f327124k0 = true;
                            clientAddDialogFragment.dismiss();
                        } else if (L.f(interfaceC47579c, InterfaceC47579c.b.f429795a)) {
                            clientAddDialogFragment.f327124k0 = false;
                            clientAddDialogFragment.dismiss();
                        } else {
                            if (interfaceC47579c instanceof InterfaceC47579c.d) {
                                androidx.appcompat.view.d dVar = new androidx.appcompat.view.d(clientAddDialogFragment.getContext(), R.style.Theme_DesignSystem_Re23);
                                com.avito.android.lib.design.bottom_sheet.d dVar2 = clientAddDialogFragment.f327125l0;
                                if (dVar2 != null && (viewV = dVar2.v()) != null) {
                                    C43490a.a(dVar, new ToastBarState(((InterfaceC47579c.d) interfaceC47579c).f429797a, viewV, null, null, null, null, null, 0, false, false, null, null, 4092, null), null, 28);
                                }
                            } else if (interfaceC47579c instanceof InterfaceC47579c.e) {
                                com.avito.android.virtual_deal_room_reference_category.client_add.g gVar = clientAddDialogFragment.f327123j0;
                                (gVar != null ? gVar : null).e(((InterfaceC47579c.e) interfaceC47579c).f429798a, R.id.name_container);
                            } else if (interfaceC47579c instanceof InterfaceC47579c.g) {
                                com.avito.android.virtual_deal_room_reference_category.client_add.g gVar2 = clientAddDialogFragment.f327123j0;
                                (gVar2 != null ? gVar2 : null).e(((InterfaceC47579c.g) interfaceC47579c).f429800a, R.id.surname_container);
                            } else if (interfaceC47579c instanceof InterfaceC47579c.C12374c) {
                                com.avito.android.virtual_deal_room_reference_category.client_add.g gVar3 = clientAddDialogFragment.f327123j0;
                                (gVar3 != null ? gVar3 : null).e(((InterfaceC47579c.C12374c) interfaceC47579c).f429796a, R.id.email_container);
                            } else if (interfaceC47579c instanceof InterfaceC47579c.f) {
                                com.avito.android.virtual_deal_room_reference_category.client_add.g gVar4 = clientAddDialogFragment.f327123j0;
                                (gVar4 != null ? gVar4 : null).e(((InterfaceC47579c.f) interfaceC47579c).f429799a, R.id.phone_container);
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
                        return new C42801a(2, this.f327138b, ClientAddDialogFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/virtual_deal_room_reference_category/client_add/mvi/entity/ClientAddOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(ClientAddDialogFragment clientAddDialogFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f327137r = clientAddDialogFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f327137r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f327136q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        ClientAddDialogFragment clientAddDialogFragment = this.f327137r;
                        InterfaceC43160i<InterfaceC47579c> events = ((com.avito.android.virtual_deal_room_reference_category.client_add.i) clientAddDialogFragment.f327122i0.getValue()).getEvents();
                        C10138a c10138a = new C10138a(clientAddDialogFragment);
                        this.f327136q = 1;
                        if (events.collect(c10138a, this) == coroutine_suspended) {
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
            public a(ClientAddDialogFragment clientAddDialogFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f327132r = clientAddDialogFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f327132r, continuation);
                aVar.f327131q = obj;
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
                T t12 = (T) this.f327131q;
                ClientAddDialogFragment clientAddDialogFragment = this.f327132r;
                C43259k.d(t12, null, null, new C10136a(clientAddDialogFragment, null), 3);
                C43259k.d(t12, null, null, new b(clientAddDialogFragment, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return ClientAddDialogFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f327129q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                ClientAddDialogFragment clientAddDialogFragment = ClientAddDialogFragment.this;
                a aVar = new a(clientAddDialogFragment, null);
                this.f327129q = 1;
                if (C23056p0.b(clientAddDialogFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: ClientAddDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.virtual_deal_room_reference_category.client_add.d) this.receiver).b(view);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientAddDialogFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class e extends H implements Y41.l<View, G0> {
        @Override // Y41.l
        public final G0 invoke(View view) {
            ((com.avito.android.virtual_deal_room_reference_category.client_add.d) this.receiver).a(view);
            return G0.f406611a;
        }
    }

    /* compiled from: ClientAddDialogFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LrO0/a;", "it", "Lkotlin/G0;", "invoke", "(LrO0/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<InterfaceC47577a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(InterfaceC47577a interfaceC47577a) {
            ((com.avito.android.virtual_deal_room_reference_category.client_add.i) ClientAddDialogFragment.this.f327122i0.getValue()).accept(interfaceC47577a);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f327140l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f327140l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f327140l);
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
            return ClientAddDialogFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f327142l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f327142l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f327142l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f327143l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f327143l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f327143l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f327144l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f327144l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f327144l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: ClientAddDialogFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_reference_category/client_add/i;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/virtual_deal_room_reference_category/client_add/i;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.virtual_deal_room_reference_category.client_add.i> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.virtual_deal_room_reference_category.client_add.i invoke() {
            com.avito.android.virtual_deal_room_reference_category.client_add.j jVar = ClientAddDialogFragment.this.f327121h0;
            if (jVar == null) {
                jVar = null;
            }
            return (com.avito.android.virtual_deal_room_reference_category.client_add.i) jVar.get();
        }
    }

    public ClientAddDialogFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f327122i0 = new O0(m0.f406844a.b(com.avito.android.virtual_deal_room_reference_category.client_add.i.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f327126m0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        com.avito.android.virtual_deal_room_reference_category.client_add.di.c.a().a((com.avito.android.virtual_deal_room_reference_category.client_add.di.b) C29972i.a(C29972i.b(this), com.avito.android.virtual_deal_room_reference_category.client_add.di.b.class), (ClientAddArguments) this.f327126m0.getValue(), new f(), getLifecycle(), C22981N.a(getLifecycle())).a(this);
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
        View viewInflate = LayoutInflater.from(requireContext()).inflate(R.layout.virtual_deal_room_reference_category_add_client_header, (ViewGroup) null);
        com.avito.android.virtual_deal_room_reference_category.client_add.g gVar = this.f327123j0;
        if (gVar == null) {
            gVar = null;
        }
        if (viewInflate != null) {
            gVar.getClass();
            View viewFindViewById = viewInflate.findViewById(R.id.bottom_sheet_close_button);
            if (viewFindViewById == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.ImageView");
            }
            ((ImageView) viewFindViewById).setOnClickListener(new com.avito.android.user_adverts.root_screen.adverts_host.host_view.g(gVar, 16));
            viewInflate.setOnClickListener(new ViewOnClickListenerC13875b(viewInflate, 3));
            view = viewInflate;
        } else {
            view = null;
        }
        gVar.f327160d = view;
        dVar.H(viewInflate);
        com.avito.android.virtual_deal_room_reference_category.client_add.g gVar2 = this.f327123j0;
        d dVar2 = new d(1, gVar2 != null ? gVar2 : null, com.avito.android.virtual_deal_room_reference_category.client_add.d.class, "setContentView", "setContentView(Landroid/view/View;)V", 0);
        com.avito.android.virtual_deal_room_reference_category.client_add.g gVar3 = this.f327123j0;
        dVar.B(R.layout.virtual_deal_room_reference_category_add_client_layout, R.layout.virtual_deal_room_reference_category_common_add_dialog_footer, dVar2, new e(1, gVar3 != null ? gVar3 : null, com.avito.android.virtual_deal_room_reference_category.client_add.d.class, "setFooterView", "setFooterView(Landroid/view/View;)V", 0), false);
        this.f327125l0 = dVar;
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        return dVar;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.virtual_deal_room_reference_category.client_add.g gVar = this.f327123j0;
        if (gVar == null) {
            gVar = null;
        }
        gVar.a(null);
        gVar.f327160d = null;
        gVar.b(null);
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        super.onDismiss(dialogInterface);
        if (this.f327124k0) {
            return;
        }
        String tag = getTag();
        if (tag == null) {
            tag = "";
        }
        Bundle bundle = new Bundle();
        bundle.putParcelable("client_add_result", ClientAddSaveResult.Dismissed.f327184b);
        G0 g02 = G0.f406611a;
        getParentFragmentManager().o0(bundle, tag);
    }
}
