package com.google.common.base;

import java.util.Iterator;

/* compiled from: Joiner.java */
/* loaded from: classes6.dex */
class A extends C {
    @Override // com.google.common.base.C
    public final void a(StringBuilder sb2, Iterator it) {
        M.j(it, "parts");
        while (it.hasNext()) {
            if (it.next() != null) {
                throw null;
            }
        }
        while (it.hasNext()) {
            if (it.next() != null) {
                throw null;
            }
        }
    }

    @Override // com.google.common.base.C
    public final C e() {
        throw null;
    }
}
