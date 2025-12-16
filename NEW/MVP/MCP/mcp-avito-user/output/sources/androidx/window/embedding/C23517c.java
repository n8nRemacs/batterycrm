package androidx.window.embedding;

import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.s0;

/* compiled from: ActivityRule.kt */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\u00020\u0001:\u0001\u0002¨\u0006\u0003"}, d2 = {"Landroidx/window/embedding/c;", "Landroidx/window/embedding/s;", "a", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* renamed from: androidx.window.embedding.c, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C23517c extends AbstractC23532s {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final Set<C23516b> f55244b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f55245c;

    /* compiled from: ActivityRule.kt */
    @s0
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Landroidx/window/embedding/c$a;", "", "window_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
    /* renamed from: androidx.window.embedding.c$a */
    public static final class a {
    }

    public C23517c() {
        throw null;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C23517c(String str, Set set, boolean z12, int i12, C42822w c42822w) {
        super(str);
        z12 = (i12 & 4) != 0 ? false : z12;
        this.f55244b = set;
        this.f55245c = z12;
    }

    @Override // androidx.window.embedding.AbstractC23532s
    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C23517c) || !super.equals(obj)) {
            return false;
        }
        C23517c c23517c = (C23517c) obj;
        return kotlin.jvm.internal.L.f(this.f55244b, c23517c.f55244b) && this.f55245c == c23517c.f55245c;
    }

    @Override // androidx.window.embedding.AbstractC23532s
    public final int hashCode() {
        return Boolean.hashCode(this.f55245c) + androidx.media3.exoplayer.analytics.m.g(this.f55244b, super.hashCode() * 31, 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("ActivityRule:{tag={");
        sb2.append(this.f55251a);
        sb2.append("},filters={");
        sb2.append(this.f55244b);
        sb2.append("}, alwaysExpand={");
        return androidx.appcompat.app.r.s("}}", sb2, this.f55245c);
    }
}
