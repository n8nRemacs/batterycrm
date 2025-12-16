package com.avito.android.extended_profile.mvi;

import com.avito.android.extended_profile.mvi.C30451a;
import com.avito.android.extended_profile.mvi.entity.ExtendedProfileInternalAction;
import fA.InterfaceC40265a;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ExtendedProfileActor.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/extended_profile/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "LfA/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$process$2", f = "ExtendedProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.extended_profile.mvi.o, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
final class C30465o extends SuspendLambda implements Y41.p<kotlin.Q<? extends C30451a.InterfaceC4391a, ? extends InterfaceC43160i<? extends InterfaceC40265a>>, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f150346q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C30451a f150347r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.extended_profile.mvi.entity.a> f150348s;

    /* compiled from: ExtendedProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LfA/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/extended_profile/mvi/entity/ExtendedProfileInternalAction;", "<anonymous>", "(LfA/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$process$2$2", f = "ExtendedProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile.mvi.o$a */
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC40265a, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f150349q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C30451a f150350r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<com.avito.android.extended_profile.mvi.entity.a> f150351s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, C30451a c30451a, Continuation continuation) {
            super(2, continuation);
            this.f150350r = c30451a;
            this.f150351s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f150351s, this.f150350r, continuation);
            aVar.f150349q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC40265a interfaceC40265a, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>> continuation) {
            return ((a) create(interfaceC40265a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f150350r.b((InterfaceC40265a) this.f150349q, this.f150351s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.extended_profile.mvi.ExtendedProfileActor$process$2$invokeSuspend$$inlined$flatMapLatest$1", f = "ExtendedProfileActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.extended_profile.mvi.o$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileInternalAction>, InterfaceC40265a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f150352q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f150353r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f150354s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C30451a f150355t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f150356u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, C30451a c30451a, Continuation continuation) {
            super(3, continuation);
            this.f150355t = c30451a;
            this.f150356u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileInternalAction> interfaceC43172j, InterfaceC40265a interfaceC40265a, Continuation<? super G0> continuation) {
            b bVar = new b(this.f150356u, this.f150355t, continuation);
            bVar.f150353r = interfaceC43172j;
            bVar.f150354s = interfaceC40265a;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f150352q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f150353r;
                InterfaceC43160i<ExtendedProfileInternalAction> interfaceC43160iB = this.f150355t.b((InterfaceC40265a) this.f150354s, (com.avito.android.extended_profile.mvi.entity.a) this.f150356u.invoke());
                this.f150352q = 1;
                if (C43175k.u(this, interfaceC43160iB, interfaceC43172j) == coroutine_suspended) {
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

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C30465o(Y41.a aVar, C30451a c30451a, Continuation continuation) {
        super(2, continuation);
        this.f150347r = c30451a;
        this.f150348s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C30465o c30465o = new C30465o(this.f150348s, this.f150347r, continuation);
        c30465o.f150346q = obj;
        return c30465o;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends C30451a.InterfaceC4391a, ? extends InterfaceC43160i<? extends InterfaceC40265a>> q12, Continuation<? super InterfaceC43160i<? extends ExtendedProfileInternalAction>> continuation) {
        return ((C30465o) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = (kotlin.Q) this.f150346q;
        C30451a.InterfaceC4391a interfaceC4391a = (C30451a.InterfaceC4391a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = kotlin.jvm.internal.L.f(interfaceC4391a, C30451a.InterfaceC4391a.C4392a.f150093a);
        Y41.a<com.avito.android.extended_profile.mvi.entity.a> aVar = this.f150348s;
        C30451a c30451a = this.f150347r;
        if (zF2) {
            return C43175k.Y(interfaceC43160i, new b(aVar, c30451a, null));
        }
        if (kotlin.jvm.internal.L.f(interfaceC4391a, C30451a.InterfaceC4391a.b.f150094a)) {
            return C43175k.C(new a(aVar, c30451a, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
