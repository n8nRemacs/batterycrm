package com.yandex.div.evaluable.function;

import androidx.compose.ui.platform.C22491k0;
import com.yandex.div.evaluable.EvaluableException;
import java.util.Calendar;
import java.util.Date;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: DateTimeFunctions.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"div-evaluable"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class C {
    public static final void a(String str) {
        if (C43066x.q(str.toLowerCase(), "z", false)) {
            throw new EvaluableException(C22491k0.a(']', "z/Z not supported in [", str), null, 2, null);
        }
    }

    public static final Calendar b(com.yandex.div.evaluable.types.b bVar) {
        Calendar calendar = Calendar.getInstance();
        calendar.setTimeZone(bVar.f369995c);
        calendar.setTimeInMillis(bVar.f369994b);
        return calendar;
    }

    public static final Date c(com.yandex.div.evaluable.types.b bVar) {
        return new Date(bVar.f369994b - bVar.f369995c.getRawOffset());
    }
}
