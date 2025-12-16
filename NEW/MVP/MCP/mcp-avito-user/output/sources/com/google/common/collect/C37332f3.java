package com.google.common.collect;

import com.google.common.collect.C37374m3;
import java.util.Collection;
import java.util.Map;

/* compiled from: Multimaps.java */
/* renamed from: com.google.common.collect.f3, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
class C37332f3 extends C37374m3.a<Object> {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ Map.Entry f359770b;

    public C37332f3(Map.Entry entry) {
        this.f359770b = entry;
    }

    @Override // com.google.common.collect.InterfaceC37338g3.a
    @InterfaceC37434x3
    public final Object a() {
        return this.f359770b.getKey();
    }

    @Override // com.google.common.collect.InterfaceC37338g3.a
    public final int getCount() {
        return ((Collection) this.f359770b.getValue()).size();
    }
}
