package androidx.compose.ui.text.input;

import kotlin.Metadata;
import kotlin.jvm.internal.s0;
import y0.C50028a;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.P
@s0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/j;", "Landroidx/compose/ui/text/input/k;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.input.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22644j implements InterfaceC22645k {

    /* renamed from: a, reason: collision with root package name */
    public final int f42447a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42448b;

    public C22644j(int i12, int i13) {
        this.f42447a = i12;
        this.f42448b = i13;
        if (i12 >= 0 && i13 >= 0) {
            return;
        }
        C50028a.a("Expected lengthBeforeCursor and lengthAfterCursor to be non-negative, were " + i12 + " and " + i13 + " respectively.");
    }

    @Override // androidx.compose.ui.text.input.InterfaceC22645k
    public final void a(@Y61.k C22649o c22649o) {
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        while (true) {
            if (i13 < this.f42447a) {
                int i15 = i14 + 1;
                int i16 = c22649o.f42459b;
                if (i16 <= i15) {
                    i14 = i16;
                    break;
                } else {
                    i14 = (Character.isHighSurrogate(c22649o.b((i16 - i15) + (-1))) && Character.isLowSurrogate(c22649o.b(c22649o.f42459b - i15))) ? i14 + 2 : i15;
                    i13++;
                }
            } else {
                break;
            }
        }
        int iA2 = 0;
        while (true) {
            if (i12 >= this.f42448b) {
                break;
            }
            int i17 = iA2 + 1;
            int i18 = c22649o.f42460c + i17;
            M m12 = c22649o.f42458a;
            if (i18 >= m12.a()) {
                iA2 = m12.a() - c22649o.f42460c;
                break;
            } else {
                iA2 = (Character.isHighSurrogate(c22649o.b((c22649o.f42460c + i17) + (-1))) && Character.isLowSurrogate(c22649o.b(c22649o.f42460c + i17))) ? iA2 + 2 : i17;
                i12++;
            }
        }
        int i19 = c22649o.f42460c;
        c22649o.a(i19, iA2 + i19);
        int i22 = c22649o.f42459b;
        c22649o.a(i22 - i14, i22);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22644j)) {
            return false;
        }
        C22644j c22644j = (C22644j) obj;
        return this.f42447a == c22644j.f42447a && this.f42448b == c22644j.f42448b;
    }

    public final int hashCode() {
        return (this.f42447a * 31) + this.f42448b;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DeleteSurroundingTextInCodePointsCommand(lengthBeforeCursor=");
        sb2.append(this.f42447a);
        sb2.append(", lengthAfterCursor=");
        return androidx.appcompat.app.r.t(sb2, this.f42448b, ')');
    }
}
