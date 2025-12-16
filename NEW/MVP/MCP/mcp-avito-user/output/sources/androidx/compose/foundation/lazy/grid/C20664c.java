package androidx.compose.foundation.lazy.grid;

import kotlin.Metadata;

/* compiled from: LazyGridSpan.kt */
@X41.g
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001\u0088\u0001\u0002\u0092\u0001\u00020\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/lazy/grid/c;", "", "packedValue", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.lazy.grid.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C20664c {

    /* renamed from: a, reason: collision with root package name */
    public final long f29104a;

    private /* synthetic */ C20664c(long j12) {
        this.f29104a = j12;
    }

    public static final /* synthetic */ C20664c a(long j12) {
        return new C20664c(j12);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C20664c) {
            return this.f29104a == ((C20664c) obj).f29104a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f29104a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.u(new StringBuilder("GridItemSpan(packedValue="), this.f29104a, ')');
    }
}
