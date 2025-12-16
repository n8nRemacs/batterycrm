package com.google.common.collect;

import com.google.common.collect.C37399q4;
import java.util.Collection;
import java.util.Map;

/* compiled from: Synchronized.java */
/* renamed from: com.google.common.collect.r4, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37404r4 extends N0<Object, Collection<Object>> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f359987b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ C37399q4.c.a f359988c;

    public C37404r4(C37399q4.c.a aVar, Map.Entry entry) {
        this.f359988c = aVar;
        this.f359987b = entry;
    }

    @Override // com.google.common.collect.N0, com.google.common.collect.S0
    public final Object X() {
        return this.f359987b;
    }

    @Override // com.google.common.collect.N0
    /* renamed from: Y */
    public final Map.Entry<Object, Collection<Object>> X() {
        return this.f359987b;
    }

    @Override // com.google.common.collect.N0, java.util.Map.Entry
    public final Object getValue() {
        return C37399q4.a(C37399q4.c.this.f359975c, (Collection) this.f359987b.getValue());
    }
}
