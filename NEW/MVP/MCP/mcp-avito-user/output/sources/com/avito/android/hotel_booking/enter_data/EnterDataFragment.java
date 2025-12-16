package com.avito.android.hotel_booking.enter_data;

import Cd.C13243a;
import Fc1.D3;
import QI.a;
import QI.b;
import Y41.p;
import android.app.Dialog;
import android.os.Bundle;
import android.view.ContextThemeWrapper;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22984Q;
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
import com.avito.android.hotel_booking.di.C30780a;
import com.avito.android.hotel_booking.di.InterfaceC30799u;
import com.avito.android.hotel_booking.enter_data.mvi.HotelBookingEnterDataScreen;
import com.avito.android.lib.design.button.Button;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35968w3;
import com.avito.android.util.K2;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.H;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.Y;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.rx3.y;
import z1.AbstractC50339a;

/* compiled from: EnterDataFragment.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/EnterDataFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class EnterDataFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public com.avito.android.hotel_booking.enter_data.d f163476h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f163477i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f163478j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.konveyor.adapter.d f163479k0;

    /* renamed from: l0, reason: collision with root package name */
    @Y61.l
    public com.avito.android.hotel_booking.enter_data.b f163480l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final C35968w3 f163481m0;

    /* renamed from: o0, reason: collision with root package name */
    public static final /* synthetic */ n<Object>[] f163475o0 = {m0.f406844a.e(new Y(EnterDataFragment.class, "openParams", "getOpenParams()Lcom/avito/android/hotel_booking/enter_data/EnterDataOpenParams;", 0))};

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public static final a f163474n0 = new a(null);

    /* compiled from: EnterDataFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/EnterDataFragment$a;", "", "<init>", "()V", "", "RESULT_VALUE_KEY", "Ljava/lang/String;", "_avito_hotel-booking_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: EnterDataFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b extends N implements Y41.a<G0> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final G0 invoke() {
            a aVar = EnterDataFragment.f163474n0;
            EnterDataFragment.this.f5().accept(a.e.f13660a);
            return G0.f406611a;
        }
    }

    /* compiled from: EnterDataFragment.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class c extends H implements Y41.l<QI.b, G0> {
        @Override // Y41.l
        public final G0 invoke(QI.b bVar) {
            QI.b bVar2 = bVar;
            EnterDataFragment enterDataFragment = (EnterDataFragment) this.receiver;
            a aVar = EnterDataFragment.f163474n0;
            enterDataFragment.getClass();
            if (bVar2 instanceof b.a) {
                enterDataFragment.dismiss();
            } else if (bVar2 instanceof b.C0897b) {
                FragmentManager parentFragmentManager = enterDataFragment.getParentFragmentManager();
                String tag = enterDataFragment.getTag();
                if (tag == null) {
                    tag = "";
                }
                parentFragmentManager.o0(C22777e.b(new Q("enter_data_result_key", ((b.C0897b) bVar2).f13662a)), tag);
                enterDataFragment.dismiss();
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EnterDataFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQI/c;", VoiceInfo.STATE, "Lkotlin/G0;", "invoke", "(LQI/c;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.l<QI.c, G0> {
        public d() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(QI.c cVar) {
            QI.c cVar2 = cVar;
            EnterDataFragment enterDataFragment = EnterDataFragment.this;
            com.avito.konveyor.adapter.d dVar = enterDataFragment.f163479k0;
            if (dVar == null) {
                dVar = null;
            }
            QI.d dVar2 = cVar2.f13669f;
            dVar.l(dVar2.f13670a, null);
            com.avito.android.hotel_booking.enter_data.b bVar = enterDataFragment.f163480l0;
            Button button = bVar != null ? bVar.f163501b : null;
            if (button != null) {
                button.setEnabled(dVar2.f13671b);
            }
            com.avito.android.hotel_booking.enter_data.b bVar2 = enterDataFragment.f163480l0;
            Button button2 = bVar2 != null ? bVar2.f163501b : null;
            if (button2 != null) {
                button2.setVisibility(dVar2.f13672c ? 0 : 8);
            }
            return G0.f406611a;
        }
    }

    /* compiled from: EnterDataFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.hotel_booking.enter_data.EnterDataFragment$onCreateView$3", f = "EnterDataFragment.kt", i = {}, l = {110}, m = "invokeSuspend", n = {}, s = {})
    public static final class e extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f163484q;

        /* compiled from: EnterDataFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.hotel_booking.enter_data.EnterDataFragment$onCreateView$3$1", f = "EnterDataFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f163486q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ EnterDataFragment f163487r;

            /* compiled from: EnterDataFragment.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "<anonymous>", "(Z)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.hotel_booking.enter_data.EnterDataFragment$onCreateView$3$1$1", f = "EnterDataFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.hotel_booking.enter_data.EnterDataFragment$e$a$a, reason: collision with other inner class name */
            public static final class C4788a extends SuspendLambda implements p<Boolean, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f163488q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ EnterDataFragment f163489r;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C4788a(EnterDataFragment enterDataFragment, Continuation<? super C4788a> continuation) {
                    super(2, continuation);
                    this.f163489r = enterDataFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    C4788a c4788a = new C4788a(this.f163489r, continuation);
                    c4788a.f163488q = obj;
                    return c4788a;
                }

                @Override // Y41.p
                public final Object invoke(Boolean bool, Continuation<? super G0> continuation) {
                    return ((C4788a) create(bool, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    C42729a0.b(obj);
                    Boolean bool = (Boolean) this.f163488q;
                    a aVar = EnterDataFragment.f163474n0;
                    this.f163489r.f5().accept(new a.d(bool.booleanValue()));
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(EnterDataFragment enterDataFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f163487r = enterDataFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f163487r, continuation);
                aVar.f163486q = obj;
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
                T t12 = (T) this.f163486q;
                EnterDataFragment enterDataFragment = this.f163487r;
                C43175k.K(new C43197r1(new C4788a(enterDataFragment, null), y.a(K2.h(enterDataFragment.requireActivity()))), t12);
                return G0.f406611a;
            }
        }

        public e(Continuation<? super e> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return EnterDataFragment.this.new e(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((e) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f163484q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                EnterDataFragment enterDataFragment = EnterDataFragment.this;
                a aVar = new a(enterDataFragment, null);
                this.f163484q = 1;
                if (C23056p0.b(enterDataFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: EnterDataFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LQI/a;", "it", "Lkotlin/G0;", "invoke", "(LQI/a;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.l<QI.a, G0> {
        public f() {
            super(1);
        }

        @Override // Y41.l
        public final G0 invoke(QI.a aVar) {
            a aVar2 = EnterDataFragment.f163474n0;
            EnterDataFragment.this.f5().accept(aVar);
            return G0.f406611a;
        }
    }

    /* compiled from: LazyViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/o", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<P0.c> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Y41.a f163491l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(Y41.a aVar) {
            super(0);
            this.f163491l = aVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new C13243a(this.f163491l);
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
            return EnterDataFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/j", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ h f163493l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public i(h hVar) {
            super(0);
            this.f163493l = hVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f163493l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/k", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class j extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f163494l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public j(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f163494l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f163494l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/l", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class k extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f163495l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public k(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f163495l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f163495l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: EnterDataFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0004\u001a\n \u0001*\u0004\u0018\u00010\u00000\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lcom/avito/android/hotel_booking/enter_data/c;", "kotlin.jvm.PlatformType", "invoke", "()Lcom/avito/android/hotel_booking/enter_data/c;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class l extends N implements Y41.a<com.avito.android.hotel_booking.enter_data.c> {
        public l() {
            super(0);
        }

        @Override // Y41.a
        public final com.avito.android.hotel_booking.enter_data.c invoke() {
            com.avito.android.hotel_booking.enter_data.d dVar = EnterDataFragment.this.f163476h0;
            if (dVar == null) {
                dVar = null;
            }
            return (com.avito.android.hotel_booking.enter_data.c) dVar.get();
        }
    }

    public EnterDataFragment() {
        super(0, 1, null);
        g gVar = new g(new l());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new i(new h()));
        this.f163477i0 = new O0(m0.f406844a.b(com.avito.android.hotel_booking.enter_data.c.class), new j(interfaceC42726CB), gVar, new k(interfaceC42726CB));
        this.f163481m0 = new C35968w3(this);
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment
    public final void e5(@Y61.l Bundle bundle) {
        D.f90335a.getClass();
        F fA2 = D.a.a();
        C28478k c28478k = new C28478k(HotelBookingEnterDataScreen.f163541d, s.b(this), null, 4, null);
        C30780a.a().a((InterfaceC30799u) C29972i.a(C29972i.b(this), InterfaceC30799u.class), c28478k, new f(), (EnterDataOpenParams) this.f163481m0.getValue(this, f163475o0[0])).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f163478j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
    }

    public final com.avito.android.hotel_booking.enter_data.c f5() {
        return (com.avito.android.hotel_booking.enter_data.c) this.f163477i0.getValue();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(new ContextThemeWrapper(getContext(), R.style.Theme_DesignSystem_Re23), 0, 2, null);
        ScreenPerformanceTracker screenPerformanceTracker = this.f163478j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.m(screenPerformanceTracker.getF90716d());
        dVar.T();
        dVar.setOnCancelListener(new D3(this, 7));
        dVar.Q(new b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f163478j0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        ScreenPerformanceTracker.a.c(screenPerformanceTracker2, null, null, null, 7);
        return dVar;
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.Fragment
    @Y61.k
    public final View onCreateView(@Y61.k LayoutInflater layoutInflater, @Y61.l ViewGroup viewGroup, @Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f163478j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        View viewInflate = LayoutInflater.from(getContext()).inflate(R.layout.enter_data_dialog, (ViewGroup) null);
        this.f163480l0 = new com.avito.android.hotel_booking.enter_data.b(viewInflate);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f163478j0;
        if (screenPerformanceTracker2 == null) {
            screenPerformanceTracker2 = null;
        }
        com.avito.android.analytics.screens.mvi.a.g(this, screenPerformanceTracker2, f5(), new c(1, this, EnterDataFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/hotel_booking/enter_data/mvi/entity/EnterDataOneTimeEvent;)V", 0), new d());
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new e(null), 3);
        return viewInflate;
    }

    @Override // androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        com.avito.android.hotel_booking.enter_data.b bVar = this.f163480l0;
        if (bVar != null) {
            bVar.f163500a.setAdapter(null);
        }
        this.f163480l0 = null;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(@Y61.k View view, @Y61.l Bundle bundle) {
        Button button;
        super.onViewCreated(view, bundle);
        com.avito.android.hotel_booking.enter_data.b bVar = this.f163480l0;
        RecyclerView recyclerView = bVar != null ? bVar.f163500a : null;
        if (recyclerView != null) {
            com.avito.konveyor.adapter.d dVar = this.f163479k0;
            if (dVar == null) {
                dVar = null;
            }
            recyclerView.setAdapter(dVar);
        }
        com.avito.android.hotel_booking.enter_data.b bVar2 = this.f163480l0;
        if (bVar2 != null && (button = bVar2.f163501b) != null) {
            button.setOnClickListener(new com.avito.android.developments_agency_search.screen.realty_agency_search.adapter.actions_block.k(this, 21));
        }
        Dialog dialog = getDialog();
        com.avito.android.lib.design.bottom_sheet.d dVar2 = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
        if (dVar2 != null) {
            com.avito.android.lib.design.bottom_sheet.d.I(dVar2, true);
        }
        Dialog dialog2 = getDialog();
        com.avito.android.lib.design.bottom_sheet.d dVar3 = dialog2 instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog2 : null;
        if (dVar3 != null) {
            dVar3.T();
        }
        Dialog dialog3 = getDialog();
        com.avito.android.lib.design.bottom_sheet.d dVar4 = dialog3 instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog3 : null;
        if (dVar4 != null) {
            com.avito.android.lib.design.bottom_sheet.d.M(dVar4, ((EnterDataOpenParams) this.f163481m0.getValue(this, f163475o0[0])).f163497b, true, true, 2);
        }
        ScreenPerformanceTracker screenPerformanceTracker = this.f163478j0;
        (screenPerformanceTracker != null ? screenPerformanceTracker : null).d();
    }
}
