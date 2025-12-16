package com.avito.beduin.v2.avito.component.map.state.style;

import androidx.compose.foundation.H;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoMapStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/map/state/style/a;", "Lcom/avito/beduin/v2/theme/m;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements com.avito.beduin.v2.theme.m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f334723a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334724b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f334725c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f334726d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<LogoAlignment> f334727e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<f> f334728f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<k> f334729g;

    public a(@Y61.l String str, @Y61.k String str2, @Y61.k com.avito.beduin.v2.theme.f<Float> fVar, @Y61.k com.avito.beduin.v2.theme.f<Float> fVar2, @Y61.k com.avito.beduin.v2.theme.f<LogoAlignment> fVar3, @Y61.k com.avito.beduin.v2.theme.f<f> fVar4, @Y61.k com.avito.beduin.v2.theme.f<k> fVar5) {
        this.f334723a = str;
        this.f334724b = str2;
        this.f334725c = fVar;
        this.f334726d = fVar2;
        this.f334727e = fVar3;
        this.f334728f = fVar4;
        this.f334729g = fVar5;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF334501b() {
        return this.f334724b;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getF334500a() {
        return this.f334723a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f334723a, aVar.f334723a) && L.f(this.f334724b, aVar.f334724b) && L.f(this.f334725c, aVar.f334725c) && L.f(this.f334726d, aVar.f334726d) && L.f(this.f334727e, aVar.f334727e) && L.f(this.f334728f, aVar.f334728f) && L.f(this.f334729g, aVar.f334729g);
    }

    public final int hashCode() {
        String str = this.f334723a;
        return this.f334729g.hashCode() + C31685o.f(this.f334728f, C31685o.f(this.f334727e, C31685o.f(this.f334726d, C31685o.f(this.f334725c, H.d((str == null ? 0 : str.hashCode()) * 31, 31, this.f334724b), 31), 31), 31), 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoMapStylePatch(themeName=");
        sb2.append(this.f334723a);
        sb2.append(", styleName=");
        sb2.append(this.f334724b);
        sb2.append(", minZoomLevel=");
        sb2.append(this.f334725c);
        sb2.append(", maxZoomLevel=");
        sb2.append(this.f334726d);
        sb2.append(", logoAlignment=");
        sb2.append(this.f334727e);
        sb2.append(", circleLocationStyle=");
        sb2.append(this.f334728f);
        sb2.append(", polygonStyle=");
        return C31685o.o(sb2, this.f334729g, ')');
    }
}
