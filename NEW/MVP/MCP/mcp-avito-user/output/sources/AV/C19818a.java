package aV;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import com.avito.android.lib.design.docking_badge.DockingBadgeItem;
import j.U;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C42784z0;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: DockingBadgeContainerState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"LaV/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* renamed from: aV.a, reason: case insensitive filesystem */
/* loaded from: classes14.dex */
public final /* data */ class C19818a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<DockingBadgeItem> f20901a;

    /* renamed from: b, reason: collision with root package name */
    public final int f20902b;

    /* renamed from: c, reason: collision with root package name */
    public final int f20903c;

    public C19818a() {
        this(null, 0, 0, 7, null);
    }

    public static C19818a a(C19818a c19818a, List list, int i12, int i13) {
        if ((i13 & 1) != 0) {
            list = c19818a.f20901a;
        }
        if ((i13 & 2) != 0) {
            i12 = c19818a.f20902b;
        }
        int i14 = c19818a.f20903c;
        c19818a.getClass();
        return new C19818a(i12, i14, list);
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C19818a)) {
            return false;
        }
        C19818a c19818a = (C19818a) obj;
        return L.f(this.f20901a, c19818a.f20901a) && this.f20902b == c19818a.f20902b && this.f20903c == c19818a.f20903c;
    }

    public final int hashCode() {
        return Integer.hashCode(this.f20903c) + r.e(this.f20902b, this.f20901a.hashCode() * 31, 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("DockingBadgeContainerState(badges=");
        sb2.append(this.f20901a);
        sb2.append(", verticalSpacing=");
        sb2.append(this.f20902b);
        sb2.append(", numberOfLines=");
        return r.t(sb2, this.f20903c, ')');
    }

    public C19818a(@U int i12, int i13, @k List list) {
        this.f20901a = list;
        this.f20902b = i12;
        this.f20903c = i13;
    }

    public C19818a(List list, int i12, int i13, int i14, C42822w c42822w) {
        this((i14 & 2) != 0 ? 0 : i12, (i14 & 4) != 0 ? -1 : i13, (i14 & 1) != 0 ? C42784z0.f406748b : list);
    }
}
