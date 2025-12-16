package com.avito.android.evidence_request.mvi.domain.evidence_details;

import com.avito.android.evidence_request.mvi.domain.evidence_request.AppealId;
import com.avito.android.remote.model.category_parameters.CharParameter;
import com.avito.android.util.InterfaceC35745a5;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EvidenceRequestUploadInteractor.kt */
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/evidence_request/mvi/domain/evidence_details/r;", "Lcom/avito/android/evidence_request/mvi/domain/evidence_details/q;", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class r implements q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final AppealId f148713a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<com.avito.android.remote.K> f148714b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.account.G f148715c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC35745a5 f148716d;

    /* compiled from: EvidenceRequestUploadInteractor.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f148717a;

        static {
            int[] iArr = new int[CharParameter.InputType.values().length];
            try {
                iArr[CharParameter.InputType.URI.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            f148717a = iArr;
        }
    }

    @Inject
    public r(@Y61.k AppealId appealId, @Y61.k h31.e<com.avito.android.remote.K> eVar, @Y61.k com.avito.android.account.G g12, @Y61.k InterfaceC35745a5 interfaceC35745a5) {
        this.f148713a = appealId;
        this.f148714b = eVar;
        this.f148715c = g12;
        this.f148716d = interfaceC35745a5;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x0077  */
    @Override // com.avito.android.evidence_request.mvi.domain.evidence_details.q
    @Y61.k
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final io.reactivex.rxjava3.internal.operators.single.C42026y a(@Y61.k java.lang.String r13, @Y61.k java.util.List r14) {
        /*
            Method dump skipped, instructions count: 323
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.evidence_request.mvi.domain.evidence_details.r.a(java.lang.String, java.util.List):io.reactivex.rxjava3.internal.operators.single.y");
    }
}
