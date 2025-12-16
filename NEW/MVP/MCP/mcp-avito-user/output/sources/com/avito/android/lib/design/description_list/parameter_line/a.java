package com.avito.android.lib.design.description_list.parameter_line;

import Y61.k;
import Y61.l;
import com.avito.android.lib.design.description_list.parameter_line.DescriptionListParameterLine;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: DescriptionListParameterLineState.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/lib/design/description_list/parameter_line/a;", "", "_design-modules_components"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes14.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final List<com.avito.android.lib.design.description_list.a> f179061a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final DescriptionListParameterLine.LineType f179062b;

    public a(@k List<com.avito.android.lib.design.description_list.a> list, @k DescriptionListParameterLine.LineType lineType) {
        this.f179061a = list;
        this.f179062b = lineType;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f179061a, aVar.f179061a) && this.f179062b == aVar.f179062b;
    }

    public final int hashCode() {
        return this.f179062b.hashCode() + (this.f179061a.hashCode() * 31);
    }

    @k
    public final String toString() {
        return "DescriptionListParameterLineState(items=" + this.f179061a + ", lineType=" + this.f179062b + ')';
    }
}
