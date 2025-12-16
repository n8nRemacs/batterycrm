package com.avito.beduin.v2.interaction.network.parser.serializer;

import SU0.j;
import Y61.k;
import kotlin.Metadata;

/* compiled from: ApplicationJsonSerializer.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/network/parser/serializer/a;", "LSU0/f;", "serializer_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class a implements SU0.f {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final com.avito.beduin.v2.serialization.json.e f337690a;

    public a(@k com.avito.beduin.v2.serialization.json.e eVar) {
        this.f337690a = eVar;
    }

    @Override // SU0.f
    public final j a(com.avito.beduin.v2.engine.field.d dVar) {
        return new j.c.C1022c(this.f337690a.a(dVar), "application/json");
    }
}
