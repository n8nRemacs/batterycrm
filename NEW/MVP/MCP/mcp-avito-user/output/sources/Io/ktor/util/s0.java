package io.ktor.util;

import kotlin.Metadata;

/* compiled from: PlatformUtils.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\bÆ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lio/ktor/util/s0;", "", "<init>", "()V", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class s0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public static final s0 f400547a = new s0();

    /* renamed from: b, reason: collision with root package name */
    public static final boolean f400548b;

    static {
        String property = System.getProperty("io.ktor.development");
        boolean z12 = false;
        if (property != null && Boolean.parseBoolean(property)) {
            z12 = true;
        }
        f400548b = z12;
    }
}
