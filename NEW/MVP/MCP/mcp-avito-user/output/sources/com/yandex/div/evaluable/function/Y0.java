package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.Calendar;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DateTimeFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/Y0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class Y0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final Y0 f369636b = new Y0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369637c = "setMinutes";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369638d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369639e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369640f;

    static {
        EvaluableType evaluableType = EvaluableType.DATETIME;
        f369638d = C42745f0.U(new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(EvaluableType.INTEGER, false, 2, null));
        f369639e = evaluableType;
        f369640f = true;
    }

    public Y0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        com.yandex.div.evaluable.types.b bVar = (com.yandex.div.evaluable.types.b) list.get(0);
        long jLongValue = ((Long) list.get(1)).longValue();
        if (jLongValue <= 59 && jLongValue >= 0) {
            Calendar calendarB = C.b(bVar);
            calendarB.set(12, (int) jLongValue);
            return new com.yandex.div.evaluable.types.b(calendarB.getTimeInMillis(), bVar.f369995c);
        }
        com.yandex.div.evaluable.d.d(f369637c, "Expecting minutes in [0..59], instead got " + jLongValue + '.', list);
        throw null;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369638d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369637c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369639e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369640f;
    }
}
