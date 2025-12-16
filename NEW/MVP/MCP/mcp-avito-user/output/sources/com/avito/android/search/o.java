package com.avito.android.search;

import java.util.ArrayList;
import kotlin.Metadata;

/* compiled from: SuggestInteractor.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/search/o;", "", "_avito_search-bar_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class o {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final p f263831a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final ArrayList f263832b;

    public o(@Y61.k p pVar, @Y61.k ArrayList arrayList) {
        this.f263831a = pVar;
        this.f263832b = arrayList;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof o)) {
            return false;
        }
        o oVar = (o) obj;
        return this.f263831a.equals(oVar.f263831a) && this.f263832b.equals(oVar.f263832b);
    }

    public final int hashCode() {
        return this.f263832b.hashCode() + (this.f263831a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Suggestions(params=");
        sb2.append(this.f263831a);
        sb2.append(", items=");
        return androidx.compose.ui.graphics.colorspace.e.p(sb2, this.f263832b, ')');
    }
}
