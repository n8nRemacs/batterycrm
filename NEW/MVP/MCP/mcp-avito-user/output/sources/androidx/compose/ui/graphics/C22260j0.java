package androidx.compose.ui.graphics;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: Float16.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\b\u0002\n\u0002\u0010\n\n\u0000\b\u0081@\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0002\u0088\u0001\u0003\u0092\u0001\u00020\u0004¨\u0006\u0005"}, d2 = {"Landroidx/compose/ui/graphics/j0;", "", "a", "halfValue", "", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
@X41.g
/* renamed from: androidx.compose.ui.graphics.j0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22260j0 implements Comparable<C22260j0> {

    /* renamed from: b, reason: collision with root package name */
    public final short f39524b;

    /* compiled from: Float16.kt */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006R\u0014\u0010\b\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\b\u0010\u0006¨\u0006\t"}, d2 = {"Landroidx/compose/ui/graphics/j0$a;", "", "<init>", "()V", "", "MaxExponent", "I", "MinExponent", "Size", "ui-graphics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: androidx.compose.ui.graphics.j0$a */
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

    @Override // java.lang.Comparable
    public final int compareTo(C22260j0 c22260j0) {
        short s5 = c22260j0.f39524b;
        short s12 = this.f39524b;
        if ((s12 & Short.MAX_VALUE) > 31744) {
            return ((s5 & Short.MAX_VALUE) > 31744 ? 1 : 0) ^ 1;
        }
        if ((s5 & Short.MAX_VALUE) > 31744) {
            return -1;
        }
        return kotlin.jvm.internal.L.g((s12 & Short.MIN_VALUE) != 0 ? 32768 - (s12 & 65535) : s12 & 65535, (s5 & Short.MIN_VALUE) != 0 ? 32768 - (s5 & 65535) : s5 & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C22260j0) {
            return this.f39524b == ((C22260j0) obj).f39524b;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.f39524b);
    }

    @Y61.k
    public final String toString() {
        int i12;
        int i13;
        float fIntBitsToFloat;
        short s5 = this.f39524b;
        int i14 = Short.MIN_VALUE & s5;
        int i15 = ((65535 & s5) >>> 10) & 31;
        int i16 = s5 & 1023;
        if (i15 != 0) {
            i12 = i16 << 13;
            if (i15 == 31) {
                i13 = 255;
                if (i12 != 0) {
                    i12 |= 4194304;
                }
            } else {
                i13 = i15 + 112;
            }
        } else {
            if (i16 != 0) {
                fIntBitsToFloat = Float.intBitsToFloat(i16 + 1056964608) - C22262k0.f39546a;
                if (i14 != 0) {
                    fIntBitsToFloat = -fIntBitsToFloat;
                }
                return String.valueOf(fIntBitsToFloat);
            }
            i13 = 0;
            i12 = 0;
        }
        fIntBitsToFloat = Float.intBitsToFloat((i13 << 23) | (i14 << 16) | i12);
        return String.valueOf(fIntBitsToFloat);
    }
}
