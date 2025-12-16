package androidx.compose.ui.text.input;

import androidx.compose.ui.text.C22602e;
import kotlin.Metadata;

/* compiled from: EditCommand.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/input/b;", "Landroidx/compose/ui/text/input/k;", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.ui.text.input.b, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C22636b implements InterfaceC22645k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final C22602e f42413a;

    /* renamed from: b, reason: collision with root package name */
    public final int f42414b;

    public C22636b(@Y61.k C22602e c22602e, int i12) {
        this.f42413a = c22602e;
        this.f42414b = i12;
    }

    @Override // androidx.compose.ui.text.input.InterfaceC22645k
    public final void a(@Y61.k C22649o c22649o) {
        boolean zE2 = c22649o.e();
        C22602e c22602e = this.f42413a;
        if (zE2) {
            c22649o.f(c22649o.f42461d, c22649o.f42462e, c22602e.f42127c);
        } else {
            c22649o.f(c22649o.f42459b, c22649o.f42460c, c22602e.f42127c);
        }
        int iD2 = c22649o.d();
        int i12 = this.f42414b;
        int iG2 = kotlin.ranges.s.g(i12 > 0 ? (iD2 + i12) - 1 : (iD2 + i12) - c22602e.f42127c.length(), 0, c22649o.f42458a.a());
        c22649o.h(iG2, iG2);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C22636b)) {
            return false;
        }
        C22636b c22636b = (C22636b) obj;
        return kotlin.jvm.internal.L.f(this.f42413a.f42127c, c22636b.f42413a.f42127c) && this.f42414b == c22636b.f42414b;
    }

    public final int hashCode() {
        return (this.f42413a.f42127c.hashCode() * 31) + this.f42414b;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommitTextCommand(text='");
        sb2.append(this.f42413a.f42127c);
        sb2.append("', newCursorPosition=");
        return androidx.appcompat.app.r.t(sb2, this.f42414b, ')');
    }

    public C22636b(@Y61.k String str, int i12) {
        this(new C22602e(str, null, 2, null), i12);
    }
}
