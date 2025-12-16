package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.Collections;
import java.util.List;
import java.util.TimeZone;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: DateTimeFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/T0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class T0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final T0 f369594b = new T0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369595c = "parseUnixTime";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369596d = Collections.singletonList(new com.yandex.div.evaluable.h(EvaluableType.INTEGER, false, 2, null));

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369597e = EvaluableType.DATETIME;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369598f = true;

    public T0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        return new com.yandex.div.evaluable.types.b(((Long) C42745f0.E(list)).longValue() * 1000, TimeZone.getTimeZone("UTC"));
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369596d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369595c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369879d() {
        return f369597e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369598f;
    }
}
