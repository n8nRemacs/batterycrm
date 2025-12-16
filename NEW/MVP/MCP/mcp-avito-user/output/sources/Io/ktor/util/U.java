package io.ktor.util;

import java.security.MessageDigest;
import kotlin.Metadata;

/* compiled from: CryptoJvm.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0083@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Lio/ktor/util/U;", "Lio/ktor/util/T;", "delegate", "Ljava/security/MessageDigest;", "ktor-utils"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
final class U implements T {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final MessageDigest f400423a;

    public final boolean equals(Object obj) {
        if (obj instanceof U) {
            return kotlin.jvm.internal.L.f(this.f400423a, ((U) obj).f400423a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f400423a.hashCode();
    }

    public final String toString() {
        return "DigestImpl(delegate=" + this.f400423a + ')';
    }
}
