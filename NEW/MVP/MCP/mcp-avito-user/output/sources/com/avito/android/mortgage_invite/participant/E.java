package com.avito.android.mortgage_invite.participant;

import android.content.Context;
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
import p20.InterfaceC46878c;

/* compiled from: ParticipantScreen.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage_invite.participant.ParticipantScreenKt$ParticipantScreen$1", f = "ParticipantScreen.kt", i = {}, l = {113}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes15.dex */
final class E extends SuspendLambda implements Y41.p<T, Continuation<? super G0>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public int f205981q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ InterfaceC43160i<InterfaceC46878c> f205982r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.l<String, G0> f205983s;

    /* renamed from: t, reason: collision with root package name */
    public final /* synthetic */ Y41.l<DeepLink, G0> f205984t;

    /* renamed from: u, reason: collision with root package name */
    public final /* synthetic */ Y41.l<o20.b, G0> f205985u;

    /* renamed from: v, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G0> f205986v;

    /* renamed from: w, reason: collision with root package name */
    public final /* synthetic */ Y41.l<MortgageClientSearchArguments, G0> f205987w;

    /* renamed from: x, reason: collision with root package name */
    public final /* synthetic */ Context f205988x;

    /* renamed from: y, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.u f205989y;

    /* renamed from: z, reason: collision with root package name */
    public final /* synthetic */ com.akita.compose.component.toast_bar.J f205990z;

    /* compiled from: ParticipantScreen.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lp20/c;", "event", "Lkotlin/G0;", "<anonymous>", "(Lp20/c;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage_invite.participant.ParticipantScreenKt$ParticipantScreen$1$1", f = "ParticipantScreen.kt", i = {}, l = {104}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC46878c, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f205991q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f205992r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.l<String, G0> f205993s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ Y41.l<DeepLink, G0> f205994t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.l<o20.b, G0> f205995u;

        /* renamed from: v, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G0> f205996v;

        /* renamed from: w, reason: collision with root package name */
        public final /* synthetic */ Y41.l<MortgageClientSearchArguments, G0> f205997w;

        /* renamed from: x, reason: collision with root package name */
        public final /* synthetic */ Context f205998x;

        /* renamed from: y, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.u f205999y;

        /* renamed from: z, reason: collision with root package name */
        public final /* synthetic */ com.akita.compose.component.toast_bar.J f206000z;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        public a(Y41.l<? super String, G0> lVar, Y41.l<? super DeepLink, G0> lVar2, Y41.l<? super o20.b, G0> lVar3, Y41.a<G0> aVar, Y41.l<? super MortgageClientSearchArguments, G0> lVar4, Context context, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f205993s = lVar;
            this.f205994t = lVar2;
            this.f205995u = lVar3;
            this.f205996v = aVar;
            this.f205997w = lVar4;
            this.f205998x = context;
            this.f205999y = uVar;
            this.f206000z = j12;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f205993s, this.f205994t, this.f205995u, this.f205996v, this.f205997w, this.f205998x, this.f205999y, this.f206000z, continuation);
            aVar.f205992r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC46878c interfaceC46878c, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC46878c, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f205991q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC46878c interfaceC46878c = (InterfaceC46878c) this.f205992r;
                if (interfaceC46878c instanceof InterfaceC46878c.a) {
                    InterfaceC46878c.a aVar = (InterfaceC46878c.a) interfaceC46878c;
                    this.f205993s.invoke(aVar.f428138b);
                    DeepLink deepLink = aVar.f428137a;
                    if (deepLink != null) {
                        this.f205994t.invoke(deepLink);
                    }
                } else if (interfaceC46878c instanceof InterfaceC46878c.b) {
                    this.f205995u.invoke(((InterfaceC46878c.b) interfaceC46878c).f428139a);
                } else if (interfaceC46878c instanceof InterfaceC46878c.C12253c) {
                    this.f205996v.invoke();
                } else if (interfaceC46878c instanceof InterfaceC46878c.d) {
                    this.f205997w.invoke(((InterfaceC46878c.d) interfaceC46878c).f428141a);
                } else if (interfaceC46878c instanceof InterfaceC46878c.e) {
                    InterfaceC46878c.e eVar = (InterfaceC46878c.e) interfaceC46878c;
                    PrintableText printableText = eVar.f428142a;
                    Context context = this.f205998x;
                    String strK0 = printableText.k0(context);
                    ToastBarDuration toastBarDuration = ToastBarDuration.f63231c;
                    String strK02 = eVar.f428143b.k0(context);
                    ToastBarPosition toastBarPosition = ToastBarPosition.f63236c;
                    this.f205991q = 1;
                    if (this.f205999y.a(this.f206000z, strK0, G0.f406611a, (60 & 8) != 0 ? null : strK02, (60 & 32) != 0 ? ToastBarDuration.f63230b : toastBarDuration, (60 & 64) != 0 ? ToastBarPosition.f63235b : toastBarPosition, (60 & 128) != 0 ? false : false, this) == coroutine_suspended) {
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
    public E(InterfaceC43160i<? extends InterfaceC46878c> interfaceC43160i, Y41.l<? super String, G0> lVar, Y41.l<? super DeepLink, G0> lVar2, Y41.l<? super o20.b, G0> lVar3, Y41.a<G0> aVar, Y41.l<? super MortgageClientSearchArguments, G0> lVar4, Context context, com.akita.compose.component.toast_bar.u uVar, com.akita.compose.component.toast_bar.J j12, Continuation<? super E> continuation) {
        super(2, continuation);
        this.f205982r = interfaceC43160i;
        this.f205983s = lVar;
        this.f205984t = lVar2;
        this.f205985u = lVar3;
        this.f205986v = aVar;
        this.f205987w = lVar4;
        this.f205988x = context;
        this.f205989y = uVar;
        this.f205990z = j12;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        return new E(this.f205982r, this.f205983s, this.f205984t, this.f205985u, this.f205986v, this.f205987w, this.f205988x, this.f205989y, this.f205990z, continuation);
    }

    @Override // Y41.p
    public final Object invoke(T t12, Continuation<? super G0> continuation) {
        return ((E) create(t12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i12 = this.f205981q;
        if (i12 == 0) {
            C42729a0.b(obj);
            C43197r1 c43197r1 = new C43197r1(new a(this.f205983s, this.f205984t, this.f205985u, this.f205986v, this.f205987w, this.f205988x, this.f205989y, this.f205990z, null), this.f205982r);
            this.f205981q = 1;
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
