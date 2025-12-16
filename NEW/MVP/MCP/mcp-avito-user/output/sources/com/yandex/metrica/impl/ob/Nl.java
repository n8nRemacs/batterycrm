package com.yandex.metrica.impl.ob;

import kotlin.jvm.internal.C42822w;

/* loaded from: classes7.dex */
public final class Nl {

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public static final a f379015c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    private final long f379016a;

    /* renamed from: b, reason: collision with root package name */
    private final int f379017b;

    public static final class a {
        private a() {
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    public Nl(long j12, int i12) {
        this.f379016a = j12;
        this.f379017b = i12;
    }

    public final int a() {
        return this.f379017b;
    }

    public final long b() {
        return this.f379016a;
    }

    public boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Nl)) {
            return false;
        }
        Nl nl2 = (Nl) obj;
        return this.f379016a == nl2.f379016a && this.f379017b == nl2.f379017b;
    }

    public int hashCode() {
        long j12 = this.f379016a;
        return (((int) (j12 ^ (j12 >>> 32))) * 31) + this.f379017b;
    }

    @Y61.k
    public String toString() {
        StringBuilder sb2 = new StringBuilder("DecimalProtoModel(mantissa=");
        sb2.append(this.f379016a);
        sb2.append(", exponent=");
        return AK.c.i(this.f379017b, ")", sb2);
    }
}
