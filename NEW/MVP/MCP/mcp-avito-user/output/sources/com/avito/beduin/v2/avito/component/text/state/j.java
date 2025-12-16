package com.avito.beduin.v2.avito.component.text.state;

import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoTextStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/text/state/j;", "Lcom/avito/beduin/v2/theme/m;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class j implements com.avito.beduin.v2.theme.m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f335351a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f335352b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f335353c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f335354d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<String> f335355e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f335356f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f335357g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f335358h;

    public j(@Y61.l String str, @Y61.k String str2, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar2, @Y61.k com.avito.beduin.v2.theme.f<String> fVar3, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar4, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar5, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar6) {
        this.f335351a = str;
        this.f335352b = str2;
        this.f335353c = fVar;
        this.f335354d = fVar2;
        this.f335355e = fVar3;
        this.f335356f = fVar4;
        this.f335357g = fVar5;
        this.f335358h = fVar6;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF335100t() {
        return this.f335352b;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getF335099s() {
        return this.f335351a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof j)) {
            return false;
        }
        j jVar = (j) obj;
        return L.f(this.f335351a, jVar.f335351a) && L.f(this.f335352b, jVar.f335352b) && L.f(this.f335353c, jVar.f335353c) && L.f(this.f335354d, jVar.f335354d) && L.f(this.f335355e, jVar.f335355e) && L.f(this.f335356f, jVar.f335356f) && L.f(this.f335357g, jVar.f335357g) && L.f(this.f335358h, jVar.f335358h);
    }

    public final int hashCode() {
        String str = this.f335351a;
        return this.f335358h.hashCode() + C31685o.f(this.f335357g, C31685o.f(this.f335356f, C31685o.f(this.f335355e, C31685o.f(this.f335354d, C31685o.f(this.f335353c, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f335352b), 31), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoTextStylePatch(themeName=");
        sb2.append(this.f335351a);
        sb2.append(", styleName=");
        sb2.append(this.f335352b);
        sb2.append(", size=");
        sb2.append(this.f335353c);
        sb2.append(", lineHeight=");
        sb2.append(this.f335354d);
        sb2.append(", font=");
        sb2.append(this.f335355e);
        sb2.append(", color=");
        sb2.append(this.f335356f);
        sb2.append(", iconColor=");
        sb2.append(this.f335357g);
        sb2.append(", linkColor=");
        return C31685o.o(sb2, this.f335358h, ')');
    }
}
