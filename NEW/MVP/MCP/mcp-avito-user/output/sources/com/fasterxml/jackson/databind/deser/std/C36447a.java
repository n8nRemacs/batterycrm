package com.fasterxml.jackson.databind.deser.std;

import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.databind.JsonMappingException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.concurrent.ArrayBlockingQueue;

/* compiled from: ArrayBlockingQueueDeserializer.java */
/* renamed from: com.fasterxml.jackson.databind.deser.std.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C36447a extends C36454h {
    private static final long serialVersionUID = 1;

    public C36447a() {
        throw null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C36454h, com.fasterxml.jackson.databind.deser.std.C, com.fasterxml.jackson.databind.i
    public final Object g(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, com.fasterxml.jackson.databind.jsontype.l lVar) {
        return lVar.c(jsonParser, fVar);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C36454h
    public final Collection<Object> s0(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar, Collection<Object> collection) throws JsonMappingException {
        if (collection == null) {
            collection = new ArrayList<>();
        }
        Collection<Object> collectionS0 = super.s0(jsonParser, fVar, collection);
        return collectionS0.isEmpty() ? new ArrayBlockingQueue(1, false) : new ArrayBlockingQueue(collectionS0.size(), false, collectionS0);
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C36454h
    public final Collection<Object> t0(com.fasterxml.jackson.databind.f fVar) {
        return null;
    }

    @Override // com.fasterxml.jackson.databind.deser.std.C36454h
    public final C36454h v0(com.fasterxml.jackson.databind.i iVar, com.fasterxml.jackson.databind.i iVar2, com.fasterxml.jackson.databind.jsontype.l lVar, com.fasterxml.jackson.databind.deser.s sVar, Boolean bool) {
        return new C36447a(this.f341784e, iVar2, lVar, this.f341778k, iVar, sVar, bool);
    }
}
