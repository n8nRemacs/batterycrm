package com.avito.android.service_booking_common.blueprints.date.date_list;

import Y61.k;
import android.content.Context;
import android.widget.TextView;
import com.avito.android.R;
import com.avito.android.serp.adapter.serp_advert_card.A;
import com.avito.android.service_booking_common.blueprints.date.m;
import com.avito.android.util.C35835l0;
import com.avito.android.util.I5;
import java.util.Calendar;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlinx.coroutines.channels.BufferOverflow;
import kotlinx.coroutines.flow.e2;
import kotlinx.coroutines.flow.f2;
import qt0.C47440d;

/* compiled from: SbDateListItemPresenter.kt */
@s0
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/date/date_list/h;", "Lcom/avito/android/service_booking_common/blueprints/date/date_list/e;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h implements e {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final e2 f276343b = f2.b(0, 1, BufferOverflow.f410778c, 1);

    @Inject
    public h() {
    }

    @Override // TV0.d
    public final /* bridge */ /* synthetic */ void O5(TV0.e eVar, TV0.a aVar, int i12) {
        k((j) eVar, (C47440d.a) aVar);
    }

    @Override // com.avito.android.service_booking_common.blueprints.date.date_list.e
    @k
    /* renamed from: f, reason: from getter */
    public final e2 getF276343b() {
        return this.f276343b;
    }

    @Override // TV0.f
    public final void g2(TV0.e eVar, TV0.a aVar, int i12, List list) {
        j jVar = (j) eVar;
        C47440d.a aVar2 = (C47440d.a) aVar;
        Object obj = null;
        for (Object obj2 : list) {
            if (obj2 instanceof m) {
                obj = obj2;
            }
        }
        m mVar = (m) (obj instanceof m ? obj : null);
        if (mVar == null) {
            k(jVar, aVar2);
        } else if (mVar.f276366a != null) {
            jVar.B80(aVar2);
            jVar.itemView.setOnClickListener(new A(5, new g(this, aVar2)));
        }
    }

    public final void k(@k j jVar, @k C47440d.a aVar) {
        int i12;
        f fVar = new f(this, aVar);
        Calendar calendarA = com.avito.android.service_booking_common.b.a();
        calendarA.setTime(aVar.f429417d);
        switch (calendarA.get(7)) {
            case 1:
                i12 = R.string.sb_sunday;
                break;
            case 2:
                i12 = R.string.sb_monday;
                break;
            case 3:
                i12 = R.string.sb_tuesday;
                break;
            case 4:
                i12 = R.string.sb_wednesday;
                break;
            case 5:
                i12 = R.string.sb_thursday;
                break;
            case 6:
                i12 = R.string.sb_friday;
                break;
            case 7:
                i12 = R.string.sb_saturday;
                break;
            default:
                i12 = 0;
                break;
        }
        Context context = jVar.f276346b;
        String upperCase = context.getString(i12).toUpperCase(Locale.ROOT);
        TextView textView = jVar.f276347c;
        I5.a(textView, upperCase, false);
        I5.a(jVar.f276348d, String.valueOf(calendarA.get(5)), false);
        jVar.B80(aVar);
        textView.setTextColor(C35835l0.d((calendarA.get(7) == 7 || calendarA.get(7) == 1) ? R.attr.red : R.attr.black, context));
        jVar.itemView.setOnClickListener(new A(5, fVar));
    }
}
