package com.avito.android.installments.form;

import android.net.Uri;
import androidx.compose.runtime.internal.P;
import com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.text.C43066x;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43207v;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: InstallmentsFormInteractor.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/installments/form/j;", "", "_avito_installments_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class j {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final h31.e<SV0.a> f172698a;

    /* compiled from: InstallmentsFormInteractor.kt */
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "Lcom/avito/android/installments/form/mvi/entity/InstallmentsFormInternalAction;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.installments.form.InstallmentsFormInteractor$requestFormUrl$1", f = "InstallmentsFormInteractor.kt", i = {0, 1}, l = {20, 22, 23, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, AvailableCode.HMS_IS_SPOOF}, m = "invokeSuspend", n = {"$this$flow", "$this$flow"}, s = {"L$0", "L$0"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InstallmentsFormInternalAction>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public int f172699q;

        /* renamed from: r, reason: collision with root package name */
        public /* synthetic */ Object f172700r;

        /* renamed from: s, reason: collision with root package name */
        public final /* synthetic */ String f172701s;

        /* renamed from: t, reason: collision with root package name */
        public final /* synthetic */ j f172702t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, j jVar, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f172701s = str;
            this.f172702t = jVar;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = new a(this.f172701s, this.f172702t, continuation);
            aVar.f172700r = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InstallmentsFormInternalAction> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:24:0x006e  */
        /* JADX WARN: Removed duplicated region for block: B:27:0x007e  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r10) {
            /*
                r9 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                int r1 = r9.f172699q
                com.avito.android.installments.form.j r2 = r9.f172702t
                r3 = 5
                r4 = 4
                r5 = 3
                r6 = 2
                r7 = 1
                java.lang.String r8 = r9.f172701s
                if (r1 == 0) goto L39
                if (r1 == r7) goto L31
                if (r1 == r6) goto L29
                if (r1 == r5) goto L24
                if (r1 == r4) goto L24
                if (r1 != r3) goto L1c
                goto L24
            L1c:
                java.lang.IllegalStateException r10 = new java.lang.IllegalStateException
                java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
                r10.<init>(r0)
                throw r10
            L24:
                kotlin.C42729a0.b(r10)
                goto Lb9
            L29:
                java.lang.Object r1 = r9.f172700r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L67
            L31:
                java.lang.Object r1 = r9.f172700r
                kotlinx.coroutines.flow.j r1 = (kotlinx.coroutines.flow.InterfaceC43172j) r1
                kotlin.C42729a0.b(r10)
                goto L4e
            L39:
                kotlin.C42729a0.b(r10)
                java.lang.Object r10 = r9.f172700r
                kotlinx.coroutines.flow.j r10 = (kotlinx.coroutines.flow.InterfaceC43172j) r10
                com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction$ShowLoading r1 = com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction.ShowLoading.f172759b
                r9.f172700r = r10
                r9.f172699q = r7
                java.lang.Object r1 = r10.emit(r1, r9)
                if (r1 != r0) goto L4d
                return r0
            L4d:
                r1 = r10
            L4e:
                java.lang.String r10 = "api/"
                java.lang.String r10 = kotlin.text.C43066x.U(r10, r8)
                h31.e<SV0.a> r7 = r2.f172698a
                java.lang.Object r7 = r7.get()
                SV0.a r7 = (SV0.a) r7
                r9.f172700r = r1
                r9.f172699q = r6
                java.lang.Object r10 = r7.b(r10, r9)
                if (r10 != r0) goto L67
                return r0
            L67:
                com.avito.android.remote.model.TypedResult r10 = (com.avito.android.remote.model.TypedResult) r10
                boolean r6 = r10 instanceof com.avito.android.remote.model.TypedResult.Error
                r7 = 0
                if (r6 == 0) goto L7e
                com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction$ShowRequestFormUrlError r10 = new com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction$ShowRequestFormUrlError
                r10.<init>(r8)
                r9.f172700r = r7
                r9.f172699q = r5
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto Lb9
                return r0
            L7e:
                boolean r5 = r10 instanceof com.avito.android.remote.model.TypedResult.Success
                if (r5 == 0) goto Lb9
                com.avito.android.remote.model.TypedResult$Success r10 = (com.avito.android.remote.model.TypedResult.Success) r10
                java.lang.Object r10 = r10.getResult()
                com.avito.android.remote.model.installments.InstallmentsFormUrlData r10 = (com.avito.android.remote.model.installments.InstallmentsFormUrlData) r10
                java.lang.String r10 = r10.getFormUrl()
                if (r10 == 0) goto La9
                int r5 = r10.length()
                if (r5 != 0) goto L97
                goto La9
            L97:
                r2.getClass()
                kotlinx.coroutines.flow.v r10 = com.avito.android.installments.form.j.a(r10)
                r9.f172700r = r7
                r9.f172699q = r3
                java.lang.Object r10 = kotlinx.coroutines.flow.C43175k.u(r9, r10, r1)
                if (r10 != r0) goto Lb9
                return r0
            La9:
                com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction$ShowRequestFormUrlError r10 = new com.avito.android.installments.form.mvi.entity.InstallmentsFormInternalAction$ShowRequestFormUrlError
                r10.<init>(r8)
                r9.f172700r = r7
                r9.f172699q = r4
                java.lang.Object r10 = r1.emit(r10, r9)
                if (r10 != r0) goto Lb9
                return r0
            Lb9:
                kotlin.G0 r10 = kotlin.G0.f406611a
                return r10
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.installments.form.j.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public j(@Y61.k h31.e<SV0.a> eVar) {
        this.f172698a = eVar;
    }

    @Y61.k
    public static C43207v a(@Y61.k String str) {
        if (!((str.length() == 0) | C43066x.K(str))) {
            Uri uri = Uri.parse(str);
            Uri.Builder builderBuildUpon = uri.buildUpon();
            if (uri.getQueryParameter("supportSbp") == null) {
                builderBuildUpon.appendQueryParameter("supportSbp", "1");
            }
            str = builderBuildUpon.toString();
        }
        return new C43207v(new InstallmentsFormInternalAction[]{InstallmentsFormInternalAction.ShowLoading.f172759b, new InstallmentsFormInternalAction.LoadUrl(str)});
    }

    @Y61.k
    public final InterfaceC43160i<InstallmentsFormInternalAction> b(@Y61.k String str) {
        return C43175k.G(new a(str, this, null));
    }
}
