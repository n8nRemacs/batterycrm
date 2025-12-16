package com.avito.beduin.v2.avito.component.circularCounter.state;

import com.avito.beduin.v2.engine.component.InterfaceC36248h;
import com.avito.beduin.v2.theme.r;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: Content.kt */
@InterfaceC36248h
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/circularCounter/state/i;", "Lcom/avito/beduin/v2/avito/component/circularCounter/state/g;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class i implements g {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f334103a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.l
    public final String f334104b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final r f334105c;

    public i(@Y61.k String str, @Y61.l String str2, @Y61.k r rVar) {
        this.f334103a = str;
        this.f334104b = str2;
        this.f334105c = rVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof i)) {
            return false;
        }
        i iVar = (i) obj;
        return L.f(this.f334103a, iVar.f334103a) && L.f(this.f334104b, iVar.f334104b) && L.f(this.f334105c, iVar.f334105c);
    }

    public final int hashCode() {
        int iHashCode = this.f334103a.hashCode() * 31;
        String str = this.f334104b;
        return this.f334105c.hashCode() + ((iHashCode + (str == null ? 0 : str.hashCode())) * 31);
    }

    @Y61.k
    public final String toString() {
        return "Image(name=" + this.f334103a + ", themeName=" + this.f334104b + ", color=" + this.f334105c + ')';
    }
}
