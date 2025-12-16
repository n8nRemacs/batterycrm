package com.avito.android.wallet.pin.impl.creation.mvi;

import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import eP0.b;
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

/* compiled from: WalletPinCreationScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.WalletPinCreationScreenKt$WalletPinCreationContent$2", f = "WalletPinCreationScreen.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes5.dex */
final class h extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f328678q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f328679r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<eP0.b> f328680s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.f f328681t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f328682u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ J f328683v;

    /* compiled from: WalletPinCreationScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LeP0/b;", "event", "Lkotlin/G0;", "emit", "(LeP0/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.f f328684b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ T f328685c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ l0.h<N0> f328686d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f328687e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ J f328688f;

        /* compiled from: WalletPinCreationScreen.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.WalletPinCreationScreenKt$WalletPinCreationContent$2$1$1", f = "WalletPinCreationScreen.kt", i = {}, l = {179}, m = "invokeSuspend", n = {}, s = {})
        /* renamed from: com.avito.android.wallet.pin.impl.creation.mvi.h$a$a, reason: collision with other inner class name */
        public static final class C10198a extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f328689q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ com.avito.android.wallet.pin.impl.ui.components.pin_input.f f328690r;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public C10198a(com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVar, Continuation<? super C10198a> continuation) {
                super(2, continuation);
                this.f328690r = fVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new C10198a(this.f328690r, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((C10198a) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f328689q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    this.f328689q = 1;
                    if (this.f328690r.b(this) == coroutine_suspended) {
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

        /* compiled from: WalletPinCreationScreen.kt */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.WalletPinCreationScreenKt$WalletPinCreationContent$2$1$2", f = "WalletPinCreationScreen.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
        public static final class b extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

            /* renamed from: q, reason: collision with root package name */
            public int f328691q;

            /* renamed from: r, reason: collision with root package name */
            public final /* synthetic */ eP0.b f328692r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ com.akita.compose.component.toast_bar.u f328693s;

            /* renamed from: t, reason: collision with root package name */
            public final /* synthetic */ J f328694t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public b(eP0.b bVar, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation<? super b> continuation) {
                super(2, continuation);
                this.f328692r = bVar;
                this.f328693s = uVar;
                this.f328694t = j12;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.k
            public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
                return new b(this.f328692r, this.f328693s, this.f328694t, continuation);
            }

            @Override // Y41.p
            public final Object invoke(T t12, Continuation<? super G0> continuation) {
                return ((b) create(t12, continuation)).invokeSuspend(G0.f406611a);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i12 = this.f328691q;
                if (i12 == 0) {
                    C42729a0.b(obj);
                    String str = ((b.g) this.f328692r).f395179a;
                    ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
                    this.f328691q = 1;
                    if (this.f328693s.a(this.f328694t, str, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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

        /* compiled from: WalletPinCreationScreen.kt */
        @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
        @DebugMetadata(c = "com.avito.android.wallet.pin.impl.creation.mvi.WalletPinCreationScreenKt$WalletPinCreationContent$2$1", f = "WalletPinCreationScreen.kt", i = {0, 2}, l = {169, 170, 174, 175, 183}, m = "emit", n = {"this", "this"}, s = {"L$0", "L$0"})
        public static final class c extends ContinuationImpl {

            /* renamed from: q, reason: collision with root package name */
            public Object f328695q;

            /* renamed from: r, reason: collision with root package name */
            public /* synthetic */ Object f328696r;

            /* renamed from: s, reason: collision with root package name */
            public final /* synthetic */ a<T> f328697s;

            /* renamed from: t, reason: collision with root package name */
            public int f328698t;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public c(a<? super T> aVar, Continuation<? super c> continuation) {
                super(continuation);
                this.f328697s = aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            @Y61.l
            public final Object invokeSuspend(@Y61.k Object obj) {
                this.f328696r = obj;
                this.f328698t |= BeduinInputModel.MIN_TEXT_VERSION;
                return this.f328697s.emit(null, this);
            }
        }

        public a(com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVar, T t12, l0.h<N0> hVar, com.akita.compose.component.toast_bar.u uVar, J j12) {
            this.f328684b = fVar;
            this.f328685c = t12;
            this.f328686d = hVar;
            this.f328687e = uVar;
            this.f328688f = j12;
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
        public final java.lang.Object emit(@Y61.k eP0.b r10, @Y61.k kotlin.coroutines.Continuation<? super kotlin.G0> r11) {
            /*
                Method dump skipped, instructions count: 236
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.wallet.pin.impl.creation.mvi.h.a.emit(eP0.b, kotlin.coroutines.Continuation):java.lang.Object");
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public h(InterfaceC43160i<? extends eP0.b> interfaceC43160i, com.avito.android.wallet.pin.impl.ui.components.pin_input.f fVar, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation<? super h> continuation) {
        super(2, continuation);
        this.f328680s = interfaceC43160i;
        this.f328681t = fVar;
        this.f328682u = uVar;
        this.f328683v = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        h hVar = new h(this.f328680s, this.f328681t, this.f328682u, this.f328683v, continuation);
        hVar.f328679r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((h) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f328678q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f328681t, (T) this.f328679r, new l0.h(), this.f328682u, this.f328683v);
            this.f328678q = 1;
            if (this.f328680s.collect(aVar, this) == coroutine_suspended) {
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
