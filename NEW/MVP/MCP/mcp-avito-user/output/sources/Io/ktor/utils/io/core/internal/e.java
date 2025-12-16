package io.ktor.utils.io.core.internal;

import androidx.appcompat.app.r;
import kotlin.Metadata;
import kotlin.jvm.internal.s0;

/* compiled from: EncodeResult.kt */
@X41.g
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003ø\u0001\u0000\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0004"}, d2 = {"Lio/ktor/utils/io/core/internal/e;", "", "value", "", "ktor-io"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f400889a;

    public final boolean equals(Object obj) {
        if (obj instanceof e) {
            return this.f400889a == ((e) obj).f400889a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f400889a);
    }

    public final String toString() {
        return r.t(new StringBuilder("EncodeResult(value="), this.f400889a, ')');
    }
}
