package com.avito.android.mortgage.person_form.mvi;

import E00.d;
import com.avito.android.mortgage.person_form.mvi.C32649a;
import com.avito.android.mortgage.person_form.mvi.entity.PersonFormInternalAction;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: PersonFormActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/mortgage/person_form/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "LE00/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$2", f = "PersonFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.mortgage.person_form.mvi.k, reason: case insensitive filesystem */
/* loaded from: classes15.dex */
final class C32659k extends SuspendLambda implements Y41.p<kotlin.Q<? extends C32649a.InterfaceC5953a, ? extends InterfaceC43160i<? extends E00.a>>, Continuation<? super InterfaceC43160i<? extends PersonFormInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f201246q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C32649a f201247r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<G00.c> f201248s;

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE00/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "<anonymous>", "(LE00/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$2$1", f = "PersonFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.k$a */
    public static final class a extends SuspendLambda implements Y41.p<E00.a, Continuation<? super InterfaceC43160i<? extends PersonFormInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f201249q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C32649a f201250r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<G00.c> f201251s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, C32649a c32649a, Continuation continuation) {
            super(2, continuation);
            this.f201250r = c32649a;
            this.f201251s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f201251s, this.f201250r, continuation);
            aVar.f201249q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(E00.a aVar, Continuation<? super InterfaceC43160i<? extends PersonFormInternalAction>> continuation) {
            return ((a) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            E00.a aVar = (E00.a) this.f201249q;
            boolean z12 = aVar instanceof E00.b;
            C32649a c32649a = this.f201250r;
            if (z12) {
                return c32649a.b((E00.b) aVar, this.f201251s.invoke());
            }
            if (!(aVar instanceof E00.d)) {
                return C43175k.w();
            }
            E00.d dVar = (E00.d) aVar;
            c32649a.getClass();
            if (dVar instanceof d.a) {
                return new C43210w(new PersonFormInternalAction.UpdateContentState(((d.a) dVar).f3667b));
            }
            throw new NoWhenBranchMatchedException();
        }
    }

    /* compiled from: PersonFormActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LE00/a;", "action", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/mortgage/person_form/mvi/entity/PersonFormInternalAction;", "<anonymous>", "(LE00/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.person_form.mvi.PersonFormActor$process$2$2", f = "PersonFormActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.mortgage.person_form.mvi.k$b */
    public static final class b extends SuspendLambda implements Y41.p<E00.a, Continuation<? super InterfaceC43160i<? extends PersonFormInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f201252q;

        public b() {
            throw null;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(2, continuation);
            bVar.f201252q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(E00.a aVar, Continuation<? super InterfaceC43160i<? extends PersonFormInternalAction>> continuation) {
            return ((b) create(aVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            E00.a aVar = (E00.a) this.f201252q;
            return aVar instanceof PersonFormInternalAction ? new C43210w(aVar) : C43175k.w();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32659k(Y41.a aVar, C32649a c32649a, Continuation continuation) {
        super(2, continuation);
        this.f201247r = c32649a;
        this.f201248s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C32659k c32659k = new C32659k(this.f201248s, this.f201247r, continuation);
        c32659k.f201246q = obj;
        return c32659k;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends C32649a.InterfaceC5953a, ? extends InterfaceC43160i<? extends E00.a>> q12, Continuation<? super InterfaceC43160i<? extends PersonFormInternalAction>> continuation) {
        return ((C32659k) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = (kotlin.Q) this.f201246q;
        C32649a.InterfaceC5953a interfaceC5953a = (C32649a.InterfaceC5953a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        if (interfaceC5953a instanceof C32649a.InterfaceC5953a.b) {
            return C43175k.C(new a(this.f201248s, this.f201247r, null), interfaceC43160i);
        }
        if (interfaceC5953a instanceof C32649a.InterfaceC5953a.C5954a) {
            return C43175k.C(new b(2, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
