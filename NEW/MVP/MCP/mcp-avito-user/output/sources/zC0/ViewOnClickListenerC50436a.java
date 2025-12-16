package zC0;

import TP.a;
import Y41.l;
import android.view.View;
import com.avito.android.job.cv_info_actualization.ui.items.checkbox.g;
import com.avito.android.tariff_cpt.info.deeplink.TariffCptInfoMonthsLink;
import com.avito.android.util.N0;

/* compiled from: R8$$SyntheticClass */
/* renamed from: zC0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final /* synthetic */ class ViewOnClickListenerC50436a implements View.OnClickListener {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f443952b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f443953c;

    /* renamed from: d, reason: collision with root package name */
    public final /* synthetic */ Object f443954d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ Object f443955e;

    public /* synthetic */ ViewOnClickListenerC50436a(Object obj, Object obj2, Object obj3, int i12) {
        this.f443952b = i12;
        this.f443953c = obj;
        this.f443954d = obj2;
        this.f443955e = obj3;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        Object obj = this.f443953c;
        Object obj2 = this.f443955e;
        Object obj3 = this.f443954d;
        switch (this.f443952b) {
            case 0:
                int i12 = DialogC50437b.f443956F;
                TariffCptInfoMonthsLink.MonthData monthData = (TariffCptInfoMonthsLink.MonthData) obj;
                if (!monthData.getIsSelected()) {
                    com.avito.android.deeplink_handler.handler.composite.b.a((com.avito.android.deeplink_handler.handler.composite.a) obj3, monthData.getDeeplink());
                    N0.a((DialogC50437b) obj2);
                    break;
                }
                break;
            default:
                int i13 = g.f174232e;
                ((l) obj).invoke(new a.AbstractC1070a.C1071a(((com.avito.android.job.cv_info_actualization.ui.items.checkbox.c) obj3).f174222b, ((com.avito.android.job.cv_info_actualization.ui.items.checkbox.d) obj2).f174227a));
                break;
        }
    }
}
