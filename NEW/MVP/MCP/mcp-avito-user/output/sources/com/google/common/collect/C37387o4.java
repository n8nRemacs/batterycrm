package com.google.common.collect;

import com.google.common.collect.C37381n4;
import java.util.Map;

/* compiled from: StandardTable.java */
/* renamed from: com.google.common.collect.o4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37387o4 extends AbstractC37340h<Object, Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f359903b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37381n4.c.b f359904c;

    public C37387o4(C37381n4.c.b bVar, Map.Entry entry) {
        this.f359904c = bVar;
        this.f359903b = entry;
    }

    @Override // java.util.Map.Entry
    public final Object getKey() {
        return this.f359903b.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        return ((Map) this.f359903b.getValue()).get(C37381n4.c.this.f359877e);
    }

    @Override // com.google.common.collect.AbstractC37340h, java.util.Map.Entry
    public final Object setValue(Object obj) {
        Map map = (Map) this.f359903b.getValue();
        C c12 = C37381n4.c.this.f359877e;
        obj.getClass();
        return map.put(c12, obj);
    }
}
