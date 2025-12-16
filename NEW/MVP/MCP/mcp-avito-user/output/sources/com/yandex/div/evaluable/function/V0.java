package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DateTimeFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/V0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class V0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final V0 f369614b = new V0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369615c = "setDay";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369616d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369617e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369618f;

    static {
        EvaluableType evaluableType = EvaluableType.DATETIME;
        f369616d = C42745f0.U(new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(EvaluableType.INTEGER, false, 2, null));
        f369617e = evaluableType;
        f369618f = true;
    }

    public V0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        com.yandex.div.evaluable.types.b bVar = (com.yandex.div.evaluable.types.b) list.get(0);
        long jLongValue = ((Long) list.get(1)).longValue();
        Calendar calendarB = C.b(bVar);
        int actualMaximum = calendarB.getActualMaximum(5);
        if (1 <= jLongValue && jLongValue <= actualMaximum) {
            calendarB.set(5, (int) jLongValue);
        } else {
            if (jLongValue != -1) {
                com.yandex.div.evaluable.d.d(f369615c, "Unable to set day " + jLongValue + " for date " + bVar + '.', list);
                throw null;
            }
            calendarB.set(5, 0);
        }
        return new com.yandex.div.evaluable.types.b(calendarB.getTimeInMillis(), bVar.f369995c);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369616d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369615c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369617e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369618f;
    }
}
