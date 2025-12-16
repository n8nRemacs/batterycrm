package com.yandex.mobile.ads.impl;

import com.yandex.mobile.ads.instream.InstreamAdBreakPosition;
import com.yandex.mobile.ads.video.parser.offset.VastTimeOffset;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/* loaded from: classes8.dex */
public final class j40 {

    /* renamed from: b, reason: collision with root package name */
    private static final HashSet f386761b = new HashSet(Arrays.asList(c91.f384211c, c91.f384212d, c91.f384210b, c91.f384209a, c91.f384213e));

    /* renamed from: c, reason: collision with root package name */
    private static final Map<VastTimeOffset.b, InstreamAdBreakPosition.Type> f386762c = new a();

    /* renamed from: a, reason: collision with root package name */
    @j.N
    private final com.yandex.mobile.ads.video.parser.offset.a f386763a = new com.yandex.mobile.ads.video.parser.offset.a(f386761b);

    public class a extends HashMap<VastTimeOffset.b, InstreamAdBreakPosition.Type> {
        public a() {
            put(VastTimeOffset.b.f392906a, InstreamAdBreakPosition.Type.MILLISECONDS);
            put(VastTimeOffset.b.f392907b, InstreamAdBreakPosition.Type.PERCENTS);
            put(VastTimeOffset.b.f392908c, InstreamAdBreakPosition.Type.POSITION);
        }
    }

    @j.P
    public final InstreamAdBreakPosition a(@j.N b91 b91Var) throws NumberFormatException {
        VastTimeOffset vastTimeOffsetA = this.f386763a.a(b91Var.a());
        if (vastTimeOffsetA != null) {
            InstreamAdBreakPosition.Type type = (InstreamAdBreakPosition.Type) ((HashMap) f386762c).get(vastTimeOffsetA.c());
            if (type != null) {
                return new InstreamAdBreakPosition(type, (long) vastTimeOffsetA.d());
            }
        }
        return null;
    }
}
