package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: NumberArithmeticFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/I;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class I extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final I f369490b = new I();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369491c = "max";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369492d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369493e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369494f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        f369492d = Collections.singletonList(new com.yandex.div.evaluable.h(evaluableType, true));
        f369493e = evaluableType;
        f369494f = true;
    }

    public I() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        if (list.isEmpty()) {
            String str = f369491c;
            com.yandex.div.evaluable.d.d(str, String.format("Non empty argument list is required for function '%s'.", Arrays.copyOf(new Object[]{str}, 1)), list);
            throw null;
        }
        List<? extends Object> list2 = list;
        Object objE = C42745f0.E(list);
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            objE = Double.valueOf(Math.max(((Double) objE).doubleValue(), ((Double) it.next()).doubleValue()));
        }
        return objE;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369492d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369491c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369493e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369494f;
    }
}
