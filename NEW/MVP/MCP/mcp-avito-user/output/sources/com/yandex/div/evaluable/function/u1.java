package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43066x;

/* compiled from: StringFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/u1;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class u1 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final u1 f369880b = new u1();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369881c = "trim";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369882d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369883e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369884f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        f369882d = Collections.singletonList(new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        f369883e = evaluableType;
        f369884f = true;
    }

    public u1() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        return C43066x.A0((String) list.get(0)).toString();
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369882d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369881c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369901d() {
        return f369883e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369884f;
    }
}
