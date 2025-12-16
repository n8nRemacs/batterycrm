package com.huawei.hms.framework.network.grs.f;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes7.dex */
public class e {

    /* renamed from: a, reason: collision with root package name */
    public static final Set<String> f363528a;

    public static class a extends HashSet<String> {
    }

    static {
        a aVar = new a(16);
        aVar.add("ser_country");
        aVar.add("reg_country");
        aVar.add("issue_country");
        aVar.add("geo_ip");
        f363528a = Collections.unmodifiableSet(aVar);
    }
}
