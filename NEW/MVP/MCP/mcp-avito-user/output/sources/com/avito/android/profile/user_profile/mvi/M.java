package com.avito.android.profile.user_profile.mvi;

import Ua0.InterfaceC15503a;
import com.avito.android.profile.user_profile.mvi.C33388a;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileInternalAction;
import com.avito.android.profile.user_profile.mvi.entity.UserProfileState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: UserProfileActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/profile/user_profile/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "LUa0/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$2", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes16.dex */
final class M extends SuspendLambda implements Y41.p<kotlin.Q<? extends C33388a.InterfaceC6868a, ? extends InterfaceC43160i<? extends InterfaceC15503a>>, Continuation<? super InterfaceC43160i<? extends UserProfileInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f226238q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C33388a f226239r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<UserProfileState> f226240s;

    /* compiled from: UserProfileActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LUa0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/profile/user_profile/mvi/entity/UserProfileInternalAction;", "<anonymous>", "(LUa0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$2$2", f = "UserProfileActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC15503a, Continuation<? super InterfaceC43160i<? extends UserProfileInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f226241q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C33388a f226242r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<UserProfileState> f226243s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, C33388a c33388a, Continuation continuation) {
            super(2, continuation);
            this.f226242r = c33388a;
            this.f226243s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f226243s, this.f226242r, continuation);
            aVar.f226241q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC15503a interfaceC15503a, Continuation<? super InterfaceC43160i<? extends UserProfileInternalAction>> continuation) {
            return ((a) create(interfaceC15503a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f226242r.b((InterfaceC15503a) this.f226241q, this.f226243s.invoke());
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile.user_profile.mvi.UserProfileActor$process$2$invokeSuspend$$inlined$flatMapLatest$1", f = "UserProfileActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super UserProfileInternalAction>, InterfaceC15503a, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f226244q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f226245r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f226246s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C33388a f226247t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f226248u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, C33388a c33388a, Continuation continuation) {
            super(3, continuation);
            this.f226247t = c33388a;
            this.f226248u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super UserProfileInternalAction> interfaceC43172j, InterfaceC15503a interfaceC15503a, Continuation<? super G0> continuation) {
            C33388a c33388a = this.f226247t;
            b bVar = new b(this.f226248u, c33388a, continuation);
            bVar.f226245r = interfaceC43172j;
            bVar.f226246s = interfaceC15503a;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f226244q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f226245r;
                InterfaceC43160i<UserProfileInternalAction> interfaceC43160iB = this.f226247t.b((InterfaceC15503a) this.f226246s, (UserProfileState) this.f226248u.invoke());
                this.f226244q = 1;
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
    public M(Y41.a aVar, C33388a c33388a, Continuation continuation) {
        super(2, continuation);
        this.f226239r = c33388a;
        this.f226240s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        M m12 = new M(this.f226240s, this.f226239r, continuation);
        m12.f226238q = obj;
        return m12;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends C33388a.InterfaceC6868a, ? extends InterfaceC43160i<? extends InterfaceC15503a>> q12, Continuation<? super InterfaceC43160i<? extends UserProfileInternalAction>> continuation) {
        return ((M) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = (kotlin.Q) this.f226238q;
        C33388a.InterfaceC6868a interfaceC6868a = (C33388a.InterfaceC6868a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = kotlin.jvm.internal.L.f(interfaceC6868a, C33388a.InterfaceC6868a.C6869a.f226307a);
        Y41.a<UserProfileState> aVar = this.f226240s;
        C33388a c33388a = this.f226239r;
        if (zF2) {
            return C43175k.Y(interfaceC43160i, new b(aVar, c33388a, null));
        }
        if (kotlin.jvm.internal.L.f(interfaceC6868a, C33388a.InterfaceC6868a.b.f226308a)) {
            return C43175k.C(new a(aVar, c33388a, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
