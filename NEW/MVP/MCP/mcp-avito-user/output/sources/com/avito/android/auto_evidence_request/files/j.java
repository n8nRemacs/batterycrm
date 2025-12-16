package com.avito.android.auto_evidence_request.files;

import Ce.InterfaceC13295c;
import Y41.p;
import Y61.l;
import com.avito.android.photo_cache.q;
import io.reactivex.rxjava3.core.z;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
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
@DebugMetadata(c = "com.avito.android.auto_evidence_request.files.AutoEvidenceRequestFilesInteractorImpl$toFlowUploadingState$1", f = "AutoEvidenceRequestFilesInteractor.kt", i = {}, l = {221}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class j extends SuspendLambda implements p<I0<? super InterfaceC13295c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f95159q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f95160r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f95161s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ z<q> f95162t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f95163u;

    /* compiled from: AutoEvidenceRequestFilesInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/photo_cache/q;", "it", "Lkotlin/G0;", "accept", "(Lcom/avito/android/photo_cache/q;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I0<InterfaceC13295c> f95164b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f95165c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(I0<? super InterfaceC13295c> i02, String str) {
            this.f95164b = i02;
            this.f95165c = str;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            q qVar = (q) obj;
            boolean z12 = qVar instanceof q.c;
            String str = this.f95165c;
            I0<InterfaceC13295c> i02 = this.f95164b;
            if (z12) {
                Object objW = i02.w(new InterfaceC13295c.l((q.c) qVar, str));
                B.b bVar = B.f410772b;
                if (objW instanceof B.c) {
                    return;
                }
                i02.h(null);
                return;
            }
            if (qVar instanceof q.d) {
                Object objW2 = i02.w(new InterfaceC13295c.m((q.d) qVar, str));
                B.b bVar2 = B.f410772b;
                boolean z13 = objW2 instanceof B.c;
            } else if (qVar instanceof q.a) {
                Object objW3 = i02.w(new InterfaceC13295c.n((q.a) qVar, str));
                B.b bVar3 = B.f410772b;
                if (objW3 instanceof B.c) {
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
        public final /* synthetic */ I0<InterfaceC13295c> f95166b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(I0<? super InterfaceC13295c> i02) {
            this.f95166b = i02;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f95166b.h((Throwable) obj);
        }
    }

    /* compiled from: AutoEvidenceRequestFilesInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f95167l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f95167l = gVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            y yVar = this.f95167l.f95131j;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public j(g gVar, z<q> zVar, String str, Continuation<? super j> continuation) {
        super(2, continuation);
        this.f95161s = gVar;
        this.f95162t = zVar;
        this.f95163u = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        j jVar = new j(this.f95161s, this.f95162t, this.f95163u, continuation);
        jVar.f95160r = obj;
        return jVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super InterfaceC13295c> i02, Continuation<? super G0> continuation) {
        return ((j) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f95159q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f95160r;
            a aVar = new a(i02, this.f95163u);
            b bVar = new b(i02);
            z<q> zVar = this.f95162t;
            zVar.getClass();
            y yVar = (y) zVar.v0(aVar, bVar, io.reactivex.rxjava3.internal.functions.a.f401993c);
            g gVar = this.f95161s;
            gVar.f95131j = yVar;
            c cVar = new c(gVar);
            this.f95159q = 1;
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
