package com.avito.beduin.v2.engine.field;

import com.avito.beduin.v2.engine.core.K;
import com.avito.beduin.v2.engine.core.z;
import com.avito.beduin.v2.engine.field.d;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Field.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bf\u0018\u0000*\n\b\u0000\u0010\u0002 \u0001*\u00020\u00012\u00020\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/beduin/v2/engine/field/f;", "Lcom/avito/beduin/v2/engine/field/d;", "T", "", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface f<T extends d> {

    /* compiled from: Field.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        /* JADX WARN: Multi-variable type inference failed */
        @Y61.k
        public static <T extends d> f<d> a(@Y61.k f<? extends T> fVar, @Y61.k String str, @Y61.k f<?> fVar2) {
            return str.equals(fVar.getF336844b().getF336873c()) ? fVar.g(fVar2) : fVar;
        }

        @Y61.k
        public static <T extends d> f<d> c(@Y61.k f<? extends T> fVar, @Y61.k String str, @Y61.k f<?> fVar2) {
            return fVar.b(str, fVar2);
        }
    }

    @Y61.k
    T a(@Y61.k z zVar, @Y61.k Map<q, ? extends K<? extends d>> map);

    @Y61.k
    f<d> b(@Y61.k String str, @Y61.k f<?> fVar);

    @Y61.k
    f<d> d(@Y61.k String str, @Y61.k f<?> fVar);

    @Y61.k
    Set<q> e();

    @Y61.k
    f<d> g(@Y61.k f<? extends d> fVar);

    @Y61.k
    /* renamed from: getId */
    j getF336844b();

    @Y61.k
    f<d> h();

    @Y61.k
    f<T> l(@Y61.k j jVar);
}
