package com.avito.beduin.v2.avito.component.description_list_parameter_line.state;

import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoDescriptionListParameterLineStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/description_list_parameter_line/state/n;", "Lcom/avito/beduin/v2/theme/m;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class n implements com.avito.beduin.v2.theme.m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f334297a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334298b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f334299c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334300d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Double> f334301e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Double> f334302f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f334303g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334304h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f334305i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f334306j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334307k;

    public n(@Y61.l String str, @Y61.k String str2, @Y61.k com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> lVar, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar, @Y61.k com.avito.beduin.v2.theme.f<Double> fVar2, @Y61.k com.avito.beduin.v2.theme.f<Double> fVar3, @Y61.k com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> lVar2, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar4, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar5, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar6, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar7) {
        this.f334297a = str;
        this.f334298b = str2;
        this.f334299c = lVar;
        this.f334300d = fVar;
        this.f334301e = fVar2;
        this.f334302f = fVar3;
        this.f334303g = lVar2;
        this.f334304h = fVar4;
        this.f334305i = fVar5;
        this.f334306j = fVar6;
        this.f334307k = fVar7;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF334501b() {
        return this.f334298b;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getF334500a() {
        return this.f334297a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof n)) {
            return false;
        }
        n nVar = (n) obj;
        return L.f(this.f334297a, nVar.f334297a) && L.f(this.f334298b, nVar.f334298b) && L.f(this.f334299c, nVar.f334299c) && L.f(this.f334300d, nVar.f334300d) && L.f(this.f334301e, nVar.f334301e) && L.f(this.f334302f, nVar.f334302f) && L.f(this.f334303g, nVar.f334303g) && L.f(this.f334304h, nVar.f334304h) && L.f(this.f334305i, nVar.f334305i) && L.f(this.f334306j, nVar.f334306j) && L.f(this.f334307k, nVar.f334307k);
    }

    public final int hashCode() {
        String str = this.f334297a;
        return this.f334307k.hashCode() + C31685o.f(this.f334306j, C31685o.f(this.f334305i, C31685o.f(this.f334304h, C31685o.g(this.f334303g, C31685o.f(this.f334302f, C31685o.f(this.f334301e, C31685o.f(this.f334300d, C31685o.g(this.f334299c, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f334298b), 31), 31), 31), 31), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoDescriptionListParameterLineStylePatch(themeName=");
        sb2.append(this.f334297a);
        sb2.append(", styleName=");
        sb2.append(this.f334298b);
        sb2.append(", leadingLabelStyle=");
        sb2.append(this.f334299c);
        sb2.append(", leadingLabelColor=");
        sb2.append(this.f334300d);
        sb2.append(", leadingLabelWidthShare=");
        sb2.append(this.f334301e);
        sb2.append(", trailingLabelWidthShare=");
        sb2.append(this.f334302f);
        sb2.append(", trailingLabelStyle=");
        sb2.append(this.f334303g);
        sb2.append(", trailingLabelColor=");
        sb2.append(this.f334304h);
        sb2.append(", itemVerticalInset=");
        sb2.append(this.f334305i);
        sb2.append(", iconHorizontalInset=");
        sb2.append(this.f334306j);
        sb2.append(", lineColor=");
        return C31685o.o(sb2, this.f334307k, ')');
    }
}
