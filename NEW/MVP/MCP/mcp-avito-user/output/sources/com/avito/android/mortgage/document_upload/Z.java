package com.avito.android.mortgage.document_upload;

import android.content.Context;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.document_upload.model.DocumentUploadArguments;
import f00.InterfaceC40195b;
import java.io.IOException;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: DocumentUploadScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.document_upload.DocumentUploadScreenKt$DocumentsUploadScreen$1", f = "DocumentUploadScreen.kt", i = {}, l = {112}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class Z extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f199112A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f199113B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ Context f199114C;

    /* renamed from: q, reason: collision with root package name */
    public int f199115q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f199116r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC40195b> f199117s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f199118t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DocumentUploadArguments, G0> f199119u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DocumentUploadArguments, G0> f199120v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f199121w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f199122x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f199123y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f199124z;

    /* compiled from: DocumentUploadScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lf00/b;", "it", "Lkotlin/G0;", "emit", "(Lf00/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f199125b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f199126c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DocumentUploadArguments, G0> f199127d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DocumentUploadArguments, G0> f199128e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f199129f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f199130g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f199131h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f199132i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f199133j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f199134k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ Context f199135l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(kotlinx.coroutines.T t12, Y41.a<G0> aVar, Y41.l<? super DocumentUploadArguments, G0> lVar, Y41.l<? super DocumentUploadArguments, G0> lVar2, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, Y41.l<? super DeepLink, G0> lVar3, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, Context context) {
            this.f199125b = t12;
            this.f199126c = aVar;
            this.f199127d = lVar;
            this.f199128e = lVar2;
            this.f199129f = aVar2;
            this.f199130g = aVar3;
            this.f199131h = aVar4;
            this.f199132i = lVar3;
            this.f199133j = uVar;
            this.f199134k = j12;
            this.f199135l = context;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) throws IOException {
            InterfaceC40195b interfaceC40195b = (InterfaceC40195b) obj;
            if (interfaceC40195b instanceof InterfaceC40195b.g) {
                C43259k.d(this.f199125b, null, null, new Y(this.f199133j, this.f199134k, interfaceC40195b, this.f199135l, null), 3);
            } else if (interfaceC40195b instanceof InterfaceC40195b.a) {
                ((C32618h) this.f199126c).invoke();
            } else if (interfaceC40195b instanceof InterfaceC40195b.d) {
                InterfaceC40195b.d dVar = (InterfaceC40195b.d) interfaceC40195b;
                boolean z12 = dVar.f395537b;
                DocumentUploadArguments documentUploadArguments = dVar.f395536a;
                if (z12) {
                    this.f199127d.invoke(documentUploadArguments);
                } else {
                    this.f199128e.invoke(documentUploadArguments);
                }
            } else if (interfaceC40195b instanceof InterfaceC40195b.C11120b) {
                ((C32619i) this.f199129f).invoke();
            } else if (interfaceC40195b instanceof InterfaceC40195b.e) {
                ((C32627q) this.f199130g).invoke();
            } else if (interfaceC40195b instanceof InterfaceC40195b.f) {
                ((C32626p) this.f199131h).invoke();
            } else if (interfaceC40195b instanceof InterfaceC40195b.c) {
                this.f199132i.invoke(((InterfaceC40195b.c) interfaceC40195b).f395535a);
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public Z(InterfaceC43160i<? extends InterfaceC40195b> interfaceC43160i, Y41.a<G0> aVar, Y41.l<? super DocumentUploadArguments, G0> lVar, Y41.l<? super DocumentUploadArguments, G0> lVar2, Y41.a<G0> aVar2, Y41.a<G0> aVar3, Y41.a<G0> aVar4, Y41.l<? super DeepLink, G0> lVar3, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, Context context, Continuation<? super Z> continuation) {
        super(2, continuation);
        this.f199117s = interfaceC43160i;
        this.f199118t = aVar;
        this.f199119u = lVar;
        this.f199120v = lVar2;
        this.f199121w = aVar2;
        this.f199122x = aVar3;
        this.f199123y = aVar4;
        this.f199124z = lVar3;
        this.f199112A = uVar;
        this.f199113B = j12;
        this.f199114C = context;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        Z z12 = new Z(this.f199117s, this.f199118t, this.f199119u, this.f199120v, this.f199121w, this.f199122x, this.f199123y, this.f199124z, this.f199112A, this.f199113B, this.f199114C, continuation);
        z12.f199116r = obj;
        return z12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((Z) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f199115q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a((kotlinx.coroutines.T) this.f199116r, this.f199118t, this.f199119u, this.f199120v, this.f199121w, this.f199122x, this.f199123y, this.f199124z, this.f199112A, this.f199113B, this.f199114C);
            this.f199115q = 1;
            if (this.f199117s.collect(aVar, this) == coroutine_suspended) {
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
