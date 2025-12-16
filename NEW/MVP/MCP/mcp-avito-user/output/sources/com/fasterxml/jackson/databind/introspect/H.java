package com.fasterxml.jackson.databind.introspect;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.databind.introspect.G;

/* compiled from: POJOPropertyBuilder.java */
/* loaded from: classes4.dex */
class H implements G.h<JsonProperty.Access> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ G f341990a;

    public H(G g12) {
        this.f341990a = g12;
    }

    @Override // com.fasterxml.jackson.databind.introspect.G.h
    public final JsonProperty.Access a(AbstractC36471j abstractC36471j) {
        return this.f341990a.f341969e.E(abstractC36471j);
    }
}
