package com.avito.beduin.v2.avito.component.badge.state;

import com.avito.android.messenger.blacklist.mvi.C31685o;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: BadgeTextStylePatch.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/avito/component/badge/state/q;", "", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class q {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f333824a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f333825b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.f<Float> f333826c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> f333827d;

    public q(@Y61.k com.avito.beduin.v2.theme.f<Float> fVar, @Y61.k com.avito.beduin.v2.theme.f<Float> fVar2, @Y61.k com.avito.beduin.v2.theme.f<Float> fVar3, @Y61.k com.avito.beduin.v2.theme.l<com.avito.beduin.v2.avito.component.text.state.j> lVar) {
        this.f333824a = fVar;
        this.f333825b = fVar2;
        this.f333826c = fVar3;
        this.f333827d = lVar;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q)) {
            return false;
        }
        q qVar = (q) obj;
        return L.f(this.f333824a, qVar.f333824a) && L.f(this.f333825b, qVar.f333825b) && L.f(this.f333826c, qVar.f333826c) && L.f(this.f333827d, qVar.f333827d);
    }

    public final int hashCode() {
        return this.f333827d.hashCode() + C31685o.f(this.f333826c, C31685o.f(this.f333825b, this.f333824a.hashCode() * 31, 31), 31);
    }

    @Y61.k
    public final String toString() {
        return "BadgeTextStylePatch(textVerticalOffset=" + this.f333824a + ", textInsetLeft=" + this.f333825b + ", textInsetRight=" + this.f333826c + ", textStyle=" + this.f333827d + ')';
    }
}
