package com.avito.android.mortgage.selected_appeal.mvi;

import com.avito.android.analytics.screens.tracker.ScreenPerformanceTracker;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfo;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfoFloatField;
import com.avito.android.mortgage.api.model.items.application.ApplicationAppealCreditInfoIntField;
import com.avito.android.mortgage.selected_appeal.model.SelectedAppealArguments;
import com.avito.android.mortgage.selected_appeal.model.SelectedAppealCreditInfoField;
import dagger.internal.l;
import dagger.internal.x;
import dagger.internal.y;
import javax.inject.Provider;
import k10.C42473c;
import kotlin.collections.C42756l;

/* compiled from: SelectedAppealFeatureBuilder_Factory.java */
@dagger.internal.e
@y
@x
/* loaded from: classes15.dex */
public final class f implements dagger.internal.h<e> {

    /* renamed from: a, reason: collision with root package name */
    public final l f203477a;

    /* renamed from: b, reason: collision with root package name */
    public final c f203478b;

    /* renamed from: c, reason: collision with root package name */
    public final j f203479c;

    /* renamed from: d, reason: collision with root package name */
    public final h f203480d;

    /* renamed from: e, reason: collision with root package name */
    public final Provider<ScreenPerformanceTracker> f203481e;

    public f(l lVar, c cVar, j jVar, h hVar, Provider provider) {
        this.f203477a = lVar;
        this.f203478b = cVar;
        this.f203479c = jVar;
        this.f203480d = hVar;
        this.f203481e = provider;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // javax.inject.Provider
    public final Object get() {
        SelectedAppealCreditInfoField selectedAppealCreditInfoField;
        SelectedAppealCreditInfoField selectedAppealCreditInfoField2;
        SelectedAppealCreditInfoField selectedAppealCreditInfoField3;
        SelectedAppealCreditInfoField selectedAppealCreditInfoField4;
        ApplicationAppealCreditInfoIntField loanTerm;
        ApplicationAppealCreditInfoFloatField rate;
        ApplicationAppealCreditInfoIntField monthlyPayment;
        ApplicationAppealCreditInfoIntField initialPayment;
        ApplicationAppealCreditInfoIntField loanAmount;
        SelectedAppealArguments selectedAppealArguments = (SelectedAppealArguments) this.f203477a.f393949a;
        b bVar = (b) this.f203478b.get();
        this.f203479c.getClass();
        i iVar = new i();
        this.f203480d.getClass();
        g gVar = new g();
        ScreenPerformanceTracker screenPerformanceTracker = this.f203481e.get();
        C42473c.f405992m.getClass();
        ApplicationAppealCreditInfo applicationAppealCreditInfo = selectedAppealArguments.f203443g;
        SelectedAppealCreditInfoField selectedAppealCreditInfoField5 = null;
        if (applicationAppealCreditInfo == null || (loanAmount = applicationAppealCreditInfo.getLoanAmount()) == null) {
            selectedAppealCreditInfoField = null;
        } else {
            SelectedAppealCreditInfoField.f203448d.getClass();
            selectedAppealCreditInfoField = new SelectedAppealCreditInfoField(loanAmount.getTitle(), loanAmount.getValue());
        }
        if (applicationAppealCreditInfo == null || (initialPayment = applicationAppealCreditInfo.getInitialPayment()) == null) {
            selectedAppealCreditInfoField2 = null;
        } else {
            SelectedAppealCreditInfoField.f203448d.getClass();
            selectedAppealCreditInfoField2 = new SelectedAppealCreditInfoField(initialPayment.getTitle(), initialPayment.getValue());
        }
        if (applicationAppealCreditInfo == null || (monthlyPayment = applicationAppealCreditInfo.getMonthlyPayment()) == null) {
            selectedAppealCreditInfoField3 = null;
        } else {
            SelectedAppealCreditInfoField.f203448d.getClass();
            selectedAppealCreditInfoField3 = new SelectedAppealCreditInfoField(monthlyPayment.getTitle(), monthlyPayment.getValue());
        }
        if (applicationAppealCreditInfo == null || (rate = applicationAppealCreditInfo.getRate()) == null) {
            selectedAppealCreditInfoField4 = null;
        } else {
            SelectedAppealCreditInfoField.f203448d.getClass();
            selectedAppealCreditInfoField4 = new SelectedAppealCreditInfoField(rate.getTitle(), rate.getValue());
        }
        if (applicationAppealCreditInfo != null && (loanTerm = applicationAppealCreditInfo.getLoanTerm()) != null) {
            SelectedAppealCreditInfoField.f203448d.getClass();
            selectedAppealCreditInfoField5 = new SelectedAppealCreditInfoField(loanTerm.getTitle(), loanTerm.getValue());
        }
        return new e("MortgageSelectedAppealDialog", new C42473c(selectedAppealArguments.f203438b, selectedAppealArguments.f203439c, selectedAppealArguments.f203440d, selectedAppealArguments.f203441e, selectedAppealArguments.f203442f, C42756l.B(new SelectedAppealCreditInfoField[]{selectedAppealCreditInfoField, selectedAppealCreditInfoField2, selectedAppealCreditInfoField3, selectedAppealCreditInfoField4, selectedAppealCreditInfoField5}), selectedAppealArguments.f203444h, selectedAppealArguments.f203445i, selectedAppealArguments.f203446j, selectedAppealArguments.f203447k, false), new d(bVar, screenPerformanceTracker, iVar, gVar));
    }
}
