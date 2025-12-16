package com.fasterxml.jackson.databind.util;

import com.fasterxml.jackson.core.JsonGenerator;

/* compiled from: RawValue.java */
/* loaded from: classes4.dex */
public class x implements com.fasterxml.jackson.databind.k {

    /* renamed from: b, reason: collision with root package name */
    public String f342646b;

    @Override // com.fasterxml.jackson.databind.k
    public final void a(JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12, com.fasterxml.jackson.databind.jsontype.o oVar) {
        CharSequence charSequence = this.f342646b;
        if (charSequence instanceof com.fasterxml.jackson.databind.k) {
            ((com.fasterxml.jackson.databind.k) charSequence).a(jsonGenerator, a12, oVar);
        } else if (charSequence instanceof com.fasterxml.jackson.core.l) {
            d(jsonGenerator, a12);
        }
    }

    @Override // com.fasterxml.jackson.databind.k
    public final void d(JsonGenerator jsonGenerator, com.fasterxml.jackson.databind.A a12) {
        CharSequence charSequence = this.f342646b;
        if (charSequence instanceof com.fasterxml.jackson.databind.k) {
            ((com.fasterxml.jackson.databind.k) charSequence).d(jsonGenerator, a12);
        } else if (charSequence instanceof com.fasterxml.jackson.core.l) {
            jsonGenerator.Y((com.fasterxml.jackson.core.l) charSequence);
        } else {
            jsonGenerator.Z(String.valueOf(charSequence));
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof x)) {
            return false;
        }
        String str = this.f342646b;
        String str2 = ((x) obj).f342646b;
        if (str == str2) {
            return true;
        }
        return str != null && str.equals(str2);
    }

    public final int hashCode() {
        String str = this.f342646b;
        if (str == null) {
            return 0;
        }
        return str.hashCode();
    }

    public final String toString() {
        return AK.c.k("[RawValue of type ", g.f(this.f342646b), "]");
    }
}
