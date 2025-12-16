package com.avito.android.autoteka.presentation.reportGeneration.mvi;

import Rf.AbstractC15037c;
import Rf.InterfaceC15035a;
import com.avito.android.arch.mvi.a;
import com.avito.android.autoteka.deeplinks.ReportGenerationDetails;
import com.avito.android.autoteka.presentation.reportGeneration.mvi.entity.AutotekaReportGenerationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutotekaReportGenerationActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/presentation/reportGeneration/mvi/c;", "Lcom/avito/android/arch/mvi/a;", "LRf/a;", "Lcom/avito/android/autoteka/presentation/reportGeneration/mvi/entity/AutotekaReportGenerationInternalAction;", "LRf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class c implements com.avito.android.arch.mvi.a<InterfaceC15035a, AutotekaReportGenerationInternalAction, AbstractC15037c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.reportStatus.a f97792a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ReportGenerationDetails f97793b;

    @Inject
    public c(@Y61.k com.avito.android.autoteka.data.reportStatus.a aVar, @Y61.k ReportGenerationDetails reportGenerationDetails) {
        this.f97792a = aVar;
        this.f97793b = reportGenerationDetails;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AutotekaReportGenerationInternalAction> b(InterfaceC15035a interfaceC15035a, AbstractC15037c abstractC15037c) {
        InterfaceC15035a interfaceC15035a2 = interfaceC15035a;
        AbstractC15037c abstractC15037c2 = abstractC15037c;
        if (interfaceC15035a2 instanceof InterfaceC15035a.c) {
            return C43175k.G(new a(abstractC15037c2, interfaceC15035a2, this, null));
        }
        if (interfaceC15035a2 instanceof InterfaceC15035a.C0967a) {
            return C43175k.G(new b(2, null));
        }
        if (interfaceC15035a2 instanceof InterfaceC15035a.b) {
            return new C43210w(new AutotekaReportGenerationInternalAction.OpenDeepLink(((InterfaceC15035a.b) interfaceC15035a2).f14536a));
        }
        throw new NoWhenBranchMatchedException();
    }
}
