package com.yandex.div.json.expressions;

import Y41.l;
import Y61.k;
import com.yandex.div.core.InterfaceC37911f;
import java.util.List;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ExpressionList.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u0000*\b\b\u0000\u0010\u0002*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/yandex/div/json/expressions/a;", "", "T", "Lcom/yandex/div/json/expressions/d;", "div-json_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class a<T> implements d<T> {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<T> f370551a;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@k List<? extends T> list) {
        this.f370551a = list;
    }

    @Override // com.yandex.div.json.expressions.d
    @k
    public final List<T> a(@k e eVar) {
        return this.f370551a;
    }

    @Override // com.yandex.div.json.expressions.d
    @k
    public final InterfaceC37911f b(@k e eVar, @k l<? super List<? extends T>, G0> lVar) {
        return InterfaceC37911f.f367528l2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (obj instanceof a) {
            if (L.f(this.f370551a, ((a) obj).f370551a)) {
                return true;
            }
        }
        return false;
    }
}
