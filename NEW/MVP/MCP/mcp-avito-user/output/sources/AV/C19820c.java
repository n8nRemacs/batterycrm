package aV;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.docking_badge.DockingBadgeEdgeType;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DockingBadgeState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LaV/c;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: aV.c, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C19820c {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final CharSequence f20904a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final DockingBadgeEdgeType f20905b;

    /* renamed from: c, reason: collision with root package name */
    @l
    public final DockingBadgeEdgeType f20906c;

    public C19820c() {
        this(null, null, null, 7, null);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19820c)) {
            return false;
        }
        C19820c c19820c = (C19820c) obj;
        return L.f(this.f20904a, c19820c.f20904a) && this.f20905b == c19820c.f20905b && this.f20906c == c19820c.f20906c;
    }

    public final int hashCode() {
        int iHashCode = this.f20904a.hashCode() * 31;
        DockingBadgeEdgeType dockingBadgeEdgeType = this.f20905b;
        int iHashCode2 = (iHashCode + (dockingBadgeEdgeType == null ? 0 : dockingBadgeEdgeType.hashCode())) * 31;
        DockingBadgeEdgeType dockingBadgeEdgeType2 = this.f20906c;
        return iHashCode2 + (dockingBadgeEdgeType2 != null ? dockingBadgeEdgeType2.hashCode() : 0);
    }

    @k
    public final String toString() {
        return "DockingBadgeState(text=" + ((Object) this.f20904a) + ", endEdge=" + this.f20905b + ", startEdge=" + this.f20906c + ')';
    }

    public C19820c(@k CharSequence charSequence, @l DockingBadgeEdgeType dockingBadgeEdgeType, @l DockingBadgeEdgeType dockingBadgeEdgeType2) {
        this.f20904a = charSequence;
        this.f20905b = dockingBadgeEdgeType;
        this.f20906c = dockingBadgeEdgeType2;
    }

    public /* synthetic */ C19820c(String str, DockingBadgeEdgeType dockingBadgeEdgeType, DockingBadgeEdgeType dockingBadgeEdgeType2, int i12, C42822w c42822w) {
        this((i12 & 1) != 0 ? "" : str, (i12 & 2) != 0 ? null : dockingBadgeEdgeType, (i12 & 4) != 0 ? null : dockingBadgeEdgeType2);
    }
}
