package com.avito.android.beduin.common.actionhandler.apply_haptic;

import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.view.View;
import androidx.fragment.app.ActivityC22955m;
import androidx.recyclerview.widget.RecyclerView;
import androidx.view.C22981N;
import androidx.view.C23056p0;
import androidx.view.InterfaceC22983P;
import androidx.view.Lifecycle;
import com.avito.android.beduin.common.action.BeduinApplyHapticAction;
import com.avito.android.di.B;
import gj.InterfaceC40691b;
import gj.i;
import gj.j;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.e2;

/* compiled from: BeduinApplyHapticScreenConnector.kt */
@B
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/beduin/common/actionhandler/apply_haptic/c;", "Lgj/j;", "_avito_beduin_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements j {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.android.beduin.common.actionhandler.apply_haptic.a f100166a;

    /* compiled from: BeduinApplyHapticScreenConnector.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f100167a;

        static {
            int[] iArr = new int[BeduinApplyHapticAction.AndroidType.values().length];
            try {
                iArr[BeduinApplyHapticAction.AndroidType.CLOCK_TICK.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.CONFIRM.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.CONTEXT_CLICK.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.DRAG_START.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.GESTURE_END.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.GESTURE_START.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.KEYBOARD_PRESS.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.KEYBOARD_RELEASE.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.LONG_PRESS.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.NO_HAPTICS.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.REJECT.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.SEGMENT_TICK.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.SEGMENT_FREQUENT_TICK.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.TEXT_HANDLE_MOVE.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.TOGGLE_OFF.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                iArr[BeduinApplyHapticAction.AndroidType.TOGGLE_ON.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            f100167a = iArr;
        }
    }

    /* compiled from: BeduinApplyHapticScreenConnector.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.beduin.common.actionhandler.apply_haptic.BeduinApplyHapticScreenConnector$connect$1", f = "BeduinApplyHapticScreenConnector.kt", i = {}, l = {32}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f100168q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ InterfaceC22983P f100169r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ c f100170s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ i f100171t;

        /* compiled from: BeduinApplyHapticScreenConnector.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.beduin.common.actionhandler.apply_haptic.BeduinApplyHapticScreenConnector$connect$1$1", f = "BeduinApplyHapticScreenConnector.kt", i = {}, l = {33}, m = "invokeSuspend", n = {}, s = {})
        public static final class a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f100172q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ c f100173r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ i f100174s;

            /* compiled from: BeduinApplyHapticScreenConnector.kt */
            @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction$AndroidType;", "applyHapticAndroidType", "Lkotlin/G0;", "emit", "(Lcom/avito/android/beduin/common/action/BeduinApplyHapticAction$AndroidType;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
            /* renamed from: com.avito.android.beduin.common.actionhandler.apply_haptic.c$b$a$a, reason: collision with other inner class name */
            public static final class C3011a<T> implements InterfaceC43172j {

                /* renamed from: b, reason: collision with root package name */
                public final /* synthetic */ c f100175b;

                /* renamed from: c, reason: collision with root package name */
                public final /* synthetic */ i f100176c;

                public C3011a(c cVar, i iVar) {
                    this.f100175b = cVar;
                    this.f100176c = iVar;
                }

                @Override // kotlinx.coroutines.flow.InterfaceC43172j
                public final Object emit(Object obj, Continuation continuation) {
                    View rootView;
                    this.f100175b.getClass();
                    Integer numValueOf = null;
                    switch (a.f100167a[((BeduinApplyHapticAction.AndroidType) obj).ordinal()]) {
                        case 1:
                            numValueOf = 4;
                            break;
                        case 2:
                            numValueOf = Integer.valueOf(Build.VERSION.SDK_INT >= 30 ? 16 : 6);
                            break;
                        case 3:
                            numValueOf = 6;
                            break;
                        case 4:
                            if (Build.VERSION.SDK_INT >= 34) {
                                numValueOf = 25;
                                break;
                            }
                            break;
                        case 5:
                            if (Build.VERSION.SDK_INT >= 30) {
                                numValueOf = 13;
                                break;
                            }
                            break;
                        case 6:
                            if (Build.VERSION.SDK_INT >= 30) {
                                numValueOf = 12;
                                break;
                            }
                            break;
                        case 7:
                            numValueOf = 3;
                            break;
                        case 8:
                            numValueOf = 7;
                            break;
                        case 9:
                            numValueOf = 0;
                            break;
                        case 10:
                            if (Build.VERSION.SDK_INT >= 34) {
                                numValueOf = -1;
                                break;
                            }
                            break;
                        case 11:
                            if (Build.VERSION.SDK_INT >= 30) {
                                numValueOf = 17;
                                break;
                            }
                            break;
                        case 12:
                            if (Build.VERSION.SDK_INT >= 34) {
                                numValueOf = 26;
                                break;
                            }
                            break;
                        case 13:
                            if (Build.VERSION.SDK_INT >= 34) {
                                numValueOf = 27;
                                break;
                            }
                            break;
                        case 14:
                            numValueOf = 9;
                            break;
                        case 15:
                            if (Build.VERSION.SDK_INT >= 34) {
                                numValueOf = 22;
                                break;
                            }
                            break;
                        case 16:
                            if (Build.VERSION.SDK_INT >= 34) {
                                numValueOf = 21;
                                break;
                            }
                            break;
                        default:
                            throw new NoWhenBranchMatchedException();
                    }
                    if (numValueOf != null) {
                        int iIntValue = numValueOf.intValue();
                        i iVar = this.f100176c;
                        RecyclerView recyclerViewB0 = iVar.B0(iVar.m0());
                        if (recyclerViewB0 != null && (rootView = recyclerViewB0.getRootView()) != null) {
                            Boxing.boxBoolean(rootView.performHapticFeedback(iIntValue));
                        }
                    }
                    return G0.f406611a;
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(c cVar, i iVar, Continuation<? super a> continuation) {
                super(2, continuation);
                this.f100173r = cVar;
                this.f100174s = iVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @k
            public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
                return new a(this.f100173r, this.f100174s, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @l
            public final Object invokeSuspend(@k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f100172q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    c cVar = this.f100173r;
                    e2 e2Var = cVar.f100166a.f100164b;
                    C3011a c3011a = new C3011a(cVar, this.f100174s);
                    this.f100172q = 1;
                    e2Var.getClass();
                    if (e2.g(e2Var, c3011a, this) == coroutine_suspended) {
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
        public b(InterfaceC22983P interfaceC22983P, c cVar, i iVar, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f100169r = interfaceC22983P;
            this.f100170s = cVar;
            this.f100171t = iVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return new b(this.f100169r, this.f100170s, this.f100171t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f100168q;
            if (i12 == 0) {
                C42729a0.b(obj);
                Lifecycle.State state = Lifecycle.State.f46682e;
                a aVar = new a(this.f100170s, this.f100171t, null);
                this.f100168q = 1;
                if (C23056p0.b(this.f100169r, state, aVar, this) == coroutine_suspended) {
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
    public c(@k com.avito.android.beduin.common.actionhandler.apply_haptic.a aVar) {
        this.f100166a = aVar;
    }

    @Override // gj.j
    public final void a(@k InterfaceC40691b interfaceC40691b, @l gj.l lVar, @k i iVar, @k InterfaceC22983P interfaceC22983P, @k ActivityC22955m activityC22955m) {
        C43259k.d(C22981N.a(interfaceC22983P.getLifecycle()), null, null, new b(interfaceC22983P, this, iVar, null), 3);
    }
}
