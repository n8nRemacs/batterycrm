package androidx.compose.ui.text;

import androidx.compose.runtime.H0;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: TextLinkStyles.kt */
@H0
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0007\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/compose/ui/text/p0;", "", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final class p0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final e0 f42538a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final e0 f42539b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.l
    public final e0 f42540c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.l
    public final e0 f42541d;

    public p0() {
        this(null, null, null, null, 15, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || !(obj instanceof p0)) {
            return false;
        }
        p0 p0Var = (p0) obj;
        return kotlin.jvm.internal.L.f(this.f42538a, p0Var.f42538a) && kotlin.jvm.internal.L.f(this.f42539b, p0Var.f42539b) && kotlin.jvm.internal.L.f(this.f42540c, p0Var.f42540c) && kotlin.jvm.internal.L.f(this.f42541d, p0Var.f42541d);
    }

    public final int hashCode() {
        e0 e0Var = this.f42538a;
        int iHashCode = (e0Var != null ? e0Var.hashCode() : 0) * 31;
        e0 e0Var2 = this.f42539b;
        int iHashCode2 = (iHashCode + (e0Var2 != null ? e0Var2.hashCode() : 0)) * 31;
        e0 e0Var3 = this.f42540c;
        int iHashCode3 = (iHashCode2 + (e0Var3 != null ? e0Var3.hashCode() : 0)) * 31;
        e0 e0Var4 = this.f42541d;
        return iHashCode3 + (e0Var4 != null ? e0Var4.hashCode() : 0);
    }

    public p0(@Y61.l e0 e0Var, @Y61.l e0 e0Var2, @Y61.l e0 e0Var3, @Y61.l e0 e0Var4) {
        this.f42538a = e0Var;
        this.f42539b = e0Var2;
        this.f42540c = e0Var3;
        this.f42541d = e0Var4;
    }

    public /* synthetic */ p0(e0 e0Var, e0 e0Var2, e0 e0Var3, e0 e0Var4, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? null : e0Var, (i12 & 2) != 0 ? null : e0Var2, (i12 & 4) != 0 ? null : e0Var3, (i12 & 8) != 0 ? null : e0Var4);
    }
}
