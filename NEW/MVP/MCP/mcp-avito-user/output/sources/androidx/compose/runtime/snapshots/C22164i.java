package androidx.compose.runtime.snapshots;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: StateObjectImpl.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0081@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/runtime/snapshots/i;", "", "a", "mask", "", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.runtime.snapshots.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22164i {

    /* renamed from: b, reason: collision with root package name */
    public static final /* synthetic */ int f38715b = 0;

    /* renamed from: a, reason: collision with root package name */
    public final int f38716a;

    /* compiled from: StateObjectImpl.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0080\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/runtime/snapshots/i$a;", "", "<init>", "()V", "runtime_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.runtime.snapshots.i$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    static {
        new a(null);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22164i) {
            return this.f38716a == ((C22164i) obj).f38716a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f38716a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("ReaderKind(mask="), this.f38716a, ')');
    }
}
