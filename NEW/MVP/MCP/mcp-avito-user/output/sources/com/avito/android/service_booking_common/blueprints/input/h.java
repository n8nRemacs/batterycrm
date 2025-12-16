package com.avito.android.service_booking_common.blueprints.input;

import com.avito.android.lib.design.input.FormatterType;
import com.avito.android.lib.design.input.Input;
import com.avito.android.lib.design.input.s;
import com.avito.android.service_booking_common.blueprints.SbInputItem;
import com.avito.android.service_booking_common.blueprints.input.j;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: SbInputItemPresenter.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/service_booking_common/blueprints/input/h;", "Lcom/avito/android/service_booking_common/blueprints/input/e;", "<init>", "()V", "_avito-discouraged_avito-libs_service-booking-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class h extends e {
    @Inject
    public h() {
    }

    @Override // TV0.d
    public final void O5(TV0.e eVar, TV0.a aVar, int i12) {
        s sVarC;
        j jVar = (j) eVar;
        SbInputItem sbInputItem = (SbInputItem) aVar;
        f fVar = new f(sbInputItem, this);
        g gVar = new g(sbInputItem, this);
        jVar.f276450c.setTitle(sbInputItem.f276228c);
        String str = sbInputItem.f276229d;
        Input input = jVar.f276449b;
        input.setHint(str);
        Input.t(input, sbInputItem.f276231f, false, 6);
        SbInputItem.Format format = sbInputItem.f276230e;
        if ((format == null ? -1 : j.a.f276452a[format.ordinal()]) == 1) {
            FormatterType.f179288e.getClass();
            input.setFormatterType(FormatterType.f179290g);
            sVarC = com.avito.android.lib.design.input.n.c(input, new k(gVar));
        } else {
            FormatterType.f179288e.getClass();
            input.setFormatterType(FormatterType.f179289f);
            sVarC = com.avito.android.lib.design.input.n.c(input, new l(gVar));
        }
        jVar.f276451d = sVarC;
        input.setClearButtonListener(new m(gVar));
        input.setOnFocusChangeListener(new com.avito.android.advert.item.fmp.calculator.l(fVar, 14));
    }
}
