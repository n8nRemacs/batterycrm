package com.avito.android.job.cv_info_actualization.mvi;

import TP.a;
import com.avito.android.job.cv_info_actualization.mvi.entity.JsxCvInfoActualizationInternalAction;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.flow.C43175k;
import kotlinx.coroutines.flow.C43197r1;
import kotlinx.coroutines.flow.C43210w;
import kotlinx.coroutines.flow.InterfaceC43160i;
import kotlinx.coroutines.rx3.y;

/* compiled from: JsxCvInfoActualizationActor.kt */
@s0
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u0014\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00040\u0001¨\u0006\u0005"}, d2 = {"Lcom/avito/android/job/cv_info_actualization/mvi/e;", "Lcom/avito/android/arch/mvi/a;", "LTP/a;", "Lcom/avito/android/job/cv_info_actualization/mvi/entity/JsxCvInfoActualizationInternalAction;", "LTP/d;", "_avito_job_cv-info-actualization_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final class e implements com.avito.android.arch.mvi.a<TP.a, JsxCvInfoActualizationInternalAction, TP.d> {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.job.cv_info_actualization.mvi.action_handler.c f174158a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.deeplink_handler.handler.composite.a f174159b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.job.cv_info_actualization.mvi.action_handler.e f174160c;

    @Inject
    public e(@Y61.k com.avito.android.job.cv_info_actualization.mvi.action_handler.c cVar, @Y61.k com.avito.android.deeplink_handler.handler.composite.a aVar, @Y61.k com.avito.android.job.cv_info_actualization.mvi.action_handler.e eVar) {
        this.f174158a = cVar;
        this.f174159b = aVar;
        this.f174160c = eVar;
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    public final InterfaceC43160i a(@Y61.k C43197r1 c43197r1, @Y61.k Y41.a aVar) {
        return C43175k.N(C43175k.B(new d(this, null), new b(y.a(this.f174159b.V9()))), C43175k.C(new c(this, aVar, null), c43197r1));
    }

    @Override // com.avito.android.arch.mvi.a
    @Y61.k
    /* renamed from: c, reason: merged with bridge method [inline-methods] */
    public final InterfaceC43160i<JsxCvInfoActualizationInternalAction> b(@Y61.k TP.a aVar, @Y61.k TP.d dVar) {
        boolean zEquals = aVar.equals(a.b.f15653a);
        com.avito.android.job.cv_info_actualization.mvi.action_handler.c cVar = this.f174158a;
        if (zEquals) {
            return cVar.a();
        }
        if (aVar.equals(a.d.f15655a)) {
            return new C43210w(JsxCvInfoActualizationInternalAction.OnToolbarNavigationClick.f174172b);
        }
        if (!(aVar instanceof a.AbstractC1070a)) {
            if (aVar.equals(a.c.f15654a)) {
                return this.f174160c.a(dVar.f15659b);
            }
            throw new NoWhenBranchMatchedException();
        }
        a.AbstractC1070a abstractC1070a = (a.AbstractC1070a) aVar;
        if (abstractC1070a instanceof a.AbstractC1070a.d) {
            return C43175k.G(new a(this, abstractC1070a, null));
        }
        if (abstractC1070a instanceof a.AbstractC1070a.C1071a) {
            a.AbstractC1070a.C1071a c1071a = (a.AbstractC1070a.C1071a) abstractC1070a;
            return new C43210w(new JsxCvInfoActualizationInternalAction.OnCheckboxClick(c1071a.f15644a, c1071a.f15645b));
        }
        if (abstractC1070a instanceof a.AbstractC1070a.e) {
            a.AbstractC1070a.e eVar = (a.AbstractC1070a.e) abstractC1070a;
            return new C43210w(new JsxCvInfoActualizationInternalAction.OnRadioButtonClick(eVar.f15651a, eVar.f15652b));
        }
        if (abstractC1070a.equals(a.AbstractC1070a.c.f15649a)) {
            return cVar.a();
        }
        if (!(abstractC1070a instanceof a.AbstractC1070a.b)) {
            throw new NoWhenBranchMatchedException();
        }
        a.AbstractC1070a.b bVar = (a.AbstractC1070a.b) abstractC1070a;
        return new C43210w(new JsxCvInfoActualizationInternalAction.OnChipsClick(bVar.f15646a, bVar.f15647b, bVar.f15648c));
    }
}
