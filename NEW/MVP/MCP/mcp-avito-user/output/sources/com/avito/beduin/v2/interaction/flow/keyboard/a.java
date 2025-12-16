package com.avito.beduin.v2.interaction.flow.keyboard;

import Y61.k;
import Y61.l;
import androidx.appcompat.app.r;
import kotlin.Metadata;

/* compiled from: HideKeyboardInteraction.kt */
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/beduin/v2/interaction/flow/keyboard/a;", "LdU0/b;", "flow_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class a implements dU0.b {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f337431a;

    public a(boolean z12) {
        this.f337431a = z12;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof a) && this.f337431a == ((a) obj).f337431a;
    }

    public final int hashCode() {
        return Boolean.hashCode(this.f337431a);
    }

    @k
    public final String toString() {
        return r.x(new StringBuilder("HideKeyboardInteraction(clearFocus="), this.f337431a, ')');
    }
}
