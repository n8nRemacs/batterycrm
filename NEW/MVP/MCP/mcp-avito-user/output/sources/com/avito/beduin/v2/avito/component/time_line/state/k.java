package com.avito.beduin.v2.avito.component.time_line.state;

import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTimeLineStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/time_line/state/k;", "Lcom/avito/beduin/v2/theme/m;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class k implements com.avito.beduin.v2.theme.m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f335412a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f335413b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f335414c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f335415d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f335416e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f335417f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f335418g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f335419h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f335420i;

    public k(@Y61.k com.avito.beduin.v2.theme.f fVar, @Y61.k com.avito.beduin.v2.theme.f fVar2, @Y61.k com.avito.beduin.v2.theme.f fVar3, @Y61.k com.avito.beduin.v2.theme.f fVar4, @Y61.k com.avito.beduin.v2.theme.f fVar5, @Y61.k com.avito.beduin.v2.theme.l lVar, @Y61.k com.avito.beduin.v2.theme.l lVar2, @Y61.l String str, @Y61.k String str2) {
        this.f335412a = str;
        this.f335413b = str2;
        this.f335414c = lVar;
        this.f335415d = fVar;
        this.f335416e = fVar2;
        this.f335417f = lVar2;
        this.f335418g = fVar3;
        this.f335419h = fVar4;
        this.f335420i = fVar5;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF334501b() {
        return this.f335413b;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getF334500a() {
        return this.f335412a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof k)) {
            return false;
        }
        k kVar = (k) obj;
        return L.f(this.f335412a, kVar.f335412a) && L.f(this.f335413b, kVar.f335413b) && L.f(this.f335414c, kVar.f335414c) && L.f(this.f335415d, kVar.f335415d) && L.f(this.f335416e, kVar.f335416e) && L.f(this.f335417f, kVar.f335417f) && L.f(this.f335418g, kVar.f335418g) && L.f(this.f335419h, kVar.f335419h) && L.f(this.f335420i, kVar.f335420i);
    }

    public final int hashCode() {
        String str = this.f335412a;
        return this.f335420i.hashCode() + C31685o.f(this.f335419h, C31685o.f(this.f335418g, C31685o.g(this.f335417f, C31685o.f(this.f335416e, C31685o.f(this.f335415d, C31685o.g(this.f335414c, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f335413b), 31), 31), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoTimeLineStylePatch(themeName=");
        sb2.append(this.f335412a);
        sb2.append(", styleName=");
        sb2.append(this.f335413b);
        sb2.append(", activeTextStyle=");
        sb2.append(this.f335414c);
        sb2.append(", activeColor=");
        sb2.append(this.f335415d);
        sb2.append(", activeTextColor=");
        sb2.append(this.f335416e);
        sb2.append(", inactiveTextStyle=");
        sb2.append(this.f335417f);
        sb2.append(", inactiveColor=");
        sb2.append(this.f335418g);
        sb2.append(", inactiveTextColor=");
        sb2.append(this.f335419h);
        sb2.append(", lineThickness=");
        return C31685o.o(sb2, this.f335420i, ')');
    }
}
