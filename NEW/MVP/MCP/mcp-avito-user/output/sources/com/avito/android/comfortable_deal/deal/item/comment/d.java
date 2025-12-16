package com.avito.android.comfortable_deal.deal.item.comment;

import Y61.k;
import Y61.l;
import androidx.compose.foundation.H;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import androidx.media3.common.C23088b;
import java.time.LocalDateTime;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/comment/d;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class d implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @k
    public final String f121272b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f121273c;

    /* renamed from: d, reason: collision with root package name */
    @k
    public final a f121274d;

    /* renamed from: e, reason: collision with root package name */
    @k
    public final LocalDateTime f121275e;

    /* renamed from: f, reason: collision with root package name */
    @l
    public final LocalDateTime f121276f;

    /* renamed from: g, reason: collision with root package name */
    @k
    public final Object f121277g;

    /* renamed from: h, reason: collision with root package name */
    @k
    public final String f121278h;

    public d(@k String str, @k String str2, @k a aVar, @k LocalDateTime localDateTime, @l LocalDateTime localDateTime2, @k List<e> list, @k String str3) {
        this.f121272b = str;
        this.f121273c = str2;
        this.f121274d = aVar;
        this.f121275e = localDateTime;
        this.f121276f = localDateTime2;
        this.f121277g = list;
        this.f121278h = str3;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return L.f(this.f121272b, dVar.f121272b) && L.f(this.f121273c, dVar.f121273c) && this.f121274d.equals(dVar.f121274d) && this.f121275e.equals(dVar.f121275e) && L.f(this.f121276f, dVar.f121276f) && L.f(this.f121277g, dVar.f121277g) && L.f(this.f121278h, dVar.f121278h);
    }

    @Override // TV0.a
    /* renamed from: getId */
    public final long getF80596b() {
        return getF80597c().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @k
    /* renamed from: getStringId, reason: from getter */
    public final String getF80597c() {
        return this.f121272b;
    }

    public final int hashCode() {
        int iHashCode = (this.f121275e.hashCode() + ((this.f121274d.hashCode() + H.d(this.f121272b.hashCode() * 31, 31, this.f121273c)) * 31)) * 31;
        LocalDateTime localDateTime = this.f121276f;
        return this.f121278h.hashCode() + C23088b.a((iHashCode + (localDateTime == null ? 0 : localDateTime.hashCode())) * 31, 31, this.f121277g);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommentItem(stringId=");
        sb2.append(this.f121272b);
        sb2.append(", commentId=");
        sb2.append(this.f121273c);
        sb2.append(", author=");
        sb2.append(this.f121274d);
        sb2.append(", publishedAt=");
        sb2.append(this.f121275e);
        sb2.append(", updatedAt=");
        sb2.append(this.f121276f);
        sb2.append(", additionalParameters=");
        sb2.append(this.f121277g);
        sb2.append(", comment=");
        return C22026a.c(sb2, this.f121278h, ')');
    }
}
