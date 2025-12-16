package com.yandex.metrica.impl.ob;

import com.yandex.metrica.impl.ob.C39205w;

/* renamed from: com.yandex.metrica.impl.ob.oc, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class C39026oc {

    /* renamed from: a, reason: collision with root package name */
    @j.N
    public final C38976mc f381239a;

    /* renamed from: b, reason: collision with root package name */
    @j.N
    public final Ac f381240b;

    /* renamed from: com.yandex.metrica.impl.ob.oc$a */
    public enum a {
        UNKNOWN("unknown"),
        FOREGROUND("fg"),
        BACKGROUND("bg"),
        VISIBLE("visible");


        /* renamed from: a, reason: collision with root package name */
        private final String f381246a;

        a(String str) {
            this.f381246a = str;
        }

        @j.N
        public String a() {
            return this.f381246a;
        }

        @Override // java.lang.Enum
        @j.N
        public String toString() {
            return this.f381246a;
        }

        @j.N
        public static a a(@j.P String str) {
            a aVar = UNKNOWN;
            a[] aVarArrValues = values();
            for (int i12 = 0; i12 < 4; i12++) {
                a aVar2 = aVarArrValues[i12];
                if (aVar2.f381246a.equals(str)) {
                    aVar = aVar2;
                }
            }
            return aVar;
        }

        @j.N
        public static a a(@j.P C39205w.a aVar) {
            a aVar2 = UNKNOWN;
            if (aVar == null) {
                return aVar2;
            }
            int iOrdinal = aVar.ordinal();
            if (iOrdinal != 1) {
                return iOrdinal != 2 ? aVar2 : VISIBLE;
            }
            return BACKGROUND;
        }
    }

    public C39026oc(@j.N C38976mc c38976mc, @j.N Ac ac2) {
        this.f381239a = c38976mc;
        this.f381240b = ac2;
    }

    public String toString() {
        return "LocationCollectionConfig{arguments=" + this.f381239a + ", preconditions=" + this.f381240b + '}';
    }
}
