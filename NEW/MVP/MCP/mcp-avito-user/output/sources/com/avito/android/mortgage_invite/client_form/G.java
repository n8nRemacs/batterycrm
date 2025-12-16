package com.avito.android.mortgage_invite.client_form;

import U10.b;
import android.content.Context;
import androidx.compose.foundation.lazy.w0;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage.phone_confirm.model.PhoneConfirmArguments;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
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

/* compiled from: ApplicationClientFormScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.client_form.ApplicationClientFormScreenKt$ApplicationClientFormScreen$1", f = "ApplicationClientFormScreen.kt", i = {}, l = {85}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class G extends SuspendLambda implements Y41.p<kotlinx.coroutines.T, Continuation<? super G0>, Object> {

    /* renamed from: A, reason: collision with root package name */
    public final /* synthetic */ Context f205048A;

    /* renamed from: B, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f205049B;

    /* renamed from: C, reason: collision with root package name */
    public final /* synthetic */ w0 f205050C;

    /* renamed from: q, reason: collision with root package name */
    public int f205051q;

    /* renamed from: r, reason: collision with root package name */
    public /* synthetic */ Object f205052r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<U10.b> f205053s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ androidx.compose.ui.focus.r f205054t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MortgageClientSearchArguments, G0> f205055u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.l<PhoneConfirmArguments, G0> f205056v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f205057w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205058x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f205059y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f205060z;

    /* compiled from: ApplicationClientFormScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"LU10/b;", "event", "Lkotlin/G0;", "emit", "(LU10/b;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    public static final class a<T> implements InterfaceC43172j {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ androidx.compose.ui.focus.r f205061b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MortgageClientSearchArguments, G0> f205062c;

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Y41.l<PhoneConfirmArguments, G0> f205063d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f205064e;

        /* renamed from: f, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f205065f;

        /* renamed from: g, reason: collision with root package name */
        public final /* synthetic */ kotlinx.coroutines.T f205066g;

        /* renamed from: h, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f205067h;

        /* renamed from: i, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f205068i;

        /* renamed from: j, reason: collision with root package name */
        public final /* synthetic */ Context f205069j;

        /* renamed from: k, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f205070k;

        /* renamed from: l, reason: collision with root package name */
        public final /* synthetic */ w0 f205071l;

        /* JADX WARN: Multi-variable type inference failed */
        public a(androidx.compose.ui.focus.r rVar, Y41.l<? super MortgageClientSearchArguments, G0> lVar, Y41.l<? super PhoneConfirmArguments, G0> lVar2, Y41.l<? super DeepLink, G0> lVar3, Y41.a<G0> aVar, kotlinx.coroutines.T t12, com.akita.compose.component.toast_bar.J j12, com.akita.compose.component.toast_bar.J j13, Context context, com.akita.compose.component.toast_bar.u uVar, w0 w0Var) {
            this.f205061b = rVar;
            this.f205062c = lVar;
            this.f205063d = lVar2;
            this.f205064e = lVar3;
            this.f205065f = aVar;
            this.f205066g = t12;
            this.f205067h = j12;
            this.f205068i = j13;
            this.f205069j = context;
            this.f205070k = uVar;
            this.f205071l = w0Var;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43172j
        public final Object emit(Object obj, Continuation continuation) {
            U10.b bVar = (U10.b) obj;
            if (kotlin.jvm.internal.L.f(bVar, b.C1092b.f16102a)) {
                this.f205061b.u(true);
            } else if (bVar instanceof b.c) {
                this.f205062c.invoke(((b.c) bVar).f16103a);
            } else if (bVar instanceof b.d) {
                this.f205063d.invoke(((b.d) bVar).f16104a);
            } else if (bVar instanceof b.a) {
                b.a aVar = (b.a) bVar;
                this.f205064e.invoke(aVar.f16100a);
                if (aVar.f16101b) {
                    this.f205065f.invoke();
                }
            } else {
                boolean z12 = bVar instanceof b.f;
                kotlinx.coroutines.T t12 = this.f205066g;
                if (z12) {
                    C43259k.d(t12, null, null, new E(bVar, this.f205067h, this.f205068i, this.f205069j, this.f205070k, null), 3);
                } else if (bVar instanceof b.e) {
                    C43259k.d(t12, null, null, new F(this.f205071l, bVar, null), 3);
                }
            }
            return G0.f406611a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public G(InterfaceC43160i<? extends U10.b> interfaceC43160i, androidx.compose.ui.focus.r rVar, Y41.l<? super MortgageClientSearchArguments, G0> lVar, Y41.l<? super PhoneConfirmArguments, G0> lVar2, Y41.l<? super DeepLink, G0> lVar3, Y41.a<G0> aVar, com.akita.compose.component.toast_bar.J j12, com.akita.compose.component.toast_bar.J j13, Context context, com.akita.compose.component.toast_bar.u uVar, w0 w0Var, Continuation<? super G> continuation) {
        super(2, continuation);
        this.f205053s = interfaceC43160i;
        this.f205054t = rVar;
        this.f205055u = lVar;
        this.f205056v = lVar2;
        this.f205057w = lVar3;
        this.f205058x = aVar;
        this.f205059y = j12;
        this.f205060z = j13;
        this.f205048A = context;
        this.f205049B = uVar;
        this.f205050C = w0Var;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        G g12 = new G(this.f205053s, this.f205054t, this.f205055u, this.f205056v, this.f205057w, this.f205058x, this.f205059y, this.f205060z, this.f205048A, this.f205049B, this.f205050C, continuation);
        g12.f205052r = obj;
        return g12;
    }

    @Override // Y41.p
    public final Object invoke(kotlinx.coroutines.T t12, Continuation<? super G0> continuation) {
        return ((G) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205051q;
        if (i12 == 0) {
            C42729a0.b(obj);
            a aVar = new a(this.f205054t, this.f205055u, this.f205056v, this.f205057w, this.f205058x, (kotlinx.coroutines.T) this.f205052r, this.f205059y, this.f205060z, this.f205048A, this.f205049B, this.f205050C);
            this.f205051q = 1;
            if (this.f205053s.collect(aVar, this) == coroutine_suspended) {
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
