package com.fasterxml.jackson.databind.node;

import com.fasterxml.jackson.core.JsonFactory;
import com.fasterxml.jackson.core.JsonGenerator;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.t;
import com.fasterxml.jackson.databind.z;
import java.io.IOException;
import oX0.AbstractC44703c;
import tX0.C48613a;

/* compiled from: InternalNodeMapper.java */
/* loaded from: classes4.dex */
final class k {

    /* renamed from: a, reason: collision with root package name */
    public static final C48613a f342200a;

    /* renamed from: b, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.t f342201b;

    /* renamed from: c, reason: collision with root package name */
    public static final com.fasterxml.jackson.databind.s f342202c;

    static {
        C48613a c48613a = new C48613a();
        f342200a = c48613a;
        f342201b = new com.fasterxml.jackson.databind.t(c48613a, c48613a.f341416d);
        z zVar = c48613a.f341416d;
        new com.fasterxml.jackson.databind.t(c48613a, zVar);
        com.fasterxml.jackson.core.k kVar = zVar.f342661l;
        t.a aVar = t.a.f342430c;
        if (kVar == null) {
            kVar = com.fasterxml.jackson.databind.t.f342424g;
        }
        if (aVar != (kVar == null ? aVar : new t.a(kVar))) {
        }
        f342202c = new com.fasterxml.jackson.databind.s(c48613a, c48613a.f341419g, c48613a.f341415c.l(com.fasterxml.jackson.databind.j.class));
    }

    /* JADX WARN: Removed duplicated region for block: B:66:0x0139  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static com.fasterxml.jackson.databind.j a(byte[] r28) {
        /*
            Method dump skipped, instructions count: 620
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: com.fasterxml.jackson.databind.node.k.a(byte[]):com.fasterxml.jackson.databind.j");
    }

    public static byte[] b(b bVar) {
        byte[] bArr;
        C48613a c48613a = f342200a;
        JsonFactory jsonFactory = c48613a.f341414b;
        try {
            com.fasterxml.jackson.core.util.c cVar = new com.fasterxml.jackson.core.util.c(jsonFactory.b());
            try {
                JsonGenerator jsonGeneratorC = jsonFactory.c(cVar);
                c48613a.f341416d.o((AbstractC44703c) jsonGeneratorC);
                c48613a.b(jsonGeneratorC, bVar);
                byte[] bArrG = cVar.g();
                cVar.f();
                com.fasterxml.jackson.core.util.a aVar = cVar.f341284b;
                if (aVar != null && (bArr = cVar.f341287e) != null) {
                    aVar.f341279a.set(2, bArr);
                    cVar.f341287e = null;
                }
                return bArrG;
            } finally {
            }
        } catch (JsonProcessingException e12) {
            throw e12;
        } catch (IOException e13) {
            throw JsonMappingException.g(e13);
        }
    }
}
