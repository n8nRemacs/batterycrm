package com.avito.android;

import com.avito.android.remote.model.search.suggest.HistorySuggestItem;
import com.avito.android.remote.model.search.suggest.SuggestHistoryItem;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SearchBar.kt */
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/suggest/SuggestHistoryItem;", "itemToRemove", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/suggest/SuggestHistoryItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.o2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C32903o2 extends kotlin.jvm.internal.N implements Y41.l<SuggestHistoryItem, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31100l2 f208205l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32903o2(C31100l2 c31100l2) {
        super(1);
        this.f208205l = c31100l2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(SuggestHistoryItem suggestHistoryItem) {
        SuggestHistoryItem suggestHistoryItem2 = suggestHistoryItem;
        C31100l2 c31100l2 = this.f208205l;
        HistorySuggestItem historySuggestItem = c31100l2.f174878r;
        List<SuggestHistoryItem> items = historySuggestItem.getItems();
        ArrayList arrayList = new ArrayList();
        for (Object obj : items) {
            if (!kotlin.jvm.internal.L.f(((SuggestHistoryItem) obj).getText(), suggestHistoryItem2.getText())) {
                arrayList.add(obj);
            }
        }
        HistorySuggestItem historySuggestItem2 = new HistorySuggestItem(arrayList, historySuggestItem.getRowLimit());
        c31100l2.f174878r = historySuggestItem2;
        c31100l2.f174866f.y(historySuggestItem2, new C32899n2(c31100l2), new C32903o2(c31100l2));
        String hideLink = suggestHistoryItem2.getHideLink();
        if (hideLink != null) {
            c31100l2.f174872l.b(io.reactivex.rxjava3.kotlin.A1.h(c31100l2.f174863c.a(hideLink), null, null, 7));
        }
        return kotlin.G0.f406611a;
    }
}
