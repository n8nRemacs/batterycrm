package androidx.compose.foundation.text;

import kotlin.Metadata;

/* compiled from: ValidatingOffsetMapping.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0002\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/l3;", "Landroidx/compose/ui/text/input/L;", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
final class l3 implements androidx.compose.ui.text.input.L {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.input.L f31569b;

    /* renamed from: c, reason: collision with root package name */
    public final int f31570c;

    /* renamed from: d, reason: collision with root package name */
    public final int f31571d;

    public l3(@Y61.k androidx.compose.ui.text.input.L l12, int i12, int i13) {
        this.f31569b = l12;
        this.f31570c = i12;
        this.f31571d = i13;
    }

    @Override // androidx.compose.ui.text.input.L
    public final int a(int i12) {
        int iA2 = this.f31569b.a(i12);
        if (i12 >= 0 && i12 <= this.f31571d) {
            m3.c(iA2, this.f31570c, i12);
        }
        return iA2;
    }

    @Override // androidx.compose.ui.text.input.L
    public final int b(int i12) {
        int iB2 = this.f31569b.b(i12);
        if (i12 >= 0 && i12 <= this.f31570c) {
            m3.b(iB2, this.f31571d, i12);
        }
        return iB2;
    }
}
