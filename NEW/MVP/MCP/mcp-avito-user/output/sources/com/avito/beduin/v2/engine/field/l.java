package com.avito.beduin.v2.engine.field;

import com.avito.beduin.v2.engine.field.d;
import kotlin.Metadata;
import kotlin.jvm.internal.L;
import kotlin.jvm.internal.s0;

/* compiled from: Field.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\b\u0012\u0004\u0012\u00028\u00000\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/l;", "Lcom/avito/beduin/v2/engine/field/d;", "T", "Lcom/avito/beduin/v2/engine/field/f;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface l<T extends d> extends f<T> {

    /* compiled from: Field.kt */
    @s0
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        @Y61.k
        public static <T extends d> f<T> a(@Y61.k l<? extends T> lVar, @Y61.k h hVar) {
            return L.f(lVar.getParams(), hVar) ? lVar : lVar.j(hVar);
        }
    }

    @Y61.k
    h getParams();

    @Y61.k
    f<T> j(@Y61.k h hVar);
}
