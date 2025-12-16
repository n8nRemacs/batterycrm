package com.avito.android.comfortable_deal.deal.item.commentplaceholder;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommentPlaceholderItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/commentplaceholder/c;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class c implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f121306b;

    public c(@k String str) {
        this.f121306b = str;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof c) && L.f(this.f121306b, ((c) obj).f121306b);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF85686c() {
        return getF115821b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF115821b() {
        return this.f121306b;
    }

    public final int hashCode() {
        return this.f121306b.hashCode();
    }

    @k
    public final String toString() {
        return C22026a.c(new StringBuilder("CommentPlaceholderItem(stringId="), this.f121306b, ')');
    }
}
