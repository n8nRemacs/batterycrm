package com.avito.android.comfortable_deal.deal.item.commenttabs;

import androidx.appcompat.app.r;
import androidx.compose.runtime.internal.P;
import kotlin.Metadata;

/* compiled from: CommentTabPayload.kt */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001:\u0001\u0002\u0082\u0001\u0001\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/commenttabs/a;", "", "a", "Lcom/avito/android/comfortable_deal/deal/item/commenttabs/a$a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public interface a {

    /* compiled from: CommentTabPayload.kt */
    @P
    @Metadata(d1 = {"\u0000\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0087\b\u0018\u00002\u00020\u0001¨\u0006\u0002"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/commenttabs/a$a;", "Lcom/avito/android/comfortable_deal/deal/item/commenttabs/a;", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
    /* renamed from: com.avito.android.comfortable_deal.deal.item.commenttabs.a$a, reason: collision with other inner class name */
    public static final /* data */ class C3580a implements a {

        /* renamed from: a, reason: collision with root package name */
        public final int f121314a;

        public C3580a(int i12) {
            this.f121314a = i12;
        }

        public final boolean equals(@Y61.l Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof C3580a) && this.f121314a == ((C3580a) obj).f121314a;
        }

        public final int hashCode() {
            return Integer.hashCode(this.f121314a);
        }

        @Y61.k
        public final String toString() {
            return r.t(new StringBuilder("SelectItemChanged(selectedIndex="), this.f121314a, ')');
        }
    }
}
