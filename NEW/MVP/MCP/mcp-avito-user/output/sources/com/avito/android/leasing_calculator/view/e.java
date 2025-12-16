package com.avito.android.leasing_calculator.view;

import androidx.compose.foundation.H;
import com.avito.android.remote.model.LeasingCalculator;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.N;
import kotlin.text.C43066x;

/* compiled from: LeasingApplicationPresenter.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"", "newValue", "Lkotlin/G0;", "invoke", "(Ljava/lang/String;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* loaded from: classes14.dex */
final class e extends N implements Y41.l<String, G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ b f175140l;

    /* renamed from: m, reason: collision with root package name */
    public final /* synthetic */ h f175141m;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public e(b bVar, h hVar) {
        super(1);
        this.f175140l = bVar;
        this.f175141m = hVar;
    }

    @Override // Y41.l
    public final G0 invoke(String str) {
        LeasingCalculator.LeasingApplication.ApplicationField phone;
        LeasingCalculator.LeasingApplication.ApplicationField inn;
        String str2 = str;
        b bVar = this.f175140l;
        LeasingCalculator f175120f = bVar.f175128a.getF175120f();
        if (f175120f != null) {
            String strK = H.k("[^0-9]", str2, "");
            if (strK.length() > 0) {
                if (b.f175126g.contains(Character.valueOf(C43066x.D(strK)))) {
                    strK = strK.substring(1);
                }
            }
            LeasingCalculator.LeasingApplication application = f175120f.getApplication();
            String value = null;
            LeasingCalculator.LeasingApplication.ApplicationField phone2 = application != null ? application.getPhone() : null;
            if (phone2 != null) {
                phone2.setValue(strK);
            }
            LeasingCalculator.LeasingApplication application2 = f175120f.getApplication();
            String value2 = (application2 == null || (inn = application2.getInn()) == null) ? null : inn.getValue();
            LeasingCalculator.LeasingApplication application3 = f175120f.getApplication();
            if (application3 != null && (phone = application3.getPhone()) != null) {
                value = phone.getValue();
            }
            this.f175141m.b(bVar.f175130c.a(value2, value));
        }
        return G0.f406611a;
    }
}
