package com.avito.android.passport.profile_add.create_flow.select_vertical.recycler;

import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Vertical.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0080\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/passport/profile_add/create_flow/select_vertical/recycler/u;", "Lcom/avito/conveyor_item/a;", "_avito_extended-profile-creation_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes15.dex */
public final /* data */ class u implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final X50.e f212020b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f212021c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f212022d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final String f212023e;

    public u(@Y61.k X50.e eVar, boolean z12, boolean z13, @Y61.k String str) {
        this.f212020b = eVar;
        this.f212021c = z12;
        this.f212022d = z13;
        this.f212023e = str;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof u)) {
            return false;
        }
        u uVar = (u) obj;
        return L.f(this.f212020b, uVar.f212020b) && this.f212021c == uVar.f212021c && this.f212022d == uVar.f212022d && L.f(this.f212023e, uVar.f212023e);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF428153b() {
        return getF212582h().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF212582h() {
        return this.f212023e;
    }

    public final int hashCode() {
        return this.f212023e.hashCode() + androidx.appcompat.app.r.i(androidx.appcompat.app.r.i(this.f212020b.hashCode() * 31, 31, this.f212021c), 31, this.f212022d);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("VerticalItem(vertical=");
        sb2.append(this.f212020b);
        sb2.append(", isChecked=");
        sb2.append(this.f212021c);
        sb2.append(", withHighlight=");
        sb2.append(this.f212022d);
        sb2.append(", stringId=");
        return C22026a.c(sb2, this.f212023e, ')');
    }
}
