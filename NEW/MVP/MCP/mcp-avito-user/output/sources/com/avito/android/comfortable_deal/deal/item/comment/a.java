package com.avito.android.comfortable_deal.deal.item.comment;

import Y61.k;
import Y61.l;
import androidx.compose.runtime.C22026a;
import androidx.compose.runtime.internal.P;
import com.avito.android.remote.model.Image;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommentItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/comment/a;", "", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class a {

    /* renamed from: a, reason: collision with root package name */
    @k
    public final String f121265a;

    /* renamed from: b, reason: collision with root package name */
    @l
    public final Image f121266b;

    /* renamed from: c, reason: collision with root package name */
    @k
    public final String f121267c;

    public a(@k String str, @l Image image, @k String str2) {
        this.f121265a = str;
        this.f121266b = image;
        this.f121267c = str2;
    }

    public final boolean equals(@l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return L.f(this.f121265a, aVar.f121265a) && L.f(this.f121266b, aVar.f121266b) && L.f(this.f121267c, aVar.f121267c);
    }

    public final int hashCode() {
        int iHashCode = this.f121265a.hashCode() * 31;
        Image image = this.f121266b;
        return this.f121267c.hashCode() + ((iHashCode + (image == null ? 0 : image.hashCode())) * 31);
    }

    @k
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("CommentAuthor(id=");
        sb2.append(this.f121265a);
        sb2.append(", avatar=");
        sb2.append(this.f121266b);
        sb2.append(", name=");
        return C22026a.c(sb2, this.f121267c, ')');
    }
}
