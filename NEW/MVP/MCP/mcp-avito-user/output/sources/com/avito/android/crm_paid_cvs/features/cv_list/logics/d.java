package com.avito.android.crm_paid_cvs.features.cv_list.logics;

import com.avito.android.account.E;
import com.avito.android.analytics.InterfaceC28373a;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListInternalAction;
import com.avito.android.crm_paid_cvs.features.cv_list.entity.CvListState;
import com.avito.android.remote.model.ProfileTab;
import dt.InterfaceC39801a;
import javax.inject.Inject;
import javax.inject.Named;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: CvListBootstrap.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_paid_cvs/features/cv_list/logics/d;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "_avito_job_crm-paid-cvs_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.arch.mvi.b<CvListInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC39801a f130556a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final InterfaceC28373a f130557b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final E f130558c;

    /* compiled from: CvListBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/crm_paid_cvs/features/cv_list/entity/CvListInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_paid_cvs.features.cv_list.logics.CvListBootstrap$produce$1", f = "CvListBootstrap.kt", i = {}, l = {30}, m = "invokeSuspend", n = {}, s = {})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super CvListInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f130559q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f130560r;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = d.this.new a(continuation);
            aVar.f130560r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super CvListInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        public final Object invokeSuspend(@Y61.k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f130559q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC43172j interfaceC43172j = (InterfaceC43172j) this.f130560r;
                d dVar = d.this;
                InterfaceC28373a interfaceC28373a = dVar.f130557b;
                String strA = dVar.f130558c.a();
                CvListState.Tab tab = CvListState.Tab.f130509c;
                interfaceC28373a.c(new bt.m(strA, ProfileTab.ALL));
                k kVar = k.f130593a;
                CvListInternalAction.LoadType loadType = CvListInternalAction.LoadType.f130466b;
                C42784z0 c42784z0 = C42784z0.f406748b;
                this.f130559q = 1;
                kVar.getClass();
                Object objC = U.c(new j(interfaceC43172j, loadType, c42784z0, dVar.f130556a, null, null), this);
                if (objC != IntrinsicsKt.getCOROUTINE_SUSPENDED()) {
                    objC = G0.f406611a;
                }
                if (objC == coroutine_suspended) {
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

    @Inject
    public d(@Y61.k @Named("CV_INTERACTOR") InterfaceC39801a interfaceC39801a, @Y61.k InterfaceC28373a interfaceC28373a, @Y61.k E e12) {
        this.f130556a = interfaceC39801a;
        this.f130557b = interfaceC28373a;
        this.f130558c = e12;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<CvListInternalAction> a() {
        return C43175k.G(new a(null));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
