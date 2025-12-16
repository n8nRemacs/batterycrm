package com.avito.android.comfortable_deal.deal.item.comment;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/comment/e;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class e {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f121279a;

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f121280b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f121281c;

    public e(@k String str, @k String str2, @k String str3) {
        this.f121279a = str;
        this.f121280b = str2;
        this.f121281c = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof e)) {
            return false;
        }
        e eVar = (e) obj;
        return L.f(this.f121279a, eVar.f121279a) && L.f(this.f121280b, eVar.f121280b) && L.f(this.f121281c, eVar.f121281c);
    }

    public final int hashCode() {
        return this.f121281c.hashCode() + H.d(this.f121279a.hashCode() * 31, 31, this.f121280b);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommentParameter(id=");
        sb2.append(this.f121279a);
        sb2.append(", title=");
        sb2.append(this.f121280b);
        sb2.append(", value=");
        return C22026a.c(sb2, this.f121281c, ')');
    }
}
