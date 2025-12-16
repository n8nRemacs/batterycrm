package com.avito.beduin.v2.engine.field.entity;

import java.util.Arrays;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Q;
import kotlin.collections.P0;
import kotlin.jvm.internal.s0;

/* compiled from: InteractionField.kt */
@s0
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"engine_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class n {
    @Y61.k
    public static final com.avito.beduin.v2.engine.field.m a(@Y61.k com.avito.beduin.v2.engine.core.z zVar, @Y61.k Q<String, ? extends com.avito.beduin.v2.engine.field.d>... qArr) {
        return b(P0.g((Q[]) Arrays.copyOf(qArr, qArr.length)));
    }

    @Y61.k
    public static final com.avito.beduin.v2.engine.field.m b(@Y61.k Map map) {
        return new com.avito.beduin.v2.engine.field.m((Q<String, ? extends com.avito.beduin.v2.engine.field.d>[]) new Q[]{new Q("args", new A(new com.avito.beduin.v2.engine.field.m((Map<String, ? extends com.avito.beduin.v2.engine.field.d>) map), null, 2, null))});
    }
}
