package com.avito.android.crm_candidates.features.full_filters.logics;

import Rs.InterfaceC15076a;
import Us.InterfaceC15563a;
import com.avito.android.arch.mvi.a;
import com.avito.android.crm_candidates.features.full_filters.entity.FiltersInternalAction;
import com.avito.android.crm_candidates.features.full_filters.entity.FiltersState;
import iP.InterfaceC41329a;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: FiltersActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/crm_candidates/features/full_filters/logics/d;", "Lcom/avito/android/arch/mvi/a;", "LRs/a;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersInternalAction;", "Lcom/avito/android/crm_candidates/features/full_filters/entity/FiltersState;", "_avito_job_crm-candidates_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC15076a, FiltersInternalAction, FiltersState> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final InterfaceC15563a f129601a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final h31.e<InterfaceC41329a> f129602b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.crm_candidates.domain.o f129603c;

    @Inject
    public d(@Y61.k InterfaceC15563a interfaceC15563a, @Y61.k h31.e<InterfaceC41329a> eVar, @Y61.k com.avito.android.crm_candidates.domain.o oVar) {
        this.f129601a = interfaceC15563a;
        this.f129602b = eVar;
        this.f129603c = oVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0134, code lost:
    
        if (r3.emit(r4, r2) != r1) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0123  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x001a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final java.lang.Object c(com.avito.android.crm_candidates.features.full_filters.logics.d r25, kotlinx.coroutines.flow.InterfaceC43172j r26, com.avito.android.crm_candidates.domain.DateInterval r27, kotlin.coroutines.jvm.internal.ContinuationImpl r28) {
        /*
            Method dump skipped, instructions count: 332
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.avito.android.crm_candidates.features.full_filters.logics.d.c(com.avito.android.crm_candidates.features.full_filters.logics.d, kotlinx.coroutines.flow.j, com.avito.android.crm_candidates.domain.DateInterval, kotlin.coroutines.jvm.internal.ContinuationImpl):java.lang.Object");
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<FiltersInternalAction> b(InterfaceC15076a interfaceC15076a, FiltersState filtersState) {
        return C43175k.G(new b(interfaceC15076a, this, filtersState, null));
    }
}
