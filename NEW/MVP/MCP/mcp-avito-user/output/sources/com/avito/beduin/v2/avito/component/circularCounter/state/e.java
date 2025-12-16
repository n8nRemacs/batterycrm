package com.avito.beduin.v2.avito.component.circularCounter.state;

import androidx.compose.runtime.C22026a;
import com.avito.beduin.v2.theme.m;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: AvitoCircularCounterStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/circularCounter/state/e;", "Lcom/avito/beduin/v2/theme/m;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class e implements m {

    /* renamed from: a, reason: collision with root package name */
    @Y61.l
    public final String f334099a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f334100b;

    public e(@Y61.l String str, @Y61.k String str2) {
        this.f334099a = str;
        this.f334100b = str2;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.k
    /* renamed from: a, reason: from getter */
    public final String getF334100b() {
        return this.f334100b;
    }

    @Override // com.avito.beduin.v2.theme.m
    @Y61.l
    /* renamed from: b, reason: from getter */
    public final String getF334099a() {
        return this.f334099a;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f334099a, eVar.f334099a) && L.f(this.f334100b, eVar.f334100b);
    }

    public final int hashCode() {
        String str = this.f334099a;
        return this.f334100b.hashCode() + ((str == null ? 0 : str.hashCode()) * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("AvitoCircularCounterStylePatch(themeName=");
        sb2.append(this.f334099a);
        sb2.append(", styleName=");
        return C22026a.c(sb2, this.f334100b, ')');
    }
}
