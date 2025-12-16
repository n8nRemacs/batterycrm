package com.yandex.div.evaluable.function;

import com.yandex.div.evaluable.EvaluableType;
import java.net.URLDecoder;
import java.util.Collections;
import java.util.List;
import kotlin.Metadata;
import kotlin.text.C43047d;

/* compiled from: StringFunctions.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/evaluable/function/d1;", "Lcom/yandex/div/evaluable/g;", "<init>", "()V", "div-evaluable"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class d1 extends com.yandex.div.evaluable.g {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final d1 f369691b = new d1();

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final String f369692c = "decodeUri";

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public static final List<com.yandex.div.evaluable.h> f369693d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public static final EvaluableType f369694e;

    /* renamed from: f, reason: collision with root package name */
    public static final boolean f369695f;

    static {
        EvaluableType evaluableType = EvaluableType.STRING;
        f369693d = Collections.singletonList(new com.yandex.div.evaluable.h(evaluableType, false, 2, null));
        f369694e = evaluableType;
        f369695f = true;
    }

    public d1() {
        super(null, 1, null);
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final Object a(@Y61.k List<? extends Object> list) {
        return URLDecoder.decode((String) list.get(0), C43047d.f410589b.name());
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    public final List<com.yandex.div.evaluable.h> b() {
        return f369693d;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: c */
    public final String getF369935b() {
        return f369692c;
    }

    @Override // com.yandex.div.evaluable.g
    @Y61.k
    /* renamed from: d */
    public final EvaluableType getF369887d() {
        return f369694e;
    }

    @Override // com.yandex.div.evaluable.g
    /* renamed from: f */
    public final boolean getF369888e() {
        return f369695f;
    }
}
