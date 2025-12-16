package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import com.yandex.div.evaluable.types.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42745f0;

/* compiled from: ColorFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/g;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.g, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38066g extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C38066g f369717b = new C38066g();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369718c = "argb";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369719d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369720e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369721f;

    static {
        EvaluableType evaluableType = EvaluableType.NUMBER;
        f369719d = C42745f0.U(new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(evaluableType, false, 2, null), new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        f369720e = EvaluableType.COLOR;
        f369721f = true;
    }

    public C38066g() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        try {
            int iA2 = C38076l.a(((Double) list.get(0)).doubleValue());
            int iA3 = C38076l.a(((Double) list.get(1)).doubleValue());
            int iA4 = C38076l.a(((Double) list.get(2)).doubleValue());
            int iA5 = C38076l.a(((Double) list.get(3)).doubleValue());
            com.yandex.div.evaluable.types.a.f369990b.getClass();
            return com.yandex.div.evaluable.types.a.a(a.C10920a.a(iA2, iA3, iA4, iA5));
        } catch (IllegalArgumentException unused) {
            com.yandex.div.evaluable.d.d(f369718c, "Value out of range 0..1.", list);
            throw null;
        }
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369719d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369718c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369679d() {
        return f369720e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369721f;
    }
}
