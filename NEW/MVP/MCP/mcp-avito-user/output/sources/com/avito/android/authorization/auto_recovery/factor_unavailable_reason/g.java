package com.avito.android.authorization.auto_recovery.factor_unavailable_reason;

import Y41.p;
import android.widget.TextView;
import androidx.fragment.app.ActivityC22955m;
import androidx.view.C23056p0;
import androidx.view.Lifecycle;
import ce.C27181b;
import ce.InterfaceC27180a;
import com.avito.android.R;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonFragment;
import com.avito.android.authorization.auto_recovery.factor_unavailable_reason.mvi.entity.RadioState;
import com.avito.android.component.toast.f;
import com.avito.android.lib.design.button.Button;
import com.avito.android.lib.design.list_item.ListItemRadio;
import com.avito.android.lib.design.toast_bar.ToastBarPosition;
import com.avito.android.printable_text.PrintableText;
import com.avito.android.util.C35847m4;
import java.io.Serializable;
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
import kotlin.reflect.n;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import qK0.C47313c;

/* compiled from: FactorUnavailableReasonFragment.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonFragment$observeViewModel$1", f = "FactorUnavailableReasonFragment.kt", i = {}, l = {128}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class g extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f93117q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ FactorUnavailableReasonFragment f93118r;

    /* compiled from: FactorUnavailableReasonFragment.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonFragment$observeViewModel$1$1", f = "FactorUnavailableReasonFragment.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f93119q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ FactorUnavailableReasonFragment f93120r;

        /* compiled from: FactorUnavailableReasonFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonFragment$observeViewModel$1$1$1", f = "FactorUnavailableReasonFragment.kt", i = {}, l = {130}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.authorization.auto_recovery.factor_unavailable_reason.g$a$a, reason: collision with other inner class name */
        public static final class C2746a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f93121q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ FactorUnavailableReasonFragment f93122r;

            /* compiled from: FactorUnavailableReasonFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.authorization.auto_recovery.factor_unavailable_reason.g$a$a$a, reason: collision with other inner class name */
            public /* synthetic */ class C2747a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FactorUnavailableReasonFragment f93123b;

                public C2747a(FactorUnavailableReasonFragment factorUnavailableReasonFragment) {
                    this.f93123b = factorUnavailableReasonFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    C27181b c27181b = (C27181b) obj;
                    FactorUnavailableReasonFragment.a aVar = FactorUnavailableReasonFragment.f93079y0;
                    FactorUnavailableReasonFragment factorUnavailableReasonFragment = this.f93123b;
                    C47313c c47313c = factorUnavailableReasonFragment.f93089v0;
                    n<Object>[] nVarArr = FactorUnavailableReasonFragment.f93080z0;
                    n<Object> nVar = nVarArr[6];
                    ((Button) c47313c.a()).setLoading(c27181b.f58059b);
                    C47313c c47313c2 = factorUnavailableReasonFragment.f93086s0;
                    n<Object> nVar2 = nVarArr[3];
                    ListItemRadio listItemRadio = (ListItemRadio) c47313c2.a();
                    RadioState radioState = RadioState.f93166c;
                    RadioState radioState2 = c27181b.f58060c;
                    if (radioState2 != radioState) {
                        listItemRadio.setChecked(false);
                    }
                    boolean z12 = !c27181b.f58059b;
                    listItemRadio.setClickable(z12);
                    boolean z13 = c27181b.f58058a;
                    C35847m4.a(listItemRadio, z13);
                    C47313c c47313c3 = factorUnavailableReasonFragment.f93087t0;
                    n<Object> nVar3 = nVarArr[4];
                    ListItemRadio listItemRadio2 = (ListItemRadio) c47313c3.a();
                    if (radioState2 != RadioState.f93167d) {
                        listItemRadio2.setChecked(false);
                    }
                    listItemRadio2.setClickable(z12);
                    C35847m4.a(listItemRadio2, z13);
                    C47313c c47313c4 = factorUnavailableReasonFragment.f93088u0;
                    n<Object> nVar4 = nVarArr[5];
                    ((TextView) c47313c4.a()).setVisibility(z13 ? 0 : 8);
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
                    return new C42801a(2, this.f93123b, FactorUnavailableReasonFragment.class, "renderState", "renderState(Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonState;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C2746a(FactorUnavailableReasonFragment factorUnavailableReasonFragment, Continuation<? super C2746a> continuation) {
                super(2, continuation);
                this.f93122r = factorUnavailableReasonFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C2746a(this.f93122r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C2746a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f93121q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    FactorUnavailableReasonFragment factorUnavailableReasonFragment = this.f93122r;
                    l lVar = (l) factorUnavailableReasonFragment.f93082o0.getValue();
                    C2747a c2747a = new C2747a(factorUnavailableReasonFragment);
                    this.f93121q = 1;
                    if (lVar.le(c2747a, this) == coroutine_suspended) {
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

        /* compiled from: FactorUnavailableReasonFragment.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.authorization.auto_recovery.factor_unavailable_reason.FactorUnavailableReasonFragment$observeViewModel$1$1$2", f = "FactorUnavailableReasonFragment.kt", i = {}, l = {133}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f93124q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ FactorUnavailableReasonFragment f93125r;

            /* compiled from: FactorUnavailableReasonFragment.kt */
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            /* renamed from: com.avito.android.authorization.auto_recovery.factor_unavailable_reason.g$a$b$a, reason: collision with other inner class name */
            public /* synthetic */ class C2748a implements InterfaceC43172j, D {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ FactorUnavailableReasonFragment f93126b;

                public C2748a(FactorUnavailableReasonFragment factorUnavailableReasonFragment) {
                    this.f93126b = factorUnavailableReasonFragment;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    String strK0;
                    InterfaceC27180a interfaceC27180a = (InterfaceC27180a) obj;
                    FactorUnavailableReasonFragment.a aVar = FactorUnavailableReasonFragment.f93079y0;
                    FactorUnavailableReasonFragment factorUnavailableReasonFragment = this.f93126b;
                    if (interfaceC27180a instanceof InterfaceC27180a.b) {
                        InterfaceC27180a.b bVar = (InterfaceC27180a.b) interfaceC27180a;
                        PrintableText printableText = bVar.f58055a;
                        C47313c c47313c = factorUnavailableReasonFragment.f93084q0;
                        if (printableText != null) {
                            n<Object> nVar = FactorUnavailableReasonFragment.f93080z0[1];
                            strK0 = printableText.k0(((TextView) c47313c.a()).getContext());
                        } else {
                            strK0 = null;
                        }
                        com.avito.android.component.toast.c cVar = com.avito.android.component.toast.c.f125244a;
                        n<Object> nVar2 = FactorUnavailableReasonFragment.f93080z0[1];
                        TextView textView = (TextView) c47313c.a();
                        PrintableText printableTextC = (strK0 == null || strK0.length() == 0) ? com.avito.android.printable_text.b.c(R.string.auth_common_error, new Serializable[0]) : com.avito.android.printable_text.b.f(strK0);
                        ToastBarPosition toastBarPosition = ToastBarPosition.f181046d;
                        f.c.f125255c.getClass();
                        com.avito.android.component.toast.c.b(cVar, textView, printableTextC, null, null, null, f.c.a.a(bVar.f58056b, bVar.f58057c), 0, toastBarPosition, null, false, false, null, null, 4014);
                    } else if (interfaceC27180a instanceof InterfaceC27180a.C2051a) {
                        ActivityC22955m activityC22955mRequireActivity = factorUnavailableReasonFragment.requireActivity();
                        activityC22955mRequireActivity.setResult(-1);
                        if (((InterfaceC27180a.C2051a) interfaceC27180a).f58054a) {
                            activityC22955mRequireActivity.finish();
                        }
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
                    return new C42801a(2, this.f93126b, FactorUnavailableReasonFragment.class, "handleEvent", "handleEvent(Lcom/avito/android/authorization/auto_recovery/factor_unavailable_reason/mvi/entity/FactorUnavailableReasonOneTimeEvent;)V", 4);
                }

                public final int hashCode() {
                    return getFunctionDelegate().hashCode();
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(FactorUnavailableReasonFragment factorUnavailableReasonFragment, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f93125r = factorUnavailableReasonFragment;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f93125r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f93124q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    FactorUnavailableReasonFragment factorUnavailableReasonFragment = this.f93125r;
                    l lVar = (l) factorUnavailableReasonFragment.f93082o0.getValue();
                    C2748a c2748a = new C2748a(factorUnavailableReasonFragment);
                    this.f93124q = 1;
                    if (lVar.ke(c2748a, this) == coroutine_suspended) {
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
        public a(FactorUnavailableReasonFragment factorUnavailableReasonFragment, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f93120r = factorUnavailableReasonFragment;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f93120r, continuation);
            aVar.f93119q = obj;
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
            T t12 = (T) this.f93119q;
            FactorUnavailableReasonFragment factorUnavailableReasonFragment = this.f93120r;
            C43259k.d(t12, null, null, new C2746a(factorUnavailableReasonFragment, null), 3);
            C43259k.d(t12, null, null, new b(factorUnavailableReasonFragment, null), 3);
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public g(FactorUnavailableReasonFragment factorUnavailableReasonFragment, Continuation<? super g> continuation) {
        super(2, continuation);
        this.f93118r = factorUnavailableReasonFragment;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new g(this.f93118r, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((g) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f93117q;
        if (i12 == 0) {
            C42729a0.b(obj);
            Lifecycle.State state = Lifecycle.State.f46682e;
            FactorUnavailableReasonFragment factorUnavailableReasonFragment = this.f93118r;
            a aVar = new a(factorUnavailableReasonFragment, null);
            this.f93117q = 1;
            if (C23056p0.b(factorUnavailableReasonFragment, state, aVar, this) == coroutine_suspended) {
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
