package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.e;
import com.yandex.div.evaluable.internal.b;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: IntegerArithmeticFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/H0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class H0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final H0 f369485b = new H0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369486c = "sum";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369487d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369488e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369489f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        f369487d = Collections.singletonList(new com.yandex.div.evaluable.h(evaluableType, true));
        f369488e = evaluableType;
        f369489f = true;
    }

    public H0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        Long l12 = 0L;
        for (Object obj : list) {
            long jLongValue = l12.longValue();
            e.a aVar = com.yandex.div.evaluable.e.f369413c;
            b.d.a.f.C10915b c10915b = b.d.a.f.C10915b.f369974a;
            Long lValueOf = Long.valueOf(jLongValue);
            aVar.getClass();
            l12 = (Long) e.a.b(c10915b, lValueOf, obj);
            l12.getClass();
        }
        return l12;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369487d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369486c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369901d() {
        return f369488e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369489f;
    }
}
