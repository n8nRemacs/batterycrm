package org.joda.time.tz;

import java.util.Collections;
import java.util.Set;
import org.joda.time.AbstractC44868j;

/* compiled from: UTCProvider.java */
/* loaded from: classes7.dex */
public final class g implements f {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f420998a = Collections.singleton("UTC");

    @Override // org.joda.time.tz.f
    public final AbstractC44868j a(String str) {
        if ("UTC".equalsIgnoreCase(str)) {
            return AbstractC44868j.f420911c;
        }
        return null;
    }

    @Override // org.joda.time.tz.f
    public final Set<String> b() {
        return f420998a;
    }
}
