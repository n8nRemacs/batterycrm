package com.avito.beduin.v2.engine.component;

import java.util.List;
import java.util.Set;
import kotlin.Metadata;

/* compiled from: Reader.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bg\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/engine/component/G;", "Lcom/avito/beduin/v2/engine/component/C;", "engine_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface G extends C {

    /* compiled from: Reader.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public static final class a {
    }

    @Y61.l
    Integer a(@Y61.k String str);

    @Y61.k
    Set<String> b();

    @Y61.l
    Boolean c(@Y61.k String str);

    boolean contains(@Y61.k String str);

    @Y61.l
    Object d(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2);

    @Y61.l
    Long e();

    @Y61.l
    Object f(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2);

    @Y61.k
    <T> List<T> g(@Y61.k String str, @Y61.k String str2, @Y61.k Y41.p<? super InterfaceC36241a, ? super Integer, ? extends T> pVar);

    @Y61.l
    String getString(@Y61.k String str);

    @Y61.l
    <T> T h(@Y61.k String str, @Y61.k String str2, @Y61.k Y41.q<? super G, ? super InterfaceC36249i, ? super String, ? extends T> qVar);

    Object k(@Y61.k Y41.l lVar, @Y61.k String str, @Y61.k String str2);

    @Y61.l
    Double l(@Y61.k String str);

    @Y61.l
    Float n(@Y61.k String str);
}
