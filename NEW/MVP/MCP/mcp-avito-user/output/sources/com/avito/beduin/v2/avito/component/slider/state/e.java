package com.avito.beduin.v2.avito.component.slider.state;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.theme.m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoSliderStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/slider/state/e;", "Lcom/avito/beduin/v2/theme/m;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e implements m {

    /* renamed from: a, reason: collision with root package name */
    @l
    public final String f335130a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f335131b;

    public e(@l String str, @k String str2) {
        this.f335130a = str;
        this.f335131b = str2;
    }

    @Override // com.avito.beduin.v2.theme.m
    @k
    /* renamed from: a, reason: from getter */
    public final String getF335453b() {
        return this.f335131b;
    }

    @Override // com.avito.beduin.v2.theme.m
    @l
    /* renamed from: b, reason: from getter */
    public final String getF335452a() {
        return this.f335130a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f335130a, eVar.f335130a) && L.f(this.f335131b, eVar.f335131b);
    }

    public final int hashCode() {
        String str = this.f335130a;
        return this.f335131b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoSliderStylePatch(themeName=");
        sb2.append(this.f335130a);
        sb2.append(", styleName=");
        return C22026a.c(sb2, this.f335131b, ')');
    }
}
