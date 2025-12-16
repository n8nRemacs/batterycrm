package wX0;

import com.fasterxml.jackson.databind.AbstractC36441a;
import com.fasterxml.jackson.databind.h;
import java.io.Serializable;
import java.util.HashMap;

/* compiled from: SimpleAbstractTypeResolver.java */
/* renamed from: wX0.a, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public class C49573a extends AbstractC36441a implements Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final HashMap<com.fasterxml.jackson.databind.type.b, Class<?>> f441535b = new HashMap<>();

    @Override // com.fasterxml.jackson.databind.AbstractC36441a
    public final h a(com.fasterxml.jackson.databind.e eVar, h hVar) {
        Class<?> cls = this.f441535b.get(new com.fasterxml.jackson.databind.type.b(hVar.f341930b));
        if (cls == null) {
            return null;
        }
        return eVar.f341506c.f341474b.k(hVar, cls, false);
    }
}
