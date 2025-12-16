package com.avito.android.crm_candidates.deeplink.change_status;

import Ju.AbstractC14250d;
import Y41.p;
import Y61.k;
import Y61.l;
import android.os.Build;
import android.os.Bundle;
import com.avito.android.beduin.common.component.input.BeduinInputModel;
import com.avito.android.crm_candidates.deeplink.change_status.JobCrmChangeStatusDeeplink;
import com.avito.android.crm_candidates.view.dialogs.JobCrmChangeStatusDialog;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.R0;
import ev.AbstractC40161a;
import java.util.Map;
import java.util.Set;
import javax.inject.Inject;
import kotlin.C42729a0;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.C42745f0;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.U;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;
import kotlinx.coroutines.flow.internal.AbstractC43168f;
import kotlinx.coroutines.internal.C43238h;
import kotlinx.coroutines.rx3.y;
import rv.C47919b;

/* compiled from: JobCrmChangeStatusDeeplinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/crm_candidates/deeplink/change_status/a;", "Lev/a;", "Lcom/avito/android/crm_candidates/deeplink/change_status/JobCrmChangeStatusDeeplink;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class a extends AbstractC40161a<JobCrmChangeStatusDeeplink> {

    /* renamed from: f, reason: collision with root package name */
    @k
    public final a.f f129151f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final a.d f129152g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final C43238h f129153h;

    /* renamed from: i, reason: collision with root package name */
    @k
    public String f129154i = "";

    /* compiled from: SafeCollector.common.kt */
    @s0
    @Metadata(d1 = {"\u0000\r\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00028\u00000\u0001¨\u0006\u0003¸\u0006\u0002"}, d2 = {"kotlinx/coroutines/flow/internal/SafeCollector_commonKt$unsafeFlow$1", "Lkotlinx/coroutines/flow/i;", "kotlinx/coroutines/flow/k1", "kotlinx-coroutines-core"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.crm_candidates.deeplink.change_status.a$a, reason: collision with other inner class name */
    public static final class C3827a implements InterfaceC43160i<C47919b> {

        /* renamed from: b, reason: collision with root package name */
        public final /* synthetic */ InterfaceC43160i f129155b;

        /* renamed from: c, reason: collision with root package name */
        public final /* synthetic */ a f129156c;

        /* compiled from: Emitters.kt */
        @s0
        @Metadata(d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\u0010\u0007\u001a\u00020\u0003\"\u0004\b\u0000\u0010\u0000\"\u0004\b\u0001\u0010\u00012\u0006\u0010\u0002\u001a\u00028\u0000H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"T", "R", "value", "Lkotlin/G0;", "emit", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "kotlinx/coroutines/flow/k1$b", "<anonymous>"}, k = 3, mv = {1, 9, 0})
        /* renamed from: com.avito.android.crm_candidates.deeplink.change_status.a$a$a, reason: collision with other inner class name */
        public static final class C3828a<T> implements InterfaceC43172j {

            /* renamed from: b, reason: collision with root package name */
            public final /* synthetic */ InterfaceC43172j f129157b;

            /* renamed from: c, reason: collision with root package name */
            public final /* synthetic */ a f129158c;

            /* compiled from: Emitters.kt */
            @s0
            @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
            @DebugMetadata(c = "com.avito.android.crm_candidates.deeplink.change_status.JobCrmChangeStatusDeeplinkHandler$onCreate$$inlined$filter$1$2", f = "JobCrmChangeStatusDeeplinkHandler.kt", i = {}, l = {219}, m = "emit", n = {}, s = {})
            /* renamed from: com.avito.android.crm_candidates.deeplink.change_status.a$a$a$a, reason: collision with other inner class name */
            public static final class C3829a extends ContinuationImpl {

                /* renamed from: q, reason: collision with root package name */
                public /* synthetic */ Object f129159q;

                /* renamed from: r, reason: collision with root package name */
                public int f129160r;

                public C3829a(Continuation continuation) {
                    super(continuation);
                }

                @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
                @l
                public final Object invokeSuspend(@k Object obj) {
                    this.f129159q = obj;
                    this.f129160r |= BeduinInputModel.MIN_TEXT_VERSION;
                    return C3828a.this.emit(null, this);
                }
            }

            public C3828a(InterfaceC43172j interfaceC43172j, a aVar) {
                this.f129157b = interfaceC43172j;
                this.f129158c = aVar;
            }

            /* JADX WARN: Removed duplicated region for block: B:7:0x0013  */
            @Override // kotlinx.coroutines.flow.InterfaceC43172j
            @Y61.l
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object emit(java.lang.Object r5, @Y61.k kotlin.coroutines.Continuation r6) {
                /*
                    r4 = this;
                    boolean r0 = r6 instanceof com.avito.android.crm_candidates.deeplink.change_status.a.C3827a.C3828a.C3829a
                    if (r0 == 0) goto L13
                    r0 = r6
                    com.avito.android.crm_candidates.deeplink.change_status.a$a$a$a r0 = (com.avito.android.crm_candidates.deeplink.change_status.a.C3827a.C3828a.C3829a) r0
                    int r1 = r0.f129160r
                    r2 = -2147483648(0xffffffff80000000, float:-0.0)
                    r3 = r1 & r2
                    if (r3 == 0) goto L13
                    int r1 = r1 - r2
                    r0.f129160r = r1
                    goto L18
                L13:
                    com.avito.android.crm_candidates.deeplink.change_status.a$a$a$a r0 = new com.avito.android.crm_candidates.deeplink.change_status.a$a$a$a
                    r0.<init>(r6)
                L18:
                    java.lang.Object r6 = r0.f129159q
                    java.lang.Object r1 = kotlin.coroutines.intrinsics.IntrinsicsKt.getCOROUTINE_SUSPENDED()
                    int r2 = r0.f129160r
                    r3 = 1
                    if (r2 == 0) goto L31
                    if (r2 != r3) goto L29
                    kotlin.C42729a0.b(r6)
                    goto L4e
                L29:
                    java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                    java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                    r5.<init>(r6)
                    throw r5
                L31:
                    kotlin.C42729a0.b(r6)
                    r6 = r5
                    rv.b r6 = (rv.C47919b) r6
                    java.lang.String r6 = r6.f437158a
                    com.avito.android.crm_candidates.deeplink.change_status.a r2 = r4.f129158c
                    java.lang.String r2 = r2.f395444b
                    boolean r6 = kotlin.jvm.internal.L.f(r6, r2)
                    if (r6 == 0) goto L4e
                    r0.f129160r = r3
                    kotlinx.coroutines.flow.j r6 = r4.f129157b
                    java.lang.Object r5 = r6.emit(r5, r0)
                    if (r5 != r1) goto L4e
                    return r1
                L4e:
                    kotlin.G0 r5 = kotlin.G0.f406611a
                    return r5
                */
                throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.deeplink.change_status.a.C3827a.C3828a.emit(java.lang.Object, kotlin.coroutines.Continuation):java.lang.Object");
            }
        }

        public C3827a(InterfaceC43160i interfaceC43160i, a aVar) {
            this.f129155b = interfaceC43160i;
            this.f129156c = aVar;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC43160i
        @l
        public final Object collect(@k InterfaceC43172j<? super C47919b> interfaceC43172j, @k Continuation continuation) {
            Object objCollect = ((AbstractC43168f) this.f129155b).collect(new C3828a(interfaceC43172j, this.f129156c), continuation);
            return objCollect == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? objCollect : G0.f406611a;
        }
    }

    /* compiled from: JobCrmChangeStatusDeeplinkHandler.kt */
    @s0
    @Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lrv/b;", "fragmentResult", "Lkotlin/G0;", "<anonymous>", "(Lrv/b;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.crm_candidates.deeplink.change_status.JobCrmChangeStatusDeeplinkHandler$onCreate$2", f = "JobCrmChangeStatusDeeplinkHandler.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
    public static final class b extends SuspendLambda implements p<C47919b, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public /* synthetic */ Object f129162q;

        public b(Continuation<? super b> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @k
        public final Continuation<G0> create(@l Object obj, @k Continuation<?> continuation) {
            b bVar = a.this.new b(continuation);
            bVar.f129162q = obj;
            return bVar;
        }

        @Override // Y41.p
        public final Object invoke(C47919b c47919b, Continuation<? super G0> continuation) {
            return ((b) create(c47919b, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @l
        public final Object invokeSuspend(@k Object obj) {
            Object serializable;
            JobCrmChangeStatusDeeplink.JobApplicationStatusConfig jobApplicationStatusConfig;
            Map<String, String> mapD;
            Set<String> setKeySet;
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            C42729a0.b(obj);
            C47919b c47919b = (C47919b) this.f129162q;
            a aVar = a.this;
            JobCrmChangeStatusDeeplink jobCrmChangeStatusDeeplinkC = aVar.c();
            String str = (jobCrmChangeStatusDeeplinkC == null || (jobApplicationStatusConfig = jobCrmChangeStatusDeeplinkC.f129147b) == null || (mapD = jobApplicationStatusConfig.d()) == null || (setKeySet = mapD.keySet()) == null) ? null : (String) C42745f0.F(setKeySet);
            Bundle bundle = c47919b.f437159b;
            if (Build.VERSION.SDK_INT >= 33) {
                serializable = bundle.getSerializable("CHANGE_STATUS_RESULT", Q.class);
            } else {
                Object serializable2 = bundle.getSerializable("CHANGE_STATUS_RESULT");
                if (!(serializable2 instanceof Q)) {
                    serializable2 = null;
                }
                serializable = (Q) serializable2;
            }
            Q q12 = (Q) serializable;
            String str2 = q12 != null ? (String) q12.f406619b : null;
            aVar.j((str == null || str2 == null) ? AbstractC14250d.c.f9171c : new JobCrmChangeStatusDeeplink.b(aVar.f129154i, str, str2));
            return G0.f406611a;
        }
    }

    @Inject
    public a(@k a.d dVar, @k a.f fVar, @k R0 r02) {
        this.f129151f = fVar;
        this.f129152g = dVar;
        this.f129153h = U.a(r02.b());
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        JobCrmChangeStatusDeeplink jobCrmChangeStatusDeeplink = (JobCrmChangeStatusDeeplink) deepLink;
        String string = bundle != null ? bundle.getString("RESPONSE_ITEM_ID_ARG") : null;
        if (string == null) {
            string = "";
        }
        this.f129154i = string;
        JobCrmChangeStatusDialog.a aVar = JobCrmChangeStatusDialog.f129955k0;
        String str2 = this.f395444b;
        JobCrmChangeStatusDeeplink.JobApplicationStatusConfig jobApplicationStatusConfig = jobCrmChangeStatusDeeplink.f129147b;
        aVar.getClass();
        this.f129152g.w1(JobCrmChangeStatusDialog.a.a(jobApplicationStatusConfig, str2), this.f395444b);
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        C43175k.K(new C43197r1(new b(null), new C3827a(y.a(this.f129151f.l1(this.f395444b)), this)), this.f129153h);
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        U.b(this.f129153h, null);
    }
}
