package com.yandex.mobile.ads.impl;

import android.util.Pair;
import java.util.Map;

/* loaded from: classes8.dex */
public final class wl1 {
    @j.P
    public static Pair<Long, Long> a(com.yandex.mobile.ads.exo.drm.e eVar) throws NumberFormatException {
        String str;
        Map<String, String> mapE = eVar.e();
        if (mapE == null) {
            return null;
        }
        long j12 = -9223372036854775807L;
        try {
            str = mapE.get("LicenseDurationRemaining");
        } catch (NumberFormatException unused) {
        }
        long j13 = str != null ? Long.parseLong(str) : -9223372036854775807L;
        Long lValueOf = Long.valueOf(j13);
        try {
            String str2 = mapE.get("PlaybackDurationRemaining");
            if (str2 != null) {
                j12 = Long.parseLong(str2);
            }
        } catch (NumberFormatException unused2) {
        }
        return new Pair<>(lValueOf, Long.valueOf(j12));
    }
}
