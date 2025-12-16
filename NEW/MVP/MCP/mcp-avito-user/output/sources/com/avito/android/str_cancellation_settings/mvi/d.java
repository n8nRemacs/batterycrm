package com.avito.android.str_cancellation_settings.mvi;

import Sy0.InterfaceC15270a;
import com.avito.android.str_cancellation_settings.mvi.a;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsInternalAction;
import com.avito.android.str_cancellation_settings.mvi.entity.StrCancellationSettingsState;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Q;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: StrCancellationSettingsActor.kt */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00022\u0018\u0010\u0004\u001a\u0014\u0012\u0004\u0012\u00020\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00030\u00020\u0000H\u008a@¢\u0006\u0004\b\u0006\u0010\u0007"}, d2 = {"Lkotlin/Q;", "Lcom/avito/android/str_cancellation_settings/mvi/a$a$a;", "Lkotlinx/coroutines/flow/i;", "LSy0/a;", "<name for destructuring parameter 0>", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "<anonymous>", "(Lkotlin/Q;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
@DebugMetadata(c = "com.avito.android.str_cancellation_settings.mvi.StrCancellationSettingsActor$process$2", f = "StrCancellationSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
/* loaded from: classes4.dex */
final class d extends SuspendLambda implements Y41.p<Q<? extends a.C8671a.InterfaceC8672a, ? extends InterfaceC43160i<? extends InterfaceC15270a>>, Continuation<? super InterfaceC43160i<? extends StrCancellationSettingsInternalAction>>, Object> {

    /* renamed from: q, reason: collision with root package name */
    public /* synthetic */ Object f288429q;

    /* renamed from: r, reason: collision with root package name */
    public final /* synthetic */ com.avito.android.str_cancellation_settings.mvi.a f288430r;

    /* renamed from: s, reason: collision with root package name */
    public final /* synthetic */ Y41.a<StrCancellationSettingsState> f288431s;

    /* compiled from: StrCancellationSettingsActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LSy0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "<anonymous>", "(LSy0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_cancellation_settings.mvi.StrCancellationSettingsActor$process$2$1", f = "StrCancellationSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC15270a, Continuation<? super InterfaceC43160i<? extends StrCancellationSettingsInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f288432q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.str_cancellation_settings.mvi.a f288433r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<StrCancellationSettingsState> f288434s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(com.avito.android.str_cancellation_settings.mvi.a aVar, Y41.a<StrCancellationSettingsState> aVar2, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f288433r = aVar;
            this.f288434s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f288433r, this.f288434s, continuation);
            aVar.f288432q = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC15270a interfaceC15270a, Continuation<? super InterfaceC43160i<? extends StrCancellationSettingsInternalAction>> continuation) {
            return ((a) create(interfaceC15270a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f288433r.b((InterfaceC15270a) this.f288432q, this.f288434s.invoke());
        }
    }

    /* compiled from: StrCancellationSettingsActor.kt */
    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"LSy0/a;", "it", "Lkotlinx/coroutines/flow/i;", "Lcom/avito/android/str_cancellation_settings/mvi/entity/StrCancellationSettingsInternalAction;", "<anonymous>", "(LSy0/a;)Lkotlinx/coroutines/flow/i;"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.str_cancellation_settings.mvi.StrCancellationSettingsActor$process$2$2", f = "StrCancellationSettingsActor.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<InterfaceC15270a, Continuation<? super InterfaceC43160i<? extends StrCancellationSettingsInternalAction>>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f288435q;

        /* renamed from: r, reason: collision with root package name */
        public final /* synthetic */ com.avito.android.str_cancellation_settings.mvi.a f288436r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ Y41.a<StrCancellationSettingsState> f288437s;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(com.avito.android.str_cancellation_settings.mvi.a aVar, Y41.a<StrCancellationSettingsState> aVar2, Continuation<? super b> continuation) {
            super(2, continuation);
            this.f288436r = aVar;
            this.f288437s = aVar2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = new b(this.f288436r, this.f288437s, continuation);
            bVar.f288435q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC15270a interfaceC15270a, Continuation<? super InterfaceC43160i<? extends StrCancellationSettingsInternalAction>> continuation) {
            return ((b) create(interfaceC15270a, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            return this.f288436r.b((InterfaceC15270a) this.f288435q, this.f288437s.invoke());
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(com.avito.android.str_cancellation_settings.mvi.a aVar, Y41.a<StrCancellationSettingsState> aVar2, Continuation<? super d> continuation) {
        super(2, continuation);
        this.f288430r = aVar;
        this.f288431s = aVar2;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.k
    public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
        d dVar = new d(this.f288430r, this.f288431s, continuation);
        dVar.f288429q = obj;
        return dVar;
    }

    @Override // Y41.p
    public final Object invoke(Q<? extends a.C8671a.InterfaceC8672a, ? extends InterfaceC43160i<? extends InterfaceC15270a>> q12, Continuation<? super InterfaceC43160i<? extends StrCancellationSettingsInternalAction>> continuation) {
        return ((d) create(q12, continuation)).invokeSuspend(G0.f406611a);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Y61.l
    public final Object invokeSuspend(@Y61.k Object obj) {
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        C42729a0.b(obj);
        Q q12 = (Q) this.f288429q;
        a.C8671a.InterfaceC8672a interfaceC8672a = (a.C8671a.InterfaceC8672a) q12.f406619b;
        InterfaceC43160i interfaceC43160i = (InterfaceC43160i) q12.f406620c;
        boolean z12 = interfaceC8672a instanceof a.C8671a.InterfaceC8672a.b;
        Y41.a<StrCancellationSettingsState> aVar = this.f288431s;
        com.avito.android.str_cancellation_settings.mvi.a aVar2 = this.f288430r;
        if (z12) {
            return C43175k.C(new a(aVar2, aVar, null), interfaceC43160i);
        }
        if (!(interfaceC8672a instanceof a.C8671a.InterfaceC8672a.C8673a)) {
            throw new NoWhenBranchMatchedException();
        }
        return C43175k.C(new b(aVar2, aVar, null), C43175k.n(interfaceC43160i, 300L));
    }
}
