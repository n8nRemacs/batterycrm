package com.avito.android.safety.safety_settings;

import Y41.p;
import Y61.k;
import Y61.l;
import android.content.Intent;
import androidx.fragment.app.ActivityC22955m;
import androidx.fragment.app.H;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.L;
import com.avito.android.M;
import com.avito.android.R;
import com.avito.android.safety.safety_settings.SafetySettingsFragment;
import com.avito.android.safety.tfa_disable_password.TfaDisablePasswordFragment;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.InterfaceC43072x;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.C42801a;
import kotlin.jvm.internal.D;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import vo0.InterfaceC49362a;

/* compiled from: SafetySettingsFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.safety.safety_settings.SafetySettingsFragment$onCreateView$2$1$1", f = "SafetySettingsFragment.kt", i = {}, l = {150}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes3.dex */
final class f extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f257638q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC22983P f257639r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ SafetySettingsFragment f257640s;

    /* compiled from: SafetySettingsFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.safety.safety_settings.SafetySettingsFragment$onCreateView$2$1$1$1", f = "SafetySettingsFragment.kt", i = {}, l = {151}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f257641q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ SafetySettingsFragment f257642r;

        /* compiled from: SafetySettingsFragment.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        /* renamed from: com.avito.android.safety.safety_settings.f$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C7735a implements InterfaceC43172j, D {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ SafetySettingsFragment f257643b;

            public C7735a(SafetySettingsFragment safetySettingsFragment) {
                this.f257643b = safetySettingsFragment;
            }

            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            public final Object emit(Object obj, Continuation continuation) {
                ActivityC22955m activityC22955mL1;
                InterfaceC49362a interfaceC49362a = (InterfaceC49362a) obj;
                SafetySettingsFragment.a aVar = SafetySettingsFragment.f257523w0;
                SafetySettingsFragment safetySettingsFragment = this.f257643b;
                if (interfaceC49362a instanceof InterfaceC49362a.c) {
                    InterfaceC49362a.c cVar = (InterfaceC49362a.c) interfaceC49362a;
                    if (cVar instanceof InterfaceC49362a.C12791a) {
                        Intent intent = safetySettingsFragment.f257531u0;
                        if (intent != null) {
                            safetySettingsFragment.startActivity(intent);
                        } else {
                            ActivityC22955m activityC22955mL12 = safetySettingsFragment.l1();
                            if (activityC22955mL12 != null && activityC22955mL12.isTaskRoot()) {
                                M m12 = safetySettingsFragment.f257528r0;
                                if (m12 == null) {
                                    m12 = null;
                                }
                                safetySettingsFragment.startActivity(L.a.a(m12, null, 3));
                            }
                        }
                        if (((InterfaceC49362a.C12791a) interfaceC49362a).f440960a && (activityC22955mL1 = safetySettingsFragment.l1()) != null) {
                            activityC22955mL1.setResult(-1);
                        }
                        ActivityC22955m activityC22955mL13 = safetySettingsFragment.l1();
                        if (activityC22955mL13 != null) {
                            activityC22955mL13.finish();
                        }
                    } else if (cVar instanceof InterfaceC49362a.b) {
                        safetySettingsFragment.f257532v0.b(G0.f406611a);
                    } else if (cVar instanceof InterfaceC49362a.d) {
                        TfaDisablePasswordFragment.f258071x0.getClass();
                        TfaDisablePasswordFragment tfaDisablePasswordFragment = new TfaDisablePasswordFragment();
                        H hE2 = safetySettingsFragment.getParentFragmentManager().e();
                        hE2.j(R.id.fragment_container, tfaDisablePasswordFragment, null, 1);
                        hE2.e();
                    }
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
            @k
            public final InterfaceC43072x<?> getFunctionDelegate() {
                return new C42801a(2, this.f257643b, SafetySettingsFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/safety/safety_settings/mvi/entity/SafetySettingsOneTimeEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(SafetySettingsFragment safetySettingsFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f257642r = safetySettingsFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new a(this.f257642r, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f257641q;
            if (i12 == 0) {
                C42729a0.b(obj);
                SafetySettingsFragment.a aVar = SafetySettingsFragment.f257523w0;
                SafetySettingsFragment safetySettingsFragment = this.f257642r;
                h hVarQ5 = safetySettingsFragment.q5();
                C7735a c7735a = new C7735a(safetySettingsFragment);
                this.f257641q = 1;
                if (hVarQ5.ke(c7735a, this) == coroutine_suspended) {
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
    public f(InterfaceC22983P interfaceC22983P, SafetySettingsFragment safetySettingsFragment, Continuation<? super f> continuation) {
        super(2, continuation);
        this.f257639r = interfaceC22983P;
        this.f257640s = safetySettingsFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @k
    public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
        return new f(this.f257639r, this.f257640s, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((f) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f257638q;
        if (i12 == 0) {
            C42729a0.b(obj);
            InterfaceC22983P interfaceC22983P = this.f257639r;
            Lifecycle.State state = Lifecycle.State.f46682e;
            a aVar = new a(this.f257640s, null);
            this.f257638q = 1;
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
