package androidx.compose.ui.text.style;

import androidx.compose.ui.graphics.J;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;
import kotlin.w0;
import y0.C50028a;

/* compiled from: TextForegroundStyle.kt */
@s0
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0082\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Landroidx/compose/ui/text/style/d;", "Landroidx/compose/ui/text/style/m;", "Landroidx/compose/ui/graphics/T;", "value", "<init>", "(JLkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final /* data */ class d implements m {

    /* renamed from: b, reason: collision with root package name */
    public final long f42633b;

    public d(long j12, C42822w c42822w) {
        this.f42633b = j12;
        if (j12 != 16) {
            return;
        }
        C50028a.a("ColorStyle value must be specified, use TextForegroundStyle.Unspecified instead.");
    }

    @Override // androidx.compose.ui.text.style.m
    /* renamed from: a, reason: from getter */
    public final long getF42633b() {
        return this.f42633b;
    }

    @Override // androidx.compose.ui.text.style.m
    @Y61.l
    public final J c() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof d) && T.d(this.f42633b, ((d) obj).f42633b);
    }

    @Override // androidx.compose.ui.text.style.m
    /* renamed from: getAlpha */
    public final float getF42632c() {
        return T.e(this.f42633b);
    }

    public final int hashCode() {
        T.a aVar = T.f39320b;
        int i12 = w0.f410662c;
        return Long.hashCode(this.f42633b);
    }

    @Y61.k
    public final String toString() {
        return "ColorStyle(value=" + ((Object) T.j(this.f42633b)) + ')';
    }
}
