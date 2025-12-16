package com.google.gson;

import com.google.gson.internal.w;
import java.io.Serializable;
import java.math.BigInteger;

/* compiled from: JsonPrimitive.java */
/* loaded from: classes6.dex */
public final class m extends i {

    /* renamed from: b, reason: collision with root package name */
    public final Serializable f362195b;

    public m(Boolean bool) {
        bool.getClass();
        this.f362195b = bool;
    }

    public static boolean v(m mVar) {
        Serializable serializable = mVar.f362195b;
        if (!(serializable instanceof Number)) {
            return false;
        }
        Number number = (Number) serializable;
        return (number instanceof BigInteger) || (number instanceof Long) || (number instanceof Integer) || (number instanceof Short) || (number instanceof Byte);
    }

    @Override // com.google.gson.i
    public final boolean d() {
        Serializable serializable = this.f362195b;
        return serializable instanceof Boolean ? ((Boolean) serializable).booleanValue() : Boolean.parseBoolean(s());
    }

    @Override // com.google.gson.i
    public final double e() {
        return this.f362195b instanceof Number ? r().doubleValue() : Double.parseDouble(s());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || m.class != obj.getClass()) {
            return false;
        }
        m mVar = (m) obj;
        Serializable serializable = this.f362195b;
        Serializable serializable2 = mVar.f362195b;
        if (serializable == null) {
            return serializable2 == null;
        }
        if (v(this) && v(mVar)) {
            return r().longValue() == mVar.r().longValue();
        }
        if (!(serializable instanceof Number) || !(serializable2 instanceof Number)) {
            return serializable.equals(serializable2);
        }
        double dDoubleValue = r().doubleValue();
        double dDoubleValue2 = mVar.r().doubleValue();
        if (dDoubleValue != dDoubleValue2) {
            return Double.isNaN(dDoubleValue) && Double.isNaN(dDoubleValue2);
        }
        return true;
    }

    @Override // com.google.gson.i
    public final int g() {
        return this.f362195b instanceof Number ? r().intValue() : Integer.parseInt(s());
    }

    public final int hashCode() {
        long jDoubleToLongBits;
        Serializable serializable = this.f362195b;
        if (serializable == null) {
            return 31;
        }
        if (v(this)) {
            jDoubleToLongBits = r().longValue();
        } else {
            if (!(serializable instanceof Number)) {
                return serializable.hashCode();
            }
            jDoubleToLongBits = Double.doubleToLongBits(r().doubleValue());
        }
        return (int) (jDoubleToLongBits ^ (jDoubleToLongBits >>> 32));
    }

    @Override // com.google.gson.i
    public final long l() {
        return this.f362195b instanceof Number ? r().longValue() : Long.parseLong(s());
    }

    @Override // com.google.gson.i
    public final Number r() {
        Serializable serializable = this.f362195b;
        return serializable instanceof String ? new w((String) serializable) : (Number) serializable;
    }

    @Override // com.google.gson.i
    public final String s() {
        Serializable serializable = this.f362195b;
        return serializable instanceof Number ? r().toString() : serializable instanceof Boolean ? ((Boolean) serializable).toString() : (String) serializable;
    }

    public final float t() {
        return this.f362195b instanceof Number ? r().floatValue() : Float.parseFloat(s());
    }

    public m(Number number) {
        number.getClass();
        this.f362195b = number;
    }

    public m(String str) {
        str.getClass();
        this.f362195b = str;
    }

    @Override // com.google.gson.i
    public final i b() {
        return this;
    }
}
