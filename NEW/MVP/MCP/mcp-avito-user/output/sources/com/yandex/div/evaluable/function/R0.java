package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: StringFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/R0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class R0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final R0 f369574b = new R0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369575c = "padStart";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369576d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369577e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369578f;

    static {
        EvaluableType evaluableType = EvaluableType.INTEGER;
        com.yandex.div.evaluable.h hVar = new com.yandex.div.evaluable.h(evaluableType, false, 2, null);
        com.yandex.div.evaluable.h hVar2 = new com.yandex.div.evaluable.h(evaluableType, false, 2, null);
        EvaluableType evaluableType2 = EvaluableType.STRING;
        f369576d = C42745f0.U(hVar, hVar2, new com.yandex.div.evaluable.h(evaluableType2, false, 2, null));
        f369577e = evaluableType2;
        f369578f = true;
    }

    public R0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        return kotlin.jvm.internal.L.j(String.valueOf(((Long) list.get(0)).longValue()), f1.a((int) (((Long) list.get(1)).longValue() - r0.length()), (String) list.get(2)));
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369576d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369575c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369879d() {
        return f369577e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369578f;
    }
}
