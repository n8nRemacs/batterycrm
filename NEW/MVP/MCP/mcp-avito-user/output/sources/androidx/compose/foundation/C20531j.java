package androidx.compose.foundation;

import android.content.Context;
import androidx.compose.ui.graphics.T;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;

/* compiled from: AndroidOverscroll.android.kt */
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0002\u0018\u00002\u00020\u0001B+\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Landroidx/compose/foundation/j;", "Landroidx/compose/foundation/N1;", "Landroid/content/Context;", "context", "Landroidx/compose/ui/unit/d;", "density", "Landroidx/compose/ui/graphics/T;", "glowColor", "Landroidx/compose/foundation/layout/T1;", "glowDrawPadding", "<init>", "(Landroid/content/Context;Landroidx/compose/ui/unit/d;JLandroidx/compose/foundation/layout/T1;Lkotlin/jvm/internal/w;)V", "foundation_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: androidx.compose.foundation.j, reason: case insensitive filesystem */
/* loaded from: classes.dex */
final class C20531j implements N1 {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final Context f28173a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.ui.unit.d f28174b;

    /* renamed from: c, reason: collision with root package name */
    public final long f28175c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final androidx.compose.foundation.layout.T1 f28176d;

    public /* synthetic */ C20531j(Context context, androidx.compose.ui.unit.d dVar, long j12, androidx.compose.foundation.layout.T1 t12, int i12, C42822w c42822w) {
        this(context, dVar, (i12 & 4) != 0 ? C21088x.f32296a : j12, (i12 & 8) != 0 ? C21088x.f32297b : t12, null);
    }

    @Override // androidx.compose.foundation.N1
    @Y61.k
    public final C20525h a() {
        return new C20525h(this.f28173a, this.f28174b, this.f28175c, this.f28176d, null);
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C20531j.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        C20531j c20531j = (C20531j) obj;
        return kotlin.jvm.internal.L.f(this.f28173a, c20531j.f28173a) && kotlin.jvm.internal.L.f(this.f28174b, c20531j.f28174b) && androidx.compose.ui.graphics.T.d(this.f28175c, c20531j.f28175c) && kotlin.jvm.internal.L.f(this.f28176d, c20531j.f28176d);
    }

    public final int hashCode() {
        int iHashCode = (this.f28174b.hashCode() + (this.f28173a.hashCode() * 31)) * 31;
        T.a aVar = androidx.compose.ui.graphics.T.f39320b;
        int i12 = kotlin.w0.f410662c;
        return this.f28176d.hashCode() + androidx.appcompat.app.r.g(iHashCode, 31, this.f28175c);
    }

    public C20531j(Context context, androidx.compose.ui.unit.d dVar, long j12, androidx.compose.foundation.layout.T1 t12, C42822w c42822w) {
        this.f28173a = context;
        this.f28174b = dVar;
        this.f28175c = j12;
        this.f28176d = t12;
    }
}
