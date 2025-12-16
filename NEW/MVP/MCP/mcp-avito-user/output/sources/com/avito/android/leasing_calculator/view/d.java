package com.avito.android.leasing_calculator.view;

import com.avito.android.remote.model.LeasingCalculator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;

/* compiled from: LeasingApplicationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class d extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f175138l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f175139m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d(b bVar, h hVar) {
        super(1);
        this.f175138l = bVar;
        this.f175139m = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        LeasingCalculator.LeasingApplication.ApplicationField phone;
        LeasingCalculator.LeasingApplication.ApplicationField inn;
        String str2 = str;
        b bVar = this.f175138l;
        LeasingCalculator f175120f = bVar.f175128a.getF175120f();
        if (f175120f != null) {
            LeasingCalculator.LeasingApplication application = f175120f.getApplication();
            String value = null;
            LeasingCalculator.LeasingApplication.ApplicationField inn2 = application != null ? application.getInn() : null;
            if (inn2 != null) {
                inn2.setValue(str2);
            }
            LeasingCalculator.LeasingApplication application2 = f175120f.getApplication();
            String value2 = (application2 == null || (inn = application2.getInn()) == null) ? null : inn.getValue();
            LeasingCalculator.LeasingApplication application3 = f175120f.getApplication();
            if (application3 != null && (phone = application3.getPhone()) != null) {
                value = phone.getValue();
            }
            this.f175139m.b(bVar.f175130c.a(value2, value));
        }
        return G0.f406611a;
    }
}
