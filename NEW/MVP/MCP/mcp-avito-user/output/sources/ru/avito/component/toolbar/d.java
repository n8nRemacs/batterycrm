package ru.avito.component.toolbar;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CollapsingTitleAppBarLayout.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0086\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lru/avito/component/toolbar/d;", "", "_avito_ui-components_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes9.dex */
public final /* data */ class d {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f430593a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f430594b;

    public d(@k String str, @k String str2) {
        this.f430593a = str;
        this.f430594b = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f430593a, dVar.f430593a) && L.f(this.f430594b, dVar.f430594b);
    }

    public final int hashCode() {
        return this.f430594b.hashCode() + (this.f430593a.hashCode() * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("OnboardingData(title=");
        sb2.append(this.f430593a);
        sb2.append(", text=");
        return C22026a.c(sb2, this.f430594b, ')');
    }
}
