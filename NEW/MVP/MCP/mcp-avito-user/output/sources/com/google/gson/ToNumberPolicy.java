package com.google.gson;

import com.google.gson.internal.w;
import com.google.gson.stream.MalformedJsonException;
import java.math.BigDecimal;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes6.dex */
public abstract class ToNumberPolicy implements q {

    /* renamed from: b, reason: collision with root package name */
    public static final ToNumberPolicy f361980b;

    /* renamed from: c, reason: collision with root package name */
    public static final ToNumberPolicy f361981c;

    /* renamed from: d, reason: collision with root package name */
    public static final ToNumberPolicy f361982d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ ToNumberPolicy[] f361983e;

    public enum a extends ToNumberPolicy {
        @Override // com.google.gson.q
        public final Number a(com.google.gson.stream.a aVar) {
            return Double.valueOf(aVar.p());
        }
    }

    public enum b extends ToNumberPolicy {
        @Override // com.google.gson.q
        public final Number a(com.google.gson.stream.a aVar) {
            return new w(aVar.B());
        }
    }

    public enum c extends ToNumberPolicy {
        @Override // com.google.gson.q
        public final Number a(com.google.gson.stream.a aVar) throws MalformedJsonException, NumberFormatException {
            String strB = aVar.B();
            try {
                try {
                    return Long.valueOf(Long.parseLong(strB));
                } catch (NumberFormatException unused) {
                    Double dValueOf = Double.valueOf(strB);
                    if (dValueOf.isInfinite() || dValueOf.isNaN()) {
                        if (!aVar.f362208c) {
                            throw new MalformedJsonException("JSON forbids NaN and infinities: " + dValueOf + "; at path " + aVar.j());
                        }
                    }
                    return dValueOf;
                }
            } catch (NumberFormatException e12) {
                StringBuilder sbA = androidx.appcompat.app.r.A("Cannot parse ", strB, "; at path ");
                sbA.append(aVar.j());
                throw new JsonParseException(sbA.toString(), e12);
            }
        }
    }

    public enum d extends ToNumberPolicy {
        @Override // com.google.gson.q
        public final Number a(com.google.gson.stream.a aVar) {
            String strB = aVar.B();
            try {
                return new BigDecimal(strB);
            } catch (NumberFormatException e12) {
                StringBuilder sbA = androidx.appcompat.app.r.A("Cannot parse ", strB, "; at path ");
                sbA.append(aVar.j());
                throw new JsonParseException(sbA.toString(), e12);
            }
        }
    }

    static {
        a aVar = new a("DOUBLE", 0, null);
        f361980b = aVar;
        b bVar = new b("LAZILY_PARSED_NUMBER", 1, null);
        f361981c = bVar;
        c cVar = new c("LONG_OR_DOUBLE", 2, null);
        f361982d = cVar;
        f361983e = new ToNumberPolicy[]{aVar, bVar, cVar, new d("BIG_DECIMAL", 3, null)};
    }

    public ToNumberPolicy() {
        throw null;
    }

    public ToNumberPolicy(String str, int i12, a aVar) {
    }

    public static ToNumberPolicy valueOf(String str) {
        return (ToNumberPolicy) Enum.valueOf(ToNumberPolicy.class, str);
    }

    public static ToNumberPolicy[] values() {
        return (ToNumberPolicy[]) f361983e.clone();
    }
}
