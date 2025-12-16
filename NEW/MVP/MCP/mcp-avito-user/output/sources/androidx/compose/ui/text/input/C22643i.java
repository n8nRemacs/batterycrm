package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import y0.C50028a;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/i;", "Landroidx/compose/ui/text/input/k;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.input.i, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22643i implements InterfaceC22645k {

    /* renamed from: a, reason: collision with root package name */
    public final int f42443a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42444b;

    public C22643i(int i12, int i13) {
        this.f42443a = i12;
        this.f42444b = i13;
        if (i12 >= 0 && i13 >= 0) {
            return;
        }
        C50028a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i12 + " and " + i13 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.InterfaceC22645k
    public final void a(@Y61.k C22649o c22649o) {
        int i12 = c22649o.f42460c;
        int i13 = this.f42444b;
        int iA2 = i12 + i13;
        int i14 = (i12 ^ iA2) & (i13 ^ iA2);
        M m12 = c22649o.f42458a;
        if (i14 < 0) {
            iA2 = m12.a();
        }
        c22649o.a(c22649o.f42460c, Math.min(iA2, m12.a()));
        int i15 = c22649o.f42459b;
        int i16 = this.f42443a;
        int i17 = i15 - i16;
        if (((i15 ^ i17) & (i16 ^ i15)) < 0) {
            i17 = 0;
        }
        c22649o.a(Math.max(0, i17), c22649o.f42459b);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22643i)) {
            return false;
        }
        C22643i c22643i = (C22643i) obj;
        return this.f42443a == c22643i.f42443a && this.f42444b == c22643i.f42444b;
    }

    public final int hashCode() {
        return (this.f42443a * 31) + this.f42444b;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextCommand(lengthBeforeCursor=");
        sb2.append(this.f42443a);
        sb2.append(", lengthAfterCursor=");
        return androidx.appcompat.app.r.t(sb2, this.f42444b, ')');
    }
}
