package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;

/* compiled from: NumberArithmeticFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/L;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class L extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final L f369520b = new L();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369521c = "minNumber";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final C42784z0 f369522d = C42784z0.f406748b;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369523e = EvaluableType.NUMBER;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369524f = true;

    public L() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    public final /* bridge */ /* synthetic */ Object a(List list) {
        return Double.valueOf(Double.MIN_VALUE);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369522d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369521c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369901d() {
        return f369523e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369524f;
    }
}
