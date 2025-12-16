package com.fasterxml.jackson.core.util;

import com.fasterxml.jackson.core.JsonGenerator;
import java.io.Serializable;
import oX0.AbstractC44703c;

/* compiled from: MinimalPrettyPrinter.java */
/* loaded from: classes3.dex */
public class m implements com.fasterxml.jackson.core.k, Serializable {
    private static final long serialVersionUID = 1;

    /* renamed from: b, reason: collision with root package name */
    public final String f341310b = com.fasterxml.jackson.core.k.f341214e2.f341186b;

    /* renamed from: c, reason: collision with root package name */
    public final o f341311c = com.fasterxml.jackson.core.k.f341213d2;

    @Override // com.fasterxml.jackson.core.k
    public final void a(AbstractC44703c abstractC44703c) {
        String str = this.f341310b;
        if (str != null) {
            abstractC44703c.X(str);
        }
    }

    @Override // com.fasterxml.jackson.core.k
    public final void d(AbstractC44703c abstractC44703c) {
        abstractC44703c.U('[');
    }

    @Override // com.fasterxml.jackson.core.k
    public final void e(AbstractC44703c abstractC44703c, int i12) {
        abstractC44703c.U(']');
    }

    @Override // com.fasterxml.jackson.core.k
    public final void f(AbstractC44703c abstractC44703c, int i12) {
        abstractC44703c.U('}');
    }

    @Override // com.fasterxml.jackson.core.k
    public final void g(AbstractC44703c abstractC44703c) {
        this.f341311c.getClass();
        abstractC44703c.U(':');
    }

    @Override // com.fasterxml.jackson.core.k
    public final void h(AbstractC44703c abstractC44703c) {
        abstractC44703c.U('{');
    }

    @Override // com.fasterxml.jackson.core.k
    public final void k(AbstractC44703c abstractC44703c) {
        this.f341311c.getClass();
        abstractC44703c.U(',');
    }

    @Override // com.fasterxml.jackson.core.k
    public final void l(AbstractC44703c abstractC44703c) {
        this.f341311c.getClass();
        abstractC44703c.U(',');
    }

    @Override // com.fasterxml.jackson.core.k
    public final void c(AbstractC44703c abstractC44703c) {
    }

    @Override // com.fasterxml.jackson.core.k
    public final void i(JsonGenerator jsonGenerator) {
    }
}
