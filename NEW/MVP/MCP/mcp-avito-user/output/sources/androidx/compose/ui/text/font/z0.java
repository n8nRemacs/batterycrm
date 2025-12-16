package androidx.compose.ui.text.font;

import androidx.compose.ui.text.font.C22605a0;
import androidx.compose.ui.text.font.Z;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: FontFamilyResolver.kt */
@androidx.compose.runtime.internal.P
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0080\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0001¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Landroidx/compose/ui/text/font/z0;", "", "Landroidx/compose/ui/text/font/E;", "fontFamily", "Landroidx/compose/ui/text/font/e0;", "fontWeight", "Landroidx/compose/ui/text/font/Z;", "fontStyle", "Landroidx/compose/ui/text/font/a0;", "fontSynthesis", "resourceLoaderCacheKey", "<init>", "(Landroidx/compose/ui/text/font/E;Landroidx/compose/ui/text/font/e0;IILjava/lang/Object;Lkotlin/jvm/internal/w;)V", "ui-text_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes.dex */
public final /* data */ class z0 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final E f42328a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final e0 f42329b;

    /* renamed from: c, reason: collision with root package name */
    public final int f42330c;

    /* renamed from: d, reason: collision with root package name */
    public final int f42331d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Object f42332e;

    public z0(E e12, e0 e0Var, int i12, int i13, Object obj, C42822w c42822w) {
        this.f42328a = e12;
        this.f42329b = e0Var;
        this.f42330c = i12;
        this.f42331d = i13;
        this.f42332e = obj;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof z0)) {
            return false;
        }
        z0 z0Var = (z0) obj;
        return kotlin.jvm.internal.L.f(this.f42328a, z0Var.f42328a) && kotlin.jvm.internal.L.f(this.f42329b, z0Var.f42329b) && Z.b(this.f42330c, z0Var.f42330c) && C22605a0.b(this.f42331d, z0Var.f42331d) && kotlin.jvm.internal.L.f(this.f42332e, z0Var.f42332e);
    }

    public final int hashCode() {
        E e12 = this.f42328a;
        int iHashCode = (((e12 == null ? 0 : e12.hashCode()) * 31) + this.f42329b.f42253b) * 31;
        Z.a aVar = Z.f42217b;
        int iE2 = androidx.appcompat.app.r.e(this.f42330c, iHashCode, 31);
        C22605a0.a aVar2 = C22605a0.f42223b;
        int iE3 = androidx.appcompat.app.r.e(this.f42331d, iE2, 31);
        Object obj = this.f42332e;
        return iE3 + (obj != null ? obj.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("TypefaceRequest(fontFamily=");
        sb2.append(this.f42328a);
        sb2.append(", fontWeight=");
        sb2.append(this.f42329b);
        sb2.append(", fontStyle=");
        sb2.append((Object) Z.c(this.f42330c));
        sb2.append(", fontSynthesis=");
        sb2.append((Object) C22605a0.c(this.f42331d));
        sb2.append(", resourceLoaderCacheKey=");
        return androidx.compose.foundation.H.n(sb2, this.f42332e, ')');
    }
}
