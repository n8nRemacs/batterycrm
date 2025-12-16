package com.fasterxml.jackson.databind.jsontype.impl;

import androidx.camera.core.Q;
import com.fasterxml.jackson.core.JsonGenerationException;
import com.fasterxml.jackson.core.JsonParser;
import com.fasterxml.jackson.core.JsonToken;
import com.fasterxml.jackson.databind.MapperFeature;
import com.fasterxml.jackson.databind.introspect.u;
import com.fasterxml.jackson.databind.util.C;
import java.util.BitSet;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

/* compiled from: AsDeductionTypeDeserializer.java */
/* loaded from: classes4.dex */
public class c extends g {

    /* renamed from: n, reason: collision with root package name */
    public static final BitSet f342141n = new BitSet(0);
    private static final long serialVersionUID = 1;

    /* renamed from: l, reason: collision with root package name */
    public final HashMap f342142l;

    /* renamed from: m, reason: collision with root package name */
    public final HashMap f342143m;

    public c(com.fasterxml.jackson.databind.h hVar, com.fasterxml.jackson.databind.jsontype.m mVar, com.fasterxml.jackson.databind.h hVar2, com.fasterxml.jackson.databind.e eVar, Collection<com.fasterxml.jackson.databind.jsontype.j> collection) {
        super(hVar, mVar, null, false, hVar2, null);
        this.f342142l = new HashMap();
        boolean zK2 = eVar.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        HashMap map = new HashMap();
        int i12 = 0;
        for (com.fasterxml.jackson.databind.jsontype.j jVar : collection) {
            List<u> listU = ((com.fasterxml.jackson.databind.introspect.s) eVar.o(eVar.f341506c.f341474b.l(jVar.f342179b))).u();
            BitSet bitSet = new BitSet(listU.size() + i12);
            Iterator<u> it = listU.iterator();
            while (it.hasNext()) {
                String name = it.next().getName();
                name = zK2 ? name.toLowerCase() : name;
                HashMap map2 = this.f342142l;
                Integer numValueOf = (Integer) map2.get(name);
                if (numValueOf == null) {
                    numValueOf = Integer.valueOf(i12);
                    map2.put(name, Integer.valueOf(i12));
                    i12++;
                }
                bitSet.set(numValueOf.intValue());
            }
            Class<?> cls = jVar.f342179b;
            String str = (String) map.put(bitSet, cls.getName());
            if (str != null) {
                throw new IllegalStateException(Q.a("Subtypes ", str, " and ", cls.getName(), " have the same signature and cannot be uniquely deduced."));
            }
        }
        this.f342143m = map;
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.g, com.fasterxml.jackson.databind.jsontype.impl.a, com.fasterxml.jackson.databind.jsontype.l
    public final Object d(JsonParser jsonParser, com.fasterxml.jackson.databind.f fVar) throws JsonGenerationException {
        String str;
        JsonToken jsonTokenF = jsonParser.f();
        if (jsonTokenF == JsonToken.START_OBJECT) {
            jsonTokenF = jsonParser.g0();
        } else if (jsonTokenF != JsonToken.FIELD_NAME) {
            return r(jsonParser, fVar, null, "Unexpected input");
        }
        JsonToken jsonToken = JsonToken.END_OBJECT;
        HashMap map = this.f342143m;
        if (jsonTokenF == jsonToken && (str = (String) map.get(f342141n)) != null) {
            return q(jsonParser, fVar, null, str);
        }
        LinkedList linkedList = new LinkedList(map.keySet());
        C cK2 = fVar.k(jsonParser);
        boolean zK2 = fVar.f341921d.k(MapperFeature.ACCEPT_CASE_INSENSITIVE_PROPERTIES);
        while (jsonTokenF == JsonToken.FIELD_NAME) {
            String strD = jsonParser.d();
            if (zK2) {
                strD = strD.toLowerCase();
            }
            cK2.y0(jsonParser);
            Integer num = (Integer) this.f342142l.get(strD);
            if (num != null) {
                int iIntValue = num.intValue();
                Iterator it = linkedList.iterator();
                while (it.hasNext()) {
                    if (!((BitSet) it.next()).get(iIntValue)) {
                        it.remove();
                    }
                }
                if (linkedList.size() == 1) {
                    return q(jsonParser, fVar, cK2, (String) map.get(linkedList.get(0)));
                }
            }
            jsonTokenF = jsonParser.g0();
        }
        return r(jsonParser, fVar, cK2, String.format("Cannot deduce unique subtype of %s (%d candidates match)", com.fasterxml.jackson.databind.util.g.t(this.f342164c), Integer.valueOf(linkedList.size())));
    }

    @Override // com.fasterxml.jackson.databind.jsontype.impl.g, com.fasterxml.jackson.databind.jsontype.impl.a, com.fasterxml.jackson.databind.jsontype.l
    public final com.fasterxml.jackson.databind.jsontype.l f(com.fasterxml.jackson.databind.c cVar) {
        return cVar == this.f342165d ? this : new c(this, cVar);
    }

    public c(c cVar, com.fasterxml.jackson.databind.c cVar2) {
        super(cVar, cVar2);
        this.f342142l = cVar.f342142l;
        this.f342143m = cVar.f342143m;
    }
}
