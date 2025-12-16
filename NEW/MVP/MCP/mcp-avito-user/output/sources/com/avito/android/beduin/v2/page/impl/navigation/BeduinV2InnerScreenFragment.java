package com.avito.android.beduin.v2.page.impl.navigation;

import Ji.InterfaceC14199a;
import Li.InterfaceC14399a;
import Ni.C14578a;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.compose.runtime.internal.P;
import androidx.view.C22984Q;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import cU.s;
import com.avito.android.R;
import com.avito.android.analytics.screens.InterfaceC28477j;
import com.avito.android.di.C29972i;
import com.avito.android.remote.model.messenger.voice.VoiceInfo;
import com.avito.android.ui.fragments.BaseFragment;
import com.avito.beduin.v2.engine.D;
import com.avito.beduin.v2.interaction.navigation.flow.u;
import com.avito.beduin.v2.render.android_view.A;
import com.avito.beduin.v2.render.android_view.BeduinView;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: BeduinV2InnerScreenFragment.kt */
@P
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002:\u0001\u0005B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0006"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/navigation/BeduinV2InnerScreenFragment;", "Lcom/avito/android/ui/fragments/BaseFragment;", "Lcom/avito/android/analytics/screens/j$a;", "<init>", "()V", "a", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class BeduinV2InnerScreenFragment extends BaseFragment implements InterfaceC28477j.a {

    /* renamed from: r0, reason: collision with root package name */
    @k
    public static final a f105127r0 = new a(null);

    /* renamed from: n0, reason: collision with root package name */
    @Inject
    public s f105128n0;

    /* renamed from: o0, reason: collision with root package name */
    @Inject
    public Ji.e f105129o0;

    /* renamed from: p0, reason: collision with root package name */
    public BeduinView f105130p0;

    /* renamed from: q0, reason: collision with root package name */
    @l
    public D f105131q0;

    /* compiled from: BeduinV2InnerScreenFragment.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Lcom/avito/android/beduin/v2/page/impl/navigation/BeduinV2InnerScreenFragment$a;", "", "<init>", "()V", "", "BEDUIN_NAVIGATE_SCREEN_KEY", "Ljava/lang/String;", "BEDUIN_PERF_CONTENT_TYPE", "BEDUIN_PERF_TRACKER_RESULT", "_design-modules_beduin-v2-page_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    /* compiled from: BeduinV2InnerScreenFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.navigation.BeduinV2InnerScreenFragment$onCreateView$2", f = "BeduinV2InnerScreenFragment.kt", i = {}, l = {93}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f105132q;

        /* compiled from: BeduinV2InnerScreenFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.beduin.v2.page.impl.navigation.BeduinV2InnerScreenFragment$onCreateView$2$1", f = "BeduinV2InnerScreenFragment.kt", i = {}, l = {94}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f105134q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ BeduinV2InnerScreenFragment f105135r;

            /* compiled from: BeduinV2InnerScreenFragment.kt */
            @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\u000b\u0010\u0002\u001a\u00070\u0000¢\u0006\u0002\b\u0001H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LKi/b;", "LX41/o;", VoiceInfo.STATE, "Lkotlin/G0;", "emit", "(LKi/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.beduin.v2.page.impl.navigation.BeduinV2InnerScreenFragment$b$a$a, reason: collision with other inner class name */
            public static final class C3139a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ BeduinV2InnerScreenFragment f105136b;

                public C3139a(BeduinV2InnerScreenFragment beduinV2InnerScreenFragment) {
                    this.f105136b = beduinV2InnerScreenFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    Ki.b bVar = (Ki.b) obj;
                    BeduinV2InnerScreenFragment beduinV2InnerScreenFragment = this.f105136b;
                    s sVar = beduinV2InnerScreenFragment.f105128n0;
                    if (sVar == null) {
                        sVar = null;
                    }
                    com.avito.android.analytics.screens.mvi.a.i(bVar, sVar.getPerformanceTracker(), new d(beduinV2InnerScreenFragment));
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(BeduinV2InnerScreenFragment beduinV2InnerScreenFragment, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f105135r = beduinV2InnerScreenFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f105135r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f105134q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    BeduinV2InnerScreenFragment beduinV2InnerScreenFragment = this.f105135r;
                    Ji.e eVar = beduinV2InnerScreenFragment.f105129o0;
                    if (eVar == null) {
                        eVar = null;
                    }
                    C3139a c3139a = new C3139a(beduinV2InnerScreenFragment);
                    this.f105134q = 1;
                    if (eVar.collect(c3139a, this) == coroutine_suspended) {
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

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return BeduinV2InnerScreenFragment.this.new b(continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f105132q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                BeduinV2InnerScreenFragment beduinV2InnerScreenFragment = BeduinV2InnerScreenFragment.this;
                a aVar = new a(beduinV2InnerScreenFragment, null);
                this.f105132q = 1;
                if (C23056p0.b(beduinV2InnerScreenFragment, state, aVar, this) == coroutine_suspended) {
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

    public BeduinV2InnerScreenFragment() {
        super(0, 1, null);
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    /* renamed from: h5 */
    public final boolean getF304598h0() {
        return false;
    }

    @Override // androidx.fragment.app.Fragment
    @k
    public final View onCreateView(@k LayoutInflater layoutInflater, @l ViewGroup viewGroup, @l Bundle bundle) {
        BeduinView beduinView = new BeduinView(requireContext(), null, 0, 0, 14, null);
        beduinView.setId(R.id.beduin);
        s sVar = this.f105128n0;
        if (sVar == null) {
            sVar = null;
        }
        A aB2 = sVar.b();
        s sVar2 = this.f105128n0;
        if (sVar2 == null) {
            sVar2 = null;
        }
        com.avito.beduin.v2.theme.k kVarA = sVar2.a();
        beduinView.f337913c = aB2;
        beduinView.f337914d = kVarA;
        this.f105130p0 = beduinView;
        C43259k.d(C22984Q.a(getViewLifecycleOwner()), null, null, new b(null), 3);
        BeduinView beduinView2 = this.f105130p0;
        if (beduinView2 == null) {
            return null;
        }
        return beduinView2;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        D d12;
        super.onDestroy();
        if (!isRemoving() || (d12 = this.f105131q0) == null) {
            return;
        }
        d12.destroy();
    }

    @Override // com.avito.android.ui.fragments.BaseFragment
    public final void p5(@l Bundle bundle) {
        String string;
        Bundle arguments = getArguments();
        if (arguments == null || (string = arguments.getString("beduin_navigate_screen_key")) == null) {
            throw new IllegalStateException("You need to pass screen key for fragment");
        }
        InterfaceC14199a.InterfaceC0538a interfaceC0538aSi = ((InterfaceC14199a.b) C29972i.a(C29972i.b(this), InterfaceC14199a.b.class)).si();
        u.f337549b.getClass();
        u uVarA = u.a.a(string);
        Bundle arguments2 = getArguments();
        String string2 = arguments2 != null ? arguments2.getString("beduin_perf_content_type") : null;
        Bundle arguments3 = getArguments();
        interfaceC0538aSi.a((InterfaceC14399a) C29972i.a(C29972i.b(this), InterfaceC14399a.class), uVarA, string2, C14578a.a(arguments3 != null ? arguments3.getString("beduin_perf_tracker_result") : null)).a(this);
    }
}
