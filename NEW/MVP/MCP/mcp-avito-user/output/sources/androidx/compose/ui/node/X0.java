package androidx.compose.ui.node;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TouchBoundsExpansion.kt */
@X41.g
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\b\u0087@\u0018\u00002\u00020\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/node/X0;", "", "a", "packedValue", "", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class X0 {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public static final a f40712b = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public static final long f40713c = a.b(0, 0, 0, 0, true);

    /* renamed from: a, reason: collision with root package name */
    public final long f40714a;

    /* compiled from: TouchBoundsExpansion.kt */
    @kotlin.jvm.internal.s0
    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\b\u0010\tR\u0014\u0010\n\u001a\u00020\u00078\u0000X\u0080T¢\u0006\u0006\n\u0004\b\n\u0010\tR\u0014\u0010\u000b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000b\u0010\t¨\u0006\f"}, d2 = {"Landroidx/compose/ui/node/X0$a;", "", "<init>", "()V", "", "IS_LAYOUT_DIRECTION_AWARE", "J", "", "MASK", "I", "MAX_VALUE", "SHIFT", "ui_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final class a {
        public /* synthetic */ a(C42822w c42822w) {
            this();
        }

        public static final int a(a aVar, long j12, int i12) {
            aVar.getClass();
            return ((int) (j12 >> (i12 * 15))) & 32767;
        }

        public static long b(int i12, int i13, int i14, int i15, boolean z12) {
            return ((i13 & 32767) << 15) | (i12 & 32767) | ((i14 & 32767) << 30) | ((i15 & 32767) << 45) | (z12 ? Long.MIN_VALUE : 0L);
        }

        public a() {
        }
    }

    public final boolean equals(Object obj) {
        if (obj instanceof X0) {
            return this.f40714a == ((X0) obj).f40714a;
        }
        return false;
    }

    public final int hashCode() {
        return Long.hashCode(this.f40714a);
    }

    public final String toString() {
        return androidx.appcompat.app.r.u(new StringBuilder("TouchBoundsExpansion(packedValue="), this.f40714a, ')');
    }
}
