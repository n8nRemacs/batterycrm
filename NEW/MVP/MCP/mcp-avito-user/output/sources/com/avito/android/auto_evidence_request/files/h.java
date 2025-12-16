package com.avito.android.auto_evidence_request.files;

import Ce.InterfaceC13295c;
import Y41.p;
import Y61.l;
import android.net.Uri;
import io.reactivex.rxjava3.internal.disposables.DisposableHelper;
import io.reactivex.rxjava3.internal.observers.y;
import io.reactivex.rxjava3.internal.operators.observable.B0;
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
@DebugMetadata(c = "com.avito.android.auto_evidence_request.files.AutoEvidenceRequestFilesInteractorImpl$toFlowLocalUri$1", f = "AutoEvidenceRequestFilesInteractor.kt", i = {}, l = {246}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes11.dex */
final class h extends SuspendLambda implements p<I0<? super InterfaceC13295c>, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f95137q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f95138r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ g f95139s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ B0 f95140t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ String f95141u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ String f95142v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ String f95143w;

    /* compiled from: AutoEvidenceRequestFilesInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Landroid/net/Uri;", "it", "Lkotlin/G0;", "accept", "(Landroid/net/Uri;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I0<InterfaceC13295c> f95144b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ String f95145c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ String f95146d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f95147e;

        /* JADX WARN: Multi-variable type inference failed */
        public a(I0<? super InterfaceC13295c> i02, String str, String str2, String str3) {
            this.f95144b = i02;
            this.f95145c = str;
            this.f95146d = str2;
            this.f95147e = str3;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            InterfaceC13295c.o oVar = new InterfaceC13295c.o((Uri) obj, this.f95145c, this.f95146d, this.f95147e);
            I0<InterfaceC13295c> i02 = this.f95144b;
            Object objW = i02.w(oVar);
            B.b bVar = B.f410772b;
            if (objW instanceof B.c) {
                return;
            }
            i02.h(null);
        }
    }

    /* compiled from: AutoEvidenceRequestFilesInteractor.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "it", "Lkotlin/G0;", "accept", "(Ljava/lang/Throwable;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class b<T> implements l41.g {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ I0<InterfaceC13295c> f95148b;

        /* JADX WARN: Multi-variable type inference failed */
        public b(I0<? super InterfaceC13295c> i02) {
            this.f95148b = i02;
        }

        @Override // l41.g
        public final void accept(Object obj) {
            this.f95148b.h((Throwable) obj);
        }
    }

    /* compiled from: AutoEvidenceRequestFilesInteractor.kt */
    @Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0003\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0001\u0010\u0002"}, d2 = {"Lkotlin/G0;", "invoke", "()V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class c extends N implements Y41.a<G0> {

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ g f95149l;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(g gVar) {
            super(0);
            this.f95149l = gVar;
        }

        @Override // Y41.a
        public final G0 invoke() {
            y yVar = this.f95149l.f95132k;
            if (yVar != null) {
                DisposableHelper.a(yVar);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public h(g gVar, B0 b02, String str, String str2, String str3, Continuation continuation) {
        super(2, continuation);
        this.f95139s = gVar;
        this.f95140t = b02;
        this.f95141u = str;
        this.f95142v = str2;
        this.f95143w = str3;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@l Object obj, @Y61.k Continuation<?> continuation) {
        String str = this.f95143w;
        h hVar = new h(this.f95139s, this.f95140t, this.f95141u, this.f95142v, str, continuation);
        hVar.f95138r = obj;
        return hVar;
    }

    @Override // Y41.p
    public final Object invoke(I0<? super InterfaceC13295c> i02, Continuation<? super G0> continuation) {
        return ((h) create(i02, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f95137q;
        if (i12 == 0) {
            C42729a0.b(obj);
            I0 i02 = (I0) this.f95138r;
            y yVar = (y) this.f95140t.v0(new a(i02, this.f95141u, this.f95142v, this.f95143w), new b(i02), io.reactivex.rxjava3.internal.functions.a.f401993c);
            g gVar = this.f95139s;
            gVar.f95132k = yVar;
            DisposableHelper.a(yVar);
            gVar.f95132k = null;
            c cVar = new c(gVar);
            this.f95137q = 1;
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
