package androidx.compose.foundation.text.selection;

import androidx.compose.foundation.text.selection.C21045x;
import kotlin.Metadata;

/* compiled from: SelectionLayout.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/foundation/text/selection/w;", "", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.text.selection.w, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C21043w {

    /* renamed from: a, reason: collision with root package name */
    public final long f32149a;

    /* renamed from: b, reason: collision with root package name */
    public final int f32150b;

    /* renamed from: c, reason: collision with root package name */
    public final int f32151c;

    /* renamed from: d, reason: collision with root package name */
    public final int f32152d;

    /* renamed from: e, reason: collision with root package name */
    public final int f32153e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.text.o0 f32154f;

    public C21043w(long j12, int i12, int i13, int i14, int i15, @Y61.k androidx.compose.ui.text.o0 o0Var) {
        this.f32149a = j12;
        this.f32150b = i12;
        this.f32151c = i13;
        this.f32152d = i14;
        this.f32153e = i15;
        this.f32154f = o0Var;
    }

    @Y61.k
    public final C21045x.a a(int i12) {
        return new C21045x.a(C21027n0.a(this.f32154f, i12), i12, this.f32149a);
    }

    @Y61.k
    public final CrossStatus b() {
        int i12 = this.f32151c;
        int i13 = this.f32152d;
        return i12 < i13 ? CrossStatus.f31830c : i12 > i13 ? CrossStatus.f31829b : CrossStatus.f31831d;
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SelectionInfo(id=");
        sb2.append(this.f32149a);
        sb2.append(", range=(");
        int i12 = this.f32151c;
        sb2.append(i12);
        sb2.append('-');
        androidx.compose.ui.text.o0 o0Var = this.f32154f;
        sb2.append(C21027n0.a(o0Var, i12));
        sb2.append(',');
        int i13 = this.f32152d;
        sb2.append(i13);
        sb2.append('-');
        sb2.append(C21027n0.a(o0Var, i13));
        sb2.append("), prevOffset=");
        return androidx.appcompat.app.r.t(sb2, this.f32153e, ')');
    }
}
