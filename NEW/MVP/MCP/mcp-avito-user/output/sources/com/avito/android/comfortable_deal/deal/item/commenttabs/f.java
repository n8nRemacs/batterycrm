package com.avito.android.comfortable_deal.deal.item.commenttabs;

import androidx.compose.foundation.H;
import androidx.compose.runtime.internal.P;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.L;

/* compiled from: CommentTabsItem.kt */
@P
@Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/commenttabs/f;", "Lcom/avito/conveyor_item/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class f implements com.avito.conveyor_item.a {

    /* renamed from: b, reason: collision with root package name */
    @Y61.k
    public final String f121320b;

    /* renamed from: c, reason: collision with root package name */
    @Y61.k
    public final List<CommentTab> f121321c;

    /* renamed from: d, reason: collision with root package name */
    @Y61.k
    public final CommentTab f121322d;

    /* JADX WARN: Multi-variable type inference failed */
    public f(@Y61.k String str, @Y61.k List<? extends CommentTab> list, @Y61.k CommentTab commentTab) {
        this.f121320b = str;
        this.f121321c = list;
        this.f121322d = commentTab;
    }

    public final boolean equals(@Y61.l Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof f)) {
            return false;
        }
        f fVar = (f) obj;
        return L.f(this.f121320b, fVar.f121320b) && L.f(this.f121321c, fVar.f121321c) && this.f121322d == fVar.f121322d;
    }

    @Override // TV0.a
    public final long getId() {
        return getF173886b().hashCode();
    }

    @Override // com.avito.conveyor_item.a
    @Y61.k
    /* renamed from: getStringId, reason: from getter */
    public final String getF173886b() {
        return this.f121320b;
    }

    public final int hashCode() {
        return this.f121322d.hashCode() + H.e(this.f121320b.hashCode() * 31, 31, this.f121321c);
    }

    @Y61.k
    public final String toString() {
        return "CommentTabsItem(stringId=" + this.f121320b + ", tabs=" + this.f121321c + ", selectedTab=" + this.f121322d + ')';
    }
}
