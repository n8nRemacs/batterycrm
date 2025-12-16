package com.avito.android.wallet.pin.impl.verification.mvi;

import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.akita.compose.component.toast_bar.u;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.l0;
import kotlinx.coroutines.N0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import pP0.InterfaceC46990b;

/* compiled from: WalletPinVerificationScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.WalletPinVerificationScreenKt$WalletPinVerificationContent$1", f = "WalletPinVerificationScreen.kt", i = {}, l = {102}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f329108q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f329109r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC46990b> f329110s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.f f329111t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ u f329112u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ J f329113v;

    /* compiled from: WalletPinVerificationScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LpP0/b;", "event", "Lkotlin/G0;", "emit", "(LpP0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.f f329114b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f329115c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l0.h<N0> f329116d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ u f329117e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ J f329118f;

        /* compiled from: WalletPinVerificationScreen.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.WalletPinVerificationScreenKt$WalletPinVerificationContent$1$1$1", f = "WalletPinVerificationScreen.kt", i = {}, l = {115}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.wallet.pin.impl.verification.mvi.b$a$a, reason: collision with other inner class name */
        public static final class C10222a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f329119q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.f f329120r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10222a(com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVar, Continuation<? super C10222a> continuation) {
                super(2, continuation);
                this.f329120r = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C10222a(this.f329120r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C10222a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f329119q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f329119q = 1;
                    if (this.f329120r.b(this) == coroutine_suspended) {
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

        /* compiled from: WalletPinVerificationScreen.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.WalletPinVerificationScreenKt$WalletPinVerificationContent$1$1$2", f = "WalletPinVerificationScreen.kt", i = {}, l = {125}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.wallet.pin.impl.verification.mvi.b$a$b, reason: collision with other inner class name */
        public static final class C10223b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f329121q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ InterfaceC46990b f329122r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ u f329123s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ J f329124t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10223b(InterfaceC46990b interfaceC46990b, u uVar, J j12, Continuation<? super C10223b> continuation) {
                super(2, continuation);
                this.f329122r = interfaceC46990b;
                this.f329123s = uVar;
                this.f329124t = j12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C10223b(this.f329122r, this.f329123s, this.f329124t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C10223b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f329121q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    String str = ((InterfaceC46990b.f) this.f329122r).f428532a;
                    ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
                    this.f329121q = 1;
                    if (this.f329123s.a(this.f329124t, str, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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

        /* compiled from: WalletPinVerificationScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.verification.mvi.WalletPinVerificationScreenKt$WalletPinVerificationContent$1$1", f = "WalletPinVerificationScreen.kt", i = {0, 2}, l = {105, 106, 110, 111, 119}, m = "emit", n = {"this", "this"}, s = {"L$0", "L$0"})
        public static final class c extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public Object f329125q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f329126r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ a<T> f329127s;

            /* renamed from: t, reason: collision with root package name */
            public int f329128t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(a<? super T> aVar, Continuation<? super c> continuation) {
                super(continuation);
                this.f329127s = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f329126r = obj;
                this.f329128t |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f329127s.emit(null, this);
            }
        }

        public a(com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVar, T t12, l0.h<N0> hVar, u uVar, J j12) {
            this.f329114b = fVar;
            this.f329115c = t12;
            this.f329116d = hVar;
            this.f329117e = uVar;
            this.f329118f = j12;
        }

        /* JADX WARN: Removed duplicated region for block: B:30:0x007c A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:41:0x00a0 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        @Y61.l
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object emit(@Y61.k pP0.InterfaceC46990b r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.verification.mvi.b.a.emit(pP0.b, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public b(InterfaceC43160i<? extends InterfaceC46990b> interfaceC43160i, com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVar, u uVar, J j12, Continuation<? super b> continuation) {
        super(2, continuation);
        this.f329110s = interfaceC43160i;
        this.f329111t = fVar;
        this.f329112u = uVar;
        this.f329113v = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        b bVar = new b(this.f329110s, this.f329111t, this.f329112u, this.f329113v, continuation);
        bVar.f329109r = obj;
        return bVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f329108q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f329111t, (T) this.f329109r, new l0.h(), this.f329112u, this.f329113v);
            this.f329108q = 1;
            if (this.f329110s.collect(aVar, this) == coroutine_suspended) {
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
