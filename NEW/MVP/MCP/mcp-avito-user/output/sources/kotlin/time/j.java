package kotlin.time;

import kotlin.InterfaceC42733c0;
import kotlin.Metadata;

/* compiled from: DurationUnit.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"kotlin-stdlib"}, k = 5, mv = {1, 9, 0}, xi = 49, xs = "kotlin/time/DurationUnitKt")
/* loaded from: classes8.dex */
class j extends i {

    /* compiled from: DurationUnit.kt */
    @Metadata(k = 3, mv = {1, 9, 0}, xi = 48)
    public /* synthetic */ class a {
        static {
            int[] iArr = new int[DurationUnit.values().length];
            try {
                iArr[DurationUnit.f410631c.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[DurationUnit.f410632d.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[DurationUnit.f410633e.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[DurationUnit.f410634f.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[DurationUnit.f410635g.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr[DurationUnit.f410636h.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr[DurationUnit.f410637i.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
        }
    }

    @InterfaceC42733c0
    @Y61.k
    public static final String b(@Y61.k DurationUnit durationUnit) {
        switch (durationUnit.ordinal()) {
            case 0:
                return "ns";
            case 1:
                return "us";
            case 2:
                return "ms";
            case 3:
                return "s";
            case 4:
                return "m";
            case 5:
                return "h";
            case 6:
                return "d";
            default:
                throw new IllegalStateException(("Unknown unit: " + durationUnit).toString());
        }
    }
}
