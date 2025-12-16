package com.avito.beduin.v2.component.scrollable_containers.compose;

import androidx.appcompat.app.r;
import androidx.compose.runtime.H0;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.u;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: LazyScrollableStateLayoutInfo.kt */
@H0
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u000bB%\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\n¨\u0006\f"}, d2 = {"Lcom/avito/beduin/v2/component/scrollable_containers/compose/h;", "", "", "Lcom/avito/beduin/v2/component/scrollable_containers/compose/h$a;", "visibleItemsInfo", "Landroidx/compose/ui/unit/u;", "viewportSize", "", "totalItemsCount", "<init>", "(Ljava/util/List;JILkotlin/jvm/internal/w;)V", "a", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final List<a> f336275a;

    /* renamed from: b, reason: collision with root package name */
    public final long f336276b;

    /* renamed from: c, reason: collision with root package name */
    public final int f336277c;

    /* compiled from: LazyScrollableStateLayoutInfo.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/component/scrollable_containers/compose/h$a;", "", "compose_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class a {

        /* renamed from: a, reason: collision with root package name */
        public final int f336278a;

        /* renamed from: b, reason: collision with root package name */
        public final int f336279b;

        public a(int i12, int i13) {
            this.f336278a = i12;
            this.f336279b = i13;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.f336278a == aVar.f336278a && this.f336279b == aVar.f336279b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f336279b) + (Integer.hashCode(this.f336278a) * 31);
        }

        @Y61.k
        public final String toString() {
            StringBuilder sb2 = new StringBuilder("VisibleItemInfo(index=");
            sb2.append(this.f336278a);
            sb2.append(", size=");
            return r.t(sb2, this.f336279b, ')');
        }
    }

    public h() {
        throw null;
    }

    public h(List list, long j12, int i12, C42822w c42822w) {
        this.f336275a = list;
        this.f336276b = j12;
        this.f336277c = i12;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f336275a, hVar.f336275a) && u.c(this.f336276b, hVar.f336276b) && this.f336277c == hVar.f336277c;
    }

    public final int hashCode() {
        int iHashCode = this.f336275a.hashCode() * 31;
        u.a aVar = u.f42871b;
        return Integer.hashCode(this.f336277c) + r.g(iHashCode, 31, this.f336276b);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("LazyScrollableStateLayoutInfo(visibleItemsInfo=");
        sb2.append(this.f336275a);
        sb2.append(", viewportSize=");
        sb2.append((Object) u.d(this.f336276b));
        sb2.append(", totalItemsCount=");
        return r.t(sb2, this.f336277c, ')');
    }
}
