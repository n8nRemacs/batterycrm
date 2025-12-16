package androidx.compose.ui.text.font;

import kotlin.Metadata;

/* compiled from: AndroidFontResolveInterceptor.android.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/font/i;", "Landroidx/compose/ui/text/font/n0;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.font.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* data */ class C22615i implements n0 {

    /* renamed from: b, reason: collision with root package name */
    public final int f42264b;

    public C22615i(int i12) {
        this.f42264b = i12;
    }

    @Override // androidx.compose.ui.text.font.n0
    @Y61.k
    public final e0 a(@Y61.k e0 e0Var) {
        int i12 = this.f42264b;
        return (i12 == 0 || i12 == Integer.MAX_VALUE) ? e0Var : new e0(kotlin.ranges.s.g(e0Var.f42253b + i12, 1, 1000));
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C22615i) && this.f42264b == ((C22615i) obj).f42264b;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f42264b);
    }

    @Y61.k
    public final String toString() {
        return androidx.appcompat.app.r.t(new StringBuilder("AndroidFontResolveInterceptor(fontWeightAdjustment="), this.f42264b, ')');
    }
}
