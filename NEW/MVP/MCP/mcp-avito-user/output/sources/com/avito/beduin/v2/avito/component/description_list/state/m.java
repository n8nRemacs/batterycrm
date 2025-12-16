package com.avito.beduin.v2.avito.component.description_list.state;

import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoDescriptionListStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/description_list/state/m;", "Lcom/avito/beduin/v2/theme/m;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class m implements com.avito.beduin.v2.theme.m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f334251a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334252b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f334253c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334254d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f334255e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334256f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f334257g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334258h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f334259i;

    public m(@Y61.k com.avito.beduin.v2.theme.f fVar, @Y61.k com.avito.beduin.v2.theme.f fVar2, @Y61.k com.avito.beduin.v2.theme.f fVar3, @Y61.k com.avito.beduin.v2.theme.f fVar4, @Y61.k com.avito.beduin.v2.theme.f fVar5, @Y61.k com.avito.beduin.v2.theme.l lVar, @Y61.k com.avito.beduin.v2.theme.l lVar2, @Y61.l String str, @Y61.k String str2) {
        this.f334251a = str;
        this.f334252b = str2;
        this.f334253c = lVar;
        this.f334254d = fVar;
        this.f334255e = lVar2;
        this.f334256f = fVar2;
        this.f334257g = fVar3;
        this.f334258h = fVar4;
        this.f334259i = fVar5;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF334501b() {
        return this.f334252b;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getF334500a() {
        return this.f334251a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof m)) {
            return false;
        }
        m mVar = (m) obj;
        return L.f(this.f334251a, mVar.f334251a) && L.f(this.f334252b, mVar.f334252b) && L.f(this.f334253c, mVar.f334253c) && L.f(this.f334254d, mVar.f334254d) && L.f(this.f334255e, mVar.f334255e) && L.f(this.f334256f, mVar.f334256f) && L.f(this.f334257g, mVar.f334257g) && L.f(this.f334258h, mVar.f334258h) && L.f(this.f334259i, mVar.f334259i);
    }

    public final int hashCode() {
        String str = this.f334251a;
        return this.f334259i.hashCode() + C31685o.f(this.f334258h, C31685o.f(this.f334257g, C31685o.f(this.f334256f, C31685o.g(this.f334255e, C31685o.f(this.f334254d, C31685o.g(this.f334253c, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f334252b), 31), 31), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoDescriptionListStylePatch(themeName=");
        sb2.append(this.f334251a);
        sb2.append(", styleName=");
        sb2.append(this.f334252b);
        sb2.append(", leadingLabelStyle=");
        sb2.append(this.f334253c);
        sb2.append(", leadingLabelColor=");
        sb2.append(this.f334254d);
        sb2.append(", trailingLabelStyle=");
        sb2.append(this.f334255e);
        sb2.append(", trailingLabelColor=");
        sb2.append(this.f334256f);
        sb2.append(", itemVerticalInset=");
        sb2.append(this.f334257g);
        sb2.append(", iconColor=");
        sb2.append(this.f334258h);
        sb2.append(", iconHorizontalInset=");
        return C31685o.o(sb2, this.f334259i, ')');
    }
}
