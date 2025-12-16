package com.avito.android;

import com.avito.android.remote.model.search.suggest.SuggestAction;
import com.avito.android.remote.model.search.suggest.SuggestHistoryItem;
import java.util.List;
import kotlin.Metadata;

/* compiled from: SearchBar.kt */
@kotlin.jvm.internal.s0
@Metadata(d1 = {"\u0000\u000e\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0010\u0005\u001a\u00020\u00022\u0006\u0010\u0001\u001a\u00020\u0000H\n¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"Lcom/avito/android/remote/model/search/suggest/SuggestHistoryItem;", "it", "Lkotlin/G0;", "invoke", "(Lcom/avito/android/remote/model/search/suggest/SuggestHistoryItem;)V", "<anonymous>"}, k = 3, mv = {1, 9, 0})
/* renamed from: com.avito.android.n2, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
final class C32899n2 extends kotlin.jvm.internal.N implements Y41.l<SuggestHistoryItem, kotlin.G0> {

    /* renamed from: l, reason: collision with root package name */
    public final /* synthetic */ C31100l2 f207186l;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C32899n2(C31100l2 c31100l2) {
        super(1);
        this.f207186l = c31100l2;
    }

    @Override // Y41.l
    public final kotlin.G0 invoke(SuggestHistoryItem suggestHistoryItem) {
        List<SuggestAction> actions = suggestHistoryItem.getActions();
        if (actions != null) {
            this.f207186l.h(actions);
        }
        return kotlin.G0.f406611a;
    }
}
