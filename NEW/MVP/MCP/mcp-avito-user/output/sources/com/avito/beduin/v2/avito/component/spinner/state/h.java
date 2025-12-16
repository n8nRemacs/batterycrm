package com.avito.beduin.v2.avito.component.spinner.state;

import Y61.l;
import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.theme.m;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoSpinnerStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/spinner/state/h;", "Lcom/avito/beduin/v2/theme/m;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class h implements m {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f335144a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f335145b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f335146c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Integer> f335147d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<r.b> f335148e;

    public h(@l String str, @Y61.k String str2, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar, @Y61.k com.avito.beduin.v2.theme.f<Integer> fVar2, @Y61.k com.avito.beduin.v2.theme.f<r.b> fVar3) {
        this.f335144a = str;
        this.f335145b = str2;
        this.f335146c = fVar;
        this.f335147d = fVar2;
        this.f335148e = fVar3;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF335100t() {
        return this.f335145b;
    }

    @Override // com.avito.beduin.v2.theme.m
    @l
    /* renamed from: b, reason: from getter */
    public final String getF335099s() {
        return this.f335144a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof h)) {
            return false;
        }
        h hVar = (h) obj;
        return L.f(this.f335144a, hVar.f335144a) && L.f(this.f335145b, hVar.f335145b) && L.f(this.f335146c, hVar.f335146c) && L.f(this.f335147d, hVar.f335147d) && L.f(this.f335148e, hVar.f335148e);
    }

    public final int hashCode() {
        String str = this.f335144a;
        return this.f335148e.hashCode() + C31685o.f(this.f335147d, C31685o.f(this.f335146c, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f335145b), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoSpinnerStylePatch(themeName=");
        sb2.append(this.f335144a);
        sb2.append(", styleName=");
        sb2.append(this.f335145b);
        sb2.append(", height=");
        sb2.append(this.f335146c);
        sb2.append(", lineThickness=");
        sb2.append(this.f335147d);
        sb2.append(", color=");
        return C31685o.o(sb2, this.f335148e, ')');
    }
}
