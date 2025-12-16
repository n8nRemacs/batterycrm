package androidx.window.embedding;

import androidx.window.embedding.W;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SplitPairRule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/embedding/U;", "Landroidx/window/embedding/W;", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class U extends W {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Set<T> f55225j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final W.d f55226k;

    /* renamed from: l, reason: collision with root package name */
    @Y61.k
    public final W.d f55227l;

    /* renamed from: m, reason: collision with root package name */
    public final boolean f55228m;

    /* compiled from: SplitPairRule.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/U$a;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    public U() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public U(Set set, N n12, String str, W.d dVar, W.d dVar2, boolean z12, int i12, int i13, int i14, C23525k c23525k, C23525k c23525k2, int i15, C42822w c42822w) {
        str = (i15 & 4) != 0 ? null : str;
        W.d dVar3 = (i15 & 8) != 0 ? W.d.f55241b : dVar;
        W.d dVar4 = (i15 & 16) != 0 ? W.d.f55242c : dVar2;
        boolean z13 = (i15 & 32) != 0 ? false : z12;
        super(str, (i15 & 64) != 0 ? 600 : i12, (i15 & 128) != 0 ? 600 : i13, (i15 & 256) != 0 ? 600 : i14, (i15 & 512) != 0 ? W.f55233h : c23525k, (i15 & 1024) != 0 ? W.f55234i : c23525k2, n12);
        this.f55225j = set;
        this.f55226k = dVar3;
        this.f55227l = dVar4;
        this.f55228m = z13;
    }

    @Override // androidx.window.embedding.W, androidx.window.embedding.AbstractC23532s
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof U) || !super.equals(obj)) {
            return false;
        }
        U u12 = (U) obj;
        return kotlin.jvm.internal.L.f(this.f55225j, u12.f55225j) && kotlin.jvm.internal.L.f(this.f55226k, u12.f55226k) && kotlin.jvm.internal.L.f(this.f55227l, u12.f55227l) && this.f55228m == u12.f55228m;
    }

    @Override // androidx.window.embedding.W, androidx.window.embedding.AbstractC23532s
    public final int hashCode() {
        return Boolean.hashCode(this.f55228m) + ((this.f55227l.hashCode() + ((this.f55226k.hashCode() + androidx.media3.exoplayer.analytics.m.g(this.f55225j, super.hashCode() * 31, 31)) * 31)) * 31);
    }

    @Override // androidx.window.embedding.W
    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder();
        androidx.appcompat.app.r.C(U.class, sb2, "{tag=");
        sb2.append(this.f55251a);
        sb2.append(", defaultSplitAttributes=");
        sb2.append(this.f55240g);
        sb2.append(", minWidthDp=");
        sb2.append(this.f55235b);
        sb2.append(", minHeightDp=");
        sb2.append(this.f55236c);
        sb2.append(", minSmallestWidthDp=");
        sb2.append(this.f55237d);
        sb2.append(", maxAspectRatioInPortrait=");
        sb2.append(this.f55238e);
        sb2.append(", maxAspectRatioInLandscape=");
        sb2.append(this.f55239f);
        sb2.append(", clearTop=");
        sb2.append(this.f55228m);
        sb2.append(", finishPrimaryWithSecondary=");
        sb2.append(this.f55226k);
        sb2.append(", finishSecondaryWithPrimary=");
        sb2.append(this.f55227l);
        sb2.append(", filters=");
        return AK.c.u(sb2, this.f55225j, '}');
    }
}
