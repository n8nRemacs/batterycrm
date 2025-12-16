package com.avito.beduin.v2.interaction.flow.keyboard;

import Y61.k;
import Y61.l;
import dU0.InterfaceC39628a;
import fU0.AbstractC40338a;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: ShowKeyboardInteraction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/keyboard/g;", "LdU0/a;", "api_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class g implements InterfaceC39628a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final AbstractC40338a f337436a;

    public g(@k AbstractC40338a abstractC40338a) {
        this.f337436a = abstractC40338a;
    }

    @Override // dU0.InterfaceC39628a
    @k
    /* renamed from: a, reason: from getter */
    public final AbstractC40338a getF337436a() {
        return this.f337436a;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof g) && L.f(this.f337436a, ((g) obj).f337436a);
    }

    public final int hashCode() {
        return this.f337436a.hashCode();
    }

    @k
    public final String toString() {
        return "ShowKeyboardInteraction(receiver=" + this.f337436a + ')';
    }
}
