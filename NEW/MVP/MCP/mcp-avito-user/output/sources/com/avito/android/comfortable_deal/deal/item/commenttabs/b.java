package com.avito.android.comfortable_deal.deal.item.commenttabs;

import androidx.compose.runtime.internal.P;
import com.avito.android.comfortable_deal.deal.item.commenttabs.a;
import java.util.ArrayList;
import javax.inject.Inject;
import kotlin.Metadata;

/* compiled from: CommentTabPayloadProvider.kt */
@P
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/avito/android/comfortable_deal/deal/item/commenttabs/b;", "Lcom/avito/android/recycler/data_aware/a;", "<init>", "()V", "_avito_comfortable-deal_impl"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class b implements com.avito.android.recycler.data_aware.a {
    @Inject
    public b() {
    }

    @Override // com.avito.android.recycler.data_aware.a
    @Y61.l
    public final Object a(@Y61.l TV0.a aVar, @Y61.l TV0.a aVar2) {
        if (!(aVar instanceof f) || !(aVar2 instanceof f)) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        f fVar = (f) aVar2;
        CommentTab commentTab = fVar.f121322d;
        if (commentTab != ((f) aVar).f121322d) {
            arrayList.add(new a.C3580a(fVar.f121321c.indexOf(commentTab)));
        }
        return arrayList;
    }
}
