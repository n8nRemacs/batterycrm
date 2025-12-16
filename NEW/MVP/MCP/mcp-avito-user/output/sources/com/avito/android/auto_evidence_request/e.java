package com.avito.android.auto_evidence_request;

import Ce.InterfaceC13295c;
import com.avito.android.remote.K;
import com.avito.android.remote.model.TypedResult;
import com.avito.android.util.R0;
import com.huawei.hms.adapter.internal.AvailableCode;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.flow.InterfaceC43172j;

/* compiled from: AutoEvidenceRequestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/auto_evidence_request/e;", "Lcom/avito/android/auto_evidence_request/d;", "_avito_auto-evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class e implements d {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final K f95101a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final g f95102b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final R0 f95103c;

    /* compiled from: AutoEvidenceRequestInteractor.kt */
    @s0
    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0003\u001a\u00020\u0002*\b\u0012\u0004\u0012\u00020\u00010\u0000H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lkotlinx/coroutines/flow/j;", "LCe/c;", "Lkotlin/G0;", "<anonymous>", "(Lkotlinx/coroutines/flow/j;)V"}, k = 3, mv = {1, 9, 0})
    @DebugMetadata(c = "com.avito.android.auto_evidence_request.AutoEvidenceRequestInteractorImpl$loadStructure$1", f = "AutoEvidenceRequestInteractor.kt", i = {0, 1, 2, 2}, l = {AvailableCode.ERROR_NO_ACTIVITY, AvailableCode.USER_IGNORE_PREVIOUS_POPUP, 30, 31, 36}, m = "invokeSuspend", n = {"$this$flow", "$this$flow", "$this$flow", "response"}, s = {"L$0", "L$0", "L$0", "L$1"})
    public static final class a extends SuspendLambda implements Y41.p<InterfaceC43172j<? super InterfaceC13295c>, Continuation<? super G0>, Object> {

        /* renamed from: q, reason: collision with root package name */
        public TypedResult.Success f95104q;

        /* renamed from: r, reason: collision with root package name */
        public int f95105r;

        /* renamed from: s, reason: collision with root package name */
        public /* synthetic */ Object f95106s;

        /* renamed from: u, reason: collision with root package name */
        public final /* synthetic */ String f95108u;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, Continuation<? super a> continuation) {
            super(2, continuation);
            this.f95108u = str;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.k
        public final Continuation<G0> create(@Y61.l Object obj, @Y61.k Continuation<?> continuation) {
            a aVar = e.this.new a(this.f95108u, continuation);
            aVar.f95106s = obj;
            return aVar;
        }

        @Override // Y41.p
        public final Object invoke(InterfaceC43172j<? super InterfaceC13295c> interfaceC43172j, Continuation<? super G0> continuation) {
            return ((a) create(interfaceC43172j, continuation)).invokeSuspend(G0.f406611a);
        }

        /* JADX WARN: Removed duplicated region for block: B:100:0x0210 A[SYNTHETIC] */
        /* JADX WARN: Removed duplicated region for block: B:24:0x0072  */
        /* JADX WARN: Removed duplicated region for block: B:40:0x0113  */
        /* JADX WARN: Removed duplicated region for block: B:71:0x0204  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0215  */
        /* JADX WARN: Removed duplicated region for block: B:78:0x0218  */
        /* JADX WARN: Removed duplicated region for block: B:83:0x0226  */
        /* JADX WARN: Removed duplicated region for block: B:86:0x0255 A[RETURN] */
        /* JADX WARN: Removed duplicated region for block: B:87:0x0256  */
        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Y61.l
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(@Y61.k java.lang.Object r32) {
            /*
                Method dump skipped, instructions count: 642
                To view this dump add '--comments-level debug' option
            */
            throw new UnsupportedOperationException("Method not decompiled: com.avito.android.auto_evidence_request.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }
    }

    @Inject
    public e(@Y61.k K k12, @Y61.k g gVar, @Y61.k R0 r02) {
        this.f95101a = k12;
        this.f95102b = gVar;
        this.f95103c = r02;
    }

    @Override // com.avito.android.auto_evidence_request.d
    @Y61.k
    public final InterfaceC43160i<InterfaceC13295c> a(@Y61.k String str) {
        return C43175k.I(this.f95103c.a(), C43175k.G(new a(str, null)));
    }
}
