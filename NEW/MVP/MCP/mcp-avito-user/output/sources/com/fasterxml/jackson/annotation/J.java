package com.fasterxml.jackson.annotation;

import com.fasterxml.jackson.annotation.G;
import java.util.HashMap;

/* compiled from: SimpleObjectIdResolver.java */
/* loaded from: classes17.dex */
public class J implements I {

    /* renamed from: a, reason: collision with root package name */
    public HashMap f340907a;

    @Override // com.fasterxml.jackson.annotation.I
    public final void a(G.a aVar, Object obj) {
        HashMap map = this.f340907a;
        if (map == null) {
            this.f340907a = new HashMap();
        } else {
            Object obj2 = map.get(aVar);
            if (obj2 != null) {
                if (obj2 == obj) {
                    return;
                }
                throw new IllegalStateException("Already had POJO for id (" + aVar.f340903d.getClass().getName() + ") [" + aVar + "]");
            }
        }
        this.f340907a.put(aVar, obj);
    }

    @Override // com.fasterxml.jackson.annotation.I
    public final boolean b(I i12) {
        return i12.getClass() == getClass();
    }

    @Override // com.fasterxml.jackson.annotation.I
    public final Object c(G.a aVar) {
        HashMap map = this.f340907a;
        if (map == null) {
            return null;
        }
        return map.get(aVar);
    }

    @Override // com.fasterxml.jackson.annotation.I
    public final J d() {
        return new J();
    }
}
