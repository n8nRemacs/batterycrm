package com.avito.avcalls.stats;

import Y61.k;
import Y61.l;
import com.avito.avcalls.stats.a;
import java.math.BigInteger;
import java.util.Map;
import kotlin.Metadata;
import kotlin.w0;

/* compiled from: RtcStatsReport.kt */
@Metadata(d1 = {"\u0000\u0002\n\u0000¨\u0006\u0000"}, d2 = {"sdk_release"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class b {
    @l
    public static final Boolean a(@k a.C10362a c10362a, @k String str) {
        Object obj = c10362a.f333646d.get(str);
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        return null;
    }

    @l
    public static final Double b(@k a.C10362a c10362a, @k String str) {
        Object obj = c10362a.f333646d.get(str);
        if (obj instanceof Double) {
            return (Double) obj;
        }
        return null;
    }

    @l
    public static final Integer c(@k a.C10362a c10362a, @k String str) {
        Object obj = c10362a.f333646d.get(str);
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        return null;
    }

    @l
    public static final Long d(@k a.C10362a c10362a) {
        Map<String, Object> map = c10362a.f333646d;
        Object obj = map.get("packetsLost");
        Long l12 = obj instanceof Long ? (Long) obj : null;
        if (l12 != null) {
            return l12;
        }
        Object obj2 = map.get("packetsLost");
        BigInteger bigInteger = obj2 instanceof BigInteger ? (BigInteger) obj2 : null;
        if (bigInteger != null) {
            return Long.valueOf(bigInteger.longValue());
        }
        return null;
    }

    @l
    public static final String e(@k a.C10362a c10362a, @k String str) {
        Object obj = c10362a.f333646d.get(str);
        if (obj instanceof String) {
            return (String) obj;
        }
        return null;
    }

    @l
    public static final w0 f(@k a.C10362a c10362a, @k String str) {
        Map<String, Object> map = c10362a.f333646d;
        Object obj = map.get(str);
        w0 w0Var = obj instanceof w0 ? (w0) obj : null;
        if (w0Var != null) {
            return w0Var;
        }
        Object obj2 = map.get(str);
        BigInteger bigInteger = obj2 instanceof BigInteger ? (BigInteger) obj2 : null;
        if (bigInteger != null) {
            return w0.a(bigInteger.longValue());
        }
        return null;
    }
}
