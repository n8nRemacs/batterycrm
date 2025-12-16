package androidx.compose.material;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Scaffold.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material/F4;", "", "a", "value", "", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class F4 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f32621b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f32622c = 1;

    /* renamed from: d, reason: collision with root package name */
    public static final int f32623d = 2;

    /* renamed from: a, reason: collision with root package name */
    public final int f32624a;

    /* compiled from: Scaffold.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material/F4$a;", "", "<init>", "()V", "material_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    public static final boolean a(int i12, int i13) {
        return i12 == i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof F4) {
            return this.f32624a == ((F4) obj).f32624a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f32624a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f32624a;
        return a(i12, 0) ? "FabPosition.Start" : a(i12, f32622c) ? "FabPosition.Center" : "FabPosition.End";
    }
}
