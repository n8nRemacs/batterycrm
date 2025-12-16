package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C22602e;
import kotlin.Metadata;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/U;", "Landroidx/compose/ui/text/input/k;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class U implements InterfaceC22645k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22602e f42377a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42378b;

    public U(@Y61.k String str, int i12) {
        this.f42377a = new C22602e(str, null, 2, null);
        this.f42378b = i12;
    }

    @Override // androidx.compose.ui.text.input.InterfaceC22645k
    public final void a(@Y61.k C22649o c22649o) {
        boolean zE2 = c22649o.e();
        C22602e c22602e = this.f42377a;
        if (zE2) {
            int i12 = c22649o.f42461d;
            c22649o.f(i12, c22649o.f42462e, c22602e.f42127c);
            if (c22602e.f42127c.length() > 0) {
                c22649o.g(i12, c22602e.f42127c.length() + i12);
            }
        } else {
            int i13 = c22649o.f42459b;
            c22649o.f(i13, c22649o.f42460c, c22602e.f42127c);
            if (c22602e.f42127c.length() > 0) {
                c22649o.g(i13, c22602e.f42127c.length() + i13);
            }
        }
        int iD2 = c22649o.d();
        int i14 = this.f42378b;
        int iG2 = kotlin.ranges.s.g(i14 > 0 ? (iD2 + i14) - 1 : (iD2 + i14) - c22602e.f42127c.length(), 0, c22649o.f42458a.a());
        c22649o.h(iG2, iG2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U)) {
            return false;
        }
        U u12 = (U) obj;
        return kotlin.jvm.internal.L.f(this.f42377a.f42127c, u12.f42377a.f42127c) && this.f42378b == u12.f42378b;
    }

    public final int hashCode() {
        return (this.f42377a.f42127c.hashCode() * 31) + this.f42378b;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SetComposingTextCommand(text='");
        sb2.append(this.f42377a.f42127c);
        sb2.append("', newCursorPosition=");
        return androidx.appcompat.app.r.t(sb2, this.f42378b, ')');
    }
}
