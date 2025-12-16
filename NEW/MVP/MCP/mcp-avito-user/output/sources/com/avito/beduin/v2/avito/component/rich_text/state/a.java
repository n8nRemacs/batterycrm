package com.avito.beduin.v2.avito.component.rich_text.state;

import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.avito.component.text.state.C;
import com.avito.beduin.v2.avito.component.text.state.TextAlign;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import java.util.Arrays;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoRichTextState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/rich_text/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final q[] f334922a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f334923b;

    /* renamed from: c, reason: collision with root package name */
    public final int f334924c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final TextAlign f334925d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f334926e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.l
    public final ET0.b f334927f;

    /* renamed from: g, reason: collision with root package name */
    @Y61.l
    public final C f334928g;

    /* renamed from: h, reason: collision with root package name */
    public final boolean f334929h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334930i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334931j;

    /* renamed from: k, reason: collision with root package name */
    @Y61.l
    public final String f334932k;

    public a(@Y61.k q[] qVarArr, boolean z12, int i12, @Y61.k TextAlign textAlign, @Y61.k com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> lVar, @Y61.l ET0.b bVar, @Y61.l C c12, boolean z13, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str) {
        this.f334922a = qVarArr;
        this.f334923b = z12;
        this.f334924c = i12;
        this.f334925d = textAlign;
        this.f334926e = lVar;
        this.f334927f = bVar;
        this.f334928g = c12;
        this.f334929h = z13;
        this.f334930i = aVar;
        this.f334931j = aVar2;
        this.f334932k = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334930i;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334931j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    @Y61.l
    public final com.avito.beduin.v2.engine.utils.c<AbstractC40338a> e() {
        return null;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || a.class != obj.getClass()) {
            return false;
        }
        a aVar = (a) obj;
        if (Arrays.equals(this.f334922a, aVar.f334922a) && this.f334923b == aVar.f334923b && this.f334924c == aVar.f334924c && this.f334925d == aVar.f334925d && this.f334929h == aVar.f334929h && L.f(this.f334932k, aVar.f334932k)) {
            return L.f(this.f334926e, aVar.f334926e);
        }
        return false;
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334932k() {
        return this.f334932k;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334929h() {
        return this.f334929h;
    }

    public final int hashCode() {
        int i12 = androidx.appcompat.app.r.i((this.f334925d.hashCode() + ((androidx.appcompat.app.r.i(Arrays.hashCode(this.f334922a) * 31, 31, this.f334923b) + this.f334924c) * 31)) * 31, 31, this.f334929h);
        String str = this.f334932k;
        return this.f334926e.hashCode() + ((i12 + (str != null ? str.hashCode() : 0)) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoRichTextState(segments=");
        sb2.append(Arrays.toString(this.f334922a));
        sb2.append(", truncate=");
        sb2.append(this.f334923b);
        sb2.append(", maxLines=");
        sb2.append(this.f334924c);
        sb2.append(", textAlign=");
        sb2.append(this.f334925d);
        sb2.append(", style=");
        sb2.append(this.f334926e);
        sb2.append(", padding=");
        sb2.append(this.f334927f);
        sb2.append(", expandableText=");
        sb2.append(this.f334928g);
        sb2.append(", visible=");
        sb2.append(this.f334929h);
        sb2.append(", onShow=");
        sb2.append(this.f334930i);
        sb2.append(", onHide=");
        sb2.append(this.f334931j);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334932k, ')');
    }
}
