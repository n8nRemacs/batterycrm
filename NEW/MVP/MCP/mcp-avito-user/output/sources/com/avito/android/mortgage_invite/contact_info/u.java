package com.avito.android.mortgage_invite.contact_info;

import android.content.Context;
import b20.c;
import com.akita.compose.component.toast_bar.J;
import com.akita.compose.component.toast_bar.ToastBarDuration;
import com.akita.compose.component.toast_bar.ToastBarPosition;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.mortgage_invite.client_search.model.MortgageClientSearchArguments;
import com.avito.android.printable_text.PrintableText;
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

/* compiled from: ApplicationContactInfoScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.contact_info.ApplicationContactInfoScreenKt$ApplicationContactInfoScreen$1", f = "ApplicationContactInfoScreen.kt", i = {}, l = {82}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class u extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205768q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<b20.c> f205769r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.p<String, DeepLink, G0> f205770s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205771t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MortgageClientSearchArguments, G0> f205772u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Context f205773v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f205774w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ J f205775x;

    /* compiled from: ApplicationContactInfoScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lb20/c;", "event", "Lkotlin/G0;", "<anonymous>", "(Lb20/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_invite.contact_info.ApplicationContactInfoScreenKt$ApplicationContactInfoScreen$1$1", f = "ApplicationContactInfoScreen.kt", i = {}, l = {73}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<b20.c, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f205776q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f205777r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.p<String, DeepLink, G0> f205778s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f205779t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MortgageClientSearchArguments, G0> f205780u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Context f205781v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f205782w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ J f205783x;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.p<? super String, ? super DeepLink, G0> pVar, Y41.a<G0> aVar, Y41.l<? super MortgageClientSearchArguments, G0> lVar, Context context, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f205778s = pVar;
            this.f205779t = aVar;
            this.f205780u = lVar;
            this.f205781v = context;
            this.f205782w = uVar;
            this.f205783x = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f205778s, this.f205779t, this.f205780u, this.f205781v, this.f205782w, this.f205783x, continuation);
            aVar.f205777r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(b20.c cVar, Continuation<? super G0> continuation) {
            return ((a) create(cVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f205776q;
            if (i12 == 0) {
                C42729a0.b(obj);
                b20.c cVar = (b20.c) this.f205777r;
                if (cVar instanceof c.a) {
                    c.a aVar = (c.a) cVar;
                    this.f205778s.invoke(aVar.f56836a, aVar.f56837b);
                } else if (cVar instanceof c.b) {
                    this.f205779t.invoke();
                } else if (cVar instanceof c.C1987c) {
                    this.f205780u.invoke(((c.C1987c) cVar).f56839a);
                } else if (cVar instanceof c.d) {
                    c.d dVar = (c.d) cVar;
                    PrintableText printableText = dVar.f56840a;
                    Context context = this.f205781v;
                    String strK0 = printableText.k0(context);
                    ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
                    String strK02 = dVar.f56841b.k0(context);
                    ToastBarPosition toastBarPosition = ToastBarPosition.f63236c;
                    this.f205776q = 1;
                    if (this.f205782w.a(this.f205783x, strK0, G0.f406611a, (60 & 8) != 0 ? null : strK02, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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
    public u(InterfaceC43160i<? extends b20.c> interfaceC43160i, Y41.p<? super String, ? super DeepLink, G0> pVar, Y41.a<G0> aVar, Y41.l<? super MortgageClientSearchArguments, G0> lVar, Context context, com.akita.compose.component.toast_bar.u uVar, J j12, Continuation<? super u> continuation) {
        super(2, continuation);
        this.f205769r = interfaceC43160i;
        this.f205770s = pVar;
        this.f205771t = aVar;
        this.f205772u = lVar;
        this.f205773v = context;
        this.f205774w = uVar;
        this.f205775x = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new u(this.f205769r, this.f205770s, this.f205771t, this.f205772u, this.f205773v, this.f205774w, this.f205775x, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((u) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205768q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C43197r1 c43197r1 = new C43197r1(new a(this.f205770s, this.f205771t, this.f205772u, this.f205773v, this.f205774w, this.f205775x, null), this.f205769r);
            this.f205768q = 1;
            if (C43175k.i(c43197r1, this) == coroutine_suspended) {
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
