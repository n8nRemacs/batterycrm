package com.avito.android.das_date_picker.deeplink;

import android.os.Build;
import android.os.Bundle;
import com.avito.android.das_date_picker.DasCalendarFragment;
import com.avito.android.das_date_picker.deeplink.TariffCardDatePickerLink;
import com.avito.android.das_date_picker.model.DasCalendarInitParameters;
import com.avito.android.deep_linking.links.DeepLink;
import com.avito.android.deeplink_handler.view.a;
import com.avito.android.util.K;
import com.avito.android.util.V2;
import ev.AbstractC40161a;
import io.reactivex.rxjava3.internal.operators.observable.W;
import java.util.Calendar;
import java.util.Date;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import rv.C47919b;

/* compiled from: TariffCardDatePickerLinkHandler.kt */
@s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001¨\u0006\u0003"}, d2 = {"Lcom/avito/android/das_date_picker/deeplink/c;", "Lev/a;", "Lcom/avito/android/das_date_picker/deeplink/TariffCardDatePickerLink;", "_avito_das-date-picker_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class c extends AbstractC40161a<TariffCardDatePickerLink> {

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final a.d f132252f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final a.f f132253g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.android.server_time.f f132254h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final io.reactivex.rxjava3.disposables.c f132255i = new io.reactivex.rxjava3.disposables.c();

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final String f132256j = "TariffCardDatePickerLinkHandler_" + this.f395444b;

    @Inject
    public c(@Y61.k a.d dVar, @Y61.k a.f fVar, @Y61.k com.avito.android.server_time.f fVar2) {
        this.f132252f = dVar;
        this.f132253g = fVar;
        this.f132254h = fVar2;
    }

    @Override // ev.AbstractC40161a
    public final void a(Bundle bundle, DeepLink deepLink, String str) {
        DasCalendarFragment.a aVar = DasCalendarFragment.f132225q0;
        Calendar calendar = Calendar.getInstance();
        com.avito.android.server_time.f fVar = this.f132254h;
        calendar.setTimeInMillis(fVar.now());
        calendar.add(1, -1);
        calendar.set(6, 1);
        K.a(calendar);
        Date time = calendar.getTime();
        Calendar calendar2 = Calendar.getInstance();
        calendar2.setTimeInMillis(fVar.now());
        K.a(calendar2);
        Date time2 = calendar2.getTime();
        aVar.getClass();
        DasCalendarFragment dasCalendarFragment = new DasCalendarFragment();
        DasCalendarInitParameters dasCalendarInitParameters = new DasCalendarInitParameters(((TariffCardDatePickerLink) deepLink).f132247b, time, time2, this.f132256j);
        dasCalendarFragment.f132235p0.setValue(dasCalendarFragment, DasCalendarFragment.f132226r0[0], dasCalendarInitParameters);
        this.f132252f.w1(dasCalendarFragment, "TariffCardDatePickerLinkHandler_");
    }

    @Override // ev.AbstractC40161a
    public final void f() {
        W wL1 = this.f132253g.l1(this.f132256j);
        l41.g gVar = new l41.g() { // from class: com.avito.android.das_date_picker.deeplink.c.a
            @Override // l41.g
            public final void accept(Object obj) {
                Object serializable;
                c cVar = c.this;
                int i12 = Build.VERSION.SDK_INT;
                Bundle bundle = ((C47919b) obj).f437159b;
                if (i12 >= 33) {
                    serializable = bundle.getSerializable("selected_date", Date.class);
                } else {
                    Object serializable2 = bundle.getSerializable("selected_date");
                    if (!(serializable2 instanceof Date)) {
                        serializable2 = null;
                    }
                    serializable = (Date) serializable2;
                }
                Date date = (Date) serializable;
                if (date == null) {
                    cVar.j(TariffCardDatePickerLink.b.C3956b.f132249b);
                } else {
                    cVar.j(new TariffCardDatePickerLink.b.a(date));
                }
            }
        };
        final V2 v22 = V2.f318762a;
        this.f132255i.b(wL1.v0(gVar, new l41.g() { // from class: com.avito.android.das_date_picker.deeplink.c.b
            @Override // l41.g
            public final void accept(Object obj) {
                v22.f((Throwable) obj);
            }
        }, io.reactivex.rxjava3.internal.functions.a.f401993c));
    }

    @Override // ev.AbstractC40161a
    public final void g() {
        this.f132255i.e();
    }
}
