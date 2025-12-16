package com.avito.beduin.v2.avito.component.pull_to_refresh;

import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.m;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoPullToRefreshStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/pull_to_refresh/i;", "Lcom/avito/beduin/v2/theme/m;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f334870a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334871b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f334872c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f334873d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f334874e;

    public i(@Y61.l String str, @Y61.k String str2, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar2, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar3) {
        this.f334870a = str;
        this.f334871b = str2;
        this.f334872c = fVar;
        this.f334873d = fVar2;
        this.f334874e = fVar3;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF334724b() {
        return this.f334871b;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getF334723a() {
        return this.f334870a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f334870a, iVar.f334870a) && L.f(this.f334871b, iVar.f334871b) && L.f(this.f334872c, iVar.f334872c) && L.f(this.f334873d, iVar.f334873d) && L.f(this.f334874e, iVar.f334874e);
    }

    public final int hashCode() {
        String str = this.f334870a;
        return this.f334874e.hashCode() + C31685o.f(this.f334873d, C31685o.f(this.f334872c, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f334871b), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoPullToRefreshStylePatch(themeName=");
        sb2.append(this.f334870a);
        sb2.append(", styleName=");
        sb2.append(this.f334871b);
        sb2.append(", spinnerSize=");
        sb2.append(this.f334872c);
        sb2.append(", spinnerThickness=");
        sb2.append(this.f334873d);
        sb2.append(", spinnerColor=");
        return C31685o.o(sb2, this.f334874e, ')');
    }
}
