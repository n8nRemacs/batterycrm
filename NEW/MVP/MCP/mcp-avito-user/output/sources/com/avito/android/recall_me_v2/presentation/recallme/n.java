package com.avito.android.recall_me_v2.presentation.recallme;

import Di0.InterfaceC13404b;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.T;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: RecallMeScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.RecallMeScreenKt$RecallMeScreen$1", f = "RecallMeScreen.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class n extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f252203q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC13404b> f252204r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f252205s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ J f252206t;

    /* compiled from: RecallMeScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LDi0/b;", "event", "Lkotlin/G0;", "<anonymous>", "(LDi0/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.recall_me_v2.presentation.recallme.RecallMeScreenKt$RecallMeScreen$1$1", f = "RecallMeScreen.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC13404b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f252207q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f252208r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f252209s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ J f252210t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.akita.compose.component.toast_bar.u uVar, J j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f252209s = uVar;
            this.f252210t = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f252209s, this.f252210t, continuation);
            aVar.f252208r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC13404b interfaceC13404b, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC13404b, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f252207q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC13404b interfaceC13404b = (InterfaceC13404b) this.f252208r;
                if (!(interfaceC13404b instanceof InterfaceC13404b.a) && (interfaceC13404b instanceof InterfaceC13404b.C0187b)) {
                    String str = ((InterfaceC13404b.C0187b) interfaceC13404b).f3399a;
                    this.f252207q = 1;
                    if (this.f252209s.a(this.f252210t, str, G0.f406611a, (60 & 8) != 0 ? null : null, (60 & 32) != 0 ? ToastBarDuration.f63230b : null, (60 & 64) != 0 ? ToastBarPosition.f63235b : null, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
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
    /* JADX WARN: Multi-variable type inference failed */
    public n(InterfaceC43160i<? extends InterfaceC13404b> interfaceC43160i, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation<? super n> continuation) {
        super(2, continuation);
        this.f252204r = interfaceC43160i;
        this.f252205s = uVar;
        this.f252206t = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        n nVar = new n(this.f252204r, this.f252205s, this.f252206t, continuation);
        nVar.f252203q = obj;
        return nVar;
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((n) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        C43175k.K(new C43197r1(new a(this.f252205s, this.f252206t, null), this.f252204r), (T) this.f252203q);
        return G0.f406611a;
    }
}
