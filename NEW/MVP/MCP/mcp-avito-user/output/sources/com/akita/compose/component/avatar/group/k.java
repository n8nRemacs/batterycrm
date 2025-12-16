package com.akita.compose.component.avatar.group;

import Y61.l;
import androidx.appcompat.app.r;
import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import androidx.compose.ui.unit.h;
import com.akita.compose.foundation.p;
import kotlin.Metadata;
import kotlin.jvm.internal.C42822w;
import kotlin.jvm.internal.L;

/* compiled from: AvatarGroupStyle.kt */
@P
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0006\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\f¨\u0006\r"}, d2 = {"Lcom/akita/compose/component/avatar/group/k;", "", "Lcom/akita/compose/component/avatar/i;", "avatarStyle", "Lcom/akita/compose/component/badge/i;", "badgeStyle", "Landroidx/compose/ui/unit/h;", "itemsHorizontalOffset", "borderWidth", "Lcom/akita/compose/foundation/p;", "borderColor", "<init>", "(Lcom/akita/compose/component/avatar/i;Lcom/akita/compose/component/badge/i;FFLcom/akita/compose/foundation/p;Lkotlin/jvm/internal/w;)V", "avatar_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class k {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.avatar.i f60321a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.akita.compose.component.badge.i f60322b;

    /* renamed from: c, reason: collision with root package name */
    public final float f60323c;

    /* renamed from: d, reason: collision with root package name */
    public final float f60324d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final p f60325e;

    public k(com.akita.compose.component.avatar.i iVar, com.akita.compose.component.badge.i iVar2, float f12, float f13, p pVar, C42822w c42822w) {
        this.f60321a = iVar;
        this.f60322b = iVar2;
        this.f60323c = f12;
        this.f60324d = f13;
        this.f60325e = pVar;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f60321a, kVar.f60321a) && L.f(this.f60322b, kVar.f60322b) && androidx.compose.ui.unit.h.b(this.f60323c, kVar.f60323c) && androidx.compose.ui.unit.h.b(this.f60324d, kVar.f60324d) && L.f(this.f60325e, kVar.f60325e);
    }

    public final int hashCode() {
        int iHashCode = (this.f60322b.hashCode() + (this.f60321a.hashCode() * 31)) * 31;
        h.a aVar = androidx.compose.ui.unit.h.f42849c;
        return this.f60325e.hashCode() + r.d(this.f60324d, r.d(this.f60323c, iHashCode, 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvatarGroupStyle(avatarStyle=");
        sb2.append(this.f60321a);
        sb2.append(", badgeStyle=");
        sb2.append(this.f60322b);
        sb2.append(", itemsHorizontalOffset=");
        H.u(this.f60323c, ", borderWidth=", sb2);
        H.u(this.f60324d, ", borderColor=", sb2);
        sb2.append(this.f60325e);
        sb2.append(')');
        return sb2.toString();
    }
}
