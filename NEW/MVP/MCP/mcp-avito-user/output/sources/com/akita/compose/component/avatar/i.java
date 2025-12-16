package com.akita.compose.component.avatar;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.akita.compose.component.accordion.s;
import com.akita.compose.foundation.p;
import com.akita.compose.foundation.r;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvatarStyle.kt */
@P
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B7\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0002\u0012\u0006\u0010\n\u001a\u00020\u0002¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/akita/compose/component/avatar/i;", "", "Landroidx/compose/ui/unit/h;", "size", "Lcom/akita/compose/foundation/p;", "backgroundColor", "contentColor", "Lcom/akita/compose/foundation/r;", "textStyle", "textVerticalOffset", "iconSize", "<init>", "(FLcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/p;Lcom/akita/compose/foundation/r;FFLkotlin/jvm/internal/w;)V", "avatar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class i {

    /* renamed from: a, reason: collision with root package name */
    public final float f60326a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final p f60327b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final p f60328c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final r f60329d;

    /* renamed from: e, reason: collision with root package name */
    public final float f60330e;

    /* renamed from: f, reason: collision with root package name */
    public final float f60331f;

    public i(float f12, p pVar, p pVar2, r rVar, float f13, float f14, C42822w c42822w) {
        this.f60326a = f12;
        this.f60327b = pVar;
        this.f60328c = pVar2;
        this.f60329d = rVar;
        this.f60330e = f13;
        this.f60331f = f14;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return androidx.compose.ui.unit.h.b(this.f60326a, iVar.f60326a) && L.f(this.f60327b, iVar.f60327b) && L.f(this.f60328c, iVar.f60328c) && L.f(this.f60329d, iVar.f60329d) && androidx.compose.ui.unit.h.b(this.f60330e, iVar.f60330e) && androidx.compose.ui.unit.h.b(this.f60331f, iVar.f60331f);
    }

    public final int hashCode() {
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return Float.hashCode(this.f60331f) + androidx.appcompat.app.r.d(this.f60330e, s.a(s.b(this.f60328c, s.b(this.f60327b, Float.hashCode(this.f60326a) * 31, 31), 31), 31, this.f60329d), 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvatarStyle(size=");
        H.u(this.f60326a, ", backgroundColor=", sb2);
        sb2.append(this.f60327b);
        sb2.append(", contentColor=");
        sb2.append(this.f60328c);
        sb2.append(", textStyle=");
        sb2.append(this.f60329d);
        sb2.append(", textVerticalOffset=");
        H.u(this.f60330e, ", iconSize=", sb2);
        return H.h(')', this.f60331f, sb2);
    }
}
