package com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import androidx.compose.runtime.internal.C22096n;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.platform.ComposeView;
import androidx.core.os.C22777e;
import androidx.fragment.app.Fragment;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.C23060r0;
import androidx.view.InterfaceC22969B;
import androidx.view.Lifecycle;
import androidx.view.O0;
import androidx.view.P0;
import androidx.view.S0;
import androidx.view.T0;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.analytics.screens.C28478k;
import com.avito.android.analytics.screens.D;
import com.avito.android.analytics.screens.F;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.analytics.screens.s;
import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.component.toast.f;
import com.avito.android.di.C29972i;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.profile_phones.perf_const.IacEnableBottomSheetScreen;
import com.avito.android.profile_phones.phones_list.C33413a;
import com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.p;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseDialogFragment;
import com.avito.android.util.C35835l0;
import com.avito.android.util.C35966w1;
import javax.inject.Inject;
import kotlin.C42727D;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC42726C;
import kotlin.InterfaceC43072x;
import kotlin.LazyThreadSafetyMode;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.D;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.N;
import kotlin.jvm.internal.m0;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vb0.InterfaceC49295b;
import z1.AbstractC50339a;

/* compiled from: IacEnableBottomSheetFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\b²\u0006\f\u0010\u0007\u001a\u00020\u00068\nX\u008a\u0084\u0002"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/IacEnableBottomSheetFragment;", "Lcom/avito/android/ui/fragments/BaseDialogFragment;", "Lcom/avito/android/analytics/screens/j$b;", "<init>", "()V", "a", "Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/entity/IacEnableBottomSheetState;", VoiceInfo.STATE, "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final class IacEnableBottomSheetFragment extends BaseDialogFragment implements InterfaceC28477j.b {

    /* renamed from: o0, reason: collision with root package name */
    @Y61.k
    public static final a f227749o0 = new a(null);

    /* renamed from: h0, reason: collision with root package name */
    @Inject
    public p.a f227750h0;

    /* renamed from: i0, reason: collision with root package name */
    @Y61.k
    public final O0 f227751i0;

    /* renamed from: j0, reason: collision with root package name */
    @Inject
    public ScreenPerformanceTracker f227752j0;

    /* renamed from: k0, reason: collision with root package name */
    @Inject
    public com.avito.android.deeplink_handler.handler.composite.a f227753k0;

    /* renamed from: l0, reason: collision with root package name */
    @Inject
    public InterfaceC28373a f227754l0;

    /* renamed from: m0, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f227755m0;

    /* renamed from: n0, reason: collision with root package name */
    @Y61.k
    public final InterfaceC42726C f227756n0;

    /* compiled from: IacEnableBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/IacEnableBottomSheetFragment$a;", "", "<init>", "()V", "", "KEY_FRAGMENT_DATA", "Ljava/lang/String;", "_avito_profile-phones_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {

        /* compiled from: IacEnableBottomSheetFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0004\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Landroid/os/Bundle;", "Lkotlin/G0;", "invoke", "(Landroid/os/Bundle;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetFragment$a$a, reason: collision with other inner class name */
        public static final class C6925a extends N implements Y41.l<Bundle, G0> {

            /* renamed from: l, reason: collision with root package name */
            public final /* synthetic */ boolean f227757l;

            /* renamed from: m, reason: collision with root package name */
            public final /* synthetic */ boolean f227758m;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C6925a(boolean z12, boolean z13) {
                super(1);
                this.f227757l = z12;
                this.f227758m = z13;
            }

            @Override // Y41.l
            public final G0 invoke(Bundle bundle) {
                bundle.putParcelable("iac_enable_bottom_sheet_data_key", new IacEnableBottomSheetStartData(this.f227757l, this.f227758m));
                return G0.f406611a;
            }
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        @Y61.k
        public static IacEnableBottomSheetFragment a(boolean z12, boolean z13) {
            IacEnableBottomSheetFragment iacEnableBottomSheetFragment = new IacEnableBottomSheetFragment();
            C35966w1.a(iacEnableBottomSheetFragment, -1, new C6925a(z12, z13));
            return iacEnableBottomSheetFragment;
        }

        public a() {
        }
    }

    /* compiled from: IacEnableBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/IacEnableBottomSheetStartData;", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class b extends N implements Y41.a<IacEnableBottomSheetStartData> {
        public b() {
            super(0);
        }

        @Override // Y41.a
        public final IacEnableBottomSheetStartData invoke() {
            Bundle arguments = IacEnableBottomSheetFragment.this.getArguments();
            if (arguments == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            Parcelable parcelable = Build.VERSION.SDK_INT >= 34 ? (Parcelable) arguments.getParcelable("iac_enable_bottom_sheet_data_key", IacEnableBottomSheetStartData.class) : arguments.getParcelable("iac_enable_bottom_sheet_data_key");
            if (parcelable != null) {
                return (IacEnableBottomSheetStartData) parcelable;
            }
            throw new IllegalArgumentException("Required value was null.");
        }
    }

    /* compiled from: IacEnableBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetFragment$onCreateDialog$1", f = "IacEnableBottomSheetFragment.kt", i = {}, l = {103}, m = "invokeSuspend", n = {}, s = {})
    public static final class c extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f227760q;

        /* compiled from: IacEnableBottomSheetFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetFragment$onCreateDialog$1$1", f = "IacEnableBottomSheetFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public /* synthetic */ Object f227762q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ IacEnableBottomSheetFragment f227763r;

            /* compiled from: IacEnableBottomSheetFragment.kt */
            @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
            @DebugMetadata(c = "com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetFragment$onCreateDialog$1$1$1", f = "IacEnableBottomSheetFragment.kt", i = {}, l = {105}, m = "invokeSuspend", n = {}, s = {})
            /* renamed from: com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetFragment$c$a$a, reason: collision with other inner class name */
            public static final class C6926a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

                /* renamed from: q, reason: collision with root package name */
                public int f227764q;

                /* renamed from: r, reason: collision with root package name */
                public final /* synthetic */ IacEnableBottomSheetFragment f227765r;

                /* compiled from: IacEnableBottomSheetFragment.kt */
                @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
                /* renamed from: com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.IacEnableBottomSheetFragment$c$a$a$a, reason: collision with other inner class name */
                public /* synthetic */ class C6927a implements InterfaceC43172j, D {

                    /* renamed from: b, reason: collision with root package name */
                    public final /* synthetic */ IacEnableBottomSheetFragment f227766b;

                    public C6927a(IacEnableBottomSheetFragment iacEnableBottomSheetFragment) {
                        this.f227766b = iacEnableBottomSheetFragment;
                    }

                    @Override // kotlinx.coroutines.flow.InterfaceC43172j
                    public final Object emit(Object obj, Continuation continuation) {
                        InterfaceC49295b interfaceC49295b = (InterfaceC49295b) obj;
                        a aVar = IacEnableBottomSheetFragment.f227749o0;
                        IacEnableBottomSheetFragment iacEnableBottomSheetFragment = this.f227766b;
                        if (interfaceC49295b instanceof InterfaceC49295b.a) {
                            Dialog dialog = iacEnableBottomSheetFragment.getDialog();
                            com.avito.android.lib.design.bottom_sheet.d dVar = dialog instanceof com.avito.android.lib.design.bottom_sheet.d ? (com.avito.android.lib.design.bottom_sheet.d) dialog : null;
                            if (dVar != null) {
                                InterfaceC49295b.a aVar2 = (InterfaceC49295b.a) interfaceC49295b;
                                com.avito.android.component.toast.c.d(com.avito.android.component.toast.c.f125244a, dVar, aVar2.f440871a, null, new f.c(aVar2.f440872b), 0, ToastBarPosition.f181046d, 942);
                            }
                        } else if (L.f(interfaceC49295b, InterfaceC49295b.C12783b.f440873a)) {
                            C33413a c33413a = C33413a.f227434a;
                            com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.e eVar = com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.e.f227807l;
                            com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.f fVar = new com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.f(iacEnableBottomSheetFragment);
                            com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.g gVar = new com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.g(iacEnableBottomSheetFragment);
                            com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.h hVar = new com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.h(iacEnableBottomSheetFragment);
                            com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.i iVar = new com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.i(iacEnableBottomSheetFragment);
                            j jVar = j.f227812l;
                            k kVar = k.f227813l;
                            l lVar = l.f227814l;
                            com.avito.android.deeplink_handler.handler.composite.a aVar3 = iacEnableBottomSheetFragment.f227753k0;
                            com.avito.android.deeplink_handler.handler.composite.a aVar4 = aVar3 != null ? aVar3 : null;
                            Resources resources = iacEnableBottomSheetFragment.getResources();
                            c33413a.getClass();
                            C33413a.a(eVar, fVar, gVar, hVar, iVar, jVar, kVar, lVar, aVar4, iacEnableBottomSheetFragment.f227755m0, resources);
                        }
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
                        return new C42801a(2, this.f227766b, IacEnableBottomSheetFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/mvi/entity/IacEnableBottomSheetOneTimeEvent;)V", 4);
                    }

                    public final int hashCode() {
                        return getFunctionDelegate().hashCode();
                    }
                }

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                public C6926a(IacEnableBottomSheetFragment iacEnableBottomSheetFragment, Continuation<? super C6926a> continuation) {
                    super(2, continuation);
                    this.f227765r = iacEnableBottomSheetFragment;
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.k
                public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                    return new C6926a(this.f227765r, continuation);
                }

                @Override // Y41.p
                public final Object invoke(T t12, Continuation<? super G0> continuation) {
                    return ((C6926a) create(t12, continuation)).invokeSuspend(G0.f406611a);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @Y61.l
                public final Object invokeSuspend(@Y61.k Object obj) {
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    int i12 = this.f227764q;
                    if (i12 == 0) {
                        C42729a0.b(obj);
                        a aVar = IacEnableBottomSheetFragment.f227749o0;
                        IacEnableBottomSheetFragment iacEnableBottomSheetFragment = this.f227765r;
                        InterfaceC43160i<InterfaceC49295b> events = iacEnableBottomSheetFragment.f5().getEvents();
                        C6927a c6927a = new C6927a(iacEnableBottomSheetFragment);
                        this.f227764q = 1;
                        if (events.collect(c6927a, this) == coroutine_suspended) {
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
            public a(IacEnableBottomSheetFragment iacEnableBottomSheetFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f227763r = iacEnableBottomSheetFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                a aVar = new a(this.f227763r, continuation);
                aVar.f227762q = obj;
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
                C43259k.d((T) this.f227762q, null, null, new C6926a(this.f227763r, null), 3);
                return G0.f406611a;
            }
        }

        public c(Continuation<? super c> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            return IacEnableBottomSheetFragment.this.new c(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((c) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f227760q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                IacEnableBottomSheetFragment iacEnableBottomSheetFragment = IacEnableBottomSheetFragment.this;
                a aVar = new a(iacEnableBottomSheetFragment, null);
                this.f227760q = 1;
                if (C23056p0.b(iacEnableBottomSheetFragment, state, aVar, this) == coroutine_suspended) {
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

    /* compiled from: SaveStateViewModelFactory.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "T", "Landroidx/lifecycle/P0$c;", "invoke", "()Landroidx/lifecycle/P0$c;", "Cd/B", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class d extends N implements Y41.a<P0.c> {

        /* renamed from: m, reason: collision with root package name */
        public final /* synthetic */ Y41.l f227768m;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public d(Y41.l lVar) {
            super(0);
            this.f227768m = lVar;
        }

        @Override // Y41.a
        public final P0.c invoke() {
            return new Cd.r(IacEnableBottomSheetFragment.this, this.f227768m);
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/fragment/app/Fragment;", "invoke", "()Landroidx/fragment/app/Fragment;", "Cd/v", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class e extends N implements Y41.a<Fragment> {
        public e() {
            super(0);
        }

        @Override // Y41.a
        public final Fragment invoke() {
            return IacEnableBottomSheetFragment.this;
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/T0;", "invoke", "()Landroidx/lifecycle/T0;", "Cd/w", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class f extends N implements Y41.a<T0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ e f227770l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public f(e eVar) {
            super(0);
            this.f227770l = eVar;
        }

        @Override // Y41.a
        public final T0 invoke() {
            return (T0) this.f227770l.invoke();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Landroidx/lifecycle/S0;", "invoke", "()Landroidx/lifecycle/S0;", "Cd/x", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class g extends N implements Y41.a<S0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f227771l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public g(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f227771l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final S0 invoke() {
            return ((T0) this.f227771l.getValue()).getF42820b();
        }
    }

    /* compiled from: FragmentViewModelLazy.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0006\u001a\u00020\u0002\"\n\b\u0000\u0010\u0001\u0018\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Landroidx/lifecycle/M0;", "VM", "Lz1/a;", "invoke", "()Lz1/a;", "Cd/y", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class h extends N implements Y41.a<AbstractC50339a> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Object f227772l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public h(InterfaceC42726C interfaceC42726C) {
            super(0);
            this.f227772l = interfaceC42726C;
        }

        /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.C] */
        @Override // Y41.a
        public final AbstractC50339a invoke() {
            T0 t02 = (T0) this.f227772l.getValue();
            InterfaceC22969B interfaceC22969B = t02 instanceof InterfaceC22969B ? (InterfaceC22969B) t02 : null;
            return interfaceC22969B != null ? interfaceC22969B.getDefaultViewModelCreationExtras() : AbstractC50339a.C12939a.f443748b;
        }
    }

    /* compiled from: IacEnableBottomSheetFragment.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroidx/lifecycle/r0;", "it", "Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/p;", "invoke", "(Landroidx/lifecycle/r0;)Lcom/avito/android/profile_phones/phones_list/iac_enable_bottomsheet/p;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class i extends N implements Y41.l<C23060r0, p> {
        public i() {
            super(1);
        }

        @Override // Y41.l
        public final p invoke(C23060r0 c23060r0) {
            C23060r0 c23060r02 = c23060r0;
            p.a aVar = IacEnableBottomSheetFragment.this.f227750h0;
            if (aVar == null) {
                aVar = null;
            }
            return aVar.a(c23060r02);
        }
    }

    public IacEnableBottomSheetFragment() {
        super(0, 1, null);
        d dVar = new d(new i());
        InterfaceC42726C interfaceC42726CB = C42727D.b(LazyThreadSafetyMode.f406616d, new f(new e()));
        this.f227751i0 = new O0(m0.f406844a.b(p.class), new g(interfaceC42726CB), dVar, new h(interfaceC42726CB));
        this.f227755m0 = new io.reactivex.rxjava3.disposables.c();
        this.f227756n0 = C42727D.c(new b());
    }

    public final p f5() {
        return (p) this.f227751i0.getValue();
    }

    @Override // com.avito.android.ui.fragments.BaseDialogFragment, androidx.fragment.app.DialogFragment, androidx.fragment.app.Fragment
    public final void onCreate(@Y61.l Bundle bundle) {
        super.onCreate(bundle);
        com.avito.android.analytics.screens.D.f90335a.getClass();
        F fA2 = D.a.a();
        com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.a.a().a(this, getResources(), (IacEnableBottomSheetStartData) this.f227756n0.getValue(), new C28478k(IacEnableBottomSheetScreen.f227244d, s.b(this), null, 4, null), (com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c) C29972i.a(C29972i.b(this), com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.di.c.class), cv.c.b(this)).a(this);
        ScreenPerformanceTracker screenPerformanceTracker = this.f227752j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.a(fA2.b());
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f227752j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).c(this, d5());
        f5();
    }

    @Override // androidx.fragment.app.DialogFragment
    @Y61.k
    public final Dialog onCreateDialog(@Y61.l Bundle bundle) {
        ScreenPerformanceTracker screenPerformanceTracker = this.f227752j0;
        if (screenPerformanceTracker == null) {
            screenPerformanceTracker = null;
        }
        screenPerformanceTracker.e();
        C43259k.d(C22981N.a(getLifecycle()), null, null, new c(null), 3);
        Context contextRequireContext = requireContext();
        com.avito.android.lib.design.bottom_sheet.d dVar = new com.avito.android.lib.design.bottom_sheet.d(contextRequireContext, 0, 2, null);
        com.avito.android.lib.design.bottom_sheet.d.M(dVar, null, false, true, 7);
        dVar.S(C35835l0.g(contextRequireContext).y);
        dVar.setCancelable(true);
        dVar.setCanceledOnTouchOutside(true);
        ComposeView composeView = new ComposeView(contextRequireContext, null, 0, 6, null);
        composeView.setContent(new C22096n(998641744, new com.avito.android.profile_phones.phones_list.iac_enable_bottomsheet.d(this, dVar), true));
        dVar.setContentView(composeView);
        ScreenPerformanceTracker screenPerformanceTracker2 = this.f227752j0;
        (screenPerformanceTracker2 != null ? screenPerformanceTracker2 : null).d();
        return dVar;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        this.f227755m0.e();
    }

    @Override // androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(@Y61.k DialogInterface dialogInterface) {
        InterfaceC42726C interfaceC42726C = this.f227756n0;
        if (((IacEnableBottomSheetStartData) interfaceC42726C.getValue()).f227774b && f5().getState().getValue().f227843c != ((IacEnableBottomSheetStartData) interfaceC42726C.getValue()).f227775c) {
            getParentFragmentManager().o0(C22777e.b(new Q("iac_iac_enabled", Boolean.valueOf(f5().getState().getValue().f227843c))), "iac_enabled_result");
        }
        super.onDismiss(dialogInterface);
    }
}
