package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ColorFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/q;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.q, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38086q extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C38086q f369836b = new C38086q();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369837c = "rgb";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369838d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369839e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369840f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        f369838d = C42745f0.U(new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        f369839e = EvaluableType.COLOR;
        f369840f = true;
    }

    public C38086q() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        try {
            int iA2 = C38076l.a(((Double) list.get(0)).doubleValue());
            int iA3 = C38076l.a(((Double) list.get(1)).doubleValue());
            int iA4 = C38076l.a(((Double) list.get(2)).doubleValue());
            com.yandex.div.evaluable.types.a.f369990b.getClass();
            return com.yandex.div.evaluable.types.a.a(a.C10920a.a(255, iA2, iA3, iA4));
        } catch (IllegalArgumentException unused) {
            com.yandex.div.evaluable.d.d(f369837c, "Value out of range 0..1.", list);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369838d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369837c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369839e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369840f;
    }
}
