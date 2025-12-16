package androidx.compose.ui.text;

import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidTextStyle.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/Z;", "", "Landroidx/compose/ui/text/v;", "emojiSupportMatch", "<init>", "(ILkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class Z {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final X f41971a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final W f41972b;

    public Z(@Y61.l X x12, @Y61.l W w12) {
        this.f41971a = x12;
        this.f41972b = w12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Z)) {
            return false;
        }
        Z z12 = (Z) obj;
        return kotlin.jvm.internal.L.f(this.f41972b, z12.f41972b) && kotlin.jvm.internal.L.f(this.f41971a, z12.f41971a);
    }

    public final int hashCode() {
        X x12 = this.f41971a;
        int iHashCode = (x12 != null ? x12.hashCode() : 0) * 31;
        W w12 = this.f41972b;
        return iHashCode + (w12 != null ? w12.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        return "PlatformTextStyle(spanStyle=" + this.f41971a + ", paragraphSyle=" + this.f41972b + ')';
    }

    public /* synthetic */ Z(boolean z12, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? false : z12);
    }

    public Z(boolean z12) {
        this((X) null, new W(z12));
    }

    public Z(int i12, C42822w c42822w) {
        this((X) null, new W(i12, null));
    }
}
