package com.avito.beduin.v2.avito.component.docking_badge.state;

import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoDockingBadgeStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/docking_badge/state/v;", "Lcom/avito/beduin/v2/theme/m;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class v implements com.avito.beduin.v2.theme.m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f334351a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334352b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f334353c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334354d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334355e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f334356f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f334357g;

    public v(@Y61.l String str, @Y61.k String str2, @Y61.k com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> lVar, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar2, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar3, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar4) {
        this.f334351a = str;
        this.f334352b = str2;
        this.f334353c = lVar;
        this.f334354d = fVar;
        this.f334355e = fVar2;
        this.f334356f = fVar3;
        this.f334357g = fVar4;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF334501b() {
        return this.f334352b;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getF334500a() {
        return this.f334351a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof v)) {
            return false;
        }
        v vVar = (v) obj;
        return L.f(this.f334351a, vVar.f334351a) && L.f(this.f334352b, vVar.f334352b) && L.f(this.f334353c, vVar.f334353c) && L.f(this.f334354d, vVar.f334354d) && L.f(this.f334355e, vVar.f334355e) && L.f(this.f334356f, vVar.f334356f) && L.f(this.f334357g, vVar.f334357g);
    }

    public final int hashCode() {
        String str = this.f334351a;
        return this.f334357g.hashCode() + C31685o.f(this.f334356f, C31685o.f(this.f334355e, C31685o.f(this.f334354d, C31685o.g(this.f334353c, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f334352b), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoDockingBadgeStylePatch(themeName=");
        sb2.append(this.f334351a);
        sb2.append(", styleName=");
        sb2.append(this.f334352b);
        sb2.append(", textStyle=");
        sb2.append(this.f334353c);
        sb2.append(", textColor=");
        sb2.append(this.f334354d);
        sb2.append(", badgeColor=");
        sb2.append(this.f334355e);
        sb2.append(", height=");
        sb2.append(this.f334356f);
        sb2.append(", textVerticalOffset=");
        return C31685o.o(sb2, this.f334357g, ')');
    }
}
