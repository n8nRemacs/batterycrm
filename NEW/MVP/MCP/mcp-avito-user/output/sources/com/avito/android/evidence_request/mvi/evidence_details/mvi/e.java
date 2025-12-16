package com.avito.android.evidence_request.mvi.evidence_details.mvi;

import com.avito.android.evidence_request.mvi.domain.evidence_details.FilesInteractor;
import com.avito.android.evidence_request.mvi.domain.evidence_details.InterfaceC30381a;
import com.avito.android.evidence_request.mvi.domain.evidence_details.z;
import com.avito.android.evidence_request.mvi.domain.evidence_request.ProofDetailsContent;
import com.avito.android.evidence_request.mvi.evidence_details.mvi.entity.EvidenceDetailsInternalAction;
import com.avito.android.util.R0;
import com.avito.android.validation.InterfaceC36030r0;
import java.util.Set;
import javax.inject.Inject;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43152f0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: EvidenceDetailsBootstrap.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/e;", "Lcom/avito/android/arch/mvi/b;", "Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/entity/EvidenceDetailsInternalAction;", "a", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class e implements com.avito.android.arch.mvi.b<EvidenceDetailsInternalAction> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final R0 f149020a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ProofDetailsContent f149021b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final FilesInteractor f149022c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final InterfaceC36030r0 f149023d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final InterfaceC30381a f149024e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final Set<TV0.d<?, ?>> f149025f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final z f149026g;

    /* compiled from: EvidenceDetailsBootstrap.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lcom/avito/android/evidence_request/mvi/evidence_details/mvi/e$a;", "", "<init>", "()V", "", "CLICK_THROTTLE_DELAY_MS", "J", "_avito_evidence-request_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    @Inject
    public e(@Y61.k R0 r02, @Y61.k ProofDetailsContent proofDetailsContent, @Y61.k FilesInteractor filesInteractor, @Y61.k InterfaceC36030r0 interfaceC36030r0, @Y61.k InterfaceC30381a interfaceC30381a, @Y61.k Set<TV0.d<?, ?>> set, @Y61.k z zVar) {
        this.f149020a = r02;
        this.f149021b = proofDetailsContent;
        this.f149022c = filesInteractor;
        this.f149023d = interfaceC36030r0;
        this.f149024e = interfaceC30381a;
        this.f149025f = set;
        this.f149026g = zVar;
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.k
    public final InterfaceC43160i<EvidenceDetailsInternalAction> a() {
        InterfaceC43160i interfaceC43160iG = C43175k.G(new o(this, null));
        Set<TV0.d<?, ?>> set = this.f149025f;
        InterfaceC36030r0 interfaceC36030r0 = this.f149023d;
        interfaceC36030r0.i(set);
        C43152f0 c43152f0 = new C43152f0(new f(y.a(interfaceC36030r0.g())), new g(3, null));
        R0 r02 = this.f149020a;
        InterfaceC43160i interfaceC43160iI = C43175k.I(r02.b(), c43152f0);
        InterfaceC43160i interfaceC43160iG2 = C43175k.G(new h(this, null));
        FilesInteractor filesInteractor = this.f149022c;
        return C43175k.N(interfaceC43160iG, interfaceC43160iI, interfaceC43160iG2, C43175k.I(r02.b(), new C43152f0(C43175k.G(new k(filesInteractor.c(), null)), new l(3, null))), C43175k.I(r02.b(), new C43152f0(C43175k.G(new i(filesInteractor.b(), null)), new j(3, null))), new C43152f0(C43175k.G(new m(this, null)), new n(3, null)));
    }

    @Override // com.avito.android.arch.mvi.b
    @Y61.l
    public final Object b(@Y61.k Continuation<? super G0> continuation) {
        return G0.f406611a;
    }
}
