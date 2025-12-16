package com.avito.android.publish.items.tagged_input;

import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: MultiStateInputWithTagsItemPresenter.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/publish/items/tagged_input/E;", "", "_avito_publish_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes16.dex */
public final /* data */ class E {

    /* renamed from: a, reason: collision with root package name */
    @Y61.k
    public final String f237129a;

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f237130b;

    public E(@Y61.k String str, @Y61.k String str2) {
        this.f237129a = str;
        this.f237130b = str2;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof E)) {
            return false;
        }
        E e12 = (E) obj;
        return L.f(this.f237129a, e12.f237129a) && L.f(this.f237130b, e12.f237130b);
    }

    public final int hashCode() {
        return this.f237130b.hashCode() + (this.f237129a.hashCode() * 31);
    }

    @Y61.k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SuggestRequest(itemId=");
        sb2.append(this.f237129a);
        sb2.append(", query=");
        return C22026a.c(sb2, this.f237130b, ')');
    }
}
