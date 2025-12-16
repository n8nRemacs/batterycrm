package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;

/* compiled from: DateTimeFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/r0;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: com.yandex.div.evaluable.function.r0, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C38088r0 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final C38088r0 f369853b = new C38088r0();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369854c = "getMonth";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369855d = Collections.singletonList(new com.yandex.div.evaluable.h(EvaluableType.DATETIME, false, 2, null));

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369856e = EvaluableType.INTEGER;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369857f = true;

    public C38088r0() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        return Long.valueOf(C.b((com.yandex.div.evaluable.types.b) list.get(0)).get(2) + 1);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369855d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369854c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369901d() {
        return f369856e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369902e() {
        return f369857f;
    }
}
