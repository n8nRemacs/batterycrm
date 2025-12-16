package com.avito.android.auto_evidence_request.files;

import Ce.InterfaceC13295c;
import Y41.p;
import Y61.l;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.remote.model.text.AttributedText;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.m;
import io.reactivex.rxjava3.internal.operators.single.S;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.N;
import kotlinx.coroutines.channels.B;
import kotlinx.coroutines.channels.F0;
import kotlinx.coroutines.channels.I0;

/* compiled from: AutoEvidenceRequestFilesInteractor.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/channels/I0;", "LCe/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/channels/I0;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.auto_evidence_request.files.AutoEvidenceRequestFilesInteractorImpl$toFlowReportData$1", f = "AutoEvidenceRequestFilesInteractor.kt", i = {}, l = {186}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class i extends SuspendLambda implements p<I0<? super InterfaceC13295c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f95150q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f95151r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f95152s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ S f95153t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ AttributedText f95154u;

    /* compiled from: AutoEvidenceRequestFilesInteractor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0006\u001a\u00020\u00032\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u0000H\n¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lcom/avito/android/remote/model/TypedResult;", "Lcom/avito/android/remote/model/confirmation/EvidenceConfirmationResult;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/remote/model/TypedResult;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I0<InterfaceC13295c> f95155b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ AttributedText f95156c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(I0<? super InterfaceC13295c> i02, AttributedText attributedText) {
            this.f95155b = i02;
            this.f95156c = attributedText;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            TypedResult typedResult = (TypedResult) obj;
            boolean z12 = typedResult instanceof TypedResult.Success;
            I0<InterfaceC13295c> i02 = this.f95155b;
            if (z12) {
                Object objW = i02.w(new InterfaceC13295c.a(this.f95156c));
                B.b bVar = B.f410772b;
                if (objW instanceof B.c) {
                    return;
                }
                i02.h(null);
                return;
            }
            if (typedResult instanceof TypedResult.Error) {
                Object objW2 = i02.w(new InterfaceC13295c.C0118c(((TypedResult.Error) typedResult).getError().getF244063c()));
                B.b bVar2 = B.f410772b;
                if (objW2 instanceof B.c) {
                    return;
                }
                i02.h(null);
            }
        }
    }

    /* compiled from: AutoEvidenceRequestFilesInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I0<InterfaceC13295c> f95157b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(I0<? super InterfaceC13295c> i02) {
            this.f95157b = i02;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f95157b.h((Throwable) obj);
        }
    }

    /* compiled from: AutoEvidenceRequestFilesInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f95158l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f95158l = gVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            m mVar = this.f95158l.f95133l;
            if (mVar != null) {
                DisposableHelper.a(mVar);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public i(g gVar, S s5, AttributedText attributedText, Continuation continuation) {
        super(2, continuation);
        this.f95152s = gVar;
        this.f95153t = s5;
        this.f95154u = attributedText;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        i iVar = new i(this.f95152s, this.f95153t, this.f95154u, continuation);
        iVar.f95151r = obj;
        return iVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super InterfaceC13295c> i02, Continuation<? super G0> continuation) {
        return ((i) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f95150q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f95151r;
            Object objW = i02.w(InterfaceC13295c.h.f2539a);
            B.b bVar = B.f410772b;
            boolean z12 = objW instanceof B.c;
            m mVar = (m) this.f95153t.x(new a(i02, this.f95154u), new b(i02));
            g gVar = this.f95152s;
            gVar.f95133l = mVar;
            c cVar = new c(gVar);
            this.f95150q = 1;
            if (F0.a(i02, cVar, this) == coroutine_suspended) {
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
