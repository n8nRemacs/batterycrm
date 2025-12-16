package ru.avito.component.snippet_badge_bar;

import Y61.k;
import Y61.l;
import hw.InterfaceC41178c;
import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SnippetBadgeBarData.kt */
@InterfaceC41178c
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/snippet_badge_bar/d;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    public final int f430565a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final ArrayList f430566b;

    public d(int i12, @k ArrayList arrayList) {
        this.f430565a = i12;
        this.f430566b = arrayList;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return this.f430565a == dVar.f430565a && this.f430566b.equals(dVar.f430566b);
    }

    public final int hashCode() {
        return this.f430566b.hashCode() + (Integer.hashCode(this.f430565a) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SnippetBadgeBarData(version=");
        sb2.append(this.f430565a);
        sb2.append(", badges=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f430566b, ')');
    }
}
