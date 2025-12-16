package shark;

import java.nio.charset.Charset;
import java.util.LinkedHashMap;
import kotlin.Metadata;
import kotlin.TypeCastException;
import kotlin.jvm.internal.C42822w;
import kotlin.text.C43047d;
import okio.InterfaceC44804n;

/* compiled from: HprofHeader.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Lshark/b2;", "", "a", "shark-hprof"}, k = 1, mv = {1, 4, 1})
/* renamed from: shark.b2, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final /* data */ class C48236b2 {

    /* renamed from: e, reason: collision with root package name */
    public static final LinkedHashMap f438243e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public static final a f438244f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final int f438245a;

    /* renamed from: b, reason: collision with root package name */
    public final long f438246b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final HprofVersion f438247c;

    /* renamed from: d, reason: collision with root package name */
    public final int f438248d;

    /* compiled from: HprofHeader.kt */
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R \u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lshark/b2$a;", "", "<init>", "()V", "", "", "Lshark/HprofVersion;", "supportedVersions", "Ljava/util/Map;", "shark-hprof"}, k = 1, mv = {1, 4, 1})
    /* renamed from: shark.b2$a */
    public static final class a {
        public a() {
        }

        @Y61.k
        public static C48236b2 a(@Y61.k InterfaceC44804n interfaceC44804n) {
            if (interfaceC44804n.W2()) {
                throw new IllegalArgumentException("Source has no available bytes");
            }
            String strD4 = interfaceC44804n.d4(interfaceC44804n.I3());
            LinkedHashMap linkedHashMap = C48236b2.f438243e;
            HprofVersion hprofVersion = (HprofVersion) linkedHashMap.get(strD4);
            if (hprofVersion != null) {
                interfaceC44804n.skip(1L);
                return new C48236b2(interfaceC44804n.readLong(), hprofVersion, interfaceC44804n.readInt());
            }
            StringBuilder sbA = androidx.appcompat.app.r.A("Unsupported Hprof version [", strD4, "] not in supported list ");
            sbA.append(linkedHashMap.keySet());
            throw new IllegalStateException(sbA.toString().toString());
        }

        public /* synthetic */ a(C42822w c42822w) {
            this();
        }
    }

    static {
        HprofVersion[] hprofVersionArrValues = HprofVersion.values();
        int iF2 = kotlin.collections.P0.f(hprofVersionArrValues.length);
        if (iF2 < 16) {
            iF2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(iF2);
        for (HprofVersion hprofVersion : hprofVersionArrValues) {
            linkedHashMap.put(hprofVersion.f438083b, hprofVersion);
        }
        f438243e = linkedHashMap;
    }

    public C48236b2() {
        this(0L, null, 0, 7, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48236b2)) {
            return false;
        }
        C48236b2 c48236b2 = (C48236b2) obj;
        return this.f438246b == c48236b2.f438246b && kotlin.jvm.internal.L.f(this.f438247c, c48236b2.f438247c) && this.f438248d == c48236b2.f438248d;
    }

    public final int hashCode() {
        long j12 = this.f438246b;
        int i12 = ((int) (j12 ^ (j12 >>> 32))) * 31;
        HprofVersion hprofVersion = this.f438247c;
        return ((i12 + (hprofVersion != null ? hprofVersion.hashCode() : 0)) * 31) + this.f438248d;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("HprofHeader(heapDumpTimestamp=");
        sb2.append(this.f438246b);
        sb2.append(", version=");
        sb2.append(this.f438247c);
        sb2.append(", identifierByteSize=");
        return AK.c.i(this.f438248d, ")", sb2);
    }

    public C48236b2(long j12, @Y61.k HprofVersion hprofVersion, int i12) {
        this.f438246b = j12;
        this.f438247c = hprofVersion;
        this.f438248d = i12;
        Charset charset = C43047d.f410589b;
        String str = hprofVersion.f438083b;
        if (str == null) {
            throw new TypeCastException("null cannot be cast to non-null type java.lang.String");
        }
        this.f438245a = str.getBytes(charset).length + 13;
    }

    public /* synthetic */ C48236b2(long j12, HprofVersion hprofVersion, int i12, int i13, C42822w c42822w) {
        this((i13 & 1) != 0 ? System.currentTimeMillis() : j12, (i13 & 2) != 0 ? HprofVersion.ANDROID : hprofVersion, (i13 & 4) != 0 ? 4 : i12);
    }
}
