package com.avito.beduin.v2.repository.beduin_v1_in_memory;

import Y41.p;
import Y61.k;
import com.avito.beduin.v2.engine.C36272i;
import com.avito.beduin.v2.engine.field.entity.A;
import kotlin.G0;
import kotlin.Metadata;

/* compiled from: BeduinV1InMemoryRepositoryClient.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\bg\u0018\u0000*\u0004\b\u0000\u0010\u00012\u00020\u0002¨\u0006\u0003"}, d2 = {"Lcom/avito/beduin/v2/repository/beduin_v1_in_memory/a;", "Value", "", "beduin-v1-in-memory_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public interface a<Value> {
    Object a(@k C36272i c36272i, @k String str);

    @k
    HV0.c b(@k String str, @k C36272i c36272i, @k p<? super String, ? super Value, G0> pVar);

    void c(@k String str, A a12);

    void remove(@k String str);
}
