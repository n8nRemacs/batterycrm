package com.fasterxml.jackson.databind.deser.impl;

import com.fasterxml.jackson.databind.util.C;
import java.util.ArrayList;

/* compiled from: UnwrappedPropertyHandler.java */
/* loaded from: classes4.dex */
public class D {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f341595a;

    public D() {
        this.f341595a = new ArrayList();
    }

    public final void a(com.fasterxml.jackson.databind.f fVar, Object obj, com.fasterxml.jackson.databind.util.C c12) {
        ArrayList arrayList = this.f341595a;
        int size = arrayList.size();
        for (int i12 = 0; i12 < size; i12++) {
            com.fasterxml.jackson.databind.deser.v vVar = (com.fasterxml.jackson.databind.deser.v) arrayList.get(i12);
            C.b bVarX0 = c12.x0(c12.f342543c);
            bVarX0.g0();
            vVar.h(bVarX0, fVar, obj);
        }
    }

    public D(ArrayList arrayList) {
        this.f341595a = arrayList;
    }
}
