package com.avito.beduin.v2.avito.component.checkbox.state;

import androidx.appcompat.app.r;
import androidx.compose.runtime.C22026a;
import com.avito.android.messenger.blacklist.mvi.C31685o;
import com.avito.beduin.v2.engine.component.InterfaceC36243c;
import fU0.AbstractC40338a;
import kotlin.G0;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoCheckboxState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/checkbox/state/a;", "Lcom/avito/beduin/v2/engine/component/c;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements InterfaceC36243c {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final CheckboxValue f334005a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f334006b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f334007c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f334008d;

    /* renamed from: e, reason: collision with root package name */
    @Y61.l
    public final Y41.l<Boolean, G0> f334009e;

    /* renamed from: f, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<j> f334010f;

    /* renamed from: g, reason: collision with root package name */
    public final boolean f334011g;

    /* renamed from: h, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334012h;

    /* renamed from: i, reason: collision with root package name */
    @Y61.l
    public final Y41.a<G0> f334013i;

    /* renamed from: j, reason: collision with root package name */
    @Y61.l
    public final String f334014j;

    /* JADX WARN: Multi-variable type inference failed */
    public a(@Y61.l CheckboxValue checkboxValue, boolean z12, boolean z13, boolean z14, @Y61.l Y41.l<? super Boolean, G0> lVar, @Y61.k com.avito.beduin.v2.theme.l<j> lVar2, boolean z15, @Y61.l Y41.a<G0> aVar, @Y61.l Y41.a<G0> aVar2, @Y61.l String str) {
        this.f334005a = checkboxValue;
        this.f334006b = z12;
        this.f334007c = z13;
        this.f334008d = z14;
        this.f334009e = lVar;
        this.f334010f = lVar2;
        this.f334011g = z15;
        this.f334012h = aVar;
        this.f334013i = aVar2;
        this.f334014j = str;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> b() {
        return this.f334012h;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36247g
    @Y61.l
    public final Y41.a<G0> d() {
        return this.f334013i;
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
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f334005a == aVar.f334005a && this.f334006b == aVar.f334006b && this.f334007c == aVar.f334007c && this.f334008d == aVar.f334008d && L.f(this.f334009e, aVar.f334009e) && L.f(this.f334010f, aVar.f334010f) && this.f334011g == aVar.f334011g && L.f(this.f334012h, aVar.f334012h) && L.f(this.f334013i, aVar.f334013i) && L.f(this.f334014j, aVar.f334014j);
    }

    @Override // com.avito.beduin.v2.engine.component.J
    @Y61.l
    /* renamed from: getTag, reason: from getter */
    public final String getF334324g() {
        return this.f334014j;
    }

    @Override // com.avito.beduin.v2.engine.component.InterfaceC36243c
    /* renamed from: getVisible, reason: from getter */
    public final boolean getF334321d() {
        return this.f334011g;
    }

    public final int hashCode() {
        CheckboxValue checkboxValue = this.f334005a;
        int i12 = r.i(r.i(r.i((checkboxValue == null ? 0 : checkboxValue.hashCode()) * 31, 31, this.f334006b), 31, this.f334007c), 31, this.f334008d);
        Y41.l<Boolean, G0> lVar = this.f334009e;
        int i13 = r.i(C31685o.g(this.f334010f, (i12 + (lVar == null ? 0 : lVar.hashCode())) * 31, 31), 31, this.f334011g);
        Y41.a<G0> aVar = this.f334012h;
        int iHashCode = (i13 + (aVar == null ? 0 : aVar.hashCode())) * 31;
        Y41.a<G0> aVar2 = this.f334013i;
        int iHashCode2 = (iHashCode + (aVar2 == null ? 0 : aVar2.hashCode())) * 31;
        String str = this.f334014j;
        return iHashCode2 + (str != null ? str.hashCode() : 0);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoCheckboxState(value=");
        sb2.append(this.f334005a);
        sb2.append(", checked=");
        sb2.append(this.f334006b);
        sb2.append(", enabled=");
        sb2.append(this.f334007c);
        sb2.append(", error=");
        sb2.append(this.f334008d);
        sb2.append(", onCheckedChange=");
        sb2.append(this.f334009e);
        sb2.append(", style=");
        sb2.append(this.f334010f);
        sb2.append(", visible=");
        sb2.append(this.f334011g);
        sb2.append(", onShow=");
        sb2.append(this.f334012h);
        sb2.append(", onHide=");
        sb2.append(this.f334013i);
        sb2.append(", tag=");
        return C22026a.c(sb2, this.f334014j, ')');
    }
}
