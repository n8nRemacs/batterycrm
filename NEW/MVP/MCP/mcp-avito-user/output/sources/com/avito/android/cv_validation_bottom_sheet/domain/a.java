package com.avito.android.cv_validation_bottom_sheet.domain;

import Y41.p;
import Y61.k;
import Y61.l;
import h31.e;
import iQ.InterfaceC41332a;
import jQ.C42296a;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlinx.coroutines.C43259k;
import kotlinx.coroutines.Q0;
import kotlinx.coroutines.T;
import kotlinx.coroutines.U;
import kotlinx.coroutines.internal.C43238h;

/* compiled from: CvValidationEnrichInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/cv_validation_bottom_sheet/domain/a;", "", "_avito_job_cv-validation-bottom-sheet_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final e<InterfaceC41332a> f131848a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final C43238h f131849b = U.a(Q0.a());

    /* compiled from: CvValidationEnrichInteractor.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u008a@¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lkotlinx/coroutines/T;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/T;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.cv_validation_bottom_sheet.domain.CvValidationEnrichInteractor$enrich$1", f = "CvValidationEnrichInteractor.kt", i = {}, l = {19}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.avito.android.cv_validation_bottom_sheet.domain.a$a, reason: collision with other inner class name */
    public static final class C3947a extends SuspendLambda implements p<T, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f131850q;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f131852s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ String f131853t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public C3947a(String str, String str2, Continuation<? super C3947a> continuation) {
            super(2, continuation);
            this.f131852s = str;
            this.f131853t = str2;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            return a.this.new C3947a(this.f131852s, this.f131853t, continuation);
        }

        @Override // Y41.p
        public final Object invoke(T t12, Continuation<? super G0> continuation) {
            return ((C3947a) create(t12, continuation)).invokeSuspend(G0.f406611a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i12 = this.f131850q;
            if (i12 == 0) {
                C42729a0.b(obj);
                InterfaceC41332a interfaceC41332a = a.this.f131848a.get();
                C42296a c42296a = new C42296a(Long.parseLong(this.f131852s), Long.parseLong(this.f131853t));
                this.f131850q = 1;
                if (interfaceC41332a.a(c42296a, this) == coroutine_suspended) {
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
    public a(@k e<InterfaceC41332a> eVar) {
        this.f131848a = eVar;
    }

    public final void a(@k String str, @k String str2) {
        C43259k.d(this.f131849b, null, null, new C3947a(str2, str, null), 3);
    }
}
