package com.avito.android.blueprint.suggest;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: PublishInputWithSuggestsPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/blueprint/suggest/D;", "", "_avito-discouraged_avito-libs_publish-common"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class D {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f105692a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f105693b;

    public D(@Y61.k String str, @Y61.k String str2) {
        this.f105692a = str;
        this.f105693b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof D)) {
            return false;
        }
        D d12 = (D) obj;
        return L.f(this.f105692a, d12.f105692a) && L.f(this.f105693b, d12.f105693b);
    }

    public final int hashCode() {
        return this.f105693b.hashCode() + (this.f105692a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestRequest(itemId=");
        sb2.append(this.f105692a);
        sb2.append(", query=");
        return C22026a.c(sb2, this.f105693b, ')');
    }
}
