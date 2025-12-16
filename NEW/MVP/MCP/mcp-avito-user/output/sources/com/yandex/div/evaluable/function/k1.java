package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: StringFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/k1;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class k1 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final k1 f369779b = new k1();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369780c = "substring";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369781d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369782e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369783f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        com.yandex.div.evaluable.h hVar = new com.yandex.div.evaluable.h(evaluableType, false, 2, null);
        EvaluableType evaluableType2 = EvaluableType.INTEGER;
        f369781d = C42745f0.U(hVar, new com.yandex.div.evaluable.h(evaluableType2, false, 2, null), new com.yandex.div.evaluable.h(evaluableType2, false, 2, null));
        f369782e = evaluableType;
        f369783f = true;
    }

    public k1() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        String str = (String) list.get(0);
        long jLongValue = ((Long) list.get(1)).longValue();
        long jLongValue2 = ((Long) list.get(2)).longValue();
        String str2 = f369780c;
        if (jLongValue < 0 || jLongValue2 > str.length()) {
            com.yandex.div.evaluable.d.d(str2, "Indexes are out of bounds.", list);
            throw null;
        }
        if (jLongValue <= jLongValue2) {
            return str.substring((int) jLongValue, (int) jLongValue2);
        }
        com.yandex.div.evaluable.d.d(str2, "Indexes should be in ascending order.", list);
        throw null;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369781d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369780c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369782e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369783f;
    }
}
