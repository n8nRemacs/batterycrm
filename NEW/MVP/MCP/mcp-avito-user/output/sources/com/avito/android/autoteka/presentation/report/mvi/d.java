package com.avito.android.autoteka.presentation.report.mvi;

import Pf.InterfaceC14780a;
import com.avito.android.arch.mvi.a;
import com.avito.android.autoteka.deeplinks.ReportDetails;
import com.avito.android.autoteka.presentation.report.mvi.entity.AutotekaReportInternalAction;
import com.avito.android.remote.error.ApiError;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;

/* compiled from: AutotekaReportActor.kt */
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/autoteka/presentation/report/mvi/d;", "Lcom/avito/android/arch/mvi/a;", "LPf/a;", "Lcom/avito/android/autoteka/presentation/report/mvi/entity/AutotekaReportInternalAction;", "LPf/c;", "_avito_autoteka_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class d implements com.avito.android.arch.mvi.a<InterfaceC14780a, AutotekaReportInternalAction, Pf.c> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.autoteka.data.i f97717a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ReportDetails f97718b;

    @Inject
    public d(@Y61.k com.avito.android.autoteka.data.i iVar, @Y61.k ReportDetails reportDetails) {
        this.f97717a = iVar;
        this.f97718b = reportDetails;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return a.C2701a.a(this, c43197r1, aVar);
    }

    @Override // com.avito.android.arch.mvi.a
    public final InterfaceC43160i<AutotekaReportInternalAction> b(InterfaceC14780a interfaceC14780a, Pf.c cVar) {
        InterfaceC14780a interfaceC14780a2 = interfaceC14780a;
        Pf.c cVar2 = cVar;
        if (interfaceC14780a2.equals(InterfaceC14780a.d.f13213a)) {
            return new C43210w(new AutotekaReportInternalAction.Error(new ApiError.UnknownError("WebView receive error", null, null, 6, null)));
        }
        if (interfaceC14780a2 instanceof InterfaceC14780a.c) {
            return C43175k.G(new a(cVar2, interfaceC14780a2, this, null));
        }
        if (interfaceC14780a2.equals(InterfaceC14780a.C0856a.f13210a)) {
            return C43175k.G(new b(cVar2, this, null));
        }
        if (interfaceC14780a2.equals(InterfaceC14780a.b.f13211a)) {
            return C43175k.G(new c(cVar2, this, null));
        }
        throw new NoWhenBranchMatchedException();
    }
}
