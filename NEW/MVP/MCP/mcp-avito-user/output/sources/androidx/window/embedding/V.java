package androidx.window.embedding;

import android.content.Intent;
import androidx.window.embedding.W;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C42745f0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: SplitPlaceholderRule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/embedding/V;", "Landroidx/window/embedding/W;", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class V extends W {

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final Set<C23516b> f55229j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final Intent f55230k;

    /* renamed from: l, reason: collision with root package name */
    public final boolean f55231l;

    /* renamed from: m, reason: collision with root package name */
    @Y61.k
    public final W.d f55232m;

    /* compiled from: SplitPlaceholderRule.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/V$a;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    public static final class a {
    }

    public V() {
        throw null;
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public V(String str, Set set, Intent intent, boolean z12, W.d dVar, int i12, int i13, int i14, C23525k c23525k, C23525k c23525k2, N n12, int i15, C42822w c42822w) {
        String str2 = (i15 & 1) != 0 ? null : str;
        W.d dVar2 = (i15 & 16) != 0 ? W.d.f55242c : dVar;
        super(str2, (i15 & 32) != 0 ? 600 : i12, (i15 & 64) != 0 ? 600 : i13, (i15 & 128) != 0 ? 600 : i14, (i15 & 256) != 0 ? W.f55233h : c23525k, (i15 & 512) != 0 ? W.f55234i : c23525k2, n12);
        if (dVar2.equals(W.d.f55241b)) {
            throw new IllegalArgumentException("NEVER is not a valid configuration for SplitPlaceholderRule. Please use FINISH_ALWAYS or FINISH_ADJACENT instead or refer to the current API.");
        }
        this.f55229j = C42745f0.P0(set);
        this.f55230k = intent;
        this.f55231l = z12;
        this.f55232m = dVar2;
    }

    @Override // androidx.window.embedding.W, androidx.window.embedding.AbstractC23532s
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof V) || !super.equals(obj)) {
            return false;
        }
        V v12 = (V) obj;
        return kotlin.jvm.internal.L.f(this.f55230k, v12.f55230k) && this.f55231l == v12.f55231l && kotlin.jvm.internal.L.f(this.f55232m, v12.f55232m) && kotlin.jvm.internal.L.f(this.f55229j, v12.f55229j);
    }

    @Override // androidx.window.embedding.W, androidx.window.embedding.AbstractC23532s
    public final int hashCode() {
        return this.f55229j.hashCode() + ((this.f55232m.hashCode() + androidx.appcompat.app.r.i((this.f55230k.hashCode() + (super.hashCode() * 31)) * 31, 31, this.f55231l)) * 31);
    }

    @Override // androidx.window.embedding.W
    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SplitPlaceholderRule{tag=");
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
        sb2.append(", placeholderIntent=");
        sb2.append(this.f55230k);
        sb2.append(", isSticky=");
        sb2.append(this.f55231l);
        sb2.append(", finishPrimaryWithPlaceholder=");
        sb2.append(this.f55232m);
        sb2.append(", filters=");
        return AK.c.u(sb2, this.f55229j, '}');
    }
}
