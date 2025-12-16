package androidx.compose.foundation;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: BasicMarquee.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/foundation/z1;", "", "a", "value", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.z1, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21096z1 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f32326b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f32327c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f32328a;

    /* compiled from: BasicMarquee.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/foundation/z1$a;", "", "<init>", "()V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.foundation.z1$a */
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ C21096z1(int i12) {
        this.f32328a = i12;
    }

    public static final /* synthetic */ C21096z1 a(int i12) {
        return new C21096z1(i12);
    }

    @Y61.k
    public static String b(int i12) {
        if (i12 == 0) {
            return "Immediately";
        }
        if (i12 == f32327c) {
            return "WhileFocused";
        }
        throw new IllegalStateException(("invalid value: " + i12).toString());
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C21096z1) {
            return this.f32328a == ((C21096z1) obj).f32328a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32328a);
    }

    @Y61.k
    public final String toString() {
        return b(this.f32328a);
    }
}
