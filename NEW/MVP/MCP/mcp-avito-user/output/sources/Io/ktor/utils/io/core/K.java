package io.ktor.utils.io.core;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import kotlin.text.C43066x;

/* compiled from: PacketJVM.kt */
@s0
@Metadata(d1 = {"\u0000\b\n\u0002\u0018\u0002\n\u0002\b\u0002*\n\u0010\u0001\"\u00020\u00002\u00020\u0000¨\u0006\u0002"}, d2 = {"Ljava/io/EOFException;", "EOFException", "ktor-io"}, k = 2, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class K {

    /* renamed from: a, reason: collision with root package name */
    public static final int f400870a;

    static {
        String property;
        Integer numY0;
        try {
            property = System.getProperty("io.ktor.utils.io.".concat("max.copy.size"));
        } catch (SecurityException unused) {
            property = null;
        }
        f400870a = (property == null || (numY0 = C43066x.y0(property)) == null) ? 500 : numY0.intValue();
    }
}
