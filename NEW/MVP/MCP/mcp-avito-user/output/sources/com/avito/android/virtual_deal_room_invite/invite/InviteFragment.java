package com.avito.android.virtual_deal_room_invite.invite;

import Cd.C13243a;
import Y41.p;
import Y61.l;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.SpannableString;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ScrollView;
import android.widget.TextView;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22969B;
import androidx.view.InterfaceC22983P;
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
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.component.toast.f;
import com.avito.android.deeplink_handler.handler.b;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.remote.model.Image;
import com.avito.android.remote.model.Size;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.android.util.C35966w1;
import com.avito.android.util.D6;
import com.avito.android.virtual_deal_room_invite.VDRInviteScreen;
import com.avito.android.virtual_deal_room_invite.invite.model.CounterColor;
import com.avito.android.virtual_deal_room_invite.invite.model.InvitationArguments;
import com.avito.android.virtual_deal_room_invite.invite.view.InviteInfoView;
import com.facebook.imageutils.JfifUtil;
import dO0.C39608a;
import fO0.InterfaceC40325a;
import fv.C40482a;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
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
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kv.C43501a;
import nO0.C44303d;
import nO0.InterfaceC44300a;
import nO0.InterfaceC44302c;
import nO0.InterfaceC44304e;
import okhttp3.internal.ws.WebSocketProtocol;
import z1.AbstractC50339a;

/* compiled from: InviteFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/InviteFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class InviteFragment extends BaseFragment implements InterfaceC28477j.b {

    /* renamed from: t0, reason: collision with root package name */
    @Y61.k
    public static final a f326931t0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public com.avito.android.virtual_deal_room_invite.invite.d f326932n0;

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public final O0 f326933o0;

    /* renamed from: p0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f326934p0;

    /* renamed from: q0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f326935q0;

    /* renamed from: r0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f326936r0;

    /* renamed from: s0, reason: collision with root package name */
    @l
    public com.avito.android.virtual_deal_room_invite.invite.view.c f326937s0;

    /* compiled from: InviteFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/InviteFragment$a;", "", "<init>", "()V", "_avito_virtual-deal-room-invite_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: InviteFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.virtual_deal_room_invite.invite.InviteFragment$a$a, reason: collision with other inner class name */
        public static final class C10116a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ InvitationArguments f326938l;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10116a(InvitationArguments invitationArguments) {
                super(1);
                this.f326938l = invitationArguments;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("arguments", this.f326938l);
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static InviteFragment a(@Y61.k InvitationArguments invitationArguments) {
            InviteFragment inviteFragment = new InviteFragment();
            C35966w1.a(inviteFragment, -1, new C10116a(invitationArguments));
            return inviteFragment;
        }

        public a() {
        }
    }

    /* compiled from: InviteFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/virtual_deal_room_invite/invite/model/InvitationArguments;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<InvitationArguments> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final InvitationArguments invoke() {
            Bundle bundleRequireArguments = InviteFragment.this.requireArguments();
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) bundleRequireArguments.getParcelable("arguments", Parcelable.class) : bundleRequireArguments.getParcelable("arguments");
            if (parcelable != null) {
                return (InvitationArguments) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: InviteFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.InviteFragment$onCreate$1", f = "InviteFragment.kt", i = {}, l = {89}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326940q;

        /* compiled from: InviteFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.InviteFragment$onCreate$1$1", f = "InviteFragment.kt", i = {}, l = {91}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f326942q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InviteFragment f326943r;

            /* compiled from: InviteFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkv/a;", "it", "Lkotlin/G0;", "<anonymous>", "(Lkv/a;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.InviteFragment$onCreate$1$1$1", f = "InviteFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.virtual_deal_room_invite.invite.InviteFragment$c$a$a, reason: collision with other inner class name */
            public static final class C10117a extends SuspendLambda implements p<C43501a, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public final /* synthetic */ InviteFragment f326944q;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10117a(InviteFragment inviteFragment, Continuation<? super C10117a> continuation) {
                    super(2, continuation);
                    this.f326944q = inviteFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C10117a(this.f326944q, continuation);
                }

                @Override // Y41.p
                public final Object invoke(C43501a c43501a, Continuation<? super G0> continuation) {
                    return ((C10117a) create(c43501a, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    this.f326944q.requireActivity().finish();
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InviteFragment inviteFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f326943r = inviteFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                return new a(this.f326943r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f326942q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    InviteFragment inviteFragment = this.f326943r;
                    com.avito.android.deeplink_handler.handler.composite.a aVar = inviteFragment.f326935q0;
                    if (aVar == null) {
                        aVar = null;
                    }
                    InterfaceC43160i<C43501a> interfaceC43160iB = C40482a.b(aVar);
                    C10117a c10117a = new C10117a(inviteFragment, null);
                    this.f326942q = 1;
                    if (C43175k.j(interfaceC43160iB, c10117a, this) == coroutine_suspended) {
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

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return InviteFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f326940q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46681d;
                InviteFragment inviteFragment = InviteFragment.this;
                a aVar = new a(inviteFragment, null);
                this.f326940q = 1;
                if (C23056p0.b(inviteFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: InviteFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class d extends H implements Y41.l<InterfaceC44300a, G0> {
        @Override // Y41.l
        public final G0 invoke(InterfaceC44300a interfaceC44300a) {
            ((com.avito.android.virtual_deal_room_invite.invite.c) this.receiver).accept(interfaceC44300a);
            return G0.f406611a;
        }
    }

    /* compiled from: InviteFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.InviteFragment$onCreateView$2$1", f = "InviteFragment.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f326945q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f326946r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ InviteFragment f326947s;

        /* compiled from: InviteFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.InviteFragment$onCreateView$2$1$1", f = "InviteFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f326948q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InviteFragment f326949r;

            /* compiled from: InviteFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.InviteFragment$onCreateView$2$1$1$1", f = "InviteFragment.kt", i = {}, l = {117}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.virtual_deal_room_invite.invite.InviteFragment$e$a$a, reason: collision with other inner class name */
            public static final class C10118a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f326950q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ InviteFragment f326951r;

                /* compiled from: InviteFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.virtual_deal_room_invite.invite.InviteFragment$e$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C10119a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InviteFragment f326952b;

                    public C10119a(InviteFragment inviteFragment) {
                        this.f326952b = inviteFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        com.avito.android.virtual_deal_room_invite.invite.view.c cVar;
                        InterfaceC44302c interfaceC44302c = (InterfaceC44302c) obj;
                        a aVar = InviteFragment.f326931t0;
                        InviteFragment inviteFragment = this.f326952b;
                        if (L.f(interfaceC44302c, InterfaceC44302c.a.f415102a)) {
                            inviteFragment.requireActivity().finish();
                        } else if (interfaceC44302c instanceof InterfaceC44302c.b) {
                            com.avito.android.virtual_deal_room_invite.invite.view.c cVar2 = inviteFragment.f326937s0;
                            if (cVar2 != null) {
                                cVar2.c(((InterfaceC44302c.b) interfaceC44302c).f415103a);
                            }
                        } else if (interfaceC44302c instanceof InterfaceC44302c.C11858c) {
                            com.avito.android.deeplink_handler.handler.composite.a aVar2 = inviteFragment.f326935q0;
                            if (aVar2 == null) {
                                aVar2 = null;
                            }
                            b.a.a(aVar2, ((InterfaceC44302c.C11858c) interfaceC44302c).f415104a, null, null, 6);
                        } else if (interfaceC44302c instanceof InterfaceC44302c.e) {
                            com.avito.android.component.toast.c cVar3 = com.avito.android.component.toast.c.f125244a;
                            PrintableText printableText = ((InterfaceC44302c.e) interfaceC44302c).f415106a;
                            f.c.f125255c.getClass();
                            com.avito.android.component.toast.c.c(cVar3, inviteFragment, printableText, null, null, f.c.a.b(), 0, ToastBarPosition.f181046d, 942);
                        } else if ((interfaceC44302c instanceof InterfaceC44302c.d) && (cVar = inviteFragment.f326937s0) != null) {
                            Fragment fragment = ((InterfaceC44302c.d) interfaceC44302c).f415105a;
                            androidx.fragment.app.H hE2 = cVar.f327106d.e();
                            hE2.n(R.id.invite_fragment_container, fragment, null);
                            hE2.e();
                        }
                        G0 g02 = G0.f406611a;
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        return g02;
                    }

                    public final boolean equals(@l Object obj) {
                        if ((obj instanceof InterfaceC43172j) && (obj instanceof D)) {
                            return getFunctionDelegate().equals(((D) obj).getFunctionDelegate());
                        }
                        return false;
                    }

                    @Override // kotlin.jvm.internal.D
                    @Y61.k
                    public final InterfaceC43072x<?> getFunctionDelegate() {
                        return new C42801a(2, this.f326952b, InviteFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/virtual_deal_room_invite/invite/mvi/entity/InviteOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C10118a(InviteFragment inviteFragment, Continuation<? super C10118a> continuation) {
                    super(2, continuation);
                    this.f326951r = inviteFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C10118a(this.f326951r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C10118a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f326950q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = InviteFragment.f326931t0;
                        InviteFragment inviteFragment = this.f326951r;
                        InterfaceC43160i<InterfaceC44302c> events = ((com.avito.android.virtual_deal_room_invite.invite.c) inviteFragment.f326933o0.getValue()).getEvents();
                        C10119a c10119a = new C10119a(inviteFragment);
                        this.f326950q = 1;
                        if (events.collect(c10119a, this) == coroutine_suspended) {
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

            /* compiled from: InviteFragment.kt */
            @s0
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.InviteFragment$onCreateView$2$1$1$2", f = "InviteFragment.kt", i = {}, l = {WebSocketProtocol.PAYLOAD_SHORT}, m = "invokeSuspend", n = {}, s = {})
            public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f326953q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ InviteFragment f326954r;

                /* compiled from: InviteFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LnO0/d;", "it", "Lkotlin/G0;", "<anonymous>", "(LnO0/d;)V"}, k = 3, mv = {1, 9, 0})
                @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.InviteFragment$onCreateView$2$1$1$2$1", f = "InviteFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
                /* renamed from: com.avito.android.virtual_deal_room_invite.invite.InviteFragment$e$a$b$a, reason: collision with other inner class name */
                public static final class C10120a extends SuspendLambda implements p<C44303d, Continuation<? super G0>, Object> {

                    /* renamed from: q, reason: collision with root package name */
                    public /* synthetic */ Object f326955q;

                    /* renamed from: r, reason: collision with root package name */
                    public final /* synthetic */ InviteFragment f326956r;

                    /* compiled from: InviteFragment.kt */
                    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LnO0/d;", "it", "Lkotlin/G0;", "invoke", "(LnO0/d;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.virtual_deal_room_invite.invite.InviteFragment$e$a$b$a$a, reason: collision with other inner class name */
                    public static final class C10121a extends N implements Y41.l<C44303d, G0> {

                        /* renamed from: l, reason: collision with root package name */
                        public static final C10121a f326957l = new C10121a();

                        public C10121a() {
                            super(1);
                        }

                        @Override // Y41.l
                        public final /* bridge */ /* synthetic */ G0 invoke(C44303d c44303d) {
                            return G0.f406611a;
                        }
                    }

                    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                    public C10120a(InviteFragment inviteFragment, Continuation<? super C10120a> continuation) {
                        super(2, continuation);
                        this.f326956r = inviteFragment;
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @Y61.k
                    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                        C10120a c10120a = new C10120a(this.f326956r, continuation);
                        c10120a.f326955q = obj;
                        return c10120a;
                    }

                    @Override // Y41.p
                    public final Object invoke(C44303d c44303d, Continuation<? super G0> continuation) {
                        return ((C10120a) create(c44303d, continuation)).invokeSuspend(G0.f406611a);
                    }

                    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                    @l
                    public final Object invokeSuspend(@Y61.k Object obj) {
                        IntrinsicsKt.getCOROUTINE_SUSPENDED();
                        C42729a0.b(obj);
                        C44303d c44303d = (C44303d) this.f326955q;
                        ScreenPerformanceTracker screenPerformanceTracker = this.f326956r.f326934p0;
                        if (screenPerformanceTracker == null) {
                            screenPerformanceTracker = null;
                        }
                        com.avito.android.analytics.screens.mvi.a.i(c44303d, screenPerformanceTracker, C10121a.f326957l);
                        return G0.f406611a;
                    }
                }

                /* compiled from: InviteFragment.kt */
                @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LnO0/e;", "it", "Lkotlin/G0;", "emit", "(LnO0/e;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                /* renamed from: com.avito.android.virtual_deal_room_invite.invite.InviteFragment$e$a$b$b, reason: collision with other inner class name */
                public static final class C10122b<T> implements InterfaceC43172j {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ InviteFragment f326958b;

                    public C10122b(InviteFragment inviteFragment) {
                        this.f326958b = inviteFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        SpannableString spannableStringB;
                        InterfaceC44304e interfaceC44304e = (InterfaceC44304e) obj;
                        com.avito.android.virtual_deal_room_invite.invite.view.c cVar = this.f326958b.f326937s0;
                        if (cVar != null) {
                            View view = cVar.f327107e;
                            D6.w(view);
                            View view2 = cVar.f327108f;
                            D6.w(view2);
                            View view3 = cVar.f327117o;
                            D6.w(view3);
                            View view4 = cVar.f327109g;
                            D6.w(view4);
                            Button button = cVar.f327113k;
                            D6.w(button);
                            Button button2 = cVar.f327114l;
                            D6.w(button2);
                            Button button3 = cVar.f327115m;
                            D6.w(button3);
                            TextView textView = cVar.f327112j;
                            D6.w(textView);
                            boolean z12 = interfaceC44304e instanceof InterfaceC44304e.b;
                            InviteInfoView inviteInfoView = cVar.f327111i;
                            InviteInfoView inviteInfoView2 = cVar.f327110h;
                            ScrollView scrollView = cVar.f327116n;
                            if (z12) {
                                InterfaceC44304e.b bVar = (InterfaceC44304e.b) interfaceC44304e;
                                boolean z13 = bVar.f415123d;
                                D6.H(view4);
                                D6.G(scrollView, z13);
                                D6.G(inviteInfoView2, !z13);
                                if (!z13) {
                                    inviteInfoView = inviteInfoView2;
                                }
                                inviteInfoView.a(bVar.f415122c, bVar.f415120a, bVar.f415121b);
                                D6.H(button);
                            } else if (interfaceC44304e instanceof InterfaceC44304e.c) {
                                InterfaceC44304e.c cVar2 = (InterfaceC44304e.c) interfaceC44304e;
                                boolean z14 = cVar2.f415130g;
                                D6.H(view4);
                                D6.G(scrollView, z14);
                                D6.G(inviteInfoView2, !z14);
                                if (!z14) {
                                    inviteInfoView = inviteInfoView2;
                                }
                                inviteInfoView.a(cVar2.f415126c, cVar2.f415124a, cVar2.f415125b);
                                D6.H(textView);
                                D6.H(button2);
                                D6.H(button3);
                                double d12 = cVar2.f415127d;
                                int iA2 = kotlin.math.b.a(d12);
                                CounterColor counterColor = cVar2.f415128e;
                                if (d12 < 1.0d) {
                                    spannableStringB = cVar.b(cVar.a(R.string.virtual_deal_room_invite_valid_time) + ' ' + cVar.a(R.string.virtual_deal_room_invite_less) + ' ' + cVar.a(R.string.virtual_deal_room_invite_hours_2), cVar.a(R.string.virtual_deal_room_invite_less), counterColor);
                                } else {
                                    int i12 = iA2 % 100;
                                    if (i12 == 11 || i12 == 12 || i12 == 13 || i12 == 14) {
                                        spannableStringB = cVar.b(cVar.a(R.string.virtual_deal_room_invite_valid_time) + ' ' + iA2 + ' ' + cVar.a(R.string.virtual_deal_room_invite_hours_1), String.valueOf(iA2), counterColor);
                                    } else {
                                        int i13 = iA2 % 10;
                                        if (i13 == 1) {
                                            spannableStringB = cVar.b(cVar.a(R.string.virtual_deal_room_invite_valid_time) + ' ' + iA2 + ' ' + cVar.a(R.string.virtual_deal_room_invite_hour), String.valueOf(iA2), counterColor);
                                        } else if (i13 == 2 || i13 == 3 || i13 == 4) {
                                            spannableStringB = cVar.b(cVar.a(R.string.virtual_deal_room_invite_valid_time) + ' ' + iA2 + ' ' + cVar.a(R.string.virtual_deal_room_invite_hours_2), String.valueOf(iA2), counterColor);
                                        } else {
                                            spannableStringB = cVar.b(cVar.a(R.string.virtual_deal_room_invite_valid_time) + ' ' + iA2 + ' ' + cVar.a(R.string.virtual_deal_room_invite_hours_1), String.valueOf(iA2), counterColor);
                                        }
                                    }
                                }
                                textView.setText(spannableStringB);
                                cVar.f327105c.a(cVar2.f415129f);
                            } else if (interfaceC44304e.equals(InterfaceC44304e.d.f415131a)) {
                                D6.H(view2);
                            } else if (interfaceC44304e.equals(InterfaceC44304e.C11859e.f415132a)) {
                                D6.H(view3);
                            } else if (interfaceC44304e.equals(InterfaceC44304e.f.f415133a)) {
                                D6.H(view);
                            } else if (interfaceC44304e.equals(InterfaceC44304e.a.f415119a)) {
                                D6.H(view4);
                                D6.G(inviteInfoView2, true);
                                D6.w(scrollView);
                                inviteInfoView2.a(new C39608a(new Image(P0.g(new Q(new Size(113, 90), Uri.parse("https://avito.st/static/ims/virtual_deal_room_invite_no_internet_common_113x90.png")), new Q(new Size(169, 135), Uri.parse("https://avito.st/static/ims/virtual_deal_room_invite_no_internet_common_169x135.png")), new Q(new Size(JfifUtil.MARKER_APP1, 180), Uri.parse("https://avito.st/static/ims/virtual_deal_room_invite_no_internet_common_225x180.png")), new Q(new Size(450, 360), Uri.parse("https://avito.st/static/ims/virtual_deal_room_invite_no_internet_common_450x360.png")), new Q(new Size(675, 540), Uri.parse("https://avito.st/static/ims/virtual_deal_room_invite_no_internet_common_675x540.png")), new Q(new Size(900, 720), Uri.parse("https://avito.st/static/ims/virtual_deal_room_invite_no_internet_common_900x720.png")))), null), cVar.a(R.string.virtual_deal_room_invite_empty_title), cVar.a(R.string.virtual_deal_room_invite_empty_description));
                                D6.H(button);
                            }
                        }
                        return G0.f406611a;
                    }
                }

                /* compiled from: SafeCollector.common.kt */
                @s0
                @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/p1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
                public static final class c implements InterfaceC43160i<InterfaceC44304e> {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ C43197r1 f326959b;

                    /* compiled from: Emitters.kt */
                    @s0
                    @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/p1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
                    /* renamed from: com.avito.android.virtual_deal_room_invite.invite.InviteFragment$e$a$b$c$a, reason: collision with other inner class name */
                    public static final class C10123a<T> implements InterfaceC43172j {

                        /* renamed from: b, reason: collision with root package name */
                        public final /* synthetic */ InterfaceC43172j f326960b;

                        /* compiled from: Emitters.kt */
                        @s0
                        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                        @DebugMetadata(c = "com.avito.android.virtual_deal_room_invite.invite.InviteFragment$onCreateView$2$1$1$2$invokeSuspend$$inlined$map$1$2", f = "InviteFragment.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
                        /* renamed from: com.avito.android.virtual_deal_room_invite.invite.InviteFragment$e$a$b$c$a$a, reason: collision with other inner class name */
                        public static final class C10124a extends ContinuationImpl {

                            /* renamed from: q, reason: collision with root package name */
                            public /* synthetic */ Object f326961q;

                            /* renamed from: r, reason: collision with root package name */
                            public int f326962r;

                            public C10124a(Continuation continuation) {
                                super(continuation);
                            }

                            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                            @l
                            public final Object invokeSuspend(@Y61.k Object obj) {
                                this.f326961q = obj;
                                this.f326962r |= BeduinInputModel.MIN_TEXT_VERSION;
                                return C10123a.this.emit(null, this);
                            }
                        }

                        public C10123a(InterfaceC43172j interfaceC43172j) {
                            this.f326960b = interfaceC43172j;
                        }

                        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
                        @Override // kotlinx.coroutines.flow.InterfaceC43172j
                        @Y61.l
                        /*
                            Code decompiled incorrectly, please refer to instructions dump.
                            To view partially-correct add '--show-bad-code' argument
                        */
                        public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                            /*
                                r4 = this;
                                boolean r0 = r6 instanceof com.avito.android.virtual_deal_room_invite.invite.InviteFragment.e.a.b.c.C10123a.C10124a
                                if (r0 == 0) goto L13
                                r0 = r6
                                com.avito.android.virtual_deal_room_invite.invite.InviteFragment$e$a$b$c$a$a r0 = (com.avito.android.virtual_deal_room_invite.invite.InviteFragment.e.a.b.c.C10123a.C10124a) r0
                                int r1 = r0.f326962r
                                r2 = -2147483648(0xffffffff80000000, float:-0.0)
                                r3 = r1 & r2
                                if (r3 == 0) goto L13
                                int r1 = r1 - r2
                                r0.f326962r = r1
                                goto L18
                            L13:
                                com.avito.android.virtual_deal_room_invite.invite.InviteFragment$e$a$b$c$a$a r0 = new com.avito.android.virtual_deal_room_invite.invite.InviteFragment$e$a$b$c$a$a
                                r0.<init>(r6)
                            L18:
                                java.lang.Object r6 = r0.f326961q
                                java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                                int r2 = r0.f326962r
                                r3 = 1
                                if (r2 == 0) goto L31
                                if (r2 != r3) goto L29
                                kotlin.C42729a0.b(r6)
                                goto L43
                            L29:
                                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                                r5.<init>(r6)
                                throw r5
                            L31:
                                kotlin.C42729a0.b(r6)
                                nO0.d r5 = (nO0.C44303d) r5
                                nO0.e r5 = r5.f415118k
                                r0.f326962r = r3
                                kotlinx.coroutines.flow.j r6 = r4.f326960b
                                java.lang.Object r5 = r6.emit(r5, r0)
                                if (r5 != r1) goto L43
                                return r1
                            L43:
                                kotlin.G0 r5 = kotlin.G0.f406611a
                                return r5
                            */
                            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.virtual_deal_room_invite.invite.InviteFragment.e.a.b.c.C10123a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
                        }
                    }

                    public c(C43197r1 c43197r1) {
                        this.f326959b = c43197r1;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43160i
                    @l
                    public final Object collect(@Y61.k InterfaceC43172j<? super InterfaceC44304e> interfaceC43172j, @Y61.k Continuation continuation) {
                        Object objCollect = this.f326959b.collect(new C10123a(interfaceC43172j), continuation);
                        return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public b(InviteFragment inviteFragment, Continuation<? super b> continuation) {
                    super(2, continuation);
                    this.f326954r = inviteFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                    return new b(this.f326954r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f326953q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = InviteFragment.f326931t0;
                        InviteFragment inviteFragment = this.f326954r;
                        InterfaceC43160i interfaceC43160iR = C43175k.r(new c(new C43197r1(new C10120a(inviteFragment, null), ((com.avito.android.virtual_deal_room_invite.invite.c) inviteFragment.f326933o0.getValue()).getState())));
                        C10122b c10122b = new C10122b(inviteFragment);
                        this.f326953q = 1;
                        if (interfaceC43160iR.collect(c10122b, this) == coroutine_suspended) {
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
            public a(InviteFragment inviteFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f326949r = inviteFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f326949r, continuation);
                aVar.f326948q = obj;
                return aVar;
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@Y61.k Object obj) {
                IntrinsicsKt.getCOROUTINE_SUSPENDED();
                C42729a0.b(obj);
                T t12 = (T) this.f326948q;
                InviteFragment inviteFragment = this.f326949r;
                C43259k.d(t12, null, null, new C10118a(inviteFragment, null), 3);
                C43259k.d(t12, null, null, new b(inviteFragment, null), 3);
                return G0.f406611a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public e(InterfaceC22983P interfaceC22983P, InviteFragment inviteFragment, Continuation<? super e> continuation) {
            super(2, continuation);
            this.f326946r = interfaceC22983P;
            this.f326947s = inviteFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
            return new e(this.f326946r, this.f326947s, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f326945q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC22983P interfaceC22983P = this.f326946r;
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(this.f326947s, null);
                this.f326945q = 1;
                if (C23056p0.b(interfaceC22983P, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f326964l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(Y41.a aVar) {
            super(0);
            this.f326964l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f326964l);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/i", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<Fragment> {
        public g() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return InviteFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f326966l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(g gVar) {
            super(0);
            this.f326966l = gVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f326966l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f326967l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f326967l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f326967l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f326968l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f326968l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f326968l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: InviteFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/virtual_deal_room_invite/invite/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/virtual_deal_room_invite/invite/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<com.avito.android.virtual_deal_room_invite.invite.c> {
        public k() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.virtual_deal_room_invite.invite.c invoke() {
            com.avito.android.virtual_deal_room_invite.invite.d dVar = InviteFragment.this.f326932n0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.virtual_deal_room_invite.invite.c) dVar.get();
        }
    }

    public InviteFragment() {
        super(0, 1, null);
        f fVar = new f(new k());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new h(new g()));
        this.f326933o0 = new O0(m0.f406844a.b(com.avito.android.virtual_deal_room_invite.invite.c.class), new i(interfaceC42726CB), fVar, new j(interfaceC42726CB));
        this.f326936r0 = C42727D.c(new b());
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onCreate(@l Bundle bundle) {
        super.onCreate(bundle);
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
    }

    @Override // androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f326934p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = layoutInflater.inflate(R.layout.virtual_deal_room_invite_layout, viewGroup, false);
        this.f326937s0 = new com.avito.android.virtual_deal_room_invite.invite.view.c(viewInflate, new d(1, (com.avito.android.virtual_deal_room_invite.invite.c) this.f326933o0.getValue(), com.avito.android.virtual_deal_room_invite.invite.c.class, "accept", "accept(Ljava/lang/Object;)V", 0), (com.avito.android.deeplink_handler.view.impl.i) e5(), getChildFragmentManager());
        InterfaceC22983P viewLifecycleOwner = getViewLifecycleOwner();
        C43259k.d(C22984Q.a(viewLifecycleOwner), null, null, new e(viewLifecycleOwner, this, null), 3);
        return viewInflate;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.f326937s0 = null;
        super.onDestroyView();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment, androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @l Bundle bundle) {
        super.onViewCreated(view, bundle);
        ScreenPerformanceTracker screenPerformanceTracker = this.f326934p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.d();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.virtual_deal_room_invite.invite.di.a.a().a((InterfaceC40325a) C29972i.a(C29972i.b(this), InterfaceC40325a.class), cv.c.b(this), new C28478k(VDRInviteScreen.f326911d, s.c(this), null, 4, null), (InvitationArguments) this.f326936r0.getValue()).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f326934p0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }
}
