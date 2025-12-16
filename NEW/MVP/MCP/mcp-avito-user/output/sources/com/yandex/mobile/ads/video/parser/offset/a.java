package com.yandex.mobile.ads.video.parser.offset;

import com.yandex.mobile.ads.impl.c91;
import com.yandex.mobile.ads.impl.ds0;
import com.yandex.mobile.ads.impl.e91;
import com.yandex.mobile.ads.impl.gu0;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import j.N;
import j.P;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.HashSet;
import java.util.Locale;
import java.util.Set;

/* loaded from: classes8.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    @N
    private final Set<c91> f392910a;

    /* renamed from: b, reason: collision with root package name */
    @N
    private final ds0 f392911b = new ds0();

    /* renamed from: c, reason: collision with root package name */
    @N
    private final gu0 f392912c = new gu0();

    /* renamed from: d, reason: collision with root package name */
    @N
    private final e91 f392913d = new e91();

    public a(@N HashSet hashSet) {
        this.f392910a = hashSet;
    }

    @P
    public final VastTimeOffset a(@N String str) throws NumberFormatException {
        Long lValueOf;
        VastTimeOffset vastTimeOffset;
        int i12;
        Float fValueOf;
        float fFloatValue;
        if (this.f392910a.contains(c91.f384211c) && "start".equals(str)) {
            return new VastTimeOffset(VastTimeOffset.b.f392906a, 0.0f);
        }
        if (this.f392910a.contains(c91.f384212d) && "end".equals(str)) {
            return new VastTimeOffset(VastTimeOffset.b.f392907b, 100.0f);
        }
        if (this.f392910a.contains(c91.f384210b) && str.endsWith("%")) {
            this.f392911b.getClass();
            try {
                try {
                    fValueOf = Float.valueOf(str.substring(0, str.length() - 1));
                } catch (NumberFormatException unused) {
                    fValueOf = null;
                }
                fFloatValue = fValueOf.floatValue();
            } catch (Throwable unused2) {
            }
            if (fFloatValue < 0.0f || fFloatValue > 100.0f) {
                fValueOf = null;
            }
            if (fValueOf != null) {
                vastTimeOffset = new VastTimeOffset(VastTimeOffset.b.f392907b, fValueOf.floatValue());
                return vastTimeOffset;
            }
            return null;
        }
        if (this.f392910a.contains(c91.f384213e) && str.startsWith("#")) {
            this.f392912c.getClass();
            try {
                i12 = Integer.parseInt(str.substring(1));
            } catch (Exception unused3) {
            }
            Integer numValueOf = i12 >= 1 ? Integer.valueOf(i12) : null;
            if (numValueOf != null) {
                vastTimeOffset = new VastTimeOffset(VastTimeOffset.b.f392908c, numValueOf.intValue());
                return vastTimeOffset;
            }
            return null;
        }
        if (this.f392910a.contains(c91.f384209a)) {
            this.f392913d.getClass();
            try {
                SimpleDateFormat simpleDateFormat = new SimpleDateFormat("hh:mm:ss", Locale.US);
                lValueOf = Long.valueOf(simpleDateFormat.parse(str).getTime() - simpleDateFormat.parse("00:00:00").getTime());
            } catch (ParseException unused4) {
                lValueOf = null;
            }
            if (lValueOf != null) {
                vastTimeOffset = new VastTimeOffset(VastTimeOffset.b.f392906a, lValueOf.longValue());
                return vastTimeOffset;
            }
        }
        return null;
    }
}
