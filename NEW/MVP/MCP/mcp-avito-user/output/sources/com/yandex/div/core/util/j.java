package com.yandex.div.core.util;

import androidx.collection.q1;
import java.util.Iterator;
import kotlin.Metadata;

/* compiled from: SparseArrays.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u001c\n\u0000\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u00028\u00000\u0002¨\u0006\u0003"}, d2 = {"Lcom/yandex/div/core/util/j;", "T", "", "div_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes7.dex */
public final class j<T> implements Iterable<T>, Z41.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final q1<T> f367797b;

    public j(@Y61.k q1<T> q1Var) {
        this.f367797b = q1Var;
    }

    @Override // java.lang.Iterable
    @Y61.k
    public final Iterator<T> iterator() {
        return new k(this.f367797b);
    }
}
