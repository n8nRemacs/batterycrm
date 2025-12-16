package com.avito.android.profile_settings_extended.mvi;

import com.avito.android.profile_settings_extended.mvi.C33480a;
import com.avito.android.profile_settings_extended.mvi.entity.ExtendedProfileSettingsInternalAction;
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

/* compiled from: ExtendedProfileSettingsActor.kt */
@s0
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/profile_settings_extended/mvi/a$a;", "Lkotlinx/coroutines/flow/i;", "Lyc0/k;", "<name for destructuring parameter 0>", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$process$2", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.avito.android.profile_settings_extended.mvi.i, reason: case insensitive filesystem */
/* loaded from: classes16.dex */
final class C33488i extends SuspendLambda implements Y41.p<kotlin.Q<? extends C33480a.InterfaceC7016a, ? extends InterfaceC43160i<? extends yc0.k>>, Continuation<? super InterfaceC43160i<? extends ExtendedProfileSettingsInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f230689q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ C33480a f230690r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> f230691s;

    /* compiled from: ExtendedProfileSettingsActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"Lyc0/k;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/profile_settings_extended/mvi/entity/ExtendedProfileSettingsInternalAction;", "<anonymous>", "(Lyc0/k;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$process$2$2", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile_settings_extended.mvi.i$a */
    public static final class a extends SuspendLambda implements Y41.p<yc0.k, Continuation<? super InterfaceC43160i<? extends ExtendedProfileSettingsInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f230692q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ C33480a f230693r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> f230694s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Y41.a aVar, C33480a c33480a, Continuation continuation) {
            super(2, continuation);
            this.f230693r = c33480a;
            this.f230694s = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f230694s, this.f230693r, continuation);
            aVar.f230692q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(yc0.k kVar, Continuation<? super InterfaceC43160i<? extends ExtendedProfileSettingsInternalAction>> continuation) {
            return ((a) create(kVar, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return C33480a.d(this.f230693r, (yc0.k) this.f230692q, this.f230694s);
        }
    }

    /* compiled from: Merge.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0012\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\u00020\u0004\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u0001*\b\u0012\u0004\u0012\u00028\u00010\u00022\u0006\u0010\u0003\u001a\u00028\u0000H\u008a@¨\u0006\u0005"}, d2 = {"T", "R", "Lkotlinx/coroutines/flow/j;", "it", "Lkotlin/G0;", "kotlinx/coroutines/flow/A0", "<anonymous>"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.profile_settings_extended.mvi.ExtendedProfileSettingsActor$process$2$invokeSuspend$$inlined$flatMapLatest$1", f = "ExtendedProfileSettingsActor.kt", i = {}, l = {189}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.profile_settings_extended.mvi.i$b */
    public static final class b extends SuspendLambda implements Y41.q<InterfaceC43172j<? super ExtendedProfileSettingsInternalAction>, yc0.k, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f230695q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ InterfaceC43172j f230696r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f230697s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ C33480a f230698t;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ Y41.a f230699u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Y41.a aVar, C33480a c33480a, Continuation continuation) {
            super(3, continuation);
            this.f230698t = c33480a;
            this.f230699u = aVar;
        }

        @Override // Y41.q
        public final Object invoke(InterfaceC43172j<? super ExtendedProfileSettingsInternalAction> interfaceC43172j, yc0.k kVar, Continuation<? super G0> continuation) {
            b bVar = new b(this.f230699u, this.f230698t, continuation);
            bVar.f230696r = interfaceC43172j;
            bVar.f230697s = kVar;
            return bVar.invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f230695q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = this.f230696r;
                InterfaceC43160i interfaceC43160iD = C33480a.d(this.f230698t, (yc0.k) this.f230697s, this.f230699u);
                this.f230695q = 1;
                if (C43175k.u(this, interfaceC43160iD, interfaceC43172j) == coroutine_suspended) {
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
    public C33488i(Y41.a aVar, C33480a c33480a, Continuation continuation) {
        super(2, continuation);
        this.f230690r = c33480a;
        this.f230691s = aVar;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        C33488i c33488i = new C33488i(this.f230691s, this.f230690r, continuation);
        c33488i.f230689q = obj;
        return c33488i;
    }

    @Override // Y41.p
    public final Object invoke(kotlin.Q<? extends C33480a.InterfaceC7016a, ? extends InterfaceC43160i<? extends yc0.k>> q12, Continuation<? super InterfaceC43160i<? extends ExtendedProfileSettingsInternalAction>> continuation) {
        return ((C33488i) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        kotlin.Q q12 = (kotlin.Q) this.f230689q;
        C33480a.InterfaceC7016a interfaceC7016a = (C33480a.InterfaceC7016a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean zF2 = kotlin.jvm.internal.L.f(interfaceC7016a, C33480a.InterfaceC7016a.C7017a.f230516a);
        Y41.a<com.avito.android.profile_settings_extended.mvi.entity.a> aVar = this.f230691s;
        C33480a c33480a = this.f230690r;
        if (zF2) {
            return C43175k.Y(interfaceC43160i, new b(aVar, c33480a, null));
        }
        if (kotlin.jvm.internal.L.f(interfaceC7016a, C33480a.InterfaceC7016a.b.f230517a)) {
            return C43175k.C(new a(aVar, c33480a, null), interfaceC43160i);
        }
        throw new NoWhenBranchMatchedException();
    }
}
