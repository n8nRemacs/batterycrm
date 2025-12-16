package com.google.common.reflect;

import com.google.common.collect.AbstractC37378n1;
import com.google.common.collect.AbstractC37401r1;
import com.google.common.collect.H1;
import com.google.common.collect.O4;
import com.google.common.reflect.w;

/* compiled from: TypeToken.java */
/* loaded from: classes6.dex */
class x extends w.f.c<Object> {
    @Override // com.google.common.reflect.w.f
    public final AbstractC37401r1 b(AbstractC37378n1 abstractC37378n1) {
        O4<Object> o42 = AbstractC37401r1.f359977c;
        AbstractC37401r1.a aVar = new AbstractC37401r1.a();
        for (Object obj : abstractC37378n1) {
            if (!this.f360471c.d(obj).isInterface()) {
                aVar.g(obj);
            }
        }
        return super.b(aVar.i());
    }

    @Override // com.google.common.reflect.w.f.c, com.google.common.reflect.w.f
    public final Iterable<Object> c(Object obj) {
        return H1.E();
    }
}
