package androidx.compose.material3;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: DatePicker.kt */
@InterfaceC21537e7
@androidx.compose.runtime.H0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/material3/D6;", "", "a", "value", "", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
@X41.g
/* loaded from: classes.dex */
public final class D6 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f34620b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final int f34621c = 1;

    /* renamed from: a, reason: collision with root package name */
    public final int f34622a;

    /* compiled from: DatePicker.kt */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/compose/material3/D6$a;", "", "<init>", "()V", "material3_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public a() {
        }
    }

    private /* synthetic */ D6(int i12) {
        this.f34622a = i12;
    }

    public static final /* synthetic */ D6 a(int i12) {
        return new D6(i12);
    }

    public static final boolean b(int i12, int i13) {
        return i12 == i13;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof D6) {
            return this.f34622a == ((D6) obj).f34622a;
        }
        return false;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f34622a);
    }

    @Y61.k
    public final String toString() {
        int i12 = this.f34622a;
        return b(i12, 0) ? "Picker" : b(i12, f34621c) ? "Input" : "Unknown";
    }
}
