package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ToNumber.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/n1;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class n1 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final n1 f369815b = new n1();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369816c = "toNumber";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369817d = Collections.singletonList(new com.yandex.div.evaluable.h(EvaluableType.STRING, false, 2, null));

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369818e = EvaluableType.NUMBER;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369819f = true;

    public n1() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) throws NumberFormatException {
        String str = f369816c;
        try {
            double d12 = Double.parseDouble((String) C42745f0.E(list));
            if (d12 != Double.POSITIVE_INFINITY && d12 != Double.NEGATIVE_INFINITY) {
                return Double.valueOf(d12);
            }
            com.yandex.div.evaluable.d.d(str, "Unable to convert value to Number.", list);
            throw null;
        } catch (NumberFormatException e12) {
            com.yandex.div.evaluable.d.c(str, list, "Unable to convert value to Number.", e12);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369817d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369816c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369818e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369819f;
    }
}
