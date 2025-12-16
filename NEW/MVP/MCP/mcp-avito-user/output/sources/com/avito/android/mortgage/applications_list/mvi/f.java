package com.avito.android.mortgage.applications_list.mvi;

import androidx.compose.runtime.internal.P;
import com.avito.android.mortgage.applications_list.ApplicationsListArguments;
import com.avito.android.mortgage.applications_list.mvi.entity.ApplicationsListInternalAction;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: ApplicationsListBootstrap.kt */
@P
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/f;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction;", "_avito_mortgage_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final class f implements com.avito.android.arch.mvi.b<ApplicationsListInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final ApplicationsListArguments f198455a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final QZ.b f198456b;

    /* renamed from: c, reason: collision with root package name */
    public boolean f198457c;

    /* compiled from: ApplicationsListBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ContentLoaded;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.applications_list.mvi.ApplicationsListBootstrap$produce$1", f = "ApplicationsListBootstrap.kt", i = {}, l = {22}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super ApplicationsListInternalAction.ContentLoaded>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f198458q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f198459r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = f.this.new a(continuation);
            aVar.f198459r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super ApplicationsListInternalAction.ContentLoaded> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f198458q;
            f fVar = f.this;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f198459r;
                if (fVar.f198457c) {
                    return G0.f406611a;
                }
                ApplicationsListInternalAction.ContentLoaded contentLoaded = new ApplicationsListInternalAction.ContentLoaded(fVar.f198455a.f198335b, true);
                this.f198458q = 1;
                if (interfaceC43172j.emit(contentLoaded, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            } else {
                if (i12 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                C42729a0.b(obj);
            }
            fVar.f198457c = true;
            return G0.f406611a;
        }
    }

    /* compiled from: ApplicationsListBootstrap.kt */
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ContentLoaded;", "internalAction", "Lkotlin/G0;", "<anonymous>", "(Lcom/avito/android/mortgage/applications_list/mvi/entity/ApplicationsListInternalAction$ContentLoaded;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.mortgage.applications_list.mvi.ApplicationsListBootstrap$produce$2", f = "ApplicationsListBootstrap.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements Y41.p<ApplicationsListInternalAction.ContentLoaded, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f198461q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            b bVar = f.this.new b(continuation);
            bVar.f198461q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(ApplicationsListInternalAction.ContentLoaded contentLoaded, Continuation<? super G0> continuation) {
            return ((b) create(contentLoaded, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            f.this.f198456b.a((ApplicationsListInternalAction.ContentLoaded) this.f198461q);
            return G0.f406611a;
        }
    }

    @Inject
    public f(@Y61.k ApplicationsListArguments applicationsListArguments, @Y61.k QZ.b bVar) {
        this.f198455a = applicationsListArguments;
        this.f198456b = bVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<ApplicationsListInternalAction> a() {
        return new C43197r1(new b(null), C43175k.G(new a(null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
